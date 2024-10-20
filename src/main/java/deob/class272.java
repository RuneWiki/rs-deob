package deob;

@ObfuscatedName("jt")
public class class272 extends class209 {

    @ObfuscatedName("jt.b")
    public static class203 field3501 = new class203(64);

    @ObfuscatedName("jt.c")
    public static class203 field3475 = new class203(50);

    @ObfuscatedName("jt.d")
    public static class203 field3504 = new class203(200);

    @ObfuscatedName("jt.a")
    public int field3460;

    @ObfuscatedName("jt.z")
    public int field3487;

    @ObfuscatedName("jt.e")
    public String field3462 = class240.field2830;

    @ObfuscatedName("jt.q")
    public short[] field3485;

    @ObfuscatedName("jt.j")
    public short[] field3459;

    @ObfuscatedName("jt.y")
    public short[] field3465;

    @ObfuscatedName("jt.m")
    public short[] field3466;

    @ObfuscatedName("jt.h")
    public int field3452 = 2000;

    @ObfuscatedName("jt.x")
    public int field3468 = 0;

    @ObfuscatedName("jt.f")
    public int field3469 = 0;

    @ObfuscatedName("jt.r")
    public int field3470 = 0;

    @ObfuscatedName("jt.n")
    public int field3495 = 0;

    @ObfuscatedName("jt.g")
    public int field3472 = 0;

    @ObfuscatedName("jt.ac")
    public int field3473 = 0;

    @ObfuscatedName("jt.ab")
    public int field3506 = 1;

    @ObfuscatedName("jt.ao")
    public boolean field3490 = false;

    @ObfuscatedName("jt.an")
    public String[] field3476 = new String[] { null, null, class240.field2823, null, null };

    @ObfuscatedName("jt.ay")
    public String[] field3478 = new String[] { null, null, null, null, class240.field2833 };

    @ObfuscatedName("jt.af")
    public int field3471 = -2;

    @ObfuscatedName("jt.ar")
    public int field3479 = -1;

    @ObfuscatedName("jt.am")
    public int field3480 = -1;

    @ObfuscatedName("jt.aj")
    public int field3481 = 0;

    @ObfuscatedName("jt.aq")
    public int field3503 = -1;

    @ObfuscatedName("jt.ak")
    public int field3483 = -1;

    @ObfuscatedName("jt.ax")
    public int field3484 = 0;

    @ObfuscatedName("jt.aw")
    public int field3496 = -1;

    @ObfuscatedName("jt.au")
    public int field3486 = -1;

    @ObfuscatedName("jt.ad")
    public int field3467 = -1;

    @ObfuscatedName("jt.ah")
    public int field3488 = -1;

    @ObfuscatedName("jt.as")
    public int field3489 = -1;

    @ObfuscatedName("jt.ag")
    public int field3464 = -1;

    @ObfuscatedName("jt.at")
    public int[] field3491;

    @ObfuscatedName("jt.ae")
    public int[] field3492;

    @ObfuscatedName("jt.ap")
    public int field3493 = -1;

    @ObfuscatedName("jt.ai")
    public int field3457 = -1;

    @ObfuscatedName("jt.aa")
    public int field3463 = 128;

    @ObfuscatedName("jt.az")
    public int field3458 = 128;

    @ObfuscatedName("jt.al")
    public int field3497 = 128;

    @ObfuscatedName("jt.be")
    public int field3498 = 0;

    @ObfuscatedName("jt.br")
    public int field3499 = 0;

    @ObfuscatedName("jt.bi")
    public int field3500 = 0;

    @ObfuscatedName("jt.bg")
    public class200 field3502;

    @ObfuscatedName("jt.ba")
    public boolean field3461 = false;

    @ObfuscatedName("jt.bw")
    public int field3477 = -1;

    @ObfuscatedName("jt.bx")
    public int field3482 = -1;

    @ObfuscatedName("jt.bh")
    public int field3505 = -1;

