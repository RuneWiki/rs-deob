package deob;

@ObfuscatedName("bx")
public class class59 {

    @ObfuscatedName("bx.b")
    public int field1228 = class53.method1179(16);

    @ObfuscatedName("bx.c")
    public int field1227 = class53.method1179(24);

    @ObfuscatedName("bx.j")
    public int field1224 = class53.method1179(24);

    @ObfuscatedName("bx.i")
    public int field1222 = class53.method1179(24) + 1;

    @ObfuscatedName("bx.k")
    public int field1226 = class53.method1179(6) + 1;

    @ObfuscatedName("bx.q")
    public int field1225 = class53.method1179(8);

    @ObfuscatedName("bx.t")
    public int[] field1223;

    public class59() {
        int[] var1 = new int[this.field1226];
        for (int var2 = 0; var2 < this.field1226; var2++) {
            int var3 = 0;
            int var4 = class53.method1179(3);
            boolean var5 = class53.method1202() != 0;
            if (var5) {
                var3 = class53.method1179(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1223 = new int[this.field1226 * 8];
        for (int var6 = 0; var6 < this.field1226 * 8; var6++) {
            this.field1223[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class53.method1179(8);
        }
    }

    @ObfuscatedName("bx.b([FIZ)V")
    public void method1267(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1136[this.field1225].field1233;
        int var6 = this.field1224 - this.field1227;
        int var7 = var6 / this.field1222;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1136[this.field1225].method1283();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1226;
                        }
                        var11 /= this.field1226;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1223[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1222 * var10 + this.field1227;
                        class60 var17 = Statics.field1136[var15];
                        if (this.field1228 == 0) {
                            int var18 = this.field1222 / var17.field1233;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1278();
                                for (int var21 = 0; var21 < var17.field1233; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1222) {
                                float[] var23 = var17.method1278();
                                for (int var24 = 0; var24 < var17.field1233; var24++) {
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
