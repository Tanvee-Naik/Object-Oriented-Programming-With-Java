class Vehicle{
	public static void vehicle1(String name, String model, float price) {
		System.out.println("Name: "+ name);
		System.out.println("Model: "+ model);
		System.out.println("price: "+ price);
	}
	public static void vehicle2(String name, String model, float price, String color) {
		System.out.println("Name: "+ name);
		System.out.println("Model: "+ model);
		System.out.println("price: "+ price);
		System.out.println("Color: "+ color);
	}
	
}


public class Program2 {

	public static void main(String[] args) {
		Vehicle.vehicle1("Suzuki","A1",250000);
		Vehicle.vehicle2("Tata", "B1", 400000, "Blue");

	}

}