//композиция в машине дверь
public class Car {
	
	protected Engine nEngine = new Engine();
	protected Door[] nDoor;
	protected Wheel[] nWheel;
	
	public void startEngine(){}
	
	public void openDoor(){}
	
	public void flateWheel(){};
	
	public String toString(){
		String res = new String();
		res+= nEngine.toString() + " ";
		for (Door d: nDoor)
			res+=d.toString()+" ";
		for (Wheel w: nWheel)
			res+=w.toString()+" ";
		return res;
	}
	//ругой прмер 

}
