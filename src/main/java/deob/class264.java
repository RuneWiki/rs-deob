package deob;

@ObfuscatedName("jj")
public class class264 extends class202 {

    @ObfuscatedName("jj.n")
    public static class197 field3544 = new class197(64);

    @ObfuscatedName("jj.d")
    public static class197 field3576 = new class197(50);

    @ObfuscatedName("jj.o")
    public static class197 field3546 = new class197(200);

    @ObfuscatedName("jj.q")
    public int field3591;

    @ObfuscatedName("jj.j")
    public int field3548;

    @ObfuscatedName("jj.m")
    public String field3547 = "null";

    @ObfuscatedName("jj.h")
    public short[] field3550;

    @ObfuscatedName("jj.c")
    public short[] field3555;

    @ObfuscatedName("jj.y")
    public short[] field3537;

    @ObfuscatedName("jj.p")
    public short[] field3553;

    @ObfuscatedName("jj.i")
    public int field3554 = 2000;

    @ObfuscatedName("jj.l")
    public int field3582 = 0;

    @ObfuscatedName("jj.z")
    public int field3552 = 0;

    @ObfuscatedName("jj.e")
    public int field3557 = 0;

    @ObfuscatedName("jj.v")
    public int field3558 = 0;

    @ObfuscatedName("jj.w")
    public int field3571 = 0;

    @ObfuscatedName("jj.av")
    public int field3560 = 0;

    @ObfuscatedName("jj.au")
    public int field3564 = 1;

    @ObfuscatedName("jj.ae")
    public boolean field3562 = false;

    @ObfuscatedName("jj.ak")
    public String[] field3563 = new String[] { null, null, class233.field2918, null, null };

    @ObfuscatedName("jj.aq")
    public String[] field3570 = new String[] { null, null, null, null, class233.field3108 };

    @ObfuscatedName("jj.am")
    public int field3566 = -2;

    @ObfuscatedName("jj.ar")
    public int field3545 = -1;

    @ObfuscatedName("jj.ao")
    public int field3568 = -1;

    @ObfuscatedName("jj.at")
    public int field3569 = 0;

    @ObfuscatedName("jj.ac")
    public int field3556 = -1;

    @ObfuscatedName("jj.as")
    public int field3561 = -1;

    @ObfuscatedName("jj.ah")
    public int field3572 = 0;

    @ObfuscatedName("jj.aw")
    public int field3573 = -1;

    @ObfuscatedName("jj.al")
    public int field3574 = -1;

    @ObfuscatedName("jj.aj")
    public int field3575 = -1;

    @ObfuscatedName("jj.ap")
    public int field3579 = -1;

    @ObfuscatedName("jj.ag")
    public int field3577 = -1;

    @ObfuscatedName("jj.af")
    public int field3551 = -1;

    @ObfuscatedName("jj.ay")
    public int[] field3589;

    @ObfuscatedName("jj.ab")
    public int[] field3580;

    @ObfuscatedName("jj.ax")
    public int field3542 = -1;

    @ObfuscatedName("jj.ai")
    public int field3581 = -1;

    @ObfuscatedName("jj.az")
    public int field3583 = 128;

    @ObfuscatedName("jj.aa")
    public int field3584 = 128;

    @ObfuscatedName("jj.ad")
    public int field3585 = 128;

    @ObfuscatedName("jj.ba")
    public int field3586 = 0;

    @ObfuscatedName("jj.bi")
    public int field3587 = 0;

    @ObfuscatedName("jj.bq")
    public int field3588 = 0;

    @ObfuscatedName("jj.bc")
    public class194 field3594;

    @ObfuscatedName("jj.bb")
    public boolean field3590 = false;

    @ObfuscatedName("jj.bl")
    public int field3567 = -1;

    @ObfuscatedName("jj.bt")
    public int field3592 = -1;

    @ObfuscatedName("jj.be")
    public int field3593 = -1;

    @ObfuscatedName("jj.by")
    public int field3559 = -1;

    @ObfuscatedName("fi.b(Lij;Lij;ZLjn;I)V")
    public static void method2852(class243 arg0, class243 arg1, boolean arg2, class271 arg3) {
        Statics.field3549 = arg0;
        Statics.field3428 = arg1;
        Statics.field3543 = arg2;
        Statics.field3448 = Statics.field3549.method3883(10);
        Statics.field2487 = arg3;
    }

