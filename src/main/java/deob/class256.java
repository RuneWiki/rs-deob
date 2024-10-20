package deob;

@ObfuscatedName("iv")
public class class256 extends class195 {

    @ObfuscatedName("iv.d")
    public static boolean field3440 = false;

    @ObfuscatedName("iv.y")
    public static class190 field3418 = new class190(4096);

    @ObfuscatedName("iv.e")
    public static class190 field3448 = new class190(500);

    @ObfuscatedName("iv.f")
    public static class190 field3454 = new class190(30);

    @ObfuscatedName("iv.v")
    public static class190 field3421 = new class190(30);

    @ObfuscatedName("iv.t")
    public static class128[] field3422 = new class128[4];

    @ObfuscatedName("iv.i")
    public int field3456;

    @ObfuscatedName("iv.r")
    public int[] field3423;

    @ObfuscatedName("iv.g")
    public int[] field3425;

    @ObfuscatedName("iv.s")
    public String field3426 = "null";

    @ObfuscatedName("iv.o")
    public short[] field3427;

    @ObfuscatedName("iv.p")
    public short[] field3428;

    @ObfuscatedName("iv.u")
    public short[] field3420;

    @ObfuscatedName("iv.b")
    public short[] field3434;

    @ObfuscatedName("iv.w")
    public int field3431 = 1;

    @ObfuscatedName("iv.k")
    public int field3453 = 1;

    @ObfuscatedName("iv.n")
    public int field3424 = 2;

    @ObfuscatedName("iv.c")
    public boolean field3460 = true;

    @ObfuscatedName("iv.l")
    public int field3464 = -1;

    @ObfuscatedName("iv.m")
    public int field3430 = -1;

    @ObfuscatedName("iv.a")
    public boolean field3437 = false;

    @ObfuscatedName("iv.h")
    public boolean field3438 = false;

    @ObfuscatedName("iv.z")
    public int field3439 = -1;

    @ObfuscatedName("iv.j")
    public int field3436 = 16;

    @ObfuscatedName("iv.am")
    public int field3441 = 0;

    @ObfuscatedName("iv.ac")
    public int field3442 = 0;

    @ObfuscatedName("iv.ax")
    public String[] field3449 = new String[5];

    @ObfuscatedName("iv.at")
    public int field3444 = -1;

    @ObfuscatedName("iv.ag")
    public int field3445 = -1;

    @ObfuscatedName("iv.ar")
    public boolean field3446 = false;

    @ObfuscatedName("iv.ae")
    public boolean field3415 = true;

    @ObfuscatedName("iv.ai")
    public int field3417 = 128;

    @ObfuscatedName("iv.au")
    public int field3465 = 128;

    @ObfuscatedName("iv.ad")
    public int field3432 = 128;

    @ObfuscatedName("iv.ah")
    public int field3451 = 0;

    @ObfuscatedName("iv.ao")
    public int field3452 = 0;

    @ObfuscatedName("iv.av")
    public int field3435 = 0;

    @ObfuscatedName("iv.az")
    public boolean field3443 = false;

    @ObfuscatedName("iv.aq")
    public boolean field3455 = false;

    @ObfuscatedName("iv.ay")
    public int field3433 = -1;

    @ObfuscatedName("iv.an")
    public int[] field3457;

    @ObfuscatedName("iv.af")
    public int field3458 = -1;

    @ObfuscatedName("iv.aa")
    public int field3459 = -1;

    @ObfuscatedName("iv.ak")
    public int field3429 = -1;

    @ObfuscatedName("iv.as")
    public int field3461 = 0;

    @ObfuscatedName("iv.ap")
    public int field3462 = 0;

    @ObfuscatedName("iv.aw")
    public int field3463 = 0;

    @ObfuscatedName("iv.al")
    public int[] field3450;

    @ObfuscatedName("iv.ab")
    public class187 field3419;

