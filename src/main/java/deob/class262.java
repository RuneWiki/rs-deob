package deob;

@ObfuscatedName("jf")
public class class262 extends class196 {

    @ObfuscatedName("jf.p")
    public static class191 field3605 = new class191(64);

    @ObfuscatedName("jf.x")
    public static class191 field3593 = new class191(100);

    @ObfuscatedName("jf.g")
    public int[] field3595;

    @ObfuscatedName("jf.c")
    public int[] field3598;

    @ObfuscatedName("jf.l")
    public int[] field3596;

    @ObfuscatedName("jf.w")
    public int[] field3603;

    @ObfuscatedName("jf.b")
    public int field3592 = -1;

    @ObfuscatedName("jf.o")
    public int[] field3599;

    @ObfuscatedName("jf.m")
    public boolean field3600 = false;

    @ObfuscatedName("jf.i")
    public int field3601 = 5;

    @ObfuscatedName("jf.s")
    public int field3591 = -1;

    @ObfuscatedName("jf.r")
    public int field3594 = -1;

    @ObfuscatedName("jf.e")
    public int field3604 = 99;

    @ObfuscatedName("jf.a")
    public int field3602 = -1;

    @ObfuscatedName("jf.v")
    public int field3606 = -1;

    @ObfuscatedName("jf.t")
    public int field3607 = 2;

    @ObfuscatedName("bs.j(II)Ljf;")
    public static class262 method1389(int arg0) {
        class262 var1 = (class262) field3605.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3590.method3773(12, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4357(new class175(var2));
        }
        var3.method4360();
        field3605.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jf.h(Lfb;I)V")
    public void method4357(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method4358(arg0, var2);
        }
    }

    @ObfuscatedName("jf.f(Lfb;II)V")
    public void method4358(class175 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3023();
            this.field3596 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3596[var4] = arg0.method3023();
            }
            this.field3595 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3595[var5] = arg0.method3023();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3595[var6] += arg0.method3023() << 16;
            }
        } else if (arg1 == 2) {
            this.field3592 = arg0.method3023();
        } else if (arg1 == 3) {
            int var7 = arg0.method2903();
            this.field3599 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3599[var8] = arg0.method2903();
            }
            this.field3599[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3600 = true;
        } else if (arg1 == 5) {
            this.field3601 = arg0.method2903();
        } else if (arg1 == 6) {
            this.field3591 = arg0.method3023();
        } else if (arg1 == 7) {
            this.field3594 = arg0.method3023();
        } else if (arg1 == 8) {
            this.field3604 = arg0.method2903();
        } else if (arg1 == 9) {
            this.field3602 = arg0.method2903();
        } else if (arg1 == 10) {
            this.field3606 = arg0.method2903();
        } else if (arg1 == 11) {
            this.field3607 = arg0.method2903();
        } else if (arg1 == 12) {
            int var9 = arg0.method2903();
            this.field3598 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3598[var10] = arg0.method3023();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3598[var11] += arg0.method3023() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2903();
            this.field3603 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3603[var13] = arg0.method3070();
            }
        }
    }

    @ObfuscatedName("jf.p(B)V")
    public void method4360() {
        if (this.field3602 == -1) {
            if (this.field3599 == null) {
                this.field3602 = 0;
            } else {
                this.field3602 = 2;
            }
        }
        if (this.field3606 != -1) {
            return;
        }
        if (this.field3599 == null) {
            this.field3606 = 0;
        } else {
            this.field3606 = 2;
        }
    }

    @ObfuscatedName("jf.x(Leo;II)Leo;")
    public class135 method4361(class135 arg0, int arg1) {
        int var3 = this.field3595[arg1];
        class146 var4 = method331(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2302(true);
        } else {
            class135 var6 = arg0.method2302(!var4.method2671(var5));
            var6.method2308(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jf.g(Leo;III)Leo;")
    public class135 method4370(class135 arg0, int arg1, int arg2) {
        int var4 = this.field3595[arg1];
        class146 var5 = method331(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2302(true);
        }
        class135 var7 = arg0.method2302(!var5.method2671(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2313();
        } else if (var8 == 2) {
            var7.method2336();
        } else if (var8 == 3) {
            var7.method2312();
        }
        var7.method2308(var5, var6);
        if (var8 == 1) {
            var7.method2312();
        } else if (var8 == 2) {
            var7.method2336();
        } else if (var8 == 3) {
            var7.method2313();
        }
        return var7;
    }

    @ObfuscatedName("jf.c(Leo;IB)Leo;")
    public class135 method4359(class135 arg0, int arg1) {
        int var3 = this.field3595[arg1];
        class146 var4 = method331(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2303(true);
        } else {
            class135 var6 = arg0.method2303(!var4.method2671(var5));
            var6.method2308(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jf.l(Leo;ILjf;II)Leo;")
    public class135 method4374(class135 arg0, int arg1, class262 arg2, int arg3) {
        int var5 = this.field3595[arg1];
        class146 var6 = method331(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4361(arg0, arg3);
        }
        int var8 = arg2.field3595[arg3];
        class146 var9 = method331(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class135 var11 = arg0.method2302(!var6.method2671(var7));
            var11.method2308(var6, var7);
            return var11;
        } else {
            class135 var12 = arg0.method2302(!var6.method2671(var7) & !var9.method2671(var10));
            var12.method2329(var6, var7, var9, var10, this.field3599);
            return var12;
        }
    }

    @ObfuscatedName("jf.w(Leo;II)Leo;")
    public class135 method4382(class135 arg0, int arg1) {
        int var3 = this.field3595[arg1];
        class146 var4 = method331(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2302(true);
        }
        class146 var6 = null;
        int var7 = 0;
        if (this.field3598 != null && arg1 < this.field3598.length) {
            int var8 = this.field3598[arg1];
            var6 = method331(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class135 var10 = arg0.method2302(!var4.method2671(var5));
            var10.method2308(var4, var5);
            return var10;
        } else {
            class135 var9 = arg0.method2302(!var4.method2671(var5) & !var6.method2671(var7));
            var9.method2308(var4, var5);
            var9.method2308(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("aj.b(II)Lef;")
    public static class146 method331(int arg0) {
        class146 var1 = (class146) field3593.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class146 var2 = class146.method93(Statics.field331, Statics.field3597, arg0, false);
        if (var2 != null) {
            field3593.method3270(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("ef.o(I)V")
    public static void method2675() {
        field3605.method3259();
        field3593.method3259();
    }
}
