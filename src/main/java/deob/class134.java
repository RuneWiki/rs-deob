package deob;

@ObfuscatedName("ev")
public class class134 extends class142 {

    @ObfuscatedName("ev.d")
    public static class134 field1956 = new class134();

    @ObfuscatedName("ev.q")
    public static byte[] field1894 = new byte[1];

    @ObfuscatedName("ev.x")
    public static class134 field1895 = new class134();

    @ObfuscatedName("ev.y")
    public static byte[] field1896 = new byte[1];

    @ObfuscatedName("ev.e")
    public int field1897 = 0;

    @ObfuscatedName("ev.f")
    public int[] field1898;

    @ObfuscatedName("ev.v")
    public int[] field1899;

    @ObfuscatedName("ev.t")
    public int[] field1900;

    @ObfuscatedName("ev.i")
    public int field1901 = 0;

    @ObfuscatedName("ev.r")
    public int[] field1953;

    @ObfuscatedName("ev.g")
    public int[] field1913;

    @ObfuscatedName("ev.s")
    public int[] field1904;

    @ObfuscatedName("ev.o")
    public int[] field1935;

    @ObfuscatedName("ev.p")
    public int[] field1944;

    @ObfuscatedName("ev.u")
    public int[] field1923;

    @ObfuscatedName("ev.b")
    public byte[] field1908;

    @ObfuscatedName("ev.w")
    public byte[] field1909;

    @ObfuscatedName("ev.k")
    public byte[] field1925;

    @ObfuscatedName("ev.n")
    public short[] field1911;

    @ObfuscatedName("ev.c")
    public byte field1912 = 0;

    @ObfuscatedName("ev.l")
    public int field1931 = 0;

    @ObfuscatedName("ev.m")
    public int[] field1914;

    @ObfuscatedName("ev.a")
    public int[] field1915;

    @ObfuscatedName("ev.h")
    public int[] field1916;

    @ObfuscatedName("ev.z")
    public int[][] field1917;

    @ObfuscatedName("ev.j")
    public int[][] field1910;

    @ObfuscatedName("ev.am")
    public boolean field1903 = false;

    @ObfuscatedName("ev.ac")
    public int field1920;

    @ObfuscatedName("ev.ax")
    public int field1921;

    @ObfuscatedName("ev.at")
    public int field1922;

    @ObfuscatedName("ev.ag")
    public int field1919;

    @ObfuscatedName("ev.ar")
    public int field1924;

    @ObfuscatedName("ev.ae")
    public int field1926;

    @ObfuscatedName("ev.ai")
    public int field1954;

    @ObfuscatedName("ev.au")
    public int field1927;

    @ObfuscatedName("ev.ad")
    public int field1907 = -1;

    @ObfuscatedName("ev.ah")
    public int field1929 = -1;

    @ObfuscatedName("ev.ao")
    public int field1930 = -1;

    @ObfuscatedName("ev.az")
    public static boolean[] field1932 = new boolean[4700];

    @ObfuscatedName("ev.aq")
    public static boolean[] field1933 = new boolean[4700];

    @ObfuscatedName("ev.ay")
    public static int[] field1934 = new int[4700];

    @ObfuscatedName("ev.an")
    public static int[] field1950 = new int[4700];

    @ObfuscatedName("ev.af")
    public static int[] field1937 = new int[4700];

    @ObfuscatedName("ev.aa")
    public static int[] field1936 = new int[4700];

    @ObfuscatedName("ev.ak")
    public static int[] field1943 = new int[4700];

    @ObfuscatedName("ev.as")
    public static int[] field1902 = new int[4700];

    @ObfuscatedName("ev.aw")
    public static int[] field1941 = new int[1600];

    @ObfuscatedName("ev.al")
    public static int[][] field1942 = new int[1600][512];

    @ObfuscatedName("ev.ab")
    public static int[] field1906 = new int[12];

    @ObfuscatedName("ev.aj")
    public static int[][] field1938 = new int[12][2000];

    @ObfuscatedName("ev.bz")
    public static int[] field1905 = new int[2000];

    @ObfuscatedName("ev.bi")
    public static int[] field1946 = new int[2000];

    @ObfuscatedName("ev.bu")
    public static int[] field1947 = new int[12];

    @ObfuscatedName("ev.bq")
    public static int[] field1948 = new int[10];

    @ObfuscatedName("ev.bs")
    public static int[] field1949 = new int[10];

    @ObfuscatedName("ev.bv")
    public static int[] field1962 = new int[10];

    @ObfuscatedName("ev.bl")
    public static boolean field1939 = true;

    @ObfuscatedName("ev.bw")
    public static int[] field1957 = class137.field1997;

    @ObfuscatedName("ev.br")
    public static int[] field1958 = class137.field1992;

    @ObfuscatedName("ev.bt")
    public static int[] field1959 = class137.field1991;

    @ObfuscatedName("ev.bp")
    public static int[] field1960 = class137.field2004;

    public class134() {
    }

