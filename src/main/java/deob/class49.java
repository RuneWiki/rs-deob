package deob;

@ObfuscatedName("ay")
public class class49 {

    @ObfuscatedName("ay.o")
    public int field356;

    @ObfuscatedName("ay.q")
    public int field359;

    @ObfuscatedName("ay.l")
    public int[] field358;

    @ObfuscatedName("ay.k")
    public int[] field360;

    @ObfuscatedName("ay.a")
    public float[][] field357;

    @ObfuscatedName("ay.m")
    public int[] field361;

    @ObfuscatedName("ay.o(II)I")
    public static int method922(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class272.method2271(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class49() {
        class50.method927(24);
        this.field356 = class50.method927(16);
        this.field359 = class50.method927(24);
        this.field358 = new int[this.field359];
        boolean var1 = class50.method926() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class50.method927(5) + 1;
            while (var2 < this.field359) {
                int var4 = class50.method927(class272.method2747(this.field359 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field358[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class50.method926() != 0;
            for (int var7 = 0; var7 < this.field359; var7++) {
                if (var6 && class50.method926() == 0) {
                    this.field358[var7] = 0;
                } else {
                    this.field358[var7] = class50.method927(5) + 1;
                }
            }
        }
        this.method911();
        int var8 = class50.method927(4);
        if (var8 > 0) {
            float var9 = class50.method943(class50.method927(32));
            float var10 = class50.method943(class50.method927(32));
            int var11 = class50.method927(4) + 1;
            boolean var12 = class50.method926() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method922(this.field359, this.field356);
            } else {
                var13 = this.field359 * this.field356;
            }
            this.field360 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field360[var14] = class50.method927(var11);
            }
            this.field357 = new float[this.field359][this.field356];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field359; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field356; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field360[var19] * var10 + var9 + var16;
                        this.field357[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field359; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field356 * var21;
                    for (int var24 = 0; var24 < this.field356; var24++) {
                        float var25 = (float) this.field360[var23] * var10 + var9 + var22;
                        this.field357[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.q()V")
    public void method911() {
        int[] var1 = new int[this.field359];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field359; var3++) {
            int var4 = this.field358[var3];
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
        this.field361 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field359; var14++) {
            int var15 = this.field358[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field361[var17] == 0) {
                            this.field361[var17] = var13;
                        }
                        var17 = this.field361[var17];
                    }
                    if (var17 >= this.field361.length) {
                        int[] var20 = new int[this.field361.length * 2];
                        for (int var21 = 0; var21 < this.field361.length; var21++) {
                            var20[var21] = this.field361[var21];
                        }
                        this.field361 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field361[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("ay.l()I")
    public int method912() {
        int var1;
        for (var1 = 0; this.field361[var1] >= 0; var1 = class50.method926() == 0 ? var1 + 1 : this.field361[var1]) {
        }
        return ~this.field361[var1];
    }

    @ObfuscatedName("ay.k()[F")
    public float[] method913() {
        return this.field357[this.method912()];
    }
}
