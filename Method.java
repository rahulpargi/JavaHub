// /*class Method{
// 	/*public int sum(int x,int y){
// 			return(x+y);
// 		}
// 		//overloaded sum() with three parameters
// 		public int sum(int x,int y,int z){
// 			return(x+y+z);
// 		}
// 		public double sum(double x,double y){
// 			return(x+y);
// 		}*/
// 		public static void foo(){
// 			System.out.println(" Method.foo() called");

// 		}
// 		public static void foo(){
// 			System.out.println("Method.foo(int) called");
// 		}
// 	public static void main(String[] args){
// 		/*Method s=new Method();
// 		System.out.println(s.sum(1,2));
// 		System.out.println(s.sum(1,2,3));
// 		System.out.println(s.sum(10.5,10.9));*/
// 		Method.foo();
// 		//Method.foo(11);

// 	}
// }*/
class Base{
	public static  void display(){
		System.out.println("static from base class");
	}
	public void print(){
		System.out.println("Nonstatic from base class");
	}
}
class Derived extends Base{
	//this method hide display in base class,static method cannot be overridden
	public static void display(){
		System.out.println("static from derived class");
	}
	public void print(){
		System.out.println("non static from derived");
	}
}
public class Method{
	public static void main(String[] args){
		Base obj=new Derived();
		obj.display();
		obj.print();

	}
	
}