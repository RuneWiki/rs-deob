package deob;

@ObfuscatedName("is")
public class class256 extends class195 {

    @ObfuscatedName("is.e")
    public static boolean field3427 = false;

    @ObfuscatedName("is.g")
    public static class190 field3417 = new class190(4096);

    @ObfuscatedName("is.d")
    public static class190 field3439 = new class190(500);

    @ObfuscatedName("is.b")
    public static class190 field3419 = new class190(30);

    @ObfuscatedName("is.k")
    public static class190 field3420 = new class190(30);

    @ObfuscatedName("is.f")
    public static class128[] field3421 = new class128[4];

    @ObfuscatedName("is.j")
    public int field3422;

    @ObfuscatedName("is.q")
    public int[] field3423;

    @ObfuscatedName("is.h")
    public int[] field3424;

    @ObfuscatedName("is.i")
    public String field3435 = "null";

    @ObfuscatedName("is.s")
    public short[] field3426;

    @ObfuscatedName("is.n")
    public short[] field3448;

    @ObfuscatedName("is.c")
    public short[] field3428;

    @ObfuscatedName("is.v")
    public short[] field3450;

    @ObfuscatedName("is.u")
    public int field3436 = 1;

    @ObfuscatedName("is.w")
    public int field3431 = 1;

    @ObfuscatedName("is.z")
    public int field3443 = 2;

    @ObfuscatedName("is.y")
    public boolean field3433 = true;

    @ObfuscatedName("is.p")
    public int field3430 = -1;

    @ObfuscatedName("is.l")
    public int field3464 = -1;

    @ObfuscatedName("is.x")
    public boolean field3441 = false;

    @ObfuscatedName("is.r")
    public boolean field3432 = false;

    @ObfuscatedName("is.t")
    public int field3438 = -1;

    @ObfuscatedName("is.a")
    public int field3429 = 16;

    @ObfuscatedName("is.ad")
    public int field3456 = 0;

    @ObfuscatedName("is.ay")
    public int field3459 = 0;

    @ObfuscatedName("is.am")
    public String[] field3418 = new String[5];

    @ObfuscatedName("is.ae")
    public int field3458 = -1;

    @ObfuscatedName("is.az")
    public int field3444 = -1;

    @ObfuscatedName("is.ar")
    public boolean field3445 = false;

    @ObfuscatedName("is.ai")
    public boolean field3446 = true;

    @ObfuscatedName("is.ap")
    public int field3447 = 128;

    @ObfuscatedName("is.al")
    public int field3414 = 128;

    @ObfuscatedName("is.aw")
    public int field3449 = 128;

    @ObfuscatedName("is.ak")
    public int field3434 = 0;

    @ObfuscatedName("is.ax")
    public int field3451 = 0;

    @ObfuscatedName("is.at")
    public int field3452 = 0;

    @ObfuscatedName("is.ao")
    public boolean field3453 = false;

    @ObfuscatedName("is.aq")
    public boolean field3454 = false;

    @ObfuscatedName("is.ab")
    public int field3455 = -1;

    @ObfuscatedName("is.as")
    public int[] field3437;

    @ObfuscatedName("is.av")
    public int field3457 = -1;

    @ObfuscatedName("is.ac")
    public int field3425 = -1;

    @ObfuscatedName("is.ag")
    public int field3442 = -1;

    @ObfuscatedName("is.au")
    public int field3460 = 0;

    @ObfuscatedName("is.aa")
    public int field3461 = 0;

    @ObfuscatedName("is.an")
    public int field3462 = 0;

    @ObfuscatedName("is.aj")
    public int[] field3463;

    @ObfuscatedName("is.af")
    public class187 field3440;

