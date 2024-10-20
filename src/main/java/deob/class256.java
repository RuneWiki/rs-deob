package deob;

@ObfuscatedName("if")
public class class256 extends class176 {

    @ObfuscatedName("if.m")
    public static class146 field3439 = new class146(64);

    @ObfuscatedName("if.p")
    public static class146 field3402 = new class146(50);

    @ObfuscatedName("if.h")
    public static class146 field3403 = new class146(200);

    @ObfuscatedName("if.n")
    public int field3411;

    @ObfuscatedName("if.x")
    public int field3406;

    @ObfuscatedName("if.w")
    public String field3407 = class225.field2775;

    @ObfuscatedName("if.k")
    public short[] field3408;

    @ObfuscatedName("if.q")
    public short[] field3430;

    @ObfuscatedName("if.z")
    public short[] field3410;

    @ObfuscatedName("if.y")
    public short[] field3419;

    @ObfuscatedName("if.f")
    public int field3432 = 2000;

    @ObfuscatedName("if.b")
    public int field3450 = 0;

    @ObfuscatedName("if.r")
    public int field3414 = 0;

    @ObfuscatedName("if.s")
    public int field3438 = 0;

    @ObfuscatedName("if.a")
    public int field3416 = 0;

    @ObfuscatedName("if.u")
    public int field3417 = 0;

    @ObfuscatedName("if.ae")
    public int field3418 = 0;

    @ObfuscatedName("if.af")
    public int field3428 = 1;

    @ObfuscatedName("if.az")
    public boolean field3420 = false;

    @ObfuscatedName("if.ax")
    public String[] field3421 = new String[] { null, null, class225.field2853, null, null };

    @ObfuscatedName("if.aj")
    public String[] field3422 = new String[] { null, null, null, null, class225.field2769 };

    @ObfuscatedName("if.ay")
    public int field3415 = -2;

    @ObfuscatedName("if.aa")
    public int field3424 = -1;

    @ObfuscatedName("if.aq")
    public int field3425 = -1;

    @ObfuscatedName("if.as")
    public int field3396 = 0;

    @ObfuscatedName("if.ak")
    public int field3400 = -1;

    @ObfuscatedName("if.ac")
    public int field3401 = -1;

    @ObfuscatedName("if.aw")
    public int field3426 = 0;

    @ObfuscatedName("if.ar")
    public int field3429 = -1;

    @ObfuscatedName("if.av")
    public int field3431 = -1;

    @ObfuscatedName("if.al")
    public int field3427 = -1;

    @ObfuscatedName("if.ad")
    public int field3433 = -1;

    @ObfuscatedName("if.am")
    public int field3395 = -1;

    @ObfuscatedName("if.ao")
    public int field3435 = -1;

    @ObfuscatedName("if.at")
    public int[] field3436;

    @ObfuscatedName("if.an")
    public int[] field3440;

    @ObfuscatedName("if.ag")
    public int field3409 = -1;

    @ObfuscatedName("if.ai")
    public int field3405 = -1;

    @ObfuscatedName("if.ab")
    public int field3412 = 128;

    @ObfuscatedName("if.ap")
    public int field3441 = 128;

    @ObfuscatedName("if.ah")
    public int field3442 = 128;

    @ObfuscatedName("if.bq")
    public int field3443 = 0;

    @ObfuscatedName("if.bf")
    public int field3444 = 0;

    @ObfuscatedName("if.bc")
    public int field3445 = 0;

    @ObfuscatedName("if.bk")
    public class317 field3446;

    @ObfuscatedName("if.bb")
    public boolean field3447 = false;

    @ObfuscatedName("if.bi")
    public int field3448 = -1;

    @ObfuscatedName("if.bp")
    public int field3449 = -1;

    @ObfuscatedName("if.bl")
    public int field3437 = -1;

    @ObfuscatedName("if.by")
    public int field3451 = -1;