    @ObfuscatedName("jt.bk")
    public int field3494 = -1;

    @ObfuscatedName("jt.s(I)V")
    public void method4752() {
    }

    @ObfuscatedName("jt.o(Lgx;I)V")
    public void method4753(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4742(arg0, var2);
        }
    }

    @ObfuscatedName("jt.k(Lgx;IS)V")
    public void method4742(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3487 = arg0.method3276();
        } else if (arg1 == 2) {
            this.field3462 = arg0.method3490();
        } else if (arg1 == 4) {
            this.field3452 = arg0.method3276();
        } else if (arg1 == 5) {
            this.field3468 = arg0.method3276();
        } else if (arg1 == 6) {
            this.field3469 = arg0.method3276();
        } else if (arg1 == 7) {
            this.field3495 = arg0.method3276();
            if (this.field3495 > 32767) {
                this.field3495 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3472 = arg0.method3276();
            if (this.field3472 > 32767) {
                this.field3472 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3473 = 1;
        } else if (arg1 == 12) {
            this.field3506 = arg0.method3279();
        } else if (arg1 == 16) {
            this.field3490 = true;
        } else if (arg1 == 23) {
            this.field3479 = arg0.method3276();
            this.field3481 = arg0.method3274();
        } else if (arg1 == 24) {
            this.field3480 = arg0.method3276();
        } else if (arg1 == 25) {
            this.field3503 = arg0.method3276();
            this.field3484 = arg0.method3274();
        } else if (arg1 == 26) {
            this.field3483 = arg0.method3276();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3476[arg1 - 30] = arg0.method3490();
            if (this.field3476[arg1 - 30].equalsIgnoreCase(class240.field2825)) {
                this.field3476[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3478[arg1 - 35] = arg0.method3490();
        } else if (arg1 == 40) {
            int var3 = arg0.method3274();
            this.field3485 = new short[var3];
            this.field3459 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3485[var4] = (short) arg0.method3276();
                this.field3459[var4] = (short) arg0.method3276();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3274();
            this.field3465 = new short[var5];
            this.field3466 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3465[var6] = (short) arg0.method3276();
                this.field3466[var6] = (short) arg0.method3276();
            }
        } else if (arg1 == 42) {
            this.field3471 = arg0.method3275();
        } else if (arg1 == 65) {
            this.field3461 = true;
        } else if (arg1 == 78) {
            this.field3496 = arg0.method3276();
        } else if (arg1 == 79) {
            this.field3486 = arg0.method3276();
        } else if (arg1 == 90) {
            this.field3467 = arg0.method3276();
        } else if (arg1 == 91) {
            this.field3489 = arg0.method3276();
        } else if (arg1 == 92) {
            this.field3488 = arg0.method3276();
        } else if (arg1 == 93) {
            this.field3464 = arg0.method3276();
        } else if (arg1 == 95) {
            this.field3470 = arg0.method3276();
        } else if (arg1 == 97) {
            this.field3493 = arg0.method3276();
        } else if (arg1 == 98) {
            this.field3457 = arg0.method3276();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3491 == null) {
                this.field3491 = new int[10];
                this.field3492 = new int[10];
            }
            this.field3491[arg1 - 100] = arg0.method3276();
            this.field3492[arg1 - 100] = arg0.method3276();
        } else if (arg1 == 110) {
            this.field3463 = arg0.method3276();
        } else if (arg1 == 111) {
            this.field3458 = arg0.method3276();
        } else if (arg1 == 112) {
            this.field3497 = arg0.method3276();
        } else if (arg1 == 113) {
            this.field3498 = arg0.method3275();
        } else if (arg1 == 114) {
            this.field3499 = arg0.method3275() * 5;
        } else if (arg1 == 115) {
            this.field3500 = arg0.method3274();
        } else if (arg1 == 139) {
            this.field3477 = arg0.method3276();
        } else if (arg1 == 140) {
            this.field3482 = arg0.method3276();
        } else if (arg1 == 148) {
            this.field3505 = arg0.method3276();
        } else if (arg1 == 149) {
            this.field3494 = arg0.method3276();
        } else if (arg1 == 249) {
            this.field3502 = class265.method172(arg0, this.field3502);
        }
    }

    @ObfuscatedName("jt.u(Ljt;Ljt;I)V")
    public void method4769(class272 arg0, class272 arg1) {
        this.field3487 = arg0.field3487;
        this.field3452 = arg0.field3452;
        this.field3468 = arg0.field3468;
        this.field3469 = arg0.field3469;
        this.field3470 = arg0.field3470;
        this.field3495 = arg0.field3495;
        this.field3472 = arg0.field3472;
        this.field3485 = arg0.field3485;
        this.field3459 = arg0.field3459;
        this.field3465 = arg0.field3465;
        this.field3466 = arg0.field3466;
        this.field3462 = arg1.field3462;
        this.field3490 = arg1.field3490;
        this.field3506 = arg1.field3506;
        this.field3473 = 1;
    }

    @ObfuscatedName("jt.i(Ljt;Ljt;I)V")
    public void method4786(class272 arg0, class272 arg1) {
        this.field3487 = arg0.field3487;
        this.field3452 = arg0.field3452;
        this.field3468 = arg0.field3468;
        this.field3469 = arg0.field3469;
        this.field3470 = arg0.field3470;
        this.field3495 = arg0.field3495;
        this.field3472 = arg0.field3472;
        this.field3485 = arg1.field3485;
        this.field3459 = arg1.field3459;
        this.field3465 = arg1.field3465;
        this.field3466 = arg1.field3466;
        this.field3462 = arg1.field3462;
        this.field3490 = arg1.field3490;
        this.field3473 = arg1.field3473;
        this.field3479 = arg1.field3479;
        this.field3480 = arg1.field3480;
        this.field3496 = arg1.field3496;
        this.field3503 = arg1.field3503;
        this.field3483 = arg1.field3483;
        this.field3486 = arg1.field3486;
        this.field3467 = arg1.field3467;
        this.field3488 = arg1.field3488;
        this.field3489 = arg1.field3489;
        this.field3464 = arg1.field3464;
        this.field3500 = arg1.field3500;
        this.field3476 = arg1.field3476;
        this.field3478 = new String[5];
        if (arg1.field3478 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3478[var3] = arg1.field3478[var3];
            }
        }
        this.field3478[4] = class240.field3065;
        this.field3506 = 0;
    }

    @ObfuscatedName("jt.t(Ljt;Ljt;B)V")
    public void method4747(class272 arg0, class272 arg1) {
        this.field3487 = arg0.field3487;
        this.field3452 = arg0.field3452;
        this.field3468 = arg0.field3468;
        this.field3469 = arg0.field3469;
        this.field3470 = arg0.field3470;
        this.field3495 = arg0.field3495;
        this.field3472 = arg0.field3472;
        this.field3485 = arg0.field3485;
        this.field3459 = arg0.field3459;
        this.field3465 = arg0.field3465;
        this.field3466 = arg0.field3466;
        this.field3473 = arg0.field3473;
        this.field3462 = arg1.field3462;
        this.field3506 = 0;
        this.field3490 = false;
        this.field3461 = false;
    }

    @ObfuscatedName("jt.c(II)Ldc;")
    public final class116 method4748(int arg0) {
        if (this.field3491 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3492[var3] && this.field3492[var3] != 0) {
                    var2 = this.field3491[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method945(var2).method4748(1);
            }
        }
        class116 var4 = class116.method2418(Statics.field3456, this.field3487, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3463 != 128 || this.field3458 != 128 || this.field3497 != 128) {
            var4.method2394(this.field3463, this.field3458, this.field3497);
        }
        if (this.field3485 != null) {
            for (int var5 = 0; var5 < this.field3485.length; var5++) {
                var4.method2391(this.field3485[var5], this.field3459[var5]);
            }
        }
        if (this.field3465 != null) {
            for (int var6 = 0; var6 < this.field3465.length; var6++) {
                var4.method2436(this.field3465[var6], this.field3466[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jt.w(II)Lda;")
    public final class122 method4749(int arg0) {
        if (this.field3491 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3492[var3] && this.field3492[var3] != 0) {
                    var2 = this.field3491[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method945(var2).method4749(1);
            }
        }
        class122 var4 = (class122) field3475.method3687((long) this.field3460);
        if (var4 != null) {
            return var4;
        }
        class116 var5 = class116.method2418(Statics.field3456, this.field3487, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3463 != 128 || this.field3458 != 128 || this.field3497 != 128) {
            var5.method2394(this.field3463, this.field3458, this.field3497);
        }
        if (this.field3485 != null) {
            for (int var6 = 0; var6 < this.field3485.length; var6++) {
                var5.method2391(this.field3485[var6], this.field3459[var6]);
            }
        }
        if (this.field3465 != null) {
            for (int var7 = 0; var7 < this.field3465.length; var7++) {
                var5.method2436(this.field3465[var7], this.field3466[var7]);
            }
        }
        class122 var8 = var5.method2399(this.field3498 + 64, this.field3499 + 768, -50, -10, -50);
        var8.field1701 = true;
        field3475.method3689(var8, (long) this.field3460);
        return var8;
    }

    @ObfuscatedName("jt.a(II)Ljt;")
    public class272 method4750(int arg0) {
        if (this.field3491 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3492[var3] && this.field3492[var3] != 0) {
                    var2 = this.field3491[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method945(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cd.z(IIIIIZI)Llh;")
    public static final class322 method1721(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class322 var8 = (class322) field3504.method3687(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class272 var9 = Statics.method945(arg0);
        if (arg1 > 1 && var9.field3491 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3492[var11] && var9.field3492[var11] != 0) {
                    var10 = var9.field3491[var11];
                }
            }
            if (var10 != -1) {
                var9 = Statics.method945(var10);
            }
        }
        class122 var12 = var9.method4749(1);
        if (var12 == null) {
            return null;
        }
        class322 var13 = null;
        if (var9.field3457 != -1) {
            var13 = method1721(var9.field3493, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3482 != -1) {
            var13 = method1721(var9.field3477, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3494 != -1) {
            var13 = method1721(var9.field3505, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3802;
        int var15 = Statics.field3799;
        int var16 = Statics.field3798;
        int[] var17 = new int[4];
        class318.method5370(var17);
        class322 var18 = new class322(36, 32);
        class318.method5366(var18.field3826, 36, 32);
        class318.method5376();
        class125.method2580();
        class125.method2583(16, 16);
        class125.field1725 = false;
        if (var9.field3494 != -1) {
            var13.method5502(0, 0);
        }
        int var19 = var9.field3452;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class125.field1731[var9.field3468] * var19 >> 16;
        int var21 = class125.field1745[var9.field3468] * var19 >> 16;
        var12.method2532();
        var12.method2486(0, var9.field3469, var9.field3470, var9.field3468, var9.field3495, var9.field3472 + var12.field1833 / 2 + var20, var9.field3472 + var21);
        if (var9.field3482 != -1) {
            var13.method5502(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5574(1);
        }
        if (arg2 >= 2) {
            var18.method5574(16777215);
        }
        if (arg3 != 0) {
            var18.method5499(arg3);
        }
        class318.method5366(var18.field3826, 36, 32);
        if (var9.field3457 != -1) {
            var13.method5502(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3473 == 1) {
            Statics.field2000.method5159(method614(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3504.method3689(var18, var6);
        }
        class318.method5366(var14, var15, var16);
        class318.method5371(var17);
        class125.method2580();
        class125.field1725 = true;
        return var18;
    }

    @ObfuscatedName("aj.e(II)Ljava/lang/String;")
    public static final String method614(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class240.field2988 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class240.field2950 + "</col>";
        }
    }

    @ObfuscatedName("jt.q(ZB)Z")
    public final boolean method4804(boolean arg0) {
        int var2 = this.field3479;
        int var3 = this.field3480;
        int var4 = this.field3496;
        if (arg0) {
            var2 = this.field3503;
            var3 = this.field3483;
            var4 = this.field3486;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3456.method4272(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3456.method4272(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3456.method4272(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jt.j(ZI)Ldc;")
    public final class116 method4751(boolean arg0) {
        int var2 = this.field3479;
        int var3 = this.field3480;
        int var4 = this.field3496;
        if (arg0) {
            var2 = this.field3503;
            var3 = this.field3483;
            var4 = this.field3486;
        }
        if (var2 == -1) {
            return null;
        }
        class116 var5 = class116.method2418(Statics.field3456, var2, 0);
        if (var3 != -1) {
            class116 var6 = class116.method2418(Statics.field3456, var3, 0);
            if (var4 == -1) {
                class116[] var9 = new class116[] { var5, var6 };
                var5 = new class116(var9, 2);
            } else {
                class116 var7 = class116.method2418(Statics.field3456, var4, 0);
                class116[] var8 = new class116[] { var5, var6, var7 };
                var5 = new class116(var8, 3);
            }
        }
        if (!arg0 && this.field3481 != 0) {
            var5.method2390(0, this.field3481, 0);
        }
        if (arg0 && this.field3484 != 0) {
            var5.method2390(0, this.field3484, 0);
        }
        if (this.field3485 != null) {
            for (int var10 = 0; var10 < this.field3485.length; var10++) {
                var5.method2391(this.field3485[var10], this.field3459[var10]);
            }
        }
        if (this.field3465 != null) {
            for (int var11 = 0; var11 < this.field3465.length; var11++) {
                var5.method2436(this.field3465[var11], this.field3466[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jt.y(ZI)Z")
    public final boolean method4798(boolean arg0) {
        int var2 = this.field3467;
        int var3 = this.field3488;
        if (arg0) {
            var2 = this.field3489;
            var3 = this.field3464;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3456.method4272(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3456.method4272(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jt.m(ZI)Ldc;")
    public final class116 method4745(boolean arg0) {
        int var2 = this.field3467;
        int var3 = this.field3488;
        if (arg0) {
            var2 = this.field3489;
            var3 = this.field3464;
        }
        if (var2 == -1) {
            return null;
        }
        class116 var4 = class116.method2418(Statics.field3456, var2, 0);
        if (var3 != -1) {
            class116 var5 = class116.method2418(Statics.field3456, var3, 0);
            class116[] var6 = new class116[] { var4, var5 };
            var4 = new class116(var6, 2);
        }
        if (this.field3485 != null) {
            for (int var7 = 0; var7 < this.field3485.length; var7++) {
                var4.method2391(this.field3485[var7], this.field3459[var7]);
            }
        }
        if (this.field3465 != null) {
            for (int var8 = 0; var8 < this.field3465.length; var8++) {
                var4.method2436(this.field3465[var8], this.field3466[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jt.h(IIB)I")
    public int method4754(int arg0, int arg1) {
        return class265.method3063(this.field3502, arg0, arg1);
    }

    @ObfuscatedName("jt.x(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4755(int arg0, String arg1) {
        return class265.method2331(this.field3502, arg0, arg1);
    }

    @ObfuscatedName("jt.f(I)I")
    public int method4756() {
        if (this.field3471 == -1 || this.field3478 == null) {
            return -1;
        } else if (this.field3471 >= 0) {
            return this.field3478[this.field3471] == null ? -1 : this.field3471;
        } else if (class240.field2833.equalsIgnoreCase(this.field3478[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("dp.r(I)V")
    public static void method2323() {
        field3501.method3697();
        field3475.method3697();
        field3504.method3697();
    }
}
