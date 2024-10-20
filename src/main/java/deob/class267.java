package deob;

@ObfuscatedName("ji")
public class class267 extends class206 {

    @ObfuscatedName("ji.n")
    public static boolean field3554 = false;

    @ObfuscatedName("ji.r")
    public static class201 field3550 = new class201(4096);

    @ObfuscatedName("ji.h")
    public static class201 field3525 = new class201(500);

    @ObfuscatedName("ji.d")
    public static class201 field3526 = new class201(30);

    @ObfuscatedName("ji.s")
    public static class201 field3553 = new class201(30);

    @ObfuscatedName("ji.b")
    public static class127[] field3528 = new class127[4];

    @ObfuscatedName("ji.e")
    public int field3529;

    @ObfuscatedName("ji.f")
    public int[] field3530;

    @ObfuscatedName("ji.z")
    public int[] field3531;

    @ObfuscatedName("ji.u")
    public String field3540 = "null";

    @ObfuscatedName("ji.p")
    public short[] field3533;

    @ObfuscatedName("ji.w")
    public short[] field3534;

    @ObfuscatedName("ji.t")
    public short[] field3535;

    @ObfuscatedName("ji.o")
    public short[] field3536;

    @ObfuscatedName("ji.a")
    public int field3537 = 1;

    @ObfuscatedName("ji.i")
    public int field3538 = 1;

    @ObfuscatedName("ji.m")
    public int field3551 = 2;

    @ObfuscatedName("ji.x")
    public boolean field3541 = true;

    @ObfuscatedName("ji.l")
    public int field3524 = -1;

    @ObfuscatedName("ji.j")
    public int field3557 = -1;

    @ObfuscatedName("ji.g")
    public boolean field3563 = false;

    @ObfuscatedName("ji.c")
    public boolean field3544 = false;

    @ObfuscatedName("ji.k")
    public int field3545 = -1;

    @ObfuscatedName("ji.q")
    public int field3546 = 16;

    @ObfuscatedName("ji.ac")
    public int field3547 = 0;

    @ObfuscatedName("ji.aw")
    public int field3543 = 0;

    @ObfuscatedName("ji.at")
    public String[] field3548 = new String[5];

    @ObfuscatedName("ji.ag")
    public int field3556 = -1;

    @ObfuscatedName("ji.ad")
    public int field3522 = -1;

    @ObfuscatedName("ji.af")
    public boolean field3552 = false;

    @ObfuscatedName("ji.az")
    public boolean field3539 = true;

    @ObfuscatedName("ji.ae")
    public int field3527 = 128;

    @ObfuscatedName("ji.av")
    public int field3555 = 128;

    @ObfuscatedName("ji.am")
    public int field3532 = 128;

    @ObfuscatedName("ji.ax")
    public int field3521 = 0;

    @ObfuscatedName("ji.ah")
    public int field3558 = 0;

    @ObfuscatedName("ji.ab")
    public int field3559 = 0;

    @ObfuscatedName("ji.aj")
    public boolean field3560 = false;

    @ObfuscatedName("ji.aa")
    public boolean field3561 = false;

    @ObfuscatedName("ji.ao")
    public int field3562 = -1;

    @ObfuscatedName("ji.al")
    public int[] field3549;

    @ObfuscatedName("ji.ay")
    public int field3564 = -1;

    @ObfuscatedName("ji.aq")
    public int field3565 = -1;

    @ObfuscatedName("ji.ak")
    public int field3566 = -1;

    @ObfuscatedName("ji.as")
    public int field3567 = 0;

    @ObfuscatedName("ji.au")
    public int field3568 = 0;

    @ObfuscatedName("ji.an")
    public int field3569 = 0;

    @ObfuscatedName("ji.ai")
    public int[] field3570;

    @ObfuscatedName("ji.ap")
    public class198 field3571;

    @ObfuscatedName("bv.n(Lil;Lil;ZB)V")
    public static void method1022(class247 arg0, class247 arg1, boolean arg2) {
        Statics.field3542 = arg0;
        Statics.field3523 = arg1;
        field3554 = arg2;
    }

