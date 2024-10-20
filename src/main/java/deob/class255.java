package deob;

@ObfuscatedName("it")
public class class255 extends class176 {

    @ObfuscatedName("it.i")
    public static class146 field3427 = new class146(64);

    @ObfuscatedName("it.c")
    public static class146 field3440 = new class146(50);

    @ObfuscatedName("it.b")
    public static class146 field3394 = new class146(200);

    @ObfuscatedName("it.a")
    public int field3395;

    @ObfuscatedName("it.e")
    public int field3438;

    @ObfuscatedName("it.w")
    public String field3387 = class225.field2755;

    @ObfuscatedName("it.t")
    public short[] field3412;

    @ObfuscatedName("it.g")
    public short[] field3399;

    @ObfuscatedName("it.x")
    public short[] field3400;

    @ObfuscatedName("it.h")
    public short[] field3401;

    @ObfuscatedName("it.s")
    public int field3402 = 2000;

    @ObfuscatedName("it.f")
    public int field3403 = 0;

    @ObfuscatedName("it.j")
    public int field3404 = 0;

    @ObfuscatedName("it.d")
    public int field3405 = 0;

    @ObfuscatedName("it.l")
    public int field3406 = 0;

    @ObfuscatedName("it.k")
    public int field3407 = 0;

    @ObfuscatedName("it.ac")
    public int field3434 = 0;

    @ObfuscatedName("it.az")
    public int field3409 = 1;

    @ObfuscatedName("it.aw")
    public boolean field3410 = false;

    @ObfuscatedName("it.aa")
    public String[] field3411 = new String[] { null, null, class225.field2740, null, null };

    @ObfuscatedName("it.ap")
    public String[] field3437 = new String[] { null, null, null, null, class225.field2741 };

    @ObfuscatedName("it.ab")
    public int field3389 = -2;

    @ObfuscatedName("it.ax")
    public int field3414 = -1;

    @ObfuscatedName("it.as")
    public int field3397 = -1;

    @ObfuscatedName("it.ao")
    public int field3416 = 0;

    @ObfuscatedName("it.al")
    public int field3428 = -1;

    @ObfuscatedName("it.ad")
    public int field3418 = -1;

    @ObfuscatedName("it.an")
    public int field3419 = 0;

    @ObfuscatedName("it.ai")
    public int field3420 = -1;

    @ObfuscatedName("it.ak")
    public int field3421 = -1;

    @ObfuscatedName("it.aq")
    public int field3391 = -1;

    @ObfuscatedName("it.am")
    public int field3423 = -1;

    @ObfuscatedName("it.ae")
    public int field3424 = -1;

    @ObfuscatedName("it.av")
    public int field3425 = -1;

    @ObfuscatedName("it.ah")
    public int[] field3426;

    @ObfuscatedName("it.ag")
    public int[] field3408;

    @ObfuscatedName("it.aj")
    public int field3429 = -1;

    @ObfuscatedName("it.ay")
    public int field3432 = -1;

    @ObfuscatedName("it.au")
    public int field3430 = 128;

    @ObfuscatedName("it.af")
    public int field3396 = 128;

    @ObfuscatedName("it.at")
    public int field3413 = 128;

    @ObfuscatedName("it.bx")
    public int field3398 = 0;

    @ObfuscatedName("it.bh")
    public int field3442 = 0;

    @ObfuscatedName("it.bd")
    public int field3435 = 0;

    @ObfuscatedName("it.bm")
    public class316 field3417;

    @ObfuscatedName("it.bv")
    public boolean field3415 = false;

    @ObfuscatedName("it.bj")
    public int field3392 = -1;

    @ObfuscatedName("it.bs")
    public int field3439 = -1;

    @ObfuscatedName("it.bz")
    public int field3433 = -1;

    @ObfuscatedName("it.bc")
    public int field3441 = -1;

    @ObfuscatedName("ax.z(Lhp;Lhp;ZLkn;I)V")
    public static void method522(class234 arg0, class234 arg1, boolean arg2, class295 arg3) {
        Statics.field3390 = arg0;
        Statics.field3436 = arg1;
        Statics.field1990 = arg2;
        Statics.field2030 = Statics.field3390.method3738(10);
        Statics.field1862 = arg3;
    }

