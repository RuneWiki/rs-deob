package deob;

@ObfuscatedName("eo")
public class class134 extends class142 {

    @ObfuscatedName("eo.c")
    public static class134 field1936 = new class134();

    @ObfuscatedName("eo.o")
    public static byte[] field1942 = new byte[1];

    @ObfuscatedName("eo.i")
    public static class134 field1934 = new class134();

    @ObfuscatedName("eo.u")
    public static byte[] field1905 = new byte[1];

    @ObfuscatedName("eo.g")
    public int field1883 = 0;

    @ObfuscatedName("eo.m")
    public int[] field1884;

    @ObfuscatedName("eo.s")
    public int[] field1885;

    @ObfuscatedName("eo.x")
    public int[] field1886;

    @ObfuscatedName("eo.p")
    public int field1887 = 0;

    @ObfuscatedName("eo.k")
    public int[] field1888;

    @ObfuscatedName("eo.r")
    public int[] field1938;

    @ObfuscatedName("eo.w")
    public int[] field1890;

    @ObfuscatedName("eo.v")
    public int[] field1891;

    @ObfuscatedName("eo.h")
    public int[] field1892;

    @ObfuscatedName("eo.t")
    public int[] field1893;

    @ObfuscatedName("eo.a")
    public byte[] field1894;

    @ObfuscatedName("eo.e")
    public byte[] field1895;

    @ObfuscatedName("eo.y")
    public byte[] field1896;

    @ObfuscatedName("eo.l")
    public short[] field1922;

    @ObfuscatedName("eo.q")
    public byte field1898 = 0;

    @ObfuscatedName("eo.f")
    public int field1899 = 0;

    @ObfuscatedName("eo.j")
    public int[] field1900;

    @ObfuscatedName("eo.n")
    public int[] field1901;

    @ObfuscatedName("eo.z")
    public int[] field1945;

    @ObfuscatedName("eo.b")
    public int[][] field1903;

    @ObfuscatedName("eo.d")
    public int[][] field1904;

    @ObfuscatedName("eo.ap")
    public boolean field1880 = false;

    @ObfuscatedName("eo.aj")
    public int field1906;

    @ObfuscatedName("eo.am")
    public int field1907;

    @ObfuscatedName("eo.ag")
    public int field1908;

    @ObfuscatedName("eo.av")
    public int field1909;

    @ObfuscatedName("eo.al")
    public int field1910;

    @ObfuscatedName("eo.ab")
    public int field1897;

    @ObfuscatedName("eo.af")
    public int field1912;

    @ObfuscatedName("eo.ak")
    public int field1913;

    @ObfuscatedName("eo.ar")
    public int field1914 = -1;

    @ObfuscatedName("eo.an")
    public int field1918 = -1;

    @ObfuscatedName("eo.at")
    public int field1902 = -1;

    @ObfuscatedName("eo.ad")
    public static boolean[] field1933 = new boolean[4700];

    @ObfuscatedName("eo.ac")
    public static boolean[] field1919 = new boolean[4700];

    @ObfuscatedName("eo.ae")
    public static int[] field1932 = new int[4700];

    @ObfuscatedName("eo.ah")
    public static int[] field1921 = new int[4700];

    @ObfuscatedName("eo.ax")
    public static int[] field1917 = new int[4700];

    @ObfuscatedName("eo.ai")
    public static int[] field1944 = new int[4700];

    @ObfuscatedName("eo.aa")
    public static int[] field1924 = new int[4700];

    @ObfuscatedName("eo.aq")
    public static int[] field1925 = new int[4700];

    @ObfuscatedName("eo.au")
    public static int[] field1927 = new int[1600];

    @ObfuscatedName("eo.az")
    public static int[][] field1928 = new int[1600][512];

    @ObfuscatedName("eo.ay")
    public static int[] field1929 = new int[12];

    @ObfuscatedName("eo.ao")
    public static int[][] field1930 = new int[12][2000];

    @ObfuscatedName("eo.bz")
    public static int[] field1931 = new int[2000];

    @ObfuscatedName("eo.bd")
    public static int[] field1941 = new int[2000];

    @ObfuscatedName("eo.bu")
    public static int[] field1879 = new int[12];

    @ObfuscatedName("eo.bh")
    public static int[] field1916 = new int[10];

    @ObfuscatedName("eo.bg")
    public static int[] field1889 = new int[10];

    @ObfuscatedName("eo.bl")
    public static int[] field1882 = new int[10];

    @ObfuscatedName("eo.bk")
    public static boolean field1940 = true;

    @ObfuscatedName("eo.ba")
    public static int[] field1943 = class137.field1983;

    @ObfuscatedName("eo.bs")
    public static int[] field1911 = class137.field1973;

    @ObfuscatedName("eo.bc")
    public static int[] field1935 = class137.field1994;

    @ObfuscatedName("eo.bw")
    public static int[] field1946 = class137.field1997;

    public class134() {
    }

