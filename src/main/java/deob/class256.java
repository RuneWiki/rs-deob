package deob;

@ObfuscatedName("iv")
public class class256 extends class195 {

    @ObfuscatedName("iv.n")
    public static boolean field3474 = false;

    @ObfuscatedName("iv.j")
    public static class190 field3445 = new class190(4096);

    @ObfuscatedName("iv.f")
    public static class190 field3468 = new class190(500);

    @ObfuscatedName("iv.m")
    public static class190 field3447 = new class190(30);

    @ObfuscatedName("iv.c")
    public static class190 field3453 = new class190(30);

    @ObfuscatedName("iv.z")
    public static class128[] field3462 = new class128[4];

    @ObfuscatedName("iv.h")
    public int field3450;

    @ObfuscatedName("iv.g")
    public int[] field3481;

    @ObfuscatedName("iv.e")
    public int[] field3491;

    @ObfuscatedName("iv.o")
    public String field3459 = "null";

    @ObfuscatedName("iv.x")
    public short[] field3451;

    @ObfuscatedName("iv.a")
    public short[] field3455;

    @ObfuscatedName("iv.y")
    public short[] field3456;

    @ObfuscatedName("iv.r")
    public short[] field3442;

    @ObfuscatedName("iv.b")
    public int field3458 = 1;

    @ObfuscatedName("iv.s")
    public int field3446 = 1;

    @ObfuscatedName("iv.v")
    public int field3460 = 2;

    @ObfuscatedName("iv.t")
    public boolean field3461 = true;

    @ObfuscatedName("iv.w")
    public int field3465 = -1;

    @ObfuscatedName("iv.l")
    public int field3448 = -1;

    @ObfuscatedName("iv.q")
    public boolean field3464 = false;

    @ObfuscatedName("iv.k")
    public boolean field3454 = false;

    @ObfuscatedName("iv.d")
    public int field3466 = -1;

    @ObfuscatedName("iv.u")
    public int field3467 = 16;

    @ObfuscatedName("iv.ae")
    public int field3478 = 0;

    @ObfuscatedName("iv.ao")
    public int field3469 = 0;

    @ObfuscatedName("iv.ad")
    public String[] field3470 = new String[5];

    @ObfuscatedName("iv.aa")
    public int field3471 = -1;

    @ObfuscatedName("iv.aw")
    public int field3472 = -1;

    @ObfuscatedName("iv.an")
    public boolean field3473 = false;

    @ObfuscatedName("iv.al")
    public boolean field3457 = true;

    @ObfuscatedName("iv.at")
    public int field3475 = 128;

    @ObfuscatedName("iv.au")
    public int field3476 = 128;

    @ObfuscatedName("iv.ak")
    public int field3452 = 128;

    @ObfuscatedName("iv.as")
    public int field3479 = 0;

    @ObfuscatedName("iv.ah")
    public int field3449 = 0;

    @ObfuscatedName("iv.ab")
    public int field3463 = 0;

    @ObfuscatedName("iv.am")
    public boolean field3477 = false;

    @ObfuscatedName("iv.ac")
    public boolean field3482 = false;

    @ObfuscatedName("iv.ax")
    public int field3483 = -1;

    @ObfuscatedName("iv.av")
    public int[] field3484;

    @ObfuscatedName("iv.aq")
    public int field3485 = -1;

    @ObfuscatedName("iv.af")
    public int field3486 = -1;

    @ObfuscatedName("iv.ag")
    public int field3487 = -1;

    @ObfuscatedName("iv.ar")
    public int field3488 = 0;

    @ObfuscatedName("iv.aj")
    public int field3489 = 0;

    @ObfuscatedName("iv.ay")
    public int field3490 = 0;

    @ObfuscatedName("iv.ap")
    public int[] field3480;

    @ObfuscatedName("iv.ai")
    public class187 field3492;

