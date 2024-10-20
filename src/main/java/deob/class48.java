package deob;

@ObfuscatedName("at")
public class class48 {

    @ObfuscatedName("at.a")
    public int field344 = class54.method1022(16);

    @ObfuscatedName("at.f")
    public int field343 = class54.method1022(24);

    @ObfuscatedName("at.c")
    public int field346 = class54.method1022(24);

    @ObfuscatedName("at.x")
    public int field345 = class54.method1022(24) + 1;

    @ObfuscatedName("at.h")
    public int field348 = class54.method1022(6) + 1;

    @ObfuscatedName("at.j")
    public int field342 = class54.method1022(8);

    @ObfuscatedName("at.y")
    public int[] field347;

    public class48() {
        int[] var1 = new int[this.field348];
        for (int var2 = 0; var2 < this.field348; var2++) {
            int var3 = 0;
            int var4 = class54.method1022(3);
            boolean var5 = class54.method998() != 0;
            if (var5) {
                var3 = class54.method1022(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field347 = new int[this.field348 * 8];
        for (int var6 = 0; var6 < this.field348 * 8; var6++) {
            this.field347[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class54.method1022(8);
        }
    }

    @ObfuscatedName("at.a([FIZ)V")
    public void method853(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field389[this.field342].field373;
        int var6 = this.field346 - this.field343;
        int var7 = var6 / this.field345;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field389[this.field342].method987();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field348;
                        }
                        var11 /= this.field348;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field347[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field345 * var10 + this.field343;
                        class53 var17 = Statics.field389[var15];
                        if (this.field344 == 0) {
                            int var18 = this.field345 / var17.field373;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method984();
                                for (int var21 = 0; var21 < var17.field373; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field345) {
                                float[] var23 = var17.method984();
                                for (int var24 = 0; var24 < var17.field373; var24++) {
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
