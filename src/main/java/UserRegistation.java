import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistation {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{3,}";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{3,}";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2})([.][a-zA-Z]{2})*$";
    private static final String PHONE_NUMBER_PATTERN = "^[91]{2}+[ ]+[0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[*.!@#$%^&(){}:'<>,/~`_+=|].){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";

    public static boolean validateFirstName(String firstname){
        return (patternChecker(FIRST_NAME_PATTERN,firstname));
    }

    public static boolean validateLastName(String lastname){
        return (patternChecker(LAST_NAME_PATTERN,lastname));
    }

    public static boolean validateEmail(String email){
        return (patternChecker(EMAIL_PATTERN,email));
    }

    public static boolean validatePhoneNumber(String phoneNumber){
        return (patternChecker(PHONE_NUMBER_PATTERN,phoneNumber));
    }

    public static boolean validatePassWord(String passWord){
        return (patternChecker(PASSWORD_PATTERN,passWord));
    }
    public static final String analyserMoodSad (String message)  {
        message.contains("This is a sad message");
        return "sad";
    }
    public static final String analyserMoodHappy (String message)  {
        message.contains("This is a Happy message");
        return "Happy";
    }
    public static boolean patternChecker(String inputPattern,String input ){
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

}