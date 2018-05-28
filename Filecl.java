import java.io.File;

class Filecl{
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
	
}