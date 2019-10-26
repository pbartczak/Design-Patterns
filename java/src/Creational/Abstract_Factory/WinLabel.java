package Creational.Abstract_Factory;

public class WinLabel implements Label {
    @Override
    public void print() {
        System.out.println("Windows messages has been printed.");
    }
}
