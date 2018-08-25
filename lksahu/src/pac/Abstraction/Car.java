package pac.Abstraction;

abstract class Car
{
abstract void start();
abstract void run();
abstract void stop();

}
class Bmw extends Car
{

	@Override
	void start() {
		System.out.println(getClass()+" :starts");
		
	}

	@Override
	void run() {
		System.out.println(getClass()+" :runs");
		
	}

	@Override
	void stop() {
		System.out.println(getClass()+" :stops");
		
	           }
	void navigation()
	{
		System.out.println(getClass()+" :navigation");
	}
	
}
class Auddi extends Car
{

	@Override
	void start() {
		System.out.println(getClass()+" :starts");
		
	}

	@Override
	void run() {
		System.out.println(getClass()+" :runs");
		
	}

	@Override
	void stop() {
		System.out.println(getClass()+" :stops");
		
	}
	
}