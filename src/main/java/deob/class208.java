package deob;

@ObfuscatedName("gt")
public class class208 extends class370 {

    @ObfuscatedName("gt.o")
    public int field2299;

    @ObfuscatedName("gt.g")
    public boolean field2298;

    @ObfuscatedName("gt.e")
    public int[] field2301;

    @ObfuscatedName("gt.p")
    public int[] field2302;

    @ObfuscatedName("gt.j")
    public int[] field2303;

    @ObfuscatedName("gt.b")
    public int[] field2304;

    @ObfuscatedName("gt.x")
    public int field2295;

    @ObfuscatedName("gt.y")
    public int field2306;

    @ObfuscatedName("gt.k")
    public int[] field2300;

    @ObfuscatedName("gt.t")
    public boolean field2296 = false;

    public class208(class401 arg0) {
        this.field2299 = arg0.method6242();
        this.field2298 = arg0.method6240() == 1;
        int var2 = arg0.method6240();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2301 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2301[var3] = arg0.method6242();
        }
        if (var2 > 1) {
            this.field2302 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2302[var4] = arg0.method6240();
            }
        }
        if (var2 > 1) {
            this.field2303 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2303[var5] = arg0.method6240();
            }
        }
        this.field2304 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2304[var6] = arg0.method6245();
        }
        this.field2295 = arg0.method6240();
        this.field2306 = arg0.method6240();
        this.field2300 = null;
    }

    @ObfuscatedName("gt.i(DILko;)Z")
    public boolean method3740(double arg0, int arg1, class290 arg2) {
        for (int var5 = 0; var5 < this.field2301.length; var5++) {
            if (arg2.method4751(this.field2301[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2300 = new int[var6];
        for (int var7 = 0; var7 < this.field2301.length; var7++) {
            class413 var8 = class415.method2588(arg2, this.field2301[var7]);
            var8.method6609();
            byte[] var9 = var8.field4386;
            int[] var10 = var8.field4385;
            int var11 = this.field2304[var7];
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
                var10[var17] = class211.method3757(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2302[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field4387 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2300[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field4387 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2300[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field4387 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2300[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("gt.w()V")
    public void method3738() {
        this.field2300 = null;
    }

    @ObfuscatedName("gt.s(I)V")
    public void method3741(int arg0) {
        if (this.field2300 == null) {
            return;
        }
        if (this.field2295 == 1 || this.field2295 == 3) {
            if (Statics.field2309 == null || Statics.field2309.length < this.field2300.length) {
                Statics.field2309 = new int[this.field2300.length];
            }
            short var2;
            if (this.field2300.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2300.length;
            int var4 = arg0 * var2 * this.field2306;
            int var5 = var3 - 1;
            if (this.field2295 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2309[var6] = this.field2300[var7];
            }
            int[] var8 = this.field2300;
            this.field2300 = Statics.field2309;
            Statics.field2309 = var8;
        }
        if (this.field2295 != 2 && this.field2295 != 4) {
            return;
        }
        if (Statics.field2309 == null || Statics.field2309.length < this.field2300.length) {
            Statics.field2309 = new int[this.field2300.length];
        }
        short var9;
        if (this.field2300.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2300.length;
        int var11 = this.field2306 * arg0;
        int var12 = var9 - 1;
        if (this.field2295 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2309[var15] = this.field2300[var16];
            }
        }
        int[] var17 = this.field2300;
        this.field2300 = Statics.field2309;
        Statics.field2309 = var17;
    }
}
