package deob;

@ObfuscatedName("jo")
public class class284 extends class219 {

    @ObfuscatedName("jo.x")
    public static class213 field3673 = new class213(64);

    @ObfuscatedName("jo.y")
    public static class213 field3697 = new class213(50);

    @ObfuscatedName("jo.a")
    public static class213 field3650 = new class213(200);

    @ObfuscatedName("jo.n")
    public int field3643;

    @ObfuscatedName("jo.l")
    public int field3652;

    @ObfuscatedName("jo.s")
    public String field3674 = class252.field3032;

    @ObfuscatedName("jo.v")
    public short[] field3654;

    @ObfuscatedName("jo.q")
    public short[] field3655;

    @ObfuscatedName("jo.r")
    public short[] field3656;

    @ObfuscatedName("jo.j")
    public short[] field3681;

    @ObfuscatedName("jo.b")
    public int field3658 = 2000;

    @ObfuscatedName("jo.g")
    public int field3659 = 0;

    @ObfuscatedName("jo.f")
    public int field3660 = 0;

    @ObfuscatedName("jo.p")
    public int field3690 = 0;

    @ObfuscatedName("jo.e")
    public int field3662 = 0;

    @ObfuscatedName("jo.c")
    public int field3663 = 0;

    @ObfuscatedName("jo.ab")
    public int field3664 = 0;

    @ObfuscatedName("jo.ap")
    public int field3665 = 1;

    @ObfuscatedName("jo.ag")
    public boolean field3661 = false;

    @ObfuscatedName("jo.at")
    public String[] field3667 = new String[] { null, null, class252.field3025, null, null };

    @ObfuscatedName("jo.ac")
    public String[] field3668 = new String[] { null, null, null, null, class252.field3026 };

    @ObfuscatedName("jo.ah")
    public int field3644 = -2;

    @ObfuscatedName("jo.af")
    public int field3692 = -1;

    @ObfuscatedName("jo.aq")
    public int field3671 = -1;

    @ObfuscatedName("jo.ai")
    public int field3642 = 0;

    @ObfuscatedName("jo.az")
    public int field3689 = -1;

    @ObfuscatedName("jo.aa")
    public int field3695 = -1;

    @ObfuscatedName("jo.av")
    public int field3677 = 0;

    @ObfuscatedName("jo.am")
    public int field3676 = -1;

    @ObfuscatedName("jo.ao")
    public int field3649 = -1;

    @ObfuscatedName("jo.ax")
    public int field3678 = -1;

    @ObfuscatedName("jo.ad")
    public int field3679 = -1;

    @ObfuscatedName("jo.au")
    public int field3680 = -1;

    @ObfuscatedName("jo.ar")
    public int field3670 = -1;

    @ObfuscatedName("jo.an")
    public int[] field3682;

    @ObfuscatedName("jo.ae")
    public int[] field3683;

    @ObfuscatedName("jo.aw")
    public int field3684 = -1;

    @ObfuscatedName("jo.ak")
    public int field3685 = -1;

    @ObfuscatedName("jo.as")
    public int field3686 = 128;

    @ObfuscatedName("jo.aj")
    public int field3687 = 128;

    @ObfuscatedName("jo.ay")
    public int field3688 = 128;

    @ObfuscatedName("jo.bm")
    public int field3666 = 0;

    @ObfuscatedName("jo.bx")
    public int field3653 = 0;

    @ObfuscatedName("jo.bl")
    public int field3691 = 0;

    @ObfuscatedName("jo.bf")
    public class210 field3672;

    @ObfuscatedName("jo.bp")
    public boolean field3693 = false;

    @ObfuscatedName("jo.bs")
    public int field3694 = -1;

    @ObfuscatedName("jo.bu")
    public int field3651 = -1;

    @ObfuscatedName("jo.br")
    public int field3696 = -1;

    @ObfuscatedName("jo.bk")
    public int field3648 = -1;

