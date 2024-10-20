package deob;

@ObfuscatedName("jc")
public class class268 extends class206 {

    @ObfuscatedName("jc.k")
    public static class201 field3572 = new class201(64);

    @ObfuscatedName("jc.c")
    public static class201 field3573 = new class201(50);

    @ObfuscatedName("jc.o")
    public static class201 field3612 = new class201(200);

    @ObfuscatedName("jc.f")
    public int field3575;

    @ObfuscatedName("jc.q")
    public int field3576;

    @ObfuscatedName("jc.r")
    public String field3599 = "null";

    @ObfuscatedName("jc.x")
    public short[] field3607;

    @ObfuscatedName("jc.u")
    public short[] field3579;

    @ObfuscatedName("jc.b")
    public short[] field3577;

    @ObfuscatedName("jc.p")
    public short[] field3619;

    @ObfuscatedName("jc.y")
    public int field3582 = 2000;

    @ObfuscatedName("jc.n")
    public int field3597 = 0;

    @ObfuscatedName("jc.j")
    public int field3584 = 0;

    @ObfuscatedName("jc.e")
    public int field3585 = 0;

    @ObfuscatedName("jc.v")
    public int field3586 = 0;

    @ObfuscatedName("jc.a")
    public int field3587 = 0;

    @ObfuscatedName("jc.ad")
    public int field3588 = 0;

    @ObfuscatedName("jc.al")
    public int field3580 = 1;

    @ObfuscatedName("jc.aq")
    public boolean field3590 = false;

    @ObfuscatedName("jc.ar")
    public String[] field3591 = new String[] { null, null, class237.field2953, null, null };

    @ObfuscatedName("jc.an")
    public String[] field3592 = new String[] { null, null, null, null, class237.field2994 };

    @ObfuscatedName("jc.as")
    public int field3593 = -2;

    @ObfuscatedName("jc.ax")
    public int field3594 = -1;

    @ObfuscatedName("jc.ak")
    public int field3595 = -1;

    @ObfuscatedName("jc.aw")
    public int field3614 = 0;

    @ObfuscatedName("jc.ai")
    public int field3602 = -1;

    @ObfuscatedName("jc.ab")
    public int field3598 = -1;

    @ObfuscatedName("jc.am")
    public int field3568 = 0;

    @ObfuscatedName("jc.ah")
    public int field3600 = -1;

    @ObfuscatedName("jc.ag")
    public int field3601 = -1;

    @ObfuscatedName("jc.az")
    public int field3596 = -1;

    @ObfuscatedName("jc.ae")
    public int field3603 = -1;

    @ObfuscatedName("jc.ao")
    public int field3589 = -1;

    @ObfuscatedName("jc.av")
    public int field3605 = -1;

    @ObfuscatedName("jc.aj")
    public int[] field3581;

    @ObfuscatedName("jc.ap")
    public int[] field3583;

    @ObfuscatedName("jc.au")
    public int field3608 = -1;

    @ObfuscatedName("jc.ay")
    public int field3609 = -1;

    @ObfuscatedName("jc.aa")
    public int field3610 = 128;

    @ObfuscatedName("jc.at")
    public int field3578 = 128;

    @ObfuscatedName("jc.ac")
    public int field3606 = 128;

    @ObfuscatedName("jc.bj")
    public int field3613 = 0;

    @ObfuscatedName("jc.bo")
    public int field3569 = 0;

    @ObfuscatedName("jc.br")
    public int field3615 = 0;

    @ObfuscatedName("jc.bm")
    public class198 field3616;

    @ObfuscatedName("jc.bf")
    public boolean field3617 = false;

    @ObfuscatedName("jc.bh")
    public int field3618 = -1;

    @ObfuscatedName("jc.bt")
    public int field3574 = -1;

    @ObfuscatedName("jc.bi")
    public int field3620 = -1;

    @ObfuscatedName("jc.bq")
    public int field3621 = -1;

