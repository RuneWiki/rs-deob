package deob;

@ObfuscatedName("ju")
public class class284 extends class219 {

    @ObfuscatedName("ju.h")
    public static class213 field3650 = new class213(64);

    @ObfuscatedName("ju.i")
    public static class213 field3670 = new class213(50);

    @ObfuscatedName("ju.o")
    public static class213 field3652 = new class213(200);

    @ObfuscatedName("ju.r")
    public int field3654;

    @ObfuscatedName("ju.p")
    public int field3678;

    @ObfuscatedName("ju.q")
    public String field3692 = class252.field3028;

    @ObfuscatedName("ju.f")
    public short[] field3657;

    @ObfuscatedName("ju.j")
    public short[] field3658;

    @ObfuscatedName("ju.v")
    public short[] field3659;

    @ObfuscatedName("ju.u")
    public short[] field3665;

    @ObfuscatedName("ju.k")
    public int field3661 = 2000;

    @ObfuscatedName("ju.w")
    public int field3662 = 0;

    @ObfuscatedName("ju.m")
    public int field3663 = 0;

    @ObfuscatedName("ju.a")
    public int field3672 = 0;

    @ObfuscatedName("ju.x")
    public int field3656 = 0;

    @ObfuscatedName("ju.t")
    public int field3666 = 0;

    @ObfuscatedName("ju.ax")
    public int field3667 = 0;

    @ObfuscatedName("ju.ai")
    public int field3668 = 1;

    @ObfuscatedName("ju.aj")
    public boolean field3669 = false;

    @ObfuscatedName("ju.ac")
    public String[] field3660 = new String[] { null, null, class252.field3021, null, null };

    @ObfuscatedName("ju.ag")
    public String[] field3671 = new String[] { null, null, null, null, class252.field3022 };

    @ObfuscatedName("ju.as")
    public int field3677 = -2;

    @ObfuscatedName("ju.av")
    public int field3694 = -1;

    @ObfuscatedName("ju.ao")
    public int field3648 = -1;

    @ObfuscatedName("ju.ak")
    public int field3675 = 0;

    @ObfuscatedName("ju.ad")
    public int field3676 = -1;

    @ObfuscatedName("ju.az")
    public int field3674 = -1;

    @ObfuscatedName("ju.aa")
    public int field3651 = 0;

    @ObfuscatedName("ju.ab")
    public int field3679 = -1;

    @ObfuscatedName("ju.al")
    public int field3680 = -1;

    @ObfuscatedName("ju.af")
    public int field3681 = -1;

    @ObfuscatedName("ju.ah")
    public int field3682 = -1;

    @ObfuscatedName("ju.au")
    public int field3683 = -1;

    @ObfuscatedName("ju.ap")
    public int field3649 = -1;

    @ObfuscatedName("ju.at")
    public int[] field3685;

    @ObfuscatedName("ju.am")
    public int[] field3686;

    @ObfuscatedName("ju.an")
    public int field3684 = -1;

    @ObfuscatedName("ju.ae")
    public int field3688 = -1;

    @ObfuscatedName("ju.aw")
    public int field3689 = 128;

    @ObfuscatedName("ju.ar")
    public int field3690 = 128;

    @ObfuscatedName("ju.aq")
    public int field3664 = 128;

    @ObfuscatedName("ju.bq")
    public int field3642 = 0;

    @ObfuscatedName("ju.bi")
    public int field3693 = 0;

    @ObfuscatedName("ju.bo")
    public int field3691 = 0;

    @ObfuscatedName("ju.bj")
    public class210 field3695;

    @ObfuscatedName("ju.bw")
    public boolean field3696 = false;

    @ObfuscatedName("ju.bp")
    public int field3697 = -1;

    @ObfuscatedName("ju.bh")
    public int field3698 = -1;

    @ObfuscatedName("ju.bz")
    public int field3699 = -1;

    @ObfuscatedName("ju.bl")
    public int field3700 = -1;

    @ObfuscatedName("cy.g(Ljr;Ljr;ZLkh;I)V")
    public static void method1824(class262 arg0, class262 arg1, boolean arg2, class312 arg3) {
        Statics.field3647 = arg0;
        Statics.field2042 = arg1;
        Statics.field3646 = arg2;
        Statics.field3644 = Statics.field3647.method4279(10);
        Statics.field3653 = arg3;
    }

