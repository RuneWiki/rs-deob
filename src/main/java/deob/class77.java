package deob;

@ObfuscatedName("bj")
public class class77 {

    @ObfuscatedName("bj.m")
    public int field1436;

    @ObfuscatedName("bj.w")
    public int field1434;

    @ObfuscatedName("bj.e")
    public int[] field1435;

    @ObfuscatedName("bj.o")
    public int[] field1437;

    @ObfuscatedName("bj.g")
    public float[][] field1438;

    @ObfuscatedName("bj.l")
    public int[] field1433;

    @ObfuscatedName("bj.m(II)I")
    public static int method1570(int arg0, int arg1) {
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

    public class77() {
        class74.method1523(24);
        this.field1436 = class74.method1523(16);
        this.field1434 = class74.method1523(24);
        this.field1435 = new int[this.field1434];
        boolean var1 = class74.method1521() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class74.method1523(5) + 1;
            while (var2 < this.field1434) {
                int var4 = class74.method1523(class130.method2333(this.field1434 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1435[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class74.method1521() != 0;
            for (int var7 = 0; var7 < this.field1434; var7++) {
                if (var6 && class74.method1521() == 0) {
                    this.field1435[var7] = 0;
                } else {
                    this.field1435[var7] = class74.method1523(5) + 1;
                }
            }
        }
        this.method1571();
        int var8 = class74.method1523(4);
        if (var8 > 0) {
            float var9 = class74.method1534(class74.method1523(32));
            float var10 = class74.method1534(class74.method1523(32));
            int var11 = class74.method1523(4) + 1;
            boolean var12 = class74.method1521() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1570(this.field1434, this.field1436);
            } else {
                var13 = this.field1436 * this.field1434;
            }
            this.field1437 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1437[var14] = class74.method1523(var11);
            }
            this.field1438 = new float[this.field1434][this.field1436];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1434; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1436; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1437[var19] * var10 + var9 + var16;
                        this.field1438[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1434; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1436 * var21;
                    for (int var24 = 0; var24 < this.field1436; var24++) {
                        float var25 = (float) this.field1437[var23] * var10 + var9 + var22;
                        this.field1438[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("bj.w()V")
    public void method1571() {
        int[] var1 = new int[this.field1434];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1434; var3++) {
            int var4 = this.field1435[var3];
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
        this.field1433 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1434; var14++) {
            int var15 = this.field1435[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1433[var17] == 0) {
                            this.field1433[var17] = var13;
                        }
                        var17 = this.field1433[var17];
                    }
                    if (var17 >= this.field1433.length) {
                        int[] var20 = new int[this.field1433.length * 2];
                        for (int var21 = 0; var21 < this.field1433.length; var21++) {
                            var20[var21] = this.field1433[var21];
                        }
                        this.field1433 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1433[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("bj.e()I")
    public int method1579() {
        int var1;
        for (var1 = 0; this.field1433[var1] >= 0; var1 = class74.method1521() == 0 ? var1 + 1 : this.field1433[var1]) {
        }
        return ~this.field1433[var1];
    }

    @ObfuscatedName("bj.o()[F")
    public float[] method1573() {
        return this.field1438[this.method1579()];
    }
}
