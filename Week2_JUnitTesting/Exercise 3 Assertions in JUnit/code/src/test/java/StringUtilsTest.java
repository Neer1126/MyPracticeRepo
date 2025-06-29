import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testIsPalindrome_True() {
        StringUtils util = new StringUtils();
        assertTrue(util.isPalindrome("Madam"));
    }

    @Test
    public void testIsPalindrome_False() {
        StringUtils util = new StringUtils();
        assertFalse(util.isPalindrome("Hello"));
    }

    @Test
    public void testToUpper() {
        StringUtils util = new StringUtils();
        assertEquals("HELLO", util.toUpper("hello"));
    }

    @Test
    public void testToUpper_Null() {
        StringUtils util = new StringUtils();
        assertNull(util.toUpper(null));
    }
}
