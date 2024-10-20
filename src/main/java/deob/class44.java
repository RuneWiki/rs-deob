package deob;

@ObfuscatedName("ah")
public class class44 {

    @ObfuscatedName("ah.c")
    public int field328 = class50.method918(16);

    @ObfuscatedName("ah.v")
    public int field331 = class50.method918(24);

    @ObfuscatedName("ah.q")
    public int field327 = class50.method918(24);

    @ObfuscatedName("ah.f")
    public int field326 = class50.method918(24) + 1;

    @ObfuscatedName("ah.j")
    public int field325 = class50.method918(6) + 1;

    @ObfuscatedName("ah.e")
    public int field330 = class50.method918(8);

    @ObfuscatedName("ah.g")
    public int[] field329;

    public class44() {
        int[] var1 = new int[this.field325];
        for (int var2 = 0; var2 < this.field325; var2++) {
            int var3 = 0;
            int var4 = class50.method918(3);
            boolean var5 = class50.method896() != 0;
            if (var5) {
                var3 = class50.method918(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field329 = new int[this.field325 * 8];
        for (int var6 = 0; var6 < this.field325 * 8; var6++) {
            this.field329[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class50.method918(8);
        }
    }

    @ObfuscatedName("ah.c([FIZ)V")
    public void method741(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field364[this.field330].field356;
        int var6 = this.field327 - this.field331;
        int var7 = var6 / this.field326;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field364[this.field330].method886();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field325;
                        }
                        var11 /= this.field325;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field329[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field326 * var10 + this.field331;
                        class49 var17 = Statics.field364[var15];
                        if (this.field328 == 0) {
                            int var18 = this.field326 / var17.field356;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method887();
                                for (int var21 = 0; var21 < var17.field356; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field326) {
                                float[] var23 = var17.method887();
                                for (int var24 = 0; var24 < var17.field356; var24++) {
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
