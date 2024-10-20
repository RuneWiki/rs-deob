package deob;

@ObfuscatedName("bv")
public class class59 {

    @ObfuscatedName("bv.x")
    public int field1183 = class53.method1161(16);

    @ObfuscatedName("bv.p")
    public int field1188 = class53.method1161(24);

    @ObfuscatedName("bv.k")
    public int field1185 = class53.method1161(24);

    @ObfuscatedName("bv.a")
    public int field1186 = class53.method1161(24) + 1;

    @ObfuscatedName("bv.q")
    public int field1187 = class53.method1161(6) + 1;

    @ObfuscatedName("bv.j")
    public int field1189 = class53.method1161(8);

    @ObfuscatedName("bv.v")
    public int[] field1184;

    public class59() {
        int[] var1 = new int[this.field1187];
        for (int var2 = 0; var2 < this.field1187; var2++) {
            int var3 = 0;
            int var4 = class53.method1161(3);
            boolean var5 = class53.method1160() != 0;
            if (var5) {
                var3 = class53.method1161(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1184 = new int[this.field1187 * 8];
        for (int var6 = 0; var6 < this.field1187 * 8; var6++) {
            this.field1184[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class53.method1161(8);
        }
    }

    @ObfuscatedName("bv.x([FIZ)V")
    public void method1252(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1102[this.field1189].field1190;
        int var6 = this.field1185 - this.field1188;
        int var7 = var6 / this.field1186;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1102[this.field1189].method1255();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1187;
                        }
                        var11 /= this.field1187;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1184[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1186 * var10 + this.field1188;
                        class60 var17 = Statics.field1102[var15];
                        if (this.field1183 == 0) {
                            int var18 = this.field1186 / var17.field1190;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1261();
                                for (int var21 = 0; var21 < var17.field1190; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1186) {
                                float[] var23 = var17.method1261();
                                for (int var24 = 0; var24 < var17.field1190; var24++) {
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
