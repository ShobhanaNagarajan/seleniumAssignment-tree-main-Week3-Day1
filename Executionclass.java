package week3.day1;

public class Executionclass {

	public static void main(String[] args) {
	
		BMW b = new BMW();
		int bmwWheelCount = b.carWheelCount;
		System.out.println("BMW Wheels:"  + bmwWheelCount);
		
		b.driveVehicle();
		b.applyBrake();
		b.applygear();
		b.driveVehicle();
		b.startEngine();
		
		
		Audi a = new Audi();
		a.enableAirBag();
		int audiWheelCount = a.carWheelCount;
		System.out.println("audiWheelCount:" +audiWheelCount);
		
        a.applyBrake();
        a.applygear();
        a.driveVehicle();
        a.startEngine();
	}

}
