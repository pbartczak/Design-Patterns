package Structural.Decorator;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle();

        System.out.println("Drawing simple shape:");
        circle.draw();

        Shape decoratedRectangle = new LineStyleDecorator(
                new Rectangle(),
                LineStyle.DASH
        );

        Shape decoratedCircle = new LineStyleDecorator(
                new LineColorDecorator(
                        new FillColorDecorator(
                            new Circle(),
                            Color.BLUE
                        ),
                        Color.RED
                ),
                LineStyle.DOT
        );

        System.out.println("\nDescription of the decorated shape");
        System.out.println(decoratedRectangle.description());
        System.out.println(decoratedCircle.description());
    }

}
