package deob;

@ObfuscatedName("gy")
public class class191 extends class392 {

    @ObfuscatedName("gy.r")
    public int field2211;

    @ObfuscatedName("gy.o")
    public boolean field2212;

    @ObfuscatedName("gy.i")
    public int[] field2219;

    @ObfuscatedName("gy.w")
    public int[] field2220;

    @ObfuscatedName("gy.v")
    public int[] field2215;

    @ObfuscatedName("gy.a")
    public int[] field2216;

    @ObfuscatedName("gy.y")
    public int field2217;

    @ObfuscatedName("gy.u")
    public int field2207;

    @ObfuscatedName("gy.h")
    public int[] field2214;

    @ObfuscatedName("gy.q")
    public boolean field2209 = false;

    public class191(class421 arg0) {
        this.field2211 = arg0.method6666();
        this.field2212 = arg0.method6686() == 1;
        int var2 = arg0.method6686();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2219 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2219[var3] = arg0.method6666();
        }
        if (var2 > 1) {
            this.field2220 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2220[var4] = arg0.method6686();
            }
        }
        if (var2 > 1) {
            this.field2215 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2215[var5] = arg0.method6686();
            }
        }
        this.field2216 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2216[var6] = arg0.method6669();
        }
        this.field2217 = arg0.method6686();
        this.field2207 = arg0.method6686();
        this.field2214 = null;
    }

    @ObfuscatedName("gy.c(DILkq;)Z")
    public boolean method3453(double arg0, int arg1, class307 arg2) {
        for (int var5 = 0; var5 < this.field2219.length; var5++) {
            if (arg2.method5039(this.field2219[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2214 = new int[var6];
        for (int var7 = 0; var7 < this.field2219.length; var7++) {
            int var8 = this.field2219[var7];
            byte[] var9 = arg2.method5056(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class435.method6097(var9);
                var10 = true;
            }
            class433 var11;
            if (var10) {
                class433 var12 = new class433();
                var12.field4599 = Statics.field4613;
                var12.field4593 = Statics.field4615;
                var12.field4597 = Statics.field4616[0];
                var12.field4598 = Statics.field4614[0];
                var12.field4595 = Statics.field4617[0];
                var12.field4600 = Statics.field4415[0];
                var12.field4594 = Statics.field1189;
                var12.field4596 = Statics.field2610[0];
                class435.method361();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method7037();
            byte[] var15 = var11.field4596;
            int[] var16 = var11.field4594;
            int var17 = this.field2216[var7];
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
                var16[var23] = class194.method3467(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field2220[var7 - 1];
            }
            if (var24 == 0) {
                if (var11.field4595 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field2214[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field4595 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field2214[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field4595 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field2214[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("gy.l()V")
    public void method3454() {
        this.field2214 = null;
    }

    @ObfuscatedName("gy.s(I)V")
    public void method3455(int arg0) {
        if (this.field2214 == null) {
            return;
        }
        if (this.field2217 == 1 || this.field2217 == 3) {
            if (Statics.field2221 == null || Statics.field2221.length < this.field2214.length) {
                Statics.field2221 = new int[this.field2214.length];
            }
            short var2;
            if (this.field2214.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2214.length;
            int var4 = arg0 * var2 * this.field2207;
            int var5 = var3 - 1;
            if (this.field2217 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2221[var6] = this.field2214[var7];
            }
            int[] var8 = this.field2214;
            this.field2214 = Statics.field2221;
            Statics.field2221 = var8;
        }
        if (this.field2217 != 2 && this.field2217 != 4) {
            return;
        }
        if (Statics.field2221 == null || Statics.field2221.length < this.field2214.length) {
            Statics.field2221 = new int[this.field2214.length];
        }
        short var9;
        if (this.field2214.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2214.length;
        int var11 = this.field2207 * arg0;
        int var12 = var9 - 1;
        if (this.field2217 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2221[var15] = this.field2214[var16];
            }
        }
        int[] var17 = this.field2214;
        this.field2214 = Statics.field2221;
        Statics.field2221 = var17;
    }
}
