package pac.comparator;

public class Student 
{
	int rollno;
    String name, address;
    // Constructor
    public Student(int rollno, String name,
                               String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    public String toString()
    {
        return this.rollno + " " + this.name +
                           " " + this.address;
    }
}
