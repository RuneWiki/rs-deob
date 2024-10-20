package deob;

@ObfuscatedName("lw")
public class class317 {

    public class317() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.y(DDIB)[D")
    public static double[] method618(double arg0, double arg1, int arg2) {
        int var5 = arg2 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg2;
        int var8 = 0;
        while (var7 <= arg2) {
            double var11 = ((double) var7 - arg0) / arg1;
            double var13 = Math.exp(-var11 * var11 / 2.0D) / Math.sqrt(6.283185307179586D);
            double var15 = var13 / arg1;
            var6[var8] = var15;
            var7++;
            var8++;
        }
        return var6;
    }
}
