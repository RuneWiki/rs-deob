package deob;

@ObfuscatedName("qh")
public class class442 {

    @ObfuscatedName("qh.af")
    public static int[] field4731 = new int[32768];

    static {
        for (int var0 = 0; var0 < 32768; var0++) {
            int[] var1 = field4731;
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
        method2785();
    }

    public class442() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("el.af(I)V")
    public static void method2785() {
        if (Statics.field4730 != null) {
            return;
        }
        Statics.field4730 = new int[65536];
        double var0 = 0.949999988079071D;
        for (int var2 = 0; var2 < 65536; var2++) {
            double var3 = (double) (var2 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var5 = (double) (var2 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var7 = (double) (var2 & 0x7F) / 128.0D;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if (var5 != 0.0D) {
                double var15;
                if (var7 < 0.5D) {
                    var15 = (var5 + 1.0D) * var7;
                } else {
                    var15 = var5 + var7 - var5 * var7;
                }
                double var17 = var7 * 2.0D - var15;
                double var19 = var3 + 0.3333333333333333D;
                if (var19 > 1.0D) {
                    var19--;
                }
                double var23 = var3 - 0.3333333333333333D;
                if (var23 < 0.0D) {
                    var23++;
                }
                if (var19 * 6.0D < 1.0D) {
                    var9 = (var15 - var17) * 6.0D * var19 + var17;
                } else if (var19 * 2.0D < 1.0D) {
                    var9 = var15;
                } else if (var19 * 3.0D < 2.0D) {
                    var9 = (var15 - var17) * (0.6666666666666666D - var19) * 6.0D + var17;
                } else {
                    var9 = var17;
                }
                if (var3 * 6.0D < 1.0D) {
                    var11 = (var15 - var17) * 6.0D * var3 + var17;
                } else if (var3 * 2.0D < 1.0D) {
                    var11 = var15;
                } else if (var3 * 3.0D < 2.0D) {
                    var11 = (var15 - var17) * (0.6666666666666666D - var3) * 6.0D + var17;
                } else {
                    var11 = var17;
                }
                if (var23 * 6.0D < 1.0D) {
                    var13 = (var15 - var17) * 6.0D * var23 + var17;
                } else if (var23 * 2.0D < 1.0D) {
                    var13 = var15;
                } else if (var23 * 3.0D < 2.0D) {
                    var13 = (var15 - var17) * (0.6666666666666666D - var23) * 6.0D + var17;
                } else {
                    var13 = var17;
                }
            }
            double var25 = Math.pow(var9, var0);
            double var27 = Math.pow(var11, var0);
            double var29 = Math.pow(var13, var0);
            int var31 = (int) (var25 * 256.0D);
            int var32 = (int) (var27 * 256.0D);
            int var33 = (int) (var29 * 256.0D);
            int var34 = (var31 << 16) + (var32 << 8) + var33;
            Statics.field4730[var2] = var34 & 0xFFFFFF;
        }
    }

    @ObfuscatedName("cc.an(II)I")
    public static int method1065(int arg0) {
        return 255 - (arg0 & 0xFF);
    }
}
