package deob;

@ObfuscatedName("ih")
public class class259 extends class198 {

    @ObfuscatedName("ih.s")
    public static boolean field3470 = false;

    @ObfuscatedName("ih.m")
    public static class193 field3449 = new class193(4096);

    @ObfuscatedName("ih.h")
    public static class193 field3450 = new class193(500);

    @ObfuscatedName("ih.t")
    public static class193 field3451 = new class193(30);

    @ObfuscatedName("ih.p")
    public static class193 field3458 = new class193(30);

    @ObfuscatedName("ih.d")
    public static class128[] field3453 = new class128[4];

    @ObfuscatedName("ih.n")
    public int field3454;

    @ObfuscatedName("ih.z")
    public int[] field3455;

    @ObfuscatedName("ih.o")
    public int[] field3477;

    @ObfuscatedName("ih.q")
    public String field3457 = "null";

    @ObfuscatedName("ih.u")
    public short[] field3460;

    @ObfuscatedName("ih.k")
    public short[] field3482;

    @ObfuscatedName("ih.e")
    public short[] field3491;

    @ObfuscatedName("ih.r")
    public short[] field3446;

    @ObfuscatedName("ih.l")
    public int field3484 = 1;

    @ObfuscatedName("ih.y")
    public int field3463 = 1;

    @ObfuscatedName("ih.w")
    public int field3464 = 2;

    @ObfuscatedName("ih.i")
    public boolean field3452 = true;

    @ObfuscatedName("ih.g")
    public int field3466 = -1;

    @ObfuscatedName("ih.a")
    public int field3499 = -1;

    @ObfuscatedName("ih.x")
    public boolean field3467 = false;

    @ObfuscatedName("ih.b")
    public boolean field3469 = false;

    @ObfuscatedName("ih.j")
    public int field3473 = -1;

    @ObfuscatedName("ih.v")
    public int field3471 = 16;

    @ObfuscatedName("ih.ap")
    public int field3462 = 0;

    @ObfuscatedName("ih.ar")
    public int field3494 = 0;

    @ObfuscatedName("ih.am")
    public String[] field3474 = new String[5];

    @ObfuscatedName("ih.ab")
    public int field3475 = -1;

    @ObfuscatedName("ih.af")
    public int field3447 = -1;

    @ObfuscatedName("ih.aa")
    public boolean field3461 = false;

    @ObfuscatedName("ih.aq")
    public boolean field3489 = true;

    @ObfuscatedName("ih.aj")
    public int field3479 = 128;

    @ObfuscatedName("ih.as")
    public int field3480 = 128;

    @ObfuscatedName("ih.av")
    public int field3459 = 128;

    @ObfuscatedName("ih.ao")
    public int field3476 = 0;

    @ObfuscatedName("ih.ag")
    public int field3483 = 0;

    @ObfuscatedName("ih.ay")
    public int field3478 = 0;

    @ObfuscatedName("ih.ax")
    public boolean field3485 = false;

    @ObfuscatedName("ih.ad")
    public boolean field3486 = false;

    @ObfuscatedName("ih.ae")
    public int field3487 = -1;

    @ObfuscatedName("ih.ac")
    public int[] field3488;

    @ObfuscatedName("ih.az")
    public int field3465 = -1;

    @ObfuscatedName("ih.ah")
    public int field3490 = -1;

    @ObfuscatedName("ih.at")
    public int field3472 = -1;

    @ObfuscatedName("ih.al")
    public int field3492 = 0;

    @ObfuscatedName("ih.au")
    public int field3493 = 0;

    @ObfuscatedName("ih.ak")
    public int field3481 = 0;

    @ObfuscatedName("ih.aw")
    public int[] field3495;

    @ObfuscatedName("ih.an")
    public class190 field3496;

    @ObfuscatedName("fr.s(Liw;Liw;ZB)V")
    public static void method2811(class239 arg0, class239 arg1, boolean arg2) {
        Statics.field3456 = arg0;
        Statics.field3448 = arg1;
        field3470 = arg2;
    }

