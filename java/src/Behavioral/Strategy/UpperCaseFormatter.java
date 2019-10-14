package Behavioral.Strategy;

public class UpperCaseFormatter implements TextFormatterStrategy {
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