    @ObfuscatedName("aw.o(II)Ljo;")
    public static class284 method660(int arg0) {
        class284 var1 = (class284) field3673.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3646.method4241(10, arg0);
        class284 var3 = new class284();
        var3.field3643 = arg0;
        if (var2 != null) {
            var3.method4670(new class195(var2));
        }
        var3.method4669();
        if (var3.field3685 != -1) {
            var3.method4672(method660(var3.field3685), method660(var3.field3684));
        }
        if (var3.field3651 != -1) {
            var3.method4673(method660(var3.field3651), method660(var3.field3694));
        }
        if (var3.field3648 != -1) {
            var3.method4690(method660(var3.field3648), method660(var3.field3696));
        }
        if (!Statics.field2177 && var3.field3661) {
            var3.field3674 = class252.field3064;
            var3.field3693 = false;
            var3.field3667 = null;
            var3.field3668 = null;
            var3.field3644 = -1;
            var3.field3691 = 0;
            if (var3.field3672 != null) {
                boolean var4 = false;
                for (class217 var5 = var3.field3672.method3570(); var5 != null; var5 = var3.field3672.method3586()) {
                    class279 var6 = class279.method4491((int) var5.field2652);
                    if (var6.field3551) {
                        var5.method3681();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3672 = null;
                }
            }
        }
        field3673.method3603(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jo.k(I)V")
    public void method4669() {
    }

    @ObfuscatedName("jo.t(Lgc;B)V")
    public void method4670(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4671(arg0, var2);
        }
    }

    @ObfuscatedName("jo.d(Lgc;IB)V")
    public void method4671(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3652 = arg0.method3207();
        } else if (arg1 == 2) {
            this.field3674 = arg0.method3284();
        } else if (arg1 == 4) {
            this.field3658 = arg0.method3207();
        } else if (arg1 == 5) {
            this.field3659 = arg0.method3207();
        } else if (arg1 == 6) {
            this.field3660 = arg0.method3207();
        } else if (arg1 == 7) {
            this.field3662 = arg0.method3207();
            if (this.field3662 > 32767) {
                this.field3662 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3663 = arg0.method3207();
            if (this.field3663 > 32767) {
                this.field3663 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3664 = 1;
        } else if (arg1 == 12) {
            this.field3665 = arg0.method3254();
        } else if (arg1 == 16) {
            this.field3661 = true;
        } else if (arg1 == 23) {
            this.field3692 = arg0.method3207();
            this.field3642 = arg0.method3205();
        } else if (arg1 == 24) {
            this.field3671 = arg0.method3207();
        } else if (arg1 == 25) {
            this.field3689 = arg0.method3207();
            this.field3677 = arg0.method3205();
        } else if (arg1 == 26) {
            this.field3695 = arg0.method3207();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3667[arg1 - 30] = arg0.method3284();
            if (this.field3667[arg1 - 30].equalsIgnoreCase(class252.field3027)) {
                this.field3667[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3668[arg1 - 35] = arg0.method3284();
        } else if (arg1 == 40) {
            int var3 = arg0.method3205();
            this.field3654 = new short[var3];
            this.field3655 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3654[var4] = (short) arg0.method3207();
                this.field3655[var4] = (short) arg0.method3207();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3205();
            this.field3656 = new short[var5];
            this.field3681 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3656[var6] = (short) arg0.method3207();
                this.field3681[var6] = (short) arg0.method3207();
            }
        } else if (arg1 == 42) {
            this.field3644 = arg0.method3210();
        } else if (arg1 == 65) {
            this.field3693 = true;
        } else if (arg1 == 78) {
            this.field3676 = arg0.method3207();
        } else if (arg1 == 79) {
            this.field3649 = arg0.method3207();
        } else if (arg1 == 90) {
            this.field3678 = arg0.method3207();
        } else if (arg1 == 91) {
            this.field3680 = arg0.method3207();
        } else if (arg1 == 92) {
            this.field3679 = arg0.method3207();
        } else if (arg1 == 93) {
            this.field3670 = arg0.method3207();
        } else if (arg1 == 95) {
            this.field3690 = arg0.method3207();
        } else if (arg1 == 97) {
            this.field3684 = arg0.method3207();
        } else if (arg1 == 98) {
            this.field3685 = arg0.method3207();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3682 == null) {
                this.field3682 = new int[10];
                this.field3683 = new int[10];
            }
            this.field3682[arg1 - 100] = arg0.method3207();
            this.field3683[arg1 - 100] = arg0.method3207();
        } else if (arg1 == 110) {
            this.field3686 = arg0.method3207();
        } else if (arg1 == 111) {
            this.field3687 = arg0.method3207();
        } else if (arg1 == 112) {
            this.field3688 = arg0.method3207();
        } else if (arg1 == 113) {
            this.field3666 = arg0.method3210();
        } else if (arg1 == 114) {
            this.field3653 = arg0.method3210();
        } else if (arg1 == 115) {
            this.field3691 = arg0.method3205();
        } else if (arg1 == 139) {
            this.field3694 = arg0.method3207();
        } else if (arg1 == 140) {
            this.field3651 = arg0.method3207();
        } else if (arg1 == 148) {
            this.field3696 = arg0.method3207();
        } else if (arg1 == 149) {
            this.field3648 = arg0.method3207();
        } else if (arg1 == 249) {
            this.field3672 = class277.method241(arg0, this.field3672);
        }
    }

    @ObfuscatedName("jo.h(Ljo;Ljo;I)V")
    public void method4672(class284 arg0, class284 arg1) {
        this.field3652 = arg0.field3652;
        this.field3658 = arg0.field3658;
        this.field3659 = arg0.field3659;
        this.field3660 = arg0.field3660;
        this.field3690 = arg0.field3690;
        this.field3662 = arg0.field3662;
        this.field3663 = arg0.field3663;
        this.field3654 = arg0.field3654;
        this.field3655 = arg0.field3655;
        this.field3656 = arg0.field3656;
        this.field3681 = arg0.field3681;
        this.field3674 = arg1.field3674;
        this.field3661 = arg1.field3661;
        this.field3665 = arg1.field3665;
        this.field3664 = 1;
    }

    @ObfuscatedName("jo.m(Ljo;Ljo;I)V")
    public void method4673(class284 arg0, class284 arg1) {
        this.field3652 = arg0.field3652;
        this.field3658 = arg0.field3658;
        this.field3659 = arg0.field3659;
        this.field3660 = arg0.field3660;
        this.field3690 = arg0.field3690;
        this.field3662 = arg0.field3662;
        this.field3663 = arg0.field3663;
        this.field3654 = arg1.field3654;
        this.field3655 = arg1.field3655;
        this.field3656 = arg1.field3656;
        this.field3681 = arg1.field3681;
        this.field3674 = arg1.field3674;
        this.field3661 = arg1.field3661;
        this.field3664 = arg1.field3664;
        this.field3692 = arg1.field3692;
        this.field3671 = arg1.field3671;
        this.field3676 = arg1.field3676;
        this.field3689 = arg1.field3689;
        this.field3695 = arg1.field3695;
        this.field3649 = arg1.field3649;
        this.field3678 = arg1.field3678;
        this.field3679 = arg1.field3679;
        this.field3680 = arg1.field3680;
        this.field3670 = arg1.field3670;
        this.field3691 = arg1.field3691;
        this.field3667 = arg1.field3667;
        this.field3668 = new String[5];
        if (arg1.field3668 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3668[var3] = arg1.field3668[var3];
            }
        }
        this.field3668[4] = class252.field3031;
        this.field3665 = 0;
    }

    @ObfuscatedName("jo.z(Ljo;Ljo;B)V")
    public void method4690(class284 arg0, class284 arg1) {
        this.field3652 = arg0.field3652;
        this.field3658 = arg0.field3658;
        this.field3659 = arg0.field3659;
        this.field3660 = arg0.field3660;
        this.field3690 = arg0.field3690;
        this.field3662 = arg0.field3662;
        this.field3663 = arg0.field3663;
        this.field3654 = arg0.field3654;
        this.field3655 = arg0.field3655;
        this.field3656 = arg0.field3656;
        this.field3681 = arg0.field3681;
        this.field3664 = arg0.field3664;
        this.field3674 = arg1.field3674;
        this.field3665 = 0;
        this.field3661 = false;
        this.field3693 = false;
    }

    @ObfuscatedName("jo.i(IB)Ldg;")
    public final class126 method4703(int arg0) {
        if (this.field3682 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3683[var3] && this.field3683[var3] != 0) {
                    var2 = this.field3682[var3];
                }
            }
            if (var2 != -1) {
                return method660(var2).method4703(1);
            }
        }
        class126 var4 = class126.method2418(Statics.field3647, this.field3652, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3686 != 128 || this.field3687 != 128 || this.field3688 != 128) {
            var4.method2388(this.field3686, this.field3687, this.field3688);
        }
        if (this.field3654 != null) {
            for (int var5 = 0; var5 < this.field3654.length; var5++) {
                var4.method2385(this.field3654[var5], this.field3655[var5]);
            }
        }
        if (this.field3656 != null) {
            for (int var6 = 0; var6 < this.field3656.length; var6++) {
                var4.method2386(this.field3656[var6], this.field3681[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jo.u(IB)Lei;")
    public final class132 method4717(int arg0) {
        if (this.field3682 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3683[var3] && this.field3683[var3] != 0) {
                    var2 = this.field3682[var3];
                }
            }
            if (var2 != -1) {
                return method660(var2).method4717(1);
            }
        }
        class132 var4 = (class132) field3697.method3601((long) this.field3643);
        if (var4 != null) {
            return var4;
        }
        class126 var5 = class126.method2418(Statics.field3647, this.field3652, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3686 != 128 || this.field3687 != 128 || this.field3688 != 128) {
            var5.method2388(this.field3686, this.field3687, this.field3688);
        }
        if (this.field3654 != null) {
            for (int var6 = 0; var6 < this.field3654.length; var6++) {
                var5.method2385(this.field3654[var6], this.field3655[var6]);
            }
        }
        if (this.field3656 != null) {
            for (int var7 = 0; var7 < this.field3656.length; var7++) {
                var5.method2386(this.field3656[var7], this.field3681[var7]);
            }
        }
        class132 var8 = var5.method2393(this.field3666 + 64, this.field3653 * 5 + 768, -50, -10, -50);
        var8.field1875 = true;
        field3697.method3603(var8, (long) this.field3643);
        return var8;
    }

    @ObfuscatedName("jo.x(II)Ljo;")
    public class284 method4677(int arg0) {
        if (this.field3682 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3683[var3] && this.field3683[var3] != 0) {
                    var2 = this.field3682[var3];
                }
            }
            if (var2 != -1) {
                return method660(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("al.y(IIIIIZI)Lld;")
    public static final class332 method274(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class332 var8 = (class332) field3650.method3601(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class284 var9 = method660(arg0);
        if (arg1 > 1 && var9.field3682 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3683[var11] && var9.field3683[var11] != 0) {
                    var10 = var9.field3682[var11];
                }
            }
            if (var10 != -1) {
                var9 = method660(var10);
            }
        }
        class132 var12 = var9.method4717(1);
        if (var12 == null) {
            return null;
        }
        class332 var13 = null;
        if (var9.field3685 != -1) {
            var13 = method274(var9.field3684, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3651 != -1) {
            var13 = method274(var9.field3694, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3648 != -1) {
            var13 = method274(var9.field3696, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3959;
        int var15 = Statics.field3956;
        int var16 = Statics.field3958;
        int[] var17 = new int[4];
        class328.method5289(var17);
        class332 var18 = new class332(36, 32);
        class328.method5355(var18.field3984, 36, 32);
        class328.method5360();
        class135.method2586();
        class135.method2553(16, 16);
        class135.field1952 = false;
        if (var9.field3648 != -1) {
            var13.method5514(0, 0);
        }
        int var19 = var9.field3658;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class135.field1963[var9.field3659] * var19 >> 16;
        int var21 = class135.field1964[var9.field3659] * var19 >> 16;
        var12.method2512();
        var12.method2507(0, var9.field3660, var9.field3690, var9.field3659, var9.field3662, var9.field3663 + var12.field2054 / 2 + var20, var9.field3663 + var21);
        if (var9.field3651 != -1) {
            var13.method5514(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5415(1);
        }
        if (arg2 >= 2) {
            var18.method5415(16777215);
        }
        if (arg3 != 0) {
            var18.method5416(arg3);
        }
        class328.method5355(var18.field3984, 36, 32);
        if (var9.field3685 != -1) {
            var13.method5514(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3664 == 1) {
            Statics.field446.method5088(method4047(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3650.method3603(var18, var6);
        }
        class328.method5355(var14, var15, var16);
        class328.method5290(var17);
        class135.method2586();
        class135.field1952 = true;
        return var18;
    }

    @ObfuscatedName("ic.a(II)Ljava/lang/String;")
    public static final String method4047(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class252.field3189 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class252.field3308 + "</col>";
        }
    }

    @ObfuscatedName("jo.v(ZI)Z")
    public final boolean method4681(boolean arg0) {
        int var2 = this.field3692;
        int var3 = this.field3671;
        int var4 = this.field3676;
        if (arg0) {
            var2 = this.field3689;
            var3 = this.field3695;
            var4 = this.field3649;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3647.method4159(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3647.method4159(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3647.method4159(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jo.q(ZB)Ldg;")
    public final class126 method4707(boolean arg0) {
        int var2 = this.field3692;
        int var3 = this.field3671;
        int var4 = this.field3676;
        if (arg0) {
            var2 = this.field3689;
            var3 = this.field3695;
            var4 = this.field3649;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var5 = class126.method2418(Statics.field3647, var2, 0);
        if (var3 != -1) {
            class126 var6 = class126.method2418(Statics.field3647, var3, 0);
            if (var4 == -1) {
                class126[] var9 = new class126[] { var5, var6 };
                var5 = new class126(var9, 2);
            } else {
                class126 var7 = class126.method2418(Statics.field3647, var4, 0);
                class126[] var8 = new class126[] { var5, var6, var7 };
                var5 = new class126(var8, 3);
            }
        }
        if (!arg0 && this.field3642 != 0) {
            var5.method2384(0, this.field3642, 0);
        }
        if (arg0 && this.field3677 != 0) {
            var5.method2384(0, this.field3677, 0);
        }
        if (this.field3654 != null) {
            for (int var10 = 0; var10 < this.field3654.length; var10++) {
                var5.method2385(this.field3654[var10], this.field3655[var10]);
            }
        }
        if (this.field3656 != null) {
            for (int var11 = 0; var11 < this.field3656.length; var11++) {
                var5.method2386(this.field3656[var11], this.field3681[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jo.r(ZB)Z")
    public final boolean method4680(boolean arg0) {
        int var2 = this.field3678;
        int var3 = this.field3679;
        if (arg0) {
            var2 = this.field3680;
            var3 = this.field3670;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3647.method4159(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3647.method4159(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jo.j(ZI)Ldg;")
    public final class126 method4676(boolean arg0) {
        int var2 = this.field3678;
        int var3 = this.field3679;
        if (arg0) {
            var2 = this.field3680;
            var3 = this.field3670;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var4 = class126.method2418(Statics.field3647, var2, 0);
        if (var3 != -1) {
            class126 var5 = class126.method2418(Statics.field3647, var3, 0);
            class126[] var6 = new class126[] { var4, var5 };
            var4 = new class126(var6, 2);
        }
        if (this.field3654 != null) {
            for (int var7 = 0; var7 < this.field3654.length; var7++) {
                var4.method2385(this.field3654[var7], this.field3655[var7]);
            }
        }
        if (this.field3656 != null) {
            for (int var8 = 0; var8 < this.field3656.length; var8++) {
                var4.method2386(this.field3656[var8], this.field3681[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jo.b(IIS)I")
    public int method4682(int arg0, int arg1) {
        class210 var3 = this.field3672;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class224 var5 = (class224) var3.method3575((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2669;
            }
        }
        return var4;
    }

    @ObfuscatedName("jo.g(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4683(int arg0, String arg1) {
        return class277.method271(this.field3672, arg0, arg1);
    }

    @ObfuscatedName("jo.f(I)I")
    public int method4684() {
        if (this.field3644 == -1 || this.field3668 == null) {
            return -1;
        } else if (this.field3644 >= 0) {
            return this.field3668[this.field3644] == null ? -1 : this.field3644;
        } else if (class252.field3026.equalsIgnoreCase(this.field3668[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bg.p(ZI)V")
    public static void method1579(boolean arg0) {
        if (Statics.field2177 != arg0) {
            field3673.method3604();
            field3697.method3604();
            field3650.method3604();
            Statics.field2177 = arg0;
        }
    }
}
