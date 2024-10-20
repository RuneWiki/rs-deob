package deob;

@ObfuscatedName("lo")
public class class325 {

    public class325() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.d(D)D")
    public static double method48(double arg0) {
        return Math.exp(-arg0 * arg0 / 2.0D) / Math.sqrt(6.283185307179586D);
    }

    @ObfuscatedName("bm.z(DDII)[D")
    public static double[] method909(double arg0, double arg1, int arg2) {
        int var5 = arg2 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg2;
        int var8 = 0;
        while (var7 <= arg2) {
            double var11 = method48(((double) var7 - arg0) / arg1) / arg1;
            var6[var8] = var11;
            var7++;
            var8++;
        }
        return var6;
    }
}
