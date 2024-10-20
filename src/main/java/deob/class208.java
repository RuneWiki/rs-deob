package deob;

@ObfuscatedName("gc")
public class class208 extends class370 {

    @ObfuscatedName("gc.m")
    public int field2301;

    @ObfuscatedName("gc.k")
    public boolean field2296;

    @ObfuscatedName("gc.t")
    public int[] field2297;

    @ObfuscatedName("gc.a")
    public int[] field2298;

    @ObfuscatedName("gc.e")
    public int[] field2299;

    @ObfuscatedName("gc.i")
    public int[] field2294;

    @ObfuscatedName("gc.y")
    public int field2291;

    @ObfuscatedName("gc.w")
    public int field2302;

    @ObfuscatedName("gc.g")
    public int[] field2300;

    @ObfuscatedName("gc.v")
    public boolean field2295 = false;

    public class208(class401 arg0) {
        this.field2301 = arg0.method6284();
        this.field2296 = arg0.method6272() == 1;
        int var2 = arg0.method6272();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2297 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2297[var3] = arg0.method6284();
        }
        if (var2 > 1) {
            this.field2298 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2298[var4] = arg0.method6272();
            }
        }
        if (var2 > 1) {
            this.field2299 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2299[var5] = arg0.method6272();
            }
        }
        this.field2294 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2294[var6] = arg0.method6277();
        }
        this.field2291 = arg0.method6272();
        this.field2302 = arg0.method6272();
        this.field2300 = null;
    }

    @ObfuscatedName("gc.l(DILkl;)Z")
    public boolean method3734(double arg0, int arg1, class290 arg2) {
        for (int var5 = 0; var5 < this.field2297.length; var5++) {
            if (arg2.method4764(this.field2297[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2300 = new int[var6];
        for (int var7 = 0; var7 < this.field2297.length; var7++) {
            class413 var8 = class415.method2898(arg2, this.field2297[var7]);
            var8.method6627();
            byte[] var9 = var8.field4380;
            int[] var10 = var8.field4374;
            int var11 = this.field2294[var7];
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
                var10[var17] = class211.method3753(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2298[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field4373 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2300[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field4373 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2300[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field4373 == 128 && arg1 == 64) {
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

    @ObfuscatedName("gc.q()V")
    public void method3737() {
        this.field2300 = null;
    }

    @ObfuscatedName("gc.f(I)V")
    public void method3736(int arg0) {
        if (this.field2300 == null) {
            return;
        }
        if (this.field2291 == 1 || this.field2291 == 3) {
            if (Statics.field2305 == null || Statics.field2305.length < this.field2300.length) {
                Statics.field2305 = new int[this.field2300.length];
            }
            short var2;
            if (this.field2300.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2300.length;
            int var4 = arg0 * var2 * this.field2302;
            int var5 = var3 - 1;
            if (this.field2291 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2305[var6] = this.field2300[var7];
            }
            int[] var8 = this.field2300;
            this.field2300 = Statics.field2305;
            Statics.field2305 = var8;
        }
        if (this.field2291 != 2 && this.field2291 != 4) {
            return;
        }
        if (Statics.field2305 == null || Statics.field2305.length < this.field2300.length) {
            Statics.field2305 = new int[this.field2300.length];
        }
        short var9;
        if (this.field2300.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2300.length;
        int var11 = this.field2302 * arg0;
        int var12 = var9 - 1;
        if (this.field2291 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2305[var15] = this.field2300[var16];
            }
        }
        int[] var17 = this.field2300;
        this.field2300 = Statics.field2305;
        Statics.field2305 = var17;
    }
}
