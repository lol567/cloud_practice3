
public class Engine {

	boolean mIsPoweredUp = false;
	
	public void powerUp(){
		mIsPoweredUp = true;
	}
	
	public void powerDown(){
		mIsPoweredUp = false;
	}
	
	public String toString(){
		if (mIsPoweredUp)
			return ("Engine is on.");
		else 
			return ("Engine is off.");
	}
	
}
