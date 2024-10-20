package deob;

@ObfuscatedName("gd")
public class class208 extends class430 {

    @ObfuscatedName("gd.h")
    public int field2365;

    @ObfuscatedName("gd.j")
    public boolean field2366;

    @ObfuscatedName("gd.y")
    public int[] field2367;

    @ObfuscatedName("gd.d")
    public int[] field2363;

    @ObfuscatedName("gd.n")
    public int[] field2369;

    @ObfuscatedName("gd.r")
    public int[] field2368;

    @ObfuscatedName("gd.l")
    public int field2371;

    @ObfuscatedName("gd.s")
    public int field2372;

    @ObfuscatedName("gd.p")
    public int[] field2373;

    @ObfuscatedName("gd.b")
    public boolean field2374 = false;

    public class208(class464 arg0) {
        this.field2365 = arg0.method7716();
        this.field2366 = arg0.method7735() == 1;
        int var2 = arg0.method7735();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2367 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2367[var3] = arg0.method7716();
        }
        if (var2 > 1) {
            this.field2363 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2363[var4] = arg0.method7735();
            }
        }
        if (var2 > 1) {
            this.field2369 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2369[var5] = arg0.method7735();
            }
        }
        this.field2368 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2368[var6] = arg0.method7720();
        }
        this.field2371 = arg0.method7735();
        this.field2372 = arg0.method7735();
        this.field2373 = null;
    }

    @ObfuscatedName("gd.a(DILlg;)Z")
    public boolean method3791(double arg0, int arg1, class330 arg2) {
        for (int var5 = 0; var5 < this.field2367.length; var5++) {
            if (arg2.method5790(this.field2367[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2373 = new int[var6];
        for (int var7 = 0; var7 < this.field2367.length; var7++) {
            class476 var8 = class478.method7001(arg2, this.field2367[var7]);
            var8.method8100();
            byte[] var9 = var8.field4956;
            int[] var10 = var8.field4957;
            int var11 = this.field2368[var7];
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
                var10[var17] = class211.method3885(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2363[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field4951 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2373[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field4951 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2373[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field4951 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2373[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("gd.f()V")
    public void method3792() {
        this.field2373 = null;
    }

    @ObfuscatedName("gd.c(I)V")
    public void method3793(int arg0) {
        if (this.field2373 == null) {
            return;
        }
        if (this.field2371 == 1 || this.field2371 == 3) {
            if (Statics.field2361 == null || Statics.field2361.length < this.field2373.length) {
                Statics.field2361 = new int[this.field2373.length];
            }
            short var2;
            if (this.field2373.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2373.length;
            int var4 = arg0 * var2 * this.field2372;
            int var5 = var3 - 1;
            if (this.field2371 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2361[var6] = this.field2373[var7];
            }
            int[] var8 = this.field2373;
            this.field2373 = Statics.field2361;
            Statics.field2361 = var8;
        }
        if (this.field2371 != 2 && this.field2371 != 4) {
            return;
        }
        if (Statics.field2361 == null || Statics.field2361.length < this.field2373.length) {
            Statics.field2361 = new int[this.field2373.length];
        }
        short var9;
        if (this.field2373.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2373.length;
        int var11 = this.field2372 * arg0;
        int var12 = var9 - 1;
        if (this.field2371 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2361[var15] = this.field2373[var16];
            }
        }
        int[] var17 = this.field2373;
        this.field2373 = Statics.field2361;
        Statics.field2361 = var17;
    }
}
