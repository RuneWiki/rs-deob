package deob;

@ObfuscatedName("bv")
public class class47 {

    @ObfuscatedName("bv.ac")
    public int field313;

    @ObfuscatedName("bv.ae")
    public int field310;

    @ObfuscatedName("bv.ag")
    public int field312;

    @ObfuscatedName("bv.am")
    public int field311;

    @ObfuscatedName("bv.ax")
    public int field314;

    @ObfuscatedName("bv.aq")
    public int field315;

    @ObfuscatedName("bv.af")
    public int[] field316;

    public class47() {
        class61 var1 = class55.field365;
        this.field313 = var1.method1117(16);
        this.field310 = var1.method1117(24);
        this.field312 = var1.method1117(24);
        this.field311 = var1.method1117(24) + 1;
        this.field314 = var1.method1117(6) + 1;
        this.field315 = var1.method1117(8);
        int[] var2 = new int[this.field314];
        for (int var3 = 0; var3 < this.field314; var3++) {
            int var4 = 0;
            int var5 = var1.method1117(3);
            boolean var6 = var1.method1118() != 0;
            if (var6) {
                var4 = var1.method1117(5);
            }
            var2[var3] = var4 << 3 | var5;
        }
        this.field316 = new int[this.field314 * 8];
        for (int var7 = 0; var7 < this.field314 * 8; var7++) {
            this.field316[var7] = (var2[var7 >> 3] & 0x1 << (var7 & 0x7)) == 0 ? -1 : var1.method1117(8);
        }
    }

    @ObfuscatedName("bv.ac([FIZLcy;)V")
    public void method866(float[] arg0, int arg1, boolean arg2, class61 arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[var5] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var6 = Statics.field368[this.field315].field345;
        int var7 = this.field312 - this.field310;
        int var8 = var7 / this.field311;
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;
            while (var11 < var8) {
                if (var10 == 0) {
                    int var12 = Statics.field368[this.field315].method1010(arg3);
                    for (int var13 = var6 - 1; var13 >= 0; var13--) {
                        if (var11 + var13 < var8) {
                            var9[var11 + var13] = var12 % this.field314;
                        }
                        var12 /= this.field314;
                    }
                }
                for (int var14 = 0; var14 < var6; var14++) {
                    int var15 = var9[var11];
                    int var16 = this.field316[var15 * 8 + var10];
                    if (var16 >= 0) {
                        int var17 = this.field311 * var11 + this.field310;
                        class53 var18 = Statics.field368[var16];
                        if (this.field313 == 0) {
                            int var19 = this.field311 / var18.field345;
                            for (int var20 = 0; var20 < var19; var20++) {
                                float[] var21 = var18.method1011(arg3);
                                for (int var22 = 0; var22 < var18.field345; var22++) {
                                    arg0[var19 * var22 + var17 + var20] += var21[var22];
                                }
                            }
                        } else {
                            int var23 = 0;
                            while (var23 < this.field311) {
                                float[] var24 = var18.method1011(arg3);
                                for (int var25 = 0; var25 < var18.field345; var25++) {
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
