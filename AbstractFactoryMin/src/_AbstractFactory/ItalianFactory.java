package _AbstractFactory;

class ItalianFactory extends AbstractFactory {

    public ItalianFactory() {
    }

    @Override
    public CarPart makeEngine() {
        return new CarPart("\"Italian car: fast engine\"");
    }

    @Override
    public CarPart makeBodywork() {
        return new CarPart("\"Italian car: stylish body\"");
    }
}
