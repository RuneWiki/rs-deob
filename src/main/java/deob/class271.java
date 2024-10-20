package deob;

@ObfuscatedName("ju")
public class class271 extends class209 {

    @ObfuscatedName("ju.f")
    public static boolean field3442 = false;

    @ObfuscatedName("ju.b")
    public static class203 field3433 = new class203(4096);

    @ObfuscatedName("ju.l")
    public static class203 field3471 = new class203(500);

    @ObfuscatedName("ju.w")
    public static class203 field3435 = new class203(30);

    @ObfuscatedName("ju.d")
    public static class203 field3436 = new class203(30);

    @ObfuscatedName("ju.n")
    public static class116[] field3450 = new class116[4];

    @ObfuscatedName("ju.s")
    public int field3474;

    @ObfuscatedName("ju.g")
    public int[] field3431;

    @ObfuscatedName("ju.a")
    public int[] field3440;

    @ObfuscatedName("ju.r")
    public String field3466 = class240.field2850;

    @ObfuscatedName("ju.k")
    public short[] field3434;

    @ObfuscatedName("ju.m")
    public short[] field3441;

    @ObfuscatedName("ju.q")
    public short[] field3444;

    @ObfuscatedName("ju.x")
    public short[] field3439;

    @ObfuscatedName("ju.u")
    public int field3446 = 1;

    @ObfuscatedName("ju.o")
    public int field3447 = 1;

    @ObfuscatedName("ju.t")
    public int field3448 = 2;

    @ObfuscatedName("ju.v")
    public boolean field3457 = true;

    @ObfuscatedName("ju.p")
    public int field3456 = -1;

    @ObfuscatedName("ju.z")
    public int field3451 = -1;

    @ObfuscatedName("ju.j")
    public boolean field3452 = false;

    @ObfuscatedName("ju.i")
    public boolean field3437 = false;

    @ObfuscatedName("ju.c")
    public int field3454 = -1;

    @ObfuscatedName("ju.y")
    public int field3455 = 16;

    @ObfuscatedName("ju.av")
    public int field3438 = 0;

    @ObfuscatedName("ju.as")
    public int field3449 = 0;

    @ObfuscatedName("ju.al")
    public String[] field3458 = new String[5];

    @ObfuscatedName("ju.ax")
    public int field3459 = -1;

    @ObfuscatedName("ju.ay")
    public int field3460 = -1;

    @ObfuscatedName("ju.aa")
    public boolean field3443 = false;

    @ObfuscatedName("ju.ag")
    public boolean field3462 = true;

    @ObfuscatedName("ju.aj")
    public int field3463 = 128;

    @ObfuscatedName("ju.an")
    public int field3464 = 128;

    @ObfuscatedName("ju.ap")
    public int field3465 = 128;

    @ObfuscatedName("ju.am")
    public int field3478 = 0;

    @ObfuscatedName("ju.ae")
    public int field3467 = 0;

    @ObfuscatedName("ju.ac")
    public int field3468 = 0;

    @ObfuscatedName("ju.ah")
    public boolean field3469 = false;

    @ObfuscatedName("ju.aq")
    public boolean field3470 = false;

    @ObfuscatedName("ju.af")
    public int field3461 = -1;

    @ObfuscatedName("ju.ab")
    public int[] field3472;

    @ObfuscatedName("ju.ar")
    public int field3473 = -1;

    @ObfuscatedName("ju.ao")
    public int field3453 = -1;

    @ObfuscatedName("ju.at")
    public int field3475 = -1;

    @ObfuscatedName("ju.ad")
    public int field3476 = 0;

    @ObfuscatedName("ju.ai")
    public int field3477 = 0;

    @ObfuscatedName("ju.ak")
    public int field3445 = 0;

    @ObfuscatedName("ju.au")
    public int[] field3479;

    @ObfuscatedName("ju.az")
    public class200 field3480;

