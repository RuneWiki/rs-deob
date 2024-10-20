package deob;

@ObfuscatedName("bg")
public class class47 {

    @ObfuscatedName("bg.ac")
    public int field340;

    @ObfuscatedName("bg.al")
    public int field339;

    @ObfuscatedName("bg.ak")
    public int field337;

    @ObfuscatedName("bg.ax")
    public int field343;

    @ObfuscatedName("bg.ao")
    public int field341;

    @ObfuscatedName("bg.ah")
    public int field342;

    @ObfuscatedName("bg.ar")
    public int[] field338;

    public class47() {
        class61 var1 = class55.field406;
        this.field340 = var1.method1098(16);
        this.field339 = var1.method1098(24);
        this.field337 = var1.method1098(24);
        this.field343 = var1.method1098(24) + 1;
        this.field341 = var1.method1098(6) + 1;
        this.field342 = var1.method1098(8);
        int[] var2 = new int[this.field341];
        for (int var3 = 0; var3 < this.field341; var3++) {
            int var4 = 0;
            int var5 = var1.method1098(3);
            boolean var6 = var1.method1099() != 0;
            if (var6) {
                var4 = var1.method1098(5);
            }
            var2[var3] = var4 << 3 | var5;
        }
        this.field338 = new int[this.field341 * 8];
        for (int var7 = 0; var7 < this.field341 * 8; var7++) {
            this.field338[var7] = (var2[var7 >> 3] & 0x1 << (var7 & 0x7)) == 0 ? -1 : var1.method1098(8);
        }
    }

    @ObfuscatedName("bg.ac([FIZLcz;)V")
    public void method837(float[] arg0, int arg1, boolean arg2, class61 arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[var5] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var6 = Statics.field397[this.field342].field377;
        int var7 = this.field337 - this.field339;
        int var8 = var7 / this.field343;
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < 8; var10++) {
            int var11 = 0;
            while (var11 < var8) {
                if (var10 == 0) {
                    int var12 = Statics.field397[this.field342].method991(arg3);
                    for (int var13 = var6 - 1; var13 >= 0; var13--) {
                        if (var11 + var13 < var8) {
                            var9[var11 + var13] = var12 % this.field341;
                        }
                        var12 /= this.field341;
                    }
                }
                for (int var14 = 0; var14 < var6; var14++) {
                    int var15 = var9[var11];
                    int var16 = this.field338[var15 * 8 + var10];
                    if (var16 >= 0) {
                        int var17 = this.field343 * var11 + this.field339;
                        class53 var18 = Statics.field397[var16];
                        if (this.field340 == 0) {
                            int var19 = this.field343 / var18.field377;
                            for (int var20 = 0; var20 < var19; var20++) {
                                float[] var21 = var18.method995(arg3);
                                for (int var22 = 0; var22 < var18.field377; var22++) {
                                    arg0[var19 * var22 + var17 + var20] += var21[var22];
                                }
                            }
                        } else {
                            int var23 = 0;
                            while (var23 < this.field343) {
                                float[] var24 = var18.method995(arg3);
                                for (int var25 = 0; var25 < var18.field377; var25++) {
                                    arg0[var17 + var23] += var24[var25];
                                    var23++;
                                }
                            }
                        }
                    }
                    var11++;
                    if (var11 >= var8) {
                        break;
                    }
                }
            }
        }
    }
}
