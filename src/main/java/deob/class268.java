package deob;

@ObfuscatedName("jh")
public class class268 extends class202 {

    @ObfuscatedName("jh.g")
    public static class197 field3650 = new class197(64);

    @ObfuscatedName("jh.x")
    public static class197 field3653 = new class197(100);

    @ObfuscatedName("jh.f")
    public int[] field3661;

    @ObfuscatedName("jh.u")
    public int[] field3655;

    @ObfuscatedName("jh.t")
    public int[] field3656;

    @ObfuscatedName("jh.k")
    public int[] field3657;

    @ObfuscatedName("jh.n")
    public int field3658 = -1;

    @ObfuscatedName("jh.d")
    public int[] field3664;

    @ObfuscatedName("jh.o")
    public boolean field3660 = false;

    @ObfuscatedName("jh.a")
    public int field3659 = 5;

    @ObfuscatedName("jh.q")
    public int field3662 = -1;

    @ObfuscatedName("jh.j")
    public int field3663 = -1;

    @ObfuscatedName("jh.m")
    public int field3654 = 99;

    @ObfuscatedName("jh.h")
    public int field3665 = -1;

    @ObfuscatedName("jh.c")
    public int field3666 = -1;

    @ObfuscatedName("jh.y")
    public int field3667 = 2;

    @ObfuscatedName("ai.b(Lij;Lij;Lij;I)V")
    public static void method606(class243 arg0, class243 arg1, class243 arg2) {
        Statics.field292 = arg0;
        Statics.field3668 = arg1;
        Statics.field3651 = arg2;
    }

    @ObfuscatedName("cp.s(II)Ljh;")
    public static class268 method1560(int arg0) {
        class268 var1 = (class268) field3650.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field292.method3887(12, arg0);
        class268 var3 = new class268();
        if (var2 != null) {
            var3.method4423(new class181(var2));
        }
        var3.method4429();
        field3650.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.r(Lfs;I)V")
    public void method4423(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method4405(arg0, var2);
        }
    }

    @ObfuscatedName("jh.g(Lfs;II)V")
    public void method4405(class181 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3081();
            this.field3656 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3656[var4] = arg0.method3081();
            }
            this.field3661 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3661[var5] = arg0.method3081();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3661[var6] += arg0.method3081() << 16;
            }
        } else if (arg1 == 2) {
            this.field3658 = arg0.method3081();
        } else if (arg1 == 3) {
            int var7 = arg0.method2945();
            this.field3664 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3664[var8] = arg0.method2945();
            }
            this.field3664[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3660 = true;
        } else if (arg1 == 5) {
            this.field3659 = arg0.method2945();
        } else if (arg1 == 6) {
            this.field3662 = arg0.method3081();
        } else if (arg1 == 7) {
            this.field3663 = arg0.method3081();
        } else if (arg1 == 8) {
            this.field3654 = arg0.method2945();
        } else if (arg1 == 9) {
            this.field3665 = arg0.method2945();
        } else if (arg1 == 10) {
            this.field3666 = arg0.method2945();
        } else if (arg1 == 11) {
            this.field3667 = arg0.method2945();
        } else if (arg1 == 12) {
            int var9 = arg0.method2945();
            this.field3655 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3655[var10] = arg0.method3081();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3655[var11] += arg0.method3081() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2945();
            this.field3657 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3657[var13] = arg0.method3010();
            }
        }
    }

    @ObfuscatedName("jh.x(I)V")
    public void method4429() {
        if (this.field3665 == -1) {
            if (this.field3664 == null) {
                this.field3665 = 0;
            } else {
                this.field3665 = 2;
            }
        }
        if (this.field3666 != -1) {
            return;
        }
        if (this.field3664 == null) {
            this.field3666 = 0;
        } else {
            this.field3666 = 2;
        }
    }

    @ObfuscatedName("jh.f(Lev;II)Lev;")
    public class133 method4394(class133 arg0, int arg1) {
        int var3 = this.field3661[arg1];
        class144 var4 = method137(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2368(true);
        } else {
            class133 var6 = arg0.method2368(!var4.method2666(var5));
            var6.method2338(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jh.u(Lev;III)Lev;")
    public class133 method4397(class133 arg0, int arg1, int arg2) {
        int var4 = this.field3661[arg1];
        class144 var5 = method137(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2368(true);
        }
        class133 var7 = arg0.method2368(!var5.method2666(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2378();
        } else if (var8 == 2) {
            var7.method2320();
        } else if (var8 == 3) {
            var7.method2319();
        }
        var7.method2338(var5, var6);
        if (var8 == 1) {
            var7.method2319();
        } else if (var8 == 2) {
            var7.method2320();
        } else if (var8 == 3) {
            var7.method2378();
        }
        return var7;
    }

    @ObfuscatedName("jh.t(Lev;II)Lev;")
    public class133 method4398(class133 arg0, int arg1) {
        int var3 = this.field3661[arg1];
        class144 var4 = method137(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2313(true);
        } else {
            class133 var6 = arg0.method2313(!var4.method2666(var5));
            var6.method2338(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jh.k(Lev;ILjh;IB)Lev;")
    public class133 method4399(class133 arg0, int arg1, class268 arg2, int arg3) {
        int var5 = this.field3661[arg1];
        class144 var6 = method137(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4394(arg0, arg3);
        }
        int var8 = arg2.field3661[arg3];
        class144 var9 = method137(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class133 var11 = arg0.method2368(!var6.method2666(var7));
            var11.method2338(var6, var7);
            return var11;
        } else {
            class133 var12 = arg0.method2368(!var6.method2666(var7) & !var9.method2666(var10));
            var12.method2317(var6, var7, var9, var10, this.field3664);
            return var12;
        }
    }

    @ObfuscatedName("jh.n(Lev;IB)Lev;")
    public class133 method4393(class133 arg0, int arg1) {
        int var3 = this.field3661[arg1];
        class144 var4 = method137(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2368(true);
        }
        class144 var6 = null;
        int var7 = 0;
        if (this.field3655 != null && arg1 < this.field3655.length) {
            int var8 = this.field3655[arg1];
            var6 = method137(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class133 var10 = arg0.method2368(!var4.method2666(var5));
            var10.method2338(var4, var5);
            return var10;
        } else {
            class133 var9 = arg0.method2368(!var4.method2666(var5) & !var6.method2666(var7));
            var9.method2338(var4, var5);
            var9.method2338(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("i.d(IB)Let;")
    public static class144 method137(int arg0) {
        class144 var1 = (class144) field3653.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class144 var2 = class144.method216(Statics.field3668, Statics.field3651, arg0, false);
        if (var2 != null) {
            field3653.method3332(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("i.o(I)V")
    public static void method140() {
        field3650.method3333();
        field3653.method3333();
    }
}
