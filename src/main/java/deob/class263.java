package deob;

@ObfuscatedName("jv")
public class class263 extends class202 {

    @ObfuscatedName("jv.d")
    public static boolean field3524 = false;

    @ObfuscatedName("jv.z")
    public static class197 field3549 = new class197(4096);

    @ObfuscatedName("jv.v")
    public static class197 field3503 = new class197(500);

    @ObfuscatedName("jv.m")
    public static class197 field3504 = new class197(30);

    @ObfuscatedName("jv.b")
    public static class197 field3505 = new class197(30);

    @ObfuscatedName("jv.t")
    public static class127[] field3527 = new class127[4];

    @ObfuscatedName("jv.p")
    public int field3523;

    @ObfuscatedName("jv.r")
    public int[] field3533;

    @ObfuscatedName("jv.l")
    public int[] field3509;

    @ObfuscatedName("jv.u")
    public String field3510 = "null";

    @ObfuscatedName("jv.n")
    public short[] field3511;

    @ObfuscatedName("jv.c")
    public short[] field3512;

    @ObfuscatedName("jv.y")
    public short[] field3513;

    @ObfuscatedName("jv.j")
    public short[] field3514;

    @ObfuscatedName("jv.f")
    public int field3550 = 1;

    @ObfuscatedName("jv.s")
    public int field3508 = 1;

    @ObfuscatedName("jv.e")
    public int field3525 = 2;

    @ObfuscatedName("jv.q")
    public boolean field3518 = true;

    @ObfuscatedName("jv.h")
    public int field3519 = -1;

    @ObfuscatedName("jv.i")
    public int field3520 = -1;

    @ObfuscatedName("jv.o")
    public boolean field3521 = false;

    @ObfuscatedName("jv.w")
    public boolean field3522 = false;

    @ObfuscatedName("jv.g")
    public int field3516 = -1;

    @ObfuscatedName("jv.a")
    public int field3517 = 16;

    @ObfuscatedName("jv.ah")
    public int field3545 = 0;

    @ObfuscatedName("jv.ak")
    public int field3526 = 0;

    @ObfuscatedName("jv.aa")
    public String[] field3506 = new String[5];

    @ObfuscatedName("jv.ax")
    public int field3528 = -1;

    @ObfuscatedName("jv.aq")
    public int field3529 = -1;

    @ObfuscatedName("jv.au")
    public boolean field3530 = false;

    @ObfuscatedName("jv.al")
    public boolean field3502 = true;

    @ObfuscatedName("jv.ae")
    public int field3546 = 128;

    @ObfuscatedName("jv.aj")
    public int field3532 = 128;

    @ObfuscatedName("jv.as")
    public int field3515 = 128;

    @ObfuscatedName("jv.am")
    public int field3535 = 0;

    @ObfuscatedName("jv.ag")
    public int field3536 = 0;

    @ObfuscatedName("jv.aw")
    public int field3537 = 0;

    @ObfuscatedName("jv.ap")
    public boolean field3531 = false;

    @ObfuscatedName("jv.ad")
    public boolean field3539 = false;

    @ObfuscatedName("jv.an")
    public int field3540 = -1;

    @ObfuscatedName("jv.ai")
    public int[] field3541;

    @ObfuscatedName("jv.ay")
    public int field3534 = -1;

    @ObfuscatedName("jv.ar")
    public int field3543 = -1;

    @ObfuscatedName("jv.ac")
    public int field3544 = -1;

    @ObfuscatedName("jv.af")
    public int field3542 = 0;

    @ObfuscatedName("jv.ao")
    public int field3501 = 0;

    @ObfuscatedName("jv.av")
    public int field3547 = 0;

    @ObfuscatedName("jv.ab")
    public int[] field3548;

    @ObfuscatedName("jv.az")
    public class194 field3538;

