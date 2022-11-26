package github.superbear.flink.udf.scalar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class TestToUpper
{
    protected void runTest(String value, String exp) {
        ToUpper udf = new ToUpper();
        String result = udf.eval(value);

        if (null == exp) {
            assertNull(result);
        } else {
            assertNotNull(result);
            assertEquals(exp, result);
        }
    }

    @Test
    public void testToUpper() {
        runTest(new String(""), new String(""));
        runTest(new String("hello world"), new String("HELLO WORLD"));
    }
}
