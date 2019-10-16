package Structural.Decorator;

public class LineStyleDecorator extends ShapeDecorator {

    protected LineStyle style;

    public LineStyleDecorator(Shape shape, LineStyle style) {
        super(shape);
        this.style = style;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Line style: " + style);
    }

    @Override
    public String description() {
        return shape.description() + " drawn with " + style + " lines";
    }
}
