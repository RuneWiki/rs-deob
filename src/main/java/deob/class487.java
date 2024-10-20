package deob;

@ObfuscatedName("sa")
public class class487 {

    @ObfuscatedName("sa.ao")
    public static int[] field4934 = new int[32768];

    @ObfuscatedName("sa.ab")
    public static int[] field4929;

    static {
        for (int var0 = 0; var0 < 32768; var0++) {
            field4934[var0] = method7846(var0);
        }
        if (field4929 == null) {
            field4929 = new int[65536];
            double var1 = 0.949999988079071D;
            for (int var3 = 0; var3 < 65536; var3++) {
                double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
                double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
                double var8 = (double) (var3 & 0x7F) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (var6 != 0.0D) {
                    double var16;
                    if (var8 < 0.5D) {
                        var16 = (var6 + 1.0D) * var8;
                    } else {
                        var16 = var6 + var8 - var6 * var8;
                    }
                    double var18 = var8 * 2.0D - var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        var20--;
                    }
                    double var24 = var4 - 0.3333333333333333D;
                    if (var24 < 0.0D) {
                        var24++;
                    }
                    if (var20 * 6.0D < 1.0D) {
                        var10 = (var16 - var18) * 6.0D * var20 + var18;
                    } else if (var20 * 2.0D < 1.0D) {
                        var10 = var16;
                    } else if (var20 * 3.0D < 2.0D) {
                        var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                    } else {
                        var10 = var18;
                    }
                    if (var4 * 6.0D < 1.0D) {
                        var12 = (var16 - var18) * 6.0D * var4 + var18;
                    } else if (var4 * 2.0D < 1.0D) {
                        var12 = var16;
                    } else if (var4 * 3.0D < 2.0D) {
                        var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                    } else {
                        var12 = var18;
                    }
                    if (var24 * 6.0D < 1.0D) {
                        var14 = (var16 - var18) * 6.0D * var24 + var18;
                    } else if (var24 * 2.0D < 1.0D) {
                        var14 = var16;
                    } else if (var24 * 3.0D < 2.0D) {
                        var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                    } else {
                        var14 = var18;
                    }
                }
                double var26 = Math.pow(var10, var1);
                double var28 = Math.pow(var12, var1);
                double var30 = Math.pow(var14, var1);
                int var32 = (int) (var26 * 256.0D);
                int var33 = (int) (var28 * 256.0D);
                int var34 = (int) (var30 * 256.0D);
                int var35 = (var32 << 16) + (var33 << 8) + var34;
                field4929[var3] = var35 & 0xFFFFFF;
            }
        }
    }

    public class487() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("sa.az(IS)I")
    public static final int method7846(int arg0) {
        double var1 = (double) (arg0 >> 10 & 0x1F) / 31.0D;
        double var3 = (double) (arg0 >> 5 & 0x1F) / 31.0D;
        double var5 = (double) (arg0 & 0x1F) / 31.0D;
        double var7 = var1;
        if (var3 < var1) {
            var7 = var3;
        }
        if (var5 < var7) {
            var7 = var5;
        }
        double var9 = var1;
        if (var3 > var1) {
            var9 = var3;
        }
        if (var5 > var9) {
            var9 = var5;
        }
        double var11 = 0.0D;
        double var13 = 0.0D;
        double var15 = (var7 + var9) / 2.0D;
        if (var7 != var9) {
            if (var15 < 0.5D) {
                var13 = (var9 - var7) / (var7 + var9);
            }
            if (var15 >= 0.5D) {
                var13 = (var9 - var7) / (2.0D - var9 - var7);
            }
            if (var1 == var9) {
                var11 = (var3 - var5) / (var9 - var7);
            } else if (var3 == var9) {
                var11 = (var5 - var1) / (var9 - var7) + 2.0D;
            } else if (var5 == var9) {
                var11 = (var1 - var3) / (var9 - var7) + 4.0D;
            }
        }
        int var17 = (int) (var11 * 256.0D / 6.0D);
        int var18 = var17 & 0xFF;
        double var19 = var13 * 256.0D;
        if (var19 < 0.0D) {
            var19 = 0.0D;
        } else if (var19 > 255.0D) {
            var19 = 255.0D;
        }
        if (var15 > 0.7D) {
            double var21 = var19 / 2.0D;
            var19 = Math.floor(var21);
        }
        if (var15 > 0.75D) {
            double var23 = var19 / 2.0D;
            var19 = Math.floor(var23);
        }
        if (var15 > 0.85D) {
            double var25 = var19 / 2.0D;
            var19 = Math.floor(var25);
        }
        if (var15 > 0.95D) {
            double var27 = var19 / 2.0D;
            var19 = Math.floor(var27);
        }
        if (var15 > 0.995D) {
            var15 = 0.995D;
        }
        int var29 = (int) (var19 / 32.0D + (double) (var18 / 4 * 8));
        return (var29 << 7) + (int) (var15 * 128.0D);
    }

    @ObfuscatedName("sa.ah(II)I")
    public static int method7843(int arg0) {
        return 255 - (arg0 & 0xFF);
    }
}
