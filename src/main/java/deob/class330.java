package deob;

@ObfuscatedName("lu")
public class class330 {

    public class330() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ja.z(DDD)D")
    public static double method4700(double arg0, double arg1, double arg2) {
        double var6 = (arg0 - arg1) / arg2;
        double var8 = Math.exp(-var6 * var6 / 2.0D) / Math.sqrt(6.283185307179586D);
        return var8 / arg2;
    }

    @ObfuscatedName("client.k(DDII)[D")
    public static double[] method1219(double arg0, double arg1, int arg2) {
        int var5 = arg2 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg2;
        int var8 = 0;
        while (var7 <= arg2) {
            var6[var8] = method4700((double) var7, arg0, arg1);
            var7++;
            var8++;
        }
        return var6;
    }
}
