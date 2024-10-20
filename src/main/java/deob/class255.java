package deob;

@ObfuscatedName("iu")
public class class255 extends class176 {

    @ObfuscatedName("iu.i")
    public static class146 field3418 = new class146(64);

    @ObfuscatedName("iu.k")
    public static class146 field3408 = new class146(50);

    @ObfuscatedName("iu.x")
    public static class146 field3409 = new class146(200);

    @ObfuscatedName("iu.e")
    public int field3436;

    @ObfuscatedName("iu.n")
    public int field3432;

    @ObfuscatedName("iu.r")
    public String field3450 = class225.field2777;

    @ObfuscatedName("iu.c")
    public short[] field3413;

    @ObfuscatedName("iu.a")
    public short[] field3414;

    @ObfuscatedName("iu.d")
    public short[] field3411;

    @ObfuscatedName("iu.s")
    public short[] field3405;

    @ObfuscatedName("iu.t")
    public int field3447 = 2000;

    @ObfuscatedName("iu.m")
    public int field3412 = 0;

    @ObfuscatedName("iu.v")
    public int field3419 = 0;

    @ObfuscatedName("iu.q")
    public int field3420 = 0;

    @ObfuscatedName("iu.l")
    public int field3421 = 0;

    @ObfuscatedName("iu.j")
    public int field3422 = 0;

    @ObfuscatedName("iu.af")
    public int field3423 = 0;

    @ObfuscatedName("iu.ad")
    public int field3416 = 1;

    @ObfuscatedName("iu.am")
    public boolean field3425 = false;

    @ObfuscatedName("iu.ai")
    public String[] field3426 = new String[] { null, null, class225.field2770, null, null };

    @ObfuscatedName("iu.ag")
    public String[] field3427 = new String[] { null, null, null, null, class225.field2990 };

    @ObfuscatedName("iu.aw")
    public int field3448 = -2;

    @ObfuscatedName("iu.ak")
    public int field3443 = -1;

    @ObfuscatedName("iu.aa")
    public int field3428 = -1;

    @ObfuscatedName("iu.ab")
    public int field3431 = 0;

    @ObfuscatedName("iu.ar")
    public int field3424 = -1;

    @ObfuscatedName("iu.av")
    public int field3407 = -1;

    @ObfuscatedName("iu.aq")
    public int field3434 = 0;

    @ObfuscatedName("iu.ac")
    public int field3435 = -1;

    @ObfuscatedName("iu.az")
    public int field3415 = -1;

    @ObfuscatedName("iu.at")
    public int field3437 = -1;

    @ObfuscatedName("iu.ae")
    public int field3438 = -1;

    @ObfuscatedName("iu.aj")
    public int field3439 = -1;

    @ObfuscatedName("iu.ap")
    public int field3430 = -1;

    @ObfuscatedName("iu.an")
    public int[] field3441;

    @ObfuscatedName("iu.al")
    public int[] field3442;

    @ObfuscatedName("iu.ay")
    public int field3429 = -1;

    @ObfuscatedName("iu.ax")
    public int field3444 = -1;

    @ObfuscatedName("iu.au")
    public int field3445 = 128;

    @ObfuscatedName("iu.as")
    public int field3446 = 128;

    @ObfuscatedName("iu.ah")
    public int field3440 = 128;

    @ObfuscatedName("iu.bi")
    public int field3449 = 0;

    @ObfuscatedName("iu.bo")
    public int field3417 = 0;

    @ObfuscatedName("iu.bx")
    public int field3410 = 0;

    @ObfuscatedName("iu.bu")
    public class316 field3451;

    @ObfuscatedName("iu.bd")
    public boolean field3452 = false;

    @ObfuscatedName("iu.bn")
    public int field3453 = -1;

    @ObfuscatedName("iu.bj")
    public int field3454 = -1;

    @ObfuscatedName("iu.bm")
    public int field3455 = -1;

    @ObfuscatedName("iu.bq")
    public int field3456 = -1;

