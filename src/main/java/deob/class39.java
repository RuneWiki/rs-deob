package deob;

@ObfuscatedName("ax")
public class class39 extends class187 {

    @ObfuscatedName("ax.j")
    public static class176 field907 = new class176(64);

    @ObfuscatedName("ax.l")
    public static class176 field920 = new class176(100);

    @ObfuscatedName("ax.g")
    public int[] field908;

    @ObfuscatedName("ax.k")
    public int[] field918;

    @ObfuscatedName("ax.p")
    public int[] field911;

    @ObfuscatedName("ax.y")
    public int[] field915;

    @ObfuscatedName("ax.m")
    public int field913 = -1;

    @ObfuscatedName("ax.o")
    public int[] field914;

    @ObfuscatedName("ax.c")
    public boolean field909 = false;

    @ObfuscatedName("ax.r")
    public int field916 = 5;

    @ObfuscatedName("ax.s")
    public int field906 = -1;

    @ObfuscatedName("ax.n")
    public int field924 = -1;

    @ObfuscatedName("ax.q")
    public int field919 = 99;

    @ObfuscatedName("ax.e")
    public int field917 = -1;

    @ObfuscatedName("ax.d")
    public int field912 = -1;

    @ObfuscatedName("ax.b")
    public int field922 = 2;

    @ObfuscatedName("fh.v(Lem;Lem;Lem;I)V")
    public static void method2966(class151 arg0, class151 arg1, class151 arg2) {
        Statics.field910 = arg0;
        Statics.field2689 = arg1;
        Statics.field921 = arg2;
    }

    @ObfuscatedName("ap.t(II)Lax;")
    public static class39 method682(int arg0) {
        class39 var1 = (class39) field907.method3231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field910.method2852(12, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method734(new class110(var2));
        }
        var3.method718();
        field907.method3228(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.f(Ldp;I)V")
    public void method734(class110 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method717(arg0, var2);
        }
    }

    @ObfuscatedName("ax.j(Ldp;II)V")
    public void method717(class110 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2194();
            this.field911 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field911[var4] = arg0.method2194();
            }
            this.field908 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field908[var5] = arg0.method2194();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field908[var6] += arg0.method2194() << 16;
            }
        } else if (arg1 == 2) {
            this.field913 = arg0.method2194();
        } else if (arg1 == 3) {
            int var7 = arg0.method2257();
            this.field914 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field914[var8] = arg0.method2257();
            }
            this.field914[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field909 = true;
        } else if (arg1 == 5) {
            this.field916 = arg0.method2257();
        } else if (arg1 == 6) {
            this.field906 = arg0.method2194();
        } else if (arg1 == 7) {
            this.field924 = arg0.method2194();
        } else if (arg1 == 8) {
            this.field919 = arg0.method2257();
        } else if (arg1 == 9) {
            this.field917 = arg0.method2257();
        } else if (arg1 == 10) {
            this.field912 = arg0.method2257();
        } else if (arg1 == 11) {
            this.field922 = arg0.method2257();
        } else if (arg1 == 12) {
            int var9 = arg0.method2257();
            this.field918 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field918[var10] = arg0.method2194();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field918[var11] += arg0.method2194() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2257();
            this.field915 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field915[var13] = arg0.method2267();
            }
        }
    }

    @ObfuscatedName("ax.l(I)V")
    public void method718() {
        if (this.field917 == -1) {
            if (this.field914 == null) {
                this.field917 = 0;
            } else {
                this.field917 = 2;
            }
        }
        if (this.field912 != -1) {
            return;
        }
        if (this.field914 == null) {
            this.field912 = 0;
        } else {
            this.field912 = 2;
        }
    }

    @ObfuscatedName("ax.g(Lcy;IB)Lcy;")
    public class99 method719(class99 arg0, int arg1) {
        int var3 = this.field908[arg1];
        class97 var4 = method65(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2004(true);
        } else {
            class99 var6 = arg0.method2004(!var4.method1990(var5));
            var6.method2008(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ax.k(Lcy;IIB)Lcy;")
    public class99 method749(class99 arg0, int arg1, int arg2) {
        int var4 = this.field908[arg1];
        class97 var5 = method65(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2004(true);
        }
        class99 var7 = arg0.method2004(!var5.method1990(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2012();
        } else if (var8 == 2) {
            var7.method2057();
        } else if (var8 == 3) {
            var7.method2018();
        }
        var7.method2008(var5, var6);
        if (var8 == 1) {
            var7.method2018();
        } else if (var8 == 2) {
            var7.method2057();
        } else if (var8 == 3) {
            var7.method2012();
        }
        return var7;
    }

    @ObfuscatedName("ax.p(Lcy;II)Lcy;")
    public class99 method721(class99 arg0, int arg1) {
        int var3 = this.field908[arg1];
        class97 var4 = method65(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2005(true);
        } else {
            class99 var6 = arg0.method2005(!var4.method1990(var5));
            var6.method2008(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ax.y(Lcy;ILax;IB)Lcy;")
    public class99 method722(class99 arg0, int arg1, class39 arg2, int arg3) {
        int var5 = this.field908[arg1];
        class97 var6 = method65(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method719(arg0, arg3);
        }
        int var8 = arg2.field908[arg3];
        class97 var9 = method65(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class99 var11 = arg0.method2004(!var6.method1990(var7));
            var11.method2008(var6, var7);
            return var11;
        } else {
            class99 var12 = arg0.method2004(!var6.method1990(var7) & !var9.method1990(var10));
            var12.method2029(var6, var7, var9, var10, this.field914);
            return var12;
        }
    }

    @ObfuscatedName("ax.m(Lcy;II)Lcy;")
    public class99 method723(class99 arg0, int arg1) {
        int var3 = this.field908[arg1];
        class97 var4 = method65(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2004(true);
        }
        class97 var6 = null;
        int var7 = 0;
        if (this.field918 != null && arg1 < this.field918.length) {
            int var8 = this.field918[arg1];
            var6 = method65(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class99 var10 = arg0.method2004(!var4.method1990(var5));
            var10.method2008(var4, var5);
            return var10;
        } else {
            class99 var9 = arg0.method2004(!var4.method1990(var5) & !var6.method1990(var7));
            var9.method2008(var4, var5);
            var9.method2008(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("g.o(II)Lca;")
    public static class97 method65(int arg0) {
        class97 var1 = (class97) field920.method3231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class97 var2 = class97.method597(Statics.field2689, Statics.field921, arg0, false);
        if (var2 != null) {
            field920.method3228(var2, (long) arg0);
        }
        return var2;
    }
}
