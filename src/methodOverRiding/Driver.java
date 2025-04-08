package methodOverRiding;

public class Driver {
	public static void main(String[] args) {
		Animal da=newDog("Husky");
		da.sound();
		String dogBreed=((Dog)da).breed;
		System.out.println(dogBreed);
		da.sound();
		Dog d=new Dog();
		d.sound();
		Tiger t =new Tiger();
		t.sound();
	}

}
