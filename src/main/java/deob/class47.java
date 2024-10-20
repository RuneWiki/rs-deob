package deob;

@ObfuscatedName("bz")
public class class47 {

    @ObfuscatedName("bz.au")
    public int field344;

    @ObfuscatedName("bz.ae")
    public int field342;

    @ObfuscatedName("bz.ao")
    public int field341;

    @ObfuscatedName("bz.at")
    public int field343;

    @ObfuscatedName("bz.ac")
    public int field345;

    @ObfuscatedName("bz.ai")
    public int field346;

    @ObfuscatedName("bz.az")
    public int[] field347;

    public class47() {
        class61 var1 = class55.field394;
        this.field344 = var1.method1101(16);
        this.field342 = var1.method1101(24);
        this.field341 = var1.method1101(24);
        this.field343 = var1.method1101(24) + 1;
        this.field345 = var1.method1101(6) + 1;
        this.field346 = var1.method1101(8);
        int[] var2 = new int[this.field345];
        for (int var3 = 0; var3 < this.field345; var3++) {
            int var4 = 0;
            int var5 = var1.method1101(3);
            boolean var6 = var1.method1102() != 0;
            if (var6) {
                var4 = var1.method1101(5);
            }
            var2[var3] = var4 << 3 | var5;
        }
        this.field347 = new int[this.field345 * 8];
        for (int var7 = 0; var7 < this.field345 * 8; var7++) {
            this.field347[var7] = (var2[var7 >> 3] & 0x1 << (var7 & 0x7)) == 0 ? -1 : var1.method1101(8);
        }
    }

    @ObfuscatedName("bz.au([FIZLce;)V")
    public void method873(float[] arg0, int arg1, boolean arg2, class61 arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[var5] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var6 = Statics.field397[this.field346].field384;
        int var7 = this.field341 - this.field342;
        int var8 = var7 / this.field343;
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;
            while (var11 < var8) {
                if (var10 == 0) {
                    int var12 = Statics.field397[this.field346].method1011(arg3);
                    for (int var13 = var6 - 1; var13 >= 0; var13--) {
                        if (var11 + var13 < var8) {
                            var9[var11 + var13] = var12 % this.field345;
                        }
                        var12 /= this.field345;
                    }
                }
                for (int var14 = 0; var14 < var6; var14++) {
                    int var15 = var9[var11];
                    int var16 = this.field347[var15 * 8 + var10];
                    if (var16 >= 0) {
                        int var17 = this.field343 * var11 + this.field342;
                        class53 var18 = Statics.field397[var16];
                        if (this.field344 == 0) {
                            int var19 = this.field343 / var18.field384;
                            for (int var20 = 0; var20 < var19; var20++) {
                                float[] var21 = var18.method1009(arg3);
                                for (int var22 = 0; var22 < var18.field384; var22++) {
                                    arg0[var19 * var22 + var17 + var20] += var21[var22];
                                }
                            }
                        } else {
                            int var23 = 0;
                            while (var23 < this.field343) {
                                float[] var24 = var18.method1009(arg3);
                                for (int var25 = 0; var25 < var18.field384; var25++) {
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
