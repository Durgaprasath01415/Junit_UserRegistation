import org.junit.Assert;
import org.junit.Test;

public class UserRegistationTest {
    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        UserRegistation userRegistation = new UserRegistation();
        boolean result = userRegistation.validateFirstName("Durga");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenFirstName_whenNotProper_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
        boolean result = userRegistation.validateFirstName("durga");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenFirstName_whenShort_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
        boolean result = userRegistation.validateFirstName("Du");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_whenProper_shouldReturnTrue() {
        UserRegistation userRegistation = new UserRegistation();
        boolean result = userRegistation.validateLastName("Prasath");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastName_whenNotProper_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
        boolean result = userRegistation.validateLastName("prasath");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_whenShort_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
        boolean result = userRegistation.validateLastName("pr");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail_whenProper_shouldReturnTrue() {
        UserRegistation userRegistation = new UserRegistation();
        boolean result = userRegistation.validateEmail("abc.xyz@bl.co.in");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmail_whenNotProper_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
        boolean result = userRegistation.validateEmail("abc.xyz@bl.com.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPhoneNumber_whenProper_shouldReturnTrue() {
        UserRegistation userRegistation = new UserRegistation();
        boolean result = userRegistation.validatePhoneNumber("91 9919819801");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPhoneNumber_whenNotProper_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
        boolean result = userRegistation.validatePhoneNumber("91 99198 19801");
        Assert.assertEquals(false, result);
    }

}
