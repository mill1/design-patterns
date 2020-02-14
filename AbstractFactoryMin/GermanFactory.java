package _AbstractFactory;

class GermanFactory extends AbstractFactory {

    public GermanFactory() {
    }

    @Override
    public CarPart makeEngine() {
        return new CarPart("\"German car: robust engine\"");
    }

    @Override
    public CarPart makeBodywork() {
        return new CarPart("\"German car: stainless body\"");
    }
}
