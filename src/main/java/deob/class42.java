package deob;

@ObfuscatedName("an")
public class class42 {

    @ObfuscatedName("an.i")
    public int field304 = class48.method948(16);

    @ObfuscatedName("an.w")
    public int field299 = class48.method948(24);

    @ObfuscatedName("an.s")
    public int field300 = class48.method948(24);

    @ObfuscatedName("an.a")
    public int field302 = class48.method948(24) + 1;

    @ObfuscatedName("an.o")
    public int field303 = class48.method948(6) + 1;

    @ObfuscatedName("an.g")
    public int field305 = class48.method948(8);

    @ObfuscatedName("an.e")
    public int[] field301;

    public class42() {
        int[] var1 = new int[this.field303];
        for (int var2 = 0; var2 < this.field303; var2++) {
            int var3 = 0;
            int var4 = class48.method948(3);
            boolean var5 = class48.method973() != 0;
            if (var5) {
                var3 = class48.method948(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field301 = new int[this.field303 * 8];
        for (int var6 = 0; var6 < this.field303 * 8; var6++) {
            this.field301[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class48.method948(8);
        }
    }

    @ObfuscatedName("an.i([FIZ)V")
    public void method783(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field346[this.field305].field334;
        int var6 = this.field300 - this.field299;
        int var7 = var6 / this.field302;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field346[this.field305].method931();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field303;
                        }
                        var11 /= this.field303;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field301[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field302 * var10 + this.field299;
                        class47 var17 = Statics.field346[var15];
                        if (this.field304 == 0) {
                            int var18 = this.field302 / var17.field334;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method933();
                                for (int var21 = 0; var21 < var17.field334; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field302) {
                                float[] var23 = var17.method933();
                                for (int var24 = 0; var24 < var17.field334; var24++) {
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
