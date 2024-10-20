package deob;

@ObfuscatedName("x")
public class class24 {

    @ObfuscatedName("x.q")
    public int field321 = class131.method1537(16);

    @ObfuscatedName("x.l")
    public int field323 = class131.method1537(24);

    @ObfuscatedName("x.a")
    public int field317 = class131.method1537(24);

    @ObfuscatedName("x.o")
    public int field320 = class131.method1537(24) + 1;

    @ObfuscatedName("x.c")
    public int field318 = class131.method1537(6) + 1;

    @ObfuscatedName("x.h")
    public int field322 = class131.method1537(8);

    @ObfuscatedName("x.r")
    public int[] field319;

    public class24() {
        int[] var1 = new int[this.field318];
        for (int var2 = 0; var2 < this.field318; var2++) {
            int var3 = 0;
            int var4 = class131.method1537(3);
            boolean var5 = class131.method1542() != 0;
            if (var5) {
                var3 = class131.method1537(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field319 = new int[this.field318 * 8];
        for (int var6 = 0; var6 < this.field318 * 8; var6++) {
            this.field319[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class131.method1537(8);
        }
    }

    @ObfuscatedName("x.q([FIZ)V")
    public void method280(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1654[this.field322].field329;
        int var6 = this.field317 - this.field323;
        int var7 = var6 / this.field320;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1654[this.field322].method284();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field318;
                        }
                        var11 /= this.field318;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field319[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field320 * var10 + this.field323;
                        class25 var17 = Statics.field1654[var15];
                        if (this.field321 == 0) {
                            int var18 = this.field320 / var17.field329;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method285();
                                for (int var21 = 0; var21 < var17.field329; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field320) {
                                float[] var23 = var17.method285();
                                for (int var24 = 0; var24 < var17.field329; var24++) {
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
