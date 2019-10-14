package Behavioral.Strategy;

public class LowerCaseFormatter implements TextFormatterStrategy {
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
