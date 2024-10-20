package deob;

@ObfuscatedName("jt")
public class class263 extends class202 {

    @ObfuscatedName("jt.b")
    public static boolean field3527 = false;

    @ObfuscatedName("jt.g")
    public static class197 field3512 = new class197(4096);

    @ObfuscatedName("jt.x")
    public static class197 field3490 = new class197(500);

    @ObfuscatedName("jt.f")
    public static class197 field3491 = new class197(30);

    @ObfuscatedName("jt.u")
    public static class197 field3492 = new class197(30);

    @ObfuscatedName("jt.t")
    public static class127[] field3493 = new class127[4];

    @ObfuscatedName("jt.k")
    public int field3494;

    @ObfuscatedName("jt.n")
    public int[] field3495;

    @ObfuscatedName("jt.d")
    public int[] field3496;

    @ObfuscatedName("jt.o")
    public String field3497 = "null";

    @ObfuscatedName("jt.a")
    public short[] field3517;

    @ObfuscatedName("jt.q")
    public short[] field3499;

    @ObfuscatedName("jt.j")
    public short[] field3500;

    @ObfuscatedName("jt.m")
    public short[] field3501;

    @ObfuscatedName("jt.h")
    public int field3502 = 1;

    @ObfuscatedName("jt.c")
    public int field3503 = 1;

    @ObfuscatedName("jt.y")
    public int field3515 = 2;

    @ObfuscatedName("jt.p")
    public boolean field3505 = true;

    @ObfuscatedName("jt.i")
    public int field3487 = -1;

    @ObfuscatedName("jt.l")
    public int field3507 = -1;

    @ObfuscatedName("jt.z")
    public boolean field3508 = false;

    @ObfuscatedName("jt.e")
    public boolean field3509 = false;

    @ObfuscatedName("jt.v")
    public int field3498 = -1;

    @ObfuscatedName("jt.w")
    public int field3516 = 16;

    @ObfuscatedName("jt.av")
    public int field3523 = 0;

    @ObfuscatedName("jt.au")
    public int field3513 = 0;

    @ObfuscatedName("jt.ae")
    public String[] field3514 = new String[5];

    @ObfuscatedName("jt.ak")
    public int field3511 = -1;

    @ObfuscatedName("jt.aq")
    public int field3535 = -1;

    @ObfuscatedName("jt.an")
    public boolean field3510 = false;

    @ObfuscatedName("jt.am")
    public boolean field3518 = true;

    @ObfuscatedName("jt.ar")
    public int field3519 = 128;

    @ObfuscatedName("jt.ao")
    public int field3520 = 128;

    @ObfuscatedName("jt.at")
    public int field3521 = 128;

    @ObfuscatedName("jt.ac")
    public int field3486 = 0;

    @ObfuscatedName("jt.as")
    public int field3506 = 0;

    @ObfuscatedName("jt.ah")
    public int field3524 = 0;

    @ObfuscatedName("jt.aw")
    public boolean field3525 = false;

    @ObfuscatedName("jt.al")
    public boolean field3526 = false;

    @ObfuscatedName("jt.aj")
    public int field3522 = -1;

    @ObfuscatedName("jt.ap")
    public int[] field3528;

    @ObfuscatedName("jt.ag")
    public int field3529 = -1;

    @ObfuscatedName("jt.af")
    public int field3530 = -1;

    @ObfuscatedName("jt.ay")
    public int field3531 = -1;

    @ObfuscatedName("jt.ab")
    public int field3532 = 0;

    @ObfuscatedName("jt.ax")
    public int field3504 = 0;

    @ObfuscatedName("jt.ai")
    public int field3534 = 0;

    @ObfuscatedName("jt.az")
    public int[] field3533;

    @ObfuscatedName("jt.aa")
    public class194 field3536;

