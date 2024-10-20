package deob;

@ObfuscatedName("jh")
public class class284 extends class219 {

    @ObfuscatedName("jh.r")
    public static class213 field3640 = new class213(64);

    @ObfuscatedName("jh.d")
    public static class213 field3664 = new class213(50);

    @ObfuscatedName("jh.a")
    public static class213 field3644 = new class213(200);

    @ObfuscatedName("jh.f")
    public int field3643;

    @ObfuscatedName("jh.l")
    public int field3687;

    @ObfuscatedName("jh.m")
    public String field3645 = class252.field3012;

    @ObfuscatedName("jh.b")
    public short[] field3646;

    @ObfuscatedName("jh.h")
    public short[] field3676;

    @ObfuscatedName("jh.t")
    public short[] field3647;

    @ObfuscatedName("jh.v")
    public short[] field3663;

    @ObfuscatedName("jh.n")
    public int field3650 = 2000;

    @ObfuscatedName("jh.u")
    public int field3669 = 0;

    @ObfuscatedName("jh.q")
    public int field3641 = 0;

    @ObfuscatedName("jh.g")
    public int field3648 = 0;

    @ObfuscatedName("jh.y")
    public int field3654 = 0;

    @ObfuscatedName("jh.s")
    public int field3655 = 0;

    @ObfuscatedName("jh.ac")
    public int field3666 = 0;

    @ObfuscatedName("jh.ap")
    public int field3657 = 1;

    @ObfuscatedName("jh.al")
    public boolean field3658 = false;

    @ObfuscatedName("jh.ai")
    public String[] field3675 = new String[] { null, null, class252.field3013, null, null };

    @ObfuscatedName("jh.ab")
    public String[] field3660 = new String[] { null, null, null, null, class252.field3014 };

    @ObfuscatedName("jh.as")
    public int field3661 = -2;

    @ObfuscatedName("jh.aa")
    public int field3662 = -1;

    @ObfuscatedName("jh.ah")
    public int field3642 = -1;

    @ObfuscatedName("jh.ao")
    public int field3639 = 0;

    @ObfuscatedName("jh.am")
    public int field3665 = -1;

    @ObfuscatedName("jh.aq")
    public int field3656 = -1;

    @ObfuscatedName("jh.ae")
    public int field3667 = 0;

    @ObfuscatedName("jh.af")
    public int field3668 = -1;

    @ObfuscatedName("jh.aw")
    public int field3649 = -1;

    @ObfuscatedName("jh.ax")
    public int field3670 = -1;

    @ObfuscatedName("jh.ag")
    public int field3671 = -1;

    @ObfuscatedName("jh.ay")
    public int field3672 = -1;

    @ObfuscatedName("jh.ad")
    public int field3673 = -1;

    @ObfuscatedName("jh.at")
    public int[] field3674;

    @ObfuscatedName("jh.av")
    public int[] field3681;

    @ObfuscatedName("jh.az")
    public int field3685 = -1;

    @ObfuscatedName("jh.aj")
    public int field3677 = -1;

    @ObfuscatedName("jh.ar")
    public int field3659 = 128;

    @ObfuscatedName("jh.au")
    public int field3679 = 128;

    @ObfuscatedName("jh.an")
    public int field3680 = 128;

    @ObfuscatedName("jh.bv")
    public int field3653 = 0;

    @ObfuscatedName("jh.bw")
    public int field3682 = 0;

    @ObfuscatedName("jh.bj")
    public int field3683 = 0;

    @ObfuscatedName("jh.ba")
    public class210 field3684;

    @ObfuscatedName("jh.bl")
    public boolean field3652 = false;

    @ObfuscatedName("jh.br")
    public int field3686 = -1;

    @ObfuscatedName("jh.bh")
    public int field3651 = -1;

    @ObfuscatedName("jh.bf")
    public int field3688 = -1;

    @ObfuscatedName("jh.bu")
    public int field3637 = -1;

