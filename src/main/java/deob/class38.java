package deob;

@ObfuscatedName("as")
public class class38 extends class183 {

    @ObfuscatedName("as.i")
    public static class172 field902 = new class172(64);

    @ObfuscatedName("as.d")
    public static class172 field903 = new class172(100);

    @ObfuscatedName("as.q")
    public int[] field916;

    @ObfuscatedName("as.m")
    public int[] field905;

    @ObfuscatedName("as.a")
    public int[] field906;

    @ObfuscatedName("as.w")
    public int[] field907;

    @ObfuscatedName("as.e")
    public int field908 = -1;

    @ObfuscatedName("as.o")
    public int[] field909;

    @ObfuscatedName("as.v")
    public boolean field904 = false;

    @ObfuscatedName("as.z")
    public int field911 = 5;

    @ObfuscatedName("as.j")
    public int field922 = -1;

    @ObfuscatedName("as.r")
    public int field913 = -1;

    @ObfuscatedName("as.c")
    public int field914 = 99;

    @ObfuscatedName("as.u")
    public int field915 = -1;

    @ObfuscatedName("as.h")
    public int field901 = -1;

    @ObfuscatedName("as.t")
    public int field899 = 2;

    @ObfuscatedName("af.n(II)Las;")
    public static class38 method658(int arg0) {
        class38 var1 = (class38) field902.method3115((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field918.method2738(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method712(new class107(var2));
        }
        var3.method720();
        field902.method3117(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.x(Ldw;I)V")
    public void method712(class107 arg0) {
        while (true) {
            int var2 = arg0.method2148();
            if (var2 == 0) {
                return;
            }
            this.method713(arg0, var2);
        }
    }

    @ObfuscatedName("as.k(Ldw;II)V")
    public void method713(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2140();
            this.field906 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field906[var4] = arg0.method2140();
            }
            this.field916 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field916[var5] = arg0.method2140();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field916[var6] += arg0.method2140() << 16;
            }
        } else if (arg1 == 2) {
            this.field908 = arg0.method2140();
        } else if (arg1 == 3) {
            int var7 = arg0.method2148();
            this.field909 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field909[var8] = arg0.method2148();
            }
            this.field909[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field904 = true;
        } else if (arg1 == 5) {
            this.field911 = arg0.method2148();
        } else if (arg1 == 6) {
            this.field922 = arg0.method2140();
        } else if (arg1 == 7) {
            this.field913 = arg0.method2140();
        } else if (arg1 == 8) {
            this.field914 = arg0.method2148();
        } else if (arg1 == 9) {
            this.field915 = arg0.method2148();
        } else if (arg1 == 10) {
            this.field901 = arg0.method2148();
        } else if (arg1 == 11) {
            this.field899 = arg0.method2148();
        } else if (arg1 == 12) {
            int var9 = arg0.method2148();
            this.field905 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field905[var10] = arg0.method2140();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field905[var11] += arg0.method2140() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2148();
            this.field907 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field907[var13] = arg0.method2142();
            }
        }
    }

    @ObfuscatedName("as.i(I)V")
    public void method720() {
        if (this.field915 == -1) {
            if (this.field909 == null) {
                this.field915 = 0;
            } else {
                this.field915 = 2;
            }
        }
        if (this.field901 != -1) {
            return;
        }
        if (this.field909 == null) {
            this.field901 = 0;
        } else {
            this.field901 = 2;
        }
    }

    @ObfuscatedName("as.d(Lcy;II)Lcy;")
    public class98 method714(class98 arg0, int arg1) {
        int var3 = this.field916[arg1];
        class96 var4 = method130(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1988(true);
        } else {
            class98 var6 = arg0.method1988(!var4.method1976(var5));
            var6.method1993(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("as.q(Lcy;III)Lcy;")
    public class98 method715(class98 arg0, int arg1, int arg2) {
        int var4 = this.field916[arg1];
        class96 var5 = method130(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1988(true);
        }
        class98 var7 = arg0.method1988(!var5.method1976(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2012();
        } else if (var8 == 2) {
            var7.method2022();
        } else if (var8 == 3) {
            var7.method1996();
        }
        var7.method1993(var5, var6);
        if (var8 == 1) {
            var7.method1996();
        } else if (var8 == 2) {
            var7.method2022();
        } else if (var8 == 3) {
            var7.method2012();
        }
        return var7;
    }

    @ObfuscatedName("as.m(Lcy;II)Lcy;")
    public class98 method716(class98 arg0, int arg1) {
        int var3 = this.field916[arg1];
        class96 var4 = method130(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2018(true);
        } else {
            class98 var6 = arg0.method2018(!var4.method1976(var5));
            var6.method1993(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("as.a(Lcy;ILas;II)Lcy;")
    public class98 method717(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field916[arg1];
        class96 var6 = method130(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method714(arg0, arg3);
        }
        int var8 = arg2.field916[arg3];
        class96 var9 = method130(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1988(!var6.method1976(var7));
            var11.method1993(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1988(!var6.method1976(var7) & !var9.method1976(var10));
            var12.method2050(var6, var7, var9, var10, this.field909);
            return var12;
        }
    }

    @ObfuscatedName("as.w(Lcy;IB)Lcy;")
    public class98 method718(class98 arg0, int arg1) {
        int var3 = this.field916[arg1];
        class96 var4 = method130(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1988(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field905 != null && arg1 < this.field905.length) {
            int var8 = this.field905[arg1];
            var6 = method130(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1988(!var4.method1976(var5));
            var10.method1993(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1988(!var4.method1976(var5) & !var6.method1976(var7));
            var9.method1993(var4, var5);
            var9.method1993(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("e.e(IB)Lci;")
    public static class96 method130(int arg0) {
        class96 var1 = (class96) field903.method3115((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class147 var2 = Statics.field917;
        class147 var3 = Statics.field910;
        boolean var4 = true;
        int[] var5 = var2.method2739(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2680(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2680(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class96 var10;
        if (var4) {
            try {
                var10 = new class96(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field903.method3117(var10, (long) arg0);
        }
        return var10;
    }
}
