package classTest;

public class Car {

	private String model;
	private String color;
	private int maxSpeed;
	
	Car(String model){
		this(model, "silver", 250);
	}
	
	Car(String model, String color){
		this(model, "black", 3000);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public String toString(){
		return model +", " + color + ", " + maxSpeed;
	}
	
	public static void main(String[] args) {
		Car car = new Car("재규어", "tor");
		System.out.println(car.toString());
	}
}
