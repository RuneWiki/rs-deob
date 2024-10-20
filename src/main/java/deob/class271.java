package deob;

@ObfuscatedName("js")
public class class271 extends class209 {

    @ObfuscatedName("js.v")
    public static boolean field3419 = false;

    @ObfuscatedName("js.k")
    public static class203 field3404 = new class203(4096);

    @ObfuscatedName("js.u")
    public static class203 field3405 = new class203(500);

    @ObfuscatedName("js.i")
    public static class203 field3406 = new class203(30);

    @ObfuscatedName("js.t")
    public static class203 field3407 = new class203(30);

    @ObfuscatedName("js.p")
    public static class116[] field3415 = new class116[4];

    @ObfuscatedName("js.l")
    public int field3409;

    @ObfuscatedName("js.b")
    public int[] field3410;

    @ObfuscatedName("js.c")
    public int[] field3411;

    @ObfuscatedName("js.d")
    public String field3439 = class240.field2830;

    @ObfuscatedName("js.w")
    public short[] field3435;

    @ObfuscatedName("js.a")
    public short[] field3414;

    @ObfuscatedName("js.z")
    public short[] field3413;

    @ObfuscatedName("js.e")
    public short[] field3451;

    @ObfuscatedName("js.q")
    public int field3417 = 1;

    @ObfuscatedName("js.j")
    public int field3418 = 1;

    @ObfuscatedName("js.y")
    public int field3403 = 2;

    @ObfuscatedName("js.m")
    public boolean field3428 = true;

    @ObfuscatedName("js.h")
    public int field3421 = -1;

    @ObfuscatedName("js.x")
    public int field3422 = -1;

    @ObfuscatedName("js.f")
    public boolean field3423 = false;

    @ObfuscatedName("js.r")
    public boolean field3424 = false;

    @ObfuscatedName("js.n")
    public int field3440 = -1;

    @ObfuscatedName("js.g")
    public int field3443 = 16;

    @ObfuscatedName("js.ac")
    public int field3427 = 0;

    @ObfuscatedName("js.ab")
    public int field3426 = 0;

    @ObfuscatedName("js.ao")
    public String[] field3429 = new String[5];

    @ObfuscatedName("js.an")
    public int field3430 = -1;

    @ObfuscatedName("js.ay")
    public int field3431 = -1;

    @ObfuscatedName("js.av")
    public boolean field3432 = false;

    @ObfuscatedName("js.af")
    public boolean field3433 = true;

    @ObfuscatedName("js.ar")
    public int field3434 = 128;

    @ObfuscatedName("js.am")
    public int field3447 = 128;

    @ObfuscatedName("js.aj")
    public int field3436 = 128;

    @ObfuscatedName("js.aq")
    public int field3437 = 0;

    @ObfuscatedName("js.ak")
    public int field3438 = 0;

    @ObfuscatedName("js.ax")
    public int field3442 = 0;

    @ObfuscatedName("js.aw")
    public boolean field3425 = false;

    @ObfuscatedName("js.au")
    public boolean field3441 = false;

    @ObfuscatedName("js.ad")
    public int field3401 = -1;

    @ObfuscatedName("js.ah")
    public int[] field3412;

    @ObfuscatedName("js.as")
    public int field3444 = -1;

    @ObfuscatedName("js.ag")
    public int field3445 = -1;

    @ObfuscatedName("js.at")
    public int field3420 = -1;

    @ObfuscatedName("js.ae")
    public int field3446 = 0;

    @ObfuscatedName("js.ap")
    public int field3448 = 0;

    @ObfuscatedName("js.ai")
    public int field3416 = 0;

    @ObfuscatedName("js.aa")
    public int[] field3450;

    @ObfuscatedName("js.az")
    public class200 field3408;

    @ObfuscatedName("bv.v(Lis;Lis;ZI)V")
    public static void method1517(class250 arg0, class250 arg1, boolean arg2) {
        Statics.field3402 = arg0;
        Statics.field3449 = arg1;
        field3419 = arg2;
    }

