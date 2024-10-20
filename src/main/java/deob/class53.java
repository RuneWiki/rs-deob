package deob;

@ObfuscatedName("bx")
public class class53 {

    @ObfuscatedName("bx.a")
    public int field373;

    @ObfuscatedName("bx.f")
    public int field377;

    @ObfuscatedName("bx.c")
    public int[] field374;

    @ObfuscatedName("bx.x")
    public int[] field375;

    @ObfuscatedName("bx.h")
    public float[][] field376;

    @ObfuscatedName("bx.j")
    public int[] field372;

    @ObfuscatedName("bx.a(II)I")
    public static int method983(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class282.method4347(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class53() {
        class54.method1022(24);
        this.field373 = class54.method1022(16);
        this.field377 = class54.method1022(24);
        this.field374 = new int[this.field377];
        boolean var1 = class54.method998() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class54.method1022(5) + 1;
            while (var2 < this.field377) {
                int var4 = class54.method1022(class282.method10(this.field377 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field374[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class54.method998() != 0;
            for (int var7 = 0; var7 < this.field377; var7++) {
                if (var6 && class54.method998() == 0) {
                    this.field374[var7] = 0;
                } else {
                    this.field374[var7] = class54.method1022(5) + 1;
                }
            }
        }
        this.method985();
        int var8 = class54.method1022(4);
        if (var8 > 0) {
            float var9 = class54.method1030(class54.method1022(32));
            float var10 = class54.method1030(class54.method1022(32));
            int var11 = class54.method1022(4) + 1;
            boolean var12 = class54.method998() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method983(this.field377, this.field373);
            } else {
                var13 = this.field377 * this.field373;
            }
            this.field375 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field375[var14] = class54.method1022(var11);
            }
            this.field376 = new float[this.field377][this.field373];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field377; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field373; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field375[var19] * var10 + var9 + var16;
                        this.field376[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field377; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field373 * var21;
                    for (int var24 = 0; var24 < this.field373; var24++) {
                        float var25 = (float) this.field375[var23] * var10 + var9 + var22;
                        this.field376[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("bx.f()V")
    public void method985() {
        int[] var1 = new int[this.field377];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field377; var3++) {
            int var4 = this.field374[var3];
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
        this.field372 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field377; var14++) {
            int var15 = this.field374[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field372[var17] == 0) {
                            this.field372[var17] = var13;
                        }
                        var17 = this.field372[var17];
                    }
                    if (var17 >= this.field372.length) {
                        int[] var20 = new int[this.field372.length * 2];
                        for (int var21 = 0; var21 < this.field372.length; var21++) {
                            var20[var21] = this.field372[var21];
                        }
                        this.field372 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field372[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("bx.c()I")
    public int method987() {
        int var1;
        for (var1 = 0; this.field372[var1] >= 0; var1 = class54.method998() == 0 ? var1 + 1 : this.field372[var1]) {
        }
        return ~this.field372[var1];
    }

    @ObfuscatedName("bx.x()[F")
    public float[] method984() {
        return this.field376[this.method987()];
    }
}
