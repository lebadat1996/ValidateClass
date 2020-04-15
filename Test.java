package ValidateClass;

public class Test {
    public static final String validateEX = "C2022G";
    public static final String validateEX2 = "c222o";

    public static void main(String[] args) {
        ValidateClass validateClass = new ValidateClass();
        validateClass.validate(validateEX);
        validateClass.validate(validateEX2);
    }
}
