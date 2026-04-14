package strategy.strategy;

public class HtmlFormatter implements TextFormatter {

    @Override
    public String format(String text) {
        return "<html><body>" +text +"</body></html>";
    }
}
