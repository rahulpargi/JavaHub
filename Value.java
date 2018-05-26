public class Value{
	public static  void main(String[] args){
		/*int number=25;
		display(number);*/
		int[] b={1,2,3,4};
		System.out.println("Before display  method"+ b[0]);
		displayArray(b);
		System.out.println("After display method"+b[0]);
 	}
	//pass by value only primitive types point to different memory location
	public static void display(int a){
		System.out.println("Inside display method"+" "+a);
		a=100;
		System.out.println(a);
	}
	//pass by reference non primitive data type  it points to the same memory location
	public static void displayArray(int[] values){
		System.out.println("Inside displayArray "+values[0]);
		values[0]=99;

	}
}