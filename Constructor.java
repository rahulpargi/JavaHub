
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
	//Constructor Overloading
	Geek(String name){
		this.name=name;
		System.out.println("Constructor with single arguments"+" "+name);
	}

}
//There are no return statements in constructor but it return current class instance
class Constructor{
	public static void main(String[] args){
		Geek geek1=new Geek();
		Geek geek2=new Geek("adam",1);
		Geek geek3=new Geek("Hello");
		System.out.println(geek2.name);
		System.out.println(geek2.num);
		System.out.println(geek3.name);
	}

}