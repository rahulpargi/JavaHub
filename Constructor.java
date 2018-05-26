
import java.io.*;
class Geek{
	int num;
	String name;
	//Default
	Geek(){
		System.out.println(" Default Constructor called");
	}
	//parameterized constructor
	Geek(String name,int num){
		this.name=name;
		this.num=num;
		System.out.println("Constructor with parameters");
	}

}
class Constructor{
	public static void main(String[] args){
		Geek geek1=new Geek();
		Geek geek2=new Geek("adam",1);
		System.out.println(geek2.name);
		System.out.println(geek2.num);
	}

}