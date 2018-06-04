
class Hi extends Thread{
	
	public void run(){
		for(int i=0;i<5;i++){
			try{
				System.out.println("Hi");
				Thread.sleep(2000);
			}catch(Exception e){

			}	
				
				

		}
	}
	

}
class Hello extends Thread {
		public void run() {
		for(int i=0;i<5;i++){
			try{
				System.out.println("Hello");
				//Thread.sleep(2000);
			}catch(Exception e){

			}	
				
				

		}
	}
	
}

class Multi extends Thread{
	public static void main(String[] args) throws InterruptedException{
		Hello obj1=new Hello();
		//Thread.sleep(5000);
		Hi obj2=new Hi();
		obj1.start();
		obj2.start();

	}
}
