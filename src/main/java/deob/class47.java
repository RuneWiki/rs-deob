package deob;

@ObfuscatedName("bu")
public class class47 {

    @ObfuscatedName("bu.am")
    public int field331;

    @ObfuscatedName("bu.ap")
    public int field327;

    @ObfuscatedName("bu.af")
    public int field328;

    @ObfuscatedName("bu.aj")
    public int field329;

    @ObfuscatedName("bu.aq")
    public int field330;

    @ObfuscatedName("bu.ar")
    public int field326;

    @ObfuscatedName("bu.ag")
    public int[] field332;

    public class47() {
        class61 var1 = class55.field377;
        this.field331 = var1.method1129(16);
        this.field327 = var1.method1129(24);
        this.field328 = var1.method1129(24);
        this.field329 = var1.method1129(24) + 1;
        this.field330 = var1.method1129(6) + 1;
        this.field326 = var1.method1129(8);
        int[] var2 = new int[this.field330];
        for (int var3 = 0; var3 < this.field330; var3++) {
            int var4 = 0;
            int var5 = var1.method1129(3);
            boolean var6 = var1.method1130() != 0;
            if (var6) {
                var4 = var1.method1129(5);
            }
            var2[var3] = var4 << 3 | var5;
        }
        this.field332 = new int[this.field330 * 8];
        for (int var7 = 0; var7 < this.field330 * 8; var7++) {
            this.field332[var7] = (var2[var7 >> 3] & 0x1 << (var7 & 0x7)) == 0 ? -1 : var1.method1129(8);
        }
    }

    @ObfuscatedName("bu.am([FIZLcs;)V")
    public void method880(float[] arg0, int arg1, boolean arg2, class61 arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[var5] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var6 = Statics.field380[this.field326].field366;
        int var7 = this.field328 - this.field327;
        int var8 = var7 / this.field329;
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;
            while (var11 < var8) {
                if (var10 == 0) {
                    int var12 = Statics.field380[this.field326].method1025(arg3);
                    for (int var13 = var6 - 1; var13 >= 0; var13--) {
                        if (var11 + var13 < var8) {
                            var9[var11 + var13] = var12 % this.field330;
                        }
                        var12 /= this.field330;
                    }
                }
                for (int var14 = 0; var14 < var6; var14++) {
                    int var15 = var9[var11];
                    int var16 = this.field332[var15 * 8 + var10];
                    if (var16 >= 0) {
                        int var17 = this.field329 * var11 + this.field327;
                        class53 var18 = Statics.field380[var16];
                        if (this.field331 == 0) {
                            int var19 = this.field329 / var18.field366;
                            for (int var20 = 0; var20 < var19; var20++) {
                                float[] var21 = var18.method1026(arg3);
                                for (int var22 = 0; var22 < var18.field366; var22++) {
                                    arg0[var19 * var22 + var17 + var20] += var21[var22];
                                }
                            }
                        } else {
                            int var23 = 0;
                            while (var23 < this.field329) {
                                float[] var24 = var18.method1026(arg3);
                                for (int var25 = 0; var25 < var18.field366; var25++) {
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
