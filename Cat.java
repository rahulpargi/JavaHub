class Cat{
		public static void main(String[] args) {
		int a=10;
		int b=0;
		try{
			int c=a/b;
			System.out.println("c");
		}catch(ArithmeticException e){
			System.out.println("Exception is"+e);

		}finally{
			System.out.println("this is a finally block");
		}
	}
}