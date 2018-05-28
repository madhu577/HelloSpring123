package Example;

import java.lang.reflect.Constructor;

public class constructer {
	
	public constructer()
	{
		System.out.println("im the constructer");
	}
	
	public constructer(int a , int b)
	{
		System.out.println("im the parameterized constr ucter");
	}
	
	public constructer(String str)
	{
		System.out.println(str);
	}
	
	public void getdata()
	{
		System.out.println("im the method");
	}
	
	
	//will not return values
	// name of constructor should be the class name
	
	public static void main(String[] args) {
		

		
		constructer c = new constructer();
		constructer cd = new constructer("hello");
		constructer cc = new constructer(4,5);
		
	}

}
