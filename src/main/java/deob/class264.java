package deob;

@ObfuscatedName("jx")
public class class264 extends class202 {

    @ObfuscatedName("jx.n")
    public static class197 field3545 = new class197(64);

    @ObfuscatedName("jx.c")
    public static class197 field3546 = new class197(50);

    @ObfuscatedName("jx.a")
    public static class197 field3540 = new class197(200);

    @ObfuscatedName("jx.w")
    public int field3549;

    @ObfuscatedName("jx.k")
    public int field3550;

    @ObfuscatedName("jx.t")
    public String field3551 = "null";

    @ObfuscatedName("jx.h")
    public short[] field3552;

    @ObfuscatedName("jx.u")
    public short[] field3553;

    @ObfuscatedName("jx.r")
    public short[] field3554;

    @ObfuscatedName("jx.g")
    public short[] field3555;

    @ObfuscatedName("jx.z")
    public int field3547 = 2000;

    @ObfuscatedName("jx.o")
    public int field3557 = 0;

    @ObfuscatedName("jx.d")
    public int field3556 = 0;

    @ObfuscatedName("jx.s")
    public int field3569 = 0;

    @ObfuscatedName("jx.f")
    public int field3560 = 0;

    @ObfuscatedName("jx.q")
    public int field3592 = 0;

    @ObfuscatedName("jx.al")
    public int field3559 = 0;

    @ObfuscatedName("jx.ao")
    public int field3563 = 1;

    @ObfuscatedName("jx.aq")
    public boolean field3564 = false;

    @ObfuscatedName("jx.ab")
    public String[] field3578 = new String[] { null, null, class233.field2924, null, null };

    @ObfuscatedName("jx.as")
    public String[] field3565 = new String[] { null, null, null, null, class233.field2925 };

    @ObfuscatedName("jx.ap")
    public int field3567 = -2;

    @ObfuscatedName("jx.av")
    public int field3568 = -1;

    @ObfuscatedName("jx.ak")
    public int field3579 = -1;

    @ObfuscatedName("jx.at")
    public int field3570 = 0;

    @ObfuscatedName("jx.an")
    public int field3571 = -1;

    @ObfuscatedName("jx.ah")
    public int field3590 = -1;

    @ObfuscatedName("jx.am")
    public int field3573 = 0;

    @ObfuscatedName("jx.ay")
    public int field3574 = -1;

    @ObfuscatedName("jx.az")
    public int field3575 = -1;

    @ObfuscatedName("jx.aw")
    public int field3543 = -1;

    @ObfuscatedName("jx.au")
    public int field3562 = -1;

    @ObfuscatedName("jx.ac")
    public int field3576 = -1;

    @ObfuscatedName("jx.ai")
    public int field3572 = -1;

    @ObfuscatedName("jx.ax")
    public int[] field3580;

    @ObfuscatedName("jx.af")
    public int[] field3581;

    @ObfuscatedName("jx.aa")
    public int field3582 = -1;

    @ObfuscatedName("jx.ad")
    public int field3588 = -1;

    @ObfuscatedName("jx.aj")
    public int field3558 = 128;

    @ObfuscatedName("jx.ae")
    public int field3585 = 128;

    @ObfuscatedName("jx.ar")
    public int field3586 = 128;

    @ObfuscatedName("jx.bu")
    public int field3593 = 0;

    @ObfuscatedName("jx.bk")
    public int field3566 = 0;

    @ObfuscatedName("jx.bo")
    public int field3589 = 0;

    @ObfuscatedName("jx.bl")
    public class194 field3577;

    @ObfuscatedName("jx.bw")
    public boolean field3591 = false;

    @ObfuscatedName("jx.bj")
    public int field3587 = -1;

    @ObfuscatedName("jx.bn")
    public int field3583 = -1;

    @ObfuscatedName("jx.bt")
    public int field3594 = -1;

    @ObfuscatedName("jx.bz")
    public int field3595 = -1;

