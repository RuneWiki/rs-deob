package deob;

@ObfuscatedName("by")
public class class59 {

    @ObfuscatedName("by.f")
    public int field1199 = class53.method1208(16);

    @ObfuscatedName("by.t")
    public int field1196 = class53.method1208(24);

    @ObfuscatedName("by.n")
    public int field1197 = class53.method1208(24);

    @ObfuscatedName("by.e")
    public int field1198 = class53.method1208(24) + 1;

    @ObfuscatedName("by.l")
    public int field1195 = class53.method1208(6) + 1;

    @ObfuscatedName("by.d")
    public int field1200 = class53.method1208(8);

    @ObfuscatedName("by.r")
    public int[] field1201;

    public class59() {
        int[] var1 = new int[this.field1195];
        for (int var2 = 0; var2 < this.field1195; var2++) {
            int var3 = 0;
            int var4 = class53.method1208(3);
            boolean var5 = class53.method1189() != 0;
            if (var5) {
                var3 = class53.method1208(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1201 = new int[this.field1195 * 8];
        for (int var6 = 0; var6 < this.field1195 * 8; var6++) {
            this.field1201[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class53.method1208(8);
        }
    }

    @ObfuscatedName("by.f([FIZ)V")
    public void method1296(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1101[this.field1200].field1205;
        int var6 = this.field1197 - this.field1196;
        int var7 = var6 / this.field1198;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1101[this.field1200].method1301();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1195;
                        }
                        var11 /= this.field1195;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1201[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1198 * var10 + this.field1196;
                        class60 var17 = Statics.field1101[var15];
                        if (this.field1199 == 0) {
                            int var18 = this.field1198 / var17.field1205;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1303();
                                for (int var21 = 0; var21 < var17.field1205; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1198) {
                                float[] var23 = var17.method1303();
                                for (int var24 = 0; var24 < var17.field1205; var24++) {
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
