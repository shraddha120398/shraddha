package all_assignments;

public class CC1 {
	int s=22;
	int k=66;

	public static void main(String[] args)
	{
	CC1 a=new CC1();
	a.method1();
	a.method2();
		
	}
	public CC1()
	{
		 s=10;
	     k=70;
		
		System.out.println("s= "+s);
		System.out.println("k= "+k);
	}
	
	public void method1()
	{
		 int s=33;
		int k=44;
		System.out.println("ss= "+s);
		System.out.println("kk= "+k);
	}
	
	public void method2()
	{
		// s=55;
		// k=66;
		int sum=s+k;
		System.out.println("sss= "+s);
		System.out.println("kkk= "+k);
		System.out.println("sum= "+sum);
	}

}
