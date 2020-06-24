package top.szhkai.demos.thrift;

import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import top.szhkai.demos.thrift.impl.UserServiceImpl;
import top.szhkai.demos.thrift.user.UserService;

public class Thrift5Server {
    public static void main(String[] args) throws TTransportException {
        UserServiceImpl impl = new UserServiceImpl();
        UserService.Processor processor = new UserService.Processor(impl);
        TServerSocket transport = new TServerSocket(9000);
        TSimpleServer server = new TSimpleServer(processor, transport);
        System.out.println("Thrift server start to serving ...");
        server.serve();
    }
}
