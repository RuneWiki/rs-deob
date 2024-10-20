package deob;

@ObfuscatedName("bx")
public class class54 {

    @ObfuscatedName("bx.n")
    public int field1121 = class64.method1281(16);

    @ObfuscatedName("bx.x")
    public int field1119 = class64.method1281(24);

    @ObfuscatedName("bx.k")
    public int field1120 = class64.method1281(24);

    @ObfuscatedName("bx.i")
    public int field1123 = class64.method1281(24) + 1;

    @ObfuscatedName("bx.d")
    public int field1122 = class64.method1281(6) + 1;

    @ObfuscatedName("bx.q")
    public int field1118 = class64.method1281(8);

    @ObfuscatedName("bx.m")
    public int[] field1124;

    public class54() {
        int[] var1 = new int[this.field1122];
        for (int var2 = 0; var2 < this.field1122; var2++) {
            int var3 = 0;
            int var4 = class64.method1281(3);
            boolean var5 = class64.method1291() != 0;
            if (var5) {
                var3 = class64.method1281(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1124 = new int[this.field1122 * 8];
        for (int var6 = 0; var6 < this.field1122 * 8; var6++) {
            this.field1124[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class64.method1281(8);
        }
    }

    @ObfuscatedName("bx.n([FIZ)V")
    public void method1084(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1194[this.field1118].field1255;
        int var6 = this.field1120 - this.field1119;
        int var7 = var6 / this.field1123;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1194[this.field1118].method1323();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1122;
                        }
                        var11 /= this.field1122;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1124[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1123 * var10 + this.field1119;
                        class67 var17 = Statics.field1194[var15];
                        if (this.field1121 == 0) {
                            int var18 = this.field1123 / var17.field1255;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1327();
                                for (int var21 = 0; var21 < var17.field1255; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1123) {
                                float[] var23 = var17.method1327();
                                for (int var24 = 0; var24 < var17.field1255; var24++) {
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
