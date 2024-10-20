package deob;

@ObfuscatedName("bj")
public class class47 {

    @ObfuscatedName("bj.ak")
    public int field325;

    @ObfuscatedName("bj.al")
    public int field323;

    @ObfuscatedName("bj.aj")
    public int field324;

    @ObfuscatedName("bj.az")
    public int field327;

    @ObfuscatedName("bj.af")
    public int field326;

    @ObfuscatedName("bj.aa")
    public int field322;

    @ObfuscatedName("bj.at")
    public int[] field328;

    public class47() {
        class61 var1 = class55.field395;
        this.field325 = var1.method1088(16);
        this.field323 = var1.method1088(24);
        this.field324 = var1.method1088(24);
        this.field327 = var1.method1088(24) + 1;
        this.field326 = var1.method1088(6) + 1;
        this.field322 = var1.method1088(8);
        int[] var2 = new int[this.field326];
        for (int var3 = 0; var3 < this.field326; var3++) {
            int var4 = 0;
            int var5 = var1.method1088(3);
            boolean var6 = var1.method1083() != 0;
            if (var6) {
                var4 = var1.method1088(5);
            }
            var2[var3] = var4 << 3 | var5;
        }
        this.field328 = new int[this.field326 * 8];
        for (int var7 = 0; var7 < this.field326 * 8; var7++) {
            this.field328[var7] = (var2[var7 >> 3] & 0x1 << (var7 & 0x7)) == 0 ? -1 : var1.method1088(8);
        }
    }

    @ObfuscatedName("bj.ak([FIZLci;)V")
    public void method853(float[] arg0, int arg1, boolean arg2, class61 arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[var5] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var6 = Statics.field384[this.field322].field363;
        int var7 = this.field324 - this.field323;
        int var8 = var7 / this.field327;
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;
            while (var11 < var8) {
                if (var10 == 0) {
                    int var12 = Statics.field384[this.field322].method999(arg3);
                    for (int var13 = var6 - 1; var13 >= 0; var13--) {
                        if (var11 + var13 < var8) {
                            var9[var11 + var13] = var12 % this.field326;
                        }
                        var12 /= this.field326;
                    }
                }
                for (int var14 = 0; var14 < var6; var14++) {
                    int var15 = var9[var11];
                    int var16 = this.field328[var15 * 8 + var10];
                    if (var16 >= 0) {
                        int var17 = this.field327 * var11 + this.field323;
                        class53 var18 = Statics.field384[var16];
                        if (this.field325 == 0) {
                            int var19 = this.field327 / var18.field363;
                            for (int var20 = 0; var20 < var19; var20++) {
                                float[] var21 = var18.method993(arg3);
                                for (int var22 = 0; var22 < var18.field363; var22++) {
                                    arg0[var19 * var22 + var17 + var20] += var21[var22];
                                }
                            }
                        } else {
                            int var23 = 0;
                            while (var23 < this.field327) {
                                float[] var24 = var18.method993(arg3);
                                for (int var25 = 0; var25 < var18.field363; var25++) {
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
