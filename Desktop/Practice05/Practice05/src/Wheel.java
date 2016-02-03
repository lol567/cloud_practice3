
public class Wheel {
	
 boolean mIsLated = false;
	
	public void inflate(){
		mIsLated = true;
	}
	
	public void deflate(){
		mIsLated = false;
	}
	
	public String toString(){
		if (mIsLated)
			return ("Wheel is inflate.");
		else 
			return ("Wheel is deflate.");//wheel is pumped
	}

}
