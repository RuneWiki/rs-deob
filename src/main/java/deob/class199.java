package deob;

@ObfuscatedName("gy")
public class class199 extends class412 {

    @ObfuscatedName("gy.k")
    public int field2323;

    @ObfuscatedName("gy.w")
    public boolean field2324;

    @ObfuscatedName("gy.s")
    public int[] field2322;

    @ObfuscatedName("gy.q")
    public int[] field2332;

    @ObfuscatedName("gy.m")
    public int[] field2321;

    @ObfuscatedName("gy.x")
    public int[] field2328;

    @ObfuscatedName("gy.j")
    public int field2327;

    @ObfuscatedName("gy.v")
    public int field2330;

    @ObfuscatedName("gy.h")
    public int[] field2331;

    @ObfuscatedName("gy.t")
    public boolean field2329 = false;

    public class199(class445 arg0) {
        this.field2323 = arg0.method7198();
        this.field2324 = arg0.method7196() == 1;
        int var2 = arg0.method7196();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2322 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2322[var3] = arg0.method7198();
        }
        if (var2 > 1) {
            this.field2332 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2332[var4] = arg0.method7196();
            }
        }
        if (var2 > 1) {
            this.field2321 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2321[var5] = arg0.method7196();
            }
        }
        this.field2328 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2328[var6] = arg0.method7201();
        }
        this.field2327 = arg0.method7196();
        this.field2330 = arg0.method7196();
        this.field2331 = null;
    }

    @ObfuscatedName("gy.c(DILlv;)Z")
    public boolean method3749(double arg0, int arg1, class317 arg2) {
        for (int var5 = 0; var5 < this.field2322.length; var5++) {
            if (arg2.method5422(this.field2322[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2331 = new int[var6];
        for (int var7 = 0; var7 < this.field2322.length; var7++) {
            int var8 = this.field2322[var7];
            byte[] var9 = arg2.method5454(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class459.method7026(var9);
                var10 = true;
            }
            class457 var11;
            if (var10) {
                class457 var12 = new class457();
                var12.field4817 = Statics.field1015;
                var12.field4823 = Statics.field4478;
                var12.field4822 = Statics.field4837[0];
                var12.field4816 = Statics.field4838[0];
                var12.field4818 = Statics.field482[0];
                var12.field4819 = Statics.field1389[0];
                var12.field4820 = Statics.field4839;
                var12.field4821 = Statics.field1776[0];
                Statics.field4837 = null;
                Statics.field4838 = null;
                Statics.field482 = null;
                Statics.field1389 = null;
                Statics.field4839 = null;
                Statics.field1776 = (byte[][]) null;
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method7574();
            byte[] var15 = var11.field4821;
            int[] var16 = var11.field4820;
            int var17 = this.field2328[var7];
            if ((var17 & 0xFF000000) == 16777216) {
            }
            if ((var17 & 0xFF000000) == 33554432) {
            }
            if ((var17 & 0xFF000000) == 50331648) {
                int var18 = var17 & 0xFF00FF;
                int var19 = var17 >> 8 & 0xFF;
                for (int var20 = 0; var20 < var16.length; var20++) {
                    int var21 = var16[var20];
                    if (var21 >> 8 == (var21 & 0xFFFF)) {
                        int var22 = var21 & 0xFF;
                        var16[var20] = var18 * var22 >> 8 & 0xFF00FF | var19 * var22 & 0xFF00;
                    }
                }
            }
            for (int var23 = 0; var23 < var16.length; var23++) {
                var16[var23] = class202.method3766(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field2332[var7 - 1];
            }
            if (var24 == 0) {
                if (var11.field4818 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field2331[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field4818 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field2331[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field4818 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field2331[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var24 == 1) {
            }
            if (var24 == 2) {
            }
            if (var24 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("gy.p()V")
    public void method3750() {
        this.field2331 = null;
    }

    @ObfuscatedName("gy.f(I)V")
    public void method3752(int arg0) {
        if (this.field2331 == null) {
            return;
        }
        if (this.field2327 == 1 || this.field2327 == 3) {
            if (Statics.field2333 == null || Statics.field2333.length < this.field2331.length) {
                Statics.field2333 = new int[this.field2331.length];
            }
            short var2;
            if (this.field2331.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2331.length;
            int var4 = arg0 * var2 * this.field2330;
            int var5 = var3 - 1;
            if (this.field2327 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2333[var6] = this.field2331[var7];
            }
            int[] var8 = this.field2331;
            this.field2331 = Statics.field2333;
            Statics.field2333 = var8;
        }
        if (this.field2327 != 2 && this.field2327 != 4) {
            return;
        }
        if (Statics.field2333 == null || Statics.field2333.length < this.field2331.length) {
            Statics.field2333 = new int[this.field2331.length];
        }
        short var9;
        if (this.field2331.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2331.length;
        int var11 = this.field2330 * arg0;
        int var12 = var9 - 1;
        if (this.field2327 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2333[var15] = this.field2331[var16];
            }
        }
        int[] var17 = this.field2331;
        this.field2331 = Statics.field2333;
        Statics.field2333 = var17;
    }
}
