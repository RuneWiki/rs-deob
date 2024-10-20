package deob;

@ObfuscatedName("ko")
public class class303 {

    @ObfuscatedName("ko.h")
    public int[] field3480;

    @ObfuscatedName("ko.e")
    public int[] field3473;

    @ObfuscatedName("ko.v")
    public int field3477 = -1;

    @ObfuscatedName("ko.x")
    public int field3475 = 0;

    @ObfuscatedName("ko.m")
    public int field3472;

    @ObfuscatedName("ko.q")
    public long field3476;

    @ObfuscatedName("ko.f")
    public long field3478;

    @ObfuscatedName("ko.r")
    public class176[] field3479;

    @ObfuscatedName("ko.u")
    public boolean field3474 = false;

    @ObfuscatedName("ko.o")
    public static final int[] field3481 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ko.n")
    public static class269 field3482 = new class269(260);

    @ObfuscatedName("ko.h([I[Lfx;Z[IIIII)V")
    public void method5281(int[] arg0, class176[] arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6) {
        this.field3479 = arg1;
        this.field3474 = arg2;
        this.field3477 = arg6;
        this.method5264(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("ko.e([I[IIIB)V")
    public void method5264(int[] arg0, int[] arg1, int arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field911; var6++) {
                    class181 var7 = class181.method6957(var6);
                    if (var7 != null && !var7.field1972 && var7.field1965 == var5 + (arg2 == 1 ? 7 : 0)) {
                        arg0[field3481[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3480 = arg0;
        this.field3473 = arg1;
        this.field3475 = arg2;
        this.field3472 = arg3;
        this.method5269();
    }

    @ObfuscatedName("ko.v(IZB)V")
    public void method5288(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3475 == 1) {
            return;
        }
        int var3 = this.field3480[field3481[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class181 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field911) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field911 - 1;
                }
            }
            var4 = class181.method6957(var3);
        } while (var4 == null || var4.field1972 || var4.field1965 != (this.field3475 == 1 ? 7 : 0) + arg0);
        this.field3480[field3481[arg0]] = var3 + 256;
        this.method5269();
    }

    @ObfuscatedName("ko.x(IZI)V")
    public void method5266(int arg0, boolean arg1) {
        int var3 = this.field3473[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field4549[arg0].length) {
                    var3 = 0;
                }
            } while (!class305.method2686(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field4549[arg0].length - 1;
                }
            } while (!class305.method2686(arg0, var3));
        }
        this.field3473[arg0] = var3;
        this.method5269();
    }

    @ObfuscatedName("ko.m(II)V")
    public void method5267(int arg0) {
        if (this.field3475 != arg0) {
            this.method5264((int[]) null, this.field3473, arg0, -1);
        }
    }

