import java.net.io;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Soc{
	public static void main(String[] args){
		String ip="localhost";
		int port=2222;
		Socket s=new Socket(ip,port);
		String str="Test";
		//coverts data into stream format
		OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
		//print formatted data
		PrintWriter out=new PrintWriter(os);
		out.println(str);

		





	}
}