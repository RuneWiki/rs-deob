package deob;

@ObfuscatedName("bn")
public class class55 {

    @ObfuscatedName("bn.p")
    public int field1122 = class65.method1302(16);

    @ObfuscatedName("bn.y")
    public int field1118 = class65.method1302(24);

    @ObfuscatedName("bn.d")
    public int field1117 = class65.method1302(24);

    @ObfuscatedName("bn.c")
    public int field1120 = class65.method1302(24) + 1;

    @ObfuscatedName("bn.r")
    public int field1121 = class65.method1302(6) + 1;

    @ObfuscatedName("bn.f")
    public int field1119 = class65.method1302(8);

    @ObfuscatedName("bn.z")
    public int[] field1123;

    public class55() {
        int[] var1 = new int[this.field1121];
        for (int var2 = 0; var2 < this.field1121; var2++) {
            int var3 = 0;
            int var4 = class65.method1302(3);
            boolean var5 = class65.method1299() != 0;
            if (var5) {
                var3 = class65.method1302(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1123 = new int[this.field1121 * 8];
        for (int var6 = 0; var6 < this.field1121 * 8; var6++) {
            this.field1123[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class65.method1302(8);
        }
    }

    @ObfuscatedName("bn.p([FIZ)V")
    public void method1085(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1193[this.field1119].field1255;
        int var6 = this.field1117 - this.field1118;
        int var7 = var6 / this.field1120;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1193[this.field1119].method1353();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1121;
                        }
                        var11 /= this.field1121;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1123[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1120 * var10 + this.field1118;
                        class68 var17 = Statics.field1193[var15];
                        if (this.field1122 == 0) {
                            int var18 = this.field1120 / var17.field1255;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1354();
                                for (int var21 = 0; var21 < var17.field1255; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1120) {
                                float[] var23 = var17.method1354();
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
