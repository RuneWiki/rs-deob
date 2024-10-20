package deob;

@ObfuscatedName("ea")
public class class155 extends class142 {

    @ObfuscatedName("ea.e")
    public static class100 field2358 = new class100(64);

    @ObfuscatedName("ea.a")
    public static class100 field2370 = new class100(100);

    @ObfuscatedName("ea.g")
    public int[] field2369;

    @ObfuscatedName("ea.w")
    public int[] field2360;

    @ObfuscatedName("ea.v")
    public int[] field2359;

    @ObfuscatedName("ea.u")
    public int[] field2362;

    @ObfuscatedName("ea.m")
    public int field2363 = -1;

    @ObfuscatedName("ea.b")
    public int[] field2364;

    @ObfuscatedName("ea.f")
    public boolean field2361 = false;

    @ObfuscatedName("ea.d")
    public int field2366 = 5;

    @ObfuscatedName("ea.x")
    public int field2367 = -1;

    @ObfuscatedName("ea.z")
    public int field2357 = -1;

    @ObfuscatedName("ea.o")
    public int field2368 = 99;

    @ObfuscatedName("ea.c")
    public int field2365 = -1;

    @ObfuscatedName("ea.y")
    public int field2371 = -1;

    @ObfuscatedName("ea.j")
    public int field2372 = 2;

    @ObfuscatedName("be.i(Lcy;Lcy;Lcy;B)V")
    public static void method782(class86 arg0, class86 arg1, class86 arg2) {
        Statics.field1217 = arg0;
        Statics.field1583 = arg1;
        Statics.field348 = arg2;
    }

    @ObfuscatedName("fm.e(II)Lea;")
    public static class155 method2497(int arg0) {
        class155 var1 = (class155) field2358.method1231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1217.method1015(12, arg0);
        class155 var3 = new class155();
        if (var2 != null) {
            var3.method2383(new class135(var2));
        }
        var3.method2385();
        field2358.method1232(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ea.a(Lec;B)V")
    public void method2383(class135 arg0) {
        while (true) {
            int var2 = arg0.method1571();
            if (var2 == 0) {
                return;
            }
            this.method2384(arg0, var2);
        }
    }

    @ObfuscatedName("ea.g(Lec;II)V")
    public void method2384(class135 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method1725();
            this.field2359 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2359[var4] = arg0.method1725();
            }
            this.field2369 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2369[var5] = arg0.method1725();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2369[var6] += arg0.method1725() << 16;
            }
        } else if (arg1 == 2) {
            this.field2363 = arg0.method1725();
        } else if (arg1 == 3) {
            int var7 = arg0.method1571();
            this.field2364 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2364[var8] = arg0.method1571();
            }
            this.field2364[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2361 = true;
        } else if (arg1 == 5) {
            this.field2366 = arg0.method1571();
        } else if (arg1 == 6) {
            this.field2367 = arg0.method1725();
        } else if (arg1 == 7) {
            this.field2357 = arg0.method1725();
        } else if (arg1 == 8) {
            this.field2368 = arg0.method1571();
        } else if (arg1 == 9) {
            this.field2365 = arg0.method1571();
        } else if (arg1 == 10) {
            this.field2371 = arg0.method1571();
        } else if (arg1 == 11) {
            this.field2372 = arg0.method1571();
        } else if (arg1 == 12) {
            int var9 = arg0.method1571();
            this.field2360 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2360[var10] = arg0.method1725();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2360[var11] += arg0.method1725() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method1571();
            this.field2362 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2362[var13] = arg0.method1575();
            }
        }
    }

    @ObfuscatedName("ea.w(B)V")
    public void method2385() {
        if (this.field2365 == -1) {
            if (this.field2364 == null) {
                this.field2365 = 0;
            } else {
                this.field2365 = 2;
            }
        }
        if (this.field2371 != -1) {
            return;
        }
        if (this.field2364 == null) {
            this.field2371 = 0;
        } else {
            this.field2371 = 2;
        }
    }

    @ObfuscatedName("ea.v(Lfr;II)Lfr;")
    public class180 method2386(class180 arg0, int arg1) {
        int var3 = this.field2369[arg1];
        class166 var4 = method1462(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3010(true);
        } else {
            class180 var6 = arg0.method3010(!var4.method2633(var5));
            var6.method2976(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ea.u(Lfr;III)Lfr;")
    public class180 method2387(class180 arg0, int arg1, int arg2) {
        int var4 = this.field2369[arg1];
        class166 var5 = method1462(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method3010(true);
        }
        class180 var7 = arg0.method3010(!var5.method2633(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2985();
        } else if (var8 == 2) {
            var7.method2984();
        } else if (var8 == 3) {
            var7.method2992();
        }
        var7.method2976(var5, var6);
        if (var8 == 1) {
            var7.method2992();
        } else if (var8 == 2) {
            var7.method2984();
        } else if (var8 == 3) {
            var7.method2985();
        }
        return var7;
    }

    @ObfuscatedName("ea.m(Lfr;IB)Lfr;")
    public class180 method2388(class180 arg0, int arg1) {
        int var3 = this.field2369[arg1];
        class166 var4 = method1462(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2975(true);
        } else {
            class180 var6 = arg0.method2975(!var4.method2633(var5));
            var6.method2976(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ea.b(Lfr;ILea;II)Lfr;")
    public class180 method2389(class180 arg0, int arg1, class155 arg2, int arg3) {
        int var5 = this.field2369[arg1];
        class166 var6 = method1462(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method2386(arg0, arg3);
        }
        int var8 = arg2.field2369[arg3];
        class166 var9 = method1462(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class180 var11 = arg0.method3010(!var6.method2633(var7));
            var11.method2976(var6, var7);
            return var11;
        } else {
            class180 var12 = arg0.method3010(!var6.method2633(var7) & !var9.method2633(var10));
            var12.method2981(var6, var7, var9, var10, this.field2364);
            return var12;
        }
    }

    @ObfuscatedName("ea.f(Lfr;IB)Lfr;")
    public class180 method2390(class180 arg0, int arg1) {
        int var3 = this.field2369[arg1];
        class166 var4 = method1462(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3010(true);
        }
        class166 var6 = null;
        int var7 = 0;
        if (this.field2360 != null && arg1 < this.field2360.length) {
            int var8 = this.field2360[arg1];
            var6 = method1462(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class180 var10 = arg0.method3010(!var4.method2633(var5));
            var10.method2976(var4, var5);
            return var10;
        } else {
            class180 var9 = arg0.method3010(!var4.method2633(var5) & !var6.method2633(var7));
            var9.method2976(var4, var5);
            var9.method2976(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("dy.d(II)Lfb;")
    public static class166 method1462(int arg0) {
        class166 var1 = (class166) field2370.method1231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class166 var2 = Statics.method1761(Statics.field1583, Statics.field348, arg0, false);
        if (var2 != null) {
            field2370.method1232(var2, (long) arg0);
        }
        return var2;
    }
}
