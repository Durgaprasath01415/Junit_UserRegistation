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

}
