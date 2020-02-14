
public class MyClass {
	
	private static MyClass myInstance = null;
	
	private MyClass() {	}
	
	public static MyClass getInstance() {
		
		if (myInstance == null) {
			myInstance = new MyClass();
		}
		return myInstance;
	}
}