package strategy.context;

import strategy.strategy.TextFormatter;

public class Document {
    private TextFormatter formatter;
    public void setFormatter(TextFormatter formatter){
        this.formatter=formatter;
    }
    public String format(String text) {
        return formatter.format(text);
    }
}
