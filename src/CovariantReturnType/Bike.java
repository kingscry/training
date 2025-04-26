package CovariantReturnType;

public class Bike extends Vehicle{
	public Vehicle getObject() {
		return new Bike();
	}

}
