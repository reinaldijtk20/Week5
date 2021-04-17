import java.util.Random;

public class Employee {
	
	private static int nextId;
	
	private int id;
	private String nama = "";
	private double salary;
	
	static {
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}
	
	{
		id = nextId;
		nextId++;
	}
	
	public Employee(String nama, double salary) {
		this.nama = nama;
		this.salary = salary;
	}

	public Employee(double salary) {
		this("Employee #" + nextId, salary);
	}

	public Employee() {
		//call initialization block
	}

	public int getId() {
		return id;
	}
	
	public String getNama() {
		return nama;
	}
	
	public double getSalary() {
		return salary;
	}
	
}
