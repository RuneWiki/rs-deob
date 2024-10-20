package deob;

@ObfuscatedName("iq")
public class class255 extends class176 {

    @ObfuscatedName("iq.f")
    public static class146 field3408 = new class146(64);

    @ObfuscatedName("iq.m")
    public static class146 field3409 = new class146(50);

    @ObfuscatedName("iq.u")
    public static class146 field3446 = new class146(200);

    @ObfuscatedName("iq.r")
    public int field3411;

    @ObfuscatedName("iq.v")
    public int field3412;

    @ObfuscatedName("iq.y")
    public String field3450 = class225.field2772;

    @ObfuscatedName("iq.g")
    public short[] field3425;

    @ObfuscatedName("iq.a")
    public short[] field3415;

    @ObfuscatedName("iq.j")
    public short[] field3416;

    @ObfuscatedName("iq.t")
    public short[] field3417;

    @ObfuscatedName("iq.h")
    public int field3423 = 2000;

    @ObfuscatedName("iq.o")
    public int field3419 = 0;

    @ObfuscatedName("iq.n")
    public int field3448 = 0;

    @ObfuscatedName("iq.d")
    public int field3421 = 0;

    @ObfuscatedName("iq.s")
    public int field3407 = 0;

    @ObfuscatedName("iq.z")
    public int field3422 = 0;

    @ObfuscatedName("iq.al")
    public int field3424 = 0;

    @ObfuscatedName("iq.av")
    public int field3429 = 1;

    @ObfuscatedName("iq.as")
    public boolean field3426 = false;

    @ObfuscatedName("iq.aw")
    public String[] field3427 = new String[] { null, null, class225.field2758, null, null };

    @ObfuscatedName("iq.ad")
    public String[] field3428 = new String[] { null, null, null, null, class225.field3047 };

    @ObfuscatedName("iq.ar")
    public int field3404 = -2;

    @ObfuscatedName("iq.ax")
    public int field3457 = -1;

    @ObfuscatedName("iq.az")
    public int field3438 = -1;

    @ObfuscatedName("iq.ae")
    public int field3432 = 0;

    @ObfuscatedName("iq.ao")
    public int field3433 = -1;

    @ObfuscatedName("iq.aj")
    public int field3434 = -1;

    @ObfuscatedName("iq.at")
    public int field3435 = 0;

    @ObfuscatedName("iq.ac")
    public int field3436 = -1;

    @ObfuscatedName("iq.ap")
    public int field3431 = -1;

    @ObfuscatedName("iq.aq")
    public int field3437 = -1;

    @ObfuscatedName("iq.aa")
    public int field3439 = -1;

    @ObfuscatedName("iq.an")
    public int field3418 = -1;

    @ObfuscatedName("iq.au")
    public int field3441 = -1;

    @ObfuscatedName("iq.ai")
    public int[] field3442;

    @ObfuscatedName("iq.ak")
    public int[] field3443;

    @ObfuscatedName("iq.ah")
    public int field3444 = -1;

    @ObfuscatedName("iq.am")
    public int field3445 = -1;

    @ObfuscatedName("iq.ay")
    public int field3452 = 128;

    @ObfuscatedName("iq.af")
    public int field3447 = 128;

    @ObfuscatedName("iq.ab")
    public int field3405 = 128;

    @ObfuscatedName("iq.bp")
    public int field3449 = 0;

    @ObfuscatedName("iq.bz")
    public int field3420 = 0;

    @ObfuscatedName("iq.bi")
    public int field3451 = 0;

    @ObfuscatedName("iq.bg")
    public class317 field3410;

    @ObfuscatedName("iq.bh")
    public boolean field3453 = false;

    @ObfuscatedName("iq.bm")
    public int field3454 = -1;

    @ObfuscatedName("iq.bn")
    public int field3455 = -1;

    @ObfuscatedName("iq.bc")
    public int field3401 = -1;

    @ObfuscatedName("iq.bx")
    public int field3440 = -1;

