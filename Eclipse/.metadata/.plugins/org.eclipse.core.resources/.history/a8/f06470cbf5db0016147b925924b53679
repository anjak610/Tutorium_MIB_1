package klasuraufgabgen_1.Klausur_F3;

public class Arbeitstage {
	
	public Wochentag Tage;
	
	public boolean istArbeitstag()
	{
		switch(Tage){
		case MONTAG: 
	    {
	    	return true;
	    }
		case DIENSTAG: 
	    {
	    	return true;
	    }
		case MITTWOCH: 
	    {
	    	return true;
	    }
		case DONNERSTAG: 
	    {
	    	return true;
	    }
		case FREITAG: 
	    {
	    	return true;
	    }
		default:
			break;    
	 }
		 return false;
	}
	
	
	public Wochentag nachfolger()
	{
		switch(Tage){
		case MONTAG: 
	    {
	    	return Wochentag.DIENSTAG;
	    }
		case DIENSTAG: 
	    {
	    	return Wochentag.MITTWOCH;
	    }
		case MITTWOCH: 
	    {
	    	return Wochentag.DONNERSTAG;
	    }
		case DONNERSTAG: 
	    {
	    	return Wochentag.FREITAG;
	    }
		case FREITAG: 
	    {
	    	return Wochentag.SAMSTAG;
	    }  
		case SAMSTAG:
		{
			return Wochentag.SONNTAG;	
		}
		case SONNTAG:
		{
			return Wochentag.MONTAG;
		}
		
		
	}
		return null;
	}
}



