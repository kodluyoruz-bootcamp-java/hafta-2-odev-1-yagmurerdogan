package phoneFactory.phones;

public class PushButtonKeyboard implements KeyboardInterface {
    private String keyboardType = "Push Button Keyboard";
    @Override
    public String showKeyboardType() {
        return keyboardType;
    }
}
