package Structural.Decorator;

public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        super();
        this.shape = shape;
    }
}
