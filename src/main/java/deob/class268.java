package deob;

@ObfuscatedName("jq")
public class class268 extends class206 {

    @ObfuscatedName("jq.j")
    public static class201 field3564 = new class201(64);

    @ObfuscatedName("jq.x")
    public static class201 field3565 = new class201(50);

    @ObfuscatedName("jq.c")
    public static class201 field3566 = new class201(200);

    @ObfuscatedName("jq.n")
    public int field3567;

    @ObfuscatedName("jq.y")
    public int field3568;

    @ObfuscatedName("jq.o")
    public String field3569 = "null";

    @ObfuscatedName("jq.r")
    public short[] field3570;

    @ObfuscatedName("jq.i")
    public short[] field3571;

    @ObfuscatedName("jq.l")
    public short[] field3572;

    @ObfuscatedName("jq.m")
    public short[] field3599;

    @ObfuscatedName("jq.q")
    public int field3574 = 2000;

    @ObfuscatedName("jq.b")
    public int field3573 = 0;

    @ObfuscatedName("jq.h")
    public int field3593 = 0;

    @ObfuscatedName("jq.d")
    public int field3577 = 0;

    @ObfuscatedName("jq.v")
    public int field3578 = 0;

    @ObfuscatedName("jq.p")
    public int field3612 = 0;

    @ObfuscatedName("jq.ab")
    public int field3591 = 0;

    @ObfuscatedName("jq.ad")
    public int field3581 = 1;

    @ObfuscatedName("jq.ag")
    public boolean field3582 = false;

    @ObfuscatedName("jq.ak")
    public String[] field3583 = new String[] { null, null, class237.field2986, null, null };

    @ObfuscatedName("jq.as")
    public String[] field3604 = new String[] { null, null, null, null, class237.field2961 };

    @ObfuscatedName("jq.ax")
    public int field3585 = -2;

    @ObfuscatedName("jq.at")
    public int field3586 = -1;

    @ObfuscatedName("jq.ap")
    public int field3580 = -1;

    @ObfuscatedName("jq.an")
    public int field3588 = 0;

    @ObfuscatedName("jq.ac")
    public int field3601 = -1;

    @ObfuscatedName("jq.aw")
    public int field3590 = -1;

    @ObfuscatedName("jq.al")
    public int field3587 = 0;

    @ObfuscatedName("jq.ay")
    public int field3594 = -1;

    @ObfuscatedName("jq.ai")
    public int field3589 = -1;

    @ObfuscatedName("jq.af")
    public int field3597 = -1;

    @ObfuscatedName("jq.ah")
    public int field3579 = -1;

    @ObfuscatedName("jq.az")
    public int field3596 = -1;

    @ObfuscatedName("jq.av")
    public int field3611 = -1;

    @ObfuscatedName("jq.ae")
    public int[] field3598;

    @ObfuscatedName("jq.am")
    public int[] field3575;

    @ObfuscatedName("jq.aa")
    public int field3600 = -1;

    @ObfuscatedName("jq.aj")
    public int field3592 = -1;

    @ObfuscatedName("jq.ao")
    public int field3602 = 128;

    @ObfuscatedName("jq.ar")
    public int field3603 = 128;

    @ObfuscatedName("jq.au")
    public int field3560 = 128;

    @ObfuscatedName("jq.bb")
    public int field3605 = 0;

    @ObfuscatedName("jq.bc")
    public int field3606 = 0;

    @ObfuscatedName("jq.bp")
    public int field3607 = 0;

    @ObfuscatedName("jq.bn")
    public class198 field3608;

    @ObfuscatedName("jq.bg")
    public boolean field3609 = false;

    @ObfuscatedName("jq.bq")
    public int field3610 = -1;

    @ObfuscatedName("jq.be")
    public int field3563 = -1;

    @ObfuscatedName("jq.bx")
    public int field3576 = -1;

    @ObfuscatedName("jq.bw")
    public int field3613 = -1;

