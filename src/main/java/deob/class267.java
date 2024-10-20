package deob;

@ObfuscatedName("ju")
public class class267 extends class206 {

    @ObfuscatedName("ju.s")
    public static boolean field3547 = false;

    @ObfuscatedName("ju.h")
    public static class201 field3520 = new class201(4096);

    @ObfuscatedName("ju.i")
    public static class201 field3521 = new class201(500);

    @ObfuscatedName("ju.w")
    public static class201 field3522 = new class201(30);

    @ObfuscatedName("ju.t")
    public static class201 field3523 = new class201(30);

    @ObfuscatedName("ju.d")
    public static class125[] field3524 = new class125[4];

    @ObfuscatedName("ju.z")
    public int field3525;

    @ObfuscatedName("ju.k")
    public int[] field3526;

    @ObfuscatedName("ju.c")
    public int[] field3527;

    @ObfuscatedName("ju.o")
    public String field3533 = "null";

    @ObfuscatedName("ju.l")
    public short[] field3529;

    @ObfuscatedName("ju.f")
    public short[] field3530;

    @ObfuscatedName("ju.q")
    public short[] field3531;

    @ObfuscatedName("ju.r")
    public short[] field3532;

    @ObfuscatedName("ju.x")
    public int field3537 = 1;

    @ObfuscatedName("ju.u")
    public int field3534 = 1;

    @ObfuscatedName("ju.b")
    public int field3535 = 2;

    @ObfuscatedName("ju.p")
    public boolean field3536 = true;

    @ObfuscatedName("ju.y")
    public int field3548 = -1;

    @ObfuscatedName("ju.n")
    public int field3551 = -1;

    @ObfuscatedName("ju.j")
    public boolean field3539 = false;

    @ObfuscatedName("ju.e")
    public boolean field3544 = false;

    @ObfuscatedName("ju.v")
    public int field3541 = -1;

    @ObfuscatedName("ju.a")
    public int field3542 = 16;

    @ObfuscatedName("ju.ad")
    public int field3543 = 0;

    @ObfuscatedName("ju.al")
    public int field3557 = 0;

    @ObfuscatedName("ju.aq")
    public String[] field3545 = new String[5];

    @ObfuscatedName("ju.ar")
    public int field3546 = -1;

    @ObfuscatedName("ju.an")
    public int field3538 = -1;

    @ObfuscatedName("ju.af")
    public boolean field3540 = false;

    @ObfuscatedName("ju.as")
    public boolean field3549 = true;

    @ObfuscatedName("ju.ax")
    public int field3550 = 128;

    @ObfuscatedName("ju.ak")
    public int field3567 = 128;

    @ObfuscatedName("ju.aw")
    public int field3552 = 128;

    @ObfuscatedName("ju.ai")
    public int field3553 = 0;

    @ObfuscatedName("ju.ab")
    public int field3528 = 0;

    @ObfuscatedName("ju.am")
    public int field3555 = 0;

    @ObfuscatedName("ju.ah")
    public boolean field3556 = false;

    @ObfuscatedName("ju.ag")
    public boolean field3554 = false;

    @ObfuscatedName("ju.az")
    public int field3558 = -1;

    @ObfuscatedName("ju.ae")
    public int[] field3559;

    @ObfuscatedName("ju.ao")
    public int field3560 = -1;

    @ObfuscatedName("ju.av")
    public int field3561 = -1;

    @ObfuscatedName("ju.aj")
    public int field3518 = -1;

    @ObfuscatedName("ju.ap")
    public int field3563 = 0;

    @ObfuscatedName("ju.au")
    public int field3564 = 0;

    @ObfuscatedName("ju.ay")
    public int field3565 = 0;

    @ObfuscatedName("ju.aa")
    public int[] field3566;

    @ObfuscatedName("ju.at")
    public class198 field3562;

