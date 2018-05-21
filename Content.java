import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

class Content{
	public static void main(String[] args) {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try{
		System.out.println("Enter  the directory path");
		String dirpath=br.readLine();
		System.out.println("Enter the directory name");
		String dname=br.readLine();
		
		//create File object witb dirpath and dname
		File f=new File(dirpath,dname);

		if(f.exists()){
			String arr[]=f.list();
			int n=arr.length;

			for(int i=0;i<n;i++){
				System.out.println(arr[i]);
				File f1=new File(arr[i]);
				if(f1.isDirectory()){
					System.out.println("is a file");
				}
				if(f1.isDirectory()){
					System.out.println("is a file");
				}else{
					System.out.println("Directory not found");
				}
			}
		}
	}
	catch(IOException e){
		System.out.println(e);
	}


	}
	
}