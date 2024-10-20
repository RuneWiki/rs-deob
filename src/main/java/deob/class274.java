package deob;

@ObfuscatedName("jv")
public class class274 extends class209 {

    @ObfuscatedName("jv.e")
    public static class203 field3567 = new class203(64);

    @ObfuscatedName("jv.q")
    public static class203 field3568 = new class203(50);

    @ObfuscatedName("jv.c")
    public int field3569;

    @ObfuscatedName("jv.l")
    public String field3570 = class240.field2863;

    @ObfuscatedName("jv.b")
    public int field3601 = 1;

    @ObfuscatedName("jv.w")
    public int[] field3572;

    @ObfuscatedName("jv.n")
    public int[] field3575;

    @ObfuscatedName("jv.i")
    public int field3574 = -1;

    @ObfuscatedName("jv.p")
    public int field3581 = -1;

    @ObfuscatedName("jv.m")
    public int field3576 = -1;

    @ObfuscatedName("jv.d")
    public int field3594 = -1;

    @ObfuscatedName("jv.j")
    public int field3578 = -1;

    @ObfuscatedName("jv.x")
    public int field3579 = -1;

    @ObfuscatedName("jv.v")
    public int field3580 = -1;

    @ObfuscatedName("jv.h")
    public short[] field3565;

    @ObfuscatedName("jv.f")
    public short[] field3582;

    @ObfuscatedName("jv.a")
    public short[] field3583;

    @ObfuscatedName("jv.t")
    public short[] field3584;

    @ObfuscatedName("jv.k")
    public String[] field3566 = new String[5];

    @ObfuscatedName("jv.z")
    public boolean field3586 = true;

    @ObfuscatedName("jv.s")
    public int field3577 = -1;

    @ObfuscatedName("jv.y")
    public int field3588 = 128;

    @ObfuscatedName("jv.u")
    public int field3589 = 128;

    @ObfuscatedName("jv.o")
    public boolean field3573 = false;

    @ObfuscatedName("jv.af")
    public int field3591 = 0;

    @ObfuscatedName("jv.an")
    public int field3592 = 0;

    @ObfuscatedName("jv.ax")
    public int field3593 = -1;

    @ObfuscatedName("jv.aw")
    public int field3600 = 32;

    @ObfuscatedName("jv.ae")
    public int[] field3596;

    @ObfuscatedName("jv.ac")
    public int field3595 = -1;

    @ObfuscatedName("jv.az")
    public int field3597 = -1;

    @ObfuscatedName("jv.aj")
    public boolean field3590 = true;

    @ObfuscatedName("jv.ag")
    public boolean field3599 = true;

    @ObfuscatedName("jv.ab")
    public boolean field3587 = false;

    @ObfuscatedName("jv.ar")
    public class200 field3585;

    @ObfuscatedName("fb.g(Liu;Liu;B)V")
    public static void method3375(class250 arg0, class250 arg1) {
        Statics.field3598 = arg0;
        Statics.field3571 = arg1;
    }

    @ObfuscatedName("it.r(II)Ljv;")
    public static class274 method4430(int arg0) {
        class274 var1 = (class274) field3567.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3598.method4438(9, arg0);
        class274 var3 = new class274();
        var3.field3569 = arg0;
        if (var2 != null) {
            var3.method5003(new class185(var2));
        }
        var3.method4978();
        field3567.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.e(B)V")
    public void method4978() {
    }

    @ObfuscatedName("jv.q(Lgl;I)V")
    public void method5003(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4980(arg0, var2);
        }
    }

