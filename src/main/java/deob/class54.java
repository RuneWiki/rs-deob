package deob;

@ObfuscatedName("br")
public class class54 {

    @ObfuscatedName("br.e")
    public int field1127 = class64.method1257(16);

    @ObfuscatedName("br.o")
    public int field1128 = class64.method1257(24);

    @ObfuscatedName("br.y")
    public int field1129 = class64.method1257(24);

    @ObfuscatedName("br.b")
    public int field1130 = class64.method1257(24) + 1;

    @ObfuscatedName("br.w")
    public int field1131 = class64.method1257(6) + 1;

    @ObfuscatedName("br.r")
    public int field1132 = class64.method1257(8);

    @ObfuscatedName("br.l")
    public int[] field1133;

    public class54() {
        int[] var1 = new int[this.field1131];
        for (int var2 = 0; var2 < this.field1131; var2++) {
            int var3 = 0;
            int var4 = class64.method1257(3);
            boolean var5 = class64.method1245() != 0;
            if (var5) {
                var3 = class64.method1257(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1133 = new int[this.field1131 * 8];
        for (int var6 = 0; var6 < this.field1131 * 8; var6++) {
            this.field1133[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class64.method1257(8);
        }
    }

    @ObfuscatedName("br.e([FIZ)V")
    public void method1047(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1203[this.field1132].field1262;
        int var6 = this.field1129 - this.field1128;
        int var7 = var6 / this.field1130;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1203[this.field1132].method1300();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1131;
                        }
                        var11 /= this.field1131;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1133[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1130 * var10 + this.field1128;
                        class67 var17 = Statics.field1203[var15];
                        if (this.field1127 == 0) {
                            int var18 = this.field1130 / var17.field1262;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1301();
                                for (int var21 = 0; var21 < var17.field1262; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1130) {
                                float[] var23 = var17.method1301();
                                for (int var24 = 0; var24 < var17.field1262; var24++) {
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
