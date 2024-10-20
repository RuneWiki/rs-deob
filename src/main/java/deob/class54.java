package deob;

@ObfuscatedName("bf")
public class class54 {

    @ObfuscatedName("bf.k")
    public int field1127 = class64.method1283(16);

    @ObfuscatedName("bf.r")
    public int field1126 = class64.method1283(24);

    @ObfuscatedName("bf.y")
    public int field1123 = class64.method1283(24);

    @ObfuscatedName("bf.w")
    public int field1124 = class64.method1283(24) + 1;

    @ObfuscatedName("bf.m")
    public int field1125 = class64.method1283(6) + 1;

    @ObfuscatedName("bf.j")
    public int field1121 = class64.method1283(8);

    @ObfuscatedName("bf.g")
    public int[] field1122;

    public class54() {
        int[] var1 = new int[this.field1125];
        for (int var2 = 0; var2 < this.field1125; var2++) {
            int var3 = 0;
            int var4 = class64.method1283(3);
            boolean var5 = class64.method1285() != 0;
            if (var5) {
                var3 = class64.method1283(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1122 = new int[this.field1125 * 8];
        for (int var6 = 0; var6 < this.field1125 * 8; var6++) {
            this.field1122[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class64.method1283(8);
        }
    }

    @ObfuscatedName("bf.k([FIZ)V")
    public void method1080(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1199[this.field1121].field1257;
        int var6 = this.field1123 - this.field1126;
        int var7 = var6 / this.field1124;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1199[this.field1121].method1350();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1125;
                        }
                        var11 /= this.field1125;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1122[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1124 * var10 + this.field1126;
                        class67 var17 = Statics.field1199[var15];
                        if (this.field1127 == 0) {
                            int var18 = this.field1124 / var17.field1257;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1348();
                                for (int var21 = 0; var21 < var17.field1257; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1124) {
                                float[] var23 = var17.method1348();
                                for (int var24 = 0; var24 < var17.field1257; var24++) {
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
