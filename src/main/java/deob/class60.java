package deob;

@ObfuscatedName("bd")
public class class60 {

    @ObfuscatedName("bd.e")
    public int field1231 = class54.method1268(16);

    @ObfuscatedName("bd.i")
    public int field1230 = class54.method1268(24);

    @ObfuscatedName("bd.k")
    public int field1233 = class54.method1268(24);

    @ObfuscatedName("bd.q")
    public int field1232 = class54.method1268(24) + 1;

    @ObfuscatedName("bd.j")
    public int field1234 = class54.method1268(6) + 1;

    @ObfuscatedName("bd.z")
    public int field1229 = class54.method1268(8);

    @ObfuscatedName("bd.m")
    public int[] field1235;

    public class60() {
        int[] var1 = new int[this.field1234];
        for (int var2 = 0; var2 < this.field1234; var2++) {
            int var3 = 0;
            int var4 = class54.method1268(3);
            boolean var5 = class54.method1238() != 0;
            if (var5) {
                var3 = class54.method1268(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1235 = new int[this.field1234 * 8];
        for (int var6 = 0; var6 < this.field1234 * 8; var6++) {
            this.field1235[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class54.method1268(8);
        }
    }

    @ObfuscatedName("bd.e([FIZ)V")
    public void method1338(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1162[this.field1229].field1241;
        int var6 = this.field1233 - this.field1230;
        int var7 = var6 / this.field1232;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1162[this.field1229].method1343();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1234;
                        }
                        var11 /= this.field1234;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1235[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1232 * var10 + this.field1230;
                        class61 var17 = Statics.field1162[var15];
                        if (this.field1231 == 0) {
                            int var18 = this.field1232 / var17.field1241;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1351();
                                for (int var21 = 0; var21 < var17.field1241; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1232) {
                                float[] var23 = var17.method1351();
                                for (int var24 = 0; var24 < var17.field1241; var24++) {
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
