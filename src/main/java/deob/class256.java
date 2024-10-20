package deob;

@ObfuscatedName("ic")
public class class256 extends class195 {

    @ObfuscatedName("ic.d")
    public static boolean field3482 = false;

    @ObfuscatedName("ic.p")
    public static class190 field3441 = new class190(4096);

    @ObfuscatedName("ic.q")
    public static class190 field3485 = new class190(500);

    @ObfuscatedName("ic.s")
    public static class190 field3442 = new class190(30);

    @ObfuscatedName("ic.r")
    public static class190 field3478 = new class190(30);

    @ObfuscatedName("ic.g")
    public static class126[] field3445 = new class126[4];

    @ObfuscatedName("ic.v")
    public int field3444;

    @ObfuscatedName("ic.t")
    public int[] field3459;

    @ObfuscatedName("ic.y")
    public int[] field3448;

    @ObfuscatedName("ic.o")
    public String field3458 = "null";

    @ObfuscatedName("ic.i")
    public short[] field3468;

    @ObfuscatedName("ic.u")
    public short[] field3451;

    @ObfuscatedName("ic.b")
    public short[] field3452;

    @ObfuscatedName("ic.f")
    public short[] field3453;

    @ObfuscatedName("ic.j")
    public int field3454 = 1;

    @ObfuscatedName("ic.x")
    public int field3455 = 1;

    @ObfuscatedName("ic.c")
    public int field3456 = 2;

    @ObfuscatedName("ic.h")
    public boolean field3457 = true;

    @ObfuscatedName("ic.a")
    public int field3440 = -1;

    @ObfuscatedName("ic.z")
    public int field3465 = -1;

    @ObfuscatedName("ic.l")
    public boolean field3460 = false;

    @ObfuscatedName("ic.w")
    public boolean field3461 = false;

    @ObfuscatedName("ic.n")
    public int field3480 = -1;

    @ObfuscatedName("ic.m")
    public int field3463 = 16;

    @ObfuscatedName("ic.ae")
    public int field3464 = 0;

    @ObfuscatedName("ic.ai")
    public int field3469 = 0;

    @ObfuscatedName("ic.ah")
    public String[] field3466 = new String[5];

    @ObfuscatedName("ic.ab")
    public int field3467 = -1;

    @ObfuscatedName("ic.ad")
    public int field3450 = -1;

    @ObfuscatedName("ic.ag")
    public boolean field3443 = false;

    @ObfuscatedName("ic.as")
    public boolean field3470 = true;

    @ObfuscatedName("ic.af")
    public int field3438 = 128;

    @ObfuscatedName("ic.aq")
    public int field3472 = 128;

    @ObfuscatedName("ic.am")
    public int field3473 = 128;

    @ObfuscatedName("ic.az")
    public int field3449 = 0;

    @ObfuscatedName("ic.av")
    public int field3475 = 0;

    @ObfuscatedName("ic.an")
    public int field3476 = 0;

    @ObfuscatedName("ic.ar")
    public boolean field3477 = false;

    @ObfuscatedName("ic.aa")
    public boolean field3462 = false;

    @ObfuscatedName("ic.aj")
    public int field3479 = -1;

    @ObfuscatedName("ic.ap")
    public int[] field3486;

    @ObfuscatedName("ic.ao")
    public int field3481 = -1;

    @ObfuscatedName("ic.at")
    public int field3474 = -1;

    @ObfuscatedName("ic.aw")
    public int field3483 = -1;

    @ObfuscatedName("ic.ax")
    public int field3484 = 0;

    @ObfuscatedName("ic.ac")
    public int field3446 = 0;

    @ObfuscatedName("ic.au")
    public int field3471 = 0;

    @ObfuscatedName("ic.al")
    public int[] field3487;

    @ObfuscatedName("ic.ay")
    public class187 field3488;

