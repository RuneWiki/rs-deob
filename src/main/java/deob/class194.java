package deob;

@ObfuscatedName("gm")
public class class194 extends class353 {

    @ObfuscatedName("gm.j")
    public int field2214;

    @ObfuscatedName("gm.o")
    public boolean field2215;

    @ObfuscatedName("gm.m")
    public int[] field2216;

    @ObfuscatedName("gm.r")
    public int[] field2218;

    @ObfuscatedName("gm.h")
    public int[] field2222;

    @ObfuscatedName("gm.d")
    public int[] field2219;

    @ObfuscatedName("gm.z")
    public int field2220;

    @ObfuscatedName("gm.b")
    public int field2221;

    @ObfuscatedName("gm.i")
    public int[] field2211;

    @ObfuscatedName("gm.k")
    public boolean field2223 = false;

    public class194(class384 arg0) {
        this.field2214 = arg0.method5899();
        this.field2215 = arg0.method5902() == 1;
        int var2 = arg0.method5902();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2216 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2216[var3] = arg0.method5899();
        }
        if (var2 > 1) {
            this.field2218 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2218[var4] = arg0.method5902();
            }
        }
        if (var2 > 1) {
            this.field2222 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2222[var5] = arg0.method5902();
            }
        }
        this.field2219 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2219[var6] = arg0.method5965();
        }
        this.field2220 = arg0.method5902();
        this.field2221 = arg0.method5902();
        this.field2211 = null;
    }

    @ObfuscatedName("gm.f(DILjp;)Z")
    public boolean method3486(double arg0, int arg1, class276 arg2) {
        for (int var5 = 0; var5 < this.field2216.length; var5++) {
            if (arg2.method4571(this.field2216[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2211 = new int[var6];
        for (int var7 = 0; var7 < this.field2216.length; var7++) {
            class396 var8 = class398.method4001(arg2, this.field2216[var7]);
            var8.method6255();
            byte[] var9 = var8.field4247;
            int[] var10 = var8.field4250;
            int var11 = this.field2219[var7];
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
                var10[var17] = class197.method3500(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2218[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field4246 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2211[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field4246 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2211[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field4246 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2211[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("gm.e()V")
    public void method3481() {
        this.field2211 = null;
    }

    @ObfuscatedName("gm.v(I)V")
    public void method3483(int arg0) {
        if (this.field2211 == null) {
            return;
        }
        if (this.field2220 == 1 || this.field2220 == 3) {
            if (Statics.field2224 == null || Statics.field2224.length < this.field2211.length) {
                Statics.field2224 = new int[this.field2211.length];
            }
            short var2;
            if (this.field2211.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2211.length;
            int var4 = arg0 * var2 * this.field2221;
            int var5 = var3 - 1;
            if (this.field2220 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2224[var6] = this.field2211[var7];
            }
            int[] var8 = this.field2211;
            this.field2211 = Statics.field2224;
            Statics.field2224 = var8;
        }
        if (this.field2220 != 2 && this.field2220 != 4) {
            return;
        }
        if (Statics.field2224 == null || Statics.field2224.length < this.field2211.length) {
            Statics.field2224 = new int[this.field2211.length];
        }
        short var9;
        if (this.field2211.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2211.length;
        int var11 = this.field2221 * arg0;
        int var12 = var9 - 1;
        if (this.field2220 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2224[var15] = this.field2211[var16];
            }
        }
        int[] var17 = this.field2211;
        this.field2211 = Statics.field2224;
        Statics.field2224 = var17;
    }
}
