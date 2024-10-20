package deob;

@ObfuscatedName("jb")
public class class276 extends class215 {

    @ObfuscatedName("jb.b")
    public static boolean field3530 = false;

    @ObfuscatedName("jb.p")
    public static class210 field3520 = new class210(4096);

    @ObfuscatedName("jb.a")
    public static class210 field3521 = new class210(500);

    @ObfuscatedName("jb.h")
    public static class210 field3529 = new class210(30);

    @ObfuscatedName("jb.l")
    public static class210 field3523 = new class210(30);

    @ObfuscatedName("jb.y")
    public static class125[] field3524 = new class125[4];

    @ObfuscatedName("jb.g")
    public int field3522;

    @ObfuscatedName("jb.c")
    public int[] field3553;

    @ObfuscatedName("jb.u")
    public int[] field3527;

    @ObfuscatedName("jb.r")
    public String field3525 = "null";

    @ObfuscatedName("jb.d")
    public short[] field3548;

    @ObfuscatedName("jb.v")
    public short[] field3558;

    @ObfuscatedName("jb.s")
    public short[] field3531;

    @ObfuscatedName("jb.t")
    public short[] field3532;

    @ObfuscatedName("jb.f")
    public int field3533 = 1;

    @ObfuscatedName("jb.m")
    public int field3534 = 1;

    @ObfuscatedName("jb.x")
    public int field3542 = 2;

    @ObfuscatedName("jb.w")
    public boolean field3536 = true;

    @ObfuscatedName("jb.j")
    public int field3537 = -1;

    @ObfuscatedName("jb.z")
    public int field3538 = -1;

    @ObfuscatedName("jb.e")
    public boolean field3563 = false;

    @ObfuscatedName("jb.k")
    public boolean field3559 = false;

    @ObfuscatedName("jb.n")
    public int field3528 = -1;

    @ObfuscatedName("jb.i")
    public int field3545 = 16;

    @ObfuscatedName("jb.av")
    public int field3543 = 0;

    @ObfuscatedName("jb.ao")
    public int field3544 = 0;

    @ObfuscatedName("jb.am")
    public String[] field3550 = new String[5];

    @ObfuscatedName("jb.aj")
    public int field3546 = -1;

    @ObfuscatedName("jb.ah")
    public int field3539 = -1;

    @ObfuscatedName("jb.af")
    public boolean field3551 = false;

    @ObfuscatedName("jb.ai")
    public boolean field3549 = true;

    @ObfuscatedName("jb.aq")
    public int field3535 = 128;

    @ObfuscatedName("jb.ak")
    public int field3547 = 128;

    @ObfuscatedName("jb.al")
    public int field3568 = 128;

    @ObfuscatedName("jb.as")
    public int field3519 = 0;

    @ObfuscatedName("jb.az")
    public int field3554 = 0;

    @ObfuscatedName("jb.ax")
    public int field3555 = 0;

    @ObfuscatedName("jb.ad")
    public boolean field3556 = false;

    @ObfuscatedName("jb.ar")
    public boolean field3557 = false;

    @ObfuscatedName("jb.ag")
    public int field3552 = -1;

    @ObfuscatedName("jb.au")
    public int[] field3541;

    @ObfuscatedName("jb.ac")
    public int field3560 = -1;

    @ObfuscatedName("jb.ay")
    public int field3561 = -1;

    @ObfuscatedName("jb.at")
    public int field3562 = -1;

    @ObfuscatedName("jb.aa")
    public int field3540 = 0;

    @ObfuscatedName("jb.aw")
    public int field3564 = 0;

    @ObfuscatedName("jb.ab")
    public int field3565 = 0;

    @ObfuscatedName("jb.ap")
    public int[] field3566;

    @ObfuscatedName("jb.ae")
    public class207 field3567;

