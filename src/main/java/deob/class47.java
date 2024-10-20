package deob;

@ObfuscatedName("bx")
public class class47 {

    @ObfuscatedName("bx.aj")
    public int field333 = class53.method997(16);

    @ObfuscatedName("bx.al")
    public int field328 = class53.method997(24);

    @ObfuscatedName("bx.ac")
    public int field329 = class53.method997(24);

    @ObfuscatedName("bx.ab")
    public int field330 = class53.method997(24) + 1;

    @ObfuscatedName("bx.an")
    public int field331 = class53.method997(6) + 1;

    @ObfuscatedName("bx.ao")
    public int field332 = class53.method997(8);

    @ObfuscatedName("bx.av")
    public int[] field327;

    public class47() {
        int[] var1 = new int[this.field331];
        for (int var2 = 0; var2 < this.field331; var2++) {
            int var3 = 0;
            int var4 = class53.method997(3);
            boolean var5 = class53.method1027() != 0;
            if (var5) {
                var3 = class53.method997(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field327 = new int[this.field331 * 8];
        for (int var6 = 0; var6 < this.field331 * 8; var6++) {
            this.field327[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class53.method997(8);
        }
    }

    @ObfuscatedName("bx.aj([FIZ)V")
    public void method827(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field374[this.field332].field357;
        int var6 = this.field329 - this.field328;
        int var7 = var6 / this.field330;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field374[this.field332].method982();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field331;
                        }
                        var11 /= this.field331;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field327[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field330 * var10 + this.field328;
                        class52 var17 = Statics.field374[var15];
                        if (this.field333 == 0) {
                            int var18 = this.field330 / var17.field357;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method980();
                                for (int var21 = 0; var21 < var17.field357; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field330) {
                                float[] var23 = var17.method980();
                                for (int var24 = 0; var24 < var17.field357; var24++) {
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
