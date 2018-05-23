import java.net.*;
import java.util.Scanner;
import java.io.*;

public class URLclass1{
	public static void main(String[] args)throws MalformedURLException{
		try{
			URL test=new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
			
			Scanner input=new Scanner(test.openStream());
			/*String line=input.nextLine();
			char[] ch=line.toCharArray(line);
			for(int i=0;i<ch.length;i++){
				count
			}
			while(line!=null){
				System.out.println(line);
			}*/
			while(input.hasNextLine()){
				String line=input.nextLine();
				int count=1;
				System.out.println(count+line);
				count++;
			}
		}catch(IOException e){

		}

	}
}