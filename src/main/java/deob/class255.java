package deob;

@ObfuscatedName("ii")
public class class255 extends class183 {

    @ObfuscatedName("ii.d")
    public static class155 field3373 = new class155(64);

    @ObfuscatedName("ii.c")
    public static class155 field3374 = new class155(50);

    @ObfuscatedName("ii.o")
    public static class155 field3375 = new class155(200);

    @ObfuscatedName("ii.k")
    public int field3407;

    @ObfuscatedName("ii.s")
    public int field3377;

    @ObfuscatedName("ii.l")
    public String field3378 = class225.field2800;

    @ObfuscatedName("ii.t")
    public short[] field3379;

    @ObfuscatedName("ii.j")
    public short[] field3416;

    @ObfuscatedName("ii.n")
    public short[] field3381;

    @ObfuscatedName("ii.u")
    public short[] field3376;

    @ObfuscatedName("ii.z")
    public int field3383 = 2000;

    @ObfuscatedName("ii.h")
    public int field3384 = 0;

    @ObfuscatedName("ii.m")
    public int field3385 = 0;

    @ObfuscatedName("ii.g")
    public int field3386 = 0;

    @ObfuscatedName("ii.r")
    public int field3387 = 0;

    @ObfuscatedName("ii.q")
    public int field3369 = 0;

    @ObfuscatedName("ii.aa")
    public int field3411 = 0;

    @ObfuscatedName("ii.av")
    public int field3390 = 1;

    @ObfuscatedName("ii.aw")
    public boolean field3391 = false;

    @ObfuscatedName("ii.as")
    public String[] field3388 = new String[] { null, null, class225.field2826, null, null };

    @ObfuscatedName("ii.ak")
    public String[] field3393 = new String[] { null, null, null, null, class225.field2819 };

    @ObfuscatedName("ii.ah")
    public int field3420 = -2;

    @ObfuscatedName("ii.aq")
    public int field3421 = -1;

    @ObfuscatedName("ii.ao")
    public int field3413 = -1;

    @ObfuscatedName("ii.an")
    public int field3397 = 0;

    @ObfuscatedName("ii.ar")
    public int field3398 = -1;

    @ObfuscatedName("ii.az")
    public int field3396 = -1;

    @ObfuscatedName("ii.ay")
    public int field3400 = 0;

    @ObfuscatedName("ii.ag")
    public int field3389 = -1;

    @ObfuscatedName("ii.ac")
    public int field3402 = -1;

    @ObfuscatedName("ii.al")
    public int field3409 = -1;

    @ObfuscatedName("ii.ae")
    public int field3404 = -1;

    @ObfuscatedName("ii.ad")
    public int field3366 = -1;

    @ObfuscatedName("ii.aj")
    public int field3417 = -1;

    @ObfuscatedName("ii.ax")
    public int[] field3399;

    @ObfuscatedName("ii.at")
    public int[] field3408;

    @ObfuscatedName("ii.af")
    public int field3414 = -1;

    @ObfuscatedName("ii.ap")
    public int field3410 = -1;

    @ObfuscatedName("ii.ai")
    public int field3367 = 128;

    @ObfuscatedName("ii.am")
    public int field3412 = 128;

    @ObfuscatedName("ii.ab")
    public int field3392 = 128;

    @ObfuscatedName("ii.bj")
    public int field3382 = 0;

    @ObfuscatedName("ii.bg")
    public int field3415 = 0;

    @ObfuscatedName("ii.bw")
    public int field3405 = 0;

    @ObfuscatedName("ii.bk")
    public class316 field3401;

    @ObfuscatedName("ii.bl")
    public boolean field3418 = false;

    @ObfuscatedName("ii.bq")
    public int field3419 = -1;

    @ObfuscatedName("ii.bx")
    public int field3406 = -1;

    @ObfuscatedName("ii.bc")
    public int field3394 = -1;

    @ObfuscatedName("ii.by")
    public int field3422 = -1;