    @ObfuscatedName("bp.b(Lij;Lij;ZI)V")
    public static void method941(class243 arg0, class243 arg1, boolean arg2) {
        Statics.field3489 = arg0;
        Statics.field3488 = arg1;
        field3527 = arg2;
    }

    @ObfuscatedName("fi.s(II)Ljt;")
    public static class263 method2851(int arg0) {
        class263 var1 = (class263) field3512.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3489.method3887(6, arg0);
        class263 var3 = new class263();
        var3.field3494 = arg0;
        if (var2 != null) {
            var3.method4210(new class181(var2));
        }
        var3.method4247();
        if (var3.field3526) {
            var3.field3515 = 0;
            var3.field3505 = false;
        }
        field3512.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jt.r(B)V")
    public void method4247() {
        if (this.field3487 == -1) {
            this.field3487 = 0;
            if (this.field3495 != null && (this.field3496 == null || this.field3496[0] == 10)) {
                this.field3487 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3514[var1] != null) {
                    this.field3487 = 1;
                }
            }
        }
        if (this.field3522 == -1) {
            this.field3522 = this.field3515 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jt.g(Lfs;I)V")
    public void method4210(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method4211(arg0, var2);
        }
    }

    @ObfuscatedName("jt.x(Lfs;II)V")
    public void method4211(class181 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2945();
            if (var3 > 0) {
                if (this.field3495 == null || field3527) {
                    this.field3496 = new int[var3];
                    this.field3495 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3495[var4] = arg0.method3081();
                        this.field3496[var4] = arg0.method2945();
                    }
                } else {
                    arg0.field2488 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3497 = arg0.method2953();
        } else if (arg1 == 5) {
            int var5 = arg0.method2945();
            if (var5 > 0) {
                if (this.field3495 == null || field3527) {
                    this.field3496 = null;
                    this.field3495 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3495[var6] = arg0.method3081();
                    }
                } else {
                    arg0.field2488 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3502 = arg0.method2945();
        } else if (arg1 == 15) {
            this.field3503 = arg0.method2945();
        } else if (arg1 == 17) {
            this.field3515 = 0;
            this.field3505 = false;
        } else if (arg1 == 18) {
            this.field3505 = false;
        } else if (arg1 == 19) {
            this.field3487 = arg0.method2945();
        } else if (arg1 == 21) {
            this.field3507 = 0;
        } else if (arg1 == 22) {
            this.field3508 = true;
        } else if (arg1 == 23) {
            this.field3509 = true;
        } else if (arg1 == 24) {
            this.field3498 = arg0.method3081();
            if (this.field3498 == 65535) {
                this.field3498 = -1;
            }
        } else if (arg1 == 27) {
            this.field3515 = 1;
        } else if (arg1 == 28) {
            this.field3516 = arg0.method2945();
        } else if (arg1 == 29) {
            this.field3523 = arg0.method2946();
        } else if (arg1 == 39) {
            this.field3513 = arg0.method2946() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3514[arg1 - 30] = arg0.method2953();
            if (this.field3514[arg1 - 30].equalsIgnoreCase(class233.field2920)) {
                this.field3514[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2945();
            this.field3517 = new short[var7];
            this.field3499 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3517[var8] = (short) arg0.method3081();
                this.field3499[var8] = (short) arg0.method3081();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2945();
            this.field3500 = new short[var9];
            this.field3501 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3500[var10] = (short) arg0.method3081();
                this.field3501[var10] = (short) arg0.method3081();
            }
        } else if (arg1 == 62) {
            this.field3510 = true;
        } else if (arg1 == 64) {
            this.field3518 = false;
        } else if (arg1 == 65) {
            this.field3519 = arg0.method3081();
        } else if (arg1 == 66) {
            this.field3520 = arg0.method3081();
        } else if (arg1 == 67) {
            this.field3521 = arg0.method3081();
        } else if (arg1 == 68) {
            this.field3535 = arg0.method3081();
        } else if (arg1 == 69) {
            arg0.method2945();
        } else if (arg1 == 70) {
            this.field3486 = arg0.method3050();
        } else if (arg1 == 71) {
            this.field3506 = arg0.method3050();
        } else if (arg1 == 72) {
            this.field3524 = arg0.method3050();
        } else if (arg1 == 73) {
            this.field3525 = true;
        } else if (arg1 == 74) {
            this.field3526 = true;
        } else if (arg1 == 75) {
            this.field3522 = arg0.method2945();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3529 = arg0.method3081();
            if (this.field3529 == 65535) {
                this.field3529 = -1;
            }
            this.field3530 = arg0.method3081();
            if (this.field3530 == 65535) {
                this.field3530 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3081();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2945();
            this.field3528 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3528[var15] = arg0.method3081();
                if (this.field3528[var15] == 65535) {
                    this.field3528[var15] = -1;
                }
            }
            this.field3528[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3531 = arg0.method3081();
            this.field3532 = arg0.method2945();
        } else if (arg1 == 79) {
            this.field3504 = arg0.method3081();
            this.field3534 = arg0.method3081();
            this.field3532 = arg0.method2945();
            int var11 = arg0.method2945();
            this.field3533 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3533[var12] = arg0.method3081();
            }
        } else if (arg1 == 81) {
            this.field3507 = arg0.method2945() * 256;
        } else if (arg1 == 82) {
            this.field3511 = arg0.method3081();
        } else if (arg1 == 249) {
            this.field3536 = class257.method194(arg0, this.field3536);
        }
    }

    @ObfuscatedName("jt.f(II)Z")
    public final boolean method4212(int arg0) {
        if (this.field3496 != null) {
            for (int var4 = 0; var4 < this.field3496.length; var4++) {
                if (this.field3496[var4] == arg0) {
                    return Statics.field3488.method3866(this.field3495[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3495 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3495.length; var3++) {
                var2 &= Statics.field3488.method3866(this.field3495[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jt.u(I)Z")
    public final boolean method4244() {
        if (this.field3495 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3495.length; var2++) {
            var1 &= Statics.field3488.method3866(this.field3495[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jt.t(II[[IIIII)Leu;")
    public final class141 method4214(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3496 == null) {
            var7 = (long) ((this.field3494 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3494 << 10) + (arg0 << 3) + arg1);
        }
        class141 var9 = (class141) field3491.method3330(var7);
        if (var9 == null) {
            class127 var10 = this.method4225(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3508) {
                var10.field1741 = (short) (this.field3523 + 64);
                var10.field1737 = (short) (this.field3513 + 768);
                var10.method2235();
                var9 = var10;
            } else {
                var9 = var10.method2240(this.field3523 + 64, this.field3513 + 768, -50, -10, -50);
            }
            field3491.method3332(var9, var7);
        }
        if (this.field3508) {
            var9 = ((class127) var9).method2224();
        }
        if (this.field3507 >= 0) {
            if (var9 instanceof class133) {
                var9 = ((class133) var9).method2307(arg2, arg3, arg4, arg5, true, this.field3507);
            } else if (var9 instanceof class127) {
                var9 = ((class127) var9).method2225(arg2, arg3, arg4, arg5, true, this.field3507);
            }
        }
        return var9;
    }

    @ObfuscatedName("jt.k(II[[IIIII)Lev;")
    public final class133 method4242(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3496 == null) {
            var7 = (long) ((this.field3494 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3494 << 10) + (arg0 << 3) + arg1);
        }
        class133 var9 = (class133) field3492.method3330(var7);
        if (var9 == null) {
            class127 var10 = this.method4225(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2240(this.field3523 + 64, this.field3513 + 768, -50, -10, -50);
            field3492.method3332(var9, var7);
        }
        if (this.field3507 >= 0) {
            var9 = var9.method2307(arg2, arg3, arg4, arg5, true, this.field3507);
        }
        return var9;
    }

    @ObfuscatedName("jt.n(II[[IIIILjh;II)Lev;")
    public final class133 method4215(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class268 arg6, int arg7) {
        long var9;
        if (this.field3496 == null) {
            var9 = (long) ((this.field3494 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3494 << 10) + (arg0 << 3) + arg1);
        }
        class133 var11 = (class133) field3492.method3330(var9);
        if (var11 == null) {
            class127 var12 = this.method4225(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2240(this.field3523 + 64, this.field3513 + 768, -50, -10, -50);
            field3492.method3332(var11, var9);
        }
        if (arg6 == null && this.field3507 == -1) {
            return var11;
        }
        class133 var13;
        if (arg6 == null) {
            var13 = var11.method2368(true);
        } else {
            var13 = arg6.method4397(var11, arg7, arg1);
        }
        if (this.field3507 >= 0) {
            var13 = var13.method2307(arg2, arg3, arg4, arg5, false, this.field3507);
        }
        return var13;
    }

    @ObfuscatedName("jt.d(IIB)Lda;")
    public final class127 method4225(int arg0, int arg1) {
        class127 var3 = null;
        if (this.field3496 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3495 == null) {
                return null;
            }
            boolean var4 = this.field3510;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3495.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3495[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class127) field3490.method3330((long) var7);
                if (var3 == null) {
                    var3 = class127.method2220(Statics.field3488, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2234();
                    }
                    field3490.method3332(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3493[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class127(field3493, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3496.length; var9++) {
                if (this.field3496[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3495[var8];
            boolean var11 = this.field3510 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class127) field3490.method3330((long) var10);
            if (var3 == null) {
                var3 = class127.method2220(Statics.field3488, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2234();
                }
                field3490.method3332(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3519 == 128 && this.field3520 == 128 && this.field3521 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3486 == 0 && this.field3506 == 0 && this.field3524 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class127 var14 = new class127(var3, arg1 == 0 && !var12 && !var13, this.field3517 == null, this.field3500 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2230(256);
            var14.method2259(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2227();
        } else if (var15 == 2) {
            var14.method2245();
        } else if (var15 == 3) {
            var14.method2229();
        }
        if (this.field3517 != null) {
            for (int var16 = 0; var16 < this.field3517.length; var16++) {
                var14.method2232(this.field3517[var16], this.field3499[var16]);
            }
        }
        if (this.field3500 != null) {
            for (int var17 = 0; var17 < this.field3500.length; var17++) {
                var14.method2233(this.field3500[var17], this.field3501[var17]);
            }
        }
        if (var12) {
            var14.method2243(this.field3519, this.field3520, this.field3521);
        }
        if (var13) {
            var14.method2259(this.field3486, this.field3506, this.field3524);
        }
        return var14;
    }

    @ObfuscatedName("jt.o(I)Ljt;")
    public final class263 method4228() {
        int var1 = -1;
        if (this.field3529 != -1) {
            var1 = class219.method122(this.field3529);
        } else if (this.field3530 != -1) {
            var1 = class219.field2680[this.field3530];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3528.length - 1) {
            var2 = this.field3528[var1];
        } else {
            var2 = this.field3528[this.field3528.length - 1];
        }
        return var2 == -1 ? null : method2851(var2);
    }

    @ObfuscatedName("jt.a(III)I")
    public int method4218(int arg0, int arg1) {
        return class257.method4097(this.field3536, arg0, arg1);
    }

    @ObfuscatedName("jt.q(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4219(int arg0, String arg1) {
        return class257.method1712(this.field3536, arg0, arg1);
    }

    @ObfuscatedName("jt.j(B)Z")
    public boolean method4236() {
        if (this.field3528 == null) {
            return this.field3531 != -1 || this.field3533 != null;
        }
        for (int var1 = 0; var1 < this.field3528.length; var1++) {
            if (this.field3528[var1] != -1) {
                class263 var2 = method2851(this.field3528[var1]);
                if (var2.field3531 != -1 || var2.field3533 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
