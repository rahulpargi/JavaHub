//Program to show working of user defined generic class
 

class Test<T>
{
	//an object of type T
	T obj;
	Test(T obj){
		this.obj=obj;//constructor

		}
		public T getObject(){
			return this.obj;
	}

}
//Driver class to test above
class Generics{
	public static void main(String[] args){
		//instance of Integer type
		Test<Integer> iObj=new Test<Integer>(15);
		System.out.println(iObj.getObject());
		//instance of string type
		Test<String> sObj=new Test<String>("Sample string");
		System.out.println(sObj.getObject());
	}
}