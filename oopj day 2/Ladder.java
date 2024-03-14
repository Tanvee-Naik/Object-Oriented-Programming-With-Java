import java.util.Scanner;
class Ladder{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter marks");
	int n = sc.nextInt();

	if(n >= 90)
		System.out.println("A");
	else if(n >= 80)
		System.out.println("B");
	else if(n >= 60)
		System.out.println("c");
	else if(n >= 40)
		System.out.println("D");
	else 
		System.out.println("F");
	}
}