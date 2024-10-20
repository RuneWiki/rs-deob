package deob;

@ObfuscatedName("em")
public class class140 extends class69 {

    @ObfuscatedName("em.p")
    public class126 field1943 = new class126(128);

    @ObfuscatedName("em.g")
    public int field1929 = 256;

    @ObfuscatedName("em.x")
    public int field1930 = 1000000;

    @ObfuscatedName("em.q")
    public int[] field1931 = new int[16];

    @ObfuscatedName("em.d")
    public int[] field1928 = new int[16];

    @ObfuscatedName("em.k")
    public int[] field1933 = new int[16];

    @ObfuscatedName("em.j")
    public int[] field1936 = new int[16];

    @ObfuscatedName("em.s")
    public int[] field1935 = new int[16];

    @ObfuscatedName("em.o")
    public int[] field1932 = new int[16];

    @ObfuscatedName("em.a")
    public int[] field1938 = new int[16];

    @ObfuscatedName("em.c")
    public int[] field1940 = new int[16];

    @ObfuscatedName("em.m")
    public int[] field1939 = new int[16];

    @ObfuscatedName("em.y")
    public int[] field1941 = new int[16];

    @ObfuscatedName("em.v")
    public int[] field1942 = new int[16];

    @ObfuscatedName("em.f")
    public int[] field1945 = new int[16];

    @ObfuscatedName("em.l")
    public int[] field1944 = new int[16];

    @ObfuscatedName("em.t")
    public int[] field1934 = new int[16];

    @ObfuscatedName("em.b")
    public int[] field1956 = new int[16];

    @ObfuscatedName("em.e")
    public class141[][] field1947 = new class141[16][128];

    @ObfuscatedName("em.ai")
    public class141[][] field1948 = new class141[16][128];

    @ObfuscatedName("em.am")
    public class142 field1949 = new class142();

    @ObfuscatedName("em.ad")
    public boolean field1950;

    @ObfuscatedName("em.ah")
    public int field1951;

    @ObfuscatedName("em.aj")
    public int field1952;

    @ObfuscatedName("em.ax")
    public long field1953;

    @ObfuscatedName("em.ak")
    public long field1954;

    @ObfuscatedName("em.ar")
    public class144 field1955 = new class144(this);

    public class140() {
        this.method2334();
    }

    @ObfuscatedName("em.p(II)V")
    public synchronized void method2332(int arg0) {
        this.field1929 = arg0;
    }

    @ObfuscatedName("em.g(I)I")
    public int method2364() {
        return this.field1929;
    }

