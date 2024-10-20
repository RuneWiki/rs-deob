package deob;

@ObfuscatedName("jd")
public class class266 extends class202 {

    @ObfuscatedName("jd.k")
    public static class197 field3616 = new class197(64);

    @ObfuscatedName("jd.z")
    public static class197 field3643 = new class197(50);

    @ObfuscatedName("jd.v")
    public int field3648;

    @ObfuscatedName("jd.m")
    public String field3637 = "null";

    @ObfuscatedName("jd.b")
    public int field3620 = 1;

    @ObfuscatedName("jd.t")
    public int[] field3621;

    @ObfuscatedName("jd.p")
    public int[] field3627;

    @ObfuscatedName("jd.r")
    public int field3623 = -1;

    @ObfuscatedName("jd.l")
    public int field3624 = -1;

    @ObfuscatedName("jd.u")
    public int field3625 = -1;

    @ObfuscatedName("jd.n")
    public int field3642 = -1;

    @ObfuscatedName("jd.c")
    public int field3618 = -1;

    @ObfuscatedName("jd.y")
    public int field3641 = -1;

    @ObfuscatedName("jd.j")
    public int field3629 = -1;

    @ObfuscatedName("jd.f")
    public short[] field3630;

    @ObfuscatedName("jd.s")
    public short[] field3650;

    @ObfuscatedName("jd.e")
    public short[] field3632;

    @ObfuscatedName("jd.q")
    public short[] field3633;

    @ObfuscatedName("jd.h")
    public String[] field3634 = new String[5];

    @ObfuscatedName("jd.i")
    public boolean field3635 = true;

    @ObfuscatedName("jd.o")
    public int field3636 = -1;

    @ObfuscatedName("jd.w")
    public int field3647 = 128;

    @ObfuscatedName("jd.g")
    public int field3638 = 128;

    @ObfuscatedName("jd.a")
    public boolean field3639 = false;

    @ObfuscatedName("jd.ah")
    public int field3640 = 0;

    @ObfuscatedName("jd.ak")
    public int field3631 = 0;

    @ObfuscatedName("jd.aa")
    public int field3622 = -1;

    @ObfuscatedName("jd.ax")
    public int field3614 = 32;

    @ObfuscatedName("jd.aq")
    public int[] field3644;

    @ObfuscatedName("jd.au")
    public int field3645 = -1;

    @ObfuscatedName("jd.al")
    public int field3646 = -1;

    @ObfuscatedName("jd.ae")
    public boolean field3628 = true;

    @ObfuscatedName("jd.aj")
    public boolean field3626 = true;

    @ObfuscatedName("jd.as")
    public boolean field3649 = false;

    @ObfuscatedName("jd.am")
    public class194 field3619;

    @ObfuscatedName("o.d(Lid;Lid;I)V")
    public static void method170(class243 arg0, class243 arg1) {
        Statics.field3617 = arg0;
        Statics.field3615 = arg1;
    }

