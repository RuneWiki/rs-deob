package deob;

@ObfuscatedName("bw")
public class class47 {

    @ObfuscatedName("bw.ap")
    public int field297;

    @ObfuscatedName("bw.aw")
    public int field300;

    @ObfuscatedName("bw.ak")
    public int field296;

    @ObfuscatedName("bw.aj")
    public int field298;

    @ObfuscatedName("bw.ai")
    public int field299;

    @ObfuscatedName("bw.ay")
    public int field301;

    @ObfuscatedName("bw.as")
    public int[] field302;

    public class47() {
        class61 var1 = class55.field350;
        this.field297 = var1.method1145(16);
        this.field300 = var1.method1145(24);
        this.field296 = var1.method1145(24);
        this.field298 = var1.method1145(24) + 1;
        this.field299 = var1.method1145(6) + 1;
        this.field301 = var1.method1145(8);
        int[] var2 = new int[this.field299];
        for (int var3 = 0; var3 < this.field299; var3++) {
            int var4 = 0;
            int var5 = var1.method1145(3);
            boolean var6 = var1.method1135() != 0;
            if (var6) {
                var4 = var1.method1145(5);
            }
            var2[var3] = var4 << 3 | var5;
        }
        this.field302 = new int[this.field299 * 8];
        for (int var7 = 0; var7 < this.field299 * 8; var7++) {
            this.field302[var7] = (var2[var7 >> 3] & 0x1 << (var7 & 0x7)) == 0 ? -1 : var1.method1145(8);
        }
    }

    @ObfuscatedName("bw.ap([FIZLcp;)V")
    public void method871(float[] arg0, int arg1, boolean arg2, class61 arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[var5] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var6 = Statics.field347[this.field301].field339;
        int var7 = this.field296 - this.field300;
        int var8 = var7 / this.field298;
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;
            while (var11 < var8) {
                if (var10 == 0) {
                    int var12 = Statics.field347[this.field301].method1027(arg3);
                    for (int var13 = var6 - 1; var13 >= 0; var13--) {
                        if (var11 + var13 < var8) {
                            var9[var11 + var13] = var12 % this.field299;
                        }
                        var12 /= this.field299;
                    }
                }
                for (int var14 = 0; var14 < var6; var14++) {
                    int var15 = var9[var11];
                    int var16 = this.field302[var15 * 8 + var10];
                    if (var16 >= 0) {
                        int var17 = this.field298 * var11 + this.field300;
                        class53 var18 = Statics.field347[var16];
                        if (this.field297 == 0) {
                            int var19 = this.field298 / var18.field339;
                            for (int var20 = 0; var20 < var19; var20++) {
                                float[] var21 = var18.method1028(arg3);
                                for (int var22 = 0; var22 < var18.field339; var22++) {
                                    arg0[var19 * var22 + var17 + var20] += var21[var22];
                                }
                            }
                        } else {
                            int var23 = 0;
                            while (var23 < this.field298) {
                                float[] var24 = var18.method1028(arg3);
                                for (int var25 = 0; var25 < var18.field339; var25++) {
                                    arg0[var17 + var23] += var24[var25];
                                    var23++;
                                }
                            }
                        }
                    }
                    var11++;
                    if (var11 >= var8) {
                        break;
                    }
                }
            }
        }
    }
}
