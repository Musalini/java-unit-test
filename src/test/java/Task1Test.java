import org.junit.Assert;
import org.junit.Test;
import src.main.java.Program;

public class Task1Test {
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean expected = true;
        boolean isAdult = program.checkIsAdult(19);
        Assert.assertEquals("Комментарий на случай провала теста", expected, isAdult);// Напиши код здесь
    }
}

