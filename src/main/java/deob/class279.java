package deob;

@ObfuscatedName("jd")
public class class279 extends class215 {

    @ObfuscatedName("jd.o")
    public static class210 field3655 = new class210(64);

    @ObfuscatedName("jd.p")
    public static class210 field3656 = new class210(50);

    @ObfuscatedName("jd.a")
    public int field3632;

    @ObfuscatedName("jd.h")
    public String field3633 = "null";

    @ObfuscatedName("jd.l")
    public int field3662 = 1;

    @ObfuscatedName("jd.y")
    public int[] field3635;

    @ObfuscatedName("jd.g")
    public int[] field3641;

    @ObfuscatedName("jd.c")
    public int field3637 = -1;

    @ObfuscatedName("jd.u")
    public int field3638 = -1;

    @ObfuscatedName("jd.r")
    public int field3639 = -1;

    @ObfuscatedName("jd.d")
    public int field3649 = -1;

    @ObfuscatedName("jd.v")
    public int field3643 = -1;

    @ObfuscatedName("jd.s")
    public int field3642 = -1;

    @ObfuscatedName("jd.t")
    public int field3640 = -1;

    @ObfuscatedName("jd.f")
    public short[] field3644;

    @ObfuscatedName("jd.m")
    public short[] field3657;

    @ObfuscatedName("jd.x")
    public short[] field3646;

    @ObfuscatedName("jd.w")
    public short[] field3630;

    @ObfuscatedName("jd.j")
    public String[] field3648 = new String[5];

    @ObfuscatedName("jd.z")
    public boolean field3631 = true;

    @ObfuscatedName("jd.e")
    public int field3650 = -1;

    @ObfuscatedName("jd.k")
    public int field3651 = 128;

    @ObfuscatedName("jd.n")
    public int field3652 = 128;

    @ObfuscatedName("jd.i")
    public boolean field3653 = false;

    @ObfuscatedName("jd.av")
    public int field3654 = 0;

    @ObfuscatedName("jd.ao")
    public int field3647 = 0;

    @ObfuscatedName("jd.am")
    public int field3636 = -1;

    @ObfuscatedName("jd.aj")
    public int field3629 = 32;

    @ObfuscatedName("jd.ah")
    public int[] field3658;

    @ObfuscatedName("jd.af")
    public int field3645 = -1;

    @ObfuscatedName("jd.ai")
    public int field3660 = -1;

    @ObfuscatedName("jd.aq")
    public boolean field3661 = true;

    @ObfuscatedName("jd.ak")
    public boolean field3659 = true;

    @ObfuscatedName("jd.al")
    public boolean field3663 = false;

    @ObfuscatedName("jd.as")
    public class207 field3664;

