import java.util.Scanner;
class Que3{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter two numbers" );
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println(" enter +/-/*/ /" );
	char s = sc.next().charAt(0);
	switch(s){
	
	case '+':
		System.out.println("sum is: "+ (a+b));break;
	case '-':
		System.out.println("subtraction is: "+ (a-b));break;
	case '*':
		System.out.println("multiplication is: "+ (a*b));break;
	case '/':
		System.out.println("division is: "+ (a/b));break;

	}

	}
}
	
	
