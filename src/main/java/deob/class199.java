package deob;

@ObfuscatedName("go")
public class class199 extends class411 {

    @ObfuscatedName("go.a")
    public int field2332;

    @ObfuscatedName("go.m")
    public boolean field2333;

    @ObfuscatedName("go.p")
    public int[] field2334;

    @ObfuscatedName("go.s")
    public int[] field2335;

    @ObfuscatedName("go.r")
    public int[] field2336;

    @ObfuscatedName("go.v")
    public int[] field2330;

    @ObfuscatedName("go.y")
    public int field2338;

    @ObfuscatedName("go.c")
    public int field2341;

    @ObfuscatedName("go.w")
    public int[] field2340;

    @ObfuscatedName("go.b")
    public boolean field2328 = false;

    public class199(class440 arg0) {
        this.field2332 = arg0.method7082();
        this.field2333 = arg0.method7071() == 1;
        int var2 = arg0.method7071();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2334 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2334[var3] = arg0.method7082();
        }
        if (var2 > 1) {
            this.field2335 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2335[var4] = arg0.method7071();
            }
        }
        if (var2 > 1) {
            this.field2336 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2336[var5] = arg0.method7071();
            }
        }
        this.field2330 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2330[var6] = arg0.method6898();
        }
        this.field2338 = arg0.method7071();
        this.field2341 = arg0.method7071();
        this.field2340 = null;
    }

    @ObfuscatedName("go.o(DILlp;)Z")
    public boolean method3590(double arg0, int arg1, class316 arg2) {
        for (int var5 = 0; var5 < this.field2334.length; var5++) {
            if (arg2.method5228(this.field2334[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2340 = new int[var6];
        for (int var7 = 0; var7 < this.field2334.length; var7++) {
            class452 var8 = class454.method1788(arg2, this.field2334[var7]);
            var8.method7286();
            byte[] var9 = var8.field4763;
            int[] var10 = var8.field4760;
            int var11 = this.field2330[var7];
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
                var10[var17] = class202.method3610(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2335[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field4759 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2340[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field4759 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2340[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field4759 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2340[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("go.q()V")
    public void method3596() {
        this.field2340 = null;
    }

    @ObfuscatedName("go.l(I)V")
    public void method3591(int arg0) {
        if (this.field2340 == null) {
            return;
        }
        if (this.field2338 == 1 || this.field2338 == 3) {
            if (Statics.field2342 == null || Statics.field2342.length < this.field2340.length) {
                Statics.field2342 = new int[this.field2340.length];
            }
            short var2;
            if (this.field2340.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2340.length;
            int var4 = arg0 * var2 * this.field2341;
            int var5 = var3 - 1;
            if (this.field2338 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2342[var6] = this.field2340[var7];
            }
            int[] var8 = this.field2340;
            this.field2340 = Statics.field2342;
            Statics.field2342 = var8;
        }
        if (this.field2338 != 2 && this.field2338 != 4) {
            return;
        }
        if (Statics.field2342 == null || Statics.field2342.length < this.field2340.length) {
            Statics.field2342 = new int[this.field2340.length];
        }
        short var9;
        if (this.field2340.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2340.length;
        int var11 = this.field2341 * arg0;
        int var12 = var9 - 1;
        if (this.field2338 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2342[var15] = this.field2340[var16];
            }
        }
        int[] var17 = this.field2340;
        this.field2340 = Statics.field2342;
        Statics.field2342 = var17;
    }
}
