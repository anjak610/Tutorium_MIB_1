package �bung_Vererbung;

public class Test {

	public static void main(String[] args) {
		
		Bicycle a = new Bicycle(2,30,6);
		MountainBike b = new MountainBike(2,30,6,1);
		
		//a.SizeOfWheel (5);
		//b.setHeight(4);
		
		System.out.println("I want a bike with " + a.gear + " gears a max speed of " +a.speed+ " and the wheel size must be " + a.sizeOfWheels);
		System.out.println("I want a bike with " + b.gear + " gears a max speed of " +b.speed+ " and the wheel size must be " + b.sizeOfWheels + "a seatheight of " + b.seatHeight);
		//HouseAndGarage b = new HouseAndGarage(2, 4, "red", 4);
		
		//System.out.println("I want a " + b.color + " house with " +b.floors+ " floors and " + b.rooms + " rooms and a garage for my " + b.cars +" cars ");

	}

}
