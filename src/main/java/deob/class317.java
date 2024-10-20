package deob;

@ObfuscatedName("lc")
public class class317 {

    public class317() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cu.f(D)D")
    public static double method1826(double arg0) {
        return Math.exp(-arg0 * arg0 / 2.0D) / Math.sqrt(6.283185307179586D);
    }

    @ObfuscatedName("by.l(DDD)D")
    public static double method1741(double arg0, double arg1, double arg2) {
        return method1826((arg0 - arg1) / arg2) / arg2;
    }

    @ObfuscatedName("eh.w(DDII)[D")
    public static double[] method3040(double arg0, double arg1, int arg2) {
        int var5 = arg2 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg2;
        int var8 = 0;
        while (var7 <= arg2) {
            var6[var8] = method1741((double) var7, arg0, arg1);
            var7++;
            var8++;
        }
        return var6;
    }
}
