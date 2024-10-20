package deob;

@ObfuscatedName("bq")
public class class47 {

    @ObfuscatedName("bq.aq")
    public int field307;

    @ObfuscatedName("bq.ad")
    public int field305;

    @ObfuscatedName("bq.ag")
    public int field306;

    @ObfuscatedName("bq.ak")
    public int field309;

    @ObfuscatedName("bq.ap")
    public int field308;

    @ObfuscatedName("bq.an")
    public int field304;

    @ObfuscatedName("bq.aj")
    public int[] field310;

    public class47() {
        class61 var1 = class55.field354;
        this.field307 = var1.method1104(16);
        this.field305 = var1.method1104(24);
        this.field306 = var1.method1104(24);
        this.field309 = var1.method1104(24) + 1;
        this.field308 = var1.method1104(6) + 1;
        this.field304 = var1.method1104(8);
        int[] var2 = new int[this.field308];
        for (int var3 = 0; var3 < this.field308; var3++) {
            int var4 = 0;
            int var5 = var1.method1104(3);
            boolean var6 = var1.method1092() != 0;
            if (var6) {
                var4 = var1.method1104(5);
            }
            var2[var3] = var4 << 3 | var5;
        }
        this.field310 = new int[this.field308 * 8];
        for (int var7 = 0; var7 < this.field308 * 8; var7++) {
            this.field310[var7] = (var2[var7 >> 3] & 0x1 << (var7 & 0x7)) == 0 ? -1 : var1.method1104(8);
        }
    }

    @ObfuscatedName("bq.aq([FIZLco;)V")
    public void method868(float[] arg0, int arg1, boolean arg2, class61 arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[var5] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var6 = Statics.field348[this.field304].field342;
        int var7 = this.field306 - this.field305;
        int var8 = var7 / this.field309;
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;
            while (var11 < var8) {
                if (var10 == 0) {
                    int var12 = Statics.field348[this.field304].method1007(arg3);
                    for (int var13 = var6 - 1; var13 >= 0; var13--) {
                        if (var11 + var13 < var8) {
                            var9[var11 + var13] = var12 % this.field308;
                        }
                        var12 /= this.field308;
                    }
                }
                for (int var14 = 0; var14 < var6; var14++) {
                    int var15 = var9[var11];
                    int var16 = this.field310[var15 * 8 + var10];
                    if (var16 >= 0) {
                        int var17 = this.field309 * var11 + this.field305;
                        class53 var18 = Statics.field348[var16];
                        if (this.field307 == 0) {
                            int var19 = this.field309 / var18.field342;
                            for (int var20 = 0; var20 < var19; var20++) {
                                float[] var21 = var18.method1018(arg3);
                                for (int var22 = 0; var22 < var18.field342; var22++) {
                                    arg0[var19 * var22 + var17 + var20] += var21[var22];
                                }
                            }
                        } else {
                            int var23 = 0;
                            while (var23 < this.field309) {
                                float[] var24 = var18.method1018(arg3);
                                for (int var25 = 0; var25 < var18.field342; var25++) {
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
