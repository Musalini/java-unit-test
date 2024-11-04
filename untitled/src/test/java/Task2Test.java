import org.junit.Assert;
import org.junit.Test;

public class Task2Test {

    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        Assert.assertTrue("Должно вернуться true, так как пользователь совершеннолетний", isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(15);
        Assert.assertFalse("Должно вернуться true, так как пользователь совершеннолетний", isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        Assert.assertTrue("Должно вернуться true, так как пользователь совершеннолетний", isAdult);
    }
}
