import java.util.Scanner;

class Hello{
	public static void main(String[] args){
		System.out.println("Enter Cutoff for A");
		int Cutoff=Integer.parseInt(args[0]);
		System.out.println("The Cutoff is ");
		System.out.println(Cutoff);
		int count=0;
		int rows=4;
		int col=3;
		
		int[][] a={
			{10,30,37},{12,21,28},{8,35,31},{20,38,34}
		};
		System.out.println(a[0][1]);
		
		for(int i=0;i<rows;i++){
			for (int j=0;j<col;j++ ) {
				if(a[i][j]>=Cutoff){
					count++;

				}
				
				//System.out.println(a[i][j]);
				

				
			}
		}
		System.out.println("No of A Students is:");
		System.out.println(count);

	} 
}