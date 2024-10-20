package deob;

@ObfuscatedName("hv")
public class class214 extends class440 {

    @ObfuscatedName("hv.z")
    public int field2445;

    @ObfuscatedName("hv.j")
    public boolean field2454;

    @ObfuscatedName("hv.i")
    public int[] field2447;

    @ObfuscatedName("hv.n")
    public int[] field2448;

    @ObfuscatedName("hv.l")
    public int[] field2442;

    @ObfuscatedName("hv.k")
    public int[] field2446;

    @ObfuscatedName("hv.c")
    public int field2451;

    @ObfuscatedName("hv.r")
    public int field2452;

    @ObfuscatedName("hv.b")
    public int[] field2453;

    @ObfuscatedName("hv.m")
    public boolean field2449 = false;

    public class214(class474 arg0) {
        this.field2445 = arg0.method8032();
        this.field2454 = arg0.method7964() == 1;
        int var2 = arg0.method7964();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2447 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2447[var3] = arg0.method8032();
        }
        if (var2 > 1) {
            this.field2448 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2448[var4] = arg0.method7964();
            }
        }
        if (var2 > 1) {
            this.field2442 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2442[var5] = arg0.method7964();
            }
        }
        this.field2446 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2446[var6] = arg0.method7979();
        }
        this.field2451 = arg0.method7964();
        this.field2452 = arg0.method7964();
        this.field2453 = null;
    }

    @ObfuscatedName("hv.f(DILln;)Z")
    public boolean method3973(double arg0, int arg1, class337 arg2) {
        for (int var5 = 0; var5 < this.field2447.length; var5++) {
            if (arg2.method5980(this.field2447[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2453 = new int[var6];
        for (int var7 = 0; var7 < this.field2447.length; var7++) {
            int var8 = this.field2447[var7];
            class487 var9;
            if (class489.method6207(arg2, var8)) {
                class487 var10 = new class487();
                var10.field5022 = Statics.field5042;
                var10.field5025 = Statics.field5043;
                var10.field5028 = Statics.field5045[0];
                var10.field5029 = Statics.field489[0];
                var10.field5024 = Statics.field4537[0];
                var10.field5026 = Statics.field1597[0];
                var10.field5023 = Statics.field1335;
                var10.field5027 = Statics.field1655[0];
                class489.method2590();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method8370();
            byte[] var13 = var9.field5027;
            int[] var14 = var9.field5023;
            int var15 = this.field2446[var7];
            if ((var15 & 0xFF000000) == 16777216) {
            }
            if ((var15 & 0xFF000000) == 33554432) {
            }
            if ((var15 & 0xFF000000) == 50331648) {
                int var16 = var15 & 0xFF00FF;
                int var17 = var15 >> 8 & 0xFF;
                for (int var18 = 0; var18 < var14.length; var18++) {
                    int var19 = var14[var18];
                    if (var19 >> 8 == (var19 & 0xFFFF)) {
                        int var20 = var19 & 0xFF;
                        var14[var18] = var16 * var20 >> 8 & 0xFF00FF | var17 * var20 & 0xFF00;
                    }
                }
            }
            for (int var21 = 0; var21 < var14.length; var21++) {
                var14[var21] = class217.method3989(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field2448[var7 - 1];
            }
            if (var22 == 0) {
                if (var9.field5024 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field2453[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field5024 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field2453[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field5024 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field2453[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var22 == 1) {
            }
            if (var22 == 2) {
            }
            if (var22 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("hv.w()V")
    public void method3974() {
        this.field2453 = null;
    }

    @ObfuscatedName("hv.v(I)V")
    public void method3975(int arg0) {
        if (this.field2453 == null) {
            return;
        }
        if (this.field2451 == 1 || this.field2451 == 3) {
            if (Statics.field2455 == null || Statics.field2455.length < this.field2453.length) {
                Statics.field2455 = new int[this.field2453.length];
            }
            short var2;
            if (this.field2453.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2453.length;
            int var4 = arg0 * var2 * this.field2452;
            int var5 = var3 - 1;
            if (this.field2451 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2455[var6] = this.field2453[var7];
            }
            int[] var8 = this.field2453;
            this.field2453 = Statics.field2455;
            Statics.field2455 = var8;
        }
        if (this.field2451 != 2 && this.field2451 != 4) {
            return;
        }
        if (Statics.field2455 == null || Statics.field2455.length < this.field2453.length) {
            Statics.field2455 = new int[this.field2453.length];
        }
        short var9;
        if (this.field2453.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2453.length;
        int var11 = this.field2452 * arg0;
        int var12 = var9 - 1;
        if (this.field2451 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2455[var15] = this.field2453[var16];
            }
        }
        int[] var17 = this.field2453;
        this.field2453 = Statics.field2455;
        Statics.field2455 = var17;
    }
}
