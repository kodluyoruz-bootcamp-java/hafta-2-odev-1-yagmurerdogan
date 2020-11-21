package phoneFactory.phones;

public class TouchScreenKeyboard implements KeyboardInterface {
    private String keyboardType = "Touch Screen Keyboard";
    @Override
    public String showKeyboardType() {
        return keyboardType;
    }
}
