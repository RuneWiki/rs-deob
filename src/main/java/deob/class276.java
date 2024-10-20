package deob;

@ObfuscatedName("jo")
public class class276 extends class209 {

    @ObfuscatedName("jo.u")
    public static class203 field3585 = new class203(64);

    @ObfuscatedName("jo.i")
    public static class203 field3587 = new class203(100);

    @ObfuscatedName("jo.r")
    public int[] field3594;

    @ObfuscatedName("jo.j")
    public int[] field3589;

    @ObfuscatedName("jo.p")
    public int[] field3586;

    @ObfuscatedName("jo.e")
    public int[] field3591;

    @ObfuscatedName("jo.s")
    public int field3592 = -1;

    @ObfuscatedName("jo.v")
    public int[] field3593;

    @ObfuscatedName("jo.k")
    public boolean field3588 = false;

    @ObfuscatedName("jo.o")
    public int field3584 = 5;

    @ObfuscatedName("jo.q")
    public int field3596 = -1;

    @ObfuscatedName("jo.l")
    public int field3597 = -1;

    @ObfuscatedName("jo.f")
    public int field3598 = 99;

    @ObfuscatedName("jo.z")
    public int field3599 = -1;

    @ObfuscatedName("jo.a")
    public int field3600 = -1;

    @ObfuscatedName("jo.x")
    public int field3601 = 2;

    @ObfuscatedName("ji.y(Liu;Liu;Liu;I)V")
    public static void method4584(class250 arg0, class250 arg1, class250 arg2) {
        Statics.field3595 = arg0;
        Statics.field6 = arg1;
        Statics.field3590 = arg2;
    }

    @ObfuscatedName("fg.c(II)Ljo;")
    public static class276 method3241(int arg0) {
        class276 var1 = (class276) field3585.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3595.method4263(12, arg0);
        class276 var3 = new class276();
        if (var2 != null) {
            var3.method4860(new class185(var2));
        }
        var3.method4876();
        field3585.method3687(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jo.n(Lge;I)V")
    public void method4860(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4861(arg0, var2);
        }
    }

    @ObfuscatedName("jo.u(Lge;IB)V")
    public void method4861(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3280();
            this.field3586 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3586[var4] = arg0.method3280();
            }
            this.field3594 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3594[var5] = arg0.method3280();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3594[var6] += arg0.method3280() << 16;
            }
        } else if (arg1 == 2) {
            this.field3592 = arg0.method3280();
        } else if (arg1 == 3) {
            int var7 = arg0.method3299();
            this.field3593 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3593[var8] = arg0.method3299();
            }
            this.field3593[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3588 = true;
        } else if (arg1 == 5) {
            this.field3584 = arg0.method3299();
        } else if (arg1 == 6) {
            this.field3596 = arg0.method3280();
        } else if (arg1 == 7) {
            this.field3597 = arg0.method3280();
        } else if (arg1 == 8) {
            this.field3598 = arg0.method3299();
        } else if (arg1 == 9) {
            this.field3599 = arg0.method3299();
        } else if (arg1 == 10) {
            this.field3600 = arg0.method3299();
        } else if (arg1 == 11) {
            this.field3601 = arg0.method3299();
        } else if (arg1 == 12) {
            int var9 = arg0.method3299();
            this.field3589 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3589[var10] = arg0.method3280();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3589[var11] += arg0.method3280() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3299();
            this.field3591 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3591[var13] = arg0.method3272();
            }
        }
    }

    @ObfuscatedName("jo.i(I)V")
    public void method4876() {
        if (this.field3599 == -1) {
            if (this.field3593 == null) {
                this.field3599 = 0;
            } else {
                this.field3599 = 2;
            }
        }
        if (this.field3600 != -1) {
            return;
        }
        if (this.field3593 == null) {
            this.field3600 = 0;
        } else {
            this.field3600 = 2;
        }
    }

    @ObfuscatedName("jo.p(Lde;II)Lde;")
    public class122 method4890(class122 arg0, int arg1) {
        int var3 = this.field3594[arg1];
        class133 var4 = method1841(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2469(true);
        } else {
            class122 var6 = arg0.method2469(!var4.method2853(var5));
            var6.method2496(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jo.e(Lde;IIB)Lde;")
    public class122 method4859(class122 arg0, int arg1, int arg2) {
        int var4 = this.field3594[arg1];
        class133 var5 = method1841(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2469(true);
        }
        class122 var7 = arg0.method2469(!var5.method2853(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2482();
        } else if (var8 == 2) {
            var7.method2519();
        } else if (var8 == 3) {
            var7.method2537();
        }
        var7.method2496(var5, var6);
        if (var8 == 1) {
            var7.method2537();
        } else if (var8 == 2) {
            var7.method2519();
        } else if (var8 == 3) {
            var7.method2482();
        }
        return var7;
    }

    @ObfuscatedName("jo.s(Lde;II)Lde;")
    public class122 method4865(class122 arg0, int arg1) {
        int var3 = this.field3594[arg1];
        class133 var4 = method1841(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2477(true);
        } else {
            class122 var6 = arg0.method2477(!var4.method2853(var5));
            var6.method2496(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jo.v(Lde;ILjo;II)Lde;")
    public class122 method4866(class122 arg0, int arg1, class276 arg2, int arg3) {
        int var5 = this.field3594[arg1];
        class133 var6 = method1841(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4890(arg0, arg3);
        }
        int var8 = arg2.field3594[arg3];
        class133 var9 = method1841(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class122 var11 = arg0.method2469(!var6.method2853(var7));
            var11.method2496(var6, var7);
            return var11;
        } else {
            class122 var12 = arg0.method2469(!var6.method2853(var7) & !var9.method2853(var10));
            var12.method2478(var6, var7, var9, var10, this.field3593);
            return var12;
        }
    }

    @ObfuscatedName("jo.k(Lde;IB)Lde;")
    public class122 method4867(class122 arg0, int arg1) {
        int var3 = this.field3594[arg1];
        class133 var4 = method1841(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2469(true);
        }
        class133 var6 = null;
        int var7 = 0;
        if (this.field3589 != null && arg1 < this.field3589.length) {
            int var8 = this.field3589[arg1];
            var6 = method1841(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class122 var10 = arg0.method2469(!var4.method2853(var5));
            var10.method2496(var4, var5);
            return var10;
        } else {
            class122 var9 = arg0.method2469(!var4.method2853(var5) & !var6.method2853(var7));
            var9.method2496(var4, var5);
            var9.method2496(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ci.o(IB)Les;")
    public static class133 method1841(int arg0) {
        class133 var1 = (class133) field3587.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class133 var2 = class133.method970(Statics.field6, Statics.field3590, arg0, false);
        if (var2 != null) {
            field3587.method3687(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("er.q(I)V")
    public static void method2934() {
        field3585.method3695();
        field3587.method3695();
    }
}