    @ObfuscatedName("bh.f(II)Liu;")
    public static class255 method1847(int arg0) {
        class255 var1 = (class255) field3418.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3433.method3928(10, arg0);
        class255 var3 = new class255();
        var3.field3436 = arg0;
        if (var2 != null) {
            var3.method4339(new class300(var2));
        }
        var3.method4360();
        if (var3.field3444 != -1) {
            var3.method4367(method1847(var3.field3444), method1847(var3.field3429));
        }
        if (var3.field3454 != -1) {
            var3.method4342(method1847(var3.field3454), method1847(var3.field3453));
        }
        if (var3.field3456 != -1) {
            var3.method4343(method1847(var3.field3456), method1847(var3.field3455));
        }
        if (!Statics.field3406 && var3.field3425) {
            var3.field3450 = class225.field2924;
            var3.field3452 = false;
            var3.field3426 = null;
            var3.field3427 = null;
            var3.field3448 = -1;
            var3.field3410 = 0;
            if (var3.field3451 != null) {
                boolean var4 = false;
                for (class181 var5 = var3.field3451.method5524(); var5 != null; var5 = var3.field3451.method5528()) {
                    class250 var6 = class250.method3538((int) var5.field2126);
                    if (var6.field3305) {
                        var5.method3332();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3451 = null;
                }
            }
        }
        field3418.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.b(I)V")
    public void method4360() {
    }

    @ObfuscatedName("iu.g(Lkg;I)V")
    public void method4339(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4374(arg0, var2);
        }
    }

    @ObfuscatedName("iu.z(Lkg;II)V")
    public void method4374(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3432 = arg0.method5337();
        } else if (arg1 == 2) {
            this.field3450 = arg0.method5147();
        } else if (arg1 == 4) {
            this.field3447 = arg0.method5337();
        } else if (arg1 == 5) {
            this.field3412 = arg0.method5337();
        } else if (arg1 == 6) {
            this.field3419 = arg0.method5337();
        } else if (arg1 == 7) {
            this.field3421 = arg0.method5337();
            if (this.field3421 > 32767) {
                this.field3421 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3422 = arg0.method5337();
            if (this.field3422 > 32767) {
                this.field3422 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3423 = 1;
        } else if (arg1 == 12) {
            this.field3416 = arg0.method5277();
        } else if (arg1 == 16) {
            this.field3425 = true;
        } else if (arg1 == 23) {
            this.field3443 = arg0.method5337();
            this.field3431 = arg0.method5138();
        } else if (arg1 == 24) {
            this.field3428 = arg0.method5337();
        } else if (arg1 == 25) {
            this.field3424 = arg0.method5337();
            this.field3434 = arg0.method5138();
        } else if (arg1 == 26) {
            this.field3407 = arg0.method5337();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3426[arg1 - 30] = arg0.method5147();
            if (this.field3426[arg1 - 30].equalsIgnoreCase(class225.field3037)) {
                this.field3426[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3427[arg1 - 35] = arg0.method5147();
        } else if (arg1 == 40) {
            int var3 = arg0.method5138();
            this.field3413 = new short[var3];
            this.field3414 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3413[var4] = (short) arg0.method5337();
                this.field3414[var4] = (short) arg0.method5337();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5138();
            this.field3411 = new short[var5];
            this.field3405 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3411[var6] = (short) arg0.method5337();
                this.field3405[var6] = (short) arg0.method5337();
            }
        } else if (arg1 == 42) {
            this.field3448 = arg0.method5139();
        } else if (arg1 == 65) {
            this.field3452 = true;
        } else if (arg1 == 78) {
            this.field3435 = arg0.method5337();
        } else if (arg1 == 79) {
            this.field3415 = arg0.method5337();
        } else if (arg1 == 90) {
            this.field3437 = arg0.method5337();
        } else if (arg1 == 91) {
            this.field3439 = arg0.method5337();
        } else if (arg1 == 92) {
            this.field3438 = arg0.method5337();
        } else if (arg1 == 93) {
            this.field3430 = arg0.method5337();
        } else if (arg1 == 95) {
            this.field3420 = arg0.method5337();
        } else if (arg1 == 97) {
            this.field3429 = arg0.method5337();
        } else if (arg1 == 98) {
            this.field3444 = arg0.method5337();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3441 == null) {
                this.field3441 = new int[10];
                this.field3442 = new int[10];
            }
            this.field3441[arg1 - 100] = arg0.method5337();
            this.field3442[arg1 - 100] = arg0.method5337();
        } else if (arg1 == 110) {
            this.field3445 = arg0.method5337();
        } else if (arg1 == 111) {
            this.field3446 = arg0.method5337();
        } else if (arg1 == 112) {
            this.field3440 = arg0.method5337();
        } else if (arg1 == 113) {
            this.field3449 = arg0.method5139();
        } else if (arg1 == 114) {
            this.field3417 = arg0.method5139();
        } else if (arg1 == 115) {
            this.field3410 = arg0.method5138();
        } else if (arg1 == 139) {
            this.field3453 = arg0.method5337();
        } else if (arg1 == 140) {
            this.field3454 = arg0.method5337();
        } else if (arg1 == 148) {
            this.field3455 = arg0.method5337();
        } else if (arg1 == 149) {
            this.field3456 = arg0.method5337();
        } else if (arg1 == 249) {
            this.field3451 = class248.method3036(arg0, this.field3451);
        }
    }

    @ObfuscatedName("iu.p(Liu;Liu;I)V")
    public void method4367(class255 arg0, class255 arg1) {
        this.field3432 = arg0.field3432;
        this.field3447 = arg0.field3447;
        this.field3412 = arg0.field3412;
        this.field3419 = arg0.field3419;
        this.field3420 = arg0.field3420;
        this.field3421 = arg0.field3421;
        this.field3422 = arg0.field3422;
        this.field3413 = arg0.field3413;
        this.field3414 = arg0.field3414;
        this.field3411 = arg0.field3411;
        this.field3405 = arg0.field3405;
        this.field3450 = arg1.field3450;
        this.field3425 = arg1.field3425;
        this.field3416 = arg1.field3416;
        this.field3423 = 1;
    }

    @ObfuscatedName("iu.h(Liu;Liu;S)V")
    public void method4342(class255 arg0, class255 arg1) {
        this.field3432 = arg0.field3432;
        this.field3447 = arg0.field3447;
        this.field3412 = arg0.field3412;
        this.field3419 = arg0.field3419;
        this.field3420 = arg0.field3420;
        this.field3421 = arg0.field3421;
        this.field3422 = arg0.field3422;
        this.field3413 = arg1.field3413;
        this.field3414 = arg1.field3414;
        this.field3411 = arg1.field3411;
        this.field3405 = arg1.field3405;
        this.field3450 = arg1.field3450;
        this.field3425 = arg1.field3425;
        this.field3423 = arg1.field3423;
        this.field3443 = arg1.field3443;
        this.field3428 = arg1.field3428;
        this.field3435 = arg1.field3435;
        this.field3424 = arg1.field3424;
        this.field3407 = arg1.field3407;
        this.field3415 = arg1.field3415;
        this.field3437 = arg1.field3437;
        this.field3438 = arg1.field3438;
        this.field3439 = arg1.field3439;
        this.field3430 = arg1.field3430;
        this.field3410 = arg1.field3410;
        this.field3426 = arg1.field3426;
        this.field3427 = new String[5];
        if (arg1.field3427 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3427[var3] = arg1.field3427[var3];
            }
        }
        this.field3427[4] = class225.field2776;
        this.field3416 = 0;
    }

    @ObfuscatedName("iu.y(Liu;Liu;I)V")
    public void method4343(class255 arg0, class255 arg1) {
        this.field3432 = arg0.field3432;
        this.field3447 = arg0.field3447;
        this.field3412 = arg0.field3412;
        this.field3419 = arg0.field3419;
        this.field3420 = arg0.field3420;
        this.field3421 = arg0.field3421;
        this.field3422 = arg0.field3422;
        this.field3413 = arg0.field3413;
        this.field3414 = arg0.field3414;
        this.field3411 = arg0.field3411;
        this.field3405 = arg0.field3405;
        this.field3423 = arg0.field3423;
        this.field3450 = arg1.field3450;
        this.field3416 = 0;
        this.field3425 = false;
        this.field3452 = false;
    }

    @ObfuscatedName("iu.w(II)Ldq;")
    public final class122 method4344(int arg0) {
        if (this.field3441 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3442[var3] && this.field3442[var3] != 0) {
                    var2 = this.field3441[var3];
                }
            }
            if (var2 != -1) {
                return method1847(var2).method4344(1);
            }
        }
        class122 var4 = class122.method2548(Statics.field3553, this.field3432, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3445 != 128 || this.field3446 != 128 || this.field3440 != 128) {
            var4.method2564(this.field3445, this.field3446, this.field3440);
        }
        if (this.field3413 != null) {
            for (int var5 = 0; var5 < this.field3413.length; var5++) {
                var4.method2561(this.field3413[var5], this.field3414[var5]);
            }
        }
        if (this.field3411 != null) {
            for (int var6 = 0; var6 < this.field3411.length; var6++) {
                var4.method2617(this.field3411[var6], this.field3405[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iu.i(II)Ldf;")
    public final class128 method4345(int arg0) {
        if (this.field3441 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3442[var3] && this.field3442[var3] != 0) {
                    var2 = this.field3441[var3];
                }
            }
            if (var2 != -1) {
                return method1847(var2).method4345(1);
            }
        }
        class128 var4 = (class128) field3408.method3076((long) this.field3436);
        if (var4 != null) {
            return var4;
        }
        class122 var5 = class122.method2548(Statics.field3553, this.field3432, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3445 != 128 || this.field3446 != 128 || this.field3440 != 128) {
            var5.method2564(this.field3445, this.field3446, this.field3440);
        }
        if (this.field3413 != null) {
            for (int var6 = 0; var6 < this.field3413.length; var6++) {
                var5.method2561(this.field3413[var6], this.field3414[var6]);
            }
        }
        if (this.field3411 != null) {
            for (int var7 = 0; var7 < this.field3411.length; var7++) {
                var5.method2617(this.field3411[var7], this.field3405[var7]);
            }
        }
        class128 var8 = var5.method2568(this.field3449 + 64, this.field3417 * 5 + 768, -50, -10, -50);
        var8.field1686 = true;
        field3408.method3078(var8, (long) this.field3436);
        return var8;
    }

    @ObfuscatedName("iu.k(IB)Liu;")
    public class255 method4346(int arg0) {
        if (this.field3441 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3442[var3] && this.field3442[var3] != 0) {
                    var2 = this.field3441[var3];
                }
            }
            if (var2 != -1) {
                return method1847(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("dy.x(IIIIIZI)Lln;")
    public static final class325 method2753(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class325 var8 = (class325) field3409.method3076(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class255 var9 = method1847(arg0);
        if (arg1 > 1 && var9.field3441 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3442[var11] && var9.field3442[var11] != 0) {
                    var10 = var9.field3441[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1847(var10);
            }
        }
        class128 var12 = var9.method4345(1);
        if (var12 == null) {
            return null;
        }
        class325 var13 = null;
        if (var9.field3444 != -1) {
            var13 = method2753(var9.field3429, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3454 != -1) {
            var13 = method2753(var9.field3453, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3456 != -1) {
            var13 = method2753(var9.field3455, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3845;
        int var15 = Statics.field3848;
        int var16 = Statics.field3846;
        int[] var17 = new int[4];
        class321.method5632(var17);
        class325 var18 = new class325(36, 32);
        class321.method5634(var18.field3877, 36, 32);
        class321.method5592();
        class131.method2786();
        class131.method2759(16, 16);
        class131.field1751 = false;
        if (var9.field3456 != -1) {
            var13.method5691(0, 0);
        }
        int var19 = var9.field3447;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class131.field1773[var9.field3412] * var19 >> 16;
        int var21 = class131.field1774[var9.field3412] * var19 >> 16;
        var12.method2640();
        var12.method2693(0, var9.field3419, var9.field3420, var9.field3412, var9.field3421, var9.field3422 + var12.field1863 / 2 + var20, var9.field3422 + var21);
        if (var9.field3454 != -1) {
            var13.method5691(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5687(1);
        }
        if (arg2 >= 2) {
            var18.method5687(16777215);
        }
        if (arg3 != 0) {
            var18.method5765(arg3);
        }
        class321.method5634(var18.field3877, 36, 32);
        if (var9.field3444 != -1) {
            var13.method5691(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3423 == 1) {
            Statics.field4016.method4993(Statics.method587(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3409.method3078(var18, var6);
        }
        class321.method5634(var14, var15, var16);
        class321.method5591(var17);
        class131.method2786();
        class131.field1751 = true;
        return var18;
    }

    @ObfuscatedName("iu.e(ZI)Z")
    public final boolean method4337(boolean arg0) {
        int var2 = this.field3443;
        int var3 = this.field3428;
        int var4 = this.field3435;
        if (arg0) {
            var2 = this.field3424;
            var3 = this.field3407;
            var4 = this.field3415;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3553.method3897(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3553.method3897(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3553.method3897(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("iu.n(ZI)Ldq;")
    public final class122 method4341(boolean arg0) {
        int var2 = this.field3443;
        int var3 = this.field3428;
        int var4 = this.field3435;
        if (arg0) {
            var2 = this.field3424;
            var3 = this.field3407;
            var4 = this.field3415;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var5 = class122.method2548(Statics.field3553, var2, 0);
        if (var3 != -1) {
            class122 var6 = class122.method2548(Statics.field3553, var3, 0);
            if (var4 == -1) {
                class122[] var9 = new class122[] { var5, var6 };
                var5 = new class122(var9, 2);
            } else {
                class122 var7 = class122.method2548(Statics.field3553, var4, 0);
                class122[] var8 = new class122[] { var5, var6, var7 };
                var5 = new class122(var8, 3);
            }
        }
        if (!arg0 && this.field3431 != 0) {
            var5.method2559(0, this.field3431, 0);
        }
        if (arg0 && this.field3434 != 0) {
            var5.method2559(0, this.field3434, 0);
        }
        if (this.field3413 != null) {
            for (int var10 = 0; var10 < this.field3413.length; var10++) {
                var5.method2561(this.field3413[var10], this.field3414[var10]);
            }
        }
        if (this.field3411 != null) {
            for (int var11 = 0; var11 < this.field3411.length; var11++) {
                var5.method2617(this.field3411[var11], this.field3405[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("iu.c(ZI)Z")
    public final boolean method4349(boolean arg0) {
        int var2 = this.field3437;
        int var3 = this.field3438;
        if (arg0) {
            var2 = this.field3439;
            var3 = this.field3430;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3553.method3897(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3553.method3897(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("iu.s(ZI)Ldq;")
    public final class122 method4350(boolean arg0) {
        int var2 = this.field3437;
        int var3 = this.field3438;
        if (arg0) {
            var2 = this.field3439;
            var3 = this.field3430;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var4 = class122.method2548(Statics.field3553, var2, 0);
        if (var3 != -1) {
            class122 var5 = class122.method2548(Statics.field3553, var3, 0);
            class122[] var6 = new class122[] { var4, var5 };
            var4 = new class122(var6, 2);
        }
        if (this.field3413 != null) {
            for (int var7 = 0; var7 < this.field3413.length; var7++) {
                var4.method2561(this.field3413[var7], this.field3414[var7]);
            }
        }
        if (this.field3411 != null) {
            for (int var8 = 0; var8 < this.field3411.length; var8++) {
                var4.method2617(this.field3411[var8], this.field3405[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iu.t(III)I")
    public int method4369(int arg0, int arg1) {
        class316 var3 = this.field3451;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class180 var5 = (class180) var3.method5521((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2125;
            }
        }
        return var4;
    }

    @ObfuscatedName("iu.m(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4352(int arg0, String arg1) {
        return class248.method3828(this.field3451, arg0, arg1);
    }

    @ObfuscatedName("iu.v(B)I")
    public int method4355() {
        if (this.field3448 == -1 || this.field3427 == null) {
            return -1;
        } else if (this.field3448 >= 0) {
            return this.field3427[this.field3448] == null ? -1 : this.field3448;
        } else if (class225.field2990.equalsIgnoreCase(this.field3427[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("aq.q(I)V")
    public static void method579() {
        field3418.method3075();
        field3408.method3075();
        field3409.method3075();
    }

    @ObfuscatedName("bq.l(B)V")
    public static void method1043() {
        field3409.method3075();
    }

    @ObfuscatedName("ab.j(ZI)V")
    public static void method537(boolean arg0) {
        if (Statics.field3406 != arg0) {
            method579();
            Statics.field3406 = arg0;
        }
    }
}
