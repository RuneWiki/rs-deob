package deob;

@ObfuscatedName("jq")
public class class265 extends class185 {

    @ObfuscatedName("jq.m")
    public static class155 field3465 = new class155(64);

    @ObfuscatedName("jq.n")
    public static class155 field3430 = new class155(50);

    @ObfuscatedName("jq.d")
    public static class155 field3425 = new class155(200);

    @ObfuscatedName("jq.a")
    public int field3432;

    @ObfuscatedName("jq.q")
    public int field3433;

    @ObfuscatedName("jq.c")
    public String field3434 = class234.field2806;

    @ObfuscatedName("jq.f")
    public short[] field3435;

    @ObfuscatedName("jq.y")
    public short[] field3436;

    @ObfuscatedName("jq.v")
    public short[] field3437;

    @ObfuscatedName("jq.j")
    public short[] field3438;

    @ObfuscatedName("jq.r")
    public int field3439 = 2000;

    @ObfuscatedName("jq.u")
    public int field3431 = 0;

    @ObfuscatedName("jq.p")
    public int field3441 = 0;

    @ObfuscatedName("jq.b")
    public int field3442 = 0;

    @ObfuscatedName("jq.l")
    public int field3443 = 0;

    @ObfuscatedName("jq.e")
    public int field3444 = 0;

    @ObfuscatedName("jq.ab")
    public int field3445 = 0;

    @ObfuscatedName("jq.ag")
    public int field3479 = 1;

    @ObfuscatedName("jq.ao")
    public boolean field3447 = false;

    @ObfuscatedName("jq.ae")
    public String[] field3454 = new String[] { null, null, class234.field2927, null, null };

    @ObfuscatedName("jq.an")
    public String[] field3449 = new String[] { null, null, null, null, class234.field2800 };

    @ObfuscatedName("jq.ap")
    public int field3463 = -2;

    @ObfuscatedName("jq.au")
    public int field3451 = -1;

    @ObfuscatedName("jq.aa")
    public int field3452 = -1;

    @ObfuscatedName("jq.ar")
    public int field3453 = 0;

    @ObfuscatedName("jq.at")
    public int field3472 = -1;

    @ObfuscatedName("jq.aq")
    public int field3429 = -1;

    @ObfuscatedName("jq.al")
    public int field3456 = 0;

    @ObfuscatedName("jq.ah")
    public int field3457 = -1;

    @ObfuscatedName("jq.av")
    public int field3458 = -1;

    @ObfuscatedName("jq.ax")
    public int field3459 = -1;

    @ObfuscatedName("jq.as")
    public int field3460 = -1;

    @ObfuscatedName("jq.az")
    public int field3461 = -1;

    @ObfuscatedName("jq.ad")
    public int field3475 = -1;

    @ObfuscatedName("jq.ai")
    public int[] field3423;

    @ObfuscatedName("jq.ay")
    public int[] field3464;

    @ObfuscatedName("jq.aj")
    public int field3446 = -1;

    @ObfuscatedName("jq.aw")
    public int field3466 = -1;

    @ObfuscatedName("jq.af")
    public int field3467 = 128;

    @ObfuscatedName("jq.ak")
    public int field3462 = 128;

    @ObfuscatedName("jq.ac")
    public int field3469 = 128;

    @ObfuscatedName("jq.bl")
    public int field3470 = 0;

    @ObfuscatedName("jq.bc")
    public int field3471 = 0;

    @ObfuscatedName("jq.bz")
    public int field3477 = 0;

    @ObfuscatedName("jq.bj")
    public class326 field3448;

    @ObfuscatedName("jq.bh")
    public boolean field3473 = false;

    @ObfuscatedName("jq.bi")
    public int field3474 = -1;

    @ObfuscatedName("jq.bg")
    public int field3440 = -1;

    @ObfuscatedName("jq.br")
    public int field3468 = -1;

    @ObfuscatedName("jq.bp")
    public int field3478 = -1;

    @ObfuscatedName("fv.z(Lic;Lic;ZLkr;I)V")
    public static void method3216(class244 arg0, class244 arg1, boolean arg2, class305 arg3) {
        Statics.field2792 = arg0;
        Statics.field3427 = arg1;
        Statics.field3428 = arg2;
        Statics.field2750 = Statics.field2792.method3884(10);
        Statics.field588 = arg3;
    }

