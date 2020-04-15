package ValidateClass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_EXAMPLE = "^[CAP][0-9]{4}[GHIKLM]$";

    public ValidateClass() {
        pattern = Pattern.compile(CLASS_EXAMPLE);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        if (matcher.find()){
            System.out.println("OK");
        }else {
            System.out.println("DON'T FIND");
        }
        return matcher.matches();
    }
}
