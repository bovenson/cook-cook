#!/bin/bash
set -x
source tools.sh

work_dir=$(pwd)
deps_dir=${work_dir}/deps
src_dir=${work_dir}/src
build_dir=${work_dir}/build

make_thread_num="$(tool::get_cpu_num)"

export LDFLAGS="-L${deps_dir}/lib"
export CPPFLAGS="-I${deps_dir}/include"
export CXXFLAGS="$CXXFLAGS -std=c++11 -fPIC -mavx -maes -O3 -Wno-sign-compare -g -Wno-narrowing -Wall -pedantic -stdlib=libc++"
export CFLAGS=-fPIC
export PATH=${deps_dir}/bin:$PATH


## clean
[[ "Y" ]] && (
[ -e "${deps_dir}" ] && rm -rf "${deps_dir}"
mkdir -p "${deps_dir}/lib" && mkdir -p "${deps_dir}/include" && mkdir -p "${deps_dir}/bin"
)

[[ "Y" ]] && (
[ -e "${build_dir}" ] && rm -rf "${build_dir}"
mkdir -p "${build_dir}"
)

## concat boost
[[ "Y" ]] && (
cat "${src_dir}"/boost_1_71_0.tar.gz.part* > "${src_dir}"/boost_1_71_0.tar.gz
)

## compile

# gflags
if [ ! -z "Y" ]; then
cd "${build_dir}" || exit
tar -zxf "${src_dir}/gflags-2.2.2.tar.gz" || exit
cd "${build_dir}"/gflags-2.2.2 || exit
(cmake . && make -j ${make_thread_num}) || exit
cp -a include/* "${deps_dir}"/include/
cp -a lib/* "${deps_dir}"/lib/
fi

# glog
if [ ! -z "Y" ]; then
cd "${build_dir}" || exit
tar -zxf "${src_dir}/glog-0.4.0.tar.gz" || exit
cd "${build_dir}/glog-0.4.0" || exit
(./autogen.sh && ./configure --prefix="${deps_dir}" && make -j ${make_thread_num} && make install) || exit
# echo "./autogen.sh && ./configure --prefix='${deps_dir}' && make -j ${make_thread_num} && make install" > build.sh
# bash build.sh
fi

# boost
if [ ! -z "Y" ]; then
cd "${build_dir}" || exit
tar -zxf "${src_dir}/boost_1_71_0.tar.gz" || exit
cd "${build_dir}"/boost_1_71_0 || exit
./bootstrap.sh --without-libraries=mpi,python, graph, graph_parallel
(./b2 --prefix="${deps_dir}" -j ${make_thread_num} threading=multi address-model=64 variant=release stage install) || exit
fi

# libevent
if [ ! -z "Y" ]; then
cd "${build_dir}" || exit
tar -zxf "${src_dir}/libevent-2.1.11-stable.tar.gz" || exit
cd "${build_dir}"/libevent-2.1.11-stable || exit
(./configure --prefix="${deps_dir}" && make -j ${make_thread_num} && make install -j ${make_thread_num}) || exit
fi

# thrift
if [ ! -z "Y" ]; then
cd "${build_dir}" || exit
tar -zxf "${src_dir}/thrift-0.5.0.tar.gz" || exit
cd thrift-0.5.0
(./bootstrap.sh && ./configure --prefix="${deps_dir}" --with-boost="${deps_dir}" --with-libevent="${deps_dir}" \
--with-ruby=no --with-python=no --with-java=no --with-go=no --with-perl=no --with-php=no --with-csharp=no \
--with-haskell=no --with-erlang=no --with-lua=no --with-nodejs=no && make -j ${make_thread_num} && make install) || exit
fi

echo "All is done."