    @ObfuscatedName("io.s(II)Ljs;")
    public static class271 method4255(int arg0) {
        class271 var1 = (class271) field3404.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3402.method4270(6, arg0);
        class271 var3 = new class271();
        var3.field3409 = arg0;
        if (var2 != null) {
            var3.method4699(new class185(var2));
        }
        var3.method4698();
        if (var3.field3441) {
            var3.field3403 = 0;
            var3.field3428 = false;
        }
        field3404.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("js.o(I)V")
    public void method4698() {
        if (this.field3421 == -1) {
            this.field3421 = 0;
            if (this.field3410 != null && (this.field3411 == null || this.field3411[0] == 10)) {
                this.field3421 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3429[var1] != null) {
                    this.field3421 = 1;
                }
            }
        }
        if (this.field3401 == -1) {
            this.field3401 = this.field3403 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("js.k(Lgx;I)V")
    public void method4699(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4700(arg0, var2);
        }
    }

    @ObfuscatedName("js.u(Lgx;II)V")
    public void method4700(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3274();
            if (var3 > 0) {
                if (this.field3410 == null || field3419) {
                    this.field3411 = new int[var3];
                    this.field3410 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3410[var4] = arg0.method3276();
                        this.field3411[var4] = arg0.method3274();
                    }
                } else {
                    arg0.field2386 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3439 = arg0.method3490();
        } else if (arg1 == 5) {
            int var5 = arg0.method3274();
            if (var5 > 0) {
                if (this.field3410 == null || field3419) {
                    this.field3411 = null;
                    this.field3410 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3410[var6] = arg0.method3276();
                    }
                } else {
                    arg0.field2386 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3417 = arg0.method3274();
        } else if (arg1 == 15) {
            this.field3418 = arg0.method3274();
        } else if (arg1 == 17) {
            this.field3403 = 0;
            this.field3428 = false;
        } else if (arg1 == 18) {
            this.field3428 = false;
        } else if (arg1 == 19) {
            this.field3421 = arg0.method3274();
        } else if (arg1 == 21) {
            this.field3422 = 0;
        } else if (arg1 == 22) {
            this.field3423 = true;
        } else if (arg1 == 23) {
            this.field3424 = true;
        } else if (arg1 == 24) {
            this.field3440 = arg0.method3276();
            if (this.field3440 == 65535) {
                this.field3440 = -1;
            }
        } else if (arg1 == 27) {
            this.field3403 = 1;
        } else if (arg1 == 28) {
            this.field3443 = arg0.method3274();
        } else if (arg1 == 29) {
            this.field3427 = arg0.method3275();
        } else if (arg1 == 39) {
            this.field3426 = arg0.method3275();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3429[arg1 - 30] = arg0.method3490();
            if (this.field3429[arg1 - 30].equalsIgnoreCase(class240.field2825)) {
                this.field3429[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3274();
            this.field3435 = new short[var7];
            this.field3414 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3435[var8] = (short) arg0.method3276();
                this.field3414[var8] = (short) arg0.method3276();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3274();
            this.field3413 = new short[var9];
            this.field3451 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3413[var10] = (short) arg0.method3276();
                this.field3451[var10] = (short) arg0.method3276();
            }
        } else if (arg1 == 62) {
            this.field3432 = true;
        } else if (arg1 == 64) {
            this.field3433 = false;
        } else if (arg1 == 65) {
            this.field3434 = arg0.method3276();
        } else if (arg1 == 66) {
            this.field3447 = arg0.method3276();
        } else if (arg1 == 67) {
            this.field3436 = arg0.method3276();
        } else if (arg1 == 68) {
            this.field3431 = arg0.method3276();
        } else if (arg1 == 69) {
            arg0.method3274();
        } else if (arg1 == 70) {
            this.field3437 = arg0.method3277();
        } else if (arg1 == 71) {
            this.field3438 = arg0.method3277();
        } else if (arg1 == 72) {
            this.field3442 = arg0.method3277();
        } else if (arg1 == 73) {
            this.field3425 = true;
        } else if (arg1 == 74) {
            this.field3441 = true;
        } else if (arg1 == 75) {
            this.field3401 = arg0.method3274();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3444 = arg0.method3276();
            if (this.field3444 == 65535) {
                this.field3444 = -1;
            }
            this.field3445 = arg0.method3276();
            if (this.field3445 == 65535) {
                this.field3445 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3276();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3274();
            this.field3412 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3412[var15] = arg0.method3276();
                if (this.field3412[var15] == 65535) {
                    this.field3412[var15] = -1;
                }
            }
            this.field3412[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3420 = arg0.method3276();
            this.field3446 = arg0.method3274();
        } else if (arg1 == 79) {
            this.field3448 = arg0.method3276();
            this.field3416 = arg0.method3276();
            this.field3446 = arg0.method3274();
            int var11 = arg0.method3274();
            this.field3450 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3450[var12] = arg0.method3276();
            }
        } else if (arg1 == 81) {
            this.field3422 = arg0.method3274() * 256;
        } else if (arg1 == 82) {
            this.field3430 = arg0.method3276();
        } else if (arg1 == 249) {
            this.field3408 = class265.method172(arg0, this.field3408);
        }
    }

    @ObfuscatedName("js.i(II)Z")
    public final boolean method4722(int arg0) {
        if (this.field3411 != null) {
            for (int var4 = 0; var4 < this.field3411.length; var4++) {
                if (this.field3411[var4] == arg0) {
                    return Statics.field3449.method4272(this.field3410[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3410 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3410.length; var3++) {
                var2 &= Statics.field3449.method4272(this.field3410[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("js.t(I)Z")
    public final boolean method4723() {
        if (this.field3410 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3410.length; var2++) {
            var1 &= Statics.field3449.method4272(this.field3410[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("js.c(II[[IIIIB)Lde;")
    public final class130 method4703(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3411 == null) {
            var7 = (long) ((this.field3409 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3409 << 10) + (arg0 << 3) + arg1);
        }
        class130 var9 = (class130) field3406.method3687(var7);
        if (var9 == null) {
            class116 var10 = this.method4705(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3423) {
                var10.field1517 = (short) (this.field3427 + 64);
                var10.field1539 = (short) (this.field3426 * 25 + 768);
                var10.method2395();
                var9 = var10;
            } else {
                var9 = var10.method2399(this.field3427 + 64, this.field3426 * 25 + 768, -50, -10, -50);
            }
            field3406.method3689(var9, var7);
        }
        if (this.field3423) {
            var9 = ((class116) var9).method2397();
        }
        if (this.field3422 >= 0) {
            if (var9 instanceof class122) {
                var9 = ((class122) var9).method2518(arg2, arg3, arg4, arg5, true, this.field3422);
            } else if (var9 instanceof class116) {
                var9 = ((class116) var9).method2392(arg2, arg3, arg4, arg5, true, this.field3422);
            }
        }
        return var9;
    }

    @ObfuscatedName("js.w(II[[IIIIB)Lda;")
    public final class122 method4701(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3411 == null) {
            var7 = (long) ((this.field3409 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3409 << 10) + (arg0 << 3) + arg1);
        }
        class122 var9 = (class122) field3407.method3687(var7);
        if (var9 == null) {
            class116 var10 = this.method4705(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2399(this.field3427 + 64, this.field3426 * 25 + 768, -50, -10, -50);
            field3407.method3689(var9, var7);
        }
        if (this.field3422 >= 0) {
            var9 = var9.method2518(arg2, arg3, arg4, arg5, true, this.field3422);
        }
        return var9;
    }

    @ObfuscatedName("js.a(II[[IIIILjb;IB)Lda;")
    public final class122 method4706(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class276 arg6, int arg7) {
        long var9;
        if (this.field3411 == null) {
            var9 = (long) ((this.field3409 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3409 << 10) + (arg0 << 3) + arg1);
        }
        class122 var11 = (class122) field3407.method3687(var9);
        if (var11 == null) {
            class116 var12 = this.method4705(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2399(this.field3427 + 64, this.field3426 * 25 + 768, -50, -10, -50);
            field3407.method3689(var11, var9);
        }
        if (arg6 == null && this.field3422 == -1) {
            return var11;
        }
        class122 var13;
        if (arg6 == null) {
            var13 = var11.method2526(true);
        } else {
            var13 = arg6.method4863(var11, arg7, arg1);
        }
        if (this.field3422 >= 0) {
            var13 = var13.method2518(arg2, arg3, arg4, arg5, false, this.field3422);
        }
        return var13;
    }

    @ObfuscatedName("js.z(III)Ldc;")
    public final class116 method4705(int arg0, int arg1) {
        class116 var3 = null;
        if (this.field3411 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3410 == null) {
                return null;
            }
            boolean var4 = this.field3432;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3410.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3410[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class116) field3405.method3687((long) var7);
                if (var3 == null) {
                    var3 = class116.method2418(Statics.field3449, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2423();
                    }
                    field3405.method3689(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3415[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class116(field3415, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3411.length; var9++) {
                if (this.field3411[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3410[var8];
            boolean var11 = this.field3432 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class116) field3405.method3687((long) var10);
            if (var3 == null) {
                var3 = class116.method2418(Statics.field3449, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2423();
                }
                field3405.method3689(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3434 == 128 && this.field3447 == 128 && this.field3436 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3437 == 0 && this.field3438 == 0 && this.field3442 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class116 var14 = new class116(var3, arg1 == 0 && !var12 && !var13, this.field3435 == null, this.field3413 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2389(256);
            var14.method2390(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2386();
        } else if (var15 == 2) {
            var14.method2400();
        } else if (var15 == 3) {
            var14.method2429();
        }
        if (this.field3435 != null) {
            for (int var16 = 0; var16 < this.field3435.length; var16++) {
                var14.method2391(this.field3435[var16], this.field3414[var16]);
            }
        }
        if (this.field3413 != null) {
            for (int var17 = 0; var17 < this.field3413.length; var17++) {
                var14.method2436(this.field3413[var17], this.field3451[var17]);
            }
        }
        if (var12) {
            var14.method2394(this.field3434, this.field3447, this.field3436);
        }
        if (var13) {
            var14.method2390(this.field3437, this.field3438, this.field3442);
        }
        return var14;
    }

    @ObfuscatedName("js.e(I)Ljs;")
    public final class271 method4707() {
        int var1 = -1;
        if (this.field3444 != -1) {
            var1 = class228.method3899(this.field3444);
        } else if (this.field3445 != -1) {
            var1 = class228.field2596[this.field3445];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3412.length - 1) {
            var2 = this.field3412[var1];
        } else {
            var2 = this.field3412[this.field3412.length - 1];
        }
        return var2 == -1 ? null : method4255(var2);
    }

    @ObfuscatedName("js.q(III)I")
    public int method4708(int arg0, int arg1) {
        return class265.method3063(this.field3408, arg0, arg1);
    }

    @ObfuscatedName("js.j(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4725(int arg0, String arg1) {
        return class265.method2331(this.field3408, arg0, arg1);
    }

    @ObfuscatedName("hk.y(I)V")
    public static void method4100() {
        field3404.method3697();
        field3405.method3697();
        field3406.method3697();
        field3407.method3697();
    }

    @ObfuscatedName("js.m(B)Z")
    public boolean method4721() {
        if (this.field3412 == null) {
            return this.field3420 != -1 || this.field3450 != null;
        }
        for (int var1 = 0; var1 < this.field3412.length; var1++) {
            if (this.field3412[var1] != -1) {
                class271 var2 = method4255(this.field3412[var1]);
                if (var2.field3420 != -1 || var2.field3450 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
