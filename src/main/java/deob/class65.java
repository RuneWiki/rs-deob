package deob;

@ObfuscatedName("bx")
public class class65 {

    @ObfuscatedName("bx.d")
    public int field1083 = class55.method976(16);

    @ObfuscatedName("bx.c")
    public int field1078 = class55.method976(24);

    @ObfuscatedName("bx.n")
    public int field1077 = class55.method976(24);

    @ObfuscatedName("bx.q")
    public int field1080 = class55.method976(24) + 1;

    @ObfuscatedName("bx.t")
    public int field1081 = class55.method976(6) + 1;

    @ObfuscatedName("bx.p")
    public int field1082 = class55.method976(8);

    @ObfuscatedName("bx.u")
    public int[] field1079;

    public class65() {
        int[] var1 = new int[this.field1081];
        for (int var2 = 0; var2 < this.field1081; var2++) {
            int var3 = 0;
            int var4 = class55.method976(3);
            boolean var5 = class55.method977() != 0;
            if (var5) {
                var3 = class55.method976(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1079 = new int[this.field1081 * 8];
        for (int var6 = 0; var6 < this.field1081 * 8; var6++) {
            this.field1079[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class55.method976(8);
        }
    }

    @ObfuscatedName("bx.d([FIZ)V")
    public void method1136(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field989[this.field1082].field973;
        int var6 = this.field1077 - this.field1078;
        int var7 = var6 / this.field1080;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field989[this.field1082].method949();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1081;
                        }
                        var11 /= this.field1081;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1079[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1080 * var10 + this.field1078;
                        class53 var17 = Statics.field989[var15];
                        if (this.field1083 == 0) {
                            int var18 = this.field1080 / var17.field973;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method952();
                                for (int var21 = 0; var21 < var17.field973; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1080) {
                                float[] var23 = var17.method952();
                                for (int var24 = 0; var24 < var17.field973; var24++) {
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
