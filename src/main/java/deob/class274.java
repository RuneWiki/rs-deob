package deob;

@ObfuscatedName("js")
public class class274 extends class214 {

    @ObfuscatedName("js.n")
    public static boolean field3459 = false;

    @ObfuscatedName("js.g")
    public static class208 field3442 = new class208(4096);

    @ObfuscatedName("js.b")
    public static class208 field3443 = new class208(500);

    @ObfuscatedName("js.a")
    public static class208 field3444 = new class208(30);

    @ObfuscatedName("js.c")
    public static class208 field3445 = new class208(30);

    @ObfuscatedName("js.z")
    public static class121[] field3446 = new class121[4];

    @ObfuscatedName("js.j")
    public int field3447;

    @ObfuscatedName("js.d")
    public int[] field3448;

    @ObfuscatedName("js.t")
    public int[] field3456;

    @ObfuscatedName("js.f")
    public String field3468 = class245.field2894;

    @ObfuscatedName("js.i")
    public short[] field3480;

    @ObfuscatedName("js.m")
    public short[] field3467;

    @ObfuscatedName("js.v")
    public short[] field3453;

    @ObfuscatedName("js.r")
    public short[] field3454;

    @ObfuscatedName("js.x")
    public int field3455 = 1;

    @ObfuscatedName("js.y")
    public int field3482 = 1;

    @ObfuscatedName("js.p")
    public int field3457 = 2;

    @ObfuscatedName("js.k")
    public boolean field3458 = true;

    @ObfuscatedName("js.o")
    public int field3471 = -1;

    @ObfuscatedName("js.s")
    public int field3452 = -1;

    @ObfuscatedName("js.u")
    public boolean field3461 = false;

    @ObfuscatedName("js.e")
    public boolean field3462 = false;

    @ObfuscatedName("js.w")
    public int field3463 = -1;

    @ObfuscatedName("js.q")
    public int field3451 = 16;

    @ObfuscatedName("js.aa")
    public int field3465 = 0;

    @ObfuscatedName("js.ai")
    public int field3466 = 0;

    @ObfuscatedName("js.ag")
    public String[] field3464 = new String[5];

    @ObfuscatedName("js.at")
    public int field3440 = -1;

    @ObfuscatedName("js.ad")
    public int field3460 = -1;

    @ObfuscatedName("js.as")
    public boolean field3470 = false;

    @ObfuscatedName("js.ac")
    public boolean field3469 = true;

    @ObfuscatedName("js.an")
    public int field3472 = 128;

    @ObfuscatedName("js.ak")
    public int field3473 = 128;

    @ObfuscatedName("js.ah")
    public int field3474 = 128;

    @ObfuscatedName("js.al")
    public int field3483 = 0;

    @ObfuscatedName("js.am")
    public int field3476 = 0;

    @ObfuscatedName("js.ao")
    public int field3477 = 0;

    @ObfuscatedName("js.aq")
    public boolean field3478 = false;

    @ObfuscatedName("js.aw")
    public boolean field3479 = false;

    @ObfuscatedName("js.ab")
    public int field3449 = -1;

    @ObfuscatedName("js.ae")
    public int[] field3481;

    @ObfuscatedName("js.au")
    public int field3484 = -1;

    @ObfuscatedName("js.ay")
    public int field3450 = -1;

    @ObfuscatedName("js.az")
    public int field3486 = -1;

    @ObfuscatedName("js.aj")
    public int field3485 = 0;

    @ObfuscatedName("js.ar")
    public int field3475 = 0;

    @ObfuscatedName("js.ax")
    public int field3487 = 0;

    @ObfuscatedName("js.ap")
    public int[] field3488;

    @ObfuscatedName("js.av")
    public class205 field3489;

    @ObfuscatedName("r.n(Lij;Lij;ZI)V")
    public static void method173(class254 arg0, class254 arg1, boolean arg2) {
        Statics.field71 = arg0;
        Statics.field3441 = arg1;
        field3459 = arg2;
    }

