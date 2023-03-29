package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println("The car has been driven by the Driver");
	}

	public void applyBrake() {
		System.out.println("Brakes should be applied if the signal is Red");
	}

	public void soundHorn() {
		System.out.println("Press the Horn before overtaking");
	}

	public void isPuncture() {
		System.out.println("Stop the car");
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.driveCar();
		car.applyBrake();
		car.soundHorn();
		car.isPuncture();
	}

}
