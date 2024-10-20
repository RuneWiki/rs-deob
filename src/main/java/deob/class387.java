package deob;

@ObfuscatedName("nz")
public class class387 {

    public class387() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.c(D)D")
    public static double method638(double arg0) {
        return Math.exp(-arg0 * arg0 / 2.0D) / Math.sqrt(6.283185307179586D);
    }

    @ObfuscatedName("hc.p(DDD)D")
    public static double method4269(double arg0, double arg1, double arg2) {
        return method638((arg0 - arg1) / arg2) / arg2;
    }

    @ObfuscatedName("ct.f(DDII)[D")
    public static double[] method2164(double arg0, double arg1, int arg2) {
        int var5 = arg2 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg2;
        int var8 = 0;
        while (var7 <= arg2) {
            var6[var8] = method4269((double) var7, arg0, arg1);
            var7++;
            var8++;
        }
        return var6;
    }
}
