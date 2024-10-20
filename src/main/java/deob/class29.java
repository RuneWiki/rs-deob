package deob;

@ObfuscatedName("am")
public class class29 {

    @ObfuscatedName("am.s")
    public int field234 = class35.method688(16);

    @ObfuscatedName("am.t")
    public int field230 = class35.method688(24);

    @ObfuscatedName("am.v")
    public int field231 = class35.method688(24);

    @ObfuscatedName("am.j")
    public int field232 = class35.method688(24) + 1;

    @ObfuscatedName("am.l")
    public int field233 = class35.method688(6) + 1;

    @ObfuscatedName("am.n")
    public int field235 = class35.method688(8);

    @ObfuscatedName("am.w")
    public int[] field229;

    public class29() {
        int[] var1 = new int[this.field233];
        for (int var2 = 0; var2 < this.field233; var2++) {
            int var3 = 0;
            int var4 = class35.method688(3);
            boolean var5 = class35.method705() != 0;
            if (var5) {
                var3 = class35.method688(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field229 = new int[this.field233 * 8];
        for (int var6 = 0; var6 < this.field233 * 8; var6++) {
            this.field229[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class35.method688(8);
        }
    }

    @ObfuscatedName("am.s([FIZ)V")
    public void method520(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field276[this.field235].field261;
        int var6 = this.field231 - this.field230;
        int var7 = var6 / this.field232;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field276[this.field235].method672();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field233;
                        }
                        var11 /= this.field233;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field229[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field232 * var10 + this.field230;
                        class34 var17 = Statics.field276[var15];
                        if (this.field234 == 0) {
                            int var18 = this.field232 / var17.field261;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method680();
                                for (int var21 = 0; var21 < var17.field261; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field232) {
                                float[] var23 = var17.method680();
                                for (int var24 = 0; var24 < var17.field261; var24++) {
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
