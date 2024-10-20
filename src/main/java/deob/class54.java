package deob;

@ObfuscatedName("bd")
public class class54 {

    @ObfuscatedName("bd.g")
    public int field1128 = class64.method1242(16);

    @ObfuscatedName("bd.i")
    public int field1123 = class64.method1242(24);

    @ObfuscatedName("bd.k")
    public int field1124 = class64.method1242(24);

    @ObfuscatedName("bd.e")
    public int field1125 = class64.method1242(24) + 1;

    @ObfuscatedName("bd.w")
    public int field1126 = class64.method1242(6) + 1;

    @ObfuscatedName("bd.m")
    public int field1127 = class64.method1242(8);

    @ObfuscatedName("bd.u")
    public int[] field1122;

    public class54() {
        int[] var1 = new int[this.field1126];
        for (int var2 = 0; var2 < this.field1126; var2++) {
            int var3 = 0;
            int var4 = class64.method1242(3);
            boolean var5 = class64.method1241() != 0;
            if (var5) {
                var3 = class64.method1242(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1122 = new int[this.field1126 * 8];
        for (int var6 = 0; var6 < this.field1126 * 8; var6++) {
            this.field1122[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class64.method1242(8);
        }
    }

    @ObfuscatedName("bd.g([FIZ)V")
    public void method1047(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1198[this.field1127].field1261;
        int var6 = this.field1124 - this.field1123;
        int var7 = var6 / this.field1125;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1198[this.field1127].method1282();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1126;
                        }
                        var11 /= this.field1126;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1122[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1125 * var10 + this.field1123;
                        class67 var17 = Statics.field1198[var15];
                        if (this.field1128 == 0) {
                            int var18 = this.field1125 / var17.field1261;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1283();
                                for (int var21 = 0; var21 < var17.field1261; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1125) {
                                float[] var23 = var17.method1283();
                                for (int var24 = 0; var24 < var17.field1261; var24++) {
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
