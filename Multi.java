
class Hi{
	public void print(){
	for(int i=0;i<5;i++){
			
			System.out.println("Hi");

		}
	}
}
class Hello extends Thread{
	public void print(){
	
		for(int i=0;i<5;i++){
			
			System.out.println("Hello");

		}
	}	
}

class Multi extends Thread{
	public static void main(String[] args)throws InterruptedException {
		Hello obj1=new Hello();
		Thread.sleep(5000);
		Hi obj2=new Hi();
		obj1.print();
		obj2.print();

	}
}
