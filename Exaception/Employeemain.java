package Exaception;

public class Employeemain {

	public static void main(String[] args) throws Exception {
		Employee employee1=new Employee(101,"santoor",10,1);
		Employee employee2=new Employee(102,"Lifeboy",40,25);
		Employee employee3=new Employee(103,"Patanjali",30,20);
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		double max=employee1.product();
		if(max<employee2.product())
		{
			max=employee2.product();
		}
		if(max<employee3.product())
		{
			max=employee3.product();
		}
		
		System.out.println("This is max weight=="+max);
		if(max<200)
		{
			System.out.println("it is max weight of product");
		}
		else
		{
			throw new Exception("it is less than 200");
		}
		
		
		
		double min=employee1.product();
		if(min>employee2.product())
		{
			min=employee2.product();
		}
		if(min>employee3.product())
		{
			min=employee3.product();
		}
		
		System.out.println("This is min weight=="+min);
		if(min>200)
		{
			System.out.println("it is less than 200");
		}
		else
		{
			throw new Exception("it is less than 200");
		}
		
	}

}
