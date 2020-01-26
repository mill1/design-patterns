
public class Whip extends ServiceDecorator {
	
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	public double cost() {
		return .25 + beverage.cost();
	}
}
