package deob;

@ObfuscatedName("go")
public class class208 extends class369 {

    @ObfuscatedName("go.o")
    public int field2285;

    @ObfuscatedName("go.g")
    public boolean field2286;

    @ObfuscatedName("go.z")
    public int[] field2292;

    @ObfuscatedName("go.a")
    public int[] field2288;

    @ObfuscatedName("go.u")
    public int[] field2281;

    @ObfuscatedName("go.e")
    public int[] field2287;

    @ObfuscatedName("go.l")
    public int field2284;

    @ObfuscatedName("go.y")
    public int field2283;

    @ObfuscatedName("go.v")
    public int[] field2293;

    @ObfuscatedName("go.f")
    public boolean field2294 = false;

    public class208(class400 arg0) {
        this.field2285 = arg0.method6219();
        this.field2286 = arg0.method6217() == 1;
        int var2 = arg0.method6217();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2292 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2292[var3] = arg0.method6219();
        }
        if (var2 > 1) {
            this.field2288 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2288[var4] = arg0.method6217();
            }
        }
        if (var2 > 1) {
            this.field2281 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2281[var5] = arg0.method6217();
            }
        }
        this.field2287 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2287[var6] = arg0.method6222();
        }
        this.field2284 = arg0.method6217();
        this.field2283 = arg0.method6217();
        this.field2293 = null;
    }

    @ObfuscatedName("go.n(DILkk;)Z")
    public boolean method3685(double arg0, int arg1, class290 arg2) {
        for (int var5 = 0; var5 < this.field2292.length; var5++) {
            if (arg2.method4717(this.field2292[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2293 = new int[var6];
        for (int var7 = 0; var7 < this.field2292.length; var7++) {
            int var8 = this.field2292[var7];
            byte[] var9 = arg2.method4771(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class414.method406(var9);
                var10 = true;
            }
            class412 var11;
            if (var10) {
                var11 = class414.method3550();
            } else {
                var11 = null;
            }
            var11.method6587();
            byte[] var13 = var11.field4359;
            int[] var14 = var11.field4360;
            int var15 = this.field2287[var7];
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
                var14[var21] = class211.method3707(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field2288[var7 - 1];
            }
            if (var22 == 0) {
                if (var11.field4361 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field2293[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field4361 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field2293[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field4361 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field2293[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("go.c()V")
    public void method3693() {
        this.field2293 = null;
    }

    @ObfuscatedName("go.m(I)V")
    public void method3687(int arg0) {
        if (this.field2293 == null) {
            return;
        }
        if (this.field2284 == 1 || this.field2284 == 3) {
            if (Statics.field2295 == null || Statics.field2295.length < this.field2293.length) {
                Statics.field2295 = new int[this.field2293.length];
            }
            short var2;
            if (this.field2293.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2293.length;
            int var4 = arg0 * var2 * this.field2283;
            int var5 = var3 - 1;
            if (this.field2284 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2295[var6] = this.field2293[var7];
            }
            int[] var8 = this.field2293;
            this.field2293 = Statics.field2295;
            Statics.field2295 = var8;
        }
        if (this.field2284 != 2 && this.field2284 != 4) {
            return;
        }
        if (Statics.field2295 == null || Statics.field2295.length < this.field2293.length) {
            Statics.field2295 = new int[this.field2293.length];
        }
        short var9;
        if (this.field2293.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2293.length;
        int var11 = this.field2283 * arg0;
        int var12 = var9 - 1;
        if (this.field2284 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2295[var15] = this.field2293[var16];
            }
        }
        int[] var17 = this.field2293;
        this.field2293 = Statics.field2295;
        Statics.field2295 = var17;
    }
}
