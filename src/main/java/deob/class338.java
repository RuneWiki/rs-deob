package deob;

@ObfuscatedName("ld")
public class class338 {

    public class338() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.v(D)D")
    public static double method521(double arg0) {
        return Math.exp(-arg0 * arg0 / 2.0D) / Math.sqrt(6.283185307179586D);
    }

    @ObfuscatedName("c.n(DDD)D")
    public static double method145(double arg0, double arg1, double arg2) {
        return method521((arg0 - arg1) / arg2) / arg2;
    }
}
