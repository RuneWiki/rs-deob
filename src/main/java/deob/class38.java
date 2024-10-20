package deob;

@ObfuscatedName("ac")
public class class38 extends class183 {

    @ObfuscatedName("ac.m")
    public static class172 field914 = new class172(64);

    @ObfuscatedName("ac.u")
    public static class172 field899 = new class172(100);

    @ObfuscatedName("ac.j")
    public int[] field900;

    @ObfuscatedName("ac.b")
    public int[] field901;

    @ObfuscatedName("ac.v")
    public int[] field895;

    @ObfuscatedName("ac.y")
    public int[] field903;

    @ObfuscatedName("ac.w")
    public int field902 = -1;

    @ObfuscatedName("ac.x")
    public int[] field905;

    @ObfuscatedName("ac.k")
    public boolean field906 = false;

    @ObfuscatedName("ac.o")
    public int field912 = 5;

    @ObfuscatedName("ac.a")
    public int field898 = -1;

    @ObfuscatedName("ac.f")
    public int field909 = -1;

    @ObfuscatedName("ac.r")
    public int field910 = 99;

    @ObfuscatedName("ac.e")
    public int field911 = -1;

    @ObfuscatedName("ac.t")
    public int field908 = -1;

    @ObfuscatedName("ac.c")
    public int field913 = 2;

    @ObfuscatedName("a.g(Leh;Leh;Leh;I)V")
    public static void method159(class147 arg0, class147 arg1, class147 arg2) {
        Statics.field904 = arg0;
        Statics.field896 = arg1;
        Statics.field897 = arg2;
    }

    @ObfuscatedName("y.s(II)Lac;")
    public static class38 method114(int arg0) {
        class38 var1 = (class38) field914.method3130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field904.method2667(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method705(new class107(var2));
        }
        var3.method707();
        field914.method3126(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.h(Ldi;I)V")
    public void method705(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method706(arg0, var2);
        }
    }

    @ObfuscatedName("ac.m(Ldi;II)V")
    public void method706(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2166();
            this.field895 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field895[var4] = arg0.method2166();
            }
            this.field900 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field900[var5] = arg0.method2166();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field900[var6] += arg0.method2166() << 16;
            }
        } else if (arg1 == 2) {
            this.field902 = arg0.method2166();
        } else if (arg1 == 3) {
            int var7 = arg0.method2101();
            this.field905 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field905[var8] = arg0.method2101();
            }
            this.field905[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field906 = true;
        } else if (arg1 == 5) {
            this.field912 = arg0.method2101();
        } else if (arg1 == 6) {
            this.field898 = arg0.method2166();
        } else if (arg1 == 7) {
            this.field909 = arg0.method2166();
        } else if (arg1 == 8) {
            this.field910 = arg0.method2101();
        } else if (arg1 == 9) {
            this.field911 = arg0.method2101();
        } else if (arg1 == 10) {
            this.field908 = arg0.method2101();
        } else if (arg1 == 11) {
            this.field913 = arg0.method2101();
        } else if (arg1 == 12) {
            int var9 = arg0.method2101();
            this.field901 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field901[var10] = arg0.method2166();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field901[var11] += arg0.method2166() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2101();
            this.field903 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field903[var13] = arg0.method2105();
            }
        }
    }

    @ObfuscatedName("ac.u(I)V")
    public void method707() {
        if (this.field911 == -1) {
            if (this.field905 == null) {
                this.field911 = 0;
            } else {
                this.field911 = 2;
            }
        }
        if (this.field908 != -1) {
            return;
        }
        if (this.field905 == null) {
            this.field908 = 0;
        } else {
            this.field908 = 2;
        }
    }

    @ObfuscatedName("ac.j(Lcl;II)Lcl;")
    public class98 method708(class98 arg0, int arg1) {
        int var3 = this.field900[arg1];
        class96 var4 = method532(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1955(true);
        } else {
            class98 var6 = arg0.method1955(!var4.method1949(var5));
            var6.method1961(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.b(Lcl;IIB)Lcl;")
    public class98 method709(class98 arg0, int arg1, int arg2) {
        int var4 = this.field900[arg1];
        class96 var5 = method532(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1955(true);
        }
        class98 var7 = arg0.method1955(!var5.method1949(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1966();
        } else if (var8 == 2) {
            var7.method1965();
        } else if (var8 == 3) {
            var7.method2010();
        }
        var7.method1961(var5, var6);
        if (var8 == 1) {
            var7.method2010();
        } else if (var8 == 2) {
            var7.method1965();
        } else if (var8 == 3) {
            var7.method1966();
        }
        return var7;
    }

    @ObfuscatedName("ac.v(Lcl;II)Lcl;")
    public class98 method736(class98 arg0, int arg1) {
        int var3 = this.field900[arg1];
        class96 var4 = method532(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1994(true);
        } else {
            class98 var6 = arg0.method1994(!var4.method1949(var5));
            var6.method1961(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.y(Lcl;ILac;IS)Lcl;")
    public class98 method711(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field900[arg1];
        class96 var6 = method532(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method708(arg0, arg3);
        }
        int var8 = arg2.field900[arg3];
        class96 var9 = method532(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1955(!var6.method1949(var7));
            var11.method1961(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1955(!var6.method1949(var7) & !var9.method1949(var10));
            var12.method2011(var6, var7, var9, var10, this.field905);
            return var12;
        }
    }

    @ObfuscatedName("ac.w(Lcl;II)Lcl;")
    public class98 method712(class98 arg0, int arg1) {
        int var3 = this.field900[arg1];
        class96 var4 = method532(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1955(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field901 != null && arg1 < this.field901.length) {
            int var8 = this.field901[arg1];
            var6 = method532(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1955(!var4.method1949(var5));
            var10.method1961(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1955(!var4.method1949(var5) & !var6.method1949(var7));
            var9.method1961(var4, var5);
            var9.method1961(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("q.x(II)Lcu;")
    public static class96 method532(int arg0) {
        class96 var1 = (class96) field899.method3130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class147 var2 = Statics.field896;
        class147 var3 = Statics.field897;
        boolean var4 = true;
        int[] var5 = var2.method2707(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2673(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2673(var8, 0);
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
            field899.method3126(var10, (long) arg0);
        }
        return var10;
    }
}
