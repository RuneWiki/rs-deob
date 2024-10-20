package deob;

@ObfuscatedName("as")
public class class44 {

    @ObfuscatedName("as.c")
    public int field324 = class50.method977(16);

    @ObfuscatedName("as.b")
    public int field325 = class50.method977(24);

    @ObfuscatedName("as.p")
    public int field323 = class50.method977(24);

    @ObfuscatedName("as.m")
    public int field326 = class50.method977(24) + 1;

    @ObfuscatedName("as.t")
    public int field327 = class50.method977(6) + 1;

    @ObfuscatedName("as.s")
    public int field328 = class50.method977(8);

    @ObfuscatedName("as.j")
    public int[] field329;

    public class44() {
        int[] var1 = new int[this.field327];
        for (int var2 = 0; var2 < this.field327; var2++) {
            int var3 = 0;
            int var4 = class50.method977(3);
            boolean var5 = class50.method994() != 0;
            if (var5) {
                var3 = class50.method977(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field329 = new int[this.field327 * 8];
        for (int var6 = 0; var6 < this.field327 * 8; var6++) {
            this.field329[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class50.method977(8);
        }
    }

    @ObfuscatedName("as.c([FIZ)V")
    public void method804(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field370[this.field328].field358;
        int var6 = this.field323 - this.field325;
        int var7 = var6 / this.field326;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field370[this.field328].method948();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field327;
                        }
                        var11 /= this.field327;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field329[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field326 * var10 + this.field325;
                        class49 var17 = Statics.field370[var15];
                        if (this.field324 == 0) {
                            int var18 = this.field326 / var17.field358;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method949();
                                for (int var21 = 0; var21 < var17.field358; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field326) {
                                float[] var23 = var17.method949();
                                for (int var24 = 0; var24 < var17.field358; var24++) {
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
