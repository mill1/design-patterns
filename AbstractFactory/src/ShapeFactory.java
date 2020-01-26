
public class ShapeFactory extends AbstractFactory {
	
   @Override
   public Shape getShape(String shapeType){
   
	   switch (shapeType) {
		case "CIRCLE":
			return new Circle();
		case "RECTANGLE":
			return new Rectangle();
		case "SQUARE":
			return new Square();
		default:
			return null;
		}
      
   }
   
   @Override
   Color getColor(String color) {
      return null;
   }
}
