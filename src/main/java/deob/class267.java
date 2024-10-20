package deob;

@ObfuscatedName("jf")
public class class267 extends class206 {

    @ObfuscatedName("jf.a")
    public static boolean field3533 = false;

    @ObfuscatedName("jf.k")
    public static class201 field3510 = new class201(4096);

    @ObfuscatedName("jf.u")
    public static class201 field3513 = new class201(500);

    @ObfuscatedName("jf.z")
    public static class201 field3514 = new class201(30);

    @ObfuscatedName("jf.t")
    public static class201 field3522 = new class201(30);

    @ObfuscatedName("jf.f")
    public static class127[] field3509 = new class127[4];

    @ObfuscatedName("jf.g")
    public int field3517;

    @ObfuscatedName("jf.j")
    public int[] field3539;

    @ObfuscatedName("jf.x")
    public int[] field3519;

    @ObfuscatedName("jf.c")
    public String field3520 = "null";

    @ObfuscatedName("jf.s")
    public short[] field3521;

    @ObfuscatedName("jf.n")
    public short[] field3516;

    @ObfuscatedName("jf.y")
    public short[] field3512;

    @ObfuscatedName("jf.o")
    public short[] field3524;

    @ObfuscatedName("jf.r")
    public int field3544 = 1;

    @ObfuscatedName("jf.i")
    public int field3526 = 1;

    @ObfuscatedName("jf.l")
    public int field3527 = 2;

    @ObfuscatedName("jf.m")
    public boolean field3528 = true;

    @ObfuscatedName("jf.q")
    public int field3529 = -1;

    @ObfuscatedName("jf.b")
    public int field3530 = -1;

    @ObfuscatedName("jf.h")
    public boolean field3531 = false;

    @ObfuscatedName("jf.d")
    public boolean field3532 = false;

    @ObfuscatedName("jf.v")
    public int field3558 = -1;

    @ObfuscatedName("jf.p")
    public int field3518 = 16;

    @ObfuscatedName("jf.ab")
    public int field3523 = 0;

    @ObfuscatedName("jf.ad")
    public int field3536 = 0;

    @ObfuscatedName("jf.ag")
    public String[] field3515 = new String[5];

    @ObfuscatedName("jf.ak")
    public int field3538 = -1;

    @ObfuscatedName("jf.as")
    public int field3557 = -1;

    @ObfuscatedName("jf.aq")
    public boolean field3540 = false;

    @ObfuscatedName("jf.ax")
    public boolean field3542 = true;

    @ObfuscatedName("jf.at")
    public int field3537 = 128;

    @ObfuscatedName("jf.ap")
    public int field3543 = 128;

    @ObfuscatedName("jf.an")
    public int field3534 = 128;

    @ObfuscatedName("jf.ac")
    public int field3545 = 0;

    @ObfuscatedName("jf.aw")
    public int field3546 = 0;

    @ObfuscatedName("jf.al")
    public int field3535 = 0;

    @ObfuscatedName("jf.ay")
    public boolean field3548 = false;

    @ObfuscatedName("jf.ai")
    public boolean field3549 = false;

    @ObfuscatedName("jf.af")
    public int field3550 = -1;

    @ObfuscatedName("jf.ah")
    public int[] field3551;

    @ObfuscatedName("jf.az")
    public int field3525 = -1;

    @ObfuscatedName("jf.av")
    public int field3553 = -1;

    @ObfuscatedName("jf.ae")
    public int field3554 = -1;

    @ObfuscatedName("jf.am")
    public int field3555 = 0;

    @ObfuscatedName("jf.aa")
    public int field3556 = 0;

    @ObfuscatedName("jf.aj")
    public int field3547 = 0;

    @ObfuscatedName("jf.ao")
    public int[] field3541;

    @ObfuscatedName("jf.ar")
    public class198 field3559;

    @ObfuscatedName("ib.a(Lib;Lib;ZB)V")
    public static void method3987(class247 arg0, class247 arg1, boolean arg2) {
        Statics.field3511 = arg0;
        Statics.field3552 = arg1;
        field3533 = arg2;
    }

