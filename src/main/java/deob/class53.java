package deob;

@ObfuscatedName("cx")
public class class53 {

    @ObfuscatedName("cx.ab")
    public int field342;

    @ObfuscatedName("cx.ay")
    public int field339;

    @ObfuscatedName("cx.an")
    public int[] field337;

    @ObfuscatedName("cx.au")
    public int[] field340;

    @ObfuscatedName("cx.ax")
    public float[][] field341;

    @ObfuscatedName("cx.ao")
    public int[] field338;

    @ObfuscatedName("cx.ab(II)I")
    public static int method974(int arg0, int arg1) {
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

    public class53() {
        class61 var1 = class55.field353;
        var1.method1091(24);
        this.field342 = var1.method1091(16);
        this.field339 = var1.method1091(24);
        this.field337 = new int[this.field339];
        boolean var2 = var1.method1083() != 0;
        if (var2) {
            int var3 = 0;
            int var4 = var1.method1091(5) + 1;
            while (var3 < this.field339) {
                int var5 = var1.method1091(class331.method3332(this.field339 - var3));
                for (int var6 = 0; var6 < var5; var6++) {
                    this.field337[var3++] = var4;
                }
                var4++;
            }
        } else {
            boolean var7 = var1.method1083() != 0;
            for (int var8 = 0; var8 < this.field339; var8++) {
                if (var7 && var1.method1083() == 0) {
                    this.field337[var8] = 0;
                } else {
                    this.field337[var8] = var1.method1091(5) + 1;
                }
            }
        }
        this.method969();
        int var9 = var1.method1091(4);
        if (var9 > 0) {
            float var10 = class55.method1009(var1.method1091(32));
            float var11 = class55.method1009(var1.method1091(32));
            int var12 = var1.method1091(4) + 1;
            boolean var13 = var1.method1083() != 0;
            int var14;
            if (var9 == 1) {
                var14 = method974(this.field339, this.field342);
            } else {
                var14 = this.field342 * this.field339;
            }
            this.field340 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field340[var15] = var1.method1091(var12);
            }
            this.field341 = new float[this.field339][this.field342];
            if (var9 == 1) {
                for (int var16 = 0; var16 < this.field339; var16++) {
                    float var17 = 0.0F;
                    int var18 = 1;
                    for (int var19 = 0; var19 < this.field342; var19++) {
                        int var20 = var16 / var18 % var14;
                        float var21 = (float) this.field340[var20] * var11 + var10 + var17;
                        this.field341[var16][var19] = var21;
                        if (var13) {
                            var17 = var21;
                        }
                        var18 = var14 * var18;
                    }
                }
            } else {
                for (int var22 = 0; var22 < this.field339; var22++) {
                    float var23 = 0.0F;
                    int var24 = this.field342 * var22;
                    for (int var25 = 0; var25 < this.field342; var25++) {
                        float var26 = (float) this.field340[var24] * var11 + var10 + var23;
                        this.field341[var22][var25] = var26;
                        if (var13) {
                            var23 = var26;
                        }
                        var24++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cx.ay()V")
    public void method969() {
        int[] var1 = new int[this.field339];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field339; var3++) {
            int var4 = this.field337[var3];
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
        this.field338 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field339; var14++) {
            int var15 = this.field337[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field338[var17] == 0) {
                            this.field338[var17] = var13;
                        }
                        var17 = this.field338[var17];
                    }
                    if (var17 >= this.field338.length) {
                        int[] var20 = new int[this.field338.length * 2];
                        for (int var21 = 0; var21 < this.field338.length; var21++) {
                            var20[var21] = this.field338[var21];
                        }
                        this.field338 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field338[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("cx.an(Lcj;)I")
    public int method970(class61 arg0) {
        int var2;
        for (var2 = 0; this.field338[var2] >= 0; var2 = arg0.method1083() == 0 ? var2 + 1 : this.field338[var2]) {
        }
        return ~this.field338[var2];
    }

    @ObfuscatedName("cx.au(Lcj;)[F")
    public float[] method968(class61 arg0) {
        return this.field341[this.method970(arg0)];
    }
}
