package abstractFactoryPattern.bad;

public class Main {
    public static void main(String[] args) {
        String os="WINDOWS";
        Button button;
        Scrollbar scroll;
        if(os.equals("WINDOWS")){
            button=new WindowButton();
            scroll=new WindowsScrollbar();
        }else{
            button=new MacButton();
            scroll=new MacScrollbar();
        }
        button.click();
        scroll.scroll();
    }
}
