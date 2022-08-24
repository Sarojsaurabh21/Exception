package Exaception;

public class Fivedigitno {
	public static void fivedigit(int num)
	{
		if(num<10000 && num<=99999)
		{
			System.out.println("five digit number");
		}
		else
		{
			try
			{
				throw new Exception("not a five digit number");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String []args)
	{
		Fivedigitno f=new Fivedigitno();
		//f.Fivedigitno(3333);
		
	//	fivedigit(2453);
		
	}
 
 }

