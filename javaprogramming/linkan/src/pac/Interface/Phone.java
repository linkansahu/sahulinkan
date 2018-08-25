package pac.Interface;

interface Phone 
{
 public void msg();
 public void call();

}
class Nokia implements Phone
{

	@Override
	public void msg() {
		System.out.println(getClass()+" :msg facility");
		
	}

	@Override
	public void call() {
		System.out.println(getClass()+" :Call facility");
		
	}
	public void gps()
	{
		System.out.println(getClass()+" :gps facility");
		
	}
	
}
class Htc implements Phone
{

	@Override
	public void msg() {
		System.out.println(getClass()+" :msg facility");
		
	}

	@Override
	public void call() {
		System.out.println(getClass()+" :Call facility");
		
	}
	public void mp4()
	{
		System.out.println(getClass()+" :mp4 facility");
	}
	
}

