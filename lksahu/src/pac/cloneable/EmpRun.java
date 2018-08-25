package pac.cloneable;

public class EmpRun {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1=new Employee("Linkan",10);
		System.out.println("original object");
		e1.getdata();
		Employee e2=(Employee)e1.clone();
		System.out.println("cloned object");
		e2.getdata();

	}

}
