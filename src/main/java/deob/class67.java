package deob;

@ObfuscatedName("by")
public class class67 {

    @ObfuscatedName("by.t")
    public int field1263;

    @ObfuscatedName("by.o")
    public int field1261;

    @ObfuscatedName("by.i")
    public int[] field1262;

    @ObfuscatedName("by.p")
    public int[] field1265;

    @ObfuscatedName("by.c")
    public float[][] field1264;

    @ObfuscatedName("by.y")
    public int[] field1260;

    @ObfuscatedName("by.t(II)I")
    public static int method1314(int arg0, int arg1) {
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

    public class67() {
        class64.method1256(24);
        this.field1263 = class64.method1256(16);
        this.field1261 = class64.method1256(24);
        this.field1262 = new int[this.field1261];
        boolean var1 = class64.method1272() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = class64.method1256(5) + 1;
            while (var2 < this.field1261) {
                int var4 = class64.method1256(class113.method120(this.field1261 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1262[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = class64.method1272() != 0;
            for (int var7 = 0; var7 < this.field1261; var7++) {
                if (var6 && class64.method1272() == 0) {
                    this.field1262[var7] = 0;
                } else {
                    this.field1262[var7] = class64.method1256(5) + 1;
                }
            }
        }
        this.method1310();
        int var8 = class64.method1256(4);
        if (var8 > 0) {
            float var9 = class64.method1288(class64.method1256(32));
            float var10 = class64.method1288(class64.method1256(32));
            int var11 = class64.method1256(4) + 1;
            boolean var12 = class64.method1272() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method1314(this.field1261, this.field1263);
            } else {
                var13 = this.field1263 * this.field1261;
            }
            this.field1265 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1265[var14] = class64.method1256(var11);
            }
            this.field1264 = new float[this.field1261][this.field1263];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field1261; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field1263; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field1265[var19] * var10 + var9 + var16;
                        this.field1264[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1261; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field1263 * var21;
                    for (int var24 = 0; var24 < this.field1263; var24++) {
                        float var25 = (float) this.field1265[var23] * var10 + var9 + var22;
                        this.field1264[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("by.o()V")
    public void method1310() {
        int[] var1 = new int[this.field1261];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field1261; var3++) {
            int var4 = this.field1262[var3];
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
        this.field1260 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field1261; var14++) {
            int var15 = this.field1262[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field1260[var17] == 0) {
                            this.field1260[var17] = var13;
                        }
                        var17 = this.field1260[var17];
                    }
                    if (var17 >= this.field1260.length) {
                        int[] var20 = new int[this.field1260.length * 2];
                        for (int var21 = 0; var21 < this.field1260.length; var21++) {
                            var20[var21] = this.field1260[var21];
                        }
                        this.field1260 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field1260[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("by.i()I")
    public int method1309() {
        int var1;
        for (var1 = 0; this.field1260[var1] >= 0; var1 = class64.method1272() == 0 ? var1 + 1 : this.field1260[var1]) {
        }
        return ~this.field1260[var1];
    }

    @ObfuscatedName("by.p()[F")
    public float[] method1318() {
        return this.field1264[this.method1309()];
    }
}
