package deob;

@ObfuscatedName("gx")
public class class198 extends class411 {

    @ObfuscatedName("gx.c")
    public int field2297;

    @ObfuscatedName("gx.q")
    public boolean field2289;

    @ObfuscatedName("gx.i")
    public int[] field2290;

    @ObfuscatedName("gx.k")
    public int[] field2292;

    @ObfuscatedName("gx.o")
    public int[] field2294;

    @ObfuscatedName("gx.n")
    public int[] field2293;

    @ObfuscatedName("gx.d")
    public int field2288;

    @ObfuscatedName("gx.a")
    public int field2295;

    @ObfuscatedName("gx.m")
    public int[] field2298;

    @ObfuscatedName("gx.u")
    public boolean field2291 = false;

    public class198(class444 arg0) {
        this.field2297 = arg0.method7120();
        this.field2289 = arg0.method6929() == 1;
        int var2 = arg0.method6929();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2290 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2290[var3] = arg0.method7120();
        }
        if (var2 > 1) {
            this.field2292 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2292[var4] = arg0.method6929();
            }
        }
        if (var2 > 1) {
            this.field2294 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2294[var5] = arg0.method6929();
            }
        }
        this.field2293 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2293[var6] = arg0.method6934();
        }
        this.field2288 = arg0.method6929();
        this.field2295 = arg0.method6929();
        this.field2298 = null;
    }

    @ObfuscatedName("gx.s(DILls;)Z")
    public boolean method3580(double arg0, int arg1, class316 arg2) {
        for (int var5 = 0; var5 < this.field2290.length; var5++) {
            if (arg2.method5188(this.field2290[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2298 = new int[var6];
        for (int var7 = 0; var7 < this.field2290.length; var7++) {
            class456 var8 = class458.method5910(arg2, this.field2290[var7]);
            var8.method7331();
            byte[] var9 = var8.field4789;
            int[] var10 = var8.field4788;
            int var11 = this.field2293[var7];
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
                var10[var17] = class201.method3604(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2292[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field4790 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2298[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field4790 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2298[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field4790 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2298[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("gx.h()V")
    public void method3584() {
        this.field2298 = null;
    }

    @ObfuscatedName("gx.w(I)V")
    public void method3583(int arg0) {
        if (this.field2298 == null) {
            return;
        }
        if (this.field2288 == 1 || this.field2288 == 3) {
            if (Statics.field2284 == null || Statics.field2284.length < this.field2298.length) {
                Statics.field2284 = new int[this.field2298.length];
            }
            short var2;
            if (this.field2298.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2298.length;
            int var4 = arg0 * var2 * this.field2295;
            int var5 = var3 - 1;
            if (this.field2288 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2284[var6] = this.field2298[var7];
            }
            int[] var8 = this.field2298;
            this.field2298 = Statics.field2284;
            Statics.field2284 = var8;
        }
        if (this.field2288 != 2 && this.field2288 != 4) {
            return;
        }
        if (Statics.field2284 == null || Statics.field2284.length < this.field2298.length) {
            Statics.field2284 = new int[this.field2298.length];
        }
        short var9;
        if (this.field2298.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2298.length;
        int var11 = this.field2295 * arg0;
        int var12 = var9 - 1;
        if (this.field2288 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2284[var15] = this.field2298[var16];
            }
        }
        int[] var17 = this.field2298;
        this.field2298 = Statics.field2284;
        Statics.field2284 = var17;
    }
}
