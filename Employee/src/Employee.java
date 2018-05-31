import java.util.Scanner;

 class Emp {
	String first_name;
	String last_name;
	Double salary;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public double increment() {
		System.out.println("Yearly salary=salary*12");
		System.out.println(((salary*1.1)+salary)*12);
		return 0;
	}
 }
	public class Employee{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		emp1.setFirst_name(sc.next());
		emp1.setLast_name(sc.next());
		emp1.setSalary(sc.nextDouble());
		System.out.println(emp1.getFirst_name());
		System.out.println(emp1.getLast_name());
		System.out.println(emp1.getSalary());
		
			
	}
	}

 
