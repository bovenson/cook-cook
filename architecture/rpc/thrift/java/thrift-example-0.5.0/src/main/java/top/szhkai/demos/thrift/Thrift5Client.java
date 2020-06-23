package top.szhkai.demos.thrift;

import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import top.szhkai.demos.thrift.impl.UesrServiceImpl;
import top.szhkai.demos.thrift.user.UserService;

public class Thrift5Client {
    public static void main(String[] args) throws TTransportException {
        UesrServiceImpl impl = new UesrServiceImpl();
        UserService.Processor processor = new UserService.Processor(impl);
        TServerSocket transport = new TServerSocket(9000);
        TSimpleServer server = new TSimpleServer(processor, transport);
        server.serve();
    }
}
