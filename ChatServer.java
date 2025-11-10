import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started. Waiting for client...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));

            String clientMessage, serverMessage;

            while (true) {
                
                clientMessage = in.readLine();
                if (clientMessage == null || clientMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Client disconnected.");
                    break;
                }
                System.out.println("Client: " + clientMessage);

               
                System.out.print("Server: ");
                serverMessage = serverInput.readLine();
                out.println(serverMessage);

                if (serverMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Server ended the chat.");
                    break;
                }
            }

            clientSocket.close();
            System.out.println("Server closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

