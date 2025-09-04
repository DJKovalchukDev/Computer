public class Keyboard {
    public final String typeOfKeyboard;
    public final boolean illuminationOfKeyboard;
    public final int weightOfKeyboard;

    public Keyboard(String typeOfKeyboard, boolean illuminationOfKeyboard, int weightOfKeyboard) {
        this.typeOfKeyboard = typeOfKeyboard;
        this.illuminationOfKeyboard = illuminationOfKeyboard;
        this.weightOfKeyboard = weightOfKeyboard;
    }

    public String getTypeOfKeyboard() {
        return typeOfKeyboard;
    }

    public boolean isIlluminationOfKeyboard() {
        return illuminationOfKeyboard;
    }

    public int getWeightOfKeyboard() {
        return weightOfKeyboard;
    }

    public String toString() {
        return "\nKeyboard: " +
                "Type - " + getTypeOfKeyboard() + ", " +
                "isIlluminated - " + isIlluminationOfKeyboard() + ", " +
                "Weight - " + getWeightOfKeyboard();
    }
}
