package deob;

@ObfuscatedName("jr")
public class class265 extends class181 {

    @ObfuscatedName("jr.m")
    public static boolean field3449 = false;

    @ObfuscatedName("jr.w")
    public static class146 field3424 = new class146(4096);

    @ObfuscatedName("jr.o")
    public static class146 field3425 = new class146(500);

    @ObfuscatedName("jr.u")
    public static class146 field3426 = new class146(30);

    @ObfuscatedName("jr.g")
    public static class146 field3431 = new class146(30);

    @ObfuscatedName("jr.l")
    public static class122[] field3428 = new class122[4];

    @ObfuscatedName("jr.e")
    public int field3423;

    @ObfuscatedName("jr.x")
    public int[] field3430;

    @ObfuscatedName("jr.d")
    public int[] field3435;

    @ObfuscatedName("jr.k")
    public String field3432 = class236.field2980;

    @ObfuscatedName("jr.n")
    public short[] field3458;

    @ObfuscatedName("jr.i")
    public short[] field3434;

    @ObfuscatedName("jr.a")
    public short[] field3459;

    @ObfuscatedName("jr.z")
    public short[] field3441;

    @ObfuscatedName("jr.j")
    public int field3437 = 1;

    @ObfuscatedName("jr.s")
    public int field3465 = 1;

    @ObfuscatedName("jr.t")
    public int field3442 = 2;

    @ObfuscatedName("jr.y")
    public boolean field3440 = true;

    @ObfuscatedName("jr.h")
    public int field3456 = -1;

    @ObfuscatedName("jr.b")
    public int field3438 = -1;

    @ObfuscatedName("jr.c")
    public boolean field3443 = false;

    @ObfuscatedName("jr.r")
    public boolean field3436 = false;

    @ObfuscatedName("jr.p")
    public int field3445 = -1;

    @ObfuscatedName("jr.v")
    public int field3446 = 16;

    @ObfuscatedName("jr.ag")
    public int field3447 = 0;

    @ObfuscatedName("jr.aq")
    public int field3448 = 0;

    @ObfuscatedName("jr.aj")
    public String[] field3452 = new String[5];

    @ObfuscatedName("jr.av")
    public int field3450 = -1;

    @ObfuscatedName("jr.ar")
    public int field3451 = -1;

    @ObfuscatedName("jr.ac")
    public boolean field3433 = false;

    @ObfuscatedName("jr.ay")
    public boolean field3429 = true;

    @ObfuscatedName("jr.ah")
    public int field3421 = 128;

    @ObfuscatedName("jr.ak")
    public int field3455 = 128;

    @ObfuscatedName("jr.aw")
    public int field3471 = 128;

    @ObfuscatedName("jr.al")
    public int field3457 = 0;

    @ObfuscatedName("jr.ab")
    public int field3453 = 0;

    @ObfuscatedName("jr.ae")
    public int field3461 = 0;

    @ObfuscatedName("jr.at")
    public boolean field3460 = false;

    @ObfuscatedName("jr.ad")
    public boolean field3439 = false;

    @ObfuscatedName("jr.ap")
    public int field3462 = -1;

    @ObfuscatedName("jr.as")
    public int[] field3463;

    @ObfuscatedName("jr.am")
    public int field3464 = -1;

    @ObfuscatedName("jr.an")
    public int field3467 = -1;

    @ObfuscatedName("jr.az")
    public int field3466 = -1;

    @ObfuscatedName("jr.au")
    public int field3468 = 0;

    @ObfuscatedName("jr.ao")
    public int field3444 = 0;

    @ObfuscatedName("jr.aa")
    public int field3469 = 0;

    @ObfuscatedName("jr.ax")
    public int[] field3427;

    @ObfuscatedName("jr.af")
    public class317 field3454;

    @ObfuscatedName("lj.m(Lir;Lir;ZB)V")
    public static void method5548(class245 arg0, class245 arg1, boolean arg2) {
        Statics.field3422 = arg0;
        Statics.field3470 = arg1;
        field3449 = arg2;
    }

