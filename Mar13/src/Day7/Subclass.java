package Day7;
class parent
{
	void display()
	{
		System.out.println("I am in parent class");
	}
}
class child extends parent
{
	void printdata()
	{
		System.out.println("i am in child class");
	}
}
public class Subclass {

	public static void main(String[] args) 
	{
		child c1=new child();
		c1.display();
		c1.printdata();
			

	}

}