    @ObfuscatedName("bp.f(II)Lju;")
    public static class271 method1706(int arg0) {
        class271 var1 = (class271) field3433.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3432.method4267(6, arg0);
        class271 var3 = new class271();
        var3.field3474 = arg0;
        if (var2 != null) {
            var3.method4675(new class185(var2));
        }
        var3.method4674();
        if (var3.field3470) {
            var3.field3448 = 0;
            var3.field3457 = false;
        }
        field3433.method3723(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ju.h(B)V")
    public void method4674() {
        if (this.field3456 == -1) {
            this.field3456 = 0;
            if (this.field3431 != null && (this.field3440 == null || this.field3440[0] == 10)) {
                this.field3456 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3458[var1] != null) {
                    this.field3456 = 1;
                }
            }
        }
        if (this.field3461 == -1) {
            this.field3461 = this.field3448 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ju.e(Lgx;I)V")
    public void method4675(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4700(arg0, var2);
        }
    }

    @ObfuscatedName("ju.b(Lgx;II)V")
    public void method4700(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3323();
            if (var3 > 0) {
                if (this.field3431 == null || field3442) {
                    this.field3440 = new int[var3];
                    this.field3431 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3431[var4] = arg0.method3325();
                        this.field3440[var4] = arg0.method3323();
                    }
                } else {
                    arg0.field2397 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3466 = arg0.method3435();
        } else if (arg1 == 5) {
            int var5 = arg0.method3323();
            if (var5 > 0) {
                if (this.field3431 == null || field3442) {
                    this.field3440 = null;
                    this.field3431 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3431[var6] = arg0.method3325();
                    }
                } else {
                    arg0.field2397 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3446 = arg0.method3323();
        } else if (arg1 == 15) {
            this.field3447 = arg0.method3323();
        } else if (arg1 == 17) {
            this.field3448 = 0;
            this.field3457 = false;
        } else if (arg1 == 18) {
            this.field3457 = false;
        } else if (arg1 == 19) {
            this.field3456 = arg0.method3323();
        } else if (arg1 == 21) {
            this.field3451 = 0;
        } else if (arg1 == 22) {
            this.field3452 = true;
        } else if (arg1 == 23) {
            this.field3437 = true;
        } else if (arg1 == 24) {
            this.field3454 = arg0.method3325();
            if (this.field3454 == 65535) {
                this.field3454 = -1;
            }
        } else if (arg1 == 27) {
            this.field3448 = 1;
        } else if (arg1 == 28) {
            this.field3455 = arg0.method3323();
        } else if (arg1 == 29) {
            this.field3438 = arg0.method3324();
        } else if (arg1 == 39) {
            this.field3449 = arg0.method3324() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3458[arg1 - 30] = arg0.method3435();
            if (this.field3458[arg1 - 30].equalsIgnoreCase(class240.field2897)) {
                this.field3458[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3323();
            this.field3434 = new short[var7];
            this.field3441 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3434[var8] = (short) arg0.method3325();
                this.field3441[var8] = (short) arg0.method3325();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3323();
            this.field3444 = new short[var9];
            this.field3439 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3444[var10] = (short) arg0.method3325();
                this.field3439[var10] = (short) arg0.method3325();
            }
        } else if (arg1 == 62) {
            this.field3443 = true;
        } else if (arg1 == 64) {
            this.field3462 = false;
        } else if (arg1 == 65) {
            this.field3463 = arg0.method3325();
        } else if (arg1 == 66) {
            this.field3464 = arg0.method3325();
        } else if (arg1 == 67) {
            this.field3465 = arg0.method3325();
        } else if (arg1 == 68) {
            this.field3460 = arg0.method3325();
        } else if (arg1 == 69) {
            arg0.method3323();
        } else if (arg1 == 70) {
            this.field3478 = arg0.method3540();
        } else if (arg1 == 71) {
            this.field3467 = arg0.method3540();
        } else if (arg1 == 72) {
            this.field3468 = arg0.method3540();
        } else if (arg1 == 73) {
            this.field3469 = true;
        } else if (arg1 == 74) {
            this.field3470 = true;
        } else if (arg1 == 75) {
            this.field3461 = arg0.method3323();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3473 = arg0.method3325();
            if (this.field3473 == 65535) {
                this.field3473 = -1;
            }
            this.field3453 = arg0.method3325();
            if (this.field3453 == 65535) {
                this.field3453 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3325();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3323();
            this.field3472 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3472[var15] = arg0.method3325();
                if (this.field3472[var15] == 65535) {
                    this.field3472[var15] = -1;
                }
            }
            this.field3472[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3475 = arg0.method3325();
            this.field3476 = arg0.method3323();
        } else if (arg1 == 79) {
            this.field3477 = arg0.method3325();
            this.field3445 = arg0.method3325();
            this.field3476 = arg0.method3323();
            int var11 = arg0.method3323();
            this.field3479 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3479[var12] = arg0.method3325();
            }
        } else if (arg1 == 81) {
            this.field3451 = arg0.method3323() * 256;
        } else if (arg1 == 82) {
            this.field3459 = arg0.method3325();
        } else if (arg1 == 249) {
            this.field3480 = class265.method1460(arg0, this.field3480);
        }
    }

    @ObfuscatedName("ju.l(II)Z")
    public final boolean method4677(int arg0) {
        if (this.field3440 != null) {
            for (int var4 = 0; var4 < this.field3440.length; var4++) {
                if (this.field3440[var4] == arg0) {
                    return Statics.field60.method4316(this.field3431[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3431 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3431.length; var3++) {
                var2 &= Statics.field60.method4316(this.field3431[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ju.w(I)Z")
    public final boolean method4676() {
        if (this.field3431 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3431.length; var2++) {
            var1 &= Statics.field60.method4316(this.field3431[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ju.d(II[[IIIIB)Ldu;")
    public final class130 method4679(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3440 == null) {
            var7 = (long) ((this.field3474 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3474 << 10) + (arg0 << 3) + arg1);
        }
        class130 var9 = (class130) field3435.method3724(var7);
        if (var9 == null) {
            class116 var10 = this.method4673(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3452) {
                var10.field1530 = (short) (this.field3438 + 64);
                var10.field1531 = (short) (this.field3449 + 768);
                var10.method2402();
                var9 = var10;
            } else {
                var9 = var10.method2406(this.field3438 + 64, this.field3449 + 768, -50, -10, -50);
            }
            field3435.method3723(var9, var7);
        }
        if (this.field3452) {
            var9 = ((class116) var9).method2427();
        }
        if (this.field3451 >= 0) {
            if (var9 instanceof class122) {
                var9 = ((class122) var9).method2486(arg2, arg3, arg4, arg5, true, this.field3451);
            } else if (var9 instanceof class116) {
                var9 = ((class116) var9).method2392(arg2, arg3, arg4, arg5, true, this.field3451);
            }
        }
        return var9;
    }

    @ObfuscatedName("ju.n(II[[IIIIS)Lds;")
    public final class122 method4680(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3440 == null) {
            var7 = (long) ((this.field3474 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3474 << 10) + (arg0 << 3) + arg1);
        }
        class122 var9 = (class122) field3436.method3724(var7);
        if (var9 == null) {
            class116 var10 = this.method4673(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2406(this.field3438 + 64, this.field3449 + 768, -50, -10, -50);
            field3436.method3723(var9, var7);
        }
        if (this.field3451 >= 0) {
            var9 = var9.method2486(arg2, arg3, arg4, arg5, true, this.field3451);
        }
        return var9;
    }

    @ObfuscatedName("ju.s(II[[IIIILjv;IB)Lds;")
    public final class122 method4690(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class276 arg6, int arg7) {
        long var9;
        if (this.field3440 == null) {
            var9 = (long) ((this.field3474 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3474 << 10) + (arg0 << 3) + arg1);
        }
        class122 var11 = (class122) field3436.method3724(var9);
        if (var11 == null) {
            class116 var12 = this.method4673(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2406(this.field3438 + 64, this.field3449 + 768, -50, -10, -50);
            field3436.method3723(var11, var9);
        }
        if (arg6 == null && this.field3451 == -1) {
            return var11;
        }
        class122 var13;
        if (arg6 == null) {
            var13 = var11.method2487(true);
        } else {
            var13 = arg6.method4849(var11, arg7, arg1);
        }
        if (this.field3451 >= 0) {
            var13 = var13.method2486(arg2, arg3, arg4, arg5, false, this.field3451);
        }
        return var13;
    }

    @ObfuscatedName("ju.g(IIB)Ldt;")
    public final class116 method4673(int arg0, int arg1) {
        class116 var3 = null;
        if (this.field3440 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3431 == null) {
                return null;
            }
            boolean var4 = this.field3443;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3431.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3431[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class116) field3471.method3724((long) var7);
                if (var3 == null) {
                    var3 = class116.method2385(Statics.field60, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2400();
                    }
                    field3471.method3723(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3450[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class116(field3450, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3440.length; var9++) {
                if (this.field3440[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3431[var8];
            boolean var11 = this.field3443 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class116) field3471.method3724((long) var10);
            if (var3 == null) {
                var3 = class116.method2385(Statics.field60, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2400();
                }
                field3471.method3723(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3463 == 128 && this.field3464 == 128 && this.field3465 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3478 == 0 && this.field3467 == 0 && this.field3468 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class116 var14 = new class116(var3, arg1 == 0 && !var12 && !var13, this.field3434 == null, this.field3444 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2445(256);
            var14.method2443(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2394();
        } else if (var15 == 2) {
            var14.method2438();
        } else if (var15 == 3) {
            var14.method2442();
        }
        if (this.field3434 != null) {
            for (int var16 = 0; var16 < this.field3434.length; var16++) {
                var14.method2398(this.field3434[var16], this.field3441[var16]);
            }
        }
        if (this.field3444 != null) {
            for (int var17 = 0; var17 < this.field3444.length; var17++) {
                var14.method2399(this.field3444[var17], this.field3439[var17]);
            }
        }
        if (var12) {
            var14.method2401(this.field3463, this.field3464, this.field3465);
        }
        if (var13) {
            var14.method2443(this.field3478, this.field3467, this.field3468);
        }
        return var14;
    }

    @ObfuscatedName("ju.k(B)Lju;")
    public final class271 method4682() {
        int var1 = -1;
        if (this.field3473 != -1) {
            var1 = class228.method148(this.field3473);
        } else if (this.field3453 != -1) {
            var1 = class228.field2617[this.field3453];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3472.length - 1) {
            var2 = this.field3472[var1];
        } else {
            var2 = this.field3472[this.field3472.length - 1];
        }
        return var2 == -1 ? null : method1706(var2);
    }

    @ObfuscatedName("ju.m(IIB)I")
    public int method4683(int arg0, int arg1) {
        return class265.method4252(this.field3480, arg0, arg1);
    }

    @ObfuscatedName("ju.q(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4684(int arg0, String arg1) {
        return Statics.method213(this.field3480, arg0, arg1);
    }

    @ObfuscatedName("ja.x(I)V")
    public static void method4553() {
        field3433.method3725();
        field3471.method3725();
        field3435.method3725();
        field3436.method3725();
    }

    @ObfuscatedName("ju.u(I)Z")
    public boolean method4685() {
        if (this.field3472 == null) {
            return this.field3475 != -1 || this.field3479 != null;
        }
        for (int var1 = 0; var1 < this.field3472.length; var1++) {
            if (this.field3472[var1] != -1) {
                class271 var2 = method1706(this.field3472[var1]);
                if (var2.field3475 != -1 || var2.field3479 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
