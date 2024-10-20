package deob;

@ObfuscatedName("iu")
public class class255 extends class176 {

    @ObfuscatedName("iu.d")
    public static class146 field3404 = new class146(64);

    @ObfuscatedName("iu.f")
    public static class146 field3386 = new class146(50);

    @ObfuscatedName("iu.c")
    public static class146 field3406 = new class146(200);

    @ObfuscatedName("iu.y")
    public int field3389;

    @ObfuscatedName("iu.p")
    public int field3382;

    @ObfuscatedName("iu.b")
    public String field3434 = class225.field2929;

    @ObfuscatedName("iu.g")
    public short[] field3388;

    @ObfuscatedName("iu.e")
    public short[] field3391;

    @ObfuscatedName("iu.z")
    public short[] field3393;

    @ObfuscatedName("iu.a")
    public short[] field3394;

    @ObfuscatedName("iu.w")
    public int field3395 = 2000;

    @ObfuscatedName("iu.l")
    public int field3396 = 0;

    @ObfuscatedName("iu.h")
    public int field3385 = 0;

    @ObfuscatedName("iu.v")
    public int field3398 = 0;

    @ObfuscatedName("iu.m")
    public int field3423 = 0;

    @ObfuscatedName("iu.o")
    public int field3400 = 0;

    @ObfuscatedName("iu.av")
    public int field3401 = 0;

    @ObfuscatedName("iu.am")
    public int field3402 = 1;

    @ObfuscatedName("iu.ai")
    public boolean field3403 = false;

    @ObfuscatedName("iu.af")
    public String[] field3397 = new String[] { null, null, class225.field2739, null, null };

    @ObfuscatedName("iu.az")
    public String[] field3405 = new String[] { null, null, null, null, class225.field2740 };

    @ObfuscatedName("iu.an")
    public int field3387 = -2;

    @ObfuscatedName("iu.at")
    public int field3407 = -1;

    @ObfuscatedName("iu.as")
    public int field3408 = -1;

    @ObfuscatedName("iu.ak")
    public int field3412 = 0;

    @ObfuscatedName("iu.ao")
    public int field3409 = -1;

    @ObfuscatedName("iu.ac")
    public int field3411 = -1;

    @ObfuscatedName("iu.ar")
    public int field3422 = 0;

    @ObfuscatedName("iu.au")
    public int field3413 = -1;

    @ObfuscatedName("iu.ax")
    public int field3414 = -1;

    @ObfuscatedName("iu.ag")
    public int field3415 = -1;

    @ObfuscatedName("iu.aa")
    public int field3416 = -1;

    @ObfuscatedName("iu.ap")
    public int field3417 = -1;

    @ObfuscatedName("iu.aq")
    public int field3418 = -1;

    @ObfuscatedName("iu.ay")
    public int[] field3419;

    @ObfuscatedName("iu.ad")
    public int[] field3420;

    @ObfuscatedName("iu.al")
    public int field3421 = -1;

    @ObfuscatedName("iu.ah")
    public int field3428 = -1;

    @ObfuscatedName("iu.ab")
    public int field3392 = 128;

    @ObfuscatedName("iu.aw")
    public int field3410 = 128;

    @ObfuscatedName("iu.ae")
    public int field3425 = 128;

    @ObfuscatedName("iu.bk")
    public int field3426 = 0;

    @ObfuscatedName("iu.bw")
    public int field3427 = 0;

    @ObfuscatedName("iu.bo")
    public int field3399 = 0;

    @ObfuscatedName("iu.bn")
    public class316 field3429;

    @ObfuscatedName("iu.bp")
    public boolean field3430 = false;

    @ObfuscatedName("iu.bz")
    public int field3431 = -1;

    @ObfuscatedName("iu.bh")
    public int field3432 = -1;

    @ObfuscatedName("iu.bv")
    public int field3433 = -1;

    @ObfuscatedName("iu.bj")
    public int field3390 = -1;

    @ObfuscatedName("gx.s(Lhz;Lhz;ZLkb;I)V")
    public static void method3350(class234 arg0, class234 arg1, boolean arg2, class295 arg3) {
        Statics.field586 = arg0;
        Statics.field1868 = arg1;
        Statics.field1928 = arg2;
        Statics.field563 = Statics.field586.method3776(10);
        Statics.field515 = arg3;
    }

