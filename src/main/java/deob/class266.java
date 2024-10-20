package deob;

@ObfuscatedName("jc")
public class class266 extends class202 {

    @ObfuscatedName("jc.r")
    public static class197 field3603 = new class197(64);

    @ObfuscatedName("jc.g")
    public static class197 field3616 = new class197(50);

    @ObfuscatedName("jc.x")
    public int field3605;

    @ObfuscatedName("jc.f")
    public String field3606 = "null";

    @ObfuscatedName("jc.u")
    public int field3607 = 1;

    @ObfuscatedName("jc.t")
    public int[] field3608;

    @ObfuscatedName("jc.k")
    public int[] field3609;

    @ObfuscatedName("jc.n")
    public int field3610 = -1;

    @ObfuscatedName("jc.d")
    public int field3630 = -1;

    @ObfuscatedName("jc.o")
    public int field3634 = -1;

    @ObfuscatedName("jc.a")
    public int field3625 = -1;

    @ObfuscatedName("jc.q")
    public int field3604 = -1;

    @ObfuscatedName("jc.j")
    public int field3615 = -1;

    @ObfuscatedName("jc.m")
    public int field3623 = -1;

    @ObfuscatedName("jc.h")
    public short[] field3631;

    @ObfuscatedName("jc.c")
    public short[] field3618;

    @ObfuscatedName("jc.y")
    public short[] field3619;

    @ObfuscatedName("jc.p")
    public short[] field3620;

    @ObfuscatedName("jc.i")
    public String[] field3621 = new String[5];

    @ObfuscatedName("jc.l")
    public boolean field3622 = true;

    @ObfuscatedName("jc.z")
    public int field3614 = -1;

    @ObfuscatedName("jc.e")
    public int field3624 = 128;

    @ObfuscatedName("jc.v")
    public int field3632 = 128;

    @ObfuscatedName("jc.w")
    public boolean field3626 = false;

    @ObfuscatedName("jc.av")
    public int field3627 = 0;

    @ObfuscatedName("jc.au")
    public int field3628 = 0;

    @ObfuscatedName("jc.ae")
    public int field3629 = -1;

    @ObfuscatedName("jc.ak")
    public int field3617 = 32;

    @ObfuscatedName("jc.aq")
    public int[] field3633;

    @ObfuscatedName("jc.an")
    public int field3601 = -1;

    @ObfuscatedName("jc.am")
    public int field3613 = -1;

    @ObfuscatedName("jc.ar")
    public boolean field3612 = true;

    @ObfuscatedName("jc.ao")
    public boolean field3635 = true;

    @ObfuscatedName("jc.at")
    public boolean field3636 = false;

    @ObfuscatedName("jc.ac")
    public class194 field3637;

    @ObfuscatedName("k.b(Lij;Lij;I)V")
    public static void method44(class243 arg0, class243 arg1) {
        Statics.field3611 = arg0;
        Statics.field3602 = arg1;
    }

    @ObfuscatedName("hj.s(IB)Ljc;")
    public static class266 method3591(int arg0) {
        class266 var1 = (class266) field3603.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3611.method3887(9, arg0);
        class266 var3 = new class266();
        var3.field3605 = arg0;
        if (var2 != null) {
            var3.method4329(new class181(var2));
        }
        var3.method4327();
        field3603.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jc.r(I)V")
    public void method4327() {
    }

    @ObfuscatedName("jc.g(Lfs;S)V")
    public void method4329(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method4330(arg0, var2);
        }
    }

