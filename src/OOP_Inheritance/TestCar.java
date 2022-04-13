package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		Science s = new Science();
		s.start();
		s.stop();
		s.refuel();
		
		

		Physics p = new Physics();
		p.start();
		p.stop();
		p.refuel();
		p.read();
		p.laws();
		
		
		
		Automobile a = new Automobile();
		a.start();
		a.stop();
		a.refuel();

		Vehicle v = new Vehicle();
		v.start();
		v.stop();
		v.refuel();
		
		
		
		Car c = new Car();
		c.start();// car--start
		c.stop();// car stop
		c.refuel();// car--refuel
		
		
		BMW b = new BMW();
		
		b.start();// Overridden 
		b.refuel();//inherited
		b.stop();//inherited
		b.autoParking();//individual
		
		Car c1 = new BMW();
		
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.autoParking();// ref type check
		
		//BMW b1 = (BMW) new Car();
		//b1.autoParking();//ClassCastException
		
		Audi a1 = new Audi();
		a1.start();// overridden
		a1.stop();// inherited
		a1.refuel();//overridden
		a1.aeroDynamics();//individual
		
		Honda h = new Honda();
		h.start();
		h.BreakingSystem();
		h.speed();
		h.MusicSystem();
		h.stop();
		h.refuel();
		
		
		
		
		
		
	}

}
