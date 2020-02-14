public class ADuckSimulator {
	
	public static void main(String[] args) {
		
	  //Duck mallard = new MallardDuck();
		Duck mallard = new MallardDumbDuck();
		mallard.display();
		mallard.swim();
		mallard.performQuack();
		mallard.performFly();
		
		
	}
}