    @ObfuscatedName("ea.s(II)Ljj;")
    public static class264 method2662(int arg0) {
        class264 var1 = (class264) field3544.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3549.method3887(10, arg0);
        class264 var3 = new class264();
        var3.field3591 = arg0;
        if (var2 != null) {
            var3.method4317(new class181(var2));
        }
        var3.method4306();
        if (var3.field3581 != -1) {
            var3.method4269(method2662(var3.field3581), method2662(var3.field3542));
        }
        if (var3.field3592 != -1) {
            var3.method4270(method2662(var3.field3592), method2662(var3.field3567));
        }
        if (var3.field3559 != -1) {
            var3.method4271(method2662(var3.field3559), method2662(var3.field3593));
        }
        if (!Statics.field3543 && var3.field3562) {
            var3.field3547 = class233.field3021;
            var3.field3590 = false;
            var3.field3563 = null;
            var3.field3570 = null;
            var3.field3566 = -1;
            var3.field3588 = 0;
            if (var3.field3594 != null) {
                boolean var4 = false;
                for (class200 var5 = var3.field3594.method3303(); var5 != null; var5 = var3.field3594.method3304()) {
                    class259 var6 = class259.method3957((int) var5.field2557);
                    if (var6.field3440) {
                        var5.method3392();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3594 = null;
                }
            }
        }
        field3544.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.r(B)V")
    public void method4306() {
    }

    @ObfuscatedName("jj.g(Lfs;I)V")
    public void method4317(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method4325(arg0, var2);
        }
    }

    @ObfuscatedName("jj.x(Lfs;II)V")
    public void method4325(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3548 = arg0.method3081();
        } else if (arg1 == 2) {
            this.field3547 = arg0.method2953();
        } else if (arg1 == 4) {
            this.field3554 = arg0.method3081();
        } else if (arg1 == 5) {
            this.field3582 = arg0.method3081();
        } else if (arg1 == 6) {
            this.field3552 = arg0.method3081();
        } else if (arg1 == 7) {
            this.field3558 = arg0.method3081();
            if (this.field3558 > 32767) {
                this.field3558 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3571 = arg0.method3081();
            if (this.field3571 > 32767) {
                this.field3571 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3560 = 1;
        } else if (arg1 == 12) {
            this.field3564 = arg0.method2996();
        } else if (arg1 == 16) {
            this.field3562 = true;
        } else if (arg1 == 23) {
            this.field3545 = arg0.method3081();
            this.field3569 = arg0.method2945();
        } else if (arg1 == 24) {
            this.field3568 = arg0.method3081();
        } else if (arg1 == 25) {
            this.field3556 = arg0.method3081();
            this.field3572 = arg0.method2945();
        } else if (arg1 == 26) {
            this.field3561 = arg0.method3081();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3563[arg1 - 30] = arg0.method2953();
            if (this.field3563[arg1 - 30].equalsIgnoreCase(class233.field2920)) {
                this.field3563[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3570[arg1 - 35] = arg0.method2953();
        } else if (arg1 == 40) {
            int var3 = arg0.method2945();
            this.field3550 = new short[var3];
            this.field3555 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3550[var4] = (short) arg0.method3081();
                this.field3555[var4] = (short) arg0.method3081();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2945();
            this.field3537 = new short[var5];
            this.field3553 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3537[var6] = (short) arg0.method3081();
                this.field3553[var6] = (short) arg0.method3081();
            }
        } else if (arg1 == 42) {
            this.field3566 = arg0.method2946();
        } else if (arg1 == 65) {
            this.field3590 = true;
        } else if (arg1 == 78) {
            this.field3573 = arg0.method3081();
        } else if (arg1 == 79) {
            this.field3574 = arg0.method3081();
        } else if (arg1 == 90) {
            this.field3575 = arg0.method3081();
        } else if (arg1 == 91) {
            this.field3577 = arg0.method3081();
        } else if (arg1 == 92) {
            this.field3579 = arg0.method3081();
        } else if (arg1 == 93) {
            this.field3551 = arg0.method3081();
        } else if (arg1 == 95) {
            this.field3557 = arg0.method3081();
        } else if (arg1 == 97) {
            this.field3542 = arg0.method3081();
        } else if (arg1 == 98) {
            this.field3581 = arg0.method3081();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3589 == null) {
                this.field3589 = new int[10];
                this.field3580 = new int[10];
            }
            this.field3589[arg1 - 100] = arg0.method3081();
            this.field3580[arg1 - 100] = arg0.method3081();
        } else if (arg1 == 110) {
            this.field3583 = arg0.method3081();
        } else if (arg1 == 111) {
            this.field3584 = arg0.method3081();
        } else if (arg1 == 112) {
            this.field3585 = arg0.method3081();
        } else if (arg1 == 113) {
            this.field3586 = arg0.method2946();
        } else if (arg1 == 114) {
            this.field3587 = arg0.method2946() * 5;
        } else if (arg1 == 115) {
            this.field3588 = arg0.method2945();
        } else if (arg1 == 139) {
            this.field3567 = arg0.method3081();
        } else if (arg1 == 140) {
            this.field3592 = arg0.method3081();
        } else if (arg1 == 148) {
            this.field3593 = arg0.method3081();
        } else if (arg1 == 149) {
            this.field3559 = arg0.method3081();
        } else if (arg1 == 249) {
            this.field3594 = class257.method194(arg0, this.field3594);
        }
    }

    @ObfuscatedName("jj.f(Ljj;Ljj;I)V")
    public void method4269(class264 arg0, class264 arg1) {
        this.field3548 = arg0.field3548;
        this.field3554 = arg0.field3554;
        this.field3582 = arg0.field3582;
        this.field3552 = arg0.field3552;
        this.field3557 = arg0.field3557;
        this.field3558 = arg0.field3558;
        this.field3571 = arg0.field3571;
        this.field3550 = arg0.field3550;
        this.field3555 = arg0.field3555;
        this.field3537 = arg0.field3537;
        this.field3553 = arg0.field3553;
        this.field3547 = arg1.field3547;
        this.field3562 = arg1.field3562;
        this.field3564 = arg1.field3564;
        this.field3560 = 1;
    }

    @ObfuscatedName("jj.u(Ljj;Ljj;I)V")
    public void method4270(class264 arg0, class264 arg1) {
        this.field3548 = arg0.field3548;
        this.field3554 = arg0.field3554;
        this.field3582 = arg0.field3582;
        this.field3552 = arg0.field3552;
        this.field3557 = arg0.field3557;
        this.field3558 = arg0.field3558;
        this.field3571 = arg0.field3571;
        this.field3550 = arg1.field3550;
        this.field3555 = arg1.field3555;
        this.field3537 = arg1.field3537;
        this.field3553 = arg1.field3553;
        this.field3547 = arg1.field3547;
        this.field3562 = arg1.field3562;
        this.field3560 = arg1.field3560;
        this.field3545 = arg1.field3545;
        this.field3568 = arg1.field3568;
        this.field3573 = arg1.field3573;
        this.field3556 = arg1.field3556;
        this.field3561 = arg1.field3561;
        this.field3574 = arg1.field3574;
        this.field3575 = arg1.field3575;
        this.field3579 = arg1.field3579;
        this.field3577 = arg1.field3577;
        this.field3551 = arg1.field3551;
        this.field3588 = arg1.field3588;
        this.field3563 = arg1.field3563;
        this.field3570 = new String[5];
        if (arg1.field3570 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3570[var3] = arg1.field3570[var3];
            }
        }
        this.field3570[4] = class233.field2924;
        this.field3564 = 0;
    }

    @ObfuscatedName("jj.t(Ljj;Ljj;B)V")
    public void method4271(class264 arg0, class264 arg1) {
        this.field3548 = arg0.field3548;
        this.field3554 = arg0.field3554;
        this.field3582 = arg0.field3582;
        this.field3552 = arg0.field3552;
        this.field3557 = arg0.field3557;
        this.field3558 = arg0.field3558;
        this.field3571 = arg0.field3571;
        this.field3550 = arg0.field3550;
        this.field3555 = arg0.field3555;
        this.field3537 = arg0.field3537;
        this.field3553 = arg0.field3553;
        this.field3560 = arg0.field3560;
        this.field3547 = arg1.field3547;
        this.field3564 = 0;
        this.field3562 = false;
        this.field3590 = false;
    }

    @ObfuscatedName("jj.k(II)Lda;")
    public final class127 method4272(int arg0) {
        if (this.field3589 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3580[var3] && this.field3580[var3] != 0) {
                    var2 = this.field3589[var3];
                }
            }
            if (var2 != -1) {
                return method2662(var2).method4272(1);
            }
        }
        class127 var4 = class127.method2220(Statics.field3428, this.field3548, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3583 != 128 || this.field3584 != 128 || this.field3585 != 128) {
            var4.method2243(this.field3583, this.field3584, this.field3585);
        }
        if (this.field3550 != null) {
            for (int var5 = 0; var5 < this.field3550.length; var5++) {
                var4.method2232(this.field3550[var5], this.field3555[var5]);
            }
        }
        if (this.field3537 != null) {
            for (int var6 = 0; var6 < this.field3537.length; var6++) {
                var4.method2233(this.field3537[var6], this.field3553[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jj.n(II)Lev;")
    public final class133 method4265(int arg0) {
        if (this.field3589 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3580[var3] && this.field3580[var3] != 0) {
                    var2 = this.field3589[var3];
                }
            }
            if (var2 != -1) {
                return method2662(var2).method4265(1);
            }
        }
        class133 var4 = (class133) field3576.method3330((long) this.field3591);
        if (var4 != null) {
            return var4;
        }
        class127 var5 = class127.method2220(Statics.field3428, this.field3548, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3583 != 128 || this.field3584 != 128 || this.field3585 != 128) {
            var5.method2243(this.field3583, this.field3584, this.field3585);
        }
        if (this.field3550 != null) {
            for (int var6 = 0; var6 < this.field3550.length; var6++) {
                var5.method2232(this.field3550[var6], this.field3555[var6]);
            }
        }
        if (this.field3537 != null) {
            for (int var7 = 0; var7 < this.field3537.length; var7++) {
                var5.method2233(this.field3537[var7], this.field3553[var7]);
            }
        }
        class133 var8 = var5.method2240(this.field3586 + 64, this.field3587 + 768, -50, -10, -50);
        var8.field1832 = true;
        field3576.method3332(var8, (long) this.field3591);
        return var8;
    }

    @ObfuscatedName("jj.d(II)Ljj;")
    public class264 method4294(int arg0) {
        if (this.field3589 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3580[var3] && this.field3580[var3] != 0) {
                    var2 = this.field3589[var3];
                }
            }
            if (var2 != -1) {
                return method2662(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cn.o(IIIIIZI)Lkb;")
    public static final class295 method1556(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class295 var8 = (class295) field3546.method3330(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class264 var9 = method2662(arg0);
        if (arg1 > 1 && var9.field3589 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3580[var11] && var9.field3580[var11] != 0) {
                    var10 = var9.field3589[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2662(var10);
            }
        }
        class133 var12 = var9.method4265(1);
        if (var12 == null) {
            return null;
        }
        class295 var13 = null;
        if (var9.field3581 != -1) {
            var13 = method1556(var9.field3542, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3592 != -1) {
            var13 = method1556(var9.field3567, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3559 != -1) {
            var13 = method1556(var9.field3593, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3812;
        int var15 = Statics.field3807;
        int var16 = Statics.field3811;
        int[] var17 = new int[4];
        class291.method4665(var17);
        class295 var18 = new class295(36, 32);
        class291.method4661(var18.field3842, 36, 32);
        class291.method4667();
        class136.method2402();
        class136.method2450(16, 16);
        class136.field1919 = false;
        if (var9.field3559 != -1) {
            var13.method4793(0, 0);
        }
        int var19 = var9.field3554;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class136.field1939[var9.field3582] * var19 >> 16;
        int var21 = class136.field1942[var9.field3582] * var19 >> 16;
        var12.method2312();
        var12.method2325(0, var9.field3552, var9.field3557, var9.field3582, var9.field3558, var9.field3571 + var12.field2023 / 2 + var20, var9.field3571 + var21);
        if (var9.field3592 != -1) {
            var13.method4793(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4791(1);
        }
        if (arg2 >= 2) {
            var18.method4791(16777215);
        }
        if (arg3 != 0) {
            var18.method4862(arg3);
        }
        class291.method4661(var18.field3842, 36, 32);
        if (var9.field3581 != -1) {
            var13.method4793(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3560 == 1) {
            class271 var22 = Statics.field2487;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class233.field3081 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class233.field3079 + "</col>";
            }
            var22.method4464(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3546.method3332(var18, var6);
        }
        class291.method4661(var14, var15, var16);
        class291.method4679(var17);
        class136.method2402();
        class136.field1919 = true;
        return var18;
    }

    @ObfuscatedName("jj.a(ZI)Z")
    public final boolean method4304(boolean arg0) {
        int var2 = this.field3545;
        int var3 = this.field3568;
        int var4 = this.field3573;
        if (arg0) {
            var2 = this.field3556;
            var3 = this.field3561;
            var4 = this.field3574;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3428.method3866(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3428.method3866(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3428.method3866(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jj.q(ZI)Lda;")
    public final class127 method4276(boolean arg0) {
        int var2 = this.field3545;
        int var3 = this.field3568;
        int var4 = this.field3573;
        if (arg0) {
            var2 = this.field3556;
            var3 = this.field3561;
            var4 = this.field3574;
        }
        if (var2 == -1) {
            return null;
        }
        class127 var5 = class127.method2220(Statics.field3428, var2, 0);
        if (var3 != -1) {
            class127 var6 = class127.method2220(Statics.field3428, var3, 0);
            if (var4 == -1) {
                class127[] var9 = new class127[] { var5, var6 };
                var5 = new class127(var9, 2);
            } else {
                class127 var7 = class127.method2220(Statics.field3428, var4, 0);
                class127[] var8 = new class127[] { var5, var6, var7 };
                var5 = new class127(var8, 3);
            }
        }
        if (!arg0 && this.field3569 != 0) {
            var5.method2259(0, this.field3569, 0);
        }
        if (arg0 && this.field3572 != 0) {
            var5.method2259(0, this.field3572, 0);
        }
        if (this.field3550 != null) {
            for (int var10 = 0; var10 < this.field3550.length; var10++) {
                var5.method2232(this.field3550[var10], this.field3555[var10]);
            }
        }
        if (this.field3537 != null) {
            for (int var11 = 0; var11 < this.field3537.length; var11++) {
                var5.method2233(this.field3537[var11], this.field3553[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jj.j(ZI)Z")
    public final boolean method4277(boolean arg0) {
        int var2 = this.field3575;
        int var3 = this.field3579;
        if (arg0) {
            var2 = this.field3577;
            var3 = this.field3551;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3428.method3866(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3428.method3866(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jj.c(ZI)Lda;")
    public final class127 method4278(boolean arg0) {
        int var2 = this.field3575;
        int var3 = this.field3579;
        if (arg0) {
            var2 = this.field3577;
            var3 = this.field3551;
        }
        if (var2 == -1) {
            return null;
        }
        class127 var4 = class127.method2220(Statics.field3428, var2, 0);
        if (var3 != -1) {
            class127 var5 = class127.method2220(Statics.field3428, var3, 0);
            class127[] var6 = new class127[] { var4, var5 };
            var4 = new class127(var6, 2);
        }
        if (this.field3550 != null) {
            for (int var7 = 0; var7 < this.field3550.length; var7++) {
                var4.method2232(this.field3550[var7], this.field3555[var7]);
            }
        }
        if (this.field3537 != null) {
            for (int var8 = 0; var8 < this.field3537.length; var8++) {
                var4.method2233(this.field3537[var8], this.field3553[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jj.i(III)I")
    public int method4307(int arg0, int arg1) {
        return class257.method4097(this.field3594, arg0, arg1);
    }

    @ObfuscatedName("jj.l(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4274(int arg0, String arg1) {
        return class257.method1712(this.field3594, arg0, arg1);
    }

    @ObfuscatedName("jj.z(I)I")
    public int method4281() {
        if (this.field3566 == -1 || this.field3570 == null) {
            return -1;
        } else if (this.field3566 >= 0) {
            return this.field3570[this.field3566] == null ? -1 : this.field3566;
        } else if (class233.field3108.equalsIgnoreCase(this.field3570[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ff.e(B)V")
    public static void method2925() {
        field3546.method3333();
    }
}
