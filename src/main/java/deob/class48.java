package deob;

@ObfuscatedName("aq")
public class class48 {

    @ObfuscatedName("aq.h")
    public int field361 = class54.method1017(16);

    @ObfuscatedName("aq.e")
    public int field359 = class54.method1017(24);

    @ObfuscatedName("aq.v")
    public int field360 = class54.method1017(24);

    @ObfuscatedName("aq.x")
    public int field362 = class54.method1017(24) + 1;

    @ObfuscatedName("aq.m")
    public int field363 = class54.method1017(6) + 1;

    @ObfuscatedName("aq.q")
    public int field364 = class54.method1017(8);

    @ObfuscatedName("aq.f")
    public int[] field365;

    public class48() {
        int[] var1 = new int[this.field363];
        for (int var2 = 0; var2 < this.field363; var2++) {
            int var3 = 0;
            int var4 = class54.method1017(3);
            boolean var5 = class54.method1037() != 0;
            if (var5) {
                var3 = class54.method1017(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field365 = new int[this.field363 * 8];
        for (int var6 = 0; var6 < this.field363 * 8; var6++) {
            this.field365[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class54.method1017(8);
        }
    }

    @ObfuscatedName("aq.h([FIZ)V")
    public void method858(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field406[this.field364].field390;
        int var6 = this.field360 - this.field359;
        int var7 = var6 / this.field362;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field406[this.field364].method1001();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field363;
                        }
                        var11 /= this.field363;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field365[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field362 * var10 + this.field359;
                        class53 var17 = Statics.field406[var15];
                        if (this.field361 == 0) {
                            int var18 = this.field362 / var17.field390;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1002();
                                for (int var21 = 0; var21 < var17.field390; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field362) {
                                float[] var23 = var17.method1002();
                                for (int var24 = 0; var24 < var17.field390; var24++) {
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
