import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {

    @Test
    public void passwordTest_whenLengthIsEightOrAbove_thenReturnTrue() {

        //GIVEN
        String password = "12345678";

        //WHEN
        boolean actual = Password.countLength(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void passwordTest_whenLengthIsUnderEight_thenReturnTrue() {

        //GIVEN
        String password = "1234567";

        //WHEN
        boolean actual = Password.countLength(password);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void passwordTest_whenNumber_thenReturnTrue() {

        //GIVEN
        String password = "Short10";

        //WHEN
        boolean actual = Password.checkNumber(password);

        //THEN
        assertTrue(actual);
    }
    @Test
    public void passwordTest_whenNoNumber_thenReturnTrue() {

        //GIVEN
        String password = "Short";

        //WHEN
        boolean actual = Password.checkNumber(password);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void passwordTest_whenOnlyUpperCase_thenReturnTrue() {

        //GIVEN
        String password = "UPPERCASE5527";

        //WHEN
        boolean actual = Password.caseCheck(password);

        //THEN
        assertFalse(actual);
    }
    @Test
    public void passwordTest_whenOnlyLowerCase_thenReturnTrue() {

        //GIVEN
        String password = "lowercase5527";

        //WHEN
        boolean actual = Password.caseCheck(password);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void passwordTest_whenHasOtherCase_thenReturnTrue() {

        //GIVEN
        String password = "lowerUPPER";

        //WHEN
        boolean actual = Password.caseCheck(password);

        //THEN
        assertTrue(actual);
    }
}
    /*
    @Test
    public void passwordTest_whenCommonPassword_thenReturn1(){

        //GIVEN
        String password = "Peter1995";

        //WHEN
        // String actual = Password.commonPass(password);

        //THEN
        //assertEquals(1, actual);
    }
    @Test
    public void passwordTest_whenUncommonPassword_thenReturn1(){

        //GIVEN
        String password = "X@7F2%8AZH>zbNVu";

        //WHEN
        // String actual = Password.commonPass(password);

        //THEN
        //assertEquals(1, actual);
    }


}*/
