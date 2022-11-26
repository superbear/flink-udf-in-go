package github.superbear.flink.udf.scalar;

import org.apache.flink.table.functions.ScalarFunction;

import go.Client;

public final class Atoi extends ScalarFunction {
    /**
     * String to int
     */
    public Long eval(String s) {
        System.setProperty("jna.debug_load", "true");
        System.setProperty("jna.debug_load.jna", "true");
        return Client.Atoi(s);
    }
}
