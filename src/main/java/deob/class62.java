package deob;

@ObfuscatedName("bo")
public class class62 {

    @ObfuscatedName("bo.f")
    public int field464;

    @ObfuscatedName("bo.o")
    public int field463;

    @ObfuscatedName("bo.u")
    public int[] field466;

    @ObfuscatedName("bo.p")
    public int[] field462;

    @ObfuscatedName("bo.b")
    public float[][] field467;

    @ObfuscatedName("bo.e")
    public int[] field465;

    @ObfuscatedName("bo.f(II)I")
    public static int method829(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class209.method2995(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class62() {
        class63.method860(24);
        this.field464 = class63.method860(16);
        this.field463 = class63.method860(24);
        this.field466 = new int[this.field463];
        boolean var1 = class63.method839() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class63.method860(5) + 1;
            while (var2 < this.field463) {
                int var4 = class63.method860(class209.method4067(this.field463 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field466[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class63.method839() != 0;
            for (int var7 = 0; var7 < this.field463; var7++) {
                if (var6 && class63.method839() == 0) {
                    this.field466[var7] = 0;
                } else {
                    this.field466[var7] = class63.method860(5) + 1;
                }
            }
        }
        this.method830();
        int var8 = class63.method860(4);
        if (var8 > 0) {
            float var9 = class63.method847(class63.method860(32));
            float var10 = class63.method847(class63.method860(32));
            int var11 = class63.method860(4) + 1;
            boolean var12 = class63.method839() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method829(this.field463, this.field464);
            } else {
                var13 = this.field464 * this.field463;
            }
            this.field462 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field462[var14] = class63.method860(var11);
            }
            this.field467 = new float[this.field463][this.field464];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field463; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field464; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field462[var19] * var10 + var9 + var16;
                        this.field467[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field463; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field464 * var21;
                    for (int var24 = 0; var24 < this.field464; var24++) {
                        float var25 = (float) this.field462[var23] * var10 + var9 + var22;
                        this.field467[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("bo.o()V")
    public void method830() {
        int[] var1 = new int[this.field463];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field463; var3++) {
            int var4 = this.field466[var3];
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
        this.field465 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field463; var14++) {
            int var15 = this.field466[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field465[var17] == 0) {
                            this.field465[var17] = var13;
                        }
                        var17 = this.field465[var17];
                    }
                    if (var17 >= this.field465.length) {
                        int[] var20 = new int[this.field465.length * 2];
                        for (int var21 = 0; var21 < this.field465.length; var21++) {
                            var20[var21] = this.field465[var21];
                        }
                        this.field465 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field465[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("bo.u()I")
    public int method831() {
        int var1;
        for (var1 = 0; this.field465[var1] >= 0; var1 = class63.method839() == 0 ? var1 + 1 : this.field465[var1]) {
        }
        return ~this.field465[var1];
    }

    @ObfuscatedName("bo.p()[F")
    public float[] method832() {
        return this.field467[this.method831()];
    }
}
