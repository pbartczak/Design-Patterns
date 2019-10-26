package Creational.Abstract_Factory;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Label createLabel() {
        return new WinLabel();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
