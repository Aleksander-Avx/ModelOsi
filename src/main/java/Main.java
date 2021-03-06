import java.io.*;
import java.net.*;
import java.io.IOException;

public class Main {
    public static void main ( String[] args ) {
        System.out.println ("Waiting for connection" );
        while ( true ) {
            try (ServerSocket serverSocket = new ServerSocket ( 8070 ); // порт можете выбрать любой в доступном диапазоне 0-65536. Но чтобы не нарваться на уже занятый - рекомендуем использовать около 8080
            Socket clientSocket = serverSocket.accept ( ); // ждем подключения
            PrintWriter out = new PrintWriter ( clientSocket.getOutputStream ( ) , true );
            BufferedReader in = new BufferedReader ( new InputStreamReader ( clientSocket.getInputStream ( ) ) ) ) {
                System.out.println ( "New connection accepted" );
                final String name = in.readLine ( );
                out.println ( String.format ( "Hi %s, your port is %d" , name , clientSocket.getPort ( ) ) );
        }
            catch (IOException e) {
               e.printStackTrace ();
            }
    }
}
}