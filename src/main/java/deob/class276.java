package deob;

@ObfuscatedName("jk")
public class class276 extends class209 {

    @ObfuscatedName("jk.j")
    public static class203 field3583 = new class203(64);

    @ObfuscatedName("jk.g")
    public static class203 field3584 = new class203(100);

    @ObfuscatedName("jk.i")
    public int[] field3585;

    @ObfuscatedName("jk.h")
    public int[] field3586;

    @ObfuscatedName("jk.l")
    public int[] field3587;

    @ObfuscatedName("jk.d")
    public int[] field3588;

    @ObfuscatedName("jk.o")
    public int field3594 = -1;

    @ObfuscatedName("jk.s")
    public int[] field3582;

    @ObfuscatedName("jk.k")
    public boolean field3591 = false;

    @ObfuscatedName("jk.v")
    public int field3592 = 5;

    @ObfuscatedName("jk.p")
    public int field3593 = -1;

    @ObfuscatedName("jk.n")
    public int field3589 = -1;

    @ObfuscatedName("jk.t")
    public int field3598 = 99;

    @ObfuscatedName("jk.r")
    public int field3596 = -1;

    @ObfuscatedName("jk.x")
    public int field3597 = -1;

    @ObfuscatedName("jk.b")
    public int field3581 = 2;

    @ObfuscatedName("dy.c(II)Ljk;")
    public static class276 method2826(int arg0) {
        class276 var1 = (class276) field3583.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3590.method4210(12, arg0);
        class276 var3 = new class276();
        if (var2 != null) {
            var3.method4849(new class185(var2));
        }
        var3.method4851();
        field3583.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jk.q(Lgg;I)V")
    public void method4849(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4882(arg0, var2);
        }
    }

    @ObfuscatedName("jk.m(Lgg;IB)V")
    public void method4882(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3245();
            this.field3587 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3587[var4] = arg0.method3245();
            }
            this.field3585 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3585[var5] = arg0.method3245();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3585[var6] += arg0.method3245() << 16;
            }
        } else if (arg1 == 2) {
            this.field3594 = arg0.method3245();
        } else if (arg1 == 3) {
            int var7 = arg0.method3243();
            this.field3582 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3582[var8] = arg0.method3243();
            }
            this.field3582[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3591 = true;
        } else if (arg1 == 5) {
            this.field3592 = arg0.method3243();
        } else if (arg1 == 6) {
            this.field3593 = arg0.method3245();
        } else if (arg1 == 7) {
            this.field3589 = arg0.method3245();
        } else if (arg1 == 8) {
            this.field3598 = arg0.method3243();
        } else if (arg1 == 9) {
            this.field3596 = arg0.method3243();
        } else if (arg1 == 10) {
            this.field3597 = arg0.method3243();
        } else if (arg1 == 11) {
            this.field3581 = arg0.method3243();
        } else if (arg1 == 12) {
            int var9 = arg0.method3243();
            this.field3586 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3586[var10] = arg0.method3245();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3586[var11] += arg0.method3245() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3243();
            this.field3588 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3588[var13] = arg0.method3247();
            }
        }
    }

    @ObfuscatedName("jk.j(B)V")
    public void method4851() {
        if (this.field3596 == -1) {
            if (this.field3582 == null) {
                this.field3596 = 0;
            } else {
                this.field3596 = 2;
            }
        }
        if (this.field3597 != -1) {
            return;
        }
        if (this.field3582 == null) {
            this.field3597 = 0;
        } else {
            this.field3597 = 2;
        }
    }

    @ObfuscatedName("jk.g(Ldx;II)Ldx;")
    public class122 method4852(class122 arg0, int arg1) {
        int var3 = this.field3585[arg1];
        class133 var4 = method4691(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2416(true);
        } else {
            class122 var6 = arg0.method2416(!var4.method2836(var5));
            var6.method2424(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jk.i(Ldx;III)Ldx;")
    public class122 method4853(class122 arg0, int arg1, int arg2) {
        int var4 = this.field3585[arg1];
        class133 var5 = method4691(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2416(true);
        }
        class122 var7 = arg0.method2416(!var5.method2836(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2473();
        } else if (var8 == 2) {
            var7.method2428();
        } else if (var8 == 3) {
            var7.method2427();
        }
        var7.method2424(var5, var6);
        if (var8 == 1) {
            var7.method2427();
        } else if (var8 == 2) {
            var7.method2428();
        } else if (var8 == 3) {
            var7.method2473();
        }
        return var7;
    }

    @ObfuscatedName("jk.h(Ldx;II)Ldx;")
    public class122 method4854(class122 arg0, int arg1) {
        int var3 = this.field3585[arg1];
        class133 var4 = method4691(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2417(true);
        } else {
            class122 var6 = arg0.method2417(!var4.method2836(var5));
            var6.method2424(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jk.l(Ldx;ILjk;II)Ldx;")
    public class122 method4850(class122 arg0, int arg1, class276 arg2, int arg3) {
        int var5 = this.field3585[arg1];
        class133 var6 = method4691(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4852(arg0, arg3);
        }
        int var8 = arg2.field3585[arg3];
        class133 var9 = method4691(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class122 var11 = arg0.method2416(!var6.method2836(var7));
            var11.method2424(var6, var7);
            return var11;
        } else {
            class122 var12 = arg0.method2416(!var6.method2836(var7) & !var9.method2836(var10));
            var12.method2453(var6, var7, var9, var10, this.field3582);
            return var12;
        }
    }

    @ObfuscatedName("jk.o(Ldx;II)Ldx;")
    public class122 method4858(class122 arg0, int arg1) {
        int var3 = this.field3585[arg1];
        class133 var4 = method4691(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2416(true);
        }
        class133 var6 = null;
        int var7 = 0;
        if (this.field3586 != null && arg1 < this.field3586.length) {
            int var8 = this.field3586[arg1];
            var6 = method4691(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class122 var10 = arg0.method2416(!var4.method2836(var5));
            var10.method2424(var4, var5);
            return var10;
        } else {
            class122 var9 = arg0.method2416(!var4.method2836(var5) & !var6.method2836(var7));
            var9.method2424(var4, var5);
            var9.method2424(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("jl.k(II)Lep;")
    public static class133 method4691(int arg0) {
        class133 var1 = (class133) field3584.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class250 var2 = Statics.field3595;
        class250 var3 = Statics.field642;
        boolean var4 = true;
        int[] var5 = var2.method4221(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4229(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4229(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class133 var10;
        if (var4) {
            try {
                var10 = new class133(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3584.method3646(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("v.v(B)V")
    public static void method133() {
        field3583.method3647();
        field3584.method3647();
    }
}