    @ObfuscatedName("em.x(Ley;Lgp;Lbg;II)Z")
    public synchronized boolean method2392(class145 arg0, class183 arg1, class61 arg2, int arg3) {
        arg0.method2511();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class135 var7 = (class135) arg0.field2015.method2186(); var7 != null; var7 = (class135) arg0.field2015.method2194()) {
            int var8 = (int) var7.field1885;
            class143 var9 = (class143) this.field1943.method2199((long) var8);
            if (var9 == null) {
                var9 = class143.method2911(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field1943.method2189(var9, (long) var8);
            }
            if (!var9.method2493(arg2, var7.field1899, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2512();
        }
        return var5;
    }

    @ObfuscatedName("em.q(B)V")
    public synchronized void method2415() {
        for (class143 var1 = (class143) this.field1943.method2186(); var1 != null; var1 = (class143) this.field1943.method2194()) {
            var1.method2494();
        }
    }

    @ObfuscatedName("em.d(S)V")
    public synchronized void method2336() {
        for (class143 var1 = (class143) this.field1943.method2186(); var1 != null; var1 = (class143) this.field1943.method2194()) {
            var1.method2225();
        }
    }

    @ObfuscatedName("em.a(Ley;ZB)V")
    public synchronized void method2337(class145 arg0, boolean arg1) {
        this.method2338();
        this.field1949.method2472(arg0.field2014);
        this.field1950 = arg1;
        this.field1953 = 0L;
        int var3 = this.field1949.method2448();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1949.method2449(var4);
            this.field1949.method2452(var4);
            this.field1949.method2450(var4);
        }
        this.field1951 = this.field1949.method2457();
        this.field1952 = this.field1949.field1987[this.field1951];
        this.field1954 = this.field1949.method2456(this.field1952);
    }

    @ObfuscatedName("em.u(I)V")
    public synchronized void method2338() {
        this.field1949.method2446();
        this.method2334();
    }

    @ObfuscatedName("em.i(B)Z")
    public synchronized boolean method2396() {
        return this.field1949.method2447();
    }

    @ObfuscatedName("em.z(IIB)V")
    public synchronized void method2340(int arg0, int arg1) {
        this.method2341(arg0, arg1);
    }

    @ObfuscatedName("em.n(IIB)V")
    public void method2341(int arg0, int arg1) {
        this.field1936[arg0] = arg1;
        this.field1932[arg0] = arg1 & 0xFFFFFF80;
        this.method2342(arg0, arg1);
    }

    @ObfuscatedName("em.w(III)V")
    public void method2342(int arg0, int arg1) {
        if (this.field1935[arg0] != arg1) {
            this.field1935[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1948[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("em.y(IIII)V")
    public void method2343(int arg0, int arg1, int arg2) {
        this.method2345(arg0, arg1, 64);
        if ((this.field1941[arg0] & 0x2) != 0) {
            for (class141 var4 = (class141) this.field1955.field2007.method2238(); var4 != null; var4 = (class141) this.field1955.field2007.method2240()) {
                if (var4.field1977 == arg0 && var4.field1972 < 0) {
                    this.field1947[arg0][var4.field1970] = null;
                    this.field1947[arg0][arg1] = var4;
                    int var5 = (var4.field1965 * var4.field1961 >> 12) + var4.field1958;
                    var4.field1958 += arg1 - var4.field1970 << 8;
                    var4.field1965 = var5 - var4.field1958;
                    var4.field1961 = 4096;
                    var4.field1970 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field1943.method2199((long) this.field1935[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2000[arg1];
        if (var7 == null) {
            return;
        }
        class141 var8 = new class141();
        var8.field1977 = arg0;
        var8.field1966 = var6;
        var8.field1969 = var7;
        var8.field1960 = var6.field2002[arg1];
        var8.field1962 = var6.field2003[arg1];
        var8.field1970 = arg1;
        var8.field1964 = var6.field2004 * arg2 * arg2 * var6.field1998[arg1] + 1024 >> 11;
        var8.field1982 = var6.field1997[arg1] & 0xFF;
        var8.field1958 = (arg1 << 8) - (var6.field1999[arg1] & 0x7FFF);
        var8.field1968 = 0;
        var8.field1959 = 0;
        var8.field1971 = 0;
        var8.field1972 = -1;
        var8.field1973 = 0;
        if (this.field1944[arg0] == 0) {
            var8.field1976 = class67.method1111(var7, this.method2412(var8), this.method2390(var8), this.method2357(var8));
        } else {
            var8.field1976 = class67.method1111(var7, this.method2412(var8), 0, this.method2357(var8));
            this.method2416(var8, var6.field1999[arg1] < 0);
        }
        if (var6.field1999[arg1] < 0) {
            var8.field1976.method1113(-1);
        }
        if (var8.field1962 >= 0) {
            class141 var9 = this.field1948[arg0][var8.field1962];
            if (var9 != null && var9.field1972 < 0) {
                this.field1947[arg0][var9.field1970] = null;
                var9.field1972 = 0;
            }
            this.field1948[arg0][var8.field1962] = var8;
        }
        this.field1955.field2007.method2232(var8);
        this.field1947[arg0][arg1] = var8;
    }

    @ObfuscatedName("em.v(Lef;ZI)V")
    public void method2416(class141 arg0, boolean arg1) {
        int var3 = arg0.field1969.field1025.length;
        int var5;
        if (arg1 && arg0.field1969.field1028) {
            int var4 = var3 + var3 - arg0.field1969.field1024;
            var5 = (int) ((long) this.field1944[arg0.field1977] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1976.method1120(true);
            }
        } else {
            var5 = (int) ((long) this.field1944[arg0.field1977] * (long) var3 >> 6);
        }
        arg0.field1976.method1119(var5);
    }

    @ObfuscatedName("em.f(IIIB)V")
    public void method2345(int arg0, int arg1, int arg2) {
        class141 var4 = this.field1947[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1947[arg0][arg1] = null;
        if ((this.field1941[arg0] & 0x2) == 0) {
            var4.field1972 = 0;
            return;
        }
        for (class141 var5 = (class141) this.field1955.field2007.method2237(); var5 != null; var5 = (class141) this.field1955.field2007.method2251()) {
            if (var4.field1977 == var5.field1977 && var5.field1972 < 0 && var4 != var5) {
                var4.field1972 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("em.l(IIII)V")
    public void method2358(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("em.t(III)V")
    public void method2422(int arg0, int arg1) {
    }

    @ObfuscatedName("em.b(III)V")
    public void method2333(int arg0, int arg1) {
        this.field1938[arg0] = arg1;
    }

    @ObfuscatedName("em.ag(II)V")
    public void method2355(int arg0) {
        for (class141 var2 = (class141) this.field1955.field2007.method2237(); var2 != null; var2 = (class141) this.field1955.field2007.method2251()) {
            if (arg0 < 0 || var2.field1977 == arg0) {
                if (var2.field1976 != null) {
                    var2.field1976.method1123(Statics.field1048 / 100);
                    if (var2.field1976.method1127()) {
                        this.field1955.field2009.method870(var2.field1976);
                    }
                    var2.method2439();
                }
                if (var2.field1972 < 0) {
                    this.field1947[var2.field1977][var2.field1970] = null;
                }
                var2.method2225();
            }
        }
    }

    @ObfuscatedName("em.ao(IB)V")
    public void method2348(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2348(var2);
            }
            return;
        }
        this.field1931[arg0] = 12800;
        this.field1928[arg0] = 8192;
        this.field1933[arg0] = 16383;
        this.field1938[arg0] = 8192;
        this.field1940[arg0] = 0;
        this.field1939[arg0] = 8192;
        this.method2351(arg0);
        this.method2374(arg0);
        this.field1941[arg0] = 0;
        this.field1942[arg0] = 32767;
        this.field1945[arg0] = 256;
        this.field1944[arg0] = 0;
        this.method2354(arg0, 8192);
    }

    @ObfuscatedName("em.ab(II)V")
    public void method2349(int arg0) {
        for (class141 var2 = (class141) this.field1955.field2007.method2237(); var2 != null; var2 = (class141) this.field1955.field2007.method2251()) {
            if ((arg0 < 0 || var2.field1977 == arg0) && var2.field1972 < 0) {
                this.field1947[var2.field1977][var2.field1970] = null;
                var2.field1972 = 0;
            }
        }
    }

    @ObfuscatedName("em.an(B)V")
    public void method2334() {
        this.method2355(-1);
        this.method2348(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1935[var1] = this.field1936[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1932[var2] = this.field1936[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("em.aq(II)V")
    public void method2351(int arg0) {
        if ((this.field1941[arg0] & 0x2) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1955.field2007.method2237(); var2 != null; var2 = (class141) this.field1955.field2007.method2251()) {
            if (var2.field1977 == arg0 && this.field1947[arg0][var2.field1970] == null && var2.field1972 < 0) {
                var2.field1972 = 0;
            }
        }
    }

    @ObfuscatedName("em.at(IB)V")
    public void method2374(int arg0) {
        if ((this.field1941[arg0] & 0x4) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1955.field2007.method2237(); var2 != null; var2 = (class141) this.field1955.field2007.method2251()) {
            if (var2.field1977 == arg0) {
                var2.field1978 = 0;
            }
        }
    }

    @ObfuscatedName("em.az(II)V")
    public void method2353(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2345(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2343(var6, var7, var8);
            } else {
                this.method2345(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2358(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field1932[var12] = (var14 << 14) + (this.field1932[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field1932[var12] = (var14 << 7) + (this.field1932[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field1940[var12] = (var14 << 7) + (this.field1940[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1940[var12] = (this.field1940[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1939[var12] = (var14 << 7) + (this.field1939[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1939[var12] = (this.field1939[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1931[var12] = (var14 << 7) + (this.field1931[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1931[var12] = (this.field1931[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1928[var12] = (var14 << 7) + (this.field1928[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1928[var12] = (this.field1928[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1933[var12] = (var14 << 7) + (this.field1933[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1933[var12] = (this.field1933[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field1941[var12] |= 0x1;
                } else {
                    this.field1941[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field1941[var12] |= 0x2;
                } else {
                    this.method2351(var12);
                    this.field1941[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field1942[var12] = (var14 << 7) + (this.field1942[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field1942[var12] = (this.field1942[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field1942[var12] = (var14 << 7) + (this.field1942[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field1942[var12] = (this.field1942[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2355(var12);
            }
            if (var13 == 121) {
                this.method2348(var12);
            }
            if (var13 == 123) {
                this.method2349(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1942[var12];
                if (var15 == 16384) {
                    this.field1945[var12] = (var14 << 7) + (this.field1945[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1942[var12];
                if (var16 == 16384) {
                    this.field1945[var12] = (this.field1945[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field1944[var12] = (var14 << 7) + (this.field1944[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field1944[var12] = (this.field1944[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field1941[var12] |= 0x4;
                } else {
                    this.method2374(var12);
                    this.field1941[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2354(var12, (var14 << 7) + (this.field1934[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2354(var12, (this.field1934[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2342(var17, this.field1932[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2422(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2333(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2334();
            }
        }
    }

    @ObfuscatedName("em.as(III)V")
    public void method2354(int arg0, int arg1) {
        this.field1934[arg0] = arg1;
        this.field1956[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("em.be(Lef;S)I")
    public int method2412(class141 arg0) {
        int var2 = (arg0.field1965 * arg0.field1961 >> 12) + arg0.field1958;
        int var3 = ((this.field1938[arg0.field1977] - 8192) * this.field1945[arg0.field1977] >> 12) + var2;
        class138 var4 = arg0.field1960;
        if (var4.field1911 > 0 && (var4.field1912 > 0 || this.field1940[arg0.field1977] > 0)) {
            int var5 = var4.field1912 << 2;
            int var6 = var4.field1904 << 1;
            if (arg0.field1974 < var6) {
                var5 = arg0.field1974 * var5 / var6;
            }
            int var7 = (this.field1940[arg0.field1977] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1975 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1969.field1026 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1048 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("em.bu(Lef;I)I")
    public int method2390(class141 arg0) {
        class138 var2 = arg0.field1960;
        int var3 = this.field1931[arg0.field1977] * this.field1933[arg0.field1977] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1964 * var4 + 16384 >> 15;
        int var6 = this.field1929 * var5 + 128 >> 8;
        if (var2.field1913 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1968 * 1.953125E-5D * (double) var2.field1913) + 0.5D);
        }
        if (var2.field1909 != null) {
            int var7 = arg0.field1959;
            int var8 = var2.field1909[arg0.field1971 + 1];
            if (arg0.field1971 < var2.field1909.length - 2) {
                int var9 = (var2.field1909[arg0.field1971] & 0xFF) << 8;
                int var10 = (var2.field1909[arg0.field1971 + 2] & 0xFF) << 8;
                var8 += (var2.field1909[arg0.field1971 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1972 > 0 && var2.field1905 != null) {
            int var11 = arg0.field1972;
            int var12 = var2.field1905[arg0.field1973 + 1];
            if (arg0.field1973 < var2.field1905.length - 2) {
                int var13 = (var2.field1905[arg0.field1973] & 0xFF) << 8;
                int var14 = (var2.field1905[arg0.field1973 + 2] & 0xFF) << 8;
                var12 += (var2.field1905[arg0.field1973 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("em.bo(Lef;B)I")
    public int method2357(class141 arg0) {
        int var2 = this.field1928[arg0.field1977];
        return var2 < 8192 ? arg0.field1982 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1982) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("em.k()Lbs;")
    public synchronized class69 method875() {
        return this.field1955;
    }

    @ObfuscatedName("em.j()Lbs;")
    public synchronized class69 method876() {
        return null;
    }

    @ObfuscatedName("em.s()I")
    public synchronized int method877() {
        return 0;
    }

    @ObfuscatedName("em.o([III)V")
    public synchronized void method878(int[] arg0, int arg1, int arg2) {
        if (this.field1949.method2447()) {
            int var4 = this.field1930 * this.field1949.field1984 / Statics.field1048;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1953;
                if (this.field1954 - var5 >= 0L) {
                    this.field1953 = var5;
                    break;
                }
                int var7 = (int) ((this.field1954 - this.field1953 + (long) var4 - 1L) / (long) var4);
                this.field1953 += (long) var4 * (long) var7;
                this.field1955.method878(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2361();
            } while (this.field1949.method2447());
        }
        this.field1955.method878(arg0, arg1, arg2);
    }

    @ObfuscatedName("em.c(I)V")
    public synchronized void method888(int arg0) {
        if (this.field1949.method2447()) {
            int var2 = this.field1930 * this.field1949.field1984 / Statics.field1048;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1953;
                if (this.field1954 - var3 >= 0L) {
                    this.field1953 = var3;
                    break;
                }
                int var5 = (int) ((this.field1954 - this.field1953 + (long) var2 - 1L) / (long) var2);
                this.field1953 += (long) var2 * (long) var5;
                this.field1955.method888(var5);
                arg0 -= var5;
                this.method2361();
            } while (this.field1949.method2447());
        }
        this.field1955.method888(arg0);
    }

    @ObfuscatedName("em.br(I)V")
    public void method2361() {
        int var1 = this.field1951;
        int var2 = this.field1952;
        long var3 = this.field1954;
        while (this.field1952 == var2) {
            while (this.field1949.field1987[var1] == var2) {
                this.field1949.method2449(var1);
                int var5 = this.field1949.method2453(var1);
                if (var5 == 1) {
                    this.field1949.method2451();
                    this.field1949.method2450(var1);
                    if (this.field1949.method2485()) {
                        if (!this.field1950 || var2 == 0) {
                            this.method2334();
                            this.field1949.method2446();
                            return;
                        }
                        this.field1949.method2459(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2353(var5);
                }
                this.field1949.method2452(var1);
                this.field1949.method2450(var1);
            }
            var1 = this.field1949.method2457();
            var2 = this.field1949.field1987[var1];
            var3 = this.field1949.method2456(var2);
        }
        this.field1951 = var1;
        this.field1952 = var2;
        this.field1954 = var3;
    }

    @ObfuscatedName("em.bb(Lef;I)Z")
    public boolean method2362(class141 arg0) {
        if (arg0.field1976 != null) {
            return false;
        }
        if (arg0.field1972 >= 0) {
            arg0.method2225();
            if (arg0.field1962 > 0 && this.field1948[arg0.field1977][arg0.field1962] == arg0) {
                this.field1948[arg0.field1977][arg0.field1962] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("em.bl(Lef;[IIII)Z")
    public boolean method2363(class141 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1967 = Statics.field1048 / 100;
        if (arg0.field1972 >= 0 && arg0.field1976 == null || arg0.field1976.method1126()) {
            arg0.method2439();
            arg0.method2225();
            if (arg0.field1962 > 0 && this.field1948[arg0.field1977][arg0.field1962] == arg0) {
                this.field1948[arg0.field1977][arg0.field1962] = null;
            }
            return true;
        }
        int var5 = arg0.field1961;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1939[arg0.field1977] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1961 = var6;
        }
        arg0.field1976.method1124(this.method2412(arg0));
        class138 var7 = arg0.field1960;
        boolean var8 = false;
        arg0.field1974++;
        arg0.field1975 += var7.field1911;
        double var9 = (double) ((arg0.field1970 - 60 << 8) + (arg0.field1965 * arg0.field1961 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1913 > 0) {
            if (var7.field1906 > 0) {
                arg0.field1968 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1906 * var9) + 0.5D);
            } else {
                arg0.field1968 += 128;
            }
        }
        if (var7.field1909 != null) {
            if (var7.field1907 > 0) {
                arg0.field1959 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1907 * var9) + 0.5D);
            } else {
                arg0.field1959 += 128;
            }
            while (arg0.field1971 < var7.field1909.length - 2 && arg0.field1959 > (var7.field1909[arg0.field1971 + 2] & 0xFF) << 8) {
                arg0.field1971 += 2;
            }
            if (arg0.field1971 == var7.field1909.length - 2 && var7.field1909[arg0.field1971 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1972 >= 0 && var7.field1905 != null && (this.field1941[arg0.field1977] & 0x1) == 0 && (arg0.field1962 < 0 || this.field1948[arg0.field1977][arg0.field1962] != arg0)) {
            if (var7.field1908 > 0) {
                arg0.field1972 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1908 * var9) + 0.5D);
            } else {
                arg0.field1972 += 128;
            }
            while (arg0.field1973 < var7.field1905.length - 2 && arg0.field1972 > (var7.field1905[arg0.field1973 + 2] & 0xFF) << 8) {
                arg0.field1973 += 2;
            }
            if (arg0.field1973 == var7.field1905.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1976.method1226(arg0.field1967, this.method2390(arg0), this.method2357(arg0));
            return false;
        }
        arg0.field1976.method1123(arg0.field1967);
        if (arg1 == null) {
            arg0.field1976.method888(arg3);
        } else {
            arg0.field1976.method878(arg1, arg2, arg3);
        }
        if (arg0.field1976.method1127()) {
            this.field1955.field2009.method870(arg0.field1976);
        }
        arg0.method2439();
        if (arg0.field1972 >= 0) {
            arg0.method2225();
            if (arg0.field1962 > 0 && this.field1948[arg0.field1977][arg0.field1962] == arg0) {
                this.field1948[arg0.field1977][arg0.field1962] = null;
            }
        }
        return true;
    }
}
