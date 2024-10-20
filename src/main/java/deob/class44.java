package deob;

@ObfuscatedName("av")
public class class44 {

    @ObfuscatedName("av.c")
    public int field341 = class50.method991(16);

    @ObfuscatedName("av.p")
    public int field339 = class50.method991(24);

    @ObfuscatedName("av.f")
    public int field338 = class50.method991(24);

    @ObfuscatedName("av.n")
    public int field340 = class50.method991(24) + 1;

    @ObfuscatedName("av.k")
    public int field342 = class50.method991(6) + 1;

    @ObfuscatedName("av.w")
    public int field343 = class50.method991(8);

    @ObfuscatedName("av.s")
    public int[] field344;

    public class44() {
        int[] var1 = new int[this.field342];
        for (int var2 = 0; var2 < this.field342; var2++) {
            int var3 = 0;
            int var4 = class50.method991(3);
            boolean var5 = class50.method988() != 0;
            if (var5) {
                var3 = class50.method991(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field344 = new int[this.field342 * 8];
        for (int var6 = 0; var6 < this.field342 * 8; var6++) {
            this.field344[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class50.method991(8);
        }
    }

    @ObfuscatedName("av.c([FIZ)V")
    public void method816(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field401[this.field343].field372;
        int var6 = this.field338 - this.field339;
        int var7 = var6 / this.field340;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field401[this.field343].method977();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field342;
                        }
                        var11 /= this.field342;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field344[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field340 * var10 + this.field339;
                        class49 var17 = Statics.field401[var15];
                        if (this.field341 == 0) {
                            int var18 = this.field340 / var17.field372;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method978();
                                for (int var21 = 0; var21 < var17.field372; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field340) {
                                float[] var23 = var17.method978();
                                for (int var24 = 0; var24 < var17.field372; var24++) {
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
