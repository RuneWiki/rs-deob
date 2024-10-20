package deob;

@ObfuscatedName("bl")
public class class57 {

    @ObfuscatedName("bl.v")
    public int field473 = class63.method865(16);

    @ObfuscatedName("bl.n")
    public int field474 = class63.method865(24);

    @ObfuscatedName("bl.f")
    public int field472 = class63.method865(24);

    @ObfuscatedName("bl.y")
    public int field475 = class63.method865(24) + 1;

    @ObfuscatedName("bl.p")
    public int field476 = class63.method865(6) + 1;

    @ObfuscatedName("bl.j")
    public int field477 = class63.method865(8);

    @ObfuscatedName("bl.r")
    public int[] field478;

    public class57() {
        int[] var1 = new int[this.field476];
        for (int var2 = 0; var2 < this.field476; var2++) {
            int var3 = 0;
            int var4 = class63.method865(3);
            boolean var5 = class63.method862() != 0;
            if (var5) {
                var3 = class63.method865(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field478 = new int[this.field476 * 8];
        for (int var6 = 0; var6 < this.field476 * 8; var6++) {
            this.field478[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class63.method865(8);
        }
    }

    @ObfuscatedName("bl.v([FIZ)V")
    public void method711(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field519[this.field477].field504;
        int var6 = this.field472 - this.field474;
        int var7 = var6 / this.field475;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field519[this.field477].method853();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field476;
                        }
                        var11 /= this.field476;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field478[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field475 * var10 + this.field474;
                        class62 var17 = Statics.field519[var15];
                        if (this.field473 == 0) {
                            int var18 = this.field475 / var17.field504;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method854();
                                for (int var21 = 0; var21 < var17.field504; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field475) {
                                float[] var23 = var17.method854();
                                for (int var24 = 0; var24 < var17.field504; var24++) {
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