    @ObfuscatedName("cq.e(IB)Lju;")
    public static class284 method2027(int arg0) {
        class284 var1 = (class284) field3650.method3706((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3647.method4294(10, arg0);
        class284 var3 = new class284();
        var3.field3654 = arg0;
        if (var2 != null) {
            var3.method4760(new class195(var2));
        }
        var3.method4738();
        if (var3.field3688 != -1) {
            var3.method4741(method2027(var3.field3688), method2027(var3.field3684));
        }
        if (var3.field3698 != -1) {
            var3.method4742(method2027(var3.field3698), method2027(var3.field3697));
        }
        if (var3.field3700 != -1) {
            var3.method4756(method2027(var3.field3700), method2027(var3.field3699));
        }
        if (!Statics.field3646 && var3.field3669) {
            var3.field3692 = class252.field3282;
            var3.field3696 = false;
            var3.field3660 = null;
            var3.field3671 = null;
            var3.field3677 = -1;
            var3.field3691 = 0;
            if (var3.field3695 != null) {
                boolean var4 = false;
                for (class217 var5 = var3.field3695.method3673(); var5 != null; var5 = var3.field3695.method3690()) {
                    class279 var6 = Statics.method4255((int) var5.field2660);
                    if (var6.field3552) {
                        var5.method3796();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3695 = null;
                }
            }
        }
        field3650.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ju.b(I)V")
    public void method4738() {
    }

    @ObfuscatedName("ju.z(Lgg;B)V")
    public void method4760(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4740(arg0, var2);
        }
    }

    @ObfuscatedName("ju.n(Lgg;IB)V")
    public void method4740(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3678 = arg0.method3310();
        } else if (arg1 == 2) {
            this.field3692 = arg0.method3429();
        } else if (arg1 == 4) {
            this.field3661 = arg0.method3310();
        } else if (arg1 == 5) {
            this.field3662 = arg0.method3310();
        } else if (arg1 == 6) {
            this.field3663 = arg0.method3310();
        } else if (arg1 == 7) {
            this.field3656 = arg0.method3310();
            if (this.field3656 > 32767) {
                this.field3656 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3666 = arg0.method3310();
            if (this.field3666 > 32767) {
                this.field3666 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3667 = 1;
        } else if (arg1 == 12) {
            this.field3668 = arg0.method3472();
        } else if (arg1 == 16) {
            this.field3669 = true;
        } else if (arg1 == 23) {
            this.field3694 = arg0.method3310();
            this.field3675 = arg0.method3332();
        } else if (arg1 == 24) {
            this.field3648 = arg0.method3310();
        } else if (arg1 == 25) {
            this.field3676 = arg0.method3310();
            this.field3651 = arg0.method3332();
        } else if (arg1 == 26) {
            this.field3674 = arg0.method3310();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3660[arg1 - 30] = arg0.method3429();
            if (this.field3660[arg1 - 30].equalsIgnoreCase(class252.field3280)) {
                this.field3660[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3671[arg1 - 35] = arg0.method3429();
        } else if (arg1 == 40) {
            int var3 = arg0.method3332();
            this.field3657 = new short[var3];
            this.field3658 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3657[var4] = (short) arg0.method3310();
                this.field3658[var4] = (short) arg0.method3310();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3332();
            this.field3659 = new short[var5];
            this.field3665 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3659[var6] = (short) arg0.method3310();
                this.field3665[var6] = (short) arg0.method3310();
            }
        } else if (arg1 == 42) {
            this.field3677 = arg0.method3309();
        } else if (arg1 == 65) {
            this.field3696 = true;
        } else if (arg1 == 78) {
            this.field3679 = arg0.method3310();
        } else if (arg1 == 79) {
            this.field3680 = arg0.method3310();
        } else if (arg1 == 90) {
            this.field3681 = arg0.method3310();
        } else if (arg1 == 91) {
            this.field3683 = arg0.method3310();
        } else if (arg1 == 92) {
            this.field3682 = arg0.method3310();
        } else if (arg1 == 93) {
            this.field3649 = arg0.method3310();
        } else if (arg1 == 95) {
            this.field3672 = arg0.method3310();
        } else if (arg1 == 97) {
            this.field3684 = arg0.method3310();
        } else if (arg1 == 98) {
            this.field3688 = arg0.method3310();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3685 == null) {
                this.field3685 = new int[10];
                this.field3686 = new int[10];
            }
            this.field3685[arg1 - 100] = arg0.method3310();
            this.field3686[arg1 - 100] = arg0.method3310();
        } else if (arg1 == 110) {
            this.field3689 = arg0.method3310();
        } else if (arg1 == 111) {
            this.field3690 = arg0.method3310();
        } else if (arg1 == 112) {
            this.field3664 = arg0.method3310();
        } else if (arg1 == 113) {
            this.field3642 = arg0.method3309();
        } else if (arg1 == 114) {
            this.field3693 = arg0.method3309();
        } else if (arg1 == 115) {
            this.field3691 = arg0.method3332();
        } else if (arg1 == 139) {
            this.field3697 = arg0.method3310();
        } else if (arg1 == 140) {
            this.field3698 = arg0.method3310();
        } else if (arg1 == 148) {
            this.field3699 = arg0.method3310();
        } else if (arg1 == 149) {
            this.field3700 = arg0.method3310();
        } else if (arg1 == 249) {
            this.field3695 = class277.method3031(arg0, this.field3695);
        }
    }

    @ObfuscatedName("ju.l(Lju;Lju;I)V")
    public void method4741(class284 arg0, class284 arg1) {
        this.field3678 = arg0.field3678;
        this.field3661 = arg0.field3661;
        this.field3662 = arg0.field3662;
        this.field3663 = arg0.field3663;
        this.field3672 = arg0.field3672;
        this.field3656 = arg0.field3656;
        this.field3666 = arg0.field3666;
        this.field3657 = arg0.field3657;
        this.field3658 = arg0.field3658;
        this.field3659 = arg0.field3659;
        this.field3665 = arg0.field3665;
        this.field3692 = arg1.field3692;
        this.field3669 = arg1.field3669;
        this.field3668 = arg1.field3668;
        this.field3667 = 1;
    }

    @ObfuscatedName("ju.s(Lju;Lju;B)V")
    public void method4742(class284 arg0, class284 arg1) {
        this.field3678 = arg0.field3678;
        this.field3661 = arg0.field3661;
        this.field3662 = arg0.field3662;
        this.field3663 = arg0.field3663;
        this.field3672 = arg0.field3672;
        this.field3656 = arg0.field3656;
        this.field3666 = arg0.field3666;
        this.field3657 = arg1.field3657;
        this.field3658 = arg1.field3658;
        this.field3659 = arg1.field3659;
        this.field3665 = arg1.field3665;
        this.field3692 = arg1.field3692;
        this.field3669 = arg1.field3669;
        this.field3667 = arg1.field3667;
        this.field3694 = arg1.field3694;
        this.field3648 = arg1.field3648;
        this.field3679 = arg1.field3679;
        this.field3676 = arg1.field3676;
        this.field3674 = arg1.field3674;
        this.field3680 = arg1.field3680;
        this.field3681 = arg1.field3681;
        this.field3682 = arg1.field3682;
        this.field3683 = arg1.field3683;
        this.field3649 = arg1.field3649;
        this.field3691 = arg1.field3691;
        this.field3660 = arg1.field3660;
        this.field3671 = new String[5];
        if (arg1.field3671 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3671[var3] = arg1.field3671[var3];
            }
        }
        this.field3671[4] = class252.field3027;
        this.field3668 = 0;
    }

    @ObfuscatedName("ju.y(Lju;Lju;I)V")
    public void method4756(class284 arg0, class284 arg1) {
        this.field3678 = arg0.field3678;
        this.field3661 = arg0.field3661;
        this.field3662 = arg0.field3662;
        this.field3663 = arg0.field3663;
        this.field3672 = arg0.field3672;
        this.field3656 = arg0.field3656;
        this.field3666 = arg0.field3666;
        this.field3657 = arg0.field3657;
        this.field3658 = arg0.field3658;
        this.field3659 = arg0.field3659;
        this.field3665 = arg0.field3665;
        this.field3667 = arg0.field3667;
        this.field3692 = arg1.field3692;
        this.field3668 = 0;
        this.field3669 = false;
        this.field3696 = false;
    }

    @ObfuscatedName("ju.c(IB)Ldi;")
    public final class126 method4744(int arg0) {
        if (this.field3685 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3686[var3] && this.field3686[var3] != 0) {
                    var2 = this.field3685[var3];
                }
            }
            if (var2 != -1) {
                return method2027(var2).method4744(1);
            }
        }
        class126 var4 = class126.method2485(Statics.field2042, this.field3678, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3689 != 128 || this.field3690 != 128 || this.field3664 != 128) {
            var4.method2500(this.field3689, this.field3690, this.field3664);
        }
        if (this.field3657 != null) {
            for (int var5 = 0; var5 < this.field3657.length; var5++) {
                var4.method2534(this.field3657[var5], this.field3658[var5]);
            }
        }
        if (this.field3659 != null) {
            for (int var6 = 0; var6 < this.field3659.length; var6++) {
                var4.method2498(this.field3659[var6], this.field3665[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ju.o(II)Lee;")
    public final class132 method4737(int arg0) {
        if (this.field3685 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3686[var3] && this.field3686[var3] != 0) {
                    var2 = this.field3685[var3];
                }
            }
            if (var2 != -1) {
                return method2027(var2).method4737(1);
            }
        }
        class132 var4 = (class132) field3670.method3706((long) this.field3654);
        if (var4 != null) {
            return var4;
        }
        class126 var5 = class126.method2485(Statics.field2042, this.field3678, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3689 != 128 || this.field3690 != 128 || this.field3664 != 128) {
            var5.method2500(this.field3689, this.field3690, this.field3664);
        }
        if (this.field3657 != null) {
            for (int var6 = 0; var6 < this.field3657.length; var6++) {
                var5.method2534(this.field3657[var6], this.field3658[var6]);
            }
        }
        if (this.field3659 != null) {
            for (int var7 = 0; var7 < this.field3659.length; var7++) {
                var5.method2498(this.field3659[var7], this.field3665[var7]);
            }
        }
        class132 var8 = var5.method2505(this.field3642 + 64, this.field3693 * 5 + 768, -50, -10, -50);
        var8.field1848 = true;
        field3670.method3712(var8, (long) this.field3654);
        return var8;
    }

    @ObfuscatedName("ju.d(II)Lju;")
    public class284 method4745(int arg0) {
        if (this.field3685 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3686[var3] && this.field3686[var3] != 0) {
                    var2 = this.field3685[var3];
                }
            }
            if (var2 != -1) {
                return method2027(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("b.r(IIIIIZI)Llv;")
    public static final class332 method6(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class332 var8 = (class332) field3652.method3706(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class284 var9 = method2027(arg0);
        if (arg1 > 1 && var9.field3685 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3686[var11] && var9.field3686[var11] != 0) {
                    var10 = var9.field3685[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2027(var10);
            }
        }
        class132 var12 = var9.method4737(1);
        if (var12 == null) {
            return null;
        }
        class332 var13 = null;
        if (var9.field3688 != -1) {
            var13 = method6(var9.field3684, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3698 != -1) {
            var13 = method6(var9.field3697, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3700 != -1) {
            var13 = method6(var9.field3699, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3960;
        int var15 = Statics.field3961;
        int var16 = Statics.field3962;
        int[] var17 = new int[4];
        class328.method5356(var17);
        class332 var18 = new class332(36, 32);
        class328.method5366(var18.field3986, 36, 32);
        class328.method5358();
        class135.method2711();
        class135.method2674(16, 16);
        class135.field1917 = false;
        if (var9.field3700 != -1) {
            var13.method5524(0, 0);
        }
        int var19 = var9.field3661;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class135.field1939[var9.field3662] * var19 >> 16;
        int var21 = class135.field1921[var9.field3662] * var19 >> 16;
        var12.method2581();
        var12.method2575(0, var9.field3663, var9.field3672, var9.field3662, var9.field3656, var9.field3666 + var12.field2025 / 2 + var20, var9.field3666 + var21);
        if (var9.field3698 != -1) {
            var13.method5524(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5458(1);
        }
        if (arg2 >= 2) {
            var18.method5458(16777215);
        }
        if (arg3 != 0) {
            var18.method5459(arg3);
        }
        class328.method5366(var18.field3986, 36, 32);
        if (var9.field3688 != -1) {
            var13.method5524(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3667 == 1) {
            class312 var22 = Statics.field3653;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class252.field3185 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class252.field3183 + "</col>";
            }
            var22.method5186(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3652.method3712(var18, var6);
        }
        class328.method5366(var14, var15, var16);
        class328.method5392(var17);
        class135.method2711();
        class135.field1917 = true;
        return var18;
    }

    @ObfuscatedName("ju.p(ZI)Z")
    public final boolean method4746(boolean arg0) {
        int var2 = this.field3694;
        int var3 = this.field3648;
        int var4 = this.field3679;
        if (arg0) {
            var2 = this.field3676;
            var3 = this.field3674;
            var4 = this.field3680;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2042.method4269(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2042.method4269(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2042.method4269(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ju.q(ZI)Ldi;")
    public final class126 method4747(boolean arg0) {
        int var2 = this.field3694;
        int var3 = this.field3648;
        int var4 = this.field3679;
        if (arg0) {
            var2 = this.field3676;
            var3 = this.field3674;
            var4 = this.field3680;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var5 = class126.method2485(Statics.field2042, var2, 0);
        if (var3 != -1) {
            class126 var6 = class126.method2485(Statics.field2042, var3, 0);
            if (var4 == -1) {
                class126[] var9 = new class126[] { var5, var6 };
                var5 = new class126(var9, 2);
            } else {
                class126 var7 = class126.method2485(Statics.field2042, var4, 0);
                class126[] var8 = new class126[] { var5, var6, var7 };
                var5 = new class126(var8, 3);
            }
        }
        if (!arg0 && this.field3675 != 0) {
            var5.method2492(0, this.field3675, 0);
        }
        if (arg0 && this.field3651 != 0) {
            var5.method2492(0, this.field3651, 0);
        }
        if (this.field3657 != null) {
            for (int var10 = 0; var10 < this.field3657.length; var10++) {
                var5.method2534(this.field3657[var10], this.field3658[var10]);
            }
        }
        if (this.field3659 != null) {
            for (int var11 = 0; var11 < this.field3659.length; var11++) {
                var5.method2498(this.field3659[var11], this.field3665[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ju.f(ZI)Z")
    public final boolean method4748(boolean arg0) {
        int var2 = this.field3681;
        int var3 = this.field3682;
        if (arg0) {
            var2 = this.field3683;
            var3 = this.field3649;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2042.method4269(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2042.method4269(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ju.j(ZI)Ldi;")
    public final class126 method4749(boolean arg0) {
        int var2 = this.field3681;
        int var3 = this.field3682;
        if (arg0) {
            var2 = this.field3683;
            var3 = this.field3649;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var4 = class126.method2485(Statics.field2042, var2, 0);
        if (var3 != -1) {
            class126 var5 = class126.method2485(Statics.field2042, var3, 0);
            class126[] var6 = new class126[] { var4, var5 };
            var4 = new class126(var6, 2);
        }
        if (this.field3657 != null) {
            for (int var7 = 0; var7 < this.field3657.length; var7++) {
                var4.method2534(this.field3657[var7], this.field3658[var7]);
            }
        }
        if (this.field3659 != null) {
            for (int var8 = 0; var8 < this.field3659.length; var8++) {
                var4.method2498(this.field3659[var8], this.field3665[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ju.v(IIB)I")
    public int method4750(int arg0, int arg1) {
        return class277.method2026(this.field3695, arg0, arg1);
    }

    @ObfuscatedName("ju.u(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4751(int arg0, String arg1) {
        return class277.method3127(this.field3695, arg0, arg1);
    }

    @ObfuscatedName("ju.k(I)I")
    public int method4763() {
        if (this.field3677 == -1 || this.field3671 == null) {
            return -1;
        } else if (this.field3677 >= 0) {
            return this.field3671[this.field3677] == null ? -1 : this.field3677;
        } else if (class252.field3022.equalsIgnoreCase(this.field3671[4])) {
            return 4;
        } else {
            return -1;
        }
    }
}
