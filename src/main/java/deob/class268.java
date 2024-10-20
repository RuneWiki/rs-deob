package deob;

@ObfuscatedName("jj")
public class class268 extends class206 {

    @ObfuscatedName("jj.h")
    public static class201 field3598 = new class201(64);

    @ObfuscatedName("jj.o")
    public static class201 field3553 = new class201(50);

    @ObfuscatedName("jj.x")
    public static class201 field3564 = new class201(200);

    @ObfuscatedName("jj.v")
    public int field3555;

    @ObfuscatedName("jj.n")
    public int field3556;

    @ObfuscatedName("jj.y")
    public String field3557 = "null";

    @ObfuscatedName("jj.d")
    public short[] field3558;

    @ObfuscatedName("jj.l")
    public short[] field3559;

    @ObfuscatedName("jj.f")
    public short[] field3560;

    @ObfuscatedName("jj.k")
    public short[] field3592;

    @ObfuscatedName("jj.e")
    public int field3562 = 2000;

    @ObfuscatedName("jj.u")
    public int field3563 = 0;

    @ObfuscatedName("jj.g")
    public int field3570 = 0;

    @ObfuscatedName("jj.z")
    public int field3565 = 0;

    @ObfuscatedName("jj.b")
    public int field3567 = 0;

    @ObfuscatedName("jj.c")
    public int field3584 = 0;

    @ObfuscatedName("jj.aa")
    public int field3568 = 0;

    @ObfuscatedName("jj.ap")
    public int field3589 = 1;

    @ObfuscatedName("jj.ao")
    public boolean field3574 = false;

    @ObfuscatedName("jj.ar")
    public String[] field3591 = new String[] { null, null, class237.field3042, null, null };

    @ObfuscatedName("jj.ay")
    public String[] field3572 = new String[] { null, null, null, null, class237.field2936 };

    @ObfuscatedName("jj.ae")
    public int field3573 = -2;

    @ObfuscatedName("jj.ah")
    public int field3594 = -1;

    @ObfuscatedName("jj.ai")
    public int field3575 = -1;

    @ObfuscatedName("jj.au")
    public int field3576 = 0;

    @ObfuscatedName("jj.am")
    public int field3577 = -1;

    @ObfuscatedName("jj.af")
    public int field3578 = -1;

    @ObfuscatedName("jj.an")
    public int field3579 = 0;

    @ObfuscatedName("jj.ag")
    public int field3588 = -1;

    @ObfuscatedName("jj.av")
    public int field3581 = -1;

    @ObfuscatedName("jj.aw")
    public int field3582 = -1;

    @ObfuscatedName("jj.ad")
    public int field3583 = -1;

    @ObfuscatedName("jj.ab")
    public int field3546 = -1;

    @ObfuscatedName("jj.aq")
    public int field3585 = -1;

    @ObfuscatedName("jj.ac")
    public int[] field3586;

    @ObfuscatedName("jj.ak")
    public int[] field3587;

    @ObfuscatedName("jj.az")
    public int field3595 = -1;

    @ObfuscatedName("jj.as")
    public int field3571 = -1;

    @ObfuscatedName("jj.at")
    public int field3590 = 128;

    @ObfuscatedName("jj.aj")
    public int field3601 = 128;

    @ObfuscatedName("jj.al")
    public int field3566 = 128;

    @ObfuscatedName("jj.bw")
    public int field3593 = 0;

    @ObfuscatedName("jj.bt")
    public int field3580 = 0;

    @ObfuscatedName("jj.by")
    public int field3552 = 0;

    @ObfuscatedName("jj.bq")
    public class198 field3596;

    @ObfuscatedName("jj.bf")
    public boolean field3561 = false;

    @ObfuscatedName("jj.bp")
    public int field3554 = -1;

    @ObfuscatedName("jj.bn")
    public int field3599 = -1;

    @ObfuscatedName("jj.bb")
    public int field3600 = -1;

    @ObfuscatedName("jj.bm")
    public int field3569 = -1;

