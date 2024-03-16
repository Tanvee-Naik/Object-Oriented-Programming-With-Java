import java.util.Scanner;

class Student{
	
		String name;
		int rono;
		int marks;
		
		Scanner sc =new Scanner(System.in);
		
		public void getInfo() {
			System.out.print("Enter name: ");
			this.name=sc.nextLine();
			System.out.print("Enter rono: ");
			this.rono=sc.nextInt();
			System.out.print("Enter marks: ");
			this.marks=sc.nextInt();
			}
		
		public void printInfo() {
			System.out.println(this.name+ "   "+ this.rono +"   "+ this.marks);
		}
		
}


public class Program {
	public static void main(String args[]) {
		Student st = new Student();
		st.getInfo();
		st.printInfo();
	}
}