    @ObfuscatedName("cq.v(II)Lji;")
    public static class267 method1587(int arg0) {
        class267 var1 = (class267) field3550.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3542.method3931(6, arg0);
        class267 var3 = new class267();
        var3.field3529 = arg0;
        if (var2 != null) {
            var3.method4305(new class185(var2));
        }
        var3.method4304();
        if (var3.field3561) {
            var3.field3551 = 0;
            var3.field3541 = false;
        }
        field3550.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ji.y(B)V")
    public void method4304() {
        if (this.field3524 == -1) {
            this.field3524 = 0;
            if (this.field3530 != null && (this.field3531 == null || this.field3531[0] == 10)) {
                this.field3524 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3548[var1] != null) {
                    this.field3524 = 1;
                }
            }
        }
        if (this.field3562 == -1) {
            this.field3562 = this.field3551 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ji.r(Lgv;B)V")
    public void method4305(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4306(arg0, var2);
        }
    }

    @ObfuscatedName("ji.h(Lgv;II)V")
    public void method4306(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3021();
            if (var3 > 0) {
                if (this.field3530 == null || field3554) {
                    this.field3531 = new int[var3];
                    this.field3530 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3530[var4] = arg0.method3015();
                        this.field3531[var4] = arg0.method3021();
                    }
                } else {
                    arg0.field2529 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3540 = arg0.method3030();
        } else if (arg1 == 5) {
            int var5 = arg0.method3021();
            if (var5 > 0) {
                if (this.field3530 == null || field3554) {
                    this.field3531 = null;
                    this.field3530 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3530[var6] = arg0.method3015();
                    }
                } else {
                    arg0.field2529 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3537 = arg0.method3021();
        } else if (arg1 == 15) {
            this.field3538 = arg0.method3021();
        } else if (arg1 == 17) {
            this.field3551 = 0;
            this.field3541 = false;
        } else if (arg1 == 18) {
            this.field3541 = false;
        } else if (arg1 == 19) {
            this.field3524 = arg0.method3021();
        } else if (arg1 == 21) {
            this.field3557 = 0;
        } else if (arg1 == 22) {
            this.field3563 = true;
        } else if (arg1 == 23) {
            this.field3544 = true;
        } else if (arg1 == 24) {
            this.field3545 = arg0.method3015();
            if (this.field3545 == 65535) {
                this.field3545 = -1;
            }
        } else if (arg1 == 27) {
            this.field3551 = 1;
        } else if (arg1 == 28) {
            this.field3546 = arg0.method3021();
        } else if (arg1 == 29) {
            this.field3547 = arg0.method3022();
        } else if (arg1 == 39) {
            this.field3543 = arg0.method3022() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3548[arg1 - 30] = arg0.method3030();
            if (this.field3548[arg1 - 30].equalsIgnoreCase(class237.field3155)) {
                this.field3548[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3021();
            this.field3533 = new short[var7];
            this.field3534 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3533[var8] = (short) arg0.method3015();
                this.field3534[var8] = (short) arg0.method3015();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3021();
            this.field3535 = new short[var9];
            this.field3536 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3535[var10] = (short) arg0.method3015();
                this.field3536[var10] = (short) arg0.method3015();
            }
        } else if (arg1 == 62) {
            this.field3552 = true;
        } else if (arg1 == 64) {
            this.field3539 = false;
        } else if (arg1 == 65) {
            this.field3527 = arg0.method3015();
        } else if (arg1 == 66) {
            this.field3555 = arg0.method3015();
        } else if (arg1 == 67) {
            this.field3532 = arg0.method3015();
        } else if (arg1 == 68) {
            this.field3522 = arg0.method3015();
        } else if (arg1 == 69) {
            arg0.method3021();
        } else if (arg1 == 70) {
            this.field3521 = arg0.method3024();
        } else if (arg1 == 71) {
            this.field3558 = arg0.method3024();
        } else if (arg1 == 72) {
            this.field3559 = arg0.method3024();
        } else if (arg1 == 73) {
            this.field3560 = true;
        } else if (arg1 == 74) {
            this.field3561 = true;
        } else if (arg1 == 75) {
            this.field3562 = arg0.method3021();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3564 = arg0.method3015();
            if (this.field3564 == 65535) {
                this.field3564 = -1;
            }
            this.field3565 = arg0.method3015();
            if (this.field3565 == 65535) {
                this.field3565 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3015();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3021();
            this.field3549 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3549[var15] = arg0.method3015();
                if (this.field3549[var15] == 65535) {
                    this.field3549[var15] = -1;
                }
            }
            this.field3549[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3566 = arg0.method3015();
            this.field3567 = arg0.method3021();
        } else if (arg1 == 79) {
            this.field3568 = arg0.method3015();
            this.field3569 = arg0.method3015();
            this.field3567 = arg0.method3021();
            int var11 = arg0.method3021();
            this.field3570 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3570[var12] = arg0.method3015();
            }
        } else if (arg1 == 81) {
            this.field3557 = arg0.method3021() * 256;
        } else if (arg1 == 82) {
            this.field3556 = arg0.method3015();
        } else if (arg1 == 249) {
            this.field3571 = class261.method121(arg0, this.field3571);
        }
    }

    @ObfuscatedName("ji.d(II)Z")
    public final boolean method4307(int arg0) {
        if (this.field3531 != null) {
            for (int var4 = 0; var4 < this.field3531.length; var4++) {
                if (this.field3531[var4] == arg0) {
                    return Statics.field3523.method3918(this.field3530[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3530 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3530.length; var3++) {
                var2 &= Statics.field3523.method3918(this.field3530[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ji.s(I)Z")
    public final boolean method4308() {
        if (this.field3530 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3530.length; var2++) {
            var1 &= Statics.field3523.method3918(this.field3530[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ji.b(II[[IIIII)Leo;")
    public final class141 method4316(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3531 == null) {
            var7 = (long) ((this.field3529 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3529 << 10) + (arg0 << 3) + arg1);
        }
        class141 var9 = (class141) field3526.method3407(var7);
        if (var9 == null) {
            class127 var10 = this.method4312(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3563) {
                var10.field1735 = (short) (this.field3547 + 64);
                var10.field1736 = (short) (this.field3543 + 768);
                var10.method2263();
                var9 = var10;
            } else {
                var9 = var10.method2331(this.field3547 + 64, this.field3543 + 768, -50, -10, -50);
            }
            field3526.method3408(var9, var7);
        }
        if (this.field3563) {
            var9 = ((class127) var9).method2251();
        }
        if (this.field3557 >= 0) {
            if (var9 instanceof class133) {
                var9 = ((class133) var9).method2347(arg2, arg3, arg4, arg5, true, this.field3557);
            } else if (var9 instanceof class127) {
                var9 = ((class127) var9).method2252(arg2, arg3, arg4, arg5, true, this.field3557);
            }
        }
        return var9;
    }

    @ObfuscatedName("ji.e(II[[IIIIB)Les;")
    public final class133 method4310(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3531 == null) {
            var7 = (long) ((this.field3529 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3529 << 10) + (arg0 << 3) + arg1);
        }
        class133 var9 = (class133) field3553.method3407(var7);
        if (var9 == null) {
            class127 var10 = this.method4312(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2331(this.field3547 + 64, this.field3543 + 768, -50, -10, -50);
            field3553.method3408(var9, var7);
        }
        if (this.field3557 >= 0) {
            var9 = var9.method2347(arg2, arg3, arg4, arg5, true, this.field3557);
        }
        return var9;
    }

    @ObfuscatedName("ji.f(II[[IIIILjs;II)Les;")
    public final class133 method4311(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class272 arg6, int arg7) {
        long var9;
        if (this.field3531 == null) {
            var9 = (long) ((this.field3529 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3529 << 10) + (arg0 << 3) + arg1);
        }
        class133 var11 = (class133) field3553.method3407(var9);
        if (var11 == null) {
            class127 var12 = this.method4312(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2331(this.field3547 + 64, this.field3543 + 768, -50, -10, -50);
            field3553.method3408(var11, var9);
        }
        if (arg6 == null && this.field3557 == -1) {
            return var11;
        }
        class133 var13;
        if (arg6 == null) {
            var13 = var11.method2358(true);
        } else {
            var13 = arg6.method4495(var11, arg7, arg1);
        }
        if (this.field3557 >= 0) {
            var13 = var13.method2347(arg2, arg3, arg4, arg5, false, this.field3557);
        }
        return var13;
    }

    @ObfuscatedName("ji.u(III)Ldh;")
    public final class127 method4312(int arg0, int arg1) {
        class127 var3 = null;
        if (this.field3531 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3530 == null) {
                return null;
            }
            boolean var4 = this.field3552;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3530.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3530[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class127) field3525.method3407((long) var7);
                if (var3 == null) {
                    var3 = class127.method2257(Statics.field3523, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2261();
                    }
                    field3525.method3408(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3528[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class127(field3528, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3531.length; var9++) {
                if (this.field3531[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3530[var8];
            boolean var11 = this.field3552 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class127) field3525.method3407((long) var10);
            if (var3 == null) {
                var3 = class127.method2257(Statics.field3523, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2261();
                }
                field3525.method3408(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3527 == 128 && this.field3555 == 128 && this.field3532 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3521 == 0 && this.field3558 == 0 && this.field3559 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class127 var14 = new class127(var3, arg1 == 0 && !var12 && !var13, this.field3533 == null, this.field3535 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2285(256);
            var14.method2278(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2254();
        } else if (var15 == 2) {
            var14.method2255();
        } else if (var15 == 3) {
            var14.method2256();
        }
        if (this.field3533 != null) {
            for (int var16 = 0; var16 < this.field3533.length; var16++) {
                var14.method2258(this.field3533[var16], this.field3534[var16]);
            }
        }
        if (this.field3535 != null) {
            for (int var17 = 0; var17 < this.field3535.length; var17++) {
                var14.method2260(this.field3535[var17], this.field3536[var17]);
            }
        }
        if (var12) {
            var14.method2262(this.field3527, this.field3555, this.field3532);
        }
        if (var13) {
            var14.method2278(this.field3521, this.field3558, this.field3559);
        }
        return var14;
    }

    @ObfuscatedName("ji.t(I)Lji;")
    public final class267 method4334() {
        int var1 = -1;
        if (this.field3564 != -1) {
            var1 = class223.method1428(this.field3564);
        } else if (this.field3565 != -1) {
            var1 = class223.field2726[this.field3565];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3549.length - 1) {
            var2 = this.field3549[var1];
        } else {
            var2 = this.field3549[this.field3549.length - 1];
        }
        return var2 == -1 ? null : method1587(var2);
    }

    @ObfuscatedName("ji.o(III)I")
    public int method4356(int arg0, int arg1) {
        return class261.method107(this.field3571, arg0, arg1);
    }

    @ObfuscatedName("ji.a(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4315(int arg0, String arg1) {
        return class261.method3896(this.field3571, arg0, arg1);
    }

    @ObfuscatedName("fw.i(I)V")
    public static void method2989() {
        field3550.method3409();
        field3525.method3409();
        field3526.method3409();
        field3553.method3409();
    }

    @ObfuscatedName("ji.m(I)Z")
    public boolean method4341() {
        if (this.field3549 == null) {
            return this.field3566 != -1 || this.field3570 != null;
        }
        for (int var1 = 0; var1 < this.field3549.length; var1++) {
            if (this.field3549[var1] != -1) {
                class267 var2 = method1587(this.field3549[var1]);
                if (var2.field3566 != -1 || var2.field3570 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
