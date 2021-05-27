import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistation<$> {
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
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2})([.][a-zA-Z]{2})*$";
    public boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
    private static final String PHONENUMBER_PATTERN = "^[91]{2}+[ ]+[0-9]{10}$";
    public boolean validatePhoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile(PHONENUMBER_PATTERN);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.find();
    }
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[*.!@#$%^&(){}:'<>,/~`_+=|].){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";
    public boolean validatePassWord(String passWord){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(passWord);
        return matcher.find();
    }
}
