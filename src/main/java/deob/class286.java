package deob;

@ObfuscatedName("jk")
public class class286 extends class219 {

    @ObfuscatedName("jk.o")
    public static class213 field3699 = new class213(64);

    @ObfuscatedName("jk.j")
    public static class213 field3706 = new class213(50);

    @ObfuscatedName("jk.k")
    public int field3701;

    @ObfuscatedName("jk.x")
    public String field3702 = class252.field3012;

    @ObfuscatedName("jk.z")
    public int field3703 = 1;

    @ObfuscatedName("jk.p")
    public int[] field3704;

    @ObfuscatedName("jk.w")
    public int[] field3705;

    @ObfuscatedName("jk.r")
    public int field3717 = -1;

    @ObfuscatedName("jk.d")
    public int field3707 = -1;

    @ObfuscatedName("jk.a")
    public int field3722 = -1;

    @ObfuscatedName("jk.e")
    public int field3708 = -1;

    @ObfuscatedName("jk.f")
    public int field3710 = -1;

    @ObfuscatedName("jk.l")
    public int field3711 = -1;

    @ObfuscatedName("jk.m")
    public int field3712 = -1;

    @ObfuscatedName("jk.b")
    public short[] field3713;

    @ObfuscatedName("jk.h")
    public short[] field3714;

    @ObfuscatedName("jk.t")
    public short[] field3697;

    @ObfuscatedName("jk.v")
    public short[] field3726;

    @ObfuscatedName("jk.n")
    public String[] field3721 = new String[5];

    @ObfuscatedName("jk.u")
    public boolean field3718 = true;

    @ObfuscatedName("jk.q")
    public int field3716 = -1;

    @ObfuscatedName("jk.g")
    public int field3720 = 128;

    @ObfuscatedName("jk.y")
    public int field3698 = 128;

    @ObfuscatedName("jk.s")
    public boolean field3700 = false;

    @ObfuscatedName("jk.ac")
    public int field3723 = 0;

    @ObfuscatedName("jk.ap")
    public int field3724 = 0;

    @ObfuscatedName("jk.al")
    public int field3725 = -1;

    @ObfuscatedName("jk.ai")
    public int field3729 = 32;

    @ObfuscatedName("jk.ab")
    public int[] field3719;

    @ObfuscatedName("jk.ak")
    public int field3727 = -1;

    @ObfuscatedName("jk.as")
    public int field3709 = -1;

    @ObfuscatedName("jk.aa")
    public boolean field3730 = true;

    @ObfuscatedName("jk.ah")
    public boolean field3731 = true;

    @ObfuscatedName("jk.ao")
    public boolean field3732 = false;

    @ObfuscatedName("jk.am")
    public class210 field3733;

    @ObfuscatedName("bq.c(IB)Ljk;")
    public static class286 method995(int arg0) {
        class286 var1 = (class286) field3699.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3728.method4190(9, arg0);
        class286 var3 = new class286();
        var3.field3701 = arg0;
        if (var2 != null) {
            var3.method4747(new class195(var2));
        }
        var3.method4746();
        field3699.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jk.i(B)V")
    public void method4746() {
    }

    @ObfuscatedName("jk.o(Lgp;I)V")
    public void method4747(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4770(arg0, var2);
        }
    }

