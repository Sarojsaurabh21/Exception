package Exaception;

public class FinallyExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=4,b=0;
			int k=a/b;
			System.out.println(k);
			System.out.println("hello");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("hello");
		}

	}

}
