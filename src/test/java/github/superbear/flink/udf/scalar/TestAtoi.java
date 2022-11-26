package github.superbear.flink.udf.scalar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class TestAtoi {

    protected void runTest(String value, Long exp) {
        Atoi udf = new Atoi();
        Long result = udf.eval(value);

        if (null == exp) {
            assertNull(result);
        } else {
            assertNotNull(result);
            assertEquals(exp, result);
        }
    }

    @Test
    public void testAtoi() {
        runTest(new String(""), null);
        runTest(new String("-2"), -2L);
        runTest(new String("0"), 0L);
        runTest(new String("123"), 123L);
        runTest(new String("3.14"), null);
        runTest(new String("1_2_3_4_5"), null);
    }
}
