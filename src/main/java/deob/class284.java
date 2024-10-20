package deob;

@ObfuscatedName("jy")
public class class284 extends class219 {

    @ObfuscatedName("jy.g")
    public static class213 field3651 = new class213(64);

    @ObfuscatedName("jy.n")
    public static class213 field3652 = new class213(50);

    @ObfuscatedName("jy.o")
    public static class213 field3653 = new class213(200);

    @ObfuscatedName("jy.v")
    public int field3654;

    @ObfuscatedName("jy.u")
    public int field3686;

    @ObfuscatedName("jy.j")
    public String field3656 = class252.field3052;

    @ObfuscatedName("jy.k")
    public short[] field3657;

    @ObfuscatedName("jy.z")
    public short[] field3658;

    @ObfuscatedName("jy.w")
    public short[] field3659;

    @ObfuscatedName("jy.s")
    public short[] field3675;

    @ObfuscatedName("jy.d")
    public int field3661 = 2000;

    @ObfuscatedName("jy.f")
    public int field3649 = 0;

    @ObfuscatedName("jy.r")
    public int field3663 = 0;

    @ObfuscatedName("jy.y")
    public int field3664 = 0;

    @ObfuscatedName("jy.h")
    public int field3665 = 0;

    @ObfuscatedName("jy.m")
    public int field3662 = 0;

    @ObfuscatedName("jy.ay")
    public int field3646 = 0;

    @ObfuscatedName("jy.ao")
    public int field3668 = 1;

    @ObfuscatedName("jy.av")
    public boolean field3669 = false;

    @ObfuscatedName("jy.aj")
    public String[] field3655 = new String[] { null, null, class252.field3022, null, null };

    @ObfuscatedName("jy.ae")
    public String[] field3671 = new String[] { null, null, null, null, class252.field3286 };

    @ObfuscatedName("jy.az")
    public int field3647 = -2;

    @ObfuscatedName("jy.ap")
    public int field3673 = -1;

    @ObfuscatedName("jy.ah")
    public int field3693 = -1;

    @ObfuscatedName("jy.au")
    public int field3672 = 0;

    @ObfuscatedName("jy.ax")
    public int field3676 = -1;

    @ObfuscatedName("jy.ar")
    public int field3677 = -1;

    @ObfuscatedName("jy.an")
    public int field3678 = 0;

    @ObfuscatedName("jy.ai")
    public int field3679 = -1;

    @ObfuscatedName("jy.al")
    public int field3666 = -1;

    @ObfuscatedName("jy.at")
    public int field3681 = -1;

    @ObfuscatedName("jy.ag")
    public int field3682 = -1;

    @ObfuscatedName("jy.as")
    public int field3680 = -1;

    @ObfuscatedName("jy.aw")
    public int field3674 = -1;

    @ObfuscatedName("jy.aq")
    public int[] field3685;

    @ObfuscatedName("jy.aa")
    public int[] field3684;

    @ObfuscatedName("jy.af")
    public int field3687 = -1;

    @ObfuscatedName("jy.ak")
    public int field3688 = -1;

    @ObfuscatedName("jy.ab")
    public int field3660 = 128;

    @ObfuscatedName("jy.ac")
    public int field3670 = 128;

    @ObfuscatedName("jy.ad")
    public int field3691 = 128;

    @ObfuscatedName("jy.bg")
    public int field3692 = 0;

    @ObfuscatedName("jy.br")
    public int field3689 = 0;

    @ObfuscatedName("jy.ba")
    public int field3683 = 0;

    @ObfuscatedName("jy.bk")
    public class210 field3695;

    @ObfuscatedName("jy.be")
    public boolean field3696 = false;

    @ObfuscatedName("jy.bc")
    public int field3697 = -1;

    @ObfuscatedName("jy.bm")
    public int field3698 = -1;

    @ObfuscatedName("jy.bh")
    public int field3699 = -1;

    @ObfuscatedName("jy.bs")
    public int field3700 = -1;

