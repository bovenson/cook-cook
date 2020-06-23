#!/bin/bash

thrift_version=$1
[[ -z "$thrift_version" ]] && echo "[ERROR] thrift version not specified" && exit 1
#thrift_version_under=$(echo "$thrift_version" | tr '.' '_')
thrift_path=$(which "thrift_$thrift_version")
#echo $thrift_path
#thrift_bin_path="THRIFT_HOME_$thrift_version_under"
#export PATH="${!thrift_bin_path}/bin":$PATH
thrift_home_bin=$(dirname "$thrift_path")
export PATH=${thrift_home_bin}:$PATH
thrift -version
mvn clean install -Dthrift.version="${thrift_version}"
