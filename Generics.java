/*class Test<T,U>{
	//An object of type T
	T obj1;
	U obj2;
	Test(T obj1,U obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
	/*public T getObject(){
		return this.obj1;
		re
	}
	public void print(){
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
class Generics{
	public static void main(String[] args){
	//instance og Integer type

	/*Test<Integer> iobj=new Test<Integer>(15);
	System.out.println(iobj.getObject());
	//instance of string type
	Test<String> sobj=new Test<String>("Test");
	System.out.println(sobj.getObject());

	Test<String,Integer> obj=new Test<String,Integer>("test",2234);
	obj.print();

}
}*/
// class Generics{
// 	//generic method
// 	static <T> void genericDisplay(T element){
// 		System.out.println(element.getClass().getName()+"="+element);

// 	}
// 	public static void main(String[] args){
// 		genericDisplay(11);
// 		genericDisplay("hello");
// 		genericDisplay(1.0);
// 	}
// }

//Using generics to convert run time exceptions into compiler time exception

import java.util.*;

class Generics{
	public static void main(String[] args){
		ArrayList <String> a1=new ArrayList<String> ();
		a1.add("Sachin");
		a1.add("rahul");
		//compiler will not allow this
		a1.add(90);
		String a=(String)a1.get(0);
		String a=(String)a1.get(1);
		String a=(String)a1.get(2);


	}
}