    @ObfuscatedName("bv.b(II)Ljb;")
    public static class276 method1566(int arg0) {
        class276 var1 = (class276) field3520.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1545.method4158(6, arg0);
        class276 var3 = new class276();
        var3.field3522 = arg0;
        if (var2 != null) {
            var3.method4591(new class194(var2));
        }
        var3.method4555();
        if (var3.field3557) {
            var3.field3542 = 0;
            var3.field3536 = false;
        }
        field3520.method3659(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jb.q(B)V")
    public void method4555() {
        if (this.field3537 == -1) {
            this.field3537 = 0;
            if (this.field3553 != null && (this.field3527 == null || this.field3527[0] == 10)) {
                this.field3537 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3550[var1] != null) {
                    this.field3537 = 1;
                }
            }
        }
        if (this.field3552 == -1) {
            this.field3552 = this.field3542 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jb.o(Lgn;B)V")
    public void method4591(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4554(arg0, var2);
        }
    }

    @ObfuscatedName("jb.p(Lgn;II)V")
    public void method4554(class194 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3247();
            if (var3 > 0) {
                if (this.field3553 == null || field3530) {
                    this.field3527 = new int[var3];
                    this.field3553 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3553[var4] = arg0.method3249();
                        this.field3527[var4] = arg0.method3247();
                    }
                } else {
                    arg0.field2538 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3525 = arg0.method3256();
        } else if (arg1 == 5) {
            int var5 = arg0.method3247();
            if (var5 > 0) {
                if (this.field3553 == null || field3530) {
                    this.field3527 = null;
                    this.field3553 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3553[var6] = arg0.method3249();
                    }
                } else {
                    arg0.field2538 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3533 = arg0.method3247();
        } else if (arg1 == 15) {
            this.field3534 = arg0.method3247();
        } else if (arg1 == 17) {
            this.field3542 = 0;
            this.field3536 = false;
        } else if (arg1 == 18) {
            this.field3536 = false;
        } else if (arg1 == 19) {
            this.field3537 = arg0.method3247();
        } else if (arg1 == 21) {
            this.field3538 = 0;
        } else if (arg1 == 22) {
            this.field3563 = true;
        } else if (arg1 == 23) {
            this.field3559 = true;
        } else if (arg1 == 24) {
            this.field3528 = arg0.method3249();
            if (this.field3528 == 65535) {
                this.field3528 = -1;
            }
        } else if (arg1 == 27) {
            this.field3542 = 1;
        } else if (arg1 == 28) {
            this.field3545 = arg0.method3247();
        } else if (arg1 == 29) {
            this.field3543 = arg0.method3248();
        } else if (arg1 == 39) {
            this.field3544 = arg0.method3248() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3550[arg1 - 30] = arg0.method3256();
            if (this.field3550[arg1 - 30].equalsIgnoreCase(class246.field2975)) {
                this.field3550[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3247();
            this.field3548 = new short[var7];
            this.field3558 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3548[var8] = (short) arg0.method3249();
                this.field3558[var8] = (short) arg0.method3249();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3247();
            this.field3531 = new short[var9];
            this.field3532 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3531[var10] = (short) arg0.method3249();
                this.field3532[var10] = (short) arg0.method3249();
            }
        } else if (arg1 == 62) {
            this.field3551 = true;
        } else if (arg1 == 64) {
            this.field3549 = false;
        } else if (arg1 == 65) {
            this.field3535 = arg0.method3249();
        } else if (arg1 == 66) {
            this.field3547 = arg0.method3249();
        } else if (arg1 == 67) {
            this.field3568 = arg0.method3249();
        } else if (arg1 == 68) {
            this.field3539 = arg0.method3249();
        } else if (arg1 == 69) {
            arg0.method3247();
        } else if (arg1 == 70) {
            this.field3519 = arg0.method3230();
        } else if (arg1 == 71) {
            this.field3554 = arg0.method3230();
        } else if (arg1 == 72) {
            this.field3555 = arg0.method3230();
        } else if (arg1 == 73) {
            this.field3556 = true;
        } else if (arg1 == 74) {
            this.field3557 = true;
        } else if (arg1 == 75) {
            this.field3552 = arg0.method3247();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3560 = arg0.method3249();
            if (this.field3560 == 65535) {
                this.field3560 = -1;
            }
            this.field3561 = arg0.method3249();
            if (this.field3561 == 65535) {
                this.field3561 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3249();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3247();
            this.field3541 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3541[var15] = arg0.method3249();
                if (this.field3541[var15] == 65535) {
                    this.field3541[var15] = -1;
                }
            }
            this.field3541[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3562 = arg0.method3249();
            this.field3540 = arg0.method3247();
        } else if (arg1 == 79) {
            this.field3564 = arg0.method3249();
            this.field3565 = arg0.method3249();
            this.field3540 = arg0.method3247();
            int var11 = arg0.method3247();
            this.field3566 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3566[var12] = arg0.method3249();
            }
        } else if (arg1 == 81) {
            this.field3538 = arg0.method3247() * 256;
        } else if (arg1 == 82) {
            this.field3546 = arg0.method3249();
        } else if (arg1 == 249) {
            this.field3567 = class270.method2485(arg0, this.field3567);
        }
    }

    @ObfuscatedName("jb.a(IB)Z")
    public final boolean method4557(int arg0) {
        if (this.field3527 != null) {
            for (int var4 = 0; var4 < this.field3527.length; var4++) {
                if (this.field3527[var4] == arg0) {
                    return Statics.field2097.method4221(this.field3553[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3553 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3553.length; var3++) {
                var2 &= Statics.field2097.method4221(this.field3553[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jb.h(I)Z")
    public final boolean method4558() {
        if (this.field3553 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3553.length; var2++) {
            var1 &= Statics.field2097.method4221(this.field3553[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jb.l(II[[IIIIB)Les;")
    public final class139 method4559(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3527 == null) {
            var7 = (long) ((this.field3522 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3522 << 10) + (arg0 << 3) + arg1);
        }
        class139 var9 = (class139) field3529.method3658(var7);
        if (var9 == null) {
            class125 var10 = this.method4562(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3563) {
                var10.field1711 = (short) (this.field3543 + 64);
                var10.field1712 = (short) (this.field3544 + 768);
                var10.method2468();
                var9 = var10;
            } else {
                var9 = var10.method2409(this.field3543 + 64, this.field3544 + 768, -50, -10, -50);
            }
            field3529.method3659(var9, var7);
        }
        if (this.field3563) {
            var9 = ((class125) var9).method2399();
        }
        if (this.field3538 >= 0) {
            if (var9 instanceof class131) {
                var9 = ((class131) var9).method2536(arg2, arg3, arg4, arg5, true, this.field3538);
            } else if (var9 instanceof class125) {
                var9 = ((class125) var9).method2469(arg2, arg3, arg4, arg5, true, this.field3538);
            }
        }
        return var9;
    }

    @ObfuscatedName("jb.y(II[[IIIII)Lee;")
    public final class131 method4560(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3527 == null) {
            var7 = (long) ((this.field3522 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3522 << 10) + (arg0 << 3) + arg1);
        }
        class131 var9 = (class131) field3523.method3658(var7);
        if (var9 == null) {
            class125 var10 = this.method4562(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2409(this.field3543 + 64, this.field3544 + 768, -50, -10, -50);
            field3523.method3659(var9, var7);
        }
        if (this.field3538 >= 0) {
            var9 = var9.method2536(arg2, arg3, arg4, arg5, true, this.field3538);
        }
        return var9;
    }

    @ObfuscatedName("jb.g(II[[IIIILjo;II)Lee;")
    public final class131 method4561(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class281 arg6, int arg7) {
        long var9;
        if (this.field3527 == null) {
            var9 = (long) ((this.field3522 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3522 << 10) + (arg0 << 3) + arg1);
        }
        class131 var11 = (class131) field3523.method3658(var9);
        if (var11 == null) {
            class125 var12 = this.method4562(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2409(this.field3543 + 64, this.field3544 + 768, -50, -10, -50);
            field3523.method3659(var11, var9);
        }
        if (arg6 == null && this.field3538 == -1) {
            return var11;
        }
        class131 var13;
        if (arg6 == null) {
            var13 = var11.method2491(true);
        } else {
            var13 = arg6.method4728(var11, arg7, arg1);
        }
        if (this.field3538 >= 0) {
            var13 = var13.method2536(arg2, arg3, arg4, arg5, false, this.field3538);
        }
        return var13;
    }

    @ObfuscatedName("jb.c(III)Ldy;")
    public final class125 method4562(int arg0, int arg1) {
        class125 var3 = null;
        if (this.field3527 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3553 == null) {
                return null;
            }
            boolean var4 = this.field3551;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3553.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3553[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class125) field3521.method3658((long) var7);
                if (var3 == null) {
                    var3 = class125.method2389(Statics.field2097, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2448();
                    }
                    field3521.method3659(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3524[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class125(field3524, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3527.length; var9++) {
                if (this.field3527[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3553[var8];
            boolean var11 = this.field3551 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class125) field3521.method3658((long) var10);
            if (var3 == null) {
                var3 = class125.method2389(Statics.field2097, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2448();
                }
                field3521.method3659(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3535 == 128 && this.field3547 == 128 && this.field3568 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3519 == 0 && this.field3554 == 0 && this.field3555 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class125 var14 = new class125(var3, arg1 == 0 && !var12 && !var13, this.field3548 == null, this.field3531 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2456(256);
            var14.method2400(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2396();
        } else if (var15 == 2) {
            var14.method2427();
        } else if (var15 == 3) {
            var14.method2398();
        }
        if (this.field3548 != null) {
            for (int var16 = 0; var16 < this.field3548.length; var16++) {
                var14.method2401(this.field3548[var16], this.field3558[var16]);
            }
        }
        if (this.field3531 != null) {
            for (int var17 = 0; var17 < this.field3531.length; var17++) {
                var14.method2402(this.field3531[var17], this.field3532[var17]);
            }
        }
        if (var12) {
            var14.method2404(this.field3535, this.field3547, this.field3568);
        }
        if (var13) {
            var14.method2400(this.field3519, this.field3554, this.field3555);
        }
        return var14;
    }

    @ObfuscatedName("jb.u(B)Ljb;")
    public final class276 method4563() {
        int var1 = -1;
        if (this.field3560 != -1) {
            var1 = class232.method248(this.field3560);
        } else if (this.field3561 != -1) {
            var1 = class232.field2740[this.field3561];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3541.length - 1) {
            var2 = this.field3541[var1];
        } else {
            var2 = this.field3541[this.field3541.length - 1];
        }
        return var2 == -1 ? null : method1566(var2);
    }

    @ObfuscatedName("jb.t(III)I")
    public int method4582(int arg0, int arg1) {
        class207 var3 = this.field3567;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class219 var5 = (class219) var3.method3632((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2626;
            }
        }
        return var4;
    }

    @ObfuscatedName("jb.f(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4577(int arg0, String arg1) {
        return class270.method941(this.field3567, arg0, arg1);
    }

    @ObfuscatedName("gr.m(I)V")
    public static void method3154() {
        field3520.method3661();
        field3521.method3661();
        field3529.method3661();
        field3523.method3661();
    }

    @ObfuscatedName("jb.x(I)Z")
    public boolean method4567() {
        if (this.field3541 == null) {
            return this.field3562 != -1 || this.field3566 != null;
        }
        for (int var1 = 0; var1 < this.field3541.length; var1++) {
            if (this.field3541[var1] != -1) {
                class276 var2 = method1566(this.field3541[var1]);
                if (var2.field3562 != -1 || var2.field3566 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
