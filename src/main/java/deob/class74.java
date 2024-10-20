package deob;

@ObfuscatedName("bj")
public class class74 {

    @ObfuscatedName("bj.a")
    public int field1359;

    @ObfuscatedName("bj.r")
    public int field1360;

    @ObfuscatedName("bj.f")
    public int[] field1361;

    @ObfuscatedName("bj.s")
    public int[] field1362;

    @ObfuscatedName("bj.y")
    public float[][] field1363;

    @ObfuscatedName("bj.e")
    public int[] field1364;

    @ObfuscatedName("bj.a(II)I")
    public static int method1499(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class126.method2699(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class74() {
        class71.method1451(24);
        this.field1359 = class71.method1451(16);
        this.field1360 = class71.method1451(24);
        this.field1361 = new int[this.field1360];
        boolean var1 = class71.method1450() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class71.method1451(5) + 1;
            while (var2 < this.field1360) {
                int var4 = class71.method1451(class126.method2059(this.field1360 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1361[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class71.method1450() != 0;
            for (int var7 = 0; var7 < this.field1360; var7++) {
                if (var6 && class71.method1450() == 0) {
                    this.field1361[var7] = 0;
                } else {
                    this.field1361[var7] = class71.method1451(5) + 1;
                }
            }
        }
        this.method1498();
        int var8 = class71.method1451(4);
        if (var8 > 0) {
            float var9 = class71.method1477(class71.method1451(32));
            float var10 = class71.method1477(class71.method1451(32));
            int var11 = class71.method1451(4) + 1;
            boolean var12 = class71.method1450() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1499(this.field1360, this.field1359);
            } else {
                var13 = this.field1360 * this.field1359;
            }
            this.field1362 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1362[var14] = class71.method1451(var11);
            }
            this.field1363 = new float[this.field1360][this.field1359];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1360; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1359; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1362[var19] * var10 + var9 + var16;
                        this.field1363[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1360; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1359 * var21;
                    for (int var24 = 0; var24 < this.field1359; var24++) {
                        float var25 = (float) this.field1362[var23] * var10 + var9 + var22;
                        this.field1363[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("bj.r()V")
    public void method1498() {
        int[] var1 = new int[this.field1360];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1360; var3++) {
            int var4 = this.field1361[var3];
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
        this.field1364 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1360; var14++) {
            int var15 = this.field1361[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1364[var17] == 0) {
                            this.field1364[var17] = var13;
                        }
                        var17 = this.field1364[var17];
                    }
                    if (var17 >= this.field1364.length) {
                        int[] var20 = new int[this.field1364.length * 2];
                        for (int var21 = 0; var21 < this.field1364.length; var21++) {
                            var20[var21] = this.field1364[var21];
                        }
                        this.field1364 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1364[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("bj.f()I")
    public int method1508() {
        int var1;
        for (var1 = 0; this.field1364[var1] >= 0; var1 = class71.method1450() == 0 ? var1 + 1 : this.field1364[var1]) {
        }
        return ~this.field1364[var1];
    }

    @ObfuscatedName("bj.s()[F")
    public float[] method1500() {
        return this.field1363[this.method1508()];
    }
}
