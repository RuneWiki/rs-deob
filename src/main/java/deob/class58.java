package deob;

@ObfuscatedName("bi")
public class class58 {

    @ObfuscatedName("bi.v")
    public int field1197 = class52.method1215(16);

    @ObfuscatedName("bi.f")
    public int field1194 = class52.method1215(24);

    @ObfuscatedName("bi.n")
    public int field1195 = class52.method1215(24);

    @ObfuscatedName("bi.c")
    public int field1196 = class52.method1215(24) + 1;

    @ObfuscatedName("bi.r")
    public int field1193 = class52.method1215(6) + 1;

    @ObfuscatedName("bi.k")
    public int field1198 = class52.method1215(8);

    @ObfuscatedName("bi.e")
    public int[] field1199;

    public class58() {
        int[] var1 = new int[this.field1193];
        for (int var2 = 0; var2 < this.field1193; var2++) {
            int var3 = 0;
            int var4 = class52.method1215(3);
            boolean var5 = class52.method1247() != 0;
            if (var5) {
                var3 = class52.method1215(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1199 = new int[this.field1193 * 8];
        for (int var6 = 0; var6 < this.field1193 * 8; var6++) {
            this.field1199[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class52.method1215(8);
        }
    }

    @ObfuscatedName("bi.v([FIZ)V")
    public void method1311(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1106[this.field1198].field1204;
        int var6 = this.field1195 - this.field1194;
        int var7 = var6 / this.field1196;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1106[this.field1198].method1322();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1193;
                        }
                        var11 /= this.field1193;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1199[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1196 * var10 + this.field1194;
                        class59 var17 = Statics.field1106[var15];
                        if (this.field1197 == 0) {
                            int var18 = this.field1196 / var17.field1204;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1317();
                                for (int var21 = 0; var21 < var17.field1204; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1196) {
                                float[] var23 = var17.method1317();
                                for (int var24 = 0; var24 < var17.field1204; var24++) {
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