    @ObfuscatedName("ex.d(Lim;Lim;ZI)V")
    public static void method2457(class236 arg0, class236 arg1, boolean arg2) {
        Statics.field3416 = arg0;
        Statics.field3447 = arg1;
        field3440 = arg2;
    }

    @ObfuscatedName("ba.q(II)Liv;")
    public static class256 method997(int arg0) {
        class256 var1 = (class256) field3418.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3416.method3750(6, arg0);
        class256 var3 = new class256();
        var3.field3456 = arg0;
        if (var2 != null) {
            var3.method4119(new class174(var2));
        }
        var3.method4118();
        if (var3.field3455) {
            var3.field3424 = 0;
            var3.field3460 = false;
        }
        field3418.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.x(B)V")
    public void method4118() {
        if (this.field3464 == -1) {
            this.field3464 = 0;
            if (this.field3423 != null && (this.field3425 == null || this.field3425[0] == 10)) {
                this.field3464 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3449[var1] != null) {
                    this.field3464 = 1;
                }
            }
        }
        if (this.field3433 == -1) {
            this.field3433 = this.field3424 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("iv.y(Lfw;I)V")
    public void method4119(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method4120(arg0, var2);
        }
    }

    @ObfuscatedName("iv.e(Lfw;IB)V")
    public void method4120(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2921();
            if (var3 > 0) {
                if (this.field3423 == null || field3440) {
                    this.field3425 = new int[var3];
                    this.field3423 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3423[var4] = arg0.method2916();
                        this.field3425[var4] = arg0.method2921();
                    }
                } else {
                    arg0.field2364 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3426 = arg0.method2922();
        } else if (arg1 == 5) {
            int var5 = arg0.method2921();
            if (var5 > 0) {
                if (this.field3423 == null || field3440) {
                    this.field3425 = null;
                    this.field3423 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3423[var6] = arg0.method2916();
                    }
                } else {
                    arg0.field2364 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3431 = arg0.method2921();
        } else if (arg1 == 15) {
            this.field3453 = arg0.method2921();
        } else if (arg1 == 17) {
            this.field3424 = 0;
            this.field3460 = false;
        } else if (arg1 == 18) {
            this.field3460 = false;
        } else if (arg1 == 19) {
            this.field3464 = arg0.method2921();
        } else if (arg1 == 21) {
            this.field3430 = 0;
        } else if (arg1 == 22) {
            this.field3437 = true;
        } else if (arg1 == 23) {
            this.field3438 = true;
        } else if (arg1 == 24) {
            this.field3439 = arg0.method2916();
            if (this.field3439 == 65535) {
                this.field3439 = -1;
            }
        } else if (arg1 == 27) {
            this.field3424 = 1;
        } else if (arg1 == 28) {
            this.field3436 = arg0.method2921();
        } else if (arg1 == 29) {
            this.field3441 = arg0.method3082();
        } else if (arg1 == 39) {
            this.field3442 = arg0.method3082();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3449[arg1 - 30] = arg0.method2922();
            if (this.field3449[arg1 - 30].equalsIgnoreCase(class226.field2837)) {
                this.field3449[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2921();
            this.field3427 = new short[var7];
            this.field3428 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3427[var8] = (short) arg0.method2916();
                this.field3428[var8] = (short) arg0.method2916();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2921();
            this.field3420 = new short[var9];
            this.field3434 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3420[var10] = (short) arg0.method2916();
                this.field3434[var10] = (short) arg0.method2916();
            }
        } else if (arg1 == 62) {
            this.field3446 = true;
        } else if (arg1 == 64) {
            this.field3415 = false;
        } else if (arg1 == 65) {
            this.field3417 = arg0.method2916();
        } else if (arg1 == 66) {
            this.field3465 = arg0.method2916();
        } else if (arg1 == 67) {
            this.field3432 = arg0.method2916();
        } else if (arg1 == 68) {
            this.field3445 = arg0.method2916();
        } else if (arg1 == 69) {
            arg0.method2921();
        } else if (arg1 == 70) {
            this.field3451 = arg0.method2911();
        } else if (arg1 == 71) {
            this.field3452 = arg0.method2911();
        } else if (arg1 == 72) {
            this.field3435 = arg0.method2911();
        } else if (arg1 == 73) {
            this.field3443 = true;
        } else if (arg1 == 74) {
            this.field3455 = true;
        } else if (arg1 == 75) {
            this.field3433 = arg0.method2921();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3458 = arg0.method2916();
            if (this.field3458 == 65535) {
                this.field3458 = -1;
            }
            this.field3459 = arg0.method2916();
            if (this.field3459 == 65535) {
                this.field3459 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2916();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2921();
            this.field3457 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3457[var15] = arg0.method2916();
                if (this.field3457[var15] == 65535) {
                    this.field3457[var15] = -1;
                }
            }
            this.field3457[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3429 = arg0.method2916();
            this.field3461 = arg0.method2921();
        } else if (arg1 == 79) {
            this.field3462 = arg0.method2916();
            this.field3463 = arg0.method2916();
            this.field3461 = arg0.method2921();
            int var11 = arg0.method2921();
            this.field3450 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3450[var12] = arg0.method2916();
            }
        } else if (arg1 == 81) {
            this.field3430 = arg0.method2921() * 256;
        } else if (arg1 == 82) {
            this.field3444 = arg0.method2916();
        } else if (arg1 == 249) {
            this.field3419 = class250.method2459(arg0, this.field3419);
        }
    }

    @ObfuscatedName("iv.f(II)Z")
    public final boolean method4121(int arg0) {
        if (this.field3425 != null) {
            for (int var4 = 0; var4 < this.field3425.length; var4++) {
                if (this.field3425[var4] == arg0) {
                    return Statics.field3447.method3752(this.field3423[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3423 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3423.length; var3++) {
                var2 &= Statics.field3447.method3752(this.field3423[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iv.v(I)Z")
    public final boolean method4122() {
        if (this.field3423 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3423.length; var2++) {
            var1 &= Statics.field3447.method3752(this.field3423[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("iv.t(II[[IIIII)Lep;")
    public final class142 method4123(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3425 == null) {
            var7 = (long) ((this.field3456 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3456 << 10) + (arg0 << 3) + arg1);
        }
        class142 var9 = (class142) field3454.method3252(var7);
        if (var9 == null) {
            class128 var10 = this.method4159(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3437) {
                var10.field1769 = (short) (this.field3441 + 64);
                var10.field1799 = (short) (this.field3442 * 25 + 768);
                var10.method2200();
                var9 = var10;
            } else {
                var9 = var10.method2246(this.field3441 + 64, this.field3442 * 25 + 768, -50, -10, -50);
            }
            field3454.method3256(var9, var7);
        }
        if (this.field3437) {
            var9 = ((class128) var9).method2181();
        }
        if (this.field3430 >= 0) {
            if (var9 instanceof class134) {
                var9 = ((class134) var9).method2265(arg2, arg3, arg4, arg5, true, this.field3430);
            } else if (var9 instanceof class128) {
                var9 = ((class128) var9).method2208(arg2, arg3, arg4, arg5, true, this.field3430);
            }
        }
        return var9;
    }

    @ObfuscatedName("iv.i(II[[IIIIB)Lev;")
    public final class134 method4124(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3425 == null) {
            var7 = (long) ((this.field3456 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3456 << 10) + (arg0 << 3) + arg1);
        }
        class134 var9 = (class134) field3421.method3252(var7);
        if (var9 == null) {
            class128 var10 = this.method4159(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2246(this.field3441 + 64, this.field3442 * 25 + 768, -50, -10, -50);
            field3421.method3256(var9, var7);
        }
        if (this.field3430 >= 0) {
            var9 = var9.method2265(arg2, arg3, arg4, arg5, true, this.field3430);
        }
        return var9;
    }

    @ObfuscatedName("iv.r(II[[IIIILjj;II)Lev;")
    public final class134 method4139(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class261 arg6, int arg7) {
        long var9;
        if (this.field3425 == null) {
            var9 = (long) ((this.field3456 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3456 << 10) + (arg0 << 3) + arg1);
        }
        class134 var11 = (class134) field3421.method3252(var9);
        if (var11 == null) {
            class128 var12 = this.method4159(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2246(this.field3441 + 64, this.field3442 * 25 + 768, -50, -10, -50);
            field3421.method3256(var11, var9);
        }
        if (arg6 == null && this.field3430 == -1) {
            return var11;
        }
        class134 var13;
        if (arg6 == null) {
            var13 = var11.method2266(true);
        } else {
            var13 = arg6.method4304(var11, arg7, arg1);
        }
        if (this.field3430 >= 0) {
            var13 = var13.method2265(arg2, arg3, arg4, arg5, false, this.field3430);
        }
        return var13;
    }

    @ObfuscatedName("iv.g(III)Ldk;")
    public final class128 method4159(int arg0, int arg1) {
        class128 var3 = null;
        if (this.field3425 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3423 == null) {
                return null;
            }
            boolean var4 = this.field3446;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3423.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3423[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class128) field3448.method3252((long) var7);
                if (var3 == null) {
                    var3 = class128.method2238(Statics.field3447, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2191();
                    }
                    field3448.method3256(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3422[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class128(field3422, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3425.length; var9++) {
                if (this.field3425[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3423[var8];
            boolean var11 = this.field3446 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class128) field3448.method3252((long) var10);
            if (var3 == null) {
                var3 = class128.method2238(Statics.field3447, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2191();
                }
                field3448.method3256(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3417 == 128 && this.field3465 == 128 && this.field3432 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3451 == 0 && this.field3452 == 0 && this.field3435 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class128 var14 = new class128(var3, arg1 == 0 && !var12 && !var13, this.field3427 == null, this.field3420 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2187(256);
            var14.method2188(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2177();
        } else if (var15 == 2) {
            var14.method2183();
        } else if (var15 == 3) {
            var14.method2186();
        }
        if (this.field3427 != null) {
            for (int var16 = 0; var16 < this.field3427.length; var16++) {
                var14.method2226(this.field3427[var16], this.field3428[var16]);
            }
        }
        if (this.field3420 != null) {
            for (int var17 = 0; var17 < this.field3420.length; var17++) {
                var14.method2190(this.field3420[var17], this.field3434[var17]);
            }
        }
        if (var12) {
            var14.method2192(this.field3417, this.field3465, this.field3432);
        }
        if (var13) {
            var14.method2188(this.field3451, this.field3452, this.field3435);
        }
        return var14;
    }

    @ObfuscatedName("iv.s(I)Liv;")
    public final class256 method4127() {
        int var1 = -1;
        if (this.field3458 != -1) {
            var1 = class212.method1567(this.field3458);
        } else if (this.field3459 != -1) {
            var1 = class212.field2585[this.field3459];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3457.length - 1) {
            var2 = this.field3457[var1];
        } else {
            var2 = this.field3457[this.field3457.length - 1];
        }
        return var2 == -1 ? null : method997(var2);
    }

    @ObfuscatedName("iv.o(IIB)I")
    public int method4158(int arg0, int arg1) {
        return class250.method720(this.field3419, arg0, arg1);
    }

    @ObfuscatedName("iv.p(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4161(int arg0, String arg1) {
        return class250.method319(this.field3419, arg0, arg1);
    }

    @ObfuscatedName("iv.u(B)Z")
    public boolean method4130() {
        if (this.field3457 == null) {
            return this.field3429 != -1 || this.field3450 != null;
        }
        for (int var1 = 0; var1 < this.field3457.length; var1++) {
            if (this.field3457[var1] != -1) {
                class256 var2 = method997(this.field3457[var1]);
                if (var2.field3429 != -1 || var2.field3450 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
