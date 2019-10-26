package Creational.Abstract_Factory;

public class WinCheckbox implements Checkbox {
    @Override
    public void select() {
        System.out.println("Windows checkbox has been selected.");
    }
}
