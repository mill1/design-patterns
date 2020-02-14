
public class ColorFactory extends AbstractFactory {
	
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String shapeType){
   
	   switch (shapeType) {
		case "RED":
			return new Red();
		case "GREEN":
			return new Green();
		case "BLUE":
			return new Blue();
		default:
			return null;
		}
   }
}
