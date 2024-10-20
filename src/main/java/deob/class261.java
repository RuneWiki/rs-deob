package deob;

@ObfuscatedName("ju")
public class class261 extends class195 {

    @ObfuscatedName("ju.g")
    public static class190 field3585 = new class190(64);

    @ObfuscatedName("ju.d")
    public static class190 field3589 = new class190(100);

    @ObfuscatedName("ju.b")
    public int[] field3587;

    @ObfuscatedName("ju.k")
    public int[] field3593;

    @ObfuscatedName("ju.f")
    public int[] field3588;

    @ObfuscatedName("ju.j")
    public int[] field3590;

    @ObfuscatedName("ju.q")
    public int field3591 = -1;

    @ObfuscatedName("ju.h")
    public int[] field3596;

    @ObfuscatedName("ju.i")
    public boolean field3586 = false;

    @ObfuscatedName("ju.s")
    public int field3594 = 5;

    @ObfuscatedName("ju.n")
    public int field3595 = -1;

    @ObfuscatedName("ju.c")
    public int field3600 = -1;

    @ObfuscatedName("ju.v")
    public int field3597 = 99;

    @ObfuscatedName("ju.u")
    public int field3584 = -1;

    @ObfuscatedName("ju.w")
    public int field3599 = -1;

    @ObfuscatedName("ju.z")
    public int field3582 = 2;

    @ObfuscatedName("hx.e(Lin;Lin;Lin;I)V")
    public static void method3726(class236 arg0, class236 arg1, class236 arg2) {
        Statics.field3598 = arg0;
        Statics.field3583 = arg1;
        Statics.field3592 = arg2;
    }

    @ObfuscatedName("fp.o(IS)Lju;")
    public static class261 method2746(int arg0) {
        class261 var1 = (class261) field3585.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3598.method3760(12, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4369(new class174(var2));
        }
        var3.method4334();
        field3585.method3250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ju.m(Lfw;I)V")
    public void method4369(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method4367(arg0, var2);
        }
    }

    @ObfuscatedName("ju.g(Lfw;II)V")
    public void method4367(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2930();
            this.field3588 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3588[var4] = arg0.method2930();
            }
            this.field3587 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3587[var5] = arg0.method2930();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3587[var6] += arg0.method2930() << 16;
            }
        } else if (arg1 == 2) {
            this.field3591 = arg0.method2930();
        } else if (arg1 == 3) {
            int var7 = arg0.method2891();
            this.field3596 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3596[var8] = arg0.method2891();
            }
            this.field3596[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3586 = true;
        } else if (arg1 == 5) {
            this.field3594 = arg0.method2891();
        } else if (arg1 == 6) {
            this.field3595 = arg0.method2930();
        } else if (arg1 == 7) {
            this.field3600 = arg0.method2930();
        } else if (arg1 == 8) {
            this.field3597 = arg0.method2891();
        } else if (arg1 == 9) {
            this.field3584 = arg0.method2891();
        } else if (arg1 == 10) {
            this.field3599 = arg0.method2891();
        } else if (arg1 == 11) {
            this.field3582 = arg0.method2891();
        } else if (arg1 == 12) {
            int var9 = arg0.method2891();
            this.field3593 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3593[var10] = arg0.method2930();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3593[var11] += arg0.method2930() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2891();
            this.field3590 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3590[var13] = arg0.method2890();
            }
        }
    }

    @ObfuscatedName("ju.d(I)V")
    public void method4334() {
        if (this.field3584 == -1) {
            if (this.field3596 == null) {
                this.field3584 = 0;
            } else {
                this.field3584 = 2;
            }
        }
        if (this.field3599 != -1) {
            return;
        }
        if (this.field3596 == null) {
            this.field3599 = 0;
        } else {
            this.field3599 = 2;
        }
    }

    @ObfuscatedName("ju.b(Leo;IS)Leo;")
    public class134 method4333(class134 arg0, int arg1) {
        int var3 = this.field3587[arg1];
        class145 var4 = method3870(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2277(true);
        } else {
            class134 var6 = arg0.method2277(!var4.method2651(var5));
            var6.method2285(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ju.k(Leo;III)Leo;")
    public class134 method4335(class134 arg0, int arg1, int arg2) {
        int var4 = this.field3587[arg1];
        class145 var5 = method3870(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2277(true);
        }
        class134 var7 = arg0.method2277(!var5.method2651(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2289();
        } else if (var8 == 2) {
            var7.method2274();
        } else if (var8 == 3) {
            var7.method2288();
        }
        var7.method2285(var5, var6);
        if (var8 == 1) {
            var7.method2288();
        } else if (var8 == 2) {
            var7.method2274();
        } else if (var8 == 3) {
            var7.method2289();
        }
        return var7;
    }

    @ObfuscatedName("ju.q(Leo;IB)Leo;")
    public class134 method4336(class134 arg0, int arg1) {
        int var3 = this.field3587[arg1];
        class145 var4 = method3870(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2314(true);
        } else {
            class134 var6 = arg0.method2314(!var4.method2651(var5));
            var6.method2285(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ju.h(Leo;ILju;II)Leo;")
    public class134 method4337(class134 arg0, int arg1, class261 arg2, int arg3) {
        int var5 = this.field3587[arg1];
        class145 var6 = method3870(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4333(arg0, arg3);
        }
        int var8 = arg2.field3587[arg3];
        class145 var9 = method3870(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class134 var11 = arg0.method2277(!var6.method2651(var7));
            var11.method2285(var6, var7);
            return var11;
        } else {
            class134 var12 = arg0.method2277(!var6.method2651(var7) & !var9.method2651(var10));
            var12.method2286(var6, var7, var9, var10, this.field3596);
            return var12;
        }
    }

    @ObfuscatedName("ju.i(Leo;II)Leo;")
    public class134 method4338(class134 arg0, int arg1) {
        int var3 = this.field3587[arg1];
        class145 var4 = method3870(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2277(true);
        }
        class145 var6 = null;
        int var7 = 0;
        if (this.field3593 != null && arg1 < this.field3593.length) {
            int var8 = this.field3593[arg1];
            var6 = method3870(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class134 var10 = arg0.method2277(!var4.method2651(var5));
            var10.method2285(var4, var5);
            return var10;
        } else {
            class134 var9 = arg0.method2277(!var4.method2651(var5) & !var6.method2651(var7));
            var9.method2285(var4, var5);
            var9.method2285(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ik.s(II)Leh;")
    public static class145 method3870(int arg0) {
        class145 var1 = (class145) field3589.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class145 var2 = class145.method1548(Statics.field3583, Statics.field3592, arg0, false);
        if (var2 != null) {
            field3589.method3250(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("bm.n(I)V")
    public static void method1027() {
        field3585.method3247();
        field3589.method3247();
    }
}
