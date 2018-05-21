import java.io.*;

class Geek{
	//constructor with one argument
	Geek(String name){
		System.out.println(name);
	}
	//Constructor with two arguments
	Geek(String name,int age){
		System.out.println("name"+name+"age"+age);
	}
	//Constructor with one argument but with different type than previous
	Geek(long id){
		System.out.println("id"+id);

	}
}
class Overload{
	public static void main(String[] args){
		Geek one=new Geek("test");
		Geek two=new Geek("test1",23);
		Geek three=new Geek("33434343434");
		
	}
}