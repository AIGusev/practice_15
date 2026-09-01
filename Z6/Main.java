package practice_15.Z6;

public class Main {
    static void main(String[] args) {

        GuiFactory guiFactory = new WindowsGuiFactory();
        GuiFactory guiFactory1 = new MacOSGuiFactory();

        guiFactory.createButton().click();
        guiFactory.createWindow().open();
        guiFactory.createMenu().show();
        System.out.println();
        guiFactory1.createButton().click();
        guiFactory1.createWindow().open();
        guiFactory1.createMenu().show();
    }
}
