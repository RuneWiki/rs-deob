package deob;

@ObfuscatedName("ko")
public class class296 extends class346 {

    @ObfuscatedName("ko.n")
    public static class199 field3645 = new class199(64);

    @ObfuscatedName("ko.l")
    public static class199 field3692 = new class199(50);

    @ObfuscatedName("ko.m")
    public static class199 field3647 = new class199(200);

    @ObfuscatedName("ko.c")
    public int field3648;

    @ObfuscatedName("ko.j")
    public int field3649;

    @ObfuscatedName("ko.r")
    public String field3691 = class246.field2920;

    @ObfuscatedName("ko.q")
    public short[] field3694;

    @ObfuscatedName("ko.t")
    public short[] field3652;

    @ObfuscatedName("ko.v")
    public short[] field3651;

    @ObfuscatedName("ko.x")
    public short[] field3687;

    @ObfuscatedName("ko.z")
    public int field3655 = 2000;

    @ObfuscatedName("ko.i")
    public int field3679 = 0;

    @ObfuscatedName("ko.a")
    public int field3650 = 0;

    @ObfuscatedName("ko.w")
    public int field3658 = 0;

    @ObfuscatedName("ko.s")
    public int field3662 = 0;

    @ObfuscatedName("ko.y")
    public int field3660 = 0;

    @ObfuscatedName("ko.ac")
    public int field3661 = 0;

    @ObfuscatedName("ko.ay")
    public int field3653 = 1;

    @ObfuscatedName("ko.am")
    public boolean field3663 = false;

    @ObfuscatedName("ko.ag")
    public String[] field3664 = new String[] { null, null, class246.field2913, null, null };

    @ObfuscatedName("ko.aq")
    public String[] field3665 = new String[] { null, null, null, null, class246.field2914 };

    @ObfuscatedName("ko.aj")
    public int field3657 = -2;

    @ObfuscatedName("ko.aw")
    public int field3667 = -1;

    @ObfuscatedName("ko.ap")
    public int field3668 = -1;

    @ObfuscatedName("ko.ax")
    public int field3669 = 0;

    @ObfuscatedName("ko.as")
    public int field3670 = -1;

    @ObfuscatedName("ko.ad")
    public int field3676 = -1;

    @ObfuscatedName("ko.af")
    public int field3672 = 0;

    @ObfuscatedName("ko.ao")
    public int field3673 = -1;

    @ObfuscatedName("ko.ai")
    public int field3674 = -1;

    @ObfuscatedName("ko.av")
    public int field3675 = -1;

    @ObfuscatedName("ko.az")
    public int field3643 = -1;

    @ObfuscatedName("ko.au")
    public int field3644 = -1;

    @ObfuscatedName("ko.ab")
    public int field3678 = -1;

    @ObfuscatedName("ko.aa")
    public int[] field3666;

    @ObfuscatedName("ko.al")
    public int[] field3659;

    @ObfuscatedName("ko.ar")
    public int field3681 = -1;

    @ObfuscatedName("ko.ak")
    public int field3682 = -1;

    @ObfuscatedName("ko.an")
    public int field3683 = 128;

    @ObfuscatedName("ko.ah")
    public int field3684 = 128;

    @ObfuscatedName("ko.ae")
    public int field3685 = 128;

    @ObfuscatedName("ko.bh")
    public int field3686 = 0;

    @ObfuscatedName("ko.br")
    public int field3680 = 0;

    @ObfuscatedName("ko.bn")
    public int field3688 = 0;

    @ObfuscatedName("ko.bi")
    public class360 field3677;

    @ObfuscatedName("ko.bb")
    public boolean field3690 = false;

    @ObfuscatedName("ko.bk")
    public int field3642 = -1;

    @ObfuscatedName("ko.bt")
    public int field3640 = -1;

    @ObfuscatedName("ko.ba")
    public int field3693 = -1;

    @ObfuscatedName("ko.be")
    public int field3671 = -1;