    @ObfuscatedName("z.d(IB)Ljv;")
    public static class263 method10(int arg0) {
        class263 var1 = (class263) field3549.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1583.method3935(6, arg0);
        class263 var3 = new class263();
        var3.field3523 = arg0;
        if (var2 != null) {
            var3.method4350(new class181(var2));
        }
        var3.method4349();
        if (var3.field3539) {
            var3.field3525 = 0;
            var3.field3518 = false;
        }
        field3549.method3417(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.x(I)V")
    public void method4349() {
        if (this.field3519 == -1) {
            this.field3519 = 0;
            if (this.field3533 != null && (this.field3509 == null || this.field3509[0] == 10)) {
                this.field3519 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3506[var1] != null) {
                    this.field3519 = 1;
                }
            }
        }
        if (this.field3540 == -1) {
            this.field3540 = this.field3525 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jv.k(Lfr;I)V")
    public void method4350(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4369(arg0, var2);
        }
    }

    @ObfuscatedName("jv.z(Lfr;IS)V")
    public void method4369(class181 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3204();
            if (var3 > 0) {
                if (this.field3533 == null || field3524) {
                    this.field3509 = new int[var3];
                    this.field3533 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3533[var4] = arg0.method3179();
                        this.field3509[var4] = arg0.method3204();
                    }
                } else {
                    arg0.field2498 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3510 = arg0.method3045();
        } else if (arg1 == 5) {
            int var5 = arg0.method3204();
            if (var5 > 0) {
                if (this.field3533 == null || field3524) {
                    this.field3509 = null;
                    this.field3533 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3533[var6] = arg0.method3179();
                    }
                } else {
                    arg0.field2498 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3550 = arg0.method3204();
        } else if (arg1 == 15) {
            this.field3508 = arg0.method3204();
        } else if (arg1 == 17) {
            this.field3525 = 0;
            this.field3518 = false;
        } else if (arg1 == 18) {
            this.field3518 = false;
        } else if (arg1 == 19) {
            this.field3519 = arg0.method3204();
        } else if (arg1 == 21) {
            this.field3520 = 0;
        } else if (arg1 == 22) {
            this.field3521 = true;
        } else if (arg1 == 23) {
            this.field3522 = true;
        } else if (arg1 == 24) {
            this.field3516 = arg0.method3179();
            if (this.field3516 == 65535) {
                this.field3516 = -1;
            }
        } else if (arg1 == 27) {
            this.field3525 = 1;
        } else if (arg1 == 28) {
            this.field3517 = arg0.method3204();
        } else if (arg1 == 29) {
            this.field3545 = arg0.method3236();
        } else if (arg1 == 39) {
            this.field3526 = arg0.method3236() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3506[arg1 - 30] = arg0.method3045();
            if (this.field3506[arg1 - 30].equalsIgnoreCase(class233.field2934)) {
                this.field3506[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3204();
            this.field3511 = new short[var7];
            this.field3512 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3511[var8] = (short) arg0.method3179();
                this.field3512[var8] = (short) arg0.method3179();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3204();
            this.field3513 = new short[var9];
            this.field3514 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3513[var10] = (short) arg0.method3179();
                this.field3514[var10] = (short) arg0.method3179();
            }
        } else if (arg1 == 62) {
            this.field3530 = true;
        } else if (arg1 == 64) {
            this.field3502 = false;
        } else if (arg1 == 65) {
            this.field3546 = arg0.method3179();
        } else if (arg1 == 66) {
            this.field3532 = arg0.method3179();
        } else if (arg1 == 67) {
            this.field3515 = arg0.method3179();
        } else if (arg1 == 68) {
            this.field3529 = arg0.method3179();
        } else if (arg1 == 69) {
            arg0.method3204();
        } else if (arg1 == 70) {
            this.field3535 = arg0.method3147();
        } else if (arg1 == 71) {
            this.field3536 = arg0.method3147();
        } else if (arg1 == 72) {
            this.field3537 = arg0.method3147();
        } else if (arg1 == 73) {
            this.field3531 = true;
        } else if (arg1 == 74) {
            this.field3539 = true;
        } else if (arg1 == 75) {
            this.field3540 = arg0.method3204();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3534 = arg0.method3179();
            if (this.field3534 == 65535) {
                this.field3534 = -1;
            }
            this.field3543 = arg0.method3179();
            if (this.field3543 == 65535) {
                this.field3543 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3179();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3204();
            this.field3541 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3541[var15] = arg0.method3179();
                if (this.field3541[var15] == 65535) {
                    this.field3541[var15] = -1;
                }
            }
            this.field3541[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3544 = arg0.method3179();
            this.field3542 = arg0.method3204();
        } else if (arg1 == 79) {
            this.field3501 = arg0.method3179();
            this.field3547 = arg0.method3179();
            this.field3542 = arg0.method3204();
            int var11 = arg0.method3204();
            this.field3548 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3548[var12] = arg0.method3179();
            }
        } else if (arg1 == 81) {
            this.field3520 = arg0.method3204() * 256;
        } else if (arg1 == 82) {
            this.field3528 = arg0.method3179();
        } else if (arg1 == 249) {
            this.field3538 = class257.method2237(arg0, this.field3538);
        }
    }

    @ObfuscatedName("jv.v(II)Z")
    public final boolean method4351(int arg0) {
        if (this.field3509 != null) {
            for (int var4 = 0; var4 < this.field3509.length; var4++) {
                if (this.field3509[var4] == arg0) {
                    return Statics.field639.method3992(this.field3533[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3533 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3533.length; var3++) {
                var2 &= Statics.field639.method3992(this.field3533[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jv.m(I)Z")
    public final boolean method4386() {
        if (this.field3533 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3533.length; var2++) {
            var1 &= Statics.field639.method3992(this.field3533[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jv.b(II[[IIIII)Les;")
    public final class141 method4353(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3509 == null) {
            var7 = (long) ((this.field3523 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3523 << 10) + (arg0 << 3) + arg1);
        }
        class141 var9 = (class141) field3504.method3418(var7);
        if (var9 == null) {
            class127 var10 = this.method4397(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3521) {
                var10.field1737 = (short) (this.field3545 + 64);
                var10.field1738 = (short) (this.field3526 + 768);
                var10.method2365();
                var9 = var10;
            } else {
                var9 = var10.method2314(this.field3545 + 64, this.field3526 + 768, -50, -10, -50);
            }
            field3504.method3417(var9, var7);
        }
        if (this.field3521) {
            var9 = ((class127) var9).method2310();
        }
        if (this.field3520 >= 0) {
            if (var9 instanceof class133) {
                var9 = ((class133) var9).method2402(arg2, arg3, arg4, arg5, true, this.field3520);
            } else if (var9 instanceof class127) {
                var9 = ((class127) var9).method2299(arg2, arg3, arg4, arg5, true, this.field3520);
            }
        }
        return var9;
    }

    @ObfuscatedName("jv.t(II[[IIIII)Leh;")
    public final class133 method4356(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3509 == null) {
            var7 = (long) ((this.field3523 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3523 << 10) + (arg0 << 3) + arg1);
        }
        class133 var9 = (class133) field3505.method3418(var7);
        if (var9 == null) {
            class127 var10 = this.method4397(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2314(this.field3545 + 64, this.field3526 + 768, -50, -10, -50);
            field3505.method3417(var9, var7);
        }
        if (this.field3520 >= 0) {
            var9 = var9.method2402(arg2, arg3, arg4, arg5, true, this.field3520);
        }
        return var9;
    }

    @ObfuscatedName("jv.p(II[[IIIILjj;IB)Leh;")
    public final class133 method4403(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class268 arg6, int arg7) {
        long var9;
        if (this.field3509 == null) {
            var9 = (long) ((this.field3523 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3523 << 10) + (arg0 << 3) + arg1);
        }
        class133 var11 = (class133) field3505.method3418(var9);
        if (var11 == null) {
            class127 var12 = this.method4397(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2314(this.field3545 + 64, this.field3526 + 768, -50, -10, -50);
            field3505.method3417(var11, var9);
        }
        if (arg6 == null && this.field3520 == -1) {
            return var11;
        }
        class133 var13;
        if (arg6 == null) {
            var13 = var11.method2403(true);
        } else {
            var13 = arg6.method4536(var11, arg7, arg1);
        }
        if (this.field3520 >= 0) {
            var13 = var13.method2402(arg2, arg3, arg4, arg5, false, this.field3520);
        }
        return var13;
    }

    @ObfuscatedName("jv.r(III)Ldr;")
    public final class127 method4397(int arg0, int arg1) {
        class127 var3 = null;
        if (this.field3509 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3533 == null) {
                return null;
            }
            boolean var4 = this.field3530;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3533.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3533[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class127) field3503.method3418((long) var7);
                if (var3 == null) {
                    var3 = class127.method2294(Statics.field639, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2308();
                    }
                    field3503.method3417(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3527[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class127(field3527, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3509.length; var9++) {
                if (this.field3509[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3533[var8];
            boolean var11 = this.field3530 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class127) field3503.method3418((long) var10);
            if (var3 == null) {
                var3 = class127.method2294(Statics.field639, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2308();
                }
                field3503.method3417(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3546 == 128 && this.field3532 == 128 && this.field3515 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3535 == 0 && this.field3536 == 0 && this.field3537 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class127 var14 = new class127(var3, arg1 == 0 && !var12 && !var13, this.field3511 == null, this.field3513 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2304(256);
            var14.method2305(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2327();
        } else if (var15 == 2) {
            var14.method2302();
        } else if (var15 == 3) {
            var14.method2345();
        }
        if (this.field3511 != null) {
            for (int var16 = 0; var16 < this.field3511.length; var16++) {
                var14.method2306(this.field3511[var16], this.field3512[var16]);
            }
        }
        if (this.field3513 != null) {
            for (int var17 = 0; var17 < this.field3513.length; var17++) {
                var14.method2307(this.field3513[var17], this.field3514[var17]);
            }
        }
        if (var12) {
            var14.method2317(this.field3546, this.field3532, this.field3515);
        }
        if (var13) {
            var14.method2305(this.field3535, this.field3536, this.field3537);
        }
        return var14;
    }

    @ObfuscatedName("jv.l(I)Ljv;")
    public final class263 method4355() {
        int var1 = -1;
        if (this.field3534 != -1) {
            var1 = class219.method1016(this.field3534);
        } else if (this.field3543 != -1) {
            var1 = class219.field2688[this.field3543];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3541.length - 1) {
            var2 = this.field3541[var1];
        } else {
            var2 = this.field3541[this.field3541.length - 1];
        }
        return var2 == -1 ? null : method10(var2);
    }

    @ObfuscatedName("jv.u(III)I")
    public int method4358(int arg0, int arg1) {
        return class257.method4040(this.field3538, arg0, arg1);
    }

    @ObfuscatedName("jv.c(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4359(int arg0, String arg1) {
        return class257.method2778(this.field3538, arg0, arg1);
    }

    @ObfuscatedName("cz.j(I)V")
    public static void method1704() {
        field3549.method3422();
        field3503.method3422();
        field3504.method3422();
        field3505.method3422();
    }

    @ObfuscatedName("jv.f(I)Z")
    public boolean method4348() {
        if (this.field3541 == null) {
            return this.field3544 != -1 || this.field3548 != null;
        }
        for (int var1 = 0; var1 < this.field3541.length; var1++) {
            if (this.field3541[var1] != -1) {
                class263 var2 = method10(this.field3541[var1]);
                if (var2.field3544 != -1 || var2.field3548 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
