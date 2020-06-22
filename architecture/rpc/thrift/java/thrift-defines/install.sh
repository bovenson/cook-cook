#!/bin/bash
set -x
thrift_version=$1
[ -z "$thrift_version" ] && echo "thrift version not specified" && exit 1
echo "install with thrift verion $thrift_version"
alias thrift="thrift_$thrift_version"
echo "complile with thrift $(thrift -version)"

mvn clean install -Dthrift.version="${thrift_version}"
