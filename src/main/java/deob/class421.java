package deob;

@ObfuscatedName("qs")
public class class421 {

    public class421() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.aq(D)D")
    public static double method309(double arg0) {
        return Math.exp(-arg0 * arg0 / 2.0D) / Math.sqrt(6.283185307179586D);
    }

    @ObfuscatedName("jm.ad(DDD)D")
    public static double method4338(double arg0, double arg1, double arg2) {
        return method309((arg0 - arg1) / arg2) / arg2;
    }

    @ObfuscatedName("ep.ag(DDII)[D")
    public static double[] method2865(double arg0, double arg1, int arg2) {
        int var5 = arg2 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg2;
        int var8 = 0;
        while (var7 <= arg2) {
            var6[var8] = method4338((double) var7, arg0, arg1);
            var7++;
            var8++;
        }
        return var6;
    }
}
