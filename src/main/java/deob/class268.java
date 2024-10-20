package deob;

@ObfuscatedName("jl")
public class class268 extends class206 {

    @ObfuscatedName("jl.f")
    public static class201 field3611 = new class201(64);

    @ObfuscatedName("jl.z")
    public static class201 field3579 = new class201(50);

    @ObfuscatedName("jl.u")
    public static class201 field3580 = new class201(200);

    @ObfuscatedName("jl.w")
    public int field3591;

    @ObfuscatedName("jl.t")
    public int field3582;

    @ObfuscatedName("jl.o")
    public String field3583 = "null";

    @ObfuscatedName("jl.a")
    public short[] field3584;

    @ObfuscatedName("jl.i")
    public short[] field3585;

    @ObfuscatedName("jl.m")
    public short[] field3596;

    @ObfuscatedName("jl.x")
    public short[] field3597;

    @ObfuscatedName("jl.l")
    public int field3588 = 2000;

    @ObfuscatedName("jl.j")
    public int field3589 = 0;

    @ObfuscatedName("jl.g")
    public int field3609 = 0;

    @ObfuscatedName("jl.c")
    public int field3594 = 0;

    @ObfuscatedName("jl.k")
    public int field3590 = 0;

    @ObfuscatedName("jl.q")
    public int field3593 = 0;

    @ObfuscatedName("jl.ac")
    public int field3578 = 0;

    @ObfuscatedName("jl.aw")
    public int field3595 = 1;

    @ObfuscatedName("jl.at")
    public boolean field3621 = false;

    @ObfuscatedName("jl.ag")
    public String[] field3592 = new String[] { null, null, class237.field2963, null, null };

    @ObfuscatedName("jl.ad")
    public String[] field3598 = new String[] { null, null, null, null, class237.field2964 };

    @ObfuscatedName("jl.az")
    public int field3574 = -2;

    @ObfuscatedName("jl.ae")
    public int field3600 = -1;

    @ObfuscatedName("jl.av")
    public int field3601 = -1;

    @ObfuscatedName("jl.am")
    public int field3602 = 0;

    @ObfuscatedName("jl.ax")
    public int field3603 = -1;

    @ObfuscatedName("jl.ah")
    public int field3604 = -1;

    @ObfuscatedName("jl.ab")
    public int field3605 = 0;

    @ObfuscatedName("jl.aj")
    public int field3606 = -1;

    @ObfuscatedName("jl.aa")
    public int field3599 = -1;

    @ObfuscatedName("jl.ao")
    public int field3608 = -1;

    @ObfuscatedName("jl.al")
    public int field3587 = -1;

    @ObfuscatedName("jl.ay")
    public int field3610 = -1;

    @ObfuscatedName("jl.aq")
    public int field3573 = -1;

    @ObfuscatedName("jl.ak")
    public int[] field3612;

    @ObfuscatedName("jl.as")
    public int[] field3617;

    @ObfuscatedName("jl.au")
    public int field3614 = -1;

    @ObfuscatedName("jl.an")
    public int field3607 = -1;

    @ObfuscatedName("jl.ai")
    public int field3616 = 128;

    @ObfuscatedName("jl.ap")
    public int field3586 = 128;

    @ObfuscatedName("jl.ar")
    public int field3618 = 128;

    @ObfuscatedName("jl.bg")
    public int field3615 = 0;

    @ObfuscatedName("jl.bq")
    public int field3620 = 0;

    @ObfuscatedName("jl.bk")
    public int field3619 = 0;

    @ObfuscatedName("jl.by")
    public class198 field3581;

    @ObfuscatedName("jl.bz")
    public boolean field3572 = false;

    @ObfuscatedName("jl.bj")
    public int field3624 = -1;

    @ObfuscatedName("jl.bd")
    public int field3625 = -1;

    @ObfuscatedName("jl.bi")
    public int field3626 = -1;

    @ObfuscatedName("jl.bo")
    public int field3627 = -1;