    @ObfuscatedName("es.n(II)Lit;")
    public static class255 method2964(int arg0) {
        class255 var1 = (class255) field3427.method2992((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3390.method3726(10, arg0);
        class255 var3 = new class255();
        var3.field3395 = arg0;
        if (var2 != null) {
            var3.method4190(new class300(var2));
        }
        var3.method4191();
        if (var3.field3432 != -1) {
            var3.method4215(method2964(var3.field3432), method2964(var3.field3429));
        }
        if (var3.field3439 != -1) {
            var3.method4195(method2964(var3.field3439), method2964(var3.field3392));
        }
        if (var3.field3441 != -1) {
            var3.method4196(method2964(var3.field3441), method2964(var3.field3433));
        }
        if (!Statics.field1990 && var3.field3410) {
            var3.field3387 = class225.field2982;
            var3.field3415 = false;
            var3.field3411 = null;
            var3.field3437 = null;
            var3.field3389 = -1;
            var3.field3435 = 0;
            if (var3.field3417 != null) {
                boolean var4 = false;
                for (class181 var5 = var3.field3417.method5369(); var5 != null; var5 = var3.field3417.method5365()) {
                    class250 var6 = class250.method2965((int) var5.field2094);
                    if (var6.field3287) {
                        var5.method3249();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3417 = null;
                }
            }
        }
        field3427.method2994(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.v(B)V")
    public void method4191() {
    }

    @ObfuscatedName("it.u(Lkl;B)V")
    public void method4190(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method4242(arg0, var2);
        }
    }

    @ObfuscatedName("it.r(Lkl;IB)V")
    public void method4242(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3438 = arg0.method4992();
        } else if (arg1 == 2) {
            this.field3387 = arg0.method4999();
        } else if (arg1 == 4) {
            this.field3402 = arg0.method4992();
        } else if (arg1 == 5) {
            this.field3403 = arg0.method4992();
        } else if (arg1 == 6) {
            this.field3404 = arg0.method4992();
        } else if (arg1 == 7) {
            this.field3406 = arg0.method4992();
            if (this.field3406 > 32767) {
                this.field3406 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3407 = arg0.method4992();
            if (this.field3407 > 32767) {
                this.field3407 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3434 = 1;
        } else if (arg1 == 12) {
            this.field3409 = arg0.method5085();
        } else if (arg1 == 16) {
            this.field3410 = true;
        } else if (arg1 == 23) {
            this.field3414 = arg0.method4992();
            this.field3416 = arg0.method4990();
        } else if (arg1 == 24) {
            this.field3397 = arg0.method4992();
        } else if (arg1 == 25) {
            this.field3428 = arg0.method4992();
            this.field3419 = arg0.method4990();
        } else if (arg1 == 26) {
            this.field3418 = arg0.method4992();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3411[arg1 - 30] = arg0.method4999();
            if (this.field3411[arg1 - 30].equalsIgnoreCase(class225.field2782)) {
                this.field3411[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3437[arg1 - 35] = arg0.method4999();
        } else if (arg1 == 40) {
            int var3 = arg0.method4990();
            this.field3412 = new short[var3];
            this.field3399 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3412[var4] = (short) arg0.method4992();
                this.field3399[var4] = (short) arg0.method4992();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method4990();
            this.field3400 = new short[var5];
            this.field3401 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3400[var6] = (short) arg0.method4992();
                this.field3401[var6] = (short) arg0.method4992();
            }
        } else if (arg1 == 42) {
            this.field3389 = arg0.method5002();
        } else if (arg1 == 65) {
            this.field3415 = true;
        } else if (arg1 == 78) {
            this.field3420 = arg0.method4992();
        } else if (arg1 == 79) {
            this.field3421 = arg0.method4992();
        } else if (arg1 == 90) {
            this.field3391 = arg0.method4992();
        } else if (arg1 == 91) {
            this.field3424 = arg0.method4992();
        } else if (arg1 == 92) {
            this.field3423 = arg0.method4992();
        } else if (arg1 == 93) {
            this.field3425 = arg0.method4992();
        } else if (arg1 == 95) {
            this.field3405 = arg0.method4992();
        } else if (arg1 == 97) {
            this.field3429 = arg0.method4992();
        } else if (arg1 == 98) {
            this.field3432 = arg0.method4992();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3426 == null) {
                this.field3426 = new int[10];
                this.field3408 = new int[10];
            }
            this.field3426[arg1 - 100] = arg0.method4992();
            this.field3408[arg1 - 100] = arg0.method4992();
        } else if (arg1 == 110) {
            this.field3430 = arg0.method4992();
        } else if (arg1 == 111) {
            this.field3396 = arg0.method4992();
        } else if (arg1 == 112) {
            this.field3413 = arg0.method4992();
        } else if (arg1 == 113) {
            this.field3398 = arg0.method5002();
        } else if (arg1 == 114) {
            this.field3442 = arg0.method5002();
        } else if (arg1 == 115) {
            this.field3435 = arg0.method4990();
        } else if (arg1 == 139) {
            this.field3392 = arg0.method4992();
        } else if (arg1 == 140) {
            this.field3439 = arg0.method4992();
        } else if (arg1 == 148) {
            this.field3433 = arg0.method4992();
        } else if (arg1 == 149) {
            this.field3441 = arg0.method4992();
        } else if (arg1 == 249) {
            this.field3417 = class248.method3085(arg0, this.field3417);
        }
    }

    @ObfuscatedName("it.p(Lit;Lit;B)V")
    public void method4215(class255 arg0, class255 arg1) {
        this.field3438 = arg0.field3438;
        this.field3402 = arg0.field3402;
        this.field3403 = arg0.field3403;
        this.field3404 = arg0.field3404;
        this.field3405 = arg0.field3405;
        this.field3406 = arg0.field3406;
        this.field3407 = arg0.field3407;
        this.field3412 = arg0.field3412;
        this.field3399 = arg0.field3399;
        this.field3400 = arg0.field3400;
        this.field3401 = arg0.field3401;
        this.field3387 = arg1.field3387;
        this.field3410 = arg1.field3410;
        this.field3409 = arg1.field3409;
        this.field3434 = 1;
    }

    @ObfuscatedName("it.q(Lit;Lit;S)V")
    public void method4195(class255 arg0, class255 arg1) {
        this.field3438 = arg0.field3438;
        this.field3402 = arg0.field3402;
        this.field3403 = arg0.field3403;
        this.field3404 = arg0.field3404;
        this.field3405 = arg0.field3405;
        this.field3406 = arg0.field3406;
        this.field3407 = arg0.field3407;
        this.field3412 = arg1.field3412;
        this.field3399 = arg1.field3399;
        this.field3400 = arg1.field3400;
        this.field3401 = arg1.field3401;
        this.field3387 = arg1.field3387;
        this.field3410 = arg1.field3410;
        this.field3434 = arg1.field3434;
        this.field3414 = arg1.field3414;
        this.field3397 = arg1.field3397;
        this.field3420 = arg1.field3420;
        this.field3428 = arg1.field3428;
        this.field3418 = arg1.field3418;
        this.field3421 = arg1.field3421;
        this.field3391 = arg1.field3391;
        this.field3423 = arg1.field3423;
        this.field3424 = arg1.field3424;
        this.field3425 = arg1.field3425;
        this.field3435 = arg1.field3435;
        this.field3411 = arg1.field3411;
        this.field3437 = new String[5];
        if (arg1.field3437 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3437[var3] = arg1.field3437[var3];
            }
        }
        this.field3437[4] = class225.field2837;
        this.field3409 = 0;
    }

    @ObfuscatedName("it.m(Lit;Lit;I)V")
    public void method4196(class255 arg0, class255 arg1) {
        this.field3438 = arg0.field3438;
        this.field3402 = arg0.field3402;
        this.field3403 = arg0.field3403;
        this.field3404 = arg0.field3404;
        this.field3405 = arg0.field3405;
        this.field3406 = arg0.field3406;
        this.field3407 = arg0.field3407;
        this.field3412 = arg0.field3412;
        this.field3399 = arg0.field3399;
        this.field3400 = arg0.field3400;
        this.field3401 = arg0.field3401;
        this.field3434 = arg0.field3434;
        this.field3387 = arg1.field3387;
        this.field3409 = 0;
        this.field3410 = false;
        this.field3415 = false;
    }

    @ObfuscatedName("it.y(IB)Ldw;")
    public final class122 method4197(int arg0) {
        if (this.field3426 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3408[var3] && this.field3408[var3] != 0) {
                    var2 = this.field3426[var3];
                }
            }
            if (var2 != -1) {
                return method2964(var2).method4197(1);
            }
        }
        class122 var4 = class122.method2560(Statics.field3436, this.field3438, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3430 != 128 || this.field3396 != 128 || this.field3413 != 128) {
            var4.method2510(this.field3430, this.field3396, this.field3413);
        }
        if (this.field3412 != null) {
            for (int var5 = 0; var5 < this.field3412.length; var5++) {
                var4.method2507(this.field3412[var5], this.field3399[var5]);
            }
        }
        if (this.field3400 != null) {
            for (int var6 = 0; var6 < this.field3400.length; var6++) {
                var4.method2568(this.field3400[var6], this.field3401[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("it.i(II)Ldh;")
    public final class128 method4238(int arg0) {
        if (this.field3426 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3408[var3] && this.field3408[var3] != 0) {
                    var2 = this.field3426[var3];
                }
            }
            if (var2 != -1) {
                return method2964(var2).method4238(1);
            }
        }
        class128 var4 = (class128) field3440.method2992((long) this.field3395);
        if (var4 != null) {
            return var4;
        }
        class122 var5 = class122.method2560(Statics.field3436, this.field3438, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3430 != 128 || this.field3396 != 128 || this.field3413 != 128) {
            var5.method2510(this.field3430, this.field3396, this.field3413);
        }
        if (this.field3412 != null) {
            for (int var6 = 0; var6 < this.field3412.length; var6++) {
                var5.method2507(this.field3412[var6], this.field3399[var6]);
            }
        }
        if (this.field3400 != null) {
            for (int var7 = 0; var7 < this.field3400.length; var7++) {
                var5.method2568(this.field3400[var7], this.field3401[var7]);
            }
        }
        class128 var8 = var5.method2515(this.field3398 + 64, this.field3442 * 5 + 768, -50, -10, -50);
        var8.field1697 = true;
        field3440.method2994(var8, (long) this.field3395);
        return var8;
    }

    @ObfuscatedName("it.c(IB)Lit;")
    public class255 method4222(int arg0) {
        if (this.field3426 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3408[var3] && this.field3408[var3] != 0) {
                    var2 = this.field3426[var3];
                }
            }
            if (var2 != -1) {
                return method2964(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("p.b(IIIIIZI)Llf;")
    public static final class325 method58(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class325 var8 = (class325) field3394.method2992(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class255 var9 = method2964(arg0);
        if (arg1 > 1 && var9.field3426 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3408[var11] && var9.field3408[var11] != 0) {
                    var10 = var9.field3426[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2964(var10);
            }
        }
        class128 var12 = var9.method4238(1);
        if (var12 == null) {
            return null;
        }
        class325 var13 = null;
        if (var9.field3432 != -1) {
            var13 = method58(var9.field3429, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3439 != -1) {
            var13 = method58(var9.field3392, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3441 != -1) {
            var13 = method58(var9.field3433, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3850;
        int var15 = Statics.field3846;
        int var16 = Statics.field3845;
        int[] var17 = new int[4];
        class321.method5440(var17);
        class325 var18 = new class325(36, 32);
        class321.method5437(var18.field3875, 36, 32);
        class321.method5442();
        class131.method2699();
        class131.method2727(16, 16);
        class131.field1755 = false;
        if (var9.field3441 != -1) {
            var13.method5605(0, 0);
        }
        int var19 = var9.field3402;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class131.field1747[var9.field3403] * var19 >> 16;
        int var21 = class131.field1730[var9.field3403] * var19 >> 16;
        var12.method2592();
        var12.method2605(0, var9.field3404, var9.field3405, var9.field3403, var9.field3406, var9.field3407 + var12.field1843 / 2 + var20, var9.field3407 + var21);
        if (var9.field3439 != -1) {
            var13.method5605(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5550(1);
        }
        if (arg2 >= 2) {
            var18.method5550(16777215);
        }
        if (arg3 != 0) {
            var18.method5551(arg3);
        }
        class321.method5437(var18.field3875, 36, 32);
        if (var9.field3432 != -1) {
            var13.method5605(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3434 == 1) {
            Statics.field1862.method4852(method683(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3394.method2994(var18, var6);
        }
        class321.method5437(var14, var15, var16);
        class321.method5457(var17);
        class131.method2699();
        class131.field1755 = true;
        return var18;
    }

    @ObfuscatedName("ae.o(II)Ljava/lang/String;")
    public static final String method683(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class225.field2907 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class225.field2905 + "</col>";
        }
    }

    @ObfuscatedName("it.a(ZI)Z")
    public final boolean method4200(boolean arg0) {
        int var2 = this.field3414;
        int var3 = this.field3397;
        int var4 = this.field3420;
        if (arg0) {
            var2 = this.field3428;
            var3 = this.field3418;
            var4 = this.field3421;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3436.method3730(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3436.method3730(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3436.method3730(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("it.e(ZB)Ldw;")
    public final class122 method4201(boolean arg0) {
        int var2 = this.field3414;
        int var3 = this.field3397;
        int var4 = this.field3420;
        if (arg0) {
            var2 = this.field3428;
            var3 = this.field3418;
            var4 = this.field3421;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var5 = class122.method2560(Statics.field3436, var2, 0);
        if (var3 != -1) {
            class122 var6 = class122.method2560(Statics.field3436, var3, 0);
            if (var4 == -1) {
                class122[] var9 = new class122[] { var5, var6 };
                var5 = new class122(var9, 2);
            } else {
                class122 var7 = class122.method2560(Statics.field3436, var4, 0);
                class122[] var8 = new class122[] { var5, var6, var7 };
                var5 = new class122(var8, 3);
            }
        }
        if (!arg0 && this.field3416 != 0) {
            var5.method2521(0, this.field3416, 0);
        }
        if (arg0 && this.field3419 != 0) {
            var5.method2521(0, this.field3419, 0);
        }
        if (this.field3412 != null) {
            for (int var10 = 0; var10 < this.field3412.length; var10++) {
                var5.method2507(this.field3412[var10], this.field3399[var10]);
            }
        }
        if (this.field3400 != null) {
            for (int var11 = 0; var11 < this.field3400.length; var11++) {
                var5.method2568(this.field3400[var11], this.field3401[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("it.x(ZB)Z")
    public final boolean method4219(boolean arg0) {
        int var2 = this.field3391;
        int var3 = this.field3423;
        if (arg0) {
            var2 = this.field3424;
            var3 = this.field3425;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3436.method3730(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3436.method3730(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("it.h(ZI)Ldw;")
    public final class122 method4203(boolean arg0) {
        int var2 = this.field3391;
        int var3 = this.field3423;
        if (arg0) {
            var2 = this.field3424;
            var3 = this.field3425;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var4 = class122.method2560(Statics.field3436, var2, 0);
        if (var3 != -1) {
            class122 var5 = class122.method2560(Statics.field3436, var3, 0);
            class122[] var6 = new class122[] { var4, var5 };
            var4 = new class122(var6, 2);
        }
        if (this.field3412 != null) {
            for (int var7 = 0; var7 < this.field3412.length; var7++) {
                var4.method2507(this.field3412[var7], this.field3399[var7]);
            }
        }
        if (this.field3400 != null) {
            for (int var8 = 0; var8 < this.field3400.length; var8++) {
                var4.method2568(this.field3400[var8], this.field3401[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("it.s(IIB)I")
    public int method4204(int arg0, int arg1) {
        return Statics.method1847(this.field3417, arg0, arg1);
    }

    @ObfuscatedName("it.f(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4205(int arg0, String arg1) {
        return class248.method2060(this.field3417, arg0, arg1);
    }

    @ObfuscatedName("it.j(I)I")
    public int method4206() {
        if (this.field3389 == -1 || this.field3437 == null) {
            return -1;
        } else if (this.field3389 >= 0) {
            return this.field3437[this.field3389] == null ? -1 : this.field3389;
        } else if (class225.field2741.equalsIgnoreCase(this.field3437[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bk.d(I)V")
    public static void method1037() {
        field3427.method2995();
        field3440.method2995();
        field3394.method2995();
    }

    @ObfuscatedName("n.l(ZB)V")
    public static void method12(boolean arg0) {
        if (Statics.field1990 != arg0) {
            method1037();
            Statics.field1990 = arg0;
        }
    }
}
