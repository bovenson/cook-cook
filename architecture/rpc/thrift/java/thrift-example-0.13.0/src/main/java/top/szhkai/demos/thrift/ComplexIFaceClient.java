/*
  https://github.com/apache/thrift/blob/0.13.0/tutorial/java/src/JavaClient.java
 */
package top.szhkai.demos.thrift;

import com.google.gson.Gson;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import top.szhkai.demos.thrift.user.ComplexIFaceService;
import top.szhkai.demos.thrift.user.Request;
import top.szhkai.demos.thrift.user.Response;
import top.szhkai.demos.thrift.user.Wrapper;

import java.util.ArrayList;

public class ComplexIFaceClient {
    public static void testGet(ComplexIFaceService.Client client) throws TException {
        Request request = new Request();
        request.setWs(new ArrayList<>());
        request.getWs().add(new Wrapper());
        Response response = client.get(request);
        System.out.println(new Gson().toJson(response));
    }

    public static void main(String[] args) throws Exception {
        TTransport transport = new TSocket("localhost", 9000);
        transport.open();
        TProtocol protocol = new TBinaryProtocol(transport);
        ComplexIFaceService.Client client = new ComplexIFaceService.Client(protocol);
        testGet(client);
    }
}
