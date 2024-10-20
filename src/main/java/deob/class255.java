package deob;

@ObfuscatedName("iw")
public class class255 extends class176 {

    @ObfuscatedName("iw.d")
    public static class146 field3423 = new class146(64);

    @ObfuscatedName("iw.m")
    public static class146 field3397 = new class146(50);

    @ObfuscatedName("iw.p")
    public static class146 field3398 = new class146(200);

    @ObfuscatedName("iw.k")
    public int field3420;

    @ObfuscatedName("iw.x")
    public int field3400;

    @ObfuscatedName("iw.j")
    public String field3416 = class225.field2836;

    @ObfuscatedName("iw.r")
    public short[] field3402;

    @ObfuscatedName("iw.e")
    public short[] field3403;

    @ObfuscatedName("iw.s")
    public short[] field3404;

    @ObfuscatedName("iw.b")
    public short[] field3405;

    @ObfuscatedName("iw.z")
    public int field3406 = 2000;

    @ObfuscatedName("iw.f")
    public int field3407 = 0;

    @ObfuscatedName("iw.g")
    public int field3408 = 0;

    @ObfuscatedName("iw.w")
    public int field3409 = 0;

    @ObfuscatedName("iw.u")
    public int field3410 = 0;

    @ObfuscatedName("iw.y")
    public int field3411 = 0;

    @ObfuscatedName("iw.aa")
    public int field3442 = 0;

    @ObfuscatedName("iw.aw")
    public int field3413 = 1;

    @ObfuscatedName("iw.ar")
    public boolean field3431 = false;

    @ObfuscatedName("iw.aq")
    public String[] field3415 = new String[] { null, null, class225.field2959, null, null };

    @ObfuscatedName("iw.ad")
    public String[] field3412 = new String[] { null, null, null, null, class225.field2745 };

    @ObfuscatedName("iw.ak")
    public int field3417 = -2;

    @ObfuscatedName("iw.av")
    public int field3419 = -1;

    @ObfuscatedName("iw.am")
    public int field3418 = -1;

    @ObfuscatedName("iw.ab")
    public int field3414 = 0;

    @ObfuscatedName("iw.ax")
    public int field3430 = -1;

    @ObfuscatedName("iw.al")
    public int field3422 = -1;

    @ObfuscatedName("iw.ap")
    public int field3433 = 0;

    @ObfuscatedName("iw.aj")
    public int field3424 = -1;

    @ObfuscatedName("iw.ae")
    public int field3425 = -1;

    @ObfuscatedName("iw.au")
    public int field3421 = -1;

    @ObfuscatedName("iw.ah")
    public int field3427 = -1;

    @ObfuscatedName("iw.an")
    public int field3428 = -1;

    @ObfuscatedName("iw.af")
    public int field3429 = -1;

    @ObfuscatedName("iw.ay")
    public int[] field3401;

    @ObfuscatedName("iw.az")
    public int[] field3396;

    @ObfuscatedName("iw.ao")
    public int field3432 = -1;

    @ObfuscatedName("iw.ai")
    public int field3392 = -1;

    @ObfuscatedName("iw.ac")
    public int field3434 = 128;

    @ObfuscatedName("iw.at")
    public int field3393 = 128;

    @ObfuscatedName("iw.as")
    public int field3436 = 128;

    @ObfuscatedName("iw.ba")
    public int field3437 = 0;

    @ObfuscatedName("iw.bg")
    public int field3438 = 0;

    @ObfuscatedName("iw.bc")
    public int field3439 = 0;

    @ObfuscatedName("iw.bd")
    public class316 field3440;

    @ObfuscatedName("iw.bx")
    public boolean field3441 = false;

    @ObfuscatedName("iw.bl")
    public int field3426 = -1;

    @ObfuscatedName("iw.bh")
    public int field3443 = -1;

    @ObfuscatedName("iw.bu")
    public int field3444 = -1;

    @ObfuscatedName("iw.br")
    public int field3445 = -1;

