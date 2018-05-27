//Control flow in try-catch

class TryCatch{
	public static void main(String[] args){
		int[] arr=new int[4];
		try{
			int i=arr[4];
			System.out.println("Inside try block");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception caught");
		}
		System.out.println("Outside try catch clause");
	}
}