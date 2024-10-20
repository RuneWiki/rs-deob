package deob;

@ObfuscatedName("lq")
public class class337 {

    public class337() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.o(DDII)[D")
    public static double[] method3200(double arg0, double arg1, int arg2) {
        int var5 = arg2 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg2;
        int var8 = 0;
        while (var7 <= arg2) {
            double var11 = Statics.method5108(((double) var7 - arg0) / arg1) / arg1;
            var6[var8] = var11;
            var7++;
            var8++;
        }
        return var6;
    }
}
