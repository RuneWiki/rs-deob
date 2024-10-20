package deob;

@ObfuscatedName("bv")
public class class47 {

    @ObfuscatedName("bv.af")
    public int field342 = class53.method1030(16);

    @ObfuscatedName("bv.an")
    public int field345 = class53.method1030(24);

    @ObfuscatedName("bv.aw")
    public int field343 = class53.method1030(24);

    @ObfuscatedName("bv.ac")
    public int field344 = class53.method1030(24) + 1;

    @ObfuscatedName("bv.au")
    public int field341 = class53.method1030(6) + 1;

    @ObfuscatedName("bv.ab")
    public int field346 = class53.method1030(8);

    @ObfuscatedName("bv.aq")
    public int[] field347;

    public class47() {
        int[] var1 = new int[this.field341];
        for (int var2 = 0; var2 < this.field341; var2++) {
            int var3 = 0;
            int var4 = class53.method1030(3);
            boolean var5 = class53.method1031() != 0;
            if (var5) {
                var3 = class53.method1030(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field347 = new int[this.field341 * 8];
        for (int var6 = 0; var6 < this.field341 * 8; var6++) {
            this.field347[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class53.method1030(8);
        }
    }

    @ObfuscatedName("bv.af([FIZ)V")
    public void method868(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field388[this.field346].field372;
        int var6 = this.field343 - this.field345;
        int var7 = var6 / this.field344;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field388[this.field346].method998();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field341;
                        }
                        var11 /= this.field341;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field347[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field344 * var10 + this.field345;
                        class52 var17 = Statics.field388[var15];
                        if (this.field342 == 0) {
                            int var18 = this.field344 / var17.field372;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1001();
                                for (int var21 = 0; var21 < var17.field372; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field344) {
                                float[] var23 = var17.method1001();
                                for (int var24 = 0; var24 < var17.field372; var24++) {
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
