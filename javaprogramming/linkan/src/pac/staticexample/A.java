package pac.staticexample;

public class A {
int i=10;
static int j=30;
void m1()
{
	int i=20;
	System.out.println(i);
	System.out.println(this.i);
	System.out.println(j);
}
public static void main(String[] args) {
	A a1=new A();
	a1.m1();
}
}
