package strategy;

import strategy.context.Document;
import strategy.strategy.HtmlFormatter;
import strategy.strategy.MarkdownFormatter;
import strategy.strategy.PlainFormatter;

public class Main {
    public static void main(String[] args) {
        Document document=new Document();
        document.setFormatter(new HtmlFormatter());
        System.out.println(document.format("HELLo"));

        document.setFormatter(new PlainFormatter());
        System.out.println(document.format("HELLo"));

        document.setFormatter(new MarkdownFormatter());
        System.out.println(document.format("HELLo"));
    }
}
