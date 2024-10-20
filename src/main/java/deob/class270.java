package deob;

@ObfuscatedName("jh")
public class class270 extends class206 {

    @ObfuscatedName("jh.y")
    public static class201 field3636 = new class201(64);

    @ObfuscatedName("jh.r")
    public static class201 field3640 = new class201(50);

    @ObfuscatedName("jh.h")
    public int field3638;

    @ObfuscatedName("jh.d")
    public String field3639 = "null";

    @ObfuscatedName("jh.s")
    public int field3668 = 1;

    @ObfuscatedName("jh.b")
    public int[] field3634;

    @ObfuscatedName("jh.e")
    public int[] field3649;

    @ObfuscatedName("jh.f")
    public int field3643 = -1;

    @ObfuscatedName("jh.z")
    public int field3644 = -1;

    @ObfuscatedName("jh.u")
    public int field3645 = -1;

    @ObfuscatedName("jh.p")
    public int field3660 = -1;

    @ObfuscatedName("jh.w")
    public int field3647 = -1;

    @ObfuscatedName("jh.t")
    public int field3646 = -1;

    @ObfuscatedName("jh.o")
    public int field3658 = -1;

    @ObfuscatedName("jh.a")
    public short[] field3650;

    @ObfuscatedName("jh.i")
    public short[] field3651;

    @ObfuscatedName("jh.m")
    public short[] field3648;

    @ObfuscatedName("jh.x")
    public short[] field3653;

    @ObfuscatedName("jh.l")
    public String[] field3654 = new String[5];

    @ObfuscatedName("jh.j")
    public boolean field3655 = true;

    @ObfuscatedName("jh.g")
    public int field3635 = -1;

    @ObfuscatedName("jh.c")
    public int field3657 = 128;

    @ObfuscatedName("jh.k")
    public int field3637 = 128;

    @ObfuscatedName("jh.q")
    public boolean field3659 = false;

    @ObfuscatedName("jh.ac")
    public int field3641 = 0;

    @ObfuscatedName("jh.aw")
    public int field3661 = 0;

    @ObfuscatedName("jh.at")
    public int field3662 = -1;

    @ObfuscatedName("jh.ag")
    public int field3663 = 32;

    @ObfuscatedName("jh.ad")
    public int[] field3664;

    @ObfuscatedName("jh.af")
    public int field3656 = -1;

    @ObfuscatedName("jh.az")
    public int field3666 = -1;

    @ObfuscatedName("jh.ae")
    public boolean field3667 = true;

    @ObfuscatedName("jh.av")
    public boolean field3652 = true;

    @ObfuscatedName("jh.am")
    public boolean field3669 = false;

    @ObfuscatedName("jh.ax")
    public class198 field3670;

    @ObfuscatedName("ce.n(Lil;Lil;B)V")
    public static void method1736(class247 arg0, class247 arg1) {
        Statics.field3642 = arg0;
        Statics.field3665 = arg1;
    }

    @ObfuscatedName("ak.v(IB)Ljh;")
    public static class270 method564(int arg0) {
        class270 var1 = (class270) field3636.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3642.method3931(9, arg0);
        class270 var3 = new class270();
        var3.field3638 = arg0;
        if (var2 != null) {
            var3.method4455(new class185(var2));
        }
        var3.method4419();
        field3636.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.y(I)V")
    public void method4419() {
    }

    @ObfuscatedName("jh.r(Lgv;I)V")
    public void method4455(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4421(arg0, var2);
        }
    }

