package deob;

@ObfuscatedName("bb")
public class class57 {

    @ObfuscatedName("bb.f")
    public int field453 = class63.method898(16);

    @ObfuscatedName("bb.e")
    public int field451 = class63.method898(24);

    @ObfuscatedName("bb.v")
    public int field452 = class63.method898(24);

    @ObfuscatedName("bb.y")
    public int field450 = class63.method898(24) + 1;

    @ObfuscatedName("bb.j")
    public int field454 = class63.method898(6) + 1;

    @ObfuscatedName("bb.o")
    public int field455 = class63.method898(8);

    @ObfuscatedName("bb.m")
    public int[] field456;

    public class57() {
        int[] var1 = new int[this.field454];
        for (int var2 = 0; var2 < this.field454; var2++) {
            int var3 = 0;
            int var4 = class63.method898(3);
            boolean var5 = class63.method897() != 0;
            if (var5) {
                var3 = class63.method898(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field456 = new int[this.field454 * 8];
        for (int var6 = 0; var6 < this.field454 * 8; var6++) {
            this.field456[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class63.method898(8);
        }
    }

    @ObfuscatedName("bb.f([FIZ)V")
    public void method750(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field507[this.field455].field484;
        int var6 = this.field452 - this.field451;
        int var7 = var6 / this.field450;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field507[this.field455].method882();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field454;
                        }
                        var11 /= this.field454;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field456[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field450 * var10 + this.field451;
                        class62 var17 = Statics.field507[var15];
                        if (this.field453 == 0) {
                            int var18 = this.field450 / var17.field484;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method884();
                                for (int var21 = 0; var21 < var17.field484; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field450) {
                                float[] var23 = var17.method884();
                                for (int var24 = 0; var24 < var17.field484; var24++) {
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
