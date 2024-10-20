package deob;

@ObfuscatedName("jx")
public class class265 extends class185 {

    @ObfuscatedName("jx.e")
    public static class155 field3396 = new class155(64);

    @ObfuscatedName("jx.s")
    public static class155 field3402 = new class155(50);

    @ObfuscatedName("jx.p")
    public static class155 field3417 = new class155(200);

    @ObfuscatedName("jx.u")
    public int field3404;

    @ObfuscatedName("jx.h")
    public int field3405;

    @ObfuscatedName("jx.g")
    public String field3398 = class234.field2765;

    @ObfuscatedName("jx.i")
    public short[] field3407;

    @ObfuscatedName("jx.a")
    public short[] field3408;

    @ObfuscatedName("jx.b")
    public short[] field3439;

    @ObfuscatedName("jx.l")
    public short[] field3416;

    @ObfuscatedName("jx.r")
    public int field3411 = 2000;

    @ObfuscatedName("jx.o")
    public int field3412 = 0;

    @ObfuscatedName("jx.c")
    public int field3430 = 0;

    @ObfuscatedName("jx.j")
    public int field3414 = 0;

    @ObfuscatedName("jx.y")
    public int field3415 = 0;

    @ObfuscatedName("jx.f")
    public int field3446 = 0;

    @ObfuscatedName("jx.ae")
    public int field3419 = 0;

    @ObfuscatedName("jx.an")
    public int field3418 = 1;

    @ObfuscatedName("jx.ai")
    public boolean field3413 = false;

    @ObfuscatedName("jx.ap")
    public String[] field3420 = new String[] { null, null, class234.field3061, null, null };

    @ObfuscatedName("jx.ab")
    public String[] field3421 = new String[] { null, null, null, null, class234.field2929 };

    @ObfuscatedName("jx.af")
    public int field3425 = -2;

    @ObfuscatedName("jx.at")
    public int field3424 = -1;

    @ObfuscatedName("jx.al")
    public int field3403 = -1;

    @ObfuscatedName("jx.as")
    public int field3426 = 0;

    @ObfuscatedName("jx.am")
    public int field3427 = -1;

    @ObfuscatedName("jx.au")
    public int field3406 = -1;

    @ObfuscatedName("jx.ao")
    public int field3429 = 0;

    @ObfuscatedName("jx.aq")
    public int field3442 = -1;

    @ObfuscatedName("jx.av")
    public int field3431 = -1;

    @ObfuscatedName("jx.ak")
    public int field3432 = -1;

    @ObfuscatedName("jx.aa")
    public int field3423 = -1;

    @ObfuscatedName("jx.ax")
    public int field3434 = -1;

    @ObfuscatedName("jx.az")
    public int field3435 = -1;

    @ObfuscatedName("jx.aj")
    public int[] field3436;

    @ObfuscatedName("jx.ay")
    public int[] field3437;

    @ObfuscatedName("jx.ad")
    public int field3438 = -1;

    @ObfuscatedName("jx.ac")
    public int field3441 = -1;

    @ObfuscatedName("jx.ah")
    public int field3440 = 128;

    @ObfuscatedName("jx.ag")
    public int field3433 = 128;

    @ObfuscatedName("jx.aw")
    public int field3449 = 128;

    @ObfuscatedName("jx.bf")
    public int field3443 = 0;

    @ObfuscatedName("jx.bc")
    public int field3444 = 0;

    @ObfuscatedName("jx.bo")
    public int field3445 = 0;

    @ObfuscatedName("jx.bd")
    public class326 field3428;

    @ObfuscatedName("jx.bk")
    public boolean field3447 = false;

    @ObfuscatedName("jx.bu")
    public int field3448 = -1;

    @ObfuscatedName("jx.be")
    public int field3401 = -1;

    @ObfuscatedName("jx.bg")
    public int field3450 = -1;

    @ObfuscatedName("jx.bt")
    public int field3451 = -1;

