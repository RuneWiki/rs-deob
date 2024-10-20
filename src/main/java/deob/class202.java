package deob;

@ObfuscatedName("gf")
public class class202 extends class130 {

    @ObfuscatedName("gf.g")
    public static class125 field3049 = new class125(64);

    @ObfuscatedName("gf.h")
    public static class125 field3050 = new class125(100);

    @ObfuscatedName("gf.v")
    public int[] field3051;

    @ObfuscatedName("gf.l")
    public int[] field3064;

    @ObfuscatedName("gf.c")
    public int[] field3048;

    @ObfuscatedName("gf.u")
    public int[] field3054;

    @ObfuscatedName("gf.k")
    public int field3055 = -1;

    @ObfuscatedName("gf.z")
    public int[] field3056;

    @ObfuscatedName("gf.y")
    public boolean field3065 = false;

    @ObfuscatedName("gf.j")
    public int field3057 = 5;

    @ObfuscatedName("gf.f")
    public int field3059 = -1;

    @ObfuscatedName("gf.p")
    public int field3061 = -1;

    @ObfuscatedName("gf.i")
    public int field3053 = 99;

    @ObfuscatedName("gf.s")
    public int field3047 = -1;

    @ObfuscatedName("gf.x")
    public int field3063 = -1;

    @ObfuscatedName("gf.d")
    public int field3060 = 2;

    @ObfuscatedName("cn.o(Lgl;Lgl;Lgl;I)V")
    public static void method1759(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field3052 = arg0;
        Statics.field3058 = arg1;
        Statics.field3062 = arg2;
    }

    @ObfuscatedName("av.m(II)Lgf;")
    public static class202 method658(int arg0) {
        class202 var1 = (class202) field3049.method2130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3052.method3012(12, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3499(new class154(var2));
        }
        var3.method3469();
        field3049.method2132(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gf.b(Lez;I)V")
    public void method3499(class154 arg0) {
        while (true) {
            int var2 = arg0.method2552();
            if (var2 == 0) {
                return;
            }
            this.method3464(arg0, var2);
        }
    }

    @ObfuscatedName("gf.g(Lez;II)V")
    public void method3464(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2554();
            this.field3048 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3048[var4] = arg0.method2554();
            }
            this.field3051 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3051[var5] = arg0.method2554();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3051[var6] += arg0.method2554() << 16;
            }
        } else if (arg1 == 2) {
            this.field3055 = arg0.method2554();
        } else if (arg1 == 3) {
            int var7 = arg0.method2552();
            this.field3056 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3056[var8] = arg0.method2552();
            }
            this.field3056[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3065 = true;
        } else if (arg1 == 5) {
            this.field3057 = arg0.method2552();
        } else if (arg1 == 6) {
            this.field3059 = arg0.method2554();
        } else if (arg1 == 7) {
            this.field3061 = arg0.method2554();
        } else if (arg1 == 8) {
            this.field3053 = arg0.method2552();
        } else if (arg1 == 9) {
            this.field3047 = arg0.method2552();
        } else if (arg1 == 10) {
            this.field3063 = arg0.method2552();
        } else if (arg1 == 11) {
            this.field3060 = arg0.method2552();
        } else if (arg1 == 12) {
            int var9 = arg0.method2552();
            this.field3064 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3064[var10] = arg0.method2554();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3064[var11] += arg0.method2554() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2552();
            this.field3054 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3054[var13] = arg0.method2556();
            }
        }
    }

    @ObfuscatedName("gf.l(I)V")
    public void method3469() {
        if (this.field3047 == -1) {
            if (this.field3056 == null) {
                this.field3047 = 0;
            } else {
                this.field3047 = 2;
            }
        }
        if (this.field3063 != -1) {
            return;
        }
        if (this.field3056 == null) {
            this.field3063 = 0;
        } else {
            this.field3063 = 2;
        }
    }

    @ObfuscatedName("gf.c(Lcy;II)Lcy;")
    public class83 method3466(class83 arg0, int arg1) {
        int var3 = this.field3051[arg1];
        class93 var4 = method778(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1458(true);
        } else {
            class83 var6 = arg0.method1458(!var4.method1765(var5));
            var6.method1450(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gf.u(Lcy;IIS)Lcy;")
    public class83 method3467(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3051[arg1];
        class93 var5 = method778(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1458(true);
        }
        class83 var7 = arg0.method1458(!var5.method1765(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1455();
        } else if (var8 == 2) {
            var7.method1457();
        } else if (var8 == 3) {
            var7.method1456();
        }
        var7.method1450(var5, var6);
        if (var8 == 1) {
            var7.method1456();
        } else if (var8 == 2) {
            var7.method1457();
        } else if (var8 == 3) {
            var7.method1455();
        }
        return var7;
    }

    @ObfuscatedName("gf.k(Lcy;II)Lcy;")
    public class83 method3468(class83 arg0, int arg1) {
        int var3 = this.field3051[arg1];
        class93 var4 = method778(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1448(true);
        } else {
            class83 var6 = arg0.method1448(!var4.method1765(var5));
            var6.method1450(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gf.z(Lcy;ILgf;II)Lcy;")
    public class83 method3477(class83 arg0, int arg1, class202 arg2, int arg3) {
        int var5 = this.field3051[arg1];
        class93 var6 = method778(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3466(arg0, arg3);
        }
        int var8 = arg2.field3051[arg3];
        class93 var9 = method778(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1458(!var6.method1765(var7));
            var11.method1450(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1458(!var6.method1765(var7) & !var9.method1765(var10));
            var12.method1454(var6, var7, var9, var10, this.field3056);
            return var12;
        }
    }

    @ObfuscatedName("gf.y(Lcy;IB)Lcy;")
    public class83 method3475(class83 arg0, int arg1) {
        int var3 = this.field3051[arg1];
        class93 var4 = method778(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1458(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3064 != null && arg1 < this.field3064.length) {
            int var8 = this.field3064[arg1];
            var6 = method778(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1458(!var4.method1765(var5));
            var10.method1450(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1458(!var4.method1765(var5) & !var6.method1765(var7));
            var9.method1450(var4, var5);
            var9.method1450(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ax.j(II)Lci;")
    public static class93 method778(int arg0) {
        class93 var1 = (class93) field3050.method2130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class183 var2 = Statics.field3058;
        class183 var3 = Statics.field3062;
        boolean var4 = true;
        int[] var5 = var2.method3021(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3018(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3018(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class93 var10;
        if (var4) {
            try {
                var10 = new class93(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3050.method2132(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("fg.f(B)V")
    public static void method2987() {
        field3049.method2139();
        field3050.method2139();
    }
}