    @ObfuscatedName("hz.a(II)Liw;")
    public static class255 method3852(int arg0) {
        class255 var1 = (class255) field3423.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3390.method3873(10, arg0);
        class255 var3 = new class255();
        var3.field3420 = arg0;
        if (var2 != null) {
            var3.method4336(new class300(var2));
        }
        var3.method4335();
        if (var3.field3392 != -1) {
            var3.method4391(method3852(var3.field3392), method3852(var3.field3432));
        }
        if (var3.field3443 != -1) {
            var3.method4339(method3852(var3.field3443), method3852(var3.field3426));
        }
        if (var3.field3445 != -1) {
            var3.method4340(method3852(var3.field3445), method3852(var3.field3444));
        }
        if (!Statics.field3394 && var3.field3431) {
            var3.field3416 = class225.field2771;
            var3.field3441 = false;
            var3.field3415 = null;
            var3.field3412 = null;
            var3.field3417 = -1;
            var3.field3439 = 0;
            if (var3.field3440 != null) {
                boolean var4 = false;
                for (class181 var5 = var3.field3440.method5497(); var5 != null; var5 = var3.field3440.method5498()) {
                    class250 var6 = class250.method3249((int) var5.field2091);
                    if (var6.field3296) {
                        var5.method3386();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3440 = null;
                }
            }
        }
        field3423.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.t(S)V")
    public void method4335() {
    }

    @ObfuscatedName("iw.n(Lkc;I)V")
    public void method4336(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4392(arg0, var2);
        }
    }

    @ObfuscatedName("iw.q(Lkc;II)V")
    public void method4392(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3400 = arg0.method5166();
        } else if (arg1 == 2) {
            this.field3416 = arg0.method5132();
        } else if (arg1 == 4) {
            this.field3406 = arg0.method5166();
        } else if (arg1 == 5) {
            this.field3407 = arg0.method5166();
        } else if (arg1 == 6) {
            this.field3408 = arg0.method5166();
        } else if (arg1 == 7) {
            this.field3410 = arg0.method5166();
            if (this.field3410 > 32767) {
                this.field3410 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3411 = arg0.method5166();
            if (this.field3411 > 32767) {
                this.field3411 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3442 = 1;
        } else if (arg1 == 12) {
            this.field3413 = arg0.method5155();
        } else if (arg1 == 16) {
            this.field3431 = true;
        } else if (arg1 == 23) {
            this.field3419 = arg0.method5166();
            this.field3414 = arg0.method5123();
        } else if (arg1 == 24) {
            this.field3418 = arg0.method5166();
        } else if (arg1 == 25) {
            this.field3430 = arg0.method5166();
            this.field3433 = arg0.method5123();
        } else if (arg1 == 26) {
            this.field3422 = arg0.method5166();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3415[arg1 - 30] = arg0.method5132();
            if (this.field3415[arg1 - 30].equalsIgnoreCase(class225.field2746)) {
                this.field3415[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3412[arg1 - 35] = arg0.method5132();
        } else if (arg1 == 40) {
            int var3 = arg0.method5123();
            this.field3402 = new short[var3];
            this.field3403 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3402[var4] = (short) arg0.method5166();
                this.field3403[var4] = (short) arg0.method5166();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5123();
            this.field3404 = new short[var5];
            this.field3405 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3404[var6] = (short) arg0.method5166();
                this.field3405[var6] = (short) arg0.method5166();
            }
        } else if (arg1 == 42) {
            this.field3417 = arg0.method5268();
        } else if (arg1 == 65) {
            this.field3441 = true;
        } else if (arg1 == 78) {
            this.field3424 = arg0.method5166();
        } else if (arg1 == 79) {
            this.field3425 = arg0.method5166();
        } else if (arg1 == 90) {
            this.field3421 = arg0.method5166();
        } else if (arg1 == 91) {
            this.field3428 = arg0.method5166();
        } else if (arg1 == 92) {
            this.field3427 = arg0.method5166();
        } else if (arg1 == 93) {
            this.field3429 = arg0.method5166();
        } else if (arg1 == 95) {
            this.field3409 = arg0.method5166();
        } else if (arg1 == 97) {
            this.field3432 = arg0.method5166();
        } else if (arg1 == 98) {
            this.field3392 = arg0.method5166();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3401 == null) {
                this.field3401 = new int[10];
                this.field3396 = new int[10];
            }
            this.field3401[arg1 - 100] = arg0.method5166();
            this.field3396[arg1 - 100] = arg0.method5166();
        } else if (arg1 == 110) {
            this.field3434 = arg0.method5166();
        } else if (arg1 == 111) {
            this.field3393 = arg0.method5166();
        } else if (arg1 == 112) {
            this.field3436 = arg0.method5166();
        } else if (arg1 == 113) {
            this.field3437 = arg0.method5268();
        } else if (arg1 == 114) {
            this.field3438 = arg0.method5268();
        } else if (arg1 == 115) {
            this.field3439 = arg0.method5123();
        } else if (arg1 == 139) {
            this.field3426 = arg0.method5166();
        } else if (arg1 == 140) {
            this.field3443 = arg0.method5166();
        } else if (arg1 == 148) {
            this.field3444 = arg0.method5166();
        } else if (arg1 == 149) {
            this.field3445 = arg0.method5166();
        } else if (arg1 == 249) {
            this.field3440 = class248.method3205(arg0, this.field3440);
        }
    }

    @ObfuscatedName("iw.v(Liw;Liw;I)V")
    public void method4391(class255 arg0, class255 arg1) {
        this.field3400 = arg0.field3400;
        this.field3406 = arg0.field3406;
        this.field3407 = arg0.field3407;
        this.field3408 = arg0.field3408;
        this.field3409 = arg0.field3409;
        this.field3410 = arg0.field3410;
        this.field3411 = arg0.field3411;
        this.field3402 = arg0.field3402;
        this.field3403 = arg0.field3403;
        this.field3404 = arg0.field3404;
        this.field3405 = arg0.field3405;
        this.field3416 = arg1.field3416;
        this.field3431 = arg1.field3431;
        this.field3413 = arg1.field3413;
        this.field3442 = 1;
    }

    @ObfuscatedName("iw.l(Liw;Liw;B)V")
    public void method4339(class255 arg0, class255 arg1) {
        this.field3400 = arg0.field3400;
        this.field3406 = arg0.field3406;
        this.field3407 = arg0.field3407;
        this.field3408 = arg0.field3408;
        this.field3409 = arg0.field3409;
        this.field3410 = arg0.field3410;
        this.field3411 = arg0.field3411;
        this.field3402 = arg1.field3402;
        this.field3403 = arg1.field3403;
        this.field3404 = arg1.field3404;
        this.field3405 = arg1.field3405;
        this.field3416 = arg1.field3416;
        this.field3431 = arg1.field3431;
        this.field3442 = arg1.field3442;
        this.field3419 = arg1.field3419;
        this.field3418 = arg1.field3418;
        this.field3424 = arg1.field3424;
        this.field3430 = arg1.field3430;
        this.field3422 = arg1.field3422;
        this.field3425 = arg1.field3425;
        this.field3421 = arg1.field3421;
        this.field3427 = arg1.field3427;
        this.field3428 = arg1.field3428;
        this.field3429 = arg1.field3429;
        this.field3439 = arg1.field3439;
        this.field3415 = arg1.field3415;
        this.field3412 = new String[5];
        if (arg1.field3412 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3412[var3] = arg1.field3412[var3];
            }
        }
        this.field3412[4] = class225.field2750;
        this.field3413 = 0;
    }

    @ObfuscatedName("iw.c(Liw;Liw;B)V")
    public void method4340(class255 arg0, class255 arg1) {
        this.field3400 = arg0.field3400;
        this.field3406 = arg0.field3406;
        this.field3407 = arg0.field3407;
        this.field3408 = arg0.field3408;
        this.field3409 = arg0.field3409;
        this.field3410 = arg0.field3410;
        this.field3411 = arg0.field3411;
        this.field3402 = arg0.field3402;
        this.field3403 = arg0.field3403;
        this.field3404 = arg0.field3404;
        this.field3405 = arg0.field3405;
        this.field3442 = arg0.field3442;
        this.field3416 = arg1.field3416;
        this.field3413 = 0;
        this.field3431 = false;
        this.field3441 = false;
    }

    @ObfuscatedName("iw.o(II)Ldu;")
    public final class122 method4341(int arg0) {
        if (this.field3401 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3396[var3] && this.field3396[var3] != 0) {
                    var2 = this.field3401[var3];
                }
            }
            if (var2 != -1) {
                return method3852(var2).method4341(1);
            }
        }
        class122 var4 = class122.method2685(Statics.field3399, this.field3400, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3434 != 128 || this.field3393 != 128 || this.field3436 != 128) {
            var4.method2655(this.field3434, this.field3393, this.field3436);
        }
        if (this.field3402 != null) {
            for (int var5 = 0; var5 < this.field3402.length; var5++) {
                var4.method2640(this.field3402[var5], this.field3403[var5]);
            }
        }
        if (this.field3404 != null) {
            for (int var6 = 0; var6 < this.field3404.length; var6++) {
                var4.method2653(this.field3404[var6], this.field3405[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iw.i(IB)Ldv;")
    public final class128 method4348(int arg0) {
        if (this.field3401 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3396[var3] && this.field3396[var3] != 0) {
                    var2 = this.field3401[var3];
                }
            }
            if (var2 != -1) {
                return method3852(var2).method4348(1);
            }
        }
        class128 var4 = (class128) field3397.method3120((long) this.field3420);
        if (var4 != null) {
            return var4;
        }
        class122 var5 = class122.method2685(Statics.field3399, this.field3400, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3434 != 128 || this.field3393 != 128 || this.field3436 != 128) {
            var5.method2655(this.field3434, this.field3393, this.field3436);
        }
        if (this.field3402 != null) {
            for (int var6 = 0; var6 < this.field3402.length; var6++) {
                var5.method2640(this.field3402[var6], this.field3403[var6]);
            }
        }
        if (this.field3404 != null) {
            for (int var7 = 0; var7 < this.field3404.length; var7++) {
                var5.method2653(this.field3404[var7], this.field3405[var7]);
            }
        }
        class128 var8 = var5.method2660(this.field3437 + 64, this.field3438 * 5 + 768, -50, -10, -50);
        var8.field1670 = true;
        field3397.method3122(var8, (long) this.field3420);
        return var8;
    }

    @ObfuscatedName("iw.d(II)Liw;")
    public class255 method4399(int arg0) {
        if (this.field3401 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3396[var3] && this.field3396[var3] != 0) {
                    var2 = this.field3401[var3];
                }
            }
            if (var2 != -1) {
                return method3852(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("bi.m(IIIIIZB)Llx;")
    public static final class325 method1101(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class325 var8 = (class325) field3398.method3120(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class255 var9 = method3852(arg0);
        if (arg1 > 1 && var9.field3401 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3396[var11] && var9.field3396[var11] != 0) {
                    var10 = var9.field3401[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3852(var10);
            }
        }
        class128 var12 = var9.method4348(1);
        if (var12 == null) {
            return null;
        }
        class325 var13 = null;
        if (var9.field3392 != -1) {
            var13 = method1101(var9.field3432, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3443 != -1) {
            var13 = method1101(var9.field3426, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3445 != -1) {
            var13 = method1101(var9.field3444, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3834;
        int var15 = Statics.field3835;
        int var16 = Statics.field3837;
        int[] var17 = new int[4];
        class321.method5618(var17);
        class325 var18 = new class325(36, 32);
        class321.method5576(var18.field3866, 36, 32);
        class321.method5582();
        class131.method2829();
        class131.method2834(16, 16);
        class131.field1740 = false;
        if (var9.field3445 != -1) {
            var13.method5686(0, 0);
        }
        int var19 = var9.field3406;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class131.field1762[var9.field3407] * var19 >> 16;
        int var21 = class131.field1752[var9.field3407] * var19 >> 16;
        var12.method2734();
        var12.method2747(0, var9.field3408, var9.field3409, var9.field3407, var9.field3410, var9.field3411 + var12.field1849 / 2 + var20, var9.field3411 + var21);
        if (var9.field3443 != -1) {
            var13.method5686(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5691(1);
        }
        if (arg2 >= 2) {
            var18.method5691(16777215);
        }
        if (arg3 != 0) {
            var18.method5747(arg3);
        }
        class321.method5576(var18.field3866, 36, 32);
        if (var9.field3392 != -1) {
            var13.method5686(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3442 == 1) {
            class295 var22 = Statics.field255;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class225.field2911 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class225.field2909 + "</col>";
            }
            var22.method4987(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3398.method3122(var18, var6);
        }
        class321.method5576(var14, var15, var16);
        class321.method5594(var17);
        class131.method2829();
        class131.field1740 = true;
        return var18;
    }

    @ObfuscatedName("iw.p(ZI)Z")
    public final boolean method4344(boolean arg0) {
        int var2 = this.field3419;
        int var3 = this.field3418;
        int var4 = this.field3424;
        if (arg0) {
            var2 = this.field3430;
            var3 = this.field3422;
            var4 = this.field3425;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3399.method3875(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3399.method3875(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3399.method3875(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("iw.h(ZI)Ldu;")
    public final class122 method4345(boolean arg0) {
        int var2 = this.field3419;
        int var3 = this.field3418;
        int var4 = this.field3424;
        if (arg0) {
            var2 = this.field3430;
            var3 = this.field3422;
            var4 = this.field3425;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var5 = class122.method2685(Statics.field3399, var2, 0);
        if (var3 != -1) {
            class122 var6 = class122.method2685(Statics.field3399, var3, 0);
            if (var4 == -1) {
                class122[] var9 = new class122[] { var5, var6 };
                var5 = new class122(var9, 2);
            } else {
                class122 var7 = class122.method2685(Statics.field3399, var4, 0);
                class122[] var8 = new class122[] { var5, var6, var7 };
                var5 = new class122(var8, 3);
            }
        }
        if (!arg0 && this.field3414 != 0) {
            var5.method2644(0, this.field3414, 0);
        }
        if (arg0 && this.field3433 != 0) {
            var5.method2644(0, this.field3433, 0);
        }
        if (this.field3402 != null) {
            for (int var10 = 0; var10 < this.field3402.length; var10++) {
                var5.method2640(this.field3402[var10], this.field3403[var10]);
            }
        }
        if (this.field3404 != null) {
            for (int var11 = 0; var11 < this.field3404.length; var11++) {
                var5.method2653(this.field3404[var11], this.field3405[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("iw.k(ZI)Z")
    public final boolean method4346(boolean arg0) {
        int var2 = this.field3421;
        int var3 = this.field3427;
        if (arg0) {
            var2 = this.field3428;
            var3 = this.field3429;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3399.method3875(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3399.method3875(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("iw.x(ZI)Ldu;")
    public final class122 method4347(boolean arg0) {
        int var2 = this.field3421;
        int var3 = this.field3427;
        if (arg0) {
            var2 = this.field3428;
            var3 = this.field3429;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var4 = class122.method2685(Statics.field3399, var2, 0);
        if (var3 != -1) {
            class122 var5 = class122.method2685(Statics.field3399, var3, 0);
            class122[] var6 = new class122[] { var4, var5 };
            var4 = new class122(var6, 2);
        }
        if (this.field3402 != null) {
            for (int var7 = 0; var7 < this.field3402.length; var7++) {
                var4.method2640(this.field3402[var7], this.field3403[var7]);
            }
        }
        if (this.field3404 != null) {
            for (int var8 = 0; var8 < this.field3404.length; var8++) {
                var4.method2653(this.field3404[var8], this.field3405[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iw.j(IIB)I")
    public int method4386(int arg0, int arg1) {
        return class248.method4841(this.field3440, arg0, arg1);
    }

    @ObfuscatedName("iw.r(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4349(int arg0, String arg1) {
        class316 var3 = this.field3440;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class177 var5 = (class177) var3.method5494((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2084;
            }
        }
        return var4;
    }

    @ObfuscatedName("iw.e(I)I")
    public int method4379() {
        if (this.field3417 == -1 || this.field3412 == null) {
            return -1;
        } else if (this.field3417 >= 0) {
            return this.field3412[this.field3417] == null ? -1 : this.field3417;
        } else if (class225.field2745.equalsIgnoreCase(this.field3412[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bb.s(I)V")
    public static void method1830() {
        field3423.method3123();
        field3397.method3123();
        field3398.method3123();
    }
}
