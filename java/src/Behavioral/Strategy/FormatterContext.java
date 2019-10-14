package Behavioral.Strategy;

public class FormatterContext {
    private TextFormatterStrategy strategy;

    public void setStrategy(TextFormatterStrategy strategy) {
        this.strategy = strategy;
    }

    public void print(String text) {
        System.out.println(strategy.format(text));
    }
}
