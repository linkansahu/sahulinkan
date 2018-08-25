package pac.Inheritance;

 class A 
{
 final void a(int a)
 {
	 System.out.println(a+" :in A");
 }
}
class B extends A
{   
	final void a(int a,int b)
	 {
		 System.out.println(a+" :"+b +" :in A");
	 }	
}

