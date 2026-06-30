package abstractFactoryPattern.good;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory=new MacFactory();
        Button button=factory.createButton();
        Scrollbar scrollbar=factory.createScrollbar();
        button.click();
        scrollbar.scroll();
    }
}
