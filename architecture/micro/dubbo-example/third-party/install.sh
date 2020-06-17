#!/bin/bash
set -x

if [ ! -e src ]; then
    echo "src dir not exists"
    exit 1
fi

work_dir=$(pwd)
deps_dir=${work_dir}/deps
src_dir=${work_dir}/src
build_dir=${work_dir}/build

make_thread_num=8

## clean
#[ -e "${deps_dir}" ] && rm -rf "${deps_dir}"
#mkdir -p "${deps_dir}/lib" && mkdir -p "${deps_dir}/include" && mkdir -p "${deps_dir}/bin"

#[ -e "${build_dir}" ] && rm -rf "${build_dir}"
#mkdir -p "${build_dir}"
cd "${build_dir}" || exit

## concat boost
cat "${src_dir}"/boost_1_71_0.tar.gz.part* > "${src_dir}"/boost_1_71_0.tar.gz

## extractor files
#tar -zxf "${src_dir}"/openssl-OpenSSL_1_1_1.tar.gz
#tar -zxf "${src_dir}"/boost_1_71_0.tar.gz || exit
#tar -zxf "${src_dir}"/libevent-2.1.11-stable.tar.gz || exit
tar -zxf "${src_dir}"/thrift-thrift-0.8.0.tar.gz || exit

## compile
export LDFLAGS="-L${deps_dir}/lib"
export CPPFLAGS="-I${deps_dir}/include"
export CXXFLAGS="-std=c++11 -fPIC"
export CFLAGS=-fPIC
export PATH=${deps_dir}/bin:$PATH
export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:"${deps_dir}/lib"


# openssl
#cd "${build_dir}"/openssl-OpenSSL_1_1_1 || exit
#./config --prefix="${deps_dir}" && make -j ${make_thread_num} && make install

# boost
#cd "${build_dir}"/boost_1_71_0 || exit
#./bootstrap.sh --without-libraries=mpi,python, graph, graph_parallel
#./b2 --prefix="${deps_dir}" -j ${make_thread_num} threading=multi address-model=64 variant=release stage install

# libevent
#cd "${build_dir}"/libevent-2.1.11-stable || exit
#(./configure --prefix="${deps_dir}" && make -j ${make_thread_num} && make install -j ${make_thread_num}) || exit

# thrift
export CXXFLAGS="$CXXFLAGS -lcrypto"
cd "${build_dir}"/thrift-thrift-0.8.0 || exit
(./bootstrap.sh && ./configure --prefix="${deps_dir}" \
--with-ruby=no --with-python=no --with-java=no --with-go=no --with-perl=no --with-php=no --with-csharp=no \
--with-erlang=no --with-lua=no --with-nodejs=no && make -j ${make_thread_num} && make install) || exit

echo "done" && exit