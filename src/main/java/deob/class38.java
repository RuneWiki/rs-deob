package deob;

@ObfuscatedName("az")
public class class38 extends class180 {

    @ObfuscatedName("az.g")
    public static class170 field891 = new class170(64);

    @ObfuscatedName("az.u")
    public static class170 field906 = new class170(100);

    @ObfuscatedName("az.k")
    public int[] field907;

    @ObfuscatedName("az.m")
    public int[] field895;

    @ObfuscatedName("az.t")
    public int[] field909;

    @ObfuscatedName("az.l")
    public int[] field896;

    @ObfuscatedName("az.f")
    public int field897 = -1;

    @ObfuscatedName("az.c")
    public int[] field894;

    @ObfuscatedName("az.i")
    public boolean field899 = false;

    @ObfuscatedName("az.o")
    public int field900 = 5;

    @ObfuscatedName("az.d")
    public int field888 = -1;

    @ObfuscatedName("az.b")
    public int field898 = -1;

    @ObfuscatedName("az.v")
    public int field903 = 99;

    @ObfuscatedName("az.n")
    public int field904 = -1;

    @ObfuscatedName("az.w")
    public int field905 = -1;

    @ObfuscatedName("az.z")
    public int field901 = 2;

    @ObfuscatedName("dc.e(Lec;Lec;Lec;I)V")
    public static void method2376(class145 arg0, class145 arg1, class145 arg2) {
        Statics.field890 = arg0;
        Statics.field889 = arg1;
        Statics.field892 = arg2;
    }

    @ObfuscatedName("m.p(II)Laz;")
    public static class38 method81(int arg0) {
        class38 var1 = (class38) field891.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field890.method2717(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method738(new class107(var2));
        }
        var3.method727();
        field891.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.a(Ldp;B)V")
    public void method738(class107 arg0) {
        while (true) {
            int var2 = arg0.method2125();
            if (var2 == 0) {
                return;
            }
            this.method725(arg0, var2);
        }
    }

    @ObfuscatedName("az.g(Ldp;II)V")
    public void method725(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2182();
            this.field909 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field909[var4] = arg0.method2182();
            }
            this.field907 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field907[var5] = arg0.method2182();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field907[var6] += arg0.method2182() << 16;
            }
        } else if (arg1 == 2) {
            this.field897 = arg0.method2182();
        } else if (arg1 == 3) {
            int var7 = arg0.method2125();
            this.field894 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field894[var8] = arg0.method2125();
            }
            this.field894[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field899 = true;
        } else if (arg1 == 5) {
            this.field900 = arg0.method2125();
        } else if (arg1 == 6) {
            this.field888 = arg0.method2182();
        } else if (arg1 == 7) {
            this.field898 = arg0.method2182();
        } else if (arg1 == 8) {
            this.field903 = arg0.method2125();
        } else if (arg1 == 9) {
            this.field904 = arg0.method2125();
        } else if (arg1 == 10) {
            this.field905 = arg0.method2125();
        } else if (arg1 == 11) {
            this.field901 = arg0.method2125();
        } else if (arg1 == 12) {
            int var9 = arg0.method2125();
            this.field895 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field895[var10] = arg0.method2182();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field895[var11] += arg0.method2182() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2125();
            this.field896 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field896[var13] = arg0.method2145();
            }
        }
    }

    @ObfuscatedName("az.u(I)V")
    public void method727() {
        if (this.field904 == -1) {
            if (this.field894 == null) {
                this.field904 = 0;
            } else {
                this.field904 = 2;
            }
        }
        if (this.field905 != -1) {
            return;
        }
        if (this.field894 == null) {
            this.field905 = 0;
        } else {
            this.field905 = 2;
        }
    }

    @ObfuscatedName("az.k(Lcs;II)Lcs;")
    public class98 method728(class98 arg0, int arg1) {
        int var3 = this.field907[arg1];
        class96 var4 = method29(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1985(true);
        } else {
            class98 var6 = arg0.method1985(!var4.method1973(var5));
            var6.method1991(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.m(Lcs;III)Lcs;")
    public class98 method729(class98 arg0, int arg1, int arg2) {
        int var4 = this.field907[arg1];
        class96 var5 = method29(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1985(true);
        }
        class98 var7 = arg0.method1985(!var5.method1973(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1996();
        } else if (var8 == 2) {
            var7.method1995();
        } else if (var8 == 3) {
            var7.method2030();
        }
        var7.method1991(var5, var6);
        if (var8 == 1) {
            var7.method2030();
        } else if (var8 == 2) {
            var7.method1995();
        } else if (var8 == 3) {
            var7.method1996();
        }
        return var7;
    }

    @ObfuscatedName("az.t(Lcs;II)Lcs;")
    public class98 method736(class98 arg0, int arg1) {
        int var3 = this.field907[arg1];
        class96 var4 = method29(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2010(true);
        } else {
            class98 var6 = arg0.method2010(!var4.method1973(var5));
            var6.method1991(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.l(Lcs;ILaz;II)Lcs;")
    public class98 method731(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field907[arg1];
        class96 var6 = method29(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method728(arg0, arg3);
        }
        int var8 = arg2.field907[arg3];
        class96 var9 = method29(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1985(!var6.method1973(var7));
            var11.method1991(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1985(!var6.method1973(var7) & !var9.method1973(var10));
            var12.method1992(var6, var7, var9, var10, this.field894);
            return var12;
        }
    }

    @ObfuscatedName("az.f(Lcs;II)Lcs;")
    public class98 method732(class98 arg0, int arg1) {
        int var3 = this.field907[arg1];
        class96 var4 = method29(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1985(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field895 != null && arg1 < this.field895.length) {
            int var8 = this.field895[arg1];
            var6 = method29(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1985(!var4.method1973(var5));
            var10.method1991(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1985(!var4.method1973(var5) & !var6.method1973(var7));
            var9.method1991(var4, var5);
            var9.method1991(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("u.c(II)Lcp;")
    public static class96 method29(int arg0) {
        class96 var1 = (class96) field906.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class96 var2 = class96.method2702(Statics.field889, Statics.field892, arg0, false);
        if (var2 != null) {
            field906.method3161(var2, (long) arg0);
        }
        return var2;
    }
}