    @ObfuscatedName("b.j(II)Liu;")
    public static class255 method144(int arg0) {
        class255 var1 = (class255) field3404.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field586.method3790(10, arg0);
        class255 var3 = new class255();
        var3.field3389 = arg0;
        if (var2 != null) {
            var3.method4235(new class300(var2));
        }
        var3.method4273();
        if (var3.field3428 != -1) {
            var3.method4237(method144(var3.field3428), method144(var3.field3421));
        }
        if (var3.field3432 != -1) {
            var3.method4238(method144(var3.field3432), method144(var3.field3431));
        }
        if (var3.field3390 != -1) {
            var3.method4239(method144(var3.field3390), method144(var3.field3433));
        }
        if (!Statics.field1928 && var3.field3403) {
            var3.field3434 = class225.field2940;
            var3.field3430 = false;
            var3.field3397 = null;
            var3.field3405 = null;
            var3.field3387 = -1;
            var3.field3399 = 0;
            if (var3.field3429 != null) {
                boolean var4 = false;
                for (class181 var5 = var3.field3429.method5402(); var5 != null; var5 = var3.field3429.method5403()) {
                    class250 var6 = class250.method4003((int) var5.field2096);
                    if (var6.field3285) {
                        var5.method3304();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3429 = null;
                }
            }
        }
        field3404.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.i(I)V")
    public void method4273() {
    }

    @ObfuscatedName("iu.k(Lky;B)V")
    public void method4235(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method4236(arg0, var2);
        }
    }

    @ObfuscatedName("iu.u(Lky;IB)V")
    public void method4236(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3382 = arg0.method5054();
        } else if (arg1 == 2) {
            this.field3434 = arg0.method5150();
        } else if (arg1 == 4) {
            this.field3395 = arg0.method5054();
        } else if (arg1 == 5) {
            this.field3396 = arg0.method5054();
        } else if (arg1 == 6) {
            this.field3385 = arg0.method5054();
        } else if (arg1 == 7) {
            this.field3423 = arg0.method5054();
            if (this.field3423 > 32767) {
                this.field3423 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3400 = arg0.method5054();
            if (this.field3400 > 32767) {
                this.field3400 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3401 = 1;
        } else if (arg1 == 12) {
            this.field3402 = arg0.method5056();
        } else if (arg1 == 16) {
            this.field3403 = true;
        } else if (arg1 == 23) {
            this.field3407 = arg0.method5054();
            this.field3412 = arg0.method5179();
        } else if (arg1 == 24) {
            this.field3408 = arg0.method5054();
        } else if (arg1 == 25) {
            this.field3409 = arg0.method5054();
            this.field3422 = arg0.method5179();
        } else if (arg1 == 26) {
            this.field3411 = arg0.method5054();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3397[arg1 - 30] = arg0.method5150();
            if (this.field3397[arg1 - 30].equalsIgnoreCase(class225.field2741)) {
                this.field3397[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3405[arg1 - 35] = arg0.method5150();
        } else if (arg1 == 40) {
            int var3 = arg0.method5179();
            this.field3388 = new short[var3];
            this.field3391 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3388[var4] = (short) arg0.method5054();
                this.field3391[var4] = (short) arg0.method5054();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5179();
            this.field3393 = new short[var5];
            this.field3394 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3393[var6] = (short) arg0.method5054();
                this.field3394[var6] = (short) arg0.method5054();
            }
        } else if (arg1 == 42) {
            this.field3387 = arg0.method5034();
        } else if (arg1 == 65) {
            this.field3430 = true;
        } else if (arg1 == 78) {
            this.field3413 = arg0.method5054();
        } else if (arg1 == 79) {
            this.field3414 = arg0.method5054();
        } else if (arg1 == 90) {
            this.field3415 = arg0.method5054();
        } else if (arg1 == 91) {
            this.field3417 = arg0.method5054();
        } else if (arg1 == 92) {
            this.field3416 = arg0.method5054();
        } else if (arg1 == 93) {
            this.field3418 = arg0.method5054();
        } else if (arg1 == 95) {
            this.field3398 = arg0.method5054();
        } else if (arg1 == 97) {
            this.field3421 = arg0.method5054();
        } else if (arg1 == 98) {
            this.field3428 = arg0.method5054();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3419 == null) {
                this.field3419 = new int[10];
                this.field3420 = new int[10];
            }
            this.field3419[arg1 - 100] = arg0.method5054();
            this.field3420[arg1 - 100] = arg0.method5054();
        } else if (arg1 == 110) {
            this.field3392 = arg0.method5054();
        } else if (arg1 == 111) {
            this.field3410 = arg0.method5054();
        } else if (arg1 == 112) {
            this.field3425 = arg0.method5054();
        } else if (arg1 == 113) {
            this.field3426 = arg0.method5034();
        } else if (arg1 == 114) {
            this.field3427 = arg0.method5034() * 5;
        } else if (arg1 == 115) {
            this.field3399 = arg0.method5179();
        } else if (arg1 == 139) {
            this.field3431 = arg0.method5054();
        } else if (arg1 == 140) {
            this.field3432 = arg0.method5054();
        } else if (arg1 == 148) {
            this.field3433 = arg0.method5054();
        } else if (arg1 == 149) {
            this.field3390 = arg0.method5054();
        } else if (arg1 == 249) {
            this.field3429 = Statics.method2030(arg0, this.field3429);
        }
    }

    @ObfuscatedName("iu.n(Liu;Liu;I)V")
    public void method4237(class255 arg0, class255 arg1) {
        this.field3382 = arg0.field3382;
        this.field3395 = arg0.field3395;
        this.field3396 = arg0.field3396;
        this.field3385 = arg0.field3385;
        this.field3398 = arg0.field3398;
        this.field3423 = arg0.field3423;
        this.field3400 = arg0.field3400;
        this.field3388 = arg0.field3388;
        this.field3391 = arg0.field3391;
        this.field3393 = arg0.field3393;
        this.field3394 = arg0.field3394;
        this.field3434 = arg1.field3434;
        this.field3403 = arg1.field3403;
        this.field3402 = arg1.field3402;
        this.field3401 = 1;
    }

    @ObfuscatedName("iu.t(Liu;Liu;I)V")
    public void method4238(class255 arg0, class255 arg1) {
        this.field3382 = arg0.field3382;
        this.field3395 = arg0.field3395;
        this.field3396 = arg0.field3396;
        this.field3385 = arg0.field3385;
        this.field3398 = arg0.field3398;
        this.field3423 = arg0.field3423;
        this.field3400 = arg0.field3400;
        this.field3388 = arg1.field3388;
        this.field3391 = arg1.field3391;
        this.field3393 = arg1.field3393;
        this.field3394 = arg1.field3394;
        this.field3434 = arg1.field3434;
        this.field3403 = arg1.field3403;
        this.field3401 = arg1.field3401;
        this.field3407 = arg1.field3407;
        this.field3408 = arg1.field3408;
        this.field3413 = arg1.field3413;
        this.field3409 = arg1.field3409;
        this.field3411 = arg1.field3411;
        this.field3414 = arg1.field3414;
        this.field3415 = arg1.field3415;
        this.field3416 = arg1.field3416;
        this.field3417 = arg1.field3417;
        this.field3418 = arg1.field3418;
        this.field3399 = arg1.field3399;
        this.field3397 = arg1.field3397;
        this.field3405 = new String[5];
        if (arg1.field3405 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3405[var3] = arg1.field3405[var3];
            }
        }
        this.field3405[4] = class225.field2745;
        this.field3402 = 0;
    }

    @ObfuscatedName("iu.q(Liu;Liu;B)V")
    public void method4239(class255 arg0, class255 arg1) {
        this.field3382 = arg0.field3382;
        this.field3395 = arg0.field3395;
        this.field3396 = arg0.field3396;
        this.field3385 = arg0.field3385;
        this.field3398 = arg0.field3398;
        this.field3423 = arg0.field3423;
        this.field3400 = arg0.field3400;
        this.field3388 = arg0.field3388;
        this.field3391 = arg0.field3391;
        this.field3393 = arg0.field3393;
        this.field3394 = arg0.field3394;
        this.field3401 = arg0.field3401;
        this.field3434 = arg1.field3434;
        this.field3402 = 0;
        this.field3403 = false;
        this.field3430 = false;
    }

    @ObfuscatedName("iu.x(II)Ldq;")
    public final class122 method4240(int arg0) {
        if (this.field3419 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3420[var3] && this.field3420[var3] != 0) {
                    var2 = this.field3419[var3];
                }
            }
            if (var2 != -1) {
                return method144(var2).method4240(1);
            }
        }
        class122 var4 = class122.method2521(Statics.field1868, this.field3382, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3392 != 128 || this.field3410 != 128 || this.field3425 != 128) {
            var4.method2537(this.field3392, this.field3410, this.field3425);
        }
        if (this.field3388 != null) {
            for (int var5 = 0; var5 < this.field3388.length; var5++) {
                var4.method2534(this.field3388[var5], this.field3391[var5]);
            }
        }
        if (this.field3393 != null) {
            for (int var6 = 0; var6 < this.field3393.length; var6++) {
                var4.method2535(this.field3393[var6], this.field3394[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iu.d(IB)Ldo;")
    public final class128 method4241(int arg0) {
        if (this.field3419 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3420[var3] && this.field3420[var3] != 0) {
                    var2 = this.field3419[var3];
                }
            }
            if (var2 != -1) {
                return method144(var2).method4241(1);
            }
        }
        class128 var4 = (class128) field3386.method3065((long) this.field3389);
        if (var4 != null) {
            return var4;
        }
        class122 var5 = class122.method2521(Statics.field1868, this.field3382, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3392 != 128 || this.field3410 != 128 || this.field3425 != 128) {
            var5.method2537(this.field3392, this.field3410, this.field3425);
        }
        if (this.field3388 != null) {
            for (int var6 = 0; var6 < this.field3388.length; var6++) {
                var5.method2534(this.field3388[var6], this.field3391[var6]);
            }
        }
        if (this.field3393 != null) {
            for (int var7 = 0; var7 < this.field3393.length; var7++) {
                var5.method2535(this.field3393[var7], this.field3394[var7]);
            }
        }
        class128 var8 = var5.method2542(this.field3426 + 64, this.field3427 + 768, -50, -10, -50);
        var8.field1676 = true;
        field3386.method3067(var8, (long) this.field3389);
        return var8;
    }

    @ObfuscatedName("iu.f(II)Liu;")
    public class255 method4242(int arg0) {
        if (this.field3419 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3420[var3] && this.field3420[var3] != 0) {
                    var2 = this.field3419[var3];
                }
            }
            if (var2 != -1) {
                return method144(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ew.c(IIIIIZI)Lls;")
    public static final class325 method3134(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class325 var8 = (class325) field3406.method3065(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class255 var9 = method144(arg0);
        if (arg1 > 1 && var9.field3419 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3420[var11] && var9.field3420[var11] != 0) {
                    var10 = var9.field3419[var11];
                }
            }
            if (var10 != -1) {
                var9 = method144(var10);
            }
        }
        class128 var12 = var9.method4241(1);
        if (var12 == null) {
            return null;
        }
        class325 var13 = null;
        if (var9.field3428 != -1) {
            var13 = method3134(var9.field3421, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3432 != -1) {
            var13 = method3134(var9.field3431, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3390 != -1) {
            var13 = method3134(var9.field3433, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3854;
        int var15 = Statics.field3849;
        int var16 = Statics.field3848;
        int[] var17 = new int[4];
        class321.method5481(var17);
        class325 var18 = new class325(36, 32);
        class321.method5477(var18.field3874, 36, 32);
        class321.method5506();
        class131.method2744();
        class131.method2747(16, 16);
        class131.field1745 = false;
        if (var9.field3390 != -1) {
            var13.method5602(0, 0);
        }
        int var19 = var9.field3395;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class131.field1767[var9.field3396] * var19 >> 16;
        int var21 = class131.field1768[var9.field3396] * var19 >> 16;
        var12.method2627();
        var12.method2692(0, var9.field3385, var9.field3398, var9.field3396, var9.field3423, var9.field3400 + var12.field1851 / 2 + var20, var9.field3400 + var21);
        if (var9.field3432 != -1) {
            var13.method5602(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5594(1);
        }
        if (arg2 >= 2) {
            var18.method5594(16777215);
        }
        if (arg3 != 0) {
            var18.method5595(arg3);
        }
        class321.method5477(var18.field3874, 36, 32);
        if (var9.field3428 != -1) {
            var13.method5602(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3401 == 1) {
            Statics.field515.method4982(method2073(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3406.method3067(var18, var6);
        }
        class321.method5477(var14, var15, var16);
        class321.method5511(var17);
        class131.method2744();
        class131.field1745 = true;
        return var18;
    }

    @ObfuscatedName("cz.r(II)Ljava/lang/String;")
    public static final String method2073(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class225.field2791 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class225.field2904 + "</col>";
        }
    }

    @ObfuscatedName("iu.y(ZB)Z")
    public final boolean method4243(boolean arg0) {
        int var2 = this.field3407;
        int var3 = this.field3408;
        int var4 = this.field3413;
        if (arg0) {
            var2 = this.field3409;
            var3 = this.field3411;
            var4 = this.field3414;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1868.method3845(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1868.method3845(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1868.method3845(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("iu.p(ZI)Ldq;")
    public final class122 method4244(boolean arg0) {
        int var2 = this.field3407;
        int var3 = this.field3408;
        int var4 = this.field3413;
        if (arg0) {
            var2 = this.field3409;
            var3 = this.field3411;
            var4 = this.field3414;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var5 = class122.method2521(Statics.field1868, var2, 0);
        if (var3 != -1) {
            class122 var6 = class122.method2521(Statics.field1868, var3, 0);
            if (var4 == -1) {
                class122[] var9 = new class122[] { var5, var6 };
                var5 = new class122(var9, 2);
            } else {
                class122 var7 = class122.method2521(Statics.field1868, var4, 0);
                class122[] var8 = new class122[] { var5, var6, var7 };
                var5 = new class122(var8, 3);
            }
        }
        if (!arg0 && this.field3412 != 0) {
            var5.method2533(0, this.field3412, 0);
        }
        if (arg0 && this.field3422 != 0) {
            var5.method2533(0, this.field3422, 0);
        }
        if (this.field3388 != null) {
            for (int var10 = 0; var10 < this.field3388.length; var10++) {
                var5.method2534(this.field3388[var10], this.field3391[var10]);
            }
        }
        if (this.field3393 != null) {
            for (int var11 = 0; var11 < this.field3393.length; var11++) {
                var5.method2535(this.field3393[var11], this.field3394[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("iu.g(ZI)Z")
    public final boolean method4245(boolean arg0) {
        int var2 = this.field3415;
        int var3 = this.field3416;
        if (arg0) {
            var2 = this.field3417;
            var3 = this.field3418;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1868.method3845(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1868.method3845(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("iu.e(ZI)Ldq;")
    public final class122 method4246(boolean arg0) {
        int var2 = this.field3415;
        int var3 = this.field3416;
        if (arg0) {
            var2 = this.field3417;
            var3 = this.field3418;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var4 = class122.method2521(Statics.field1868, var2, 0);
        if (var3 != -1) {
            class122 var5 = class122.method2521(Statics.field1868, var3, 0);
            class122[] var6 = new class122[] { var4, var5 };
            var4 = new class122(var6, 2);
        }
        if (this.field3388 != null) {
            for (int var7 = 0; var7 < this.field3388.length; var7++) {
                var4.method2534(this.field3388[var7], this.field3391[var7]);
            }
        }
        if (this.field3393 != null) {
            for (int var8 = 0; var8 < this.field3393.length; var8++) {
                var4.method2535(this.field3393[var8], this.field3394[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iu.z(III)I")
    public int method4247(int arg0, int arg1) {
        class316 var3 = this.field3429;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class180 var5 = (class180) var3.method5405((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2094;
            }
        }
        return var4;
    }

    @ObfuscatedName("iu.w(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4248(int arg0, String arg1) {
        return class248.method3751(this.field3429, arg0, arg1);
    }

    @ObfuscatedName("iu.l(B)I")
    public int method4293() {
        if (this.field3387 == -1 || this.field3405 == null) {
            return -1;
        } else if (this.field3387 >= 0) {
            return this.field3405[this.field3387] == null ? -1 : this.field3387;
        } else if (class225.field2740.equalsIgnoreCase(this.field3405[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("du.h(I)V")
    public static void method2518() {
        field3404.method3068();
        field3386.method3068();
        field3406.method3068();
    }

    @ObfuscatedName("aa.v(B)V")
    public static void method630() {
        field3406.method3068();
    }
}
