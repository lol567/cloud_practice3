
public class Door {

	boolean mIsOpened = false;
	
	public void open(){
		mIsOpened = true;
	}
	
	public void close(){
		mIsOpened = false;
	}
	
	public String toString(){
		if (mIsOpened)
			return ("Door is open.");
		else 
			return ("Door is close.");
	}
	
}
