//Constructor with no arguments
 
import java.io.*;

class Test{
	//data members
	int id;
	String name;
	//Default Constructor
	/*Test(){
		System.out.println("Constructor called");
	}*/
	//Parameterized Constructor
	Test(String name,int id){
		this.name=name;
		this.id=id;
	}

}
class Doe{
	public static void  main(String[] args){
		Test one=new Test("john",1);
		System.out.println("Name:"+one.name+"Id:"+one.id);
		
	}
}