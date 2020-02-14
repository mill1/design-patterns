
public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void swim() { 
		System.out.println("Swimming..."); 
	}
	
	// Every subclass should implement this
	abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();		
	}
}
