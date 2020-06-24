package top.szhkai.demos.thrift;

import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class Thrift13Client {
    // https://github.com/apache/thrift/blob/0.13.0/tutorial/java/src/JavaClient.java
    public static void main(String[] args) throws TTransportException {
        TTransport transport = new TSocket("localhost", 9000);
    }
}
