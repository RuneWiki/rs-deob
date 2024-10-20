package deob;

@ObfuscatedName("ei")
public class class140 extends class69 {

    @ObfuscatedName("ei.b")
    public class126 field1933 = new class126(128);

    @ObfuscatedName("ei.e")
    public int field1930 = 256;

    @ObfuscatedName("ei.c")
    public int field1914 = 1000000;

    @ObfuscatedName("ei.l")
    public int[] field1915 = new int[16];

    @ObfuscatedName("ei.y")
    public int[] field1912 = new int[16];

    @ObfuscatedName("ei.j")
    public int[] field1927 = new int[16];

    @ObfuscatedName("ei.g")
    public int[] field1934 = new int[16];

    @ObfuscatedName("ei.s")
    public int[] field1919 = new int[16];

    @ObfuscatedName("ei.r")
    public int[] field1920 = new int[16];

    @ObfuscatedName("ei.t")
    public int[] field1917 = new int[16];

    @ObfuscatedName("ei.k")
    public int[] field1922 = new int[16];

    @ObfuscatedName("ei.f")
    public int[] field1923 = new int[16];

    @ObfuscatedName("ei.z")
    public int[] field1924 = new int[16];

    @ObfuscatedName("ei.n")
    public int[] field1928 = new int[16];

    @ObfuscatedName("ei.w")
    public int[] field1926 = new int[16];

    @ObfuscatedName("ei.h")
    public int[] field1941 = new int[16];

    @ObfuscatedName("ei.u")
    public int[] field1918 = new int[16];

    @ObfuscatedName("ei.m")
    public int[] field1929 = new int[16];

    @ObfuscatedName("ei.p")
    public class141[][] field1938 = new class141[16][128];

    @ObfuscatedName("ei.aq")
    public class141[][] field1931 = new class141[16][128];

    @ObfuscatedName("ei.aj")
    public class142 field1932 = new class142();

    @ObfuscatedName("ei.ae")
    public boolean field1921;

    @ObfuscatedName("ei.au")
    public int field1913;

    @ObfuscatedName("ei.aa")
    public int field1935;

    @ObfuscatedName("ei.af")
    public long field1936;

    @ObfuscatedName("ei.at")
    public long field1937;

    @ObfuscatedName("ei.ap")
    public class144 field1916 = new class144(this);

    public class140() {
        this.method2465();
    }

    @ObfuscatedName("ei.b(IB)V")
    public synchronized void method2409(int arg0) {
        this.field1930 = arg0;
    }

    @ObfuscatedName("ei.e(I)I")
    public int method2497() {
        return this.field1930;
    }

