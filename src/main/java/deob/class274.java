package deob;

@ObfuscatedName("jo")
public class class274 extends class209 {

    @ObfuscatedName("jo.e")
    public static class203 field3550 = new class203(64);

    @ObfuscatedName("jo.b")
    public static class203 field3545 = new class203(50);

    @ObfuscatedName("jo.l")
    public int field3558;

    @ObfuscatedName("jo.w")
    public String field3547 = class240.field2850;

    @ObfuscatedName("jo.d")
    public int field3548 = 1;

    @ObfuscatedName("jo.n")
    public int[] field3549;

    @ObfuscatedName("jo.s")
    public int[] field3576;

    @ObfuscatedName("jo.g")
    public int field3568 = -1;

    @ObfuscatedName("jo.a")
    public int field3559 = -1;

    @ObfuscatedName("jo.r")
    public int field3553 = -1;

    @ObfuscatedName("jo.k")
    public int field3551 = -1;

    @ObfuscatedName("jo.m")
    public int field3555 = -1;

    @ObfuscatedName("jo.q")
    public int field3556 = -1;

    @ObfuscatedName("jo.x")
    public int field3557 = -1;

    @ObfuscatedName("jo.u")
    public short[] field3544;

    @ObfuscatedName("jo.o")
    public short[] field3567;

    @ObfuscatedName("jo.t")
    public short[] field3560;

    @ObfuscatedName("jo.v")
    public short[] field3561;

    @ObfuscatedName("jo.p")
    public String[] field3562 = new String[5];

    @ObfuscatedName("jo.z")
    public boolean field3563 = true;

    @ObfuscatedName("jo.j")
    public int field3564 = -1;

    @ObfuscatedName("jo.i")
    public int field3546 = 128;

    @ObfuscatedName("jo.c")
    public int field3566 = 128;

    @ObfuscatedName("jo.y")
    public boolean field3552 = false;

    @ObfuscatedName("jo.av")
    public int field3554 = 0;

    @ObfuscatedName("jo.as")
    public int field3569 = 0;

    @ObfuscatedName("jo.al")
    public int field3570 = -1;

    @ObfuscatedName("jo.ax")
    public int field3543 = 32;

    @ObfuscatedName("jo.ay")
    public int[] field3572;

    @ObfuscatedName("jo.aa")
    public int field3573 = -1;

    @ObfuscatedName("jo.ag")
    public int field3571 = -1;

    @ObfuscatedName("jo.aj")
    public boolean field3575 = true;

    @ObfuscatedName("jo.an")
    public boolean field3565 = true;

    @ObfuscatedName("jo.ap")
    public boolean field3577 = false;

    @ObfuscatedName("jo.am")
    public class200 field3578;

    @ObfuscatedName("ii.f(Lie;Lie;I)V")
    public static void method4248(class250 arg0, class250 arg1) {
        Statics.field3574 = arg0;
        Statics.field25 = arg1;
    }

