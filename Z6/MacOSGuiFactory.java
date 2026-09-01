package practice_15.Z6;

public class MacOSGuiFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }

    @Override
    public Menu createMenu() {
        return new MacOSMenu();
    }
}
