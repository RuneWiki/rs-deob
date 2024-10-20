package deob;

@ObfuscatedName("gf")
public class class193 extends class352 {

    @ObfuscatedName("gf.p")
    public int field2214;

    @ObfuscatedName("gf.j")
    public boolean field2221;

    @ObfuscatedName("gf.r")
    public int[] field2216;

    @ObfuscatedName("gf.b")
    public int[] field2217;

    @ObfuscatedName("gf.d")
    public int[] field2218;

    @ObfuscatedName("gf.s")
    public int[] field2224;

    @ObfuscatedName("gf.u")
    public int field2220;

    @ObfuscatedName("gf.l")
    public int field2212;

    @ObfuscatedName("gf.o")
    public int[] field2222;

    @ObfuscatedName("gf.c")
    public boolean field2223 = false;

    public class193(class383 arg0) {
        this.field2214 = arg0.method5967();
        this.field2221 = arg0.method5965() == 1;
        int var2 = arg0.method5965();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2216 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2216[var3] = arg0.method5967();
        }
        if (var2 > 1) {
            this.field2217 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2217[var4] = arg0.method5965();
            }
        }
        if (var2 > 1) {
            this.field2218 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2218[var5] = arg0.method5965();
            }
        }
        this.field2224 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2224[var6] = arg0.method5970();
        }
        this.field2220 = arg0.method5965();
        this.field2212 = arg0.method5965();
        this.field2222 = null;
    }

    @ObfuscatedName("gf.v(DILjv;)Z")
    public boolean method3482(double arg0, int arg1, class275 arg2) {
        for (int var5 = 0; var5 < this.field2216.length; var5++) {
            if (arg2.method4476(this.field2216[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2222 = new int[var6];
        for (int var7 = 0; var7 < this.field2216.length; var7++) {
            class395 var8 = class397.method548(arg2, this.field2216[var7]);
            var8.method6327();
            byte[] var9 = var8.field4238;
            int[] var10 = var8.field4236;
            int var11 = this.field2224[var7];
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
                var10[var17] = class196.method3514(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2217[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field4243 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2222[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field4243 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2222[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field4243 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2222[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("gf.n()V")
    public void method3487() {
        this.field2222 = null;
    }

    @ObfuscatedName("gf.f(I)V")
    public void method3483(int arg0) {
        if (this.field2222 == null) {
            return;
        }
        if (this.field2220 == 1 || this.field2220 == 3) {
            if (Statics.field2219 == null || Statics.field2219.length < this.field2222.length) {
                Statics.field2219 = new int[this.field2222.length];
            }
            short var2;
            if (this.field2222.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2222.length;
            int var4 = arg0 * var2 * this.field2212;
            int var5 = var3 - 1;
            if (this.field2220 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2219[var6] = this.field2222[var7];
            }
            int[] var8 = this.field2222;
            this.field2222 = Statics.field2219;
            Statics.field2219 = var8;
        }
        if (this.field2220 != 2 && this.field2220 != 4) {
            return;
        }
        if (Statics.field2219 == null || Statics.field2219.length < this.field2222.length) {
            Statics.field2219 = new int[this.field2222.length];
        }
        short var9;
        if (this.field2222.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2222.length;
        int var11 = this.field2212 * arg0;
        int var12 = var9 - 1;
        if (this.field2220 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2219[var15] = this.field2222[var16];
            }
        }
        int[] var17 = this.field2222;
        this.field2222 = Statics.field2219;
        Statics.field2219 = var17;
    }
}