    @ObfuscatedName("fo.h(IS)Ljo;")
    public static class274 method3290(int arg0) {
        class274 var1 = (class274) field3550.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3574.method4267(9, arg0);
        class274 var3 = new class274();
        var3.field3558 = arg0;
        if (var2 != null) {
            var3.method4786(new class185(var2));
        }
        var3.method4796();
        field3550.method3723(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jo.e(I)V")
    public void method4796() {
    }

    @ObfuscatedName("jo.b(Lgx;I)V")
    public void method4786(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4787(arg0, var2);
        }
    }

    @ObfuscatedName("jo.l(Lgx;II)V")
    public void method4787(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3323();
            this.field3549 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3549[var4] = arg0.method3325();
            }
        } else if (arg1 == 2) {
            this.field3547 = arg0.method3435();
        } else if (arg1 == 12) {
            this.field3548 = arg0.method3323();
        } else if (arg1 == 13) {
            this.field3568 = arg0.method3325();
        } else if (arg1 == 14) {
            this.field3551 = arg0.method3325();
        } else if (arg1 == 15) {
            this.field3559 = arg0.method3325();
        } else if (arg1 == 16) {
            this.field3553 = arg0.method3325();
        } else if (arg1 == 17) {
            this.field3551 = arg0.method3325();
            this.field3555 = arg0.method3325();
            this.field3556 = arg0.method3325();
            this.field3557 = arg0.method3325();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3562[arg1 - 30] = arg0.method3435();
            if (this.field3562[arg1 - 30].equalsIgnoreCase(class240.field2897)) {
                this.field3562[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3323();
            this.field3544 = new short[var5];
            this.field3567 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3544[var6] = (short) arg0.method3325();
                this.field3567[var6] = (short) arg0.method3325();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3323();
            this.field3560 = new short[var7];
            this.field3561 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3560[var8] = (short) arg0.method3325();
                this.field3561[var8] = (short) arg0.method3325();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3323();
            this.field3576 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3576[var10] = arg0.method3325();
            }
        } else if (arg1 == 93) {
            this.field3563 = false;
        } else if (arg1 == 95) {
            this.field3564 = arg0.method3325();
        } else if (arg1 == 97) {
            this.field3546 = arg0.method3325();
        } else if (arg1 == 98) {
            this.field3566 = arg0.method3325();
        } else if (arg1 == 99) {
            this.field3552 = true;
        } else if (arg1 == 100) {
            this.field3554 = arg0.method3324();
        } else if (arg1 == 101) {
            this.field3569 = arg0.method3324();
        } else if (arg1 == 102) {
            this.field3570 = arg0.method3325();
        } else if (arg1 == 103) {
            this.field3543 = arg0.method3325();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3573 = arg0.method3325();
            if (this.field3573 == 65535) {
                this.field3573 = -1;
            }
            this.field3571 = arg0.method3325();
            if (this.field3571 == 65535) {
                this.field3571 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3325();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3323();
            this.field3572 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3572[var13] = arg0.method3325();
                if (this.field3572[var13] == 65535) {
                    this.field3572[var13] = -1;
                }
            }
            this.field3572[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3575 = false;
        } else if (arg1 == 109) {
            this.field3565 = false;
        } else if (arg1 == 111) {
            this.field3577 = true;
        } else if (arg1 == 249) {
            this.field3578 = class265.method1460(arg0, this.field3578);
        }
    }

    @ObfuscatedName("jo.w(Ljv;ILjv;IB)Lds;")
    public final class122 method4819(class276 arg0, int arg1, class276 arg2, int arg3) {
        if (this.field3572 != null) {
            class274 var5 = this.method4802();
            return var5 == null ? null : var5.method4819(arg0, arg1, arg2, arg3);
        }
        class122 var6 = (class122) field3545.method3724((long) this.field3558);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3549.length; var8++) {
                if (!Statics.field25.method4316(this.field3549[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class116[] var9 = new class116[this.field3549.length];
            for (int var10 = 0; var10 < this.field3549.length; var10++) {
                var9[var10] = class116.method2385(Statics.field25, this.field3549[var10], 0);
            }
            class116 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class116(var9, var9.length);
            }
            if (this.field3544 != null) {
                for (int var12 = 0; var12 < this.field3544.length; var12++) {
                    var11.method2398(this.field3544[var12], this.field3567[var12]);
                }
            }
            if (this.field3560 != null) {
                for (int var13 = 0; var13 < this.field3560.length; var13++) {
                    var11.method2399(this.field3560[var13], this.field3561[var13]);
                }
            }
            var6 = var11.method2406(this.field3554 + 64, this.field3569 * 5 + 850, -30, -50, -30);
            field3545.method3723(var6, (long) this.field3558);
        }
        class122 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4846(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4848(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2487(true);
        } else {
            var14 = arg2.method4848(var6, arg3);
        }
        if (this.field3546 != 128 || this.field3566 != 128) {
            var14.method2502(this.field3546, this.field3566, this.field3546);
        }
        return var14;
    }

    @ObfuscatedName("jo.d(I)Ldt;")
    public final class116 method4811() {
        if (this.field3572 != null) {
            class274 var1 = this.method4802();
            return var1 == null ? null : var1.method4811();
        } else if (this.field3576 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3576.length; var3++) {
                if (!Statics.field25.method4316(this.field3576[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class116[] var4 = new class116[this.field3576.length];
            for (int var5 = 0; var5 < this.field3576.length; var5++) {
                var4[var5] = class116.method2385(Statics.field25, this.field3576[var5], 0);
            }
            class116 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class116(var4, var4.length);
            }
            if (this.field3544 != null) {
                for (int var7 = 0; var7 < this.field3544.length; var7++) {
                    var6.method2398(this.field3544[var7], this.field3567[var7]);
                }
            }
            if (this.field3560 != null) {
                for (int var8 = 0; var8 < this.field3560.length; var8++) {
                    var6.method2399(this.field3560[var8], this.field3561[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jo.n(I)Ljo;")
    public final class274 method4802() {
        int var1 = -1;
        if (this.field3573 != -1) {
            var1 = class228.method148(this.field3573);
        } else if (this.field3571 != -1) {
            var1 = class228.field2617[this.field3571];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3572.length - 1) {
            var2 = this.field3572[var1];
        } else {
            var2 = this.field3572[this.field3572.length - 1];
        }
        return var2 == -1 ? null : method3290(var2);
    }

    @ObfuscatedName("jo.s(B)Z")
    public boolean method4785() {
        if (this.field3572 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3573 != -1) {
            var1 = class228.method148(this.field3573);
        } else if (this.field3571 != -1) {
            var1 = class228.field2617[this.field3571];
        }
        if (var1 >= 0 && var1 < this.field3572.length) {
            return this.field3572[var1] != -1;
        } else {
            return this.field3572[this.field3572.length - 1] != -1;
        }
    }

    @ObfuscatedName("jo.g(III)I")
    public int method4805(int arg0, int arg1) {
        return class265.method4252(this.field3578, arg0, arg1);
    }

    @ObfuscatedName("jo.k(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4814(int arg0, String arg1) {
        return Statics.method213(this.field3578, arg0, arg1);
    }

    @ObfuscatedName("id.m(B)V")
    public static void method4447() {
        field3550.method3725();
        field3545.method3725();
    }
}
