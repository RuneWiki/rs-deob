package deob;

@ObfuscatedName("aq")
public class class166 extends class77 {

    @ObfuscatedName("aq.f")
    public int field2533 = -1;

    @ObfuscatedName("aq.g")
    public int[] field2531;

    @ObfuscatedName("aq.e")
    public int[] field2545;

    @ObfuscatedName("aq.c")
    public int field2524 = 2;

    @ObfuscatedName("aq.n")
    public int[] field2530;

    @ObfuscatedName("aq.l")
    public int field2549 = 5;

    @ObfuscatedName("aq.m")
    public int field2543 = -1;

    @ObfuscatedName("aq.h")
    public static class67 field2528 = new class67(100);

    @ObfuscatedName("aq.i")
    public int field2536 = -1;

    @ObfuscatedName("aq.w")
    public int field2542 = -1;

    @ObfuscatedName("aq.v")
    public int field2541 = -1;

    @ObfuscatedName("aq.t")
    public static class67 field2527 = new class67(64);

    @ObfuscatedName("aq.s")
    public int field2539 = 99;

    @ObfuscatedName("aq.r")
    public int[] field2529;

    @ObfuscatedName("aq.z")
    public boolean field2535 = false;

    @ObfuscatedName("aq.x")
    public int[] field2534;

    @ObfuscatedName("aq.o(Ldy;I)V")
    public void method3172(class31 arg0) {
        while (true) {
            int var2 = arg0.method512();
            if (var2 == 0) {
                return;
            }
            this.method3178(arg0, var2);
        }
    }

    @ObfuscatedName("aq.r(Ldi;II)Ldi;")
    public class41 method3175(class41 arg0, int arg1) {
        int var3 = this.field2529[arg1];
        class44 var4 = method925(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method641(true);
        } else {
            class41 var6 = arg0.method641(!var4.method727(var5));
            var6.method647(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aq.n(Ldi;III)Ldi;")
    public class41 method3176(class41 arg0, int arg1, int arg2) {
        int var4 = this.field2529[arg1];
        class44 var5 = method925(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method641(true);
        }
        class41 var7 = arg0.method641(!var5.method727(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method652();
        } else if (var8 == 2) {
            var7.method642();
        } else if (var8 == 3) {
            var7.method683();
        }
        var7.method647(var5, var6);
        if (var8 == 1) {
            var7.method683();
        } else if (var8 == 2) {
            var7.method642();
        } else if (var8 == 3) {
            var7.method652();
        }
        return var7;
    }

    @ObfuscatedName("aq.g(Ldi;IB)Ldi;")
    public class41 method3177(class41 arg0, int arg1) {
        int var3 = this.field2529[arg1];
        class44 var4 = method925(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method654(true);
        } else {
            class41 var6 = arg0.method654(!var4.method727(var5));
            var6.method647(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aq.t(Ldy;II)V")
    public void method3178(class31 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method373();
            this.field2531 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2531[var4] = arg0.method373();
            }
            this.field2529 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2529[var5] = arg0.method373();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2529[var6] += arg0.method373() << 16;
            }
        } else if (arg1 == 2) {
            this.field2533 = arg0.method373();
        } else if (arg1 == 3) {
            int var7 = arg0.method512();
            this.field2534 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2534[var8] = arg0.method512();
            }
            this.field2534[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2535 = true;
        } else if (arg1 == 5) {
            this.field2549 = arg0.method512();
        } else if (arg1 == 6) {
            this.field2542 = arg0.method373();
        } else if (arg1 == 7) {
            this.field2536 = arg0.method373();
        } else if (arg1 == 8) {
            this.field2539 = arg0.method512();
        } else if (arg1 == 9) {
            this.field2543 = arg0.method512();
        } else if (arg1 == 10) {
            this.field2541 = arg0.method512();
        } else if (arg1 == 11) {
            this.field2524 = arg0.method512();
        } else if (arg1 == 12) {
            int var9 = arg0.method512();
            this.field2530 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2530[var10] = arg0.method373();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2530[var11] += arg0.method373() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method512();
            this.field2545 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2545[var13] = arg0.method375();
            }
        }
    }

    @ObfuscatedName("aq.f(Ldi;II)Ldi;")
    public class41 method3179(class41 arg0, int arg1) {
        int var3 = this.field2529[arg1];
        class44 var4 = method925(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method641(true);
        }
        class44 var6 = null;
        int var7 = 0;
        if (this.field2530 != null && arg1 < this.field2530.length) {
            int var8 = this.field2530[arg1];
            var6 = method925(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class41 var10 = arg0.method641(!var4.method727(var5));
            var10.method647(var4, var5);
            return var10;
        } else {
            class41 var9 = arg0.method641(!var4.method727(var5) & !var6.method727(var7));
            var9.method647(var4, var5);
            var9.method647(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("aq.e(Ldi;ILaq;IB)Ldi;")
    public class41 method3187(class41 arg0, int arg1, class166 arg2, int arg3) {
        int var5 = this.field2529[arg1];
        class44 var6 = method925(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3175(arg0, arg3);
        }
        int var8 = arg2.field2529[arg3];
        class44 var9 = method925(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class41 var11 = arg0.method641(!var6.method727(var7));
            var11.method647(var6, var7);
            return var11;
        } else {
            class41 var12 = arg0.method641(!var6.method727(var7) & !var9.method727(var10));
            var12.method648(var6, var7, var9, var10, this.field2534);
            return var12;
        }
    }

    @ObfuscatedName("aq.h(S)V")
    public void method3200() {
        if (this.field2543 == -1) {
            if (this.field2534 == null) {
                this.field2543 = 0;
            } else {
                this.field2543 = 2;
            }
        }
        if (this.field2541 != -1) {
            return;
        }
        if (this.field2534 == null) {
            this.field2541 = 0;
        } else {
            this.field2541 = 2;
        }
    }

    @ObfuscatedName("fp.p(IB)Laq;")
    public static class166 method274(int arg0) {
        class166 var1 = (class166) field2527.method908((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2537.method1083(12, arg0);
        class166 var3 = new class166();
        if (var2 != null) {
            var3.method3172(new class31(var2));
        }
        var3.method3200();
        field2527.method907(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("o.x(II)Ldj;")
    public static class44 method925(int arg0) {
        class44 var1 = (class44) field2528.method908((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class81 var2 = Statics.field2525;
        class81 var3 = Statics.field2526;
        boolean var4 = true;
        int[] var5 = var2.method1113(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method1145(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method1145(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class44 var10;
        if (var4) {
            try {
                var10 = new class44(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field2528.method907(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("p.j(Leg;Leg;Leg;I)V")
    public static void method1355(class81 arg0, class81 arg1, class81 arg2) {
        Statics.field2537 = arg0;
        Statics.field2525 = arg1;
        Statics.field2526 = arg2;
    }
}
