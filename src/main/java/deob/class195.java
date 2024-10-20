package deob;

@ObfuscatedName("go")
public class class195 extends class354 {

    @ObfuscatedName("go.l")
    public int field2201;

    @ObfuscatedName("go.n")
    public boolean field2202;

    @ObfuscatedName("go.w")
    public int[] field2206;

    @ObfuscatedName("go.f")
    public int[] field2208;

    @ObfuscatedName("go.o")
    public int[] field2205;

    @ObfuscatedName("go.x")
    public int[] field2200;

    @ObfuscatedName("go.r")
    public int field2197;

    @ObfuscatedName("go.p")
    public int field2209;

    @ObfuscatedName("go.h")
    public int[] field2207;

    @ObfuscatedName("go.k")
    public boolean field2210 = false;

    public class195(class385 arg0) {
        this.field2201 = arg0.method6053();
        this.field2202 = arg0.method5958() == 1;
        int var2 = arg0.method5958();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2206 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2206[var3] = arg0.method6053();
        }
        if (var2 > 1) {
            this.field2208 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2208[var4] = arg0.method5958();
            }
        }
        if (var2 > 1) {
            this.field2205 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2205[var5] = arg0.method5958();
            }
        }
        this.field2200 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2200[var6] = arg0.method6182();
        }
        this.field2197 = arg0.method5958();
        this.field2209 = arg0.method5958();
        this.field2207 = null;
    }

    @ObfuscatedName("go.s(DILjy;)Z")
    public boolean method3452(double arg0, int arg1, class277 arg2) {
        for (int var5 = 0; var5 < this.field2206.length; var5++) {
            if (arg2.method4519(this.field2206[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2207 = new int[var6];
        for (int var7 = 0; var7 < this.field2206.length; var7++) {
            class397 var8 = class399.method2727(arg2, this.field2206[var7]);
            var8.method6355();
            byte[] var9 = var8.field4262;
            int[] var10 = var8.field4261;
            int var11 = this.field2200[var7];
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
                var10[var17] = class198.method3463(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2208[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field4263 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2207[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field4263 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2207[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field4263 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2207[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("go.t()V")
    public void method3443() {
        this.field2207 = null;
    }

    @ObfuscatedName("go.v(I)V")
    public void method3444(int arg0) {
        if (this.field2207 == null) {
            return;
        }
        if (this.field2197 == 1 || this.field2197 == 3) {
            if (Statics.field2211 == null || Statics.field2211.length < this.field2207.length) {
                Statics.field2211 = new int[this.field2207.length];
            }
            short var2;
            if (this.field2207.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2207.length;
            int var4 = arg0 * var2 * this.field2209;
            int var5 = var3 - 1;
            if (this.field2197 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2211[var6] = this.field2207[var7];
            }
            int[] var8 = this.field2207;
            this.field2207 = Statics.field2211;
            Statics.field2211 = var8;
        }
        if (this.field2197 != 2 && this.field2197 != 4) {
            return;
        }
        if (Statics.field2211 == null || Statics.field2211.length < this.field2207.length) {
            Statics.field2211 = new int[this.field2207.length];
        }
        short var9;
        if (this.field2207.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2207.length;
        int var11 = this.field2209 * arg0;
        int var12 = var9 - 1;
        if (this.field2197 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2211[var15] = this.field2207[var16];
            }
        }
        int[] var17 = this.field2207;
        this.field2207 = Statics.field2211;
        Statics.field2211 = var17;
    }
}