    @ObfuscatedName("iy.c(IB)Lif;")
    public static class256 method4164(int arg0) {
        class256 var1 = (class256) field3439.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3398.method3845(10, arg0);
        class256 var3 = new class256();
        var3.field3411 = arg0;
        if (var2 != null) {
            var3.method4324(new class301(var2));
        }
        var3.method4346();
        if (var3.field3405 != -1) {
            var3.method4326(method4164(var3.field3405), method4164(var3.field3409));
        }
        if (var3.field3449 != -1) {
            var3.method4334(method4164(var3.field3449), method4164(var3.field3448));
        }
        if (var3.field3451 != -1) {
            var3.method4328(method4164(var3.field3451), method4164(var3.field3437));
        }
        if (!Statics.field3699 && var3.field3420) {
            var3.field3407 = class225.field2893;
            var3.field3447 = false;
            var3.field3421 = null;
            var3.field3422 = null;
            var3.field3415 = -1;
            var3.field3445 = 0;
            if (var3.field3446 != null) {
                boolean var4 = false;
                for (class181 var5 = var3.field3446.method5498(); var5 != null; var5 = var3.field3446.method5499()) {
                    class251 var6 = class251.method3375((int) var5.field2115);
                    if (var6.field3304) {
                        var5.method3351();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3446 = null;
                }
            }
        }
        field3439.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.t(I)V")
    public void method4346() {
    }

    @ObfuscatedName("if.o(Lkp;B)V")
    public void method4324(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4325(arg0, var2);
        }
    }

    @ObfuscatedName("if.e(Lkp;IB)V")
    public void method4325(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3406 = arg0.method5124();
        } else if (arg1 == 2) {
            this.field3407 = arg0.method5138();
        } else if (arg1 == 4) {
            this.field3432 = arg0.method5124();
        } else if (arg1 == 5) {
            this.field3450 = arg0.method5124();
        } else if (arg1 == 6) {
            this.field3414 = arg0.method5124();
        } else if (arg1 == 7) {
            this.field3416 = arg0.method5124();
            if (this.field3416 > 32767) {
                this.field3416 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3417 = arg0.method5124();
            if (this.field3417 > 32767) {
                this.field3417 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3418 = 1;
        } else if (arg1 == 12) {
            this.field3428 = arg0.method5134();
        } else if (arg1 == 16) {
            this.field3420 = true;
        } else if (arg1 == 23) {
            this.field3424 = arg0.method5124();
            this.field3396 = arg0.method5129();
        } else if (arg1 == 24) {
            this.field3425 = arg0.method5124();
        } else if (arg1 == 25) {
            this.field3400 = arg0.method5124();
            this.field3426 = arg0.method5129();
        } else if (arg1 == 26) {
            this.field3401 = arg0.method5124();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3421[arg1 - 30] = arg0.method5138();
            if (this.field3421[arg1 - 30].equalsIgnoreCase(class225.field2770)) {
                this.field3421[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3422[arg1 - 35] = arg0.method5138();
        } else if (arg1 == 40) {
            int var3 = arg0.method5129();
            this.field3408 = new short[var3];
            this.field3430 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3408[var4] = (short) arg0.method5124();
                this.field3430[var4] = (short) arg0.method5124();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5129();
            this.field3410 = new short[var5];
            this.field3419 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3410[var6] = (short) arg0.method5124();
                this.field3419[var6] = (short) arg0.method5124();
            }
        } else if (arg1 == 42) {
            this.field3415 = arg0.method5130();
        } else if (arg1 == 65) {
            this.field3447 = true;
        } else if (arg1 == 78) {
            this.field3429 = arg0.method5124();
        } else if (arg1 == 79) {
            this.field3431 = arg0.method5124();
        } else if (arg1 == 90) {
            this.field3427 = arg0.method5124();
        } else if (arg1 == 91) {
            this.field3395 = arg0.method5124();
        } else if (arg1 == 92) {
            this.field3433 = arg0.method5124();
        } else if (arg1 == 93) {
            this.field3435 = arg0.method5124();
        } else if (arg1 == 95) {
            this.field3438 = arg0.method5124();
        } else if (arg1 == 97) {
            this.field3409 = arg0.method5124();
        } else if (arg1 == 98) {
            this.field3405 = arg0.method5124();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3436 == null) {
                this.field3436 = new int[10];
                this.field3440 = new int[10];
            }
            this.field3436[arg1 - 100] = arg0.method5124();
            this.field3440[arg1 - 100] = arg0.method5124();
        } else if (arg1 == 110) {
            this.field3412 = arg0.method5124();
        } else if (arg1 == 111) {
            this.field3441 = arg0.method5124();
        } else if (arg1 == 112) {
            this.field3442 = arg0.method5124();
        } else if (arg1 == 113) {
            this.field3443 = arg0.method5130();
        } else if (arg1 == 114) {
            this.field3444 = arg0.method5130() * 5;
        } else if (arg1 == 115) {
            this.field3445 = arg0.method5129();
        } else if (arg1 == 139) {
            this.field3448 = arg0.method5124();
        } else if (arg1 == 140) {
            this.field3449 = arg0.method5124();
        } else if (arg1 == 148) {
            this.field3437 = arg0.method5124();
        } else if (arg1 == 149) {
            this.field3451 = arg0.method5124();
        } else if (arg1 == 249) {
            this.field3446 = class249.method1064(arg0, this.field3446);
        }
    }

    @ObfuscatedName("if.i(Lif;Lif;B)V")
    public void method4326(class256 arg0, class256 arg1) {
        this.field3406 = arg0.field3406;
        this.field3432 = arg0.field3432;
        this.field3450 = arg0.field3450;
        this.field3414 = arg0.field3414;
        this.field3438 = arg0.field3438;
        this.field3416 = arg0.field3416;
        this.field3417 = arg0.field3417;
        this.field3408 = arg0.field3408;
        this.field3430 = arg0.field3430;
        this.field3410 = arg0.field3410;
        this.field3419 = arg0.field3419;
        this.field3407 = arg1.field3407;
        this.field3420 = arg1.field3420;
        this.field3428 = arg1.field3428;
        this.field3418 = 1;
    }

    @ObfuscatedName("if.g(Lif;Lif;B)V")
    public void method4334(class256 arg0, class256 arg1) {
        this.field3406 = arg0.field3406;
        this.field3432 = arg0.field3432;
        this.field3450 = arg0.field3450;
        this.field3414 = arg0.field3414;
        this.field3438 = arg0.field3438;
        this.field3416 = arg0.field3416;
        this.field3417 = arg0.field3417;
        this.field3408 = arg1.field3408;
        this.field3430 = arg1.field3430;
        this.field3410 = arg1.field3410;
        this.field3419 = arg1.field3419;
        this.field3407 = arg1.field3407;
        this.field3420 = arg1.field3420;
        this.field3418 = arg1.field3418;
        this.field3424 = arg1.field3424;
        this.field3425 = arg1.field3425;
        this.field3429 = arg1.field3429;
        this.field3400 = arg1.field3400;
        this.field3401 = arg1.field3401;
        this.field3431 = arg1.field3431;
        this.field3427 = arg1.field3427;
        this.field3433 = arg1.field3433;
        this.field3395 = arg1.field3395;
        this.field3435 = arg1.field3435;
        this.field3445 = arg1.field3445;
        this.field3421 = arg1.field3421;
        this.field3422 = new String[5];
        if (arg1.field3422 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3422[var3] = arg1.field3422[var3];
            }
        }
        this.field3422[4] = class225.field2774;
        this.field3428 = 0;
    }

    @ObfuscatedName("if.d(Lif;Lif;B)V")
    public void method4328(class256 arg0, class256 arg1) {
        this.field3406 = arg0.field3406;
        this.field3432 = arg0.field3432;
        this.field3450 = arg0.field3450;
        this.field3414 = arg0.field3414;
        this.field3438 = arg0.field3438;
        this.field3416 = arg0.field3416;
        this.field3417 = arg0.field3417;
        this.field3408 = arg0.field3408;
        this.field3430 = arg0.field3430;
        this.field3410 = arg0.field3410;
        this.field3419 = arg0.field3419;
        this.field3418 = arg0.field3418;
        this.field3407 = arg1.field3407;
        this.field3428 = 0;
        this.field3420 = false;
        this.field3447 = false;
    }

    @ObfuscatedName("if.l(IB)Ldg;")
    public final class122 method4363(int arg0) {
        if (this.field3436 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3440[var3] && this.field3440[var3] != 0) {
                    var2 = this.field3436[var3];
                }
            }
            if (var2 != -1) {
                return method4164(var2).method4363(1);
            }
        }
        class122 var4 = class122.method2633(Statics.field3399, this.field3406, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3412 != 128 || this.field3441 != 128 || this.field3442 != 128) {
            var4.method2606(this.field3412, this.field3441, this.field3442);
        }
        if (this.field3408 != null) {
            for (int var5 = 0; var5 < this.field3408.length; var5++) {
                var4.method2588(this.field3408[var5], this.field3430[var5]);
            }
        }
        if (this.field3410 != null) {
            for (int var6 = 0; var6 < this.field3410.length; var6++) {
                var4.method2589(this.field3410[var6], this.field3419[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("if.j(II)Ldx;")
    public final class128 method4330(int arg0) {
        if (this.field3436 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3440[var3] && this.field3440[var3] != 0) {
                    var2 = this.field3436[var3];
                }
            }
            if (var2 != -1) {
                return method4164(var2).method4330(1);
            }
        }
        class128 var4 = (class128) field3402.method3100((long) this.field3411);
        if (var4 != null) {
            return var4;
        }
        class122 var5 = class122.method2633(Statics.field3399, this.field3406, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3412 != 128 || this.field3441 != 128 || this.field3442 != 128) {
            var5.method2606(this.field3412, this.field3441, this.field3442);
        }
        if (this.field3408 != null) {
            for (int var6 = 0; var6 < this.field3408.length; var6++) {
                var5.method2588(this.field3408[var6], this.field3430[var6]);
            }
        }
        if (this.field3410 != null) {
            for (int var7 = 0; var7 < this.field3410.length; var7++) {
                var5.method2589(this.field3410[var7], this.field3419[var7]);
            }
        }
        class128 var8 = var5.method2595(this.field3443 + 64, this.field3444 + 768, -50, -10, -50);
        var8.field1683 = true;
        field3402.method3102(var8, (long) this.field3411);
        return var8;
    }

    @ObfuscatedName("if.m(IB)Lif;")
    public class256 method4367(int arg0) {
        if (this.field3436 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3440[var3] && this.field3440[var3] != 0) {
                    var2 = this.field3436[var3];
                }
            }
            if (var2 != -1) {
                return method4164(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("if.h(ZI)Z")
    public final boolean method4331(boolean arg0) {
        int var2 = this.field3424;
        int var3 = this.field3425;
        int var4 = this.field3429;
        if (arg0) {
            var2 = this.field3400;
            var3 = this.field3401;
            var4 = this.field3431;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3399.method3838(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3399.method3838(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3399.method3838(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("if.v(ZI)Ldg;")
    public final class122 method4333(boolean arg0) {
        int var2 = this.field3424;
        int var3 = this.field3425;
        int var4 = this.field3429;
        if (arg0) {
            var2 = this.field3400;
            var3 = this.field3401;
            var4 = this.field3431;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var5 = class122.method2633(Statics.field3399, var2, 0);
        if (var3 != -1) {
            class122 var6 = class122.method2633(Statics.field3399, var3, 0);
            if (var4 == -1) {
                class122[] var9 = new class122[] { var5, var6 };
                var5 = new class122(var9, 2);
            } else {
                class122 var7 = class122.method2633(Statics.field3399, var4, 0);
                class122[] var8 = new class122[] { var5, var6, var7 };
                var5 = new class122(var8, 3);
            }
        }
        if (!arg0 && this.field3396 != 0) {
            var5.method2587(0, this.field3396, 0);
        }
        if (arg0 && this.field3426 != 0) {
            var5.method2587(0, this.field3426, 0);
        }
        if (this.field3408 != null) {
            for (int var10 = 0; var10 < this.field3408.length; var10++) {
                var5.method2588(this.field3408[var10], this.field3430[var10]);
            }
        }
        if (this.field3410 != null) {
            for (int var11 = 0; var11 < this.field3410.length; var11++) {
                var5.method2589(this.field3410[var11], this.field3419[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("if.n(ZI)Z")
    public final boolean method4332(boolean arg0) {
        int var2 = this.field3427;
        int var3 = this.field3433;
        if (arg0) {
            var2 = this.field3395;
            var3 = this.field3435;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3399.method3838(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3399.method3838(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("if.x(ZI)Ldg;")
    public final class122 method4342(boolean arg0) {
        int var2 = this.field3427;
        int var3 = this.field3433;
        if (arg0) {
            var2 = this.field3395;
            var3 = this.field3435;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var4 = class122.method2633(Statics.field3399, var2, 0);
        if (var3 != -1) {
            class122 var5 = class122.method2633(Statics.field3399, var3, 0);
            class122[] var6 = new class122[] { var4, var5 };
            var4 = new class122(var6, 2);
        }
        if (this.field3408 != null) {
            for (int var7 = 0; var7 < this.field3408.length; var7++) {
                var4.method2588(this.field3408[var7], this.field3430[var7]);
            }
        }
        if (this.field3410 != null) {
            for (int var8 = 0; var8 < this.field3410.length; var8++) {
                var4.method2589(this.field3410[var8], this.field3419[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("if.w(III)I")
    public int method4336(int arg0, int arg1) {
        class317 var3 = this.field3446;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class180 var5 = (class180) var3.method5510((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2112;
            }
        }
        return var4;
    }

    @ObfuscatedName("if.q(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4347(int arg0, String arg1) {
        return class249.method2650(this.field3446, arg0, arg1);
    }

    @ObfuscatedName("if.z(I)I")
    public int method4335() {
        if (this.field3415 == -1 || this.field3422 == null) {
            return -1;
        } else if (this.field3415 >= 0) {
            return this.field3422[this.field3415] == null ? -1 : this.field3415;
        } else if (class225.field2769.equalsIgnoreCase(this.field3422[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("q.y(ZI)V")
    public static void method177(boolean arg0) {
        if (Statics.field3699 != arg0) {
            field3439.method3103();
            field3402.method3103();
            field3403.method3103();
            Statics.field3699 = arg0;
        }
    }
}
