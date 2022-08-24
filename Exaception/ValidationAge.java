package Exaception;

public class ValidationAge {
	public void ValidateAge(int age)
	{
		if(age<18)
		{
			try
			{
				throw new Exception("Invalide age");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("welcome to vote");
		}
	}

}
