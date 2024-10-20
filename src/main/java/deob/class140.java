package deob;

@ObfuscatedName("ei")
public class class140 extends class69 {

    @ObfuscatedName("ei.n")
    public class126 field1950 = new class126(128);

    @ObfuscatedName("ei.d")
    public int field1949 = 256;

    @ObfuscatedName("ei.m")
    public int field1951 = 1000000;

    @ObfuscatedName("ei.h")
    public int[] field1943 = new int[16];

    @ObfuscatedName("ei.r")
    public int[] field1928 = new int[16];

    @ObfuscatedName("ei.c")
    public int[] field1934 = new int[16];

    @ObfuscatedName("ei.p")
    public int[] field1930 = new int[16];

    @ObfuscatedName("ei.g")
    public int[] field1931 = new int[16];

    @ObfuscatedName("ei.z")
    public int[] field1932 = new int[16];

    @ObfuscatedName("ei.q")
    public int[] field1924 = new int[16];

    @ObfuscatedName("ei.l")
    public int[] field1945 = new int[16];

    @ObfuscatedName("ei.y")
    public int[] field1935 = new int[16];

    @ObfuscatedName("ei.a")
    public int[] field1933 = new int[16];

    @ObfuscatedName("ei.b")
    public int[] field1937 = new int[16];

    @ObfuscatedName("ei.j")
    public int[] field1946 = new int[16];

    @ObfuscatedName("ei.k")
    public int[] field1939 = new int[16];

    @ObfuscatedName("ei.v")
    public int[] field1940 = new int[16];

    @ObfuscatedName("ei.u")
    public int[] field1941 = new int[16];

    @ObfuscatedName("ei.t")
    public class141[][] field1942 = new class141[16][128];

    @ObfuscatedName("ei.av")
    public class141[][] field1926 = new class141[16][128];

    @ObfuscatedName("ei.aw")
    public class142 field1944 = new class142();

    @ObfuscatedName("ei.ay")
    public boolean field1936;

    @ObfuscatedName("ei.as")
    public int field1929;

    @ObfuscatedName("ei.ai")
    public int field1947;

    @ObfuscatedName("ei.aq")
    public long field1948;

    @ObfuscatedName("ei.ac")
    public long field1938;

    @ObfuscatedName("ei.ae")
    public class144 field1927 = new class144(this);

    public class140() {
        this.method2454();
    }

    @ObfuscatedName("ei.n(II)V")
    public synchronized void method2374(int arg0) {
        this.field1949 = arg0;
    }

    @ObfuscatedName("ei.d(I)I")
    public int method2375() {
        return this.field1949;
    }

