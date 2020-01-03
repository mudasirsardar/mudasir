package HomeWork_2;

public class Employee {

	int id;
	String firstName;
	String lastName;
	int salary;
	
	Employee(){
		id=20;
		firstName="Ubaid";
		lastName="Rehman";
		salary=20000;
	}
	
	Employee(int id, String firstName,String lastName ,int salary ){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
		
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}
	
	
	public String getName() {
		return this.firstName+" "+this.getLastName();
	}
	
	public int getAnnualSalary() {
		return this.salary*12;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSalary()=" + getSalary() + ", getName()=" + getName() + ", getAnnualSalary()="
				+ getAnnualSalary() + "]";
	}
	

	
}
