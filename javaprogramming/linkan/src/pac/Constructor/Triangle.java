package pac.Constructor;

public class Triangle 
{
int base;
int height;
Triangle ()
{
	
}
Triangle(int b,int h)
{
	base=b;
	height=h;
}
Triangle (Triangle t)
{
	base=t.base;
	height=t.height;
	
}
void print()
{
	System.out.println("Area= "+(base*height)/2);
	}
}