    @ObfuscatedName("af.f(II)Ljr;")
    public static class265 method763(int arg0) {
        class265 var1 = (class265) field3424.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3422.method4156(6, arg0);
        class265 var3 = new class265();
        var3.field3423 = arg0;
        if (var2 != null) {
            var3.method4615(new class202(var2));
        }
        var3.method4592();
        if (var3.field3439) {
            var3.field3442 = 0;
            var3.field3440 = false;
        }
        field3424.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jr.q(I)V")
    public void method4592() {
        if (this.field3456 == -1) {
            this.field3456 = 0;
            if (this.field3430 != null && (this.field3435 == null || this.field3435[0] == 10)) {
                this.field3456 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3452[var1] != null) {
                    this.field3456 = 1;
                }
            }
        }
        if (this.field3462 == -1) {
            this.field3462 = this.field3442 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jr.w(Lgr;I)V")
    public void method4615(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4594(arg0, var2);
        }
    }

    @ObfuscatedName("jr.o(Lgr;II)V")
    public void method4594(class202 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3551();
            if (var3 > 0) {
                if (this.field3430 == null || field3449) {
                    this.field3435 = new int[var3];
                    this.field3430 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3430[var4] = arg0.method3530();
                        this.field3435[var4] = arg0.method3551();
                    }
                } else {
                    arg0.field2439 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3432 = arg0.method3426();
        } else if (arg1 == 5) {
            int var5 = arg0.method3551();
            if (var5 > 0) {
                if (this.field3430 == null || field3449) {
                    this.field3435 = null;
                    this.field3430 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3430[var6] = arg0.method3530();
                    }
                } else {
                    arg0.field2439 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3437 = arg0.method3551();
        } else if (arg1 == 15) {
            this.field3465 = arg0.method3551();
        } else if (arg1 == 17) {
            this.field3442 = 0;
            this.field3440 = false;
        } else if (arg1 == 18) {
            this.field3440 = false;
        } else if (arg1 == 19) {
            this.field3456 = arg0.method3551();
        } else if (arg1 == 21) {
            this.field3438 = 0;
        } else if (arg1 == 22) {
            this.field3443 = true;
        } else if (arg1 == 23) {
            this.field3436 = true;
        } else if (arg1 == 24) {
            this.field3445 = arg0.method3530();
            if (this.field3445 == 65535) {
                this.field3445 = -1;
            }
        } else if (arg1 == 27) {
            this.field3442 = 1;
        } else if (arg1 == 28) {
            this.field3446 = arg0.method3551();
        } else if (arg1 == 29) {
            this.field3447 = arg0.method3537();
        } else if (arg1 == 39) {
            this.field3448 = arg0.method3537() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3452[arg1 - 30] = arg0.method3426();
            if (this.field3452[arg1 - 30].equalsIgnoreCase(class236.field2844)) {
                this.field3452[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3551();
            this.field3458 = new short[var7];
            this.field3434 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3458[var8] = (short) arg0.method3530();
                this.field3434[var8] = (short) arg0.method3530();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3551();
            this.field3459 = new short[var9];
            this.field3441 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3459[var10] = (short) arg0.method3530();
                this.field3441[var10] = (short) arg0.method3530();
            }
        } else if (arg1 == 62) {
            this.field3433 = true;
        } else if (arg1 == 64) {
            this.field3429 = false;
        } else if (arg1 == 65) {
            this.field3421 = arg0.method3530();
        } else if (arg1 == 66) {
            this.field3455 = arg0.method3530();
        } else if (arg1 == 67) {
            this.field3471 = arg0.method3530();
        } else if (arg1 == 68) {
            this.field3451 = arg0.method3530();
        } else if (arg1 == 69) {
            arg0.method3551();
        } else if (arg1 == 70) {
            this.field3457 = arg0.method3420();
        } else if (arg1 == 71) {
            this.field3453 = arg0.method3420();
        } else if (arg1 == 72) {
            this.field3461 = arg0.method3420();
        } else if (arg1 == 73) {
            this.field3460 = true;
        } else if (arg1 == 74) {
            this.field3439 = true;
        } else if (arg1 == 75) {
            this.field3462 = arg0.method3551();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3464 = arg0.method3530();
            if (this.field3464 == 65535) {
                this.field3464 = -1;
            }
            this.field3467 = arg0.method3530();
            if (this.field3467 == 65535) {
                this.field3467 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3530();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3551();
            this.field3463 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3463[var15] = arg0.method3530();
                if (this.field3463[var15] == 65535) {
                    this.field3463[var15] = -1;
                }
            }
            this.field3463[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3466 = arg0.method3530();
            this.field3468 = arg0.method3551();
        } else if (arg1 == 79) {
            this.field3444 = arg0.method3530();
            this.field3469 = arg0.method3530();
            this.field3468 = arg0.method3551();
            int var11 = arg0.method3551();
            this.field3427 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3427[var12] = arg0.method3530();
            }
        } else if (arg1 == 81) {
            this.field3438 = arg0.method3551() * 256;
        } else if (arg1 == 82) {
            this.field3450 = arg0.method3530();
        } else if (arg1 == 249) {
            this.field3454 = Statics.method4176(arg0, this.field3454);
        }
    }

    @ObfuscatedName("jr.u(II)Z")
    public final boolean method4636(int arg0) {
        if (this.field3435 != null) {
            for (int var4 = 0; var4 < this.field3435.length; var4++) {
                if (this.field3435[var4] == arg0) {
                    return Statics.field3470.method4158(this.field3430[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3430 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3430.length; var3++) {
                var2 &= Statics.field3470.method4158(this.field3430[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jr.g(I)Z")
    public final boolean method4596() {
        if (this.field3430 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3430.length; var2++) {
            var1 &= Statics.field3470.method4158(this.field3430[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jr.l(II[[IIIIS)Lex;")
    public final class136 method4597(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3435 == null) {
            var7 = (long) ((this.field3423 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3423 << 10) + (arg0 << 3) + arg1);
        }
        class136 var9 = (class136) field3426.method3011(var7);
        if (var9 == null) {
            class122 var10 = this.method4600(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3443) {
                var10.field1530 = (short) (this.field3447 + 64);
                var10.field1549 = (short) (this.field3448 + 768);
                var10.method2546();
                var9 = var10;
            } else {
                var9 = var10.method2572(this.field3447 + 64, this.field3448 + 768, -50, -10, -50);
            }
            field3426.method3009(var9, var7);
        }
        if (this.field3443) {
            var9 = ((class122) var9).method2534();
        }
        if (this.field3438 >= 0) {
            if (var9 instanceof class128) {
                var9 = ((class128) var9).method2645(arg2, arg3, arg4, arg5, true, this.field3438);
            } else if (var9 instanceof class122) {
                var9 = ((class122) var9).method2535(arg2, arg3, arg4, arg5, true, this.field3438);
            }
        }
        return var9;
    }

    @ObfuscatedName("jr.e(II[[IIIIB)Ldu;")
    public final class128 method4591(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3435 == null) {
            var7 = (long) ((this.field3423 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3423 << 10) + (arg0 << 3) + arg1);
        }
        class128 var9 = (class128) field3431.method3011(var7);
        if (var9 == null) {
            class122 var10 = this.method4600(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2572(this.field3447 + 64, this.field3448 + 768, -50, -10, -50);
            field3431.method3009(var9, var7);
        }
        if (this.field3438 >= 0) {
            var9 = var9.method2645(arg2, arg3, arg4, arg5, true, this.field3438);
        }
        return var9;
    }

    @ObfuscatedName("jr.x(II[[IIIILjh;II)Ldu;")
    public final class128 method4599(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class270 arg6, int arg7) {
        long var9;
        if (this.field3435 == null) {
            var9 = (long) ((this.field3423 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3423 << 10) + (arg0 << 3) + arg1);
        }
        class128 var11 = (class128) field3431.method3011(var9);
        if (var11 == null) {
            class122 var12 = this.method4600(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2572(this.field3447 + 64, this.field3448 + 768, -50, -10, -50);
            field3431.method3009(var11, var9);
        }
        if (arg6 == null && this.field3438 == -1) {
            return var11;
        }
        class128 var13;
        if (arg6 == null) {
            var13 = var11.method2647(true);
        } else {
            var13 = arg6.method4769(var11, arg7, arg1);
        }
        if (this.field3438 >= 0) {
            var13 = var13.method2645(arg2, arg3, arg4, arg5, false, this.field3438);
        }
        return var13;
    }

    @ObfuscatedName("jr.d(IIB)Ldw;")
    public final class122 method4600(int arg0, int arg1) {
        class122 var3 = null;
        if (this.field3435 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3430 == null) {
                return null;
            }
            boolean var4 = this.field3433;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3430.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3430[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class122) field3425.method3011((long) var7);
                if (var3 == null) {
                    var3 = class122.method2537(Statics.field3470, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2544();
                    }
                    field3425.method3009(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3428[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class122(field3428, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3435.length; var9++) {
                if (this.field3435[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3430[var8];
            boolean var11 = this.field3433 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class122) field3425.method3011((long) var10);
            if (var3 == null) {
                var3 = class122.method2537(Statics.field3470, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2544();
                }
                field3425.method3009(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3421 == 128 && this.field3455 == 128 && this.field3471 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3457 == 0 && this.field3453 == 0 && this.field3461 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class122 var14 = new class122(var3, arg1 == 0 && !var12 && !var13, this.field3458 == null, this.field3459 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2545(256);
            var14.method2541(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2577();
        } else if (var15 == 2) {
            var14.method2584();
        } else if (var15 == 3) {
            var14.method2547();
        }
        if (this.field3458 != null) {
            for (int var16 = 0; var16 < this.field3458.length; var16++) {
                var14.method2538(this.field3458[var16], this.field3434[var16]);
            }
        }
        if (this.field3459 != null) {
            for (int var17 = 0; var17 < this.field3459.length; var17++) {
                var14.method2543(this.field3459[var17], this.field3441[var17]);
            }
        }
        if (var12) {
            var14.method2539(this.field3421, this.field3455, this.field3471);
        }
        if (var13) {
            var14.method2541(this.field3457, this.field3453, this.field3461);
        }
        return var14;
    }

    @ObfuscatedName("jr.a(B)Ljr;")
    public final class265 method4601() {
        int var1 = -1;
        if (this.field3464 != -1) {
            var1 = class224.method529(this.field3464);
        } else if (this.field3467 != -1) {
            var1 = class224.field2601[this.field3467];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3463.length - 1) {
            var2 = this.field3463[var1];
        } else {
            var2 = this.field3463[this.field3463.length - 1];
        }
        return var2 == -1 ? null : method763(var2);
    }

    @ObfuscatedName("jr.z(IIB)I")
    public int method4602(int arg0, int arg1) {
        class317 var3 = this.field3454;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class185 var5 = (class185) var3.method5382((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2138;
            }
        }
        return var4;
    }

    @ObfuscatedName("jr.j(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4603(int arg0, String arg1) {
        return class259.method2980(this.field3454, arg0, arg1);
    }

    @ObfuscatedName("al.s(I)V")
    public static void method582() {
        field3424.method3010();
        field3425.method3010();
        field3426.method3010();
        field3431.method3010();
    }

    @ObfuscatedName("jr.t(I)Z")
    public boolean method4604() {
        if (this.field3463 == null) {
            return this.field3466 != -1 || this.field3427 != null;
        }
        for (int var1 = 0; var1 < this.field3463.length; var1++) {
            if (this.field3463[var1] != -1) {
                class265 var2 = method763(this.field3463[var1]);
                if (var2.field3466 != -1 || var2.field3427 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
