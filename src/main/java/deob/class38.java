package deob;

@ObfuscatedName("aq")
public class class38 extends class181 {

    @ObfuscatedName("aq.h")
    public static class171 field903 = new class171(64);

    @ObfuscatedName("aq.r")
    public static class171 field904 = new class171(100);

    @ObfuscatedName("aq.e")
    public int[] field908;

    @ObfuscatedName("aq.k")
    public int[] field906;

    @ObfuscatedName("aq.b")
    public int[] field907;

    @ObfuscatedName("aq.n")
    public int[] field902;

    @ObfuscatedName("aq.a")
    public int field909 = -1;

    @ObfuscatedName("aq.q")
    public int[] field920;

    @ObfuscatedName("aq.i")
    public boolean field911 = false;

    @ObfuscatedName("aq.f")
    public int field912 = 5;

    @ObfuscatedName("aq.o")
    public int field910 = -1;

    @ObfuscatedName("aq.t")
    public int field914 = -1;

    @ObfuscatedName("aq.c")
    public int field915 = 99;

    @ObfuscatedName("aq.d")
    public int field913 = -1;

    @ObfuscatedName("aq.g")
    public int field917 = -1;

    @ObfuscatedName("aq.s")
    public int field918 = 2;

    @ObfuscatedName("r.j(II)Laq;")
    public static class38 method38(int arg0) {
        class38 var1 = (class38) field903.method3171((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field921.method2739(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method684(new class107(var2));
        }
        var3.method685();
        field903.method3173(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.z(Lde;B)V")
    public void method684(class107 arg0) {
        while (true) {
            int var2 = arg0.method2130();
            if (var2 == 0) {
                return;
            }
            this.method712(arg0, var2);
        }
    }

    @ObfuscatedName("aq.y(Lde;II)V")
    public void method712(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2132();
            this.field907 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field907[var4] = arg0.method2132();
            }
            this.field908 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field908[var5] = arg0.method2132();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field908[var6] += arg0.method2132() << 16;
            }
        } else if (arg1 == 2) {
            this.field909 = arg0.method2132();
        } else if (arg1 == 3) {
            int var7 = arg0.method2130();
            this.field920 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field920[var8] = arg0.method2130();
            }
            this.field920[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field911 = true;
        } else if (arg1 == 5) {
            this.field912 = arg0.method2130();
        } else if (arg1 == 6) {
            this.field910 = arg0.method2132();
        } else if (arg1 == 7) {
            this.field914 = arg0.method2132();
        } else if (arg1 == 8) {
            this.field915 = arg0.method2130();
        } else if (arg1 == 9) {
            this.field913 = arg0.method2130();
        } else if (arg1 == 10) {
            this.field917 = arg0.method2130();
        } else if (arg1 == 11) {
            this.field918 = arg0.method2130();
        } else if (arg1 == 12) {
            int var9 = arg0.method2130();
            this.field906 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field906[var10] = arg0.method2132();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field906[var11] += arg0.method2132() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2130();
            this.field902 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field902[var13] = arg0.method2252();
            }
        }
    }

    @ObfuscatedName("aq.h(B)V")
    public void method685() {
        if (this.field913 == -1) {
            if (this.field920 == null) {
                this.field913 = 0;
            } else {
                this.field913 = 2;
            }
        }
        if (this.field917 != -1) {
            return;
        }
        if (this.field920 == null) {
            this.field917 = 0;
        } else {
            this.field917 = 2;
        }
    }

    @ObfuscatedName("aq.r(Lcl;II)Lcl;")
    public class98 method686(class98 arg0, int arg1) {
        int var3 = this.field908[arg1];
        class96 var4 = Statics.method2851(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1985(true);
        } else {
            class98 var6 = arg0.method1985(!var4.method1974(var5));
            var6.method1990(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aq.e(Lcl;IIB)Lcl;")
    public class98 method687(class98 arg0, int arg1, int arg2) {
        int var4 = this.field908[arg1];
        class96 var5 = Statics.method2851(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1985(true);
        }
        class98 var7 = arg0.method1985(!var5.method1974(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1995();
        } else if (var8 == 2) {
            var7.method2019();
        } else if (var8 == 3) {
            var7.method1993();
        }
        var7.method1990(var5, var6);
        if (var8 == 1) {
            var7.method1993();
        } else if (var8 == 2) {
            var7.method2019();
        } else if (var8 == 3) {
            var7.method1995();
        }
        return var7;
    }

    @ObfuscatedName("aq.k(Lcl;IB)Lcl;")
    public class98 method705(class98 arg0, int arg1) {
        int var3 = this.field908[arg1];
        class96 var4 = Statics.method2851(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1986(true);
        } else {
            class98 var6 = arg0.method1986(!var4.method1974(var5));
            var6.method1990(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aq.b(Lcl;ILaq;II)Lcl;")
    public class98 method689(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field908[arg1];
        class96 var6 = Statics.method2851(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method686(arg0, arg3);
        }
        int var8 = arg2.field908[arg3];
        class96 var9 = Statics.method2851(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1985(!var6.method1974(var7));
            var11.method1990(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1985(!var6.method1974(var7) & !var9.method1974(var10));
            var12.method2008(var6, var7, var9, var10, this.field920);
            return var12;
        }
    }

    @ObfuscatedName("aq.n(Lcl;II)Lcl;")
    public class98 method690(class98 arg0, int arg1) {
        int var3 = this.field908[arg1];
        class96 var4 = Statics.method2851(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1985(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field906 != null && arg1 < this.field906.length) {
            int var8 = this.field906[arg1];
            var6 = Statics.method2851(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1985(!var4.method1974(var5));
            var10.method1990(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1985(!var4.method1974(var5) & !var6.method1974(var7));
            var9.method1990(var4, var5);
            var9.method1990(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("l.q(B)V")
    public static void method477() {
        field903.method3170();
        field904.method3170();
    }
}
