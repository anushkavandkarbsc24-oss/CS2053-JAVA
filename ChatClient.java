import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("Connected to server!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader clientInput = new BufferedReader(new InputStreamReader(System.in));

            String clientMessage, serverMessage;

            while (true) {
                
                System.out.print("Client: ");
                clientMessage = clientInput.readLine();
                out.println(clientMessage);

                if (clientMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Client ended the chat.");
                    break;
                }

                
                serverMessage = in.readLine();
                if (serverMessage == null) {
                    System.out.println("Server disconnected.");
                    break;
                }
                System.out.println("Server: " + serverMessage);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
