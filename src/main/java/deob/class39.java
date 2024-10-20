package deob;

@ObfuscatedName("ad")
public class class39 extends class185 {

    @ObfuscatedName("ad.r")
    public static class174 field900 = new class174(64);

    @ObfuscatedName("ad.f")
    public static class174 field903 = new class174(100);

    @ObfuscatedName("ad.l")
    public int[] field913;

    @ObfuscatedName("ad.b")
    public int[] field916;

    @ObfuscatedName("ad.k")
    public int[] field906;

    @ObfuscatedName("ad.g")
    public int[] field907;

    @ObfuscatedName("ad.v")
    public int field905 = -1;

    @ObfuscatedName("ad.i")
    public int[] field909;

    @ObfuscatedName("ad.x")
    public boolean field910 = false;

    @ObfuscatedName("ad.h")
    public int field902 = 5;

    @ObfuscatedName("ad.w")
    public int field912 = -1;

    @ObfuscatedName("ad.s")
    public int field904 = -1;

    @ObfuscatedName("ad.p")
    public int field914 = 99;

    @ObfuscatedName("ad.z")
    public int field920 = -1;

    @ObfuscatedName("ad.n")
    public int field911 = -1;

    @ObfuscatedName("ad.u")
    public int field917 = 2;

    @ObfuscatedName("l.c(Ler;Ler;Ler;I)V")
    public static void method66(class149 arg0, class149 arg1, class149 arg2) {
        Statics.field915 = arg0;
        Statics.field3009 = arg1;
        Statics.field901 = arg2;
    }

    @ObfuscatedName("i.j(IB)Lad;")
    public static class39 method109(int arg0) {
        class39 var1 = (class39) field900.method3178((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field915.method2746(12, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method715(new class108(var2));
        }
        var3.method694();
        field900.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.y(Ldx;B)V")
    public void method715(class108 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method712(arg0, var2);
        }
    }

    @ObfuscatedName("ad.r(Ldx;IB)V")
    public void method712(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2136();
            this.field906 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field906[var4] = arg0.method2136();
            }
            this.field913 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field913[var5] = arg0.method2136();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field913[var6] += arg0.method2136() << 16;
            }
        } else if (arg1 == 2) {
            this.field905 = arg0.method2136();
        } else if (arg1 == 3) {
            int var7 = arg0.method2134();
            this.field909 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field909[var8] = arg0.method2134();
            }
            this.field909[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field910 = true;
        } else if (arg1 == 5) {
            this.field902 = arg0.method2134();
        } else if (arg1 == 6) {
            this.field912 = arg0.method2136();
        } else if (arg1 == 7) {
            this.field904 = arg0.method2136();
        } else if (arg1 == 8) {
            this.field914 = arg0.method2134();
        } else if (arg1 == 9) {
            this.field920 = arg0.method2134();
        } else if (arg1 == 10) {
            this.field911 = arg0.method2134();
        } else if (arg1 == 11) {
            this.field917 = arg0.method2134();
        } else if (arg1 == 12) {
            int var9 = arg0.method2134();
            this.field916 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field916[var10] = arg0.method2136();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field916[var11] += arg0.method2136() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2134();
            this.field907 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field907[var13] = arg0.method2138();
            }
        }
    }

    @ObfuscatedName("ad.f(I)V")
    public void method694() {
        if (this.field920 == -1) {
            if (this.field909 == null) {
                this.field920 = 0;
            } else {
                this.field920 = 2;
            }
        }
        if (this.field911 != -1) {
            return;
        }
        if (this.field909 == null) {
            this.field911 = 0;
        } else {
            this.field911 = 2;
        }
    }

    @ObfuscatedName("ad.l(Lcl;II)Lcl;")
    public class99 method695(class99 arg0, int arg1) {
        int var3 = this.field913[arg1];
        class97 var4 = method79(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1986(true);
        } else {
            class99 var6 = arg0.method1986(!var4.method1975(var5));
            var6.method1990(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ad.b(Lcl;III)Lcl;")
    public class99 method696(class99 arg0, int arg1, int arg2) {
        int var4 = this.field913[arg1];
        class97 var5 = method79(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1986(true);
        }
        class99 var7 = arg0.method1986(!var5.method1975(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1995();
        } else if (var8 == 2) {
            var7.method1994();
        } else if (var8 == 3) {
            var7.method1993();
        }
        var7.method1990(var5, var6);
        if (var8 == 1) {
            var7.method1993();
        } else if (var8 == 2) {
            var7.method1994();
        } else if (var8 == 3) {
            var7.method1995();
        }
        return var7;
    }

    @ObfuscatedName("ad.k(Lcl;IB)Lcl;")
    public class99 method697(class99 arg0, int arg1) {
        int var3 = this.field913[arg1];
        class97 var4 = method79(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1985(true);
        } else {
            class99 var6 = arg0.method1985(!var4.method1975(var5));
            var6.method1990(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ad.g(Lcl;ILad;IB)Lcl;")
    public class99 method701(class99 arg0, int arg1, class39 arg2, int arg3) {
        int var5 = this.field913[arg1];
        class97 var6 = method79(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method695(arg0, arg3);
        }
        int var8 = arg2.field913[arg3];
        class97 var9 = method79(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class99 var11 = arg0.method1986(!var6.method1975(var7));
            var11.method1990(var6, var7);
            return var11;
        } else {
            class99 var12 = arg0.method1986(!var6.method1975(var7) & !var9.method1975(var10));
            var12.method1991(var6, var7, var9, var10, this.field909);
            return var12;
        }
    }

    @ObfuscatedName("ad.v(Lcl;II)Lcl;")
    public class99 method700(class99 arg0, int arg1) {
        int var3 = this.field913[arg1];
        class97 var4 = method79(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1986(true);
        }
        class97 var6 = null;
        int var7 = 0;
        if (this.field916 != null && arg1 < this.field916.length) {
            int var8 = this.field916[arg1];
            var6 = method79(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class99 var10 = arg0.method1986(!var4.method1975(var5));
            var10.method1990(var4, var5);
            return var10;
        } else {
            class99 var9 = arg0.method1986(!var4.method1975(var5) & !var6.method1975(var7));
            var9.method1990(var4, var5);
            var9.method1990(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("b.i(IB)Lcr;")
    public static class97 method79(int arg0) {
        class97 var1 = (class97) field903.method3178((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class149 var2 = Statics.field3009;
        class149 var3 = Statics.field901;
        boolean var4 = true;
        int[] var5 = var2.method2755(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2752(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2752(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class97 var10;
        if (var4) {
            try {
                var10 = new class97(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field903.method3167(var10, (long) arg0);
        }
        return var10;
    }
}
