//Control flow in try-catch

class TryCatch{
	public static void main(String[] args){
		int[] arr=new int[4];
		try{
			int i=arr[3];
			System.out.println("Inside try block");
		}
		/*catch(NullPointerException e){
			System.out.println("Exception caught");
		}*/finally{
			System.out.println("finally block executed");
		}
		System.out.println("Outside try catch clause");
	}
}