    @ObfuscatedName("ko.q(Lqy;B)V")
    public void method5268(class467 arg0) {
        arg0.method7789(this.field3475);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3480[field3481[var2]];
            if (var3 == 0) {
                arg0.method7789(-1);
            } else {
                arg0.method7789(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method7789(this.field3473[var4]);
        }
    }

    @ObfuscatedName("ko.f(S)V")
    public void method5269() {
        long var1 = this.field3476;
        int var3 = this.field3480[5];
        int var4 = this.field3480[9];
        this.field3480[5] = var4;
        this.field3480[9] = var3;
        this.field3476 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3476 <<= 0x4;
            if (this.field3480[var5] >= 256) {
                this.field3476 += (long) (this.field3480[var5] - 256);
            }
        }
        if (this.field3480[0] >= 256) {
            this.field3476 += (long) (this.field3480[0] - 256 >> 4);
        }
        if (this.field3480[1] >= 256) {
            this.field3476 += (long) (this.field3480[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3476 <<= 0x3;
            this.field3476 += (long) this.field3473[var6];
        }
        this.field3476 <<= 0x1;
        this.field3476 += (long) (this.field3475 * 590976369) * 354323345L;
        this.field3480[5] = var3;
        this.field3480[9] = var4;
        if (var1 != 0L && this.field3476 != var1 || this.field3474) {
            field3482.method4916(var1);
        }
    }

    @ObfuscatedName("ko.r(Lga;ILga;II)Lhh;")
    public class224 method5263(class199 arg0, int arg1, class199 arg2, int arg3) {
        if (this.field3472 != -1) {
            return class187.method2847(this.field3472).method3378(arg0, arg1, arg2, arg3, (class186) null);
        }
        long var5 = this.field3476;
        int[] var7 = this.field3480;
        if (arg0 != null && (arg0.field2296 >= 0 || arg0.field2297 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3480[var8];
            }
            if (arg0.field2296 >= 0) {
                var5 += (long) (arg0.field2296 - this.field3480[5] << 40);
                var7[5] = arg0.field2296;
            }
            if (arg0.field2297 >= 0) {
                var5 += (long) (arg0.field2297 - this.field3480[3] << 48);
                var7[3] = arg0.field2297;
            }
        }
        class224 var9 = (class224) field3482.method4917(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class181.method6957(var12 - 256).method3264()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class197.method3345(var12 - 512).method3584(this.field3475)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3478 != -1L) {
                    var9 = (class224) field3482.method4917(this.field3478);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class208[] var13 = new class208[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class208 var17 = class181.method6957(var16 - 256).method3261();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class197 var18 = class197.method3345(var16 - 512);
                        class208 var19 = var18.method3585(this.field3475);
                        if (var19 != null) {
                            if (this.field3479 != null) {
                                class176 var20 = this.field3479[var15];
                                if (var20 != null) {
                                    if (var20.field1914 != null && var18.field2255 != null && var18.field2217.length == var20.field1914.length) {
                                        for (int var21 = 0; var21 < var18.field2255.length; var21++) {
                                            var19.method3828(var18.field2217[var21], var20.field1914[var21]);
                                        }
                                    }
                                    if (var20.field1915 != null && var18.field2218 != null && var18.field2262.length == var20.field1915.length) {
                                        for (int var22 = 0; var22 < var18.field2218.length; var22++) {
                                            var19.method3829(var18.field2262[var22], var20.field1915[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class208 var23 = new class208(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3473[var24] < Statics.field4549[var24].length) {
                        var23.method3828(Statics.field1105[var24], Statics.field4549[var24][this.field3473[var24]]);
                    }
                    if (this.field3473[var24] < Statics.field3446[var24].length) {
                        var23.method3828(Statics.field2018[var24], Statics.field3446[var24][this.field3473[var24]]);
                    }
                }
                var9 = var23.method3836(64, 850, -30, -50, -30);
                field3482.method4925(var9, var5);
                this.field3478 = var5;
            }
        }
        class224 var25;
        if (arg0 == null && arg2 == null) {
            var25 = var9.method4271(true);
        } else if (arg0 != null && arg2 != null) {
            var25 = arg0.method3709(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3668(var9, arg3);
        } else {
            var25 = arg0.method3668(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("ko.u(B)Lgi;")
    public class208 method5287() {
        if (this.field3472 != -1) {
            return class187.method2847(this.field3472).method3321((class186) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3480[var2];
            if (var3 >= 256 && var3 < 512 && !class181.method6957(var3 - 256).method3248()) {
                var1 = true;
            }
            if (var3 >= 512 && !class197.method3345(var3 - 512).method3586(this.field3475)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class208[] var4 = new class208[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3480[var6];
            if (var7 >= 256 && var7 < 512) {
                class208 var8 = class181.method6957(var7 - 256).method3249();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class208 var9 = class197.method3345(var7 - 512).method3587(this.field3475);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class208 var10 = new class208(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3473[var11] < Statics.field4549[var11].length) {
                var10.method3828(Statics.field1105[var11], Statics.field4549[var11][this.field3473[var11]]);
            }
            if (this.field3473[var11] < Statics.field3446[var11].length) {
                var10.method3828(Statics.field2018[var11], Statics.field3446[var11][this.field3473[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ko.b(I)I")
    public int method5271() {
        return this.field3472 == -1 ? (this.field3480[11] << 5) + (this.field3480[8] << 10) + (this.field3480[0] << 15) + (this.field3473[0] << 25) + (this.field3473[4] << 20) + this.field3480[1] : 305419896 + class187.method2847(this.field3472).field2026;
    }

    @ObfuscatedName("ay.j(S)V")
    public static void method480() {
        field3482.method4918();
    }
}
