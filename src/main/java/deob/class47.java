package deob;

@ObfuscatedName("bm")
public class class47 {

    @ObfuscatedName("bm.aw")
    public int field350;

    @ObfuscatedName("bm.ay")
    public int field351;

    @ObfuscatedName("bm.ar")
    public int field347;

    @ObfuscatedName("bm.am")
    public int field348;

    @ObfuscatedName("bm.as")
    public int field349;

    @ObfuscatedName("bm.aj")
    public int field352;

    @ObfuscatedName("bm.ag")
    public int[] field353;

    public class47() {
        class61 var1 = class55.field416;
        this.field350 = var1.method1114(16);
        this.field351 = var1.method1114(24);
        this.field347 = var1.method1114(24);
        this.field348 = var1.method1114(24) + 1;
        this.field349 = var1.method1114(6) + 1;
        this.field352 = var1.method1114(8);
        int[] var2 = new int[this.field349];
        for (int var3 = 0; var3 < this.field349; var3++) {
            int var4 = 0;
            int var5 = var1.method1114(3);
            boolean var6 = var1.method1115() != 0;
            if (var6) {
                var4 = var1.method1114(5);
            }
            var2[var3] = var4 << 3 | var5;
        }
        this.field353 = new int[this.field349 * 8];
        for (int var7 = 0; var7 < this.field349 * 8; var7++) {
            this.field353[var7] = (var2[var7 >> 3] & 0x1 << (var7 & 0x7)) == 0 ? -1 : var1.method1114(8);
        }
    }

    @ObfuscatedName("bm.aw([FIZLce;)V")
    public void method850(float[] arg0, int arg1, boolean arg2, class61 arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[var5] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var6 = Statics.field403[this.field352].field385;
        int var7 = this.field347 - this.field351;
        int var8 = var7 / this.field348;
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;
            while (var11 < var8) {
                if (var10 == 0) {
                    int var12 = Statics.field403[this.field352].method1013(arg3);
                    for (int var13 = var6 - 1; var13 >= 0; var13--) {
                        if (var11 + var13 < var8) {
                            var9[var11 + var13] = var12 % this.field349;
                        }
                        var12 /= this.field349;
                    }
                }
                for (int var14 = 0; var14 < var6; var14++) {
                    int var15 = var9[var11];
                    int var16 = this.field353[var15 * 8 + var10];
                    if (var16 >= 0) {
                        int var17 = this.field348 * var11 + this.field351;
                        class53 var18 = Statics.field403[var16];
                        if (this.field350 == 0) {
                            int var19 = this.field348 / var18.field385;
                            for (int var20 = 0; var20 < var19; var20++) {
                                float[] var21 = var18.method1011(arg3);
                                for (int var22 = 0; var22 < var18.field385; var22++) {
                                    arg0[var19 * var22 + var17 + var20] += var21[var22];
                                }
                            }
                        } else {
                            int var23 = 0;
                            while (var23 < this.field348) {
                                float[] var24 = var18.method1011(arg3);
                                for (int var25 = 0; var25 < var18.field385; var25++) {
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
