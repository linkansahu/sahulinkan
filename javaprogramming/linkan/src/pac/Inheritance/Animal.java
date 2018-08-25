package pac.Inheritance;

public class Animal 
{
void eat()
{
	System.out.println(getClass()+" is eating");
}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println(getClass()+" is eating");
	}
}
