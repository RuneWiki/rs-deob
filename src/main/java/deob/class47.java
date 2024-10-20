package deob;

@ObfuscatedName("ad")
public class class47 {

    @ObfuscatedName("ad.f")
    public int field347 = class53.method1005(16);

    @ObfuscatedName("ad.w")
    public int field348 = class53.method1005(24);

    @ObfuscatedName("ad.v")
    public int field350 = class53.method1005(24);

    @ObfuscatedName("ad.s")
    public int field351 = class53.method1005(24) + 1;

    @ObfuscatedName("ad.z")
    public int field349 = class53.method1005(6) + 1;

    @ObfuscatedName("ad.j")
    public int field352 = class53.method1005(8);

    @ObfuscatedName("ad.i")
    public int[] field353;

    public class47() {
        int[] var1 = new int[this.field349];
        for (int var2 = 0; var2 < this.field349; var2++) {
            int var3 = 0;
            int var4 = class53.method1005(3);
            boolean var5 = class53.method1021() != 0;
            if (var5) {
                var3 = class53.method1005(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field353 = new int[this.field349 * 8];
        for (int var6 = 0; var6 < this.field349 * 8; var6++) {
            this.field353[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class53.method1005(8);
        }
    }

    @ObfuscatedName("ad.f([FIZ)V")
    public void method846(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field394[this.field352].field381;
        int var6 = this.field350 - this.field348;
        int var7 = var6 / this.field351;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field394[this.field352].method986();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field349;
                        }
                        var11 /= this.field349;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field353[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field351 * var10 + this.field348;
                        class52 var17 = Statics.field394[var15];
                        if (this.field347 == 0) {
                            int var18 = this.field351 / var17.field381;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method989();
                                for (int var21 = 0; var21 < var17.field381; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field351) {
                                float[] var23 = var17.method989();
                                for (int var24 = 0; var24 < var17.field381; var24++) {
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
