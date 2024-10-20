package deob;

@ObfuscatedName("ig")
public class class256 extends class195 {

    @ObfuscatedName("ig.i")
    public static boolean field3465 = false;

    @ObfuscatedName("ig.t")
    public static class190 field3472 = new class190(4096);

    @ObfuscatedName("ig.s")
    public static class190 field3488 = new class190(500);

    @ObfuscatedName("ig.r")
    public static class190 field3451 = new class190(30);

    @ObfuscatedName("ig.v")
    public static class190 field3487 = new class190(30);

    @ObfuscatedName("ig.y")
    public static class128[] field3453 = new class128[4];

    @ObfuscatedName("ig.j")
    public int field3446;

    @ObfuscatedName("ig.k")
    public int[] field3454;

    @ObfuscatedName("ig.e")
    public int[] field3469;

    @ObfuscatedName("ig.o")
    public String field3482 = "null";

    @ObfuscatedName("ig.z")
    public short[] field3458;

    @ObfuscatedName("ig.l")
    public short[] field3459;

    @ObfuscatedName("ig.c")
    public short[] field3460;

    @ObfuscatedName("ig.m")
    public short[] field3461;

    @ObfuscatedName("ig.b")
    public int field3462 = 1;

    @ObfuscatedName("ig.f")
    public int field3450 = 1;

    @ObfuscatedName("ig.n")
    public int field3464 = 2;

    @ObfuscatedName("ig.u")
    public boolean field3457 = true;

    @ObfuscatedName("ig.p")
    public int field3489 = -1;

    @ObfuscatedName("ig.q")
    public int field3467 = -1;

    @ObfuscatedName("ig.d")
    public boolean field3468 = false;

    @ObfuscatedName("ig.h")
    public boolean field3449 = false;

    @ObfuscatedName("ig.g")
    public int field3470 = -1;

    @ObfuscatedName("ig.x")
    public int field3463 = 16;

    @ObfuscatedName("ig.ah")
    public int field3471 = 0;

    @ObfuscatedName("ig.ab")
    public int field3456 = 0;

    @ObfuscatedName("ig.aw")
    public String[] field3474 = new String[5];

    @ObfuscatedName("ig.ai")
    public int field3455 = -1;

    @ObfuscatedName("ig.an")
    public int field3476 = -1;

    @ObfuscatedName("ig.au")
    public boolean field3477 = false;

    @ObfuscatedName("ig.ar")
    public boolean field3478 = true;

    @ObfuscatedName("ig.ay")
    public int field3479 = 128;

    @ObfuscatedName("ig.ao")
    public int field3480 = 128;

    @ObfuscatedName("ig.as")
    public int field3481 = 128;

    @ObfuscatedName("ig.ak")
    public int field3490 = 0;

    @ObfuscatedName("ig.aq")
    public int field3483 = 0;

    @ObfuscatedName("ig.ax")
    public int field3484 = 0;

    @ObfuscatedName("ig.ac")
    public boolean field3475 = false;

    @ObfuscatedName("ig.at")
    public boolean field3486 = false;

    @ObfuscatedName("ig.av")
    public int field3452 = -1;

    @ObfuscatedName("ig.aa")
    public int[] field3473;

    @ObfuscatedName("ig.am")
    public int field3466 = -1;

    @ObfuscatedName("ig.az")
    public int field3485 = -1;

    @ObfuscatedName("ig.al")
    public int field3491 = -1;

    @ObfuscatedName("ig.ad")
    public int field3492 = 0;

    @ObfuscatedName("ig.ae")
    public int field3493 = 0;

    @ObfuscatedName("ig.ag")
    public int field3494 = 0;

    @ObfuscatedName("ig.ap")
    public int[] field3495;

    @ObfuscatedName("ig.af")
    public class187 field3496;

    @ObfuscatedName("ij.i(Liq;Liq;ZI)V")
    public static void method3953(class236 arg0, class236 arg1, boolean arg2) {
        Statics.field3447 = arg0;
        Statics.field3448 = arg1;
        field3465 = arg2;
    }

