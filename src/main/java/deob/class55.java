package deob;

@ObfuscatedName("bi")
public class class55 {

    @ObfuscatedName("bi.a")
    public int field1134 = class65.method1278(16);

    @ObfuscatedName("bi.v")
    public int field1136 = class65.method1278(24);

    @ObfuscatedName("bi.i")
    public int field1133 = class65.method1278(24);

    @ObfuscatedName("bi.b")
    public int field1132 = class65.method1278(24) + 1;

    @ObfuscatedName("bi.l")
    public int field1135 = class65.method1278(6) + 1;

    @ObfuscatedName("bi.m")
    public int field1131 = class65.method1278(8);

    @ObfuscatedName("bi.w")
    public int[] field1137;

    public class55() {
        int[] var1 = new int[this.field1135];
        for (int var2 = 0; var2 < this.field1135; var2++) {
            int var3 = 0;
            int var4 = class65.method1278(3);
            boolean var5 = class65.method1288() != 0;
            if (var5) {
                var3 = class65.method1278(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1137 = new int[this.field1135 * 8];
        for (int var6 = 0; var6 < this.field1135 * 8; var6++) {
            this.field1137[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class65.method1278(8);
        }
    }

    @ObfuscatedName("bi.a([FIZ)V")
    public void method1077(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1200[this.field1131].field1268;
        int var6 = this.field1133 - this.field1136;
        int var7 = var6 / this.field1132;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1200[this.field1131].method1318();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1135;
                        }
                        var11 /= this.field1135;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1137[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1132 * var10 + this.field1136;
                        class68 var17 = Statics.field1200[var15];
                        if (this.field1134 == 0) {
                            int var18 = this.field1132 / var17.field1268;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1319();
                                for (int var21 = 0; var21 < var17.field1268; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1132) {
                                float[] var23 = var17.method1319();
                                for (int var24 = 0; var24 < var17.field1268; var24++) {
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
