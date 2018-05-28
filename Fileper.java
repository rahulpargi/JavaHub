import java.io.*;


public class Fileper{
	public static void main(String[] args) {
		File file=new File("C:\\Users\\rahul\\OneDrive - University of Central Missouri\\Java\\test.txt");
		//check of  the file exist

		boolean exists=file.exists();

		if(exists==true){
			//changing file permission
			file.setExecutable(true);
			file.setReadable(true);
			file.setWritable(false);
			System.out.println("File Permission changed");
			System.out.println("Executable: "+file.canExecute());
			System.out.println("Readable: "+file.canRead());
			System.out.println("Writable :"+file.canWrite());
		}else{
			System.out.println("file not found");
		}
}
}