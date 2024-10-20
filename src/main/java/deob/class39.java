package deob;

@ObfuscatedName("aw")
public class class39 extends class187 {

    @ObfuscatedName("aw.k")
    public static class176 field901 = new class176(64);

    @ObfuscatedName("aw.h")
    public static class176 field903 = new class176(100);

    @ObfuscatedName("aw.p")
    public int[] field904;

    @ObfuscatedName("aw.n")
    public int[] field900;

    @ObfuscatedName("aw.o")
    public int[] field906;

    @ObfuscatedName("aw.g")
    public int[] field922;

    @ObfuscatedName("aw.z")
    public int field908 = -1;

    @ObfuscatedName("aw.t")
    public int[] field909;

    @ObfuscatedName("aw.y")
    public boolean field910 = false;

    @ObfuscatedName("aw.w")
    public int field911 = 5;

    @ObfuscatedName("aw.x")
    public int field912 = -1;

    @ObfuscatedName("aw.v")
    public int field905 = -1;

    @ObfuscatedName("aw.q")
    public int field921 = 99;

    @ObfuscatedName("aw.f")
    public int field915 = -1;

    @ObfuscatedName("aw.s")
    public int field916 = -1;

    @ObfuscatedName("aw.a")
    public int field917 = 2;

    @ObfuscatedName("v.b(Lex;Lex;Lex;I)V")
    public static void method151(class151 arg0, class151 arg1, class151 arg2) {
        Statics.field907 = arg0;
        Statics.field914 = arg1;
        Statics.field1921 = arg2;
    }

    @ObfuscatedName("cv.e(II)Law;")
    public static class39 method1863(int arg0) {
        class39 var1 = (class39) field901.method3218((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field907.method2761(12, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method717(new class110(var2));
        }
        var3.method719();
        field901.method3220(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.i(Ldc;I)V")
    public void method717(class110 arg0) {
        while (true) {
            int var2 = arg0.method2142();
            if (var2 == 0) {
                return;
            }
            this.method718(arg0, var2);
        }
    }

    @ObfuscatedName("aw.k(Ldc;II)V")
    public void method718(class110 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2292();
            this.field906 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field906[var4] = arg0.method2292();
            }
            this.field904 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field904[var5] = arg0.method2292();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field904[var6] += arg0.method2292() << 16;
            }
        } else if (arg1 == 2) {
            this.field908 = arg0.method2292();
        } else if (arg1 == 3) {
            int var7 = arg0.method2142();
            this.field909 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field909[var8] = arg0.method2142();
            }
            this.field909[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field910 = true;
        } else if (arg1 == 5) {
            this.field911 = arg0.method2142();
        } else if (arg1 == 6) {
            this.field912 = arg0.method2292();
        } else if (arg1 == 7) {
            this.field905 = arg0.method2292();
        } else if (arg1 == 8) {
            this.field921 = arg0.method2142();
        } else if (arg1 == 9) {
            this.field915 = arg0.method2142();
        } else if (arg1 == 10) {
            this.field916 = arg0.method2142();
        } else if (arg1 == 11) {
            this.field917 = arg0.method2142();
        } else if (arg1 == 12) {
            int var9 = arg0.method2142();
            this.field900 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field900[var10] = arg0.method2292();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field900[var11] += arg0.method2292() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2142();
            this.field922 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field922[var13] = arg0.method2146();
            }
        }
    }

    @ObfuscatedName("aw.h(I)V")
    public void method719() {
        if (this.field915 == -1) {
            if (this.field909 == null) {
                this.field915 = 0;
            } else {
                this.field915 = 2;
            }
        }
        if (this.field916 != -1) {
            return;
        }
        if (this.field909 == null) {
            this.field916 = 0;
        } else {
            this.field916 = 2;
        }
    }

    @ObfuscatedName("aw.p(Lcr;II)Lcr;")
    public class99 method720(class99 arg0, int arg1) {
        int var3 = this.field904[arg1];
        class97 var4 = method2602(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2008(true);
        } else {
            class99 var6 = arg0.method2008(!var4.method1959(var5));
            var6.method1978(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aw.n(Lcr;IIB)Lcr;")
    public class99 method721(class99 arg0, int arg1, int arg2) {
        int var4 = this.field904[arg1];
        class97 var5 = method2602(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2008(true);
        }
        class99 var7 = arg0.method2008(!var5.method1959(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1984();
        } else if (var8 == 2) {
            var7.method1983();
        } else if (var8 == 3) {
            var7.method1982();
        }
        var7.method1978(var5, var6);
        if (var8 == 1) {
            var7.method1982();
        } else if (var8 == 2) {
            var7.method1983();
        } else if (var8 == 3) {
            var7.method1984();
        }
        return var7;
    }

    @ObfuscatedName("aw.o(Lcr;IB)Lcr;")
    public class99 method735(class99 arg0, int arg1) {
        int var3 = this.field904[arg1];
        class97 var4 = method2602(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1974(true);
        } else {
            class99 var6 = arg0.method1974(!var4.method1959(var5));
            var6.method1978(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aw.g(Lcr;ILaw;II)Lcr;")
    public class99 method722(class99 arg0, int arg1, class39 arg2, int arg3) {
        int var5 = this.field904[arg1];
        class97 var6 = method2602(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method720(arg0, arg3);
        }
        int var8 = arg2.field904[arg3];
        class97 var9 = method2602(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class99 var11 = arg0.method2008(!var6.method1959(var7));
            var11.method1978(var6, var7);
            return var11;
        } else {
            class99 var12 = arg0.method2008(!var6.method1959(var7) & !var9.method1959(var10));
            var12.method1971(var6, var7, var9, var10, this.field909);
            return var12;
        }
    }

    @ObfuscatedName("aw.z(Lcr;II)Lcr;")
    public class99 method723(class99 arg0, int arg1) {
        int var3 = this.field904[arg1];
        class97 var4 = method2602(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2008(true);
        }
        class97 var6 = null;
        int var7 = 0;
        if (this.field900 != null && arg1 < this.field900.length) {
            int var8 = this.field900[arg1];
            var6 = method2602(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class99 var10 = arg0.method2008(!var4.method1959(var5));
            var10.method1978(var4, var5);
            return var10;
        } else {
            class99 var9 = arg0.method2008(!var4.method1959(var5) & !var6.method1959(var7));
            var9.method1978(var4, var5);
            var9.method1978(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("er.t(II)Lca;")
    public static class97 method2602(int arg0) {
        class97 var1 = (class97) field903.method3218((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class97 var2 = class97.method1596(Statics.field914, Statics.field1921, arg0, false);
        if (var2 != null) {
            field903.method3220(var2, (long) arg0);
        }
        return var2;
    }
}
