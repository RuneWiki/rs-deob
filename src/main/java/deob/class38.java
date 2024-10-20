package deob;

@ObfuscatedName("aq")
public class class38 extends class183 {

    @ObfuscatedName("aq.o")
    public static class172 field896 = new class172(64);

    @ObfuscatedName("aq.k")
    public static class172 field895 = new class172(100);

    @ObfuscatedName("aq.m")
    public int[] field898;

    @ObfuscatedName("aq.i")
    public int[] field902;

    @ObfuscatedName("aq.t")
    public int[] field894;

    @ObfuscatedName("aq.l")
    public int[] field893;

    @ObfuscatedName("aq.p")
    public int field914 = -1;

    @ObfuscatedName("aq.r")
    public int[] field903;

    @ObfuscatedName("aq.j")
    public boolean field904 = false;

    @ObfuscatedName("aq.c")
    public int field905 = 5;

    @ObfuscatedName("aq.q")
    public int field906 = -1;

    @ObfuscatedName("aq.n")
    public int field907 = -1;

    @ObfuscatedName("aq.h")
    public int field908 = 99;

    @ObfuscatedName("aq.d")
    public int field909 = -1;

    @ObfuscatedName("aq.b")
    public int field910 = -1;

    @ObfuscatedName("aq.w")
    public int field911 = 2;

    @ObfuscatedName("cq.g(IS)Laq;")
    public static class38 method1935(int arg0) {
        class38 var1 = (class38) field896.method3112((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field897.method2703(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method700(new class107(var2));
        }
        var3.method702();
        field896.method3115(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.s(Lde;I)V")
    public void method700(class107 arg0) {
        while (true) {
            int var2 = arg0.method2116();
            if (var2 == 0) {
                return;
            }
            this.method701(arg0, var2);
        }
    }

    @ObfuscatedName("aq.v(Lde;II)V")
    public void method701(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2094();
            this.field894 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field894[var4] = arg0.method2094();
            }
            this.field898 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field898[var5] = arg0.method2094();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field898[var6] += arg0.method2094() << 16;
            }
        } else if (arg1 == 2) {
            this.field914 = arg0.method2094();
        } else if (arg1 == 3) {
            int var7 = arg0.method2116();
            this.field903 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field903[var8] = arg0.method2116();
            }
            this.field903[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field904 = true;
        } else if (arg1 == 5) {
            this.field905 = arg0.method2116();
        } else if (arg1 == 6) {
            this.field906 = arg0.method2094();
        } else if (arg1 == 7) {
            this.field907 = arg0.method2094();
        } else if (arg1 == 8) {
            this.field908 = arg0.method2116();
        } else if (arg1 == 9) {
            this.field909 = arg0.method2116();
        } else if (arg1 == 10) {
            this.field910 = arg0.method2116();
        } else if (arg1 == 11) {
            this.field911 = arg0.method2116();
        } else if (arg1 == 12) {
            int var9 = arg0.method2116();
            this.field902 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field902[var10] = arg0.method2094();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field902[var11] += arg0.method2094() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2116();
            this.field893 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field893[var13] = arg0.method2096();
            }
        }
    }

    @ObfuscatedName("aq.o(I)V")
    public void method702() {
        if (this.field909 == -1) {
            if (this.field903 == null) {
                this.field909 = 0;
            } else {
                this.field909 = 2;
            }
        }
        if (this.field910 != -1) {
            return;
        }
        if (this.field903 == null) {
            this.field910 = 0;
        } else {
            this.field910 = 2;
        }
    }

    @ObfuscatedName("aq.k(Lcg;II)Lcg;")
    public class98 method730(class98 arg0, int arg1) {
        int var3 = this.field898[arg1];
        class96 var4 = method474(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1947(true);
        } else {
            class98 var6 = arg0.method1947(!var4.method1939(var5));
            var6.method1953(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aq.m(Lcg;III)Lcg;")
    public class98 method704(class98 arg0, int arg1, int arg2) {
        int var4 = this.field898[arg1];
        class96 var5 = method474(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1947(true);
        }
        class98 var7 = arg0.method1947(!var5.method1939(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1958();
        } else if (var8 == 2) {
            var7.method1957();
        } else if (var8 == 3) {
            var7.method2018();
        }
        var7.method1953(var5, var6);
        if (var8 == 1) {
            var7.method2018();
        } else if (var8 == 2) {
            var7.method1957();
        } else if (var8 == 3) {
            var7.method1958();
        }
        return var7;
    }

    @ObfuscatedName("aq.i(Lcg;IB)Lcg;")
    public class98 method722(class98 arg0, int arg1) {
        int var3 = this.field898[arg1];
        class96 var4 = method474(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1973(true);
        } else {
            class98 var6 = arg0.method1973(!var4.method1939(var5));
            var6.method1953(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aq.t(Lcg;ILaq;IS)Lcg;")
    public class98 method706(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field898[arg1];
        class96 var6 = method474(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method730(arg0, arg3);
        }
        int var8 = arg2.field898[arg3];
        class96 var9 = method474(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1947(!var6.method1939(var7));
            var11.method1953(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1947(!var6.method1939(var7) & !var9.method1939(var10));
            var12.method2006(var6, var7, var9, var10, this.field903);
            return var12;
        }
    }

    @ObfuscatedName("aq.l(Lcg;IS)Lcg;")
    public class98 method707(class98 arg0, int arg1) {
        int var3 = this.field898[arg1];
        class96 var4 = method474(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1947(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field902 != null && arg1 < this.field902.length) {
            int var8 = this.field902[arg1];
            var6 = method474(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1947(!var4.method1939(var5));
            var10.method1953(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1947(!var4.method1939(var5) & !var6.method1939(var7));
            var9.method1953(var4, var5);
            var9.method1953(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("z.p(II)Lca;")
    public static class96 method474(int arg0) {
        class96 var1 = (class96) field895.method3112((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class96 var2 = class96.method513(Statics.field901, Statics.field900, arg0, false);
        if (var2 != null) {
            field895.method3115(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("cu.r(I)V")
    public static void method1818() {
        field896.method3116();
        field895.method3116();
    }
}
