import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*class Filecl{
	public static void main(String[] args){
		File f=new File("C:\\Users\\rahul\\OneDrive - University of Central Missouri\\Java\\test.txt");
		System.out.println("File name"+ f.getName());
		System.out.println("Path: "+f.getPath());
		System.out.println("Absolute Path: "+f.getAbsolutePath());
		System.out.println("Parent: "+f.getParent());
		System.out.println("Exists: "+f.exists());
		if(f.exists()){
			System.out.println("Is writable: " +f.canWrite());
			System.out.println("Is Readable: "+f.canRead());
			System.out.println("Is a directory:  "+f.isDirectory());
			System.out.println("File Size in Bytes: "+f.length());
		}

		


	}
	
}*/
//Displaying Contents of a file

class Filecl{
	public  static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter dirpath");
		String dirpath=br.readLine();
		System.out.println("Enter the dirname");
		String dname=br.readLine();

		//Creating file object with dirpath and dname
		File f=new File(dirpath,dname);
		if(f.exists()){
			String  arr[]=f.list();
			//finding no of entries
			int n=arr.length;

			//displaying entries

			for(int i=0;i<n;i++){
				System.out.println(arr[i]);
				//Creating file object with the entry and test if it is a file or directory

				File f1=new File(arr[i]);
				if(f1.isFile()){
					System.out.println(": is a file");
				}if(f1.isDirectory()){
					System.out.println(": is a directory");
				}
			}
			System.out.println("No of entries in this directory :"+n );
		}else{
			System.out.println("file not found");
		}

	}
}