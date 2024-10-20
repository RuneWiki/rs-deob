package deob;

@ObfuscatedName("gu")
public class class202 extends class130 {

    @ObfuscatedName("gu.q")
    public static class125 field3048 = new class125(64);

    @ObfuscatedName("gu.d")
    public static class125 field3051 = new class125(100);

    @ObfuscatedName("gu.k")
    public int[] field3050;

    @ObfuscatedName("gu.j")
    public int[] field3052;

    @ObfuscatedName("gu.s")
    public int[] field3061;

    @ObfuscatedName("gu.o")
    public int[] field3053;

    @ObfuscatedName("gu.a")
    public int field3054 = -1;

    @ObfuscatedName("gu.c")
    public int[] field3055;

    @ObfuscatedName("gu.m")
    public boolean field3058 = false;

    @ObfuscatedName("gu.h")
    public int field3057 = 5;

    @ObfuscatedName("gu.r")
    public int field3060 = -1;

    @ObfuscatedName("gu.u")
    public int field3059 = -1;

    @ObfuscatedName("gu.i")
    public int field3056 = 99;

    @ObfuscatedName("gu.z")
    public int field3049 = -1;

    @ObfuscatedName("gu.n")
    public int field3062 = -1;

    @ObfuscatedName("gu.w")
    public int field3063 = 2;

    @ObfuscatedName("ed.p(IB)Lgu;")
    public static class202 method2533(int arg0) {
        class202 var1 = (class202) field3048.method2169((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3047.method3044(12, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3500(new class154(var2));
        }
        var3.method3502();
        field3048.method2174(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gu.g(Lev;B)V")
    public void method3500(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3501(arg0, var2);
        }
    }

    @ObfuscatedName("gu.x(Lev;IB)V")
    public void method3501(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2595();
            this.field3061 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3061[var4] = arg0.method2595();
            }
            this.field3050 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3050[var5] = arg0.method2595();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3050[var6] += arg0.method2595() << 16;
            }
        } else if (arg1 == 2) {
            this.field3054 = arg0.method2595();
        } else if (arg1 == 3) {
            int var7 = arg0.method2593();
            this.field3055 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3055[var8] = arg0.method2593();
            }
            this.field3055[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3058 = true;
        } else if (arg1 == 5) {
            this.field3057 = arg0.method2593();
        } else if (arg1 == 6) {
            this.field3060 = arg0.method2595();
        } else if (arg1 == 7) {
            this.field3059 = arg0.method2595();
        } else if (arg1 == 8) {
            this.field3056 = arg0.method2593();
        } else if (arg1 == 9) {
            this.field3049 = arg0.method2593();
        } else if (arg1 == 10) {
            this.field3062 = arg0.method2593();
        } else if (arg1 == 11) {
            this.field3063 = arg0.method2593();
        } else if (arg1 == 12) {
            int var9 = arg0.method2593();
            this.field3052 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3052[var10] = arg0.method2595();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3052[var11] += arg0.method2595() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2593();
            this.field3053 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3053[var13] = arg0.method2748();
            }
        }
    }

    @ObfuscatedName("gu.q(I)V")
    public void method3502() {
        if (this.field3049 == -1) {
            if (this.field3055 == null) {
                this.field3049 = 0;
            } else {
                this.field3049 = 2;
            }
        }
        if (this.field3062 != -1) {
            return;
        }
        if (this.field3055 == null) {
            this.field3062 = 0;
        } else {
            this.field3062 = 2;
        }
    }

    @ObfuscatedName("gu.d(Lcw;IB)Lcw;")
    public class83 method3528(class83 arg0, int arg1) {
        int var3 = this.field3050[arg1];
        class93 var4 = method3025(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1457(true);
        } else {
            class83 var6 = arg0.method1457(!var4.method1792(var5));
            var6.method1468(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gu.k(Lcw;IIB)Lcw;")
    public class83 method3504(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3050[arg1];
        class93 var5 = method3025(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1457(true);
        }
        class83 var7 = arg0.method1457(!var5.method1792(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1490();
        } else if (var8 == 2) {
            var7.method1467();
        } else if (var8 == 3) {
            var7.method1470();
        }
        var7.method1468(var5, var6);
        if (var8 == 1) {
            var7.method1470();
        } else if (var8 == 2) {
            var7.method1467();
        } else if (var8 == 3) {
            var7.method1490();
        }
        return var7;
    }

    @ObfuscatedName("gu.j(Lcw;II)Lcw;")
    public class83 method3505(class83 arg0, int arg1) {
        int var3 = this.field3050[arg1];
        class93 var4 = method3025(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1458(true);
        } else {
            class83 var6 = arg0.method1458(!var4.method1792(var5));
            var6.method1468(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gu.s(Lcw;ILgu;IB)Lcw;")
    public class83 method3506(class83 arg0, int arg1, class202 arg2, int arg3) {
        int var5 = this.field3050[arg1];
        class93 var6 = method3025(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3528(arg0, arg3);
        }
        int var8 = arg2.field3050[arg3];
        class93 var9 = method3025(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1457(!var6.method1792(var7));
            var11.method1468(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1457(!var6.method1792(var7) & !var9.method1792(var10));
            var12.method1464(var6, var7, var9, var10, this.field3055);
            return var12;
        }
    }

    @ObfuscatedName("gu.o(Lcw;IB)Lcw;")
    public class83 method3507(class83 arg0, int arg1) {
        int var3 = this.field3050[arg1];
        class93 var4 = method3025(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1457(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3052 != null && arg1 < this.field3052.length) {
            int var8 = this.field3052[arg1];
            var6 = method3025(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1457(!var4.method1792(var5));
            var10.method1468(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1457(!var4.method1792(var5) & !var6.method1792(var7));
            var9.method1468(var4, var5);
            var9.method1468(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fr.a(IB)Lcv;")
    public static class93 method3025(int arg0) {
        class93 var1 = (class93) field3051.method2169((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class93 var2 = class93.method3558(Statics.field3046, Statics.field3045, arg0, false);
        if (var2 != null) {
            field3051.method2174(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("fl.c(B)V")
    public static void method3017() {
        field3048.method2170();
        field3051.method2170();
    }
}
