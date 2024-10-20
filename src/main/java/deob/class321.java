package deob;

@ObfuscatedName("lk")
public class class321 {

    public class321() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jj.q(D)D")
    public static double method4606(double arg0) {
        return Math.exp(-arg0 * arg0 / 2.0D) / Math.sqrt(6.283185307179586D);
    }

    @ObfuscatedName("jj.w(DDII)[D")
    public static double[] method4607(double arg0, double arg1, int arg2) {
        int var5 = arg2 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg2;
        int var8 = 0;
        while (var7 <= arg2) {
            double var11 = method4606(((double) var7 - arg0) / arg1) / arg1;
            var6[var8] = var11;
            var7++;
            var8++;
        }
        return var6;
    }
}
