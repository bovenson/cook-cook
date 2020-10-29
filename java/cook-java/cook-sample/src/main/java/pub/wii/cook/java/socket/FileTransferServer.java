package pub.wii.cook.java.socket;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;

public class FileTransferServer {

    public void start(int port, String wd) throws Exception {
        FileUtils.forceMkdir(new File(wd));

        InetSocketAddress listenAddr = new InetSocketAddress(port);
        ServerSocketChannel listener = ServerSocketChannel.open();
        ServerSocket ss = listener.socket();
        ss.setReuseAddress(true);
        ss.bind(listenAddr);

        while (true) {
            Socket socket = ss.accept();
            System.out.println("Received request: " + socket);
            FileTransferServerThread thread = new FileTransferServerThread(socket, wd);
            thread.start();
        }
    }

    public static void main(String[] args) throws Exception {
        FileTransferServer server = new FileTransferServer();
        server.start(2222, "/Users/wii/Tmp");
    }
}
