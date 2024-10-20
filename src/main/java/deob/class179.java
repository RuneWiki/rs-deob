package deob;

@ObfuscatedName("ft")
public class class179 extends class404 {

    @ObfuscatedName("ft.i")
    public static class257 field1895 = new class257(64);

    @ObfuscatedName("ft.f")
    public static class257 field1896 = new class257(50);

    @ObfuscatedName("ft.b")
    public int field1909;

    @ObfuscatedName("ft.n")
    public String field1893 = class309.field3599;

    @ObfuscatedName("ft.s")
    public int field1905 = 1;

    @ObfuscatedName("ft.l")
    public int[] field1894;

    @ObfuscatedName("ft.q")
    public int[] field1901;

    @ObfuscatedName("ft.o")
    public int field1902 = -1;

    @ObfuscatedName("ft.r")
    public int field1903 = -1;

    @ObfuscatedName("ft.p")
    public int field1904 = -1;

    @ObfuscatedName("ft.w")
    public int field1906 = -1;

    @ObfuscatedName("ft.k")
    public int field1910 = -1;

    @ObfuscatedName("ft.d")
    public int field1907 = -1;

    @ObfuscatedName("ft.m")
    public int field1897 = -1;

    @ObfuscatedName("ft.u")
    public short[] field1924;

    @ObfuscatedName("ft.t")
    public short[] field1899;

    @ObfuscatedName("ft.g")
    public short[] field1911;

    @ObfuscatedName("ft.x")
    public short[] field1912;

    @ObfuscatedName("ft.a")
    public String[] field1913 = new String[5];

    @ObfuscatedName("ft.y")
    public boolean field1930 = true;

    @ObfuscatedName("ft.j")
    public int field1915 = -1;

    @ObfuscatedName("ft.e")
    public int field1916 = 128;

    @ObfuscatedName("ft.z")
    public int field1917 = 128;

    @ObfuscatedName("ft.h")
    public boolean field1918 = false;

    @ObfuscatedName("ft.ae")
    public int field1919 = 0;

    @ObfuscatedName("ft.aq")
    public int field1920 = 0;

    @ObfuscatedName("ft.aw")
    public int field1914 = -1;

    @ObfuscatedName("ft.am")
    public int field1922 = 32;

    @ObfuscatedName("ft.ak")
    public int[] field1921;

    @ObfuscatedName("ft.ao")
    public int field1898 = -1;

    @ObfuscatedName("ft.aj")
    public int field1925 = -1;

    @ObfuscatedName("ft.al")
    public boolean field1908 = true;

    @ObfuscatedName("ft.av")
    public boolean field1927 = true;

    @ObfuscatedName("ft.at")
    public boolean field1928 = false;

    @ObfuscatedName("ft.an")
    public class418 field1929;

    @ObfuscatedName("fq.v(Lln;Lln;I)V")
    public static void method3121(class316 arg0, class316 arg1) {
        Statics.field1900 = arg0;
        Statics.field1926 = arg1;
    }

    @ObfuscatedName("e.c(IB)Lft;")
    public static class179 method344(int arg0) {
        class179 var1 = (class179) field1895.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1900.method5296(9, arg0);
        class179 var3 = new class179();
        var3.field1909 = arg0;
        if (var2 != null) {
            var3.method3164(new class438(var2));
        }
        var3.method3170();
        field1895.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ft.i(B)V")
    public void method3170() {
    }

    @ObfuscatedName("ft.f(Lpi;B)V")
    public void method3164(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3166(arg0, var2);
        }
    }

