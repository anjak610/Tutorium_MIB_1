package klasuraufgabgen_1;

public class NamenArray{
	
	public static void main (String[] args)
	{
		String[] strArray = new String[8];
		
		strArray[0] = "Theobald";
		strArray[1] = "Nicki";
		strArray[2] = "Hanna";
		strArray[3] = "Josefine";
		strArray[4] = "Fenja";
		strArray[5] = "Jose";
		strArray[6] = "jan";
		//strArray[strArray.length -1] = "Ende";
		
		String s = "Hanna";
		System.out.println(namenSuche(strArray, s));
		namenSort(strArray);
		//System.out.println(namenSort(strArray));
		
		for (int j = 0; j < strArray.length; j++)
		{
			if(strArray[j] != null)
			{
				System.out.println("A" + j+ ":" + strArray[j]);
			}
			else
				System.out.println("A" + j + ":" + "leer");
		}
	}
	
	public static int namenSuche(String[] strAr, String str)
	{
		for (int i = 0; i< strAr.length; i++)
		{
			if (str == strAr[i])
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public static void namenSort(String[] strAr)
	{
		for (int i = 0; i< strAr.length-2; i++)
		{
			if(strAr[i].length() > strAr[i+1].length())
			{
				String tmp = strAr[i];
				
				strAr[i] =  strAr[i+1];
				
				strAr[i+1] = tmp;				
			}
		
		
			/*if(strAr[i].length() == strAr[i+1].length())
			{
				strAr[i] = strAr[i];
			}*/
		
				
			System.out.println(strAr[i] + " " +i);
		}
	
	}
}