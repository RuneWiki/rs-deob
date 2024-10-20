package deob;

@ObfuscatedName("as")
public class class51 {

    @ObfuscatedName("as.m")
    public int field1098 = class61.method1262(16);

    @ObfuscatedName("as.k")
    public int field1094 = class61.method1262(24);

    @ObfuscatedName("as.y")
    public int field1093 = class61.method1262(24);

    @ObfuscatedName("as.g")
    public int field1096 = class61.method1262(24) + 1;

    @ObfuscatedName("as.r")
    public int field1097 = class61.method1262(6) + 1;

    @ObfuscatedName("as.i")
    public int field1095 = class61.method1262(8);

    @ObfuscatedName("as.f")
    public int[] field1099;

    public class51() {
        int[] var1 = new int[this.field1097];
        for (int var2 = 0; var2 < this.field1097; var2++) {
            int var3 = 0;
            int var4 = class61.method1262(3);
            boolean var5 = class61.method1241() != 0;
            if (var5) {
                var3 = class61.method1262(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1099 = new int[this.field1097 * 8];
        for (int var6 = 0; var6 < this.field1097 * 8; var6++) {
            this.field1099[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class61.method1262(8);
        }
    }

    @ObfuscatedName("as.m([FIZ)V")
    public void method1054(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1169[this.field1095].field1226;
        int var6 = this.field1093 - this.field1094;
        int var7 = var6 / this.field1096;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1169[this.field1095].method1294();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1097;
                        }
                        var11 /= this.field1097;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1099[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1096 * var10 + this.field1094;
                        class64 var17 = Statics.field1169[var15];
                        if (this.field1098 == 0) {
                            int var18 = this.field1096 / var17.field1226;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1295();
                                for (int var21 = 0; var21 < var17.field1226; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1096) {
                                float[] var23 = var17.method1295();
                                for (int var24 = 0; var24 < var17.field1226; var24++) {
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
