package deob;

@ObfuscatedName("iq")
public class class257 extends class196 {

    @ObfuscatedName("iq.i")
    public static boolean field3478 = false;

    @ObfuscatedName("iq.r")
    public static class191 field3440 = new class191(4096);

    @ObfuscatedName("iq.o")
    public static class191 field3438 = new class191(500);

    @ObfuscatedName("iq.n")
    public static class191 field3439 = new class191(30);

    @ObfuscatedName("iq.q")
    public static class191 field3443 = new class191(30);

    @ObfuscatedName("iq.b")
    public static class127[] field3473 = new class127[4];

    @ObfuscatedName("iq.k")
    public int field3435;

    @ObfuscatedName("iq.s")
    public int[] field3437;

    @ObfuscatedName("iq.d")
    public int[] field3444;

    @ObfuscatedName("iq.l")
    public String field3445 = "null";

    @ObfuscatedName("iq.t")
    public short[] field3446;

    @ObfuscatedName("iq.y")
    public short[] field3447;

    @ObfuscatedName("iq.v")
    public short[] field3448;

    @ObfuscatedName("iq.c")
    public short[] field3442;

    @ObfuscatedName("iq.z")
    public int field3450 = 1;

    @ObfuscatedName("iq.u")
    public int field3451 = 1;

    @ObfuscatedName("iq.e")
    public int field3457 = 2;

    @ObfuscatedName("iq.p")
    public boolean field3453 = true;

    @ObfuscatedName("iq.m")
    public int field3455 = -1;

    @ObfuscatedName("iq.x")
    public int field3454 = -1;

    @ObfuscatedName("iq.h")
    public boolean field3456 = false;

    @ObfuscatedName("iq.f")
    public boolean field3469 = false;

    @ObfuscatedName("iq.g")
    public int field3458 = -1;

    @ObfuscatedName("iq.w")
    public int field3459 = 16;

    @ObfuscatedName("iq.ar")
    public int field3460 = 0;

    @ObfuscatedName("iq.ax")
    public int field3461 = 0;

    @ObfuscatedName("iq.al")
    public String[] field3449 = new String[5];

    @ObfuscatedName("iq.ag")
    public int field3464 = -1;

    @ObfuscatedName("iq.ad")
    public int field3477 = -1;

    @ObfuscatedName("iq.ab")
    public boolean field3465 = false;

    @ObfuscatedName("iq.am")
    public boolean field3466 = true;

    @ObfuscatedName("iq.aq")
    public int field3467 = 128;

    @ObfuscatedName("iq.at")
    public int field3468 = 128;

    @ObfuscatedName("iq.az")
    public int field3441 = 128;

    @ObfuscatedName("iq.ac")
    public int field3470 = 0;

    @ObfuscatedName("iq.aa")
    public int field3471 = 0;

    @ObfuscatedName("iq.aj")
    public int field3472 = 0;

    @ObfuscatedName("iq.ay")
    public boolean field3452 = false;

    @ObfuscatedName("iq.av")
    public boolean field3474 = false;

    @ObfuscatedName("iq.ao")
    public int field3475 = -1;

    @ObfuscatedName("iq.aw")
    public int[] field3476;

    @ObfuscatedName("iq.ah")
    public int field3484 = -1;

    @ObfuscatedName("iq.an")
    public int field3482 = -1;

    @ObfuscatedName("iq.af")
    public int field3479 = -1;

    @ObfuscatedName("iq.ak")
    public int field3480 = 0;

    @ObfuscatedName("iq.as")
    public int field3481 = 0;

    @ObfuscatedName("iq.ap")
    public int field3462 = 0;

    @ObfuscatedName("iq.ae")
    public int[] field3483;

    @ObfuscatedName("iq.ai")
    public class188 field3463;

