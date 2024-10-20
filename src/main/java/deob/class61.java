package deob;

@ObfuscatedName("ba")
public class class61 {

    @ObfuscatedName("ba.n")
    public int field1214 = class71.method1426(16);

    @ObfuscatedName("ba.d")
    public int field1210 = class71.method1426(24);

    @ObfuscatedName("ba.s")
    public int field1211 = class71.method1426(24);

    @ObfuscatedName("ba.q")
    public int field1212 = class71.method1426(24) + 1;

    @ObfuscatedName("ba.j")
    public int field1213 = class71.method1426(6) + 1;

    @ObfuscatedName("ba.k")
    public int field1209 = class71.method1426(8);

    @ObfuscatedName("ba.i")
    public int[] field1215;

    public class61() {
        int[] var1 = new int[this.field1213];
        for (int var2 = 0; var2 < this.field1213; var2++) {
            int var3 = 0;
            int var4 = class71.method1426(3);
            boolean var5 = class71.method1434() != 0;
            if (var5) {
                var3 = class71.method1426(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1215 = new int[this.field1213 * 8];
        for (int var6 = 0; var6 < this.field1213 * 8; var6++) {
            this.field1215[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class71.method1426(8);
        }
    }

    @ObfuscatedName("ba.n([FIZ)V")
    public void method1207(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1285[this.field1209].field1346;
        int var6 = this.field1211 - this.field1210;
        int var7 = var6 / this.field1212;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1285[this.field1209].method1450();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1213;
                        }
                        var11 /= this.field1213;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1215[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1212 * var10 + this.field1210;
                        class74 var17 = Statics.field1285[var15];
                        if (this.field1214 == 0) {
                            int var18 = this.field1212 / var17.field1346;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1449();
                                for (int var21 = 0; var21 < var17.field1346; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1212) {
                                float[] var23 = var17.method1449();
                                for (int var24 = 0; var24 < var17.field1346; var24++) {
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
