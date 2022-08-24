package Exaception;

public class Stdentmain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student s1=new  Student(17,"anu",56,55,77,81,90);
		Student s2=new  Student(17,"sau",56,55,77,80,90);
		Student s3=new  Student(17,"anul",56,55,77,89,90);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		double max=s1.getPercentage();
		if(max<s2.getPercentage())
		{
			max=s2.getPercentage();
		}
		if(max<s3.getPercentage())
		{
			max=s3.getPercentage();
		}
		System.out.println("The Max percentage"+max);
		if(max>=80)
		{
			System.out.println("it is hight percentatge");
		}
		else
		{
			throw new Exception("low percentage");
		}
	}

}
