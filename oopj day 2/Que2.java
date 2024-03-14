
import java.util.Scanner;
class Que2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter year");
	int y = sc.nextInt();
	int a;
	System.out.println("using if-else:");
	if (y%4 == 0){
		
		System.out.println(y+ " is Leap year.");
		a=1;
	}
	else {
		System.out.println(y+ " is not a Leap year.");
		a=0;
	}

	System.out.println("using switch case:");
	switch(a){

	case 0: 
		System.out.println(y+ " is not a Leap year.");break;

	case 1:
		System.out.println(y+ " is Leap year.");break;

	}
	


	}

}