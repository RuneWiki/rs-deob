package deob;

@ObfuscatedName("iu")
public class class260 {

    @ObfuscatedName("iu.n")
    public int[] field3021;

    @ObfuscatedName("iu.c")
    public int[] field3014;

    @ObfuscatedName("iu.m")
    public boolean field3015;

    @ObfuscatedName("iu.k")
    public int field3024;

    @ObfuscatedName("iu.o")
    public long field3013;

    @ObfuscatedName("iu.g")
    public long field3017;

    @ObfuscatedName("iu.z")
    public class151[] field3019;

    @ObfuscatedName("iu.a")
    public boolean field3016 = false;

    @ObfuscatedName("iu.v")
    public static final int[] field3018 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("iu.f")
    public static class236 field3022 = new class236(260);

    @ObfuscatedName("iu.n([I[Les;Z[IZII)V")
    public void method4477(int[] arg0, class151[] arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field3019 = arg1;
        this.field3016 = arg2;
        this.method4478(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("iu.c([I[IZIS)V")
    public void method4478(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3215; var6++) {
                    class156 var7 = class156.method2376(var6);
                    if (var7 != null && !var7.field1661 && (arg2 ? 7 : 0) + var5 == var7.field1654) {
                        arg0[field3018[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3021 = arg0;
        this.field3014 = arg1;
        this.field3015 = arg2;
        this.field3024 = arg3;
        this.method4482();
    }

    @ObfuscatedName("iu.m(IZB)V")
    public void method4489(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3015) {
            return;
        }
        int var3 = this.field3021[field3018[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class156 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3215) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3215 - 1;
                }
            }
            var4 = class156.method2376(var3);
        } while (var4 == null || var4.field1661 || arg0 + (this.field3015 ? 7 : 0) != var4.field1654);
        this.field3021[field3018[arg0]] = var3 + 256;
        this.method4482();
    }

    @ObfuscatedName("iu.k(IZB)V")
    public void method4484(int arg0, boolean arg1) {
        int var3 = this.field3014[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field55[arg0].length) {
                    var3 = 0;
                }
            } while (!class261.method3261(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field55[arg0].length - 1;
                }
            } while (!class261.method3261(arg0, var3));
        }
        this.field3014[arg0] = var3;
        this.method4482();
    }

    @ObfuscatedName("iu.o(ZS)V")
    public void method4509(boolean arg0) {
        if (this.field3015 != arg0) {
            this.method4478((int[]) null, this.field3014, arg0, -1);
        }
    }