    @ObfuscatedName("e.d(Lit;Lit;ZI)V")
    public static void method10(class236 arg0, class236 arg1, boolean arg2) {
        Statics.field3439 = arg0;
        Statics.field3447 = arg1;
        field3482 = arg2;
    }

    @ObfuscatedName("ec.k(IB)Lic;")
    public static class256 method2710(int arg0) {
        class256 var1 = (class256) field3441.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3439.method3875(6, arg0);
        class256 var3 = new class256();
        var3.field3444 = arg0;
        if (var2 != null) {
            var3.method4284(new class174(var2));
        }
        var3.method4251();
        if (var3.field3462) {
            var3.field3456 = 0;
            var3.field3457 = false;
        }
        field3441.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.e(I)V")
    public void method4251() {
        if (this.field3440 == -1) {
            this.field3440 = 0;
            if (this.field3459 != null && (this.field3448 == null || this.field3448[0] == 10)) {
                this.field3440 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3466[var1] != null) {
                    this.field3440 = 1;
                }
            }
        }
        if (this.field3479 == -1) {
            this.field3479 = this.field3456 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ic.p(Lfg;I)V")
    public void method4284(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4253(arg0, var2);
        }
    }

    @ObfuscatedName("ic.q(Lfg;II)V")
    public void method4253(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2955();
            if (var3 > 0) {
                if (this.field3459 == null || field3482) {
                    this.field3448 = new int[var3];
                    this.field3459 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3459[var4] = arg0.method3035();
                        this.field3448[var4] = arg0.method2955();
                    }
                } else {
                    arg0.field2405 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3458 = arg0.method2964();
        } else if (arg1 == 5) {
            int var5 = arg0.method2955();
            if (var5 > 0) {
                if (this.field3459 == null || field3482) {
                    this.field3448 = null;
                    this.field3459 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3459[var6] = arg0.method3035();
                    }
                } else {
                    arg0.field2405 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3454 = arg0.method2955();
        } else if (arg1 == 15) {
            this.field3455 = arg0.method2955();
        } else if (arg1 == 17) {
            this.field3456 = 0;
            this.field3457 = false;
        } else if (arg1 == 18) {
            this.field3457 = false;
        } else if (arg1 == 19) {
            this.field3440 = arg0.method2955();
        } else if (arg1 == 21) {
            this.field3465 = 0;
        } else if (arg1 == 22) {
            this.field3460 = true;
        } else if (arg1 == 23) {
            this.field3461 = true;
        } else if (arg1 == 24) {
            this.field3480 = arg0.method3035();
            if (this.field3480 == 65535) {
                this.field3480 = -1;
            }
        } else if (arg1 == 27) {
            this.field3456 = 1;
        } else if (arg1 == 28) {
            this.field3463 = arg0.method2955();
        } else if (arg1 == 29) {
            this.field3464 = arg0.method2956();
        } else if (arg1 == 39) {
            this.field3469 = arg0.method2956() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3466[arg1 - 30] = arg0.method2964();
            if (this.field3466[arg1 - 30].equalsIgnoreCase(class226.field2860)) {
                this.field3466[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2955();
            this.field3468 = new short[var7];
            this.field3451 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3468[var8] = (short) arg0.method3035();
                this.field3451[var8] = (short) arg0.method3035();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2955();
            this.field3452 = new short[var9];
            this.field3453 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3452[var10] = (short) arg0.method3035();
                this.field3453[var10] = (short) arg0.method3035();
            }
        } else if (arg1 == 62) {
            this.field3443 = true;
        } else if (arg1 == 64) {
            this.field3470 = false;
        } else if (arg1 == 65) {
            this.field3438 = arg0.method3035();
        } else if (arg1 == 66) {
            this.field3472 = arg0.method3035();
        } else if (arg1 == 67) {
            this.field3473 = arg0.method3035();
        } else if (arg1 == 68) {
            this.field3450 = arg0.method3035();
        } else if (arg1 == 69) {
            arg0.method2955();
        } else if (arg1 == 70) {
            this.field3449 = arg0.method2958();
        } else if (arg1 == 71) {
            this.field3475 = arg0.method2958();
        } else if (arg1 == 72) {
            this.field3476 = arg0.method2958();
        } else if (arg1 == 73) {
            this.field3477 = true;
        } else if (arg1 == 74) {
            this.field3462 = true;
        } else if (arg1 == 75) {
            this.field3479 = arg0.method2955();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3481 = arg0.method3035();
            if (this.field3481 == 65535) {
                this.field3481 = -1;
            }
            this.field3474 = arg0.method3035();
            if (this.field3474 == 65535) {
                this.field3474 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3035();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2955();
            this.field3486 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3486[var15] = arg0.method3035();
                if (this.field3486[var15] == 65535) {
                    this.field3486[var15] = -1;
                }
            }
            this.field3486[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3483 = arg0.method3035();
            this.field3484 = arg0.method2955();
        } else if (arg1 == 79) {
            this.field3446 = arg0.method3035();
            this.field3471 = arg0.method3035();
            this.field3484 = arg0.method2955();
            int var11 = arg0.method2955();
            this.field3487 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3487[var12] = arg0.method3035();
            }
        } else if (arg1 == 81) {
            this.field3465 = arg0.method2955() * 256;
        } else if (arg1 == 82) {
            this.field3467 = arg0.method3035();
        } else if (arg1 == 249) {
            this.field3488 = class250.method535(arg0, this.field3488);
        }
    }

    @ObfuscatedName("ic.s(IB)Z")
    public final boolean method4276(int arg0) {
        if (this.field3448 != null) {
            for (int var4 = 0; var4 < this.field3448.length; var4++) {
                if (this.field3448[var4] == arg0) {
                    return Statics.field3447.method3894(this.field3459[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3459 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3459.length; var3++) {
                var2 &= Statics.field3447.method3894(this.field3459[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ic.r(B)Z")
    public final boolean method4261() {
        if (this.field3459 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3459.length; var2++) {
            var1 &= Statics.field3447.method3894(this.field3459[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ic.g(II[[IIIII)Lee;")
    public final class140 method4255(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3448 == null) {
            var7 = (long) ((this.field3444 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3444 << 10) + (arg0 << 3) + arg1);
        }
        class140 var9 = (class140) field3442.method3341(var7);
        if (var9 == null) {
            class126 var10 = this.method4258(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3460) {
                var10.field1824 = (short) (this.field3464 + 64);
                var10.field1819 = (short) (this.field3469 + 768);
                var10.method2286();
                var9 = var10;
            } else {
                var9 = var10.method2290(this.field3464 + 64, this.field3469 + 768, -50, -10, -50);
            }
            field3442.method3343(var9, var7);
        }
        if (this.field3460) {
            var9 = ((class126) var9).method2275();
        }
        if (this.field3465 >= 0) {
            if (var9 instanceof class132) {
                var9 = ((class132) var9).method2359(arg2, arg3, arg4, arg5, true, this.field3465);
            } else if (var9 instanceof class126) {
                var9 = ((class126) var9).method2276(arg2, arg3, arg4, arg5, true, this.field3465);
            }
        }
        return var9;
    }

    @ObfuscatedName("ic.v(II[[IIIII)Leb;")
    public final class132 method4256(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3448 == null) {
            var7 = (long) ((this.field3444 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3444 << 10) + (arg0 << 3) + arg1);
        }
        class132 var9 = (class132) field3478.method3341(var7);
        if (var9 == null) {
            class126 var10 = this.method4258(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2290(this.field3464 + 64, this.field3469 + 768, -50, -10, -50);
            field3478.method3343(var9, var7);
        }
        if (this.field3465 >= 0) {
            var9 = var9.method2359(arg2, arg3, arg4, arg5, true, this.field3465);
        }
        return var9;
    }

    @ObfuscatedName("ic.t(II[[IIIILjl;II)Leb;")
    public final class132 method4257(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class261 arg6, int arg7) {
        long var9;
        if (this.field3448 == null) {
            var9 = (long) ((this.field3444 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3444 << 10) + (arg0 << 3) + arg1);
        }
        class132 var11 = (class132) field3478.method3341(var9);
        if (var11 == null) {
            class126 var12 = this.method4258(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2290(this.field3464 + 64, this.field3469 + 768, -50, -10, -50);
            field3478.method3343(var11, var9);
        }
        if (arg6 == null && this.field3465 == -1) {
            return var11;
        }
        class132 var13;
        if (arg6 == null) {
            var13 = var11.method2411(true);
        } else {
            var13 = arg6.method4451(var11, arg7, arg1);
        }
        if (this.field3465 >= 0) {
            var13 = var13.method2359(arg2, arg3, arg4, arg5, false, this.field3465);
        }
        return var13;
    }

    @ObfuscatedName("ic.y(III)Ldl;")
    public final class126 method4258(int arg0, int arg1) {
        class126 var3 = null;
        if (this.field3448 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3459 == null) {
                return null;
            }
            boolean var4 = this.field3443;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3459.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3459[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class126) field3485.method3341((long) var7);
                if (var3 == null) {
                    var3 = class126.method2268(Statics.field3447, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2317();
                    }
                    field3485.method3343(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3445[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class126(field3445, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3448.length; var9++) {
                if (this.field3448[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3459[var8];
            boolean var11 = this.field3443 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class126) field3485.method3341((long) var10);
            if (var3 == null) {
                var3 = class126.method2268(Statics.field3447, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2317();
                }
                field3485.method3343(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3438 == 128 && this.field3472 == 128 && this.field3473 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3449 == 0 && this.field3475 == 0 && this.field3476 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class126 var14 = new class126(var3, arg1 == 0 && !var12 && !var13, this.field3468 == null, this.field3452 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2280(256);
            var14.method2281(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2277();
        } else if (var15 == 2) {
            var14.method2309();
        } else if (var15 == 3) {
            var14.method2313();
        }
        if (this.field3468 != null) {
            for (int var16 = 0; var16 < this.field3468.length; var16++) {
                var14.method2284(this.field3468[var16], this.field3451[var16]);
            }
        }
        if (this.field3452 != null) {
            for (int var17 = 0; var17 < this.field3452.length; var17++) {
                var14.method2283(this.field3452[var17], this.field3453[var17]);
            }
        }
        if (var12) {
            var14.method2285(this.field3438, this.field3472, this.field3473);
        }
        if (var13) {
            var14.method2281(this.field3449, this.field3475, this.field3476);
        }
        return var14;
    }

    @ObfuscatedName("ic.o(B)Lic;")
    public final class256 method4300() {
        int var1 = -1;
        if (this.field3481 != -1) {
            var1 = class212.method1633(this.field3481);
        } else if (this.field3474 != -1) {
            var1 = class212.field2621[this.field3474];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3486.length - 1) {
            var2 = this.field3486[var1];
        } else {
            var2 = this.field3486[this.field3486.length - 1];
        }
        return var2 == -1 ? null : method2710(var2);
    }

    @ObfuscatedName("ic.i(III)I")
    public int method4262(int arg0, int arg1) {
        return class250.method3871(this.field3488, arg0, arg1);
    }

    @ObfuscatedName("ic.u(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4260(int arg0, String arg1) {
        return class250.method1625(this.field3488, arg0, arg1);
    }

    @ObfuscatedName("ic.x(B)Z")
    public boolean method4275() {
        if (this.field3486 == null) {
            return this.field3483 != -1 || this.field3487 != null;
        }
        for (int var1 = 0; var1 < this.field3486.length; var1++) {
            if (this.field3486[var1] != -1) {
                class256 var2 = method2710(this.field3486[var1]);
                if (var2.field3483 != -1 || var2.field3487 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
