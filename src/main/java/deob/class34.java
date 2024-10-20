package deob;

@ObfuscatedName("al")
public class class34 extends class174 {

    @ObfuscatedName("al.d")
    public static class170 field919 = new class170(64);

    @ObfuscatedName("al.b")
    public static class170 field902 = new class170(100);

    @ObfuscatedName("al.i")
    public int[] field903;

    @ObfuscatedName("al.p")
    public int[] field915;

    @ObfuscatedName("al.y")
    public int[] field900;

    @ObfuscatedName("al.u")
    public int[] field906;

    @ObfuscatedName("al.z")
    public int field907 = -1;

    @ObfuscatedName("al.j")
    public int[] field908;

    @ObfuscatedName("al.h")
    public boolean field910 = false;

    @ObfuscatedName("al.x")
    public int field918 = 5;

    @ObfuscatedName("al.q")
    public int field911 = -1;

    @ObfuscatedName("al.w")
    public int field912 = -1;

    @ObfuscatedName("al.k")
    public int field913 = 99;

    @ObfuscatedName("al.o")
    public int field914 = -1;

    @ObfuscatedName("al.f")
    public int field904 = -1;

    @ObfuscatedName("al.r")
    public int field916 = 2;

    @ObfuscatedName("er.t(Lev;Lev;Lev;I)V")
    public static void method2956(class152 arg0, class152 arg1, class152 arg2) {
        Statics.field901 = arg0;
        Statics.field909 = arg1;
        Statics.field2013 = arg2;
    }

    @ObfuscatedName("al.c(Ldo;I)V")
    public void method728(class127 arg0) {
        while (true) {
            int var2 = arg0.method2438();
            if (var2 == 0) {
                return;
            }
            this.method729(arg0, var2);
        }
    }

    @ObfuscatedName("al.d(Ldo;IB)V")
    public void method729(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2440();
            this.field900 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field900[var4] = arg0.method2440();
            }
            this.field903 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field903[var5] = arg0.method2440();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field903[var6] += arg0.method2440() << 16;
            }
        } else if (arg1 == 2) {
            this.field907 = arg0.method2440();
        } else if (arg1 == 3) {
            int var7 = arg0.method2438();
            this.field908 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field908[var8] = arg0.method2438();
            }
            this.field908[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field910 = true;
        } else if (arg1 == 5) {
            this.field918 = arg0.method2438();
        } else if (arg1 == 6) {
            this.field911 = arg0.method2440();
        } else if (arg1 == 7) {
            this.field912 = arg0.method2440();
        } else if (arg1 == 8) {
            this.field913 = arg0.method2438();
        } else if (arg1 == 9) {
            this.field914 = arg0.method2438();
        } else if (arg1 == 10) {
            this.field904 = arg0.method2438();
        } else if (arg1 == 11) {
            this.field916 = arg0.method2438();
        } else if (arg1 == 12) {
            int var9 = arg0.method2438();
            this.field915 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field915[var10] = arg0.method2440();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field915[var11] += arg0.method2440() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2438();
            this.field906 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field906[var13] = arg0.method2442();
            }
        }
    }

    @ObfuscatedName("al.b(I)V")
    public void method730() {
        if (this.field914 == -1) {
            if (this.field908 == null) {
                this.field914 = 0;
            } else {
                this.field914 = 2;
            }
        }
        if (this.field904 != -1) {
            return;
        }
        if (this.field908 == null) {
            this.field904 = 0;
        } else {
            this.field904 = 2;
        }
    }

    @ObfuscatedName("al.i(Ldk;II)Ldk;")
    public class112 method741(class112 arg0, int arg1) {
        int var3 = this.field903[arg1];
        class109 var4 = method145(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2235(true);
        } else {
            class112 var6 = arg0.method2235(!var4.method2211(var5));
            var6.method2241(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("al.p(Ldk;III)Ldk;")
    public class112 method731(class112 arg0, int arg1, int arg2) {
        int var4 = this.field903[arg1];
        class109 var5 = method145(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2235(true);
        }
        class112 var7 = arg0.method2235(!var5.method2211(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2296();
        } else if (var8 == 2) {
            var7.method2245();
        } else if (var8 == 3) {
            var7.method2295();
        }
        var7.method2241(var5, var6);
        if (var8 == 1) {
            var7.method2295();
        } else if (var8 == 2) {
            var7.method2245();
        } else if (var8 == 3) {
            var7.method2296();
        }
        return var7;
    }

    @ObfuscatedName("al.y(Ldk;IB)Ldk;")
    public class112 method727(class112 arg0, int arg1) {
        int var3 = this.field903[arg1];
        class109 var4 = method145(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2236(true);
        } else {
            class112 var6 = arg0.method2236(!var4.method2211(var5));
            var6.method2241(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("al.u(Ldk;ILal;II)Ldk;")
    public class112 method734(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field903[arg1];
        class109 var6 = method145(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method741(arg0, arg3);
        }
        int var8 = arg2.field903[arg3];
        class109 var9 = method145(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2235(!var6.method2211(var7));
            var11.method2241(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2235(!var6.method2211(var7) & !var9.method2211(var10));
            var12.method2242(var6, var7, var9, var10, this.field908);
            return var12;
        }
    }

    @ObfuscatedName("al.z(Ldk;IB)Ldk;")
    public class112 method735(class112 arg0, int arg1) {
        int var3 = this.field903[arg1];
        class109 var4 = method145(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2235(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field915 != null && arg1 < this.field915.length) {
            int var8 = this.field915[arg1];
            var6 = method145(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2235(!var4.method2211(var5));
            var10.method2241(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2235(!var4.method2211(var5) & !var6.method2211(var7));
            var9.method2241(var4, var5);
            var9.method2241(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("q.j(II)Ldw;")
    public static class109 method145(int arg0) {
        class109 var1 = (class109) field902.method3260((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class109 var2 = class109.method588(Statics.field909, Statics.field2013, arg0, false);
        if (var2 != null) {
            field902.method3261(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("bz.h(B)V")
    public static void method1422() {
        field919.method3264();
        field902.method3264();
    }
}
