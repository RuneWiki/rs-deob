package deob;

@ObfuscatedName("aj")
public class class47 {

    @ObfuscatedName("aj.i")
    public int field334;

    @ObfuscatedName("aj.w")
    public int field333;

    @ObfuscatedName("aj.s")
    public int[] field331;

    @ObfuscatedName("aj.a")
    public int[] field332;

    @ObfuscatedName("aj.o")
    public float[][] field329;

    @ObfuscatedName("aj.g")
    public int[] field330;

    @ObfuscatedName("aj.i(II)I")
    public static int method939(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class246.method5261(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class47() {
        class48.method948(24);
        this.field334 = class48.method948(16);
        this.field333 = class48.method948(24);
        this.field331 = new int[this.field333];
        boolean var1 = class48.method973() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class48.method948(5) + 1;
            while (var2 < this.field333) {
                int var4 = class48.method948(class246.method1815(this.field333 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field331[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class48.method973() != 0;
            for (int var7 = 0; var7 < this.field333; var7++) {
                if (var6 && class48.method973() == 0) {
                    this.field331[var7] = 0;
                } else {
                    this.field331[var7] = class48.method948(5) + 1;
                }
            }
        }
        this.method930();
        int var8 = class48.method948(4);
        if (var8 > 0) {
            float var9 = class48.method956(class48.method948(32));
            float var10 = class48.method956(class48.method948(32));
            int var11 = class48.method948(4) + 1;
            boolean var12 = class48.method973() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method939(this.field333, this.field334);
            } else {
                var13 = this.field334 * this.field333;
            }
            this.field332 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field332[var14] = class48.method948(var11);
            }
            this.field329 = new float[this.field333][this.field334];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field333; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field334; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field332[var19] * var10 + var9 + var16;
                        this.field329[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field333; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field334 * var21;
                    for (int var24 = 0; var24 < this.field334; var24++) {
                        float var25 = (float) this.field332[var23] * var10 + var9 + var22;
                        this.field329[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.w()V")
    public void method930() {
        int[] var1 = new int[this.field333];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field333; var3++) {
            int var4 = this.field331[var3];
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
        this.field330 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field333; var14++) {
            int var15 = this.field331[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field330[var17] == 0) {
                            this.field330[var17] = var13;
                        }
                        var17 = this.field330[var17];
                    }
                    if (var17 >= this.field330.length) {
                        int[] var20 = new int[this.field330.length * 2];
                        for (int var21 = 0; var21 < this.field330.length; var21++) {
                            var20[var21] = this.field330[var21];
                        }
                        this.field330 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field330[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("aj.s()I")
    public int method931() {
        int var1;
        for (var1 = 0; this.field330[var1] >= 0; var1 = class48.method973() == 0 ? var1 + 1 : this.field330[var1]) {
        }
        return ~this.field330[var1];
    }

    @ObfuscatedName("aj.a()[F")
    public float[] method933() {
        return this.field329[this.method931()];
    }
}
