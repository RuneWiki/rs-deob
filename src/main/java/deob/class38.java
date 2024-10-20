package deob;

@ObfuscatedName("ac")
public class class38 extends class181 {

    @ObfuscatedName("ac.j")
    public static class171 field902 = new class171(64);

    @ObfuscatedName("ac.o")
    public static class171 field906 = new class171(100);

    @ObfuscatedName("ac.n")
    public int[] field911;

    @ObfuscatedName("ac.y")
    public int[] field905;

    @ObfuscatedName("ac.f")
    public int[] field900;

    @ObfuscatedName("ac.p")
    public int[] field907;

    @ObfuscatedName("ac.l")
    public int field908 = -1;

    @ObfuscatedName("ac.k")
    public int[] field918;

    @ObfuscatedName("ac.q")
    public boolean field903 = false;

    @ObfuscatedName("ac.e")
    public int field919 = 5;

    @ObfuscatedName("ac.t")
    public int field912 = -1;

    @ObfuscatedName("ac.g")
    public int field913 = -1;

    @ObfuscatedName("ac.c")
    public int field914 = 99;

    @ObfuscatedName("ac.m")
    public int field915 = -1;

    @ObfuscatedName("ac.i")
    public int field916 = -1;

    @ObfuscatedName("ac.h")
    public int field917 = 2;

    @ObfuscatedName("ac.u(Ldh;I)V")
    public void method695(class107 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method696(arg0, var2);
        }
    }

    @ObfuscatedName("ac.x(Ldh;II)V")
    public void method696(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2136();
            this.field900 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field900[var4] = arg0.method2136();
            }
            this.field911 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field911[var5] = arg0.method2136();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field911[var6] += arg0.method2136() << 16;
            }
        } else if (arg1 == 2) {
            this.field908 = arg0.method2136();
        } else if (arg1 == 3) {
            int var7 = arg0.method2134();
            this.field918 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field918[var8] = arg0.method2134();
            }
            this.field918[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field903 = true;
        } else if (arg1 == 5) {
            this.field919 = arg0.method2134();
        } else if (arg1 == 6) {
            this.field912 = arg0.method2136();
        } else if (arg1 == 7) {
            this.field913 = arg0.method2136();
        } else if (arg1 == 8) {
            this.field914 = arg0.method2134();
        } else if (arg1 == 9) {
            this.field915 = arg0.method2134();
        } else if (arg1 == 10) {
            this.field916 = arg0.method2134();
        } else if (arg1 == 11) {
            this.field917 = arg0.method2134();
        } else if (arg1 == 12) {
            int var9 = arg0.method2134();
            this.field905 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field905[var10] = arg0.method2136();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field905[var11] += arg0.method2136() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2134();
            this.field907 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field907[var13] = arg0.method2138();
            }
        }
    }

    @ObfuscatedName("ac.j(B)V")
    public void method718() {
        if (this.field915 == -1) {
            if (this.field918 == null) {
                this.field915 = 0;
            } else {
                this.field915 = 2;
            }
        }
        if (this.field916 != -1) {
            return;
        }
        if (this.field918 == null) {
            this.field916 = 0;
        } else {
            this.field916 = 2;
        }
    }

    @ObfuscatedName("ac.o(Lcu;II)Lcu;")
    public class98 method698(class98 arg0, int arg1) {
        int var3 = this.field911[arg1];
        class96 var4 = method691(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2005(true);
        } else {
            class98 var6 = arg0.method2005(!var4.method1977(var5));
            var6.method1992(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.n(Lcu;IIS)Lcu;")
    public class98 method699(class98 arg0, int arg1, int arg2) {
        int var4 = this.field911[arg1];
        class96 var5 = method691(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2005(true);
        }
        class98 var7 = arg0.method2005(!var5.method1977(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1997();
        } else if (var8 == 2) {
            var7.method1996();
        } else if (var8 == 3) {
            var7.method2048();
        }
        var7.method1992(var5, var6);
        if (var8 == 1) {
            var7.method2048();
        } else if (var8 == 2) {
            var7.method1996();
        } else if (var8 == 3) {
            var7.method1997();
        }
        return var7;
    }

    @ObfuscatedName("ac.y(Lcu;II)Lcu;")
    public class98 method697(class98 arg0, int arg1) {
        int var3 = this.field911[arg1];
        class96 var4 = method691(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1987(true);
        } else {
            class98 var6 = arg0.method1987(!var4.method1977(var5));
            var6.method1992(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.f(Lcu;ILac;IB)Lcu;")
    public class98 method701(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field911[arg1];
        class96 var6 = method691(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method698(arg0, arg3);
        }
        int var8 = arg2.field911[arg3];
        class96 var9 = method691(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method2005(!var6.method1977(var7));
            var11.method1992(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method2005(!var6.method1977(var7) & !var9.method1977(var10));
            var12.method1993(var6, var7, var9, var10, this.field918);
            return var12;
        }
    }

    @ObfuscatedName("ac.p(Lcu;II)Lcu;")
    public class98 method700(class98 arg0, int arg1) {
        int var3 = this.field911[arg1];
        class96 var4 = method691(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2005(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field905 != null && arg1 < this.field905.length) {
            int var8 = this.field905[arg1];
            var6 = method691(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method2005(!var4.method1977(var5));
            var10.method1992(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method2005(!var4.method1977(var5) & !var6.method1977(var7));
            var9.method1992(var4, var5);
            var9.method1992(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("aj.l(IB)Lcy;")
    public static class96 method691(int arg0) {
        class96 var1 = (class96) field906.method3114((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class96 var2 = class96.method789(Statics.field922, Statics.field901, arg0, false);
        if (var2 != null) {
            field906.method3116(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("dr.k(I)V")
    public static void method2539() {
        field902.method3117();
        field906.method3117();
    }
}