    @ObfuscatedName("ei.c(Lex;Lgv;Lbv;II)Z")
    public synchronized boolean method2484(class145 arg0, class183 arg1, class61 arg2, int arg3) {
        arg0.method2581();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class135 var7 = (class135) arg0.field2001.method2262(); var7 != null; var7 = (class135) arg0.field2001.method2260()) {
            int var8 = (int) var7.field1864;
            class143 var9 = (class143) this.field1933.method2259((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3131(var8);
                class143 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class143(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field1933.method2267(var11, (long) var8);
            }
            if (!var9.method2564(arg2, var7.field1880, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2586();
        }
        return var5;
    }

    @ObfuscatedName("ei.l(I)V")
    public synchronized void method2411() {
        for (class143 var1 = (class143) this.field1933.method2262(); var1 != null; var1 = (class143) this.field1933.method2260()) {
            var1.method2565();
        }
    }

    @ObfuscatedName("ei.y(I)V")
    public synchronized void method2412() {
        for (class143 var1 = (class143) this.field1933.method2262(); var1 != null; var1 = (class143) this.field1933.method2260()) {
            var1.method2298();
        }
    }

    @ObfuscatedName("ei.a(Lex;ZI)V")
    public synchronized void method2413(class145 arg0, boolean arg1) {
        this.method2414();
        this.field1932.method2516(arg0.field2002);
        this.field1921 = arg1;
        this.field1936 = 0L;
        int var3 = this.field1932.method2519();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1932.method2520(var4);
            this.field1932.method2523(var4);
            this.field1932.method2552(var4);
        }
        this.field1913 = this.field1932.method2528();
        this.field1935 = this.field1932.field1971[this.field1913];
        this.field1937 = this.field1932.method2527(this.field1935);
    }

    @ObfuscatedName("ei.d(I)V")
    public synchronized void method2414() {
        this.field1932.method2562();
        this.method2465();
    }

    @ObfuscatedName("ei.o(I)Z")
    public synchronized boolean method2415() {
        return this.field1932.method2524();
    }

    @ObfuscatedName("ei.q(III)V")
    public synchronized void method2416(int arg0, int arg1) {
        this.method2471(arg0, arg1);
    }

    @ObfuscatedName("ei.i(IIB)V")
    public void method2471(int arg0, int arg1) {
        this.field1934[arg0] = arg1;
        this.field1920[arg0] = arg1 & 0xFFFFFF80;
        this.method2469(arg0, arg1);
    }

    @ObfuscatedName("ei.x(III)V")
    public void method2469(int arg0, int arg1) {
        if (this.field1919[arg0] != arg1) {
            this.field1919[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1931[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ei.z(IIII)V")
    public void method2419(int arg0, int arg1, int arg2) {
        this.method2418(arg0, arg1, 64);
        if ((this.field1924[arg0] & 0x2) != 0) {
            for (class141 var4 = (class141) this.field1916.field1998.method2314(); var4 != null; var4 = (class141) this.field1916.field1998.method2316()) {
                if (var4.field1966 == arg0 && var4.field1954 < 0) {
                    this.field1938[arg0][var4.field1947] = null;
                    this.field1938[arg0][arg1] = var4;
                    int var5 = (var4.field1952 * var4.field1951 >> 12) + var4.field1950;
                    var4.field1950 += arg1 - var4.field1947 << 8;
                    var4.field1951 = var5 - var4.field1950;
                    var4.field1952 = 4096;
                    var4.field1947 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field1933.method2259((long) this.field1919[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field1986[arg1];
        if (var7 == null) {
            return;
        }
        class141 var8 = new class141();
        var8.field1966 = arg0;
        var8.field1942 = var6;
        var8.field1944 = var7;
        var8.field1965 = var6.field1987[arg1];
        var8.field1946 = var6.field1990[arg1];
        var8.field1947 = arg1;
        var8.field1948 = var6.field1992 * arg2 * arg2 * var6.field1985[arg1] + 1024 >> 11;
        var8.field1953 = var6.field1994[arg1] & 0xFF;
        var8.field1950 = (arg1 << 8) - (var6.field1984[arg1] & 0x7FFF);
        var8.field1943 = 0;
        var8.field1956 = 0;
        var8.field1955 = 0;
        var8.field1954 = -1;
        var8.field1957 = 0;
        if (this.field1941[arg0] == 0) {
            var8.field1960 = class67.method1172(var7, this.method2498(var8), this.method2432(var8), this.method2433(var8));
        } else {
            var8.field1960 = class67.method1172(var7, this.method2498(var8), 0, this.method2433(var8));
            this.method2487(var8, var6.field1984[arg1] < 0);
        }
        if (var6.field1984[arg1] < 0) {
            var8.field1960.method1174(-1);
        }
        if (var8.field1946 >= 0) {
            class141 var9 = this.field1931[arg0][var8.field1946];
            if (var9 != null && var9.field1954 < 0) {
                this.field1938[arg0][var9.field1947] = null;
                var9.field1954 = 0;
            }
            this.field1931[arg0][var8.field1946] = var8;
        }
        this.field1916.field1998.method2308(var8);
        this.field1938[arg0][arg1] = var8;
    }

    @ObfuscatedName("ei.n(Leb;ZI)V")
    public void method2487(class141 arg0, boolean arg1) {
        int var3 = arg0.field1944.field1030.length;
        int var5;
        if (arg1 && arg0.field1944.field1033) {
            int var4 = var3 + var3 - arg0.field1944.field1031;
            var5 = (int) ((long) this.field1941[arg0.field1966] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1960.method1205(true);
            }
        } else {
            var5 = (int) ((long) this.field1941[arg0.field1966] * (long) var3 >> 6);
        }
        arg0.field1960.method1264(var5);
    }

    @ObfuscatedName("ei.w(IIII)V")
    public void method2418(int arg0, int arg1, int arg2) {
        class141 var4 = this.field1938[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1938[arg0][arg1] = null;
        if ((this.field1924[arg0] & 0x2) == 0) {
            var4.field1954 = 0;
            return;
        }
        for (class141 var5 = (class141) this.field1916.field1998.method2315(); var5 != null; var5 = (class141) this.field1916.field1998.method2332()) {
            if (var4.field1966 == var5.field1966 && var5.field1954 < 0 && var4 != var5) {
                var4.field1954 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ei.h(IIIB)V")
    public void method2439(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ei.u(IIB)V")
    public void method2422(int arg0, int arg1) {
    }

    @ObfuscatedName("ei.m(III)V")
    public void method2475(int arg0, int arg1) {
        this.field1917[arg0] = arg1;
    }

    @ObfuscatedName("ei.ah(II)V")
    public void method2423(int arg0) {
        for (class141 var2 = (class141) this.field1916.field1998.method2315(); var2 != null; var2 = (class141) this.field1916.field1998.method2332()) {
            if (arg0 < 0 || var2.field1966 == arg0) {
                if (var2.field1960 != null) {
                    var2.field1960.method1283(Statics.field1072 / 100);
                    if (var2.field1960.method1226()) {
                        this.field1916.field1999.method930(var2.field1960);
                    }
                    var2.method2509();
                }
                if (var2.field1954 < 0) {
                    this.field1938[var2.field1966][var2.field1947] = null;
                }
                var2.method2298();
            }
        }
    }

    @ObfuscatedName("ei.ao(II)V")
    public void method2424(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2424(var2);
            }
            return;
        }
        this.field1915[arg0] = 12800;
        this.field1912[arg0] = 8192;
        this.field1927[arg0] = 16383;
        this.field1917[arg0] = 8192;
        this.field1922[arg0] = 0;
        this.field1923[arg0] = 8192;
        this.method2427(arg0);
        this.method2428(arg0);
        this.field1924[arg0] = 0;
        this.field1928[arg0] = 32767;
        this.field1926[arg0] = 256;
        this.field1941[arg0] = 0;
        this.method2430(arg0, 8192);
    }

    @ObfuscatedName("ei.ag(IB)V")
    public void method2425(int arg0) {
        for (class141 var2 = (class141) this.field1916.field1998.method2315(); var2 != null; var2 = (class141) this.field1916.field1998.method2332()) {
            if ((arg0 < 0 || var2.field1966 == arg0) && var2.field1954 < 0) {
                this.field1938[var2.field1966][var2.field1947] = null;
                var2.field1954 = 0;
            }
        }
    }

    @ObfuscatedName("ei.as(I)V")
    public void method2465() {
        this.method2423(-1);
        this.method2424(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1919[var1] = this.field1934[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1920[var2] = this.field1934[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ei.ak(II)V")
    public void method2427(int arg0) {
        if ((this.field1924[arg0] & 0x2) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1916.field1998.method2315(); var2 != null; var2 = (class141) this.field1916.field1998.method2332()) {
            if (var2.field1966 == arg0 && this.field1938[arg0][var2.field1947] == null && var2.field1954 < 0) {
                var2.field1954 = 0;
            }
        }
    }

    @ObfuscatedName("ei.an(II)V")
    public void method2428(int arg0) {
        if ((this.field1924[arg0] & 0x4) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1916.field1998.method2315(); var2 != null; var2 = (class141) this.field1916.field1998.method2332()) {
            if (var2.field1966 == arg0) {
                var2.field1962 = 0;
            }
        }
    }

    @ObfuscatedName("ei.av(II)V")
    public void method2501(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2418(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2419(var6, var7, var8);
            } else {
                this.method2418(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2439(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field1920[var12] = (var14 << 14) + (this.field1920[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field1920[var12] = (var14 << 7) + (this.field1920[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field1922[var12] = (var14 << 7) + (this.field1922[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1922[var12] = (this.field1922[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1923[var12] = (var14 << 7) + (this.field1923[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1923[var12] = (this.field1923[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1915[var12] = (var14 << 7) + (this.field1915[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1915[var12] = (this.field1915[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1912[var12] = (var14 << 7) + (this.field1912[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1912[var12] = (this.field1912[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1927[var12] = (var14 << 7) + (this.field1927[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1927[var12] = (this.field1927[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field1924[var12] |= 0x1;
                } else {
                    this.field1924[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field1924[var12] |= 0x2;
                } else {
                    this.method2427(var12);
                    this.field1924[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field1928[var12] = (var14 << 7) + (this.field1928[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field1928[var12] = (this.field1928[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field1928[var12] = (var14 << 7) + (this.field1928[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field1928[var12] = (this.field1928[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2423(var12);
            }
            if (var13 == 121) {
                this.method2424(var12);
            }
            if (var13 == 123) {
                this.method2425(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1928[var12];
                if (var15 == 16384) {
                    this.field1926[var12] = (var14 << 7) + (this.field1926[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1928[var12];
                if (var16 == 16384) {
                    this.field1926[var12] = (this.field1926[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field1941[var12] = (var14 << 7) + (this.field1941[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field1941[var12] = (this.field1941[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field1924[var12] |= 0x4;
                } else {
                    this.method2428(var12);
                    this.field1924[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2430(var12, (var14 << 7) + (this.field1918[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2430(var12, (this.field1918[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2469(var17, this.field1920[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2422(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2475(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2465();
            }
        }
    }

    @ObfuscatedName("ei.ab(IIS)V")
    public void method2430(int arg0, int arg1) {
        this.field1918[arg0] = arg1;
        this.field1929[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ei.ay(Leb;B)I")
    public int method2498(class141 arg0) {
        int var2 = (arg0.field1952 * arg0.field1951 >> 12) + arg0.field1950;
        int var3 = ((this.field1917[arg0.field1966] - 8192) * this.field1926[arg0.field1966] >> 12) + var2;
        class138 var4 = arg0.field1965;
        if (var4.field1891 > 0 && (var4.field1885 > 0 || this.field1922[arg0.field1966] > 0)) {
            int var5 = var4.field1885 << 2;
            int var6 = var4.field1893 << 1;
            if (arg0.field1961 < var6) {
                var5 = arg0.field1961 * var5 / var6;
            }
            int var7 = (this.field1922[arg0.field1966] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1959 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1944.field1032 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1072 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ei.am(Leb;S)I")
    public int method2432(class141 arg0) {
        class138 var2 = arg0.field1965;
        int var3 = this.field1927[arg0.field1966] * this.field1915[arg0.field1966] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1948 * var4 + 16384 >> 15;
        int var6 = this.field1930 * var5 + 128 >> 8;
        if (var2.field1887 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1943 * 1.953125E-5D * (double) var2.field1887) + 0.5D);
        }
        if (var2.field1892 != null) {
            int var7 = arg0.field1956;
            int var8 = var2.field1892[arg0.field1955 + 1];
            if (arg0.field1955 < var2.field1892.length - 2) {
                int var9 = (var2.field1892[arg0.field1955] & 0xFF) << 8;
                int var10 = (var2.field1892[arg0.field1955 + 2] & 0xFF) << 8;
                var8 += (var2.field1892[arg0.field1955 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1954 > 0 && var2.field1889 != null) {
            int var11 = arg0.field1954;
            int var12 = var2.field1889[arg0.field1957 + 1];
            if (arg0.field1957 < var2.field1889.length - 2) {
                int var13 = (var2.field1889[arg0.field1957] & 0xFF) << 8;
                int var14 = (var2.field1889[arg0.field1957 + 2] & 0xFF) << 8;
                var12 += (var2.field1889[arg0.field1957 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ei.ar(Leb;I)I")
    public int method2433(class141 arg0) {
        int var2 = this.field1912[arg0.field1966];
        return var2 < 8192 ? arg0.field1953 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1953) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ei.j()Lbm;")
    public synchronized class69 method944() {
        return this.field1916;
    }

    @ObfuscatedName("ei.t()Lbm;")
    public synchronized class69 method926() {
        return null;
    }

    @ObfuscatedName("ei.k()I")
    public synchronized int method927() {
        return 0;
    }

    @ObfuscatedName("ei.f([III)V")
    public synchronized void method942(int[] arg0, int arg1, int arg2) {
        if (this.field1932.method2524()) {
            int var4 = this.field1914 * this.field1932.field1975 / Statics.field1072;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1936;
                if (this.field1937 - var5 >= 0L) {
                    this.field1936 = var5;
                    break;
                }
                int var7 = (int) ((this.field1937 - this.field1936 + (long) var4 - 1L) / (long) var4);
                this.field1936 += (long) var4 * (long) var7;
                this.field1916.method942(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2436();
            } while (this.field1932.method2524());
        }
        this.field1916.method942(arg0, arg1, arg2);
    }

    @ObfuscatedName("ei.v(I)V")
    public synchronized void method950(int arg0) {
        if (this.field1932.method2524()) {
            int var2 = this.field1914 * this.field1932.field1975 / Statics.field1072;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1936;
                if (this.field1937 - var3 >= 0L) {
                    this.field1936 = var3;
                    break;
                }
                int var5 = (int) ((this.field1937 - this.field1936 + (long) var2 - 1L) / (long) var2);
                this.field1936 += (long) var2 * (long) var5;
                this.field1916.method950(var5);
                arg0 -= var5;
                this.method2436();
            } while (this.field1932.method2524());
        }
        this.field1916.method950(arg0);
    }

    @ObfuscatedName("ei.ad(I)V")
    public void method2436() {
        int var1 = this.field1913;
        int var2 = this.field1935;
        long var3 = this.field1937;
        while (this.field1935 == var2) {
            while (this.field1932.field1971[var1] == var2) {
                this.field1932.method2520(var1);
                int var5 = this.field1932.method2515(var1);
                if (var5 == 1) {
                    this.field1932.method2522();
                    this.field1932.method2552(var1);
                    if (this.field1932.method2529()) {
                        if (!this.field1921 || var2 == 0) {
                            this.method2465();
                            this.field1932.method2562();
                            return;
                        }
                        this.field1932.method2530(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2501(var5);
                }
                this.field1932.method2523(var1);
                this.field1932.method2552(var1);
            }
            var1 = this.field1932.method2528();
            var2 = this.field1932.field1971[var1];
            var3 = this.field1932.method2527(var2);
        }
        this.field1913 = var1;
        this.field1935 = var2;
        this.field1937 = var3;
    }

    @ObfuscatedName("ei.ax(Leb;B)Z")
    public boolean method2437(class141 arg0) {
        if (arg0.field1960 != null) {
            return false;
        }
        if (arg0.field1954 >= 0) {
            arg0.method2298();
            if (arg0.field1946 > 0 && this.field1931[arg0.field1966][arg0.field1946] == arg0) {
                this.field1931[arg0.field1966][arg0.field1946] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ei.ac(Leb;[IIIB)Z")
    public boolean method2438(class141 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1949 = Statics.field1072 / 100;
        if (arg0.field1954 >= 0 && arg0.field1960 == null || arg0.field1960.method1187()) {
            arg0.method2509();
            arg0.method2298();
            if (arg0.field1946 > 0 && this.field1931[arg0.field1966][arg0.field1946] == arg0) {
                this.field1931[arg0.field1966][arg0.field1946] = null;
            }
            return true;
        }
        int var5 = arg0.field1952;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1923[arg0.field1966] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1952 = var6;
        }
        arg0.field1960.method1185(this.method2498(arg0));
        class138 var7 = arg0.field1965;
        boolean var8 = false;
        arg0.field1961++;
        arg0.field1959 += var7.field1891;
        double var9 = (double) ((arg0.field1947 - 60 << 8) + (arg0.field1952 * arg0.field1951 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1887 > 0) {
            if (var7.field1896 > 0) {
                arg0.field1943 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1896 * var9) + 0.5D);
            } else {
                arg0.field1943 += 128;
            }
        }
        if (var7.field1892 != null) {
            if (var7.field1888 > 0) {
                arg0.field1956 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1888 * var9) + 0.5D);
            } else {
                arg0.field1956 += 128;
            }
            while (arg0.field1955 < var7.field1892.length - 2 && arg0.field1956 > (var7.field1892[arg0.field1955 + 2] & 0xFF) << 8) {
                arg0.field1955 += 2;
            }
            if (arg0.field1955 == var7.field1892.length - 2 && var7.field1892[arg0.field1955 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1954 >= 0 && var7.field1889 != null && (this.field1924[arg0.field1966] & 0x1) == 0 && (arg0.field1946 < 0 || this.field1931[arg0.field1966][arg0.field1946] != arg0)) {
            if (var7.field1886 > 0) {
                arg0.field1954 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1886 * var9) + 0.5D);
            } else {
                arg0.field1954 += 128;
            }
            while (arg0.field1957 < var7.field1889.length - 2 && arg0.field1954 > (var7.field1889[arg0.field1957 + 2] & 0xFF) << 8) {
                arg0.field1957 += 2;
            }
            if (arg0.field1957 == var7.field1889.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1960.method1183(arg0.field1949, this.method2432(arg0), this.method2433(arg0));
            return false;
        }
        arg0.field1960.method1283(arg0.field1949);
        if (arg1 == null) {
            arg0.field1960.method950(arg3);
        } else {
            arg0.field1960.method942(arg1, arg2, arg3);
        }
        if (arg0.field1960.method1226()) {
            this.field1916.field1999.method930(arg0.field1960);
        }
        arg0.method2509();
        if (arg0.field1954 >= 0) {
            arg0.method2298();
            if (arg0.field1946 > 0 && this.field1931[arg0.field1966][arg0.field1946] == arg0) {
                this.field1931[arg0.field1966][arg0.field1946] = null;
            }
        }
        return true;
    }
}
