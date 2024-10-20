package deob;

@ObfuscatedName("jq")
public class class266 extends class185 {

    @ObfuscatedName("jq.z")
    public static class155 field3438 = new class155(64);

    @ObfuscatedName("jq.u")
    public static class155 field3451 = new class155(50);

    @ObfuscatedName("jq.e")
    public static class155 field3441 = new class155(200);

    @ObfuscatedName("jq.c")
    public int field3481;

    @ObfuscatedName("jq.i")
    public int field3444;

    @ObfuscatedName("jq.f")
    public String field3445 = class234.field2792;

    @ObfuscatedName("jq.a")
    public short[] field3461;

    @ObfuscatedName("jq.b")
    public short[] field3474;

    @ObfuscatedName("jq.y")
    public short[] field3440;

    @ObfuscatedName("jq.r")
    public short[] field3449;

    @ObfuscatedName("jq.q")
    public int field3450 = 2000;

    @ObfuscatedName("jq.g")
    public int field3458 = 0;

    @ObfuscatedName("jq.s")
    public int field3452 = 0;

    @ObfuscatedName("jq.o")
    public int field3453 = 0;

    @ObfuscatedName("jq.k")
    public int field3454 = 0;

    @ObfuscatedName("jq.d")
    public int field3473 = 0;

    @ObfuscatedName("jq.an")
    public int field3456 = 0;

    @ObfuscatedName("jq.aj")
    public int field3478 = 1;

    @ObfuscatedName("jq.ax")
    public boolean field3442 = false;

    @ObfuscatedName("jq.ag")
    public String[] field3459 = new String[] { null, null, class234.field2785, null, null };

    @ObfuscatedName("jq.au")
    public String[] field3460 = new String[] { null, null, null, null, class234.field2865 };

    @ObfuscatedName("jq.ae")
    public int field3448 = -2;

    @ObfuscatedName("jq.ac")
    public int field3439 = -1;

    @ObfuscatedName("jq.ak")
    public int field3463 = -1;

    @ObfuscatedName("jq.av")
    public int field3464 = 0;

    @ObfuscatedName("jq.aq")
    public int field3465 = -1;

    @ObfuscatedName("jq.ah")
    public int field3466 = -1;

    @ObfuscatedName("jq.am")
    public int field3455 = 0;

    @ObfuscatedName("jq.aa")
    public int field3468 = -1;

    @ObfuscatedName("jq.ao")
    public int field3469 = -1;

    @ObfuscatedName("jq.ab")
    public int field3470 = -1;

    @ObfuscatedName("jq.aw")
    public int field3471 = -1;

    @ObfuscatedName("jq.ap")
    public int field3472 = -1;

    @ObfuscatedName("jq.ad")
    public int field3477 = -1;

    @ObfuscatedName("jq.ai")
    public int[] field3443;

    @ObfuscatedName("jq.al")
    public int[] field3446;

    @ObfuscatedName("jq.ay")
    public int field3476 = -1;

    @ObfuscatedName("jq.af")
    public int field3433 = -1;

    @ObfuscatedName("jq.ar")
    public int field3479 = 128;

    @ObfuscatedName("jq.az")
    public int field3462 = 128;

    @ObfuscatedName("jq.at")
    public int field3480 = 128;

    @ObfuscatedName("jq.bh")
    public int field3482 = 0;

    @ObfuscatedName("jq.by")
    public int field3475 = 0;

    @ObfuscatedName("jq.bs")
    public int field3483 = 0;

    @ObfuscatedName("jq.br")
    public class327 field3484;

    @ObfuscatedName("jq.bl")
    public boolean field3485 = false;

    @ObfuscatedName("jq.bx")
    public int field3486 = -1;

    @ObfuscatedName("jq.bf")
    public int field3487 = -1;

    @ObfuscatedName("jq.bz")
    public int field3488 = -1;

    @ObfuscatedName("jq.bm")
    public int field3489 = -1;

    @ObfuscatedName("cx.h(Lib;Lib;ZLku;I)V")
    public static void method1673(class245 arg0, class245 arg1, boolean arg2, class306 arg3) {
        Statics.field1137 = arg0;
        Statics.field1779 = arg1;
        Statics.field3467 = arg2;
        Statics.field1279 = Statics.field1137.method3846(10);
        Statics.field3447 = arg3;
    }