    @ObfuscatedName("jc.x(Lfs;IB)V")
    public void method4330(class181 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2945();
            this.field3608 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3608[var4] = arg0.method3081();
            }
        } else if (arg1 == 2) {
            this.field3606 = arg0.method2953();
        } else if (arg1 == 12) {
            this.field3607 = arg0.method2945();
        } else if (arg1 == 13) {
            this.field3610 = arg0.method3081();
        } else if (arg1 == 14) {
            this.field3625 = arg0.method3081();
        } else if (arg1 == 15) {
            this.field3630 = arg0.method3081();
        } else if (arg1 == 16) {
            this.field3634 = arg0.method3081();
        } else if (arg1 == 17) {
            this.field3625 = arg0.method3081();
            this.field3604 = arg0.method3081();
            this.field3615 = arg0.method3081();
            this.field3623 = arg0.method3081();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3621[arg1 - 30] = arg0.method2953();
            if (this.field3621[arg1 - 30].equalsIgnoreCase(class233.field2920)) {
                this.field3621[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2945();
            this.field3631 = new short[var5];
            this.field3618 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3631[var6] = (short) arg0.method3081();
                this.field3618[var6] = (short) arg0.method3081();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2945();
            this.field3619 = new short[var7];
            this.field3620 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3619[var8] = (short) arg0.method3081();
                this.field3620[var8] = (short) arg0.method3081();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2945();
            this.field3609 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3609[var10] = arg0.method3081();
            }
        } else if (arg1 == 93) {
            this.field3622 = false;
        } else if (arg1 == 95) {
            this.field3614 = arg0.method3081();
        } else if (arg1 == 97) {
            this.field3624 = arg0.method3081();
        } else if (arg1 == 98) {
            this.field3632 = arg0.method3081();
        } else if (arg1 == 99) {
            this.field3626 = true;
        } else if (arg1 == 100) {
            this.field3627 = arg0.method2946();
        } else if (arg1 == 101) {
            this.field3628 = arg0.method2946();
        } else if (arg1 == 102) {
            this.field3629 = arg0.method3081();
        } else if (arg1 == 103) {
            this.field3617 = arg0.method3081();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3601 = arg0.method3081();
            if (this.field3601 == 65535) {
                this.field3601 = -1;
            }
            this.field3613 = arg0.method3081();
            if (this.field3613 == 65535) {
                this.field3613 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3081();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2945();
            this.field3633 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3633[var13] = arg0.method3081();
                if (this.field3633[var13] == 65535) {
                    this.field3633[var13] = -1;
                }
            }
            this.field3633[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3612 = false;
        } else if (arg1 == 109) {
            this.field3635 = false;
        } else if (arg1 == 111) {
            this.field3636 = true;
        } else if (arg1 == 249) {
            this.field3637 = class257.method194(arg0, this.field3637);
        }
    }

    @ObfuscatedName("jc.f(Ljh;ILjh;IB)Lev;")
    public final class133 method4331(class268 arg0, int arg1, class268 arg2, int arg3) {
        if (this.field3633 != null) {
            class266 var5 = this.method4333();
            return var5 == null ? null : var5.method4331(arg0, arg1, arg2, arg3);
        }
        class133 var6 = (class133) field3616.method3330((long) this.field3605);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3608.length; var8++) {
                if (!Statics.field3602.method3866(this.field3608[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class127[] var9 = new class127[this.field3608.length];
            for (int var10 = 0; var10 < this.field3608.length; var10++) {
                var9[var10] = class127.method2220(Statics.field3602, this.field3608[var10], 0);
            }
            class127 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class127(var9, var9.length);
            }
            if (this.field3631 != null) {
                for (int var12 = 0; var12 < this.field3631.length; var12++) {
                    var11.method2232(this.field3631[var12], this.field3618[var12]);
                }
            }
            if (this.field3619 != null) {
                for (int var13 = 0; var13 < this.field3619.length; var13++) {
                    var11.method2233(this.field3619[var13], this.field3620[var13]);
                }
            }
            var6 = var11.method2240(this.field3627 + 64, this.field3628 * 5 + 850, -30, -50, -30);
            field3616.method3332(var6, (long) this.field3605);
        }
        class133 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4399(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4394(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2368(true);
        } else {
            var14 = arg2.method4394(var6, arg3);
        }
        if (this.field3624 != 128 || this.field3632 != 128) {
            var14.method2306(this.field3624, this.field3632, this.field3624);
        }
        return var14;
    }

    @ObfuscatedName("jc.u(I)Lda;")
    public final class127 method4332() {
        if (this.field3633 != null) {
            class266 var1 = this.method4333();
            return var1 == null ? null : var1.method4332();
        } else if (this.field3609 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3609.length; var3++) {
                if (!Statics.field3602.method3866(this.field3609[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class127[] var4 = new class127[this.field3609.length];
            for (int var5 = 0; var5 < this.field3609.length; var5++) {
                var4[var5] = class127.method2220(Statics.field3602, this.field3609[var5], 0);
            }
            class127 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class127(var4, var4.length);
            }
            if (this.field3631 != null) {
                for (int var7 = 0; var7 < this.field3631.length; var7++) {
                    var6.method2232(this.field3631[var7], this.field3618[var7]);
                }
            }
            if (this.field3619 != null) {
                for (int var8 = 0; var8 < this.field3619.length; var8++) {
                    var6.method2233(this.field3619[var8], this.field3620[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jc.t(I)Ljc;")
    public final class266 method4333() {
        int var1 = -1;
        if (this.field3601 != -1) {
            var1 = class219.method122(this.field3601);
        } else if (this.field3613 != -1) {
            var1 = class219.field2680[this.field3613];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3633.length - 1) {
            var2 = this.field3633[var1];
        } else {
            var2 = this.field3633[this.field3633.length - 1];
        }
        return var2 == -1 ? null : method3591(var2);
    }

    @ObfuscatedName("jc.k(B)Z")
    public boolean method4334() {
        if (this.field3633 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3601 != -1) {
            var1 = class219.method122(this.field3601);
        } else if (this.field3613 != -1) {
            var1 = class219.field2680[this.field3613];
        }
        if (var1 >= 0 && var1 < this.field3633.length) {
            return this.field3633[var1] != -1;
        } else {
            return this.field3633[this.field3633.length - 1] != -1;
        }
    }

    @ObfuscatedName("jc.n(III)I")
    public int method4363(int arg0, int arg1) {
        return class257.method4097(this.field3637, arg0, arg1);
    }

    @ObfuscatedName("jc.d(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4336(int arg0, String arg1) {
        return class257.method1712(this.field3637, arg0, arg1);
    }
}
