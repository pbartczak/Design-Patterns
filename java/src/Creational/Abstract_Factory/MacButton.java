package Creational.Abstract_Factory;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac button has been pressed.");
    }
}