    @ObfuscatedName("an.c(II)Lih;")
    public static class259 method653(int arg0) {
        class259 var1 = (class259) field3449.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3456.method3840(6, arg0);
        class259 var3 = new class259();
        var3.field3454 = arg0;
        if (var2 != null) {
            var3.method4238(new class177(var2));
        }
        var3.method4237();
        if (var3.field3486) {
            var3.field3464 = 0;
            var3.field3452 = false;
        }
        field3449.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ih.f(B)V")
    public void method4237() {
        if (this.field3466 == -1) {
            this.field3466 = 0;
            if (this.field3455 != null && (this.field3477 == null || this.field3477[0] == 10)) {
                this.field3466 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3474[var1] != null) {
                    this.field3466 = 1;
                }
            }
        }
        if (this.field3487 == -1) {
            this.field3487 = this.field3464 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ih.m(Lfs;I)V")
    public void method4238(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4239(arg0, var2);
        }
    }

    @ObfuscatedName("ih.h(Lfs;II)V")
    public void method4239(class177 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2965();
            if (var3 > 0) {
                if (this.field3455 == null || field3470) {
                    this.field3477 = new int[var3];
                    this.field3455 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3455[var4] = arg0.method2967();
                        this.field3477[var4] = arg0.method2965();
                    }
                } else {
                    arg0.field2402 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3457 = arg0.method2973();
        } else if (arg1 == 5) {
            int var5 = arg0.method2965();
            if (var5 > 0) {
                if (this.field3455 == null || field3470) {
                    this.field3477 = null;
                    this.field3455 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3455[var6] = arg0.method2967();
                    }
                } else {
                    arg0.field2402 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3484 = arg0.method2965();
        } else if (arg1 == 15) {
            this.field3463 = arg0.method2965();
        } else if (arg1 == 17) {
            this.field3464 = 0;
            this.field3452 = false;
        } else if (arg1 == 18) {
            this.field3452 = false;
        } else if (arg1 == 19) {
            this.field3466 = arg0.method2965();
        } else if (arg1 == 21) {
            this.field3499 = 0;
        } else if (arg1 == 22) {
            this.field3467 = true;
        } else if (arg1 == 23) {
            this.field3469 = true;
        } else if (arg1 == 24) {
            this.field3473 = arg0.method2967();
            if (this.field3473 == 65535) {
                this.field3473 = -1;
            }
        } else if (arg1 == 27) {
            this.field3464 = 1;
        } else if (arg1 == 28) {
            this.field3471 = arg0.method2965();
        } else if (arg1 == 29) {
            this.field3462 = arg0.method2966();
        } else if (arg1 == 39) {
            this.field3494 = arg0.method2966() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3474[arg1 - 30] = arg0.method2973();
            if (this.field3474[arg1 - 30].equalsIgnoreCase(class229.field2874)) {
                this.field3474[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2965();
            this.field3460 = new short[var7];
            this.field3482 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3460[var8] = (short) arg0.method2967();
                this.field3482[var8] = (short) arg0.method2967();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2965();
            this.field3491 = new short[var9];
            this.field3446 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3491[var10] = (short) arg0.method2967();
                this.field3446[var10] = (short) arg0.method2967();
            }
        } else if (arg1 == 62) {
            this.field3461 = true;
        } else if (arg1 == 64) {
            this.field3489 = false;
        } else if (arg1 == 65) {
            this.field3479 = arg0.method2967();
        } else if (arg1 == 66) {
            this.field3480 = arg0.method2967();
        } else if (arg1 == 67) {
            this.field3459 = arg0.method2967();
        } else if (arg1 == 68) {
            this.field3447 = arg0.method2967();
        } else if (arg1 == 69) {
            arg0.method2965();
        } else if (arg1 == 70) {
            this.field3476 = arg0.method3157();
        } else if (arg1 == 71) {
            this.field3483 = arg0.method3157();
        } else if (arg1 == 72) {
            this.field3478 = arg0.method3157();
        } else if (arg1 == 73) {
            this.field3485 = true;
        } else if (arg1 == 74) {
            this.field3486 = true;
        } else if (arg1 == 75) {
            this.field3487 = arg0.method2965();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3465 = arg0.method2967();
            if (this.field3465 == 65535) {
                this.field3465 = -1;
            }
            this.field3490 = arg0.method2967();
            if (this.field3490 == 65535) {
                this.field3490 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2967();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2965();
            this.field3488 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3488[var15] = arg0.method2967();
                if (this.field3488[var15] == 65535) {
                    this.field3488[var15] = -1;
                }
            }
            this.field3488[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3472 = arg0.method2967();
            this.field3492 = arg0.method2965();
        } else if (arg1 == 79) {
            this.field3493 = arg0.method2967();
            this.field3481 = arg0.method2967();
            this.field3492 = arg0.method2965();
            int var11 = arg0.method2965();
            this.field3495 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3495[var12] = arg0.method2967();
            }
        } else if (arg1 == 81) {
            this.field3499 = arg0.method2965() * 256;
        } else if (arg1 == 82) {
            this.field3475 = arg0.method2967();
        } else if (arg1 == 249) {
            this.field3496 = class253.method3798(arg0, this.field3496);
        }
    }

    @ObfuscatedName("ih.t(II)Z")
    public final boolean method4289(int arg0) {
        if (this.field3477 != null) {
            for (int var4 = 0; var4 < this.field3477.length; var4++) {
                if (this.field3477[var4] == arg0) {
                    return Statics.field3448.method3842(this.field3455[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3455 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3455.length; var3++) {
                var2 &= Statics.field3448.method3842(this.field3455[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ih.p(B)Z")
    public final boolean method4241() {
        if (this.field3455 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3455.length; var2++) {
            var1 &= Statics.field3448.method3842(this.field3455[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ih.d(II[[IIIIB)Len;")
    public final class142 method4253(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3477 == null) {
            var7 = (long) ((this.field3454 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3454 << 10) + (arg0 << 3) + arg1);
        }
        class142 var9 = (class142) field3451.method3319(var7);
        if (var9 == null) {
            class128 var10 = this.method4245(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3467) {
                var10.field1793 = (short) (this.field3462 + 64);
                var10.field1819 = (short) (this.field3494 + 768);
                var10.method2253();
                var9 = var10;
            } else {
                var9 = var10.method2257(this.field3462 + 64, this.field3494 + 768, -50, -10, -50);
            }
            field3451.method3315(var9, var7);
        }
        if (this.field3467) {
            var9 = ((class128) var9).method2243();
        }
        if (this.field3499 >= 0) {
            if (var9 instanceof class134) {
                var9 = ((class134) var9).method2342(arg2, arg3, arg4, arg5, true, this.field3499);
            } else if (var9 instanceof class128) {
                var9 = ((class128) var9).method2244(arg2, arg3, arg4, arg5, true, this.field3499);
            }
        }
        return var9;
    }

    @ObfuscatedName("ih.n(II[[IIIII)Leb;")
    public final class134 method4243(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3477 == null) {
            var7 = (long) ((this.field3454 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3454 << 10) + (arg0 << 3) + arg1);
        }
        class134 var9 = (class134) field3458.method3319(var7);
        if (var9 == null) {
            class128 var10 = this.method4245(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2257(this.field3462 + 64, this.field3494 + 768, -50, -10, -50);
            field3458.method3315(var9, var7);
        }
        if (this.field3499 >= 0) {
            var9 = var9.method2342(arg2, arg3, arg4, arg5, true, this.field3499);
        }
        return var9;
    }

    @ObfuscatedName("ih.z(II[[IIIILjw;II)Leb;")
    public final class134 method4244(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class264 arg6, int arg7) {
        long var9;
        if (this.field3477 == null) {
            var9 = (long) ((this.field3454 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3454 << 10) + (arg0 << 3) + arg1);
        }
        class134 var11 = (class134) field3458.method3319(var9);
        if (var11 == null) {
            class128 var12 = this.method4245(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2257(this.field3462 + 64, this.field3494 + 768, -50, -10, -50);
            field3458.method3315(var11, var9);
        }
        if (arg6 == null && this.field3499 == -1) {
            return var11;
        }
        class134 var13;
        if (arg6 == null) {
            var13 = var11.method2343(true);
        } else {
            var13 = arg6.method4436(var11, arg7, arg1);
        }
        if (this.field3499 >= 0) {
            var13 = var13.method2342(arg2, arg3, arg4, arg5, false, this.field3499);
        }
        return var13;
    }

    @ObfuscatedName("ih.o(III)Ldn;")
    public final class128 method4245(int arg0, int arg1) {
        class128 var3 = null;
        if (this.field3477 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3455 == null) {
                return null;
            }
            boolean var4 = this.field3461;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3455.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3455[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class128) field3450.method3319((long) var7);
                if (var3 == null) {
                    var3 = class128.method2239(Statics.field3448, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2251();
                    }
                    field3450.method3315(var3, (long) var7);
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
            for (int var9 = 0; var9 < this.field3477.length; var9++) {
                if (this.field3477[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3455[var8];
            boolean var11 = this.field3461 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class128) field3450.method3319((long) var10);
            if (var3 == null) {
                var3 = class128.method2239(Statics.field3448, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2251();
                }
                field3450.method3315(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3479 == 128 && this.field3480 == 128 && this.field3459 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3476 == 0 && this.field3483 == 0 && this.field3478 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class128 var14 = new class128(var3, arg1 == 0 && !var12 && !var13, this.field3460 == null, this.field3491 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2289(256);
            var14.method2248(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2273();
        } else if (var15 == 2) {
            var14.method2246();
        } else if (var15 == 3) {
            var14.method2247();
        }
        if (this.field3460 != null) {
            for (int var16 = 0; var16 < this.field3460.length; var16++) {
                var14.method2249(this.field3460[var16], this.field3482[var16]);
            }
        }
        if (this.field3491 != null) {
            for (int var17 = 0; var17 < this.field3491.length; var17++) {
                var14.method2250(this.field3491[var17], this.field3446[var17]);
            }
        }
        if (var12) {
            var14.method2267(this.field3479, this.field3480, this.field3459);
        }
        if (var13) {
            var14.method2248(this.field3476, this.field3483, this.field3478);
        }
        return var14;
    }

    @ObfuscatedName("ih.u(I)Lih;")
    public final class259 method4246() {
        int var1 = -1;
        if (this.field3465 != -1) {
            var1 = class215.method2427(this.field3465);
        } else if (this.field3490 != -1) {
            var1 = class215.field2623[this.field3490];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3488.length - 1) {
            var2 = this.field3488[var1];
        } else {
            var2 = this.field3488[this.field3488.length - 1];
        }
        return var2 == -1 ? null : method653(var2);
    }

    @ObfuscatedName("ih.r(III)I")
    public int method4250(int arg0, int arg1) {
        return class253.method163(this.field3496, arg0, arg1);
    }

    @ObfuscatedName("ih.l(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4248(int arg0, String arg1) {
        return class253.method471(this.field3496, arg0, arg1);
    }

    @ObfuscatedName("fe.y(I)V")
    public static void method2828() {
        field3449.method3316();
        field3450.method3316();
        field3451.method3316();
        field3458.method3316();
    }

    @ObfuscatedName("ih.w(I)Z")
    public boolean method4249() {
        if (this.field3488 == null) {
            return this.field3472 != -1 || this.field3495 != null;
        }
        for (int var1 = 0; var1 < this.field3488.length; var1++) {
            if (this.field3488[var1] != -1) {
                class259 var2 = method653(this.field3488[var1]);
                if (var2.field3472 != -1 || var2.field3495 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