    public class134(class134[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1897 = 0;
        this.field1901 = 0;
        this.field1931 = 0;
        this.field1912 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class134 var8 = arg0[var7];
            if (var8 != null) {
                this.field1897 += var8.field1897;
                this.field1901 += var8.field1901;
                this.field1931 += var8.field1931;
                if (var8.field1908 == null) {
                    if (this.field1912 == -1) {
                        this.field1912 = var8.field1912;
                    }
                    if (this.field1912 != var8.field1912) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1909 != null;
                var5 |= var8.field1911 != null;
                var6 |= var8.field1925 != null;
            }
        }
        this.field1898 = new int[this.field1897];
        this.field1899 = new int[this.field1897];
        this.field1900 = new int[this.field1897];
        this.field1953 = new int[this.field1901];
        this.field1913 = new int[this.field1901];
        this.field1904 = new int[this.field1901];
        this.field1935 = new int[this.field1901];
        this.field1944 = new int[this.field1901];
        this.field1923 = new int[this.field1901];
        if (var3) {
            this.field1908 = new byte[this.field1901];
        }
        if (var4) {
            this.field1909 = new byte[this.field1901];
        }
        if (var5) {
            this.field1911 = new short[this.field1901];
        }
        if (var6) {
            this.field1925 = new byte[this.field1901];
        }
        if (this.field1931 > 0) {
            this.field1914 = new int[this.field1931];
            this.field1915 = new int[this.field1931];
            this.field1916 = new int[this.field1931];
        }
        this.field1897 = 0;
        this.field1901 = 0;
        this.field1931 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class134 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1901; var11++) {
                    this.field1953[this.field1901] = var10.field1953[var11] + this.field1897;
                    this.field1913[this.field1901] = var10.field1913[var11] + this.field1897;
                    this.field1904[this.field1901] = var10.field1904[var11] + this.field1897;
                    this.field1935[this.field1901] = var10.field1935[var11];
                    this.field1944[this.field1901] = var10.field1944[var11];
                    this.field1923[this.field1901] = var10.field1923[var11];
                    if (var3) {
                        if (var10.field1908 == null) {
                            this.field1908[this.field1901] = var10.field1912;
                        } else {
                            this.field1908[this.field1901] = var10.field1908[var11];
                        }
                    }
                    if (var4 && var10.field1909 != null) {
                        this.field1909[this.field1901] = var10.field1909[var11];
                    }
                    if (var5) {
                        if (var10.field1911 == null) {
                            this.field1911[this.field1901] = -1;
                        } else {
                            this.field1911[this.field1901] = var10.field1911[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1925 == null || var10.field1925[var11] == -1) {
                            this.field1925[this.field1901] = -1;
                        } else {
                            this.field1925[this.field1901] = (byte) (var10.field1925[var11] + this.field1931);
                        }
                    }
                    this.field1901++;
                }
                for (int var12 = 0; var12 < var10.field1931; var12++) {
                    this.field1914[this.field1931] = var10.field1914[var12] + this.field1897;
                    this.field1915[this.field1931] = var10.field1915[var12] + this.field1897;
                    this.field1916[this.field1931] = var10.field1916[var12] + this.field1897;
                    this.field1931++;
                }
                for (int var13 = 0; var13 < var10.field1897; var13++) {
                    this.field1898[this.field1897] = var10.field1898[var13];
                    this.field1899[this.field1897] = var10.field1899[var13];
                    this.field1900[this.field1897] = var10.field1900[var13];
                    this.field1897++;
                }
            }
        }
    }

    @ObfuscatedName("ev.d([[IIIIZI)Lev;")
    public class134 method2265(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2270();
        int var7 = arg1 - this.field1922;
        int var8 = this.field1922 + arg1;
        int var9 = arg3 - this.field1922;
        int var10 = this.field1922 + arg3;
        if (var7 < 0 || var8 + 128 >> 7 >= arg0.length || var9 < 0 || var10 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var11 = var7 >> 7;
        int var12 = var8 + 127 >> 7;
        int var13 = var9 >> 7;
        int var14 = var10 + 127 >> 7;
        if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
            return this;
        }
        class134 var15;
        if (arg4) {
            var15 = new class134();
            var15.field1897 = this.field1897;
            var15.field1901 = this.field1901;
            var15.field1931 = this.field1931;
            var15.field1898 = this.field1898;
            var15.field1900 = this.field1900;
            var15.field1953 = this.field1953;
            var15.field1913 = this.field1913;
            var15.field1904 = this.field1904;
            var15.field1935 = this.field1935;
            var15.field1944 = this.field1944;
            var15.field1923 = this.field1923;
            var15.field1908 = this.field1908;
            var15.field1909 = this.field1909;
            var15.field1925 = this.field1925;
            var15.field1911 = this.field1911;
            var15.field1912 = this.field1912;
            var15.field1914 = this.field1914;
            var15.field1915 = this.field1915;
            var15.field1916 = this.field1916;
            var15.field1917 = this.field1917;
            var15.field1910 = this.field1910;
            var15.field1903 = this.field1903;
            var15.field1899 = new int[var15.field1897];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1897; var16++) {
                int var17 = this.field1898[var16] + arg1;
                int var18 = this.field1900[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1899[var16] = this.field1899[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1897; var26++) {
                int var27 = (-this.field1899[var26] << 16) / this.field2088;
                if (var27 < arg5) {
                    int var28 = this.field1898[var26] + arg1;
                    int var29 = this.field1900[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1899[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1899[var26];
                }
            }
        }
        var15.method2311();
        return var15;
    }

    @ObfuscatedName("ev.q(Z)Lev;")
    public class134 method2266(boolean arg0) {
        if (!arg0 && field1894.length < this.field1901) {
            field1894 = new byte[this.field1901 + 100];
        }
        return this.method2297(arg0, field1956, field1894);
    }

    @ObfuscatedName("ev.y(Z)Lev;")
    public class134 method2288(boolean arg0) {
        if (!arg0 && field1896.length < this.field1901) {
            field1896 = new byte[this.field1901 + 100];
        }
        return this.method2297(arg0, field1895, field1896);
    }

    @ObfuscatedName("ev.e(ZLev;[B)Lev;")
    public class134 method2297(boolean arg0, class134 arg1, byte[] arg2) {
        arg1.field1897 = this.field1897;
        arg1.field1901 = this.field1901;
        arg1.field1931 = this.field1931;
        if (arg1.field1898 == null || arg1.field1898.length < this.field1897) {
            arg1.field1898 = new int[this.field1897 + 100];
            arg1.field1899 = new int[this.field1897 + 100];
            arg1.field1900 = new int[this.field1897 + 100];
        }
        for (int var4 = 0; var4 < this.field1897; var4++) {
            arg1.field1898[var4] = this.field1898[var4];
            arg1.field1899[var4] = this.field1899[var4];
            arg1.field1900[var4] = this.field1900[var4];
        }
        if (arg0) {
            arg1.field1909 = this.field1909;
        } else {
            arg1.field1909 = arg2;
            if (this.field1909 == null) {
                for (int var5 = 0; var5 < this.field1901; var5++) {
                    arg1.field1909[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1901; var6++) {
                    arg1.field1909[var6] = this.field1909[var6];
                }
            }
        }
        arg1.field1953 = this.field1953;
        arg1.field1913 = this.field1913;
        arg1.field1904 = this.field1904;
        arg1.field1935 = this.field1935;
        arg1.field1944 = this.field1944;
        arg1.field1923 = this.field1923;
        arg1.field1908 = this.field1908;
        arg1.field1925 = this.field1925;
        arg1.field1911 = this.field1911;
        arg1.field1912 = this.field1912;
        arg1.field1914 = this.field1914;
        arg1.field1915 = this.field1915;
        arg1.field1916 = this.field1916;
        arg1.field1917 = this.field1917;
        arg1.field1910 = this.field1910;
        arg1.field1903 = this.field1903;
        arg1.method2311();
        return arg1;
    }

    @ObfuscatedName("ev.f(I)V")
    public void method2269(int arg0) {
        if (this.field1907 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1958[arg0];
        int var9 = field1957[arg0];
        for (int var10 = 0; var10 < this.field1897; var10++) {
            int var11 = class137.method2384(this.field1898[var10], this.field1900[var10], var8, var9);
            int var12 = this.field1899[var10];
            int var13 = class137.method2379(this.field1898[var10], this.field1900[var10], var8, var9);
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
        }
        this.field1926 = (var2 + var5) / 2;
        this.field1954 = (var3 + var6) / 2;
        this.field1927 = (var4 + var7) / 2;
        this.field1907 = (var5 - var2 + 1) / 2;
        this.field1929 = (var6 - var3 + 1) / 2;
        this.field1930 = (var7 - var4 + 1) / 2;
        if (this.field1907 < 32) {
            this.field1907 = 32;
        }
        if (this.field1930 < 32) {
            this.field1930 = 32;
        }
        if (this.field1903) {
            this.field1907 += 8;
            this.field1930 += 8;
        }
    }

    @ObfuscatedName("ev.v()V")
    public void method2270() {
        if (this.field1920 == 1) {
            return;
        }
        this.field1920 = 1;
        this.field2088 = 0;
        this.field1921 = 0;
        this.field1922 = 0;
        for (int var1 = 0; var1 < this.field1897; var1++) {
            int var2 = this.field1898[var1];
            int var3 = this.field1899[var1];
            int var4 = this.field1900[var1];
            if (-var3 > this.field2088) {
                this.field2088 = -var3;
            }
            if (var3 > this.field1921) {
                this.field1921 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1922) {
                this.field1922 = var5;
            }
        }
        this.field1922 = (int) (Math.sqrt((double) this.field1922) + 0.99D);
        this.field1924 = (int) (Math.sqrt((double) (this.field2088 * this.field2088 + this.field1922 * this.field1922)) + 0.99D);
        this.field1919 = this.field1924 + (int) (Math.sqrt((double) (this.field1922 * this.field1922 + this.field1921 * this.field1921)) + 0.99D);
    }

    @ObfuscatedName("ev.t()V")
    public void method2298() {
        if (this.field1920 == 2) {
            return;
        }
        this.field1920 = 2;
        this.field1922 = 0;
        for (int var1 = 0; var1 < this.field1897; var1++) {
            int var2 = this.field1898[var1];
            int var3 = this.field1899[var1];
            int var4 = this.field1900[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1922) {
                this.field1922 = var5;
            }
        }
        this.field1922 = (int) (Math.sqrt((double) this.field1922) + 0.99D);
        this.field1924 = this.field1922;
        this.field1919 = this.field1922 + this.field1922;
    }

    @ObfuscatedName("ev.i()I")
    public int method2272() {
        this.method2270();
        return this.field1922;
    }

    @ObfuscatedName("ev.r()V")
    public void method2311() {
        this.field1920 = 0;
        this.field1907 = -1;
    }

    @ObfuscatedName("ev.g(Len;I)V")
    public void method2279(class145 arg0, int arg1) {
        if (this.field1917 == null || arg1 == -1) {
            return;
        }
        class132 var3 = arg0.field2113[arg1];
        class139 var4 = var3.field1861;
        Statics.field1951 = 0;
        Statics.field1952 = 0;
        Statics.field1918 = 0;
        for (int var5 = 0; var5 < var3.field1867; var5++) {
            int var6 = var3.field1863[var5];
            this.method2280(var4.field2016[var6], var4.field2019[var6], var3.field1864[var5], var3.field1865[var5], var3.field1866[var5]);
        }
        this.method2311();
    }

    @ObfuscatedName("ev.o(Len;ILen;I[I)V")
    public void method2275(class145 arg0, int arg1, class145 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2279(arg0, arg1);
            return;
        }
        class132 var6 = arg0.field2113[arg1];
        class132 var7 = arg2.field2113[arg3];
        class139 var8 = var6.field1861;
        Statics.field1951 = 0;
        Statics.field1952 = 0;
        Statics.field1918 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1867; var11++) {
            int var12 = var6.field1863[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2016[var12] == 0) {
                this.method2280(var8.field2016[var12], var8.field2019[var12], var6.field1864[var11], var6.field1865[var11], var6.field1866[var11]);
            }
        }
        Statics.field1951 = 0;
        Statics.field1952 = 0;
        Statics.field1918 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1867; var15++) {
            int var16 = var7.field1863[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2016[var16] == 0) {
                this.method2280(var8.field2016[var16], var8.field2019[var16], var7.field1864[var15], var7.field1865[var15], var7.field1866[var15]);
            }
        }
        this.method2311();
    }

    @ObfuscatedName("ev.p(I[IIII)V")
    public void method2280(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1951 = 0;
            Statics.field1952 = 0;
            Statics.field1918 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1917.length) {
                    int[] var10 = this.field1917[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1951 += this.field1898[var12];
                        Statics.field1952 += this.field1899[var12];
                        Statics.field1918 += this.field1900[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1951 = Statics.field1951 / var7 + arg2;
                Statics.field1952 = Statics.field1952 / var7 + arg3;
                Statics.field1918 = Statics.field1918 / var7 + arg4;
            } else {
                Statics.field1951 = arg2;
                Statics.field1952 = arg3;
                Statics.field1918 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1917.length) {
                    int[] var15 = this.field1917[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1898[var17] += arg2;
                        this.field1899[var17] += arg3;
                        this.field1900[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1917.length) {
                    int[] var20 = this.field1917[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1898[var22] -= Statics.field1951;
                        this.field1899[var22] -= Statics.field1952;
                        this.field1900[var22] -= Statics.field1918;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1957[var25];
                            int var27 = field1958[var25];
                            int var28 = this.field1899[var22] * var26 + this.field1898[var22] * var27 >> 16;
                            this.field1899[var22] = this.field1899[var22] * var27 - this.field1898[var22] * var26 >> 16;
                            this.field1898[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1957[var23];
                            int var30 = field1958[var23];
                            int var31 = this.field1899[var22] * var30 - this.field1900[var22] * var29 >> 16;
                            this.field1900[var22] = this.field1900[var22] * var30 + this.field1899[var22] * var29 >> 16;
                            this.field1899[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1957[var24];
                            int var33 = field1958[var24];
                            int var34 = this.field1900[var22] * var32 + this.field1898[var22] * var33 >> 16;
                            this.field1900[var22] = this.field1900[var22] * var33 - this.field1898[var22] * var32 >> 16;
                            this.field1898[var22] = var34;
                        }
                        this.field1898[var22] += Statics.field1951;
                        this.field1899[var22] += Statics.field1952;
                        this.field1900[var22] += Statics.field1918;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1917.length) {
                    int[] var37 = this.field1917[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1898[var39] -= Statics.field1951;
                        this.field1899[var39] -= Statics.field1952;
                        this.field1900[var39] -= Statics.field1918;
                        this.field1898[var39] = this.field1898[var39] * arg2 / 128;
                        this.field1899[var39] = this.field1899[var39] * arg3 / 128;
                        this.field1900[var39] = this.field1900[var39] * arg4 / 128;
                        this.field1898[var39] += Statics.field1951;
                        this.field1899[var39] += Statics.field1952;
                        this.field1900[var39] += Statics.field1918;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1910 != null && this.field1909 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1910.length) {
                    int[] var42 = this.field1910[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1909[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1909[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ev.u()V")
    public void method2277() {
        for (int var1 = 0; var1 < this.field1897; var1++) {
            int var2 = this.field1898[var1];
            this.field1898[var1] = this.field1900[var1];
            this.field1900[var1] = -var2;
        }
        this.method2311();
    }

    @ObfuscatedName("ev.b()V")
    public void method2341() {
        for (int var1 = 0; var1 < this.field1897; var1++) {
            this.field1898[var1] = -this.field1898[var1];
            this.field1900[var1] = -this.field1900[var1];
        }
        this.method2311();
    }

    @ObfuscatedName("ev.w()V")
    public void method2302() {
        for (int var1 = 0; var1 < this.field1897; var1++) {
            int var2 = this.field1900[var1];
            this.field1900[var1] = this.field1898[var1];
            this.field1898[var1] = -var2;
        }
        this.method2311();
    }

    @ObfuscatedName("ev.k(I)V")
    public void method2292(int arg0) {
        int var2 = field1957[arg0];
        int var3 = field1958[arg0];
        for (int var4 = 0; var4 < this.field1897; var4++) {
            int var5 = this.field1899[var4] * var3 - this.field1900[var4] * var2 >> 16;
            this.field1900[var4] = this.field1900[var4] * var3 + this.field1899[var4] * var2 >> 16;
            this.field1899[var4] = var5;
        }
        this.method2311();
    }

    @ObfuscatedName("ev.c(III)V")
    public void method2281(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1897; var4++) {
            this.field1898[var4] += arg0;
            this.field1899[var4] += arg1;
            this.field1900[var4] += arg2;
        }
        this.method2311();
    }

    @ObfuscatedName("ev.h(III)V")
    public void method2282(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1897; var4++) {
            this.field1898[var4] = this.field1898[var4] * arg0 / 128;
            this.field1899[var4] = this.field1899[var4] * arg1 / 128;
            this.field1900[var4] = this.field1900[var4] * arg2 / 128;
        }
        this.method2311();
    }

    @ObfuscatedName("ev.z(IIIIIII)V")
    public final void method2283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1941[0] = -1;
        if (this.field1920 != 2 && this.field1920 != 1) {
            this.method2298();
        }
        int var8 = Statics.field2006;
        int var9 = Statics.field1993;
        int var10 = field1957[arg0];
        int var11 = field1958[arg0];
        int var12 = field1957[arg1];
        int var13 = field1958[arg1];
        int var14 = field1957[arg2];
        int var15 = field1958[arg2];
        int var16 = field1957[arg3];
        int var17 = field1958[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1897; var19++) {
            int var20 = this.field1898[var19];
            int var21 = this.field1899[var19];
            int var22 = this.field1900[var19];
            if (arg2 != 0) {
                int var23 = var14 * var21 + var15 * var20 >> 16;
                var21 = var15 * var21 - var14 * var20 >> 16;
                var20 = var23;
            }
            if (arg0 != 0) {
                int var24 = var11 * var21 - var10 * var22 >> 16;
                var22 = var10 * var21 + var11 * var22 >> 16;
                var21 = var24;
            }
            if (arg1 != 0) {
                int var25 = var12 * var22 + var13 * var20 >> 16;
                var22 = var13 * var22 - var12 * var20 >> 16;
                var20 = var25;
            }
            int var26 = arg4 + var20;
            int var27 = arg5 + var21;
            int var28 = arg6 + var22;
            int var29 = var17 * var27 - var16 * var28 >> 16;
            int var30 = var16 * var27 + var17 * var28 >> 16;
            field1937[var19] = var30 - var18;
            field1934[var19] = class137.field1999 * var26 / var30 + var8;
            field1950[var19] = class137.field1999 * var29 / var30 + var9;
            if (this.field1931 > 0) {
                field1936[var19] = var26;
                field1943[var19] = var29;
                field1902[var19] = var30;
            }
        }
        try {
            this.method2286(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ev.j(IIIIIIII)V")
    public final void method2284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1941[0] = -1;
        if (this.field1920 != 2 && this.field1920 != 1) {
            this.method2298();
        }
        int var9 = Statics.field2006;
        int var10 = Statics.field1993;
        int var11 = field1957[arg0];
        int var12 = field1958[arg0];
        int var13 = field1957[arg1];
        int var14 = field1958[arg1];
        int var15 = field1957[arg2];
        int var16 = field1958[arg2];
        int var17 = field1957[arg3];
        int var18 = field1958[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1897; var20++) {
            int var21 = this.field1898[var20];
            int var22 = this.field1899[var20];
            int var23 = this.field1900[var20];
            if (arg2 != 0) {
                int var24 = var15 * var22 + var16 * var21 >> 16;
                var22 = var16 * var22 - var15 * var21 >> 16;
                var21 = var24;
            }
            if (arg0 != 0) {
                int var25 = var12 * var22 - var11 * var23 >> 16;
                var23 = var11 * var22 + var12 * var23 >> 16;
                var22 = var25;
            }
            if (arg1 != 0) {
                int var26 = var13 * var23 + var14 * var21 >> 16;
                var23 = var14 * var23 - var13 * var21 >> 16;
                var21 = var26;
            }
            int var27 = arg4 + var21;
            int var28 = arg5 + var22;
            int var29 = arg6 + var23;
            int var30 = var18 * var28 - var17 * var29 >> 16;
            int var31 = var17 * var28 + var18 * var29 >> 16;
            field1937[var20] = var31 - var19;
            field1934[var20] = class137.field1999 * var27 / arg7 + var9;
            field1950[var20] = class137.field1999 * var30 / arg7 + var10;
            if (this.field1931 > 0) {
                field1936[var20] = var27;
                field1943[var20] = var30;
                field1902[var20] = var31;
            }
        }
        try {
            this.method2286(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ev.cu(IIIIIIIII)V")
    public void method2293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1941[0] = -1;
        if (this.field1920 != 1) {
            this.method2270();
        }
        this.method2269(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1922 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1922) * class137.field1999;
        if (var15 / var13 >= Statics.field1988) {
            return;
        }
        int var16 = (this.field1922 + var14) * class137.field1999;
        if (var16 / var13 <= Statics.field1996) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1922 * arg1 >> 16;
        int var19 = (var17 + var18) * class137.field1999;
        if (var19 / var13 <= Statics.field1998) {
            return;
        }
        int var20 = (this.field2088 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class137.field1999;
        if (var21 / var13 >= Statics.field1989) {
            return;
        }
        int var22 = (this.field2088 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1931 > 0;
        int var26 = class135.field1968;
        int var28 = class135.method154();
        boolean var29 = class135.field1974;
        if (class8.field229 && arg8 > 0) {
            class8.method1638(this, arg5, arg6, arg7);
        }
        if (class8.field226 && arg8 > 0) {
            int var31 = var11 - var12;
            if (var31 <= 50) {
                var31 = 50;
            }
            int var36;
            int var37;
            if (var14 > 0) {
                var36 = var15 / var13;
                var37 = var16 / var31;
            } else {
                var37 = var16 / var13;
                var36 = var15 / var31;
            }
            int var38;
            int var39;
            if (var17 > 0) {
                var38 = var21 / var13;
                var39 = var19 / var31;
            } else {
                var39 = var19 / var13;
                var38 = var21 / var31;
            }
            int var40 = -8355840;
            int var41 = var26 - Statics.field2006;
            int var42 = var28 - Statics.field1993;
            if (var41 > var36 && var41 < var37 && var42 > var38 && var42 < var39) {
                var40 = -256;
            }
            int var43 = Statics.field2006 + var36;
            int var44 = Statics.field1993 + var38;
            int var45 = Statics.field2006 + var37;
            int var46 = Statics.field1993 + var39;
            class8.field225.method3278(new class9(var43, var44, var45, var46, var40));
        }
        boolean var47 = false;
        if (arg8 > 0 && var29) {
            boolean var48 = false;
            if (field1939) {
                var48 = class135.method942(this, arg5, arg6, arg7);
            } else {
                int var49 = var11 - var12;
                if (var49 <= 50) {
                    var49 = 50;
                }
                int var50;
                int var51;
                if (var14 > 0) {
                    var50 = var15 / var13;
                    var51 = var16 / var49;
                } else {
                    var51 = var16 / var13;
                    var50 = var15 / var49;
                }
                int var52;
                int var53;
                if (var17 > 0) {
                    var52 = var21 / var13;
                    var53 = var19 / var49;
                } else {
                    var53 = var19 / var13;
                    var52 = var21 / var49;
                }
                int var54 = var26 - Statics.field2006;
                int var55 = var28 - Statics.field1993;
                if (var54 > var50 && var54 < var51 && var55 > var52 && var55 < var53) {
                    var48 = true;
                }
            }
            if (var48) {
                if (this.field1903) {
                    class135.field1972[++class135.field1971 - 1] = arg8;
                } else {
                    var47 = true;
                }
            }
        }
        int var57 = Statics.field2006;
        int var58 = Statics.field1993;
        int var59 = 0;
        int var60 = 0;
        if (arg0 != 0) {
            var59 = field1957[arg0];
            var60 = field1958[arg0];
        }
        for (int var61 = 0; var61 < this.field1897; var61++) {
            int var62 = this.field1898[var61];
            int var63 = this.field1899[var61];
            int var64 = this.field1900[var61];
            if (arg0 != 0) {
                int var65 = var59 * var64 + var60 * var62 >> 16;
                var64 = var60 * var64 - var59 * var62 >> 16;
                var62 = var65;
            }
            int var66 = arg5 + var62;
            int var67 = arg6 + var63;
            int var68 = arg7 + var64;
            int var69 = arg3 * var68 + arg4 * var66 >> 16;
            int var70 = arg4 * var68 - arg3 * var66 >> 16;
            int var72 = arg2 * var67 - arg1 * var70 >> 16;
            int var73 = arg1 * var67 + arg2 * var70 >> 16;
            field1937[var61] = var73 - var11;
            if (var73 >= 50) {
                field1934[var61] = class137.field1999 * var69 / var73 + var57;
                field1950[var61] = class137.field1999 * var72 / var73 + var58;
            } else {
                field1934[var61] = -5000;
                var23 = true;
            }
            if (var25) {
                field1936[var61] = var69;
                field1943[var61] = var72;
                field1902[var61] = var73;
            }
        }
        try {
            this.method2286(var23, var47, this.field1903, arg8);
        } catch (Exception var76) {
        }
    }

    @ObfuscatedName("ev.am(ZZZI)V")
    public final void method2286(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1919 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1919; var5++) {
            field1941[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field231 && arg1) {
            class8.method2878(this, var6);
        }
        for (int var7 = 0; var7 < this.field1901; var7++) {
            if (this.field1923[var7] != -2) {
                int var8 = this.field1953[var7];
                int var9 = this.field1913[var7];
                int var10 = this.field1904[var7];
                int var11 = field1934[var8];
                int var12 = field1934[var9];
                int var13 = field1934[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1936[var8];
                    int var15 = field1936[var9];
                    int var16 = field1936[var10];
                    int var17 = field1943[var8];
                    int var18 = field1943[var9];
                    int var19 = field1943[var10];
                    int var20 = field1902[var8];
                    int var21 = field1902[var9];
                    int var22 = field1902[var10];
                    int var23 = var14 - var15;
                    int var24 = var16 - var15;
                    int var25 = var17 - var18;
                    int var26 = var19 - var18;
                    int var27 = var20 - var21;
                    int var28 = var22 - var21;
                    int var29 = var25 * var28 - var26 * var27;
                    int var30 = var24 * var27 - var23 * var28;
                    int var31 = var23 * var26 - var24 * var25;
                    if (var21 * var31 + var15 * var29 + var18 * var30 > 0) {
                        field1933[var7] = true;
                        int var32 = (field1937[var8] + field1937[var9] + field1937[var10]) / 3 + this.field1924;
                        field1942[var32][field1941[var32]++] = var7;
                    }
                } else {
                    if (arg1 && class135.method226(field1950[var8], field1950[var9], field1950[var10], var11, var12, var13, var6)) {
                        class135.field1972[++class135.field1971 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field1950[var10] - field1950[var9]) * (var11 - var12) - (field1950[var8] - field1950[var9]) * (var13 - var12) > 0) {
                        field1933[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field1994 && var12 <= Statics.field1994 && var13 <= Statics.field1994) {
                            field1932[var7] = false;
                        } else {
                            field1932[var7] = true;
                        }
                        int var34 = (field1937[var8] + field1937[var9] + field1937[var10]) / 3 + this.field1924;
                        field1942[var34][field1941[var34]++] = var7;
                    }
                }
            }
        }
        if (this.field1908 == null) {
            for (int var35 = this.field1919 - 1; var35 >= 0; var35--) {
                int var36 = field1941[var35];
                if (var36 > 0) {
                    int[] var37 = field1942[var35];
                    for (int var38 = 0; var38 < var36; var38++) {
                        this.method2287(var37[var38]);
                    }
                }
            }
            return;
        }
        for (int var39 = 0; var39 < 12; var39++) {
            field1906[var39] = 0;
            field1947[var39] = 0;
        }
        for (int var40 = this.field1919 - 1; var40 >= 0; var40--) {
            int var41 = field1941[var40];
            if (var41 > 0) {
                int[] var42 = field1942[var40];
                for (int var43 = 0; var43 < var41; var43++) {
                    int var44 = var42[var43];
                    byte var45 = this.field1908[var44];
                    int var46 = field1906[var45]++;
                    field1938[var45][var46] = var44;
                    if (var45 < 10) {
                        field1947[var45] += var40;
                    } else if (var45 == 10) {
                        field1905[var46] = var40;
                    } else {
                        field1946[var46] = var40;
                    }
                }
            }
        }
        int var47 = 0;
        if (field1906[1] > 0 || field1906[2] > 0) {
            var47 = (field1947[1] + field1947[2]) / (field1906[1] + field1906[2]);
        }
        int var48 = 0;
        if (field1906[3] > 0 || field1906[4] > 0) {
            var48 = (field1947[3] + field1947[4]) / (field1906[3] + field1906[4]);
        }
        int var49 = 0;
        if (field1906[6] > 0 || field1906[8] > 0) {
            var49 = (field1947[6] + field1947[8]) / (field1906[6] + field1906[8]);
        }
        int var50 = 0;
        int var51 = field1906[10];
        int[] var52 = field1938[10];
        int[] var53 = field1905;
        if (var50 == var51) {
            var50 = 0;
            var51 = field1906[11];
            var52 = field1938[11];
            var53 = field1946;
        }
        int var54;
        if (var50 < var51) {
            var54 = var53[var50];
        } else {
            var54 = -1000;
        }
        for (int var55 = 0; var55 < 10; var55++) {
            while (var55 == 0 && var54 > var47) {
                this.method2287(var52[var50++]);
                if (var50 == var51 && field1938[11] != var52) {
                    var50 = 0;
                    var51 = field1906[11];
                    var52 = field1938[11];
                    var53 = field1946;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 3 && var54 > var48) {
                this.method2287(var52[var50++]);
                if (var50 == var51 && field1938[11] != var52) {
                    var50 = 0;
                    var51 = field1906[11];
                    var52 = field1938[11];
                    var53 = field1946;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 5 && var54 > var49) {
                this.method2287(var52[var50++]);
                if (var50 == var51 && field1938[11] != var52) {
                    var50 = 0;
                    var51 = field1906[11];
                    var52 = field1938[11];
                    var53 = field1946;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            int var56 = field1906[var55];
            int[] var57 = field1938[var55];
            for (int var58 = 0; var58 < var56; var58++) {
                this.method2287(var57[var58]);
            }
        }
        while (var54 != -1000) {
            this.method2287(var52[var50++]);
            if (var50 == var51 && field1938[11] != var52) {
                var50 = 0;
                var52 = field1938[11];
                var51 = field1906[11];
                var53 = field1946;
            }
            if (var50 < var51) {
                var54 = var53[var50];
            } else {
                var54 = -1000;
            }
        }
    }

    @ObfuscatedName("ev.ac(I)V")
    public final void method2287(int arg0) {
        if (field1933[arg0]) {
            this.method2324(arg0);
            return;
        }
        int var2 = this.field1953[arg0];
        int var3 = this.field1913[arg0];
        int var4 = this.field1904[arg0];
        class137.field2005 = field1932[arg0];
        if (this.field1909 == null) {
            class137.field1984 = 0;
        } else {
            class137.field1984 = this.field1909[arg0] & 0xFF;
        }
        if (this.field1911 != null && this.field1911[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1925 == null || this.field1925[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1925[arg0] & 0xFF;
                var6 = this.field1914[var5];
                var7 = this.field1915[var5];
                var8 = this.field1916[var5];
            }
            if (this.field1923[arg0] == -1) {
                class137.method2445(field1950[var2], field1950[var3], field1950[var4], field1934[var2], field1934[var3], field1934[var4], this.field1935[arg0], this.field1935[arg0], this.field1935[arg0], field1936[var6], field1936[var7], field1936[var8], field1943[var6], field1943[var7], field1943[var8], field1902[var6], field1902[var7], field1902[var8], this.field1911[arg0]);
            } else {
                class137.method2445(field1950[var2], field1950[var3], field1950[var4], field1934[var2], field1934[var3], field1934[var4], this.field1935[arg0], this.field1944[arg0], this.field1923[arg0], field1936[var6], field1936[var7], field1936[var8], field1943[var6], field1943[var7], field1943[var8], field1902[var6], field1902[var7], field1902[var8], this.field1911[arg0]);
            }
        } else if (this.field1923[arg0] == -1) {
            class137.method2417(field1950[var2], field1950[var3], field1950[var4], field1934[var2], field1934[var3], field1934[var4], field1959[this.field1935[arg0]]);
        } else {
            class137.method2453(field1950[var2], field1950[var3], field1950[var4], field1934[var2], field1934[var3], field1934[var4], this.field1935[arg0], this.field1944[arg0], this.field1923[arg0]);
        }
    }

    @ObfuscatedName("ev.ax(I)V")
    public final void method2324(int arg0) {
        int var2 = Statics.field2006;
        int var3 = Statics.field1993;
        int var4 = 0;
        int var5 = this.field1953[arg0];
        int var6 = this.field1913[arg0];
        int var7 = this.field1904[arg0];
        int var8 = field1902[var5];
        int var9 = field1902[var6];
        int var10 = field1902[var7];
        if (this.field1909 == null) {
            class137.field1984 = 0;
        } else {
            class137.field1984 = this.field1909[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1948[var4] = field1934[var5];
            field1949[var4] = field1950[var5];
            field1962[var4++] = this.field1935[arg0];
        } else {
            int var11 = field1936[var5];
            int var12 = field1943[var5];
            int var13 = this.field1935[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1960[var10 - var8];
                field1948[var4] = (((field1936[var7] - var11) * var14 >> 16) + var11) * class137.field1999 / 50 + var2;
                field1949[var4] = (((field1943[var7] - var12) * var14 >> 16) + var12) * class137.field1999 / 50 + var3;
                field1962[var4++] = ((this.field1923[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1960[var9 - var8];
                field1948[var4] = (((field1936[var6] - var11) * var15 >> 16) + var11) * class137.field1999 / 50 + var2;
                field1949[var4] = (((field1943[var6] - var12) * var15 >> 16) + var12) * class137.field1999 / 50 + var3;
                field1962[var4++] = ((this.field1944[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1948[var4] = field1934[var6];
            field1949[var4] = field1950[var6];
            field1962[var4++] = this.field1944[arg0];
        } else {
            int var16 = field1936[var6];
            int var17 = field1943[var6];
            int var18 = this.field1944[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1960[var8 - var9];
                field1948[var4] = (((field1936[var5] - var16) * var19 >> 16) + var16) * class137.field1999 / 50 + var2;
                field1949[var4] = (((field1943[var5] - var17) * var19 >> 16) + var17) * class137.field1999 / 50 + var3;
                field1962[var4++] = ((this.field1935[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1960[var10 - var9];
                field1948[var4] = (((field1936[var7] - var16) * var20 >> 16) + var16) * class137.field1999 / 50 + var2;
                field1949[var4] = (((field1943[var7] - var17) * var20 >> 16) + var17) * class137.field1999 / 50 + var3;
                field1962[var4++] = ((this.field1923[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1948[var4] = field1934[var7];
            field1949[var4] = field1950[var7];
            field1962[var4++] = this.field1923[arg0];
        } else {
            int var21 = field1936[var7];
            int var22 = field1943[var7];
            int var23 = this.field1923[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1960[var9 - var10];
                field1948[var4] = (((field1936[var6] - var21) * var24 >> 16) + var21) * class137.field1999 / 50 + var2;
                field1949[var4] = (((field1943[var6] - var22) * var24 >> 16) + var22) * class137.field1999 / 50 + var3;
                field1962[var4++] = ((this.field1944[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1960[var8 - var10];
                field1948[var4] = (((field1936[var5] - var21) * var25 >> 16) + var21) * class137.field1999 / 50 + var2;
                field1949[var4] = (((field1943[var5] - var22) * var25 >> 16) + var22) * class137.field1999 / 50 + var3;
                field1962[var4++] = ((this.field1935[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1948[0];
        int var27 = field1948[1];
        int var28 = field1948[2];
        int var29 = field1949[0];
        int var30 = field1949[1];
        int var31 = field1949[2];
        class137.field2005 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1994 || var27 > Statics.field1994 || var28 > Statics.field1994) {
                class137.field2005 = true;
            }
            if (this.field1911 != null && this.field1911[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1925 == null || this.field1925[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1925[arg0] & 0xFF;
                    var33 = this.field1914[var32];
                    var34 = this.field1915[var32];
                    var35 = this.field1916[var32];
                }
                if (this.field1923[arg0] == -1) {
                    class137.method2445(var29, var30, var31, var26, var27, var28, this.field1935[arg0], this.field1935[arg0], this.field1935[arg0], field1936[var33], field1936[var34], field1936[var35], field1943[var33], field1943[var34], field1943[var35], field1902[var33], field1902[var34], field1902[var35], this.field1911[arg0]);
                } else {
                    class137.method2445(var29, var30, var31, var26, var27, var28, field1962[0], field1962[1], field1962[2], field1936[var33], field1936[var34], field1936[var35], field1943[var33], field1943[var34], field1943[var35], field1902[var33], field1902[var34], field1902[var35], this.field1911[arg0]);
                }
            } else if (this.field1923[arg0] == -1) {
                class137.method2417(var29, var30, var31, var26, var27, var28, field1959[this.field1935[arg0]]);
            } else {
                class137.method2453(var29, var30, var31, var26, var27, var28, field1962[0], field1962[1], field1962[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1994 || var27 > Statics.field1994 || var28 > Statics.field1994 || field1948[3] < 0 || field1948[3] > Statics.field1994) {
            class137.field2005 = true;
        }
        if (this.field1911 != null && this.field1911[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1925 == null || this.field1925[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1925[arg0] & 0xFF;
                var37 = this.field1914[var36];
                var38 = this.field1915[var36];
                var39 = this.field1916[var36];
            }
            short var40 = this.field1911[arg0];
            if (this.field1923[arg0] == -1) {
                class137.method2445(var29, var30, var31, var26, var27, var28, this.field1935[arg0], this.field1935[arg0], this.field1935[arg0], field1936[var37], field1936[var38], field1936[var39], field1943[var37], field1943[var38], field1943[var39], field1902[var37], field1902[var38], field1902[var39], var40);
                class137.method2445(var29, var31, field1949[3], var26, var28, field1948[3], this.field1935[arg0], this.field1935[arg0], this.field1935[arg0], field1936[var37], field1936[var38], field1936[var39], field1943[var37], field1943[var38], field1943[var39], field1902[var37], field1902[var38], field1902[var39], var40);
            } else {
                class137.method2445(var29, var30, var31, var26, var27, var28, field1962[0], field1962[1], field1962[2], field1936[var37], field1936[var38], field1936[var39], field1943[var37], field1943[var38], field1943[var39], field1902[var37], field1902[var38], field1902[var39], var40);
                class137.method2445(var29, var31, field1949[3], var26, var28, field1948[3], field1962[0], field1962[2], field1962[3], field1936[var37], field1936[var38], field1936[var39], field1943[var37], field1943[var38], field1943[var39], field1902[var37], field1902[var38], field1902[var39], var40);
            }
        } else if (this.field1923[arg0] == -1) {
            int var41 = field1959[this.field1935[arg0]];
            class137.method2417(var29, var30, var31, var26, var27, var28, var41);
            class137.method2417(var29, var31, field1949[3], var26, var28, field1948[3], var41);
        } else {
            class137.method2453(var29, var30, var31, var26, var27, var28, field1962[0], field1962[1], field1962[2]);
            class137.method2453(var29, var31, field1949[3], var26, var28, field1948[3], field1962[0], field1962[2], field1962[3]);
        }
    }
}
