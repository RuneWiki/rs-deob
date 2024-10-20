package deob;

@ObfuscatedName("jx")
public class class277 extends class215 {

    @ObfuscatedName("jx.c")
    public static class210 field3616 = new class210(64);

    @ObfuscatedName("jx.u")
    public static class210 field3575 = new class210(50);

    @ObfuscatedName("jx.r")
    public static class210 field3576 = new class210(200);

    @ObfuscatedName("jx.v")
    public int field3577;

    @ObfuscatedName("jx.s")
    public int field3578;

    @ObfuscatedName("jx.t")
    public String field3579 = "null";

    @ObfuscatedName("jx.f")
    public short[] field3615;

    @ObfuscatedName("jx.m")
    public short[] field3599;

    @ObfuscatedName("jx.x")
    public short[] field3582;

    @ObfuscatedName("jx.w")
    public short[] field3618;

    @ObfuscatedName("jx.j")
    public int field3584 = 2000;

    @ObfuscatedName("jx.z")
    public int field3585 = 0;

    @ObfuscatedName("jx.e")
    public int field3586 = 0;

    @ObfuscatedName("jx.k")
    public int field3583 = 0;

    @ObfuscatedName("jx.n")
    public int field3588 = 0;

    @ObfuscatedName("jx.i")
    public int field3589 = 0;

    @ObfuscatedName("jx.av")
    public int field3590 = 0;

    @ObfuscatedName("jx.ao")
    public int field3591 = 1;

    @ObfuscatedName("jx.am")
    public boolean field3592 = false;

    @ObfuscatedName("jx.aj")
    public String[] field3593 = new String[] { null, null, class246.field3178, null, null };

    @ObfuscatedName("jx.ah")
    public String[] field3594 = new String[] { null, null, null, null, class246.field2974 };

    @ObfuscatedName("jx.ai")
    public int field3595 = -2;

    @ObfuscatedName("jx.aq")
    public int field3596 = -1;

    @ObfuscatedName("jx.ak")
    public int field3610 = -1;

    @ObfuscatedName("jx.al")
    public int field3598 = 0;

    @ObfuscatedName("jx.as")
    public int field3622 = -1;

    @ObfuscatedName("jx.az")
    public int field3600 = -1;

    @ObfuscatedName("jx.ax")
    public int field3611 = 0;

    @ObfuscatedName("jx.ad")
    public int field3614 = -1;

    @ObfuscatedName("jx.ar")
    public int field3603 = -1;

    @ObfuscatedName("jx.ag")
    public int field3570 = -1;

    @ObfuscatedName("jx.au")
    public int field3623 = -1;

    @ObfuscatedName("jx.ac")
    public int field3605 = -1;

    @ObfuscatedName("jx.ay")
    public int field3620 = -1;

    @ObfuscatedName("jx.at")
    public int[] field3608;

    @ObfuscatedName("jx.aa")
    public int[] field3609;

    @ObfuscatedName("jx.aw")
    public int field3601 = -1;

    @ObfuscatedName("jx.ab")
    public int field3580 = -1;

    @ObfuscatedName("jx.ap")
    public int field3612 = 128;

    @ObfuscatedName("jx.ae")
    public int field3613 = 128;

    @ObfuscatedName("jx.an")
    public int field3604 = 128;

    @ObfuscatedName("jx.bh")
    public int field3607 = 0;

    @ObfuscatedName("jx.bx")
    public int field3597 = 0;

    @ObfuscatedName("jx.bb")
    public int field3617 = 0;

    @ObfuscatedName("jx.bf")
    public class207 field3574;

    @ObfuscatedName("jx.bp")
    public boolean field3619 = false;

    @ObfuscatedName("jx.bj")
    public int field3606 = -1;

    @ObfuscatedName("jx.bi")
    public int field3621 = -1;

    @ObfuscatedName("jx.br")
    public int field3602 = -1;

    @ObfuscatedName("jx.be")
    public int field3587 = -1;

