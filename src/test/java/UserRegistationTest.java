import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistationTest {
    public String email;
    public boolean status;

    public UserRegistationTest(String email , boolean status) {
        this.email = email;
        this.status = status;
    }
    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{"abc.xyz@bridgelabz.co.in", true},
                {"abc@yahoo.com", true}, {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true}, {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true}, {"abc@1.com", true},
                {"abc@gmail.com.com", true}, {"abc+100@gmail.com", true},
                {"abc", false}, {"abc@.com.my",false}, {"abc123@gmail.a",false},
                {"abc123@.com",false}, {"abc123@.com.com",false}, {".abc@abc.com",false},
                {"abc()*@gmail.com",false}, {"abc@%*.com",false}, {"abc..2002@gmail.com",false},
                {"abc.@gmail.com",false}, {"abc@abc@gmail.com",false}, {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false}});
    }
    @Test
    public void checkEmailValid() {
        try{
            UserRegistation.validateEmail(email);
        }   catch (UserRegistrationInvalidException ex){
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        UserRegistation userRegistation = new UserRegistation();
            boolean result = userRegistation.validateFirstName("Durga");
            Assert.assertEquals(true, result);catch (UserRegistrationInvalidException ex)
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());

    }
    @Test
    public void givenFirstName_whenNotProper_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
            boolean result = userRegistation.validateFirstName("durga");
            Assert.assertEquals(false, result);
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
    }
    @Test
    public void givenFirstName_whenShort_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
            boolean result = userRegistation.validateFirstName("Du");
            Assert.assertEquals(false, result);
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());

    }
    @Test
    public void givenLastName_whenProper_shouldReturnTrue() {
        UserRegistation userRegistation = new UserRegistation();
            boolean result = userRegistation.validateLastName("Prasath");
            Assert.assertEquals(true, result);
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
    }
    @Test
    public void givenLastName_whenNotProper_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
            boolean result = userRegistation.validateLastName("prasath");
            Assert.assertEquals(false, result);
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
    }
    @Test
    public void givenLastName_whenShort_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
            boolean result = userRegistation.validateLastName("pr");
            Assert.assertEquals(false, result);
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
    }
    @Test
    public void givenPhoneNumber_whenProper_shouldReturnTrue() {
        UserRegistation userRegistation = new UserRegistation();
            boolean result = userRegistation.validatePhoneNumber("91 9919819801");
            Assert.assertEquals(true, result);
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
    }
    @Test
    public void givenPhoneNumber_whenNotProper_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
            boolean result = userRegistation.validatePhoneNumber("91 99198 19801");
            Assert.assertEquals(false, result);
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
    }
    @Test
    public void givenPassWord_whenProper_shouldReturnTrue() {
        UserRegistation userRegistation = new UserRegistation();
            boolean result = userRegistation.validatePassWord("aA12345@!");
            Assert.assertEquals(true, result);
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
    }
    @Test
    public void givenPassWord_whenNotProper_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
            boolean result = userRegistation.validatePassWord("AAA12345@");
            Assert.assertEquals(false, result);
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
    }
    @Test
    public void testMoodAnalysis_whenSad_shouldReturnSad() {
        UserRegistation moodAnalyser = new UserRegistation();
        String mood = moodAnalyser.analyserMoodSad("This is a sad message");
        Assert.assertEquals("sad", mood);
    }
    @Test
    public void testMoodAnalysis_whenHappy_shouldReturnHappy() {
        UserRegistation moodAnalyser = new UserRegistation();
        String mood = moodAnalyser.analyserMoodHappy("This is a Happy message");
        Assert.assertEquals("Happy", mood);
    }
}
