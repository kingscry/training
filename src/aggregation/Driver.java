package aggregation;

public class Driver {
	public static void main(String[] args) {
		Sim sim=new Sim(1234567891);
		Phone p=new Phone("Oppo",sim);
		p.display();
		p=null;
		System.out.println(sim.phno);
	}
}
