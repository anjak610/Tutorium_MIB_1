package �bung_Vererbung;

public class Bicycle {
	
	// the Bicycle class has three fields
	public int sizeOfWheels;
	public int gear;
	public int speed;
	
	// the Bicycle class has one constructor --> neuer Konstruktur gebaut 
	public Bicycle(int startWheel, int startSpeed, int startGear)
	{
		gear = startGear;
		speed = startSpeed;
		sizeOfWheels = startWheel;		
	}
	
	public Bicycle(){};
	
	//Bicycle class has four more methods
	
	public void SizeOfWheel (int newValue)
	{
		sizeOfWheels = newValue;
	}
	
	public void SetGear(int newValue)
	{
		gear = newValue;
	}
	
	public void applyBrake(int decrement)
	{
		speed -= decrement;
	}
	
	public void speedUp(int increment)
	{
		speed += increment;
	}

}
