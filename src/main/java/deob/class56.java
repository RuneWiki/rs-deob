package deob;

@ObfuscatedName("bi")
public class class56 {

    @ObfuscatedName("bi.b")
    public int field1163 = class66.method1274(16);

    @ObfuscatedName("bi.e")
    public int field1159 = class66.method1274(24);

    @ObfuscatedName("bi.a")
    public int field1160 = class66.method1274(24);

    @ObfuscatedName("bi.k")
    public int field1158 = class66.method1274(24) + 1;

    @ObfuscatedName("bi.p")
    public int field1162 = class66.method1274(6) + 1;

    @ObfuscatedName("bi.l")
    public int field1161 = class66.method1274(8);

    @ObfuscatedName("bi.u")
    public int[] field1164;

    public class56() {
        int[] var1 = new int[this.field1162];
        for (int var2 = 0; var2 < this.field1162; var2++) {
            int var3 = 0;
            int var4 = class66.method1274(3);
            boolean var5 = class66.method1291() != 0;
            if (var5) {
                var3 = class66.method1274(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1164 = new int[this.field1162 * 8];
        for (int var6 = 0; var6 < this.field1162 * 8; var6++) {
            this.field1164[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class66.method1274(8);
        }
    }

    @ObfuscatedName("bi.b([FIZ)V")
    public void method1088(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1234[this.field1161].field1293;
        int var6 = this.field1160 - this.field1159;
        int var7 = var6 / this.field1158;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1234[this.field1161].method1321();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1162;
                        }
                        var11 /= this.field1162;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1164[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1158 * var10 + this.field1159;
                        class69 var17 = Statics.field1234[var15];
                        if (this.field1163 == 0) {
                            int var18 = this.field1158 / var17.field1293;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1326();
                                for (int var21 = 0; var21 < var17.field1293; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1158) {
                                float[] var23 = var17.method1326();
                                for (int var24 = 0; var24 < var17.field1293; var24++) {
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
