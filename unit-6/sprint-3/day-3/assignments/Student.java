package dummy;

public class Student {
	private int roll; 
	private int marks;
	private String name;
	
	public Student() {
		
	}
	public Student(String name, int roll, int marks) {
		super();
		this.name=name;
		this.roll = roll;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}
	
	
	
}
