package all_assignments;

public class assignment {

	public static void main(String[] args)
	{
		
		//call from same class   
		//static and non-static methods
		
		assignment s=new assignment(); 
		
		s.addition();
		
		s.addition(50, 43);
		
		
	substraction();
	
	substraction(75, 78);
		
		//call from another class
		//static and non-static methods
		
		
		assignment1 n=new assignment1();
		n.addition(56, 45.7f, 45);;              //non-static method from assignment1 class

		assignment1.substraction(87,34, 45);
	}
	
	public void addition()
	{
		int a=60;
		int b=50;
		int sum=a+b;
		
		System.out.println("addition is "+sum);
	}
	public void addition(int a,int b)
	{
		
		int sum=a+b;
		
		System.out.println("addition is "+sum);
	}
	
	
	public static void substraction()
	{
		int d=40;
		int f=20;
		int sub=d-f;
		
		System.out.println("substraction is "+sub);
	}
	public static void substraction(int d,int f)
	{
		
		int sub=d-f;
		
		System.out.println("substraction is "+sub);
	}

}
