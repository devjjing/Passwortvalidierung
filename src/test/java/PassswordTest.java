import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassswordTest {
    @Test
    public void passwordTest_whenLenghtUnder8_thenReturn1(){

        //GIVEN
        String password = "Short23";

        //WHEN
        String actual = Password.countLenght(password);

        //THEN
        assertEquals(7, actual);
    }
    @Test
    public void passwordTest_whenNoNumber_thenReturn1(){

        //GIVEN
        String password = "Short23";

        //WHEN
        String actual = Password.checkNumber(password);

        //THEN
        assertEquals(2, actual);
    }
    @Test
    public void passwordTest_whenNoOtherCase_thenReturn1(){

        //GIVEN
        String password = "lowercase5527";

        //WHEN
        String actual = Password.checkCase(password);

        //THEN
        assertEquals(0, actual);
    }
    @Test
    public void passwordTest_whenCommonPassword_thenReturn1(){

        //GIVEN
        String password = "Peter1995";

        //WHEN
        String actual = Password.commonPass(password);

        //THEN
        assertEquals(1, actual);
    }


}
