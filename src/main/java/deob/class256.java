package deob;

@ObfuscatedName("ij")
public class class256 extends class195 {

    @ObfuscatedName("ij.p")
    public static boolean field3468 = false;

    @ObfuscatedName("ij.t")
    public static class190 field3490 = new class190(4096);

    @ObfuscatedName("ij.w")
    public static class190 field3454 = new class190(500);

    @ObfuscatedName("ij.z")
    public static class190 field3447 = new class190(30);

    @ObfuscatedName("ij.j")
    public static class190 field3442 = new class190(30);

    @ObfuscatedName("ij.i")
    public static class128[] field3449 = new class128[4];

    @ObfuscatedName("ij.f")
    public int field3462;

    @ObfuscatedName("ij.c")
    public int[] field3451;

    @ObfuscatedName("ij.o")
    public int[] field3452;

    @ObfuscatedName("ij.q")
    public String field3453 = "null";

    @ObfuscatedName("ij.n")
    public short[] field3487;

    @ObfuscatedName("ij.a")
    public short[] field3455;

    @ObfuscatedName("ij.g")
    public short[] field3456;

    @ObfuscatedName("ij.v")
    public short[] field3457;

    @ObfuscatedName("ij.s")
    public int field3458 = 1;

    @ObfuscatedName("ij.k")
    public int field3459 = 1;

    @ObfuscatedName("ij.r")
    public int field3477 = 2;

    @ObfuscatedName("ij.l")
    public boolean field3469 = true;

    @ObfuscatedName("ij.h")
    public int field3446 = -1;

    @ObfuscatedName("ij.d")
    public int field3463 = -1;

    @ObfuscatedName("ij.x")
    public boolean field3464 = false;

    @ObfuscatedName("ij.b")
    public boolean field3480 = false;

    @ObfuscatedName("ij.y")
    public int field3466 = -1;

    @ObfuscatedName("ij.u")
    public int field3476 = 16;

    @ObfuscatedName("ij.av")
    public int field3450 = 0;

    @ObfuscatedName("ij.ax")
    public int field3465 = 0;

    @ObfuscatedName("ij.af")
    public String[] field3470 = new String[5];

    @ObfuscatedName("ij.ae")
    public int field3471 = -1;

    @ObfuscatedName("ij.ap")
    public int field3472 = -1;

    @ObfuscatedName("ij.ak")
    public boolean field3473 = false;

    @ObfuscatedName("ij.al")
    public boolean field3474 = true;

    @ObfuscatedName("ij.ab")
    public int field3444 = 128;

    @ObfuscatedName("ij.am")
    public int field3461 = 128;

    @ObfuscatedName("ij.ar")
    public int field3448 = 128;

    @ObfuscatedName("ij.ao")
    public int field3478 = 0;

    @ObfuscatedName("ij.ac")
    public int field3479 = 0;

    @ObfuscatedName("ij.aa")
    public int field3486 = 0;

    @ObfuscatedName("ij.ay")
    public boolean field3481 = false;

    @ObfuscatedName("ij.aj")
    public boolean field3482 = false;

    @ObfuscatedName("ij.ag")
    public int field3483 = -1;

    @ObfuscatedName("ij.aq")
    public int[] field3484;

    @ObfuscatedName("ij.as")
    public int field3485 = -1;

    @ObfuscatedName("ij.an")
    public int field3488 = -1;

    @ObfuscatedName("ij.az")
    public int field3475 = -1;

    @ObfuscatedName("ij.ai")
    public int field3467 = 0;

    @ObfuscatedName("ij.aw")
    public int field3489 = 0;

    @ObfuscatedName("ij.au")
    public int field3443 = 0;

    @ObfuscatedName("ij.ah")
    public int[] field3491;

    @ObfuscatedName("ij.ad")
    public class187 field3492;

