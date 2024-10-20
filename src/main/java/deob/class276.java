package deob;

@ObfuscatedName("jb")
public class class276 extends class209 {

    @ObfuscatedName("jb.k")
    public static class203 field3561 = new class203(64);

    @ObfuscatedName("jb.u")
    public static class203 field3575 = new class203(100);

    @ObfuscatedName("jb.i")
    public int[] field3566;

    @ObfuscatedName("jb.t")
    public int[] field3567;

    @ObfuscatedName("jb.p")
    public int[] field3568;

    @ObfuscatedName("jb.l")
    public int[] field3578;

    @ObfuscatedName("jb.b")
    public int field3570 = -1;

    @ObfuscatedName("jb.c")
    public int[] field3571;

    @ObfuscatedName("jb.d")
    public boolean field3572 = false;

    @ObfuscatedName("jb.w")
    public int field3564 = 5;

    @ObfuscatedName("jb.a")
    public int field3577 = -1;

    @ObfuscatedName("jb.z")
    public int field3574 = -1;

    @ObfuscatedName("jb.e")
    public int field3573 = 99;

    @ObfuscatedName("jb.q")
    public int field3576 = -1;

    @ObfuscatedName("jb.j")
    public int field3579 = -1;

    @ObfuscatedName("jb.y")
    public int field3569 = 2;

    @ObfuscatedName("b.v(IS)Ljb;")
    public static class276 method115(int arg0) {
        class276 var1 = (class276) field3561.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3565.method4270(12, arg0);
        class276 var3 = new class276();
        if (var2 != null) {
            var3.method4859(new class185(var2));
        }
        var3.method4874();
        field3561.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jb.s(Lgx;I)V")
    public void method4859(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4861(arg0, var2);
        }
    }

    @ObfuscatedName("jb.o(Lgx;IB)V")
    public void method4861(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3276();
            this.field3568 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3568[var4] = arg0.method3276();
            }
            this.field3566 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3566[var5] = arg0.method3276();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3566[var6] += arg0.method3276() << 16;
            }
        } else if (arg1 == 2) {
            this.field3570 = arg0.method3276();
        } else if (arg1 == 3) {
            int var7 = arg0.method3274();
            this.field3571 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3571[var8] = arg0.method3274();
            }
            this.field3571[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3572 = true;
        } else if (arg1 == 5) {
            this.field3564 = arg0.method3274();
        } else if (arg1 == 6) {
            this.field3577 = arg0.method3276();
        } else if (arg1 == 7) {
            this.field3574 = arg0.method3276();
        } else if (arg1 == 8) {
            this.field3573 = arg0.method3274();
        } else if (arg1 == 9) {
            this.field3576 = arg0.method3274();
        } else if (arg1 == 10) {
            this.field3579 = arg0.method3274();
        } else if (arg1 == 11) {
            this.field3569 = arg0.method3274();
        } else if (arg1 == 12) {
            int var9 = arg0.method3274();
            this.field3567 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3567[var10] = arg0.method3276();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3567[var11] += arg0.method3276() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3274();
            this.field3578 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3578[var13] = arg0.method3494();
            }
        }
    }

    @ObfuscatedName("jb.k(B)V")
    public void method4874() {
        if (this.field3576 == -1) {
            if (this.field3571 == null) {
                this.field3576 = 0;
            } else {
                this.field3576 = 2;
            }
        }
        if (this.field3579 != -1) {
            return;
        }
        if (this.field3571 == null) {
            this.field3579 = 0;
        } else {
            this.field3579 = 2;
        }
    }

    @ObfuscatedName("jb.u(Lda;II)Lda;")
    public class122 method4862(class122 arg0, int arg1) {
        int var3 = this.field3566[arg1];
        class133 var4 = method3169(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2526(true);
        } else {
            class122 var6 = arg0.method2526(!var4.method2852(var5));
            var6.method2542(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jb.i(Lda;III)Lda;")
    public class122 method4863(class122 arg0, int arg1, int arg2) {
        int var4 = this.field3566[arg1];
        class133 var5 = method3169(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2526(true);
        }
        class122 var7 = arg0.method2526(!var5.method2852(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2482();
        } else if (var8 == 2) {
            var7.method2481();
        } else if (var8 == 3) {
            var7.method2480();
        }
        var7.method2542(var5, var6);
        if (var8 == 1) {
            var7.method2480();
        } else if (var8 == 2) {
            var7.method2481();
        } else if (var8 == 3) {
            var7.method2482();
        }
        return var7;
    }

    @ObfuscatedName("jb.t(Lda;II)Lda;")
    public class122 method4864(class122 arg0, int arg1) {
        int var3 = this.field3566[arg1];
        class133 var4 = method3169(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2470(true);
        } else {
            class122 var6 = arg0.method2470(!var4.method2852(var5));
            var6.method2542(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jb.c(Lda;ILjb;II)Lda;")
    public class122 method4865(class122 arg0, int arg1, class276 arg2, int arg3) {
        int var5 = this.field3566[arg1];
        class133 var6 = method3169(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4862(arg0, arg3);
        }
        int var8 = arg2.field3566[arg3];
        class133 var9 = method3169(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class122 var11 = arg0.method2526(!var6.method2852(var7));
            var11.method2542(var6, var7);
            return var11;
        } else {
            class122 var12 = arg0.method2526(!var6.method2852(var7) & !var9.method2852(var10));
            var12.method2478(var6, var7, var9, var10, this.field3571);
            return var12;
        }
    }

    @ObfuscatedName("jb.w(Lda;II)Lda;")
    public class122 method4889(class122 arg0, int arg1) {
        int var3 = this.field3566[arg1];
        class133 var4 = method3169(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2526(true);
        }
        class133 var6 = null;
        int var7 = 0;
        if (this.field3567 != null && arg1 < this.field3567.length) {
            int var8 = this.field3567[arg1];
            var6 = method3169(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class122 var10 = arg0.method2526(!var4.method2852(var5));
            var10.method2542(var4, var5);
            return var10;
        } else {
            class122 var9 = arg0.method2526(!var4.method2852(var5) & !var6.method2852(var7));
            var9.method2542(var4, var5);
            var9.method2542(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fv.a(II)Lex;")
    public static class133 method3169(int arg0) {
        class133 var1 = (class133) field3575.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class133 var2 = class133.method4894(Statics.field3562, Statics.field3563, arg0, false);
        if (var2 != null) {
            field3575.method3689(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("dt.z(I)V")
    public static void method2131() {
        field3561.method3697();
        field3575.method3697();
    }
}
