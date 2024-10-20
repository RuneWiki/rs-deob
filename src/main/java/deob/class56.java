package deob;

@ObfuscatedName("by")
public class class56 {

    @ObfuscatedName("by.p")
    public int field1164 = class66.method1322(16);

    @ObfuscatedName("by.k")
    public int field1163 = class66.method1322(24);

    @ObfuscatedName("by.e")
    public int field1162 = class66.method1322(24);

    @ObfuscatedName("by.f")
    public int field1165 = class66.method1322(24) + 1;

    @ObfuscatedName("by.w")
    public int field1168 = class66.method1322(6) + 1;

    @ObfuscatedName("by.t")
    public int field1167 = class66.method1322(8);

    @ObfuscatedName("by.s")
    public int[] field1166;

    public class56() {
        int[] var1 = new int[this.field1168];
        for (int var2 = 0; var2 < this.field1168; var2++) {
            int var3 = 0;
            int var4 = class66.method1322(3);
            boolean var5 = class66.method1301() != 0;
            if (var5) {
                var3 = class66.method1322(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1166 = new int[this.field1168 * 8];
        for (int var6 = 0; var6 < this.field1168 * 8; var6++) {
            this.field1166[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class66.method1322(8);
        }
    }

    @ObfuscatedName("by.p([FIZ)V")
    public void method1102(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1238[this.field1167].field1299;
        int var6 = this.field1162 - this.field1163;
        int var7 = var6 / this.field1165;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1238[this.field1167].method1358();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1168;
                        }
                        var11 /= this.field1168;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1166[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1165 * var10 + this.field1163;
                        class69 var17 = Statics.field1238[var15];
                        if (this.field1164 == 0) {
                            int var18 = this.field1165 / var17.field1299;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1359();
                                for (int var21 = 0; var21 < var17.field1299; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1165) {
                                float[] var23 = var17.method1359();
                                for (int var24 = 0; var24 < var17.field1299; var24++) {
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
