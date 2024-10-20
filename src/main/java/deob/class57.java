package deob;

@ObfuscatedName("bb")
public class class57 {

    @ObfuscatedName("bb.f")
    public int field434 = class63.method860(16);

    @ObfuscatedName("bb.o")
    public int field432 = class63.method860(24);

    @ObfuscatedName("bb.u")
    public int field433 = class63.method860(24);

    @ObfuscatedName("bb.p")
    public int field435 = class63.method860(24) + 1;

    @ObfuscatedName("bb.b")
    public int field436 = class63.method860(6) + 1;

    @ObfuscatedName("bb.e")
    public int field437 = class63.method860(8);

    @ObfuscatedName("bb.k")
    public int[] field438;

    public class57() {
        int[] var1 = new int[this.field436];
        for (int var2 = 0; var2 < this.field436; var2++) {
            int var3 = 0;
            int var4 = class63.method860(3);
            boolean var5 = class63.method839() != 0;
            if (var5) {
                var3 = class63.method860(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field438 = new int[this.field436 * 8];
        for (int var6 = 0; var6 < this.field436 * 8; var6++) {
            this.field438[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class63.method860(8);
        }
    }

    @ObfuscatedName("bb.f([FIZ)V")
    public void method694(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field479[this.field437].field464;
        int var6 = this.field433 - this.field432;
        int var7 = var6 / this.field435;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field479[this.field437].method831();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field436;
                        }
                        var11 /= this.field436;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field438[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field435 * var10 + this.field432;
                        class62 var17 = Statics.field479[var15];
                        if (this.field434 == 0) {
                            int var18 = this.field435 / var17.field464;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method832();
                                for (int var21 = 0; var21 < var17.field464; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field435) {
                                float[] var23 = var17.method832();
                                for (int var24 = 0; var24 < var17.field464; var24++) {
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
