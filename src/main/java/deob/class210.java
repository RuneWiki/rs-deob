package deob;

@ObfuscatedName("hx")
public class class210 extends class433 {

    @ObfuscatedName("hx.m")
    public int field2437;

    @ObfuscatedName("hx.q")
    public boolean field2443;

    @ObfuscatedName("hx.f")
    public int[] field2438;

    @ObfuscatedName("hx.r")
    public int[] field2440;

    @ObfuscatedName("hx.u")
    public int[] field2441;

    @ObfuscatedName("hx.b")
    public int[] field2442;

    @ObfuscatedName("hx.j")
    public int field2435;

    @ObfuscatedName("hx.g")
    public int field2444;

    @ObfuscatedName("hx.i")
    public int[] field2433;

    @ObfuscatedName("hx.o")
    public boolean field2446 = false;

    public class210(class467 arg0) {
        this.field2437 = arg0.method7794();
        this.field2443 = arg0.method7792() == 1;
        int var2 = arg0.method7792();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2438 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2438[var3] = arg0.method7794();
        }
        if (var2 > 1) {
            this.field2440 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2440[var4] = arg0.method7792();
            }
        }
        if (var2 > 1) {
            this.field2441 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2441[var5] = arg0.method7792();
            }
        }
        this.field2442 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2442[var6] = arg0.method7946();
        }
        this.field2435 = arg0.method7792();
        this.field2444 = arg0.method7792();
        this.field2433 = null;
    }

    @ObfuscatedName("hx.h(DILly;)Z")
    public boolean method3915(double arg0, int arg1, class333 arg2) {
        for (int var5 = 0; var5 < this.field2438.length; var5++) {
            if (arg2.method5853(this.field2438[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2433 = new int[var6];
        for (int var7 = 0; var7 < this.field2438.length; var7++) {
            int var8 = this.field2438[var7];
            byte[] var9 = arg2.method5851(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class482.method3204(var9);
                var10 = true;
            }
            class480 var11;
            if (var10) {
                class480 var12 = new class480();
                var12.field5006 = Statics.field4246;
                var12.field5009 = Statics.field5022;
                var12.field5004 = Statics.field5024[0];
                var12.field5007 = Statics.field4644[0];
                var12.field5008 = Statics.field59[0];
                var12.field5005 = Statics.field2128[0];
                var12.field5003 = Statics.field3022;
                var12.field5002 = Statics.field2432[0];
                Statics.field5024 = null;
                Statics.field4644 = null;
                Statics.field59 = null;
                Statics.field2128 = null;
                Statics.field3022 = null;
                Statics.field2432 = (byte[][]) null;
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method8204();
            byte[] var15 = var11.field5002;
            int[] var16 = var11.field5003;
            int var17 = this.field2442[var7];
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
                var16[var23] = class213.method3933(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field2440[var7 - 1];
            }
            if (var24 == 0) {
                if (var11.field5008 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field2433[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field5008 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field2433[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field5008 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field2433[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("hx.e()V")
    public void method3919() {
        this.field2433 = null;
    }

    @ObfuscatedName("hx.v(I)V")
    public void method3914(int arg0) {
        if (this.field2433 == null) {
            return;
        }
        if (this.field2435 == 1 || this.field2435 == 3) {
            if (Statics.field2447 == null || Statics.field2447.length < this.field2433.length) {
                Statics.field2447 = new int[this.field2433.length];
            }
            short var2;
            if (this.field2433.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2433.length;
            int var4 = arg0 * var2 * this.field2444;
            int var5 = var3 - 1;
            if (this.field2435 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2447[var6] = this.field2433[var7];
            }
            int[] var8 = this.field2433;
            this.field2433 = Statics.field2447;
            Statics.field2447 = var8;
        }
        if (this.field2435 != 2 && this.field2435 != 4) {
            return;
        }
        if (Statics.field2447 == null || Statics.field2447.length < this.field2433.length) {
            Statics.field2447 = new int[this.field2433.length];
        }
        short var9;
        if (this.field2433.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2433.length;
        int var11 = this.field2444 * arg0;
        int var12 = var9 - 1;
        if (this.field2435 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2447[var15] = this.field2433[var16];
            }
        }
        int[] var17 = this.field2433;
        this.field2433 = Statics.field2447;
        Statics.field2447 = var17;
    }
}
