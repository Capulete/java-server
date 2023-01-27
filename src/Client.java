import java.io.*;
import java.net.Socket;

public class Client {
    static BufferedReader reader;

    public static void main(String[] args) {
        String host = "localhost";
        int port = 8888;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new
                     PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new
                     InputStreamReader(clientSocket.getInputStream()))) {
            out.println("Mikhail");
            String resp = in.readLine();
            System.out.println(resp);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}