    @ObfuscatedName("dc.n(IB)Ljl;")
    public static class268 method1985(int arg0) {
        class268 var1 = (class268) field3611.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3575.method3931(10, arg0);
        class268 var3 = new class268();
        var3.field3591 = arg0;
        if (var2 != null) {
            var3.method4359(new class185(var2));
        }
        var3.method4411();
        if (var3.field3607 != -1) {
            var3.method4361(method1985(var3.field3607), method1985(var3.field3614));
        }
        if (var3.field3625 != -1) {
            var3.method4362(method1985(var3.field3625), method1985(var3.field3624));
        }
        if (var3.field3627 != -1) {
            var3.method4394(method1985(var3.field3627), method1985(var3.field3626));
        }
        if (!Statics.field3577 && var3.field3621) {
            var3.field3583 = class237.field3189;
            var3.field3572 = false;
            var3.field3592 = null;
            var3.field3598 = null;
            var3.field3574 = -1;
            var3.field3619 = 0;
            if (var3.field3581 != null) {
                boolean var4 = false;
                for (class204 var5 = var3.field3581.method3379(); var5 != null; var5 = var3.field3581.method3376()) {
                    class263 var6 = Statics.method1733((int) var5.field2597);
                    if (var6.field3477) {
                        var5.method3474();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3581 = null;
                }
            }
        }
        field3611.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jl.v(B)V")
    public void method4411() {
    }

    @ObfuscatedName("jl.y(Lgv;I)V")
    public void method4359(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4360(arg0, var2);
        }
    }

    @ObfuscatedName("jl.r(Lgv;IS)V")
    public void method4360(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3582 = arg0.method3015();
        } else if (arg1 == 2) {
            this.field3583 = arg0.method3030();
        } else if (arg1 == 4) {
            this.field3588 = arg0.method3015();
        } else if (arg1 == 5) {
            this.field3589 = arg0.method3015();
        } else if (arg1 == 6) {
            this.field3609 = arg0.method3015();
        } else if (arg1 == 7) {
            this.field3590 = arg0.method3015();
            if (this.field3590 > 32767) {
                this.field3590 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3593 = arg0.method3015();
            if (this.field3593 > 32767) {
                this.field3593 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3578 = 1;
        } else if (arg1 == 12) {
            this.field3595 = arg0.method3026();
        } else if (arg1 == 16) {
            this.field3621 = true;
        } else if (arg1 == 23) {
            this.field3600 = arg0.method3015();
            this.field3602 = arg0.method3021();
        } else if (arg1 == 24) {
            this.field3601 = arg0.method3015();
        } else if (arg1 == 25) {
            this.field3603 = arg0.method3015();
            this.field3605 = arg0.method3021();
        } else if (arg1 == 26) {
            this.field3604 = arg0.method3015();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3592[arg1 - 30] = arg0.method3030();
            if (this.field3592[arg1 - 30].equalsIgnoreCase(class237.field3155)) {
                this.field3592[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3598[arg1 - 35] = arg0.method3030();
        } else if (arg1 == 40) {
            int var3 = arg0.method3021();
            this.field3584 = new short[var3];
            this.field3585 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3584[var4] = (short) arg0.method3015();
                this.field3585[var4] = (short) arg0.method3015();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3021();
            this.field3596 = new short[var5];
            this.field3597 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3596[var6] = (short) arg0.method3015();
                this.field3597[var6] = (short) arg0.method3015();
            }
        } else if (arg1 == 42) {
            this.field3574 = arg0.method3022();
        } else if (arg1 == 65) {
            this.field3572 = true;
        } else if (arg1 == 78) {
            this.field3606 = arg0.method3015();
        } else if (arg1 == 79) {
            this.field3599 = arg0.method3015();
        } else if (arg1 == 90) {
            this.field3608 = arg0.method3015();
        } else if (arg1 == 91) {
            this.field3610 = arg0.method3015();
        } else if (arg1 == 92) {
            this.field3587 = arg0.method3015();
        } else if (arg1 == 93) {
            this.field3573 = arg0.method3015();
        } else if (arg1 == 95) {
            this.field3594 = arg0.method3015();
        } else if (arg1 == 97) {
            this.field3614 = arg0.method3015();
        } else if (arg1 == 98) {
            this.field3607 = arg0.method3015();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3612 == null) {
                this.field3612 = new int[10];
                this.field3617 = new int[10];
            }
            this.field3612[arg1 - 100] = arg0.method3015();
            this.field3617[arg1 - 100] = arg0.method3015();
        } else if (arg1 == 110) {
            this.field3616 = arg0.method3015();
        } else if (arg1 == 111) {
            this.field3586 = arg0.method3015();
        } else if (arg1 == 112) {
            this.field3618 = arg0.method3015();
        } else if (arg1 == 113) {
            this.field3615 = arg0.method3022();
        } else if (arg1 == 114) {
            this.field3620 = arg0.method3022() * 5;
        } else if (arg1 == 115) {
            this.field3619 = arg0.method3021();
        } else if (arg1 == 139) {
            this.field3624 = arg0.method3015();
        } else if (arg1 == 140) {
            this.field3625 = arg0.method3015();
        } else if (arg1 == 148) {
            this.field3626 = arg0.method3015();
        } else if (arg1 == 149) {
            this.field3627 = arg0.method3015();
        } else if (arg1 == 249) {
            this.field3581 = class261.method121(arg0, this.field3581);
        }
    }

    @ObfuscatedName("jl.h(Ljl;Ljl;I)V")
    public void method4361(class268 arg0, class268 arg1) {
        this.field3582 = arg0.field3582;
        this.field3588 = arg0.field3588;
        this.field3589 = arg0.field3589;
        this.field3609 = arg0.field3609;
        this.field3594 = arg0.field3594;
        this.field3590 = arg0.field3590;
        this.field3593 = arg0.field3593;
        this.field3584 = arg0.field3584;
        this.field3585 = arg0.field3585;
        this.field3596 = arg0.field3596;
        this.field3597 = arg0.field3597;
        this.field3583 = arg1.field3583;
        this.field3621 = arg1.field3621;
        this.field3595 = arg1.field3595;
        this.field3578 = 1;
    }

    @ObfuscatedName("jl.d(Ljl;Ljl;I)V")
    public void method4362(class268 arg0, class268 arg1) {
        this.field3582 = arg0.field3582;
        this.field3588 = arg0.field3588;
        this.field3589 = arg0.field3589;
        this.field3609 = arg0.field3609;
        this.field3594 = arg0.field3594;
        this.field3590 = arg0.field3590;
        this.field3593 = arg0.field3593;
        this.field3584 = arg1.field3584;
        this.field3585 = arg1.field3585;
        this.field3596 = arg1.field3596;
        this.field3597 = arg1.field3597;
        this.field3583 = arg1.field3583;
        this.field3621 = arg1.field3621;
        this.field3578 = arg1.field3578;
        this.field3600 = arg1.field3600;
        this.field3601 = arg1.field3601;
        this.field3606 = arg1.field3606;
        this.field3603 = arg1.field3603;
        this.field3604 = arg1.field3604;
        this.field3599 = arg1.field3599;
        this.field3608 = arg1.field3608;
        this.field3587 = arg1.field3587;
        this.field3610 = arg1.field3610;
        this.field3573 = arg1.field3573;
        this.field3619 = arg1.field3619;
        this.field3592 = arg1.field3592;
        this.field3598 = new String[5];
        if (arg1.field3598 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3598[var3] = arg1.field3598[var3];
            }
        }
        this.field3598[4] = class237.field3213;
        this.field3595 = 0;
    }

    @ObfuscatedName("jl.s(Ljl;Ljl;I)V")
    public void method4394(class268 arg0, class268 arg1) {
        this.field3582 = arg0.field3582;
        this.field3588 = arg0.field3588;
        this.field3589 = arg0.field3589;
        this.field3609 = arg0.field3609;
        this.field3594 = arg0.field3594;
        this.field3590 = arg0.field3590;
        this.field3593 = arg0.field3593;
        this.field3584 = arg0.field3584;
        this.field3585 = arg0.field3585;
        this.field3596 = arg0.field3596;
        this.field3597 = arg0.field3597;
        this.field3578 = arg0.field3578;
        this.field3583 = arg1.field3583;
        this.field3595 = 0;
        this.field3621 = false;
        this.field3572 = false;
    }

    @ObfuscatedName("jl.b(IB)Ldh;")
    public final class127 method4364(int arg0) {
        if (this.field3612 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3617[var3] && this.field3617[var3] != 0) {
                    var2 = this.field3612[var3];
                }
            }
            if (var2 != -1) {
                return method1985(var2).method4364(1);
            }
        }
        class127 var4 = class127.method2257(Statics.field3576, this.field3582, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3616 != 128 || this.field3586 != 128 || this.field3618 != 128) {
            var4.method2262(this.field3616, this.field3586, this.field3618);
        }
        if (this.field3584 != null) {
            for (int var5 = 0; var5 < this.field3584.length; var5++) {
                var4.method2258(this.field3584[var5], this.field3585[var5]);
            }
        }
        if (this.field3596 != null) {
            for (int var6 = 0; var6 < this.field3596.length; var6++) {
                var4.method2260(this.field3596[var6], this.field3597[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jl.e(II)Les;")
    public final class133 method4365(int arg0) {
        if (this.field3612 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3617[var3] && this.field3617[var3] != 0) {
                    var2 = this.field3612[var3];
                }
            }
            if (var2 != -1) {
                return method1985(var2).method4365(1);
            }
        }
        class133 var4 = (class133) field3579.method3407((long) this.field3591);
        if (var4 != null) {
            return var4;
        }
        class127 var5 = class127.method2257(Statics.field3576, this.field3582, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3616 != 128 || this.field3586 != 128 || this.field3618 != 128) {
            var5.method2262(this.field3616, this.field3586, this.field3618);
        }
        if (this.field3584 != null) {
            for (int var6 = 0; var6 < this.field3584.length; var6++) {
                var5.method2258(this.field3584[var6], this.field3585[var6]);
            }
        }
        if (this.field3596 != null) {
            for (int var7 = 0; var7 < this.field3596.length; var7++) {
                var5.method2260(this.field3596[var7], this.field3597[var7]);
            }
        }
        class133 var8 = var5.method2331(this.field3615 + 64, this.field3620 + 768, -50, -10, -50);
        var8.field1855 = true;
        field3579.method3408(var8, (long) this.field3591);
        return var8;
    }

    @ObfuscatedName("jl.f(II)Ljl;")
    public class268 method4366(int arg0) {
        if (this.field3612 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3617[var3] && this.field3617[var3] != 0) {
                    var2 = this.field3612[var3];
                }
            }
            if (var2 != -1) {
                return method1985(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("dm.u(IIIIIZI)Lkg;")
    public static final class299 method2191(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class299 var8 = (class299) field3580.method3407(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class268 var9 = method1985(arg0);
        if (arg1 > 1 && var9.field3612 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3617[var11] && var9.field3617[var11] != 0) {
                    var10 = var9.field3612[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1985(var10);
            }
        }
        class133 var12 = var9.method4365(1);
        if (var12 == null) {
            return null;
        }
        class299 var13 = null;
        if (var9.field3607 != -1) {
            var13 = method2191(var9.field3614, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3625 != -1) {
            var13 = method2191(var9.field3624, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3627 != -1) {
            var13 = method2191(var9.field3626, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3837;
        int var15 = Statics.field3835;
        int var16 = Statics.field3833;
        int[] var17 = new int[4];
        class295.method4740(var17);
        class299 var18 = new class299(36, 32);
        class295.method4736(var18.field3857, 36, 32);
        class295.method4746();
        class136.method2442();
        class136.method2445(16, 16);
        class136.field1919 = false;
        if (var9.field3627 != -1) {
            var13.method4859(0, 0);
        }
        int var19 = var9.field3588;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class136.field1942[var9.field3589] * var19 >> 16;
        int var21 = class136.field1922[var9.field3589] * var19 >> 16;
        var12.method2359();
        var12.method2364(0, var9.field3609, var9.field3594, var9.field3589, var9.field3590, var9.field3593 + var12.field2026 / 2 + var20, var9.field3593 + var21);
        if (var9.field3625 != -1) {
            var13.method4859(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4855(1);
        }
        if (arg2 >= 2) {
            var18.method4855(16777215);
        }
        if (arg3 != 0) {
            var18.method4883(arg3);
        }
        class295.method4736(var18.field3857, 36, 32);
        if (var9.field3607 != -1) {
            var13.method4859(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3578 == 1) {
            Statics.field298.method4546(method1425(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3580.method3408(var18, var6);
        }
        class295.method4736(var14, var15, var16);
        class295.method4741(var17);
        class136.method2442();
        class136.field1919 = true;
        return var18;
    }

    @ObfuscatedName("client.t(IB)Ljava/lang/String;")
    public static final String method1425(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class237.field3126 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class237.field3196 + "</col>";
        }
    }

    @ObfuscatedName("jl.o(ZI)Z")
    public final boolean method4367(boolean arg0) {
        int var2 = this.field3600;
        int var3 = this.field3601;
        int var4 = this.field3606;
        if (arg0) {
            var2 = this.field3603;
            var3 = this.field3604;
            var4 = this.field3599;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3576.method3918(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3576.method3918(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3576.method3918(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jl.a(ZI)Ldh;")
    public final class127 method4368(boolean arg0) {
        int var2 = this.field3600;
        int var3 = this.field3601;
        int var4 = this.field3606;
        if (arg0) {
            var2 = this.field3603;
            var3 = this.field3604;
            var4 = this.field3599;
        }
        if (var2 == -1) {
            return null;
        }
        class127 var5 = class127.method2257(Statics.field3576, var2, 0);
        if (var3 != -1) {
            class127 var6 = class127.method2257(Statics.field3576, var3, 0);
            if (var4 == -1) {
                class127[] var9 = new class127[] { var5, var6 };
                var5 = new class127(var9, 2);
            } else {
                class127 var7 = class127.method2257(Statics.field3576, var4, 0);
                class127[] var8 = new class127[] { var5, var6, var7 };
                var5 = new class127(var8, 3);
            }
        }
        if (!arg0 && this.field3602 != 0) {
            var5.method2278(0, this.field3602, 0);
        }
        if (arg0 && this.field3605 != 0) {
            var5.method2278(0, this.field3605, 0);
        }
        if (this.field3584 != null) {
            for (int var10 = 0; var10 < this.field3584.length; var10++) {
                var5.method2258(this.field3584[var10], this.field3585[var10]);
            }
        }
        if (this.field3596 != null) {
            for (int var11 = 0; var11 < this.field3596.length; var11++) {
                var5.method2260(this.field3596[var11], this.field3597[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jl.i(ZB)Z")
    public final boolean method4375(boolean arg0) {
        int var2 = this.field3608;
        int var3 = this.field3587;
        if (arg0) {
            var2 = this.field3610;
            var3 = this.field3573;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3576.method3918(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3576.method3918(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jl.m(ZI)Ldh;")
    public final class127 method4385(boolean arg0) {
        int var2 = this.field3608;
        int var3 = this.field3587;
        if (arg0) {
            var2 = this.field3610;
            var3 = this.field3573;
        }
        if (var2 == -1) {
            return null;
        }
        class127 var4 = class127.method2257(Statics.field3576, var2, 0);
        if (var3 != -1) {
            class127 var5 = class127.method2257(Statics.field3576, var3, 0);
            class127[] var6 = new class127[] { var4, var5 };
            var4 = new class127(var6, 2);
        }
        if (this.field3584 != null) {
            for (int var7 = 0; var7 < this.field3584.length; var7++) {
                var4.method2258(this.field3584[var7], this.field3585[var7]);
            }
        }
        if (this.field3596 != null) {
            for (int var8 = 0; var8 < this.field3596.length; var8++) {
                var4.method2260(this.field3596[var8], this.field3597[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jl.x(III)I")
    public int method4371(int arg0, int arg1) {
        return class261.method107(this.field3581, arg0, arg1);
    }

    @ObfuscatedName("jl.j(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4372(int arg0, String arg1) {
        return class261.method3896(this.field3581, arg0, arg1);
    }

    @ObfuscatedName("jl.g(I)I")
    public int method4373() {
        if (this.field3574 == -1 || this.field3598 == null) {
            return -1;
        } else if (this.field3574 >= 0) {
            return this.field3598[this.field3574] == null ? -1 : this.field3574;
        } else if (class237.field2964.equalsIgnoreCase(this.field3598[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ek.c(I)V")
    public static void method2710() {
        field3611.method3409();
        field3579.method3409();
        field3580.method3409();
    }

    @ObfuscatedName("as.k(B)V")
    public static void method616() {
        field3580.method3409();
    }
}
