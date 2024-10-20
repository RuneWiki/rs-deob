package deob;

@ObfuscatedName("ar")
public class class165 extends class7 {

    @ObfuscatedName("ar.f")
    public int field2535 = 2;

    @ObfuscatedName("ar.g")
    public int field2536 = -1;

    @ObfuscatedName("ar.d")
    public int[] field2526;

    @ObfuscatedName("ar.e")
    public int field2531 = -1;

    @ObfuscatedName("ar.a")
    public boolean field2528 = false;

    @ObfuscatedName("ar.o")
    public int field2533 = -1;

    @ObfuscatedName("ar.m")
    public static class75 field2521 = new class75(100);

    @ObfuscatedName("ar.j")
    public int[] field2524;

    @ObfuscatedName("ar.k")
    public int field2520 = -1;

    @ObfuscatedName("ar.i")
    public static class75 field2525 = new class75(64);

    @ObfuscatedName("ar.u")
    public int field2529 = 5;

    @ObfuscatedName("ar.s")
    public int field2530 = -1;

    @ObfuscatedName("ar.p")
    public int field2532 = 99;

    @ObfuscatedName("ar.z")
    public int[] field2522;

    @ObfuscatedName("ar.y")
    public int[] field2527;

    @ObfuscatedName("ar.x")
    public int[] field2523;

    @ObfuscatedName("ar.b(Ldv;I)V")
    public void method2976(class28 arg0) {
        while (true) {
            int var2 = arg0.method450();
            if (var2 == 0) {
                return;
            }
            this.method2978(arg0, var2);
        }
    }

    @ObfuscatedName("ar.i(Ldv;II)V")
    public void method2978(class28 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method349();
            this.field2526 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2526[var4] = arg0.method349();
            }
            this.field2522 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2522[var5] = arg0.method349();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2522[var6] += arg0.method349() << 16;
            }
        } else if (arg1 == 2) {
            this.field2536 = arg0.method349();
        } else if (arg1 == 3) {
            int var7 = arg0.method450();
            this.field2527 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2527[var8] = arg0.method450();
            }
            this.field2527[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2528 = true;
        } else if (arg1 == 5) {
            this.field2529 = arg0.method450();
        } else if (arg1 == 6) {
            this.field2520 = arg0.method349();
        } else if (arg1 == 7) {
            this.field2531 = arg0.method349();
        } else if (arg1 == 8) {
            this.field2532 = arg0.method450();
        } else if (arg1 == 9) {
            this.field2533 = arg0.method450();
        } else if (arg1 == 10) {
            this.field2530 = arg0.method450();
        } else if (arg1 == 11) {
            this.field2535 = arg0.method450();
        } else if (arg1 == 12) {
            int var9 = arg0.method450();
            this.field2523 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2523[var10] = arg0.method349();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2523[var11] += arg0.method349() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method450();
            this.field2524 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2524[var13] = arg0.method316();
            }
        }
    }

    @ObfuscatedName("ar.z(Ldk;II)Ldk;")
    public class43 method2980(class43 arg0, int arg1) {
        int var3 = this.field2522[arg1];
        class48 var4 = method1077(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method774(true);
        } else {
            class43 var6 = arg0.method774(!var4.method862(var5));
            var6.method824(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.x(Ldk;III)Ldk;")
    public class43 method2982(class43 arg0, int arg1, int arg2) {
        int var4 = this.field2522[arg1];
        class48 var5 = method1077(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method774(true);
        }
        class43 var7 = arg0.method774(!var5.method862(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method809();
        } else if (var8 == 2) {
            var7.method783();
        } else if (var8 == 3) {
            var7.method782();
        }
        var7.method824(var5, var6);
        if (var8 == 1) {
            var7.method782();
        } else if (var8 == 2) {
            var7.method783();
        } else if (var8 == 3) {
            var7.method809();
        }
        return var7;
    }

    @ObfuscatedName("ar.g(Ldk;IB)Ldk;")
    public class43 method2984(class43 arg0, int arg1) {
        int var3 = this.field2522[arg1];
        class48 var4 = method1077(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method774(true);
        }
        class48 var6 = null;
        int var7 = 0;
        if (this.field2523 != null && arg1 < this.field2523.length) {
            int var8 = this.field2523[arg1];
            var6 = method1077(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class43 var10 = arg0.method774(!var4.method862(var5));
            var10.method824(var4, var5);
            return var10;
        } else {
            class43 var9 = arg0.method774(!var4.method862(var5) & !var6.method862(var7));
            var9.method824(var4, var5);
            var9.method824(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ar.m(I)V")
    public void method2998() {
        if (this.field2533 == -1) {
            if (this.field2527 == null) {
                this.field2533 = 0;
            } else {
                this.field2533 = 2;
            }
        }
        if (this.field2530 != -1) {
            return;
        }
        if (this.field2527 == null) {
            this.field2530 = 0;
        } else {
            this.field2530 = 2;
        }
    }

    @ObfuscatedName("ar.d(Ldk;II)Ldk;")
    public class43 method3005(class43 arg0, int arg1) {
        int var3 = this.field2522[arg1];
        class48 var4 = method1077(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method775(true);
        } else {
            class43 var6 = arg0.method775(!var4.method862(var5));
            var6.method824(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.j(Ldk;ILar;II)Ldk;")
    public class43 method3010(class43 arg0, int arg1, class165 arg2, int arg3) {
        int var5 = this.field2522[arg1];
        class48 var6 = method1077(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method2980(arg0, arg3);
        }
        int var8 = arg2.field2522[arg3];
        class48 var9 = method1077(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class43 var11 = arg0.method774(!var6.method862(var7));
            var11.method824(var6, var7);
            return var11;
        } else {
            class43 var12 = arg0.method774(!var6.method862(var7) & !var9.method862(var10));
            var12.method780(var6, var7, var9, var10, this.field2527);
            return var12;
        }
    }

    @ObfuscatedName("o.y(II)Ldn;")
    public static class48 method1077(int arg0) {
        class48 var1 = (class48) field2521.method1196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class87 var2 = Statics.field235;
        class87 var3 = Statics.field2537;
        boolean var4 = true;
        int[] var5 = var2.method1335(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method1304(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method1304(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class48 var10;
        if (var4) {
            try {
                var10 = new class48(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field2521.method1184(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("t.v(Lel;Lel;Lel;I)V")
    public static void method1294(class87 arg0, class87 arg1, class87 arg2) {
        Statics.field2519 = arg0;
        Statics.field235 = arg1;
        Statics.field2537 = arg2;
    }

    @ObfuscatedName("ao.a(B)V")
    public static void method3202() {
        field2525.method1188();
        field2521.method1188();
    }

    @ObfuscatedName("an.c(II)Lar;")
    public static class165 method3233(int arg0) {
        class165 var1 = (class165) field2525.method1196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2519.method1298(12, arg0);
        class165 var3 = new class165();
        if (var2 != null) {
            var3.method2976(new class28(var2));
        }
        var3.method2998();
        field2525.method1184(var3, (long) arg0);
        return var3;
    }
}
