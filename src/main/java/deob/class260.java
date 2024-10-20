package deob;

@ObfuscatedName("ir")
public class class260 extends class198 {

    @ObfuscatedName("ir.r")
    public static class193 field3508 = new class193(64);

    @ObfuscatedName("ir.v")
    public static class193 field3509 = new class193(50);

    @ObfuscatedName("ir.h")
    public static class193 field3510 = new class193(200);

    @ObfuscatedName("ir.p")
    public int field3512;

    @ObfuscatedName("ir.q")
    public int field3513;

    @ObfuscatedName("ir.l")
    public String field3501 = "null";

    @ObfuscatedName("ir.c")
    public short[] field3515;

    @ObfuscatedName("ir.n")
    public short[] field3518;

    @ObfuscatedName("ir.z")
    public short[] field3517;

    @ObfuscatedName("ir.e")
    public short[] field3548;

    @ObfuscatedName("ir.g")
    public int field3507 = 2000;

    @ObfuscatedName("ir.d")
    public int field3520 = 0;

    @ObfuscatedName("ir.y")
    public int field3557 = 0;

    @ObfuscatedName("ir.t")
    public int field3522 = 0;

    @ObfuscatedName("ir.b")
    public int field3514 = 0;

    @ObfuscatedName("ir.s")
    public int field3524 = 0;

    @ObfuscatedName("ir.ap")
    public int field3531 = 0;

    @ObfuscatedName("ir.ac")
    public int field3526 = 1;

    @ObfuscatedName("ir.af")
    public boolean field3527 = false;

    @ObfuscatedName("ir.ai")
    public String[] field3528 = new String[] { null, null, class229.field2856, null, null };

    @ObfuscatedName("ir.ad")
    public String[] field3535 = new String[] { null, null, null, null, class229.field3077 };

    @ObfuscatedName("ir.aq")
    public int field3530 = -2;

    @ObfuscatedName("ir.ag")
    public int field3554 = -1;

    @ObfuscatedName("ir.ak")
    public int field3532 = -1;

    @ObfuscatedName("ir.ae")
    public int field3533 = 0;

    @ObfuscatedName("ir.am")
    public int field3534 = -1;

    @ObfuscatedName("ir.az")
    public int field3545 = -1;

    @ObfuscatedName("ir.ay")
    public int field3536 = 0;

    @ObfuscatedName("ir.as")
    public int field3525 = -1;

    @ObfuscatedName("ir.aw")
    public int field3537 = -1;

    @ObfuscatedName("ir.at")
    public int field3539 = -1;

    @ObfuscatedName("ir.aj")
    public int field3540 = -1;

    @ObfuscatedName("ir.ax")
    public int field3541 = -1;

    @ObfuscatedName("ir.an")
    public int field3529 = -1;

    @ObfuscatedName("ir.ab")
    public int[] field3543;

    @ObfuscatedName("ir.av")
    public int[] field3544;

    @ObfuscatedName("ir.al")
    public int field3523 = -1;

    @ObfuscatedName("ir.ah")
    public int field3546 = -1;

    @ObfuscatedName("ir.au")
    public int field3547 = 128;

    @ObfuscatedName("ir.aa")
    public int field3555 = 128;

    @ObfuscatedName("ir.ao")
    public int field3549 = 128;

    @ObfuscatedName("ir.bm")
    public int field3506 = 0;

    @ObfuscatedName("ir.bd")
    public int field3551 = 0;

    @ObfuscatedName("ir.bn")
    public int field3552 = 0;

    @ObfuscatedName("ir.by")
    public class190 field3553;

    @ObfuscatedName("ir.bo")
    public boolean field3558 = false;

    @ObfuscatedName("ir.ba")
    public int field3505 = -1;

    @ObfuscatedName("ir.bv")
    public int field3556 = -1;

    @ObfuscatedName("ir.bq")
    public int field3519 = -1;

    @ObfuscatedName("ir.bt")
    public int field3516 = -1;

    @ObfuscatedName("dh.w(Liq;Liq;ZLjt;I)V")
    public static void method2162(class239 arg0, class239 arg1, boolean arg2, class267 arg3) {
        Statics.field3538 = arg0;
        Statics.field460 = arg1;
        Statics.field3542 = arg2;
        Statics.field3550 = Statics.field3538.method3798(10);
        Statics.field3511 = arg3;
    }

