import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {
    @Test
    public void passwordTest_whenLengthUnder8_thenReturn1() {

        //GIVEN
        String password = "Short23";

        //WHEN
        boolean actual = Password.countLength(password);

        //THEN
        assertEquals(false, actual);
    }

    @Test
    public void passwordTest_whenLengthAbove8_thenReturn0() {

        //GIVEN
        String password = "Short23239084203942";

        //WHEN
        boolean actual = Password.countLength(password);

        //THEN
        assertEquals(true, actual);
    }

    @Test
    public void passwordTest_whenLengthIsExactly8_thenReturn0() {

        //GIVEN
        String password = "12345678";

        //WHEN
        boolean actual = Password.countLength(password);

        //THEN
        assertEquals(true, actual);
    }

    @Test
    public void passwordTest_whenNumber_thenReturn0() {

        //GIVEN
        String password = "Short23";

        //WHEN
        boolean actual = Password.checkNumber(password);

        //THEN
        assertEquals(true, actual);
    }
    @Test
    public void passwordTest_whenNoNumber_thenReturn0() {

        //GIVEN
        String password = "Short";

        //WHEN
        boolean actual = Password.checkNumber(password);

        //THEN
        assertEquals(true, actual);
    }

    @Test
    public void passwordTest_whenOnlyUpperCase_thenReturn0() {

        //GIVEN
        String password = "UPPERCASE5527";

        //WHEN
        boolean actual = Password.checkCase(password);

        //THEN
        assertEquals(true, actual);
    }
    @Test
    public void passwordTest_whenOnlyLowerCase_thenReturn0() {

        //GIVEN
        String password = "lowercase5527";

        //WHEN
        boolean actual = Password.checkCase(password);

        //THEN
        assertEquals(true, actual);
    }

    @Test
    public void passwordTest_whenHasOtherCase_thenReturn0() {

        //GIVEN
        String password = "lowerUPPERcase";

        //WHEN
        boolean actual = Password.checkCase(password);

        //THEN
        assertEquals(true, actual);
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
