package deob;

@ObfuscatedName("bc")
public class class65 {

    @ObfuscatedName("bc.b")
    public int field1083 = class55.method1033(16);

    @ObfuscatedName("bc.l")
    public int field1086 = class55.method1033(24);

    @ObfuscatedName("bc.i")
    public int field1081 = class55.method1033(24);

    @ObfuscatedName("bc.t")
    public int field1084 = class55.method1033(24) + 1;

    @ObfuscatedName("bc.k")
    public int field1085 = class55.method1033(6) + 1;

    @ObfuscatedName("bc.h")
    public int field1082 = class55.method1033(8);

    @ObfuscatedName("bc.n")
    public int[] field1087;

    public class65() {
        int[] var1 = new int[this.field1085];
        for (int var2 = 0; var2 < this.field1085; var2++) {
            int var3 = 0;
            int var4 = class55.method1033(3);
            boolean var5 = class55.method1036() != 0;
            if (var5) {
                var3 = class55.method1033(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1087 = new int[this.field1085 * 8];
        for (int var6 = 0; var6 < this.field1085 * 8; var6++) {
            this.field1087[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class55.method1033(8);
        }
    }

    @ObfuscatedName("bc.b([FIZ)V")
    public void method1175(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1004[this.field1082].field967;
        int var6 = this.field1081 - this.field1086;
        int var7 = var6 / this.field1084;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1004[this.field1082].method1004();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1085;
                        }
                        var11 /= this.field1085;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1087[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1084 * var10 + this.field1086;
                        class53 var17 = Statics.field1004[var15];
                        if (this.field1083 == 0) {
                            int var18 = this.field1084 / var17.field967;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1006();
                                for (int var21 = 0; var21 < var17.field967; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1084) {
                                float[] var23 = var17.method1006();
                                for (int var24 = 0; var24 < var17.field967; var24++) {
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
