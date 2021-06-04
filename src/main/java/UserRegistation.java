import java.util.regex.Pattern;

public class UserRegistation {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{3,}";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2})([.][a-zA-Z]{2})*$";
    private static final String PHONE_NUMBER_PATTERN = "^[91]{2}+[ ]+[0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[*.!@#$%^&(){}:'<>,/~`_+=|].){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";

    public UserRegistationFuncInt validateFirstName = ((firstName) -> Pattern.matches(NAME_PATTERN,firstName));
    public UserRegistationFuncInt validateLastName = ((lastName) -> Pattern.matches(NAME_PATTERN,lastName));
    public UserRegistationFuncInt validateEmailPattern = ((email) -> Pattern.matches(EMAIL_PATTERN,email));
    public UserRegistationFuncInt validatePhoneNumber = ((phoneNumber) -> Pattern.matches(PHONE_NUMBER_PATTERN,phoneNumber));
    public UserRegistationFuncInt validatePassWord = ((passWord) -> Pattern.matches(PASSWORD_PATTERN,passWord));

    public static boolean analyserMoodSad (String message) throws UserRegistrationInvalidException {
        message.contains("This is a sad message");
        return true;
    }
    public static boolean analyserMoodHappy (String message) throws UserRegistrationInvalidException {
        message.contains("This is a Happy message");
        return true;
    }

}