package deob;

@ObfuscatedName("jn")
public class class270 extends class206 {

    @ObfuscatedName("jn.e")
    public static class201 field3656 = new class201(64);

    @ObfuscatedName("jn.k")
    public static class201 field3623 = new class201(50);

    @ObfuscatedName("jn.u")
    public int field3622;

    @ObfuscatedName("jn.z")
    public String field3625 = "null";

    @ObfuscatedName("jn.t")
    public int field3621 = 1;

    @ObfuscatedName("jn.f")
    public int[] field3642;

    @ObfuscatedName("jn.g")
    public int[] field3628;

    @ObfuscatedName("jn.j")
    public int field3629 = -1;

    @ObfuscatedName("jn.x")
    public int field3645 = -1;

    @ObfuscatedName("jn.c")
    public int field3631 = -1;

    @ObfuscatedName("jn.s")
    public int field3632 = -1;

    @ObfuscatedName("jn.n")
    public int field3633 = -1;

    @ObfuscatedName("jn.y")
    public int field3634 = -1;

    @ObfuscatedName("jn.o")
    public int field3635 = -1;

    @ObfuscatedName("jn.r")
    public short[] field3636;

    @ObfuscatedName("jn.i")
    public short[] field3653;

    @ObfuscatedName("jn.l")
    public short[] field3637;

    @ObfuscatedName("jn.m")
    public short[] field3626;

    @ObfuscatedName("jn.q")
    public String[] field3630 = new String[5];

    @ObfuscatedName("jn.b")
    public boolean field3641 = true;

    @ObfuscatedName("jn.h")
    public int field3640 = -1;

    @ObfuscatedName("jn.d")
    public int field3627 = 128;

    @ObfuscatedName("jn.v")
    public int field3639 = 128;

    @ObfuscatedName("jn.p")
    public boolean field3638 = false;

    @ObfuscatedName("jn.ab")
    public int field3646 = 0;

    @ObfuscatedName("jn.ad")
    public int field3647 = 0;

    @ObfuscatedName("jn.ag")
    public int field3648 = -1;

    @ObfuscatedName("jn.ak")
    public int field3649 = 32;

    @ObfuscatedName("jn.as")
    public int[] field3650;

    @ObfuscatedName("jn.aq")
    public int field3651 = -1;

    @ObfuscatedName("jn.ax")
    public int field3652 = -1;

    @ObfuscatedName("jn.at")
    public boolean field3644 = true;

    @ObfuscatedName("jn.ap")
    public boolean field3654 = true;

    @ObfuscatedName("jn.an")
    public boolean field3655 = false;

    @ObfuscatedName("jn.ac")
    public class198 field3620;

    @ObfuscatedName("ia.a(Lib;Lib;I)V")
    public static void method3891(class247 arg0, class247 arg1) {
        Statics.field3624 = arg0;
        Statics.field3643 = arg1;
    }

