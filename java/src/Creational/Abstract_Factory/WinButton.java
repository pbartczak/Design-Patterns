package Creational.Abstract_Factory;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows button has been pressed.");
    }
}
