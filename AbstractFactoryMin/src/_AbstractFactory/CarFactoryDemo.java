package _AbstractFactory;

public class CarFactoryDemo {
	
    public static void main(String[] args) {
        
    	AbstractFactory factory;
        
        int j = 0;
        
        if (j==0) {
            factory = new ItalianFactory();
        } else {
            factory = new GermanFactory();
        }
        System.out.println(factory.makeBodywork());
        System.out.println(factory.makeEngine());
    }
}