    @ObfuscatedName("ab.x(IB)Ljx;")
    public static class265 method337(int arg0) {
        class265 var1 = (class265) field3396.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3803.method3869(10, arg0);
        class265 var3 = new class265();
        var3.field3404 = arg0;
        if (var2 != null) {
            var3.method4335(new class310(var2));
        }
        var3.method4374();
        if (var3.field3441 != -1) {
            var3.method4371(method337(var3.field3441), method337(var3.field3438));
        }
        if (var3.field3401 != -1) {
            var3.method4325(method337(var3.field3401), method337(var3.field3448));
        }
        if (var3.field3451 != -1) {
            var3.method4326(method337(var3.field3451), method337(var3.field3450));
        }
        if (!Statics.field2011 && var3.field3413) {
            var3.field3398 = class234.field3019;
            var3.field3447 = false;
            var3.field3420 = null;
            var3.field3421 = null;
            var3.field3425 = -1;
            var3.field3445 = 0;
            if (var3.field3428 != null) {
                boolean var4 = false;
                for (class190 var5 = var3.field3428.method5529(); var5 != null; var5 = var3.field3428.method5517()) {
                    class260 var6 = class260.method4738((int) var5.field2117);
                    if (var6.field3301) {
                        var5.method3355();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3428 = null;
                }
            }
        }
        field3396.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.m(I)V")
    public void method4374() {
    }

    @ObfuscatedName("jx.k(Lkb;I)V")
    public void method4335(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4323(arg0, var2);
        }
    }

    @ObfuscatedName("jx.d(Lkb;II)V")
    public void method4323(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3405 = arg0.method5139();
        } else if (arg1 == 2) {
            this.field3398 = arg0.method5257();
        } else if (arg1 == 4) {
            this.field3411 = arg0.method5139();
        } else if (arg1 == 5) {
            this.field3412 = arg0.method5139();
        } else if (arg1 == 6) {
            this.field3430 = arg0.method5139();
        } else if (arg1 == 7) {
            this.field3415 = arg0.method5139();
            if (this.field3415 > 32767) {
                this.field3415 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3446 = arg0.method5139();
            if (this.field3446 > 32767) {
                this.field3446 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3419 = 1;
        } else if (arg1 == 12) {
            this.field3418 = arg0.method5142();
        } else if (arg1 == 16) {
            this.field3413 = true;
        } else if (arg1 == 23) {
            this.field3424 = arg0.method5139();
            this.field3426 = arg0.method5137();
        } else if (arg1 == 24) {
            this.field3403 = arg0.method5139();
        } else if (arg1 == 25) {
            this.field3427 = arg0.method5139();
            this.field3429 = arg0.method5137();
        } else if (arg1 == 26) {
            this.field3406 = arg0.method5139();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3420[arg1 - 30] = arg0.method5257();
            if (this.field3420[arg1 - 30].equalsIgnoreCase(class234.field2908)) {
                this.field3420[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3421[arg1 - 35] = arg0.method5257();
        } else if (arg1 == 40) {
            int var3 = arg0.method5137();
            this.field3407 = new short[var3];
            this.field3408 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3407[var4] = (short) arg0.method5139();
                this.field3408[var4] = (short) arg0.method5139();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5137();
            this.field3439 = new short[var5];
            this.field3416 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3439[var6] = (short) arg0.method5139();
                this.field3416[var6] = (short) arg0.method5139();
            }
        } else if (arg1 == 42) {
            this.field3425 = arg0.method5138();
        } else if (arg1 == 65) {
            this.field3447 = true;
        } else if (arg1 == 78) {
            this.field3442 = arg0.method5139();
        } else if (arg1 == 79) {
            this.field3431 = arg0.method5139();
        } else if (arg1 == 90) {
            this.field3432 = arg0.method5139();
        } else if (arg1 == 91) {
            this.field3434 = arg0.method5139();
        } else if (arg1 == 92) {
            this.field3423 = arg0.method5139();
        } else if (arg1 == 93) {
            this.field3435 = arg0.method5139();
        } else if (arg1 == 95) {
            this.field3414 = arg0.method5139();
        } else if (arg1 == 97) {
            this.field3438 = arg0.method5139();
        } else if (arg1 == 98) {
            this.field3441 = arg0.method5139();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3436 == null) {
                this.field3436 = new int[10];
                this.field3437 = new int[10];
            }
            this.field3436[arg1 - 100] = arg0.method5139();
            this.field3437[arg1 - 100] = arg0.method5139();
        } else if (arg1 == 110) {
            this.field3440 = arg0.method5139();
        } else if (arg1 == 111) {
            this.field3433 = arg0.method5139();
        } else if (arg1 == 112) {
            this.field3449 = arg0.method5139();
        } else if (arg1 == 113) {
            this.field3443 = arg0.method5138();
        } else if (arg1 == 114) {
            this.field3444 = arg0.method5138() * 5;
        } else if (arg1 == 115) {
            this.field3445 = arg0.method5137();
        } else if (arg1 == 139) {
            this.field3448 = arg0.method5139();
        } else if (arg1 == 140) {
            this.field3401 = arg0.method5139();
        } else if (arg1 == 148) {
            this.field3450 = arg0.method5139();
        } else if (arg1 == 149) {
            this.field3451 = arg0.method5139();
        } else if (arg1 == 249) {
            this.field3428 = Statics.method4011(arg0, this.field3428);
        }
    }

    @ObfuscatedName("jx.w(Ljx;Ljx;B)V")
    public void method4371(class265 arg0, class265 arg1) {
        this.field3405 = arg0.field3405;
        this.field3411 = arg0.field3411;
        this.field3412 = arg0.field3412;
        this.field3430 = arg0.field3430;
        this.field3414 = arg0.field3414;
        this.field3415 = arg0.field3415;
        this.field3446 = arg0.field3446;
        this.field3407 = arg0.field3407;
        this.field3408 = arg0.field3408;
        this.field3439 = arg0.field3439;
        this.field3416 = arg0.field3416;
        this.field3398 = arg1.field3398;
        this.field3413 = arg1.field3413;
        this.field3418 = arg1.field3418;
        this.field3419 = 1;
    }

    @ObfuscatedName("jx.v(Ljx;Ljx;I)V")
    public void method4325(class265 arg0, class265 arg1) {
        this.field3405 = arg0.field3405;
        this.field3411 = arg0.field3411;
        this.field3412 = arg0.field3412;
        this.field3430 = arg0.field3430;
        this.field3414 = arg0.field3414;
        this.field3415 = arg0.field3415;
        this.field3446 = arg0.field3446;
        this.field3407 = arg1.field3407;
        this.field3408 = arg1.field3408;
        this.field3439 = arg1.field3439;
        this.field3416 = arg1.field3416;
        this.field3398 = arg1.field3398;
        this.field3413 = arg1.field3413;
        this.field3419 = arg1.field3419;
        this.field3424 = arg1.field3424;
        this.field3403 = arg1.field3403;
        this.field3442 = arg1.field3442;
        this.field3427 = arg1.field3427;
        this.field3406 = arg1.field3406;
        this.field3431 = arg1.field3431;
        this.field3432 = arg1.field3432;
        this.field3423 = arg1.field3423;
        this.field3434 = arg1.field3434;
        this.field3435 = arg1.field3435;
        this.field3445 = arg1.field3445;
        this.field3420 = arg1.field3420;
        this.field3421 = new String[5];
        if (arg1.field3421 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3421[var3] = arg1.field3421[var3];
            }
        }
        this.field3421[4] = class234.field2775;
        this.field3418 = 0;
    }

    @ObfuscatedName("jx.q(Ljx;Ljx;I)V")
    public void method4326(class265 arg0, class265 arg1) {
        this.field3405 = arg0.field3405;
        this.field3411 = arg0.field3411;
        this.field3412 = arg0.field3412;
        this.field3430 = arg0.field3430;
        this.field3414 = arg0.field3414;
        this.field3415 = arg0.field3415;
        this.field3446 = arg0.field3446;
        this.field3407 = arg0.field3407;
        this.field3408 = arg0.field3408;
        this.field3439 = arg0.field3439;
        this.field3416 = arg0.field3416;
        this.field3419 = arg0.field3419;
        this.field3398 = arg1.field3398;
        this.field3418 = 0;
        this.field3413 = false;
        this.field3447 = false;
    }

    @ObfuscatedName("jx.z(II)Lea;")
    public final class131 method4327(int arg0) {
        if (this.field3436 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3437[var3] && this.field3437[var3] != 0) {
                    var2 = this.field3436[var3];
                }
            }
            if (var2 != -1) {
                return method337(var2).method4327(1);
            }
        }
        class131 var4 = class131.method2615(Statics.field95, this.field3405, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3440 != 128 || this.field3433 != 128 || this.field3449 != 128) {
            var4.method2632(this.field3440, this.field3433, this.field3449);
        }
        if (this.field3407 != null) {
            for (int var5 = 0; var5 < this.field3407.length; var5++) {
                var4.method2629(this.field3407[var5], this.field3408[var5]);
            }
        }
        if (this.field3439 != null) {
            for (int var6 = 0; var6 < this.field3439.length; var6++) {
                var4.method2681(this.field3439[var6], this.field3416[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jx.t(IB)Lel;")
    public final class137 method4328(int arg0) {
        if (this.field3436 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3437[var3] && this.field3437[var3] != 0) {
                    var2 = this.field3436[var3];
                }
            }
            if (var2 != -1) {
                return method337(var2).method4328(1);
            }
        }
        class137 var4 = (class137) field3402.method3146((long) this.field3404);
        if (var4 != null) {
            return var4;
        }
        class131 var5 = class131.method2615(Statics.field95, this.field3405, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3440 != 128 || this.field3433 != 128 || this.field3449 != 128) {
            var5.method2632(this.field3440, this.field3433, this.field3449);
        }
        if (this.field3407 != null) {
            for (int var6 = 0; var6 < this.field3407.length; var6++) {
                var5.method2629(this.field3407[var6], this.field3408[var6]);
            }
        }
        if (this.field3439 != null) {
            for (int var7 = 0; var7 < this.field3439.length; var7++) {
                var5.method2681(this.field3439[var7], this.field3416[var7]);
            }
        }
        class137 var8 = var5.method2636(this.field3443 + 64, this.field3444 + 768, -50, -10, -50);
        var8.field1717 = true;
        field3402.method3152(var8, (long) this.field3404);
        return var8;
    }

    @ObfuscatedName("jx.e(II)Ljx;")
    public class265 method4321(int arg0) {
        if (this.field3436 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3437[var3] && this.field3437[var3] != 0) {
                    var2 = this.field3436[var3];
                }
            }
            if (var2 != -1) {
                return method337(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ca.s(IIIIIZI)Lla;")
    public static final class335 method2026(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class335 var8 = (class335) field3417.method3146(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class265 var9 = method337(arg0);
        if (arg1 > 1 && var9.field3436 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3437[var11] && var9.field3437[var11] != 0) {
                    var10 = var9.field3436[var11];
                }
            }
            if (var10 != -1) {
                var9 = method337(var10);
            }
        }
        class137 var12 = var9.method4328(1);
        if (var12 == null) {
            return null;
        }
        class335 var13 = null;
        if (var9.field3441 != -1) {
            var13 = method2026(var9.field3438, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3401 != -1) {
            var13 = method2026(var9.field3448, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3451 != -1) {
            var13 = method2026(var9.field3450, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3865;
        int var15 = Statics.field3866;
        int var16 = Statics.field3864;
        int[] var17 = new int[4];
        class331.method5601(var17);
        class335 var18 = new class335(36, 32);
        class331.method5597(var18.field3897, 36, 32);
        class331.method5603();
        class140.method2883();
        class140.method2835(16, 16);
        class140.field1773 = false;
        if (var9.field3451 != -1) {
            var13.method5731(0, 0);
        }
        int var19 = var9.field3411;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class140.field1795[var9.field3412] * var19 >> 16;
        int var21 = class140.field1796[var9.field3412] * var19 >> 16;
        var12.method2705();
        var12.method2718(0, var9.field3430, var9.field3414, var9.field3412, var9.field3415, var9.field3446 + var12.field1884 / 2 + var20, var9.field3446 + var21);
        if (var9.field3401 != -1) {
            var13.method5731(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5813(1);
        }
        if (arg2 >= 2) {
            var18.method5813(16777215);
        }
        if (arg3 != 0) {
            var18.method5728(arg3);
        }
        class331.method5597(var18.field3897, 36, 32);
        if (var9.field3441 != -1) {
            var13.method5731(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3419 == 1) {
            Statics.field404.method4987(method1229(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3417.method3152(var18, var6);
        }
        class331.method5597(var14, var15, var16);
        class331.method5602(var17);
        class140.method2883();
        class140.field1773 = true;
        return var18;
    }

    @ObfuscatedName("bl.p(IB)Ljava/lang/String;")
    public static final String method1229(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class234.field2925 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class234.field2923 + "</col>";
        }
    }

    @ObfuscatedName("jx.n(ZI)Z")
    public final boolean method4329(boolean arg0) {
        int var2 = this.field3424;
        int var3 = this.field3403;
        int var4 = this.field3442;
        if (arg0) {
            var2 = this.field3427;
            var3 = this.field3406;
            var4 = this.field3431;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field95.method3883(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field95.method3883(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field95.method3883(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jx.u(ZI)Lea;")
    public final class131 method4330(boolean arg0) {
        int var2 = this.field3424;
        int var3 = this.field3403;
        int var4 = this.field3442;
        if (arg0) {
            var2 = this.field3427;
            var3 = this.field3406;
            var4 = this.field3431;
        }
        if (var2 == -1) {
            return null;
        }
        class131 var5 = class131.method2615(Statics.field95, var2, 0);
        if (var3 != -1) {
            class131 var6 = class131.method2615(Statics.field95, var3, 0);
            if (var4 == -1) {
                class131[] var9 = new class131[] { var5, var6 };
                var5 = new class131(var9, 2);
            } else {
                class131 var7 = class131.method2615(Statics.field95, var4, 0);
                class131[] var8 = new class131[] { var5, var6, var7 };
                var5 = new class131(var8, 3);
            }
        }
        if (!arg0 && this.field3426 != 0) {
            var5.method2628(0, this.field3426, 0);
        }
        if (arg0 && this.field3429 != 0) {
            var5.method2628(0, this.field3429, 0);
        }
        if (this.field3407 != null) {
            for (int var10 = 0; var10 < this.field3407.length; var10++) {
                var5.method2629(this.field3407[var10], this.field3408[var10]);
            }
        }
        if (this.field3439 != null) {
            for (int var11 = 0; var11 < this.field3439.length; var11++) {
                var5.method2681(this.field3439[var11], this.field3416[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jx.h(ZI)Z")
    public final boolean method4380(boolean arg0) {
        int var2 = this.field3432;
        int var3 = this.field3423;
        if (arg0) {
            var2 = this.field3434;
            var3 = this.field3435;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field95.method3883(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field95.method3883(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jx.g(ZI)Lea;")
    public final class131 method4332(boolean arg0) {
        int var2 = this.field3432;
        int var3 = this.field3423;
        if (arg0) {
            var2 = this.field3434;
            var3 = this.field3435;
        }
        if (var2 == -1) {
            return null;
        }
        class131 var4 = class131.method2615(Statics.field95, var2, 0);
        if (var3 != -1) {
            class131 var5 = class131.method2615(Statics.field95, var3, 0);
            class131[] var6 = new class131[] { var4, var5 };
            var4 = new class131(var6, 2);
        }
        if (this.field3407 != null) {
            for (int var7 = 0; var7 < this.field3407.length; var7++) {
                var4.method2629(this.field3407[var7], this.field3408[var7]);
            }
        }
        if (this.field3439 != null) {
            for (int var8 = 0; var8 < this.field3439.length; var8++) {
                var4.method2681(this.field3439[var8], this.field3416[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jx.i(III)I")
    public int method4336(int arg0, int arg1) {
        class326 var3 = this.field3428;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5519((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2115;
            }
        }
        return var4;
    }

    @ObfuscatedName("jx.a(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4334(int arg0, String arg1) {
        return Statics.method95(this.field3428, arg0, arg1);
    }

    @ObfuscatedName("jx.o(I)I")
    public int method4349() {
        if (this.field3425 == -1 || this.field3421 == null) {
            return -1;
        } else if (this.field3425 >= 0) {
            return this.field3421[this.field3425] == null ? -1 : this.field3425;
        } else if (class234.field2929.equalsIgnoreCase(this.field3421[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("il.c(B)V")
    public static void method4166() {
        field3396.method3141();
        field3402.method3141();
        field3417.method3141();
    }

    @ObfuscatedName("bz.f(ZB)V")
    public static void method1098(boolean arg0) {
        if (Statics.field2011 != arg0) {
            method4166();
            Statics.field2011 = arg0;
        }
    }
}
