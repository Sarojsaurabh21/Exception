package Exaception;

public class PositiveorNegative {
	public static void check(int num)throws Exception
	{
		if(num>=0)
		{
			System.out.println("positive number");
		}
		else
		{
			throw new Exception("negative number");
		}
		
		}
	

	public static void main(String[] args) throws Exception
	{
		check(22);
		// TODO Auto-generated method stub
		
		

	}

}