    @ObfuscatedName("cl.b(IB)Ljx;")
    public static class277 method1730(int arg0) {
        class277 var1 = (class277) field3616.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3572.method4158(10, arg0);
        class277 var3 = new class277();
        var3.field3577 = arg0;
        if (var2 != null) {
            var3.method4603(new class194(var2));
        }
        var3.method4602();
        if (var3.field3580 != -1) {
            var3.method4605(method1730(var3.field3580), method1730(var3.field3601));
        }
        if (var3.field3621 != -1) {
            var3.method4625(method1730(var3.field3621), method1730(var3.field3606));
        }
        if (var3.field3587 != -1) {
            var3.method4638(method1730(var3.field3587), method1730(var3.field3602));
        }
        if (!Statics.field3573 && var3.field3592) {
            var3.field3579 = class246.field2989;
            var3.field3619 = false;
            var3.field3593 = null;
            var3.field3594 = null;
            var3.field3595 = -1;
            var3.field3617 = 0;
            if (var3.field3574 != null) {
                boolean var4 = false;
                for (class213 var5 = var3.field3574.method3633(); var5 != null; var5 = var3.field3574.method3642()) {
                    class272 var6 = class272.method2932((int) var5.field2613);
                    if (var6.field3480) {
                        var5.method3726();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3574 = null;
                }
            }
        }
        field3616.method3659(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.q(I)V")
    public void method4602() {
    }

    @ObfuscatedName("jx.o(Lgn;I)V")
    public void method4603(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4657(arg0, var2);
        }
    }

    @ObfuscatedName("jx.p(Lgn;II)V")
    public void method4657(class194 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3578 = arg0.method3249();
        } else if (arg1 == 2) {
            this.field3579 = arg0.method3256();
        } else if (arg1 == 4) {
            this.field3584 = arg0.method3249();
        } else if (arg1 == 5) {
            this.field3585 = arg0.method3249();
        } else if (arg1 == 6) {
            this.field3586 = arg0.method3249();
        } else if (arg1 == 7) {
            this.field3588 = arg0.method3249();
            if (this.field3588 > 32767) {
                this.field3588 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3589 = arg0.method3249();
            if (this.field3589 > 32767) {
                this.field3589 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3590 = 1;
        } else if (arg1 == 12) {
            this.field3591 = arg0.method3261();
        } else if (arg1 == 16) {
            this.field3592 = true;
        } else if (arg1 == 23) {
            this.field3596 = arg0.method3249();
            this.field3598 = arg0.method3247();
        } else if (arg1 == 24) {
            this.field3610 = arg0.method3249();
        } else if (arg1 == 25) {
            this.field3622 = arg0.method3249();
            this.field3611 = arg0.method3247();
        } else if (arg1 == 26) {
            this.field3600 = arg0.method3249();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3593[arg1 - 30] = arg0.method3256();
            if (this.field3593[arg1 - 30].equalsIgnoreCase(class246.field2975)) {
                this.field3593[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3594[arg1 - 35] = arg0.method3256();
        } else if (arg1 == 40) {
            int var3 = arg0.method3247();
            this.field3615 = new short[var3];
            this.field3599 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3615[var4] = (short) arg0.method3249();
                this.field3599[var4] = (short) arg0.method3249();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3247();
            this.field3582 = new short[var5];
            this.field3618 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3582[var6] = (short) arg0.method3249();
                this.field3618[var6] = (short) arg0.method3249();
            }
        } else if (arg1 == 42) {
            this.field3595 = arg0.method3248();
        } else if (arg1 == 65) {
            this.field3619 = true;
        } else if (arg1 == 78) {
            this.field3614 = arg0.method3249();
        } else if (arg1 == 79) {
            this.field3603 = arg0.method3249();
        } else if (arg1 == 90) {
            this.field3570 = arg0.method3249();
        } else if (arg1 == 91) {
            this.field3605 = arg0.method3249();
        } else if (arg1 == 92) {
            this.field3623 = arg0.method3249();
        } else if (arg1 == 93) {
            this.field3620 = arg0.method3249();
        } else if (arg1 == 95) {
            this.field3583 = arg0.method3249();
        } else if (arg1 == 97) {
            this.field3601 = arg0.method3249();
        } else if (arg1 == 98) {
            this.field3580 = arg0.method3249();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3608 == null) {
                this.field3608 = new int[10];
                this.field3609 = new int[10];
            }
            this.field3608[arg1 - 100] = arg0.method3249();
            this.field3609[arg1 - 100] = arg0.method3249();
        } else if (arg1 == 110) {
            this.field3612 = arg0.method3249();
        } else if (arg1 == 111) {
            this.field3613 = arg0.method3249();
        } else if (arg1 == 112) {
            this.field3604 = arg0.method3249();
        } else if (arg1 == 113) {
            this.field3607 = arg0.method3248();
        } else if (arg1 == 114) {
            this.field3597 = arg0.method3248() * 5;
        } else if (arg1 == 115) {
            this.field3617 = arg0.method3247();
        } else if (arg1 == 139) {
            this.field3606 = arg0.method3249();
        } else if (arg1 == 140) {
            this.field3621 = arg0.method3249();
        } else if (arg1 == 148) {
            this.field3602 = arg0.method3249();
        } else if (arg1 == 149) {
            this.field3587 = arg0.method3249();
        } else if (arg1 == 249) {
            this.field3574 = class270.method2485(arg0, this.field3574);
        }
    }

    @ObfuscatedName("jx.a(Ljx;Ljx;B)V")
    public void method4605(class277 arg0, class277 arg1) {
        this.field3578 = arg0.field3578;
        this.field3584 = arg0.field3584;
        this.field3585 = arg0.field3585;
        this.field3586 = arg0.field3586;
        this.field3583 = arg0.field3583;
        this.field3588 = arg0.field3588;
        this.field3589 = arg0.field3589;
        this.field3615 = arg0.field3615;
        this.field3599 = arg0.field3599;
        this.field3582 = arg0.field3582;
        this.field3618 = arg0.field3618;
        this.field3579 = arg1.field3579;
        this.field3592 = arg1.field3592;
        this.field3591 = arg1.field3591;
        this.field3590 = 1;
    }

    @ObfuscatedName("jx.h(Ljx;Ljx;I)V")
    public void method4625(class277 arg0, class277 arg1) {
        this.field3578 = arg0.field3578;
        this.field3584 = arg0.field3584;
        this.field3585 = arg0.field3585;
        this.field3586 = arg0.field3586;
        this.field3583 = arg0.field3583;
        this.field3588 = arg0.field3588;
        this.field3589 = arg0.field3589;
        this.field3615 = arg1.field3615;
        this.field3599 = arg1.field3599;
        this.field3582 = arg1.field3582;
        this.field3618 = arg1.field3618;
        this.field3579 = arg1.field3579;
        this.field3592 = arg1.field3592;
        this.field3590 = arg1.field3590;
        this.field3596 = arg1.field3596;
        this.field3610 = arg1.field3610;
        this.field3614 = arg1.field3614;
        this.field3622 = arg1.field3622;
        this.field3600 = arg1.field3600;
        this.field3603 = arg1.field3603;
        this.field3570 = arg1.field3570;
        this.field3623 = arg1.field3623;
        this.field3605 = arg1.field3605;
        this.field3620 = arg1.field3620;
        this.field3617 = arg1.field3617;
        this.field3593 = arg1.field3593;
        this.field3594 = new String[5];
        if (arg1.field3594 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3594[var3] = arg1.field3594[var3];
            }
        }
        this.field3594[4] = class246.field2979;
        this.field3591 = 0;
    }

    @ObfuscatedName("jx.l(Ljx;Ljx;B)V")
    public void method4638(class277 arg0, class277 arg1) {
        this.field3578 = arg0.field3578;
        this.field3584 = arg0.field3584;
        this.field3585 = arg0.field3585;
        this.field3586 = arg0.field3586;
        this.field3583 = arg0.field3583;
        this.field3588 = arg0.field3588;
        this.field3589 = arg0.field3589;
        this.field3615 = arg0.field3615;
        this.field3599 = arg0.field3599;
        this.field3582 = arg0.field3582;
        this.field3618 = arg0.field3618;
        this.field3590 = arg0.field3590;
        this.field3579 = arg1.field3579;
        this.field3591 = 0;
        this.field3592 = false;
        this.field3619 = false;
    }

    @ObfuscatedName("jx.y(II)Ldy;")
    public final class125 method4629(int arg0) {
        if (this.field3608 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3609[var3] && this.field3609[var3] != 0) {
                    var2 = this.field3608[var3];
                }
            }
            if (var2 != -1) {
                return method1730(var2).method4629(1);
            }
        }
        class125 var4 = class125.method2389(Statics.field304, this.field3578, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3612 != 128 || this.field3613 != 128 || this.field3604 != 128) {
            var4.method2404(this.field3612, this.field3613, this.field3604);
        }
        if (this.field3615 != null) {
            for (int var5 = 0; var5 < this.field3615.length; var5++) {
                var4.method2401(this.field3615[var5], this.field3599[var5]);
            }
        }
        if (this.field3582 != null) {
            for (int var6 = 0; var6 < this.field3582.length; var6++) {
                var4.method2402(this.field3582[var6], this.field3618[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jx.g(IB)Lee;")
    public final class131 method4609(int arg0) {
        if (this.field3608 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3609[var3] && this.field3609[var3] != 0) {
                    var2 = this.field3608[var3];
                }
            }
            if (var2 != -1) {
                return method1730(var2).method4609(1);
            }
        }
        class131 var4 = (class131) field3575.method3658((long) this.field3577);
        if (var4 != null) {
            return var4;
        }
        class125 var5 = class125.method2389(Statics.field304, this.field3578, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3612 != 128 || this.field3613 != 128 || this.field3604 != 128) {
            var5.method2404(this.field3612, this.field3613, this.field3604);
        }
        if (this.field3615 != null) {
            for (int var6 = 0; var6 < this.field3615.length; var6++) {
                var5.method2401(this.field3615[var6], this.field3599[var6]);
            }
        }
        if (this.field3582 != null) {
            for (int var7 = 0; var7 < this.field3582.length; var7++) {
                var5.method2402(this.field3582[var7], this.field3618[var7]);
            }
        }
        class131 var8 = var5.method2409(this.field3607 + 64, this.field3597 + 768, -50, -10, -50);
        var8.field1828 = true;
        field3575.method3659(var8, (long) this.field3577);
        return var8;
    }

    @ObfuscatedName("jx.c(II)Ljx;")
    public class277 method4601(int arg0) {
        if (this.field3608 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3609[var3] && this.field3609[var3] != 0) {
                    var2 = this.field3608[var3];
                }
            }
            if (var2 != -1) {
                return method1730(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ef.u(IIIIIZB)Llm;")
    public static final class323 method2881(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class323 var8 = (class323) field3576.method3658(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class277 var9 = method1730(arg0);
        if (arg1 > 1 && var9.field3608 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3609[var11] && var9.field3609[var11] != 0) {
                    var10 = var9.field3608[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1730(var10);
            }
        }
        class131 var12 = var9.method4609(1);
        if (var12 == null) {
            return null;
        }
        class323 var13 = null;
        if (var9.field3580 != -1) {
            var13 = method2881(var9.field3601, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3621 != -1) {
            var13 = method2881(var9.field3606, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3587 != -1) {
            var13 = method2881(var9.field3602, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3876;
        int var15 = Statics.field3881;
        int var16 = Statics.field3877;
        int[] var17 = new int[4];
        class319.method5225(var17);
        class323 var18 = new class323(36, 32);
        class319.method5210(var18.field3904, 36, 32);
        class319.method5216();
        class134.method2594();
        class134.method2623(16, 16);
        class134.field1910 = false;
        if (var9.field3587 != -1) {
            var13.method5344(0, 0);
        }
        int var19 = var9.field3584;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class134.field1902[var9.field3585] * var19 >> 16;
        int var21 = class134.field1917[var9.field3585] * var19 >> 16;
        var12.method2495();
        var12.method2519(0, var9.field3586, var9.field3583, var9.field3585, var9.field3588, var9.field3589 + var12.field1996 / 2 + var20, var9.field3589 + var21);
        if (var9.field3621 != -1) {
            var13.method5344(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5394(1);
        }
        if (arg2 >= 2) {
            var18.method5394(16777215);
        }
        if (arg3 != 0) {
            var18.method5341(arg3);
        }
        class319.method5210(var18.field3904, 36, 32);
        if (var9.field3580 != -1) {
            var13.method5344(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3590 == 1) {
            Statics.field658.method5003(method3132(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3576.method3659(var18, var6);
        }
        class319.method5210(var14, var15, var16);
        class319.method5240(var17);
        class134.method2594();
        class134.field1910 = true;
        return var18;
    }

    @ObfuscatedName("fw.t(IB)Ljava/lang/String;")
    public static final String method3132(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class246.field3136 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class246.field3134 + "</col>";
        }
    }

    @ObfuscatedName("jx.f(ZB)Z")
    public final boolean method4611(boolean arg0) {
        int var2 = this.field3596;
        int var3 = this.field3610;
        int var4 = this.field3614;
        if (arg0) {
            var2 = this.field3622;
            var3 = this.field3600;
            var4 = this.field3603;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field304.method4221(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field304.method4221(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field304.method4221(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jx.m(ZI)Ldy;")
    public final class125 method4658(boolean arg0) {
        int var2 = this.field3596;
        int var3 = this.field3610;
        int var4 = this.field3614;
        if (arg0) {
            var2 = this.field3622;
            var3 = this.field3600;
            var4 = this.field3603;
        }
        if (var2 == -1) {
            return null;
        }
        class125 var5 = class125.method2389(Statics.field304, var2, 0);
        if (var3 != -1) {
            class125 var6 = class125.method2389(Statics.field304, var3, 0);
            if (var4 == -1) {
                class125[] var9 = new class125[] { var5, var6 };
                var5 = new class125(var9, 2);
            } else {
                class125 var7 = class125.method2389(Statics.field304, var4, 0);
                class125[] var8 = new class125[] { var5, var6, var7 };
                var5 = new class125(var8, 3);
            }
        }
        if (!arg0 && this.field3598 != 0) {
            var5.method2400(0, this.field3598, 0);
        }
        if (arg0 && this.field3611 != 0) {
            var5.method2400(0, this.field3611, 0);
        }
        if (this.field3615 != null) {
            for (int var10 = 0; var10 < this.field3615.length; var10++) {
                var5.method2401(this.field3615[var10], this.field3599[var10]);
            }
        }
        if (this.field3582 != null) {
            for (int var11 = 0; var11 < this.field3582.length; var11++) {
                var5.method2402(this.field3582[var11], this.field3618[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jx.x(ZI)Z")
    public final boolean method4613(boolean arg0) {
        int var2 = this.field3570;
        int var3 = this.field3623;
        if (arg0) {
            var2 = this.field3605;
            var3 = this.field3620;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field304.method4221(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field304.method4221(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jx.w(ZB)Ldy;")
    public final class125 method4614(boolean arg0) {
        int var2 = this.field3570;
        int var3 = this.field3623;
        if (arg0) {
            var2 = this.field3605;
            var3 = this.field3620;
        }
        if (var2 == -1) {
            return null;
        }
        class125 var4 = class125.method2389(Statics.field304, var2, 0);
        if (var3 != -1) {
            class125 var5 = class125.method2389(Statics.field304, var3, 0);
            class125[] var6 = new class125[] { var4, var5 };
            var4 = new class125(var6, 2);
        }
        if (this.field3615 != null) {
            for (int var7 = 0; var7 < this.field3615.length; var7++) {
                var4.method2401(this.field3615[var7], this.field3599[var7]);
            }
        }
        if (this.field3582 != null) {
            for (int var8 = 0; var8 < this.field3582.length; var8++) {
                var4.method2402(this.field3582[var8], this.field3618[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jx.j(IIB)I")
    public int method4615(int arg0, int arg1) {
        class207 var3 = this.field3574;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class219 var5 = (class219) var3.method3632((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2626;
            }
        }
        return var4;
    }

    @ObfuscatedName("jx.z(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4616(int arg0, String arg1) {
        return class270.method941(this.field3574, arg0, arg1);
    }

    @ObfuscatedName("jx.e(B)I")
    public int method4617() {
        if (this.field3595 == -1 || this.field3594 == null) {
            return -1;
        } else if (this.field3595 >= 0) {
            return this.field3594[this.field3595] == null ? -1 : this.field3595;
        } else if (class246.field2974.equalsIgnoreCase(this.field3594[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("go.k(I)V")
    public static void method3567() {
        field3576.method3661();
    }

    @ObfuscatedName("iw.ao(ZI)V")
    public static void method4149(boolean arg0) {
        if (Statics.field3573 != arg0) {
            field3616.method3661();
            field3575.method3661();
            field3576.method3661();
            Statics.field3573 = arg0;
        }
    }
}
