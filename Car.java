/**
* Car.java
*
* Cassidy Jones
*/

public class Car extends Vehicle{

	
	private int doors;
	private int passengers;
	
	public Car(String aMake, String aModel, String aPlate, int doors, int passengers){
		super(aMake, aModel, aPlate);
		doors = numDoors;
		passengers = numPassengers;
	}
	
	public getDoors(){
		return this.doors;
	}
	
	public getPassengers(){
		return this.passengers;
	}
	
	@Override
	public toString(){
		result = String.format("%f-door %s %s with license %s",numDoors,aMake,aModel,aPlate);
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(this.make.equals(otherCar.getMake())) {
			if(this.model.equals(otherCar.getModel())) {
				if(this.plate.equals(otherCar.getPlate())) {
					if(this.doors == (otherCar.getDoors())){
						if(this.passengers == (otherCar.getPassengers())){
					return true;
				}
			}
		}
		
		return false;
	}
	
	public Car copy(){
		super.getMake();
		super.getModel();
		super.getPlate();
		int doors = this.getDoors();
		int passengers = this.getPassengers();
		
		Car theCopy = new Car(aMake,aModel,aPlate,doors,passengers);
		
		return theCopy;
	}
	
	
	
}