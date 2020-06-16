/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "User_types.h"

#include <algorithm>
#include <ostream>

#include <thrift/TToString.h>

namespace demos { namespace user {


User::~User() throw() {
}


void User::__set_id(const std::string& val) {
  this->id = val;
}

void User::__set_name(const std::string& val) {
  this->name = val;
}
std::ostream& operator<<(std::ostream& out, const User& obj)
{
  obj.printTo(out);
  return out;
}


uint32_t User::read(::apache::thrift::protocol::TProtocol* iprot) {

  ::apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_id = false;
  bool isset_name = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->id);
          isset_id = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->name);
          isset_name = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_id)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_name)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t User::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  ::apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("User");

  xfer += oprot->writeFieldBegin("id", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString(this->id);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("name", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString(this->name);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(User &a, User &b) {
  using ::std::swap;
  swap(a.id, b.id);
  swap(a.name, b.name);
}

User::User(const User& other0) {
  id = other0.id;
  name = other0.name;
}
User& User::operator=(const User& other1) {
  id = other1.id;
  name = other1.name;
  return *this;
}
void User::printTo(std::ostream& out) const {
  using ::apache::thrift::to_string;
  out << "User(";
  out << "id=" << to_string(id);
  out << ", " << "name=" << to_string(name);
  out << ")";
}


UserServiceRequest::~UserServiceRequest() throw() {
}


void UserServiceRequest::__set_reqTs(const int64_t val) {
  this->reqTs = val;
}

void UserServiceRequest::__set_user(const User& val) {
  this->user = val;
}
std::ostream& operator<<(std::ostream& out, const UserServiceRequest& obj)
{
  obj.printTo(out);
  return out;
}


uint32_t UserServiceRequest::read(::apache::thrift::protocol::TProtocol* iprot) {

  ::apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_reqTs = false;
  bool isset_user = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->reqTs);
          isset_reqTs = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += this->user.read(iprot);
          isset_user = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_reqTs)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_user)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t UserServiceRequest::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  ::apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("UserServiceRequest");

  xfer += oprot->writeFieldBegin("reqTs", ::apache::thrift::protocol::T_I64, 1);
  xfer += oprot->writeI64(this->reqTs);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("user", ::apache::thrift::protocol::T_STRUCT, 2);
  xfer += this->user.write(oprot);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(UserServiceRequest &a, UserServiceRequest &b) {
  using ::std::swap;
  swap(a.reqTs, b.reqTs);
  swap(a.user, b.user);
}

UserServiceRequest::UserServiceRequest(const UserServiceRequest& other2) {
  reqTs = other2.reqTs;
  user = other2.user;
}
UserServiceRequest& UserServiceRequest::operator=(const UserServiceRequest& other3) {
  reqTs = other3.reqTs;
  user = other3.user;
  return *this;
}
void UserServiceRequest::printTo(std::ostream& out) const {
  using ::apache::thrift::to_string;
  out << "UserServiceRequest(";
  out << "reqTs=" << to_string(reqTs);
  out << ", " << "user=" << to_string(user);
  out << ")";
}


UserServiceResponse::~UserServiceResponse() throw() {
}


void UserServiceResponse::__set_isOk(const bool val) {
  this->isOk = val;
}

void UserServiceResponse::__set_user(const User& val) {
  this->user = val;
}
std::ostream& operator<<(std::ostream& out, const UserServiceResponse& obj)
{
  obj.printTo(out);
  return out;
}


uint32_t UserServiceResponse::read(::apache::thrift::protocol::TProtocol* iprot) {

  ::apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_isOk = false;
  bool isset_user = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->isOk);
          isset_isOk = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += this->user.read(iprot);
          isset_user = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_isOk)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_user)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t UserServiceResponse::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  ::apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("UserServiceResponse");

  xfer += oprot->writeFieldBegin("isOk", ::apache::thrift::protocol::T_BOOL, 1);
  xfer += oprot->writeBool(this->isOk);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("user", ::apache::thrift::protocol::T_STRUCT, 2);
  xfer += this->user.write(oprot);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(UserServiceResponse &a, UserServiceResponse &b) {
  using ::std::swap;
  swap(a.isOk, b.isOk);
  swap(a.user, b.user);
}

UserServiceResponse::UserServiceResponse(const UserServiceResponse& other4) {
  isOk = other4.isOk;
  user = other4.user;
}
UserServiceResponse& UserServiceResponse::operator=(const UserServiceResponse& other5) {
  isOk = other5.isOk;
  user = other5.user;
  return *this;
}
void UserServiceResponse::printTo(std::ostream& out) const {
  using ::apache::thrift::to_string;
  out << "UserServiceResponse(";
  out << "isOk=" << to_string(isOk);
  out << ", " << "user=" << to_string(user);
  out << ")";
}

}} // namespace