    @ObfuscatedName("dv.w(IB)Ljf;")
    public static class267 method2129(int arg0) {
        class267 var1 = (class267) field3510.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3511.method3897(6, arg0);
        class267 var3 = new class267();
        var3.field3517 = arg0;
        if (var2 != null) {
            var3.method4287(new class185(var2));
        }
        var3.method4286();
        if (var3.field3549) {
            var3.field3527 = 0;
            var3.field3528 = false;
        }
        field3510.method3375(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jf.e(I)V")
    public void method4286() {
        if (this.field3529 == -1) {
            this.field3529 = 0;
            if (this.field3539 != null && (this.field3519 == null || this.field3519[0] == 10)) {
                this.field3529 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3515[var1] != null) {
                    this.field3529 = 1;
                }
            }
        }
        if (this.field3550 == -1) {
            this.field3550 = this.field3527 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jf.k(Lgh;I)V")
    public void method4287(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4288(arg0, var2);
        }
    }

    @ObfuscatedName("jf.u(Lgh;IB)V")
    public void method4288(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2962();
            if (var3 > 0) {
                if (this.field3539 == null || field3533) {
                    this.field3519 = new int[var3];
                    this.field3539 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3539[var4] = arg0.method3194();
                        this.field3519[var4] = arg0.method2962();
                    }
                } else {
                    arg0.field2509 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3520 = arg0.method3168();
        } else if (arg1 == 5) {
            int var5 = arg0.method2962();
            if (var5 > 0) {
                if (this.field3539 == null || field3533) {
                    this.field3519 = null;
                    this.field3539 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3539[var6] = arg0.method3194();
                    }
                } else {
                    arg0.field2509 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3544 = arg0.method2962();
        } else if (arg1 == 15) {
            this.field3526 = arg0.method2962();
        } else if (arg1 == 17) {
            this.field3527 = 0;
            this.field3528 = false;
        } else if (arg1 == 18) {
            this.field3528 = false;
        } else if (arg1 == 19) {
            this.field3529 = arg0.method2962();
        } else if (arg1 == 21) {
            this.field3530 = 0;
        } else if (arg1 == 22) {
            this.field3531 = true;
        } else if (arg1 == 23) {
            this.field3532 = true;
        } else if (arg1 == 24) {
            this.field3558 = arg0.method3194();
            if (this.field3558 == 65535) {
                this.field3558 = -1;
            }
        } else if (arg1 == 27) {
            this.field3527 = 1;
        } else if (arg1 == 28) {
            this.field3518 = arg0.method2962();
        } else if (arg1 == 29) {
            this.field3523 = arg0.method3015();
        } else if (arg1 == 39) {
            this.field3536 = arg0.method3015() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3515[arg1 - 30] = arg0.method3168();
            if (this.field3515[arg1 - 30].equalsIgnoreCase(class237.field2962)) {
                this.field3515[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2962();
            this.field3521 = new short[var7];
            this.field3516 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3521[var8] = (short) arg0.method3194();
                this.field3516[var8] = (short) arg0.method3194();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2962();
            this.field3512 = new short[var9];
            this.field3524 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3512[var10] = (short) arg0.method3194();
                this.field3524[var10] = (short) arg0.method3194();
            }
        } else if (arg1 == 62) {
            this.field3540 = true;
        } else if (arg1 == 64) {
            this.field3542 = false;
        } else if (arg1 == 65) {
            this.field3537 = arg0.method3194();
        } else if (arg1 == 66) {
            this.field3543 = arg0.method3194();
        } else if (arg1 == 67) {
            this.field3534 = arg0.method3194();
        } else if (arg1 == 68) {
            this.field3557 = arg0.method3194();
        } else if (arg1 == 69) {
            arg0.method2962();
        } else if (arg1 == 70) {
            this.field3545 = arg0.method2965();
        } else if (arg1 == 71) {
            this.field3546 = arg0.method2965();
        } else if (arg1 == 72) {
            this.field3535 = arg0.method2965();
        } else if (arg1 == 73) {
            this.field3548 = true;
        } else if (arg1 == 74) {
            this.field3549 = true;
        } else if (arg1 == 75) {
            this.field3550 = arg0.method2962();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3525 = arg0.method3194();
            if (this.field3525 == 65535) {
                this.field3525 = -1;
            }
            this.field3553 = arg0.method3194();
            if (this.field3553 == 65535) {
                this.field3553 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3194();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2962();
            this.field3551 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3551[var15] = arg0.method3194();
                if (this.field3551[var15] == 65535) {
                    this.field3551[var15] = -1;
                }
            }
            this.field3551[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3554 = arg0.method3194();
            this.field3555 = arg0.method2962();
        } else if (arg1 == 79) {
            this.field3556 = arg0.method3194();
            this.field3547 = arg0.method3194();
            this.field3555 = arg0.method2962();
            int var11 = arg0.method2962();
            this.field3541 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3541[var12] = arg0.method3194();
            }
        } else if (arg1 == 81) {
            this.field3530 = arg0.method2962() * 256;
        } else if (arg1 == 82) {
            this.field3538 = arg0.method3194();
        } else if (arg1 == 249) {
            this.field3559 = class261.method933(arg0, this.field3559);
        }
    }

    @ObfuscatedName("jf.z(II)Z")
    public final boolean method4289(int arg0) {
        if (this.field3519 != null) {
            for (int var4 = 0; var4 < this.field3519.length; var4++) {
                if (this.field3519[var4] == arg0) {
                    return Statics.field3552.method3901(this.field3539[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3539 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3539.length; var3++) {
                var2 &= Statics.field3552.method3901(this.field3539[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jf.t(S)Z")
    public final boolean method4290() {
        if (this.field3539 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3539.length; var2++) {
            var1 &= Statics.field3552.method3901(this.field3539[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jf.f(II[[IIIII)Lel;")
    public final class141 method4332(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3519 == null) {
            var7 = (long) ((this.field3517 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3517 << 10) + (arg0 << 3) + arg1);
        }
        class141 var9 = (class141) field3514.method3373(var7);
        if (var9 == null) {
            class127 var10 = this.method4296(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3531) {
                var10.field1719 = (short) (this.field3523 + 64);
                var10.field1701 = (short) (this.field3536 + 768);
                var10.method2220();
                var9 = var10;
            } else {
                var9 = var10.method2224(this.field3523 + 64, this.field3536 + 768, -50, -10, -50);
            }
            field3514.method3375(var9, var7);
        }
        if (this.field3531) {
            var9 = ((class127) var9).method2257();
        }
        if (this.field3530 >= 0) {
            if (var9 instanceof class133) {
                var9 = ((class133) var9).method2307(arg2, arg3, arg4, arg5, true, this.field3530);
            } else if (var9 instanceof class127) {
                var9 = ((class127) var9).method2229(arg2, arg3, arg4, arg5, true, this.field3530);
            }
        }
        return var9;
    }

    @ObfuscatedName("jf.g(II[[IIIII)Lef;")
    public final class133 method4292(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3519 == null) {
            var7 = (long) ((this.field3517 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3517 << 10) + (arg0 << 3) + arg1);
        }
        class133 var9 = (class133) field3522.method3373(var7);
        if (var9 == null) {
            class127 var10 = this.method4296(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2224(this.field3523 + 64, this.field3536 + 768, -50, -10, -50);
            field3522.method3375(var9, var7);
        }
        if (this.field3530 >= 0) {
            var9 = var9.method2307(arg2, arg3, arg4, arg5, true, this.field3530);
        }
        return var9;
    }

    @ObfuscatedName("jf.x(II[[IIIILjj;II)Lef;")
    public final class133 method4293(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class272 arg6, int arg7) {
        long var9;
        if (this.field3519 == null) {
            var9 = (long) ((this.field3517 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3517 << 10) + (arg0 << 3) + arg1);
        }
        class133 var11 = (class133) field3522.method3373(var9);
        if (var11 == null) {
            class127 var12 = this.method4296(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2224(this.field3523 + 64, this.field3536 + 768, -50, -10, -50);
            field3522.method3375(var11, var9);
        }
        if (arg6 == null && this.field3530 == -1) {
            return var11;
        }
        class133 var13;
        if (arg6 == null) {
            var13 = var11.method2298(true);
        } else {
            var13 = arg6.method4461(var11, arg7, arg1);
        }
        if (this.field3530 >= 0) {
            var13 = var13.method2307(arg2, arg3, arg4, arg5, false, this.field3530);
        }
        return var13;
    }

    @ObfuscatedName("jf.c(IIB)Ldm;")
    public final class127 method4296(int arg0, int arg1) {
        class127 var3 = null;
        if (this.field3519 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3539 == null) {
                return null;
            }
            boolean var4 = this.field3540;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3539.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3539[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class127) field3513.method3373((long) var7);
                if (var3 == null) {
                    var3 = class127.method2217(Statics.field3552, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2218();
                    }
                    field3513.method3375(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3509[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class127(field3509, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3519.length; var9++) {
                if (this.field3519[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3539[var8];
            boolean var11 = this.field3540 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class127) field3513.method3373((long) var10);
            if (var3 == null) {
                var3 = class127.method2217(Statics.field3552, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2218();
                }
                field3513.method3375(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3537 == 128 && this.field3543 == 128 && this.field3534 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3545 == 0 && this.field3546 == 0 && this.field3535 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class127 var14 = new class127(var3, arg1 == 0 && !var12 && !var13, this.field3521 == null, this.field3512 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2214(256);
            var14.method2215(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2249();
        } else if (var15 == 2) {
            var14.method2241();
        } else if (var15 == 3) {
            var14.method2263();
        }
        if (this.field3521 != null) {
            for (int var16 = 0; var16 < this.field3521.length; var16++) {
                var14.method2216(this.field3521[var16], this.field3516[var16]);
            }
        }
        if (this.field3512 != null) {
            for (int var17 = 0; var17 < this.field3512.length; var17++) {
                var14.method2226(this.field3512[var17], this.field3524[var17]);
            }
        }
        if (var12) {
            var14.method2276(this.field3537, this.field3543, this.field3534);
        }
        if (var13) {
            var14.method2215(this.field3545, this.field3546, this.field3535);
        }
        return var14;
    }

    @ObfuscatedName("jf.n(I)Ljf;")
    public final class267 method4325() {
        int var1 = -1;
        if (this.field3525 != -1) {
            var1 = Statics.method463(this.field3525);
        } else if (this.field3553 != -1) {
            var1 = class223.field2723[this.field3553];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3551.length - 1) {
            var2 = this.field3551[var1];
        } else {
            var2 = this.field3551[this.field3551.length - 1];
        }
        return var2 == -1 ? null : method2129(var2);
    }

    @ObfuscatedName("jf.y(III)I")
    public int method4295(int arg0, int arg1) {
        return class261.method1485(this.field3559, arg0, arg1);
    }

    @ObfuscatedName("jf.o(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4312(int arg0, String arg1) {
        return class261.method3290(this.field3559, arg0, arg1);
    }

    @ObfuscatedName("ab.r(S)V")
    public static void method198() {
        field3510.method3370();
        field3513.method3370();
        field3514.method3370();
        field3522.method3370();
    }

    @ObfuscatedName("jf.i(I)Z")
    public boolean method4297() {
        if (this.field3551 == null) {
            return this.field3554 != -1 || this.field3541 != null;
        }
        for (int var1 = 0; var1 < this.field3551.length; var1++) {
            if (this.field3551[var1] != -1) {
                class267 var2 = method2129(this.field3551[var1]);
                if (var2.field3554 != -1 || var2.field3541 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
