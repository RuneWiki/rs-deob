package deob;

@ObfuscatedName("bw")
public class class54 {

    @ObfuscatedName("bw.i")
    public int field1135 = class64.method1276(16);

    @ObfuscatedName("bw.c")
    public int field1132 = class64.method1276(24);

    @ObfuscatedName("bw.h")
    public int field1133 = class64.method1276(24);

    @ObfuscatedName("bw.v")
    public int field1134 = class64.method1276(24) + 1;

    @ObfuscatedName("bw.q")
    public int field1136 = class64.method1276(6) + 1;

    @ObfuscatedName("bw.s")
    public int field1137 = class64.method1276(8);

    @ObfuscatedName("bw.g")
    public int[] field1131;

    public class54() {
        int[] var1 = new int[this.field1136];
        for (int var2 = 0; var2 < this.field1136; var2++) {
            int var3 = 0;
            int var4 = class64.method1276(3);
            boolean var5 = class64.method1274() != 0;
            if (var5) {
                var3 = class64.method1276(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1131 = new int[this.field1136 * 8];
        for (int var6 = 0; var6 < this.field1136 * 8; var6++) {
            this.field1131[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class64.method1276(8);
        }
    }

    @ObfuscatedName("bw.i([FIZ)V")
    public void method1070(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1204[this.field1137].field1267;
        int var6 = this.field1133 - this.field1132;
        int var7 = var6 / this.field1134;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1204[this.field1137].method1329();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1136;
                        }
                        var11 /= this.field1136;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1131[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1134 * var10 + this.field1132;
                        class67 var17 = Statics.field1204[var15];
                        if (this.field1135 == 0) {
                            int var18 = this.field1134 / var17.field1267;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1333();
                                for (int var21 = 0; var21 < var17.field1267; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1134) {
                                float[] var23 = var17.method1333();
                                for (int var24 = 0; var24 < var17.field1267; var24++) {
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