    @ObfuscatedName("x.x(IB)Ljd;")
    public static class266 method4(int arg0) {
        class266 var1 = (class266) field3616.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3617.method3935(9, arg0);
        class266 var3 = new class266();
        var3.field3648 = arg0;
        if (var2 != null) {
            var3.method4485(new class181(var2));
        }
        var3.method4478();
        field3616.method3417(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.k(I)V")
    public void method4478() {
    }

    @ObfuscatedName("jd.z(Lfr;I)V")
    public void method4485(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4502(arg0, var2);
        }
    }

    @ObfuscatedName("jd.v(Lfr;IB)V")
    public void method4502(class181 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3204();
            this.field3621 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3621[var4] = arg0.method3179();
            }
        } else if (arg1 == 2) {
            this.field3637 = arg0.method3045();
        } else if (arg1 == 12) {
            this.field3620 = arg0.method3204();
        } else if (arg1 == 13) {
            this.field3623 = arg0.method3179();
        } else if (arg1 == 14) {
            this.field3642 = arg0.method3179();
        } else if (arg1 == 15) {
            this.field3624 = arg0.method3179();
        } else if (arg1 == 16) {
            this.field3625 = arg0.method3179();
        } else if (arg1 == 17) {
            this.field3642 = arg0.method3179();
            this.field3618 = arg0.method3179();
            this.field3641 = arg0.method3179();
            this.field3629 = arg0.method3179();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3634[arg1 - 30] = arg0.method3045();
            if (this.field3634[arg1 - 30].equalsIgnoreCase(class233.field2934)) {
                this.field3634[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3204();
            this.field3630 = new short[var5];
            this.field3650 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3630[var6] = (short) arg0.method3179();
                this.field3650[var6] = (short) arg0.method3179();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3204();
            this.field3632 = new short[var7];
            this.field3633 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3632[var8] = (short) arg0.method3179();
                this.field3633[var8] = (short) arg0.method3179();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3204();
            this.field3627 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3627[var10] = arg0.method3179();
            }
        } else if (arg1 == 93) {
            this.field3635 = false;
        } else if (arg1 == 95) {
            this.field3636 = arg0.method3179();
        } else if (arg1 == 97) {
            this.field3647 = arg0.method3179();
        } else if (arg1 == 98) {
            this.field3638 = arg0.method3179();
        } else if (arg1 == 99) {
            this.field3639 = true;
        } else if (arg1 == 100) {
            this.field3640 = arg0.method3236();
        } else if (arg1 == 101) {
            this.field3631 = arg0.method3236() * 5;
        } else if (arg1 == 102) {
            this.field3622 = arg0.method3179();
        } else if (arg1 == 103) {
            this.field3614 = arg0.method3179();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3645 = arg0.method3179();
            if (this.field3645 == 65535) {
                this.field3645 = -1;
            }
            this.field3646 = arg0.method3179();
            if (this.field3646 == 65535) {
                this.field3646 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3179();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3204();
            this.field3644 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3644[var13] = arg0.method3179();
                if (this.field3644[var13] == 65535) {
                    this.field3644[var13] = -1;
                }
            }
            this.field3644[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3628 = false;
        } else if (arg1 == 109) {
            this.field3626 = false;
        } else if (arg1 == 111) {
            this.field3649 = true;
        } else if (arg1 == 249) {
            this.field3619 = class257.method2237(arg0, this.field3619);
        }
    }

    @ObfuscatedName("jd.m(Ljj;ILjj;II)Leh;")
    public final class133 method4480(class268 arg0, int arg1, class268 arg2, int arg3) {
        if (this.field3644 != null) {
            class266 var5 = this.method4482();
            return var5 == null ? null : var5.method4480(arg0, arg1, arg2, arg3);
        }
        class133 var6 = (class133) field3643.method3418((long) this.field3648);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3621.length; var8++) {
                if (!Statics.field3615.method3992(this.field3621[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class127[] var9 = new class127[this.field3621.length];
            for (int var10 = 0; var10 < this.field3621.length; var10++) {
                var9[var10] = class127.method2294(Statics.field3615, this.field3621[var10], 0);
            }
            class127 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class127(var9, var9.length);
            }
            if (this.field3630 != null) {
                for (int var12 = 0; var12 < this.field3630.length; var12++) {
                    var11.method2306(this.field3630[var12], this.field3650[var12]);
                }
            }
            if (this.field3632 != null) {
                for (int var13 = 0; var13 < this.field3632.length; var13++) {
                    var11.method2307(this.field3632[var13], this.field3633[var13]);
                }
            }
            var6 = var11.method2314(this.field3640 + 64, this.field3631 + 850, -30, -50, -30);
            field3643.method3417(var6, (long) this.field3648);
        }
        class133 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4533(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4535(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2403(true);
        } else {
            var14 = arg2.method4535(var6, arg3);
        }
        if (this.field3647 != 128 || this.field3638 != 128) {
            var14.method2410(this.field3647, this.field3638, this.field3647);
        }
        return var14;
    }

    @ObfuscatedName("jd.b(I)Ldr;")
    public final class127 method4495() {
        if (this.field3644 != null) {
            class266 var1 = this.method4482();
            return var1 == null ? null : var1.method4495();
        } else if (this.field3627 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3627.length; var3++) {
                if (!Statics.field3615.method3992(this.field3627[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class127[] var4 = new class127[this.field3627.length];
            for (int var5 = 0; var5 < this.field3627.length; var5++) {
                var4[var5] = class127.method2294(Statics.field3615, this.field3627[var5], 0);
            }
            class127 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class127(var4, var4.length);
            }
            if (this.field3630 != null) {
                for (int var7 = 0; var7 < this.field3630.length; var7++) {
                    var6.method2306(this.field3630[var7], this.field3650[var7]);
                }
            }
            if (this.field3632 != null) {
                for (int var8 = 0; var8 < this.field3632.length; var8++) {
                    var6.method2307(this.field3632[var8], this.field3633[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jd.t(I)Ljd;")
    public final class266 method4482() {
        int var1 = -1;
        if (this.field3645 != -1) {
            var1 = class219.method1016(this.field3645);
        } else if (this.field3646 != -1) {
            var1 = class219.field2688[this.field3646];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3644.length - 1) {
            var2 = this.field3644[var1];
        } else {
            var2 = this.field3644[this.field3644.length - 1];
        }
        return var2 == -1 ? null : method4(var2);
    }

    @ObfuscatedName("jd.p(B)Z")
    public boolean method4483() {
        if (this.field3644 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3645 != -1) {
            var1 = class219.method1016(this.field3645);
        } else if (this.field3646 != -1) {
            var1 = class219.field2688[this.field3646];
        }
        if (var1 >= 0 && var1 < this.field3644.length) {
            return this.field3644[var1] != -1;
        } else {
            return this.field3644[this.field3644.length - 1] != -1;
        }
    }

    @ObfuscatedName("jd.r(III)I")
    public int method4487(int arg0, int arg1) {
        return class257.method4040(this.field3619, arg0, arg1);
    }

    @ObfuscatedName("jd.l(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4508(int arg0, String arg1) {
        return class257.method2778(this.field3619, arg0, arg1);
    }

    @ObfuscatedName("eq.u(I)V")
    public static void method2494() {
        field3616.method3422();
        field3643.method3422();
    }
}