    @ObfuscatedName("jk.j(Lgp;II)V")
    public void method4770(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3429();
            this.field3704 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3704[var4] = arg0.method3218();
            }
        } else if (arg1 == 2) {
            this.field3702 = arg0.method3427();
        } else if (arg1 == 12) {
            this.field3703 = arg0.method3429();
        } else if (arg1 == 13) {
            this.field3717 = arg0.method3218();
        } else if (arg1 == 14) {
            this.field3708 = arg0.method3218();
        } else if (arg1 == 15) {
            this.field3707 = arg0.method3218();
        } else if (arg1 == 16) {
            this.field3722 = arg0.method3218();
        } else if (arg1 == 17) {
            this.field3708 = arg0.method3218();
            this.field3710 = arg0.method3218();
            this.field3711 = arg0.method3218();
            this.field3712 = arg0.method3218();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3721[arg1 - 30] = arg0.method3427();
            if (this.field3721[arg1 - 30].equalsIgnoreCase(class252.field3015)) {
                this.field3721[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3429();
            this.field3713 = new short[var5];
            this.field3714 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3713[var6] = (short) arg0.method3218();
                this.field3714[var6] = (short) arg0.method3218();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3429();
            this.field3697 = new short[var7];
            this.field3726 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3697[var8] = (short) arg0.method3218();
                this.field3726[var8] = (short) arg0.method3218();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3429();
            this.field3705 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3705[var10] = arg0.method3218();
            }
        } else if (arg1 == 93) {
            this.field3718 = false;
        } else if (arg1 == 95) {
            this.field3716 = arg0.method3218();
        } else if (arg1 == 97) {
            this.field3720 = arg0.method3218();
        } else if (arg1 == 98) {
            this.field3698 = arg0.method3218();
        } else if (arg1 == 99) {
            this.field3700 = true;
        } else if (arg1 == 100) {
            this.field3723 = arg0.method3226();
        } else if (arg1 == 101) {
            this.field3724 = arg0.method3226() * 5;
        } else if (arg1 == 102) {
            this.field3725 = arg0.method3218();
        } else if (arg1 == 103) {
            this.field3729 = arg0.method3218();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3727 = arg0.method3218();
            if (this.field3727 == 65535) {
                this.field3727 = -1;
            }
            this.field3709 = arg0.method3218();
            if (this.field3709 == 65535) {
                this.field3709 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3218();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3429();
            this.field3719 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3719[var13] = arg0.method3218();
                if (this.field3719[var13] == 65535) {
                    this.field3719[var13] = -1;
                }
            }
            this.field3719[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3730 = false;
        } else if (arg1 == 109) {
            this.field3731 = false;
        } else if (arg1 == 111) {
            this.field3732 = true;
        } else if (arg1 == 249) {
            this.field3733 = class277.method4160(arg0, this.field3733);
        }
    }

    @ObfuscatedName("jk.k(Lkn;ILkn;II)Led;")
    public final class132 method4749(class288 arg0, int arg1, class288 arg2, int arg3) {
        if (this.field3719 != null) {
            class286 var5 = this.method4760();
            return var5 == null ? null : var5.method4749(arg0, arg1, arg2, arg3);
        }
        class132 var6 = (class132) field3706.method3625((long) this.field3701);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3704.length; var8++) {
                if (!Statics.field3715.method4209(this.field3704[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class126[] var9 = new class126[this.field3704.length];
            for (int var10 = 0; var10 < this.field3704.length; var10++) {
                var9[var10] = class126.method2371(Statics.field3715, this.field3704[var10], 0);
            }
            class126 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class126(var9, var9.length);
            }
            if (this.field3713 != null) {
                for (int var12 = 0; var12 < this.field3713.length; var12++) {
                    var11.method2383(this.field3713[var12], this.field3714[var12]);
                }
            }
            if (this.field3697 != null) {
                for (int var13 = 0; var13 < this.field3697.length; var13++) {
                    var11.method2448(this.field3697[var13], this.field3726[var13]);
                }
            }
            var6 = var11.method2384(this.field3723 + 64, this.field3724 + 850, -30, -50, -30);
            field3706.method3628(var6, (long) this.field3701);
        }
        class132 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4807(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4802(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2551(true);
        } else {
            var14 = arg2.method4802(var6, arg3);
        }
        if (this.field3720 != 128 || this.field3698 != 128) {
            var14.method2468(this.field3720, this.field3698, this.field3720);
        }
        return var14;
    }

    @ObfuscatedName("jk.x(I)Ldj;")
    public final class126 method4750() {
        if (this.field3719 != null) {
            class286 var1 = this.method4760();
            return var1 == null ? null : var1.method4750();
        } else if (this.field3705 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3705.length; var3++) {
                if (!Statics.field3715.method4209(this.field3705[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class126[] var4 = new class126[this.field3705.length];
            for (int var5 = 0; var5 < this.field3705.length; var5++) {
                var4[var5] = class126.method2371(Statics.field3715, this.field3705[var5], 0);
            }
            class126 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class126(var4, var4.length);
            }
            if (this.field3713 != null) {
                for (int var7 = 0; var7 < this.field3713.length; var7++) {
                    var6.method2383(this.field3713[var7], this.field3714[var7]);
                }
            }
            if (this.field3697 != null) {
                for (int var8 = 0; var8 < this.field3697.length; var8++) {
                    var6.method2448(this.field3697[var8], this.field3726[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jk.z(I)Ljk;")
    public final class286 method4760() {
        int var1 = -1;
        if (this.field3727 != -1) {
            var1 = class238.method1710(this.field3727);
        } else if (this.field3709 != -1) {
            var1 = class238.field2771[this.field3709];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3719.length - 1) {
            var2 = this.field3719[var1];
        } else {
            var2 = this.field3719[this.field3719.length - 1];
        }
        return var2 == -1 ? null : method995(var2);
    }

    @ObfuscatedName("jk.p(I)Z")
    public boolean method4758() {
        if (this.field3719 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3727 != -1) {
            var1 = class238.method1710(this.field3727);
        } else if (this.field3709 != -1) {
            var1 = class238.field2771[this.field3709];
        }
        if (var1 >= 0 && var1 < this.field3719.length) {
            return this.field3719[var1] != -1;
        } else {
            return this.field3719[this.field3719.length - 1] != -1;
        }
    }

    @ObfuscatedName("jk.w(III)I")
    public int method4753(int arg0, int arg1) {
        return class277.method180(this.field3733, arg0, arg1);
    }

    @ObfuscatedName("jk.r(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4754(int arg0, String arg1) {
        return class277.method2942(this.field3733, arg0, arg1);
    }

    @ObfuscatedName("it.d(I)V")
    public static void method4167() {
        field3699.method3629();
        field3706.method3629();
    }
}
