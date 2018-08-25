package pac.Aggregation;

public class Person {

	
	 private Job job;
	 public Person()
	 {
		 this.job=new Job();
		 job.setSalary(10000L);
	 }

	public long getSalary()
	{
		return job.getSalary();
		
	}

}
