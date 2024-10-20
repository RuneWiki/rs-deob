package deob;

@ObfuscatedName("id")
public class class255 extends class176 {

    @ObfuscatedName("id.z")
    public static class146 field3379 = new class146(64);

    @ObfuscatedName("id.n")
    public static class146 field3380 = new class146(50);

    @ObfuscatedName("id.h")
    public static class146 field3409 = new class146(200);

    @ObfuscatedName("id.s")
    public int field3382;

    @ObfuscatedName("id.p")
    public int field3383;

    @ObfuscatedName("id.e")
    public String field3384 = class225.field2900;

    @ObfuscatedName("id.i")
    public short[] field3402;

    @ObfuscatedName("id.q")
    public short[] field3386;

    @ObfuscatedName("id.y")
    public short[] field3387;

    @ObfuscatedName("id.r")
    public short[] field3388;

    @ObfuscatedName("id.k")
    public int field3389 = 2000;

    @ObfuscatedName("id.w")
    public int field3414 = 0;

    @ObfuscatedName("id.m")
    public int field3391 = 0;

    @ObfuscatedName("id.o")
    public int field3392 = 0;

    @ObfuscatedName("id.a")
    public int field3373 = 0;

    @ObfuscatedName("id.b")
    public int field3422 = 0;

    @ObfuscatedName("id.ag")
    public int field3395 = 0;

    @ObfuscatedName("id.at")
    public int field3396 = 1;

    @ObfuscatedName("id.ao")
    public boolean field3420 = false;

    @ObfuscatedName("id.av")
    public String[] field3417 = new String[] { null, null, class225.field2740, null, null };

    @ObfuscatedName("id.an")
    public String[] field3399 = new String[] { null, null, null, null, class225.field2741 };

    @ObfuscatedName("id.as")
    public int field3400 = -2;

    @ObfuscatedName("id.ad")
    public int field3401 = -1;

    @ObfuscatedName("id.ap")
    public int field3416 = -1;

    @ObfuscatedName("id.ax")
    public int field3393 = 0;

    @ObfuscatedName("id.aj")
    public int field3404 = -1;

    @ObfuscatedName("id.ab")
    public int field3405 = -1;

    @ObfuscatedName("id.af")
    public int field3406 = 0;

    @ObfuscatedName("id.ak")
    public int field3407 = -1;

    @ObfuscatedName("id.ay")
    public int field3408 = -1;

    @ObfuscatedName("id.ae")
    public int field3426 = -1;

    @ObfuscatedName("id.ah")
    public int field3410 = -1;

    @ObfuscatedName("id.aa")
    public int field3411 = -1;

    @ObfuscatedName("id.aq")
    public int field3424 = -1;

    @ObfuscatedName("id.ar")
    public int[] field3418;

    @ObfuscatedName("id.ac")
    public int[] field3397;

    @ObfuscatedName("id.az")
    public int field3378 = -1;

    @ObfuscatedName("id.ai")
    public int field3390 = -1;

    @ObfuscatedName("id.am")
    public int field3381 = 128;

    @ObfuscatedName("id.aw")
    public int field3403 = 128;

    @ObfuscatedName("id.au")
    public int field3419 = 128;

    @ObfuscatedName("id.bg")
    public int field3413 = 0;

    @ObfuscatedName("id.bn")
    public int field3421 = 0;

    @ObfuscatedName("id.bk")
    public int field3385 = 0;

    @ObfuscatedName("id.bp")
    public class316 field3423;

    @ObfuscatedName("id.bu")
    public boolean field3415 = false;

    @ObfuscatedName("id.bi")
    public int field3425 = -1;

    @ObfuscatedName("id.bv")
    public int field3394 = -1;

    @ObfuscatedName("id.bf")
    public int field3427 = -1;

    @ObfuscatedName("id.bm")
    public int field3428 = -1;

    @ObfuscatedName("j.c(Lhz;Lhz;ZLkf;B)V")
    public static void method55(class234 arg0, class234 arg1, boolean arg2, class295 arg3) {
        Statics.field583 = arg0;
        Statics.field3376 = arg1;
        Statics.field3377 = arg2;
        Statics.field3374 = Statics.field583.method3837(10);
        Statics.field2524 = arg3;
    }

