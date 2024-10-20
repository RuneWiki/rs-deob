package deob;

@ObfuscatedName("jt")
public class class270 extends class207 {

    @ObfuscatedName("jt.e")
    public static class201 field3462 = new class201(64);

    @ObfuscatedName("jt.p")
    public static class201 field3429 = new class201(50);

    @ObfuscatedName("jt.b")
    public static class201 field3430 = new class201(200);

    @ObfuscatedName("jt.f")
    public int field3432;

    @ObfuscatedName("jt.g")
    public int field3433;

    @ObfuscatedName("jt.m")
    public String field3434 = class238.field2798;

    @ObfuscatedName("jt.r")
    public short[] field3435;

    @ObfuscatedName("jt.t")
    public short[] field3436;

    @ObfuscatedName("jt.o")
    public short[] field3424;

    @ObfuscatedName("jt.y")
    public short[] field3438;

    @ObfuscatedName("jt.a")
    public int field3439 = 2000;

    @ObfuscatedName("jt.j")
    public int field3440 = 0;

    @ObfuscatedName("jt.d")
    public int field3441 = 0;

    @ObfuscatedName("jt.h")
    public int field3475 = 0;

    @ObfuscatedName("jt.c")
    public int field3443 = 0;

    @ObfuscatedName("jt.v")
    public int field3444 = 0;

    @ObfuscatedName("jt.af")
    public int field3445 = 0;

    @ObfuscatedName("jt.ah")
    public int field3446 = 1;

    @ObfuscatedName("jt.ab")
    public boolean field3447 = false;

    @ObfuscatedName("jt.aw")
    public String[] field3448 = new String[] { null, null, class238.field2791, null, null };

    @ObfuscatedName("jt.ak")
    public String[] field3426 = new String[] { null, null, null, null, class238.field2947 };

    @ObfuscatedName("jt.an")
    public int field3450 = -2;

    @ObfuscatedName("jt.ao")
    public int field3470 = -1;

    @ObfuscatedName("jt.at")
    public int field3452 = -1;

    @ObfuscatedName("jt.ai")
    public int field3453 = 0;

    @ObfuscatedName("jt.ac")
    public int field3454 = -1;

    @ObfuscatedName("jt.ap")
    public int field3472 = -1;

    @ObfuscatedName("jt.aa")
    public int field3456 = 0;

    @ObfuscatedName("jt.ar")
    public int field3457 = -1;

    @ObfuscatedName("jt.au")
    public int field3458 = -1;

    @ObfuscatedName("jt.av")
    public int field3451 = -1;

    @ObfuscatedName("jt.al")
    public int field3449 = -1;

    @ObfuscatedName("jt.ae")
    public int field3461 = -1;

    @ObfuscatedName("jt.az")
    public int field3428 = -1;

    @ObfuscatedName("jt.aq")
    public int[] field3421;

    @ObfuscatedName("jt.ad")
    public int[] field3460;

    @ObfuscatedName("jt.aj")
    public int field3465 = -1;

    @ObfuscatedName("jt.ax")
    public int field3466 = -1;

    @ObfuscatedName("jt.am")
    public int field3464 = 128;

    @ObfuscatedName("jt.ay")
    public int field3423 = 128;

    @ObfuscatedName("jt.ag")
    public int field3469 = 128;

    @ObfuscatedName("jt.bk")
    public int field3442 = 0;

    @ObfuscatedName("jt.bp")
    public int field3468 = 0;

    @ObfuscatedName("jt.bi")
    public int field3463 = 0;

    @ObfuscatedName("jt.bj")
    public class198 field3473;

    @ObfuscatedName("jt.bo")
    public boolean field3437 = false;

    @ObfuscatedName("jt.bq")
    public int field3474 = -1;

    @ObfuscatedName("jt.bh")
    public int field3476 = -1;

    @ObfuscatedName("jt.bz")
    public int field3477 = -1;

    @ObfuscatedName("jt.bu")
    public int field3478 = -1;

