package deob;

@ObfuscatedName("jx")
public class class284 extends class219 {

    @ObfuscatedName("jx.x")
    public static class213 field3645 = new class213(64);

    @ObfuscatedName("jx.m")
    public static class213 field3646 = new class213(50);

    @ObfuscatedName("jx.h")
    public static class213 field3647 = new class213(200);

    @ObfuscatedName("jx.i")
    public int field3675;

    @ObfuscatedName("jx.u")
    public int field3649;

    @ObfuscatedName("jx.q")
    public String field3650 = class252.field3160;

    @ObfuscatedName("jx.v")
    public short[] field3665;

    @ObfuscatedName("jx.f")
    public short[] field3652;

    @ObfuscatedName("jx.b")
    public short[] field3653;

    @ObfuscatedName("jx.c")
    public short[] field3654;

    @ObfuscatedName("jx.j")
    public int field3682 = 2000;

    @ObfuscatedName("jx.l")
    public int field3656 = 0;

    @ObfuscatedName("jx.g")
    public int field3657 = 0;

    @ObfuscatedName("jx.w")
    public int field3674 = 0;

    @ObfuscatedName("jx.o")
    public int field3659 = 0;

    @ObfuscatedName("jx.a")
    public int field3660 = 0;

    @ObfuscatedName("jx.ak")
    public int field3661 = 0;

    @ObfuscatedName("jx.ap")
    public int field3691 = 1;

    @ObfuscatedName("jx.ac")
    public boolean field3663 = false;

    @ObfuscatedName("jx.aw")
    public String[] field3664 = new String[] { null, null, class252.field3020, null, null };

    @ObfuscatedName("jx.as")
    public String[] field3679 = new String[] { null, null, null, null, class252.field3021 };

    @ObfuscatedName("jx.al")
    public int field3640 = -2;

    @ObfuscatedName("jx.af")
    public int field3651 = -1;

    @ObfuscatedName("jx.ai")
    public int field3668 = -1;

    @ObfuscatedName("jx.az")
    public int field3658 = 0;

    @ObfuscatedName("jx.aq")
    public int field3677 = -1;

    @ObfuscatedName("jx.ae")
    public int field3671 = -1;

    @ObfuscatedName("jx.ad")
    public int field3667 = 0;

    @ObfuscatedName("jx.ar")
    public int field3673 = -1;

    @ObfuscatedName("jx.ao")
    public int field3662 = -1;

    @ObfuscatedName("jx.at")
    public int field3672 = -1;

    @ObfuscatedName("jx.ag")
    public int field3676 = -1;

    @ObfuscatedName("jx.an")
    public int field3689 = -1;

    @ObfuscatedName("jx.ax")
    public int field3678 = -1;

    @ObfuscatedName("jx.ah")
    public int[] field3681;

    @ObfuscatedName("jx.ab")
    public int[] field3680;

    @ObfuscatedName("jx.am")
    public int field3639 = -1;

    @ObfuscatedName("jx.ay")
    public int field3684 = -1;

    @ObfuscatedName("jx.aj")
    public int field3683 = 128;

    @ObfuscatedName("jx.aa")
    public int field3648 = 128;

    @ObfuscatedName("jx.av")
    public int field3685 = 128;

    @ObfuscatedName("jx.bc")
    public int field3670 = 0;

    @ObfuscatedName("jx.br")
    public int field3687 = 0;

    @ObfuscatedName("jx.by")
    public int field3688 = 0;

    @ObfuscatedName("jx.bl")
    public class210 field3690;

    @ObfuscatedName("jx.bs")
    public boolean field3666 = false;

    @ObfuscatedName("jx.bu")
    public int field3695 = -1;

    @ObfuscatedName("jx.bz")
    public int field3692 = -1;

    @ObfuscatedName("jx.bt")
    public int field3693 = -1;

    @ObfuscatedName("jx.bm")
    public int field3694 = -1;

