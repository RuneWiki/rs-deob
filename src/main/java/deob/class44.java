package deob;

@ObfuscatedName("aw")
public class class44 {

    @ObfuscatedName("aw.o")
    public int field331 = class50.method927(16);

    @ObfuscatedName("aw.q")
    public int field327 = class50.method927(24);

    @ObfuscatedName("aw.l")
    public int field330 = class50.method927(24);

    @ObfuscatedName("aw.k")
    public int field328 = class50.method927(24) + 1;

    @ObfuscatedName("aw.a")
    public int field326 = class50.method927(6) + 1;

    @ObfuscatedName("aw.m")
    public int field329 = class50.method927(8);

    @ObfuscatedName("aw.p")
    public int[] field332;

    public class44() {
        int[] var1 = new int[this.field326];
        for (int var2 = 0; var2 < this.field326; var2++) {
            int var3 = 0;
            int var4 = class50.method927(3);
            boolean var5 = class50.method926() != 0;
            if (var5) {
                var3 = class50.method927(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field332 = new int[this.field326 * 8];
        for (int var6 = 0; var6 < this.field326 * 8; var6++) {
            this.field332[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class50.method927(8);
        }
    }

    @ObfuscatedName("aw.o([FIZ)V")
    public void method765(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field373[this.field329].field356;
        int var6 = this.field330 - this.field327;
        int var7 = var6 / this.field328;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field373[this.field329].method912();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field326;
                        }
                        var11 /= this.field326;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field332[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field328 * var10 + this.field327;
                        class49 var17 = Statics.field373[var15];
                        if (this.field331 == 0) {
                            int var18 = this.field328 / var17.field356;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method913();
                                for (int var21 = 0; var21 < var17.field356; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field328) {
                                float[] var23 = var17.method913();
                                for (int var24 = 0; var24 < var17.field356; var24++) {
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
