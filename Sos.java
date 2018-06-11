import java.net.io;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.*;

public class Sos{
	public static void main(String[] args)throws Exception {
		System.out.println("Server started");
		ServerSocket ss=new ServerSocket(2222);

		System.out.println("Server is waiting for client request");
		Socket s=ss.accept();
		System.out.println("Connected");
		
	}
}