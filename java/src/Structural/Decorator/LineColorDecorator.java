package Structural.Decorator;

public class LineColorDecorator extends ShapeDecorator {

    protected Color color;

    public LineColorDecorator(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Line color: " + color);
    }

    @Override
    public String description() {
        return shape.description() + " drawn with " + color + " color";
    }
}