    @ObfuscatedName("de.z(IB)Ljt;")
    public static class270 method2359(int arg0) {
        class270 var1 = (class270) field3462.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3425.method4247(10, arg0);
        class270 var3 = new class270();
        var3.field3432 = arg0;
        if (var2 != null) {
            var3.method4699(new class183(var2));
        }
        var3.method4696();
        if (var3.field3466 != -1) {
            var3.method4735(method2359(var3.field3466), method2359(var3.field3465));
        }
        if (var3.field3476 != -1) {
            var3.method4719(method2359(var3.field3476), method2359(var3.field3474));
        }
        if (var3.field3478 != -1) {
            var3.method4700(method2359(var3.field3478), method2359(var3.field3477));
        }
        if (!Statics.field3427 && var3.field3447) {
            var3.field3434 = class238.field2875;
            var3.field3437 = false;
            var3.field3448 = null;
            var3.field3426 = null;
            var3.field3450 = -1;
            var3.field3463 = 0;
            if (var3.field3473 != null) {
                boolean var4 = false;
                for (class205 var5 = var3.field3473.method3647(); var5 != null; var5 = var3.field3473.method3639()) {
                    class265 var6 = Statics.method4231((int) var5.field2422);
                    if (var6.field3333) {
                        var5.method3756();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3473 = null;
                }
            }
        }
        field3462.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jt.w(I)V")
    public void method4696() {
    }

    @ObfuscatedName("jt.s(Lgk;B)V")
    public void method4699(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4697(arg0, var2);
        }
    }

    @ObfuscatedName("jt.l(Lgk;IB)V")
    public void method4697(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3433 = arg0.method3253();
        } else if (arg1 == 2) {
            this.field3434 = arg0.method3441();
        } else if (arg1 == 4) {
            this.field3439 = arg0.method3253();
        } else if (arg1 == 5) {
            this.field3440 = arg0.method3253();
        } else if (arg1 == 6) {
            this.field3441 = arg0.method3253();
        } else if (arg1 == 7) {
            this.field3443 = arg0.method3253();
            if (this.field3443 > 32767) {
                this.field3443 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3444 = arg0.method3253();
            if (this.field3444 > 32767) {
                this.field3444 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3445 = 1;
        } else if (arg1 == 12) {
            this.field3446 = arg0.method3374();
        } else if (arg1 == 16) {
            this.field3447 = true;
        } else if (arg1 == 23) {
            this.field3470 = arg0.method3253();
            this.field3453 = arg0.method3247();
        } else if (arg1 == 24) {
            this.field3452 = arg0.method3253();
        } else if (arg1 == 25) {
            this.field3454 = arg0.method3253();
            this.field3456 = arg0.method3247();
        } else if (arg1 == 26) {
            this.field3472 = arg0.method3253();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3448[arg1 - 30] = arg0.method3441();
            if (this.field3448[arg1 - 30].equalsIgnoreCase(class238.field2960)) {
                this.field3448[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3426[arg1 - 35] = arg0.method3441();
        } else if (arg1 == 40) {
            int var3 = arg0.method3247();
            this.field3435 = new short[var3];
            this.field3436 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3435[var4] = (short) arg0.method3253();
                this.field3436[var4] = (short) arg0.method3253();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3247();
            this.field3424 = new short[var5];
            this.field3438 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3424[var6] = (short) arg0.method3253();
                this.field3438[var6] = (short) arg0.method3253();
            }
        } else if (arg1 == 42) {
            this.field3450 = arg0.method3384();
        } else if (arg1 == 65) {
            this.field3437 = true;
        } else if (arg1 == 78) {
            this.field3457 = arg0.method3253();
        } else if (arg1 == 79) {
            this.field3458 = arg0.method3253();
        } else if (arg1 == 90) {
            this.field3451 = arg0.method3253();
        } else if (arg1 == 91) {
            this.field3461 = arg0.method3253();
        } else if (arg1 == 92) {
            this.field3449 = arg0.method3253();
        } else if (arg1 == 93) {
            this.field3428 = arg0.method3253();
        } else if (arg1 == 95) {
            this.field3475 = arg0.method3253();
        } else if (arg1 == 97) {
            this.field3465 = arg0.method3253();
        } else if (arg1 == 98) {
            this.field3466 = arg0.method3253();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3421 == null) {
                this.field3421 = new int[10];
                this.field3460 = new int[10];
            }
            this.field3421[arg1 - 100] = arg0.method3253();
            this.field3460[arg1 - 100] = arg0.method3253();
        } else if (arg1 == 110) {
            this.field3464 = arg0.method3253();
        } else if (arg1 == 111) {
            this.field3423 = arg0.method3253();
        } else if (arg1 == 112) {
            this.field3469 = arg0.method3253();
        } else if (arg1 == 113) {
            this.field3442 = arg0.method3384();
        } else if (arg1 == 114) {
            this.field3468 = arg0.method3384() * 5;
        } else if (arg1 == 115) {
            this.field3463 = arg0.method3247();
        } else if (arg1 == 139) {
            this.field3474 = arg0.method3253();
        } else if (arg1 == 140) {
            this.field3476 = arg0.method3253();
        } else if (arg1 == 148) {
            this.field3477 = arg0.method3253();
        } else if (arg1 == 149) {
            this.field3478 = arg0.method3253();
        } else if (arg1 == 249) {
            this.field3473 = class263.method612(arg0, this.field3473);
        }
    }

    @ObfuscatedName("jt.u(Ljt;Ljt;B)V")
    public void method4735(class270 arg0, class270 arg1) {
        this.field3433 = arg0.field3433;
        this.field3439 = arg0.field3439;
        this.field3440 = arg0.field3440;
        this.field3441 = arg0.field3441;
        this.field3475 = arg0.field3475;
        this.field3443 = arg0.field3443;
        this.field3444 = arg0.field3444;
        this.field3435 = arg0.field3435;
        this.field3436 = arg0.field3436;
        this.field3424 = arg0.field3424;
        this.field3438 = arg0.field3438;
        this.field3434 = arg1.field3434;
        this.field3447 = arg1.field3447;
        this.field3446 = arg1.field3446;
        this.field3445 = 1;
    }

    @ObfuscatedName("jt.q(Ljt;Ljt;B)V")
    public void method4719(class270 arg0, class270 arg1) {
        this.field3433 = arg0.field3433;
        this.field3439 = arg0.field3439;
        this.field3440 = arg0.field3440;
        this.field3441 = arg0.field3441;
        this.field3475 = arg0.field3475;
        this.field3443 = arg0.field3443;
        this.field3444 = arg0.field3444;
        this.field3435 = arg1.field3435;
        this.field3436 = arg1.field3436;
        this.field3424 = arg1.field3424;
        this.field3438 = arg1.field3438;
        this.field3434 = arg1.field3434;
        this.field3447 = arg1.field3447;
        this.field3445 = arg1.field3445;
        this.field3470 = arg1.field3470;
        this.field3452 = arg1.field3452;
        this.field3457 = arg1.field3457;
        this.field3454 = arg1.field3454;
        this.field3472 = arg1.field3472;
        this.field3458 = arg1.field3458;
        this.field3451 = arg1.field3451;
        this.field3449 = arg1.field3449;
        this.field3461 = arg1.field3461;
        this.field3428 = arg1.field3428;
        this.field3463 = arg1.field3463;
        this.field3448 = arg1.field3448;
        this.field3426 = new String[5];
        if (arg1.field3426 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3426[var3] = arg1.field3426[var3];
            }
        }
        this.field3426[4] = class238.field2797;
        this.field3446 = 0;
    }

    @ObfuscatedName("jt.i(Ljt;Ljt;B)V")
    public void method4700(class270 arg0, class270 arg1) {
        this.field3433 = arg0.field3433;
        this.field3439 = arg0.field3439;
        this.field3440 = arg0.field3440;
        this.field3441 = arg0.field3441;
        this.field3475 = arg0.field3475;
        this.field3443 = arg0.field3443;
        this.field3444 = arg0.field3444;
        this.field3435 = arg0.field3435;
        this.field3436 = arg0.field3436;
        this.field3424 = arg0.field3424;
        this.field3438 = arg0.field3438;
        this.field3445 = arg0.field3445;
        this.field3434 = arg1.field3434;
        this.field3446 = 0;
        this.field3447 = false;
        this.field3437 = false;
    }

    @ObfuscatedName("jt.x(IB)Ldb;")
    public final class114 method4701(int arg0) {
        if (this.field3421 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3460[var3] && this.field3460[var3] != 0) {
                    var2 = this.field3421[var3];
                }
            }
            if (var2 != -1) {
                return method2359(var2).method4701(1);
            }
        }
        class114 var4 = class114.method2364(Statics.field3455, this.field3433, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3464 != 128 || this.field3423 != 128 || this.field3469 != 128) {
            var4.method2388(this.field3464, this.field3423, this.field3469);
        }
        if (this.field3435 != null) {
            for (int var5 = 0; var5 < this.field3435.length; var5++) {
                var4.method2377(this.field3435[var5], this.field3436[var5]);
            }
        }
        if (this.field3424 != null) {
            for (int var6 = 0; var6 < this.field3424.length; var6++) {
                var4.method2378(this.field3424[var6], this.field3438[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jt.e(II)Ldc;")
    public final class120 method4702(int arg0) {
        if (this.field3421 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3460[var3] && this.field3460[var3] != 0) {
                    var2 = this.field3421[var3];
                }
            }
            if (var2 != -1) {
                return method2359(var2).method4702(1);
            }
        }
        class120 var4 = (class120) field3429.method3681((long) this.field3432);
        if (var4 != null) {
            return var4;
        }
        class114 var5 = class114.method2364(Statics.field3455, this.field3433, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3464 != 128 || this.field3423 != 128 || this.field3469 != 128) {
            var5.method2388(this.field3464, this.field3423, this.field3469);
        }
        if (this.field3435 != null) {
            for (int var6 = 0; var6 < this.field3435.length; var6++) {
                var5.method2377(this.field3435[var6], this.field3436[var6]);
            }
        }
        if (this.field3424 != null) {
            for (int var7 = 0; var7 < this.field3424.length; var7++) {
                var5.method2378(this.field3424[var7], this.field3438[var7]);
            }
        }
        class120 var8 = var5.method2385(this.field3442 + 64, this.field3468 + 768, -50, -10, -50);
        var8.field1604 = true;
        field3429.method3675(var8, (long) this.field3432);
        return var8;
    }

    @ObfuscatedName("jt.p(II)Ljt;")
    public class270 method4703(int arg0) {
        if (this.field3421 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3460[var3] && this.field3460[var3] != 0) {
                    var2 = this.field3421[var3];
                }
            }
            if (var2 != -1) {
                return method2359(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("j.b(IIIIIZI)Lll;")
    public static final class319 method257(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class319 var8 = (class319) field3430.method3681(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class270 var9 = method2359(arg0);
        if (arg1 > 1 && var9.field3421 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3460[var11] && var9.field3460[var11] != 0) {
                    var10 = var9.field3421[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2359(var10);
            }
        }
        class120 var12 = var9.method4702(1);
        if (var12 == null) {
            return null;
        }
        class319 var13 = null;
        if (var9.field3466 != -1) {
            var13 = method257(var9.field3465, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3476 != -1) {
            var13 = method257(var9.field3474, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3478 != -1) {
            var13 = method257(var9.field3477, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3767;
        int var15 = Statics.field3762;
        int var16 = Statics.field3763;
        int[] var17 = new int[4];
        class315.method5290(var17);
        class319 var18 = new class319(36, 32);
        class315.method5286(var18.field3792, 36, 32);
        class315.method5292();
        class123.method2658();
        class123.method2623(16, 16);
        class123.field1671 = false;
        if (var9.field3478 != -1) {
            var13.method5411(0, 0);
        }
        int var19 = var9.field3439;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class123.field1682[var9.field3440] * var19 >> 16;
        int var21 = class123.field1694[var9.field3440] * var19 >> 16;
        var12.method2466();
        var12.method2478(0, var9.field3441, var9.field3475, var9.field3440, var9.field3443, var9.field3444 + var12.field1782 / 2 + var20, var9.field3444 + var21);
        if (var9.field3476 != -1) {
            var13.method5411(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5407(1);
        }
        if (arg2 >= 2) {
            var18.method5407(16777215);
        }
        if (arg3 != 0) {
            var18.method5408(arg3);
        }
        class315.method5286(var18.field3792, 36, 32);
        if (var9.field3466 != -1) {
            var13.method5411(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3445 == 1) {
            class299 var22 = Statics.field3467;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class238.field2956 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class238.field2826 + "</col>";
            }
            var22.method5097(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3430.method3675(var18, var6);
        }
        class315.method5286(var14, var15, var16);
        class315.method5291(var17);
        class123.method2658();
        class123.field1671 = true;
        return var18;
    }

    @ObfuscatedName("jt.n(ZI)Z")
    public final boolean method4704(boolean arg0) {
        int var2 = this.field3470;
        int var3 = this.field3452;
        int var4 = this.field3457;
        if (arg0) {
            var2 = this.field3454;
            var3 = this.field3472;
            var4 = this.field3458;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3455.method4318(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3455.method4318(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3455.method4318(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jt.f(ZB)Ldb;")
    public final class114 method4737(boolean arg0) {
        int var2 = this.field3470;
        int var3 = this.field3452;
        int var4 = this.field3457;
        if (arg0) {
            var2 = this.field3454;
            var3 = this.field3472;
            var4 = this.field3458;
        }
        if (var2 == -1) {
            return null;
        }
        class114 var5 = class114.method2364(Statics.field3455, var2, 0);
        if (var3 != -1) {
            class114 var6 = class114.method2364(Statics.field3455, var3, 0);
            if (var4 == -1) {
                class114[] var9 = new class114[] { var5, var6 };
                var5 = new class114(var9, 2);
            } else {
                class114 var7 = class114.method2364(Statics.field3455, var4, 0);
                class114[] var8 = new class114[] { var5, var6, var7 };
                var5 = new class114(var8, 3);
            }
        }
        if (!arg0 && this.field3453 != 0) {
            var5.method2376(0, this.field3453, 0);
        }
        if (arg0 && this.field3456 != 0) {
            var5.method2376(0, this.field3456, 0);
        }
        if (this.field3435 != null) {
            for (int var10 = 0; var10 < this.field3435.length; var10++) {
                var5.method2377(this.field3435[var10], this.field3436[var10]);
            }
        }
        if (this.field3424 != null) {
            for (int var11 = 0; var11 < this.field3424.length; var11++) {
                var5.method2378(this.field3424[var11], this.field3438[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jt.g(ZI)Z")
    public final boolean method4706(boolean arg0) {
        int var2 = this.field3451;
        int var3 = this.field3449;
        if (arg0) {
            var2 = this.field3461;
            var3 = this.field3428;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3455.method4318(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3455.method4318(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jt.m(ZI)Ldb;")
    public final class114 method4707(boolean arg0) {
        int var2 = this.field3451;
        int var3 = this.field3449;
        if (arg0) {
            var2 = this.field3461;
            var3 = this.field3428;
        }
        if (var2 == -1) {
            return null;
        }
        class114 var4 = class114.method2364(Statics.field3455, var2, 0);
        if (var3 != -1) {
            class114 var5 = class114.method2364(Statics.field3455, var3, 0);
            class114[] var6 = new class114[] { var4, var5 };
            var4 = new class114(var6, 2);
        }
        if (this.field3435 != null) {
            for (int var7 = 0; var7 < this.field3435.length; var7++) {
                var4.method2377(this.field3435[var7], this.field3436[var7]);
            }
        }
        if (this.field3424 != null) {
            for (int var8 = 0; var8 < this.field3424.length; var8++) {
                var4.method2378(this.field3424[var8], this.field3438[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jt.r(III)I")
    public int method4708(int arg0, int arg1) {
        return class263.method1561(this.field3473, arg0, arg1);
    }

    @ObfuscatedName("jt.t(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4730(int arg0, String arg1) {
        return class263.method172(this.field3473, arg0, arg1);
    }

    @ObfuscatedName("jt.o(I)I")
    public int method4710() {
        if (this.field3450 == -1 || this.field3426 == null) {
            return -1;
        } else if (this.field3450 >= 0) {
            return this.field3426[this.field3450] == null ? -1 : this.field3450;
        } else if (class238.field2947.equalsIgnoreCase(this.field3426[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bq.y(B)V")
    public static void method957() {
        field3462.method3676();
        field3429.method3676();
        field3430.method3676();
    }
}
