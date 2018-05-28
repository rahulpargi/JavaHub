class StaticKey{
	//static variable
	static int a=10;
	static int b;
	//static block
	static{
		System.out.println("Static  block initialized");
		b=a*4;
	}

	/*static void m1(){
		System.out.println("from m1");
	}*/
	public static void main(String[] args){
		System.out.println("from main");
		System.out.println(a);
		System.out.println(b);
	}
}