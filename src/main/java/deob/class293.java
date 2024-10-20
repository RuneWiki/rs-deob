package deob;

@ObfuscatedName("kp")
public class class293 {

    @ObfuscatedName("kp.v")
    public int[] field3306;

    @ObfuscatedName("kp.c")
    public int[] field3298;

    @ObfuscatedName("kp.i")
    public boolean field3299;

    @ObfuscatedName("kp.f")
    public int field3297;

    @ObfuscatedName("kp.b")
    public long field3301;

    @ObfuscatedName("kp.n")
    public long field3302;

    @ObfuscatedName("kp.s")
    public class169[] field3303;

    @ObfuscatedName("kp.l")
    public boolean field3307 = false;

    @ObfuscatedName("kp.w")
    public static final int[] field3300 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("kp.k")
    public static class257 field3304 = new class257(260);

    @ObfuscatedName("kp.v([I[Lfj;Z[IZII)V")
    public void method5020(int[] arg0, class169[] arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field3303 = arg1;
        this.field3307 = arg2;
        this.method5021(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("kp.c([I[IZII)V")
    public void method5021(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1852; var6++) {
                    class174 var7 = class174.method3940(var6);
                    if (var7 != null && !var7.field1845 && var5 + (arg2 ? 7 : 0) == var7.field1848) {
                        arg0[field3300[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3306 = arg0;
        this.field3298 = arg1;
        this.field3299 = arg2;
        this.field3297 = arg3;
        this.method5025();
    }

    @ObfuscatedName("kp.i(IZI)V")
    public void method5022(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3299) {
            return;
        }
        int var3 = this.field3306[field3300[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class174 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1852) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1852 - 1;
                }
            }
            var4 = class174.method3940(var3);
        } while (var4 == null || var4.field1845 || var4.field1848 != (this.field3299 ? 7 : 0) + arg0);
        this.field3306[field3300[arg0]] = var3 + 256;
        this.method5025();
    }

    @ObfuscatedName("kp.f(IZI)V")
    public void method5044(int arg0, boolean arg1) {
        int var3 = this.field3298[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1630[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1630[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3298[arg0] = var3;
        this.method5025();
    }

    @ObfuscatedName("kp.b(ZB)V")
    public void method5023(boolean arg0) {
        if (this.field3299 != arg0) {
            this.method5021((int[]) null, this.field3298, arg0, -1);
        }
    }

    @ObfuscatedName("kp.n(Lpi;B)V")
    public void method5024(class438 arg0) {
        arg0.method6954(this.field3299 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3306[field3300[var2]];
            if (var3 == 0) {
                arg0.method6954(-1);
            } else {
                arg0.method6954(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method6954(this.field3298[var4]);
        }
    }

    @ObfuscatedName("kp.s(I)V")
    public void method5025() {
        long var1 = this.field3301;
        int var3 = this.field3306[5];
        int var4 = this.field3306[9];
        this.field3306[5] = var4;
        this.field3306[9] = var3;
        this.field3301 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3301 <<= 0x4;
            if (this.field3306[var5] >= 256) {
                this.field3301 += (long) (this.field3306[var5] - 256);
            }
        }
        if (this.field3306[0] >= 256) {
            this.field3301 += (long) (this.field3306[0] - 256 >> 4);
        }
        if (this.field3306[1] >= 256) {
            this.field3301 += (long) (this.field3306[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3301 <<= 0x3;
            this.field3301 += (long) this.field3298[var6];
        }
        this.field3301 <<= 0x1;
        this.field3301 += (long) (this.field3299 ? 1 : 0);
        this.field3306[5] = var3;
        this.field3306[9] = var4;
        if (var1 != 0L && this.field3301 != var1 || this.field3307) {
            field3304.method4645(var1);
        }
    }

    @ObfuscatedName("kp.l(Lgw;ILgw;II)Liq;")
    public class241 method5026(class191 arg0, int arg1, class191 arg2, int arg3) {
        if (this.field3297 != -1) {
            return class179.method344(this.field3297).method3175(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field3301;
        int[] var7 = this.field3306;
        if (arg0 != null && (arg0.field2163 >= 0 || arg0.field2158 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3306[var8];
            }
            if (arg0.field2163 >= 0) {
                var5 += (long) (arg0.field2163 - this.field3306[5] << 40);
                var7[5] = arg0.field2163;
            }
            if (arg0.field2158 >= 0) {
                var5 += (long) (arg0.field2158 - this.field3306[3] << 48);
                var7[3] = arg0.field2158;
            }
        }
        class241 var9 = (class241) field3304.method4644(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class174.method3940(var12 - 256).method3093()) {
                    var10 = true;
                }
                if (var12 >= 512 && !Statics.method268(var12 - 512).method3378(this.field3299)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3302 != -1L) {
                    var9 = (class241) field3304.method4644(this.field3302);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class226[] var13 = new class226[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class226 var17 = class174.method3940(var16 - 256).method3094();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class189 var18 = Statics.method268(var16 - 512);
                        class226 var19 = var18.method3382(this.field3299);
                        if (var19 != null) {
                            if (this.field3303 != null) {
                                class169 var20 = this.field3303[var15];
                                if (var20 != null) {
                                    if (var20.field1792 != null && var18.field2119 != null && var18.field2089.length == var20.field1792.length) {
                                        for (int var21 = 0; var21 < var18.field2119.length; var21++) {
                                            var19.method4046(var18.field2089[var21], var20.field1792[var21]);
                                        }
                                    }
                                    if (var20.field1791 != null && var18.field2101 != null && var18.field2088.length == var20.field1791.length) {
                                        for (int var22 = 0; var22 < var18.field2101.length; var22++) {
                                            var19.method4047(var18.field2088[var22], var20.field1791[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class226 var23 = new class226(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3298[var24] < Statics.field1630[var24].length) {
                        var23.method4046(Statics.field3305[var24], Statics.field1630[var24][this.field3298[var24]]);
                    }
                    if (this.field3298[var24] < Statics.field2357[var24].length) {
                        var23.method4046(Statics.field2301[var24], Statics.field2357[var24][this.field3298[var24]]);
                    }
                }
                var9 = var23.method4054(64, 850, -30, -50, -30);
                field3304.method4651(var9, var5);
                this.field3302 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class241 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method3459(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3485(var9, arg3);
        } else {
            var25 = arg0.method3485(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("kp.q(I)Lhc;")
    public class226 method5027() {
        if (this.field3297 != -1) {
            return class179.method344(this.field3297).method3168();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3306[var2];
            if (var3 >= 256 && var3 < 512 && !class174.method3940(var3 - 256).method3116()) {
                var1 = true;
            }
            if (var3 >= 512 && !Statics.method268(var3 - 512).method3386(this.field3299)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class226[] var4 = new class226[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3306[var6];
            if (var7 >= 256 && var7 < 512) {
                class226 var8 = class174.method3940(var7 - 256).method3096();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class226 var9 = Statics.method268(var7 - 512).method3381(this.field3299);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class226 var10 = new class226(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3298[var11] < Statics.field1630[var11].length) {
                var10.method4046(Statics.field3305[var11], Statics.field1630[var11][this.field3298[var11]]);
            }
            if (this.field3298[var11] < Statics.field2357[var11].length) {
                var10.method4046(Statics.field2301[var11], Statics.field2357[var11][this.field3298[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("kp.o(I)I")
    public int method5029() {
        return this.field3297 == -1 ? (this.field3306[11] << 5) + (this.field3306[8] << 10) + (this.field3306[0] << 15) + (this.field3298[4] << 20) + (this.field3298[0] << 25) + this.field3306[1] : 305419896 + class179.method344(this.field3297).field1909;
    }
}
