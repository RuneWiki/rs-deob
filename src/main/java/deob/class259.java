package deob;

@ObfuscatedName("ia")
public class class259 extends class198 {

    @ObfuscatedName("ia.w")
    public static boolean field3461 = false;

    @ObfuscatedName("ia.k")
    public static class193 field3450 = new class193(4096);

    @ObfuscatedName("ia.f")
    public static class193 field3451 = new class193(500);

    @ObfuscatedName("ia.i")
    public static class193 field3492 = new class193(30);

    @ObfuscatedName("ia.j")
    public static class193 field3483 = new class193(30);

    @ObfuscatedName("ia.m")
    public static class128[] field3466 = new class128[4];

    @ObfuscatedName("ia.u")
    public int field3455;

    @ObfuscatedName("ia.r")
    public int[] field3456;

    @ObfuscatedName("ia.v")
    public int[] field3457;

    @ObfuscatedName("ia.h")
    public String field3497 = "null";

    @ObfuscatedName("ia.a")
    public short[] field3459;

    @ObfuscatedName("ia.p")
    public short[] field3482;

    @ObfuscatedName("ia.q")
    public short[] field3496;

    @ObfuscatedName("ia.l")
    public short[] field3493;

    @ObfuscatedName("ia.c")
    public int field3471 = 1;

    @ObfuscatedName("ia.n")
    public int field3488 = 1;

    @ObfuscatedName("ia.z")
    public int field3465 = 2;

    @ObfuscatedName("ia.e")
    public boolean field3452 = true;

    @ObfuscatedName("ia.g")
    public int field3467 = -1;

    @ObfuscatedName("ia.d")
    public int field3468 = -1;

    @ObfuscatedName("ia.y")
    public boolean field3469 = false;

    @ObfuscatedName("ia.t")
    public boolean field3470 = false;

    @ObfuscatedName("ia.b")
    public int field3462 = -1;

    @ObfuscatedName("ia.s")
    public int field3500 = 16;

    @ObfuscatedName("ia.ap")
    public int field3463 = 0;

    @ObfuscatedName("ia.ac")
    public int field3474 = 0;

    @ObfuscatedName("ia.af")
    public String[] field3475 = new String[5];

    @ObfuscatedName("ia.ai")
    public int field3464 = -1;

    @ObfuscatedName("ia.ad")
    public int field3477 = -1;

    @ObfuscatedName("ia.ar")
    public boolean field3478 = false;

    @ObfuscatedName("ia.aq")
    public boolean field3473 = true;

    @ObfuscatedName("ia.ag")
    public int field3480 = 128;

    @ObfuscatedName("ia.ak")
    public int field3481 = 128;

    @ObfuscatedName("ia.ae")
    public int field3476 = 128;

    @ObfuscatedName("ia.am")
    public int field3449 = 0;

    @ObfuscatedName("ia.az")
    public int field3454 = 0;

    @ObfuscatedName("ia.ay")
    public int field3485 = 0;

    @ObfuscatedName("ia.as")
    public boolean field3486 = false;

    @ObfuscatedName("ia.aw")
    public boolean field3487 = false;

    @ObfuscatedName("ia.at")
    public int field3472 = -1;

    @ObfuscatedName("ia.aj")
    public int[] field3489;

    @ObfuscatedName("ia.ax")
    public int field3490 = -1;

    @ObfuscatedName("ia.an")
    public int field3491 = -1;

    @ObfuscatedName("ia.ab")
    public int field3479 = -1;

    @ObfuscatedName("ia.av")
    public int field3453 = 0;

    @ObfuscatedName("ia.al")
    public int field3494 = 0;

    @ObfuscatedName("ia.ah")
    public int field3495 = 0;

    @ObfuscatedName("ia.au")
    public int[] field3458;

    @ObfuscatedName("ia.aa")
    public class190 field3460;

