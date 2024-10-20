package deob;

@ObfuscatedName("ay")
public class class42 {

    @ObfuscatedName("ay.n")
    public int field317 = class48.method929(16);

    @ObfuscatedName("ay.c")
    public int field313 = class48.method929(24);

    @ObfuscatedName("ay.m")
    public int field312 = class48.method929(24);

    @ObfuscatedName("ay.k")
    public int field314 = class48.method929(24) + 1;

    @ObfuscatedName("ay.o")
    public int field316 = class48.method929(6) + 1;

    @ObfuscatedName("ay.g")
    public int field315 = class48.method929(8);

    @ObfuscatedName("ay.z")
    public int[] field318;

    public class42() {
        int[] var1 = new int[this.field316];
        for (int var2 = 0; var2 < this.field316; var2++) {
            int var3 = 0;
            int var4 = class48.method929(3);
            boolean var5 = class48.method928() != 0;
            if (var5) {
                var3 = class48.method929(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field318 = new int[this.field316 * 8];
        for (int var6 = 0; var6 < this.field316 * 8; var6++) {
            this.field318[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class48.method929(8);
        }
    }

    @ObfuscatedName("ay.n([FIZ)V")
    public void method765(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field359[this.field315].field347;
        int var6 = this.field312 - this.field313;
        int var7 = var6 / this.field314;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field359[this.field315].method916();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field316;
                        }
                        var11 /= this.field316;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field318[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field314 * var10 + this.field313;
                        class47 var17 = Statics.field359[var15];
                        if (this.field317 == 0) {
                            int var18 = this.field314 / var17.field347;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method917();
                                for (int var21 = 0; var21 < var17.field347; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field314) {
                                float[] var23 = var17.method917();
                                for (int var24 = 0; var24 < var17.field347; var24++) {
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
