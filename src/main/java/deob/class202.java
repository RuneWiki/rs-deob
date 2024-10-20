package deob;

@ObfuscatedName("gx")
public class class202 extends class130 {

    @ObfuscatedName("gx.h")
    public static class125 field3060 = new class125(64);

    @ObfuscatedName("gx.a")
    public static class125 field3061 = new class125(100);

    @ObfuscatedName("gx.g")
    public int[] field3076;

    @ObfuscatedName("gx.k")
    public int[] field3057;

    @ObfuscatedName("gx.u")
    public int[] field3064;

    @ObfuscatedName("gx.b")
    public int[] field3065;

    @ObfuscatedName("gx.x")
    public int field3066 = -1;

    @ObfuscatedName("gx.r")
    public int[] field3074;

    @ObfuscatedName("gx.n")
    public boolean field3068 = false;

    @ObfuscatedName("gx.m")
    public int field3075 = 5;

    @ObfuscatedName("gx.j")
    public int field3058 = -1;

    @ObfuscatedName("gx.w")
    public int field3071 = -1;

    @ObfuscatedName("gx.p")
    public int field3072 = 99;

    @ObfuscatedName("gx.o")
    public int field3073 = -1;

    @ObfuscatedName("gx.i")
    public int field3069 = -1;

    @ObfuscatedName("gx.z")
    public int field3070 = 2;

    @ObfuscatedName("al.s(Lgp;Lgp;Lgp;I)V")
    public static void method672(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field3062 = arg0;
        Statics.field3067 = arg1;
        Statics.field3059 = arg2;
    }

    @ObfuscatedName("dm.c(II)Lgx;")
    public static class202 method1914(int arg0) {
        class202 var1 = (class202) field3060.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3062.method2986(12, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3406(new class154(var2));
        }
        var3.method3407();
        field3060.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gx.f(Lea;S)V")
    public void method3406(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3405(arg0, var2);
        }
    }

    @ObfuscatedName("gx.g(Lea;II)V")
    public void method3405(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2541();
            this.field3064 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3064[var4] = arg0.method2541();
            }
            this.field3076 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3076[var5] = arg0.method2541();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3076[var6] += arg0.method2541() << 16;
            }
        } else if (arg1 == 2) {
            this.field3066 = arg0.method2541();
        } else if (arg1 == 3) {
            int var7 = arg0.method2545();
            this.field3074 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3074[var8] = arg0.method2545();
            }
            this.field3074[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3068 = true;
        } else if (arg1 == 5) {
            this.field3075 = arg0.method2545();
        } else if (arg1 == 6) {
            this.field3058 = arg0.method2541();
        } else if (arg1 == 7) {
            this.field3071 = arg0.method2541();
        } else if (arg1 == 8) {
            this.field3072 = arg0.method2545();
        } else if (arg1 == 9) {
            this.field3073 = arg0.method2545();
        } else if (arg1 == 10) {
            this.field3069 = arg0.method2545();
        } else if (arg1 == 11) {
            this.field3070 = arg0.method2545();
        } else if (arg1 == 12) {
            int var9 = arg0.method2545();
            this.field3057 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3057[var10] = arg0.method2541();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3057[var11] += arg0.method2541() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2545();
            this.field3065 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3065[var13] = arg0.method2549();
            }
        }
    }

    @ObfuscatedName("gx.k(I)V")
    public void method3407() {
        if (this.field3073 == -1) {
            if (this.field3074 == null) {
                this.field3073 = 0;
            } else {
                this.field3073 = 2;
            }
        }
        if (this.field3069 != -1) {
            return;
        }
        if (this.field3074 == null) {
            this.field3069 = 0;
        } else {
            this.field3069 = 2;
        }
    }

    @ObfuscatedName("gx.u(Lcz;IB)Lcz;")
    public class83 method3408(class83 arg0, int arg1) {
        int var3 = this.field3076[arg1];
        class93 var4 = method2517(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1444(true);
        } else {
            class83 var6 = arg0.method1444(!var4.method1757(var5));
            var6.method1453(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gx.b(Lcz;III)Lcz;")
    public class83 method3429(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3076[arg1];
        class93 var5 = method2517(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1444(true);
        }
        class83 var7 = arg0.method1444(!var5.method1757(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1455();
        } else if (var8 == 2) {
            var7.method1468();
        } else if (var8 == 3) {
            var7.method1514();
        }
        var7.method1453(var5, var6);
        if (var8 == 1) {
            var7.method1514();
        } else if (var8 == 2) {
            var7.method1468();
        } else if (var8 == 3) {
            var7.method1455();
        }
        return var7;
    }

    @ObfuscatedName("gx.x(Lcz;II)Lcz;")
    public class83 method3410(class83 arg0, int arg1) {
        int var3 = this.field3076[arg1];
        class93 var4 = method2517(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1445(true);
        } else {
            class83 var6 = arg0.method1445(!var4.method1757(var5));
            var6.method1453(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gx.r(Lcz;ILgx;II)Lcz;")
    public class83 method3435(class83 arg0, int arg1, class202 arg2, int arg3) {
        int var5 = this.field3076[arg1];
        class93 var6 = method2517(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3408(arg0, arg3);
        }
        int var8 = arg2.field3076[arg3];
        class93 var9 = method2517(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1444(!var6.method1757(var7));
            var11.method1453(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1444(!var6.method1757(var7) & !var9.method1757(var10));
            var12.method1451(var6, var7, var9, var10, this.field3074);
            return var12;
        }
    }

    @ObfuscatedName("gx.n(Lcz;II)Lcz;")
    public class83 method3412(class83 arg0, int arg1) {
        int var3 = this.field3076[arg1];
        class93 var4 = method2517(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1444(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3057 != null && arg1 < this.field3057.length) {
            int var8 = this.field3057[arg1];
            var6 = method2517(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1444(!var4.method1757(var5));
            var10.method1453(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1444(!var4.method1757(var5) & !var6.method1757(var7));
            var9.method1453(var4, var5);
            var9.method1453(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ee.m(IB)Lcp;")
    public static class93 method2517(int arg0) {
        class93 var1 = (class93) field3061.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class183 var2 = Statics.field3067;
        class183 var3 = Statics.field3059;
        boolean var4 = true;
        int[] var5 = var2.method2995(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3041(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3041(var8, 0);
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
            field3061.method2123(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("gm.j(B)V")
    public static void method3178() {
        field3060.method2124();
        field3061.method2124();
    }
}
