package Creational.Abstract_Factory;

public interface GUIFactory {
    public Button createButton();
    public Label createLabel();
    public Checkbox createCheckbox();
}
