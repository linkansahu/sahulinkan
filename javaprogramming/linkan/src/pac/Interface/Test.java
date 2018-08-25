package pac.Interface;

interface Test 
{
void show();

}

interface Test1 
{
void show();

}
class Test3 implements Test,Test1
{
	public void show()
	{
		System.out.println("show");
	}
}