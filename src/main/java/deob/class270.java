package deob;

@ObfuscatedName("jv")
public class class270 extends class206 {

    @ObfuscatedName("jv.m")
    public static class201 field3630 = new class201(64);

    @ObfuscatedName("jv.h")
    public static class201 field3649 = new class201(50);

    @ObfuscatedName("jv.i")
    public int field3648;

    @ObfuscatedName("jv.w")
    public String field3633 = "null";

    @ObfuscatedName("jv.t")
    public int field3634 = 1;

    @ObfuscatedName("jv.d")
    public int[] field3658;

    @ObfuscatedName("jv.z")
    public int[] field3636;

    @ObfuscatedName("jv.k")
    public int field3637 = -1;

    @ObfuscatedName("jv.c")
    public int field3638 = -1;

    @ObfuscatedName("jv.o")
    public int field3640 = -1;

    @ObfuscatedName("jv.l")
    public int field3628 = -1;

    @ObfuscatedName("jv.f")
    public int field3641 = -1;

    @ObfuscatedName("jv.q")
    public int field3646 = -1;

    @ObfuscatedName("jv.r")
    public int field3643 = -1;

    @ObfuscatedName("jv.x")
    public short[] field3644;

    @ObfuscatedName("jv.u")
    public short[] field3645;

    @ObfuscatedName("jv.b")
    public short[] field3642;

    @ObfuscatedName("jv.p")
    public short[] field3647;

    @ObfuscatedName("jv.y")
    public String[] field3632 = new String[5];

    @ObfuscatedName("jv.n")
    public boolean field3663 = true;

    @ObfuscatedName("jv.j")
    public int field3650 = -1;

    @ObfuscatedName("jv.e")
    public int field3651 = 128;

    @ObfuscatedName("jv.v")
    public int field3652 = 128;

    @ObfuscatedName("jv.a")
    public boolean field3653 = false;

    @ObfuscatedName("jv.ad")
    public int field3654 = 0;

    @ObfuscatedName("jv.al")
    public int field3631 = 0;

    @ObfuscatedName("jv.aq")
    public int field3656 = -1;

    @ObfuscatedName("jv.ar")
    public int field3635 = 32;

    @ObfuscatedName("jv.an")
    public int[] field3657;

    @ObfuscatedName("jv.af")
    public int field3655 = -1;

    @ObfuscatedName("jv.as")
    public int field3660 = -1;

    @ObfuscatedName("jv.ax")
    public boolean field3661 = true;

    @ObfuscatedName("jv.ak")
    public boolean field3662 = true;

    @ObfuscatedName("jv.aw")
    public boolean field3639 = false;

    @ObfuscatedName("jv.ai")
    public class198 field3664;

    @ObfuscatedName("ac.s(Lir;Lir;B)V")
    public static void method648(class247 arg0, class247 arg1) {
        Statics.field3659 = arg0;
        Statics.field3629 = arg1;
    }

    @ObfuscatedName("iv.g(II)Ljv;")
    public static class270 method4416(int arg0) {
        class270 var1 = (class270) field3630.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3659.method4231(9, arg0);
        class270 var3 = new class270();
        var3.field3648 = arg0;
        if (var2 != null) {
            var3.method4698(new class185(var2));
        }
        var3.method4707();
        field3630.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.m(I)V")
    public void method4707() {
    }

    @ObfuscatedName("jv.h(Lgy;B)V")
    public void method4698(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4692(arg0, var2);
        }
    }