    @ObfuscatedName("ew.n(Lis;Lis;ZI)V")
    public static void method2734(class236 arg0, class236 arg1, boolean arg2) {
        Statics.field3443 = arg0;
        Statics.field3444 = arg1;
        field3474 = arg2;
    }

    @ObfuscatedName("bs.p(II)Liv;")
    public static class256 method937(int arg0) {
        class256 var1 = (class256) field3445.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3443.method3880(6, arg0);
        class256 var3 = new class256();
        var3.field3450 = arg0;
        if (var2 != null) {
            var3.method4230(new class174(var2));
        }
        var3.method4234();
        if (var3.field3482) {
            var3.field3460 = 0;
            var3.field3461 = false;
        }
        field3445.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.i(I)V")
    public void method4234() {
        if (this.field3465 == -1) {
            this.field3465 = 0;
            if (this.field3481 != null && (this.field3491 == null || this.field3491[0] == 10)) {
                this.field3465 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3470[var1] != null) {
                    this.field3465 = 1;
                }
            }
        }
        if (this.field3483 == -1) {
            this.field3483 = this.field3460 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("iv.j(Lfl;I)V")
    public void method4230(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4235(arg0, var2);
        }
    }

    @ObfuscatedName("iv.f(Lfl;II)V")
    public void method4235(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2925();
            if (var3 > 0) {
                if (this.field3481 == null || field3474) {
                    this.field3491 = new int[var3];
                    this.field3481 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3481[var4] = arg0.method3065();
                        this.field3491[var4] = arg0.method2925();
                    }
                } else {
                    arg0.field2400 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3459 = arg0.method3098();
        } else if (arg1 == 5) {
            int var5 = arg0.method2925();
            if (var5 > 0) {
                if (this.field3481 == null || field3474) {
                    this.field3491 = null;
                    this.field3481 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3481[var6] = arg0.method3065();
                    }
                } else {
                    arg0.field2400 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3458 = arg0.method2925();
        } else if (arg1 == 15) {
            this.field3446 = arg0.method2925();
        } else if (arg1 == 17) {
            this.field3460 = 0;
            this.field3461 = false;
        } else if (arg1 == 18) {
            this.field3461 = false;
        } else if (arg1 == 19) {
            this.field3465 = arg0.method2925();
        } else if (arg1 == 21) {
            this.field3448 = 0;
        } else if (arg1 == 22) {
            this.field3464 = true;
        } else if (arg1 == 23) {
            this.field3454 = true;
        } else if (arg1 == 24) {
            this.field3466 = arg0.method3065();
            if (this.field3466 == 65535) {
                this.field3466 = -1;
            }
        } else if (arg1 == 27) {
            this.field3460 = 1;
        } else if (arg1 == 28) {
            this.field3467 = arg0.method2925();
        } else if (arg1 == 29) {
            this.field3478 = arg0.method2922();
        } else if (arg1 == 39) {
            this.field3469 = arg0.method2922() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3470[arg1 - 30] = arg0.method3098();
            if (this.field3470[arg1 - 30].equalsIgnoreCase(class226.field2979)) {
                this.field3470[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2925();
            this.field3451 = new short[var7];
            this.field3455 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3451[var8] = (short) arg0.method3065();
                this.field3455[var8] = (short) arg0.method3065();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2925();
            this.field3456 = new short[var9];
            this.field3442 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3456[var10] = (short) arg0.method3065();
                this.field3442[var10] = (short) arg0.method3065();
            }
        } else if (arg1 == 62) {
            this.field3473 = true;
        } else if (arg1 == 64) {
            this.field3457 = false;
        } else if (arg1 == 65) {
            this.field3475 = arg0.method3065();
        } else if (arg1 == 66) {
            this.field3476 = arg0.method3065();
        } else if (arg1 == 67) {
            this.field3452 = arg0.method3065();
        } else if (arg1 == 68) {
            this.field3472 = arg0.method3065();
        } else if (arg1 == 69) {
            arg0.method2925();
        } else if (arg1 == 70) {
            this.field3479 = arg0.method2924();
        } else if (arg1 == 71) {
            this.field3449 = arg0.method2924();
        } else if (arg1 == 72) {
            this.field3463 = arg0.method2924();
        } else if (arg1 == 73) {
            this.field3477 = true;
        } else if (arg1 == 74) {
            this.field3482 = true;
        } else if (arg1 == 75) {
            this.field3483 = arg0.method2925();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3485 = arg0.method3065();
            if (this.field3485 == 65535) {
                this.field3485 = -1;
            }
            this.field3486 = arg0.method3065();
            if (this.field3486 == 65535) {
                this.field3486 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3065();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2925();
            this.field3484 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3484[var15] = arg0.method3065();
                if (this.field3484[var15] == 65535) {
                    this.field3484[var15] = -1;
                }
            }
            this.field3484[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3487 = arg0.method3065();
            this.field3488 = arg0.method2925();
        } else if (arg1 == 79) {
            this.field3489 = arg0.method3065();
            this.field3490 = arg0.method3065();
            this.field3488 = arg0.method2925();
            int var11 = arg0.method2925();
            this.field3480 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3480[var12] = arg0.method3065();
            }
        } else if (arg1 == 81) {
            this.field3448 = arg0.method2925() * 256;
        } else if (arg1 == 82) {
            this.field3471 = arg0.method3065();
        } else if (arg1 == 249) {
            this.field3492 = class250.method1667(arg0, this.field3492);
        }
    }

    @ObfuscatedName("iv.m(II)Z")
    public final boolean method4232(int arg0) {
        if (this.field3491 != null) {
            for (int var4 = 0; var4 < this.field3491.length; var4++) {
                if (this.field3491[var4] == arg0) {
                    return Statics.field3444.method3832(this.field3481[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3481 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3481.length; var3++) {
                var2 &= Statics.field3444.method3832(this.field3481[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iv.c(I)Z")
    public final boolean method4233() {
        if (this.field3481 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3481.length; var2++) {
            var1 &= Statics.field3444.method3832(this.field3481[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("iv.z(II[[IIIIB)Lef;")
    public final class142 method4252(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3491 == null) {
            var7 = (long) ((this.field3450 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3450 << 10) + (arg0 << 3) + arg1);
        }
        class142 var9 = (class142) field3447.method3280(var7);
        if (var9 == null) {
            class128 var10 = this.method4237(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3464) {
                var10.field1803 = (short) (this.field3478 + 64);
                var10.field1836 = (short) (this.field3469 + 768);
                var10.method2261();
                var9 = var10;
            } else {
                var9 = var10.method2246(this.field3478 + 64, this.field3469 + 768, -50, -10, -50);
            }
            field3447.method3282(var9, var7);
        }
        if (this.field3464) {
            var9 = ((class128) var9).method2242();
        }
        if (this.field3448 >= 0) {
            if (var9 instanceof class134) {
                var9 = ((class134) var9).method2354(arg2, arg3, arg4, arg5, true, this.field3448);
            } else if (var9 instanceof class128) {
                var9 = ((class128) var9).method2230(arg2, arg3, arg4, arg5, true, this.field3448);
            }
        }
        return var9;
    }

    @ObfuscatedName("iv.h(II[[IIIIB)Lek;")
    public final class134 method4250(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3491 == null) {
            var7 = (long) ((this.field3450 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3450 << 10) + (arg0 << 3) + arg1);
        }
        class134 var9 = (class134) field3453.method3280(var7);
        if (var9 == null) {
            class128 var10 = this.method4237(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2246(this.field3478 + 64, this.field3469 + 768, -50, -10, -50);
            field3453.method3282(var9, var7);
        }
        if (this.field3448 >= 0) {
            var9 = var9.method2354(arg2, arg3, arg4, arg5, true, this.field3448);
        }
        return var9;
    }

    @ObfuscatedName("iv.g(II[[IIIILjd;II)Lek;")
    public final class134 method4236(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class261 arg6, int arg7) {
        long var9;
        if (this.field3491 == null) {
            var9 = (long) ((this.field3450 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3450 << 10) + (arg0 << 3) + arg1);
        }
        class134 var11 = (class134) field3453.method3280(var9);
        if (var11 == null) {
            class128 var12 = this.method4237(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2246(this.field3478 + 64, this.field3469 + 768, -50, -10, -50);
            field3453.method3282(var11, var9);
        }
        if (arg6 == null && this.field3448 == -1) {
            return var11;
        }
        class134 var13;
        if (arg6 == null) {
            var13 = var11.method2320(true);
        } else {
            var13 = arg6.method4406(var11, arg7, arg1);
        }
        if (this.field3448 >= 0) {
            var13 = var13.method2354(arg2, arg3, arg4, arg5, false, this.field3448);
        }
        return var13;
    }

    @ObfuscatedName("iv.e(III)Ldu;")
    public final class128 method4237(int arg0, int arg1) {
        class128 var3 = null;
        if (this.field3491 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3481 == null) {
                return null;
            }
            boolean var4 = this.field3473;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3481.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3481[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class128) field3468.method3280((long) var7);
                if (var3 == null) {
                    var3 = class128.method2225(Statics.field3444, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2240();
                    }
                    field3468.method3282(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3462[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class128(field3462, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3491.length; var9++) {
                if (this.field3491[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3481[var8];
            boolean var11 = this.field3473 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class128) field3468.method3280((long) var10);
            if (var3 == null) {
                var3 = class128.method2225(Statics.field3444, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2240();
                }
                field3468.method3282(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3475 == 128 && this.field3476 == 128 && this.field3452 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3479 == 0 && this.field3449 == 0 && this.field3463 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class128 var14 = new class128(var3, arg1 == 0 && !var12 && !var13, this.field3451 == null, this.field3456 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2231(256);
            var14.method2237(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2234();
        } else if (var15 == 2) {
            var14.method2235();
        } else if (var15 == 3) {
            var14.method2224();
        }
        if (this.field3451 != null) {
            for (int var16 = 0; var16 < this.field3451.length; var16++) {
                var14.method2299(this.field3451[var16], this.field3455[var16]);
            }
        }
        if (this.field3456 != null) {
            for (int var17 = 0; var17 < this.field3456.length; var17++) {
                var14.method2239(this.field3456[var17], this.field3442[var17]);
            }
        }
        if (var12) {
            var14.method2241(this.field3475, this.field3476, this.field3452);
        }
        if (var13) {
            var14.method2237(this.field3479, this.field3449, this.field3463);
        }
        return var14;
    }

    @ObfuscatedName("iv.o(I)Liv;")
    public final class256 method4238() {
        int var1 = -1;
        if (this.field3485 != -1) {
            var1 = class212.method3578(this.field3485);
        } else if (this.field3486 != -1) {
            var1 = class212.field2615[this.field3486];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3484.length - 1) {
            var2 = this.field3484[var1];
        } else {
            var2 = this.field3484[this.field3484.length - 1];
        }
        return var2 == -1 ? null : method937(var2);
    }

    @ObfuscatedName("iv.x(III)I")
    public int method4239(int arg0, int arg1) {
        return class250.method4031(this.field3492, arg0, arg1);
    }

    @ObfuscatedName("iv.a(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4245(int arg0, String arg1) {
        return class250.method3573(this.field3492, arg0, arg1);
    }

    @ObfuscatedName("ij.y(I)V")
    public static void method3826() {
        field3445.method3286();
        field3468.method3286();
        field3447.method3286();
        field3453.method3286();
    }

    @ObfuscatedName("iv.r(I)Z")
    public boolean method4241() {
        if (this.field3484 == null) {
            return this.field3487 != -1 || this.field3480 != null;
        }
        for (int var1 = 0; var1 < this.field3484.length; var1++) {
            if (this.field3484[var1] != -1) {
                class256 var2 = method937(this.field3484[var1]);
                if (var2.field3487 != -1 || var2.field3480 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
