import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistation {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{3,}";
    public boolean validateFirstName(String firstname){
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstname);
        return matcher.find();
    }
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{3,}";
    public boolean validateLastName(String lastname){
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastname);
        return matcher.find();
    }
}
