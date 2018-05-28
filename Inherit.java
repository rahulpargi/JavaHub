//Base Class

class Bicycle{
	public int gear;
	public int speed;

	//constructor
	public Bicycle(int gear,int speed){
		this.gear=gear;
		this.speed=speed;
	}
	//Methods
	public void applyBrake(int decrement){
		speed-=decrement;
	}
	public void  speedUp(int increment){
		speed+=increment;
	}
	//print info of Bicycle
	public String toString(){
		return("No of gears are "+gear+"Speed of bicycle "+speed);

	}
}
//Derived Class

class MountainBike extends Bicycle{
	public int seatHeight;

	//constructor
	public MountainBike(int gear,int speed,int startHeight){
		super(gear,speed);
		seatHeight=startHeight;
	}
	public void setHeight(int newValue){
		seatHeight=newValue;

	}
	public String toString(){
		return(super.toString()+"\n seat height is "+seatHeight);	
	}
}
public class Inherit{
	public static void main(String[] args){
		MountainBike mb=new MountainBike(3,100,25);
		System.out.println(mb.toString());
	}
}