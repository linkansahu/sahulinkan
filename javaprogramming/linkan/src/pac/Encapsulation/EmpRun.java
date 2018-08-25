package pac.Encapsulation;

public class EmpRun {

	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.SetName("linkan");
		e1.SetId(1989);
		e1.setSal(50000);
		System.out.println(e1.getName()+" "+e1.getId()+" "+e1.getSal());
		

	}

}
