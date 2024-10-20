package deob;

@ObfuscatedName("qz")
public class class422 {

    public class422() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.ab(D)D")
    public static double method2229(double arg0) {
        return Math.exp(-arg0 * arg0 / 2.0D) / Math.sqrt(6.283185307179586D);
    }

    @ObfuscatedName("me.ay(DDD)D")
    public static double method5625(double arg0, double arg1, double arg2) {
        return method2229((arg0 - arg1) / arg2) / arg2;
    }

    @ObfuscatedName("cl.an(DDIS)[D")
    public static double[] method1033(double arg0, double arg1, int arg2) {
        int var5 = arg2 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg2;
        int var8 = 0;
        while (var7 <= arg2) {
            var6[var8] = method5625((double) var7, arg0, arg1);
            var7++;
            var8++;
        }
        return var6;
    }
}
