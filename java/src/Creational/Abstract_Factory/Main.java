package Creational.Abstract_Factory;

public class Main {
    private static String OS_NAME = System.getProperty("os.name").toUpperCase();

    public static void main(String[] args) {
        GUIFactory factory;

        if (OS_NAME.contains("WINDOWS")) {
            factory = new WinFactory();
        } else if (OS_NAME.contains("MAC")){
            factory = new MacFactory();
        } else {
            return;
        }

        Button button = factory.createButton();
        Label label = factory.createLabel();
        Checkbox checkbox = factory.createCheckbox();

        button.click();
        label.print();
        checkbox.select();
    }
}
