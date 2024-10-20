package deob;

@ObfuscatedName("gk")
public class class202 extends class130 {

    @ObfuscatedName("gk.v")
    public static class125 field3079 = new class125(64);

    @ObfuscatedName("gk.y")
    public static class125 field3065 = new class125(100);

    @ObfuscatedName("gk.p")
    public int[] field3063;

    @ObfuscatedName("gk.j")
    public int[] field3062;

    @ObfuscatedName("gk.m")
    public int[] field3064;

    @ObfuscatedName("gk.a")
    public int[] field3066;

    @ObfuscatedName("gk.i")
    public int field3067 = -1;

    @ObfuscatedName("gk.s")
    public int[] field3059;

    @ObfuscatedName("gk.k")
    public boolean field3069 = false;

    @ObfuscatedName("gk.f")
    public int field3070 = 5;

    @ObfuscatedName("gk.o")
    public int field3071 = -1;

    @ObfuscatedName("gk.q")
    public int field3072 = -1;

    @ObfuscatedName("gk.c")
    public int field3068 = 99;

    @ObfuscatedName("gk.b")
    public int field3074 = -1;

    @ObfuscatedName("gk.w")
    public int field3075 = -1;

    @ObfuscatedName("gk.l")
    public int field3076 = 2;

    @ObfuscatedName("gk.n(Leq;B)V")
    public void method3606(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3620(arg0, var2);
        }
    }

    @ObfuscatedName("gk.g(Leq;IS)V")
    public void method3620(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2833();
            this.field3064 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3064[var4] = arg0.method2833();
            }
            this.field3063 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3063[var5] = arg0.method2833();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3063[var6] += arg0.method2833() << 16;
            }
        } else if (arg1 == 2) {
            this.field3067 = arg0.method2833();
        } else if (arg1 == 3) {
            int var7 = arg0.method2878();
            this.field3059 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3059[var8] = arg0.method2878();
            }
            this.field3059[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3069 = true;
        } else if (arg1 == 5) {
            this.field3070 = arg0.method2878();
        } else if (arg1 == 6) {
            this.field3071 = arg0.method2833();
        } else if (arg1 == 7) {
            this.field3072 = arg0.method2833();
        } else if (arg1 == 8) {
            this.field3068 = arg0.method2878();
        } else if (arg1 == 9) {
            this.field3074 = arg0.method2878();
        } else if (arg1 == 10) {
            this.field3075 = arg0.method2878();
        } else if (arg1 == 11) {
            this.field3076 = arg0.method2878();
        } else if (arg1 == 12) {
            int var9 = arg0.method2878();
            this.field3062 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3062[var10] = arg0.method2833();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3062[var11] += arg0.method2833() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2878();
            this.field3066 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3066[var13] = arg0.method2705();
            }
        }
    }

    @ObfuscatedName("gk.v(I)V")
    public void method3608() {
        if (this.field3074 == -1) {
            if (this.field3059 == null) {
                this.field3074 = 0;
            } else {
                this.field3074 = 2;
            }
        }
        if (this.field3075 != -1) {
            return;
        }
        if (this.field3059 == null) {
            this.field3075 = 0;
        } else {
            this.field3075 = 2;
        }
    }

    @ObfuscatedName("gk.y(Lcj;II)Lcj;")
    public class83 method3609(class83 arg0, int arg1) {
        int var3 = this.field3063[arg1];
        class93 var4 = method1914(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1619(true);
        } else {
            class83 var6 = arg0.method1619(!var4.method1903(var5));
            var6.method1574(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gk.p(Lcj;IIB)Lcj;")
    public class83 method3610(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3063[arg1];
        class93 var5 = method1914(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1619(true);
        }
        class83 var7 = arg0.method1619(!var5.method1903(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1641();
        } else if (var8 == 2) {
            var7.method1622();
        } else if (var8 == 3) {
            var7.method1640();
        }
        var7.method1574(var5, var6);
        if (var8 == 1) {
            var7.method1640();
        } else if (var8 == 2) {
            var7.method1622();
        } else if (var8 == 3) {
            var7.method1641();
        }
        return var7;
    }

    @ObfuscatedName("gk.j(Lcj;IB)Lcj;")
    public class83 method3611(class83 arg0, int arg1) {
        int var3 = this.field3063[arg1];
        class93 var4 = method1914(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1569(true);
        } else {
            class83 var6 = arg0.method1569(!var4.method1903(var5));
            var6.method1574(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gk.s(Lcj;ILgk;II)Lcj;")
    public class83 method3622(class83 arg0, int arg1, class202 arg2, int arg3) {
        int var5 = this.field3063[arg1];
        class93 var6 = method1914(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3609(arg0, arg3);
        }
        int var8 = arg2.field3063[arg3];
        class93 var9 = method1914(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1619(!var6.method1903(var7));
            var11.method1574(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1619(!var6.method1903(var7) & !var9.method1903(var10));
            var12.method1575(var6, var7, var9, var10, this.field3059);
            return var12;
        }
    }

    @ObfuscatedName("gk.k(Lcj;II)Lcj;")
    public class83 method3612(class83 arg0, int arg1) {
        int var3 = this.field3063[arg1];
        class93 var4 = method1914(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1619(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3062 != null && arg1 < this.field3062.length) {
            int var8 = this.field3062[arg1];
            var6 = method1914(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1619(!var4.method1903(var5));
            var10.method1574(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1619(!var4.method1903(var5) & !var6.method1903(var7));
            var9.method1574(var4, var5);
            var9.method1574(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ce.f(IB)Lcs;")
    public static class93 method1914(int arg0) {
        class93 var1 = (class93) field3065.method2275((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class183 var2 = Statics.field3086;
        class183 var3 = Statics.field3060;
        boolean var4 = true;
        int[] var5 = var2.method3162(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3159(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3159(var8, 0);
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
            field3065.method2282(var10, (long) arg0);
        }
        return var10;
    }
}