    @ObfuscatedName("ep.c(IB)Ljh;")
    public static class284 method2869(int arg0) {
        class284 var1 = (class284) field3640.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2143.method4190(10, arg0);
        class284 var3 = new class284();
        var3.field3643 = arg0;
        if (var2 != null) {
            var3.method4729(new class195(var2));
        }
        var3.method4681();
        if (var3.field3677 != -1) {
            var3.method4680(method2869(var3.field3677), method2869(var3.field3685));
        }
        if (var3.field3651 != -1) {
            var3.method4685(method2869(var3.field3651), method2869(var3.field3686));
        }
        if (var3.field3637 != -1) {
            var3.method4686(method2869(var3.field3637), method2869(var3.field3688));
        }
        if (!Statics.field2135 && var3.field3658) {
            var3.field3645 = class252.field3220;
            var3.field3652 = false;
            var3.field3675 = null;
            var3.field3660 = null;
            var3.field3661 = -1;
            var3.field3683 = 0;
            if (var3.field3684 != null) {
                boolean var4 = false;
                for (class217 var5 = var3.field3684.method3606(); var5 != null; var5 = var3.field3684.method3597()) {
                    class279 var6 = class279.method1444((int) var5.field2645);
                    if (var6.field3548) {
                        var5.method3710();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3684 = null;
                }
            }
        }
        field3640.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.i(I)V")
    public void method4681() {
    }

    @ObfuscatedName("jh.o(Lgp;I)V")
    public void method4729(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4683(arg0, var2);
        }
    }

    @ObfuscatedName("jh.j(Lgp;II)V")
    public void method4683(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3687 = arg0.method3218();
        } else if (arg1 == 2) {
            this.field3645 = arg0.method3427();
        } else if (arg1 == 4) {
            this.field3650 = arg0.method3218();
        } else if (arg1 == 5) {
            this.field3669 = arg0.method3218();
        } else if (arg1 == 6) {
            this.field3641 = arg0.method3218();
        } else if (arg1 == 7) {
            this.field3654 = arg0.method3218();
            if (this.field3654 > 32767) {
                this.field3654 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3655 = arg0.method3218();
            if (this.field3655 > 32767) {
                this.field3655 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3666 = 1;
        } else if (arg1 == 12) {
            this.field3657 = arg0.method3230();
        } else if (arg1 == 16) {
            this.field3658 = true;
        } else if (arg1 == 23) {
            this.field3662 = arg0.method3218();
            this.field3639 = arg0.method3429();
        } else if (arg1 == 24) {
            this.field3642 = arg0.method3218();
        } else if (arg1 == 25) {
            this.field3665 = arg0.method3218();
            this.field3667 = arg0.method3429();
        } else if (arg1 == 26) {
            this.field3656 = arg0.method3218();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3675[arg1 - 30] = arg0.method3427();
            if (this.field3675[arg1 - 30].equalsIgnoreCase(class252.field3015)) {
                this.field3675[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3660[arg1 - 35] = arg0.method3427();
        } else if (arg1 == 40) {
            int var3 = arg0.method3429();
            this.field3646 = new short[var3];
            this.field3676 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3646[var4] = (short) arg0.method3218();
                this.field3676[var4] = (short) arg0.method3218();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3429();
            this.field3647 = new short[var5];
            this.field3663 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3647[var6] = (short) arg0.method3218();
                this.field3663[var6] = (short) arg0.method3218();
            }
        } else if (arg1 == 42) {
            this.field3661 = arg0.method3226();
        } else if (arg1 == 65) {
            this.field3652 = true;
        } else if (arg1 == 78) {
            this.field3668 = arg0.method3218();
        } else if (arg1 == 79) {
            this.field3649 = arg0.method3218();
        } else if (arg1 == 90) {
            this.field3670 = arg0.method3218();
        } else if (arg1 == 91) {
            this.field3672 = arg0.method3218();
        } else if (arg1 == 92) {
            this.field3671 = arg0.method3218();
        } else if (arg1 == 93) {
            this.field3673 = arg0.method3218();
        } else if (arg1 == 95) {
            this.field3648 = arg0.method3218();
        } else if (arg1 == 97) {
            this.field3685 = arg0.method3218();
        } else if (arg1 == 98) {
            this.field3677 = arg0.method3218();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3674 == null) {
                this.field3674 = new int[10];
                this.field3681 = new int[10];
            }
            this.field3674[arg1 - 100] = arg0.method3218();
            this.field3681[arg1 - 100] = arg0.method3218();
        } else if (arg1 == 110) {
            this.field3659 = arg0.method3218();
        } else if (arg1 == 111) {
            this.field3679 = arg0.method3218();
        } else if (arg1 == 112) {
            this.field3680 = arg0.method3218();
        } else if (arg1 == 113) {
            this.field3653 = arg0.method3226();
        } else if (arg1 == 114) {
            this.field3682 = arg0.method3226() * 5;
        } else if (arg1 == 115) {
            this.field3683 = arg0.method3429();
        } else if (arg1 == 139) {
            this.field3686 = arg0.method3218();
        } else if (arg1 == 140) {
            this.field3651 = arg0.method3218();
        } else if (arg1 == 148) {
            this.field3688 = arg0.method3218();
        } else if (arg1 == 149) {
            this.field3637 = arg0.method3218();
        } else if (arg1 == 249) {
            this.field3684 = class277.method4160(arg0, this.field3684);
        }
    }

    @ObfuscatedName("jh.k(Ljh;Ljh;S)V")
    public void method4680(class284 arg0, class284 arg1) {
        this.field3687 = arg0.field3687;
        this.field3650 = arg0.field3650;
        this.field3669 = arg0.field3669;
        this.field3641 = arg0.field3641;
        this.field3648 = arg0.field3648;
        this.field3654 = arg0.field3654;
        this.field3655 = arg0.field3655;
        this.field3646 = arg0.field3646;
        this.field3676 = arg0.field3676;
        this.field3647 = arg0.field3647;
        this.field3663 = arg0.field3663;
        this.field3645 = arg1.field3645;
        this.field3658 = arg1.field3658;
        this.field3657 = arg1.field3657;
        this.field3666 = 1;
    }

    @ObfuscatedName("jh.x(Ljh;Ljh;I)V")
    public void method4685(class284 arg0, class284 arg1) {
        this.field3687 = arg0.field3687;
        this.field3650 = arg0.field3650;
        this.field3669 = arg0.field3669;
        this.field3641 = arg0.field3641;
        this.field3648 = arg0.field3648;
        this.field3654 = arg0.field3654;
        this.field3655 = arg0.field3655;
        this.field3646 = arg1.field3646;
        this.field3676 = arg1.field3676;
        this.field3647 = arg1.field3647;
        this.field3663 = arg1.field3663;
        this.field3645 = arg1.field3645;
        this.field3658 = arg1.field3658;
        this.field3666 = arg1.field3666;
        this.field3662 = arg1.field3662;
        this.field3642 = arg1.field3642;
        this.field3668 = arg1.field3668;
        this.field3665 = arg1.field3665;
        this.field3656 = arg1.field3656;
        this.field3649 = arg1.field3649;
        this.field3670 = arg1.field3670;
        this.field3671 = arg1.field3671;
        this.field3672 = arg1.field3672;
        this.field3673 = arg1.field3673;
        this.field3683 = arg1.field3683;
        this.field3675 = arg1.field3675;
        this.field3660 = new String[5];
        if (arg1.field3660 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3660[var3] = arg1.field3660[var3];
            }
        }
        this.field3660[4] = class252.field3019;
        this.field3657 = 0;
    }

    @ObfuscatedName("jh.z(Ljh;Ljh;I)V")
    public void method4686(class284 arg0, class284 arg1) {
        this.field3687 = arg0.field3687;
        this.field3650 = arg0.field3650;
        this.field3669 = arg0.field3669;
        this.field3641 = arg0.field3641;
        this.field3648 = arg0.field3648;
        this.field3654 = arg0.field3654;
        this.field3655 = arg0.field3655;
        this.field3646 = arg0.field3646;
        this.field3676 = arg0.field3676;
        this.field3647 = arg0.field3647;
        this.field3663 = arg0.field3663;
        this.field3666 = arg0.field3666;
        this.field3645 = arg1.field3645;
        this.field3657 = 0;
        this.field3658 = false;
        this.field3652 = false;
    }

    @ObfuscatedName("jh.p(IB)Ldj;")
    public final class126 method4684(int arg0) {
        if (this.field3674 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3681[var3] && this.field3681[var3] != 0) {
                    var2 = this.field3674[var3];
                }
            }
            if (var2 != -1) {
                return method2869(var2).method4684(1);
            }
        }
        class126 var4 = class126.method2371(Statics.field3689, this.field3687, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3659 != 128 || this.field3679 != 128 || this.field3680 != 128) {
            var4.method2432(this.field3659, this.field3679, this.field3680);
        }
        if (this.field3646 != null) {
            for (int var5 = 0; var5 < this.field3646.length; var5++) {
                var4.method2383(this.field3646[var5], this.field3676[var5]);
            }
        }
        if (this.field3647 != null) {
            for (int var6 = 0; var6 < this.field3647.length; var6++) {
                var4.method2448(this.field3647[var6], this.field3663[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jh.w(II)Led;")
    public final class132 method4688(int arg0) {
        if (this.field3674 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3681[var3] && this.field3681[var3] != 0) {
                    var2 = this.field3674[var3];
                }
            }
            if (var2 != -1) {
                return method2869(var2).method4688(1);
            }
        }
        class132 var4 = (class132) field3664.method3625((long) this.field3643);
        if (var4 != null) {
            return var4;
        }
        class126 var5 = class126.method2371(Statics.field3689, this.field3687, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3659 != 128 || this.field3679 != 128 || this.field3680 != 128) {
            var5.method2432(this.field3659, this.field3679, this.field3680);
        }
        if (this.field3646 != null) {
            for (int var6 = 0; var6 < this.field3646.length; var6++) {
                var5.method2383(this.field3646[var6], this.field3676[var6]);
            }
        }
        if (this.field3647 != null) {
            for (int var7 = 0; var7 < this.field3647.length; var7++) {
                var5.method2448(this.field3647[var7], this.field3663[var7]);
            }
        }
        class132 var8 = var5.method2384(this.field3653 + 64, this.field3682 + 768, -50, -10, -50);
        var8.field1851 = true;
        field3664.method3628(var8, (long) this.field3643);
        return var8;
    }

    @ObfuscatedName("jh.r(II)Ljh;")
    public class284 method4689(int arg0) {
        if (this.field3674 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3681[var3] && this.field3681[var3] != 0) {
                    var2 = this.field3674[var3];
                }
            }
            if (var2 != -1) {
                return method2869(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cr.d(IIIIIZI)Lla;")
    public static final class332 method1795(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class332 var8 = (class332) field3644.method3625(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class284 var9 = method2869(arg0);
        if (arg1 > 1 && var9.field3674 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3681[var11] && var9.field3681[var11] != 0) {
                    var10 = var9.field3674[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2869(var10);
            }
        }
        class132 var12 = var9.method4688(1);
        if (var12 == null) {
            return null;
        }
        class332 var13 = null;
        if (var9.field3677 != -1) {
            var13 = method1795(var9.field3685, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3651 != -1) {
            var13 = method1795(var9.field3686, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3637 != -1) {
            var13 = method1795(var9.field3688, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3959;
        int var15 = Statics.field3955;
        int var16 = Statics.field3958;
        int[] var17 = new int[4];
        class328.method5353(var17);
        class332 var18 = new class332(36, 32);
        class328.method5313(var18.field3987, 36, 32);
        class328.method5380();
        class135.method2580();
        class135.method2583(16, 16);
        class135.field1931 = false;
        if (var9.field3637 != -1) {
            var13.method5438(0, 0);
        }
        int var19 = var9.field3650;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class135.field1956[var9.field3669] * var19 >> 16;
        int var21 = class135.field1934[var9.field3669] * var19 >> 16;
        var12.method2475();
        var12.method2488(0, var9.field3641, var9.field3648, var9.field3669, var9.field3654, var9.field3655 + var12.field2043 / 2 + var20, var9.field3655 + var21);
        if (var9.field3651 != -1) {
            var13.method5438(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5439(1);
        }
        if (arg2 >= 2) {
            var18.method5439(16777215);
        }
        if (arg3 != 0) {
            var18.method5436(arg3);
        }
        class328.method5313(var18.field3987, 36, 32);
        if (var9.field3677 != -1) {
            var13.method5438(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3666 == 1) {
            class312 var22 = Statics.field2768;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class252.field3177 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class252.field3175 + "</col>";
            }
            var22.method5111(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3644.method3628(var18, var6);
        }
        class328.method5313(var14, var15, var16);
        class328.method5318(var17);
        class135.method2580();
        class135.field1931 = true;
        return var18;
    }

    @ObfuscatedName("jh.a(ZI)Z")
    public final boolean method4690(boolean arg0) {
        int var2 = this.field3662;
        int var3 = this.field3642;
        int var4 = this.field3668;
        if (arg0) {
            var2 = this.field3665;
            var3 = this.field3656;
            var4 = this.field3649;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3689.method4209(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3689.method4209(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3689.method4209(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jh.b(ZB)Ldj;")
    public final class126 method4706(boolean arg0) {
        int var2 = this.field3662;
        int var3 = this.field3642;
        int var4 = this.field3668;
        if (arg0) {
            var2 = this.field3665;
            var3 = this.field3656;
            var4 = this.field3649;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var5 = class126.method2371(Statics.field3689, var2, 0);
        if (var3 != -1) {
            class126 var6 = class126.method2371(Statics.field3689, var3, 0);
            if (var4 == -1) {
                class126[] var9 = new class126[] { var5, var6 };
                var5 = new class126(var9, 2);
            } else {
                class126 var7 = class126.method2371(Statics.field3689, var4, 0);
                class126[] var8 = new class126[] { var5, var6, var7 };
                var5 = new class126(var8, 3);
            }
        }
        if (!arg0 && this.field3639 != 0) {
            var5.method2435(0, this.field3639, 0);
        }
        if (arg0 && this.field3667 != 0) {
            var5.method2435(0, this.field3667, 0);
        }
        if (this.field3646 != null) {
            for (int var10 = 0; var10 < this.field3646.length; var10++) {
                var5.method2383(this.field3646[var10], this.field3676[var10]);
            }
        }
        if (this.field3647 != null) {
            for (int var11 = 0; var11 < this.field3647.length; var11++) {
                var5.method2448(this.field3647[var11], this.field3663[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jh.h(ZI)Z")
    public final boolean method4691(boolean arg0) {
        int var2 = this.field3670;
        int var3 = this.field3671;
        if (arg0) {
            var2 = this.field3672;
            var3 = this.field3673;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3689.method4209(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3689.method4209(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jh.n(ZI)Ldj;")
    public final class126 method4693(boolean arg0) {
        int var2 = this.field3670;
        int var3 = this.field3671;
        if (arg0) {
            var2 = this.field3672;
            var3 = this.field3673;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var4 = class126.method2371(Statics.field3689, var2, 0);
        if (var3 != -1) {
            class126 var5 = class126.method2371(Statics.field3689, var3, 0);
            class126[] var6 = new class126[] { var4, var5 };
            var4 = new class126(var6, 2);
        }
        if (this.field3646 != null) {
            for (int var7 = 0; var7 < this.field3646.length; var7++) {
                var4.method2383(this.field3646[var7], this.field3676[var7]);
            }
        }
        if (this.field3647 != null) {
            for (int var8 = 0; var8 < this.field3647.length; var8++) {
                var4.method2448(this.field3647[var8], this.field3663[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jh.u(III)I")
    public int method4694(int arg0, int arg1) {
        return class277.method180(this.field3684, arg0, arg1);
    }

    @ObfuscatedName("jh.q(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4695(int arg0, String arg1) {
        return class277.method2942(this.field3684, arg0, arg1);
    }

    @ObfuscatedName("jh.g(I)I")
    public int method4696() {
        if (this.field3661 == -1 || this.field3660 == null) {
            return -1;
        } else if (this.field3661 >= 0) {
            return this.field3660[this.field3661] == null ? -1 : this.field3661;
        } else if (class252.field3014.equalsIgnoreCase(this.field3660[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("az.y(I)V")
    public static void method663() {
        field3640.method3629();
        field3664.method3629();
        field3644.method3629();
    }

    @ObfuscatedName("ey.s(I)V")
    public static void method2911() {
        field3644.method3629();
    }
}