    @ObfuscatedName("iu.g(Lot;B)V")
    public void method4481(class400 arg0) {
        arg0.method6200(this.field3015 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3021[field3018[var2]];
            if (var3 == 0) {
                arg0.method6200(-1);
            } else {
                arg0.method6200(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method6200(this.field3014[var4]);
        }
    }

    @ObfuscatedName("iu.z(B)V")
    public void method4482() {
        long var1 = this.field3013;
        int var3 = this.field3021[5];
        int var4 = this.field3021[9];
        this.field3021[5] = var4;
        this.field3021[9] = var3;
        this.field3013 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3013 <<= 0x4;
            if (this.field3021[var5] >= 256) {
                this.field3013 += (long) (this.field3021[var5] - 256);
            }
        }
        if (this.field3021[0] >= 256) {
            this.field3013 += (long) (this.field3021[0] - 256 >> 4);
        }
        if (this.field3021[1] >= 256) {
            this.field3013 += (long) (this.field3021[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3013 <<= 0x3;
            this.field3013 += (long) this.field3014[var6];
        }
        this.field3013 <<= 0x1;
        this.field3013 += (long) (this.field3015 ? 1 : 0);
        this.field3021[5] = var3;
        this.field3021[9] = var4;
        if (var1 != 0L && this.field3013 != var1 || this.field3016) {
            field3022.method4172(var1);
        }
    }

    @ObfuscatedName("iu.a(Lfa;ILfa;II)Lhg;")
    public class220 method4483(class172 arg0, int arg1, class172 arg2, int arg3) {
        if (this.field3024 != -1) {
            return class161.method1950(this.field3024).method2717(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field3013;
        int[] var7 = this.field3021;
        if (arg0 != null && (arg0.field1963 >= 0 || arg0.field1946 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3021[var8];
            }
            if (arg0.field1963 >= 0) {
                var5 += (long) (arg0.field1963 - this.field3021[5] << 40);
                var7[5] = arg0.field1963;
            }
            if (arg0.field1946 >= 0) {
                var5 += (long) (arg0.field1946 - this.field3021[3] << 48);
                var7[3] = arg0.field1946;
            }
        }
        class220 var9 = (class220) field3022.method4167(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class156.method2376(var12 - 256).method2632()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class170.method1776(var12 - 512).method2943(this.field3015)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3017 != -1L) {
                    var9 = (class220) field3022.method4167(this.field3017);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class206[] var13 = new class206[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class206 var17 = class156.method2376(var16 - 256).method2633();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class170 var18 = class170.method1776(var16 - 512);
                        class206 var19 = var18.method2995(this.field3015);
                        if (var19 != null) {
                            if (this.field3019 != null) {
                                class151 var20 = this.field3019[var15];
                                if (var20 != null) {
                                    if (var20.field1601 != null && var18.field1894 != null && var18.field1885.length == var20.field1601.length) {
                                        for (int var21 = 0; var21 < var18.field1894.length; var21++) {
                                            var19.method3673(var18.field1885[var21], var20.field1601[var21]);
                                        }
                                    }
                                    if (var20.field1600 != null && var18.field1882 != null && var18.field1887.length == var20.field1600.length) {
                                        for (int var22 = 0; var22 < var18.field1882.length; var22++) {
                                            var19.method3620(var18.field1887[var22], var20.field1600[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class206 var23 = new class206(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3014[var24] < Statics.field55[var24].length) {
                        var23.method3673(Statics.field3949[var24], Statics.field55[var24][this.field3014[var24]]);
                    }
                    if (this.field3014[var24] < Statics.field1331[var24].length) {
                        var23.method3673(Statics.field168[var24], Statics.field1331[var24][this.field3014[var24]]);
                    }
                }
                var9 = var23.method3627(64, 850, -30, -50, -30);
                field3022.method4169(var9, var5);
                this.field3017 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class220 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method3044(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3041(var9, arg3);
        } else {
            var25 = arg0.method3041(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("iu.u(I)Lgl;")
    public class206 method4510() {
        if (this.field3024 != -1) {
            return class161.method1950(this.field3024).method2721();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3021[var2];
            if (var3 >= 256 && var3 < 512 && !class156.method2376(var3 - 256).method2634()) {
                var1 = true;
            }
            if (var3 >= 512 && !class170.method1776(var3 - 512).method2945(this.field3015)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class206[] var4 = new class206[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3021[var6];
            if (var7 >= 256 && var7 < 512) {
                class206 var8 = class156.method2376(var7 - 256).method2635();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class206 var9 = class170.method1776(var7 - 512).method3013(this.field3015);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class206 var10 = new class206(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3014[var11] < Statics.field55[var11].length) {
                var10.method3673(Statics.field3949[var11], Statics.field55[var11][this.field3014[var11]]);
            }
            if (this.field3014[var11] < Statics.field1331[var11].length) {
                var10.method3673(Statics.field168[var11], Statics.field1331[var11][this.field3014[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("iu.e(B)I")
    public int method4485() {
        return this.field3024 == -1 ? (this.field3021[11] << 5) + (this.field3021[8] << 10) + (this.field3021[0] << 15) + (this.field3014[4] << 20) + (this.field3014[0] << 25) + this.field3021[1] : 305419896 + class161.method1950(this.field3024).field1709;
    }

    @ObfuscatedName("gm.l(I)V")
    public static void method3543() {
        field3022.method4168();
    }
}
