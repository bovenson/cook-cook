namespace java top.szhkai.demos.dubbo
namespace cpp demos.user

struct User {
    1: required string id;
    2: required string name;
}

struct UserServiceRequest {
    1: required i64 reqTs;
    2: required User user;
}

struct UserServiceResponse {
    1: required bool isOk;
    2: required User user;
}


service UerService {
    UserServiceResponse put(UserServiceRequest request);
    UserServiceResponse get(UserServiceRequest request);
}