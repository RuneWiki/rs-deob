package deob;

@ObfuscatedName("kx")
public class class286 {

    public class286() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("na.ak(DDD)I")
    public static final int method6453(double arg0, double arg1, double arg2) {
        double var6 = arg2;
        double var8 = arg2;
        double var10 = arg2;
        if (arg1 != 0.0D) {
            double var12;
            if (arg2 < 0.5D) {
                var12 = (arg1 + 1.0D) * arg2;
            } else {
                var12 = arg1 + arg2 - arg1 * arg2;
            }
            double var14 = arg2 * 2.0D - var12;
            double var16 = arg0 + 0.3333333333333333D;
            if (var16 > 1.0D) {
                var16--;
            }
            double var20 = arg0 - 0.3333333333333333D;
            if (var20 < 0.0D) {
                var20++;
            }
            if (var16 * 6.0D < 1.0D) {
                var6 = (var12 - var14) * 6.0D * var16 + var14;
            } else if (var16 * 2.0D < 1.0D) {
                var6 = var12;
            } else if (var16 * 3.0D < 2.0D) {
                var6 = (var12 - var14) * (0.6666666666666666D - var16) * 6.0D + var14;
            } else {
                var6 = var14;
            }
            if (arg0 * 6.0D < 1.0D) {
                var8 = (var12 - var14) * 6.0D * arg0 + var14;
            } else if (arg0 * 2.0D < 1.0D) {
                var8 = var12;
            } else if (arg0 * 3.0D < 2.0D) {
                var8 = (var12 - var14) * (0.6666666666666666D - arg0) * 6.0D + var14;
            } else {
                var8 = var14;
            }
            if (var20 * 6.0D < 1.0D) {
                var10 = (var12 - var14) * 6.0D * var20 + var14;
            } else if (var20 * 2.0D < 1.0D) {
                var10 = var12;
            } else if (var20 * 3.0D < 2.0D) {
                var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
            } else {
                var10 = var14;
            }
        }
        int var22 = (int) (var6 * 256.0D);
        int var23 = (int) (var8 * 256.0D);
        int var24 = (int) (var10 * 256.0D);
        return (var22 << 16) + (var23 << 8) + var24;
    }
}
