package Examples;

public class MethodsToMethods {
	
	public static void main(String[]args)
	{
		//a = new DoOneThing();
		System.out.println("I'm in main");
		MethodsToMethods a = new MethodsToMethods();
		a.DoOneThing();
		System.out.println("I'm back in main");
	}
	
	private void DoOneThing()
	{
		System.out.println("Now I do one thing");
		DoAnotherThing();
		System.out.println("and now I do one thing");
	}
	
	private void DoAnotherThing()
	{
		System.out.println(" I do another thing");
	}
}
