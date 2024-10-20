package deob;

@ObfuscatedName("lq")
public class class321 {

    public class321() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.c(D)D")
    public static double method2572(double arg0) {
        return Math.exp(-arg0 * arg0 / 2.0D) / Math.sqrt(6.283185307179586D);
    }

    @ObfuscatedName("da.t(DDD)D")
    public static double method2797(double arg0, double arg1, double arg2) {
        return method2572((arg0 - arg1) / arg2) / arg2;
    }

    @ObfuscatedName("kv.o(DDIB)[D")
    public static double[] method5419(double arg0, double arg1, int arg2) {
        int var5 = arg2 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg2;
        int var8 = 0;
        while (var7 <= arg2) {
            var6[var8] = method2797((double) var7, arg0, arg1);
            var7++;
            var8++;
        }
        return var6;
    }
}