    @ObfuscatedName("y.k(IB)Ljq;")
    public static class265 method136(int arg0) {
        class265 var1 = (class265) field3465.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2792.method3873(10, arg0);
        class265 var3 = new class265();
        var3.field3432 = arg0;
        if (var2 != null) {
            var3.method4367(new class310(var2));
        }
        var3.method4366();
        if (var3.field3466 != -1) {
            var3.method4383(method136(var3.field3466), method136(var3.field3446));
        }
        if (var3.field3440 != -1) {
            var3.method4377(method136(var3.field3440), method136(var3.field3474));
        }
        if (var3.field3478 != -1) {
            var3.method4371(method136(var3.field3478), method136(var3.field3468));
        }
        if (!Statics.field3428 && var3.field3447) {
            var3.field3434 = class234.field2819;
            var3.field3473 = false;
            var3.field3454 = null;
            var3.field3449 = null;
            var3.field3463 = -1;
            var3.field3477 = 0;
            if (var3.field3448 != null) {
                boolean var4 = false;
                for (class190 var5 = var3.field3448.method5591(); var5 != null; var5 = var3.field3448.method5586()) {
                    class260 var6 = class260.method3743((int) var5.field2157);
                    if (var6.field3329) {
                        var5.method3401();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3448 = null;
                }
            }
        }
        field3465.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.s(I)V")
    public void method4366() {
    }

    @ObfuscatedName("jq.t(Lkf;I)V")
    public void method4367(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4374(arg0, var2);
        }
    }

    @ObfuscatedName("jq.i(Lkf;II)V")
    public void method4374(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3433 = arg0.method5195();
        } else if (arg1 == 2) {
            this.field3434 = arg0.method5202();
        } else if (arg1 == 4) {
            this.field3439 = arg0.method5195();
        } else if (arg1 == 5) {
            this.field3431 = arg0.method5195();
        } else if (arg1 == 6) {
            this.field3441 = arg0.method5195();
        } else if (arg1 == 7) {
            this.field3443 = arg0.method5195();
            if (this.field3443 > 32767) {
                this.field3443 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3444 = arg0.method5195();
            if (this.field3444 > 32767) {
                this.field3444 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3445 = 1;
        } else if (arg1 == 12) {
            this.field3479 = arg0.method5270();
        } else if (arg1 == 16) {
            this.field3447 = true;
        } else if (arg1 == 23) {
            this.field3451 = arg0.method5195();
            this.field3453 = arg0.method5193();
        } else if (arg1 == 24) {
            this.field3452 = arg0.method5195();
        } else if (arg1 == 25) {
            this.field3472 = arg0.method5195();
            this.field3456 = arg0.method5193();
        } else if (arg1 == 26) {
            this.field3429 = arg0.method5195();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3454[arg1 - 30] = arg0.method5202();
            if (this.field3454[arg1 - 30].equalsIgnoreCase(class234.field2966)) {
                this.field3454[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3449[arg1 - 35] = arg0.method5202();
        } else if (arg1 == 40) {
            int var3 = arg0.method5193();
            this.field3435 = new short[var3];
            this.field3436 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3435[var4] = (short) arg0.method5195();
                this.field3436[var4] = (short) arg0.method5195();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5193();
            this.field3437 = new short[var5];
            this.field3438 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3437[var6] = (short) arg0.method5195();
                this.field3438[var6] = (short) arg0.method5195();
            }
        } else if (arg1 == 42) {
            this.field3463 = arg0.method5194();
        } else if (arg1 == 65) {
            this.field3473 = true;
        } else if (arg1 == 78) {
            this.field3457 = arg0.method5195();
        } else if (arg1 == 79) {
            this.field3458 = arg0.method5195();
        } else if (arg1 == 90) {
            this.field3459 = arg0.method5195();
        } else if (arg1 == 91) {
            this.field3461 = arg0.method5195();
        } else if (arg1 == 92) {
            this.field3460 = arg0.method5195();
        } else if (arg1 == 93) {
            this.field3475 = arg0.method5195();
        } else if (arg1 == 95) {
            this.field3442 = arg0.method5195();
        } else if (arg1 == 97) {
            this.field3446 = arg0.method5195();
        } else if (arg1 == 98) {
            this.field3466 = arg0.method5195();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3423 == null) {
                this.field3423 = new int[10];
                this.field3464 = new int[10];
            }
            this.field3423[arg1 - 100] = arg0.method5195();
            this.field3464[arg1 - 100] = arg0.method5195();
        } else if (arg1 == 110) {
            this.field3467 = arg0.method5195();
        } else if (arg1 == 111) {
            this.field3462 = arg0.method5195();
        } else if (arg1 == 112) {
            this.field3469 = arg0.method5195();
        } else if (arg1 == 113) {
            this.field3470 = arg0.method5194();
        } else if (arg1 == 114) {
            this.field3471 = arg0.method5194();
        } else if (arg1 == 115) {
            this.field3477 = arg0.method5193();
        } else if (arg1 == 139) {
            this.field3474 = arg0.method5195();
        } else if (arg1 == 140) {
            this.field3440 = arg0.method5195();
        } else if (arg1 == 148) {
            this.field3468 = arg0.method5195();
        } else if (arg1 == 149) {
            this.field3478 = arg0.method5195();
        } else if (arg1 == 249) {
            this.field3448 = class258.method2185(arg0, this.field3448);
        }
    }

    @ObfuscatedName("jq.o(Ljq;Ljq;I)V")
    public void method4383(class265 arg0, class265 arg1) {
        this.field3433 = arg0.field3433;
        this.field3439 = arg0.field3439;
        this.field3431 = arg0.field3431;
        this.field3441 = arg0.field3441;
        this.field3442 = arg0.field3442;
        this.field3443 = arg0.field3443;
        this.field3444 = arg0.field3444;
        this.field3435 = arg0.field3435;
        this.field3436 = arg0.field3436;
        this.field3437 = arg0.field3437;
        this.field3438 = arg0.field3438;
        this.field3434 = arg1.field3434;
        this.field3447 = arg1.field3447;
        this.field3479 = arg1.field3479;
        this.field3445 = 1;
    }

    @ObfuscatedName("jq.x(Ljq;Ljq;I)V")
    public void method4377(class265 arg0, class265 arg1) {
        this.field3433 = arg0.field3433;
        this.field3439 = arg0.field3439;
        this.field3431 = arg0.field3431;
        this.field3441 = arg0.field3441;
        this.field3442 = arg0.field3442;
        this.field3443 = arg0.field3443;
        this.field3444 = arg0.field3444;
        this.field3435 = arg1.field3435;
        this.field3436 = arg1.field3436;
        this.field3437 = arg1.field3437;
        this.field3438 = arg1.field3438;
        this.field3434 = arg1.field3434;
        this.field3447 = arg1.field3447;
        this.field3445 = arg1.field3445;
        this.field3451 = arg1.field3451;
        this.field3452 = arg1.field3452;
        this.field3457 = arg1.field3457;
        this.field3472 = arg1.field3472;
        this.field3429 = arg1.field3429;
        this.field3458 = arg1.field3458;
        this.field3459 = arg1.field3459;
        this.field3460 = arg1.field3460;
        this.field3461 = arg1.field3461;
        this.field3475 = arg1.field3475;
        this.field3477 = arg1.field3477;
        this.field3454 = arg1.field3454;
        this.field3449 = new String[5];
        if (arg1.field3449 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3449[var3] = arg1.field3449[var3];
            }
        }
        this.field3449[4] = class234.field3047;
        this.field3479 = 0;
    }

    @ObfuscatedName("jq.w(Ljq;Ljq;B)V")
    public void method4371(class265 arg0, class265 arg1) {
        this.field3433 = arg0.field3433;
        this.field3439 = arg0.field3439;
        this.field3431 = arg0.field3431;
        this.field3441 = arg0.field3441;
        this.field3442 = arg0.field3442;
        this.field3443 = arg0.field3443;
        this.field3444 = arg0.field3444;
        this.field3435 = arg0.field3435;
        this.field3436 = arg0.field3436;
        this.field3437 = arg0.field3437;
        this.field3438 = arg0.field3438;
        this.field3445 = arg0.field3445;
        this.field3434 = arg1.field3434;
        this.field3479 = 0;
        this.field3447 = false;
        this.field3473 = false;
    }

    @ObfuscatedName("jq.g(II)Lee;")
    public final class131 method4372(int arg0) {
        if (this.field3423 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3464[var3] && this.field3464[var3] != 0) {
                    var2 = this.field3423[var3];
                }
            }
            if (var2 != -1) {
                return method136(var2).method4372(1);
            }
        }
        class131 var4 = class131.method2636(Statics.field3427, this.field3433, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3467 != 128 || this.field3462 != 128 || this.field3469 != 128) {
            var4.method2651(this.field3467, this.field3462, this.field3469);
        }
        if (this.field3435 != null) {
            for (int var5 = 0; var5 < this.field3435.length; var5++) {
                var4.method2691(this.field3435[var5], this.field3436[var5]);
            }
        }
        if (this.field3437 != null) {
            for (int var6 = 0; var6 < this.field3437.length; var6++) {
                var4.method2652(this.field3437[var6], this.field3438[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jq.m(II)Ler;")
    public final class137 method4382(int arg0) {
        if (this.field3423 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3464[var3] && this.field3464[var3] != 0) {
                    var2 = this.field3423[var3];
                }
            }
            if (var2 != -1) {
                return method136(var2).method4382(1);
            }
        }
        class137 var4 = (class137) field3430.method3170((long) this.field3432);
        if (var4 != null) {
            return var4;
        }
        class131 var5 = class131.method2636(Statics.field3427, this.field3433, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3467 != 128 || this.field3462 != 128 || this.field3469 != 128) {
            var5.method2651(this.field3467, this.field3462, this.field3469);
        }
        if (this.field3435 != null) {
            for (int var6 = 0; var6 < this.field3435.length; var6++) {
                var5.method2691(this.field3435[var6], this.field3436[var6]);
            }
        }
        if (this.field3437 != null) {
            for (int var7 = 0; var7 < this.field3437.length; var7++) {
                var5.method2652(this.field3437[var7], this.field3438[var7]);
            }
        }
        class137 var8 = var5.method2656(this.field3470 + 64, this.field3471 * 5 + 768, -50, -10, -50);
        var8.field1712 = true;
        field3430.method3169(var8, (long) this.field3432);
        return var8;
    }

    @ObfuscatedName("jq.n(II)Ljq;")
    public class265 method4398(int arg0) {
        if (this.field3423 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3464[var3] && this.field3464[var3] != 0) {
                    var2 = this.field3423[var3];
                }
            }
            if (var2 != -1) {
                return method136(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cl.d(IIIIIZI)Llp;")
    public static final class335 method2155(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class335 var8 = (class335) field3425.method3170(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class265 var9 = method136(arg0);
        if (arg1 > 1 && var9.field3423 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3464[var11] && var9.field3464[var11] != 0) {
                    var10 = var9.field3423[var11];
                }
            }
            if (var10 != -1) {
                var9 = method136(var10);
            }
        }
        class137 var12 = var9.method4382(1);
        if (var12 == null) {
            return null;
        }
        class335 var13 = null;
        if (var9.field3466 != -1) {
            var13 = method2155(var9.field3446, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3440 != -1) {
            var13 = method2155(var9.field3474, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3478 != -1) {
            var13 = method2155(var9.field3468, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3882;
        int var15 = Statics.field3879;
        int var16 = Statics.field3880;
        int[] var17 = new int[4];
        class331.method5685(var17);
        class335 var18 = new class335(36, 32);
        class331.method5651(var18.field3906, 36, 32);
        class331.method5657();
        class140.method2870();
        class140.method2939(16, 16);
        class140.field1789 = false;
        if (var9.field3478 != -1) {
            var13.method5765(0, 0);
        }
        int var19 = var9.field3439;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class140.field1811[var9.field3431] * var19 >> 16;
        int var21 = class140.field1794[var9.field3431] * var19 >> 16;
        var12.method2758();
        var12.method2761(0, var9.field3441, var9.field3442, var9.field3431, var9.field3443, var9.field3444 + var12.field1906 / 2 + var20, var9.field3444 + var21);
        if (var9.field3440 != -1) {
            var13.method5765(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5774(1);
        }
        if (arg2 >= 2) {
            var18.method5774(16777215);
        }
        if (arg3 != 0) {
            var18.method5762(arg3);
        }
        class331.method5651(var18.field3906, 36, 32);
        if (var9.field3466 != -1) {
            var13.method5765(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3445 == 1) {
            Statics.field588.method5053(method3418(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3425.method3169(var18, var6);
        }
        class331.method5651(var14, var15, var16);
        class331.method5656(var17);
        class140.method2870();
        class140.field1789 = true;
        return var18;
    }

    @ObfuscatedName("gd.h(IS)Ljava/lang/String;")
    public static final String method3418(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class234.field2952 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class234.field2964 + "</col>";
        }
    }

    @ObfuscatedName("jq.a(ZI)Z")
    public final boolean method4375(boolean arg0) {
        int var2 = this.field3451;
        int var3 = this.field3452;
        int var4 = this.field3457;
        if (arg0) {
            var2 = this.field3472;
            var3 = this.field3429;
            var4 = this.field3458;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3427.method3883(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3427.method3883(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3427.method3883(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jq.q(ZI)Lee;")
    public final class131 method4376(boolean arg0) {
        int var2 = this.field3451;
        int var3 = this.field3452;
        int var4 = this.field3457;
        if (arg0) {
            var2 = this.field3472;
            var3 = this.field3429;
            var4 = this.field3458;
        }
        if (var2 == -1) {
            return null;
        }
        class131 var5 = class131.method2636(Statics.field3427, var2, 0);
        if (var3 != -1) {
            class131 var6 = class131.method2636(Statics.field3427, var3, 0);
            if (var4 == -1) {
                class131[] var9 = new class131[] { var5, var6 };
                var5 = new class131(var9, 2);
            } else {
                class131 var7 = class131.method2636(Statics.field3427, var4, 0);
                class131[] var8 = new class131[] { var5, var6, var7 };
                var5 = new class131(var8, 3);
            }
        }
        if (!arg0 && this.field3453 != 0) {
            var5.method2701(0, this.field3453, 0);
        }
        if (arg0 && this.field3456 != 0) {
            var5.method2701(0, this.field3456, 0);
        }
        if (this.field3435 != null) {
            for (int var10 = 0; var10 < this.field3435.length; var10++) {
                var5.method2691(this.field3435[var10], this.field3436[var10]);
            }
        }
        if (this.field3437 != null) {
            for (int var11 = 0; var11 < this.field3437.length; var11++) {
                var5.method2652(this.field3437[var11], this.field3438[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jq.c(ZI)Z")
    public final boolean method4421(boolean arg0) {
        int var2 = this.field3459;
        int var3 = this.field3460;
        if (arg0) {
            var2 = this.field3461;
            var3 = this.field3475;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3427.method3883(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3427.method3883(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jq.j(ZB)Lee;")
    public final class131 method4378(boolean arg0) {
        int var2 = this.field3459;
        int var3 = this.field3460;
        if (arg0) {
            var2 = this.field3461;
            var3 = this.field3475;
        }
        if (var2 == -1) {
            return null;
        }
        class131 var4 = class131.method2636(Statics.field3427, var2, 0);
        if (var3 != -1) {
            class131 var5 = class131.method2636(Statics.field3427, var3, 0);
            class131[] var6 = new class131[] { var4, var5 };
            var4 = new class131(var6, 2);
        }
        if (this.field3435 != null) {
            for (int var7 = 0; var7 < this.field3435.length; var7++) {
                var4.method2691(this.field3435[var7], this.field3436[var7]);
            }
        }
        if (this.field3437 != null) {
            for (int var8 = 0; var8 < this.field3437.length; var8++) {
                var4.method2652(this.field3437[var8], this.field3438[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jq.r(III)I")
    public int method4384(int arg0, int arg1) {
        return class258.method4902(this.field3448, arg0, arg1);
    }

    @ObfuscatedName("jq.u(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4380(int arg0, String arg1) {
        class326 var3 = this.field3448;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class186 var5 = (class186) var3.method5582((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2150;
            }
        }
        return var4;
    }

    @ObfuscatedName("jq.p(B)I")
    public int method4381() {
        if (this.field3463 == -1 || this.field3449 == null) {
            return -1;
        } else if (this.field3463 >= 0) {
            return this.field3449[this.field3463] == null ? -1 : this.field3463;
        } else if (class234.field2800.equalsIgnoreCase(this.field3449[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ed.b(I)V")
    public static void method3153() {
        field3465.method3172();
        field3430.method3172();
        field3425.method3172();
    }

    @ObfuscatedName("ai.l(ZB)V")
    public static void method621(boolean arg0) {
        if (Statics.field3428 != arg0) {
            method3153();
            Statics.field3428 = arg0;
        }
    }
}
