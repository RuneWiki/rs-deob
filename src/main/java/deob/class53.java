package deob;

@ObfuscatedName("cw")
public class class53 {

    @ObfuscatedName("cw.au")
    public int field384;

    @ObfuscatedName("cw.ae")
    public int field382;

    @ObfuscatedName("cw.ao")
    public int[] field381;

    @ObfuscatedName("cw.at")
    public int[] field379;

    @ObfuscatedName("cw.ac")
    public float[][] field383;

    @ObfuscatedName("cw.ai")
    public int[] field380;

    @ObfuscatedName("cw.au(II)I")
    public static int method1017(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class304.method2523(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class53() {
        class61 var1 = class55.field394;
        var1.method1101(24);
        this.field384 = var1.method1101(16);
        this.field382 = var1.method1101(24);
        this.field381 = new int[this.field382];
        boolean var2 = var1.method1102() != 0;
        if (var2) {
            int var3 = 0;
            int var4 = var1.method1101(5) + 1;
            while (var3 < this.field382) {
                int var5 = var1.method1101(class304.method203(this.field382 - var3));
                for (int var6 = 0; var6 < var5; var6++) {
                    this.field381[var3++] = var4;
                }
                var4++;
            }
        } else {
            boolean var7 = var1.method1102() != 0;
            for (int var8 = 0; var8 < this.field382; var8++) {
                if (var7 && var1.method1102() == 0) {
                    this.field381[var8] = 0;
                } else {
                    this.field381[var8] = var1.method1101(5) + 1;
                }
            }
        }
        this.method1008();
        int var9 = var1.method1101(4);
        if (var9 > 0) {
            float var10 = class55.method1055(var1.method1101(32));
            float var11 = class55.method1055(var1.method1101(32));
            int var12 = var1.method1101(4) + 1;
            boolean var13 = var1.method1102() != 0;
            int var14;
            if (var9 == 1) {
                var14 = method1017(this.field382, this.field384);
            } else {
                var14 = this.field384 * this.field382;
            }
            this.field379 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field379[var15] = var1.method1101(var12);
            }
            this.field383 = new float[this.field382][this.field384];
            if (var9 == 1) {
                for (int var16 = 0; var16 < this.field382; var16++) {
                    float var17 = 0.0F;
                    int var18 = 1;
                    for (int var19 = 0; var19 < this.field384; var19++) {
                        int var20 = var16 / var18 % var14;
                        float var21 = (float) this.field379[var20] * var11 + var10 + var17;
                        this.field383[var16][var19] = var21;
                        if (var13) {
                            var17 = var21;
                        }
                        var18 = var14 * var18;
                    }
                }
            } else {
                for (int var22 = 0; var22 < this.field382; var22++) {
                    float var23 = 0.0F;
                    int var24 = this.field384 * var22;
                    for (int var25 = 0; var25 < this.field384; var25++) {
                        float var26 = (float) this.field379[var24] * var11 + var10 + var23;
                        this.field383[var22][var25] = var26;
                        if (var13) {
                            var23 = var26;
                        }
                        var24++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.ae()V")
    public void method1008() {
        int[] var1 = new int[this.field382];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field382; var3++) {
            int var4 = this.field381[var3];
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
        this.field380 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field382; var14++) {
            int var15 = this.field381[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field380[var17] == 0) {
                            this.field380[var17] = var13;
                        }
                        var17 = this.field380[var17];
                    }
                    if (var17 >= this.field380.length) {
                        int[] var20 = new int[this.field380.length * 2];
                        for (int var21 = 0; var21 < this.field380.length; var21++) {
                            var20[var21] = this.field380[var21];
                        }
                        this.field380 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field380[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("cw.ao(Lce;)I")
    public int method1011(class61 arg0) {
        int var2;
        for (var2 = 0; this.field380[var2] >= 0; var2 = arg0.method1102() == 0 ? var2 + 1 : this.field380[var2]) {
        }
        return ~this.field380[var2];
    }

    @ObfuscatedName("cw.at(Lce;)[F")
    public float[] method1009(class61 arg0) {
        return this.field383[this.method1011(arg0)];
    }
}