    @ObfuscatedName("ei.m(Lej;Lgj;Lbr;II)Z")
    public synchronized boolean method2376(class145 arg0, class183 arg1, class61 arg2, int arg3) {
        arg0.method2569();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class135 var7 = (class135) arg0.field2018.method2238(); var7 != null; var7 = (class135) arg0.field2018.method2233()) {
            int var8 = (int) var7.field1879;
            class143 var9 = (class143) this.field1950.method2229((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3098(var8);
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
                this.field1950.method2230(var11, (long) var8);
            }
            if (!var9.method2546(arg2, var7.field1894, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2568();
        }
        return var5;
    }

    @ObfuscatedName("ei.h(B)V")
    public synchronized void method2377() {
        for (class143 var1 = (class143) this.field1950.method2238(); var1 != null; var1 = (class143) this.field1950.method2233()) {
            var1.method2547();
        }
    }

    @ObfuscatedName("ei.w(I)V")
    public synchronized void method2406() {
        for (class143 var1 = (class143) this.field1950.method2238(); var1 != null; var1 = (class143) this.field1950.method2233()) {
            var1.method2273();
        }
    }

    @ObfuscatedName("ei.l(Lej;ZI)V")
    public synchronized void method2415(class145 arg0, boolean arg1) {
        this.method2380();
        this.field1944.method2494(arg0.field2019);
        this.field1936 = arg1;
        this.field1948 = 0L;
        int var3 = this.field1944.method2497();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1944.method2498(var4);
            this.field1944.method2531(var4);
            this.field1944.method2499(var4);
        }
        this.field1929 = this.field1944.method2505();
        this.field1947 = this.field1944.field1983[this.field1929];
        this.field1938 = this.field1944.method2504(this.field1947);
    }

    @ObfuscatedName("ei.e(B)V")
    public synchronized void method2380() {
        this.field1944.method2495();
        this.method2454();
    }

    @ObfuscatedName("ei.x(I)Z")
    public synchronized boolean method2381() {
        return this.field1944.method2496();
    }

    @ObfuscatedName("ei.f(III)V")
    public synchronized void method2382(int arg0, int arg1) {
        this.method2410(arg0, arg1);
    }

    @ObfuscatedName("ei.s(III)V")
    public void method2410(int arg0, int arg1) {
        this.field1930[arg0] = arg1;
        this.field1932[arg0] = arg1 & 0xFFFFFF80;
        this.method2431(arg0, arg1);
    }

    @ObfuscatedName("ei.o(IIB)V")
    public void method2431(int arg0, int arg1) {
        if (this.field1931[arg0] != arg1) {
            this.field1931[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1926[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ei.i(IIII)V")
    public void method2385(int arg0, int arg1, int arg2) {
        this.method2387(arg0, arg1, 64);
        if ((this.field1933[arg0] & 0x2) != 0) {
            for (class141 var4 = (class141) this.field1927.field2014.method2284(); var4 != null; var4 = (class141) this.field1927.field2014.method2286()) {
                if (var4.field1954 == arg0 && var4.field1968 < 0) {
                    this.field1942[arg0][var4.field1959] = null;
                    this.field1942[arg0][arg1] = var4;
                    int var5 = (var4.field1974 * var4.field1963 >> 12) + var4.field1962;
                    var4.field1962 += arg1 - var4.field1959 << 8;
                    var4.field1963 = var5 - var4.field1962;
                    var4.field1974 = 4096;
                    var4.field1959 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field1950.method2229((long) this.field1931[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field1994[arg1];
        if (var7 == null) {
            return;
        }
        class141 var8 = new class141();
        var8.field1954 = arg0;
        var8.field1977 = var6;
        var8.field1956 = var7;
        var8.field1957 = var6.field1998[arg1];
        var8.field1958 = var6.field1999[arg1];
        var8.field1959 = arg1;
        var8.field1967 = var6.field1996 * arg2 * arg2 * var6.field1995[arg1] + 1024 >> 11;
        var8.field1961 = var6.field1997[arg1] & 0xFF;
        var8.field1962 = (arg1 << 8) - (var6.field2005[arg1] & 0x7FFF);
        var8.field1965 = 0;
        var8.field1966 = 0;
        var8.field1964 = 0;
        var8.field1968 = -1;
        var8.field1969 = 0;
        if (this.field1939[arg0] == 0) {
            var8.field1972 = class67.method1161(var7, this.method2472(var8), this.method2373(var8), this.method2399(var8));
        } else {
            var8.field1972 = class67.method1161(var7, this.method2472(var8), 0, this.method2399(var8));
            this.method2386(var8, var6.field2005[arg1] < 0);
        }
        if (var6.field2005[arg1] < 0) {
            var8.field1972.method1138(-1);
        }
        if (var8.field1958 >= 0) {
            class141 var9 = this.field1926[arg0][var8.field1958];
            if (var9 != null && var9.field1968 < 0) {
                this.field1942[arg0][var9.field1959] = null;
                var9.field1968 = 0;
            }
            this.field1926[arg0][var8.field1958] = var8;
        }
        this.field1927.field2014.method2278(var8);
        this.field1942[arg0][arg1] = var8;
    }

    @ObfuscatedName("ei.a(Lee;ZB)V")
    public void method2386(class141 arg0, boolean arg1) {
        int var3 = arg0.field1956.field1015.length;
        int var5;
        if (arg1 && arg0.field1956.field1018) {
            int var4 = var3 + var3 - arg0.field1956.field1014;
            var5 = (int) ((long) this.field1939[arg0.field1954] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1972.method1130(true);
            }
        } else {
            var5 = (int) ((long) this.field1939[arg0.field1954] * (long) var3 >> 6);
        }
        arg0.field1972.method1129(var5);
    }

    @ObfuscatedName("ei.b(IIII)V")
    public void method2387(int arg0, int arg1, int arg2) {
        class141 var4 = this.field1942[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1942[arg0][arg1] = null;
        if ((this.field1933[arg0] & 0x2) == 0) {
            var4.field1968 = 0;
            return;
        }
        for (class141 var5 = (class141) this.field1927.field2014.method2290(); var5 != null; var5 = (class141) this.field1927.field2014.method2285()) {
            if (var4.field1954 == var5.field1954 && var5.field1968 < 0 && var4 != var5) {
                var4.field1968 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ei.aq(IIIB)V")
    public void method2388(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ei.ac(IIB)V")
    public void method2389(int arg0, int arg1) {
    }

    @ObfuscatedName("ei.ae(IIB)V")
    public void method2394(int arg0, int arg1) {
        this.field1924[arg0] = arg1;
    }

    @ObfuscatedName("ei.ag(II)V")
    public void method2391(int arg0) {
        for (class141 var2 = (class141) this.field1927.field2014.method2290(); var2 != null; var2 = (class141) this.field1927.field2014.method2285()) {
            if (arg0 < 0 || var2.field1954 == arg0) {
                if (var2.field1972 != null) {
                    var2.field1972.method1134(Statics.field1032 / 100);
                    if (var2.field1972.method1182()) {
                        this.field1927.field2009.method882(var2.field1972);
                    }
                    var2.method2488();
                }
                if (var2.field1968 < 0) {
                    this.field1942[var2.field1954][var2.field1959] = null;
                }
                var2.method2273();
            }
        }
    }

    @ObfuscatedName("ei.ap(II)V")
    public void method2392(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2392(var2);
            }
            return;
        }
        this.field1943[arg0] = 12800;
        this.field1928[arg0] = 8192;
        this.field1934[arg0] = 16383;
        this.field1924[arg0] = 8192;
        this.field1945[arg0] = 0;
        this.field1935[arg0] = 8192;
        this.method2395(arg0);
        this.method2396(arg0);
        this.field1933[arg0] = 0;
        this.field1937[arg0] = 32767;
        this.field1946[arg0] = 256;
        this.field1939[arg0] = 0;
        this.method2424(arg0, 8192);
    }

    @ObfuscatedName("ei.az(II)V")
    public void method2393(int arg0) {
        for (class141 var2 = (class141) this.field1927.field2014.method2290(); var2 != null; var2 = (class141) this.field1927.field2014.method2285()) {
            if ((arg0 < 0 || var2.field1954 == arg0) && var2.field1968 < 0) {
                this.field1942[var2.field1954][var2.field1959] = null;
                var2.field1968 = 0;
            }
        }
    }

    @ObfuscatedName("ei.ab(S)V")
    public void method2454() {
        this.method2391(-1);
        this.method2392(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1931[var1] = this.field1930[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1932[var2] = this.field1930[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ei.ad(IB)V")
    public void method2395(int arg0) {
        if ((this.field1933[arg0] & 0x2) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1927.field2014.method2290(); var2 != null; var2 = (class141) this.field1927.field2014.method2285()) {
            if (var2.field1954 == arg0 && this.field1942[arg0][var2.field1959] == null && var2.field1968 < 0) {
                var2.field1968 = 0;
            }
        }
    }

    @ObfuscatedName("ei.ah(II)V")
    public void method2396(int arg0) {
        if ((this.field1933[arg0] & 0x4) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1927.field2014.method2290(); var2 != null; var2 = (class141) this.field1927.field2014.method2285()) {
            if (var2.field1954 == arg0) {
                var2.field1975 = 0;
            }
        }
    }

    @ObfuscatedName("ei.al(IB)V")
    public void method2397(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2387(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2385(var6, var7, var8);
            } else {
                this.method2387(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2388(var9, var10, var11);
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
                this.field1945[var12] = (var14 << 7) + (this.field1945[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1945[var12] = (this.field1945[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1935[var12] = (var14 << 7) + (this.field1935[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1935[var12] = (this.field1935[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1943[var12] = (var14 << 7) + (this.field1943[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1943[var12] = (this.field1943[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1928[var12] = (var14 << 7) + (this.field1928[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1928[var12] = (this.field1928[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1934[var12] = (var14 << 7) + (this.field1934[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1934[var12] = (this.field1934[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field1933[var12] |= 0x1;
                } else {
                    this.field1933[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field1933[var12] |= 0x2;
                } else {
                    this.method2395(var12);
                    this.field1933[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field1937[var12] = (var14 << 7) + (this.field1937[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field1937[var12] = (this.field1937[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field1937[var12] = (var14 << 7) + (this.field1937[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field1937[var12] = (this.field1937[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2391(var12);
            }
            if (var13 == 121) {
                this.method2392(var12);
            }
            if (var13 == 123) {
                this.method2393(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1937[var12];
                if (var15 == 16384) {
                    this.field1946[var12] = (var14 << 7) + (this.field1946[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1937[var12];
                if (var16 == 16384) {
                    this.field1946[var12] = (this.field1946[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field1939[var12] = (var14 << 7) + (this.field1939[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field1939[var12] = (this.field1939[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field1933[var12] |= 0x4;
                } else {
                    this.method2396(var12);
                    this.field1933[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2424(var12, (var14 << 7) + (this.field1940[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2424(var12, (this.field1940[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2431(var17, this.field1932[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2389(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2394(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2454();
            }
        }
    }

    @ObfuscatedName("ei.aa(IIB)V")
    public void method2424(int arg0, int arg1) {
        this.field1940[arg0] = arg1;
        this.field1941[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ei.an(Lee;I)I")
    public int method2472(class141 arg0) {
        int var2 = (arg0.field1974 * arg0.field1963 >> 12) + arg0.field1962;
        int var3 = ((this.field1924[arg0.field1954] - 8192) * this.field1946[arg0.field1954] >> 12) + var2;
        class138 var4 = arg0.field1957;
        if (var4.field1906 > 0 && (var4.field1905 > 0 || this.field1945[arg0.field1954] > 0)) {
            int var5 = var4.field1905 << 2;
            int var6 = var4.field1907 << 1;
            if (arg0.field1970 < var6) {
                var5 = arg0.field1970 * var5 / var6;
            }
            int var7 = (this.field1945[arg0.field1954] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1971 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1956.field1016 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1032 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ei.at(Lee;B)I")
    public int method2373(class141 arg0) {
        class138 var2 = arg0.field1957;
        int var3 = this.field1943[arg0.field1954] * this.field1934[arg0.field1954] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1967 * var4 + 16384 >> 15;
        int var6 = this.field1949 * var5 + 128 >> 8;
        if (var2.field1899 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1965 * 1.953125E-5D * (double) var2.field1899) + 0.5D);
        }
        if (var2.field1908 != null) {
            int var7 = arg0.field1966;
            int var8 = var2.field1908[arg0.field1964 + 1];
            if (arg0.field1964 < var2.field1908.length - 2) {
                int var9 = (var2.field1908[arg0.field1964] & 0xFF) << 8;
                int var10 = (var2.field1908[arg0.field1964 + 2] & 0xFF) << 8;
                var8 += (var2.field1908[arg0.field1964 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1968 > 0 && var2.field1900 != null) {
            int var11 = arg0.field1968;
            int var12 = var2.field1900[arg0.field1969 + 1];
            if (arg0.field1969 < var2.field1900.length - 2) {
                int var13 = (var2.field1900[arg0.field1969] & 0xFF) << 8;
                int var14 = (var2.field1900[arg0.field1969 + 2] & 0xFF) << 8;
                var12 += (var2.field1900[arg0.field1969 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ei.au(Lee;B)I")
    public int method2399(class141 arg0) {
        int var2 = this.field1928[arg0.field1954];
        return var2 < 8192 ? arg0.field1961 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1961) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ei.r()Lbb;")
    public synchronized class69 method887() {
        return this.field1927;
    }

    @ObfuscatedName("ei.c()Lbb;")
    public synchronized class69 method914() {
        return null;
    }

    @ObfuscatedName("ei.z()I")
    public synchronized int method888() {
        return 0;
    }

    @ObfuscatedName("ei.q([III)V")
    public synchronized void method905(int[] arg0, int arg1, int arg2) {
        if (this.field1944.method2496()) {
            int var4 = this.field1951 * this.field1944.field1982 / Statics.field1032;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1948;
                if (this.field1938 - var5 >= 0L) {
                    this.field1948 = var5;
                    break;
                }
                int var7 = (int) ((this.field1938 - this.field1948 + (long) var4 - 1L) / (long) var4);
                this.field1948 += (long) var4 * (long) var7;
                this.field1927.method905(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2402();
            } while (this.field1944.method2496());
        }
        this.field1927.method905(arg0, arg1, arg2);
    }

    @ObfuscatedName("ei.y(I)V")
    public synchronized void method897(int arg0) {
        if (this.field1944.method2496()) {
            int var2 = this.field1951 * this.field1944.field1982 / Statics.field1032;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1948;
                if (this.field1938 - var3 >= 0L) {
                    this.field1948 = var3;
                    break;
                }
                int var5 = (int) ((this.field1938 - this.field1948 + (long) var2 - 1L) / (long) var2);
                this.field1948 += (long) var2 * (long) var5;
                this.field1927.method897(var5);
                arg0 -= var5;
                this.method2402();
            } while (this.field1944.method2496());
        }
        this.field1927.method897(arg0);
    }

    @ObfuscatedName("ei.ak(I)V")
    public void method2402() {
        int var1 = this.field1929;
        int var2 = this.field1947;
        long var3 = this.field1938;
        while (this.field1947 == var2) {
            while (this.field1944.field1983[var1] == var2) {
                this.field1944.method2498(var1);
                int var5 = this.field1944.method2506(var1);
                if (var5 == 1) {
                    this.field1944.method2493();
                    this.field1944.method2499(var1);
                    if (this.field1944.method2538()) {
                        if (!this.field1936 || var2 == 0) {
                            this.method2454();
                            this.field1944.method2495();
                            return;
                        }
                        this.field1944.method2507(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2397(var5);
                }
                this.field1944.method2531(var1);
                this.field1944.method2499(var1);
            }
            var1 = this.field1944.method2505();
            var2 = this.field1944.field1983[var1];
            var3 = this.field1944.method2504(var2);
        }
        this.field1929 = var1;
        this.field1947 = var2;
        this.field1938 = var3;
    }

    @ObfuscatedName("ei.ar(Lee;S)Z")
    public boolean method2416(class141 arg0) {
        if (arg0.field1972 != null) {
            return false;
        }
        if (arg0.field1968 >= 0) {
            arg0.method2273();
            if (arg0.field1958 > 0 && this.field1926[arg0.field1954][arg0.field1958] == arg0) {
                this.field1926[arg0.field1954][arg0.field1958] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ei.aj(Lee;[IIII)Z")
    public boolean method2427(class141 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1960 = Statics.field1032 / 100;
        if (arg0.field1968 >= 0 && arg0.field1972 == null || arg0.field1972.method1171()) {
            arg0.method2488();
            arg0.method2273();
            if (arg0.field1958 > 0 && this.field1926[arg0.field1954][arg0.field1958] == arg0) {
                this.field1926[arg0.field1954][arg0.field1958] = null;
            }
            return true;
        }
        int var5 = arg0.field1974;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1935[arg0.field1954] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1974 = var6;
        }
        arg0.field1972.method1135(this.method2472(arg0));
        class138 var7 = arg0.field1957;
        boolean var8 = false;
        arg0.field1970++;
        arg0.field1971 += var7.field1906;
        double var9 = (double) ((arg0.field1959 - 60 << 8) + (arg0.field1974 * arg0.field1963 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1899 > 0) {
            if (var7.field1901 > 0) {
                arg0.field1965 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1901 * var9) + 0.5D);
            } else {
                arg0.field1965 += 128;
            }
        }
        if (var7.field1908 != null) {
            if (var7.field1902 > 0) {
                arg0.field1966 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1902 * var9) + 0.5D);
            } else {
                arg0.field1966 += 128;
            }
            while (arg0.field1964 < var7.field1908.length - 2 && arg0.field1966 > (var7.field1908[arg0.field1964 + 2] & 0xFF) << 8) {
                arg0.field1964 += 2;
            }
            if (arg0.field1964 == var7.field1908.length - 2 && var7.field1908[arg0.field1964 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1968 >= 0 && var7.field1900 != null && (this.field1933[arg0.field1954] & 0x1) == 0 && (arg0.field1958 < 0 || this.field1926[arg0.field1954][arg0.field1958] != arg0)) {
            if (var7.field1903 > 0) {
                arg0.field1968 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1903 * var9) + 0.5D);
            } else {
                arg0.field1968 += 128;
            }
            while (arg0.field1969 < var7.field1900.length - 2 && arg0.field1968 > (var7.field1900[arg0.field1969 + 2] & 0xFF) << 8) {
                arg0.field1969 += 2;
            }
            if (arg0.field1969 == var7.field1900.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1972.method1133(arg0.field1960, this.method2373(arg0), this.method2399(arg0));
            return false;
        }
        arg0.field1972.method1134(arg0.field1960);
        if (arg1 == null) {
            arg0.field1972.method897(arg3);
        } else {
            arg0.field1972.method905(arg1, arg2, arg3);
        }
        if (arg0.field1972.method1182()) {
            this.field1927.field2009.method882(arg0.field1972);
        }
        arg0.method2488();
        if (arg0.field1968 >= 0) {
            arg0.method2273();
            if (arg0.field1958 > 0 && this.field1926[arg0.field1954][arg0.field1958] == arg0) {
                this.field1926[arg0.field1954][arg0.field1958] = null;
            }
        }
        return true;
    }
}
