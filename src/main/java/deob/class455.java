package deob;

@ObfuscatedName("ry")
public class class455 {

    @ObfuscatedName("ry.at")
    public static int[] field4746 = new int[32768];

    @ObfuscatedName("ry.an")
    public static int[] field4745;

    static {
        for (int var0 = 0; var0 < 32768; var0++) {
            int[] var1 = field4746;
            double var3 = (double) (var0 >> 10 & 0x1F) / 31.0D;
            double var5 = (double) (var0 >> 5 & 0x1F) / 31.0D;
            double var7 = (double) (var0 & 0x1F) / 31.0D;
            double var9 = var3;
            if (var5 < var3) {
                var9 = var5;
            }
            if (var7 < var9) {
                var9 = var7;
            }
            double var11 = var3;
            if (var5 > var3) {
                var11 = var5;
            }
            if (var7 > var11) {
                var11 = var7;
            }
            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = (var9 + var11) / 2.0D;
            if (var9 != var11) {
                if (var17 < 0.5D) {
                    var15 = (var11 - var9) / (var9 + var11);
                }
                if (var17 >= 0.5D) {
                    var15 = (var11 - var9) / (2.0D - var11 - var9);
                }
                if (var3 == var11) {
                    var13 = (var5 - var7) / (var11 - var9);
                } else if (var5 == var11) {
                    var13 = (var7 - var3) / (var11 - var9) + 2.0D;
                } else if (var7 == var11) {
                    var13 = (var3 - var5) / (var11 - var9) + 4.0D;
                }
            }
            int var19 = (int) (var13 * 256.0D / 6.0D);
            int var20 = var19 & 0xFF;
            double var21 = var15 * 256.0D;
            if (var21 < 0.0D) {
                var21 = 0.0D;
            } else if (var21 > 255.0D) {
                var21 = 255.0D;
            }
            if (var17 > 0.7D) {
                double var23 = var21 / 2.0D;
                var21 = Math.floor(var23);
            }
            if (var17 > 0.75D) {
                double var25 = var21 / 2.0D;
                var21 = Math.floor(var25);
            }
            if (var17 > 0.85D) {
                double var27 = var21 / 2.0D;
                var21 = Math.floor(var27);
            }
            if (var17 > 0.95D) {
                double var29 = var21 / 2.0D;
                var21 = Math.floor(var29);
            }
            if (var17 > 0.995D) {
                var17 = 0.995D;
            }
            int var31 = (int) (var21 / 32.0D + (double) (var20 / 4 * 8));
            int var32 = (var31 << 7) + (int) (var17 * 128.0D);
            var1[var0] = var32;
        }
        if (field4745 == null) {
            field4745 = new int[65536];
            double var33 = 0.949999988079071D;
            for (int var35 = 0; var35 < 65536; var35++) {
                double var36 = (double) (var35 >> 10 & 0x3F) / 64.0D + 0.0078125D;
                double var38 = (double) (var35 >> 7 & 0x7) / 8.0D + 0.0625D;
                double var40 = (double) (var35 & 0x7F) / 128.0D;
                double var42 = var40;
                double var44 = var40;
                double var46 = var40;
                if (var38 != 0.0D) {
                    double var48;
                    if (var40 < 0.5D) {
                        var48 = (var38 + 1.0D) * var40;
                    } else {
                        var48 = var38 + var40 - var38 * var40;
                    }
                    double var50 = var40 * 2.0D - var48;
                    double var52 = var36 + 0.3333333333333333D;
                    if (var52 > 1.0D) {
                        var52--;
                    }
                    double var56 = var36 - 0.3333333333333333D;
                    if (var56 < 0.0D) {
                        var56++;
                    }
                    if (var52 * 6.0D < 1.0D) {
                        var42 = (var48 - var50) * 6.0D * var52 + var50;
                    } else if (var52 * 2.0D < 1.0D) {
                        var42 = var48;
                    } else if (var52 * 3.0D < 2.0D) {
                        var42 = (var48 - var50) * (0.6666666666666666D - var52) * 6.0D + var50;
                    } else {
                        var42 = var50;
                    }
                    if (var36 * 6.0D < 1.0D) {
                        var44 = (var48 - var50) * 6.0D * var36 + var50;
                    } else if (var36 * 2.0D < 1.0D) {
                        var44 = var48;
                    } else if (var36 * 3.0D < 2.0D) {
                        var44 = (var48 - var50) * (0.6666666666666666D - var36) * 6.0D + var50;
                    } else {
                        var44 = var50;
                    }
                    if (var56 * 6.0D < 1.0D) {
                        var46 = (var48 - var50) * 6.0D * var56 + var50;
                    } else if (var56 * 2.0D < 1.0D) {
                        var46 = var48;
                    } else if (var56 * 3.0D < 2.0D) {
                        var46 = (var48 - var50) * (0.6666666666666666D - var56) * 6.0D + var50;
                    } else {
                        var46 = var50;
                    }
                }
                double var58 = Math.pow(var42, var33);
                double var60 = Math.pow(var44, var33);
                double var62 = Math.pow(var46, var33);
                int var64 = (int) (var58 * 256.0D);
                int var65 = (int) (var60 * 256.0D);
                int var66 = (int) (var62 * 256.0D);
                int var67 = (var64 << 16) + (var65 << 8) + var66;
                field4745[var35] = var67 & 0xFFFFFF;
            }
        }
    }

    public class455() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ou.at(II)I")
    public static int method6566(int arg0) {
        return 255 - (arg0 & 0xFF);
    }
}
