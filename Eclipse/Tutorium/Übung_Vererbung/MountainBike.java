package �bung_Vererbung;

public class MountainBike extends Bicycle {
	

	//the MountainBike subClass adds one field	
	public int seatHeight;
	
	//the MountainBike subclass has one constructor
	public MountainBike(int startWheel, int startSpeed, int startGear,int startHeight) {
		super(startWheel, startSpeed, startGear);
		seatHeight = startHeight;
		
	}
	
	//the Mountainbike subclass adds one method	
	public void setHeight(int newValue)
	{
		seatHeight = newValue;
	}

}
