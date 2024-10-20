package deob;

@ObfuscatedName("jb")
public class class264 extends class202 {

    @ObfuscatedName("jb.r")
    public static class197 field3572 = new class197(64);

    @ObfuscatedName("jb.l")
    public static class197 field3556 = new class197(50);

    @ObfuscatedName("jb.u")
    public static class197 field3601 = new class197(200);

    @ObfuscatedName("jb.c")
    public int field3554;

    @ObfuscatedName("jb.y")
    public int field3569;

    @ObfuscatedName("jb.j")
    public String field3562 = "null";

    @ObfuscatedName("jb.f")
    public short[] field3565;

    @ObfuscatedName("jb.s")
    public short[] field3564;

    @ObfuscatedName("jb.e")
    public short[] field3551;

    @ObfuscatedName("jb.q")
    public short[] field3566;

    @ObfuscatedName("jb.h")
    public int field3557 = 2000;

    @ObfuscatedName("jb.i")
    public int field3568 = 0;

    @ObfuscatedName("jb.o")
    public int field3584 = 0;

    @ObfuscatedName("jb.w")
    public int field3570 = 0;

    @ObfuscatedName("jb.g")
    public int field3571 = 0;

    @ObfuscatedName("jb.a")
    public int field3567 = 0;

    @ObfuscatedName("jb.ah")
    public int field3573 = 0;

    @ObfuscatedName("jb.ak")
    public int field3574 = 1;

    @ObfuscatedName("jb.aa")
    public boolean field3575 = false;

    @ObfuscatedName("jb.ax")
    public String[] field3576 = new String[] { null, null, class233.field3097, null, null };

    @ObfuscatedName("jb.aq")
    public String[] field3577 = new String[] { null, null, null, null, class233.field3026 };

    @ObfuscatedName("jb.al")
    public int field3578 = -2;

    @ObfuscatedName("jb.ae")
    public int field3579 = -1;

    @ObfuscatedName("jb.aj")
    public int field3580 = -1;

    @ObfuscatedName("jb.as")
    public int field3581 = 0;

    @ObfuscatedName("jb.am")
    public int field3582 = -1;

    @ObfuscatedName("jb.ag")
    public int field3583 = -1;

    @ObfuscatedName("jb.aw")
    public int field3561 = 0;

    @ObfuscatedName("jb.ap")
    public int field3585 = -1;

    @ObfuscatedName("jb.ad")
    public int field3586 = -1;

    @ObfuscatedName("jb.an")
    public int field3587 = -1;

    @ObfuscatedName("jb.ai")
    public int field3588 = -1;

    @ObfuscatedName("jb.ay")
    public int field3589 = -1;

    @ObfuscatedName("jb.ar")
    public int field3590 = -1;

    @ObfuscatedName("jb.ac")
    public int[] field3591;

    @ObfuscatedName("jb.af")
    public int[] field3592;

    @ObfuscatedName("jb.ao")
    public int field3596 = -1;

    @ObfuscatedName("jb.av")
    public int field3594 = -1;

    @ObfuscatedName("jb.ab")
    public int field3593 = 128;

    @ObfuscatedName("jb.az")
    public int field3559 = 128;

    @ObfuscatedName("jb.at")
    public int field3597 = 128;

    @ObfuscatedName("jb.bj")
    public int field3604 = 0;

    @ObfuscatedName("jb.bq")
    public int field3599 = 0;

    @ObfuscatedName("jb.bo")
    public int field3602 = 0;

    @ObfuscatedName("jb.bk")
    public class194 field3598;

    @ObfuscatedName("jb.bv")
    public boolean field3595 = false;

    @ObfuscatedName("jb.ba")
    public int field3603 = -1;

    @ObfuscatedName("jb.bs")
    public int field3600 = -1;

    @ObfuscatedName("jb.bg")
    public int field3558 = -1;

    @ObfuscatedName("jb.bn")
    public int field3606 = -1;