    @ObfuscatedName("al.q(II)Liq;")
    public static class255 method348(int arg0) {
        class255 var1 = (class255) field3408.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1277.method3775(10, arg0);
        class255 var3 = new class255();
        var3.field3411 = arg0;
        if (var2 != null) {
            var3.method4255(new class301(var2));
        }
        var3.method4254();
        if (var3.field3445 != -1) {
            var3.method4283(method348(var3.field3445), method348(var3.field3444));
        }
        if (var3.field3455 != -1) {
            var3.method4258(method348(var3.field3455), method348(var3.field3454));
        }
        if (var3.field3440 != -1) {
            var3.method4306(method348(var3.field3440), method348(var3.field3401));
        }
        if (!Statics.field1869 && var3.field3426) {
            var3.field3450 = class225.field3038;
            var3.field3453 = false;
            var3.field3427 = null;
            var3.field3428 = null;
            var3.field3404 = -1;
            var3.field3451 = 0;
            if (var3.field3410 != null) {
                boolean var4 = false;
                for (class181 var5 = var3.field3410.method5454(); var5 != null; var5 = var3.field3410.method5455()) {
                    class250 var6 = class250.method195((int) var5.field2114);
                    if (var6.field3306) {
                        var5.method3286();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3410 = null;
                }
            }
        }
        field3408.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.w(I)V")
    public void method4254() {
    }

    @ObfuscatedName("iq.e(Lkf;B)V")
    public void method4255(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method4290(arg0, var2);
        }
    }

    @ObfuscatedName("iq.p(Lkf;II)V")
    public void method4290(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3412 = arg0.method5069();
        } else if (arg1 == 2) {
            this.field3450 = arg0.method5076();
        } else if (arg1 == 4) {
            this.field3423 = arg0.method5069();
        } else if (arg1 == 5) {
            this.field3419 = arg0.method5069();
        } else if (arg1 == 6) {
            this.field3448 = arg0.method5069();
        } else if (arg1 == 7) {
            this.field3407 = arg0.method5069();
            if (this.field3407 > 32767) {
                this.field3407 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3422 = arg0.method5069();
            if (this.field3422 > 32767) {
                this.field3422 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3424 = 1;
        } else if (arg1 == 12) {
            this.field3429 = arg0.method5072();
        } else if (arg1 == 16) {
            this.field3426 = true;
        } else if (arg1 == 23) {
            this.field3457 = arg0.method5069();
            this.field3432 = arg0.method5077();
        } else if (arg1 == 24) {
            this.field3438 = arg0.method5069();
        } else if (arg1 == 25) {
            this.field3433 = arg0.method5069();
            this.field3435 = arg0.method5077();
        } else if (arg1 == 26) {
            this.field3434 = arg0.method5069();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3427[arg1 - 30] = arg0.method5076();
            if (this.field3427[arg1 - 30].equalsIgnoreCase(class225.field2760)) {
                this.field3427[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3428[arg1 - 35] = arg0.method5076();
        } else if (arg1 == 40) {
            int var3 = arg0.method5077();
            this.field3425 = new short[var3];
            this.field3415 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3425[var4] = (short) arg0.method5069();
                this.field3415[var4] = (short) arg0.method5069();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5077();
            this.field3416 = new short[var5];
            this.field3417 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3416[var6] = (short) arg0.method5069();
                this.field3417[var6] = (short) arg0.method5069();
            }
        } else if (arg1 == 42) {
            this.field3404 = arg0.method5068();
        } else if (arg1 == 65) {
            this.field3453 = true;
        } else if (arg1 == 78) {
            this.field3436 = arg0.method5069();
        } else if (arg1 == 79) {
            this.field3431 = arg0.method5069();
        } else if (arg1 == 90) {
            this.field3437 = arg0.method5069();
        } else if (arg1 == 91) {
            this.field3418 = arg0.method5069();
        } else if (arg1 == 92) {
            this.field3439 = arg0.method5069();
        } else if (arg1 == 93) {
            this.field3441 = arg0.method5069();
        } else if (arg1 == 95) {
            this.field3421 = arg0.method5069();
        } else if (arg1 == 97) {
            this.field3444 = arg0.method5069();
        } else if (arg1 == 98) {
            this.field3445 = arg0.method5069();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3442 == null) {
                this.field3442 = new int[10];
                this.field3443 = new int[10];
            }
            this.field3442[arg1 - 100] = arg0.method5069();
            this.field3443[arg1 - 100] = arg0.method5069();
        } else if (arg1 == 110) {
            this.field3452 = arg0.method5069();
        } else if (arg1 == 111) {
            this.field3447 = arg0.method5069();
        } else if (arg1 == 112) {
            this.field3405 = arg0.method5069();
        } else if (arg1 == 113) {
            this.field3449 = arg0.method5068();
        } else if (arg1 == 114) {
            this.field3420 = arg0.method5068() * 5;
        } else if (arg1 == 115) {
            this.field3451 = arg0.method5077();
        } else if (arg1 == 139) {
            this.field3454 = arg0.method5069();
        } else if (arg1 == 140) {
            this.field3455 = arg0.method5069();
        } else if (arg1 == 148) {
            this.field3401 = arg0.method5069();
        } else if (arg1 == 149) {
            this.field3440 = arg0.method5069();
        } else if (arg1 == 249) {
            this.field3410 = class248.method347(arg0, this.field3410);
        }
    }

    @ObfuscatedName("iq.k(Liq;Liq;I)V")
    public void method4283(class255 arg0, class255 arg1) {
        this.field3412 = arg0.field3412;
        this.field3423 = arg0.field3423;
        this.field3419 = arg0.field3419;
        this.field3448 = arg0.field3448;
        this.field3421 = arg0.field3421;
        this.field3407 = arg0.field3407;
        this.field3422 = arg0.field3422;
        this.field3425 = arg0.field3425;
        this.field3415 = arg0.field3415;
        this.field3416 = arg0.field3416;
        this.field3417 = arg0.field3417;
        this.field3450 = arg1.field3450;
        this.field3426 = arg1.field3426;
        this.field3429 = arg1.field3429;
        this.field3424 = 1;
    }

    @ObfuscatedName("iq.l(Liq;Liq;B)V")
    public void method4258(class255 arg0, class255 arg1) {
        this.field3412 = arg0.field3412;
        this.field3423 = arg0.field3423;
        this.field3419 = arg0.field3419;
        this.field3448 = arg0.field3448;
        this.field3421 = arg0.field3421;
        this.field3407 = arg0.field3407;
        this.field3422 = arg0.field3422;
        this.field3425 = arg1.field3425;
        this.field3415 = arg1.field3415;
        this.field3416 = arg1.field3416;
        this.field3417 = arg1.field3417;
        this.field3450 = arg1.field3450;
        this.field3426 = arg1.field3426;
        this.field3424 = arg1.field3424;
        this.field3457 = arg1.field3457;
        this.field3438 = arg1.field3438;
        this.field3436 = arg1.field3436;
        this.field3433 = arg1.field3433;
        this.field3434 = arg1.field3434;
        this.field3431 = arg1.field3431;
        this.field3437 = arg1.field3437;
        this.field3439 = arg1.field3439;
        this.field3418 = arg1.field3418;
        this.field3441 = arg1.field3441;
        this.field3451 = arg1.field3451;
        this.field3427 = arg1.field3427;
        this.field3428 = new String[5];
        if (arg1.field3428 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3428[var3] = arg1.field3428[var3];
            }
        }
        this.field3428[4] = class225.field2764;
        this.field3429 = 0;
    }

    @ObfuscatedName("iq.b(Liq;Liq;B)V")
    public void method4306(class255 arg0, class255 arg1) {
        this.field3412 = arg0.field3412;
        this.field3423 = arg0.field3423;
        this.field3419 = arg0.field3419;
        this.field3448 = arg0.field3448;
        this.field3421 = arg0.field3421;
        this.field3407 = arg0.field3407;
        this.field3422 = arg0.field3422;
        this.field3425 = arg0.field3425;
        this.field3415 = arg0.field3415;
        this.field3416 = arg0.field3416;
        this.field3417 = arg0.field3417;
        this.field3424 = arg0.field3424;
        this.field3450 = arg1.field3450;
        this.field3429 = 0;
        this.field3426 = false;
        this.field3453 = false;
    }

    @ObfuscatedName("iq.i(II)Lds;")
    public final class122 method4260(int arg0) {
        if (this.field3442 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3443[var3] && this.field3443[var3] != 0) {
                    var2 = this.field3442[var3];
                }
            }
            if (var2 != -1) {
                return method348(var2).method4260(1);
            }
        }
        class122 var4 = class122.method2512(Statics.field3406, this.field3412, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3452 != 128 || this.field3447 != 128 || this.field3405 != 128) {
            var4.method2529(this.field3452, this.field3447, this.field3405);
        }
        if (this.field3425 != null) {
            for (int var5 = 0; var5 < this.field3425.length; var5++) {
                var4.method2526(this.field3425[var5], this.field3415[var5]);
            }
        }
        if (this.field3416 != null) {
            for (int var6 = 0; var6 < this.field3416.length; var6++) {
                var4.method2527(this.field3416[var6], this.field3417[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iq.c(II)Ldm;")
    public final class128 method4261(int arg0) {
        if (this.field3442 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3443[var3] && this.field3443[var3] != 0) {
                    var2 = this.field3442[var3];
                }
            }
            if (var2 != -1) {
                return method348(var2).method4261(1);
            }
        }
        class128 var4 = (class128) field3409.method3039((long) this.field3411);
        if (var4 != null) {
            return var4;
        }
        class122 var5 = class122.method2512(Statics.field3406, this.field3412, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3452 != 128 || this.field3447 != 128 || this.field3405 != 128) {
            var5.method2529(this.field3452, this.field3447, this.field3405);
        }
        if (this.field3425 != null) {
            for (int var6 = 0; var6 < this.field3425.length; var6++) {
                var5.method2526(this.field3425[var6], this.field3415[var6]);
            }
        }
        if (this.field3416 != null) {
            for (int var7 = 0; var7 < this.field3416.length; var7++) {
                var5.method2527(this.field3416[var7], this.field3417[var7]);
            }
        }
        class128 var8 = var5.method2545(this.field3449 + 64, this.field3420 + 768, -50, -10, -50);
        var8.field1731 = true;
        field3409.method3041(var8, (long) this.field3411);
        return var8;
    }

    @ObfuscatedName("iq.u(IB)Liq;")
    public class255 method4273(int arg0) {
        if (this.field3442 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3443[var3] && this.field3443[var3] != 0) {
                    var2 = this.field3442[var3];
                }
            }
            if (var2 != -1) {
                return method348(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("t.x(IIIIIZI)Lly;")
    public static final class326 method222(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class326 var8 = (class326) field3446.method3039(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class255 var9 = method348(arg0);
        if (arg1 > 1 && var9.field3442 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3443[var11] && var9.field3443[var11] != 0) {
                    var10 = var9.field3442[var11];
                }
            }
            if (var10 != -1) {
                var9 = method348(var10);
            }
        }
        class128 var12 = var9.method4261(1);
        if (var12 == null) {
            return null;
        }
        class326 var13 = null;
        if (var9.field3445 != -1) {
            var13 = method222(var9.field3444, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3455 != -1) {
            var13 = method222(var9.field3454, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3440 != -1) {
            var13 = method222(var9.field3401, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3870;
        int var15 = Statics.field3876;
        int var16 = Statics.field3872;
        int[] var17 = new int[4];
        class322.method5526(var17);
        class326 var18 = new class326(36, 32);
        class322.method5560(var18.field3909, 36, 32);
        class322.method5549();
        class131.method2794();
        class131.method2719(16, 16);
        class131.field1769 = false;
        if (var9.field3440 != -1) {
            var13.method5646(0, 0);
        }
        int var19 = var9.field3423;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class131.field1788[var9.field3419] * var19 >> 16;
        int var21 = class131.field1785[var9.field3419] * var19 >> 16;
        var12.method2642();
        var12.method2609(0, var9.field3448, var9.field3421, var9.field3419, var9.field3407, var9.field3422 + var12.field1874 / 2 + var20, var9.field3422 + var21);
        if (var9.field3455 != -1) {
            var13.method5646(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5653(1);
        }
        if (arg2 >= 2) {
            var18.method5653(16777215);
        }
        if (arg3 != 0) {
            var18.method5691(arg3);
        }
        class322.method5560(var18.field3909, 36, 32);
        if (var9.field3445 != -1) {
            var13.method5646(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3424 == 1) {
            class296 var22 = Statics.field1130;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class225.field2925 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class225.field2923 + "</col>";
            }
            var22.method4927(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3446.method3041(var18, var6);
        }
        class322.method5560(var14, var15, var16);
        class322.method5540(var17);
        class131.method2794();
        class131.field1769 = true;
        return var18;
    }

    @ObfuscatedName("iq.r(ZB)Z")
    public final boolean method4263(boolean arg0) {
        int var2 = this.field3457;
        int var3 = this.field3438;
        int var4 = this.field3436;
        if (arg0) {
            var2 = this.field3433;
            var3 = this.field3434;
            var4 = this.field3431;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3406.method3777(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3406.method3777(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3406.method3777(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("iq.v(ZB)Lds;")
    public final class122 method4311(boolean arg0) {
        int var2 = this.field3457;
        int var3 = this.field3438;
        int var4 = this.field3436;
        if (arg0) {
            var2 = this.field3433;
            var3 = this.field3434;
            var4 = this.field3431;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var5 = class122.method2512(Statics.field3406, var2, 0);
        if (var3 != -1) {
            class122 var6 = class122.method2512(Statics.field3406, var3, 0);
            if (var4 == -1) {
                class122[] var9 = new class122[] { var5, var6 };
                var5 = new class122(var9, 2);
            } else {
                class122 var7 = class122.method2512(Statics.field3406, var4, 0);
                class122[] var8 = new class122[] { var5, var6, var7 };
                var5 = new class122(var8, 3);
            }
        }
        if (!arg0 && this.field3432 != 0) {
            var5.method2525(0, this.field3432, 0);
        }
        if (arg0 && this.field3435 != 0) {
            var5.method2525(0, this.field3435, 0);
        }
        if (this.field3425 != null) {
            for (int var10 = 0; var10 < this.field3425.length; var10++) {
                var5.method2526(this.field3425[var10], this.field3415[var10]);
            }
        }
        if (this.field3416 != null) {
            for (int var11 = 0; var11 < this.field3416.length; var11++) {
                var5.method2527(this.field3416[var11], this.field3417[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("iq.y(ZI)Z")
    public final boolean method4300(boolean arg0) {
        int var2 = this.field3437;
        int var3 = this.field3439;
        if (arg0) {
            var2 = this.field3418;
            var3 = this.field3441;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3406.method3777(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3406.method3777(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("iq.g(ZB)Lds;")
    public final class122 method4266(boolean arg0) {
        int var2 = this.field3437;
        int var3 = this.field3439;
        if (arg0) {
            var2 = this.field3418;
            var3 = this.field3441;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var4 = class122.method2512(Statics.field3406, var2, 0);
        if (var3 != -1) {
            class122 var5 = class122.method2512(Statics.field3406, var3, 0);
            class122[] var6 = new class122[] { var4, var5 };
            var4 = new class122(var6, 2);
        }
        if (this.field3425 != null) {
            for (int var7 = 0; var7 < this.field3425.length; var7++) {
                var4.method2526(this.field3425[var7], this.field3415[var7]);
            }
        }
        if (this.field3416 != null) {
            for (int var8 = 0; var8 < this.field3416.length; var8++) {
                var4.method2527(this.field3416[var8], this.field3417[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iq.a(IIB)I")
    public int method4267(int arg0, int arg1) {
        class317 var3 = this.field3410;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class180 var5 = (class180) var3.method5451((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2112;
            }
        }
        return var4;
    }

    @ObfuscatedName("iq.j(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4265(int arg0, String arg1) {
        return class248.method40(this.field3410, arg0, arg1);
    }

    @ObfuscatedName("iq.o(B)I")
    public int method4269() {
        if (this.field3404 == -1 || this.field3428 == null) {
            return -1;
        } else if (this.field3404 >= 0) {
            return this.field3428[this.field3404] == null ? -1 : this.field3404;
        } else if (class225.field3047.equalsIgnoreCase(this.field3428[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("kd.d(I)V")
    public static void method4898() {
        field3446.method3042();
    }
}