    @ObfuscatedName("ie.w(II)Lig;")
    public static class256 method4092(int arg0) {
        class256 var1 = (class256) field3472.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3447.method3768(6, arg0);
        class256 var3 = new class256();
        var3.field3446 = arg0;
        if (var2 != null) {
            var3.method4188(new class174(var2));
        }
        var3.method4153();
        if (var3.field3486) {
            var3.field3464 = 0;
            var3.field3457 = false;
        }
        field3472.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.a(I)V")
    public void method4153() {
        if (this.field3489 == -1) {
            this.field3489 = 0;
            if (this.field3454 != null && (this.field3469 == null || this.field3469[0] == 10)) {
                this.field3489 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3474[var1] != null) {
                    this.field3489 = 1;
                }
            }
        }
        if (this.field3452 == -1) {
            this.field3452 = this.field3464 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ig.t(Lfp;I)V")
    public void method4188(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method4195(arg0, var2);
        }
    }

    @ObfuscatedName("ig.s(Lfp;IS)V")
    public void method4195(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3061();
            if (var3 > 0) {
                if (this.field3454 == null || field3465) {
                    this.field3469 = new int[var3];
                    this.field3454 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3454[var4] = arg0.method2882();
                        this.field3469[var4] = arg0.method3061();
                    }
                } else {
                    arg0.field2399 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3482 = arg0.method2884();
        } else if (arg1 == 5) {
            int var5 = arg0.method3061();
            if (var5 > 0) {
                if (this.field3454 == null || field3465) {
                    this.field3469 = null;
                    this.field3454 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3454[var6] = arg0.method2882();
                    }
                } else {
                    arg0.field2399 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3462 = arg0.method3061();
        } else if (arg1 == 15) {
            this.field3450 = arg0.method3061();
        } else if (arg1 == 17) {
            this.field3464 = 0;
            this.field3457 = false;
        } else if (arg1 == 18) {
            this.field3457 = false;
        } else if (arg1 == 19) {
            this.field3489 = arg0.method3061();
        } else if (arg1 == 21) {
            this.field3467 = 0;
        } else if (arg1 == 22) {
            this.field3468 = true;
        } else if (arg1 == 23) {
            this.field3449 = true;
        } else if (arg1 == 24) {
            this.field3470 = arg0.method2882();
            if (this.field3470 == 65535) {
                this.field3470 = -1;
            }
        } else if (arg1 == 27) {
            this.field3464 = 1;
        } else if (arg1 == 28) {
            this.field3463 = arg0.method3061();
        } else if (arg1 == 29) {
            this.field3471 = arg0.method2930();
        } else if (arg1 == 39) {
            this.field3456 = arg0.method2930();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3474[arg1 - 30] = arg0.method2884();
            if (this.field3474[arg1 - 30].equalsIgnoreCase(class226.field2863)) {
                this.field3474[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3061();
            this.field3458 = new short[var7];
            this.field3459 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3458[var8] = (short) arg0.method2882();
                this.field3459[var8] = (short) arg0.method2882();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3061();
            this.field3460 = new short[var9];
            this.field3461 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3460[var10] = (short) arg0.method2882();
                this.field3461[var10] = (short) arg0.method2882();
            }
        } else if (arg1 == 62) {
            this.field3477 = true;
        } else if (arg1 == 64) {
            this.field3478 = false;
        } else if (arg1 == 65) {
            this.field3479 = arg0.method2882();
        } else if (arg1 == 66) {
            this.field3480 = arg0.method2882();
        } else if (arg1 == 67) {
            this.field3481 = arg0.method2882();
        } else if (arg1 == 68) {
            this.field3476 = arg0.method2882();
        } else if (arg1 == 69) {
            arg0.method3061();
        } else if (arg1 == 70) {
            this.field3490 = arg0.method3013();
        } else if (arg1 == 71) {
            this.field3483 = arg0.method3013();
        } else if (arg1 == 72) {
            this.field3484 = arg0.method3013();
        } else if (arg1 == 73) {
            this.field3475 = true;
        } else if (arg1 == 74) {
            this.field3486 = true;
        } else if (arg1 == 75) {
            this.field3452 = arg0.method3061();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3466 = arg0.method2882();
            if (this.field3466 == 65535) {
                this.field3466 = -1;
            }
            this.field3485 = arg0.method2882();
            if (this.field3485 == 65535) {
                this.field3485 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2882();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3061();
            this.field3473 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3473[var15] = arg0.method2882();
                if (this.field3473[var15] == 65535) {
                    this.field3473[var15] = -1;
                }
            }
            this.field3473[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3491 = arg0.method2882();
            this.field3492 = arg0.method3061();
        } else if (arg1 == 79) {
            this.field3493 = arg0.method2882();
            this.field3494 = arg0.method2882();
            this.field3492 = arg0.method3061();
            int var11 = arg0.method3061();
            this.field3495 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3495[var12] = arg0.method2882();
            }
        } else if (arg1 == 81) {
            this.field3467 = arg0.method3061() * 256;
        } else if (arg1 == 82) {
            this.field3455 = arg0.method2882();
        } else if (arg1 == 249) {
            this.field3496 = class250.method1072(arg0, this.field3496);
        }
    }

    @ObfuscatedName("ig.r(IB)Z")
    public final boolean method4156(int arg0) {
        if (this.field3469 != null) {
            for (int var4 = 0; var4 < this.field3469.length; var4++) {
                if (this.field3469[var4] == arg0) {
                    return Statics.field3448.method3770(this.field3454[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3454 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3454.length; var3++) {
                var2 &= Statics.field3448.method3770(this.field3454[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ig.v(I)Z")
    public final boolean method4157() {
        if (this.field3454 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3454.length; var2++) {
            var1 &= Statics.field3448.method3770(this.field3454[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ig.y(II[[IIIII)Leb;")
    public final class142 method4154(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3469 == null) {
            var7 = (long) ((this.field3446 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3446 << 10) + (arg0 << 3) + arg1);
        }
        class142 var9 = (class142) field3451.method3235(var7);
        if (var9 == null) {
            class128 var10 = this.method4161(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3468) {
                var10.field1802 = (short) (this.field3471 + 64);
                var10.field1837 = (short) (this.field3456 * 25 + 768);
                var10.method2202();
                var9 = var10;
            } else {
                var9 = var10.method2221(this.field3471 + 64, this.field3456 * 25 + 768, -50, -10, -50);
            }
            field3451.method3234(var9, var7);
        }
        if (this.field3468) {
            var9 = ((class128) var9).method2191();
        }
        if (this.field3467 >= 0) {
            if (var9 instanceof class134) {
                var9 = ((class134) var9).method2315(arg2, arg3, arg4, arg5, true, this.field3467);
            } else if (var9 instanceof class128) {
                var9 = ((class128) var9).method2243(arg2, arg3, arg4, arg5, true, this.field3467);
            }
        }
        return var9;
    }

    @ObfuscatedName("ig.j(II[[IIIII)Let;")
    public final class134 method4159(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3469 == null) {
            var7 = (long) ((this.field3446 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3446 << 10) + (arg0 << 3) + arg1);
        }
        class134 var9 = (class134) field3487.method3235(var7);
        if (var9 == null) {
            class128 var10 = this.method4161(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2221(this.field3471 + 64, this.field3456 * 25 + 768, -50, -10, -50);
            field3487.method3234(var9, var7);
        }
        if (this.field3467 >= 0) {
            var9 = var9.method2315(arg2, arg3, arg4, arg5, true, this.field3467);
        }
        return var9;
    }

    @ObfuscatedName("ig.k(II[[IIIILjn;II)Let;")
    public final class134 method4160(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class261 arg6, int arg7) {
        long var9;
        if (this.field3469 == null) {
            var9 = (long) ((this.field3446 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3446 << 10) + (arg0 << 3) + arg1);
        }
        class134 var11 = (class134) field3487.method3235(var9);
        if (var11 == null) {
            class128 var12 = this.method4161(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2221(this.field3471 + 64, this.field3456 * 25 + 768, -50, -10, -50);
            field3487.method3234(var11, var9);
        }
        if (arg6 == null && this.field3467 == -1) {
            return var11;
        }
        class134 var13;
        if (arg6 == null) {
            var13 = var11.method2306(true);
        } else {
            var13 = arg6.method4345(var11, arg7, arg1);
        }
        if (this.field3467 >= 0) {
            var13 = var13.method2315(arg2, arg3, arg4, arg5, false, this.field3467);
        }
        return var13;
    }

    @ObfuscatedName("ig.e(III)Ldo;")
    public final class128 method4161(int arg0, int arg1) {
        class128 var3 = null;
        if (this.field3469 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3454 == null) {
                return null;
            }
            boolean var4 = this.field3477;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3454.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3454[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class128) field3488.method3235((long) var7);
                if (var3 == null) {
                    var3 = class128.method2190(Statics.field3448, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2200();
                    }
                    field3488.method3234(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3453[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class128(field3453, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3469.length; var9++) {
                if (this.field3469[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3454[var8];
            boolean var11 = this.field3477 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class128) field3488.method3235((long) var10);
            if (var3 == null) {
                var3 = class128.method2190(Statics.field3448, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2200();
                }
                field3488.method3234(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3479 == 128 && this.field3480 == 128 && this.field3481 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3490 == 0 && this.field3483 == 0 && this.field3484 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class128 var14 = new class128(var3, arg1 == 0 && !var12 && !var13, this.field3458 == null, this.field3460 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2197(256);
            var14.method2206(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2194();
        } else if (var15 == 2) {
            var14.method2195();
        } else if (var15 == 3) {
            var14.method2196();
        }
        if (this.field3458 != null) {
            for (int var16 = 0; var16 < this.field3458.length; var16++) {
                var14.method2198(this.field3458[var16], this.field3459[var16]);
            }
        }
        if (this.field3460 != null) {
            for (int var17 = 0; var17 < this.field3460.length; var17++) {
                var14.method2226(this.field3460[var17], this.field3461[var17]);
            }
        }
        if (var12) {
            var14.method2201(this.field3479, this.field3480, this.field3481);
        }
        if (var13) {
            var14.method2206(this.field3490, this.field3483, this.field3484);
        }
        return var14;
    }

    @ObfuscatedName("ig.o(I)Lig;")
    public final class256 method4199() {
        int var1 = -1;
        if (this.field3466 != -1) {
            var1 = class212.method227(this.field3466);
        } else if (this.field3485 != -1) {
            var1 = class212.field2613[this.field3485];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3473.length - 1) {
            var2 = this.field3473[var1];
        } else {
            var2 = this.field3473[this.field3473.length - 1];
        }
        return var2 == -1 ? null : method4092(var2);
    }

    @ObfuscatedName("ig.z(III)I")
    public int method4189(int arg0, int arg1) {
        return class250.method1727(this.field3496, arg0, arg1);
    }

    @ObfuscatedName("ig.l(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4166(int arg0, String arg1) {
        return class250.method1585(this.field3496, arg0, arg1);
    }

    @ObfuscatedName("hu.c(I)V")
    public static void method3759() {
        field3472.method3232();
        field3488.method3232();
        field3451.method3232();
        field3487.method3232();
    }

    @ObfuscatedName("ig.b(I)Z")
    public boolean method4165() {
        if (this.field3473 == null) {
            return this.field3491 != -1 || this.field3495 != null;
        }
        for (int var1 = 0; var1 < this.field3473.length; var1++) {
            if (this.field3473[var1] != -1) {
                class256 var2 = method4092(this.field3473[var1]);
                if (var2.field3491 != -1 || var2.field3495 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
