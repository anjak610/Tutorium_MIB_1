package Examples.ObjectMethods;

public class Blueprint {
	
	String color; // Instance Variable	
	int floors; 
	int rooms;
	
	//Instanz Methoden	
	void add() 
	{		
		floors+=1;
	}
	
	void add(int more)
	{
		floors += more;
	}
	
	
	Blueprint(String NewColor, int Newrooms, int HowManyfloors)
	{
		color = NewColor;
		rooms = Newrooms;
		floors = HowManyfloors;
		
		
	}
	
	Blueprint(){}
	
	
	public String repaint(String newColor)
	{
		color = newColor;
		return color;
	}
}
