package deob;

@ObfuscatedName("j")
public class class24 {

    @ObfuscatedName("j.t")
    public int field315 = class130.method1517(16);

    @ObfuscatedName("j.n")
    public int field311 = class130.method1517(24);

    @ObfuscatedName("j.q")
    public int field312 = class130.method1517(24);

    @ObfuscatedName("j.h")
    public int field313 = class130.method1517(24) + 1;

    @ObfuscatedName("j.k")
    public int field314 = class130.method1517(6) + 1;

    @ObfuscatedName("j.r")
    public int field316 = class130.method1517(8);

    @ObfuscatedName("j.l")
    public int[] field310;

    public class24() {
        int[] var1 = new int[this.field314];
        for (int var2 = 0; var2 < this.field314; var2++) {
            int var3 = 0;
            int var4 = class130.method1517(3);
            boolean var5 = class130.method1516() != 0;
            if (var5) {
                var3 = class130.method1517(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field310 = new int[this.field314 * 8];
        for (int var6 = 0; var6 < this.field314 * 8; var6++) {
            this.field310[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class130.method1517(8);
        }
    }

    @ObfuscatedName("j.t([FIZ)V")
    public void method303(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1660[this.field316].field319;
        int var6 = this.field312 - this.field311;
        int var7 = var6 / this.field313;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1660[this.field316].method307();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field314;
                        }
                        var11 /= this.field314;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field310[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field313 * var10 + this.field311;
                        class25 var17 = Statics.field1660[var15];
                        if (this.field315 == 0) {
                            int var18 = this.field313 / var17.field319;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method308();
                                for (int var21 = 0; var21 < var17.field319; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field313) {
                                float[] var23 = var17.method308();
                                for (int var24 = 0; var24 < var17.field319; var24++) {
                                    arg0[var16 + var22] += var23[var24];
                                    var22++;
                                }
                            }
                        }
                    }
                    var10++;
                    if (var10 >= var7) {
                        break;
                    }
                }
            }
        }
    }
}
