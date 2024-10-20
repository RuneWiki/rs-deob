package deob;

@ObfuscatedName("lp")
public class class320 {

    public class320() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iy.c(D)D")
    public static double method4316(double arg0) {
        return Math.exp(-arg0 * arg0 / 2.0D) / Math.sqrt(6.283185307179586D);
    }

    @ObfuscatedName("bn.x(DDD)D")
    public static double method894(double arg0, double arg1, double arg2) {
        return method4316((arg0 - arg1) / arg2) / arg2;
    }
}