    @ObfuscatedName("ft.b(Lpi;II)V")
    public void method3166(class438 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6971();
            this.field1894 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1894[var4] = arg0.method7148();
            }
        } else if (arg1 == 2) {
            this.field1893 = arg0.method6981();
        } else if (arg1 == 12) {
            this.field1905 = arg0.method6971();
        } else if (arg1 == 13) {
            this.field1902 = arg0.method7148();
        } else if (arg1 == 14) {
            this.field1906 = arg0.method7148();
        } else if (arg1 == 15) {
            this.field1903 = arg0.method7148();
        } else if (arg1 == 16) {
            this.field1904 = arg0.method7148();
        } else if (arg1 == 17) {
            this.field1906 = arg0.method7148();
            this.field1910 = arg0.method7148();
            this.field1907 = arg0.method7148();
            this.field1897 = arg0.method7148();
        } else if (arg1 == 18) {
            arg0.method7148();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1913[arg1 - 30] = arg0.method6981();
            if (this.field1913[arg1 - 30].equalsIgnoreCase(class309.field3594)) {
                this.field1913[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method6971();
            this.field1924 = new short[var5];
            this.field1899 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1924[var6] = (short) arg0.method7148();
                this.field1899[var6] = (short) arg0.method7148();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6971();
            this.field1911 = new short[var7];
            this.field1912 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1911[var8] = (short) arg0.method7148();
                this.field1912[var8] = (short) arg0.method7148();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method6971();
            this.field1901 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1901[var10] = arg0.method7148();
            }
        } else if (arg1 == 93) {
            this.field1930 = false;
        } else if (arg1 == 95) {
            this.field1915 = arg0.method7148();
        } else if (arg1 == 97) {
            this.field1916 = arg0.method7148();
        } else if (arg1 == 98) {
            this.field1917 = arg0.method7148();
        } else if (arg1 == 99) {
            this.field1918 = true;
        } else if (arg1 == 100) {
            this.field1919 = arg0.method7093();
        } else if (arg1 == 101) {
            this.field1920 = arg0.method7093() * 5;
        } else if (arg1 == 102) {
            this.field1914 = arg0.method7148();
        } else if (arg1 == 103) {
            this.field1922 = arg0.method7148();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1898 = arg0.method7148();
            if (this.field1898 == 65535) {
                this.field1898 = -1;
            }
            this.field1925 = arg0.method7148();
            if (this.field1925 == 65535) {
                this.field1925 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method7148();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method6971();
            this.field1921 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1921[var13] = arg0.method7148();
                if (this.field1921[var13] == 65535) {
                    this.field1921[var13] = -1;
                }
            }
            this.field1921[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1908 = false;
        } else if (arg1 == 109) {
            this.field1927 = false;
        } else if (arg1 == 111) {
            this.field1928 = true;
        } else if (arg1 == 249) {
            this.field1929 = class176.method3942(arg0, this.field1929);
        }
    }

    @ObfuscatedName("ft.n(Lgw;ILgw;II)Liq;")
    public final class241 method3175(class191 arg0, int arg1, class191 arg2, int arg3) {
        if (this.field1921 != null) {
            class179 var5 = this.method3169();
            return var5 == null ? null : var5.method3175(arg0, arg1, arg2, arg3);
        }
        class241 var6 = (class241) field1896.method4644((long) this.field1909);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1894.length; var8++) {
                if (!Statics.field1926.method5359(this.field1894[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class226[] var9 = new class226[this.field1894.length];
            for (int var10 = 0; var10 < this.field1894.length; var10++) {
                var9[var10] = class226.method4089(Statics.field1926, this.field1894[var10], 0);
            }
            class226 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class226(var9, var9.length);
            }
            if (this.field1924 != null) {
                for (int var12 = 0; var12 < this.field1924.length; var12++) {
                    var11.method4046(this.field1924[var12], this.field1899[var12]);
                }
            }
            if (this.field1911 != null) {
                for (int var13 = 0; var13 < this.field1911.length; var13++) {
                    var11.method4047(this.field1911[var13], this.field1912[var13]);
                }
            }
            var6 = var11.method4054(this.field1919 + 64, this.field1920 + 850, -30, -50, -30);
            field1896.method4651(var6, (long) this.field1909);
        }
        class241 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3459(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3485(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method4485(true);
        } else {
            var14 = arg2.method3485(var6, arg3);
        }
        if (this.field1916 != 128 || this.field1917 != 128) {
            var14.method4506(this.field1916, this.field1917, this.field1916);
        }
        return var14;
    }

    @ObfuscatedName("ft.s(I)Lhc;")
    public final class226 method3168() {
        if (this.field1921 != null) {
            class179 var1 = this.method3169();
            return var1 == null ? null : var1.method3168();
        } else if (this.field1901 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1901.length; var3++) {
                if (!Statics.field1926.method5359(this.field1901[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class226[] var4 = new class226[this.field1901.length];
            for (int var5 = 0; var5 < this.field1901.length; var5++) {
                var4[var5] = class226.method4089(Statics.field1926, this.field1901[var5], 0);
            }
            class226 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class226(var4, var4.length);
            }
            if (this.field1924 != null) {
                for (int var7 = 0; var7 < this.field1924.length; var7++) {
                    var6.method4046(this.field1924[var7], this.field1899[var7]);
                }
            }
            if (this.field1911 != null) {
                for (int var8 = 0; var8 < this.field1911.length; var8++) {
                    var6.method4047(this.field1911[var8], this.field1912[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ft.l(I)Lft;")
    public final class179 method3169() {
        int var1 = -1;
        if (this.field1898 != -1) {
            var1 = class289.method1960(this.field1898);
        } else if (this.field1925 != -1) {
            var1 = class289.field3284[this.field1925];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1921.length - 1) {
            var2 = this.field1921[var1];
        } else {
            var2 = this.field1921[this.field1921.length - 1];
        }
        return var2 == -1 ? null : method344(var2);
    }

    @ObfuscatedName("ft.q(I)Z")
    public boolean method3192() {
        if (this.field1921 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1898 != -1) {
            var1 = class289.method1960(this.field1898);
        } else if (this.field1925 != -1) {
            var1 = class289.field3284[this.field1925];
        }
        if (var1 >= 0 && var1 < this.field1921.length) {
            return this.field1921[var1] != -1;
        } else {
            return this.field1921[this.field1921.length - 1] != -1;
        }
    }

    @ObfuscatedName("ft.o(IIS)I")
    public int method3171(int arg0, int arg1) {
        class418 var3 = this.field1929;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class408 var5 = (class408) var3.method6760((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4409;
            }
        }
        return var4;
    }

    @ObfuscatedName("ft.r(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3194(int arg0, String arg1) {
        class418 var3 = this.field1929;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class405 var5 = (class405) var3.method6760((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4406;
            }
        }
        return var4;
    }
}
