package deob;

@ObfuscatedName("kw")
public class class298 extends class346 {

    @ObfuscatedName("kw.p")
    public static class199 field3725 = new class199(64);

    @ObfuscatedName("kw.b")
    public static class199 field3711 = new class199(100);

    @ObfuscatedName("kw.e")
    public int[] field3712;

    @ObfuscatedName("kw.k")
    public int[] field3720;

    @ObfuscatedName("kw.g")
    public int[] field3714;

    @ObfuscatedName("kw.h")
    public int[] field3710;

    @ObfuscatedName("kw.n")
    public int field3715 = -1;

    @ObfuscatedName("kw.l")
    public int[] field3717;

    @ObfuscatedName("kw.m")
    public boolean field3713 = false;

    @ObfuscatedName("kw.d")
    public int field3719 = 5;

    @ObfuscatedName("kw.c")
    public int field3716 = -1;

    @ObfuscatedName("kw.j")
    public int field3721 = -1;

    @ObfuscatedName("kw.r")
    public int field3722 = 99;

    @ObfuscatedName("kw.q")
    public int field3723 = -1;

    @ObfuscatedName("kw.t")
    public int field3724 = -1;

    @ObfuscatedName("kw.v")
    public int field3708 = 2;

    @ObfuscatedName("hg.f(II)Lkw;")
    public static class298 method3795(int arg0) {
        class298 var1 = (class298) field3725.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3718.method3933(12, arg0);
        class298 var3 = new class298();
        if (var2 != null) {
            var3.method4739(new class382(var2));
        }
        var3.method4741();
        field3725.method3400(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kw.o(Lnu;I)V")
    public void method4739(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4752(arg0, var2);
        }
    }

    @ObfuscatedName("kw.u(Lnu;IB)V")
    public void method4752(class382 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5858();
            this.field3714 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3714[var4] = arg0.method5858();
            }
            this.field3712 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3712[var5] = arg0.method5858();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3712[var6] += arg0.method5858() << 16;
            }
        } else if (arg1 == 2) {
            this.field3715 = arg0.method5858();
        } else if (arg1 == 3) {
            int var7 = arg0.method5856();
            this.field3717 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3717[var8] = arg0.method5856();
            }
            this.field3717[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3713 = true;
        } else if (arg1 == 5) {
            this.field3719 = arg0.method5856();
        } else if (arg1 == 6) {
            this.field3716 = arg0.method5858();
        } else if (arg1 == 7) {
            this.field3721 = arg0.method5858();
        } else if (arg1 == 8) {
            this.field3722 = arg0.method5856();
        } else if (arg1 == 9) {
            this.field3723 = arg0.method5856();
        } else if (arg1 == 10) {
            this.field3724 = arg0.method5856();
        } else if (arg1 == 11) {
            this.field3708 = arg0.method5856();
        } else if (arg1 == 12) {
            int var9 = arg0.method5856();
            this.field3720 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3720[var10] = arg0.method5858();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3720[var11] += arg0.method5858() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5856();
            this.field3710 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3710[var13] = arg0.method5875();
            }
        }
    }

    @ObfuscatedName("kw.p(B)V")
    public void method4741() {
        if (this.field3723 == -1) {
            if (this.field3717 == null) {
                this.field3723 = 0;
            } else {
                this.field3723 = 2;
            }
        }
        if (this.field3724 != -1) {
            return;
        }
        if (this.field3717 == null) {
            this.field3724 = 0;
        } else {
            this.field3724 = 2;
        }
    }

    @ObfuscatedName("kw.b(Lgv;IB)Lgv;")
    public class183 method4754(class183 arg0, int arg1) {
        int var3 = this.field3712[arg1];
        class179 var4 = method1979(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3272(true);
        } else {
            class183 var6 = arg0.method3272(!var4.method3195(var5));
            var6.method3244(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("kw.e(Lgv;III)Lgv;")
    public class183 method4743(class183 arg0, int arg1, int arg2) {
        int var4 = this.field3712[arg1];
        class179 var5 = method1979(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method3272(true);
        }
        class183 var7 = arg0.method3272(!var5.method3195(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method3294();
        } else if (var8 == 2) {
            var7.method3248();
        } else if (var8 == 3) {
            var7.method3247();
        }
        var7.method3244(var5, var6);
        if (var8 == 1) {
            var7.method3247();
        } else if (var8 == 2) {
            var7.method3248();
        } else if (var8 == 3) {
            var7.method3294();
        }
        return var7;
    }

    @ObfuscatedName("kw.k(Lgv;IB)Lgv;")
    public class183 method4744(class183 arg0, int arg1) {
        int var3 = this.field3712[arg1];
        class179 var4 = method1979(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3301(true);
        } else {
            class183 var6 = arg0.method3301(!var4.method3195(var5));
            var6.method3244(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("kw.g(Lgv;ILkw;II)Lgv;")
    public class183 method4745(class183 arg0, int arg1, class298 arg2, int arg3) {
        int var5 = this.field3712[arg1];
        class179 var6 = method1979(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4754(arg0, arg3);
        }
        int var8 = arg2.field3712[arg3];
        class179 var9 = method1979(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class183 var11 = arg0.method3272(!var6.method3195(var7));
            var11.method3244(var6, var7);
            return var11;
        } else {
            class183 var12 = arg0.method3272(!var6.method3195(var7) & !var9.method3195(var10));
            var12.method3245(var6, var7, var9, var10, this.field3717);
            return var12;
        }
    }

    @ObfuscatedName("kw.h(Lgv;II)Lgv;")
    public class183 method4746(class183 arg0, int arg1) {
        int var3 = this.field3712[arg1];
        class179 var4 = method1979(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3272(true);
        }
        class179 var6 = null;
        int var7 = 0;
        if (this.field3720 != null && arg1 < this.field3720.length) {
            int var8 = this.field3720[arg1];
            var6 = method1979(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class183 var10 = arg0.method3272(!var4.method3195(var5));
            var10.method3244(var4, var5);
            return var10;
        } else {
            class183 var9 = arg0.method3272(!var4.method3195(var5) & !var6.method3195(var7));
            var9.method3244(var4, var5);
            var9.method3244(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("dy.n(II)Lfb;")
    public static class179 method1979(int arg0) {
        class179 var1 = (class179) field3711.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class179 var2 = class179.method2833(Statics.field595, Statics.field3709, arg0, false);
        if (var2 != null) {
            field3711.method3400(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("a.l(B)V")
    public static void method188() {
        field3725.method3392();
        field3711.method3392();
    }
}