    @ObfuscatedName("it.o(IB)Lir;")
    public static class260 method3915(int arg0) {
        class260 var1 = (class260) field3508.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3538.method3754(10, arg0);
        class260 var3 = new class260();
        var3.field3512 = arg0;
        if (var2 != null) {
            var3.method4194(new class177(var2));
        }
        var3.method4232();
        if (var3.field3546 != -1) {
            var3.method4196(method3915(var3.field3546), method3915(var3.field3523));
        }
        if (var3.field3556 != -1) {
            var3.method4197(method3915(var3.field3556), method3915(var3.field3505));
        }
        if (var3.field3516 != -1) {
            var3.method4217(method3915(var3.field3516), method3915(var3.field3519));
        }
        if (!Statics.field3542 && var3.field3527) {
            var3.field3501 = class229.field3111;
            var3.field3558 = false;
            var3.field3528 = null;
            var3.field3535 = null;
            var3.field3530 = -1;
            var3.field3552 = 0;
            if (var3.field3553 != null) {
                boolean var4 = false;
                for (class196 var5 = var3.field3553.method3210(); var5 != null; var5 = var3.field3553.method3211()) {
                    class255 var6 = Statics.method51((int) var5.field2490);
                    if (var6.field3400) {
                        var5.method3294();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3553 = null;
                }
            }
        }
        field3508.method3241(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.x(I)V")
    public void method4232() {
    }

    @ObfuscatedName("ir.k(Lfi;I)V")
    public void method4194(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method4193(arg0, var2);
        }
    }

    @ObfuscatedName("ir.f(Lfi;II)V")
    public void method4193(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3513 = arg0.method2886();
        } else if (arg1 == 2) {
            this.field3501 = arg0.method2892();
        } else if (arg1 == 4) {
            this.field3507 = arg0.method2886();
        } else if (arg1 == 5) {
            this.field3520 = arg0.method2886();
        } else if (arg1 == 6) {
            this.field3557 = arg0.method2886();
        } else if (arg1 == 7) {
            this.field3514 = arg0.method2886();
            if (this.field3514 > 32767) {
                this.field3514 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3524 = arg0.method2886();
            if (this.field3524 > 32767) {
                this.field3524 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3531 = 1;
        } else if (arg1 == 12) {
            this.field3526 = arg0.method2904();
        } else if (arg1 == 16) {
            this.field3527 = true;
        } else if (arg1 == 23) {
            this.field3554 = arg0.method2886();
            this.field3533 = arg0.method2931();
        } else if (arg1 == 24) {
            this.field3532 = arg0.method2886();
        } else if (arg1 == 25) {
            this.field3534 = arg0.method2886();
            this.field3536 = arg0.method2931();
        } else if (arg1 == 26) {
            this.field3545 = arg0.method2886();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3528[arg1 - 30] = arg0.method2892();
            if (this.field3528[arg1 - 30].equalsIgnoreCase(class229.field2858)) {
                this.field3528[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3535[arg1 - 35] = arg0.method2892();
        } else if (arg1 == 40) {
            int var3 = arg0.method2931();
            this.field3515 = new short[var3];
            this.field3518 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3515[var4] = (short) arg0.method2886();
                this.field3518[var4] = (short) arg0.method2886();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2931();
            this.field3517 = new short[var5];
            this.field3548 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3517[var6] = (short) arg0.method2886();
                this.field3548[var6] = (short) arg0.method2886();
            }
        } else if (arg1 == 42) {
            this.field3530 = arg0.method2885();
        } else if (arg1 == 65) {
            this.field3558 = true;
        } else if (arg1 == 78) {
            this.field3525 = arg0.method2886();
        } else if (arg1 == 79) {
            this.field3537 = arg0.method2886();
        } else if (arg1 == 90) {
            this.field3539 = arg0.method2886();
        } else if (arg1 == 91) {
            this.field3541 = arg0.method2886();
        } else if (arg1 == 92) {
            this.field3540 = arg0.method2886();
        } else if (arg1 == 93) {
            this.field3529 = arg0.method2886();
        } else if (arg1 == 95) {
            this.field3522 = arg0.method2886();
        } else if (arg1 == 97) {
            this.field3523 = arg0.method2886();
        } else if (arg1 == 98) {
            this.field3546 = arg0.method2886();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3543 == null) {
                this.field3543 = new int[10];
                this.field3544 = new int[10];
            }
            this.field3543[arg1 - 100] = arg0.method2886();
            this.field3544[arg1 - 100] = arg0.method2886();
        } else if (arg1 == 110) {
            this.field3547 = arg0.method2886();
        } else if (arg1 == 111) {
            this.field3555 = arg0.method2886();
        } else if (arg1 == 112) {
            this.field3549 = arg0.method2886();
        } else if (arg1 == 113) {
            this.field3506 = arg0.method2885();
        } else if (arg1 == 114) {
            this.field3551 = arg0.method2885() * 5;
        } else if (arg1 == 115) {
            this.field3552 = arg0.method2931();
        } else if (arg1 == 139) {
            this.field3505 = arg0.method2886();
        } else if (arg1 == 140) {
            this.field3556 = arg0.method2886();
        } else if (arg1 == 148) {
            this.field3519 = arg0.method2886();
        } else if (arg1 == 149) {
            this.field3516 = arg0.method2886();
        } else if (arg1 == 249) {
            this.field3553 = class253.method2807(arg0, this.field3553);
        }
    }

    @ObfuscatedName("ir.i(Lir;Lir;I)V")
    public void method4196(class260 arg0, class260 arg1) {
        this.field3513 = arg0.field3513;
        this.field3507 = arg0.field3507;
        this.field3520 = arg0.field3520;
        this.field3557 = arg0.field3557;
        this.field3522 = arg0.field3522;
        this.field3514 = arg0.field3514;
        this.field3524 = arg0.field3524;
        this.field3515 = arg0.field3515;
        this.field3518 = arg0.field3518;
        this.field3517 = arg0.field3517;
        this.field3548 = arg0.field3548;
        this.field3501 = arg1.field3501;
        this.field3527 = arg1.field3527;
        this.field3526 = arg1.field3526;
        this.field3531 = 1;
    }

    @ObfuscatedName("ir.j(Lir;Lir;I)V")
    public void method4197(class260 arg0, class260 arg1) {
        this.field3513 = arg0.field3513;
        this.field3507 = arg0.field3507;
        this.field3520 = arg0.field3520;
        this.field3557 = arg0.field3557;
        this.field3522 = arg0.field3522;
        this.field3514 = arg0.field3514;
        this.field3524 = arg0.field3524;
        this.field3515 = arg1.field3515;
        this.field3518 = arg1.field3518;
        this.field3517 = arg1.field3517;
        this.field3548 = arg1.field3548;
        this.field3501 = arg1.field3501;
        this.field3527 = arg1.field3527;
        this.field3531 = arg1.field3531;
        this.field3554 = arg1.field3554;
        this.field3532 = arg1.field3532;
        this.field3525 = arg1.field3525;
        this.field3534 = arg1.field3534;
        this.field3545 = arg1.field3545;
        this.field3537 = arg1.field3537;
        this.field3539 = arg1.field3539;
        this.field3540 = arg1.field3540;
        this.field3541 = arg1.field3541;
        this.field3529 = arg1.field3529;
        this.field3552 = arg1.field3552;
        this.field3528 = arg1.field3528;
        this.field3535 = new String[5];
        if (arg1.field3535 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3535[var3] = arg1.field3535[var3];
            }
        }
        this.field3535[4] = class229.field2947;
        this.field3526 = 0;
    }

    @ObfuscatedName("ir.m(Lir;Lir;I)V")
    public void method4217(class260 arg0, class260 arg1) {
        this.field3513 = arg0.field3513;
        this.field3507 = arg0.field3507;
        this.field3520 = arg0.field3520;
        this.field3557 = arg0.field3557;
        this.field3522 = arg0.field3522;
        this.field3514 = arg0.field3514;
        this.field3524 = arg0.field3524;
        this.field3515 = arg0.field3515;
        this.field3518 = arg0.field3518;
        this.field3517 = arg0.field3517;
        this.field3548 = arg0.field3548;
        this.field3531 = arg0.field3531;
        this.field3501 = arg1.field3501;
        this.field3526 = 0;
        this.field3527 = false;
        this.field3558 = false;
    }

    @ObfuscatedName("ir.u(IB)Ldb;")
    public final class128 method4199(int arg0) {
        if (this.field3543 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3544[var3] && this.field3544[var3] != 0) {
                    var2 = this.field3543[var3];
                }
            }
            if (var2 != -1) {
                return method3915(var2).method4199(1);
            }
        }
        class128 var4 = class128.method2163(Statics.field460, this.field3513, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3547 != 128 || this.field3555 != 128 || this.field3549 != 128) {
            var4.method2200(this.field3547, this.field3555, this.field3549);
        }
        if (this.field3515 != null) {
            for (int var5 = 0; var5 < this.field3515.length; var5++) {
                var4.method2177(this.field3515[var5], this.field3518[var5]);
            }
        }
        if (this.field3517 != null) {
            for (int var6 = 0; var6 < this.field3517.length; var6++) {
                var4.method2178(this.field3517[var6], this.field3548[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ir.h(II)Lev;")
    public final class134 method4207(int arg0) {
        if (this.field3543 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3544[var3] && this.field3544[var3] != 0) {
                    var2 = this.field3543[var3];
                }
            }
            if (var2 != -1) {
                return method3915(var2).method4207(1);
            }
        }
        class134 var4 = (class134) field3509.method3239((long) this.field3512);
        if (var4 != null) {
            return var4;
        }
        class128 var5 = class128.method2163(Statics.field460, this.field3513, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3547 != 128 || this.field3555 != 128 || this.field3549 != 128) {
            var5.method2200(this.field3547, this.field3555, this.field3549);
        }
        if (this.field3515 != null) {
            for (int var6 = 0; var6 < this.field3515.length; var6++) {
                var5.method2177(this.field3515[var6], this.field3518[var6]);
            }
        }
        if (this.field3517 != null) {
            for (int var7 = 0; var7 < this.field3517.length; var7++) {
                var5.method2178(this.field3517[var7], this.field3548[var7]);
            }
        }
        class134 var8 = var5.method2185(this.field3506 + 64, this.field3551 + 768, -50, -10, -50);
        var8.field1975 = true;
        field3509.method3241(var8, (long) this.field3512);
        return var8;
    }

    @ObfuscatedName("ir.a(II)Lir;")
    public class260 method4216(int arg0) {
        if (this.field3543 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3544[var3] && this.field3544[var3] != 0) {
                    var2 = this.field3543[var3];
                }
            }
            if (var2 != -1) {
                return method3915(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ga.p(IIIIIZB)Lkh;")
    public static final class289 method3150(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class289 var8 = (class289) field3510.method3239(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class260 var9 = method3915(arg0);
        if (arg1 > 1 && var9.field3543 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3544[var11] && var9.field3544[var11] != 0) {
                    var10 = var9.field3543[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3915(var10);
            }
        }
        class134 var12 = var9.method4207(1);
        if (var12 == null) {
            return null;
        }
        class289 var13 = null;
        if (var9.field3546 != -1) {
            var13 = method3150(var9.field3523, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3556 != -1) {
            var13 = method3150(var9.field3505, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3516 != -1) {
            var13 = method3150(var9.field3519, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3760;
        int var15 = Statics.field3764;
        int var16 = Statics.field3761;
        int[] var17 = new int[4];
        class285.method4593(var17);
        class289 var18 = new class289(36, 32);
        class285.method4620(var18.field3795, 36, 32);
        class285.method4597();
        class137.method2349();
        class137.method2352(16, 16);
        class137.field2021 = false;
        if (var9.field3516 != -1) {
            var13.method4699(0, 0);
        }
        int var19 = var9.field3507;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class137.field2043[var9.field3520] * var19 >> 16;
        int var21 = class137.field2037[var9.field3520] * var19 >> 16;
        var12.method2303();
        var12.method2267(0, var9.field3557, var9.field3522, var9.field3520, var9.field3514, var9.field3524 + var12.field2130 / 2 + var20, var9.field3524 + var21);
        if (var9.field3556 != -1) {
            var13.method4699(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4728(1);
        }
        if (arg2 >= 2) {
            var18.method4728(16777215);
        }
        if (arg3 != 0) {
            var18.method4709(arg3);
        }
        class285.method4620(var18.field3795, 36, 32);
        if (var9.field3546 != -1) {
            var13.method4699(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3531 == 1) {
            class267 var22 = Statics.field3511;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class229.field3019 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class229.field2924 + "</col>";
            }
            var22.method4407(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3510.method3241(var18, var6);
        }
        class285.method4620(var14, var15, var16);
        class285.method4577(var17);
        class137.method2349();
        class137.field2021 = true;
        return var18;
    }

    @ObfuscatedName("ir.q(ZI)Z")
    public final boolean method4202(boolean arg0) {
        int var2 = this.field3554;
        int var3 = this.field3532;
        int var4 = this.field3525;
        if (arg0) {
            var2 = this.field3534;
            var3 = this.field3545;
            var4 = this.field3537;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field460.method3801(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field460.method3801(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field460.method3801(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ir.l(ZI)Ldb;")
    public final class128 method4203(boolean arg0) {
        int var2 = this.field3554;
        int var3 = this.field3532;
        int var4 = this.field3525;
        if (arg0) {
            var2 = this.field3534;
            var3 = this.field3545;
            var4 = this.field3537;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var5 = class128.method2163(Statics.field460, var2, 0);
        if (var3 != -1) {
            class128 var6 = class128.method2163(Statics.field460, var3, 0);
            if (var4 == -1) {
                class128[] var9 = new class128[] { var5, var6 };
                var5 = new class128(var9, 2);
            } else {
                class128 var7 = class128.method2163(Statics.field460, var4, 0);
                class128[] var8 = new class128[] { var5, var6, var7 };
                var5 = new class128(var8, 3);
            }
        }
        if (!arg0 && this.field3533 != 0) {
            var5.method2176(0, this.field3533, 0);
        }
        if (arg0 && this.field3536 != 0) {
            var5.method2176(0, this.field3536, 0);
        }
        if (this.field3515 != null) {
            for (int var10 = 0; var10 < this.field3515.length; var10++) {
                var5.method2177(this.field3515[var10], this.field3518[var10]);
            }
        }
        if (this.field3517 != null) {
            for (int var11 = 0; var11 < this.field3517.length; var11++) {
                var5.method2178(this.field3517[var11], this.field3548[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ir.c(ZI)Z")
    public final boolean method4204(boolean arg0) {
        int var2 = this.field3539;
        int var3 = this.field3540;
        if (arg0) {
            var2 = this.field3541;
            var3 = this.field3529;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field460.method3801(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field460.method3801(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ir.n(ZI)Ldb;")
    public final class128 method4205(boolean arg0) {
        int var2 = this.field3539;
        int var3 = this.field3540;
        if (arg0) {
            var2 = this.field3541;
            var3 = this.field3529;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var4 = class128.method2163(Statics.field460, var2, 0);
        if (var3 != -1) {
            class128 var5 = class128.method2163(Statics.field460, var3, 0);
            class128[] var6 = new class128[] { var4, var5 };
            var4 = new class128(var6, 2);
        }
        if (this.field3515 != null) {
            for (int var7 = 0; var7 < this.field3515.length; var7++) {
                var4.method2177(this.field3515[var7], this.field3518[var7]);
            }
        }
        if (this.field3517 != null) {
            for (int var8 = 0; var8 < this.field3517.length; var8++) {
                var4.method2178(this.field3517[var8], this.field3548[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ir.z(III)I")
    public int method4269(int arg0, int arg1) {
        return class253.method2161(this.field3553, arg0, arg1);
    }

    @ObfuscatedName("ir.e(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4245(int arg0, String arg1) {
        return class253.method4380(this.field3553, arg0, arg1);
    }

    @ObfuscatedName("ir.t(I)I")
    public int method4208() {
        if (this.field3530 == -1 || this.field3535 == null) {
            return -1;
        } else if (this.field3530 >= 0) {
            return this.field3535[this.field3530] == null ? -1 : this.field3530;
        } else if (class229.field3077.equalsIgnoreCase(this.field3535[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("af.b(B)V")
    public static void method236() {
        field3510.method3242();
    }

    @ObfuscatedName("co.s(ZI)V")
    public static void method1608(boolean arg0) {
        if (Statics.field3542 != arg0) {
            field3508.method3242();
            field3509.method3242();
            field3510.method3242();
            Statics.field3542 = arg0;
        }
    }
}
