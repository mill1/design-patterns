package _AbstractFactory;

class CarPart implements Cloneable{
    
	public String str;

    public CarPart(String str) {
        this.str = str;
    }

    @Override
    public CarPart clone() {
        CarPart clone = null;
        try {
            clone = (CarPart)super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return str;
    }
}
