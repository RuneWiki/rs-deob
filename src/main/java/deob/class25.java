package deob;

@ObfuscatedName("s")
public class class25 {

    @ObfuscatedName("s.t")
    public int field319;

    @ObfuscatedName("s.n")
    public int field321;

    @ObfuscatedName("s.q")
    public int[] field320;

    @ObfuscatedName("s.h")
    public int[] field318;

    @ObfuscatedName("s.k")
    public float[][] field317;

    @ObfuscatedName("s.r")
    public int[] field322;

    @ObfuscatedName("s.t(II)I")
    public static int method312(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class66.method546(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class25() {
        class130.method1517(24);
        this.field319 = class130.method1517(16);
        this.field321 = class130.method1517(24);
        this.field320 = new int[this.field321];
        boolean var1 = class130.method1516() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class130.method1517(5) + 1;
            while (var2 < this.field321) {
                int var4 = class130.method1517(class66.method57(this.field321 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field320[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class130.method1516() != 0;
            for (int var7 = 0; var7 < this.field321; var7++) {
                if (var6 && class130.method1516() == 0) {
                    this.field320[var7] = 0;
                } else {
                    this.field320[var7] = class130.method1517(5) + 1;
                }
            }
        }
        this.method306();
        int var8 = class130.method1517(4);
        if (var8 > 0) {
            float var9 = class130.method1523(class130.method1517(32));
            float var10 = class130.method1523(class130.method1517(32));
            int var11 = class130.method1517(4) + 1;
            boolean var12 = class130.method1516() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method312(this.field321, this.field319);
            } else {
                var13 = this.field321 * this.field319;
            }
            this.field318 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field318[var14] = class130.method1517(var11);
            }
            this.field317 = new float[this.field321][this.field319];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field321; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field319; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field318[var19] * var10 + var9 + var16;
                        this.field317[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field321; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field319 * var21;
                    for (int var24 = 0; var24 < this.field319; var24++) {
                        float var25 = (float) this.field318[var23] * var10 + var9 + var22;
                        this.field317[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.n()V")
    public void method306() {
        int[] var1 = new int[this.field321];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field321; var3++) {
            int var4 = this.field320[var3];
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
        this.field322 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field321; var14++) {
            int var15 = this.field320[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field322[var17] == 0) {
                            this.field322[var17] = var13;
                        }
                        var17 = this.field322[var17];
                    }
                    if (var17 >= this.field322.length) {
                        int[] var20 = new int[this.field322.length * 2];
                        for (int var21 = 0; var21 < this.field322.length; var21++) {
                            var20[var21] = this.field322[var21];
                        }
                        this.field322 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field322[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("s.q()I")
    public int method307() {
        int var1;
        for (var1 = 0; this.field322[var1] >= 0; var1 = class130.method1516() == 0 ? var1 + 1 : this.field322[var1]) {
        }
        return ~this.field322[var1];
    }

    @ObfuscatedName("s.h()[F")
    public float[] method308() {
        return this.field317[this.method307()];
    }
}