    @ObfuscatedName("if.d(IB)Ljx;")
    public static class284 method4245(int arg0) {
        class284 var1 = (class284) field3645.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field278.method4273(10, arg0);
        class284 var3 = new class284();
        var3.field3675 = arg0;
        if (var2 != null) {
            var3.method4752(new class195(var2));
        }
        var3.method4751();
        if (var3.field3684 != -1) {
            var3.method4812(method4245(var3.field3684), method4245(var3.field3639));
        }
        if (var3.field3692 != -1) {
            var3.method4753(method4245(var3.field3692), method4245(var3.field3695));
        }
        if (var3.field3694 != -1) {
            var3.method4754(method4245(var3.field3694), method4245(var3.field3693));
        }
        if (!Statics.field3643 && var3.field3663) {
            var3.field3650 = class252.field3109;
            var3.field3666 = false;
            var3.field3664 = null;
            var3.field3679 = null;
            var3.field3640 = -1;
            var3.field3688 = 0;
            if (var3.field3690 != null) {
                boolean var4 = false;
                for (class217 var5 = var3.field3690.method3664(); var5 != null; var5 = var3.field3690.method3675()) {
                    class279 var6 = class279.method3077((int) var5.field2655);
                    if (var6.field3546) {
                        var5.method3785();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3690 = null;
                }
            }
        }
        field3645.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.z(I)V")
    public void method4751() {
    }

    @ObfuscatedName("jx.n(Lgy;I)V")
    public void method4752(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4792(arg0, var2);
        }
    }

    @ObfuscatedName("jx.r(Lgy;IS)V")
    public void method4792(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3649 = arg0.method3269();
        } else if (arg1 == 2) {
            this.field3650 = arg0.method3268();
        } else if (arg1 == 4) {
            this.field3682 = arg0.method3269();
        } else if (arg1 == 5) {
            this.field3656 = arg0.method3269();
        } else if (arg1 == 6) {
            this.field3657 = arg0.method3269();
        } else if (arg1 == 7) {
            this.field3659 = arg0.method3269();
            if (this.field3659 > 32767) {
                this.field3659 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3660 = arg0.method3269();
            if (this.field3660 > 32767) {
                this.field3660 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3661 = 1;
        } else if (arg1 == 12) {
            this.field3691 = arg0.method3264();
        } else if (arg1 == 16) {
            this.field3663 = true;
        } else if (arg1 == 23) {
            this.field3651 = arg0.method3269();
            this.field3658 = arg0.method3330();
        } else if (arg1 == 24) {
            this.field3668 = arg0.method3269();
        } else if (arg1 == 25) {
            this.field3677 = arg0.method3269();
            this.field3667 = arg0.method3330();
        } else if (arg1 == 26) {
            this.field3671 = arg0.method3269();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3664[arg1 - 30] = arg0.method3268();
            if (this.field3664[arg1 - 30].equalsIgnoreCase(class252.field3022)) {
                this.field3664[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3679[arg1 - 35] = arg0.method3268();
        } else if (arg1 == 40) {
            int var3 = arg0.method3330();
            this.field3665 = new short[var3];
            this.field3652 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3665[var4] = (short) arg0.method3269();
                this.field3652[var4] = (short) arg0.method3269();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3330();
            this.field3653 = new short[var5];
            this.field3654 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3653[var6] = (short) arg0.method3269();
                this.field3654[var6] = (short) arg0.method3269();
            }
        } else if (arg1 == 42) {
            this.field3640 = arg0.method3421();
        } else if (arg1 == 65) {
            this.field3666 = true;
        } else if (arg1 == 78) {
            this.field3673 = arg0.method3269();
        } else if (arg1 == 79) {
            this.field3662 = arg0.method3269();
        } else if (arg1 == 90) {
            this.field3672 = arg0.method3269();
        } else if (arg1 == 91) {
            this.field3689 = arg0.method3269();
        } else if (arg1 == 92) {
            this.field3676 = arg0.method3269();
        } else if (arg1 == 93) {
            this.field3678 = arg0.method3269();
        } else if (arg1 == 95) {
            this.field3674 = arg0.method3269();
        } else if (arg1 == 97) {
            this.field3639 = arg0.method3269();
        } else if (arg1 == 98) {
            this.field3684 = arg0.method3269();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3681 == null) {
                this.field3681 = new int[10];
                this.field3680 = new int[10];
            }
            this.field3681[arg1 - 100] = arg0.method3269();
            this.field3680[arg1 - 100] = arg0.method3269();
        } else if (arg1 == 110) {
            this.field3683 = arg0.method3269();
        } else if (arg1 == 111) {
            this.field3648 = arg0.method3269();
        } else if (arg1 == 112) {
            this.field3685 = arg0.method3269();
        } else if (arg1 == 113) {
            this.field3670 = arg0.method3421();
        } else if (arg1 == 114) {
            this.field3687 = arg0.method3421() * 5;
        } else if (arg1 == 115) {
            this.field3688 = arg0.method3330();
        } else if (arg1 == 139) {
            this.field3695 = arg0.method3269();
        } else if (arg1 == 140) {
            this.field3692 = arg0.method3269();
        } else if (arg1 == 148) {
            this.field3693 = arg0.method3269();
        } else if (arg1 == 149) {
            this.field3694 = arg0.method3269();
        } else if (arg1 == 249) {
            this.field3690 = class277.method3037(arg0, this.field3690);
        }
    }

    @ObfuscatedName("jx.e(Ljx;Ljx;I)V")
    public void method4812(class284 arg0, class284 arg1) {
        this.field3649 = arg0.field3649;
        this.field3682 = arg0.field3682;
        this.field3656 = arg0.field3656;
        this.field3657 = arg0.field3657;
        this.field3674 = arg0.field3674;
        this.field3659 = arg0.field3659;
        this.field3660 = arg0.field3660;
        this.field3665 = arg0.field3665;
        this.field3652 = arg0.field3652;
        this.field3653 = arg0.field3653;
        this.field3654 = arg0.field3654;
        this.field3650 = arg1.field3650;
        this.field3663 = arg1.field3663;
        this.field3691 = arg1.field3691;
        this.field3661 = 1;
    }

    @ObfuscatedName("jx.y(Ljx;Ljx;I)V")
    public void method4753(class284 arg0, class284 arg1) {
        this.field3649 = arg0.field3649;
        this.field3682 = arg0.field3682;
        this.field3656 = arg0.field3656;
        this.field3657 = arg0.field3657;
        this.field3674 = arg0.field3674;
        this.field3659 = arg0.field3659;
        this.field3660 = arg0.field3660;
        this.field3665 = arg1.field3665;
        this.field3652 = arg1.field3652;
        this.field3653 = arg1.field3653;
        this.field3654 = arg1.field3654;
        this.field3650 = arg1.field3650;
        this.field3663 = arg1.field3663;
        this.field3661 = arg1.field3661;
        this.field3651 = arg1.field3651;
        this.field3668 = arg1.field3668;
        this.field3673 = arg1.field3673;
        this.field3677 = arg1.field3677;
        this.field3671 = arg1.field3671;
        this.field3662 = arg1.field3662;
        this.field3672 = arg1.field3672;
        this.field3676 = arg1.field3676;
        this.field3689 = arg1.field3689;
        this.field3678 = arg1.field3678;
        this.field3688 = arg1.field3688;
        this.field3664 = arg1.field3664;
        this.field3679 = new String[5];
        if (arg1.field3679 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3679[var3] = arg1.field3679[var3];
            }
        }
        this.field3679[4] = class252.field3133;
        this.field3691 = 0;
    }

    @ObfuscatedName("jx.k(Ljx;Ljx;I)V")
    public void method4754(class284 arg0, class284 arg1) {
        this.field3649 = arg0.field3649;
        this.field3682 = arg0.field3682;
        this.field3656 = arg0.field3656;
        this.field3657 = arg0.field3657;
        this.field3674 = arg0.field3674;
        this.field3659 = arg0.field3659;
        this.field3660 = arg0.field3660;
        this.field3665 = arg0.field3665;
        this.field3652 = arg0.field3652;
        this.field3653 = arg0.field3653;
        this.field3654 = arg0.field3654;
        this.field3661 = arg0.field3661;
        this.field3650 = arg1.field3650;
        this.field3691 = 0;
        this.field3663 = false;
        this.field3666 = false;
    }

    @ObfuscatedName("jx.s(II)Ldf;")
    public final class126 method4755(int arg0) {
        if (this.field3681 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3680[var3] && this.field3680[var3] != 0) {
                    var2 = this.field3681[var3];
                }
            }
            if (var2 != -1) {
                return method4245(var2).method4755(1);
            }
        }
        class126 var4 = class126.method2428(Statics.field3773, this.field3649, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3683 != 128 || this.field3648 != 128 || this.field3685 != 128) {
            var4.method2444(this.field3683, this.field3648, this.field3685);
        }
        if (this.field3665 != null) {
            for (int var5 = 0; var5 < this.field3665.length; var5++) {
                var4.method2441(this.field3665[var5], this.field3652[var5]);
            }
        }
        if (this.field3653 != null) {
            for (int var6 = 0; var6 < this.field3653.length; var6++) {
                var4.method2442(this.field3653[var6], this.field3654[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jx.x(II)Lel;")
    public final class132 method4756(int arg0) {
        if (this.field3681 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3680[var3] && this.field3680[var3] != 0) {
                    var2 = this.field3681[var3];
                }
            }
            if (var2 != -1) {
                return method4245(var2).method4756(1);
            }
        }
        class132 var4 = (class132) field3646.method3707((long) this.field3675);
        if (var4 != null) {
            return var4;
        }
        class126 var5 = class126.method2428(Statics.field3773, this.field3649, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3683 != 128 || this.field3648 != 128 || this.field3685 != 128) {
            var5.method2444(this.field3683, this.field3648, this.field3685);
        }
        if (this.field3665 != null) {
            for (int var6 = 0; var6 < this.field3665.length; var6++) {
                var5.method2441(this.field3665[var6], this.field3652[var6]);
            }
        }
        if (this.field3653 != null) {
            for (int var7 = 0; var7 < this.field3653.length; var7++) {
                var5.method2442(this.field3653[var7], this.field3654[var7]);
            }
        }
        class132 var8 = var5.method2449(this.field3670 + 64, this.field3687 + 768, -50, -10, -50);
        var8.field1860 = true;
        field3646.method3697(var8, (long) this.field3675);
        return var8;
    }

    @ObfuscatedName("jx.h(II)Ljx;")
    public class284 method4757(int arg0) {
        if (this.field3681 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3680[var3] && this.field3680[var3] != 0) {
                    var2 = this.field3681[var3];
                }
            }
            if (var2 != -1) {
                return method4245(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("jx.i(ZI)Z")
    public final boolean method4807(boolean arg0) {
        int var2 = this.field3651;
        int var3 = this.field3668;
        int var4 = this.field3673;
        if (arg0) {
            var2 = this.field3677;
            var3 = this.field3671;
            var4 = this.field3662;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3773.method4275(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3773.method4275(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3773.method4275(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jx.u(ZI)Ldf;")
    public final class126 method4788(boolean arg0) {
        int var2 = this.field3651;
        int var3 = this.field3668;
        int var4 = this.field3673;
        if (arg0) {
            var2 = this.field3677;
            var3 = this.field3671;
            var4 = this.field3662;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var5 = class126.method2428(Statics.field3773, var2, 0);
        if (var3 != -1) {
            class126 var6 = class126.method2428(Statics.field3773, var3, 0);
            if (var4 == -1) {
                class126[] var9 = new class126[] { var5, var6 };
                var5 = new class126(var9, 2);
            } else {
                class126 var7 = class126.method2428(Statics.field3773, var4, 0);
                class126[] var8 = new class126[] { var5, var6, var7 };
                var5 = new class126(var8, 3);
            }
        }
        if (!arg0 && this.field3658 != 0) {
            var5.method2440(0, this.field3658, 0);
        }
        if (arg0 && this.field3667 != 0) {
            var5.method2440(0, this.field3667, 0);
        }
        if (this.field3665 != null) {
            for (int var10 = 0; var10 < this.field3665.length; var10++) {
                var5.method2441(this.field3665[var10], this.field3652[var10]);
            }
        }
        if (this.field3653 != null) {
            for (int var11 = 0; var11 < this.field3653.length; var11++) {
                var5.method2442(this.field3653[var11], this.field3654[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jx.q(ZB)Z")
    public final boolean method4760(boolean arg0) {
        int var2 = this.field3672;
        int var3 = this.field3676;
        if (arg0) {
            var2 = this.field3689;
            var3 = this.field3678;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3773.method4275(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3773.method4275(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jx.v(ZB)Ldf;")
    public final class126 method4759(boolean arg0) {
        int var2 = this.field3672;
        int var3 = this.field3676;
        if (arg0) {
            var2 = this.field3689;
            var3 = this.field3678;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var4 = class126.method2428(Statics.field3773, var2, 0);
        if (var3 != -1) {
            class126 var5 = class126.method2428(Statics.field3773, var3, 0);
            class126[] var6 = new class126[] { var4, var5 };
            var4 = new class126(var6, 2);
        }
        if (this.field3665 != null) {
            for (int var7 = 0; var7 < this.field3665.length; var7++) {
                var4.method2441(this.field3665[var7], this.field3652[var7]);
            }
        }
        if (this.field3653 != null) {
            for (int var8 = 0; var8 < this.field3653.length; var8++) {
                var4.method2442(this.field3653[var8], this.field3654[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jx.f(III)I")
    public int method4802(int arg0, int arg1) {
        return class277.method619(this.field3690, arg0, arg1);
    }

    @ObfuscatedName("jx.b(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4763(int arg0, String arg1) {
        return class277.method3190(this.field3690, arg0, arg1);
    }

    @ObfuscatedName("jx.c(I)I")
    public int method4814() {
        if (this.field3640 == -1 || this.field3679 == null) {
            return -1;
        } else if (this.field3640 >= 0) {
            return this.field3679[this.field3640] == null ? -1 : this.field3640;
        } else if (class252.field3021.equalsIgnoreCase(this.field3679[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("j.w(I)V")
    public static void method143() {
        field3645.method3700();
        field3646.method3700();
        field3647.method3700();
    }
}