    @ObfuscatedName("hl.s(II)Lju;")
    public static class267 method4025(int arg0) {
        class267 var1 = (class267) field3520.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3517.method4231(6, arg0);
        class267 var3 = new class267();
        var3.field3525 = arg0;
        if (var2 != null) {
            var3.method4588(new class185(var2));
        }
        var3.method4587();
        if (var3.field3554) {
            var3.field3535 = 0;
            var3.field3536 = false;
        }
        field3520.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ju.g(B)V")
    public void method4587() {
        if (this.field3548 == -1) {
            this.field3548 = 0;
            if (this.field3526 != null && (this.field3527 == null || this.field3527[0] == 10)) {
                this.field3548 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3545[var1] != null) {
                    this.field3548 = 1;
                }
            }
        }
        if (this.field3558 == -1) {
            this.field3558 = this.field3535 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ju.m(Lgy;I)V")
    public void method4588(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4589(arg0, var2);
        }
    }

    @ObfuscatedName("ju.h(Lgy;II)V")
    public void method4589(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3239();
            if (var3 > 0) {
                if (this.field3526 == null || field3547) {
                    this.field3527 = new int[var3];
                    this.field3526 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3526[var4] = arg0.method3241();
                        this.field3527[var4] = arg0.method3239();
                    }
                } else {
                    arg0.field2514 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3533 = arg0.method3248();
        } else if (arg1 == 5) {
            int var5 = arg0.method3239();
            if (var5 > 0) {
                if (this.field3526 == null || field3547) {
                    this.field3527 = null;
                    this.field3526 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3526[var6] = arg0.method3241();
                    }
                } else {
                    arg0.field2514 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3537 = arg0.method3239();
        } else if (arg1 == 15) {
            this.field3534 = arg0.method3239();
        } else if (arg1 == 17) {
            this.field3535 = 0;
            this.field3536 = false;
        } else if (arg1 == 18) {
            this.field3536 = false;
        } else if (arg1 == 19) {
            this.field3548 = arg0.method3239();
        } else if (arg1 == 21) {
            this.field3551 = 0;
        } else if (arg1 == 22) {
            this.field3539 = true;
        } else if (arg1 == 23) {
            this.field3544 = true;
        } else if (arg1 == 24) {
            this.field3541 = arg0.method3241();
            if (this.field3541 == 65535) {
                this.field3541 = -1;
            }
        } else if (arg1 == 27) {
            this.field3535 = 1;
        } else if (arg1 == 28) {
            this.field3542 = arg0.method3239();
        } else if (arg1 == 29) {
            this.field3543 = arg0.method3240();
        } else if (arg1 == 39) {
            this.field3557 = arg0.method3240() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3545[arg1 - 30] = arg0.method3248();
            if (this.field3545[arg1 - 30].equalsIgnoreCase(class237.field2955)) {
                this.field3545[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3239();
            this.field3529 = new short[var7];
            this.field3530 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3529[var8] = (short) arg0.method3241();
                this.field3530[var8] = (short) arg0.method3241();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3239();
            this.field3531 = new short[var9];
            this.field3532 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3531[var10] = (short) arg0.method3241();
                this.field3532[var10] = (short) arg0.method3241();
            }
        } else if (arg1 == 62) {
            this.field3540 = true;
        } else if (arg1 == 64) {
            this.field3549 = false;
        } else if (arg1 == 65) {
            this.field3550 = arg0.method3241();
        } else if (arg1 == 66) {
            this.field3567 = arg0.method3241();
        } else if (arg1 == 67) {
            this.field3552 = arg0.method3241();
        } else if (arg1 == 68) {
            this.field3538 = arg0.method3241();
        } else if (arg1 == 69) {
            arg0.method3239();
        } else if (arg1 == 70) {
            this.field3553 = arg0.method3221();
        } else if (arg1 == 71) {
            this.field3528 = arg0.method3221();
        } else if (arg1 == 72) {
            this.field3555 = arg0.method3221();
        } else if (arg1 == 73) {
            this.field3556 = true;
        } else if (arg1 == 74) {
            this.field3554 = true;
        } else if (arg1 == 75) {
            this.field3558 = arg0.method3239();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3560 = arg0.method3241();
            if (this.field3560 == 65535) {
                this.field3560 = -1;
            }
            this.field3561 = arg0.method3241();
            if (this.field3561 == 65535) {
                this.field3561 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3241();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3239();
            this.field3559 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3559[var15] = arg0.method3241();
                if (this.field3559[var15] == 65535) {
                    this.field3559[var15] = -1;
                }
            }
            this.field3559[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3518 = arg0.method3241();
            this.field3563 = arg0.method3239();
        } else if (arg1 == 79) {
            this.field3564 = arg0.method3241();
            this.field3565 = arg0.method3241();
            this.field3563 = arg0.method3239();
            int var11 = arg0.method3239();
            this.field3566 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3566[var12] = arg0.method3241();
            }
        } else if (arg1 == 81) {
            this.field3551 = arg0.method3239() * 256;
        } else if (arg1 == 82) {
            this.field3546 = arg0.method3241();
        } else if (arg1 == 249) {
            this.field3562 = class261.method4400(arg0, this.field3562);
        }
    }

    @ObfuscatedName("ju.i(II)Z")
    public final boolean method4626(int arg0) {
        if (this.field3527 != null) {
            for (int var4 = 0; var4 < this.field3527.length; var4++) {
                if (this.field3527[var4] == arg0) {
                    return Statics.field3519.method4186(this.field3526[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3526 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3526.length; var3++) {
                var2 &= Statics.field3519.method4186(this.field3526[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ju.w(B)Z")
    public final boolean method4591() {
        if (this.field3526 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3526.length; var2++) {
            var1 &= Statics.field3519.method4186(this.field3526[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ju.t(II[[IIIIB)Leh;")
    public final class139 method4592(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3527 == null) {
            var7 = (long) ((this.field3525 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3525 << 10) + (arg0 << 3) + arg1);
        }
        class139 var9 = (class139) field3522.method3673(var7);
        if (var9 == null) {
            class125 var10 = this.method4595(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3539) {
                var10.field1713 = (short) (this.field3543 + 64);
                var10.field1714 = (short) (this.field3557 + 768);
                var10.method2446();
                var9 = var10;
            } else {
                var9 = var10.method2450(this.field3543 + 64, this.field3557 + 768, -50, -10, -50);
            }
            field3522.method3675(var9, var7);
        }
        if (this.field3539) {
            var9 = ((class125) var9).method2438();
        }
        if (this.field3551 >= 0) {
            if (var9 instanceof class131) {
                var9 = ((class131) var9).method2522(arg2, arg3, arg4, arg5, true, this.field3551);
            } else if (var9 instanceof class125) {
                var9 = ((class125) var9).method2435(arg2, arg3, arg4, arg5, true, this.field3551);
            }
        }
        return var9;
    }

    @ObfuscatedName("ju.d(II[[IIIII)Les;")
    public final class131 method4593(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3527 == null) {
            var7 = (long) ((this.field3525 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3525 << 10) + (arg0 << 3) + arg1);
        }
        class131 var9 = (class131) field3523.method3673(var7);
        if (var9 == null) {
            class125 var10 = this.method4595(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2450(this.field3543 + 64, this.field3557 + 768, -50, -10, -50);
            field3523.method3675(var9, var7);
        }
        if (this.field3551 >= 0) {
            var9 = var9.method2522(arg2, arg3, arg4, arg5, true, this.field3551);
        }
        return var9;
    }

    @ObfuscatedName("ju.z(II[[IIIILje;II)Les;")
    public final class131 method4611(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class272 arg6, int arg7) {
        long var9;
        if (this.field3527 == null) {
            var9 = (long) ((this.field3525 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3525 << 10) + (arg0 << 3) + arg1);
        }
        class131 var11 = (class131) field3523.method3673(var9);
        if (var11 == null) {
            class125 var12 = this.method4595(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2450(this.field3543 + 64, this.field3557 + 768, -50, -10, -50);
            field3523.method3675(var11, var9);
        }
        if (arg6 == null && this.field3551 == -1) {
            return var11;
        }
        class131 var13;
        if (arg6 == null) {
            var13 = var11.method2545(true);
        } else {
            var13 = arg6.method4749(var11, arg7, arg1);
        }
        if (this.field3551 >= 0) {
            var13 = var13.method2522(arg2, arg3, arg4, arg5, false, this.field3551);
        }
        return var13;
    }

    @ObfuscatedName("ju.k(III)Ldw;")
    public final class125 method4595(int arg0, int arg1) {
        class125 var3 = null;
        if (this.field3527 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3526 == null) {
                return null;
            }
            boolean var4 = this.field3540;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3526.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3526[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class125) field3521.method3673((long) var7);
                if (var3 == null) {
                    var3 = class125.method2428(Statics.field3519, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2506();
                    }
                    field3521.method3675(var3, (long) var7);
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
            int var10 = this.field3526[var8];
            boolean var11 = this.field3540 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class125) field3521.method3673((long) var10);
            if (var3 == null) {
                var3 = class125.method2428(Statics.field3519, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2506();
                }
                field3521.method3675(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3550 == 128 && this.field3567 == 128 && this.field3552 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3553 == 0 && this.field3528 == 0 && this.field3555 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class125 var14 = new class125(var3, arg1 == 0 && !var12 && !var13, this.field3529 == null, this.field3531 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2440(256);
            var14.method2441(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2487();
        } else if (var15 == 2) {
            var14.method2437();
        } else if (var15 == 3) {
            var14.method2439();
        }
        if (this.field3529 != null) {
            for (int var16 = 0; var16 < this.field3529.length; var16++) {
                var14.method2442(this.field3529[var16], this.field3530[var16]);
            }
        }
        if (this.field3531 != null) {
            for (int var17 = 0; var17 < this.field3531.length; var17++) {
                var14.method2443(this.field3531[var17], this.field3532[var17]);
            }
        }
        if (var12) {
            var14.method2430(this.field3550, this.field3567, this.field3552);
        }
        if (var13) {
            var14.method2441(this.field3553, this.field3528, this.field3555);
        }
        return var14;
    }

    @ObfuscatedName("ju.c(B)Lju;")
    public final class267 method4596() {
        int var1 = -1;
        if (this.field3560 != -1) {
            var1 = class223.method51(this.field3560);
        } else if (this.field3561 != -1) {
            var1 = class223.field2713[this.field3561];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3559.length - 1) {
            var2 = this.field3559[var1];
        } else {
            var2 = this.field3559[this.field3559.length - 1];
        }
        return var2 == -1 ? null : method4025(var2);
    }

    @ObfuscatedName("ju.o(III)I")
    public int method4597(int arg0, int arg1) {
        return class261.method1479(this.field3562, arg0, arg1);
    }

    @ObfuscatedName("ju.l(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4598(int arg0, String arg1) {
        return class261.method4283(this.field3562, arg0, arg1);
    }

    @ObfuscatedName("ju.f(I)Z")
    public boolean method4599() {
        if (this.field3559 == null) {
            return this.field3518 != -1 || this.field3566 != null;
        }
        for (int var1 = 0; var1 < this.field3559.length; var1++) {
            if (this.field3559[var1] != -1) {
                class267 var2 = method4025(this.field3559[var1]);
                if (var2.field3518 != -1 || var2.field3566 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