    @ObfuscatedName("jh.h(Lgv;II)V")
    public void method4421(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3021();
            this.field3634 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3634[var4] = arg0.method3015();
            }
        } else if (arg1 == 2) {
            this.field3639 = arg0.method3030();
        } else if (arg1 == 12) {
            this.field3668 = arg0.method3021();
        } else if (arg1 == 13) {
            this.field3643 = arg0.method3015();
        } else if (arg1 == 14) {
            this.field3660 = arg0.method3015();
        } else if (arg1 == 15) {
            this.field3644 = arg0.method3015();
        } else if (arg1 == 16) {
            this.field3645 = arg0.method3015();
        } else if (arg1 == 17) {
            this.field3660 = arg0.method3015();
            this.field3647 = arg0.method3015();
            this.field3646 = arg0.method3015();
            this.field3658 = arg0.method3015();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3654[arg1 - 30] = arg0.method3030();
            if (this.field3654[arg1 - 30].equalsIgnoreCase(class237.field3155)) {
                this.field3654[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3021();
            this.field3650 = new short[var5];
            this.field3651 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3650[var6] = (short) arg0.method3015();
                this.field3651[var6] = (short) arg0.method3015();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3021();
            this.field3648 = new short[var7];
            this.field3653 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3648[var8] = (short) arg0.method3015();
                this.field3653[var8] = (short) arg0.method3015();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3021();
            this.field3649 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3649[var10] = arg0.method3015();
            }
        } else if (arg1 == 93) {
            this.field3655 = false;
        } else if (arg1 == 95) {
            this.field3635 = arg0.method3015();
        } else if (arg1 == 97) {
            this.field3657 = arg0.method3015();
        } else if (arg1 == 98) {
            this.field3637 = arg0.method3015();
        } else if (arg1 == 99) {
            this.field3659 = true;
        } else if (arg1 == 100) {
            this.field3641 = arg0.method3022();
        } else if (arg1 == 101) {
            this.field3661 = arg0.method3022();
        } else if (arg1 == 102) {
            this.field3662 = arg0.method3015();
        } else if (arg1 == 103) {
            this.field3663 = arg0.method3015();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3656 = arg0.method3015();
            if (this.field3656 == 65535) {
                this.field3656 = -1;
            }
            this.field3666 = arg0.method3015();
            if (this.field3666 == 65535) {
                this.field3666 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3015();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3021();
            this.field3664 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3664[var13] = arg0.method3015();
                if (this.field3664[var13] == 65535) {
                    this.field3664[var13] = -1;
                }
            }
            this.field3664[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3667 = false;
        } else if (arg1 == 109) {
            this.field3652 = false;
        } else if (arg1 == 111) {
            this.field3669 = true;
        } else if (arg1 == 249) {
            this.field3670 = class261.method121(arg0, this.field3670);
        }
    }

    @ObfuscatedName("jh.d(Ljs;ILjs;II)Les;")
    public final class133 method4453(class272 arg0, int arg1, class272 arg2, int arg3) {
        if (this.field3664 != null) {
            class270 var5 = this.method4447();
            return var5 == null ? null : var5.method4453(arg0, arg1, arg2, arg3);
        }
        class133 var6 = (class133) field3640.method3407((long) this.field3638);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3634.length; var8++) {
                if (!Statics.field3665.method3918(this.field3634[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class127[] var9 = new class127[this.field3634.length];
            for (int var10 = 0; var10 < this.field3634.length; var10++) {
                var9[var10] = class127.method2257(Statics.field3665, this.field3634[var10], 0);
            }
            class127 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class127(var9, var9.length);
            }
            if (this.field3650 != null) {
                for (int var12 = 0; var12 < this.field3650.length; var12++) {
                    var11.method2258(this.field3650[var12], this.field3651[var12]);
                }
            }
            if (this.field3648 != null) {
                for (int var13 = 0; var13 < this.field3648.length; var13++) {
                    var11.method2260(this.field3648[var13], this.field3653[var13]);
                }
            }
            var6 = var11.method2331(this.field3641 + 64, this.field3661 * 5 + 850, -30, -50, -30);
            field3640.method3408(var6, (long) this.field3638);
        }
        class133 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4490(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4512(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2358(true);
        } else {
            var14 = arg2.method4512(var6, arg3);
        }
        if (this.field3657 != 128 || this.field3637 != 128) {
            var14.method2363(this.field3657, this.field3637, this.field3657);
        }
        return var14;
    }

    @ObfuscatedName("jh.s(B)Ldh;")
    public final class127 method4423() {
        if (this.field3664 != null) {
            class270 var1 = this.method4447();
            return var1 == null ? null : var1.method4423();
        } else if (this.field3649 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3649.length; var3++) {
                if (!Statics.field3665.method3918(this.field3649[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class127[] var4 = new class127[this.field3649.length];
            for (int var5 = 0; var5 < this.field3649.length; var5++) {
                var4[var5] = class127.method2257(Statics.field3665, this.field3649[var5], 0);
            }
            class127 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class127(var4, var4.length);
            }
            if (this.field3650 != null) {
                for (int var7 = 0; var7 < this.field3650.length; var7++) {
                    var6.method2258(this.field3650[var7], this.field3651[var7]);
                }
            }
            if (this.field3648 != null) {
                for (int var8 = 0; var8 < this.field3648.length; var8++) {
                    var6.method2260(this.field3648[var8], this.field3653[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jh.b(B)Ljh;")
    public final class270 method4447() {
        int var1 = -1;
        if (this.field3656 != -1) {
            var1 = class223.method1428(this.field3656);
        } else if (this.field3666 != -1) {
            var1 = class223.field2726[this.field3666];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3664.length - 1) {
            var2 = this.field3664[var1];
        } else {
            var2 = this.field3664[this.field3664.length - 1];
        }
        return var2 == -1 ? null : method564(var2);
    }

    @ObfuscatedName("jh.e(I)Z")
    public boolean method4424() {
        if (this.field3664 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3656 != -1) {
            var1 = class223.method1428(this.field3656);
        } else if (this.field3666 != -1) {
            var1 = class223.field2726[this.field3666];
        }
        if (var1 >= 0 && var1 < this.field3664.length) {
            return this.field3664[var1] != -1;
        } else {
            return this.field3664[this.field3664.length - 1] != -1;
        }
    }

    @ObfuscatedName("jh.f(III)I")
    public int method4425(int arg0, int arg1) {
        return class261.method107(this.field3670, arg0, arg1);
    }

    @ObfuscatedName("jh.u(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4418(int arg0, String arg1) {
        return class261.method3896(this.field3670, arg0, arg1);
    }
}