    @ObfuscatedName("jv.i(Lgy;II)V")
    public void method4692(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3239();
            this.field3658 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3658[var4] = arg0.method3241();
            }
        } else if (arg1 == 2) {
            this.field3633 = arg0.method3248();
        } else if (arg1 == 12) {
            this.field3634 = arg0.method3239();
        } else if (arg1 == 13) {
            this.field3637 = arg0.method3241();
        } else if (arg1 == 14) {
            this.field3628 = arg0.method3241();
        } else if (arg1 == 15) {
            this.field3638 = arg0.method3241();
        } else if (arg1 == 16) {
            this.field3640 = arg0.method3241();
        } else if (arg1 == 17) {
            this.field3628 = arg0.method3241();
            this.field3641 = arg0.method3241();
            this.field3646 = arg0.method3241();
            this.field3643 = arg0.method3241();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3632[arg1 - 30] = arg0.method3248();
            if (this.field3632[arg1 - 30].equalsIgnoreCase(class237.field2955)) {
                this.field3632[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3239();
            this.field3644 = new short[var5];
            this.field3645 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3644[var6] = (short) arg0.method3241();
                this.field3645[var6] = (short) arg0.method3241();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3239();
            this.field3642 = new short[var7];
            this.field3647 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3642[var8] = (short) arg0.method3241();
                this.field3647[var8] = (short) arg0.method3241();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3239();
            this.field3636 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3636[var10] = arg0.method3241();
            }
        } else if (arg1 == 93) {
            this.field3663 = false;
        } else if (arg1 == 95) {
            this.field3650 = arg0.method3241();
        } else if (arg1 == 97) {
            this.field3651 = arg0.method3241();
        } else if (arg1 == 98) {
            this.field3652 = arg0.method3241();
        } else if (arg1 == 99) {
            this.field3653 = true;
        } else if (arg1 == 100) {
            this.field3654 = arg0.method3240();
        } else if (arg1 == 101) {
            this.field3631 = arg0.method3240() * 5;
        } else if (arg1 == 102) {
            this.field3656 = arg0.method3241();
        } else if (arg1 == 103) {
            this.field3635 = arg0.method3241();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3655 = arg0.method3241();
            if (this.field3655 == 65535) {
                this.field3655 = -1;
            }
            this.field3660 = arg0.method3241();
            if (this.field3660 == 65535) {
                this.field3660 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3241();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3239();
            this.field3657 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3657[var13] = arg0.method3241();
                if (this.field3657[var13] == 65535) {
                    this.field3657[var13] = -1;
                }
            }
            this.field3657[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3661 = false;
        } else if (arg1 == 109) {
            this.field3662 = false;
        } else if (arg1 == 111) {
            this.field3639 = true;
        } else if (arg1 == 249) {
            this.field3664 = class261.method4400(arg0, this.field3664);
        }
    }

    @ObfuscatedName("jv.w(Lje;ILje;II)Les;")
    public final class131 method4693(class272 arg0, int arg1, class272 arg2, int arg3) {
        if (this.field3657 != null) {
            class270 var5 = this.method4696();
            return var5 == null ? null : var5.method4693(arg0, arg1, arg2, arg3);
        }
        class131 var6 = (class131) field3649.method3673((long) this.field3648);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3658.length; var8++) {
                if (!Statics.field3629.method4186(this.field3658[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class125[] var9 = new class125[this.field3658.length];
            for (int var10 = 0; var10 < this.field3658.length; var10++) {
                var9[var10] = class125.method2428(Statics.field3629, this.field3658[var10], 0);
            }
            class125 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class125(var9, var9.length);
            }
            if (this.field3644 != null) {
                for (int var12 = 0; var12 < this.field3644.length; var12++) {
                    var11.method2442(this.field3644[var12], this.field3645[var12]);
                }
            }
            if (this.field3642 != null) {
                for (int var13 = 0; var13 < this.field3642.length; var13++) {
                    var11.method2443(this.field3642[var13], this.field3647[var13]);
                }
            }
            var6 = var11.method2450(this.field3654 + 64, this.field3631 + 850, -30, -50, -30);
            field3649.method3675(var6, (long) this.field3648);
        }
        class131 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4751(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4748(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2545(true);
        } else {
            var14 = arg2.method4748(var6, arg3);
        }
        if (this.field3651 != 128 || this.field3652 != 128) {
            var14.method2584(this.field3651, this.field3652, this.field3651);
        }
        return var14;
    }

    @ObfuscatedName("jv.t(S)Ldw;")
    public final class125 method4724() {
        if (this.field3657 != null) {
            class270 var1 = this.method4696();
            return var1 == null ? null : var1.method4724();
        } else if (this.field3636 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3636.length; var3++) {
                if (!Statics.field3629.method4186(this.field3636[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class125[] var4 = new class125[this.field3636.length];
            for (int var5 = 0; var5 < this.field3636.length; var5++) {
                var4[var5] = class125.method2428(Statics.field3629, this.field3636[var5], 0);
            }
            class125 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class125(var4, var4.length);
            }
            if (this.field3644 != null) {
                for (int var7 = 0; var7 < this.field3644.length; var7++) {
                    var6.method2442(this.field3644[var7], this.field3645[var7]);
                }
            }
            if (this.field3642 != null) {
                for (int var8 = 0; var8 < this.field3642.length; var8++) {
                    var6.method2443(this.field3642[var8], this.field3647[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jv.d(B)Ljv;")
    public final class270 method4696() {
        int var1 = -1;
        if (this.field3655 != -1) {
            var1 = class223.method51(this.field3655);
        } else if (this.field3660 != -1) {
            var1 = class223.field2713[this.field3660];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3657.length - 1) {
            var2 = this.field3657[var1];
        } else {
            var2 = this.field3657[this.field3657.length - 1];
        }
        return var2 == -1 ? null : method4416(var2);
    }

    @ObfuscatedName("jv.z(I)Z")
    public boolean method4695() {
        if (this.field3657 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3655 != -1) {
            var1 = class223.method51(this.field3655);
        } else if (this.field3660 != -1) {
            var1 = class223.field2713[this.field3660];
        }
        if (var1 >= 0 && var1 < this.field3657.length) {
            return this.field3657[var1] != -1;
        } else {
            return this.field3657[this.field3657.length - 1] != -1;
        }
    }

    @ObfuscatedName("jv.k(III)I")
    public int method4706(int arg0, int arg1) {
        return class261.method1479(this.field3664, arg0, arg1);
    }

    @ObfuscatedName("jv.c(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4697(int arg0, String arg1) {
        return class261.method4283(this.field3664, arg0, arg1);
    }
}