    @ObfuscatedName("jy.h(II)Ljs;")
    public static class274 method4676(int arg0) {
        class274 var1 = (class274) field3442.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field71.method4494(6, arg0);
        class274 var3 = new class274();
        var3.field3447 = arg0;
        if (var2 != null) {
            var3.method4864(new class190(var2));
        }
        var3.method4863();
        if (var3.field3479) {
            var3.field3457 = 0;
            var3.field3458 = false;
        }
        field3442.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("js.l(S)V")
    public void method4863() {
        if (this.field3471 == -1) {
            this.field3471 = 0;
            if (this.field3448 != null && (this.field3456 == null || this.field3456[0] == 10)) {
                this.field3471 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3464[var1] != null) {
                    this.field3471 = 1;
                }
            }
        }
        if (this.field3449 == -1) {
            this.field3449 = this.field3457 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("js.g(Lgc;I)V")
    public void method4864(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4890(arg0, var2);
        }
    }

    @ObfuscatedName("js.b(Lgc;II)V")
    public void method4890(class190 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3511();
            if (var3 > 0) {
                if (this.field3448 == null || field3459) {
                    this.field3456 = new int[var3];
                    this.field3448 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3448[var4] = arg0.method3513();
                        this.field3456[var4] = arg0.method3511();
                    }
                } else {
                    arg0.field2423 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3468 = arg0.method3520();
        } else if (arg1 == 5) {
            int var5 = arg0.method3511();
            if (var5 > 0) {
                if (this.field3448 == null || field3459) {
                    this.field3456 = null;
                    this.field3448 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3448[var6] = arg0.method3513();
                    }
                } else {
                    arg0.field2423 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3455 = arg0.method3511();
        } else if (arg1 == 15) {
            this.field3482 = arg0.method3511();
        } else if (arg1 == 17) {
            this.field3457 = 0;
            this.field3458 = false;
        } else if (arg1 == 18) {
            this.field3458 = false;
        } else if (arg1 == 19) {
            this.field3471 = arg0.method3511();
        } else if (arg1 == 21) {
            this.field3452 = 0;
        } else if (arg1 == 22) {
            this.field3461 = true;
        } else if (arg1 == 23) {
            this.field3462 = true;
        } else if (arg1 == 24) {
            this.field3463 = arg0.method3513();
            if (this.field3463 == 65535) {
                this.field3463 = -1;
            }
        } else if (arg1 == 27) {
            this.field3457 = 1;
        } else if (arg1 == 28) {
            this.field3451 = arg0.method3511();
        } else if (arg1 == 29) {
            this.field3465 = arg0.method3512();
        } else if (arg1 == 39) {
            this.field3466 = arg0.method3512() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3464[arg1 - 30] = arg0.method3520();
            if (this.field3464[arg1 - 30].equalsIgnoreCase(class245.field2999)) {
                this.field3464[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3511();
            this.field3480 = new short[var7];
            this.field3467 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3480[var8] = (short) arg0.method3513();
                this.field3467[var8] = (short) arg0.method3513();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3511();
            this.field3453 = new short[var9];
            this.field3454 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3453[var10] = (short) arg0.method3513();
                this.field3454[var10] = (short) arg0.method3513();
            }
        } else if (arg1 == 62) {
            this.field3470 = true;
        } else if (arg1 == 64) {
            this.field3469 = false;
        } else if (arg1 == 65) {
            this.field3472 = arg0.method3513();
        } else if (arg1 == 66) {
            this.field3473 = arg0.method3513();
        } else if (arg1 == 67) {
            this.field3474 = arg0.method3513();
        } else if (arg1 == 68) {
            this.field3460 = arg0.method3513();
        } else if (arg1 == 69) {
            arg0.method3511();
        } else if (arg1 == 70) {
            this.field3483 = arg0.method3514();
        } else if (arg1 == 71) {
            this.field3476 = arg0.method3514();
        } else if (arg1 == 72) {
            this.field3477 = arg0.method3514();
        } else if (arg1 == 73) {
            this.field3478 = true;
        } else if (arg1 == 74) {
            this.field3479 = true;
        } else if (arg1 == 75) {
            this.field3449 = arg0.method3511();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3484 = arg0.method3513();
            if (this.field3484 == 65535) {
                this.field3484 = -1;
            }
            this.field3450 = arg0.method3513();
            if (this.field3450 == 65535) {
                this.field3450 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3513();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3511();
            this.field3481 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3481[var15] = arg0.method3513();
                if (this.field3481[var15] == 65535) {
                    this.field3481[var15] = -1;
                }
            }
            this.field3481[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3486 = arg0.method3513();
            this.field3485 = arg0.method3511();
        } else if (arg1 == 79) {
            this.field3475 = arg0.method3513();
            this.field3487 = arg0.method3513();
            this.field3485 = arg0.method3511();
            int var11 = arg0.method3511();
            this.field3488 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3488[var12] = arg0.method3513();
            }
        } else if (arg1 == 81) {
            this.field3452 = arg0.method3511() * 256;
        } else if (arg1 == 82) {
            this.field3440 = arg0.method3513();
        } else if (arg1 == 249) {
            this.field3489 = class268.method4601(arg0, this.field3489);
        }
    }

    @ObfuscatedName("js.a(II)Z")
    public final boolean method4896(int arg0) {
        if (this.field3456 != null) {
            for (int var4 = 0; var4 < this.field3456.length; var4++) {
                if (this.field3456[var4] == arg0) {
                    return Statics.field3441.method4456(this.field3448[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3448 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3448.length; var3++) {
                var2 &= Statics.field3441.method4456(this.field3448[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("js.c(I)Z")
    public final boolean method4867() {
        if (this.field3448 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3448.length; var2++) {
            var1 &= Statics.field3441.method4456(this.field3448[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("js.z(II[[IIIII)Lem;")
    public final class135 method4868(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3456 == null) {
            var7 = (long) ((this.field3447 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3447 << 10) + (arg0 << 3) + arg1);
        }
        class135 var9 = (class135) field3444.method3902(var7);
        if (var9 == null) {
            class121 var10 = this.method4871(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3461) {
                var10.field1555 = (short) (this.field3465 + 64);
                var10.field1556 = (short) (this.field3466 + 768);
                var10.method2593();
                var9 = var10;
            } else {
                var9 = var10.method2611(this.field3465 + 64, this.field3466 + 768, -50, -10, -50);
            }
            field3444.method3908(var9, var7);
        }
        if (this.field3461) {
            var9 = ((class121) var9).method2639();
        }
        if (this.field3452 >= 0) {
            if (var9 instanceof class127) {
                var9 = ((class127) var9).method2671(arg2, arg3, arg4, arg5, true, this.field3452);
            } else if (var9 instanceof class121) {
                var9 = ((class121) var9).method2644(arg2, arg3, arg4, arg5, true, this.field3452);
            }
        }
        return var9;
    }

    @ObfuscatedName("js.j(II[[IIIIB)Ldq;")
    public final class127 method4866(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3456 == null) {
            var7 = (long) ((this.field3447 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3447 << 10) + (arg0 << 3) + arg1);
        }
        class127 var9 = (class127) field3445.method3902(var7);
        if (var9 == null) {
            class121 var10 = this.method4871(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2611(this.field3465 + 64, this.field3466 + 768, -50, -10, -50);
            field3445.method3908(var9, var7);
        }
        if (this.field3452 >= 0) {
            var9 = var9.method2671(arg2, arg3, arg4, arg5, true, this.field3452);
        }
        return var9;
    }

    @ObfuscatedName("js.d(II[[IIIILjt;IB)Ldq;")
    public final class127 method4870(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class279 arg6, int arg7) {
        long var9;
        if (this.field3456 == null) {
            var9 = (long) ((this.field3447 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3447 << 10) + (arg0 << 3) + arg1);
        }
        class127 var11 = (class127) field3445.method3902(var9);
        if (var11 == null) {
            class121 var12 = this.method4871(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2611(this.field3465 + 64, this.field3466 + 768, -50, -10, -50);
            field3445.method3908(var11, var9);
        }
        if (arg6 == null && this.field3452 == -1) {
            return var11;
        }
        class127 var13;
        if (arg6 == null) {
            var13 = var11.method2672(true);
        } else {
            var13 = arg6.method5070(var11, arg7, arg1);
        }
        if (this.field3452 >= 0) {
            var13 = var13.method2671(arg2, arg3, arg4, arg5, false, this.field3452);
        }
        return var13;
    }

    @ObfuscatedName("js.i(IIB)Lde;")
    public final class121 method4871(int arg0, int arg1) {
        class121 var3 = null;
        if (this.field3456 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3448 == null) {
                return null;
            }
            boolean var4 = this.field3470;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3448.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3448[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class121) field3443.method3902((long) var7);
                if (var3 == null) {
                    var3 = class121.method2653(Statics.field3441, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2626();
                    }
                    field3443.method3908(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3446[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class121(field3446, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3456.length; var9++) {
                if (this.field3456[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3448[var8];
            boolean var11 = this.field3470 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class121) field3443.method3902((long) var10);
            if (var3 == null) {
                var3 = class121.method2653(Statics.field3441, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2626();
                }
                field3443.method3908(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3472 == 128 && this.field3473 == 128 && this.field3474 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3483 == 0 && this.field3476 == 0 && this.field3477 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class121 var14 = new class121(var3, arg1 == 0 && !var12 && !var13, this.field3480 == null, this.field3453 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2587(256);
            var14.method2588(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2584();
        } else if (var15 == 2) {
            var14.method2585();
        } else if (var15 == 3) {
            var14.method2586();
        }
        if (this.field3480 != null) {
            for (int var16 = 0; var16 < this.field3480.length; var16++) {
                var14.method2648(this.field3480[var16], this.field3467[var16]);
            }
        }
        if (this.field3453 != null) {
            for (int var17 = 0; var17 < this.field3453.length; var17++) {
                var14.method2590(this.field3453[var17], this.field3454[var17]);
            }
        }
        if (var12) {
            var14.method2601(this.field3472, this.field3473, this.field3474);
        }
        if (var13) {
            var14.method2588(this.field3483, this.field3476, this.field3477);
        }
        return var14;
    }

    @ObfuscatedName("js.m(I)Ljs;")
    public final class274 method4892() {
        int var1 = -1;
        if (this.field3484 != -1) {
            var1 = class233.method4441(this.field3484);
        } else if (this.field3450 != -1) {
            var1 = class233.field2632[this.field3450];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3481.length - 1) {
            var2 = this.field3481[var1];
        } else {
            var2 = this.field3481[this.field3481.length - 1];
        }
        return var2 == -1 ? null : method4676(var2);
    }

    @ObfuscatedName("js.v(III)I")
    public int method4876(int arg0, int arg1) {
        class205 var3 = this.field3489;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class219 var5 = (class219) var3.method3870((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2517;
            }
        }
        return var4;
    }

    @ObfuscatedName("js.r(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4874(int arg0, String arg1) {
        class205 var3 = this.field3489;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class203 var5 = (class203) var3.method3870((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2473;
            }
        }
        return var4;
    }

    @ObfuscatedName("js.x(B)Z")
    public boolean method4872() {
        if (this.field3481 == null) {
            return this.field3486 != -1 || this.field3488 != null;
        }
        for (int var1 = 0; var1 < this.field3481.length; var1++) {
            if (this.field3481[var1] != -1) {
                class274 var2 = method4676(this.field3481[var1]);
                if (var2.field3486 != -1 || var2.field3488 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
