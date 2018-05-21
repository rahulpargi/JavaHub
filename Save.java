import java.io.File;
class Save{
	public static void main(String[] args){
		//String name=args[0];
		File f=new File("C:\\Users\\rahul\\OneDrive - University of Central Missouri\\Java\\test.txt");
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		System.out.println(f.exists());
		if(f.exists()){
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.isDirectory());
			System.out.println(f.length());
		}
	}
}