    @ObfuscatedName("by.x(IB)Lid;")
    public static class255 method1055(int arg0) {
        class255 var1 = (class255) field3379.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field583.method3825(10, arg0);
        class255 var3 = new class255();
        var3.field3382 = arg0;
        if (var2 != null) {
            var3.method4317(new class300(var2));
        }
        var3.method4341();
        if (var3.field3390 != -1) {
            var3.method4321(method1055(var3.field3390), method1055(var3.field3378));
        }
        if (var3.field3394 != -1) {
            var3.method4322(method1055(var3.field3394), method1055(var3.field3425));
        }
        if (var3.field3428 != -1) {
            var3.method4372(method1055(var3.field3428), method1055(var3.field3427));
        }
        if (!Statics.field3377 && var3.field3420) {
            var3.field3384 = class225.field2907;
            var3.field3415 = false;
            var3.field3417 = null;
            var3.field3399 = null;
            var3.field3400 = -1;
            var3.field3385 = 0;
            if (var3.field3423 != null) {
                boolean var4 = false;
                for (class181 var5 = var3.field3423.method5495(); var5 != null; var5 = var3.field3423.method5496()) {
                    class250 var6 = class250.method69((int) var5.field2096);
                    if (var6.field3282) {
                        var5.method3326();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3423 = null;
                }
            }
        }
        field3379.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.t(I)V")
    public void method4341() {
    }

    @ObfuscatedName("id.g(Lkz;S)V")
    public void method4317(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4319(arg0, var2);
        }
    }

    @ObfuscatedName("id.l(Lkz;II)V")
    public void method4319(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3383 = arg0.method5304();
        } else if (arg1 == 2) {
            this.field3384 = arg0.method5112();
        } else if (arg1 == 4) {
            this.field3389 = arg0.method5304();
        } else if (arg1 == 5) {
            this.field3414 = arg0.method5304();
        } else if (arg1 == 6) {
            this.field3391 = arg0.method5304();
        } else if (arg1 == 7) {
            this.field3373 = arg0.method5304();
            if (this.field3373 > 32767) {
                this.field3373 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3422 = arg0.method5304();
            if (this.field3422 > 32767) {
                this.field3422 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3395 = 1;
        } else if (arg1 == 12) {
            this.field3396 = arg0.method5208();
        } else if (arg1 == 16) {
            this.field3420 = true;
        } else if (arg1 == 23) {
            this.field3401 = arg0.method5304();
            this.field3393 = arg0.method5103();
        } else if (arg1 == 24) {
            this.field3416 = arg0.method5304();
        } else if (arg1 == 25) {
            this.field3404 = arg0.method5304();
            this.field3406 = arg0.method5103();
        } else if (arg1 == 26) {
            this.field3405 = arg0.method5304();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3417[arg1 - 30] = arg0.method5112();
            if (this.field3417[arg1 - 30].equalsIgnoreCase(class225.field3033)) {
                this.field3417[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3399[arg1 - 35] = arg0.method5112();
        } else if (arg1 == 40) {
            int var3 = arg0.method5103();
            this.field3402 = new short[var3];
            this.field3386 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3402[var4] = (short) arg0.method5304();
                this.field3386[var4] = (short) arg0.method5304();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5103();
            this.field3387 = new short[var5];
            this.field3388 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3387[var6] = (short) arg0.method5304();
                this.field3388[var6] = (short) arg0.method5304();
            }
        } else if (arg1 == 42) {
            this.field3400 = arg0.method5168();
        } else if (arg1 == 65) {
            this.field3415 = true;
        } else if (arg1 == 78) {
            this.field3407 = arg0.method5304();
        } else if (arg1 == 79) {
            this.field3408 = arg0.method5304();
        } else if (arg1 == 90) {
            this.field3426 = arg0.method5304();
        } else if (arg1 == 91) {
            this.field3411 = arg0.method5304();
        } else if (arg1 == 92) {
            this.field3410 = arg0.method5304();
        } else if (arg1 == 93) {
            this.field3424 = arg0.method5304();
        } else if (arg1 == 95) {
            this.field3392 = arg0.method5304();
        } else if (arg1 == 97) {
            this.field3378 = arg0.method5304();
        } else if (arg1 == 98) {
            this.field3390 = arg0.method5304();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3418 == null) {
                this.field3418 = new int[10];
                this.field3397 = new int[10];
            }
            this.field3418[arg1 - 100] = arg0.method5304();
            this.field3397[arg1 - 100] = arg0.method5304();
        } else if (arg1 == 110) {
            this.field3381 = arg0.method5304();
        } else if (arg1 == 111) {
            this.field3403 = arg0.method5304();
        } else if (arg1 == 112) {
            this.field3419 = arg0.method5304();
        } else if (arg1 == 113) {
            this.field3413 = arg0.method5168();
        } else if (arg1 == 114) {
            this.field3421 = arg0.method5168();
        } else if (arg1 == 115) {
            this.field3385 = arg0.method5103();
        } else if (arg1 == 139) {
            this.field3425 = arg0.method5304();
        } else if (arg1 == 140) {
            this.field3394 = arg0.method5304();
        } else if (arg1 == 148) {
            this.field3427 = arg0.method5304();
        } else if (arg1 == 149) {
            this.field3428 = arg0.method5304();
        } else if (arg1 == 249) {
            this.field3423 = class248.method4436(arg0, this.field3423);
        }
    }

    @ObfuscatedName("id.u(Lid;Lid;I)V")
    public void method4321(class255 arg0, class255 arg1) {
        this.field3383 = arg0.field3383;
        this.field3389 = arg0.field3389;
        this.field3414 = arg0.field3414;
        this.field3391 = arg0.field3391;
        this.field3392 = arg0.field3392;
        this.field3373 = arg0.field3373;
        this.field3422 = arg0.field3422;
        this.field3402 = arg0.field3402;
        this.field3386 = arg0.field3386;
        this.field3387 = arg0.field3387;
        this.field3388 = arg0.field3388;
        this.field3384 = arg1.field3384;
        this.field3420 = arg1.field3420;
        this.field3396 = arg1.field3396;
        this.field3395 = 1;
    }

    @ObfuscatedName("id.j(Lid;Lid;I)V")
    public void method4322(class255 arg0, class255 arg1) {
        this.field3383 = arg0.field3383;
        this.field3389 = arg0.field3389;
        this.field3414 = arg0.field3414;
        this.field3391 = arg0.field3391;
        this.field3392 = arg0.field3392;
        this.field3373 = arg0.field3373;
        this.field3422 = arg0.field3422;
        this.field3402 = arg1.field3402;
        this.field3386 = arg1.field3386;
        this.field3387 = arg1.field3387;
        this.field3388 = arg1.field3388;
        this.field3384 = arg1.field3384;
        this.field3420 = arg1.field3420;
        this.field3395 = arg1.field3395;
        this.field3401 = arg1.field3401;
        this.field3416 = arg1.field3416;
        this.field3407 = arg1.field3407;
        this.field3404 = arg1.field3404;
        this.field3405 = arg1.field3405;
        this.field3408 = arg1.field3408;
        this.field3426 = arg1.field3426;
        this.field3410 = arg1.field3410;
        this.field3411 = arg1.field3411;
        this.field3424 = arg1.field3424;
        this.field3385 = arg1.field3385;
        this.field3417 = arg1.field3417;
        this.field3399 = new String[5];
        if (arg1.field3399 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3399[var3] = arg1.field3399[var3];
            }
        }
        this.field3399[4] = class225.field2746;
        this.field3396 = 0;
    }

    @ObfuscatedName("id.v(Lid;Lid;I)V")
    public void method4372(class255 arg0, class255 arg1) {
        this.field3383 = arg0.field3383;
        this.field3389 = arg0.field3389;
        this.field3414 = arg0.field3414;
        this.field3391 = arg0.field3391;
        this.field3392 = arg0.field3392;
        this.field3373 = arg0.field3373;
        this.field3422 = arg0.field3422;
        this.field3402 = arg0.field3402;
        this.field3386 = arg0.field3386;
        this.field3387 = arg0.field3387;
        this.field3388 = arg0.field3388;
        this.field3395 = arg0.field3395;
        this.field3384 = arg1.field3384;
        this.field3396 = 0;
        this.field3420 = false;
        this.field3415 = false;
    }

    @ObfuscatedName("id.d(IB)Lds;")
    public final class122 method4339(int arg0) {
        if (this.field3418 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3397[var3] && this.field3397[var3] != 0) {
                    var2 = this.field3418[var3];
                }
            }
            if (var2 != -1) {
                return method1055(var2).method4339(1);
            }
        }
        class122 var4 = class122.method2525(Statics.field3376, this.field3383, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3381 != 128 || this.field3403 != 128 || this.field3419 != 128) {
            var4.method2540(this.field3381, this.field3403, this.field3419);
        }
        if (this.field3402 != null) {
            for (int var5 = 0; var5 < this.field3402.length; var5++) {
                var4.method2537(this.field3402[var5], this.field3386[var5]);
            }
        }
        if (this.field3387 != null) {
            for (int var6 = 0; var6 < this.field3387.length; var6++) {
                var4.method2538(this.field3387[var6], this.field3388[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("id.z(IB)Ldr;")
    public final class128 method4325(int arg0) {
        if (this.field3418 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3397[var3] && this.field3397[var3] != 0) {
                    var2 = this.field3418[var3];
                }
            }
            if (var2 != -1) {
                return method1055(var2).method4325(1);
            }
        }
        class128 var4 = (class128) field3380.method3061((long) this.field3382);
        if (var4 != null) {
            return var4;
        }
        class122 var5 = class122.method2525(Statics.field3376, this.field3383, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3381 != 128 || this.field3403 != 128 || this.field3419 != 128) {
            var5.method2540(this.field3381, this.field3403, this.field3419);
        }
        if (this.field3402 != null) {
            for (int var6 = 0; var6 < this.field3402.length; var6++) {
                var5.method2537(this.field3402[var6], this.field3386[var6]);
            }
        }
        if (this.field3387 != null) {
            for (int var7 = 0; var7 < this.field3387.length; var7++) {
                var5.method2538(this.field3387[var7], this.field3388[var7]);
            }
        }
        class128 var8 = var5.method2545(this.field3413 + 64, this.field3421 * 5 + 768, -50, -10, -50);
        var8.field1664 = true;
        field3380.method3062(var8, (long) this.field3382);
        return var8;
    }

    @ObfuscatedName("id.s(II)Lid;")
    public class255 method4326(int arg0) {
        if (this.field3418 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3397[var3] && this.field3397[var3] != 0) {
                    var2 = this.field3418[var3];
                }
            }
            if (var2 != -1) {
                return method1055(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("by.p(IIIIIZI)Lli;")
    public static final class325 method1104(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class325 var8 = (class325) field3409.method3061(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class255 var9 = method1055(arg0);
        if (arg1 > 1 && var9.field3418 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3397[var11] && var9.field3397[var11] != 0) {
                    var10 = var9.field3418[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1055(var10);
            }
        }
        class128 var12 = var9.method4325(1);
        if (var12 == null) {
            return null;
        }
        class325 var13 = null;
        if (var9.field3390 != -1) {
            var13 = method1104(var9.field3378, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3394 != -1) {
            var13 = method1104(var9.field3425, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3428 != -1) {
            var13 = method1104(var9.field3427, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3847;
        int var15 = Statics.field3842;
        int var16 = Statics.field3844;
        int[] var17 = new int[4];
        class321.method5560(var17);
        class325 var18 = new class325(36, 32);
        class321.method5556(var18.field3873, 36, 32);
        class321.method5562();
        class131.method2756();
        class131.method2827(16, 16);
        class131.field1730 = false;
        if (var9.field3428 != -1) {
            var13.method5664(0, 0);
        }
        int var19 = var9.field3389;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class131.field1752[var9.field3414] * var19 >> 16;
        int var21 = class131.field1737[var9.field3414] * var19 >> 16;
        var12.method2635();
        var12.method2648(0, var9.field3391, var9.field3392, var9.field3414, var9.field3373, var9.field3422 + var12.field1837 / 2 + var20, var9.field3422 + var21);
        if (var9.field3394 != -1) {
            var13.method5664(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5741(1);
        }
        if (arg2 >= 2) {
            var18.method5741(16777215);
        }
        if (arg3 != 0) {
            var18.method5735(arg3);
        }
        class321.method5556(var18.field3873, 36, 32);
        if (var9.field3390 != -1) {
            var13.method5664(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3395 == 1) {
            Statics.field2524.method4957(method3020(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3409.method3062(var18, var6);
        }
        class321.method5556(var14, var15, var16);
        class321.method5561(var17);
        class131.method2756();
        class131.field1730 = true;
        return var18;
    }

    @ObfuscatedName("ea.e(IB)Ljava/lang/String;")
    public static final String method3020(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class225.field2950 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class225.field2905 + "</col>";
        }
    }

    @ObfuscatedName("id.i(ZB)Z")
    public final boolean method4327(boolean arg0) {
        int var2 = this.field3401;
        int var3 = this.field3416;
        int var4 = this.field3407;
        if (arg0) {
            var2 = this.field3404;
            var3 = this.field3405;
            var4 = this.field3408;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3376.method3827(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3376.method3827(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3376.method3827(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("id.q(ZB)Lds;")
    public final class122 method4328(boolean arg0) {
        int var2 = this.field3401;
        int var3 = this.field3416;
        int var4 = this.field3407;
        if (arg0) {
            var2 = this.field3404;
            var3 = this.field3405;
            var4 = this.field3408;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var5 = class122.method2525(Statics.field3376, var2, 0);
        if (var3 != -1) {
            class122 var6 = class122.method2525(Statics.field3376, var3, 0);
            if (var4 == -1) {
                class122[] var9 = new class122[] { var5, var6 };
                var5 = new class122(var9, 2);
            } else {
                class122 var7 = class122.method2525(Statics.field3376, var4, 0);
                class122[] var8 = new class122[] { var5, var6, var7 };
                var5 = new class122(var8, 3);
            }
        }
        if (!arg0 && this.field3393 != 0) {
            var5.method2536(0, this.field3393, 0);
        }
        if (arg0 && this.field3406 != 0) {
            var5.method2536(0, this.field3406, 0);
        }
        if (this.field3402 != null) {
            for (int var10 = 0; var10 < this.field3402.length; var10++) {
                var5.method2537(this.field3402[var10], this.field3386[var10]);
            }
        }
        if (this.field3387 != null) {
            for (int var11 = 0; var11 < this.field3387.length; var11++) {
                var5.method2538(this.field3387[var11], this.field3388[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("id.r(ZB)Z")
    public final boolean method4336(boolean arg0) {
        int var2 = this.field3426;
        int var3 = this.field3410;
        if (arg0) {
            var2 = this.field3411;
            var3 = this.field3424;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3376.method3827(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3376.method3827(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("id.k(ZI)Lds;")
    public final class122 method4330(boolean arg0) {
        int var2 = this.field3426;
        int var3 = this.field3410;
        if (arg0) {
            var2 = this.field3411;
            var3 = this.field3424;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var4 = class122.method2525(Statics.field3376, var2, 0);
        if (var3 != -1) {
            class122 var5 = class122.method2525(Statics.field3376, var3, 0);
            class122[] var6 = new class122[] { var4, var5 };
            var4 = new class122(var6, 2);
        }
        if (this.field3402 != null) {
            for (int var7 = 0; var7 < this.field3402.length; var7++) {
                var4.method2537(this.field3402[var7], this.field3386[var7]);
            }
        }
        if (this.field3387 != null) {
            for (int var8 = 0; var8 < this.field3387.length; var8++) {
                var4.method2538(this.field3387[var8], this.field3388[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("id.w(III)I")
    public int method4331(int arg0, int arg1) {
        return class248.method1051(this.field3423, arg0, arg1);
    }

    @ObfuscatedName("id.m(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4332(int arg0, String arg1) {
        class316 var3 = this.field3423;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class177 var5 = (class177) var3.method5493((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2089;
            }
        }
        return var4;
    }

    @ObfuscatedName("id.o(I)I")
    public int method4333() {
        if (this.field3400 == -1 || this.field3399 == null) {
            return -1;
        } else if (this.field3400 >= 0) {
            return this.field3399[this.field3400] == null ? -1 : this.field3400;
        } else if (class225.field2741.equalsIgnoreCase(this.field3399[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("df.a(ZI)V")
    public static void method2754(boolean arg0) {
        if (Statics.field3377 != arg0) {
            field3379.method3063();
            field3380.method3063();
            field3409.method3063();
            Statics.field3377 = arg0;
        }
    }
}
