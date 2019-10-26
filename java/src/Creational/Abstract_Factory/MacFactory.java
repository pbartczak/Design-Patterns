package Creational.Abstract_Factory;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Label createLabel() {
        return new MacLabel();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
