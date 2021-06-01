import org.junit.Assert;
import org.junit.Test;

public class UserRegistationTest {
    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        UserRegistation userRegistation = new UserRegistation();
        try{
            boolean result = userRegistation.validateFirstName("Durga");
            Assert.assertEquals(true, result);
        }   catch (UserRegistrationInvalidException ex){
        }
    }
    @Test
    public void givenFirstName_whenNotProper_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
        try{
            boolean result = userRegistation.validateFirstName("durga");
            Assert.assertEquals(false, result);
        }   catch (UserRegistrationInvalidException ex){
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void givenFirstName_whenShort_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
        try{
            boolean result = userRegistation.validateFirstName("Du");
            Assert.assertEquals(false, result);
        }   catch (UserRegistrationInvalidException ex){
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void givenLastName_whenProper_shouldReturnTrue() {
        UserRegistation userRegistation = new UserRegistation();
        try{
            boolean result = userRegistation.validateLastName("Prasath");
            Assert.assertEquals(true, result);
        }   catch (UserRegistrationInvalidException ex){
        }
    }
    @Test
    public void givenLastName_whenNotProper_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
        try{
            boolean result = userRegistation.validateLastName("prasath");
            Assert.assertEquals(false, result);
        }   catch (UserRegistrationInvalidException ex){
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void givenLastName_whenShort_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
        try{
            boolean result = userRegistation.validateLastName("pr");
            Assert.assertEquals(false, result);
        }   catch (UserRegistrationInvalidException ex){
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void givenPhoneNumber_whenProper_shouldReturnTrue() {
        UserRegistation userRegistation = new UserRegistation();
        try {
            boolean result = userRegistation.validatePhoneNumber("91 9919819801");
            Assert.assertEquals(true, result);
        }   catch (UserRegistrationInvalidException ex){
        }
    }
    @Test
    public void givenPhoneNumber_whenNotProper_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
        try{
            boolean result = userRegistation.validatePhoneNumber("91 99198 19801");
            Assert.assertEquals(false, result);
        }   catch (UserRegistrationInvalidException ex){
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void givenPassWord_whenProper_shouldReturnTrue() {
        UserRegistation userRegistation = new UserRegistation();
        try{
            boolean result = userRegistation.validatePassWord("aA12345@!");
            Assert.assertEquals(true, result);
        }   catch (UserRegistrationInvalidException ex){
        }
    }
    @Test
    public void givenPassWord_whenNotProper_shouldReturnfalse() {
        UserRegistation userRegistation = new UserRegistation();
        try {
            boolean result = userRegistation.validatePassWord("AAA12345@");
            Assert.assertEquals(false, result);
        }   catch (UserRegistrationInvalidException ex){
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
    @Test
    public void testMoodAnalysis_whenSad_shouldReturnSad() {
        UserRegistation moodAnalyser = new UserRegistation();
        boolean mood = moodAnalyser.analyserMoodSad("This is a sad message");
        Assert.assertEquals(true, mood);
    }
    @Test
    public void testMoodAnalysis_whenHappy_shouldReturnHappy() {
        UserRegistation moodAnalyser = new UserRegistation();
        boolean mood = moodAnalyser.analyserMoodHappy("This is a Happy message");
        Assert.assertEquals(true, mood);
    }
}