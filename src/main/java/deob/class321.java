package deob;

@ObfuscatedName("la")
public class class321 {

    public class321() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.a(D)D")
    public static double method1961(double arg0) {
        return Math.exp(-arg0 * arg0 / 2.0D) / Math.sqrt(6.283185307179586D);
    }

    @ObfuscatedName("cx.s(DDD)D")
    public static double method1929(double arg0, double arg1, double arg2) {
        return method1961((arg0 - arg1) / arg2) / arg2;
    }
}
