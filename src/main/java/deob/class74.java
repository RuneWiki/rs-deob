package deob;

@ObfuscatedName("bx")
public class class74 {

    @ObfuscatedName("bx.z")
    public int field1357;

    @ObfuscatedName("bx.q")
    public int field1355;

    @ObfuscatedName("bx.k")
    public int[] field1356;

    @ObfuscatedName("bx.f")
    public int[] field1354;

    @ObfuscatedName("bx.d")
    public float[][] field1358;

    @ObfuscatedName("bx.l")
    public int[] field1359;

    @ObfuscatedName("bx.z(II)I")
    public static int method1457(int arg0, int arg1) {
        int var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1;
        while (true) {
            int var3 = var2;
            int var4 = arg1;
            int var5 = 1;
            while (var4 > 1) {
                if ((var4 & 0x1) != 0) {
                    var5 = var3 * var5;
                }
                var3 *= var3;
                var4 >>= 0x1;
            }
            int var6;
            if (var4 == 1) {
                var6 = var3 * var5;
            } else {
                var6 = var5;
            }
            if (var6 <= arg0) {
                return var2;
            }
            var2--;
        }
    }

    public class74() {
        class71.method1400(24);
        this.field1357 = class71.method1400(16);
        this.field1355 = class71.method1400(24);
        this.field1356 = new int[this.field1355];
        boolean var1 = class71.method1399() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class71.method1400(5) + 1;
            while (var2 < this.field1355) {
                int var4 = class71.method1400(Statics.method1885(this.field1355 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1356[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class71.method1399() != 0;
            for (int var7 = 0; var7 < this.field1355; var7++) {
                if (var6 && class71.method1399() == 0) {
                    this.field1356[var7] = 0;
                } else {
                    this.field1356[var7] = class71.method1400(5) + 1;
                }
            }
        }
        this.method1449();
        int var8 = class71.method1400(4);
        if (var8 > 0) {
            float var9 = class71.method1421(class71.method1400(32));
            float var10 = class71.method1421(class71.method1400(32));
            int var11 = class71.method1400(4) + 1;
            boolean var12 = class71.method1399() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1457(this.field1355, this.field1357);
            } else {
                var13 = this.field1357 * this.field1355;
            }
            this.field1354 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1354[var14] = class71.method1400(var11);
            }
            this.field1358 = new float[this.field1355][this.field1357];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1355; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1357; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1354[var19] * var10 + var9 + var16;
                        this.field1358[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1355; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1357 * var21;
                    for (int var24 = 0; var24 < this.field1357; var24++) {
                        float var25 = (float) this.field1354[var23] * var10 + var9 + var22;
                        this.field1358[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("bx.q()V")
    public void method1449() {
        int[] var1 = new int[this.field1355];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1355; var3++) {
            int var4 = this.field1356[var3];
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
        this.field1359 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1355; var14++) {
            int var15 = this.field1356[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1359[var17] == 0) {
                            this.field1359[var17] = var13;
                        }
                        var17 = this.field1359[var17];
                    }
                    if (var17 >= this.field1359.length) {
                        int[] var20 = new int[this.field1359.length * 2];
                        for (int var21 = 0; var21 < this.field1359.length; var21++) {
                            var20[var21] = this.field1359[var21];
                        }
                        this.field1359 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1359[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("bx.k()I")
    public int method1447() {
        int var1;
        for (var1 = 0; this.field1359[var1] >= 0; var1 = class71.method1399() == 0 ? var1 + 1 : this.field1359[var1]) {
        }
        return ~this.field1359[var1];
    }

    @ObfuscatedName("bx.f()[F")
    public float[] method1455() {
        return this.field1358[this.method1447()];
    }
}
