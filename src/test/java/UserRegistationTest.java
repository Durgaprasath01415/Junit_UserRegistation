import org.junit.Assert;
import org.junit.Test;

public class UserRegistationTest {
    UserRegistation userRegistation = new UserRegistation();
    UserRegistation moodAnalyser = new UserRegistation();

    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() throws UserRegistrationInvalidException {
        boolean result = userRegistation.validateFirstName.validate("Durga");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenFirstName_whenEmpty_shouldReturnFalse() throws UserRegistrationInvalidException {
        try{
        boolean result = userRegistation.validateFirstName.validate(" ");
        Assert.assertEquals(false, result);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals("Invalid empty First name", ex.getClass());
        }
    }
    @Test
    public void givenFirstName_whenNotProper_shouldReturnFalse() throws UserRegistrationInvalidException {
        try{
            boolean result = userRegistation.validateFirstName.validate("durga");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void givenFirstName_whenShort_shouldReturnFalse() throws UserRegistrationInvalidException {
        try{
            boolean result = userRegistation.validateFirstName.validate("dur");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void givenLastName_whenProper_shouldReturnTrue() throws UserRegistrationInvalidException {
        boolean result = userRegistation.validateLastName.validate("Prasath");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastName_whenEmpty_shouldReturnFalse() throws UserRegistrationInvalidException {
        try{
            boolean result = userRegistation.validateLastName.validate(" ");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals("Invalid Empty Last name", ex.getClass());
        }
    }
    @Test
    public void givenLastName_whenNotProper_shouldReturnFalse() throws UserRegistrationInvalidException {
        try{
            boolean result = userRegistation.validateLastName.validate("prasath");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void givenLastName_whenShort_shouldReturnFalse() throws UserRegistrationInvalidException {
        try{
            boolean result = userRegistation.validateLastName.validate("pra");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void givenPhoneNumber_whenProper_shouldReturnTrue() throws UserRegistrationInvalidException {
        boolean result = userRegistation.validatePhoneNumber.validate("91 9919819801");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPhoneNumber_whenEmpty_shouldReturnFalse() throws UserRegistrationInvalidException {
        try{
            boolean result = userRegistation.validatePhoneNumber.validate(" ");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals("Invalid empty Phone Number", ex.getClass());
        }
    }
    @Test
    public void givenPhoneNumber_whenNotProper_shouldReturnFalse() {
        try{
            boolean result = userRegistation.validatePhoneNumber.validate("91 99198 19801");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void givenPassWord_whenProper_shouldReturnTrue() {
        boolean result = userRegistation.validatePassWord.validate("aA12345@!");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassWord_whenEmpty_shouldReturnFalse() throws UserRegistrationInvalidException {
        try{
            boolean result = userRegistation.validatePassWord.validate(" ");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals("Invalid empty Password", ex.getClass());
        }
    }
    @Test
    public void givenPassWord_whenNotProper_shouldReturnFalse() {
        try{
            boolean result = userRegistation.validatePassWord.validate("AAA12345@");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void testMoodAnalysis_whenSad_shouldReturnSad() {
        try{
            boolean mood = moodAnalyser.analyserMoodSad("This is a sad message");
            Assert.assertEquals(true, mood);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void testMoodAnalysis_whenHappy_shouldReturnHappy() {
        try{
            boolean mood = moodAnalyser.analyserMoodHappy("This is a Happy message");
            Assert.assertEquals(true, mood);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
}