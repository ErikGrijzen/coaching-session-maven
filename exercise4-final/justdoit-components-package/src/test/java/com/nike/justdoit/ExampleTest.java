import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void testConcatenate() {
        Example example = new Example();

        String result = example.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}