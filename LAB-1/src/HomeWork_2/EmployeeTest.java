package HomeWork_2;

public class EmployeeTest {
  
	public static void main(String[] args) {
		Employee obj1=new Employee();
		Employee obj2=new Employee(48, "Khurram", "Shahzad", 80000);
		System.out.println("ID            :"+obj2.getId());
	    System.out.println("First Name    :"+obj2.getFirstName());
	    System.out.println("Last  Name    :"+obj2.getLastName());
	    System.out.println("Full  Name    :"+obj2.getName());
	    System.out.println("Salary        :"+obj2.getSalary());
	    System.out.println("Annual Salary :"+obj2.getAnnualSalary());
	    System.out.println(obj2);
	}
}
