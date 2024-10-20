package deob;

@ObfuscatedName("jj")
public class class268 extends class202 {

    @ObfuscatedName("jj.z")
    public static class197 field3667 = new class197(64);

    @ObfuscatedName("jj.v")
    public static class197 field3680 = new class197(100);

    @ObfuscatedName("jj.m")
    public int[] field3669;

    @ObfuscatedName("jj.b")
    public int[] field3677;

    @ObfuscatedName("jj.t")
    public int[] field3671;

    @ObfuscatedName("jj.p")
    public int[] field3672;

    @ObfuscatedName("jj.r")
    public int field3673 = -1;

    @ObfuscatedName("jj.l")
    public int[] field3674;

    @ObfuscatedName("jj.u")
    public boolean field3675 = false;

    @ObfuscatedName("jj.n")
    public int field3676 = 5;

    @ObfuscatedName("jj.c")
    public int field3678 = -1;

    @ObfuscatedName("jj.y")
    public int field3665 = -1;

    @ObfuscatedName("jj.j")
    public int field3679 = 99;

    @ObfuscatedName("jj.f")
    public int field3666 = -1;

    @ObfuscatedName("jj.s")
    public int field3681 = -1;

    @ObfuscatedName("jj.e")
    public int field3682 = 2;

    @ObfuscatedName("ev.d(Lid;Lid;Lid;I)V")
    public static void method2771(class243 arg0, class243 arg1, class243 arg2) {
        Statics.field3668 = arg0;
        Statics.field3670 = arg1;
        Statics.field3727 = arg2;
    }

    @ObfuscatedName("c.x(II)Ljj;")
    public static class268 method76(int arg0) {
        class268 var1 = (class268) field3667.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3668.method3935(12, arg0);
        class268 var3 = new class268();
        if (var2 != null) {
            var3.method4532(new class181(var2));
        }
        var3.method4534();
        field3667.method3417(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.k(Lfr;B)V")
    public void method4532(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4556(arg0, var2);
        }
    }

    @ObfuscatedName("jj.z(Lfr;II)V")
    public void method4556(class181 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3179();
            this.field3671 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3671[var4] = arg0.method3179();
            }
            this.field3669 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3669[var5] = arg0.method3179();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3669[var6] += arg0.method3179() << 16;
            }
        } else if (arg1 == 2) {
            this.field3673 = arg0.method3179();
        } else if (arg1 == 3) {
            int var7 = arg0.method3204();
            this.field3674 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3674[var8] = arg0.method3204();
            }
            this.field3674[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3675 = true;
        } else if (arg1 == 5) {
            this.field3676 = arg0.method3204();
        } else if (arg1 == 6) {
            this.field3678 = arg0.method3179();
        } else if (arg1 == 7) {
            this.field3665 = arg0.method3179();
        } else if (arg1 == 8) {
            this.field3679 = arg0.method3204();
        } else if (arg1 == 9) {
            this.field3666 = arg0.method3204();
        } else if (arg1 == 10) {
            this.field3681 = arg0.method3204();
        } else if (arg1 == 11) {
            this.field3682 = arg0.method3204();
        } else if (arg1 == 12) {
            int var9 = arg0.method3204();
            this.field3677 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3677[var10] = arg0.method3179();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3677[var11] += arg0.method3179() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3204();
            this.field3672 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3672[var13] = arg0.method3235();
            }
        }
    }

    @ObfuscatedName("jj.v(B)V")
    public void method4534() {
        if (this.field3666 == -1) {
            if (this.field3674 == null) {
                this.field3666 = 0;
            } else {
                this.field3666 = 2;
            }
        }
        if (this.field3681 != -1) {
            return;
        }
        if (this.field3674 == null) {
            this.field3681 = 0;
        } else {
            this.field3681 = 2;
        }
    }

    @ObfuscatedName("jj.m(Leh;II)Leh;")
    public class133 method4535(class133 arg0, int arg1) {
        int var3 = this.field3669[arg1];
        class144 var4 = method4227(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2403(true);
        } else {
            class133 var6 = arg0.method2403(!var4.method2773(var5));
            var6.method2411(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jj.b(Leh;III)Leh;")
    public class133 method4536(class133 arg0, int arg1, int arg2) {
        int var4 = this.field3669[arg1];
        class144 var5 = method4227(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2403(true);
        }
        class133 var7 = arg0.method2403(!var5.method2773(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2431();
        } else if (var8 == 2) {
            var7.method2463();
        } else if (var8 == 3) {
            var7.method2414();
        }
        var7.method2411(var5, var6);
        if (var8 == 1) {
            var7.method2414();
        } else if (var8 == 2) {
            var7.method2463();
        } else if (var8 == 3) {
            var7.method2431();
        }
        return var7;
    }

    @ObfuscatedName("jj.t(Leh;II)Leh;")
    public class133 method4537(class133 arg0, int arg1) {
        int var3 = this.field3669[arg1];
        class144 var4 = method4227(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2404(true);
        } else {
            class133 var6 = arg0.method2404(!var4.method2773(var5));
            var6.method2411(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jj.p(Leh;ILjj;II)Leh;")
    public class133 method4533(class133 arg0, int arg1, class268 arg2, int arg3) {
        int var5 = this.field3669[arg1];
        class144 var6 = method4227(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4535(arg0, arg3);
        }
        int var8 = arg2.field3669[arg3];
        class144 var9 = method4227(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class133 var11 = arg0.method2403(!var6.method2773(var7));
            var11.method2411(var6, var7);
            return var11;
        } else {
            class133 var12 = arg0.method2403(!var6.method2773(var7) & !var9.method2773(var10));
            var12.method2412(var6, var7, var9, var10, this.field3674);
            return var12;
        }
    }

    @ObfuscatedName("jj.r(Leh;II)Leh;")
    public class133 method4539(class133 arg0, int arg1) {
        int var3 = this.field3669[arg1];
        class144 var4 = method4227(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2403(true);
        }
        class144 var6 = null;
        int var7 = 0;
        if (this.field3677 != null && arg1 < this.field3677.length) {
            int var8 = this.field3677[arg1];
            var6 = method4227(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class133 var10 = arg0.method2403(!var4.method2773(var5));
            var10.method2411(var4, var5);
            return var10;
        } else {
            class133 var9 = arg0.method2403(!var4.method2773(var5) & !var6.method2773(var7));
            var9.method2411(var4, var5);
            var9.method2411(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ib.l(IB)Lej;")
    public static class144 method4227(int arg0) {
        class144 var1 = (class144) field3680.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class144 var2 = class144.method326(Statics.field3670, Statics.field3727, arg0, false);
        if (var2 != null) {
            field3680.method3417(var2, (long) arg0);
        }
        return var2;
    }
}
