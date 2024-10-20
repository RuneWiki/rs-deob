package deob;

@ObfuscatedName("bi")
public class class47 {

    @ObfuscatedName("bi.az")
    public int field320;

    @ObfuscatedName("bi.ah")
    public int field315;

    @ObfuscatedName("bi.af")
    public int field314;

    @ObfuscatedName("bi.at")
    public int field316;

    @ObfuscatedName("bi.an")
    public int field317;

    @ObfuscatedName("bi.ao")
    public int field319;

    @ObfuscatedName("bi.ab")
    public int[] field318;

    public class47() {
        class61 var1 = class55.field366;
        this.field320 = var1.method1058(16);
        this.field315 = var1.method1058(24);
        this.field314 = var1.method1058(24);
        this.field316 = var1.method1058(24) + 1;
        this.field317 = var1.method1058(6) + 1;
        this.field319 = var1.method1058(8);
        int[] var2 = new int[this.field317];
        for (int var3 = 0; var3 < this.field317; var3++) {
            int var4 = 0;
            int var5 = var1.method1058(3);
            boolean var6 = var1.method1059() != 0;
            if (var6) {
                var4 = var1.method1058(5);
            }
            var2[var3] = var4 << 3 | var5;
        }
        this.field318 = new int[this.field317 * 8];
        for (int var7 = 0; var7 < this.field317 * 8; var7++) {
            this.field318[var7] = (var2[var7 >> 3] & 0x1 << (var7 & 0x7)) == 0 ? -1 : var1.method1058(8);
        }
    }

    @ObfuscatedName("bi.az([FIZLct;)V")
    public void method821(float[] arg0, int arg1, boolean arg2, class61 arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[var5] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var6 = Statics.field369[this.field319].field351;
        int var7 = this.field314 - this.field315;
        int var8 = var7 / this.field316;
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;
            while (var11 < var8) {
                if (var10 == 0) {
                    int var12 = Statics.field369[this.field319].method964(arg3);
                    for (int var13 = var6 - 1; var13 >= 0; var13--) {
                        if (var11 + var13 < var8) {
                            var9[var11 + var13] = var12 % this.field317;
                        }
                        var12 /= this.field317;
                    }
                }
                for (int var14 = 0; var14 < var6; var14++) {
                    int var15 = var9[var11];
                    int var16 = this.field318[var15 * 8 + var10];
                    if (var16 >= 0) {
                        int var17 = this.field316 * var11 + this.field315;
                        class53 var18 = Statics.field369[var16];
                        if (this.field320 == 0) {
                            int var19 = this.field316 / var18.field351;
                            for (int var20 = 0; var20 < var19; var20++) {
                                float[] var21 = var18.method966(arg3);
                                for (int var22 = 0; var22 < var18.field351; var22++) {
                                    arg0[var19 * var22 + var17 + var20] += var21[var22];
                                }
                            }
                        } else {
                            int var23 = 0;
                            while (var23 < this.field316) {
                                float[] var24 = var18.method966(arg3);
                                for (int var25 = 0; var25 < var18.field351; var25++) {
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