    @ObfuscatedName("w.o(II)Lko;")
    public static class296 method194(int arg0) {
        class296 var1 = (class296) field3645.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2771.method3933(10, arg0);
        class296 var3 = new class296();
        var3.field3648 = arg0;
        if (var2 != null) {
            var3.method4654(new class382(var2));
        }
        var3.method4652();
        if (var3.field3682 != -1) {
            var3.method4656(method194(var3.field3682), method194(var3.field3681));
        }
        if (var3.field3640 != -1) {
            var3.method4689(method194(var3.field3640), method194(var3.field3642));
        }
        if (var3.field3671 != -1) {
            var3.method4658(method194(var3.field3671), method194(var3.field3693));
        }
        if (!Statics.field173 && var3.field3663) {
            var3.field3691 = class246.field2950;
            var3.field3690 = false;
            var3.field3664 = null;
            var3.field3665 = null;
            var3.field3657 = -1;
            var3.field3688 = 0;
            if (var3.field3677 != null) {
                boolean var4 = false;
                for (class351 var5 = var3.field3677.method5624(); var5 != null; var5 = var3.field3677.method5625()) {
                    class292 var6 = class292.method2171((int) var5.field3941);
                    if (var6.field3558) {
                        var5.method5354();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3677 = null;
                }
            }
        }
        field3645.method3400(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ko.u(I)V")
    public void method4652() {
    }

    @ObfuscatedName("ko.p(Lnu;I)V")
    public void method4654(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4655(arg0, var2);
        }
    }

    @ObfuscatedName("ko.b(Lnu;II)V")
    public void method4655(class382 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3649 = arg0.method5858();
        } else if (arg1 == 2) {
            this.field3691 = arg0.method5865();
        } else if (arg1 == 4) {
            this.field3655 = arg0.method5858();
        } else if (arg1 == 5) {
            this.field3679 = arg0.method5858();
        } else if (arg1 == 6) {
            this.field3650 = arg0.method5858();
        } else if (arg1 == 7) {
            this.field3662 = arg0.method5858();
            if (this.field3662 > 32767) {
                this.field3662 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3660 = arg0.method5858();
            if (this.field3660 > 32767) {
                this.field3660 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3661 = 1;
        } else if (arg1 == 12) {
            this.field3653 = arg0.method5861();
        } else if (arg1 == 16) {
            this.field3663 = true;
        } else if (arg1 == 23) {
            this.field3667 = arg0.method5858();
            this.field3669 = arg0.method5856();
        } else if (arg1 == 24) {
            this.field3668 = arg0.method5858();
        } else if (arg1 == 25) {
            this.field3670 = arg0.method5858();
            this.field3672 = arg0.method5856();
        } else if (arg1 == 26) {
            this.field3676 = arg0.method5858();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3664[arg1 - 30] = arg0.method5865();
            if (this.field3664[arg1 - 30].equalsIgnoreCase(class246.field2915)) {
                this.field3664[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3665[arg1 - 35] = arg0.method5865();
        } else if (arg1 == 40) {
            int var3 = arg0.method5856();
            this.field3694 = new short[var3];
            this.field3652 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3694[var4] = (short) arg0.method5858();
                this.field3652[var4] = (short) arg0.method5858();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5856();
            this.field3651 = new short[var5];
            this.field3687 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3651[var6] = (short) arg0.method5858();
                this.field3687[var6] = (short) arg0.method5858();
            }
        } else if (arg1 == 42) {
            this.field3657 = arg0.method6045();
        } else if (arg1 == 65) {
            this.field3690 = true;
        } else if (arg1 == 78) {
            this.field3673 = arg0.method5858();
        } else if (arg1 == 79) {
            this.field3674 = arg0.method5858();
        } else if (arg1 == 90) {
            this.field3675 = arg0.method5858();
        } else if (arg1 == 91) {
            this.field3644 = arg0.method5858();
        } else if (arg1 == 92) {
            this.field3643 = arg0.method5858();
        } else if (arg1 == 93) {
            this.field3678 = arg0.method5858();
        } else if (arg1 == 95) {
            this.field3658 = arg0.method5858();
        } else if (arg1 == 97) {
            this.field3681 = arg0.method5858();
        } else if (arg1 == 98) {
            this.field3682 = arg0.method5858();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3666 == null) {
                this.field3666 = new int[10];
                this.field3659 = new int[10];
            }
            this.field3666[arg1 - 100] = arg0.method5858();
            this.field3659[arg1 - 100] = arg0.method5858();
        } else if (arg1 == 110) {
            this.field3683 = arg0.method5858();
        } else if (arg1 == 111) {
            this.field3684 = arg0.method5858();
        } else if (arg1 == 112) {
            this.field3685 = arg0.method5858();
        } else if (arg1 == 113) {
            this.field3686 = arg0.method6045();
        } else if (arg1 == 114) {
            this.field3680 = arg0.method6045() * 5;
        } else if (arg1 == 115) {
            this.field3688 = arg0.method5856();
        } else if (arg1 == 139) {
            this.field3642 = arg0.method5858();
        } else if (arg1 == 140) {
            this.field3640 = arg0.method5858();
        } else if (arg1 == 148) {
            this.field3693 = arg0.method5858();
        } else if (arg1 == 149) {
            this.field3671 = arg0.method5858();
        } else if (arg1 == 249) {
            this.field3677 = class284.method1975(arg0, this.field3677);
        }
    }

    @ObfuscatedName("ko.e(Lko;Lko;I)V")
    public void method4656(class296 arg0, class296 arg1) {
        this.field3649 = arg0.field3649;
        this.field3655 = arg0.field3655;
        this.field3679 = arg0.field3679;
        this.field3650 = arg0.field3650;
        this.field3658 = arg0.field3658;
        this.field3662 = arg0.field3662;
        this.field3660 = arg0.field3660;
        this.field3694 = arg0.field3694;
        this.field3652 = arg0.field3652;
        this.field3651 = arg0.field3651;
        this.field3687 = arg0.field3687;
        this.field3691 = arg1.field3691;
        this.field3663 = arg1.field3663;
        this.field3653 = arg1.field3653;
        this.field3661 = 1;
    }

    @ObfuscatedName("ko.k(Lko;Lko;B)V")
    public void method4689(class296 arg0, class296 arg1) {
        this.field3649 = arg0.field3649;
        this.field3655 = arg0.field3655;
        this.field3679 = arg0.field3679;
        this.field3650 = arg0.field3650;
        this.field3658 = arg0.field3658;
        this.field3662 = arg0.field3662;
        this.field3660 = arg0.field3660;
        this.field3694 = arg1.field3694;
        this.field3652 = arg1.field3652;
        this.field3651 = arg1.field3651;
        this.field3687 = arg1.field3687;
        this.field3691 = arg1.field3691;
        this.field3663 = arg1.field3663;
        this.field3661 = arg1.field3661;
        this.field3667 = arg1.field3667;
        this.field3668 = arg1.field3668;
        this.field3673 = arg1.field3673;
        this.field3670 = arg1.field3670;
        this.field3676 = arg1.field3676;
        this.field3674 = arg1.field3674;
        this.field3675 = arg1.field3675;
        this.field3643 = arg1.field3643;
        this.field3644 = arg1.field3644;
        this.field3678 = arg1.field3678;
        this.field3688 = arg1.field3688;
        this.field3664 = arg1.field3664;
        this.field3665 = new String[5];
        if (arg1.field3665 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3665[var3] = arg1.field3665[var3];
            }
        }
        this.field3665[4] = class246.field2919;
        this.field3653 = 0;
    }

    @ObfuscatedName("ko.g(Lko;Lko;B)V")
    public void method4658(class296 arg0, class296 arg1) {
        this.field3649 = arg0.field3649;
        this.field3655 = arg0.field3655;
        this.field3679 = arg0.field3679;
        this.field3650 = arg0.field3650;
        this.field3658 = arg0.field3658;
        this.field3662 = arg0.field3662;
        this.field3660 = arg0.field3660;
        this.field3694 = arg0.field3694;
        this.field3652 = arg0.field3652;
        this.field3651 = arg0.field3651;
        this.field3687 = arg0.field3687;
        this.field3661 = arg0.field3661;
        this.field3691 = arg1.field3691;
        this.field3653 = 0;
        this.field3663 = false;
        this.field3690 = false;
    }

    @ObfuscatedName("ko.h(II)Lfs;")
    public final class169 method4659(int arg0) {
        if (this.field3666 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3659[var3] && this.field3659[var3] != 0) {
                    var2 = this.field3666[var3];
                }
            }
            if (var2 != -1) {
                return method194(var2).method4659(1);
            }
        }
        class169 var4 = class169.method2839(Statics.field3654, this.field3649, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3683 != 128 || this.field3684 != 128 || this.field3685 != 128) {
            var4.method2855(this.field3683, this.field3684, this.field3685);
        }
        if (this.field3694 != null) {
            for (int var5 = 0; var5 < this.field3694.length; var5++) {
                var4.method2852(this.field3694[var5], this.field3652[var5]);
            }
        }
        if (this.field3651 != null) {
            for (int var6 = 0; var6 < this.field3651.length; var6++) {
                var4.method2842(this.field3651[var6], this.field3687[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ko.n(IB)Lgv;")
    public final class183 method4660(int arg0) {
        if (this.field3666 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3659[var3] && this.field3659[var3] != 0) {
                    var2 = this.field3666[var3];
                }
            }
            if (var2 != -1) {
                return method194(var2).method4660(1);
            }
        }
        class183 var4 = (class183) field3692.method3398((long) this.field3648);
        if (var4 != null) {
            return var4;
        }
        class169 var5 = class169.method2839(Statics.field3654, this.field3649, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3683 != 128 || this.field3684 != 128 || this.field3685 != 128) {
            var5.method2855(this.field3683, this.field3684, this.field3685);
        }
        if (this.field3694 != null) {
            for (int var6 = 0; var6 < this.field3694.length; var6++) {
                var5.method2852(this.field3694[var6], this.field3652[var6]);
            }
        }
        if (this.field3651 != null) {
            for (int var7 = 0; var7 < this.field3651.length; var7++) {
                var5.method2842(this.field3651[var7], this.field3687[var7]);
            }
        }
        class183 var8 = var5.method2860(this.field3686 + 64, this.field3680 + 768, -50, -10, -50);
        var8.field2078 = true;
        field3692.method3400(var8, (long) this.field3648);
        return var8;
    }

    @ObfuscatedName("ko.l(II)Lko;")
    public class296 method4700(int arg0) {
        if (this.field3666 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3659[var3] && this.field3659[var3] != 0) {
                    var2 = this.field3666[var3];
                }
            }
            if (var2 != -1) {
                return method194(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ez.m(IIIIIZI)Loh;")
    public static final class395 method2653(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class395 var8 = (class395) field3647.method3398(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class296 var9 = method194(arg0);
        if (arg1 > 1 && var9.field3666 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3659[var11] && var9.field3659[var11] != 0) {
                    var10 = var9.field3666[var11];
                }
            }
            if (var10 != -1) {
                var9 = method194(var10);
            }
        }
        class183 var12 = var9.method4660(1);
        if (var12 == null) {
            return null;
        }
        class395 var13 = null;
        if (var9.field3682 != -1) {
            var13 = method2653(var9.field3681, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3640 != -1) {
            var13 = method2653(var9.field3642, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3671 != -1) {
            var13 = method2653(var9.field3693, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4223;
        int var15 = Statics.field4219;
        int var16 = Statics.field4218;
        int[] var17 = new int[4];
        class391.method6136(var17);
        class395 var18 = new class395(36, 32);
        class391.method6127(var18.field4247, 36, 32);
        class391.method6179();
        class174.method2924();
        class174.method2975(16, 16);
        class174.field1904 = false;
        if (var9.field3671 != -1) {
            var13.method6284(0, 0);
        }
        int var19 = var9.field3655;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class174.field1924[var9.field3679] * var19 >> 16;
        int var21 = class174.field1909[var9.field3679] * var19 >> 16;
        var12.method3240();
        var12.method3253(0, var9.field3650, var9.field3658, var9.field3679, var9.field3662, var9.field3660 + var12.field1999 / 2 + var20, var9.field3660 + var21);
        if (var9.field3640 != -1) {
            var13.method6284(0, 0);
        }
        if (arg2 >= 1) {
            var18.method6235(1);
        }
        if (arg2 >= 2) {
            var18.method6235(16777215);
        }
        if (arg3 != 0) {
            var18.method6296(arg3);
        }
        class391.method6127(var18.field4247, 36, 32);
        if (var9.field3682 != -1) {
            var13.method6284(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3661 == 1) {
            class299 var22 = Statics.field278;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class246.field3080 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class246.field3078 + "</col>";
            }
            var22.method4785(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3647.method3400(var18, var6);
        }
        class391.method6127(var14, var15, var16);
        class391.method6122(var17);
        class174.method2924();
        class174.field1904 = true;
        return var18;
    }

    @ObfuscatedName("ko.d(ZI)Z")
    public final boolean method4692(boolean arg0) {
        int var2 = this.field3667;
        int var3 = this.field3668;
        int var4 = this.field3673;
        if (arg0) {
            var2 = this.field3670;
            var3 = this.field3676;
            var4 = this.field3674;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3654.method3935(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3654.method3935(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3654.method3935(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ko.c(ZI)Lfs;")
    public final class169 method4707(boolean arg0) {
        int var2 = this.field3667;
        int var3 = this.field3668;
        int var4 = this.field3673;
        if (arg0) {
            var2 = this.field3670;
            var3 = this.field3676;
            var4 = this.field3674;
        }
        if (var2 == -1) {
            return null;
        }
        class169 var5 = class169.method2839(Statics.field3654, var2, 0);
        if (var3 != -1) {
            class169 var6 = class169.method2839(Statics.field3654, var3, 0);
            if (var4 == -1) {
                class169[] var9 = new class169[] { var5, var6 };
                var5 = new class169(var9, 2);
            } else {
                class169 var7 = class169.method2839(Statics.field3654, var4, 0);
                class169[] var8 = new class169[] { var5, var6, var7 };
                var5 = new class169(var8, 3);
            }
        }
        if (!arg0 && this.field3669 != 0) {
            var5.method2851(0, this.field3669, 0);
        }
        if (arg0 && this.field3672 != 0) {
            var5.method2851(0, this.field3672, 0);
        }
        if (this.field3694 != null) {
            for (int var10 = 0; var10 < this.field3694.length; var10++) {
                var5.method2852(this.field3694[var10], this.field3652[var10]);
            }
        }
        if (this.field3651 != null) {
            for (int var11 = 0; var11 < this.field3651.length; var11++) {
                var5.method2842(this.field3651[var11], this.field3687[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ko.j(ZB)Z")
    public final boolean method4664(boolean arg0) {
        int var2 = this.field3675;
        int var3 = this.field3643;
        if (arg0) {
            var2 = this.field3644;
            var3 = this.field3678;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3654.method3935(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3654.method3935(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ko.r(ZI)Lfs;")
    public final class169 method4665(boolean arg0) {
        int var2 = this.field3675;
        int var3 = this.field3643;
        if (arg0) {
            var2 = this.field3644;
            var3 = this.field3678;
        }
        if (var2 == -1) {
            return null;
        }
        class169 var4 = class169.method2839(Statics.field3654, var2, 0);
        if (var3 != -1) {
            class169 var5 = class169.method2839(Statics.field3654, var3, 0);
            class169[] var6 = new class169[] { var4, var5 };
            var4 = new class169(var6, 2);
        }
        if (this.field3694 != null) {
            for (int var7 = 0; var7 < this.field3694.length; var7++) {
                var4.method2852(this.field3694[var7], this.field3652[var7]);
            }
        }
        if (this.field3651 != null) {
            for (int var8 = 0; var8 < this.field3651.length; var8++) {
                var4.method2842(this.field3651[var8], this.field3687[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ko.q(IIB)I")
    public int method4666(int arg0, int arg1) {
        class360 var3 = this.field3677;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class350 var5 = (class350) var3.method5621((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field3940;
            }
        }
        return var4;
    }

    @ObfuscatedName("ko.t(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4667(int arg0, String arg1) {
        class360 var3 = this.field3677;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class347 var5 = (class347) var3.method5621((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field3937;
            }
        }
        return var4;
    }

    @ObfuscatedName("ko.v(I)I")
    public int method4690() {
        if (this.field3657 == -1 || this.field3665 == null) {
            return -1;
        } else if (this.field3657 >= 0) {
            return this.field3665[this.field3657] == null ? -1 : this.field3657;
        } else if (class246.field2914.equalsIgnoreCase(this.field3665[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ey.x(I)V")
    public static void method2364() {
        field3645.method3392();
        field3692.method3392();
        field3647.method3392();
    }

    @ObfuscatedName("et.z(I)V")
    public static void method2299() {
        field3647.method3392();
    }

    @ObfuscatedName("cd.i(ZI)V")
    public static void method1901(boolean arg0) {
        if (Statics.field173 != arg0) {
            method2364();
            Statics.field173 = arg0;
        }
    }
}
