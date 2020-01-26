/* A customer ordering a pizza. */
public class PizzaBuilderDemo {
	
    public static void main(String[] args) {
    	
        Waiter waiter = new Waiter();
        
        int i = 0;
        PizzaBuilder pizzaBuilder = null;
        
        if(i==0) {
        	pizzaBuilder = new HawaiianPizzaBuilder();
        }
        else {
        	pizzaBuilder = new SpicyPizzaBuilder();
        }
        
        waiter.setPizzaBuilder( pizzaBuilder ); 
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        
        System.out.print(pizza.toString());
    }
}
