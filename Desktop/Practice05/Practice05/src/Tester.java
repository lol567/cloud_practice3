
public class Tester {
	
	public static void main(String[] args){
		SportsCar sc = new SportsCar();
		System.out.println(sc.toString());
		
		sc.openDoor();
		sc.flateWheel();
		sc.startEngine();

		System.out.println(sc.toString());
		
	}

}