    @ObfuscatedName("ba.s(II)Ljc;")
    public static class268 method965(int arg0) {
        class268 var1 = (class268) field3572.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3604.method4231(10, arg0);
        class268 var3 = new class268();
        var3.field3575 = arg0;
        if (var2 != null) {
            var3.method4638(new class185(var2));
        }
        var3.method4637();
        if (var3.field3609 != -1) {
            var3.method4640(method965(var3.field3609), method965(var3.field3608));
        }
        if (var3.field3574 != -1) {
            var3.method4670(method965(var3.field3574), method965(var3.field3618));
        }
        if (var3.field3621 != -1) {
            var3.method4642(method965(var3.field3621), method965(var3.field3620));
        }
        if (!Statics.field472 && var3.field3590) {
            var3.field3599 = class237.field3218;
            var3.field3617 = false;
            var3.field3591 = null;
            var3.field3592 = null;
            var3.field3593 = -1;
            var3.field3615 = 0;
            if (var3.field3616 != null) {
                boolean var4 = false;
                for (class204 var5 = var3.field3616.method3640(); var5 != null; var5 = var3.field3616.method3645()) {
                    class263 var6 = class263.method3491((int) var5.field2585);
                    if (var6.field3471) {
                        var5.method3740();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3616 = null;
                }
            }
        }
        field3572.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jc.g(I)V")
    public void method4637() {
    }

    @ObfuscatedName("jc.m(Lgy;B)V")
    public void method4638(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4673(arg0, var2);
        }
    }

    @ObfuscatedName("jc.h(Lgy;II)V")
    public void method4673(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3576 = arg0.method3241();
        } else if (arg1 == 2) {
            this.field3599 = arg0.method3248();
        } else if (arg1 == 4) {
            this.field3582 = arg0.method3241();
        } else if (arg1 == 5) {
            this.field3597 = arg0.method3241();
        } else if (arg1 == 6) {
            this.field3584 = arg0.method3241();
        } else if (arg1 == 7) {
            this.field3586 = arg0.method3241();
            if (this.field3586 > 32767) {
                this.field3586 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3587 = arg0.method3241();
            if (this.field3587 > 32767) {
                this.field3587 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3588 = 1;
        } else if (arg1 == 12) {
            this.field3580 = arg0.method3292();
        } else if (arg1 == 16) {
            this.field3590 = true;
        } else if (arg1 == 23) {
            this.field3594 = arg0.method3241();
            this.field3614 = arg0.method3239();
        } else if (arg1 == 24) {
            this.field3595 = arg0.method3241();
        } else if (arg1 == 25) {
            this.field3602 = arg0.method3241();
            this.field3568 = arg0.method3239();
        } else if (arg1 == 26) {
            this.field3598 = arg0.method3241();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3591[arg1 - 30] = arg0.method3248();
            if (this.field3591[arg1 - 30].equalsIgnoreCase(class237.field2955)) {
                this.field3591[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3592[arg1 - 35] = arg0.method3248();
        } else if (arg1 == 40) {
            int var3 = arg0.method3239();
            this.field3607 = new short[var3];
            this.field3579 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3607[var4] = (short) arg0.method3241();
                this.field3579[var4] = (short) arg0.method3241();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3239();
            this.field3577 = new short[var5];
            this.field3619 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3577[var6] = (short) arg0.method3241();
                this.field3619[var6] = (short) arg0.method3241();
            }
        } else if (arg1 == 42) {
            this.field3593 = arg0.method3240();
        } else if (arg1 == 65) {
            this.field3617 = true;
        } else if (arg1 == 78) {
            this.field3600 = arg0.method3241();
        } else if (arg1 == 79) {
            this.field3601 = arg0.method3241();
        } else if (arg1 == 90) {
            this.field3596 = arg0.method3241();
        } else if (arg1 == 91) {
            this.field3589 = arg0.method3241();
        } else if (arg1 == 92) {
            this.field3603 = arg0.method3241();
        } else if (arg1 == 93) {
            this.field3605 = arg0.method3241();
        } else if (arg1 == 95) {
            this.field3585 = arg0.method3241();
        } else if (arg1 == 97) {
            this.field3608 = arg0.method3241();
        } else if (arg1 == 98) {
            this.field3609 = arg0.method3241();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3581 == null) {
                this.field3581 = new int[10];
                this.field3583 = new int[10];
            }
            this.field3581[arg1 - 100] = arg0.method3241();
            this.field3583[arg1 - 100] = arg0.method3241();
        } else if (arg1 == 110) {
            this.field3610 = arg0.method3241();
        } else if (arg1 == 111) {
            this.field3578 = arg0.method3241();
        } else if (arg1 == 112) {
            this.field3606 = arg0.method3241();
        } else if (arg1 == 113) {
            this.field3613 = arg0.method3240();
        } else if (arg1 == 114) {
            this.field3569 = arg0.method3240() * 5;
        } else if (arg1 == 115) {
            this.field3615 = arg0.method3239();
        } else if (arg1 == 139) {
            this.field3618 = arg0.method3241();
        } else if (arg1 == 140) {
            this.field3574 = arg0.method3241();
        } else if (arg1 == 148) {
            this.field3620 = arg0.method3241();
        } else if (arg1 == 149) {
            this.field3621 = arg0.method3241();
        } else if (arg1 == 249) {
            this.field3616 = class261.method4400(arg0, this.field3616);
        }
    }

    @ObfuscatedName("jc.i(Ljc;Ljc;I)V")
    public void method4640(class268 arg0, class268 arg1) {
        this.field3576 = arg0.field3576;
        this.field3582 = arg0.field3582;
        this.field3597 = arg0.field3597;
        this.field3584 = arg0.field3584;
        this.field3585 = arg0.field3585;
        this.field3586 = arg0.field3586;
        this.field3587 = arg0.field3587;
        this.field3607 = arg0.field3607;
        this.field3579 = arg0.field3579;
        this.field3577 = arg0.field3577;
        this.field3619 = arg0.field3619;
        this.field3599 = arg1.field3599;
        this.field3590 = arg1.field3590;
        this.field3580 = arg1.field3580;
        this.field3588 = 1;
    }

    @ObfuscatedName("jc.w(Ljc;Ljc;B)V")
    public void method4670(class268 arg0, class268 arg1) {
        this.field3576 = arg0.field3576;
        this.field3582 = arg0.field3582;
        this.field3597 = arg0.field3597;
        this.field3584 = arg0.field3584;
        this.field3585 = arg0.field3585;
        this.field3586 = arg0.field3586;
        this.field3587 = arg0.field3587;
        this.field3607 = arg1.field3607;
        this.field3579 = arg1.field3579;
        this.field3577 = arg1.field3577;
        this.field3619 = arg1.field3619;
        this.field3599 = arg1.field3599;
        this.field3590 = arg1.field3590;
        this.field3588 = arg1.field3588;
        this.field3594 = arg1.field3594;
        this.field3595 = arg1.field3595;
        this.field3600 = arg1.field3600;
        this.field3602 = arg1.field3602;
        this.field3598 = arg1.field3598;
        this.field3601 = arg1.field3601;
        this.field3596 = arg1.field3596;
        this.field3603 = arg1.field3603;
        this.field3589 = arg1.field3589;
        this.field3605 = arg1.field3605;
        this.field3615 = arg1.field3615;
        this.field3591 = arg1.field3591;
        this.field3592 = new String[5];
        if (arg1.field3592 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3592[var3] = arg1.field3592[var3];
            }
        }
        this.field3592[4] = class237.field3079;
        this.field3580 = 0;
    }

    @ObfuscatedName("jc.t(Ljc;Ljc;B)V")
    public void method4642(class268 arg0, class268 arg1) {
        this.field3576 = arg0.field3576;
        this.field3582 = arg0.field3582;
        this.field3597 = arg0.field3597;
        this.field3584 = arg0.field3584;
        this.field3585 = arg0.field3585;
        this.field3586 = arg0.field3586;
        this.field3587 = arg0.field3587;
        this.field3607 = arg0.field3607;
        this.field3579 = arg0.field3579;
        this.field3577 = arg0.field3577;
        this.field3619 = arg0.field3619;
        this.field3588 = arg0.field3588;
        this.field3599 = arg1.field3599;
        this.field3580 = 0;
        this.field3590 = false;
        this.field3617 = false;
    }

    @ObfuscatedName("jc.d(IB)Ldw;")
    public final class125 method4664(int arg0) {
        if (this.field3581 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3583[var3] && this.field3583[var3] != 0) {
                    var2 = this.field3581[var3];
                }
            }
            if (var2 != -1) {
                return method965(var2).method4664(1);
            }
        }
        class125 var4 = class125.method2428(Statics.field2093, this.field3576, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3610 != 128 || this.field3578 != 128 || this.field3606 != 128) {
            var4.method2430(this.field3610, this.field3578, this.field3606);
        }
        if (this.field3607 != null) {
            for (int var5 = 0; var5 < this.field3607.length; var5++) {
                var4.method2442(this.field3607[var5], this.field3579[var5]);
            }
        }
        if (this.field3577 != null) {
            for (int var6 = 0; var6 < this.field3577.length; var6++) {
                var4.method2443(this.field3577[var6], this.field3619[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jc.z(II)Les;")
    public final class131 method4665(int arg0) {
        if (this.field3581 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3583[var3] && this.field3583[var3] != 0) {
                    var2 = this.field3581[var3];
                }
            }
            if (var2 != -1) {
                return method965(var2).method4665(1);
            }
        }
        class131 var4 = (class131) field3573.method3673((long) this.field3575);
        if (var4 != null) {
            return var4;
        }
        class125 var5 = class125.method2428(Statics.field2093, this.field3576, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3610 != 128 || this.field3578 != 128 || this.field3606 != 128) {
            var5.method2430(this.field3610, this.field3578, this.field3606);
        }
        if (this.field3607 != null) {
            for (int var6 = 0; var6 < this.field3607.length; var6++) {
                var5.method2442(this.field3607[var6], this.field3579[var6]);
            }
        }
        if (this.field3577 != null) {
            for (int var7 = 0; var7 < this.field3577.length; var7++) {
                var5.method2443(this.field3577[var7], this.field3619[var7]);
            }
        }
        class131 var8 = var5.method2450(this.field3613 + 64, this.field3569 + 768, -50, -10, -50);
        var8.field1870 = true;
        field3573.method3675(var8, (long) this.field3575);
        return var8;
    }

    @ObfuscatedName("jc.k(IS)Ljc;")
    public class268 method4643(int arg0) {
        if (this.field3581 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3583[var3] && this.field3583[var3] != 0) {
                    var2 = this.field3581[var3];
                }
            }
            if (var2 != -1) {
                return method965(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ju.c(IIIIIZI)Lki;")
    public static final class310 method4633(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class310 var8 = (class310) field3612.method3673(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class268 var9 = method965(arg0);
        if (arg1 > 1 && var9.field3581 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3583[var11] && var9.field3583[var11] != 0) {
                    var10 = var9.field3581[var11];
                }
            }
            if (var10 != -1) {
                var9 = method965(var10);
            }
        }
        class131 var12 = var9.method4665(1);
        if (var12 == null) {
            return null;
        }
        class310 var13 = null;
        if (var9.field3609 != -1) {
            var13 = method4633(var9.field3608, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3574 != -1) {
            var13 = method4633(var9.field3618, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3621 != -1) {
            var13 = method4633(var9.field3620, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3876;
        int var15 = Statics.field3872;
        int var16 = Statics.field3871;
        int[] var17 = new int[4];
        class306.method5180(var17);
        class310 var18 = new class310(36, 32);
        class306.method5179(var18.field3901, 36, 32);
        class306.method5178();
        class134.method2625();
        class134.method2628(16, 16);
        class134.field1896 = false;
        if (var9.field3621 != -1) {
            var13.method5302(0, 0);
        }
        int var19 = var9.field3582;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class134.field1918[var9.field3597] * var19 >> 16;
        int var21 = class134.field1903[var9.field3597] * var19 >> 16;
        var12.method2578();
        var12.method2540(0, var9.field3584, var9.field3585, var9.field3597, var9.field3586, var9.field3587 + var12.field2001 / 2 + var20, var9.field3587 + var21);
        if (var9.field3574 != -1) {
            var13.method5302(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5298(1);
        }
        if (arg2 >= 2) {
            var18.method5298(16777215);
        }
        if (arg3 != 0) {
            var18.method5311(arg3);
        }
        class306.method5179(var18.field3901, 36, 32);
        if (var9.field3609 != -1) {
            var13.method5302(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3588 == 1) {
            Statics.field794.method5015(method4153(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3612.method3675(var18, var6);
        }
        class306.method5179(var14, var15, var16);
        class306.method5184(var17);
        class134.method2625();
        class134.field1896 = true;
        return var18;
    }

    @ObfuscatedName("hj.o(II)Ljava/lang/String;")
    public static final String method4153(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class237.field3188 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class237.field3114 + "</col>";
        }
    }

    @ObfuscatedName("jc.l(ZI)Z")
    public final boolean method4646(boolean arg0) {
        int var2 = this.field3594;
        int var3 = this.field3595;
        int var4 = this.field3600;
        if (arg0) {
            var2 = this.field3602;
            var3 = this.field3598;
            var4 = this.field3601;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2093.method4186(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2093.method4186(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2093.method4186(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jc.f(ZB)Ldw;")
    public final class125 method4647(boolean arg0) {
        int var2 = this.field3594;
        int var3 = this.field3595;
        int var4 = this.field3600;
        if (arg0) {
            var2 = this.field3602;
            var3 = this.field3598;
            var4 = this.field3601;
        }
        if (var2 == -1) {
            return null;
        }
        class125 var5 = class125.method2428(Statics.field2093, var2, 0);
        if (var3 != -1) {
            class125 var6 = class125.method2428(Statics.field2093, var3, 0);
            if (var4 == -1) {
                class125[] var9 = new class125[] { var5, var6 };
                var5 = new class125(var9, 2);
            } else {
                class125 var7 = class125.method2428(Statics.field2093, var4, 0);
                class125[] var8 = new class125[] { var5, var6, var7 };
                var5 = new class125(var8, 3);
            }
        }
        if (!arg0 && this.field3614 != 0) {
            var5.method2441(0, this.field3614, 0);
        }
        if (arg0 && this.field3568 != 0) {
            var5.method2441(0, this.field3568, 0);
        }
        if (this.field3607 != null) {
            for (int var10 = 0; var10 < this.field3607.length; var10++) {
                var5.method2442(this.field3607[var10], this.field3579[var10]);
            }
        }
        if (this.field3577 != null) {
            for (int var11 = 0; var11 < this.field3577.length; var11++) {
                var5.method2443(this.field3577[var11], this.field3619[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jc.q(ZB)Z")
    public final boolean method4649(boolean arg0) {
        int var2 = this.field3596;
        int var3 = this.field3603;
        if (arg0) {
            var2 = this.field3589;
            var3 = this.field3605;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2093.method4186(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2093.method4186(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jc.r(ZI)Ldw;")
    public final class125 method4686(boolean arg0) {
        int var2 = this.field3596;
        int var3 = this.field3603;
        if (arg0) {
            var2 = this.field3589;
            var3 = this.field3605;
        }
        if (var2 == -1) {
            return null;
        }
        class125 var4 = class125.method2428(Statics.field2093, var2, 0);
        if (var3 != -1) {
            class125 var5 = class125.method2428(Statics.field2093, var3, 0);
            class125[] var6 = new class125[] { var4, var5 };
            var4 = new class125(var6, 2);
        }
        if (this.field3607 != null) {
            for (int var7 = 0; var7 < this.field3607.length; var7++) {
                var4.method2442(this.field3607[var7], this.field3579[var7]);
            }
        }
        if (this.field3577 != null) {
            for (int var8 = 0; var8 < this.field3577.length; var8++) {
                var4.method2443(this.field3577[var8], this.field3619[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jc.x(III)I")
    public int method4650(int arg0, int arg1) {
        return class261.method1479(this.field3616, arg0, arg1);
    }

    @ObfuscatedName("jc.u(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4651(int arg0, String arg1) {
        return class261.method4283(this.field3616, arg0, arg1);
    }

    @ObfuscatedName("jc.a(B)I")
    public int method4652() {
        if (this.field3593 == -1 || this.field3592 == null) {
            return -1;
        } else if (this.field3593 >= 0) {
            return this.field3592[this.field3593] == null ? -1 : this.field3593;
        } else if (class237.field2994.equalsIgnoreCase(this.field3592[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ib.al(ZI)V")
    public static void method4166(boolean arg0) {
        if (Statics.field472 != arg0) {
            Statics.method4175();
            Statics.field472 = arg0;
        }
    }
}
