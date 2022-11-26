package github.superbear.flink.udf.scalar;

import org.apache.flink.table.functions.ScalarFunction;

import go.Client;

public final class ToUpper extends ScalarFunction {
    /**
     * ToUpper returns s with all Unicode letters mapped to their upper case
     */
    public String eval(String s) {
        return Client.ToUpper(s);
    }
}
