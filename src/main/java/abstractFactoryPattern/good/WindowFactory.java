package abstractFactoryPattern.good;

public class WindowFactory implements GUIFactory {
    public Button createButton() {
        return new WindowButton();
    }

    public Scrollbar createScrollbar() {
        return new WindowScrollbar();
    }
}
