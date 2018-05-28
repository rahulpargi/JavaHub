class StaticKey{
	//static variable
	static int a=10;
	int b=20;
	//static int b;
	//static block
	/*static{
		System.out.println("Inside Static  block ");
		//b=a*4;
	}*/
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
	}*/
	public static void main(String[] args){
		System.out.println("from main");
		System.out.println(a);
		//System.out.println(b);
	}
}