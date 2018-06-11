import java.net.*;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Soc{
	public static void main(String[] args)throws Exception{
		String ip="localhost";
		int port=2222;
		Socket s=new Socket(ip,port);
		int str=12;
		//coverts data into stream format
		OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
		//print formatted data
		PrintWriter out=new PrintWriter(os);
		out.println(str);
		//forcefully send data as the default buffer size is 512 bytes
		out.flush();
		//fetching data
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String strr=br.readLine();
		int ans=Integer.parseInt(strr);
		System.out.println(ans);







	}
}