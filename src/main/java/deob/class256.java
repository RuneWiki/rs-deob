package deob;

@ObfuscatedName("iu")
public class class256 extends class195 {

    @ObfuscatedName("iu.i")
    public static boolean field3453 = false;

    @ObfuscatedName("iu.v")
    public static class190 field3441 = new class190(4096);

    @ObfuscatedName("iu.b")
    public static class190 field3456 = new class190(500);

    @ObfuscatedName("iu.y")
    public static class190 field3437 = new class190(30);

    @ObfuscatedName("iu.h")
    public static class190 field3448 = new class190(30);

    @ObfuscatedName("iu.x")
    public static class128[] field3435 = new class128[4];

    @ObfuscatedName("iu.f")
    public int field3440;

    @ObfuscatedName("iu.n")
    public int[] field3434;

    @ObfuscatedName("iu.a")
    public int[] field3442;

    @ObfuscatedName("iu.o")
    public String field3470 = "null";

    @ObfuscatedName("iu.z")
    public short[] field3444;

    @ObfuscatedName("iu.q")
    public short[] field3480;

    @ObfuscatedName("iu.j")
    public short[] field3446;

    @ObfuscatedName("iu.k")
    public short[] field3447;

    @ObfuscatedName("iu.r")
    public int field3469 = 1;

    @ObfuscatedName("iu.m")
    public int field3449 = 1;

    @ObfuscatedName("iu.d")
    public int field3472 = 2;

    @ObfuscatedName("iu.s")
    public boolean field3451 = true;

    @ObfuscatedName("iu.g")
    public int field3452 = -1;

    @ObfuscatedName("iu.w")
    public int field3433 = -1;

    @ObfuscatedName("iu.p")
    public boolean field3454 = false;

    @ObfuscatedName("iu.l")
    public boolean field3438 = false;

    @ObfuscatedName("iu.u")
    public int field3445 = -1;

    @ObfuscatedName("iu.t")
    public int field3436 = 16;

    @ObfuscatedName("iu.ad")
    public int field3439 = 0;

    @ObfuscatedName("iu.ar")
    public int field3459 = 0;

    @ObfuscatedName("iu.an")
    public String[] field3461 = new String[5];

    @ObfuscatedName("iu.af")
    public int field3455 = -1;

    @ObfuscatedName("iu.at")
    public int field3462 = -1;

    @ObfuscatedName("iu.ah")
    public boolean field3463 = false;

    @ObfuscatedName("iu.ai")
    public boolean field3458 = true;

    @ObfuscatedName("iu.aw")
    public int field3465 = 128;

    @ObfuscatedName("iu.al")
    public int field3466 = 128;

    @ObfuscatedName("iu.ab")
    public int field3467 = 128;

    @ObfuscatedName("iu.aa")
    public int field3464 = 0;

    @ObfuscatedName("iu.ap")
    public int field3457 = 0;

    @ObfuscatedName("iu.ae")
    public int field3450 = 0;

    @ObfuscatedName("iu.as")
    public boolean field3471 = false;

    @ObfuscatedName("iu.av")
    public boolean field3443 = false;

    @ObfuscatedName("iu.ag")
    public int field3473 = -1;

    @ObfuscatedName("iu.az")
    public int[] field3474;

    @ObfuscatedName("iu.ac")
    public int field3475 = -1;

    @ObfuscatedName("iu.ax")
    public int field3476 = -1;

    @ObfuscatedName("iu.au")
    public int field3477 = -1;

    @ObfuscatedName("iu.aj")
    public int field3478 = 0;

    @ObfuscatedName("iu.aq")
    public int field3479 = 0;

    @ObfuscatedName("iu.ay")
    public int field3460 = 0;

    @ObfuscatedName("iu.ak")
    public int[] field3481;

    @ObfuscatedName("iu.ao")
    public class187 field3482;

    @ObfuscatedName("iu.c(B)V")
    public void method4212() {
        if (this.field3452 == -1) {
            this.field3452 = 0;
            if (this.field3434 != null && (this.field3442 == null || this.field3442[0] == 10)) {
                this.field3452 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3461[var1] != null) {
                    this.field3452 = 1;
                }
            }
        }
        if (this.field3473 == -1) {
            this.field3473 = this.field3472 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("iu.e(Lfx;B)V")
    public void method4175(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method4201(arg0, var2);
        }
    }

