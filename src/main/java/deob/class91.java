package deob;

@ObfuscatedName("cv")
public class class91 extends class181 {

    @ObfuscatedName("cv.j")
    public int field1488;

    @ObfuscatedName("cv.z")
    public boolean field1492;

    @ObfuscatedName("cv.m")
    public int[] field1494;

    @ObfuscatedName("cv.w")
    public int[] field1500;

    @ObfuscatedName("cv.a")
    public int[] field1495;

    @ObfuscatedName("cv.d")
    public int[] field1496;

    @ObfuscatedName("cv.u")
    public int field1497;

    @ObfuscatedName("cv.p")
    public int field1498;

    @ObfuscatedName("cv.t")
    public int[] field1493;

    @ObfuscatedName("cv.g")
    public boolean field1487 = false;

    public class91(class128 arg0) {
        this.field1488 = arg0.method2456();
        this.field1492 = arg0.method2548() == 1;
        int var2 = arg0.method2548();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1494 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1494[var3] = arg0.method2456();
        }
        if (var2 > 1) {
            this.field1500 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1500[var4] = arg0.method2548();
            }
        }
        if (var2 > 1) {
            this.field1495 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1495[var5] = arg0.method2548();
            }
        }
        this.field1496 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1496[var6] = arg0.method2592();
        }
        this.field1497 = arg0.method2548();
        this.field1498 = arg0.method2548();
        this.field1493 = null;
    }

    @ObfuscatedName("cv.e(DILea;)Z")
    public boolean method1876(double arg0, int arg1, class155 arg2) {
        for (int var5 = 0; var5 < this.field1494.length; var5++) {
            if (arg2.method3027(this.field1494[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1493 = new int[var6];
        for (int var7 = 0; var7 < this.field1494.length; var7++) {
            class88 var8 = class85.method240(arg2, this.field1494[var7]);
            var8.method1810();
            byte[] var9 = var8.field1474;
            int[] var10 = var8.field1472;
            int var11 = this.field1496[var7];
            if ((var11 & 0xFF000000) == 16777216) {
            }
            if ((var11 & 0xFF000000) == 33554432) {
            }
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class105.method2139(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1500[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1473 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1493[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1473 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1493[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1473 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1493[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var18 == 1) {
            }
            if (var18 == 2) {
            }
            if (var18 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("cv.i()V")
    public void method1877() {
        this.field1493 = null;
    }

    @ObfuscatedName("cv.k(I)V")
    public void method1880(int arg0) {
        if (this.field1493 == null) {
            return;
        }
        if (this.field1497 == 1 || this.field1497 == 3) {
            if (Statics.field1501 == null || Statics.field1501.length < this.field1493.length) {
                Statics.field1501 = new int[this.field1493.length];
            }
            short var2;
            if (this.field1493.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1493.length;
            int var4 = arg0 * var2 * this.field1498;
            int var5 = var3 - 1;
            if (this.field1497 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1501[var6] = this.field1493[var7];
            }
            int[] var8 = this.field1493;
            this.field1493 = Statics.field1501;
            Statics.field1501 = var8;
        }
        if (this.field1497 != 2 && this.field1497 != 4) {
            return;
        }
        if (Statics.field1501 == null || Statics.field1501.length < this.field1493.length) {
            Statics.field1501 = new int[this.field1493.length];
        }
        short var9;
        if (this.field1493.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1493.length;
        int var11 = this.field1498 * arg0;
        int var12 = var9 - 1;
        if (this.field1497 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1501[var15] = this.field1493[var16];
            }
        }
        int[] var17 = this.field1493;
        this.field1493 = Statics.field1501;
        Statics.field1501 = var17;
    }
}