    @ObfuscatedName("ii.y(B)V")
    public void method4267() {
    }

    @ObfuscatedName("ii.w(Lkq;I)V")
    public void method4290(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method4269(arg0, var2);
        }
    }

    @ObfuscatedName("ii.p(Lkq;II)V")
    public void method4269(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3377 = arg0.method5112();
        } else if (arg1 == 2) {
            this.field3378 = arg0.method5119();
        } else if (arg1 == 4) {
            this.field3383 = arg0.method5112();
        } else if (arg1 == 5) {
            this.field3384 = arg0.method5112();
        } else if (arg1 == 6) {
            this.field3385 = arg0.method5112();
        } else if (arg1 == 7) {
            this.field3387 = arg0.method5112();
            if (this.field3387 > 32767) {
                this.field3387 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3369 = arg0.method5112();
            if (this.field3369 > 32767) {
                this.field3369 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3411 = 1;
        } else if (arg1 == 12) {
            this.field3390 = arg0.method5192();
        } else if (arg1 == 16) {
            this.field3391 = true;
        } else if (arg1 == 23) {
            this.field3421 = arg0.method5112();
            this.field3397 = arg0.method5110();
        } else if (arg1 == 24) {
            this.field3413 = arg0.method5112();
        } else if (arg1 == 25) {
            this.field3398 = arg0.method5112();
            this.field3400 = arg0.method5110();
        } else if (arg1 == 26) {
            this.field3396 = arg0.method5112();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3388[arg1 - 30] = arg0.method5119();
            if (this.field3388[arg1 - 30].equalsIgnoreCase(class225.field2747)) {
                this.field3388[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3393[arg1 - 35] = arg0.method5119();
        } else if (arg1 == 40) {
            int var3 = arg0.method5110();
            this.field3379 = new short[var3];
            this.field3416 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3379[var4] = (short) arg0.method5112();
                this.field3416[var4] = (short) arg0.method5112();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5110();
            this.field3381 = new short[var5];
            this.field3376 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3381[var6] = (short) arg0.method5112();
                this.field3376[var6] = (short) arg0.method5112();
            }
        } else if (arg1 == 42) {
            this.field3420 = arg0.method5297();
        } else if (arg1 == 65) {
            this.field3418 = true;
        } else if (arg1 == 78) {
            this.field3389 = arg0.method5112();
        } else if (arg1 == 79) {
            this.field3402 = arg0.method5112();
        } else if (arg1 == 90) {
            this.field3409 = arg0.method5112();
        } else if (arg1 == 91) {
            this.field3366 = arg0.method5112();
        } else if (arg1 == 92) {
            this.field3404 = arg0.method5112();
        } else if (arg1 == 93) {
            this.field3417 = arg0.method5112();
        } else if (arg1 == 95) {
            this.field3386 = arg0.method5112();
        } else if (arg1 == 97) {
            this.field3414 = arg0.method5112();
        } else if (arg1 == 98) {
            this.field3410 = arg0.method5112();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3399 == null) {
                this.field3399 = new int[10];
                this.field3408 = new int[10];
            }
            this.field3399[arg1 - 100] = arg0.method5112();
            this.field3408[arg1 - 100] = arg0.method5112();
        } else if (arg1 == 110) {
            this.field3367 = arg0.method5112();
        } else if (arg1 == 111) {
            this.field3412 = arg0.method5112();
        } else if (arg1 == 112) {
            this.field3392 = arg0.method5112();
        } else if (arg1 == 113) {
            this.field3382 = arg0.method5297();
        } else if (arg1 == 114) {
            this.field3415 = arg0.method5297() * 5;
        } else if (arg1 == 115) {
            this.field3405 = arg0.method5110();
        } else if (arg1 == 139) {
            this.field3419 = arg0.method5112();
        } else if (arg1 == 140) {
            this.field3406 = arg0.method5112();
        } else if (arg1 == 148) {
            this.field3394 = arg0.method5112();
        } else if (arg1 == 149) {
            this.field3422 = arg0.method5112();
        } else if (arg1 == 249) {
            this.field3401 = class248.method3588(arg0, this.field3401);
        }
    }

    @ObfuscatedName("ii.b(Lii;Lii;I)V")
    public void method4270(class255 arg0, class255 arg1) {
        this.field3377 = arg0.field3377;
        this.field3383 = arg0.field3383;
        this.field3384 = arg0.field3384;
        this.field3385 = arg0.field3385;
        this.field3386 = arg0.field3386;
        this.field3387 = arg0.field3387;
        this.field3369 = arg0.field3369;
        this.field3379 = arg0.field3379;
        this.field3416 = arg0.field3416;
        this.field3381 = arg0.field3381;
        this.field3376 = arg0.field3376;
        this.field3378 = arg1.field3378;
        this.field3391 = arg1.field3391;
        this.field3390 = arg1.field3390;
        this.field3411 = 1;
    }

    @ObfuscatedName("ii.e(Lii;Lii;B)V")
    public void method4283(class255 arg0, class255 arg1) {
        this.field3377 = arg0.field3377;
        this.field3383 = arg0.field3383;
        this.field3384 = arg0.field3384;
        this.field3385 = arg0.field3385;
        this.field3386 = arg0.field3386;
        this.field3387 = arg0.field3387;
        this.field3369 = arg0.field3369;
        this.field3379 = arg1.field3379;
        this.field3416 = arg1.field3416;
        this.field3381 = arg1.field3381;
        this.field3376 = arg1.field3376;
        this.field3378 = arg1.field3378;
        this.field3391 = arg1.field3391;
        this.field3411 = arg1.field3411;
        this.field3421 = arg1.field3421;
        this.field3413 = arg1.field3413;
        this.field3389 = arg1.field3389;
        this.field3398 = arg1.field3398;
        this.field3396 = arg1.field3396;
        this.field3402 = arg1.field3402;
        this.field3409 = arg1.field3409;
        this.field3404 = arg1.field3404;
        this.field3366 = arg1.field3366;
        this.field3417 = arg1.field3417;
        this.field3405 = arg1.field3405;
        this.field3388 = arg1.field3388;
        this.field3393 = new String[5];
        if (arg1.field3393 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3393[var3] = arg1.field3393[var3];
            }
        }
        this.field3393[4] = class225.field2751;
        this.field3390 = 0;
    }

    @ObfuscatedName("ii.x(Lii;Lii;B)V")
    public void method4272(class255 arg0, class255 arg1) {
        this.field3377 = arg0.field3377;
        this.field3383 = arg0.field3383;
        this.field3384 = arg0.field3384;
        this.field3385 = arg0.field3385;
        this.field3386 = arg0.field3386;
        this.field3387 = arg0.field3387;
        this.field3369 = arg0.field3369;
        this.field3379 = arg0.field3379;
        this.field3416 = arg0.field3416;
        this.field3381 = arg0.field3381;
        this.field3376 = arg0.field3376;
        this.field3411 = arg0.field3411;
        this.field3378 = arg1.field3378;
        this.field3390 = 0;
        this.field3391 = false;
        this.field3418 = false;
    }

    @ObfuscatedName("ii.a(II)Ldd;")
    public final class122 method4273(int arg0) {
        if (this.field3399 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3408[var3] && this.field3408[var3] != 0) {
                    var2 = this.field3399[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method3278(var2).method4273(1);
            }
        }
        class122 var4 = class122.method2543(Statics.field3370, this.field3377, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3367 != 128 || this.field3412 != 128 || this.field3392 != 128) {
            var4.method2554(this.field3367, this.field3412, this.field3392);
        }
        if (this.field3379 != null) {
            for (int var5 = 0; var5 < this.field3379.length; var5++) {
                var4.method2602(this.field3379[var5], this.field3416[var5]);
            }
        }
        if (this.field3381 != null) {
            for (int var6 = 0; var6 < this.field3381.length; var6++) {
                var4.method2556(this.field3381[var6], this.field3376[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ii.d(II)Ldw;")
    public final class128 method4325(int arg0) {
        if (this.field3399 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3408[var3] && this.field3408[var3] != 0) {
                    var2 = this.field3399[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method3278(var2).method4325(1);
            }
        }
        class128 var4 = (class128) field3374.method3099((long) this.field3407);
        if (var4 != null) {
            return var4;
        }
        class122 var5 = class122.method2543(Statics.field3370, this.field3377, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3367 != 128 || this.field3412 != 128 || this.field3392 != 128) {
            var5.method2554(this.field3367, this.field3412, this.field3392);
        }
        if (this.field3379 != null) {
            for (int var6 = 0; var6 < this.field3379.length; var6++) {
                var5.method2602(this.field3379[var6], this.field3416[var6]);
            }
        }
        if (this.field3381 != null) {
            for (int var7 = 0; var7 < this.field3381.length; var7++) {
                var5.method2556(this.field3381[var7], this.field3376[var7]);
            }
        }
        class128 var8 = var5.method2603(this.field3382 + 64, this.field3415 + 768, -50, -10, -50);
        var8.field1670 = true;
        field3374.method3101(var8, (long) this.field3407);
        return var8;
    }

    @ObfuscatedName("ii.c(II)Lii;")
    public class255 method4275(int arg0) {
        if (this.field3399 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3408[var3] && this.field3408[var3] != 0) {
                    var2 = this.field3399[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method3278(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("hq.o(IIIIIZB)Lls;")
    public static final class325 method3745(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class325 var8 = (class325) field3375.method3099(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class255 var9 = Statics.method3278(arg0);
        if (arg1 > 1 && var9.field3399 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3408[var11] && var9.field3408[var11] != 0) {
                    var10 = var9.field3399[var11];
                }
            }
            if (var10 != -1) {
                var9 = Statics.method3278(var10);
            }
        }
        class128 var12 = var9.method4325(1);
        if (var12 == null) {
            return null;
        }
        class325 var13 = null;
        if (var9.field3410 != -1) {
            var13 = method3745(var9.field3414, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3406 != -1) {
            var13 = method3745(var9.field3419, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3422 != -1) {
            var13 = method3745(var9.field3394, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3843;
        int var15 = Statics.field3841;
        int var16 = Statics.field3842;
        int[] var17 = new int[4];
        class321.method5593(var17);
        class325 var18 = new class325(36, 32);
        class321.method5539(var18.field3873, 36, 32);
        class321.method5545();
        class131.method2820();
        class131.method2830(16, 16);
        class131.field1740 = false;
        if (var9.field3422 != -1) {
            var13.method5712(0, 0);
        }
        int var19 = var9.field3383;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class131.field1762[var9.field3384] * var19 >> 16;
        int var21 = class131.field1737[var9.field3384] * var19 >> 16;
        var12.method2691();
        var12.method2651(0, var9.field3385, var9.field3386, var9.field3384, var9.field3387, var9.field3369 + var12.field1850 / 2 + var20, var9.field3369 + var21);
        if (var9.field3406 != -1) {
            var13.method5712(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5647(1);
        }
        if (arg2 >= 2) {
            var18.method5647(16777215);
        }
        if (arg3 != 0) {
            var18.method5639(arg3);
        }
        class321.method5539(var18.field3873, 36, 32);
        if (var9.field3410 != -1) {
            var13.method5712(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3411 == 1) {
            Statics.field1500.method4966(method1945(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3375.method3101(var18, var6);
        }
        class321.method5539(var14, var15, var16);
        class321.method5544(var17);
        class131.method2820();
        class131.field1740 = true;
        return var18;
    }

    @ObfuscatedName("ch.l(II)Ljava/lang/String;")
    public static final String method1945(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class225.field2912 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class225.field2860 + "</col>";
        }
    }

    @ObfuscatedName("ii.t(ZI)Z")
    public final boolean method4302(boolean arg0) {
        int var2 = this.field3421;
        int var3 = this.field3413;
        int var4 = this.field3389;
        if (arg0) {
            var2 = this.field3398;
            var3 = this.field3396;
            var4 = this.field3402;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3370.method3754(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3370.method3754(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3370.method3754(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ii.j(ZB)Ldd;")
    public final class122 method4316(boolean arg0) {
        int var2 = this.field3421;
        int var3 = this.field3413;
        int var4 = this.field3389;
        if (arg0) {
            var2 = this.field3398;
            var3 = this.field3396;
            var4 = this.field3402;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var5 = class122.method2543(Statics.field3370, var2, 0);
        if (var3 != -1) {
            class122 var6 = class122.method2543(Statics.field3370, var3, 0);
            if (var4 == -1) {
                class122[] var9 = new class122[] { var5, var6 };
                var5 = new class122(var9, 2);
            } else {
                class122 var7 = class122.method2543(Statics.field3370, var4, 0);
                class122[] var8 = new class122[] { var5, var6, var7 };
                var5 = new class122(var8, 3);
            }
        }
        if (!arg0 && this.field3397 != 0) {
            var5.method2550(0, this.field3397, 0);
        }
        if (arg0 && this.field3400 != 0) {
            var5.method2550(0, this.field3400, 0);
        }
        if (this.field3379 != null) {
            for (int var10 = 0; var10 < this.field3379.length; var10++) {
                var5.method2602(this.field3379[var10], this.field3416[var10]);
            }
        }
        if (this.field3381 != null) {
            for (int var11 = 0; var11 < this.field3381.length; var11++) {
                var5.method2556(this.field3381[var11], this.field3376[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ii.n(ZI)Z")
    public final boolean method4305(boolean arg0) {
        int var2 = this.field3409;
        int var3 = this.field3404;
        if (arg0) {
            var2 = this.field3366;
            var3 = this.field3417;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3370.method3754(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3370.method3754(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ii.u(ZI)Ldd;")
    public final class122 method4274(boolean arg0) {
        int var2 = this.field3409;
        int var3 = this.field3404;
        if (arg0) {
            var2 = this.field3366;
            var3 = this.field3417;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var4 = class122.method2543(Statics.field3370, var2, 0);
        if (var3 != -1) {
            class122 var5 = class122.method2543(Statics.field3370, var3, 0);
            class122[] var6 = new class122[] { var4, var5 };
            var4 = new class122(var6, 2);
        }
        if (this.field3379 != null) {
            for (int var7 = 0; var7 < this.field3379.length; var7++) {
                var4.method2602(this.field3379[var7], this.field3416[var7]);
            }
        }
        if (this.field3381 != null) {
            for (int var8 = 0; var8 < this.field3381.length; var8++) {
                var4.method2556(this.field3381[var8], this.field3376[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ii.z(IIB)I")
    public int method4279(int arg0, int arg1) {
        return class248.method1895(this.field3401, arg0, arg1);
    }

    @ObfuscatedName("ii.h(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4281(int arg0, String arg1) {
        return class248.method131(this.field3401, arg0, arg1);
    }

    @ObfuscatedName("ii.m(I)I")
    public int method4282() {
        if (this.field3420 == -1 || this.field3393 == null) {
            return -1;
        } else if (this.field3420 >= 0) {
            return this.field3393[this.field3420] == null ? -1 : this.field3420;
        } else if (class225.field2819.equalsIgnoreCase(this.field3393[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bw.aa(I)V")
    public static void method963() {
        field3373.method3102();
        field3374.method3102();
        field3375.method3102();
    }

    @ObfuscatedName("fa.av(I)V")
    public static void method3225() {
        field3375.method3102();
    }

    @ObfuscatedName("ah.aw(ZI)V")
    public static void method494(boolean arg0) {
        if (Statics.field3371 != arg0) {
            method963();
            Statics.field3371 = arg0;
        }
    }
}
