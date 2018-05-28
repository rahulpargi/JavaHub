/*class StaticKey{
	//static variable
	static int a=10;
	int b=20;
	//static int b;
	//static block
	/*static{
		System.out.println("Inside Static  block ");
		//b=a*4;
	}
	static void m1(){
		a=20;
		System.out.println("from m1");
		b=10;
		m2();
		System.out.println(super.a);
	}
	void m2(){
		System.out.println("from m2");
	}

	/*static void m1(){
		System.out.println("from m1");
	}
	public static void main(String[] args){
		/*System.out.println("from main");
		System.out.println(a);
		//System.out.println(b);
	}
}*/
class Student{
	String name;
	int rollNo;
	//static variable
	static String clgname;
	//static counter to set unique roll no
	static int count=0;
	public Student(String name){
		this.name=name;
		this.rollNo=setRollNo();
	}
	//getting unique rollno through static variable
	static int setRollNo(){
		count++;
		return count;
	}
	//static method
	static void setClg(String name){
		clgname=name;
	}
	//accessing static variable
	void getStudentInfo(){
		System.out.println("name: "+this.name);
		System.out.println("rollNo: "+this.rollNo);
		System.out.println("clg name: "+this.clgname);
	}

}
public class  StaticKey{
	public static void  main(String[] args){
		//calling static method
		Student.setClg("test");
		Student s1=new Student("alice");
		Student s2=new Student("bob");
		s1.getStudentInfo();
		s2.getStudentInfo();
	}
}