    @ObfuscatedName("ds.q(II)Ljd;")
    public static class279 method2487(int arg0) {
        class279 var1 = (class279) field3655.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3634.method4158(9, arg0);
        class279 var3 = new class279();
        var3.field3632 = arg0;
        if (var2 != null) {
            var3.method4690(new class194(var2));
        }
        var3.method4666();
        field3655.method3659(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.o(I)V")
    public void method4666() {
    }

    @ObfuscatedName("jd.p(Lgn;I)V")
    public void method4690(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4668(arg0, var2);
        }
    }

    @ObfuscatedName("jd.a(Lgn;II)V")
    public void method4668(class194 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3247();
            this.field3635 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3635[var4] = arg0.method3249();
            }
        } else if (arg1 == 2) {
            this.field3633 = arg0.method3256();
        } else if (arg1 == 12) {
            this.field3662 = arg0.method3247();
        } else if (arg1 == 13) {
            this.field3637 = arg0.method3249();
        } else if (arg1 == 14) {
            this.field3649 = arg0.method3249();
        } else if (arg1 == 15) {
            this.field3638 = arg0.method3249();
        } else if (arg1 == 16) {
            this.field3639 = arg0.method3249();
        } else if (arg1 == 17) {
            this.field3649 = arg0.method3249();
            this.field3643 = arg0.method3249();
            this.field3642 = arg0.method3249();
            this.field3640 = arg0.method3249();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3648[arg1 - 30] = arg0.method3256();
            if (this.field3648[arg1 - 30].equalsIgnoreCase(class246.field2975)) {
                this.field3648[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3247();
            this.field3644 = new short[var5];
            this.field3657 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3644[var6] = (short) arg0.method3249();
                this.field3657[var6] = (short) arg0.method3249();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3247();
            this.field3646 = new short[var7];
            this.field3630 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3646[var8] = (short) arg0.method3249();
                this.field3630[var8] = (short) arg0.method3249();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3247();
            this.field3641 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3641[var10] = arg0.method3249();
            }
        } else if (arg1 == 93) {
            this.field3631 = false;
        } else if (arg1 == 95) {
            this.field3650 = arg0.method3249();
        } else if (arg1 == 97) {
            this.field3651 = arg0.method3249();
        } else if (arg1 == 98) {
            this.field3652 = arg0.method3249();
        } else if (arg1 == 99) {
            this.field3653 = true;
        } else if (arg1 == 100) {
            this.field3654 = arg0.method3248();
        } else if (arg1 == 101) {
            this.field3647 = arg0.method3248();
        } else if (arg1 == 102) {
            this.field3636 = arg0.method3249();
        } else if (arg1 == 103) {
            this.field3629 = arg0.method3249();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3645 = arg0.method3249();
            if (this.field3645 == 65535) {
                this.field3645 = -1;
            }
            this.field3660 = arg0.method3249();
            if (this.field3660 == 65535) {
                this.field3660 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3249();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3247();
            this.field3658 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3658[var13] = arg0.method3249();
                if (this.field3658[var13] == 65535) {
                    this.field3658[var13] = -1;
                }
            }
            this.field3658[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3661 = false;
        } else if (arg1 == 109) {
            this.field3659 = false;
        } else if (arg1 == 111) {
            this.field3663 = true;
        } else if (arg1 == 249) {
            this.field3664 = class270.method2485(arg0, this.field3664);
        }
    }

    @ObfuscatedName("jd.h(Ljo;ILjo;II)Lee;")
    public final class131 method4689(class281 arg0, int arg1, class281 arg2, int arg3) {
        if (this.field3658 != null) {
            class279 var5 = this.method4671();
            return var5 == null ? null : var5.method4689(arg0, arg1, arg2, arg3);
        }
        class131 var6 = (class131) field3656.method3658((long) this.field3632);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3635.length; var8++) {
                if (!Statics.field2122.method4221(this.field3635[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class125[] var9 = new class125[this.field3635.length];
            for (int var10 = 0; var10 < this.field3635.length; var10++) {
                var9[var10] = class125.method2389(Statics.field2122, this.field3635[var10], 0);
            }
            class125 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class125(var9, var9.length);
            }
            if (this.field3644 != null) {
                for (int var12 = 0; var12 < this.field3644.length; var12++) {
                    var11.method2401(this.field3644[var12], this.field3657[var12]);
                }
            }
            if (this.field3646 != null) {
                for (int var13 = 0; var13 < this.field3646.length; var13++) {
                    var11.method2402(this.field3646[var13], this.field3630[var13]);
                }
            }
            var6 = var11.method2409(this.field3654 + 64, this.field3647 * 5 + 850, -30, -50, -30);
            field3656.method3659(var6, (long) this.field3632);
        }
        class131 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4731(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4733(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2491(true);
        } else {
            var14 = arg2.method4733(var6, arg3);
        }
        if (this.field3651 != 128 || this.field3652 != 128) {
            var14.method2499(this.field3651, this.field3652, this.field3651);
        }
        return var14;
    }

    @ObfuscatedName("jd.l(I)Ldy;")
    public final class125 method4670() {
        if (this.field3658 != null) {
            class279 var1 = this.method4671();
            return var1 == null ? null : var1.method4670();
        } else if (this.field3641 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3641.length; var3++) {
                if (!Statics.field2122.method4221(this.field3641[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class125[] var4 = new class125[this.field3641.length];
            for (int var5 = 0; var5 < this.field3641.length; var5++) {
                var4[var5] = class125.method2389(Statics.field2122, this.field3641[var5], 0);
            }
            class125 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class125(var4, var4.length);
            }
            if (this.field3644 != null) {
                for (int var7 = 0; var7 < this.field3644.length; var7++) {
                    var6.method2401(this.field3644[var7], this.field3657[var7]);
                }
            }
            if (this.field3646 != null) {
                for (int var8 = 0; var8 < this.field3646.length; var8++) {
                    var6.method2402(this.field3646[var8], this.field3630[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jd.y(I)Ljd;")
    public final class279 method4671() {
        int var1 = -1;
        if (this.field3645 != -1) {
            var1 = class232.method248(this.field3645);
        } else if (this.field3660 != -1) {
            var1 = class232.field2740[this.field3660];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3658.length - 1) {
            var2 = this.field3658[var1];
        } else {
            var2 = this.field3658[this.field3658.length - 1];
        }
        return var2 == -1 ? null : method2487(var2);
    }

    @ObfuscatedName("jd.g(I)Z")
    public boolean method4672() {
        if (this.field3658 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3645 != -1) {
            var1 = class232.method248(this.field3645);
        } else if (this.field3660 != -1) {
            var1 = class232.field2740[this.field3660];
        }
        if (var1 >= 0 && var1 < this.field3658.length) {
            return this.field3658[var1] != -1;
        } else {
            return this.field3658[this.field3658.length - 1] != -1;
        }
    }

    @ObfuscatedName("jd.c(III)I")
    public int method4669(int arg0, int arg1) {
        class207 var3 = this.field3664;
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

    @ObfuscatedName("jd.u(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4696(int arg0, String arg1) {
        return class270.method941(this.field3664, arg0, arg1);
    }
}