    @ObfuscatedName("bw.v(II)Ljq;")
    public static class266 method1102(int arg0) {
        class266 var1 = (class266) field3438.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1137.method3834(10, arg0);
        class266 var3 = new class266();
        var3.field3481 = arg0;
        if (var2 != null) {
            var3.method4338(new class311(var2));
        }
        var3.method4290();
        if (var3.field3433 != -1) {
            var3.method4293(method1102(var3.field3433), method1102(var3.field3476));
        }
        if (var3.field3487 != -1) {
            var3.method4294(method1102(var3.field3487), method1102(var3.field3486));
        }
        if (var3.field3489 != -1) {
            var3.method4295(method1102(var3.field3489), method1102(var3.field3488));
        }
        if (!Statics.field3467 && var3.field3442) {
            var3.field3445 = class234.field2935;
            var3.field3485 = false;
            var3.field3459 = null;
            var3.field3460 = null;
            var3.field3448 = -1;
            var3.field3483 = 0;
            if (var3.field3484 != null) {
                boolean var4 = false;
                for (class190 var5 = var3.field3484.method5508(); var5 != null; var5 = var3.field3484.method5497()) {
                    class261 var6 = class261.method2148((int) var5.field2138);
                    if (var6.field3334) {
                        var5.method3359();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3484 = null;
                }
            }
        }
        field3438.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.x(I)V")
    public void method4290() {
    }

    @ObfuscatedName("jq.w(Lkj;I)V")
    public void method4338(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4292(arg0, var2);
        }
    }

    @ObfuscatedName("jq.t(Lkj;II)V")
    public void method4292(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3444 = arg0.method5342();
        } else if (arg1 == 2) {
            this.field3445 = arg0.method5202();
        } else if (arg1 == 4) {
            this.field3450 = arg0.method5342();
        } else if (arg1 == 5) {
            this.field3458 = arg0.method5342();
        } else if (arg1 == 6) {
            this.field3452 = arg0.method5342();
        } else if (arg1 == 7) {
            this.field3454 = arg0.method5342();
            if (this.field3454 > 32767) {
                this.field3454 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3473 = arg0.method5342();
            if (this.field3473 > 32767) {
                this.field3473 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3456 = 1;
        } else if (arg1 == 12) {
            this.field3478 = arg0.method5120();
        } else if (arg1 == 16) {
            this.field3442 = true;
        } else if (arg1 == 23) {
            this.field3439 = arg0.method5342();
            this.field3464 = arg0.method5274();
        } else if (arg1 == 24) {
            this.field3463 = arg0.method5342();
        } else if (arg1 == 25) {
            this.field3465 = arg0.method5342();
            this.field3455 = arg0.method5274();
        } else if (arg1 == 26) {
            this.field3466 = arg0.method5342();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3459[arg1 - 30] = arg0.method5202();
            if (this.field3459[arg1 - 30].equalsIgnoreCase(class234.field2787)) {
                this.field3459[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3460[arg1 - 35] = arg0.method5202();
        } else if (arg1 == 40) {
            int var3 = arg0.method5274();
            this.field3461 = new short[var3];
            this.field3474 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3461[var4] = (short) arg0.method5342();
                this.field3474[var4] = (short) arg0.method5342();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5274();
            this.field3440 = new short[var5];
            this.field3449 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3440[var6] = (short) arg0.method5342();
                this.field3449[var6] = (short) arg0.method5342();
            }
        } else if (arg1 == 42) {
            this.field3448 = arg0.method5148();
        } else if (arg1 == 65) {
            this.field3485 = true;
        } else if (arg1 == 78) {
            this.field3468 = arg0.method5342();
        } else if (arg1 == 79) {
            this.field3469 = arg0.method5342();
        } else if (arg1 == 90) {
            this.field3470 = arg0.method5342();
        } else if (arg1 == 91) {
            this.field3472 = arg0.method5342();
        } else if (arg1 == 92) {
            this.field3471 = arg0.method5342();
        } else if (arg1 == 93) {
            this.field3477 = arg0.method5342();
        } else if (arg1 == 95) {
            this.field3453 = arg0.method5342();
        } else if (arg1 == 97) {
            this.field3476 = arg0.method5342();
        } else if (arg1 == 98) {
            this.field3433 = arg0.method5342();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3443 == null) {
                this.field3443 = new int[10];
                this.field3446 = new int[10];
            }
            this.field3443[arg1 - 100] = arg0.method5342();
            this.field3446[arg1 - 100] = arg0.method5342();
        } else if (arg1 == 110) {
            this.field3479 = arg0.method5342();
        } else if (arg1 == 111) {
            this.field3462 = arg0.method5342();
        } else if (arg1 == 112) {
            this.field3480 = arg0.method5342();
        } else if (arg1 == 113) {
            this.field3482 = arg0.method5148();
        } else if (arg1 == 114) {
            this.field3475 = arg0.method5148() * 5;
        } else if (arg1 == 115) {
            this.field3483 = arg0.method5274();
        } else if (arg1 == 139) {
            this.field3486 = arg0.method5342();
        } else if (arg1 == 140) {
            this.field3487 = arg0.method5342();
        } else if (arg1 == 148) {
            this.field3488 = arg0.method5342();
        } else if (arg1 == 149) {
            this.field3489 = arg0.method5342();
        } else if (arg1 == 249) {
            this.field3484 = class259.method3311(arg0, this.field3484);
        }
    }

    @ObfuscatedName("jq.j(Ljq;Ljq;I)V")
    public void method4293(class266 arg0, class266 arg1) {
        this.field3444 = arg0.field3444;
        this.field3450 = arg0.field3450;
        this.field3458 = arg0.field3458;
        this.field3452 = arg0.field3452;
        this.field3453 = arg0.field3453;
        this.field3454 = arg0.field3454;
        this.field3473 = arg0.field3473;
        this.field3461 = arg0.field3461;
        this.field3474 = arg0.field3474;
        this.field3440 = arg0.field3440;
        this.field3449 = arg0.field3449;
        this.field3445 = arg1.field3445;
        this.field3442 = arg1.field3442;
        this.field3478 = arg1.field3478;
        this.field3456 = 1;
    }

    @ObfuscatedName("jq.n(Ljq;Ljq;I)V")
    public void method4294(class266 arg0, class266 arg1) {
        this.field3444 = arg0.field3444;
        this.field3450 = arg0.field3450;
        this.field3458 = arg0.field3458;
        this.field3452 = arg0.field3452;
        this.field3453 = arg0.field3453;
        this.field3454 = arg0.field3454;
        this.field3473 = arg0.field3473;
        this.field3461 = arg1.field3461;
        this.field3474 = arg1.field3474;
        this.field3440 = arg1.field3440;
        this.field3449 = arg1.field3449;
        this.field3445 = arg1.field3445;
        this.field3442 = arg1.field3442;
        this.field3456 = arg1.field3456;
        this.field3439 = arg1.field3439;
        this.field3463 = arg1.field3463;
        this.field3468 = arg1.field3468;
        this.field3465 = arg1.field3465;
        this.field3466 = arg1.field3466;
        this.field3469 = arg1.field3469;
        this.field3470 = arg1.field3470;
        this.field3471 = arg1.field3471;
        this.field3472 = arg1.field3472;
        this.field3477 = arg1.field3477;
        this.field3483 = arg1.field3483;
        this.field3459 = arg1.field3459;
        this.field3460 = new String[5];
        if (arg1.field3460 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3460[var3] = arg1.field3460[var3];
            }
        }
        this.field3460[4] = class234.field2791;
        this.field3478 = 0;
    }

    @ObfuscatedName("jq.p(Ljq;Ljq;I)V")
    public void method4295(class266 arg0, class266 arg1) {
        this.field3444 = arg0.field3444;
        this.field3450 = arg0.field3450;
        this.field3458 = arg0.field3458;
        this.field3452 = arg0.field3452;
        this.field3453 = arg0.field3453;
        this.field3454 = arg0.field3454;
        this.field3473 = arg0.field3473;
        this.field3461 = arg0.field3461;
        this.field3474 = arg0.field3474;
        this.field3440 = arg0.field3440;
        this.field3449 = arg0.field3449;
        this.field3456 = arg0.field3456;
        this.field3445 = arg1.field3445;
        this.field3478 = 0;
        this.field3442 = false;
        this.field3485 = false;
    }

    @ObfuscatedName("jq.l(II)Les;")
    public final class131 method4342(int arg0) {
        if (this.field3443 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3446[var3] && this.field3446[var3] != 0) {
                    var2 = this.field3443[var3];
                }
            }
            if (var2 != -1) {
                return method1102(var2).method4342(1);
            }
        }
        class131 var4 = class131.method2622(Statics.field1779, this.field3444, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3479 != 128 || this.field3462 != 128 || this.field3480 != 128) {
            var4.method2638(this.field3479, this.field3462, this.field3480);
        }
        if (this.field3461 != null) {
            for (int var5 = 0; var5 < this.field3461.length; var5++) {
                var4.method2635(this.field3461[var5], this.field3474[var5]);
            }
        }
        if (this.field3440 != null) {
            for (int var6 = 0; var6 < this.field3440.length; var6++) {
                var4.method2631(this.field3440[var6], this.field3449[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jq.z(II)Leh;")
    public final class137 method4297(int arg0) {
        if (this.field3443 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3446[var3] && this.field3446[var3] != 0) {
                    var2 = this.field3443[var3];
                }
            }
            if (var2 != -1) {
                return method1102(var2).method4297(1);
            }
        }
        class137 var4 = (class137) field3451.method3147((long) this.field3481);
        if (var4 != null) {
            return var4;
        }
        class131 var5 = class131.method2622(Statics.field1779, this.field3444, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3479 != 128 || this.field3462 != 128 || this.field3480 != 128) {
            var5.method2638(this.field3479, this.field3462, this.field3480);
        }
        if (this.field3461 != null) {
            for (int var6 = 0; var6 < this.field3461.length; var6++) {
                var5.method2635(this.field3461[var6], this.field3474[var6]);
            }
        }
        if (this.field3440 != null) {
            for (int var7 = 0; var7 < this.field3440.length; var7++) {
                var5.method2631(this.field3440[var7], this.field3449[var7]);
            }
        }
        class137 var8 = var5.method2674(this.field3482 + 64, this.field3475 + 768, -50, -10, -50);
        var8.field1711 = true;
        field3451.method3145(var8, (long) this.field3481);
        return var8;
    }

    @ObfuscatedName("jq.u(II)Ljq;")
    public class266 method4298(int arg0) {
        if (this.field3443 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3446[var3] && this.field3446[var3] != 0) {
                    var2 = this.field3443[var3];
                }
            }
            if (var2 != -1) {
                return method1102(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ai.e(IIIIIZI)Llm;")
    public static final class336 method622(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class336 var8 = (class336) field3441.method3147(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class266 var9 = method1102(arg0);
        if (arg1 > 1 && var9.field3443 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3446[var11] && var9.field3446[var11] != 0) {
                    var10 = var9.field3443[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1102(var10);
            }
        }
        class137 var12 = var9.method4297(1);
        if (var12 == null) {
            return null;
        }
        class336 var13 = null;
        if (var9.field3433 != -1) {
            var13 = method622(var9.field3476, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3487 != -1) {
            var13 = method622(var9.field3486, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3489 != -1) {
            var13 = method622(var9.field3488, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3887;
        int var15 = Statics.field3890;
        int var16 = Statics.field3886;
        int[] var17 = new int[4];
        class332.method5575(var17);
        class336 var18 = new class336(36, 32);
        class332.method5576(var18.field3918, 36, 32);
        class332.method5577();
        class140.method2907();
        class140.method2908(16, 16);
        class140.field1783 = false;
        if (var9.field3489 != -1) {
            var13.method5688(0, 0);
        }
        int var19 = var9.field3450;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class140.field1798[var9.field3458] * var19 >> 16;
        int var21 = class140.field1781[var9.field3458] * var19 >> 16;
        var12.method2744();
        var12.method2736(0, var9.field3452, var9.field3453, var9.field3458, var9.field3454, var9.field3473 + var12.field1895 / 2 + var20, var9.field3473 + var21);
        if (var9.field3487 != -1) {
            var13.method5688(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5689(1);
        }
        if (arg2 >= 2) {
            var18.method5689(16777215);
        }
        if (arg3 != 0) {
            var18.method5690(arg3);
        }
        class332.method5576(var18.field3918, 36, 32);
        if (var9.field3433 != -1) {
            var13.method5688(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3456 == 1) {
            Statics.field3447.method4956(method3380(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3441.method3145(var18, var6);
        }
        class332.method5576(var14, var15, var16);
        class332.method5589(var17);
        class140.method2907();
        class140.field1783 = true;
        return var18;
    }

    @ObfuscatedName("gk.m(IB)Ljava/lang/String;")
    public static final String method3380(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class234.field3045 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class234.field2812 + "</col>";
        }
    }

    @ObfuscatedName("jq.c(ZS)Z")
    public final boolean method4299(boolean arg0) {
        int var2 = this.field3439;
        int var3 = this.field3463;
        int var4 = this.field3468;
        if (arg0) {
            var2 = this.field3465;
            var3 = this.field3466;
            var4 = this.field3469;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1779.method3836(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1779.method3836(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1779.method3836(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jq.i(ZI)Les;")
    public final class131 method4300(boolean arg0) {
        int var2 = this.field3439;
        int var3 = this.field3463;
        int var4 = this.field3468;
        if (arg0) {
            var2 = this.field3465;
            var3 = this.field3466;
            var4 = this.field3469;
        }
        if (var2 == -1) {
            return null;
        }
        class131 var5 = class131.method2622(Statics.field1779, var2, 0);
        if (var3 != -1) {
            class131 var6 = class131.method2622(Statics.field1779, var3, 0);
            if (var4 == -1) {
                class131[] var9 = new class131[] { var5, var6 };
                var5 = new class131(var9, 2);
            } else {
                class131 var7 = class131.method2622(Statics.field1779, var4, 0);
                class131[] var8 = new class131[] { var5, var6, var7 };
                var5 = new class131(var8, 3);
            }
        }
        if (!arg0 && this.field3464 != 0) {
            var5.method2634(0, this.field3464, 0);
        }
        if (arg0 && this.field3455 != 0) {
            var5.method2634(0, this.field3455, 0);
        }
        if (this.field3461 != null) {
            for (int var10 = 0; var10 < this.field3461.length; var10++) {
                var5.method2635(this.field3461[var10], this.field3474[var10]);
            }
        }
        if (this.field3440 != null) {
            for (int var11 = 0; var11 < this.field3440.length; var11++) {
                var5.method2631(this.field3440[var11], this.field3449[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jq.f(ZB)Z")
    public final boolean method4291(boolean arg0) {
        int var2 = this.field3470;
        int var3 = this.field3471;
        if (arg0) {
            var2 = this.field3472;
            var3 = this.field3477;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1779.method3836(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1779.method3836(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jq.y(ZI)Les;")
    public final class131 method4302(boolean arg0) {
        int var2 = this.field3470;
        int var3 = this.field3471;
        if (arg0) {
            var2 = this.field3472;
            var3 = this.field3477;
        }
        if (var2 == -1) {
            return null;
        }
        class131 var4 = class131.method2622(Statics.field1779, var2, 0);
        if (var3 != -1) {
            class131 var5 = class131.method2622(Statics.field1779, var3, 0);
            class131[] var6 = new class131[] { var4, var5 };
            var4 = new class131(var6, 2);
        }
        if (this.field3461 != null) {
            for (int var7 = 0; var7 < this.field3461.length; var7++) {
                var4.method2635(this.field3461[var7], this.field3474[var7]);
            }
        }
        if (this.field3440 != null) {
            for (int var8 = 0; var8 < this.field3440.length; var8++) {
                var4.method2631(this.field3440[var8], this.field3449[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jq.r(IIB)I")
    public int method4303(int arg0, int arg1) {
        class327 var3 = this.field3484;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5494((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2136;
            }
        }
        return var4;
    }

    @ObfuscatedName("jq.q(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4328(int arg0, String arg1) {
        class327 var3 = this.field3484;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class186 var5 = (class186) var3.method5494((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2132;
            }
        }
        return var4;
    }

    @ObfuscatedName("jq.g(S)I")
    public int method4354() {
        if (this.field3448 == -1 || this.field3460 == null) {
            return -1;
        } else if (this.field3448 >= 0) {
            return this.field3460[this.field3448] == null ? -1 : this.field3448;
        } else if (class234.field2865.equalsIgnoreCase(this.field3460[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ct.o(I)V")
    public static void method2024() {
        field3438.method3146();
        field3451.method3146();
        field3441.method3146();
    }
}
