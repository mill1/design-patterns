
public class MallardDumbDuck extends Duck {
	
	public MallardDumbDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I'm a real dumb duck");
	}
}
