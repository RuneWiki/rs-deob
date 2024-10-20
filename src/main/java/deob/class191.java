package deob;

@ObfuscatedName("gs")
public class class191 extends class387 {

    @ObfuscatedName("gs.t")
    public int field2206;

    @ObfuscatedName("gs.s")
    public boolean field2207;

    @ObfuscatedName("gs.j")
    public int[] field2212;

    @ObfuscatedName("gs.w")
    public int[] field2209;

    @ObfuscatedName("gs.n")
    public int[] field2210;

    @ObfuscatedName("gs.r")
    public int[] field2202;

    @ObfuscatedName("gs.o")
    public int field2213;

    @ObfuscatedName("gs.v")
    public int field2204;

    @ObfuscatedName("gs.d")
    public int[] field2214;

    @ObfuscatedName("gs.h")
    public boolean field2215 = false;

    public class191(class419 arg0) {
        this.field2206 = arg0.method6672();
        this.field2207 = arg0.method6781() == 1;
        int var2 = arg0.method6781();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2212 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2212[var3] = arg0.method6672();
        }
        if (var2 > 1) {
            this.field2209 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2209[var4] = arg0.method6781();
            }
        }
        if (var2 > 1) {
            this.field2210 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2210[var5] = arg0.method6781();
            }
        }
        this.field2202 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2202[var6] = arg0.method6675();
        }
        this.field2213 = arg0.method6781();
        this.field2204 = arg0.method6781();
        this.field2214 = null;
    }

    @ObfuscatedName("gs.c(DILku;)Z")
    public boolean method3520(double arg0, int arg1, class302 arg2) {
        for (int var5 = 0; var5 < this.field2212.length; var5++) {
            if (arg2.method5109(this.field2212[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2214 = new int[var6];
        for (int var7 = 0; var7 < this.field2212.length; var7++) {
            class431 var8 = class433.method3087(arg2, this.field2212[var7]);
            var8.method7016();
            byte[] var9 = var8.field4557;
            int[] var10 = var8.field4561;
            int var11 = this.field2202[var7];
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
                var10[var17] = class194.method3536(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2209[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field4559 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2214[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field4559 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2214[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field4559 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2214[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("gs.b()V")
    public void method3523() {
        this.field2214 = null;
    }

    @ObfuscatedName("gs.p(I)V")
    public void method3517(int arg0) {
        if (this.field2214 == null) {
            return;
        }
        if (this.field2213 == 1 || this.field2213 == 3) {
            if (Statics.field2216 == null || Statics.field2216.length < this.field2214.length) {
                Statics.field2216 = new int[this.field2214.length];
            }
            short var2;
            if (this.field2214.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2214.length;
            int var4 = arg0 * var2 * this.field2204;
            int var5 = var3 - 1;
            if (this.field2213 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2216[var6] = this.field2214[var7];
            }
            int[] var8 = this.field2214;
            this.field2214 = Statics.field2216;
            Statics.field2216 = var8;
        }
        if (this.field2213 != 2 && this.field2213 != 4) {
            return;
        }
        if (Statics.field2216 == null || Statics.field2216.length < this.field2214.length) {
            Statics.field2216 = new int[this.field2214.length];
        }
        short var9;
        if (this.field2214.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2214.length;
        int var11 = this.field2204 * arg0;
        int var12 = var9 - 1;
        if (this.field2213 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2216[var15] = this.field2214[var16];
            }
        }
        int[] var17 = this.field2214;
        this.field2214 = Statics.field2216;
        Statics.field2216 = var17;
    }
}
