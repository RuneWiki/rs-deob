package deob;

@ObfuscatedName("jv")
public class class276 extends class209 {

    @ObfuscatedName("jv.b")
    public static class203 field3602 = new class203(64);

    @ObfuscatedName("jv.l")
    public static class203 field3600 = new class203(100);

    @ObfuscatedName("jv.w")
    public int[] field3597;

    @ObfuscatedName("jv.d")
    public int[] field3608;

    @ObfuscatedName("jv.n")
    public int[] field3599;

    @ObfuscatedName("jv.s")
    public int[] field3595;

    @ObfuscatedName("jv.g")
    public int field3601 = -1;

    @ObfuscatedName("jv.a")
    public int[] field3607;

    @ObfuscatedName("jv.r")
    public boolean field3603 = false;

    @ObfuscatedName("jv.k")
    public int field3604 = 5;

    @ObfuscatedName("jv.m")
    public int field3605 = -1;

    @ObfuscatedName("jv.q")
    public int field3606 = -1;

    @ObfuscatedName("jv.x")
    public int field3609 = 99;

    @ObfuscatedName("jv.u")
    public int field3592 = -1;

    @ObfuscatedName("jv.o")
    public int field3598 = -1;

    @ObfuscatedName("jv.t")
    public int field3610 = 2;

    @ObfuscatedName("eo.f(II)Ljv;")
    public static class276 method2865(int arg0) {
        class276 var1 = (class276) field3602.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3611.method4267(12, arg0);
        class276 var3 = new class276();
        if (var2 != null) {
            var3.method4857(new class185(var2));
        }
        var3.method4847();
        field3602.method3723(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.h(Lgx;I)V")
    public void method4857(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4863(arg0, var2);
        }
    }

    @ObfuscatedName("jv.e(Lgx;II)V")
    public void method4863(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3325();
            this.field3599 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3599[var4] = arg0.method3325();
            }
            this.field3597 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3597[var5] = arg0.method3325();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3597[var6] += arg0.method3325() << 16;
            }
        } else if (arg1 == 2) {
            this.field3601 = arg0.method3325();
        } else if (arg1 == 3) {
            int var7 = arg0.method3323();
            this.field3607 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3607[var8] = arg0.method3323();
            }
            this.field3607[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3603 = true;
        } else if (arg1 == 5) {
            this.field3604 = arg0.method3323();
        } else if (arg1 == 6) {
            this.field3605 = arg0.method3325();
        } else if (arg1 == 7) {
            this.field3606 = arg0.method3325();
        } else if (arg1 == 8) {
            this.field3609 = arg0.method3323();
        } else if (arg1 == 9) {
            this.field3592 = arg0.method3323();
        } else if (arg1 == 10) {
            this.field3598 = arg0.method3323();
        } else if (arg1 == 11) {
            this.field3610 = arg0.method3323();
        } else if (arg1 == 12) {
            int var9 = arg0.method3323();
            this.field3608 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3608[var10] = arg0.method3325();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3608[var11] += arg0.method3325() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3323();
            this.field3595 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3595[var13] = arg0.method3327();
            }
        }
    }

    @ObfuscatedName("jv.b(B)V")
    public void method4847() {
        if (this.field3592 == -1) {
            if (this.field3607 == null) {
                this.field3592 = 0;
            } else {
                this.field3592 = 2;
            }
        }
        if (this.field3598 != -1) {
            return;
        }
        if (this.field3607 == null) {
            this.field3598 = 0;
        } else {
            this.field3598 = 2;
        }
    }

    @ObfuscatedName("jv.l(Lds;IB)Lds;")
    public class122 method4848(class122 arg0, int arg1) {
        int var3 = this.field3597[arg1];
        class133 var4 = method2678(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2487(true);
        } else {
            class122 var6 = arg0.method2487(!var4.method2870(var5));
            var6.method2495(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jv.w(Lds;III)Lds;")
    public class122 method4849(class122 arg0, int arg1, int arg2) {
        int var4 = this.field3597[arg1];
        class133 var5 = method2678(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2487(true);
        }
        class122 var7 = arg0.method2487(!var5.method2870(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2505();
        } else if (var8 == 2) {
            var7.method2498();
        } else if (var8 == 3) {
            var7.method2499();
        }
        var7.method2495(var5, var6);
        if (var8 == 1) {
            var7.method2499();
        } else if (var8 == 2) {
            var7.method2498();
        } else if (var8 == 3) {
            var7.method2505();
        }
        return var7;
    }

    @ObfuscatedName("jv.d(Lds;II)Lds;")
    public class122 method4844(class122 arg0, int arg1) {
        int var3 = this.field3597[arg1];
        class133 var4 = method2678(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2488(true);
        } else {
            class122 var6 = arg0.method2488(!var4.method2870(var5));
            var6.method2495(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jv.n(Lds;ILjv;II)Lds;")
    public class122 method4846(class122 arg0, int arg1, class276 arg2, int arg3) {
        int var5 = this.field3597[arg1];
        class133 var6 = method2678(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4848(arg0, arg3);
        }
        int var8 = arg2.field3597[arg3];
        class133 var9 = method2678(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class122 var11 = arg0.method2487(!var6.method2870(var7));
            var11.method2495(var6, var7);
            return var11;
        } else {
            class122 var12 = arg0.method2487(!var6.method2870(var7) & !var9.method2870(var10));
            var12.method2555(var6, var7, var9, var10, this.field3607);
            return var12;
        }
    }

    @ObfuscatedName("jv.s(Lds;II)Lds;")
    public class122 method4851(class122 arg0, int arg1) {
        int var3 = this.field3597[arg1];
        class133 var4 = method2678(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2487(true);
        }
        class133 var6 = null;
        int var7 = 0;
        if (this.field3608 != null && arg1 < this.field3608.length) {
            int var8 = this.field3608[arg1];
            var6 = method2678(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class122 var10 = arg0.method2487(!var4.method2870(var5));
            var10.method2495(var4, var5);
            return var10;
        } else {
            class122 var9 = arg0.method2487(!var4.method2870(var5) & !var6.method2870(var7));
            var9.method2495(var4, var5);
            var9.method2495(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("dn.g(IB)Lev;")
    public static class133 method2678(int arg0) {
        class133 var1 = (class133) field3600.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class133 var2 = class133.method1462(Statics.field3593, Statics.field3594, arg0, false);
        if (var2 != null) {
            field3600.method3723(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("bp.k(I)V")
    public static void method1707() {
        field3602.method3725();
        field3600.method3725();
    }
}
