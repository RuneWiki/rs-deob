package deob;

@ObfuscatedName("eu")
public class class156 extends class143 {

    @ObfuscatedName("eu.k")
    public static class101 field2373 = new class101(64);

    @ObfuscatedName("eu.u")
    public static class101 field2368 = new class101(100);

    @ObfuscatedName("eu.v")
    public int[] field2362;

    @ObfuscatedName("eu.f")
    public int[] field2363;

    @ObfuscatedName("eu.s")
    public int[] field2364;

    @ObfuscatedName("eu.j")
    public int[] field2365;

    @ObfuscatedName("eu.e")
    public int field2366 = -1;

    @ObfuscatedName("eu.t")
    public int[] field2367;

    @ObfuscatedName("eu.y")
    public boolean field2357 = false;

    @ObfuscatedName("eu.b")
    public int field2369 = 5;

    @ObfuscatedName("eu.w")
    public int field2358 = -1;

    @ObfuscatedName("eu.g")
    public int field2371 = -1;

    @ObfuscatedName("eu.p")
    public int field2372 = 99;

    @ObfuscatedName("eu.z")
    public int field2370 = -1;

    @ObfuscatedName("eu.n")
    public int field2374 = -1;

    @ObfuscatedName("eu.x")
    public int field2375 = 2;

    @ObfuscatedName("ac.k(IB)Leu;")
    public static class156 method482(int arg0) {
        class156 var1 = (class156) field2373.method1236((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2360.method1024(12, arg0);
        class156 var3 = new class156();
        if (var2 != null) {
            var3.method2417(new class136(var2));
        }
        var3.method2419();
        field2373.method1238(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("eu.u(Let;I)V")
    public void method2417(class136 arg0) {
        while (true) {
            int var2 = arg0.method1602();
            if (var2 == 0) {
                return;
            }
            this.method2418(arg0, var2);
        }
    }

    @ObfuscatedName("eu.v(Let;II)V")
    public void method2418(class136 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method1712();
            this.field2364 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2364[var4] = arg0.method1712();
            }
            this.field2362 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2362[var5] = arg0.method1712();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2362[var6] += arg0.method1712() << 16;
            }
        } else if (arg1 == 2) {
            this.field2366 = arg0.method1712();
        } else if (arg1 == 3) {
            int var7 = arg0.method1602();
            this.field2367 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2367[var8] = arg0.method1602();
            }
            this.field2367[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2357 = true;
        } else if (arg1 == 5) {
            this.field2369 = arg0.method1602();
        } else if (arg1 == 6) {
            this.field2358 = arg0.method1712();
        } else if (arg1 == 7) {
            this.field2371 = arg0.method1712();
        } else if (arg1 == 8) {
            this.field2372 = arg0.method1602();
        } else if (arg1 == 9) {
            this.field2370 = arg0.method1602();
        } else if (arg1 == 10) {
            this.field2374 = arg0.method1602();
        } else if (arg1 == 11) {
            this.field2375 = arg0.method1602();
        } else if (arg1 == 12) {
            int var9 = arg0.method1602();
            this.field2363 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2363[var10] = arg0.method1712();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2363[var11] += arg0.method1712() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method1602();
            this.field2365 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2365[var13] = arg0.method1606();
            }
        }
    }

    @ObfuscatedName("eu.f(B)V")
    public void method2419() {
        if (this.field2370 == -1) {
            if (this.field2367 == null) {
                this.field2370 = 0;
            } else {
                this.field2370 = 2;
            }
        }
        if (this.field2374 != -1) {
            return;
        }
        if (this.field2367 == null) {
            this.field2374 = 0;
        } else {
            this.field2374 = 2;
        }
    }

    @ObfuscatedName("eu.s(Lfb;II)Lfb;")
    public class181 method2420(class181 arg0, int arg1) {
        int var3 = this.field2362[arg1];
        class167 var4 = method1144(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3003(true);
        } else {
            class181 var6 = arg0.method3003(!var4.method2651(var5));
            var6.method3019(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("eu.j(Lfb;IIB)Lfb;")
    public class181 method2421(class181 arg0, int arg1, int arg2) {
        int var4 = this.field2362[arg1];
        class167 var5 = method1144(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method3003(true);
        }
        class181 var7 = arg0.method3003(!var5.method2651(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method3047();
        } else if (var8 == 2) {
            var7.method3013();
        } else if (var8 == 3) {
            var7.method3009();
        }
        var7.method3019(var5, var6);
        if (var8 == 1) {
            var7.method3009();
        } else if (var8 == 2) {
            var7.method3013();
        } else if (var8 == 3) {
            var7.method3047();
        }
        return var7;
    }

    @ObfuscatedName("eu.e(Lfb;II)Lfb;")
    public class181 method2422(class181 arg0, int arg1) {
        int var3 = this.field2362[arg1];
        class167 var4 = method1144(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3004(true);
        } else {
            class181 var6 = arg0.method3004(!var4.method2651(var5));
            var6.method3019(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("eu.t(Lfb;ILeu;IB)Lfb;")
    public class181 method2437(class181 arg0, int arg1, class156 arg2, int arg3) {
        int var5 = this.field2362[arg1];
        class167 var6 = method1144(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method2420(arg0, arg3);
        }
        int var8 = arg2.field2362[arg3];
        class167 var9 = method1144(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class181 var11 = arg0.method3003(!var6.method2651(var7));
            var11.method3019(var6, var7);
            return var11;
        } else {
            class181 var12 = arg0.method3003(!var6.method2651(var7) & !var9.method2651(var10));
            var12.method3025(var6, var7, var9, var10, this.field2367);
            return var12;
        }
    }

    @ObfuscatedName("eu.y(Lfb;II)Lfb;")
    public class181 method2424(class181 arg0, int arg1) {
        int var3 = this.field2362[arg1];
        class167 var4 = method1144(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3003(true);
        }
        class167 var6 = null;
        int var7 = 0;
        if (this.field2363 != null && arg1 < this.field2363.length) {
            int var8 = this.field2363[arg1];
            var6 = method1144(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class181 var10 = arg0.method3003(!var4.method2651(var5));
            var10.method3019(var4, var5);
            return var10;
        } else {
            class181 var9 = arg0.method3003(!var4.method2651(var5) & !var6.method2651(var7));
            var9.method3019(var4, var5);
            var9.method3019(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ce.b(II)Lfl;")
    public static class167 method1144(int arg0) {
        class167 var1 = (class167) field2368.method1236((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class87 var2 = Statics.field2361;
        class87 var3 = Statics.field2359;
        boolean var4 = true;
        int[] var5 = var2.method1084(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method1026(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method1026(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class167 var10;
        if (var4) {
            try {
                var10 = new class167(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field2368.method1238(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("co.w(I)V")
    public static void method1232() {
        field2373.method1239();
        field2368.method1239();
    }
}
