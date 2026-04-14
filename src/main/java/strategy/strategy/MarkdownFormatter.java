package strategy.strategy;

public class MarkdownFormatter implements TextFormatter {

    @Override
    public String format(String text) {
        return "**" +text +"**";
    }
}
