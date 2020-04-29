#!/bin/bash
set -x
source tools.sh

work_dir=$(pwd)
deps_dir=${work_dir}/deps
src_dir=${work_dir}/src
build_dir=${work_dir}/build

build_thread_num="$(tool::get_cpu_num)"

