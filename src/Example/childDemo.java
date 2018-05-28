package Example;

public class childDemo extends parentDemo {
	
	String name ="hema";
	
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
		
		
	}

	public static void main(String[] args) {
		 
		childDemo cd = new childDemo();
		cd.getStringdata();

	}

}
