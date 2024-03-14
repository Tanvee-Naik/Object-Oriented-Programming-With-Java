import java.util.Scanner;

public class Que6 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter Height in meter: " );
		float h= sc.nextFloat();
		System.out.println(" enter Weight in kg: " );
		float w= sc.nextFloat();
		float BMI = w/(h*h);
		System.out.println("BMI IS: "+ BMI);
		if (BMI <18.5)
			System.out.println("Underweight");
		else if (BMI >=18.5 && BMI<=25)
			System.out.println("Normal");
		else if (BMI >25 && BMI<30)
			System.out.println("Overweight");
		else if (BMI >30)
			System.out.println("Obese");
		sc.close();
	}
}