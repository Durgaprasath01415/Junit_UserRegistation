import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistation {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{3,}";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2})([.][a-zA-Z]{2})*$";
    private static final String PHONE_NUMBER_PATTERN = "^[91]{2}+[ ]+[0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[*.!@#$%^&(){}:'<>,/~`_+=|].){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";

    public static boolean validateFirstName(String firstname) throws UserRegistrationInvalidException {
        try{
            return (patternChecker(NAME_PATTERN,firstname));
        }catch (Exception ex){
            throw new UserRegistrationInvalidException("Invalid first name.Please enter proper name");
        }
    }
    public static boolean validateLastName(String lastname) throws UserRegistrationInvalidException {
        try{
            return (patternChecker(NAME_PATTERN,lastname));
        }catch (Exception ex){
            throw new UserRegistrationInvalidException("Invalid last name.Please enter proper name");
        }
    }
    public static boolean validateEmail(String email) throws UserRegistrationInvalidException {
        try{
            return (patternChecker(EMAIL_PATTERN,email));
        }catch (Exception ex){
            throw new UserRegistrationInvalidException("Invalid email.Please enter proper mail address");
        }
    }
    public static boolean validatePhoneNumber(String phoneNumber) throws UserRegistrationInvalidException {
        try{
            return (patternChecker(PHONE_NUMBER_PATTERN,phoneNumber));
        }catch (Exception ex){
            throw new UserRegistrationInvalidException("Invalid phone number.Please enter proper number");
        }
    }
    public static boolean validatePassWord(String passWord) throws UserRegistrationInvalidException {
        try{
            return (patternChecker(PASSWORD_PATTERN,passWord));
        }catch (Exception ex){
            throw new UserRegistrationInvalidException("Invalid password.Please enter valid password");
        }
    }
    public static boolean analyserMoodSad (String message) throws UserRegistrationInvalidException {
        message.contains("This is a sad message");
        return true;
    }
    public static boolean analyserMoodHappy (String message) throws UserRegistrationInvalidException {
        message.contains("This is a Happy message");
        return true;
    }
    public static boolean patternChecker(String inputPattern,String input ){
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}
