package deob;

@ObfuscatedName("gf")
public class class202 extends class130 {

    @ObfuscatedName("gf.p")
    public static class125 field3055 = new class125(64);

    @ObfuscatedName("gf.j")
    public static class125 field3056 = new class125(100);

    @ObfuscatedName("gf.n")
    public int[] field3057;

    @ObfuscatedName("gf.r")
    public int[] field3066;

    @ObfuscatedName("gf.c")
    public int[] field3064;

    @ObfuscatedName("gf.i")
    public int[] field3060;

    @ObfuscatedName("gf.o")
    public int field3068 = -1;

    @ObfuscatedName("gf.m")
    public int[] field3062;

    @ObfuscatedName("gf.s")
    public boolean field3063 = false;

    @ObfuscatedName("gf.u")
    public int field3058 = 5;

    @ObfuscatedName("gf.b")
    public int field3065 = -1;

    @ObfuscatedName("gf.v")
    public int field3061 = -1;

    @ObfuscatedName("gf.f")
    public int field3059 = 99;

    @ObfuscatedName("gf.z")
    public int field3054 = -1;

    @ObfuscatedName("gf.t")
    public int field3069 = -1;

    @ObfuscatedName("gf.y")
    public int field3070 = 2;

    @ObfuscatedName("ed.q(Lgj;Lgj;Lgj;I)V")
    public static void method2572(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field3067 = arg0;
        Statics.field786 = arg1;
        Statics.field3125 = arg2;
    }

    @ObfuscatedName("gm.d(IS)Lgf;")
    public static class202 method3379(int arg0) {
        class202 var1 = (class202) field3055.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3067.method3133(12, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3620(new class154(var2));
        }
        var3.method3592();
        field3055.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gf.h(Lel;I)V")
    public void method3620(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3584(arg0, var2);
        }
    }

    @ObfuscatedName("gf.p(Lel;II)V")
    public void method3584(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2668();
            this.field3064 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3064[var4] = arg0.method2668();
            }
            this.field3057 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3057[var5] = arg0.method2668();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3057[var6] += arg0.method2668() << 16;
            }
        } else if (arg1 == 2) {
            this.field3068 = arg0.method2668();
        } else if (arg1 == 3) {
            int var7 = arg0.method2666();
            this.field3062 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3062[var8] = arg0.method2666();
            }
            this.field3062[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3063 = true;
        } else if (arg1 == 5) {
            this.field3058 = arg0.method2666();
        } else if (arg1 == 6) {
            this.field3065 = arg0.method2668();
        } else if (arg1 == 7) {
            this.field3061 = arg0.method2668();
        } else if (arg1 == 8) {
            this.field3059 = arg0.method2666();
        } else if (arg1 == 9) {
            this.field3054 = arg0.method2666();
        } else if (arg1 == 10) {
            this.field3069 = arg0.method2666();
        } else if (arg1 == 11) {
            this.field3070 = arg0.method2666();
        } else if (arg1 == 12) {
            int var9 = arg0.method2666();
            this.field3066 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3066[var10] = arg0.method2668();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3066[var11] += arg0.method2668() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2666();
            this.field3060 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3060[var13] = arg0.method2718();
            }
        }
    }

    @ObfuscatedName("gf.j(I)V")
    public void method3592() {
        if (this.field3054 == -1) {
            if (this.field3062 == null) {
                this.field3054 = 0;
            } else {
                this.field3054 = 2;
            }
        }
        if (this.field3069 != -1) {
            return;
        }
        if (this.field3062 == null) {
            this.field3069 = 0;
        } else {
            this.field3069 = 2;
        }
    }

    @ObfuscatedName("gf.n(Lcf;II)Lcf;")
    public class83 method3600(class83 arg0, int arg1) {
        int var3 = this.field3057[arg1];
        class93 var4 = method2938(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1549(true);
        } else {
            class83 var6 = arg0.method1549(!var4.method1892(var5));
            var6.method1595(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gf.c(Lcf;III)Lcf;")
    public class83 method3587(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3057[arg1];
        class93 var5 = method2938(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1549(true);
        }
        class83 var7 = arg0.method1549(!var5.method1892(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1560();
        } else if (var8 == 2) {
            var7.method1559();
        } else if (var8 == 3) {
            var7.method1558();
        }
        var7.method1595(var5, var6);
        if (var8 == 1) {
            var7.method1558();
        } else if (var8 == 2) {
            var7.method1559();
        } else if (var8 == 3) {
            var7.method1560();
        }
        return var7;
    }

    @ObfuscatedName("gf.o(Lcf;II)Lcf;")
    public class83 method3618(class83 arg0, int arg1) {
        int var3 = this.field3057[arg1];
        class93 var4 = method2938(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1550(true);
        } else {
            class83 var6 = arg0.method1550(!var4.method1892(var5));
            var6.method1595(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gf.s(Lcf;ILgf;II)Lcf;")
    public class83 method3589(class83 arg0, int arg1, class202 arg2, int arg3) {
        int var5 = this.field3057[arg1];
        class93 var6 = method2938(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3600(arg0, arg3);
        }
        int var8 = arg2.field3057[arg3];
        class93 var9 = method2938(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1549(!var6.method1892(var7));
            var11.method1595(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1549(!var6.method1892(var7) & !var9.method1892(var10));
            var12.method1556(var6, var7, var9, var10, this.field3062);
            return var12;
        }
    }

    @ObfuscatedName("gf.u(Lcf;II)Lcf;")
    public class83 method3590(class83 arg0, int arg1) {
        int var3 = this.field3057[arg1];
        class93 var4 = method2938(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1549(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3066 != null && arg1 < this.field3066.length) {
            int var8 = this.field3066[arg1];
            var6 = method2938(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1549(!var4.method1892(var5));
            var10.method1595(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1549(!var4.method1892(var5) & !var6.method1892(var7));
            var9.method1595(var4, var5);
            var9.method1595(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fc.b(IS)Lcu;")
    public static class93 method2938(int arg0) {
        class93 var1 = (class93) field3056.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class93 var2 = Statics.method186(Statics.field786, Statics.field3125, arg0, false);
        if (var2 != null) {
            field3056.method2248(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("aq.v(I)V")
    public static void method632() {
        field3055.method2249();
        field3056.method2249();
    }
}
