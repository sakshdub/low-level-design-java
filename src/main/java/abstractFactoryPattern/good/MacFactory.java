package abstractFactoryPattern.good;

public class MacFactory implements GUIFactory{
    public Button createButton(){
        return new MacButton();
    }
    public Scrollbar createScrollbar(){
        return new MacScrollbar();
    }
}
