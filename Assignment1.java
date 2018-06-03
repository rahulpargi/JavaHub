import java.io.File;
import java.util.Scanner;
import java.net.*;
import java.util.ArrayList;
import java.io.*;
/*public class test(){
	private String start_url;
	public String get_start_url(){
		return start_url;
	}
}*/
class Test{
	//starting string as private
	//Encapsulation
	private String url;
	//Constructor
	public Test(String start_url){
		//this.start_url=start_url;
		url=start_url;
		System.out.println("Constructor");
		

	}
	//public method to access the private variable
	 public String get_url(){
    	return url;
    }
	
}

public class Assignment1
{

  public static void main(String[] args)throws IOException,IllegalArgumentException {
    //Reading the url from the file
    File file =new File("C:\\Users\\rahul\\OneDrive - University of Central Missouri\\Java\\test.txt");
    Scanner sc = new Scanner(file);
   	String urll="";
	while (sc.hasNextLine()){
	     urll=sc.nextLine();
	    System.out.println("line is "+urll);
	 }
	Test test1=new Test(urll);
	//System.out.println(test1.url);
	crawler(test1.get_url());
  }
  //static variable to keep track of the number of pages traversed
  public static ArrayList<String> traversed_url;
  public static void crawler(String a) {
    ArrayList<String> pending_url = new ArrayList<>();
    ArrayList<String> traversed_url = new ArrayList<>();
    int count=0;
    pending_url.add(a);
    while (!pending_url.isEmpty() && 
        traversed_url.size() <100) {
      String url_string = pending_url.remove(0);
      if (!traversed_url.contains(url_string)) {
        traversed_url.add(url_string);
        count++;
        System.out.println("Count is: "+count +" "+  url_string);

        for (String s: sub_url(url_string)) {
          if (!traversed_url.contains(s))
            pending_url.add(s);
        }
      }
    }
  }
  
  
  public static ArrayList<String> sub_url(String url_string) {
    ArrayList<String> list = new ArrayList<>();
    
    try {
       
      URL  test=new URL(url_string);
      Scanner input = new Scanner(test.openStream());
      int current = 0;
      while (input.hasNext()) {
        String line = input.nextLine();
        current = line.indexOf("http:", current);
        while (current > 0) {
          int endIndex = line.indexOf("\"", current);
          if (endIndex > 0) { 
            list.add(line.substring(current, endIndex)); 
            current = line.indexOf("http:", endIndex);
          }
          else 
            current = -1;
        }
      } 
    }
    

    catch (IOException ex) {
       System.out.println("Error: " + ex.getMessage());
     }catch (IllegalArgumentException ex) {
       System.out.println("Error: " + ex.getMessage());
     }
    
    return list;
  }
}