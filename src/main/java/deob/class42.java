package deob;

@ObfuscatedName("ab")
public class class42 {

    @ObfuscatedName("ab.v")
    public int field325 = class48.method934(16);

    @ObfuscatedName("ab.c")
    public int field322 = class48.method934(24);

    @ObfuscatedName("ab.i")
    public int field323 = class48.method934(24);

    @ObfuscatedName("ab.f")
    public int field324 = class48.method934(24) + 1;

    @ObfuscatedName("ab.b")
    public int field327 = class48.method934(6) + 1;

    @ObfuscatedName("ab.n")
    public int field326 = class48.method934(8);

    @ObfuscatedName("ab.s")
    public int[] field321;

    public class42() {
        int[] var1 = new int[this.field327];
        for (int var2 = 0; var2 < this.field327; var2++) {
            int var3 = 0;
            int var4 = class48.method934(3);
            boolean var5 = class48.method933() != 0;
            if (var5) {
                var3 = class48.method934(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field321 = new int[this.field327 * 8];
        for (int var6 = 0; var6 < this.field327 * 8; var6++) {
            this.field321[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class48.method934(8);
        }
    }

    @ObfuscatedName("ab.v([FIZ)V")
    public void method758(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field368[this.field326].field352;
        int var6 = this.field323 - this.field322;
        int var7 = var6 / this.field324;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field368[this.field326].method925();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field327;
                        }
                        var11 /= this.field327;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field321[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field324 * var10 + this.field322;
                        class47 var17 = Statics.field368[var15];
                        if (this.field325 == 0) {
                            int var18 = this.field324 / var17.field352;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method926();
                                for (int var21 = 0; var21 < var17.field352; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field324) {
                                float[] var23 = var17.method926();
                                for (int var24 = 0; var24 < var17.field352; var24++) {
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
