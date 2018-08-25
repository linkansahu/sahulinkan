package pac.Constructor;

public class TriangleRun {

	public static void main(String[] args) {
		 Triangle t1=new Triangle ();
		 Triangle t2=new Triangle (10,20);
		 Triangle t3=new Triangle(t2);
		 t1.print();
		 t2.print();t3.print();

	}

}
