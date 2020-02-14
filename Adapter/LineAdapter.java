
class LineAdapter implements Shape {
    
	private Line adaptee;

    public LineAdapter(Line line) {
        this.adaptee = line;
    }

    @Override
    public void display(int x1, int y1, int x2, int y2) {
        adaptee.display(x1, y1, x2, y2);
    }
}