    @ObfuscatedName("ip.a(II)Ljq;")
    public static class268 method4160(int arg0) {
        class268 var1 = (class268) field3564.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3584.method3897(10, arg0);
        class268 var3 = new class268();
        var3.field3567 = arg0;
        if (var2 != null) {
            var3.method4336(new class185(var2));
        }
        var3.method4361();
        if (var3.field3592 != -1) {
            var3.method4338(method4160(var3.field3592), method4160(var3.field3600));
        }
        if (var3.field3563 != -1) {
            var3.method4339(method4160(var3.field3563), method4160(var3.field3610));
        }
        if (var3.field3613 != -1) {
            var3.method4380(method4160(var3.field3613), method4160(var3.field3576));
        }
        if (!Statics.field719 && var3.field3582) {
            var3.field3569 = class237.field3163;
            var3.field3609 = false;
            var3.field3583 = null;
            var3.field3604 = null;
            var3.field3585 = -1;
            var3.field3607 = 0;
            if (var3.field3608 != null) {
                boolean var4 = false;
                for (class204 var5 = var3.field3608.method3345(); var5 != null; var5 = var3.field3608.method3344()) {
                    class263 var6 = class263.method4053((int) var5.field2589);
                    if (var6.field3466) {
                        var5.method3427();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3608 = null;
                }
            }
        }
        field3564.method3375(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.w(B)V")
    public void method4361() {
    }

    @ObfuscatedName("jq.e(Lgh;I)V")
    public void method4336(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4337(arg0, var2);
        }
    }

    @ObfuscatedName("jq.k(Lgh;II)V")
    public void method4337(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3568 = arg0.method3194();
        } else if (arg1 == 2) {
            this.field3569 = arg0.method3168();
        } else if (arg1 == 4) {
            this.field3574 = arg0.method3194();
        } else if (arg1 == 5) {
            this.field3573 = arg0.method3194();
        } else if (arg1 == 6) {
            this.field3593 = arg0.method3194();
        } else if (arg1 == 7) {
            this.field3578 = arg0.method3194();
            if (this.field3578 > 32767) {
                this.field3578 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3612 = arg0.method3194();
            if (this.field3612 > 32767) {
                this.field3612 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3591 = 1;
        } else if (arg1 == 12) {
            this.field3581 = arg0.method2967();
        } else if (arg1 == 16) {
            this.field3582 = true;
        } else if (arg1 == 23) {
            this.field3586 = arg0.method3194();
            this.field3588 = arg0.method2962();
        } else if (arg1 == 24) {
            this.field3580 = arg0.method3194();
        } else if (arg1 == 25) {
            this.field3601 = arg0.method3194();
            this.field3587 = arg0.method2962();
        } else if (arg1 == 26) {
            this.field3590 = arg0.method3194();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3583[arg1 - 30] = arg0.method3168();
            if (this.field3583[arg1 - 30].equalsIgnoreCase(class237.field2962)) {
                this.field3583[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3604[arg1 - 35] = arg0.method3168();
        } else if (arg1 == 40) {
            int var3 = arg0.method2962();
            this.field3570 = new short[var3];
            this.field3571 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3570[var4] = (short) arg0.method3194();
                this.field3571[var4] = (short) arg0.method3194();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2962();
            this.field3572 = new short[var5];
            this.field3599 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3572[var6] = (short) arg0.method3194();
                this.field3599[var6] = (short) arg0.method3194();
            }
        } else if (arg1 == 42) {
            this.field3585 = arg0.method3015();
        } else if (arg1 == 65) {
            this.field3609 = true;
        } else if (arg1 == 78) {
            this.field3594 = arg0.method3194();
        } else if (arg1 == 79) {
            this.field3589 = arg0.method3194();
        } else if (arg1 == 90) {
            this.field3597 = arg0.method3194();
        } else if (arg1 == 91) {
            this.field3596 = arg0.method3194();
        } else if (arg1 == 92) {
            this.field3579 = arg0.method3194();
        } else if (arg1 == 93) {
            this.field3611 = arg0.method3194();
        } else if (arg1 == 95) {
            this.field3577 = arg0.method3194();
        } else if (arg1 == 97) {
            this.field3600 = arg0.method3194();
        } else if (arg1 == 98) {
            this.field3592 = arg0.method3194();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3598 == null) {
                this.field3598 = new int[10];
                this.field3575 = new int[10];
            }
            this.field3598[arg1 - 100] = arg0.method3194();
            this.field3575[arg1 - 100] = arg0.method3194();
        } else if (arg1 == 110) {
            this.field3602 = arg0.method3194();
        } else if (arg1 == 111) {
            this.field3603 = arg0.method3194();
        } else if (arg1 == 112) {
            this.field3560 = arg0.method3194();
        } else if (arg1 == 113) {
            this.field3605 = arg0.method3015();
        } else if (arg1 == 114) {
            this.field3606 = arg0.method3015() * 5;
        } else if (arg1 == 115) {
            this.field3607 = arg0.method2962();
        } else if (arg1 == 139) {
            this.field3610 = arg0.method3194();
        } else if (arg1 == 140) {
            this.field3563 = arg0.method3194();
        } else if (arg1 == 148) {
            this.field3576 = arg0.method3194();
        } else if (arg1 == 149) {
            this.field3613 = arg0.method3194();
        } else if (arg1 == 249) {
            this.field3608 = class261.method933(arg0, this.field3608);
        }
    }

    @ObfuscatedName("jq.u(Ljq;Ljq;I)V")
    public void method4338(class268 arg0, class268 arg1) {
        this.field3568 = arg0.field3568;
        this.field3574 = arg0.field3574;
        this.field3573 = arg0.field3573;
        this.field3593 = arg0.field3593;
        this.field3577 = arg0.field3577;
        this.field3578 = arg0.field3578;
        this.field3612 = arg0.field3612;
        this.field3570 = arg0.field3570;
        this.field3571 = arg0.field3571;
        this.field3572 = arg0.field3572;
        this.field3599 = arg0.field3599;
        this.field3569 = arg1.field3569;
        this.field3582 = arg1.field3582;
        this.field3581 = arg1.field3581;
        this.field3591 = 1;
    }

    @ObfuscatedName("jq.z(Ljq;Ljq;I)V")
    public void method4339(class268 arg0, class268 arg1) {
        this.field3568 = arg0.field3568;
        this.field3574 = arg0.field3574;
        this.field3573 = arg0.field3573;
        this.field3593 = arg0.field3593;
        this.field3577 = arg0.field3577;
        this.field3578 = arg0.field3578;
        this.field3612 = arg0.field3612;
        this.field3570 = arg1.field3570;
        this.field3571 = arg1.field3571;
        this.field3572 = arg1.field3572;
        this.field3599 = arg1.field3599;
        this.field3569 = arg1.field3569;
        this.field3582 = arg1.field3582;
        this.field3591 = arg1.field3591;
        this.field3586 = arg1.field3586;
        this.field3580 = arg1.field3580;
        this.field3594 = arg1.field3594;
        this.field3601 = arg1.field3601;
        this.field3590 = arg1.field3590;
        this.field3589 = arg1.field3589;
        this.field3597 = arg1.field3597;
        this.field3579 = arg1.field3579;
        this.field3596 = arg1.field3596;
        this.field3611 = arg1.field3611;
        this.field3607 = arg1.field3607;
        this.field3583 = arg1.field3583;
        this.field3604 = new String[5];
        if (arg1.field3604 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3604[var3] = arg1.field3604[var3];
            }
        }
        this.field3604[4] = class237.field2966;
        this.field3581 = 0;
    }

    @ObfuscatedName("jq.t(Ljq;Ljq;I)V")
    public void method4380(class268 arg0, class268 arg1) {
        this.field3568 = arg0.field3568;
        this.field3574 = arg0.field3574;
        this.field3573 = arg0.field3573;
        this.field3593 = arg0.field3593;
        this.field3577 = arg0.field3577;
        this.field3578 = arg0.field3578;
        this.field3612 = arg0.field3612;
        this.field3570 = arg0.field3570;
        this.field3571 = arg0.field3571;
        this.field3572 = arg0.field3572;
        this.field3599 = arg0.field3599;
        this.field3591 = arg0.field3591;
        this.field3569 = arg1.field3569;
        this.field3581 = 0;
        this.field3582 = false;
        this.field3609 = false;
    }

    @ObfuscatedName("jq.f(II)Ldm;")
    public final class127 method4334(int arg0) {
        if (this.field3598 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3575[var3] && this.field3575[var3] != 0) {
                    var2 = this.field3598[var3];
                }
            }
            if (var2 != -1) {
                return method4160(var2).method4334(1);
            }
        }
        class127 var4 = class127.method2217(Statics.field3249, this.field3568, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3602 != 128 || this.field3603 != 128 || this.field3560 != 128) {
            var4.method2276(this.field3602, this.field3603, this.field3560);
        }
        if (this.field3570 != null) {
            for (int var5 = 0; var5 < this.field3570.length; var5++) {
                var4.method2216(this.field3570[var5], this.field3571[var5]);
            }
        }
        if (this.field3572 != null) {
            for (int var6 = 0; var6 < this.field3572.length; var6++) {
                var4.method2226(this.field3572[var6], this.field3599[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jq.g(IB)Lef;")
    public final class133 method4342(int arg0) {
        if (this.field3598 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3575[var3] && this.field3575[var3] != 0) {
                    var2 = this.field3598[var3];
                }
            }
            if (var2 != -1) {
                return method4160(var2).method4342(1);
            }
        }
        class133 var4 = (class133) field3565.method3373((long) this.field3567);
        if (var4 != null) {
            return var4;
        }
        class127 var5 = class127.method2217(Statics.field3249, this.field3568, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3602 != 128 || this.field3603 != 128 || this.field3560 != 128) {
            var5.method2276(this.field3602, this.field3603, this.field3560);
        }
        if (this.field3570 != null) {
            for (int var6 = 0; var6 < this.field3570.length; var6++) {
                var5.method2216(this.field3570[var6], this.field3571[var6]);
            }
        }
        if (this.field3572 != null) {
            for (int var7 = 0; var7 < this.field3572.length; var7++) {
                var5.method2226(this.field3572[var7], this.field3599[var7]);
            }
        }
        class133 var8 = var5.method2224(this.field3605 + 64, this.field3606 + 768, -50, -10, -50);
        var8.field1852 = true;
        field3565.method3375(var8, (long) this.field3567);
        return var8;
    }

    @ObfuscatedName("jq.x(II)Ljq;")
    public class268 method4343(int arg0) {
        if (this.field3598 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3575[var3] && this.field3575[var3] != 0) {
                    var2 = this.field3598[var3];
                }
            }
            if (var2 != -1) {
                return method4160(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("w.c(IIIIIZI)Lks;")
    public static final class299 method1(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class299 var8 = (class299) field3566.method3373(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class268 var9 = method4160(arg0);
        if (arg1 > 1 && var9.field3598 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3575[var11] && var9.field3575[var11] != 0) {
                    var10 = var9.field3598[var11];
                }
            }
            if (var10 != -1) {
                var9 = method4160(var10);
            }
        }
        class133 var12 = var9.method4342(1);
        if (var12 == null) {
            return null;
        }
        class299 var13 = null;
        if (var9.field3592 != -1) {
            var13 = method1(var9.field3600, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3563 != -1) {
            var13 = method1(var9.field3610, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3613 != -1) {
            var13 = method1(var9.field3576, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3833;
        int var15 = Statics.field3828;
        int var16 = Statics.field3829;
        int[] var17 = new int[4];
        class295.method4701(var17);
        class299 var18 = new class299(36, 32);
        class295.method4697(var18.field3863, 36, 32);
        class295.method4703();
        class136.method2397();
        class136.method2396(16, 16);
        class136.field1905 = false;
        if (var9.field3613 != -1) {
            var13.method4812(0, 0);
        }
        int var19 = var9.field3574;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class136.field1927[var9.field3573] * var19 >> 16;
        int var21 = class136.field1926[var9.field3573] * var19 >> 16;
        var12.method2302();
        var12.method2315(0, var9.field3593, var9.field3577, var9.field3573, var9.field3578, var9.field3612 + var12.field2010 / 2 + var20, var9.field3612 + var21);
        if (var9.field3563 != -1) {
            var13.method4812(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4808(1);
        }
        if (arg2 >= 2) {
            var18.method4808(16777215);
        }
        if (arg3 != 0) {
            var18.method4857(arg3);
        }
        class295.method4697(var18.field3863, 36, 32);
        if (var9.field3592 != -1) {
            var13.method4812(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3591 == 1) {
            Statics.field2749.method4514(method2672(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3566.method3375(var18, var6);
        }
        class295.method4697(var14, var15, var16);
        class295.method4702(var17);
        class136.method2397();
        class136.field1905 = true;
        return var18;
    }

    @ObfuscatedName("eq.n(II)Ljava/lang/String;")
    public static final String method2672(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class237.field3123 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class237.field3121 + "</col>";
        }
    }

    @ObfuscatedName("jq.y(ZI)Z")
    public final boolean method4344(boolean arg0) {
        int var2 = this.field3586;
        int var3 = this.field3580;
        int var4 = this.field3594;
        if (arg0) {
            var2 = this.field3601;
            var3 = this.field3590;
            var4 = this.field3589;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3249.method3901(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3249.method3901(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3249.method3901(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jq.o(ZI)Ldm;")
    public final class127 method4375(boolean arg0) {
        int var2 = this.field3586;
        int var3 = this.field3580;
        int var4 = this.field3594;
        if (arg0) {
            var2 = this.field3601;
            var3 = this.field3590;
            var4 = this.field3589;
        }
        if (var2 == -1) {
            return null;
        }
        class127 var5 = class127.method2217(Statics.field3249, var2, 0);
        if (var3 != -1) {
            class127 var6 = class127.method2217(Statics.field3249, var3, 0);
            if (var4 == -1) {
                class127[] var9 = new class127[] { var5, var6 };
                var5 = new class127(var9, 2);
            } else {
                class127 var7 = class127.method2217(Statics.field3249, var4, 0);
                class127[] var8 = new class127[] { var5, var6, var7 };
                var5 = new class127(var8, 3);
            }
        }
        if (!arg0 && this.field3588 != 0) {
            var5.method2215(0, this.field3588, 0);
        }
        if (arg0 && this.field3587 != 0) {
            var5.method2215(0, this.field3587, 0);
        }
        if (this.field3570 != null) {
            for (int var10 = 0; var10 < this.field3570.length; var10++) {
                var5.method2216(this.field3570[var10], this.field3571[var10]);
            }
        }
        if (this.field3572 != null) {
            for (int var11 = 0; var11 < this.field3572.length; var11++) {
                var5.method2226(this.field3572[var11], this.field3599[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jq.r(ZB)Z")
    public final boolean method4350(boolean arg0) {
        int var2 = this.field3597;
        int var3 = this.field3579;
        if (arg0) {
            var2 = this.field3596;
            var3 = this.field3611;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3249.method3901(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3249.method3901(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jq.i(ZI)Ldm;")
    public final class127 method4347(boolean arg0) {
        int var2 = this.field3597;
        int var3 = this.field3579;
        if (arg0) {
            var2 = this.field3596;
            var3 = this.field3611;
        }
        if (var2 == -1) {
            return null;
        }
        class127 var4 = class127.method2217(Statics.field3249, var2, 0);
        if (var3 != -1) {
            class127 var5 = class127.method2217(Statics.field3249, var3, 0);
            class127[] var6 = new class127[] { var4, var5 };
            var4 = new class127(var6, 2);
        }
        if (this.field3570 != null) {
            for (int var7 = 0; var7 < this.field3570.length; var7++) {
                var4.method2216(this.field3570[var7], this.field3571[var7]);
            }
        }
        if (this.field3572 != null) {
            for (int var8 = 0; var8 < this.field3572.length; var8++) {
                var4.method2226(this.field3572[var8], this.field3599[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jq.q(IIB)I")
    public int method4348(int arg0, int arg1) {
        return class261.method1485(this.field3608, arg0, arg1);
    }

    @ObfuscatedName("jq.b(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4349(int arg0, String arg1) {
        return class261.method3290(this.field3608, arg0, arg1);
    }

    @ObfuscatedName("jq.h(B)I")
    public int method4346() {
        if (this.field3585 == -1 || this.field3604 == null) {
            return -1;
        } else if (this.field3585 >= 0) {
            return this.field3604[this.field3585] == null ? -1 : this.field3585;
        } else if (class237.field2961.equalsIgnoreCase(this.field3604[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cy.d(ZB)V")
    public static void method1608(boolean arg0) {
        if (Statics.field719 != arg0) {
            field3564.method3370();
            field3565.method3370();
            field3566.method3370();
            Statics.field719 = arg0;
        }
    }
}
