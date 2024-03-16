class Employee{
	
	public void employee1(String name, String department, int id) {
		System.out.println("name: "+ name);
		System.out.println("department: "+ department);
		System.out.println("Id: "+ id);
		System.out.println();
	} 
	
	
	public void employee2(String name, int salary, int id) {
		System.out.println("name: "+ name);
		System.out.println("Salary: "+ salary);
		System.out.println("Id: "+ id);
		
	}
	 
}

public class Program3 {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.employee1("Tanvee","HR",112);
		emp.employee2("Vaishvani",45000,120);

	}

}