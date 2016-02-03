
public class SportsCar extends Car {
	
	SportsCar(){
		nEngine = new Engine();
		
		nDoor = new Door[2];
		for (int i= 0; i<2; i++)
			nDoor[i] = new Door();
		
		nWheel = new Wheel[4];		
		for (int i= 0; i<4; i++)
			nWheel[i] = new Wheel();
	}
	
	
	public void startEngine(){
		if(nEngine.mIsPoweredUp)
			nEngine.powerUp();
	}
	
	
	public void openDoor(){
		for (Door d: nDoor)
			if(!d.mIsOpened)
				d.open();
	}
	
	
	public void flateWheel(){
		for (Wheel d: nWheel)
			if(!d.mIsLated)
				d.inflate();//раздувать
	}
	
	
	public String toString(){
		String res = "SportCar: ";
		res+=super.toString();
		return res;
		
	}

}
