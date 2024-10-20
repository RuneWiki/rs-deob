package deob;

@ObfuscatedName("i")
public class class25 {

    @ObfuscatedName("i.q")
    public int field329;

    @ObfuscatedName("i.l")
    public int field325;

    @ObfuscatedName("i.a")
    public int[] field324;

    @ObfuscatedName("i.o")
    public int[] field327;

    @ObfuscatedName("i.c")
    public float[][] field328;

    @ObfuscatedName("i.h")
    public int[] field326;

    @ObfuscatedName("i.q(II)I")
    public static int method293(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class67.method37(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class25() {
        class131.method1537(24);
        this.field329 = class131.method1537(16);
        this.field325 = class131.method1537(24);
        this.field324 = new int[this.field325];
        boolean var1 = class131.method1542() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class131.method1537(5) + 1;
            while (var2 < this.field325) {
                int var4 = class131.method1537(class67.method306(this.field325 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field324[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class131.method1542() != 0;
            for (int var7 = 0; var7 < this.field325; var7++) {
                if (var6 && class131.method1542() == 0) {
                    this.field324[var7] = 0;
                } else {
                    this.field324[var7] = class131.method1537(5) + 1;
                }
            }
        }
        this.method283();
        int var8 = class131.method1537(4);
        if (var8 > 0) {
            float var9 = class131.method1554(class131.method1537(32));
            float var10 = class131.method1554(class131.method1537(32));
            int var11 = class131.method1537(4) + 1;
            boolean var12 = class131.method1542() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method293(this.field325, this.field329);
            } else {
                var13 = this.field329 * this.field325;
            }
            this.field327 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field327[var14] = class131.method1537(var11);
            }
            this.field328 = new float[this.field325][this.field329];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field325; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field329; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field327[var19] * var10 + var9 + var16;
                        this.field328[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field325; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field329 * var21;
                    for (int var24 = 0; var24 < this.field329; var24++) {
                        float var25 = (float) this.field327[var23] * var10 + var9 + var22;
                        this.field328[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.l()V")
    public void method283() {
        int[] var1 = new int[this.field325];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field325; var3++) {
            int var4 = this.field324[var3];
            if (var4 != 0) {
                int var5 = 0x1 << 32 - var4;
                int var6 = var2[var4];
                var1[var3] = var6;
                int var7;
                if ((var6 & var5) == 0) {
                    var7 = var6 | var5;
                    for (int var8 = var4 - 1; var8 >= 1; var8--) {
                        int var9 = var2[var8];
                        if (var6 != var9) {
                            break;
                        }
                        int var10 = 0x1 << 32 - var8;
                        if ((var9 & var10) != 0) {
                            var2[var8] = var2[var8 - 1];
                            break;
                        }
                        var2[var8] = var9 | var10;
                    }
                } else {
                    var7 = var2[var4 - 1];
                }
                var2[var4] = var7;
                for (int var11 = var4 + 1; var11 <= 32; var11++) {
                    int var12 = var2[var11];
                    if (var6 == var12) {
                        var2[var11] = var7;
                    }
                }
            }
        }
        this.field326 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field325; var14++) {
            int var15 = this.field324[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field326[var17] == 0) {
                            this.field326[var17] = var13;
                        }
                        var17 = this.field326[var17];
                    }
                    if (var17 >= this.field326.length) {
                        int[] var20 = new int[this.field326.length * 2];
                        for (int var21 = 0; var21 < this.field326.length; var21++) {
                            var20[var21] = this.field326[var21];
                        }
                        this.field326 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field326[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("i.a()I")
    public int method284() {
        int var1;
        for (var1 = 0; this.field326[var1] >= 0; var1 = class131.method1542() == 0 ? var1 + 1 : this.field326[var1]) {
        }
        return ~this.field326[var1];
    }

    @ObfuscatedName("i.o()[F")
    public float[] method285() {
        return this.field328[this.method284()];
    }
}
