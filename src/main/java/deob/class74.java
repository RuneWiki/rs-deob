package deob;

@ObfuscatedName("bx")
public class class74 {

    @ObfuscatedName("bx.j")
    public int field1345;

    @ObfuscatedName("bx.m")
    public int field1344;

    @ObfuscatedName("bx.f")
    public int[] field1346;

    @ObfuscatedName("bx.l")
    public int[] field1347;

    @ObfuscatedName("bx.u")
    public float[][] field1348;

    @ObfuscatedName("bx.a")
    public int[] field1349;

    @ObfuscatedName("bx.j(II)I")
    public static int method1496(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class126.method2615(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class74() {
        class71.method1444(24);
        this.field1345 = class71.method1444(16);
        this.field1344 = class71.method1444(24);
        this.field1346 = new int[this.field1344];
        boolean var1 = class71.method1442() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class71.method1444(5) + 1;
            while (var2 < this.field1344) {
                int var4 = class71.method1444(class126.method599(this.field1344 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1346[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class71.method1442() != 0;
            for (int var7 = 0; var7 < this.field1344; var7++) {
                if (var6 && class71.method1442() == 0) {
                    this.field1346[var7] = 0;
                } else {
                    this.field1346[var7] = class71.method1444(5) + 1;
                }
            }
        }
        this.method1491();
        int var8 = class71.method1444(4);
        if (var8 > 0) {
            float var9 = class71.method1449(class71.method1444(32));
            float var10 = class71.method1449(class71.method1444(32));
            int var11 = class71.method1444(4) + 1;
            boolean var12 = class71.method1442() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1496(this.field1344, this.field1345);
            } else {
                var13 = this.field1345 * this.field1344;
            }
            this.field1347 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1347[var14] = class71.method1444(var11);
            }
            this.field1348 = new float[this.field1344][this.field1345];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1344; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1345; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1347[var19] * var10 + var9 + var16;
                        this.field1348[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1344; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1345 * var21;
                    for (int var24 = 0; var24 < this.field1345; var24++) {
                        float var25 = (float) this.field1347[var23] * var10 + var9 + var22;
                        this.field1348[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("bx.m()V")
    public void method1491() {
        int[] var1 = new int[this.field1344];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1344; var3++) {
            int var4 = this.field1346[var3];
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
        this.field1349 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1344; var14++) {
            int var15 = this.field1346[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1349[var17] == 0) {
                            this.field1349[var17] = var13;
                        }
                        var17 = this.field1349[var17];
                    }
                    if (var17 >= this.field1349.length) {
                        int[] var20 = new int[this.field1349.length * 2];
                        for (int var21 = 0; var21 < this.field1349.length; var21++) {
                            var20[var21] = this.field1349[var21];
                        }
                        this.field1349 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1349[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("bx.f()I")
    public int method1492() {
        int var1;
        for (var1 = 0; this.field1349[var1] >= 0; var1 = class71.method1442() == 0 ? var1 + 1 : this.field1349[var1]) {
        }
        return ~this.field1349[var1];
    }

    @ObfuscatedName("bx.l()[F")
    public float[] method1490() {
        return this.field1348[this.method1492()];
    }
}