    @ObfuscatedName("bj.p(IB)Ljj;")
    public static class268 method1489(int arg0) {
        class268 var1 = (class268) field3598.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field335.method4032(10, arg0);
        class268 var3 = new class268();
        var3.field3555 = arg0;
        if (var2 != null) {
            var3.method4490(new class185(var2));
        }
        var3.method4532();
        if (var3.field3571 != -1) {
            var3.method4489(method1489(var3.field3571), method1489(var3.field3595));
        }
        if (var3.field3599 != -1) {
            var3.method4517(method1489(var3.field3599), method1489(var3.field3554));
        }
        if (var3.field3569 != -1) {
            var3.method4526(method1489(var3.field3569), method1489(var3.field3600));
        }
        if (!Statics.field3382 && var3.field3574) {
            var3.field3557 = class237.field3018;
            var3.field3561 = false;
            var3.field3591 = null;
            var3.field3572 = null;
            var3.field3573 = -1;
            var3.field3552 = 0;
            if (var3.field3596 != null) {
                boolean var4 = false;
                for (class204 var5 = var3.field3596.method3475(); var5 != null; var5 = var3.field3596.method3477()) {
                    class263 var6 = class263.method2891((int) var5.field2563);
                    if (var6.field3451) {
                        var5.method3561();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3596 = null;
                }
            }
        }
        field3598.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.i(I)V")
    public void method4532() {
    }

    @ObfuscatedName("jj.w(Lgj;I)V")
    public void method4490(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4479(arg0, var2);
        }
    }

    @ObfuscatedName("jj.s(Lgj;II)V")
    public void method4479(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3556 = arg0.method3124();
        } else if (arg1 == 2) {
            this.field3557 = arg0.method3131();
        } else if (arg1 == 4) {
            this.field3562 = arg0.method3124();
        } else if (arg1 == 5) {
            this.field3563 = arg0.method3124();
        } else if (arg1 == 6) {
            this.field3570 = arg0.method3124();
        } else if (arg1 == 7) {
            this.field3567 = arg0.method3124();
            if (this.field3567 > 32767) {
                this.field3567 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3584 = arg0.method3124();
            if (this.field3584 > 32767) {
                this.field3584 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3568 = 1;
        } else if (arg1 == 12) {
            this.field3589 = arg0.method3127();
        } else if (arg1 == 16) {
            this.field3574 = true;
        } else if (arg1 == 23) {
            this.field3594 = arg0.method3124();
            this.field3576 = arg0.method3197();
        } else if (arg1 == 24) {
            this.field3575 = arg0.method3124();
        } else if (arg1 == 25) {
            this.field3577 = arg0.method3124();
            this.field3579 = arg0.method3197();
        } else if (arg1 == 26) {
            this.field3578 = arg0.method3124();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3591[arg1 - 30] = arg0.method3131();
            if (this.field3591[arg1 - 30].equalsIgnoreCase(class237.field2937)) {
                this.field3591[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3572[arg1 - 35] = arg0.method3131();
        } else if (arg1 == 40) {
            int var3 = arg0.method3197();
            this.field3558 = new short[var3];
            this.field3559 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3558[var4] = (short) arg0.method3124();
                this.field3559[var4] = (short) arg0.method3124();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3197();
            this.field3560 = new short[var5];
            this.field3592 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3560[var6] = (short) arg0.method3124();
                this.field3592[var6] = (short) arg0.method3124();
            }
        } else if (arg1 == 42) {
            this.field3573 = arg0.method3123();
        } else if (arg1 == 65) {
            this.field3561 = true;
        } else if (arg1 == 78) {
            this.field3588 = arg0.method3124();
        } else if (arg1 == 79) {
            this.field3581 = arg0.method3124();
        } else if (arg1 == 90) {
            this.field3582 = arg0.method3124();
        } else if (arg1 == 91) {
            this.field3546 = arg0.method3124();
        } else if (arg1 == 92) {
            this.field3583 = arg0.method3124();
        } else if (arg1 == 93) {
            this.field3585 = arg0.method3124();
        } else if (arg1 == 95) {
            this.field3565 = arg0.method3124();
        } else if (arg1 == 97) {
            this.field3595 = arg0.method3124();
        } else if (arg1 == 98) {
            this.field3571 = arg0.method3124();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3586 == null) {
                this.field3586 = new int[10];
                this.field3587 = new int[10];
            }
            this.field3586[arg1 - 100] = arg0.method3124();
            this.field3587[arg1 - 100] = arg0.method3124();
        } else if (arg1 == 110) {
            this.field3590 = arg0.method3124();
        } else if (arg1 == 111) {
            this.field3601 = arg0.method3124();
        } else if (arg1 == 112) {
            this.field3566 = arg0.method3124();
        } else if (arg1 == 113) {
            this.field3593 = arg0.method3123();
        } else if (arg1 == 114) {
            this.field3580 = arg0.method3123();
        } else if (arg1 == 115) {
            this.field3552 = arg0.method3197();
        } else if (arg1 == 139) {
            this.field3554 = arg0.method3124();
        } else if (arg1 == 140) {
            this.field3599 = arg0.method3124();
        } else if (arg1 == 148) {
            this.field3600 = arg0.method3124();
        } else if (arg1 == 149) {
            this.field3569 = arg0.method3124();
        } else if (arg1 == 249) {
            this.field3596 = class261.method3985(arg0, this.field3596);
        }
    }

    @ObfuscatedName("jj.j(Ljj;Ljj;I)V")
    public void method4489(class268 arg0, class268 arg1) {
        this.field3556 = arg0.field3556;
        this.field3562 = arg0.field3562;
        this.field3563 = arg0.field3563;
        this.field3570 = arg0.field3570;
        this.field3565 = arg0.field3565;
        this.field3567 = arg0.field3567;
        this.field3584 = arg0.field3584;
        this.field3558 = arg0.field3558;
        this.field3559 = arg0.field3559;
        this.field3560 = arg0.field3560;
        this.field3592 = arg0.field3592;
        this.field3557 = arg1.field3557;
        this.field3574 = arg1.field3574;
        this.field3589 = arg1.field3589;
        this.field3568 = 1;
    }

    @ObfuscatedName("jj.a(Ljj;Ljj;B)V")
    public void method4517(class268 arg0, class268 arg1) {
        this.field3556 = arg0.field3556;
        this.field3562 = arg0.field3562;
        this.field3563 = arg0.field3563;
        this.field3570 = arg0.field3570;
        this.field3565 = arg0.field3565;
        this.field3567 = arg0.field3567;
        this.field3584 = arg0.field3584;
        this.field3558 = arg1.field3558;
        this.field3559 = arg1.field3559;
        this.field3560 = arg1.field3560;
        this.field3592 = arg1.field3592;
        this.field3557 = arg1.field3557;
        this.field3574 = arg1.field3574;
        this.field3568 = arg1.field3568;
        this.field3594 = arg1.field3594;
        this.field3575 = arg1.field3575;
        this.field3588 = arg1.field3588;
        this.field3577 = arg1.field3577;
        this.field3578 = arg1.field3578;
        this.field3581 = arg1.field3581;
        this.field3582 = arg1.field3582;
        this.field3583 = arg1.field3583;
        this.field3546 = arg1.field3546;
        this.field3585 = arg1.field3585;
        this.field3552 = arg1.field3552;
        this.field3591 = arg1.field3591;
        this.field3572 = new String[5];
        if (arg1.field3572 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3572[var3] = arg1.field3572[var3];
            }
        }
        this.field3572[4] = class237.field2958;
        this.field3589 = 0;
    }

    @ObfuscatedName("jj.t(Ljj;Ljj;I)V")
    public void method4526(class268 arg0, class268 arg1) {
        this.field3556 = arg0.field3556;
        this.field3562 = arg0.field3562;
        this.field3563 = arg0.field3563;
        this.field3570 = arg0.field3570;
        this.field3565 = arg0.field3565;
        this.field3567 = arg0.field3567;
        this.field3584 = arg0.field3584;
        this.field3558 = arg0.field3558;
        this.field3559 = arg0.field3559;
        this.field3560 = arg0.field3560;
        this.field3592 = arg0.field3592;
        this.field3568 = arg0.field3568;
        this.field3557 = arg1.field3557;
        this.field3589 = 0;
        this.field3574 = false;
        this.field3561 = false;
    }

    @ObfuscatedName("jj.r(IB)Ldy;")
    public final class125 method4482(int arg0) {
        if (this.field3586 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3587[var3] && this.field3587[var3] != 0) {
                    var2 = this.field3586[var3];
                }
            }
            if (var2 != -1) {
                return method1489(var2).method4482(1);
            }
        }
        class125 var4 = class125.method2372(Statics.field3551, this.field3556, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3590 != 128 || this.field3601 != 128 || this.field3566 != 128) {
            var4.method2382(this.field3590, this.field3601, this.field3566);
        }
        if (this.field3558 != null) {
            for (int var5 = 0; var5 < this.field3558.length; var5++) {
                var4.method2383(this.field3558[var5], this.field3559[var5]);
            }
        }
        if (this.field3560 != null) {
            for (int var6 = 0; var6 < this.field3560.length; var6++) {
                var4.method2384(this.field3560[var6], this.field3592[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jj.m(II)Len;")
    public final class131 method4483(int arg0) {
        if (this.field3586 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3587[var3] && this.field3587[var3] != 0) {
                    var2 = this.field3586[var3];
                }
            }
            if (var2 != -1) {
                return method1489(var2).method4483(1);
            }
        }
        class131 var4 = (class131) field3553.method3504((long) this.field3555);
        if (var4 != null) {
            return var4;
        }
        class125 var5 = class125.method2372(Statics.field3551, this.field3556, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3590 != 128 || this.field3601 != 128 || this.field3566 != 128) {
            var5.method2382(this.field3590, this.field3601, this.field3566);
        }
        if (this.field3558 != null) {
            for (int var6 = 0; var6 < this.field3558.length; var6++) {
                var5.method2383(this.field3558[var6], this.field3559[var6]);
            }
        }
        if (this.field3560 != null) {
            for (int var7 = 0; var7 < this.field3560.length; var7++) {
                var5.method2384(this.field3560[var7], this.field3592[var7]);
            }
        }
        class131 var8 = var5.method2391(this.field3593 + 64, this.field3580 * 5 + 768, -50, -10, -50);
        var8.field1826 = true;
        field3553.method3506(var8, (long) this.field3555);
        return var8;
    }

    @ObfuscatedName("jj.h(IB)Ljj;")
    public class268 method4484(int arg0) {
        if (this.field3586 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3587[var3] && this.field3587[var3] != 0) {
                    var2 = this.field3586[var3];
                }
            }
            if (var2 != -1) {
                return method1489(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ap.o(IIIIIZB)Lko;")
    public static final class310 method215(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class310 var8 = (class310) field3564.method3504(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class268 var9 = method1489(arg0);
        if (arg1 > 1 && var9.field3586 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3587[var11] && var9.field3587[var11] != 0) {
                    var10 = var9.field3586[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1489(var10);
            }
        }
        class131 var12 = var9.method4483(1);
        if (var12 == null) {
            return null;
        }
        class310 var13 = null;
        if (var9.field3571 != -1) {
            var13 = method215(var9.field3595, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3599 != -1) {
            var13 = method215(var9.field3554, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3569 != -1) {
            var13 = method215(var9.field3600, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3854;
        int var15 = Statics.field3852;
        int var16 = Statics.field3853;
        int[] var17 = new int[4];
        class306.method5071(var17);
        class310 var18 = new class310(36, 32);
        class306.method4992(var18.field3887, 36, 32);
        class306.method4998();
        class134.method2547();
        class134.method2550(16, 16);
        class134.field1908 = false;
        if (var9.field3569 != -1) {
            var13.method5123(0, 0);
        }
        int var19 = var9.field3562;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class134.field1889[var9.field3563] * var19 >> 16;
        int var21 = class134.field1911[var9.field3563] * var19 >> 16;
        var12.method2484();
        var12.method2477(0, var9.field3570, var9.field3565, var9.field3563, var9.field3567, var9.field3584 + var12.field1998 / 2 + var20, var9.field3584 + var21);
        if (var9.field3599 != -1) {
            var13.method5123(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5169(1);
        }
        if (arg2 >= 2) {
            var18.method5169(16777215);
        }
        if (arg3 != 0) {
            var18.method5120(arg3);
        }
        class306.method4992(var18.field3887, 36, 32);
        if (var9.field3571 != -1) {
            var13.method5123(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3568 == 1) {
            Statics.field3419.method4830(method4018(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3564.method3506(var18, var6);
        }
        class306.method4992(var14, var15, var16);
        class306.method4996(var17);
        class134.method2547();
        class134.field1908 = true;
        return var18;
    }

    @ObfuscatedName("it.x(IB)Ljava/lang/String;")
    public static final String method4018(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class237.field3184 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class237.field3096 + "</col>";
        }
    }

    @ObfuscatedName("jj.q(ZI)Z")
    public final boolean method4523(boolean arg0) {
        int var2 = this.field3594;
        int var3 = this.field3575;
        int var4 = this.field3588;
        if (arg0) {
            var2 = this.field3577;
            var3 = this.field3578;
            var4 = this.field3581;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3551.method4034(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3551.method4034(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3551.method4034(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jj.d(ZI)Ldy;")
    public final class125 method4488(boolean arg0) {
        int var2 = this.field3594;
        int var3 = this.field3575;
        int var4 = this.field3588;
        if (arg0) {
            var2 = this.field3577;
            var3 = this.field3578;
            var4 = this.field3581;
        }
        if (var2 == -1) {
            return null;
        }
        class125 var5 = class125.method2372(Statics.field3551, var2, 0);
        if (var3 != -1) {
            class125 var6 = class125.method2372(Statics.field3551, var3, 0);
            if (var4 == -1) {
                class125[] var9 = new class125[] { var5, var6 };
                var5 = new class125(var9, 2);
            } else {
                class125 var7 = class125.method2372(Statics.field3551, var4, 0);
                class125[] var8 = new class125[] { var5, var6, var7 };
                var5 = new class125(var8, 3);
            }
        }
        if (!arg0 && this.field3576 != 0) {
            var5.method2377(0, this.field3576, 0);
        }
        if (arg0 && this.field3579 != 0) {
            var5.method2377(0, this.field3579, 0);
        }
        if (this.field3558 != null) {
            for (int var10 = 0; var10 < this.field3558.length; var10++) {
                var5.method2383(this.field3558[var10], this.field3559[var10]);
            }
        }
        if (this.field3560 != null) {
            for (int var11 = 0; var11 < this.field3560.length; var11++) {
                var5.method2384(this.field3560[var11], this.field3592[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jj.l(ZB)Z")
    public final boolean method4487(boolean arg0) {
        int var2 = this.field3582;
        int var3 = this.field3583;
        if (arg0) {
            var2 = this.field3546;
            var3 = this.field3585;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3551.method4034(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3551.method4034(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jj.f(ZI)Ldy;")
    public final class125 method4510(boolean arg0) {
        int var2 = this.field3582;
        int var3 = this.field3583;
        if (arg0) {
            var2 = this.field3546;
            var3 = this.field3585;
        }
        if (var2 == -1) {
            return null;
        }
        class125 var4 = class125.method2372(Statics.field3551, var2, 0);
        if (var3 != -1) {
            class125 var5 = class125.method2372(Statics.field3551, var3, 0);
            class125[] var6 = new class125[] { var4, var5 };
            var4 = new class125(var6, 2);
        }
        if (this.field3558 != null) {
            for (int var7 = 0; var7 < this.field3558.length; var7++) {
                var4.method2383(this.field3558[var7], this.field3559[var7]);
            }
        }
        if (this.field3560 != null) {
            for (int var8 = 0; var8 < this.field3560.length; var8++) {
                var4.method2384(this.field3560[var8], this.field3592[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jj.k(III)I")
    public int method4477(int arg0, int arg1) {
        return class261.method3004(this.field3596, arg0, arg1);
    }

    @ObfuscatedName("jj.e(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4525(int arg0, String arg1) {
        return class261.method997(this.field3596, arg0, arg1);
    }

    @ObfuscatedName("jj.u(I)I")
    public int method4491() {
        if (this.field3573 == -1 || this.field3572 == null) {
            return -1;
        } else if (this.field3573 >= 0) {
            return this.field3572[this.field3573] == null ? -1 : this.field3573;
        } else if (class237.field2936.equalsIgnoreCase(this.field3572[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("aj.z(I)V")
    public static void method668() {
        field3598.method3513();
        field3553.method3513();
        field3564.method3513();
    }

    @ObfuscatedName("ax.b(ZI)V")
    public static void method257(boolean arg0) {
        if (Statics.field3382 != arg0) {
            method668();
            Statics.field3382 = arg0;
        }
    }
}
