package deob;

@ObfuscatedName("ba")
public class class56 {

    @ObfuscatedName("ba.y")
    public int field1156 = class66.method1320(16);

    @ObfuscatedName("ba.k")
    public int field1154 = class66.method1320(24);

    @ObfuscatedName("ba.g")
    public int field1152 = class66.method1320(24);

    @ObfuscatedName("ba.n")
    public int field1155 = class66.method1320(24) + 1;

    @ObfuscatedName("ba.t")
    public int field1153 = class66.method1320(6) + 1;

    @ObfuscatedName("ba.e")
    public int field1157 = class66.method1320(8);

    @ObfuscatedName("ba.q")
    public int[] field1158;

    public class56() {
        int[] var1 = new int[this.field1153];
        for (int var2 = 0; var2 < this.field1153; var2++) {
            int var3 = 0;
            int var4 = class66.method1320(3);
            boolean var5 = class66.method1319() != 0;
            if (var5) {
                var3 = class66.method1320(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1158 = new int[this.field1153 * 8];
        for (int var6 = 0; var6 < this.field1153 * 8; var6++) {
            this.field1158[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class66.method1320(8);
        }
    }

    @ObfuscatedName("ba.y([FIZ)V")
    public void method1126(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1228[this.field1157].field1289;
        int var6 = this.field1152 - this.field1154;
        int var7 = var6 / this.field1155;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1228[this.field1157].method1368();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1153;
                        }
                        var11 /= this.field1153;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1158[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1155 * var10 + this.field1154;
                        class69 var17 = Statics.field1228[var15];
                        if (this.field1156 == 0) {
                            int var18 = this.field1155 / var17.field1289;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1376();
                                for (int var21 = 0; var21 < var17.field1289; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1155) {
                                float[] var23 = var17.method1376();
                                for (int var24 = 0; var24 < var17.field1289; var24++) {
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
