import java.util.*;
class Emp
{
	String name;
	int age ;
	int sal;
	String desig;
	Emp()
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("NAME : ");
		name=sc.next();		
		System.out.print("Age : ");
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("AGE  : "+age);
		System.out.println("SALARY : "+sal);
		System.out.println("Desig : "+desig);
	}
}
class Clerk extends Emp
{
	
	Clerk()
	{
		sal=15000;
		 desig="Clerk";			
	}
	
}
class Dev extends Emp
{
	
	Dev()
	{
		 sal=25000;
		desig="Developer";
	}
}
class Programmer extends Emp
{
	
	Programmer()
	{
		 sal=26000;
		desig="programmer";
	}
}
class Tester extends Emp
{
	
	Tester()
	{
		 sal=16000;
		desig="Tester";
	}
}
class Demo5
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		System.out.println ("Choice  : ");
		System.out.println("1 )Clerk  : ");
		System.out.println("2)Dev: ");
            System.out.println("3 )Programmer: ");
            System.out.println("4 )Tester: ");
		int ch=sc.nextInt();
		if(ch==1)
		{
			Clerk c =new Clerk();
			c.display();
		}
		if(ch==2)
		{
				Dev d=new Dev();
				d.display();
		}
            if(ch==3)
		{
			Programmer c =new Programmer();
			c.display();
		}
            if(ch==4)
		{
			Tester c =new Tester();
			c.display();
		}	
	
	}
}