    @ObfuscatedName("jv.c(Lgl;II)V")
    public void method4980(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3679();
            this.field3572 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3572[var4] = arg0.method3467();
            }
        } else if (arg1 == 2) {
            this.field3570 = arg0.method3474();
        } else if (arg1 == 12) {
            this.field3601 = arg0.method3679();
        } else if (arg1 == 13) {
            this.field3574 = arg0.method3467();
        } else if (arg1 == 14) {
            this.field3594 = arg0.method3467();
        } else if (arg1 == 15) {
            this.field3581 = arg0.method3467();
        } else if (arg1 == 16) {
            this.field3576 = arg0.method3467();
        } else if (arg1 == 17) {
            this.field3594 = arg0.method3467();
            this.field3578 = arg0.method3467();
            this.field3579 = arg0.method3467();
            this.field3580 = arg0.method3467();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3566[arg1 - 30] = arg0.method3474();
            if (this.field3566[arg1 - 30].equalsIgnoreCase(class240.field2858)) {
                this.field3566[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3679();
            this.field3565 = new short[var5];
            this.field3582 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3565[var6] = (short) arg0.method3467();
                this.field3582[var6] = (short) arg0.method3467();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3679();
            this.field3583 = new short[var7];
            this.field3584 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3583[var8] = (short) arg0.method3467();
                this.field3584[var8] = (short) arg0.method3467();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3679();
            this.field3575 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3575[var10] = arg0.method3467();
            }
        } else if (arg1 == 93) {
            this.field3586 = false;
        } else if (arg1 == 95) {
            this.field3577 = arg0.method3467();
        } else if (arg1 == 97) {
            this.field3588 = arg0.method3467();
        } else if (arg1 == 98) {
            this.field3589 = arg0.method3467();
        } else if (arg1 == 99) {
            this.field3573 = true;
        } else if (arg1 == 100) {
            this.field3591 = arg0.method3627();
        } else if (arg1 == 101) {
            this.field3592 = arg0.method3627() * 5;
        } else if (arg1 == 102) {
            this.field3593 = arg0.method3467();
        } else if (arg1 == 103) {
            this.field3600 = arg0.method3467();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3595 = arg0.method3467();
            if (this.field3595 == 65535) {
                this.field3595 = -1;
            }
            this.field3597 = arg0.method3467();
            if (this.field3597 == 65535) {
                this.field3597 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3467();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3679();
            this.field3596 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3596[var13] = arg0.method3467();
                if (this.field3596[var13] == 65535) {
                    this.field3596[var13] = -1;
                }
            }
            this.field3596[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3590 = false;
        } else if (arg1 == 109) {
            this.field3599 = false;
        } else if (arg1 == 111) {
            this.field3587 = true;
        } else if (arg1 == 249) {
            this.field3585 = Statics.method4265(arg0, this.field3585);
        }
    }

    @ObfuscatedName("jv.i(Ljg;ILjg;II)Ldl;")
    public final class122 method5000(class276 arg0, int arg1, class276 arg2, int arg3) {
        if (this.field3596 != null) {
            class274 var5 = this.method4983();
            return var5 == null ? null : var5.method5000(arg0, arg1, arg2, arg3);
        }
        class122 var6 = (class122) field3568.method3879((long) this.field3569);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3572.length; var8++) {
                if (!Statics.field3571.method4437(this.field3572[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class116[] var9 = new class116[this.field3572.length];
            for (int var10 = 0; var10 < this.field3572.length; var10++) {
                var9[var10] = class116.method2641(Statics.field3571, this.field3572[var10], 0);
            }
            class116 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class116(var9, var9.length);
            }
            if (this.field3565 != null) {
                for (int var12 = 0; var12 < this.field3565.length; var12++) {
                    var11.method2573(this.field3565[var12], this.field3582[var12]);
                }
            }
            if (this.field3583 != null) {
                for (int var13 = 0; var13 < this.field3583.length; var13++) {
                    var11.method2583(this.field3583[var13], this.field3584[var13]);
                }
            }
            var6 = var11.method2570(this.field3591 + 64, this.field3592 + 850, -30, -50, -30);
            field3568.method3885(var6, (long) this.field3569);
        }
        class122 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method5045(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method5043(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2667(true);
        } else {
            var14 = arg2.method5043(var6, arg3);
        }
        if (this.field3588 != 128 || this.field3589 != 128) {
            var14.method2676(this.field3588, this.field3589, this.field3588);
        }
        return var14;
    }

    @ObfuscatedName("jv.p(I)Ldu;")
    public final class116 method5016() {
        if (this.field3596 != null) {
            class274 var1 = this.method4983();
            return var1 == null ? null : var1.method5016();
        } else if (this.field3575 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3575.length; var3++) {
                if (!Statics.field3571.method4437(this.field3575[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class116[] var4 = new class116[this.field3575.length];
            for (int var5 = 0; var5 < this.field3575.length; var5++) {
                var4[var5] = class116.method2641(Statics.field3571, this.field3575[var5], 0);
            }
            class116 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class116(var4, var4.length);
            }
            if (this.field3565 != null) {
                for (int var7 = 0; var7 < this.field3565.length; var7++) {
                    var6.method2573(this.field3565[var7], this.field3582[var7]);
                }
            }
            if (this.field3583 != null) {
                for (int var8 = 0; var8 < this.field3583.length; var8++) {
                    var6.method2583(this.field3583[var8], this.field3584[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jv.m(B)Ljv;")
    public final class274 method4983() {
        int var1 = -1;
        if (this.field3595 != -1) {
            var1 = class228.method2246(this.field3595);
        } else if (this.field3597 != -1) {
            var1 = class228.field2630[this.field3597];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3596.length - 1) {
            var2 = this.field3596[var1];
        } else {
            var2 = this.field3596[this.field3596.length - 1];
        }
        return var2 == -1 ? null : method4430(var2);
    }

    @ObfuscatedName("jv.d(I)Z")
    public boolean method4984() {
        if (this.field3596 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3595 != -1) {
            var1 = class228.method2246(this.field3595);
        } else if (this.field3597 != -1) {
            var1 = class228.field2630[this.field3597];
        }
        if (var1 >= 0 && var1 < this.field3596.length) {
            return this.field3596[var1] != -1;
        } else {
            return this.field3596[this.field3596.length - 1] != -1;
        }
    }

    @ObfuscatedName("jv.j(III)I")
    public int method4985(int arg0, int arg1) {
        return class265.method3138(this.field3585, arg0, arg1);
    }

    @ObfuscatedName("jv.x(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4986(int arg0, String arg1) {
        return class265.method3140(this.field3585, arg0, arg1);
    }
}
