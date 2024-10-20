package deob;

@ObfuscatedName("ql")
public class class422 {

    public class422() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fd.af(D)D")
    public static double method3028(double arg0) {
        return Math.exp(-arg0 * arg0 / 2.0D) / Math.sqrt(6.283185307179586D);
    }

    @ObfuscatedName("ap.an(DDD)D")
    public static double method383(double arg0, double arg1, double arg2) {
        return method3028((arg0 - arg1) / arg2) / arg2;
    }
}
