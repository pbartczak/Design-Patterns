package Behavioral.Strategy;

public class Main {
    private static final String TEXT = "Przykład wzorca Strategia.";

    public static void main(String[] args) {
        FormatterContext context = new FormatterContext();

        context.setStrategy(new CapitalizeFormatter());
        context.print(TEXT);

        context.setStrategy(new LowerCaseFormatter());
        context.print(TEXT);

        context.setStrategy(new UpperCaseFormatter());
        context.print(TEXT);
    }
}