    public class134(class134[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1883 = 0;
        this.field1887 = 0;
        this.field1899 = 0;
        this.field1898 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class134 var8 = arg0[var7];
            if (var8 != null) {
                this.field1883 += var8.field1883;
                this.field1887 += var8.field1887;
                this.field1899 += var8.field1899;
                if (var8.field1894 == null) {
                    if (this.field1898 == -1) {
                        this.field1898 = var8.field1898;
                    }
                    if (this.field1898 != var8.field1898) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1895 != null;
                var5 |= var8.field1922 != null;
                var6 |= var8.field1896 != null;
            }
        }
        this.field1884 = new int[this.field1883];
        this.field1885 = new int[this.field1883];
        this.field1886 = new int[this.field1883];
        this.field1888 = new int[this.field1887];
        this.field1938 = new int[this.field1887];
        this.field1890 = new int[this.field1887];
        this.field1891 = new int[this.field1887];
        this.field1892 = new int[this.field1887];
        this.field1893 = new int[this.field1887];
        if (var3) {
            this.field1894 = new byte[this.field1887];
        }
        if (var4) {
            this.field1895 = new byte[this.field1887];
        }
        if (var5) {
            this.field1922 = new short[this.field1887];
        }
        if (var6) {
            this.field1896 = new byte[this.field1887];
        }
        if (this.field1899 > 0) {
            this.field1900 = new int[this.field1899];
            this.field1901 = new int[this.field1899];
            this.field1945 = new int[this.field1899];
        }
        this.field1883 = 0;
        this.field1887 = 0;
        this.field1899 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class134 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1887; var11++) {
                    this.field1888[this.field1887] = var10.field1888[var11] + this.field1883;
                    this.field1938[this.field1887] = var10.field1938[var11] + this.field1883;
                    this.field1890[this.field1887] = var10.field1890[var11] + this.field1883;
                    this.field1891[this.field1887] = var10.field1891[var11];
                    this.field1892[this.field1887] = var10.field1892[var11];
                    this.field1893[this.field1887] = var10.field1893[var11];
                    if (var3) {
                        if (var10.field1894 == null) {
                            this.field1894[this.field1887] = var10.field1898;
                        } else {
                            this.field1894[this.field1887] = var10.field1894[var11];
                        }
                    }
                    if (var4 && var10.field1895 != null) {
                        this.field1895[this.field1887] = var10.field1895[var11];
                    }
                    if (var5) {
                        if (var10.field1922 == null) {
                            this.field1922[this.field1887] = -1;
                        } else {
                            this.field1922[this.field1887] = var10.field1922[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1896 == null || var10.field1896[var11] == -1) {
                            this.field1896[this.field1887] = -1;
                        } else {
                            this.field1896[this.field1887] = (byte) (var10.field1896[var11] + this.field1899);
                        }
                    }
                    this.field1887++;
                }
                for (int var12 = 0; var12 < var10.field1899; var12++) {
                    this.field1900[this.field1899] = var10.field1900[var12] + this.field1883;
                    this.field1901[this.field1899] = var10.field1901[var12] + this.field1883;
                    this.field1945[this.field1899] = var10.field1945[var12] + this.field1883;
                    this.field1899++;
                }
                for (int var13 = 0; var13 < var10.field1883; var13++) {
                    this.field1884[this.field1883] = var10.field1884[var13];
                    this.field1885[this.field1883] = var10.field1885[var13];
                    this.field1886[this.field1883] = var10.field1886[var13];
                    this.field1883++;
                }
            }
        }
    }

    @ObfuscatedName("eo.c([[IIIIZI)Leo;")
    public class134 method2284(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2240();
        int var7 = arg1 - this.field1908;
        int var8 = this.field1908 + arg1;
        int var9 = arg3 - this.field1908;
        int var10 = this.field1908 + arg3;
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
            var15.field1883 = this.field1883;
            var15.field1887 = this.field1887;
            var15.field1899 = this.field1899;
            var15.field1884 = this.field1884;
            var15.field1886 = this.field1886;
            var15.field1888 = this.field1888;
            var15.field1938 = this.field1938;
            var15.field1890 = this.field1890;
            var15.field1891 = this.field1891;
            var15.field1892 = this.field1892;
            var15.field1893 = this.field1893;
            var15.field1894 = this.field1894;
            var15.field1895 = this.field1895;
            var15.field1896 = this.field1896;
            var15.field1922 = this.field1922;
            var15.field1898 = this.field1898;
            var15.field1900 = this.field1900;
            var15.field1901 = this.field1901;
            var15.field1945 = this.field1945;
            var15.field1903 = this.field1903;
            var15.field1904 = this.field1904;
            var15.field1880 = this.field1880;
            var15.field1885 = new int[var15.field1883];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1883; var16++) {
                int var17 = this.field1884[var16] + arg1;
                int var18 = this.field1886[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1885[var16] = this.field1885[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1883; var26++) {
                int var27 = (-this.field1885[var26] << 16) / this.field2085;
                if (var27 < arg5) {
                    int var28 = this.field1884[var26] + arg1;
                    int var29 = this.field1886[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1885[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1885[var26];
                }
            }
        }
        var15.method2243();
        return var15;
    }

    @ObfuscatedName("eo.o(Z)Leo;")
    public class134 method2236(boolean arg0) {
        if (!arg0 && field1942.length < this.field1887) {
            field1942 = new byte[this.field1887 + 100];
        }
        return this.method2235(arg0, field1936, field1942);
    }

    @ObfuscatedName("eo.u(Z)Leo;")
    public class134 method2237(boolean arg0) {
        if (!arg0 && field1905.length < this.field1887) {
            field1905 = new byte[this.field1887 + 100];
        }
        return this.method2235(arg0, field1934, field1905);
    }

    @ObfuscatedName("eo.g(ZLeo;[B)Leo;")
    public class134 method2235(boolean arg0, class134 arg1, byte[] arg2) {
        arg1.field1883 = this.field1883;
        arg1.field1887 = this.field1887;
        arg1.field1899 = this.field1899;
        if (arg1.field1884 == null || arg1.field1884.length < this.field1883) {
            arg1.field1884 = new int[this.field1883 + 100];
            arg1.field1885 = new int[this.field1883 + 100];
            arg1.field1886 = new int[this.field1883 + 100];
        }
        for (int var4 = 0; var4 < this.field1883; var4++) {
            arg1.field1884[var4] = this.field1884[var4];
            arg1.field1885[var4] = this.field1885[var4];
            arg1.field1886[var4] = this.field1886[var4];
        }
        if (arg0) {
            arg1.field1895 = this.field1895;
        } else {
            arg1.field1895 = arg2;
            if (this.field1895 == null) {
                for (int var5 = 0; var5 < this.field1887; var5++) {
                    arg1.field1895[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1887; var6++) {
                    arg1.field1895[var6] = this.field1895[var6];
                }
            }
        }
        arg1.field1888 = this.field1888;
        arg1.field1938 = this.field1938;
        arg1.field1890 = this.field1890;
        arg1.field1891 = this.field1891;
        arg1.field1892 = this.field1892;
        arg1.field1893 = this.field1893;
        arg1.field1894 = this.field1894;
        arg1.field1896 = this.field1896;
        arg1.field1922 = this.field1922;
        arg1.field1898 = this.field1898;
        arg1.field1900 = this.field1900;
        arg1.field1901 = this.field1901;
        arg1.field1945 = this.field1945;
        arg1.field1903 = this.field1903;
        arg1.field1904 = this.field1904;
        arg1.field1880 = this.field1880;
        arg1.method2243();
        return arg1;
    }

    @ObfuscatedName("eo.m(I)V")
    public void method2239(int arg0) {
        if (this.field1914 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1911[arg0];
        int var9 = field1943[arg0];
        for (int var10 = 0; var10 < this.field1883; var10++) {
            int var11 = class137.method2378(this.field1884[var10], this.field1886[var10], var8, var9);
            int var12 = this.field1885[var10];
            int var13 = class137.method2349(this.field1884[var10], this.field1886[var10], var8, var9);
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
        this.field1897 = (var2 + var5) / 2;
        this.field1912 = (var3 + var6) / 2;
        this.field1913 = (var4 + var7) / 2;
        this.field1914 = (var5 - var2 + 1) / 2;
        this.field1918 = (var6 - var3 + 1) / 2;
        this.field1902 = (var7 - var4 + 1) / 2;
        if (this.field1914 < 32) {
            this.field1914 = 32;
        }
        if (this.field1902 < 32) {
            this.field1902 = 32;
        }
        if (this.field1880) {
            this.field1914 += 8;
            this.field1902 += 8;
        }
    }

    @ObfuscatedName("eo.s()V")
    public void method2240() {
        if (this.field1906 == 1) {
            return;
        }
        this.field1906 = 1;
        this.field2085 = 0;
        this.field1907 = 0;
        this.field1908 = 0;
        for (int var1 = 0; var1 < this.field1883; var1++) {
            int var2 = this.field1884[var1];
            int var3 = this.field1885[var1];
            int var4 = this.field1886[var1];
            if (-var3 > this.field2085) {
                this.field2085 = -var3;
            }
            if (var3 > this.field1907) {
                this.field1907 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1908) {
                this.field1908 = var5;
            }
        }
        this.field1908 = (int) (Math.sqrt((double) this.field1908) + 0.99D);
        this.field1910 = (int) (Math.sqrt((double) (this.field2085 * this.field2085 + this.field1908 * this.field1908)) + 0.99D);
        this.field1909 = this.field1910 + (int) (Math.sqrt((double) (this.field1908 * this.field1908 + this.field1907 * this.field1907)) + 0.99D);
    }

    @ObfuscatedName("eo.x()V")
    public void method2241() {
        if (this.field1906 == 2) {
            return;
        }
        this.field1906 = 2;
        this.field1908 = 0;
        for (int var1 = 0; var1 < this.field1883; var1++) {
            int var2 = this.field1884[var1];
            int var3 = this.field1885[var1];
            int var4 = this.field1886[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1908) {
                this.field1908 = var5;
            }
        }
        this.field1908 = (int) (Math.sqrt((double) this.field1908) + 0.99D);
        this.field1910 = this.field1908;
        this.field1909 = this.field1908 + this.field1908;
    }

    @ObfuscatedName("eo.p()I")
    public int method2277() {
        this.method2240();
        return this.field1908;
    }

    @ObfuscatedName("eo.k()V")
    public void method2243() {
        this.field1906 = 0;
        this.field1914 = -1;
    }

    @ObfuscatedName("eo.w(Lea;I)V")
    public void method2244(class145 arg0, int arg1) {
        if (this.field1903 == null || arg1 == -1) {
            return;
        }
        class132 var3 = arg0.field2103[arg1];
        class139 var4 = var3.field1847;
        Statics.field1915 = 0;
        Statics.field1920 = 0;
        Statics.field1939 = 0;
        for (int var5 = 0; var5 < var3.field1848; var5++) {
            int var6 = var3.field1843[var5];
            this.method2245(var4.field2010[var6], var4.field2013[var6], var3.field1849[var5], var3.field1851[var5], var3.field1852[var5]);
        }
        this.method2243();
    }

    @ObfuscatedName("eo.v(Lea;ILea;I[I)V")
    public void method2292(class145 arg0, int arg1, class145 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2244(arg0, arg1);
            return;
        }
        class132 var6 = arg0.field2103[arg1];
        class132 var7 = arg2.field2103[arg3];
        class139 var8 = var6.field1847;
        Statics.field1915 = 0;
        Statics.field1920 = 0;
        Statics.field1939 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1848; var11++) {
            int var12 = var6.field1843[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2010[var12] == 0) {
                this.method2245(var8.field2010[var12], var8.field2013[var12], var6.field1849[var11], var6.field1851[var11], var6.field1852[var11]);
            }
        }
        Statics.field1915 = 0;
        Statics.field1920 = 0;
        Statics.field1939 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1848; var15++) {
            int var16 = var7.field1843[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2010[var16] == 0) {
                this.method2245(var8.field2010[var16], var8.field2013[var16], var7.field1849[var15], var7.field1851[var15], var7.field1852[var15]);
            }
        }
        this.method2243();
    }

    @ObfuscatedName("eo.h(I[IIII)V")
    public void method2245(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1915 = 0;
            Statics.field1920 = 0;
            Statics.field1939 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1903.length) {
                    int[] var10 = this.field1903[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1915 += this.field1884[var12];
                        Statics.field1920 += this.field1885[var12];
                        Statics.field1939 += this.field1886[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1915 = Statics.field1915 / var7 + arg2;
                Statics.field1920 = Statics.field1920 / var7 + arg3;
                Statics.field1939 = Statics.field1939 / var7 + arg4;
            } else {
                Statics.field1915 = arg2;
                Statics.field1920 = arg3;
                Statics.field1939 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1903.length) {
                    int[] var15 = this.field1903[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1884[var17] += arg2;
                        this.field1885[var17] += arg3;
                        this.field1886[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1903.length) {
                    int[] var20 = this.field1903[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1884[var22] -= Statics.field1915;
                        this.field1885[var22] -= Statics.field1920;
                        this.field1886[var22] -= Statics.field1939;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1943[var25];
                            int var27 = field1911[var25];
                            int var28 = this.field1885[var22] * var26 + this.field1884[var22] * var27 >> 16;
                            this.field1885[var22] = this.field1885[var22] * var27 - this.field1884[var22] * var26 >> 16;
                            this.field1884[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1943[var23];
                            int var30 = field1911[var23];
                            int var31 = this.field1885[var22] * var30 - this.field1886[var22] * var29 >> 16;
                            this.field1886[var22] = this.field1886[var22] * var30 + this.field1885[var22] * var29 >> 16;
                            this.field1885[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1943[var24];
                            int var33 = field1911[var24];
                            int var34 = this.field1886[var22] * var32 + this.field1884[var22] * var33 >> 16;
                            this.field1886[var22] = this.field1886[var22] * var33 - this.field1884[var22] * var32 >> 16;
                            this.field1884[var22] = var34;
                        }
                        this.field1884[var22] += Statics.field1915;
                        this.field1885[var22] += Statics.field1920;
                        this.field1886[var22] += Statics.field1939;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1903.length) {
                    int[] var37 = this.field1903[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1884[var39] -= Statics.field1915;
                        this.field1885[var39] -= Statics.field1920;
                        this.field1886[var39] -= Statics.field1939;
                        this.field1884[var39] = this.field1884[var39] * arg2 / 128;
                        this.field1885[var39] = this.field1885[var39] * arg3 / 128;
                        this.field1886[var39] = this.field1886[var39] * arg4 / 128;
                        this.field1884[var39] += Statics.field1915;
                        this.field1885[var39] += Statics.field1920;
                        this.field1886[var39] += Statics.field1939;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1904 != null && this.field1895 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1904.length) {
                    int[] var42 = this.field1904[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1895[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1895[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("eo.t()V")
    public void method2246() {
        for (int var1 = 0; var1 < this.field1883; var1++) {
            int var2 = this.field1884[var1];
            this.field1884[var1] = this.field1886[var1];
            this.field1886[var1] = -var2;
        }
        this.method2243();
    }

    @ObfuscatedName("eo.l()V")
    public void method2247() {
        for (int var1 = 0; var1 < this.field1883; var1++) {
            this.field1884[var1] = -this.field1884[var1];
            this.field1886[var1] = -this.field1886[var1];
        }
        this.method2243();
    }

    @ObfuscatedName("eo.q()V")
    public void method2279() {
        for (int var1 = 0; var1 < this.field1883; var1++) {
            int var2 = this.field1886[var1];
            this.field1886[var1] = this.field1884[var1];
            this.field1884[var1] = -var2;
        }
        this.method2243();
    }

    @ObfuscatedName("eo.f(I)V")
    public void method2272(int arg0) {
        int var2 = field1943[arg0];
        int var3 = field1911[arg0];
        for (int var4 = 0; var4 < this.field1883; var4++) {
            int var5 = this.field1885[var4] * var3 - this.field1886[var4] * var2 >> 16;
            this.field1886[var4] = this.field1886[var4] * var3 + this.field1885[var4] * var2 >> 16;
            this.field1885[var4] = var5;
        }
        this.method2243();
    }

    @ObfuscatedName("eo.j(III)V")
    public void method2286(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1883; var4++) {
            this.field1884[var4] += arg0;
            this.field1885[var4] += arg1;
            this.field1886[var4] += arg2;
        }
        this.method2243();
    }

    @ObfuscatedName("eo.n(III)V")
    public void method2294(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1883; var4++) {
            this.field1884[var4] = this.field1884[var4] * arg0 / 128;
            this.field1885[var4] = this.field1885[var4] * arg1 / 128;
            this.field1886[var4] = this.field1886[var4] * arg2 / 128;
        }
        this.method2243();
    }

    @ObfuscatedName("eo.z(IIIIIII)V")
    public final void method2283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1927[0] = -1;
        if (this.field1906 != 2 && this.field1906 != 1) {
            this.method2241();
        }
        int var8 = Statics.field1977;
        int var9 = Statics.field1986;
        int var10 = field1943[arg0];
        int var11 = field1911[arg0];
        int var12 = field1943[arg1];
        int var13 = field1911[arg1];
        int var14 = field1943[arg2];
        int var15 = field1911[arg2];
        int var16 = field1943[arg3];
        int var17 = field1911[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1883; var19++) {
            int var20 = this.field1884[var19];
            int var21 = this.field1885[var19];
            int var22 = this.field1886[var19];
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
            field1917[var19] = var30 - var18;
            field1932[var19] = class137.field1984 * var26 / var30 + var8;
            field1921[var19] = class137.field1984 * var29 / var30 + var9;
            if (this.field1899 > 0) {
                field1944[var19] = var26;
                field1924[var19] = var29;
                field1925[var19] = var30;
            }
        }
        try {
            this.method2252(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("eo.ap(IIIIIIII)V")
    public final void method2253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1927[0] = -1;
        if (this.field1906 != 2 && this.field1906 != 1) {
            this.method2241();
        }
        int var9 = Statics.field1977;
        int var10 = Statics.field1986;
        int var11 = field1943[arg0];
        int var12 = field1911[arg0];
        int var13 = field1943[arg1];
        int var14 = field1911[arg1];
        int var15 = field1943[arg2];
        int var16 = field1911[arg2];
        int var17 = field1943[arg3];
        int var18 = field1911[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1883; var20++) {
            int var21 = this.field1884[var20];
            int var22 = this.field1885[var20];
            int var23 = this.field1886[var20];
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
            field1917[var20] = var31 - var19;
            field1932[var20] = class137.field1984 * var27 / arg7 + var9;
            field1921[var20] = class137.field1984 * var30 / arg7 + var10;
            if (this.field1899 > 0) {
                field1944[var20] = var27;
                field1924[var20] = var30;
                field1925[var20] = var31;
            }
        }
        try {
            this.method2252(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("eo.cb(IIIIIIIII)V")
    public void method2304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1927[0] = -1;
        if (this.field1906 != 1) {
            this.method2240();
        }
        this.method2239(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1908 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1908) * class137.field1984;
        if (var15 / var13 >= Statics.field1996) {
            return;
        }
        int var16 = (this.field1908 + var14) * class137.field1984;
        if (var16 / var13 <= Statics.field1985) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1908 * arg1 >> 16;
        int var19 = (var17 + var18) * class137.field1984;
        if (var19 / var13 <= Statics.field1991) {
            return;
        }
        int var20 = (this.field2085 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class137.field1984;
        if (var21 / var13 >= Statics.field1992) {
            return;
        }
        int var22 = (this.field2085 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1899 > 0;
        int var26 = class135.method232();
        int var27 = class135.method192();
        boolean var28 = class135.method4301();
        if (class8.field226 && arg8 > 0) {
            class8.method1527(this, arg5, arg6, arg7);
        }
        if (class8.field221 && arg8 > 0) {
            int var29 = var11 - var12;
            if (var29 <= 50) {
                var29 = 50;
            }
            int var34;
            int var35;
            if (var14 > 0) {
                var34 = var15 / var13;
                var35 = var16 / var29;
            } else {
                var35 = var16 / var13;
                var34 = var15 / var29;
            }
            int var36;
            int var37;
            if (var17 > 0) {
                var36 = var21 / var13;
                var37 = var19 / var29;
            } else {
                var37 = var19 / var13;
                var36 = var21 / var29;
            }
            int var38 = -8355840;
            int var39 = var26 - Statics.field1977;
            int var40 = var27 - Statics.field1986;
            if (var39 > var34 && var39 < var35 && var40 > var36 && var40 < var37) {
                var38 = -256;
            }
            class8.method107(Statics.field1977 + var34, Statics.field1986 + var36, Statics.field1977 + var35, Statics.field1986 + var37, var38);
        }
        boolean var41 = false;
        if (arg8 > 0 && var28) {
            boolean var42 = false;
            if (field1940) {
                var42 = class135.method1867(this, arg5, arg6, arg7);
            } else {
                int var43 = var11 - var12;
                if (var43 <= 50) {
                    var43 = 50;
                }
                int var44;
                int var45;
                if (var14 > 0) {
                    var44 = var15 / var13;
                    var45 = var16 / var43;
                } else {
                    var45 = var16 / var13;
                    var44 = var15 / var43;
                }
                int var46;
                int var47;
                if (var17 > 0) {
                    var46 = var21 / var13;
                    var47 = var19 / var43;
                } else {
                    var47 = var19 / var13;
                    var46 = var21 / var43;
                }
                int var48 = var26 - Statics.field1977;
                int var49 = var27 - Statics.field1986;
                if (var48 > var44 && var48 < var45 && var49 > var46 && var49 < var47) {
                    var42 = true;
                }
            }
            if (var42) {
                if (this.field1880) {
                    class135.method1350(arg8);
                } else {
                    var41 = true;
                }
            }
        }
        int var50 = Statics.field1977;
        int var51 = Statics.field1986;
        int var52 = 0;
        int var53 = 0;
        if (arg0 != 0) {
            var52 = field1943[arg0];
            var53 = field1911[arg0];
        }
        for (int var54 = 0; var54 < this.field1883; var54++) {
            int var55 = this.field1884[var54];
            int var56 = this.field1885[var54];
            int var57 = this.field1886[var54];
            if (arg0 != 0) {
                int var58 = var52 * var57 + var53 * var55 >> 16;
                var57 = var53 * var57 - var52 * var55 >> 16;
                var55 = var58;
            }
            int var59 = arg5 + var55;
            int var60 = arg6 + var56;
            int var61 = arg7 + var57;
            int var62 = arg3 * var61 + arg4 * var59 >> 16;
            int var63 = arg4 * var61 - arg3 * var59 >> 16;
            int var65 = arg2 * var60 - arg1 * var63 >> 16;
            int var66 = arg1 * var60 + arg2 * var63 >> 16;
            field1917[var54] = var66 - var11;
            if (var66 >= 50) {
                field1932[var54] = class137.field1984 * var62 / var66 + var50;
                field1921[var54] = class137.field1984 * var65 / var66 + var51;
            } else {
                field1932[var54] = -5000;
                var23 = true;
            }
            if (var25) {
                field1944[var54] = var62;
                field1924[var54] = var65;
                field1925[var54] = var66;
            }
        }
        try {
            this.method2252(var23, var41, this.field1880, arg8);
        } catch (Exception var69) {
        }
    }

    @ObfuscatedName("eo.aj(ZZZI)V")
    public final void method2252(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1909 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1909; var5++) {
            field1927[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field222 && arg1) {
            class8.method600(this, var6);
        }
        for (int var7 = 0; var7 < this.field1887; var7++) {
            if (this.field1893[var7] != -2) {
                int var8 = this.field1888[var7];
                int var9 = this.field1938[var7];
                int var10 = this.field1890[var7];
                int var11 = field1932[var8];
                int var12 = field1932[var9];
                int var13 = field1932[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1944[var8];
                    int var15 = field1944[var9];
                    int var16 = field1944[var10];
                    int var17 = field1924[var8];
                    int var18 = field1924[var9];
                    int var19 = field1924[var10];
                    int var20 = field1925[var8];
                    int var21 = field1925[var9];
                    int var22 = field1925[var10];
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
                        field1919[var7] = true;
                        int var32 = (field1917[var8] + field1917[var9] + field1917[var10]) / 3 + this.field1910;
                        field1928[var32][field1927[var32]++] = var7;
                    }
                } else {
                    if (arg1 && class135.method1531(field1921[var8], field1921[var9], field1921[var10], var11, var12, var13, var6)) {
                        class135.method1350(arg3);
                        arg1 = false;
                    }
                    if ((field1921[var10] - field1921[var9]) * (var11 - var12) - (field1921[var8] - field1921[var9]) * (var13 - var12) > 0) {
                        field1919[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field1987 && var12 <= Statics.field1987 && var13 <= Statics.field1987) {
                            field1933[var7] = false;
                        } else {
                            field1933[var7] = true;
                        }
                        int var33 = (field1917[var8] + field1917[var9] + field1917[var10]) / 3 + this.field1910;
                        field1928[var33][field1927[var33]++] = var7;
                    }
                }
            }
        }
        if (this.field1894 == null) {
            for (int var34 = this.field1909 - 1; var34 >= 0; var34--) {
                int var35 = field1927[var34];
                if (var35 > 0) {
                    int[] var36 = field1928[var34];
                    for (int var37 = 0; var37 < var35; var37++) {
                        this.method2255(var36[var37]);
                    }
                }
            }
            return;
        }
        for (int var38 = 0; var38 < 12; var38++) {
            field1929[var38] = 0;
            field1879[var38] = 0;
        }
        for (int var39 = this.field1909 - 1; var39 >= 0; var39--) {
            int var40 = field1927[var39];
            if (var40 > 0) {
                int[] var41 = field1928[var39];
                for (int var42 = 0; var42 < var40; var42++) {
                    int var43 = var41[var42];
                    byte var44 = this.field1894[var43];
                    int var45 = field1929[var44]++;
                    field1930[var44][var45] = var43;
                    if (var44 < 10) {
                        field1879[var44] += var39;
                    } else if (var44 == 10) {
                        field1931[var45] = var39;
                    } else {
                        field1941[var45] = var39;
                    }
                }
            }
        }
        int var46 = 0;
        if (field1929[1] > 0 || field1929[2] > 0) {
            var46 = (field1879[1] + field1879[2]) / (field1929[1] + field1929[2]);
        }
        int var47 = 0;
        if (field1929[3] > 0 || field1929[4] > 0) {
            var47 = (field1879[3] + field1879[4]) / (field1929[3] + field1929[4]);
        }
        int var48 = 0;
        if (field1929[6] > 0 || field1929[8] > 0) {
            var48 = (field1879[6] + field1879[8]) / (field1929[6] + field1929[8]);
        }
        int var49 = 0;
        int var50 = field1929[10];
        int[] var51 = field1930[10];
        int[] var52 = field1931;
        if (var49 == var50) {
            var49 = 0;
            var50 = field1929[11];
            var51 = field1930[11];
            var52 = field1941;
        }
        int var53;
        if (var49 < var50) {
            var53 = var52[var49];
        } else {
            var53 = -1000;
        }
        for (int var54 = 0; var54 < 10; var54++) {
            while (var54 == 0 && var53 > var46) {
                this.method2255(var51[var49++]);
                if (var49 == var50 && field1930[11] != var51) {
                    var49 = 0;
                    var50 = field1929[11];
                    var51 = field1930[11];
                    var52 = field1941;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            while (var54 == 3 && var53 > var47) {
                this.method2255(var51[var49++]);
                if (var49 == var50 && field1930[11] != var51) {
                    var49 = 0;
                    var50 = field1929[11];
                    var51 = field1930[11];
                    var52 = field1941;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            while (var54 == 5 && var53 > var48) {
                this.method2255(var51[var49++]);
                if (var49 == var50 && field1930[11] != var51) {
                    var49 = 0;
                    var50 = field1929[11];
                    var51 = field1930[11];
                    var52 = field1941;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            int var55 = field1929[var54];
            int[] var56 = field1930[var54];
            for (int var57 = 0; var57 < var55; var57++) {
                this.method2255(var56[var57]);
            }
        }
        while (var53 != -1000) {
            this.method2255(var51[var49++]);
            if (var49 == var50 && field1930[11] != var51) {
                var49 = 0;
                var51 = field1930[11];
                var50 = field1929[11];
                var52 = field1941;
            }
            if (var49 < var50) {
                var53 = var52[var49];
            } else {
                var53 = -1000;
            }
        }
    }

    @ObfuscatedName("eo.am(I)V")
    public final void method2255(int arg0) {
        if (field1919[arg0]) {
            this.method2256(arg0);
            return;
        }
        int var2 = this.field1888[arg0];
        int var3 = this.field1938[arg0];
        int var4 = this.field1890[arg0];
        class137.field1979 = field1933[arg0];
        if (this.field1895 == null) {
            class137.field1980 = 0;
        } else {
            class137.field1980 = this.field1895[arg0] & 0xFF;
        }
        if (this.field1922 != null && this.field1922[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1896 == null || this.field1896[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1896[arg0] & 0xFF;
                var6 = this.field1900[var5];
                var7 = this.field1901[var5];
                var8 = this.field1945[var5];
            }
            if (this.field1893[arg0] == -1) {
                class137.method2368(field1921[var2], field1921[var3], field1921[var4], field1932[var2], field1932[var3], field1932[var4], this.field1891[arg0], this.field1891[arg0], this.field1891[arg0], field1944[var6], field1944[var7], field1944[var8], field1924[var6], field1924[var7], field1924[var8], field1925[var6], field1925[var7], field1925[var8], this.field1922[arg0]);
            } else {
                class137.method2368(field1921[var2], field1921[var3], field1921[var4], field1932[var2], field1932[var3], field1932[var4], this.field1891[arg0], this.field1892[arg0], this.field1893[arg0], field1944[var6], field1944[var7], field1944[var8], field1924[var6], field1924[var7], field1924[var8], field1925[var6], field1925[var7], field1925[var8], this.field1922[arg0]);
            }
        } else if (this.field1893[arg0] == -1) {
            class137.method2342(field1921[var2], field1921[var3], field1921[var4], field1932[var2], field1932[var3], field1932[var4], field1935[this.field1891[arg0]]);
        } else {
            class137.method2363(field1921[var2], field1921[var3], field1921[var4], field1932[var2], field1932[var3], field1932[var4], this.field1891[arg0], this.field1892[arg0], this.field1893[arg0]);
        }
    }

    @ObfuscatedName("eo.ag(I)V")
    public final void method2256(int arg0) {
        int var2 = Statics.field1977;
        int var3 = Statics.field1986;
        int var4 = 0;
        int var5 = this.field1888[arg0];
        int var6 = this.field1938[arg0];
        int var7 = this.field1890[arg0];
        int var8 = field1925[var5];
        int var9 = field1925[var6];
        int var10 = field1925[var7];
        if (this.field1895 == null) {
            class137.field1980 = 0;
        } else {
            class137.field1980 = this.field1895[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1916[var4] = field1932[var5];
            field1889[var4] = field1921[var5];
            field1882[var4++] = this.field1891[arg0];
        } else {
            int var11 = field1944[var5];
            int var12 = field1924[var5];
            int var13 = this.field1891[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1946[var10 - var8];
                field1916[var4] = (((field1944[var7] - var11) * var14 >> 16) + var11) * class137.field1984 / 50 + var2;
                field1889[var4] = (((field1924[var7] - var12) * var14 >> 16) + var12) * class137.field1984 / 50 + var3;
                field1882[var4++] = ((this.field1893[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1946[var9 - var8];
                field1916[var4] = (((field1944[var6] - var11) * var15 >> 16) + var11) * class137.field1984 / 50 + var2;
                field1889[var4] = (((field1924[var6] - var12) * var15 >> 16) + var12) * class137.field1984 / 50 + var3;
                field1882[var4++] = ((this.field1892[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1916[var4] = field1932[var6];
            field1889[var4] = field1921[var6];
            field1882[var4++] = this.field1892[arg0];
        } else {
            int var16 = field1944[var6];
            int var17 = field1924[var6];
            int var18 = this.field1892[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1946[var8 - var9];
                field1916[var4] = (((field1944[var5] - var16) * var19 >> 16) + var16) * class137.field1984 / 50 + var2;
                field1889[var4] = (((field1924[var5] - var17) * var19 >> 16) + var17) * class137.field1984 / 50 + var3;
                field1882[var4++] = ((this.field1891[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1946[var10 - var9];
                field1916[var4] = (((field1944[var7] - var16) * var20 >> 16) + var16) * class137.field1984 / 50 + var2;
                field1889[var4] = (((field1924[var7] - var17) * var20 >> 16) + var17) * class137.field1984 / 50 + var3;
                field1882[var4++] = ((this.field1893[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1916[var4] = field1932[var7];
            field1889[var4] = field1921[var7];
            field1882[var4++] = this.field1893[arg0];
        } else {
            int var21 = field1944[var7];
            int var22 = field1924[var7];
            int var23 = this.field1893[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1946[var9 - var10];
                field1916[var4] = (((field1944[var6] - var21) * var24 >> 16) + var21) * class137.field1984 / 50 + var2;
                field1889[var4] = (((field1924[var6] - var22) * var24 >> 16) + var22) * class137.field1984 / 50 + var3;
                field1882[var4++] = ((this.field1892[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1946[var8 - var10];
                field1916[var4] = (((field1944[var5] - var21) * var25 >> 16) + var21) * class137.field1984 / 50 + var2;
                field1889[var4] = (((field1924[var5] - var22) * var25 >> 16) + var22) * class137.field1984 / 50 + var3;
                field1882[var4++] = ((this.field1891[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1916[0];
        int var27 = field1916[1];
        int var28 = field1916[2];
        int var29 = field1889[0];
        int var30 = field1889[1];
        int var31 = field1889[2];
        class137.field1979 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1987 || var27 > Statics.field1987 || var28 > Statics.field1987) {
                class137.field1979 = true;
            }
            if (this.field1922 != null && this.field1922[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1896 == null || this.field1896[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1896[arg0] & 0xFF;
                    var33 = this.field1900[var32];
                    var34 = this.field1901[var32];
                    var35 = this.field1945[var32];
                }
                if (this.field1893[arg0] == -1) {
                    class137.method2368(var29, var30, var31, var26, var27, var28, this.field1891[arg0], this.field1891[arg0], this.field1891[arg0], field1944[var33], field1944[var34], field1944[var35], field1924[var33], field1924[var34], field1924[var35], field1925[var33], field1925[var34], field1925[var35], this.field1922[arg0]);
                } else {
                    class137.method2368(var29, var30, var31, var26, var27, var28, field1882[0], field1882[1], field1882[2], field1944[var33], field1944[var34], field1944[var35], field1924[var33], field1924[var34], field1924[var35], field1925[var33], field1925[var34], field1925[var35], this.field1922[arg0]);
                }
            } else if (this.field1893[arg0] == -1) {
                class137.method2342(var29, var30, var31, var26, var27, var28, field1935[this.field1891[arg0]]);
            } else {
                class137.method2363(var29, var30, var31, var26, var27, var28, field1882[0], field1882[1], field1882[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1987 || var27 > Statics.field1987 || var28 > Statics.field1987 || field1916[3] < 0 || field1916[3] > Statics.field1987) {
            class137.field1979 = true;
        }
        if (this.field1922 != null && this.field1922[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1896 == null || this.field1896[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1896[arg0] & 0xFF;
                var37 = this.field1900[var36];
                var38 = this.field1901[var36];
                var39 = this.field1945[var36];
            }
            short var40 = this.field1922[arg0];
            if (this.field1893[arg0] == -1) {
                class137.method2368(var29, var30, var31, var26, var27, var28, this.field1891[arg0], this.field1891[arg0], this.field1891[arg0], field1944[var37], field1944[var38], field1944[var39], field1924[var37], field1924[var38], field1924[var39], field1925[var37], field1925[var38], field1925[var39], var40);
                class137.method2368(var29, var31, field1889[3], var26, var28, field1916[3], this.field1891[arg0], this.field1891[arg0], this.field1891[arg0], field1944[var37], field1944[var38], field1944[var39], field1924[var37], field1924[var38], field1924[var39], field1925[var37], field1925[var38], field1925[var39], var40);
            } else {
                class137.method2368(var29, var30, var31, var26, var27, var28, field1882[0], field1882[1], field1882[2], field1944[var37], field1944[var38], field1944[var39], field1924[var37], field1924[var38], field1924[var39], field1925[var37], field1925[var38], field1925[var39], var40);
                class137.method2368(var29, var31, field1889[3], var26, var28, field1916[3], field1882[0], field1882[2], field1882[3], field1944[var37], field1944[var38], field1944[var39], field1924[var37], field1924[var38], field1924[var39], field1925[var37], field1925[var38], field1925[var39], var40);
            }
        } else if (this.field1893[arg0] == -1) {
            int var41 = field1935[this.field1891[arg0]];
            class137.method2342(var29, var30, var31, var26, var27, var28, var41);
            class137.method2342(var29, var31, field1889[3], var26, var28, field1916[3], var41);
        } else {
            class137.method2363(var29, var30, var31, var26, var27, var28, field1882[0], field1882[1], field1882[2]);
            class137.method2363(var29, var31, field1889[3], var26, var28, field1916[3], field1882[0], field1882[2], field1882[3]);
        }
    }
}
