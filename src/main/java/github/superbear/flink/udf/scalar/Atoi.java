package github.superbear.flink.udf.scalar;

import org.apache.flink.table.functions.ScalarFunction;

import go.Client;

public final class Atoi extends ScalarFunction {
    /**
     * String to int
     */
    public Long eval(String s) {
        return Client.Atoi(s);
    }
}
