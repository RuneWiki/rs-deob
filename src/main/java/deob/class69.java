package deob;

@ObfuscatedName("bx")
public class class69 {

    @ObfuscatedName("bx.y")
    public int field1289;

    @ObfuscatedName("bx.k")
    public int field1288;

    @ObfuscatedName("bx.g")
    public int[] field1290;

    @ObfuscatedName("bx.n")
    public int[] field1291;

    @ObfuscatedName("bx.t")
    public float[][] field1292;

    @ObfuscatedName("bx.e")
    public int[] field1293;

    @ObfuscatedName("bx.y(II)I")
    public static int method1371(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class118.method594(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class69() {
        class66.method1320(24);
        this.field1289 = class66.method1320(16);
        this.field1288 = class66.method1320(24);
        this.field1290 = new int[this.field1288];
        boolean var1 = class66.method1319() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class66.method1320(5) + 1;
            while (var2 < this.field1288) {
                int var4 = class66.method1320(class118.method2082(this.field1288 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1290[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class66.method1319() != 0;
            for (int var7 = 0; var7 < this.field1288; var7++) {
                if (var6 && class66.method1319() == 0) {
                    this.field1290[var7] = 0;
                } else {
                    this.field1290[var7] = class66.method1320(5) + 1;
                }
            }
        }
        this.method1367();
        int var8 = class66.method1320(4);
        if (var8 > 0) {
            float var9 = class66.method1344(class66.method1320(32));
            float var10 = class66.method1344(class66.method1320(32));
            int var11 = class66.method1320(4) + 1;
            boolean var12 = class66.method1319() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1371(this.field1288, this.field1289);
            } else {
                var13 = this.field1289 * this.field1288;
            }
            this.field1291 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1291[var14] = class66.method1320(var11);
            }
            this.field1292 = new float[this.field1288][this.field1289];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1288; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1289; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1291[var19] * var10 + var9 + var16;
                        this.field1292[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1288; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1289 * var21;
                    for (int var24 = 0; var24 < this.field1289; var24++) {
                        float var25 = (float) this.field1291[var23] * var10 + var9 + var22;
                        this.field1292[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("bx.k()V")
    public void method1367() {
        int[] var1 = new int[this.field1288];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1288; var3++) {
            int var4 = this.field1290[var3];
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
        this.field1293 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1288; var14++) {
            int var15 = this.field1290[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1293[var17] == 0) {
                            this.field1293[var17] = var13;
                        }
                        var17 = this.field1293[var17];
                    }
                    if (var17 >= this.field1293.length) {
                        int[] var20 = new int[this.field1293.length * 2];
                        for (int var21 = 0; var21 < this.field1293.length; var21++) {
                            var20[var21] = this.field1293[var21];
                        }
                        this.field1293 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1293[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("bx.g()I")
    public int method1368() {
        int var1;
        for (var1 = 0; this.field1293[var1] >= 0; var1 = class66.method1319() == 0 ? var1 + 1 : this.field1293[var1]) {
        }
        return ~this.field1293[var1];
    }

    @ObfuscatedName("bx.n()[F")
    public float[] method1376() {
        return this.field1292[this.method1368()];
    }
}