    @ObfuscatedName("ae.p(II)Lij;")
    public static class256 method239(int arg0) {
        class256 var1 = (class256) field3490.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3445.method3720(6, arg0);
        class256 var3 = new class256();
        var3.field3462 = arg0;
        if (var2 != null) {
            var3.method4086(new class174(var2));
        }
        var3.method4085();
        if (var3.field3482) {
            var3.field3477 = 0;
            var3.field3469 = false;
        }
        field3490.method3179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.m(B)V")
    public void method4085() {
        if (this.field3446 == -1) {
            this.field3446 = 0;
            if (this.field3451 != null && (this.field3452 == null || this.field3452[0] == 10)) {
                this.field3446 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3470[var1] != null) {
                    this.field3446 = 1;
                }
            }
        }
        if (this.field3483 == -1) {
            this.field3483 = this.field3477 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ij.e(Lfr;I)V")
    public void method4086(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method4097(arg0, var2);
        }
    }

    @ObfuscatedName("ij.t(Lfr;II)V")
    public void method4097(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2810();
            if (var3 > 0) {
                if (this.field3451 == null || field3468) {
                    this.field3452 = new int[var3];
                    this.field3451 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3451[var4] = arg0.method2824();
                        this.field3452[var4] = arg0.method2810();
                    }
                } else {
                    arg0.field2408 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3453 = arg0.method2818();
        } else if (arg1 == 5) {
            int var5 = arg0.method2810();
            if (var5 > 0) {
                if (this.field3451 == null || field3468) {
                    this.field3452 = null;
                    this.field3451 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3451[var6] = arg0.method2824();
                    }
                } else {
                    arg0.field2408 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3458 = arg0.method2810();
        } else if (arg1 == 15) {
            this.field3459 = arg0.method2810();
        } else if (arg1 == 17) {
            this.field3477 = 0;
            this.field3469 = false;
        } else if (arg1 == 18) {
            this.field3469 = false;
        } else if (arg1 == 19) {
            this.field3446 = arg0.method2810();
        } else if (arg1 == 21) {
            this.field3463 = 0;
        } else if (arg1 == 22) {
            this.field3464 = true;
        } else if (arg1 == 23) {
            this.field3480 = true;
        } else if (arg1 == 24) {
            this.field3466 = arg0.method2824();
            if (this.field3466 == 65535) {
                this.field3466 = -1;
            }
        } else if (arg1 == 27) {
            this.field3477 = 1;
        } else if (arg1 == 28) {
            this.field3476 = arg0.method2810();
        } else if (arg1 == 29) {
            this.field3450 = arg0.method2811();
        } else if (arg1 == 39) {
            this.field3465 = arg0.method2811() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3470[arg1 - 30] = arg0.method2818();
            if (this.field3470[arg1 - 30].equalsIgnoreCase(class226.field2866)) {
                this.field3470[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2810();
            this.field3487 = new short[var7];
            this.field3455 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3487[var8] = (short) arg0.method2824();
                this.field3455[var8] = (short) arg0.method2824();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2810();
            this.field3456 = new short[var9];
            this.field3457 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3456[var10] = (short) arg0.method2824();
                this.field3457[var10] = (short) arg0.method2824();
            }
        } else if (arg1 == 62) {
            this.field3473 = true;
        } else if (arg1 == 64) {
            this.field3474 = false;
        } else if (arg1 == 65) {
            this.field3444 = arg0.method2824();
        } else if (arg1 == 66) {
            this.field3461 = arg0.method2824();
        } else if (arg1 == 67) {
            this.field3448 = arg0.method2824();
        } else if (arg1 == 68) {
            this.field3472 = arg0.method2824();
        } else if (arg1 == 69) {
            arg0.method2810();
        } else if (arg1 == 70) {
            this.field3478 = arg0.method3001();
        } else if (arg1 == 71) {
            this.field3479 = arg0.method3001();
        } else if (arg1 == 72) {
            this.field3486 = arg0.method3001();
        } else if (arg1 == 73) {
            this.field3481 = true;
        } else if (arg1 == 74) {
            this.field3482 = true;
        } else if (arg1 == 75) {
            this.field3483 = arg0.method2810();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3485 = arg0.method2824();
            if (this.field3485 == 65535) {
                this.field3485 = -1;
            }
            this.field3488 = arg0.method2824();
            if (this.field3488 == 65535) {
                this.field3488 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2824();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2810();
            this.field3484 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3484[var15] = arg0.method2824();
                if (this.field3484[var15] == 65535) {
                    this.field3484[var15] = -1;
                }
            }
            this.field3484[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3475 = arg0.method2824();
            this.field3467 = arg0.method2810();
        } else if (arg1 == 79) {
            this.field3489 = arg0.method2824();
            this.field3443 = arg0.method2824();
            this.field3467 = arg0.method2810();
            int var11 = arg0.method2810();
            this.field3491 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3491[var12] = arg0.method2824();
            }
        } else if (arg1 == 81) {
            this.field3463 = arg0.method2810() * 256;
        } else if (arg1 == 82) {
            this.field3471 = arg0.method2824();
        } else if (arg1 == 249) {
            this.field3492 = class250.method2793(arg0, this.field3492);
        }
    }

    @ObfuscatedName("ij.w(II)Z")
    public final boolean method4123(int arg0) {
        if (this.field3452 != null) {
            for (int var4 = 0; var4 < this.field3452.length; var4++) {
                if (this.field3452[var4] == arg0) {
                    return Statics.field3460.method3706(this.field3451[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3451 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3451.length; var3++) {
                var2 &= Statics.field3460.method3706(this.field3451[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ij.z(I)Z")
    public final boolean method4126() {
        if (this.field3451 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3451.length; var2++) {
            var1 &= Statics.field3460.method3706(this.field3451[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ij.j(II[[IIIIB)Lel;")
    public final class142 method4090(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3452 == null) {
            var7 = (long) ((this.field3462 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3462 << 10) + (arg0 << 3) + arg1);
        }
        class142 var9 = (class142) field3447.method3182(var7);
        if (var9 == null) {
            class128 var10 = this.method4093(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3464) {
                var10.field1820 = (short) (this.field3450 + 64);
                var10.field1830 = (short) (this.field3465 + 768);
                var10.method2153();
                var9 = var10;
            } else {
                var9 = var10.method2148(this.field3450 + 64, this.field3465 + 768, -50, -10, -50);
            }
            field3447.method3179(var9, var7);
        }
        if (this.field3464) {
            var9 = ((class128) var9).method2141();
        }
        if (this.field3463 >= 0) {
            if (var9 instanceof class134) {
                var9 = ((class134) var9).method2219(arg2, arg3, arg4, arg5, true, this.field3463);
            } else if (var9 instanceof class128) {
                var9 = ((class128) var9).method2157(arg2, arg3, arg4, arg5, true, this.field3463);
            }
        }
        return var9;
    }

    @ObfuscatedName("ij.c(II[[IIIII)Les;")
    public final class134 method4091(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3452 == null) {
            var7 = (long) ((this.field3462 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3462 << 10) + (arg0 << 3) + arg1);
        }
        class134 var9 = (class134) field3442.method3182(var7);
        if (var9 == null) {
            class128 var10 = this.method4093(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2148(this.field3450 + 64, this.field3465 + 768, -50, -10, -50);
            field3442.method3179(var9, var7);
        }
        if (this.field3463 >= 0) {
            var9 = var9.method2219(arg2, arg3, arg4, arg5, true, this.field3463);
        }
        return var9;
    }

    @ObfuscatedName("ij.o(II[[IIIILjo;IB)Les;")
    public final class134 method4092(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class261 arg6, int arg7) {
        long var9;
        if (this.field3452 == null) {
            var9 = (long) ((this.field3462 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3462 << 10) + (arg0 << 3) + arg1);
        }
        class134 var11 = (class134) field3442.method3182(var9);
        if (var11 == null) {
            class128 var12 = this.method4093(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2148(this.field3450 + 64, this.field3465 + 768, -50, -10, -50);
            field3442.method3179(var11, var9);
        }
        if (arg6 == null && this.field3463 == -1) {
            return var11;
        }
        class134 var13;
        if (arg6 == null) {
            var13 = var11.method2220(true);
        } else {
            var13 = arg6.method4279(var11, arg7, arg1);
        }
        if (this.field3463 >= 0) {
            var13 = var13.method2219(arg2, arg3, arg4, arg5, false, this.field3463);
        }
        return var13;
    }

    @ObfuscatedName("ij.q(IIB)Ldo;")
    public final class128 method4093(int arg0, int arg1) {
        class128 var3 = null;
        if (this.field3452 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3451 == null) {
                return null;
            }
            boolean var4 = this.field3473;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3451.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3451[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class128) field3454.method3182((long) var7);
                if (var3 == null) {
                    var3 = class128.method2137(Statics.field3460, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2198();
                    }
                    field3454.method3179(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3449[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class128(field3449, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3452.length; var9++) {
                if (this.field3452[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3451[var8];
            boolean var11 = this.field3473 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class128) field3454.method3182((long) var10);
            if (var3 == null) {
                var3 = class128.method2137(Statics.field3460, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2198();
                }
                field3454.method3179(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3444 == 128 && this.field3461 == 128 && this.field3448 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3478 == 0 && this.field3479 == 0 && this.field3486 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class128 var14 = new class128(var3, arg1 == 0 && !var12 && !var13, this.field3487 == null, this.field3456 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2156(256);
            var14.method2186(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2185();
        } else if (var15 == 2) {
            var14.method2143();
        } else if (var15 == 3) {
            var14.method2146();
        }
        if (this.field3487 != null) {
            for (int var16 = 0; var16 < this.field3487.length; var16++) {
                var14.method2149(this.field3487[var16], this.field3455[var16]);
            }
        }
        if (this.field3456 != null) {
            for (int var17 = 0; var17 < this.field3456.length; var17++) {
                var14.method2147(this.field3456[var17], this.field3457[var17]);
            }
        }
        if (var12) {
            var14.method2152(this.field3444, this.field3461, this.field3448);
        }
        if (var13) {
            var14.method2186(this.field3478, this.field3479, this.field3486);
        }
        return var14;
    }

    @ObfuscatedName("ij.n(B)Lij;")
    public final class256 method4121() {
        int var1 = -1;
        if (this.field3485 != -1) {
            var1 = class212.method659(this.field3485);
        } else if (this.field3488 != -1) {
            var1 = class212.field2616[this.field3488];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3484.length - 1) {
            var2 = this.field3484[var1];
        } else {
            var2 = this.field3484[this.field3484.length - 1];
        }
        return var2 == -1 ? null : method239(var2);
    }

    @ObfuscatedName("ij.a(III)I")
    public int method4111(int arg0, int arg1) {
        return class250.method1645(this.field3492, arg0, arg1);
    }

    @ObfuscatedName("ij.g(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4096(int arg0, String arg1) {
        return class250.method2742(this.field3492, arg0, arg1);
    }

    @ObfuscatedName("ij.v(I)Z")
    public boolean method4084() {
        if (this.field3484 == null) {
            return this.field3475 != -1 || this.field3491 != null;
        }
        for (int var1 = 0; var1 < this.field3484.length; var1++) {
            if (this.field3484[var1] != -1) {
                class256 var2 = method239(this.field3484[var1]);
                if (var2.field3475 != -1 || var2.field3491 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