    @ObfuscatedName("aw.d(II)Ljb;")
    public static class264 method482(int arg0) {
        class264 var1 = (class264) field3572.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3555.method3935(10, arg0);
        class264 var3 = new class264();
        var3.field3554 = arg0;
        if (var2 != null) {
            var3.method4406(new class181(var2));
        }
        var3.method4444();
        if (var3.field3594 != -1) {
            var3.method4408(method482(var3.field3594), method482(var3.field3596));
        }
        if (var3.field3600 != -1) {
            var3.method4468(method482(var3.field3600), method482(var3.field3603));
        }
        if (var3.field3606 != -1) {
            var3.method4410(method482(var3.field3606), method482(var3.field3558));
        }
        if (!Statics.field827 && var3.field3575) {
            var3.field3562 = class233.field3083;
            var3.field3595 = false;
            var3.field3576 = null;
            var3.field3577 = null;
            var3.field3578 = -1;
            var3.field3602 = 0;
            if (var3.field3598 != null) {
                boolean var4 = false;
                for (class200 var5 = var3.field3598.method3394(); var5 != null; var5 = var3.field3598.method3395()) {
                    class259 var6 = class259.method1094((int) var5.field2564);
                    if (var6.field3460) {
                        var5.method3475();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3598 = null;
                }
            }
        }
        field3572.method3417(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jb.x(I)V")
    public void method4444() {
    }

    @ObfuscatedName("jb.k(Lfr;I)V")
    public void method4406(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4407(arg0, var2);
        }
    }

    @ObfuscatedName("jb.z(Lfr;IB)V")
    public void method4407(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3569 = arg0.method3179();
        } else if (arg1 == 2) {
            this.field3562 = arg0.method3045();
        } else if (arg1 == 4) {
            this.field3557 = arg0.method3179();
        } else if (arg1 == 5) {
            this.field3568 = arg0.method3179();
        } else if (arg1 == 6) {
            this.field3584 = arg0.method3179();
        } else if (arg1 == 7) {
            this.field3571 = arg0.method3179();
            if (this.field3571 > 32767) {
                this.field3571 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3567 = arg0.method3179();
            if (this.field3567 > 32767) {
                this.field3567 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3573 = 1;
        } else if (arg1 == 12) {
            this.field3574 = arg0.method3041();
        } else if (arg1 == 16) {
            this.field3575 = true;
        } else if (arg1 == 23) {
            this.field3579 = arg0.method3179();
            this.field3581 = arg0.method3204();
        } else if (arg1 == 24) {
            this.field3580 = arg0.method3179();
        } else if (arg1 == 25) {
            this.field3582 = arg0.method3179();
            this.field3561 = arg0.method3204();
        } else if (arg1 == 26) {
            this.field3583 = arg0.method3179();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3576[arg1 - 30] = arg0.method3045();
            if (this.field3576[arg1 - 30].equalsIgnoreCase(class233.field2934)) {
                this.field3576[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3577[arg1 - 35] = arg0.method3045();
        } else if (arg1 == 40) {
            int var3 = arg0.method3204();
            this.field3565 = new short[var3];
            this.field3564 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3565[var4] = (short) arg0.method3179();
                this.field3564[var4] = (short) arg0.method3179();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3204();
            this.field3551 = new short[var5];
            this.field3566 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3551[var6] = (short) arg0.method3179();
                this.field3566[var6] = (short) arg0.method3179();
            }
        } else if (arg1 == 42) {
            this.field3578 = arg0.method3236();
        } else if (arg1 == 65) {
            this.field3595 = true;
        } else if (arg1 == 78) {
            this.field3585 = arg0.method3179();
        } else if (arg1 == 79) {
            this.field3586 = arg0.method3179();
        } else if (arg1 == 90) {
            this.field3587 = arg0.method3179();
        } else if (arg1 == 91) {
            this.field3589 = arg0.method3179();
        } else if (arg1 == 92) {
            this.field3588 = arg0.method3179();
        } else if (arg1 == 93) {
            this.field3590 = arg0.method3179();
        } else if (arg1 == 95) {
            this.field3570 = arg0.method3179();
        } else if (arg1 == 97) {
            this.field3596 = arg0.method3179();
        } else if (arg1 == 98) {
            this.field3594 = arg0.method3179();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3591 == null) {
                this.field3591 = new int[10];
                this.field3592 = new int[10];
            }
            this.field3591[arg1 - 100] = arg0.method3179();
            this.field3592[arg1 - 100] = arg0.method3179();
        } else if (arg1 == 110) {
            this.field3593 = arg0.method3179();
        } else if (arg1 == 111) {
            this.field3559 = arg0.method3179();
        } else if (arg1 == 112) {
            this.field3597 = arg0.method3179();
        } else if (arg1 == 113) {
            this.field3604 = arg0.method3236();
        } else if (arg1 == 114) {
            this.field3599 = arg0.method3236();
        } else if (arg1 == 115) {
            this.field3602 = arg0.method3204();
        } else if (arg1 == 139) {
            this.field3603 = arg0.method3179();
        } else if (arg1 == 140) {
            this.field3600 = arg0.method3179();
        } else if (arg1 == 148) {
            this.field3558 = arg0.method3179();
        } else if (arg1 == 149) {
            this.field3606 = arg0.method3179();
        } else if (arg1 == 249) {
            this.field3598 = class257.method2237(arg0, this.field3598);
        }
    }

    @ObfuscatedName("jb.v(Ljb;Ljb;I)V")
    public void method4408(class264 arg0, class264 arg1) {
        this.field3569 = arg0.field3569;
        this.field3557 = arg0.field3557;
        this.field3568 = arg0.field3568;
        this.field3584 = arg0.field3584;
        this.field3570 = arg0.field3570;
        this.field3571 = arg0.field3571;
        this.field3567 = arg0.field3567;
        this.field3565 = arg0.field3565;
        this.field3564 = arg0.field3564;
        this.field3551 = arg0.field3551;
        this.field3566 = arg0.field3566;
        this.field3562 = arg1.field3562;
        this.field3575 = arg1.field3575;
        this.field3574 = arg1.field3574;
        this.field3573 = 1;
    }

    @ObfuscatedName("jb.m(Ljb;Ljb;B)V")
    public void method4468(class264 arg0, class264 arg1) {
        this.field3569 = arg0.field3569;
        this.field3557 = arg0.field3557;
        this.field3568 = arg0.field3568;
        this.field3584 = arg0.field3584;
        this.field3570 = arg0.field3570;
        this.field3571 = arg0.field3571;
        this.field3567 = arg0.field3567;
        this.field3565 = arg1.field3565;
        this.field3564 = arg1.field3564;
        this.field3551 = arg1.field3551;
        this.field3566 = arg1.field3566;
        this.field3562 = arg1.field3562;
        this.field3575 = arg1.field3575;
        this.field3573 = arg1.field3573;
        this.field3579 = arg1.field3579;
        this.field3580 = arg1.field3580;
        this.field3585 = arg1.field3585;
        this.field3582 = arg1.field3582;
        this.field3583 = arg1.field3583;
        this.field3586 = arg1.field3586;
        this.field3587 = arg1.field3587;
        this.field3588 = arg1.field3588;
        this.field3589 = arg1.field3589;
        this.field3590 = arg1.field3590;
        this.field3602 = arg1.field3602;
        this.field3576 = arg1.field3576;
        this.field3577 = new String[5];
        if (arg1.field3577 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3577[var3] = arg1.field3577[var3];
            }
        }
        this.field3577[4] = class233.field3032;
        this.field3574 = 0;
    }

    @ObfuscatedName("jb.b(Ljb;Ljb;I)V")
    public void method4410(class264 arg0, class264 arg1) {
        this.field3569 = arg0.field3569;
        this.field3557 = arg0.field3557;
        this.field3568 = arg0.field3568;
        this.field3584 = arg0.field3584;
        this.field3570 = arg0.field3570;
        this.field3571 = arg0.field3571;
        this.field3567 = arg0.field3567;
        this.field3565 = arg0.field3565;
        this.field3564 = arg0.field3564;
        this.field3551 = arg0.field3551;
        this.field3566 = arg0.field3566;
        this.field3573 = arg0.field3573;
        this.field3562 = arg1.field3562;
        this.field3574 = 0;
        this.field3575 = false;
        this.field3595 = false;
    }

    @ObfuscatedName("jb.t(II)Ldr;")
    public final class127 method4411(int arg0) {
        if (this.field3591 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3592[var3] && this.field3592[var3] != 0) {
                    var2 = this.field3591[var3];
                }
            }
            if (var2 != -1) {
                return method482(var2).method4411(1);
            }
        }
        class127 var4 = class127.method2294(Statics.field2859, this.field3569, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3593 != 128 || this.field3559 != 128 || this.field3597 != 128) {
            var4.method2317(this.field3593, this.field3559, this.field3597);
        }
        if (this.field3565 != null) {
            for (int var5 = 0; var5 < this.field3565.length; var5++) {
                var4.method2306(this.field3565[var5], this.field3564[var5]);
            }
        }
        if (this.field3551 != null) {
            for (int var6 = 0; var6 < this.field3551.length; var6++) {
                var4.method2307(this.field3551[var6], this.field3566[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jb.p(IB)Leh;")
    public final class133 method4438(int arg0) {
        if (this.field3591 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3592[var3] && this.field3592[var3] != 0) {
                    var2 = this.field3591[var3];
                }
            }
            if (var2 != -1) {
                return method482(var2).method4438(1);
            }
        }
        class133 var4 = (class133) field3556.method3418((long) this.field3554);
        if (var4 != null) {
            return var4;
        }
        class127 var5 = class127.method2294(Statics.field2859, this.field3569, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3593 != 128 || this.field3559 != 128 || this.field3597 != 128) {
            var5.method2317(this.field3593, this.field3559, this.field3597);
        }
        if (this.field3565 != null) {
            for (int var6 = 0; var6 < this.field3565.length; var6++) {
                var5.method2306(this.field3565[var6], this.field3564[var6]);
            }
        }
        if (this.field3551 != null) {
            for (int var7 = 0; var7 < this.field3551.length; var7++) {
                var5.method2307(this.field3551[var7], this.field3566[var7]);
            }
        }
        class133 var8 = var5.method2314(this.field3604 + 64, this.field3599 * 5 + 768, -50, -10, -50);
        var8.field1856 = true;
        field3556.method3417(var8, (long) this.field3554);
        return var8;
    }

    @ObfuscatedName("jb.r(II)Ljb;")
    public class264 method4413(int arg0) {
        if (this.field3591 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3592[var3] && this.field3592[var3] != 0) {
                    var2 = this.field3591[var3];
                }
            }
            if (var2 != -1) {
                return method482(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("j.l(IIIIIZI)Lky;")
    public static final class295 method89(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class295 var8 = (class295) field3601.method3418(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class264 var9 = method482(arg0);
        if (arg1 > 1 && var9.field3591 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3592[var11] && var9.field3592[var11] != 0) {
                    var10 = var9.field3591[var11];
                }
            }
            if (var10 != -1) {
                var9 = method482(var10);
            }
        }
        class133 var12 = var9.method4438(1);
        if (var12 == null) {
            return null;
        }
        class295 var13 = null;
        if (var9.field3594 != -1) {
            var13 = method89(var9.field3596, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3600 != -1) {
            var13 = method89(var9.field3603, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3606 != -1) {
            var13 = method89(var9.field3558, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3809;
        int var15 = Statics.field3808;
        int var16 = Statics.field3810;
        int[] var17 = new int[4];
        class291.method4809(var17);
        class295 var18 = new class295(36, 32);
        class291.method4781(var18.field3841, 36, 32);
        class291.method4787();
        class136.method2523();
        class136.method2508(16, 16);
        class136.field1921 = false;
        if (var9.field3606 != -1) {
            var13.method4903(0, 0);
        }
        int var19 = var9.field3557;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class136.field1943[var9.field3568] * var19 >> 16;
        int var21 = class136.field1940[var9.field3568] * var19 >> 16;
        var12.method2407();
        var12.method2436(0, var9.field3584, var9.field3570, var9.field3568, var9.field3571, var9.field3567 + var12.field2024 / 2 + var20, var9.field3567 + var21);
        if (var9.field3600 != -1) {
            var13.method4903(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4899(1);
        }
        if (arg2 >= 2) {
            var18.method4899(16777215);
        }
        if (arg3 != 0) {
            var18.method4902(arg3);
        }
        class291.method4781(var18.field3841, 36, 32);
        if (var9.field3594 != -1) {
            var13.method4903(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3573 == 1) {
            Statics.field1377.method4584(method2780(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3601.method3417(var18, var6);
        }
        class291.method4781(var14, var15, var16);
        class291.method4786(var17);
        class136.method2523();
        class136.field1921 = true;
        return var18;
    }

    @ObfuscatedName("ek.u(IB)Ljava/lang/String;")
    public static final String method2780(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class233.field3095 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class233.field3159 + "</col>";
        }
    }

    @ObfuscatedName("jb.c(ZI)Z")
    public final boolean method4414(boolean arg0) {
        int var2 = this.field3579;
        int var3 = this.field3580;
        int var4 = this.field3585;
        if (arg0) {
            var2 = this.field3582;
            var3 = this.field3583;
            var4 = this.field3586;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2859.method3992(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2859.method3992(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2859.method3992(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jb.j(ZB)Ldr;")
    public final class127 method4415(boolean arg0) {
        int var2 = this.field3579;
        int var3 = this.field3580;
        int var4 = this.field3585;
        if (arg0) {
            var2 = this.field3582;
            var3 = this.field3583;
            var4 = this.field3586;
        }
        if (var2 == -1) {
            return null;
        }
        class127 var5 = class127.method2294(Statics.field2859, var2, 0);
        if (var3 != -1) {
            class127 var6 = class127.method2294(Statics.field2859, var3, 0);
            if (var4 == -1) {
                class127[] var9 = new class127[] { var5, var6 };
                var5 = new class127(var9, 2);
            } else {
                class127 var7 = class127.method2294(Statics.field2859, var4, 0);
                class127[] var8 = new class127[] { var5, var6, var7 };
                var5 = new class127(var8, 3);
            }
        }
        if (!arg0 && this.field3581 != 0) {
            var5.method2305(0, this.field3581, 0);
        }
        if (arg0 && this.field3561 != 0) {
            var5.method2305(0, this.field3561, 0);
        }
        if (this.field3565 != null) {
            for (int var10 = 0; var10 < this.field3565.length; var10++) {
                var5.method2306(this.field3565[var10], this.field3564[var10]);
            }
        }
        if (this.field3551 != null) {
            for (int var11 = 0; var11 < this.field3551.length; var11++) {
                var5.method2307(this.field3551[var11], this.field3566[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jb.f(ZI)Z")
    public final boolean method4416(boolean arg0) {
        int var2 = this.field3587;
        int var3 = this.field3588;
        if (arg0) {
            var2 = this.field3589;
            var3 = this.field3590;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2859.method3992(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2859.method3992(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jb.s(ZI)Ldr;")
    public final class127 method4417(boolean arg0) {
        int var2 = this.field3587;
        int var3 = this.field3588;
        if (arg0) {
            var2 = this.field3589;
            var3 = this.field3590;
        }
        if (var2 == -1) {
            return null;
        }
        class127 var4 = class127.method2294(Statics.field2859, var2, 0);
        if (var3 != -1) {
            class127 var5 = class127.method2294(Statics.field2859, var3, 0);
            class127[] var6 = new class127[] { var4, var5 };
            var4 = new class127(var6, 2);
        }
        if (this.field3565 != null) {
            for (int var7 = 0; var7 < this.field3565.length; var7++) {
                var4.method2306(this.field3565[var7], this.field3564[var7]);
            }
        }
        if (this.field3551 != null) {
            for (int var8 = 0; var8 < this.field3551.length; var8++) {
                var4.method2307(this.field3551[var8], this.field3566[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jb.e(IIB)I")
    public int method4449(int arg0, int arg1) {
        return class257.method4040(this.field3598, arg0, arg1);
    }

    @ObfuscatedName("jb.q(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4419(int arg0, String arg1) {
        return class257.method2778(this.field3598, arg0, arg1);
    }

    @ObfuscatedName("jb.h(I)I")
    public int method4448() {
        if (this.field3578 == -1 || this.field3577 == null) {
            return -1;
        } else if (this.field3578 >= 0) {
            return this.field3577[this.field3578] == null ? -1 : this.field3578;
        } else if (class233.field3026.equalsIgnoreCase(this.field3577[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("il.i(S)V")
    public static void method4234() {
        field3572.method3422();
        field3556.method3422();
        field3601.method3422();
    }

    @ObfuscatedName("aa.o(I)V")
    public static void method226() {
        field3601.method3422();
    }
}
