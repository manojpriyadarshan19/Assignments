package program.program1;

public class Car {

	public void openDoor() {
		System.out.println("Open Door");
	}
	public void insertKey() {
		System.out.println("Insert Key");
	}
	public void startEngine() {
		System.out.println("Start Engine");
	}
	public void applyGear() {
		System.out.println("Apply Gear");
	}
public static void main(String[] args)	{
	Car mclaren=new Car();
	mclaren.openDoor();
	mclaren.insertKey();
	mclaren.startEngine();
	mclaren.applyGear();
}
}