    @ObfuscatedName("jn.e(II)Lis;")
    public static class256 method4379(int arg0) {
        class256 var1 = (class256) field3417.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3415.method3760(6, arg0);
        class256 var3 = new class256();
        var3.field3422 = arg0;
        if (var2 != null) {
            var3.method4146(new class174(var2));
        }
        var3.method4163();
        if (var3.field3454) {
            var3.field3443 = 0;
            var3.field3433 = false;
        }
        field3417.method3250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.o(B)V")
    public void method4163() {
        if (this.field3430 == -1) {
            this.field3430 = 0;
            if (this.field3423 != null && (this.field3424 == null || this.field3424[0] == 10)) {
                this.field3430 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3418[var1] != null) {
                    this.field3430 = 1;
                }
            }
        }
        if (this.field3455 == -1) {
            this.field3455 = this.field3443 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("is.m(Lfw;I)V")
    public void method4146(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method4147(arg0, var2);
        }
    }

    @ObfuscatedName("is.g(Lfw;II)V")
    public void method4147(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2891();
            if (var3 > 0) {
                if (this.field3423 == null || field3427) {
                    this.field3424 = new int[var3];
                    this.field3423 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3423[var4] = arg0.method2930();
                        this.field3424[var4] = arg0.method2891();
                    }
                } else {
                    arg0.field2370 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3435 = arg0.method2899();
        } else if (arg1 == 5) {
            int var5 = arg0.method2891();
            if (var5 > 0) {
                if (this.field3423 == null || field3427) {
                    this.field3424 = null;
                    this.field3423 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3423[var6] = arg0.method2930();
                    }
                } else {
                    arg0.field2370 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3436 = arg0.method2891();
        } else if (arg1 == 15) {
            this.field3431 = arg0.method2891();
        } else if (arg1 == 17) {
            this.field3443 = 0;
            this.field3433 = false;
        } else if (arg1 == 18) {
            this.field3433 = false;
        } else if (arg1 == 19) {
            this.field3430 = arg0.method2891();
        } else if (arg1 == 21) {
            this.field3464 = 0;
        } else if (arg1 == 22) {
            this.field3441 = true;
        } else if (arg1 == 23) {
            this.field3432 = true;
        } else if (arg1 == 24) {
            this.field3438 = arg0.method2930();
            if (this.field3438 == 65535) {
                this.field3438 = -1;
            }
        } else if (arg1 == 27) {
            this.field3443 = 1;
        } else if (arg1 == 28) {
            this.field3429 = arg0.method2891();
        } else if (arg1 == 29) {
            this.field3456 = arg0.method2944();
        } else if (arg1 == 39) {
            this.field3459 = arg0.method2944() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3418[arg1 - 30] = arg0.method2899();
            if (this.field3418[arg1 - 30].equalsIgnoreCase(class226.field2837)) {
                this.field3418[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2891();
            this.field3426 = new short[var7];
            this.field3448 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3426[var8] = (short) arg0.method2930();
                this.field3448[var8] = (short) arg0.method2930();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2891();
            this.field3428 = new short[var9];
            this.field3450 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3428[var10] = (short) arg0.method2930();
                this.field3450[var10] = (short) arg0.method2930();
            }
        } else if (arg1 == 62) {
            this.field3445 = true;
        } else if (arg1 == 64) {
            this.field3446 = false;
        } else if (arg1 == 65) {
            this.field3447 = arg0.method2930();
        } else if (arg1 == 66) {
            this.field3414 = arg0.method2930();
        } else if (arg1 == 67) {
            this.field3449 = arg0.method2930();
        } else if (arg1 == 68) {
            this.field3444 = arg0.method2930();
        } else if (arg1 == 69) {
            arg0.method2891();
        } else if (arg1 == 70) {
            this.field3434 = arg0.method2894();
        } else if (arg1 == 71) {
            this.field3451 = arg0.method2894();
        } else if (arg1 == 72) {
            this.field3452 = arg0.method2894();
        } else if (arg1 == 73) {
            this.field3453 = true;
        } else if (arg1 == 74) {
            this.field3454 = true;
        } else if (arg1 == 75) {
            this.field3455 = arg0.method2891();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3457 = arg0.method2930();
            if (this.field3457 == 65535) {
                this.field3457 = -1;
            }
            this.field3425 = arg0.method2930();
            if (this.field3425 == 65535) {
                this.field3425 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2930();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2891();
            this.field3437 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3437[var15] = arg0.method2930();
                if (this.field3437[var15] == 65535) {
                    this.field3437[var15] = -1;
                }
            }
            this.field3437[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3442 = arg0.method2930();
            this.field3460 = arg0.method2891();
        } else if (arg1 == 79) {
            this.field3461 = arg0.method2930();
            this.field3462 = arg0.method2930();
            this.field3460 = arg0.method2891();
            int var11 = arg0.method2891();
            this.field3463 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3463[var12] = arg0.method2930();
            }
        } else if (arg1 == 81) {
            this.field3464 = arg0.method2891() * 256;
        } else if (arg1 == 82) {
            this.field3458 = arg0.method2930();
        } else if (arg1 == 249) {
            this.field3440 = class250.method925(arg0, this.field3440);
        }
    }

    @ObfuscatedName("is.d(II)Z")
    public final boolean method4180(int arg0) {
        if (this.field3424 != null) {
            for (int var4 = 0; var4 < this.field3424.length; var4++) {
                if (this.field3424[var4] == arg0) {
                    return Statics.field3416.method3798(this.field3423[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3423 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3423.length; var3++) {
                var2 &= Statics.field3416.method3798(this.field3423[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("is.b(I)Z")
    public final boolean method4149() {
        if (this.field3423 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3423.length; var2++) {
            var1 &= Statics.field3416.method3798(this.field3423[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("is.k(II[[IIIIB)Leq;")
    public final class142 method4150(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3424 == null) {
            var7 = (long) ((this.field3422 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3422 << 10) + (arg0 << 3) + arg1);
        }
        class142 var9 = (class142) field3419.method3248(var7);
        if (var9 == null) {
            class128 var10 = this.method4156(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3441) {
                var10.field1824 = (short) (this.field3456 + 64);
                var10.field1801 = (short) (this.field3459 + 768);
                var10.method2193();
                var9 = var10;
            } else {
                var9 = var10.method2226(this.field3456 + 64, this.field3459 + 768, -50, -10, -50);
            }
            field3419.method3250(var9, var7);
        }
        if (this.field3441) {
            var9 = ((class128) var9).method2182();
        }
        if (this.field3464 >= 0) {
            if (var9 instanceof class134) {
                var9 = ((class134) var9).method2276(arg2, arg3, arg4, arg5, true, this.field3464);
            } else if (var9 instanceof class128) {
                var9 = ((class128) var9).method2200(arg2, arg3, arg4, arg5, true, this.field3464);
            }
        }
        return var9;
    }

    @ObfuscatedName("is.q(II[[IIIII)Leo;")
    public final class134 method4151(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3424 == null) {
            var7 = (long) ((this.field3422 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3422 << 10) + (arg0 << 3) + arg1);
        }
        class134 var9 = (class134) field3420.method3248(var7);
        if (var9 == null) {
            class128 var10 = this.method4156(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2226(this.field3456 + 64, this.field3459 + 768, -50, -10, -50);
            field3420.method3250(var9, var7);
        }
        if (this.field3464 >= 0) {
            var9 = var9.method2276(arg2, arg3, arg4, arg5, true, this.field3464);
        }
        return var9;
    }

    @ObfuscatedName("is.h(II[[IIIILju;II)Leo;")
    public final class134 method4152(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class261 arg6, int arg7) {
        long var9;
        if (this.field3424 == null) {
            var9 = (long) ((this.field3422 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3422 << 10) + (arg0 << 3) + arg1);
        }
        class134 var11 = (class134) field3420.method3248(var9);
        if (var11 == null) {
            class128 var12 = this.method4156(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2226(this.field3456 + 64, this.field3459 + 768, -50, -10, -50);
            field3420.method3250(var11, var9);
        }
        if (arg6 == null && this.field3464 == -1) {
            return var11;
        }
        class134 var13;
        if (arg6 == null) {
            var13 = var11.method2277(true);
        } else {
            var13 = arg6.method4335(var11, arg7, arg1);
        }
        if (this.field3464 >= 0) {
            var13 = var13.method2276(arg2, arg3, arg4, arg5, false, this.field3464);
        }
        return var13;
    }

    @ObfuscatedName("is.i(III)Ldz;")
    public final class128 method4156(int arg0, int arg1) {
        class128 var3 = null;
        if (this.field3424 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3423 == null) {
                return null;
            }
            boolean var4 = this.field3445;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3423.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3423[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class128) field3439.method3248((long) var7);
                if (var3 == null) {
                    var3 = class128.method2202(Statics.field3416, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2222();
                    }
                    field3439.method3250(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3421[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class128(field3421, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3424.length; var9++) {
                if (this.field3424[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3423[var8];
            boolean var11 = this.field3445 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class128) field3439.method3248((long) var10);
            if (var3 == null) {
                var3 = class128.method2202(Statics.field3416, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2222();
                }
                field3439.method3250(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3447 == 128 && this.field3414 == 128 && this.field3449 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3434 == 0 && this.field3451 == 0 && this.field3452 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class128 var14 = new class128(var3, arg1 == 0 && !var12 && !var13, this.field3426 == null, this.field3428 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2205(256);
            var14.method2188(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2177();
        } else if (var15 == 2) {
            var14.method2238();
        } else if (var15 == 3) {
            var14.method2186();
        }
        if (this.field3426 != null) {
            for (int var16 = 0; var16 < this.field3426.length; var16++) {
                var14.method2189(this.field3426[var16], this.field3448[var16]);
            }
        }
        if (this.field3428 != null) {
            for (int var17 = 0; var17 < this.field3428.length; var17++) {
                var14.method2190(this.field3428[var17], this.field3450[var17]);
            }
        }
        if (var12) {
            var14.method2214(this.field3447, this.field3414, this.field3449);
        }
        if (var13) {
            var14.method2188(this.field3434, this.field3451, this.field3452);
        }
        return var14;
    }

    @ObfuscatedName("is.s(I)Lis;")
    public final class256 method4154() {
        int var1 = -1;
        if (this.field3457 != -1) {
            var1 = class212.method56(this.field3457);
        } else if (this.field3425 != -1) {
            var1 = class212.field2589[this.field3425];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3437.length - 1) {
            var2 = this.field3437[var1];
        } else {
            var2 = this.field3437[this.field3437.length - 1];
        }
        return var2 == -1 ? null : method4379(var2);
    }

    @ObfuscatedName("is.n(IIB)I")
    public int method4155(int arg0, int arg1) {
        return class250.method2858(this.field3440, arg0, arg1);
    }

    @ObfuscatedName("is.c(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4197(int arg0, String arg1) {
        return class250.method1539(this.field3440, arg0, arg1);
    }

    @ObfuscatedName("is.v(I)Z")
    public boolean method4194() {
        if (this.field3437 == null) {
            return this.field3442 != -1 || this.field3463 != null;
        }
        for (int var1 = 0; var1 < this.field3437.length; var1++) {
            if (this.field3437[var1] != -1) {
                class256 var2 = method4379(this.field3437[var1]);
                if (var2.field3442 != -1 || var2.field3463 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
