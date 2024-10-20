package deob;

@ObfuscatedName("bv")
public class class74 {

    @ObfuscatedName("bv.o")
    public int field1354;

    @ObfuscatedName("bv.e")
    public int field1352;

    @ObfuscatedName("bv.u")
    public int[] field1353;

    @ObfuscatedName("bv.b")
    public int[] field1351;

    @ObfuscatedName("bv.p")
    public float[][] field1356;

    @ObfuscatedName("bv.s")
    public int[] field1355;

    @ObfuscatedName("bv.o(II)I")
    public static int method1455(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class126.method1935(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class74() {
        class71.method1404(24);
        this.field1354 = class71.method1404(16);
        this.field1352 = class71.method1404(24);
        this.field1353 = new int[this.field1352];
        boolean var1 = class71.method1406() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class71.method1404(5) + 1;
            while (var2 < this.field1352) {
                int var4 = class71.method1404(class126.method3236(this.field1352 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1353[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class71.method1406() != 0;
            for (int var7 = 0; var7 < this.field1352; var7++) {
                if (var6 && class71.method1406() == 0) {
                    this.field1353[var7] = 0;
                } else {
                    this.field1353[var7] = class71.method1404(5) + 1;
                }
            }
        }
        this.method1467();
        int var8 = class71.method1404(4);
        if (var8 > 0) {
            float var9 = class71.method1412(class71.method1404(32));
            float var10 = class71.method1412(class71.method1404(32));
            int var11 = class71.method1404(4) + 1;
            boolean var12 = class71.method1406() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1455(this.field1352, this.field1354);
            } else {
                var13 = this.field1354 * this.field1352;
            }
            this.field1351 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1351[var14] = class71.method1404(var11);
            }
            this.field1356 = new float[this.field1352][this.field1354];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1352; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1354; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1351[var19] * var10 + var9 + var16;
                        this.field1356[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1352; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1354 * var21;
                    for (int var24 = 0; var24 < this.field1354; var24++) {
                        float var25 = (float) this.field1351[var23] * var10 + var9 + var22;
                        this.field1356[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("bv.e()V")
    public void method1467() {
        int[] var1 = new int[this.field1352];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1352; var3++) {
            int var4 = this.field1353[var3];
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
        this.field1355 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1352; var14++) {
            int var15 = this.field1353[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1355[var17] == 0) {
                            this.field1355[var17] = var13;
                        }
                        var17 = this.field1355[var17];
                    }
                    if (var17 >= this.field1355.length) {
                        int[] var20 = new int[this.field1355.length * 2];
                        for (int var21 = 0; var21 < this.field1355.length; var21++) {
                            var20[var21] = this.field1355[var21];
                        }
                        this.field1355 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1355[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("bv.u()I")
    public int method1453() {
        int var1;
        for (var1 = 0; this.field1355[var1] >= 0; var1 = class71.method1406() == 0 ? var1 + 1 : this.field1355[var1]) {
        }
        return ~this.field1355[var1];
    }

    @ObfuscatedName("bv.b()[F")
    public float[] method1458() {
        return this.field1356[this.method1453()];
    }
}