    @ObfuscatedName("ef.i(II)Liq;")
    public static class257 method2716(int arg0) {
        class257 var1 = (class257) field3440.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3436.method3824(6, arg0);
        class257 var3 = new class257();
        var3.field3435 = arg0;
        if (var2 != null) {
            var3.method4221(new class175(var2));
        }
        var3.method4195();
        if (var3.field3474) {
            var3.field3457 = 0;
            var3.field3453 = false;
        }
        field3440.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.j(I)V")
    public void method4195() {
        if (this.field3455 == -1) {
            this.field3455 = 0;
            if (this.field3437 != null && (this.field3444 == null || this.field3444[0] == 10)) {
                this.field3455 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3449[var1] != null) {
                    this.field3455 = 1;
                }
            }
        }
        if (this.field3475 == -1) {
            this.field3475 = this.field3457 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("iq.a(Lfp;I)V")
    public void method4221(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method4197(arg0, var2);
        }
    }

    @ObfuscatedName("iq.r(Lfp;IS)V")
    public void method4197(class175 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2999();
            if (var3 > 0) {
                if (this.field3437 == null || field3478) {
                    this.field3444 = new int[var3];
                    this.field3437 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3437[var4] = arg0.method2995();
                        this.field3444[var4] = arg0.method2999();
                    }
                } else {
                    arg0.field2395 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3445 = arg0.method3002();
        } else if (arg1 == 5) {
            int var5 = arg0.method2999();
            if (var5 > 0) {
                if (this.field3437 == null || field3478) {
                    this.field3444 = null;
                    this.field3437 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3437[var6] = arg0.method2995();
                    }
                } else {
                    arg0.field2395 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3450 = arg0.method2999();
        } else if (arg1 == 15) {
            this.field3451 = arg0.method2999();
        } else if (arg1 == 17) {
            this.field3457 = 0;
            this.field3453 = false;
        } else if (arg1 == 18) {
            this.field3453 = false;
        } else if (arg1 == 19) {
            this.field3455 = arg0.method2999();
        } else if (arg1 == 21) {
            this.field3454 = 0;
        } else if (arg1 == 22) {
            this.field3456 = true;
        } else if (arg1 == 23) {
            this.field3469 = true;
        } else if (arg1 == 24) {
            this.field3458 = arg0.method2995();
            if (this.field3458 == 65535) {
                this.field3458 = -1;
            }
        } else if (arg1 == 27) {
            this.field3457 = 1;
        } else if (arg1 == 28) {
            this.field3459 = arg0.method2999();
        } else if (arg1 == 29) {
            this.field3460 = arg0.method3172();
        } else if (arg1 == 39) {
            this.field3461 = arg0.method3172() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3449[arg1 - 30] = arg0.method3002();
            if (this.field3449[arg1 - 30].equalsIgnoreCase(class227.field2861)) {
                this.field3449[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2999();
            this.field3446 = new short[var7];
            this.field3447 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3446[var8] = (short) arg0.method2995();
                this.field3447[var8] = (short) arg0.method2995();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2999();
            this.field3448 = new short[var9];
            this.field3442 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3448[var10] = (short) arg0.method2995();
                this.field3442[var10] = (short) arg0.method2995();
            }
        } else if (arg1 == 62) {
            this.field3465 = true;
        } else if (arg1 == 64) {
            this.field3466 = false;
        } else if (arg1 == 65) {
            this.field3467 = arg0.method2995();
        } else if (arg1 == 66) {
            this.field3468 = arg0.method2995();
        } else if (arg1 == 67) {
            this.field3441 = arg0.method2995();
        } else if (arg1 == 68) {
            this.field3477 = arg0.method2995();
        } else if (arg1 == 69) {
            arg0.method2999();
        } else if (arg1 == 70) {
            this.field3470 = arg0.method2996();
        } else if (arg1 == 71) {
            this.field3471 = arg0.method2996();
        } else if (arg1 == 72) {
            this.field3472 = arg0.method2996();
        } else if (arg1 == 73) {
            this.field3452 = true;
        } else if (arg1 == 74) {
            this.field3474 = true;
        } else if (arg1 == 75) {
            this.field3475 = arg0.method2999();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3484 = arg0.method2995();
            if (this.field3484 == 65535) {
                this.field3484 = -1;
            }
            this.field3482 = arg0.method2995();
            if (this.field3482 == 65535) {
                this.field3482 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2995();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2999();
            this.field3476 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3476[var15] = arg0.method2995();
                if (this.field3476[var15] == 65535) {
                    this.field3476[var15] = -1;
                }
            }
            this.field3476[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3479 = arg0.method2995();
            this.field3480 = arg0.method2999();
        } else if (arg1 == 79) {
            this.field3481 = arg0.method2995();
            this.field3462 = arg0.method2995();
            this.field3480 = arg0.method2999();
            int var11 = arg0.method2999();
            this.field3483 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3483[var12] = arg0.method2995();
            }
        } else if (arg1 == 81) {
            this.field3454 = arg0.method2999() * 256;
        } else if (arg1 == 82) {
            this.field3464 = arg0.method2995();
        } else if (arg1 == 249) {
            this.field3463 = class251.method475(arg0, this.field3463);
        }
    }

    @ObfuscatedName("iq.o(II)Z")
    public final boolean method4198(int arg0) {
        if (this.field3444 != null) {
            for (int var4 = 0; var4 < this.field3444.length; var4++) {
                if (this.field3444[var4] == arg0) {
                    return Statics.field3151.method3826(this.field3437[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3437 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3437.length; var3++) {
                var2 &= Statics.field3151.method3826(this.field3437[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iq.n(I)Z")
    public final boolean method4199() {
        if (this.field3437 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3437.length; var2++) {
            var1 &= Statics.field3151.method3826(this.field3437[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("iq.q(II[[IIIII)Lew;")
    public final class141 method4216(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3444 == null) {
            var7 = (long) ((this.field3435 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3435 << 10) + (arg0 << 3) + arg1);
        }
        class141 var9 = (class141) field3439.method3347(var7);
        if (var9 == null) {
            class127 var10 = this.method4203(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3456) {
                var10.field1840 = (short) (this.field3460 + 64);
                var10.field1841 = (short) (this.field3461 + 768);
                var10.method2275();
                var9 = var10;
            } else {
                var9 = var10.method2264(this.field3460 + 64, this.field3461 + 768, -50, -10, -50);
            }
            field3439.method3346(var9, var7);
        }
        if (this.field3456) {
            var9 = ((class127) var9).method2213();
        }
        if (this.field3454 >= 0) {
            if (var9 instanceof class133) {
                var9 = ((class133) var9).method2305(arg2, arg3, arg4, arg5, true, this.field3454);
            } else if (var9 instanceof class127) {
                var9 = ((class127) var9).method2218(arg2, arg3, arg4, arg5, true, this.field3454);
            }
        }
        return var9;
    }

    @ObfuscatedName("iq.b(II[[IIIII)Lem;")
    public final class133 method4208(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3444 == null) {
            var7 = (long) ((this.field3435 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3435 << 10) + (arg0 << 3) + arg1);
        }
        class133 var9 = (class133) field3443.method3347(var7);
        if (var9 == null) {
            class127 var10 = this.method4203(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2264(this.field3460 + 64, this.field3461 + 768, -50, -10, -50);
            field3443.method3346(var9, var7);
        }
        if (this.field3454 >= 0) {
            var9 = var9.method2305(arg2, arg3, arg4, arg5, true, this.field3454);
        }
        return var9;
    }

    @ObfuscatedName("iq.k(II[[IIIILjw;II)Lem;")
    public final class133 method4217(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class262 arg6, int arg7) {
        long var9;
        if (this.field3444 == null) {
            var9 = (long) ((this.field3435 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3435 << 10) + (arg0 << 3) + arg1);
        }
        class133 var11 = (class133) field3443.method3347(var9);
        if (var11 == null) {
            class127 var12 = this.method4203(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2264(this.field3460 + 64, this.field3461 + 768, -50, -10, -50);
            field3443.method3346(var11, var9);
        }
        if (arg6 == null && this.field3454 == -1) {
            return var11;
        }
        class133 var13;
        if (arg6 == null) {
            var13 = var11.method2306(true);
        } else {
            var13 = arg6.method4342(var11, arg7, arg1);
        }
        if (this.field3454 >= 0) {
            var13 = var13.method2305(arg2, arg3, arg4, arg5, false, this.field3454);
        }
        return var13;
    }

    @ObfuscatedName("iq.s(IIB)Lde;")
    public final class127 method4203(int arg0, int arg1) {
        class127 var3 = null;
        if (this.field3444 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3437 == null) {
                return null;
            }
            boolean var4 = this.field3465;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3437.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3437[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class127) field3438.method3347((long) var7);
                if (var3 == null) {
                    var3 = class127.method2209(Statics.field3151, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2223();
                    }
                    field3438.method3346(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3473[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class127(field3473, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3444.length; var9++) {
                if (this.field3444[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3437[var8];
            boolean var11 = this.field3465 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class127) field3438.method3347((long) var10);
            if (var3 == null) {
                var3 = class127.method2209(Statics.field3151, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2223();
                }
                field3438.method3346(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3467 == 128 && this.field3468 == 128 && this.field3441 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3470 == 0 && this.field3471 == 0 && this.field3472 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class127 var14 = new class127(var3, arg1 == 0 && !var12 && !var13, this.field3446 == null, this.field3448 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2267(256);
            var14.method2248(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2216();
        } else if (var15 == 2) {
            var14.method2214();
        } else if (var15 == 3) {
            var14.method2217();
        }
        if (this.field3446 != null) {
            for (int var16 = 0; var16 < this.field3446.length; var16++) {
                var14.method2258(this.field3446[var16], this.field3447[var16]);
            }
        }
        if (this.field3448 != null) {
            for (int var17 = 0; var17 < this.field3448.length; var17++) {
                var14.method2260(this.field3448[var17], this.field3442[var17]);
            }
        }
        if (var12) {
            var14.method2261(this.field3467, this.field3468, this.field3441);
        }
        if (var13) {
            var14.method2248(this.field3470, this.field3471, this.field3472);
        }
        return var14;
    }

    @ObfuscatedName("iq.d(I)Liq;")
    public final class257 method4204() {
        int var1 = -1;
        if (this.field3484 != -1) {
            var1 = class213.method1008(this.field3484);
        } else if (this.field3482 != -1) {
            var1 = class213.field2609[this.field3482];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3476.length - 1) {
            var2 = this.field3476[var1];
        } else {
            var2 = this.field3476[this.field3476.length - 1];
        }
        return var2 == -1 ? null : method2716(var2);
    }

    @ObfuscatedName("iq.l(III)I")
    public int method4202(int arg0, int arg1) {
        return class251.method161(this.field3463, arg0, arg1);
    }

    @ObfuscatedName("iq.c(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4206(int arg0, String arg1) {
        return class251.method564(this.field3463, arg0, arg1);
    }

    @ObfuscatedName("iq.u(S)Z")
    public boolean method4194() {
        if (this.field3476 == null) {
            return this.field3479 != -1 || this.field3483 != null;
        }
        for (int var1 = 0; var1 < this.field3476.length; var1++) {
            if (this.field3476[var1] != -1) {
                class257 var2 = method2716(this.field3476[var1]);
                if (var2.field3479 != -1 || var2.field3483 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
