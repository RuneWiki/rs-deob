package deob;

@ObfuscatedName("bo")
public class class59 {

    @ObfuscatedName("bo.p")
    public int field1216;

    @ObfuscatedName("bo.j")
    public int field1212;

    @ObfuscatedName("bo.w")
    public int[] field1213;

    @ObfuscatedName("bo.h")
    public int[] field1214;

    @ObfuscatedName("bo.v")
    public float[][] field1215;

    @ObfuscatedName("bo.k")
    public int[] field1211;

    @ObfuscatedName("bo.p(II)I")
    public static int method1251(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class123.method1353(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class59() {
        class52.method1154(24);
        this.field1216 = class52.method1154(16);
        this.field1212 = class52.method1154(24);
        this.field1213 = new int[this.field1212];
        boolean var1 = class52.method1153() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class52.method1154(5) + 1;
            while (var2 < this.field1212) {
                int var4 = class52.method1154(class123.method2156(this.field1212 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1213[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class52.method1153() != 0;
            for (int var7 = 0; var7 < this.field1212; var7++) {
                if (var6 && class52.method1153() == 0) {
                    this.field1213[var7] = 0;
                } else {
                    this.field1213[var7] = class52.method1154(5) + 1;
                }
            }
        }
        this.method1252();
        int var8 = class52.method1154(4);
        if (var8 > 0) {
            float var9 = class52.method1155(class52.method1154(32));
            float var10 = class52.method1155(class52.method1154(32));
            int var11 = class52.method1154(4) + 1;
            boolean var12 = class52.method1153() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1251(this.field1212, this.field1216);
            } else {
                var13 = this.field1216 * this.field1212;
            }
            this.field1214 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1214[var14] = class52.method1154(var11);
            }
            this.field1215 = new float[this.field1212][this.field1216];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1212; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1216; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1214[var19] * var10 + var9 + var16;
                        this.field1215[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1212; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1216 * var21;
                    for (int var24 = 0; var24 < this.field1216; var24++) {
                        float var25 = (float) this.field1214[var23] * var10 + var9 + var22;
                        this.field1215[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("bo.j()V")
    public void method1252() {
        int[] var1 = new int[this.field1212];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1212; var3++) {
            int var4 = this.field1213[var3];
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
        this.field1211 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1212; var14++) {
            int var15 = this.field1213[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1211[var17] == 0) {
                            this.field1211[var17] = var13;
                        }
                        var17 = this.field1211[var17];
                    }
                    if (var17 >= this.field1211.length) {
                        int[] var20 = new int[this.field1211.length * 2];
                        for (int var21 = 0; var21 < this.field1211.length; var21++) {
                            var20[var21] = this.field1211[var21];
                        }
                        this.field1211 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1211[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("bo.w()I")
    public int method1253() {
        int var1;
        for (var1 = 0; this.field1211[var1] >= 0; var1 = class52.method1153() == 0 ? var1 + 1 : this.field1211[var1]) {
        }
        return ~this.field1211[var1];
    }

    @ObfuscatedName("bo.h()[F")
    public float[] method1259() {
        return this.field1215[this.method1253()];
    }
}