    @ObfuscatedName("cs.t(IB)Ljy;")
    public static class284 method1694(int arg0) {
        class284 var1 = (class284) field3651.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3667.method4265(10, arg0);
        class284 var3 = new class284();
        var3.field3654 = arg0;
        if (var2 != null) {
            var3.method4653(new class195(var2));
        }
        var3.method4652();
        if (var3.field3688 != -1) {
            var3.method4655(method1694(var3.field3688), method1694(var3.field3687));
        }
        if (var3.field3698 != -1) {
            var3.method4656(method1694(var3.field3698), method1694(var3.field3697));
        }
        if (var3.field3700 != -1) {
            var3.method4686(method1694(var3.field3700), method1694(var3.field3699));
        }
        if (!Statics.field296 && var3.field3669) {
            var3.field3656 = class252.field3027;
            var3.field3696 = false;
            var3.field3655 = null;
            var3.field3671 = null;
            var3.field3647 = -1;
            var3.field3683 = 0;
            if (var3.field3695 != null) {
                boolean var4 = false;
                for (class217 var5 = var3.field3695.method3595(); var5 != null; var5 = var3.field3695.method3599()) {
                    class279 var6 = class279.method1768((int) var5.field2636);
                    if (var6.field3553) {
                        var5.method3721();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3695 = null;
                }
            }
        }
        field3651.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.q(I)V")
    public void method4652() {
    }

    @ObfuscatedName("jy.i(Lgb;B)V")
    public void method4653(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4666(arg0, var2);
        }
    }

    @ObfuscatedName("jy.a(Lgb;II)V")
    public void method4666(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3686 = arg0.method3238();
        } else if (arg1 == 2) {
            this.field3656 = arg0.method3257();
        } else if (arg1 == 4) {
            this.field3661 = arg0.method3238();
        } else if (arg1 == 5) {
            this.field3649 = arg0.method3238();
        } else if (arg1 == 6) {
            this.field3663 = arg0.method3238();
        } else if (arg1 == 7) {
            this.field3665 = arg0.method3238();
            if (this.field3665 > 32767) {
                this.field3665 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3662 = arg0.method3238();
            if (this.field3662 > 32767) {
                this.field3662 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3646 = 1;
        } else if (arg1 == 12) {
            this.field3668 = arg0.method3241();
        } else if (arg1 == 16) {
            this.field3669 = true;
        } else if (arg1 == 23) {
            this.field3673 = arg0.method3238();
            this.field3672 = arg0.method3236();
        } else if (arg1 == 24) {
            this.field3693 = arg0.method3238();
        } else if (arg1 == 25) {
            this.field3676 = arg0.method3238();
            this.field3678 = arg0.method3236();
        } else if (arg1 == 26) {
            this.field3677 = arg0.method3238();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3655[arg1 - 30] = arg0.method3257();
            if (this.field3655[arg1 - 30].equalsIgnoreCase(class252.field3024)) {
                this.field3655[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3671[arg1 - 35] = arg0.method3257();
        } else if (arg1 == 40) {
            int var3 = arg0.method3236();
            this.field3657 = new short[var3];
            this.field3658 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3657[var4] = (short) arg0.method3238();
                this.field3658[var4] = (short) arg0.method3238();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3236();
            this.field3659 = new short[var5];
            this.field3675 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3659[var6] = (short) arg0.method3238();
                this.field3675[var6] = (short) arg0.method3238();
            }
        } else if (arg1 == 42) {
            this.field3647 = arg0.method3237();
        } else if (arg1 == 65) {
            this.field3696 = true;
        } else if (arg1 == 78) {
            this.field3679 = arg0.method3238();
        } else if (arg1 == 79) {
            this.field3666 = arg0.method3238();
        } else if (arg1 == 90) {
            this.field3681 = arg0.method3238();
        } else if (arg1 == 91) {
            this.field3680 = arg0.method3238();
        } else if (arg1 == 92) {
            this.field3682 = arg0.method3238();
        } else if (arg1 == 93) {
            this.field3674 = arg0.method3238();
        } else if (arg1 == 95) {
            this.field3664 = arg0.method3238();
        } else if (arg1 == 97) {
            this.field3687 = arg0.method3238();
        } else if (arg1 == 98) {
            this.field3688 = arg0.method3238();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3685 == null) {
                this.field3685 = new int[10];
                this.field3684 = new int[10];
            }
            this.field3685[arg1 - 100] = arg0.method3238();
            this.field3684[arg1 - 100] = arg0.method3238();
        } else if (arg1 == 110) {
            this.field3660 = arg0.method3238();
        } else if (arg1 == 111) {
            this.field3670 = arg0.method3238();
        } else if (arg1 == 112) {
            this.field3691 = arg0.method3238();
        } else if (arg1 == 113) {
            this.field3692 = arg0.method3237();
        } else if (arg1 == 114) {
            this.field3689 = arg0.method3237();
        } else if (arg1 == 115) {
            this.field3683 = arg0.method3236();
        } else if (arg1 == 139) {
            this.field3697 = arg0.method3238();
        } else if (arg1 == 140) {
            this.field3698 = arg0.method3238();
        } else if (arg1 == 148) {
            this.field3699 = arg0.method3238();
        } else if (arg1 == 149) {
            this.field3700 = arg0.method3238();
        } else if (arg1 == 249) {
            this.field3695 = class277.method6(arg0, this.field3695);
        }
    }

    @ObfuscatedName("jy.l(Ljy;Ljy;I)V")
    public void method4655(class284 arg0, class284 arg1) {
        this.field3686 = arg0.field3686;
        this.field3661 = arg0.field3661;
        this.field3649 = arg0.field3649;
        this.field3663 = arg0.field3663;
        this.field3664 = arg0.field3664;
        this.field3665 = arg0.field3665;
        this.field3662 = arg0.field3662;
        this.field3657 = arg0.field3657;
        this.field3658 = arg0.field3658;
        this.field3659 = arg0.field3659;
        this.field3675 = arg0.field3675;
        this.field3656 = arg1.field3656;
        this.field3669 = arg1.field3669;
        this.field3668 = arg1.field3668;
        this.field3646 = 1;
    }

    @ObfuscatedName("jy.b(Ljy;Ljy;I)V")
    public void method4656(class284 arg0, class284 arg1) {
        this.field3686 = arg0.field3686;
        this.field3661 = arg0.field3661;
        this.field3649 = arg0.field3649;
        this.field3663 = arg0.field3663;
        this.field3664 = arg0.field3664;
        this.field3665 = arg0.field3665;
        this.field3662 = arg0.field3662;
        this.field3657 = arg1.field3657;
        this.field3658 = arg1.field3658;
        this.field3659 = arg1.field3659;
        this.field3675 = arg1.field3675;
        this.field3656 = arg1.field3656;
        this.field3669 = arg1.field3669;
        this.field3646 = arg1.field3646;
        this.field3673 = arg1.field3673;
        this.field3693 = arg1.field3693;
        this.field3679 = arg1.field3679;
        this.field3676 = arg1.field3676;
        this.field3677 = arg1.field3677;
        this.field3666 = arg1.field3666;
        this.field3681 = arg1.field3681;
        this.field3682 = arg1.field3682;
        this.field3680 = arg1.field3680;
        this.field3674 = arg1.field3674;
        this.field3683 = arg1.field3683;
        this.field3655 = arg1.field3655;
        this.field3671 = new String[5];
        if (arg1.field3671 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3671[var3] = arg1.field3671[var3];
            }
        }
        this.field3671[4] = class252.field3201;
        this.field3668 = 0;
    }

    @ObfuscatedName("jy.e(Ljy;Ljy;I)V")
    public void method4686(class284 arg0, class284 arg1) {
        this.field3686 = arg0.field3686;
        this.field3661 = arg0.field3661;
        this.field3649 = arg0.field3649;
        this.field3663 = arg0.field3663;
        this.field3664 = arg0.field3664;
        this.field3665 = arg0.field3665;
        this.field3662 = arg0.field3662;
        this.field3657 = arg0.field3657;
        this.field3658 = arg0.field3658;
        this.field3659 = arg0.field3659;
        this.field3675 = arg0.field3675;
        this.field3646 = arg0.field3646;
        this.field3656 = arg1.field3656;
        this.field3668 = 0;
        this.field3669 = false;
        this.field3696 = false;
    }

    @ObfuscatedName("jy.x(II)Ldi;")
    public final class126 method4695(int arg0) {
        if (this.field3685 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3684[var3] && this.field3684[var3] != 0) {
                    var2 = this.field3685[var3];
                }
            }
            if (var2 != -1) {
                return method1694(var2).method4695(1);
            }
        }
        class126 var4 = class126.method2374(Statics.field3650, this.field3686, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3660 != 128 || this.field3670 != 128 || this.field3691 != 128) {
            var4.method2390(this.field3660, this.field3670, this.field3691);
        }
        if (this.field3657 != null) {
            for (int var5 = 0; var5 < this.field3657.length; var5++) {
                var4.method2435(this.field3657[var5], this.field3658[var5]);
            }
        }
        if (this.field3659 != null) {
            for (int var6 = 0; var6 < this.field3659.length; var6++) {
                var4.method2389(this.field3659[var6], this.field3675[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jy.p(II)Lek;")
    public final class132 method4659(int arg0) {
        if (this.field3685 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3684[var3] && this.field3684[var3] != 0) {
                    var2 = this.field3685[var3];
                }
            }
            if (var2 != -1) {
                return method1694(var2).method4659(1);
            }
        }
        class132 var4 = (class132) field3652.method3625((long) this.field3654);
        if (var4 != null) {
            return var4;
        }
        class126 var5 = class126.method2374(Statics.field3650, this.field3686, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3660 != 128 || this.field3670 != 128 || this.field3691 != 128) {
            var5.method2390(this.field3660, this.field3670, this.field3691);
        }
        if (this.field3657 != null) {
            for (int var6 = 0; var6 < this.field3657.length; var6++) {
                var5.method2435(this.field3657[var6], this.field3658[var6]);
            }
        }
        if (this.field3659 != null) {
            for (int var7 = 0; var7 < this.field3659.length; var7++) {
                var5.method2389(this.field3659[var7], this.field3675[var7]);
            }
        }
        class132 var8 = var5.method2395(this.field3692 + 64, this.field3689 * 5 + 768, -50, -10, -50);
        var8.field1850 = true;
        field3652.method3627(var8, (long) this.field3654);
        return var8;
    }

    @ObfuscatedName("jy.o(II)Ljy;")
    public class284 method4662(int arg0) {
        if (this.field3685 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3684[var3] && this.field3684[var3] != 0) {
                    var2 = this.field3685[var3];
                }
            }
            if (var2 != -1) {
                return method1694(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("m.c(IIIIIZI)Lla;")
    public static final class332 method184(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class332 var8 = (class332) field3653.method3625(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class284 var9 = method1694(arg0);
        if (arg1 > 1 && var9.field3685 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3684[var11] && var9.field3684[var11] != 0) {
                    var10 = var9.field3685[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1694(var10);
            }
        }
        class132 var12 = var9.method4659(1);
        if (var12 == null) {
            return null;
        }
        class332 var13 = null;
        if (var9.field3688 != -1) {
            var13 = method184(var9.field3687, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3698 != -1) {
            var13 = method184(var9.field3697, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3700 != -1) {
            var13 = method184(var9.field3699, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3964;
        int var15 = Statics.field3959;
        int var16 = Statics.field3958;
        int[] var17 = new int[4];
        class328.method5269(var17);
        class332 var18 = new class332(36, 32);
        class328.method5265(var18.field3986, 36, 32);
        class328.method5294();
        class135.method2617();
        class135.method2560(16, 16);
        class135.field1917 = false;
        if (var9.field3700 != -1) {
            var13.method5445(0, 0);
        }
        int var19 = var9.field3661;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class135.field1935[var9.field3649] * var19 >> 16;
        int var21 = class135.field1936[var9.field3649] * var19 >> 16;
        var12.method2485();
        var12.method2482(0, var9.field3663, var9.field3664, var9.field3649, var9.field3665, var9.field3662 + var12.field2020 / 2 + var20, var9.field3662 + var21);
        if (var9.field3698 != -1) {
            var13.method5445(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5394(1);
        }
        if (arg2 >= 2) {
            var18.method5394(16777215);
        }
        if (arg3 != 0) {
            var18.method5442(arg3);
        }
        class328.method5265(var18.field3986, 36, 32);
        if (var9.field3688 != -1) {
            var13.method5445(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3646 == 1) {
            Statics.field1591.method5073(method1507(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3653.method3627(var18, var6);
        }
        class328.method5265(var14, var15, var16);
        class328.method5264(var17);
        class135.method2617();
        class135.field1917 = true;
        return var18;
    }

    @ObfuscatedName("client.u(II)Ljava/lang/String;")
    public static final String method1507(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class252.field3021 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class252.field3148 + "</col>";
        }
    }

    @ObfuscatedName("jy.k(ZB)Z")
    public final boolean method4660(boolean arg0) {
        int var2 = this.field3673;
        int var3 = this.field3693;
        int var4 = this.field3679;
        if (arg0) {
            var2 = this.field3676;
            var3 = this.field3677;
            var4 = this.field3666;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3650.method4194(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3650.method4194(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3650.method4194(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jy.z(ZI)Ldi;")
    public final class126 method4661(boolean arg0) {
        int var2 = this.field3673;
        int var3 = this.field3693;
        int var4 = this.field3679;
        if (arg0) {
            var2 = this.field3676;
            var3 = this.field3677;
            var4 = this.field3666;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var5 = class126.method2374(Statics.field3650, var2, 0);
        if (var3 != -1) {
            class126 var6 = class126.method2374(Statics.field3650, var3, 0);
            if (var4 == -1) {
                class126[] var9 = new class126[] { var5, var6 };
                var5 = new class126(var9, 2);
            } else {
                class126 var7 = class126.method2374(Statics.field3650, var4, 0);
                class126[] var8 = new class126[] { var5, var6, var7 };
                var5 = new class126(var8, 3);
            }
        }
        if (!arg0 && this.field3672 != 0) {
            var5.method2387(0, this.field3672, 0);
        }
        if (arg0 && this.field3678 != 0) {
            var5.method2387(0, this.field3678, 0);
        }
        if (this.field3657 != null) {
            for (int var10 = 0; var10 < this.field3657.length; var10++) {
                var5.method2435(this.field3657[var10], this.field3658[var10]);
            }
        }
        if (this.field3659 != null) {
            for (int var11 = 0; var11 < this.field3659.length; var11++) {
                var5.method2389(this.field3659[var11], this.field3675[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jy.w(ZI)Z")
    public final boolean method4658(boolean arg0) {
        int var2 = this.field3681;
        int var3 = this.field3682;
        if (arg0) {
            var2 = this.field3680;
            var3 = this.field3674;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3650.method4194(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3650.method4194(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jy.s(ZI)Ldi;")
    public final class126 method4663(boolean arg0) {
        int var2 = this.field3681;
        int var3 = this.field3682;
        if (arg0) {
            var2 = this.field3680;
            var3 = this.field3674;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var4 = class126.method2374(Statics.field3650, var2, 0);
        if (var3 != -1) {
            class126 var5 = class126.method2374(Statics.field3650, var3, 0);
            class126[] var6 = new class126[] { var4, var5 };
            var4 = new class126(var6, 2);
        }
        if (this.field3657 != null) {
            for (int var7 = 0; var7 < this.field3657.length; var7++) {
                var4.method2435(this.field3657[var7], this.field3658[var7]);
            }
        }
        if (this.field3659 != null) {
            for (int var8 = 0; var8 < this.field3659.length; var8++) {
                var4.method2389(this.field3659[var8], this.field3675[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jy.d(III)I")
    public int method4664(int arg0, int arg1) {
        return class277.method4894(this.field3695, arg0, arg1);
    }

    @ObfuscatedName("jy.f(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4665(int arg0, String arg1) {
        class210 var3 = this.field3695;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class208 var5 = (class208) var3.method3594((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2609;
            }
        }
        return var4;
    }

    @ObfuscatedName("jy.r(I)I")
    public int method4693() {
        if (this.field3647 == -1 || this.field3671 == null) {
            return -1;
        } else if (this.field3647 >= 0) {
            return this.field3671[this.field3647] == null ? -1 : this.field3647;
        } else if (class252.field3286.equalsIgnoreCase(this.field3671[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("is.y(ZI)V")
    public static void method4092(boolean arg0) {
        if (Statics.field296 != arg0) {
            field3651.method3632();
            field3652.method3632();
            field3653.method3632();
            Statics.field296 = arg0;
        }
    }
}
