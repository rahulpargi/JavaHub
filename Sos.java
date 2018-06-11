
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
		//fetching data
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=br.readLine();
		int a=Integer.parseInt(str);
		int square=(a*a);


		System.out.println("Client data "+square);
		//int firstName=str.substring(0,4);
		//coverts data into stream format
		OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
		//print formatted data
		PrintWriter out=new PrintWriter(os);
		out.println(str);
		//forcefully send data as the default buffer size is 512 bytes
		out.flush();



	}
}