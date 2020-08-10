import java.util.Date;

import ex3.CPU;
import ex3.Car;

public class Main {

	@SuppressWarnings("unused")
	private static Date ngay1;

	public static void main(String[] args) {
//		ngay1 = new Date(18/05/2020);	
//		CPU a= new CPU();
//		CPU.Processor b=a.new Processor();
//		System.out.println(b.getCache());
//		CPU.Ram c=a.new Ram();
//		System.out.println(c.getClockSpeed());
		Car car=new Car("Mazda","8WD");
		Car.Engine b=car.new Engine();
		b.setEngineType("Crysler");
		System.out.println(car.toString()+ "dong co la" +b.getEngineType());
		
//		q3: day la inner class;

	}
	
	
	
	

}