    @ObfuscatedName("ie.m(II)Ljx;")
    public static class264 method4124(int arg0) {
        class264 var1 = (class264) field3545.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3596.method3930(10, arg0);
        class264 var3 = new class264();
        var3.field3549 = arg0;
        if (var2 != null) {
            var3.method4383(new class181(var2));
        }
        var3.method4438();
        if (var3.field3588 != -1) {
            var3.method4387(method4124(var3.field3588), method4124(var3.field3582));
        }
        if (var3.field3583 != -1) {
            var3.method4386(method4124(var3.field3583), method4124(var3.field3587));
        }
        if (var3.field3595 != -1) {
            var3.method4418(method4124(var3.field3595), method4124(var3.field3594));
        }
        if (!Statics.field3334 && var3.field3564) {
            var3.field3551 = class233.field3037;
            var3.field3591 = false;
            var3.field3578 = null;
            var3.field3565 = null;
            var3.field3567 = -1;
            var3.field3589 = 0;
            if (var3.field3577 != null) {
                boolean var4 = false;
                for (class200 var5 = var3.field3577.method3391(); var5 != null; var5 = var3.field3577.method3392()) {
                    class259 var6 = class259.method3309((int) var5.field2563);
                    if (var6.field3446) {
                        var5.method3476();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3577 = null;
                }
            }
        }
        field3545.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.p(I)V")
    public void method4438() {
    }

    @ObfuscatedName("jx.i(Lfv;I)V")
    public void method4383(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4384(arg0, var2);
        }
    }

    @ObfuscatedName("jx.j(Lfv;IB)V")
    public void method4384(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3550 = arg0.method3009();
        } else if (arg1 == 2) {
            this.field3551 = arg0.method3021();
        } else if (arg1 == 4) {
            this.field3547 = arg0.method3009();
        } else if (arg1 == 5) {
            this.field3557 = arg0.method3009();
        } else if (arg1 == 6) {
            this.field3556 = arg0.method3009();
        } else if (arg1 == 7) {
            this.field3560 = arg0.method3009();
            if (this.field3560 > 32767) {
                this.field3560 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3592 = arg0.method3009();
            if (this.field3592 > 32767) {
                this.field3592 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3559 = 1;
        } else if (arg1 == 12) {
            this.field3563 = arg0.method3017();
        } else if (arg1 == 16) {
            this.field3564 = true;
        } else if (arg1 == 23) {
            this.field3568 = arg0.method3009();
            this.field3570 = arg0.method3012();
        } else if (arg1 == 24) {
            this.field3579 = arg0.method3009();
        } else if (arg1 == 25) {
            this.field3571 = arg0.method3009();
            this.field3573 = arg0.method3012();
        } else if (arg1 == 26) {
            this.field3590 = arg0.method3009();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3578[arg1 - 30] = arg0.method3021();
            if (this.field3578[arg1 - 30].equalsIgnoreCase(class233.field3100)) {
                this.field3578[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3565[arg1 - 35] = arg0.method3021();
        } else if (arg1 == 40) {
            int var3 = arg0.method3012();
            this.field3552 = new short[var3];
            this.field3553 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3552[var4] = (short) arg0.method3009();
                this.field3553[var4] = (short) arg0.method3009();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3012();
            this.field3554 = new short[var5];
            this.field3555 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3554[var6] = (short) arg0.method3009();
                this.field3555[var6] = (short) arg0.method3009();
            }
        } else if (arg1 == 42) {
            this.field3567 = arg0.method3013();
        } else if (arg1 == 65) {
            this.field3591 = true;
        } else if (arg1 == 78) {
            this.field3574 = arg0.method3009();
        } else if (arg1 == 79) {
            this.field3575 = arg0.method3009();
        } else if (arg1 == 90) {
            this.field3543 = arg0.method3009();
        } else if (arg1 == 91) {
            this.field3576 = arg0.method3009();
        } else if (arg1 == 92) {
            this.field3562 = arg0.method3009();
        } else if (arg1 == 93) {
            this.field3572 = arg0.method3009();
        } else if (arg1 == 95) {
            this.field3569 = arg0.method3009();
        } else if (arg1 == 97) {
            this.field3582 = arg0.method3009();
        } else if (arg1 == 98) {
            this.field3588 = arg0.method3009();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3580 == null) {
                this.field3580 = new int[10];
                this.field3581 = new int[10];
            }
            this.field3580[arg1 - 100] = arg0.method3009();
            this.field3581[arg1 - 100] = arg0.method3009();
        } else if (arg1 == 110) {
            this.field3558 = arg0.method3009();
        } else if (arg1 == 111) {
            this.field3585 = arg0.method3009();
        } else if (arg1 == 112) {
            this.field3586 = arg0.method3009();
        } else if (arg1 == 113) {
            this.field3593 = arg0.method3013();
        } else if (arg1 == 114) {
            this.field3566 = arg0.method3013();
        } else if (arg1 == 115) {
            this.field3589 = arg0.method3012();
        } else if (arg1 == 139) {
            this.field3587 = arg0.method3009();
        } else if (arg1 == 140) {
            this.field3583 = arg0.method3009();
        } else if (arg1 == 148) {
            this.field3594 = arg0.method3009();
        } else if (arg1 == 149) {
            this.field3595 = arg0.method3009();
        } else if (arg1 == 249) {
            this.field3577 = class257.method2376(arg0, this.field3577);
        }
    }

    @ObfuscatedName("jx.v(Ljx;Ljx;B)V")
    public void method4387(class264 arg0, class264 arg1) {
        this.field3550 = arg0.field3550;
        this.field3547 = arg0.field3547;
        this.field3557 = arg0.field3557;
        this.field3556 = arg0.field3556;
        this.field3569 = arg0.field3569;
        this.field3560 = arg0.field3560;
        this.field3592 = arg0.field3592;
        this.field3552 = arg0.field3552;
        this.field3553 = arg0.field3553;
        this.field3554 = arg0.field3554;
        this.field3555 = arg0.field3555;
        this.field3551 = arg1.field3551;
        this.field3564 = arg1.field3564;
        this.field3563 = arg1.field3563;
        this.field3559 = 1;
    }

    @ObfuscatedName("jx.x(Ljx;Ljx;I)V")
    public void method4386(class264 arg0, class264 arg1) {
        this.field3550 = arg0.field3550;
        this.field3547 = arg0.field3547;
        this.field3557 = arg0.field3557;
        this.field3556 = arg0.field3556;
        this.field3569 = arg0.field3569;
        this.field3560 = arg0.field3560;
        this.field3592 = arg0.field3592;
        this.field3552 = arg1.field3552;
        this.field3553 = arg1.field3553;
        this.field3554 = arg1.field3554;
        this.field3555 = arg1.field3555;
        this.field3551 = arg1.field3551;
        this.field3564 = arg1.field3564;
        this.field3559 = arg1.field3559;
        this.field3568 = arg1.field3568;
        this.field3579 = arg1.field3579;
        this.field3574 = arg1.field3574;
        this.field3571 = arg1.field3571;
        this.field3590 = arg1.field3590;
        this.field3575 = arg1.field3575;
        this.field3543 = arg1.field3543;
        this.field3562 = arg1.field3562;
        this.field3576 = arg1.field3576;
        this.field3572 = arg1.field3572;
        this.field3589 = arg1.field3589;
        this.field3578 = arg1.field3578;
        this.field3565 = new String[5];
        if (arg1.field3565 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3565[var3] = arg1.field3565[var3];
            }
        }
        this.field3565[4] = class233.field2930;
        this.field3563 = 0;
    }

    @ObfuscatedName("jx.e(Ljx;Ljx;B)V")
    public void method4418(class264 arg0, class264 arg1) {
        this.field3550 = arg0.field3550;
        this.field3547 = arg0.field3547;
        this.field3557 = arg0.field3557;
        this.field3556 = arg0.field3556;
        this.field3569 = arg0.field3569;
        this.field3560 = arg0.field3560;
        this.field3592 = arg0.field3592;
        this.field3552 = arg0.field3552;
        this.field3553 = arg0.field3553;
        this.field3554 = arg0.field3554;
        this.field3555 = arg0.field3555;
        this.field3559 = arg0.field3559;
        this.field3551 = arg1.field3551;
        this.field3563 = 0;
        this.field3564 = false;
        this.field3591 = false;
    }

    @ObfuscatedName("jx.l(IS)Ldv;")
    public final class127 method4388(int arg0) {
        if (this.field3580 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3581[var3] && this.field3581[var3] != 0) {
                    var2 = this.field3580[var3];
                }
            }
            if (var2 != -1) {
                return method4124(var2).method4388(1);
            }
        }
        class127 var4 = class127.method2302(Statics.field3539, this.field3550, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3558 != 128 || this.field3585 != 128 || this.field3586 != 128) {
            var4.method2356(this.field3558, this.field3585, this.field3586);
        }
        if (this.field3552 != null) {
            for (int var5 = 0; var5 < this.field3552.length; var5++) {
                var4.method2360(this.field3552[var5], this.field3553[var5]);
            }
        }
        if (this.field3554 != null) {
            for (int var6 = 0; var6 < this.field3554.length; var6++) {
                var4.method2305(this.field3554[var6], this.field3555[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jx.b(II)Len;")
    public final class133 method4389(int arg0) {
        if (this.field3580 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3581[var3] && this.field3581[var3] != 0) {
                    var2 = this.field3580[var3];
                }
            }
            if (var2 != -1) {
                return method4124(var2).method4389(1);
            }
        }
        class133 var4 = (class133) field3546.method3419((long) this.field3549);
        if (var4 != null) {
            return var4;
        }
        class127 var5 = class127.method2302(Statics.field3539, this.field3550, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3558 != 128 || this.field3585 != 128 || this.field3586 != 128) {
            var5.method2356(this.field3558, this.field3585, this.field3586);
        }
        if (this.field3552 != null) {
            for (int var6 = 0; var6 < this.field3552.length; var6++) {
                var5.method2360(this.field3552[var6], this.field3553[var6]);
            }
        }
        if (this.field3554 != null) {
            for (int var7 = 0; var7 < this.field3554.length; var7++) {
                var5.method2305(this.field3554[var7], this.field3555[var7]);
            }
        }
        class133 var8 = var5.method2335(this.field3593 + 64, this.field3566 * 5 + 768, -50, -10, -50);
        var8.field1861 = true;
        field3546.method3418(var8, (long) this.field3549);
        return var8;
    }

    @ObfuscatedName("jx.n(II)Ljx;")
    public class264 method4390(int arg0) {
        if (this.field3580 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3581[var3] && this.field3581[var3] != 0) {
                    var2 = this.field3580[var3];
                }
            }
            if (var2 != -1) {
                return method4124(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("jx.a(ZB)Z")
    public final boolean method4409(boolean arg0) {
        int var2 = this.field3568;
        int var3 = this.field3579;
        int var4 = this.field3574;
        if (arg0) {
            var2 = this.field3571;
            var3 = this.field3590;
            var4 = this.field3575;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3539.method3932(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3539.method3932(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3539.method3932(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jx.y(ZB)Ldv;")
    public final class127 method4432(boolean arg0) {
        int var2 = this.field3568;
        int var3 = this.field3579;
        int var4 = this.field3574;
        if (arg0) {
            var2 = this.field3571;
            var3 = this.field3590;
            var4 = this.field3575;
        }
        if (var2 == -1) {
            return null;
        }
        class127 var5 = class127.method2302(Statics.field3539, var2, 0);
        if (var3 != -1) {
            class127 var6 = class127.method2302(Statics.field3539, var3, 0);
            if (var4 == -1) {
                class127[] var9 = new class127[] { var5, var6 };
                var5 = new class127(var9, 2);
            } else {
                class127 var7 = class127.method2302(Statics.field3539, var4, 0);
                class127[] var8 = new class127[] { var5, var6, var7 };
                var5 = new class127(var8, 3);
            }
        }
        if (!arg0 && this.field3570 != 0) {
            var5.method2345(0, this.field3570, 0);
        }
        if (arg0 && this.field3573 != 0) {
            var5.method2345(0, this.field3573, 0);
        }
        if (this.field3552 != null) {
            for (int var10 = 0; var10 < this.field3552.length; var10++) {
                var5.method2360(this.field3552[var10], this.field3553[var10]);
            }
        }
        if (this.field3554 != null) {
            for (int var11 = 0; var11 < this.field3554.length; var11++) {
                var5.method2305(this.field3554[var11], this.field3555[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jx.w(ZS)Z")
    public final boolean method4393(boolean arg0) {
        int var2 = this.field3543;
        int var3 = this.field3562;
        if (arg0) {
            var2 = this.field3576;
            var3 = this.field3572;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3539.method3932(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3539.method3932(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jx.k(ZB)Ldv;")
    public final class127 method4425(boolean arg0) {
        int var2 = this.field3543;
        int var3 = this.field3562;
        if (arg0) {
            var2 = this.field3576;
            var3 = this.field3572;
        }
        if (var2 == -1) {
            return null;
        }
        class127 var4 = class127.method2302(Statics.field3539, var2, 0);
        if (var3 != -1) {
            class127 var5 = class127.method2302(Statics.field3539, var3, 0);
            class127[] var6 = new class127[] { var4, var5 };
            var4 = new class127(var6, 2);
        }
        if (this.field3552 != null) {
            for (int var7 = 0; var7 < this.field3552.length; var7++) {
                var4.method2360(this.field3552[var7], this.field3553[var7]);
            }
        }
        if (this.field3554 != null) {
            for (int var8 = 0; var8 < this.field3554.length; var8++) {
                var4.method2305(this.field3554[var8], this.field3555[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jx.t(III)I")
    public int method4394(int arg0, int arg1) {
        return class257.method2750(this.field3577, arg0, arg1);
    }

    @ObfuscatedName("jx.h(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4395(int arg0, String arg1) {
        return class257.method2471(this.field3577, arg0, arg1);
    }

    @ObfuscatedName("jx.u(I)I")
    public int method4396() {
        if (this.field3567 == -1 || this.field3565 == null) {
            return -1;
        } else if (this.field3567 >= 0) {
            return this.field3565[this.field3567] == null ? -1 : this.field3567;
        } else if (class233.field2925.equalsIgnoreCase(this.field3565[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("client.r(B)V")
    public static void method1359() {
        field3545.method3423();
        field3546.method3423();
        field3540.method3423();
    }
}