    @ObfuscatedName("be.w(II)Lia;")
    public static class259 method997(int arg0) {
        class259 var1 = (class259) field3450.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field287.method3754(6, arg0);
        class259 var3 = new class259();
        var3.field3455 = arg0;
        if (var2 != null) {
            var3.method4141(new class177(var2));
        }
        var3.method4140();
        if (var3.field3487) {
            var3.field3465 = 0;
            var3.field3452 = false;
        }
        field3450.method3241(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.o(I)V")
    public void method4140() {
        if (this.field3467 == -1) {
            this.field3467 = 0;
            if (this.field3456 != null && (this.field3457 == null || this.field3457[0] == 10)) {
                this.field3467 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3475[var1] != null) {
                    this.field3467 = 1;
                }
            }
        }
        if (this.field3472 == -1) {
            this.field3472 = this.field3465 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ia.x(Lfi;I)V")
    public void method4141(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method4142(arg0, var2);
        }
    }

    @ObfuscatedName("ia.k(Lfi;II)V")
    public void method4142(class177 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2931();
            if (var3 > 0) {
                if (this.field3456 == null || field3461) {
                    this.field3457 = new int[var3];
                    this.field3456 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3456[var4] = arg0.method2886();
                        this.field3457[var4] = arg0.method2931();
                    }
                } else {
                    arg0.field2412 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3497 = arg0.method2892();
        } else if (arg1 == 5) {
            int var5 = arg0.method2931();
            if (var5 > 0) {
                if (this.field3456 == null || field3461) {
                    this.field3457 = null;
                    this.field3456 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3456[var6] = arg0.method2886();
                    }
                } else {
                    arg0.field2412 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3471 = arg0.method2931();
        } else if (arg1 == 15) {
            this.field3488 = arg0.method2931();
        } else if (arg1 == 17) {
            this.field3465 = 0;
            this.field3452 = false;
        } else if (arg1 == 18) {
            this.field3452 = false;
        } else if (arg1 == 19) {
            this.field3467 = arg0.method2931();
        } else if (arg1 == 21) {
            this.field3468 = 0;
        } else if (arg1 == 22) {
            this.field3469 = true;
        } else if (arg1 == 23) {
            this.field3470 = true;
        } else if (arg1 == 24) {
            this.field3462 = arg0.method2886();
            if (this.field3462 == 65535) {
                this.field3462 = -1;
            }
        } else if (arg1 == 27) {
            this.field3465 = 1;
        } else if (arg1 == 28) {
            this.field3500 = arg0.method2931();
        } else if (arg1 == 29) {
            this.field3463 = arg0.method2885();
        } else if (arg1 == 39) {
            this.field3474 = arg0.method2885();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3475[arg1 - 30] = arg0.method2892();
            if (this.field3475[arg1 - 30].equalsIgnoreCase(class229.field2858)) {
                this.field3475[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2931();
            this.field3459 = new short[var7];
            this.field3482 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3459[var8] = (short) arg0.method2886();
                this.field3482[var8] = (short) arg0.method2886();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2931();
            this.field3496 = new short[var9];
            this.field3493 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3496[var10] = (short) arg0.method2886();
                this.field3493[var10] = (short) arg0.method2886();
            }
        } else if (arg1 == 62) {
            this.field3478 = true;
        } else if (arg1 == 64) {
            this.field3473 = false;
        } else if (arg1 == 65) {
            this.field3480 = arg0.method2886();
        } else if (arg1 == 66) {
            this.field3481 = arg0.method2886();
        } else if (arg1 == 67) {
            this.field3476 = arg0.method2886();
        } else if (arg1 == 68) {
            this.field3477 = arg0.method2886();
        } else if (arg1 == 69) {
            arg0.method2931();
        } else if (arg1 == 70) {
            this.field3449 = arg0.method2887();
        } else if (arg1 == 71) {
            this.field3454 = arg0.method2887();
        } else if (arg1 == 72) {
            this.field3485 = arg0.method2887();
        } else if (arg1 == 73) {
            this.field3486 = true;
        } else if (arg1 == 74) {
            this.field3487 = true;
        } else if (arg1 == 75) {
            this.field3472 = arg0.method2931();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3490 = arg0.method2886();
            if (this.field3490 == 65535) {
                this.field3490 = -1;
            }
            this.field3491 = arg0.method2886();
            if (this.field3491 == 65535) {
                this.field3491 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2886();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2931();
            this.field3489 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3489[var15] = arg0.method2886();
                if (this.field3489[var15] == 65535) {
                    this.field3489[var15] = -1;
                }
            }
            this.field3489[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3479 = arg0.method2886();
            this.field3453 = arg0.method2931();
        } else if (arg1 == 79) {
            this.field3494 = arg0.method2886();
            this.field3495 = arg0.method2886();
            this.field3453 = arg0.method2931();
            int var11 = arg0.method2931();
            this.field3458 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3458[var12] = arg0.method2886();
            }
        } else if (arg1 == 81) {
            this.field3468 = arg0.method2931() * 256;
        } else if (arg1 == 82) {
            this.field3464 = arg0.method2886();
        } else if (arg1 == 249) {
            this.field3460 = class253.method2807(arg0, this.field3460);
        }
    }

    @ObfuscatedName("ia.f(II)Z")
    public final boolean method4143(int arg0) {
        if (this.field3457 != null) {
            for (int var4 = 0; var4 < this.field3457.length; var4++) {
                if (this.field3457[var4] == arg0) {
                    return Statics.field679.method3801(this.field3456[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3456 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3456.length; var3++) {
                var2 &= Statics.field679.method3801(this.field3456[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ia.i(B)Z")
    public final boolean method4189() {
        if (this.field3456 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3456.length; var2++) {
            var1 &= Statics.field679.method3801(this.field3456[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ia.j(II[[IIIII)Ley;")
    public final class142 method4145(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3457 == null) {
            var7 = (long) ((this.field3455 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3455 << 10) + (arg0 << 3) + arg1);
        }
        class142 var9 = (class142) field3492.method3239(var7);
        if (var9 == null) {
            class128 var10 = this.method4148(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3469) {
                var10.field1836 = (short) (this.field3463 + 64);
                var10.field1837 = (short) (this.field3474 * 25 + 768);
                var10.method2181();
                var9 = var10;
            } else {
                var9 = var10.method2185(this.field3463 + 64, this.field3474 * 25 + 768, -50, -10, -50);
            }
            field3492.method3241(var9, var7);
        }
        if (this.field3469) {
            var9 = ((class128) var9).method2170();
        }
        if (this.field3468 >= 0) {
            if (var9 instanceof class134) {
                var9 = ((class134) var9).method2249(arg2, arg3, arg4, arg5, true, this.field3468);
            } else if (var9 instanceof class128) {
                var9 = ((class128) var9).method2218(arg2, arg3, arg4, arg5, true, this.field3468);
            }
        }
        return var9;
    }

    @ObfuscatedName("ia.m(II[[IIIII)Lev;")
    public final class134 method4165(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3457 == null) {
            var7 = (long) ((this.field3455 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3455 << 10) + (arg0 << 3) + arg1);
        }
        class134 var9 = (class134) field3483.method3239(var7);
        if (var9 == null) {
            class128 var10 = this.method4148(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2185(this.field3463 + 64, this.field3474 * 25 + 768, -50, -10, -50);
            field3483.method3241(var9, var7);
        }
        if (this.field3468 >= 0) {
            var9 = var9.method2249(arg2, arg3, arg4, arg5, true, this.field3468);
        }
        return var9;
    }

    @ObfuscatedName("ia.u(II[[IIIILjz;IB)Lev;")
    public final class134 method4185(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class264 arg6, int arg7) {
        long var9;
        if (this.field3457 == null) {
            var9 = (long) ((this.field3455 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3455 << 10) + (arg0 << 3) + arg1);
        }
        class134 var11 = (class134) field3483.method3239(var9);
        if (var11 == null) {
            class128 var12 = this.method4148(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2185(this.field3463 + 64, this.field3474 * 25 + 768, -50, -10, -50);
            field3483.method3241(var11, var9);
        }
        if (arg6 == null && this.field3468 == -1) {
            return var11;
        }
        class134 var13;
        if (arg6 == null) {
            var13 = var11.method2295(true);
        } else {
            var13 = arg6.method4345(var11, arg7, arg1);
        }
        if (this.field3468 >= 0) {
            var13 = var13.method2249(arg2, arg3, arg4, arg5, false, this.field3468);
        }
        return var13;
    }

    @ObfuscatedName("ia.h(III)Ldb;")
    public final class128 method4148(int arg0, int arg1) {
        class128 var3 = null;
        if (this.field3457 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3456 == null) {
                return null;
            }
            boolean var4 = this.field3478;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3456.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3456[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class128) field3451.method3239((long) var7);
                if (var3 == null) {
                    var3 = class128.method2163(Statics.field679, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2179();
                    }
                    field3451.method3241(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3466[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class128(field3466, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3457.length; var9++) {
                if (this.field3457[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3456[var8];
            boolean var11 = this.field3478 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class128) field3451.method3239((long) var10);
            if (var3 == null) {
                var3 = class128.method2163(Statics.field679, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2179();
                }
                field3451.method3241(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3480 == 128 && this.field3481 == 128 && this.field3476 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3449 == 0 && this.field3454 == 0 && this.field3485 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class128 var14 = new class128(var3, arg1 == 0 && !var12 && !var13, this.field3459 == null, this.field3496 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2175(256);
            var14.method2176(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2172();
        } else if (var15 == 2) {
            var14.method2197();
        } else if (var15 == 3) {
            var14.method2174();
        }
        if (this.field3459 != null) {
            for (int var16 = 0; var16 < this.field3459.length; var16++) {
                var14.method2177(this.field3459[var16], this.field3482[var16]);
            }
        }
        if (this.field3496 != null) {
            for (int var17 = 0; var17 < this.field3496.length; var17++) {
                var14.method2178(this.field3496[var17], this.field3493[var17]);
            }
        }
        if (var12) {
            var14.method2200(this.field3480, this.field3481, this.field3476);
        }
        if (var13) {
            var14.method2176(this.field3449, this.field3454, this.field3485);
        }
        return var14;
    }

    @ObfuscatedName("ia.a(I)Lia;")
    public final class259 method4176() {
        int var1 = -1;
        if (this.field3490 != -1) {
            var1 = class215.method2867(this.field3490);
        } else if (this.field3491 != -1) {
            var1 = class215.field2616[this.field3491];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3489.length - 1) {
            var2 = this.field3489[var1];
        } else {
            var2 = this.field3489[this.field3489.length - 1];
        }
        return var2 == -1 ? null : method997(var2);
    }

    @ObfuscatedName("ia.p(III)I")
    public int method4150(int arg0, int arg1) {
        return class253.method2161(this.field3460, arg0, arg1);
    }

    @ObfuscatedName("ia.q(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4182(int arg0, String arg1) {
        return class253.method4380(this.field3460, arg0, arg1);
    }

    @ObfuscatedName("ia.l(I)Z")
    public boolean method4152() {
        if (this.field3489 == null) {
            return this.field3479 != -1 || this.field3458 != null;
        }
        for (int var1 = 0; var1 < this.field3489.length; var1++) {
            if (this.field3489[var1] != -1) {
                class259 var2 = method997(this.field3489[var1]);
                if (var2.field3479 != -1 || var2.field3458 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