    @ObfuscatedName("iu.v(Lfx;II)V")
    public void method4201(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2870();
            if (var3 > 0) {
                if (this.field3434 == null || field3453) {
                    this.field3442 = new int[var3];
                    this.field3434 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3434[var4] = arg0.method2872();
                        this.field3442[var4] = arg0.method2870();
                    }
                } else {
                    arg0.field2407 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3470 = arg0.method2878();
        } else if (arg1 == 5) {
            int var5 = arg0.method2870();
            if (var5 > 0) {
                if (this.field3434 == null || field3453) {
                    this.field3442 = null;
                    this.field3434 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3434[var6] = arg0.method2872();
                    }
                } else {
                    arg0.field2407 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3469 = arg0.method2870();
        } else if (arg1 == 15) {
            this.field3449 = arg0.method2870();
        } else if (arg1 == 17) {
            this.field3472 = 0;
            this.field3451 = false;
        } else if (arg1 == 18) {
            this.field3451 = false;
        } else if (arg1 == 19) {
            this.field3452 = arg0.method2870();
        } else if (arg1 == 21) {
            this.field3433 = 0;
        } else if (arg1 == 22) {
            this.field3454 = true;
        } else if (arg1 == 23) {
            this.field3438 = true;
        } else if (arg1 == 24) {
            this.field3445 = arg0.method2872();
            if (this.field3445 == 65535) {
                this.field3445 = -1;
            }
        } else if (arg1 == 27) {
            this.field3472 = 1;
        } else if (arg1 == 28) {
            this.field3436 = arg0.method2870();
        } else if (arg1 == 29) {
            this.field3439 = arg0.method2938();
        } else if (arg1 == 39) {
            this.field3459 = arg0.method2938() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3461[arg1 - 30] = arg0.method2878();
            if (this.field3461[arg1 - 30].equalsIgnoreCase(class226.field3014)) {
                this.field3461[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2870();
            this.field3444 = new short[var7];
            this.field3480 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3444[var8] = (short) arg0.method2872();
                this.field3480[var8] = (short) arg0.method2872();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2870();
            this.field3446 = new short[var9];
            this.field3447 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3446[var10] = (short) arg0.method2872();
                this.field3447[var10] = (short) arg0.method2872();
            }
        } else if (arg1 == 62) {
            this.field3463 = true;
        } else if (arg1 == 64) {
            this.field3458 = false;
        } else if (arg1 == 65) {
            this.field3465 = arg0.method2872();
        } else if (arg1 == 66) {
            this.field3466 = arg0.method2872();
        } else if (arg1 == 67) {
            this.field3467 = arg0.method2872();
        } else if (arg1 == 68) {
            this.field3462 = arg0.method2872();
        } else if (arg1 == 69) {
            arg0.method2870();
        } else if (arg1 == 70) {
            this.field3464 = arg0.method2873();
        } else if (arg1 == 71) {
            this.field3457 = arg0.method2873();
        } else if (arg1 == 72) {
            this.field3450 = arg0.method2873();
        } else if (arg1 == 73) {
            this.field3471 = true;
        } else if (arg1 == 74) {
            this.field3443 = true;
        } else if (arg1 == 75) {
            this.field3473 = arg0.method2870();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3475 = arg0.method2872();
            if (this.field3475 == 65535) {
                this.field3475 = -1;
            }
            this.field3476 = arg0.method2872();
            if (this.field3476 == 65535) {
                this.field3476 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2872();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2870();
            this.field3474 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3474[var15] = arg0.method2872();
                if (this.field3474[var15] == 65535) {
                    this.field3474[var15] = -1;
                }
            }
            this.field3474[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3477 = arg0.method2872();
            this.field3478 = arg0.method2870();
        } else if (arg1 == 79) {
            this.field3479 = arg0.method2872();
            this.field3460 = arg0.method2872();
            this.field3478 = arg0.method2870();
            int var11 = arg0.method2870();
            this.field3481 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3481[var12] = arg0.method2872();
            }
        } else if (arg1 == 81) {
            this.field3433 = arg0.method2870() * 256;
        } else if (arg1 == 82) {
            this.field3455 = arg0.method2872();
        } else if (arg1 == 249) {
            this.field3482 = class250.method1933(arg0, this.field3482);
        }
    }

    @ObfuscatedName("iu.b(II)Z")
    public final boolean method4177(int arg0) {
        if (this.field3442 != null) {
            for (int var4 = 0; var4 < this.field3442.length; var4++) {
                if (this.field3442[var4] == arg0) {
                    return Statics.field3378.method3771(this.field3434[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3434 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3434.length; var3++) {
                var2 &= Statics.field3378.method3771(this.field3434[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iu.y(B)Z")
    public final boolean method4178() {
        if (this.field3434 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3434.length; var2++) {
            var1 &= Statics.field3378.method3771(this.field3434[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("iu.h(II[[IIIIB)Let;")
    public final class142 method4196(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3442 == null) {
            var7 = (long) ((this.field3440 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3440 << 10) + (arg0 << 3) + arg1);
        }
        class142 var9 = (class142) field3437.method3220(var7);
        if (var9 == null) {
            class128 var10 = this.method4182(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3454) {
                var10.field1842 = (short) (this.field3439 + 64);
                var10.field1845 = (short) (this.field3459 + 768);
                var10.method2194();
                var9 = var10;
            } else {
                var9 = var10.method2198(this.field3439 + 64, this.field3459 + 768, -50, -10, -50);
            }
            field3437.method3222(var9, var7);
        }
        if (this.field3454) {
            var9 = ((class128) var9).method2182();
        }
        if (this.field3433 >= 0) {
            if (var9 instanceof class134) {
                var9 = ((class134) var9).method2332(arg2, arg3, arg4, arg5, true, this.field3433);
            } else if (var9 instanceof class128) {
                var9 = ((class128) var9).method2183(arg2, arg3, arg4, arg5, true, this.field3433);
            }
        }
        return var9;
    }

    @ObfuscatedName("iu.x(II[[IIIII)Led;")
    public final class134 method4180(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3442 == null) {
            var7 = (long) ((this.field3440 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3440 << 10) + (arg0 << 3) + arg1);
        }
        class134 var9 = (class134) field3448.method3220(var7);
        if (var9 == null) {
            class128 var10 = this.method4182(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2198(this.field3439 + 64, this.field3459 + 768, -50, -10, -50);
            field3448.method3222(var9, var7);
        }
        if (this.field3433 >= 0) {
            var9 = var9.method2332(arg2, arg3, arg4, arg5, true, this.field3433);
        }
        return var9;
    }

    @ObfuscatedName("iu.f(II[[IIIILje;II)Led;")
    public final class134 method4181(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class261 arg6, int arg7) {
        long var9;
        if (this.field3442 == null) {
            var9 = (long) ((this.field3440 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3440 << 10) + (arg0 << 3) + arg1);
        }
        class134 var11 = (class134) field3448.method3220(var9);
        if (var11 == null) {
            class128 var12 = this.method4182(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2198(this.field3439 + 64, this.field3459 + 768, -50, -10, -50);
            field3448.method3222(var11, var9);
        }
        if (arg6 == null && this.field3433 == -1) {
            return var11;
        }
        class134 var13;
        if (arg6 == null) {
            var13 = var11.method2322(true);
        } else {
            var13 = arg6.method4337(var11, arg7, arg1);
        }
        if (this.field3433 >= 0) {
            var13 = var13.method2332(arg2, arg3, arg4, arg5, false, this.field3433);
        }
        return var13;
    }

    @ObfuscatedName("iu.n(III)Ldw;")
    public final class128 method4182(int arg0, int arg1) {
        class128 var3 = null;
        if (this.field3442 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3434 == null) {
                return null;
            }
            boolean var4 = this.field3463;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3434.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3434[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class128) field3456.method3220((long) var7);
                if (var3 == null) {
                    var3 = class128.method2208(Statics.field3378, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2192();
                    }
                    field3456.method3222(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3435[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class128(field3435, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3442.length; var9++) {
                if (this.field3442[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3434[var8];
            boolean var11 = this.field3463 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class128) field3456.method3220((long) var10);
            if (var3 == null) {
                var3 = class128.method2208(Statics.field3378, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2192();
                }
                field3456.method3222(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3465 == 128 && this.field3466 == 128 && this.field3467 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3464 == 0 && this.field3457 == 0 && this.field3450 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class128 var14 = new class128(var3, arg1 == 0 && !var12 && !var13, this.field3444 == null, this.field3446 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2236(256);
            var14.method2189(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2185();
        } else if (var15 == 2) {
            var14.method2206();
        } else if (var15 == 3) {
            var14.method2188();
        }
        if (this.field3444 != null) {
            for (int var16 = 0; var16 < this.field3444.length; var16++) {
                var14.method2190(this.field3444[var16], this.field3480[var16]);
            }
        }
        if (this.field3446 != null) {
            for (int var17 = 0; var17 < this.field3446.length; var17++) {
                var14.method2231(this.field3446[var17], this.field3447[var17]);
            }
        }
        if (var12) {
            var14.method2193(this.field3465, this.field3466, this.field3467);
        }
        if (var13) {
            var14.method2189(this.field3464, this.field3457, this.field3450);
        }
        return var14;
    }

    @ObfuscatedName("iu.a(B)Liu;")
    public final class256 method4204() {
        int var1 = -1;
        if (this.field3475 != -1) {
            var1 = class212.method2144(this.field3475);
        } else if (this.field3476 != -1) {
            var1 = class212.field2609[this.field3476];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3474.length - 1) {
            var2 = this.field3474[var1];
        } else {
            var2 = this.field3474[this.field3474.length - 1];
        }
        return var2 == -1 ? null : Statics.method3743(var2);
    }

    @ObfuscatedName("iu.o(IIB)I")
    public int method4184(int arg0, int arg1) {
        return class250.method1453(this.field3482, arg0, arg1);
    }

    @ObfuscatedName("iu.z(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4185(int arg0, String arg1) {
        return class250.method446(this.field3482, arg0, arg1);
    }

    @ObfuscatedName("iu.q(I)Z")
    public boolean method4186() {
        if (this.field3474 == null) {
            return this.field3477 != -1 || this.field3481 != null;
        }
        for (int var1 = 0; var1 < this.field3474.length; var1++) {
            if (this.field3474[var1] != -1) {
                class256 var2 = Statics.method3743(this.field3474[var1]);
                if (var2.field3477 != -1 || var2.field3481 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
