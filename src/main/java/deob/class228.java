package deob;

@ObfuscatedName("hg")
public class class228 extends class409 {

    @ObfuscatedName("hg.b")
    public int field2511;

    @ObfuscatedName("hg.n")
    public boolean field2512;

    @ObfuscatedName("hg.s")
    public int[] field2506;

    @ObfuscatedName("hg.l")
    public int[] field2507;

    @ObfuscatedName("hg.q")
    public int[] field2508;

    @ObfuscatedName("hg.o")
    public int[] field2509;

    @ObfuscatedName("hg.r")
    public int field2510;

    @ObfuscatedName("hg.p")
    public int field2500;

    @ObfuscatedName("hg.w")
    public int[] field2504;

    @ObfuscatedName("hg.k")
    public boolean field2513 = false;

    public class228(class438 arg0) {
        this.field2511 = arg0.method7148();
        this.field2512 = arg0.method6971() == 1;
        int var2 = arg0.method6971();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2506 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2506[var3] = arg0.method7148();
        }
        if (var2 > 1) {
            this.field2507 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2507[var4] = arg0.method6971();
            }
        }
        if (var2 > 1) {
            this.field2508 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2508[var5] = arg0.method6971();
            }
        }
        this.field2509 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2509[var6] = arg0.method6976();
        }
        this.field2510 = arg0.method6971();
        this.field2500 = arg0.method6971();
        this.field2504 = null;
    }

    @ObfuscatedName("hg.v(DILln;)Z")
    public boolean method4115(double arg0, int arg1, class316 arg2) {
        for (int var5 = 0; var5 < this.field2506.length; var5++) {
            if (arg2.method5303(this.field2506[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2504 = new int[var6];
        for (int var7 = 0; var7 < this.field2506.length; var7++) {
            int var8 = this.field2506[var7];
            byte[] var9 = arg2.method5301(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class452.method3692(var9);
                var10 = true;
            }
            class450 var11;
            if (var10) {
                var11 = class452.method3161();
            } else {
                var11 = null;
            }
            var11.method7351();
            byte[] var13 = var11.field4708;
            int[] var14 = var11.field4702;
            int var15 = this.field2509[var7];
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
                var14[var21] = class231.method4133(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field2507[var7 - 1];
            }
            if (var22 == 0) {
                if (var11.field4703 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field2504[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field4703 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field2504[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field4703 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field2504[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("hg.c()V")
    public void method4117() {
        this.field2504 = null;
    }

    @ObfuscatedName("hg.i(I)V")
    public void method4120(int arg0) {
        if (this.field2504 == null) {
            return;
        }
        if (this.field2510 == 1 || this.field2510 == 3) {
            if (Statics.field2514 == null || Statics.field2514.length < this.field2504.length) {
                Statics.field2514 = new int[this.field2504.length];
            }
            short var2;
            if (this.field2504.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2504.length;
            int var4 = arg0 * var2 * this.field2500;
            int var5 = var3 - 1;
            if (this.field2510 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2514[var6] = this.field2504[var7];
            }
            int[] var8 = this.field2504;
            this.field2504 = Statics.field2514;
            Statics.field2514 = var8;
        }
        if (this.field2510 != 2 && this.field2510 != 4) {
            return;
        }
        if (Statics.field2514 == null || Statics.field2514.length < this.field2504.length) {
            Statics.field2514 = new int[this.field2504.length];
        }
        short var9;
        if (this.field2504.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2504.length;
        int var11 = this.field2500 * arg0;
        int var12 = var9 - 1;
        if (this.field2510 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2514[var15] = this.field2504[var16];
            }
        }
        int[] var17 = this.field2504;
        this.field2504 = Statics.field2514;
        Statics.field2514 = var17;
    }
}