    @ObfuscatedName("client.w(IB)Ljn;")
    public static class270 method1336(int arg0) {
        class270 var1 = (class270) field3656.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3624.method3897(9, arg0);
        class270 var3 = new class270();
        var3.field3622 = arg0;
        if (var2 != null) {
            var3.method4429(new class185(var2));
        }
        var3.method4394();
        field3656.method3375(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.e(B)V")
    public void method4394() {
    }

    @ObfuscatedName("jn.k(Lgh;B)V")
    public void method4429(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4396(arg0, var2);
        }
    }

    @ObfuscatedName("jn.u(Lgh;II)V")
    public void method4396(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2962();
            this.field3642 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3642[var4] = arg0.method3194();
            }
        } else if (arg1 == 2) {
            this.field3625 = arg0.method3168();
        } else if (arg1 == 12) {
            this.field3621 = arg0.method2962();
        } else if (arg1 == 13) {
            this.field3629 = arg0.method3194();
        } else if (arg1 == 14) {
            this.field3632 = arg0.method3194();
        } else if (arg1 == 15) {
            this.field3645 = arg0.method3194();
        } else if (arg1 == 16) {
            this.field3631 = arg0.method3194();
        } else if (arg1 == 17) {
            this.field3632 = arg0.method3194();
            this.field3633 = arg0.method3194();
            this.field3634 = arg0.method3194();
            this.field3635 = arg0.method3194();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3630[arg1 - 30] = arg0.method3168();
            if (this.field3630[arg1 - 30].equalsIgnoreCase(class237.field2962)) {
                this.field3630[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2962();
            this.field3636 = new short[var5];
            this.field3653 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3636[var6] = (short) arg0.method3194();
                this.field3653[var6] = (short) arg0.method3194();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2962();
            this.field3637 = new short[var7];
            this.field3626 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3637[var8] = (short) arg0.method3194();
                this.field3626[var8] = (short) arg0.method3194();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2962();
            this.field3628 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3628[var10] = arg0.method3194();
            }
        } else if (arg1 == 93) {
            this.field3641 = false;
        } else if (arg1 == 95) {
            this.field3640 = arg0.method3194();
        } else if (arg1 == 97) {
            this.field3627 = arg0.method3194();
        } else if (arg1 == 98) {
            this.field3639 = arg0.method3194();
        } else if (arg1 == 99) {
            this.field3638 = true;
        } else if (arg1 == 100) {
            this.field3646 = arg0.method3015();
        } else if (arg1 == 101) {
            this.field3647 = arg0.method3015() * 5;
        } else if (arg1 == 102) {
            this.field3648 = arg0.method3194();
        } else if (arg1 == 103) {
            this.field3649 = arg0.method3194();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3651 = arg0.method3194();
            if (this.field3651 == 65535) {
                this.field3651 = -1;
            }
            this.field3652 = arg0.method3194();
            if (this.field3652 == 65535) {
                this.field3652 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3194();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2962();
            this.field3650 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3650[var13] = arg0.method3194();
                if (this.field3650[var13] == 65535) {
                    this.field3650[var13] = -1;
                }
            }
            this.field3650[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3644 = false;
        } else if (arg1 == 109) {
            this.field3654 = false;
        } else if (arg1 == 111) {
            this.field3655 = true;
        } else if (arg1 == 249) {
            this.field3620 = class261.method933(arg0, this.field3620);
        }
    }

    @ObfuscatedName("jn.z(Ljj;ILjj;IB)Lef;")
    public final class133 method4397(class272 arg0, int arg1, class272 arg2, int arg3) {
        if (this.field3650 != null) {
            class270 var5 = this.method4414();
            return var5 == null ? null : var5.method4397(arg0, arg1, arg2, arg3);
        }
        class133 var6 = (class133) field3623.method3373((long) this.field3622);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3642.length; var8++) {
                if (!Statics.field3643.method3901(this.field3642[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class127[] var9 = new class127[this.field3642.length];
            for (int var10 = 0; var10 < this.field3642.length; var10++) {
                var9[var10] = class127.method2217(Statics.field3643, this.field3642[var10], 0);
            }
            class127 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class127(var9, var9.length);
            }
            if (this.field3636 != null) {
                for (int var12 = 0; var12 < this.field3636.length; var12++) {
                    var11.method2216(this.field3636[var12], this.field3653[var12]);
                }
            }
            if (this.field3637 != null) {
                for (int var13 = 0; var13 < this.field3637.length; var13++) {
                    var11.method2226(this.field3637[var13], this.field3626[var13]);
                }
            }
            var6 = var11.method2224(this.field3646 + 64, this.field3647 + 850, -30, -50, -30);
            field3623.method3375(var6, (long) this.field3622);
        }
        class133 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4470(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4460(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2298(true);
        } else {
            var14 = arg2.method4460(var6, arg3);
        }
        if (this.field3627 != 128 || this.field3639 != 128) {
            var14.method2314(this.field3627, this.field3639, this.field3627);
        }
        return var14;
    }

    @ObfuscatedName("jn.t(I)Ldm;")
    public final class127 method4398() {
        if (this.field3650 != null) {
            class270 var1 = this.method4414();
            return var1 == null ? null : var1.method4398();
        } else if (this.field3628 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3628.length; var3++) {
                if (!Statics.field3643.method3901(this.field3628[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class127[] var4 = new class127[this.field3628.length];
            for (int var5 = 0; var5 < this.field3628.length; var5++) {
                var4[var5] = class127.method2217(Statics.field3643, this.field3628[var5], 0);
            }
            class127 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class127(var4, var4.length);
            }
            if (this.field3636 != null) {
                for (int var7 = 0; var7 < this.field3636.length; var7++) {
                    var6.method2216(this.field3636[var7], this.field3653[var7]);
                }
            }
            if (this.field3637 != null) {
                for (int var8 = 0; var8 < this.field3637.length; var8++) {
                    var6.method2226(this.field3637[var8], this.field3626[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jn.f(I)Ljn;")
    public final class270 method4414() {
        int var1 = -1;
        if (this.field3651 != -1) {
            var1 = Statics.method463(this.field3651);
        } else if (this.field3652 != -1) {
            var1 = class223.field2723[this.field3652];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3650.length - 1) {
            var2 = this.field3650[var1];
        } else {
            var2 = this.field3650[this.field3650.length - 1];
        }
        return var2 == -1 ? null : method1336(var2);
    }

    @ObfuscatedName("jn.g(B)Z")
    public boolean method4422() {
        if (this.field3650 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3651 != -1) {
            var1 = Statics.method463(this.field3651);
        } else if (this.field3652 != -1) {
            var1 = class223.field2723[this.field3652];
        }
        if (var1 >= 0 && var1 < this.field3650.length) {
            return this.field3650[var1] != -1;
        } else {
            return this.field3650[this.field3650.length - 1] != -1;
        }
    }

    @ObfuscatedName("jn.x(III)I")
    public int method4401(int arg0, int arg1) {
        return class261.method1485(this.field3620, arg0, arg1);
    }

    @ObfuscatedName("jn.c(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4402(int arg0, String arg1) {
        return class261.method3290(this.field3620, arg0, arg1);
    }
}
