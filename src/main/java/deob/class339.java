package deob;

@ObfuscatedName("mj")
public class class339 {

    public class339() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hd.f(D)D")
    public static double method3948(double arg0) {
        return Math.exp(-arg0 * arg0 / 2.0D) / Math.sqrt(6.283185307179586D);
    }

    @ObfuscatedName("fl.e(DDD)D")
    public static double method2900(double arg0, double arg1, double arg2) {
        return method3948((arg0 - arg1) / arg2) / arg2;
    }

    @ObfuscatedName("fp.v(DDII)[D")
    public static double[] method3273(double arg0, double arg1, int arg2) {
        int var5 = arg2 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg2;
        int var8 = 0;
        while (var7 <= arg2) {
            var6[var8] = method2900((double) var7, arg0, arg1);
            var7++;
            var8++;
        }
        return var6;
    }
}
