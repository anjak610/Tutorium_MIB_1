package Übung_Vererbung;

public class Bicycle {
	
	// the Bicycle class has three fields
	public int cadence;
	public int gear;
	public int speed;
	
	// the Bicycle class has one constructor --> neuer Konstruktur gebaut 
	public Bicycle(int startCadence, int startSpeed, int startGear)
	{
		gear = startGear;
		speed = startSpeed;
		cadence = startCadence;		
	}
	
	//public Bicycle(){};
	
	//Bicycle class has four more methods
	
	public void Cadence (int newValue)
	{
		cadence = newValue;
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
