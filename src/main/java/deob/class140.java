package deob;

@ObfuscatedName("ej")
public class class140 extends class69 {

    @ObfuscatedName("ej.x")
    public class126 field1931 = new class126(128);

    @ObfuscatedName("ej.n")
    public int field1928 = 256;

    @ObfuscatedName("ej.g")
    public int field1929 = 1000000;

    @ObfuscatedName("ej.v")
    public int[] field1930 = new int[16];

    @ObfuscatedName("ej.y")
    public int[] field1937 = new int[16];

    @ObfuscatedName("ej.p")
    public int[] field1949 = new int[16];

    @ObfuscatedName("ej.j")
    public int[] field1933 = new int[16];

    @ObfuscatedName("ej.m")
    public int[] field1934 = new int[16];

    @ObfuscatedName("ej.a")
    public int[] field1955 = new int[16];

    @ObfuscatedName("ej.i")
    public int[] field1936 = new int[16];

    @ObfuscatedName("ej.s")
    public int[] field1927 = new int[16];

    @ObfuscatedName("ej.k")
    public int[] field1942 = new int[16];

    @ObfuscatedName("ej.r")
    public int[] field1940 = new int[16];

    @ObfuscatedName("ej.u")
    public int[] field1946 = new int[16];

    @ObfuscatedName("ej.e")
    public int[] field1943 = new int[16];

    @ObfuscatedName("ej.h")
    public int[] field1944 = new int[16];

    @ObfuscatedName("ej.d")
    public int[] field1945 = new int[16];

    @ObfuscatedName("ej.z")
    public int[] field1951 = new int[16];

    @ObfuscatedName("ej.t")
    public class141[][] field1947 = new class141[16][128];

    @ObfuscatedName("ej.ab")
    public class141[][] field1948 = new class141[16][128];

    @ObfuscatedName("ej.ac")
    public class142 field1938 = new class142();

    @ObfuscatedName("ej.au")
    public boolean field1950;

    @ObfuscatedName("ej.al")
    public int field1932;

    @ObfuscatedName("ej.ae")
    public int field1952;

    @ObfuscatedName("ej.ad")
    public long field1953;

    @ObfuscatedName("ej.aq")
    public long field1954;

    @ObfuscatedName("ej.aa")
    public class144 field1935 = new class144(this);

    public class140() {
        this.method2442();
    }

    @ObfuscatedName("ej.x(IB)V")
    public synchronized void method2423(int arg0) {
        this.field1928 = arg0;
    }

    @ObfuscatedName("ej.n(I)I")
    public int method2529() {
        return this.field1928;
    }

    @ObfuscatedName("ej.g(Lep;Lgo;Lbe;II)Z")
    public synchronized boolean method2483(class145 arg0, class183 arg1, class61 arg2, int arg3) {
        arg0.method2607();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class135 var7 = (class135) arg0.field2008.method2289(); var7 != null; var7 = (class135) arg0.field2008.method2290()) {
            int var8 = (int) var7.field1884;
            class143 var9 = (class143) this.field1931.method2286((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3158(var8);
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
                this.field1931.method2287(var11, (long) var8);
            }
            if (!var9.method2591(arg2, var7.field1900, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2612();
        }
        return var5;
    }

    @ObfuscatedName("ej.v(B)V")
    public synchronized void method2426() {
        for (class143 var1 = (class143) this.field1931.method2289(); var1 != null; var1 = (class143) this.field1931.method2290()) {
            var1.method2589();
        }
    }

    @ObfuscatedName("ej.y(I)V")
    public synchronized void method2427() {
        for (class143 var1 = (class143) this.field1931.method2289(); var1 != null; var1 = (class143) this.field1931.method2290()) {
            var1.method2327();
        }
    }

    @ObfuscatedName("ej.f(Lep;ZI)V")
    public synchronized void method2428(class145 arg0, boolean arg1) {
        this.method2507();
        this.field1938.method2548(arg0.field2009);
        this.field1950 = arg1;
        this.field1953 = 0L;
        int var3 = this.field1938.method2542();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1938.method2569(var4);
            this.field1938.method2546(var4);
            this.field1938.method2544(var4);
        }
        this.field1932 = this.field1938.method2551();
        this.field1952 = this.field1938.field1987[this.field1932];
        this.field1954 = this.field1938.method2561(this.field1952);
    }

    @ObfuscatedName("ej.q(I)V")
    public synchronized void method2507() {
        this.field1938.method2540();
        this.method2442();
    }

    @ObfuscatedName("ej.c(B)Z")
    public synchronized boolean method2430() {
        return this.field1938.method2543();
    }

    @ObfuscatedName("ej.b(IIS)V")
    public synchronized void method2431(int arg0, int arg1) {
        this.method2432(arg0, arg1);
    }

    @ObfuscatedName("ej.w(IIS)V")
    public void method2432(int arg0, int arg1) {
        this.field1933[arg0] = arg1;
        this.field1955[arg0] = arg1 & 0xFFFFFF80;
        this.method2433(arg0, arg1);
    }

    @ObfuscatedName("ej.l(III)V")
    public void method2433(int arg0, int arg1) {
        if (this.field1934[arg0] != arg1) {
            this.field1934[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1948[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ej.r(IIII)V")
    public void method2434(int arg0, int arg1, int arg2) {
        this.method2436(arg0, arg1, 64);
        if ((this.field1940[arg0] & 0x2) != 0) {
            for (class141 var4 = (class141) this.field1935.field2004.method2342(); var4 != null; var4 = (class141) this.field1935.field2004.method2339()) {
                if (var4.field1969 == arg0 && var4.field1971 < 0) {
                    this.field1947[arg0][var4.field1962] = null;
                    this.field1947[arg0][arg1] = var4;
                    int var5 = (var4.field1967 * var4.field1966 >> 12) + var4.field1965;
                    var4.field1965 += arg1 - var4.field1962 << 8;
                    var4.field1966 = var5 - var4.field1965;
                    var4.field1967 = 4096;
                    var4.field1962 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field1931.method2286((long) this.field1934[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field1994[arg1];
        if (var7 == null) {
            return;
        }
        class141 var8 = new class141();
        var8.field1969 = arg0;
        var8.field1958 = var6;
        var8.field1959 = var7;
        var8.field1960 = var6.field1999[arg1];
        var8.field1961 = var6.field1998[arg1];
        var8.field1962 = arg1;
        var8.field1963 = var6.field1996 * arg2 * arg2 * var6.field2002[arg1] + 1024 >> 11;
        var8.field1964 = var6.field1997[arg1] & 0xFF;
        var8.field1965 = (arg1 << 8) - (var6.field1993[arg1] & 0x7FFF);
        var8.field1957 = 0;
        var8.field1973 = 0;
        var8.field1974 = 0;
        var8.field1971 = -1;
        var8.field1970 = 0;
        if (this.field1944[arg0] == 0) {
            var8.field1975 = class67.method1216(var7, this.method2447(var8), this.method2424(var8), this.method2449(var8));
        } else {
            var8.field1975 = class67.method1216(var7, this.method2447(var8), 0, this.method2449(var8));
            this.method2435(var8, var6.field1993[arg1] < 0);
        }
        if (var6.field1993[arg1] < 0) {
            var8.field1975.method1218(-1);
        }
        if (var8.field1961 >= 0) {
            class141 var9 = this.field1948[arg0][var8.field1961];
            if (var9 != null && var9.field1971 < 0) {
                this.field1947[arg0][var9.field1962] = null;
                var9.field1971 = 0;
            }
            this.field1948[arg0][var8.field1961] = var8;
        }
        this.field1935.field2004.method2360(var8);
        this.field1947[arg0][arg1] = var8;
    }

    @ObfuscatedName("ej.u(Ley;ZI)V")
    public void method2435(class141 arg0, boolean arg1) {
        int var3 = arg0.field1959.field1035.length;
        int var5;
        if (arg1 && arg0.field1959.field1038) {
            int var4 = var3 + var3 - arg0.field1959.field1037;
            var5 = (int) ((long) this.field1944[arg0.field1969] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1975.method1224(true);
            }
        } else {
            var5 = (int) ((long) this.field1944[arg0.field1969] * (long) var3 >> 6);
        }
        arg0.field1975.method1279(var5);
    }

    @ObfuscatedName("ej.e(IIII)V")
    public void method2436(int arg0, int arg1, int arg2) {
        class141 var4 = this.field1947[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1947[arg0][arg1] = null;
        if ((this.field1940[arg0] & 0x2) == 0) {
            var4.field1971 = 0;
            return;
        }
        for (class141 var5 = (class141) this.field1935.field2004.method2352(); var5 != null; var5 = (class141) this.field1935.field2004.method2341()) {
            if (var4.field1969 == var5.field1969 && var5.field1971 < 0 && var4 != var5) {
                var4.field1971 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ej.h(IIII)V")
    public void method2437(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ej.d(IIB)V")
    public void method2527(int arg0, int arg1) {
    }

    @ObfuscatedName("ej.as(III)V")
    public void method2438(int arg0, int arg1) {
        this.field1936[arg0] = arg1;
    }

    @ObfuscatedName("ej.ao(IB)V")
    public void method2439(int arg0) {
        for (class141 var2 = (class141) this.field1935.field2004.method2352(); var2 != null; var2 = (class141) this.field1935.field2004.method2341()) {
            if (arg0 < 0 || var2.field1969 == arg0) {
                if (var2.field1975 != null) {
                    var2.field1975.method1228(Statics.field1054 / 100);
                    if (var2.field1975.method1232()) {
                        this.field1935.field2005.method1002(var2.field1975);
                    }
                    var2.method2532();
                }
                if (var2.field1971 < 0) {
                    this.field1947[var2.field1969][var2.field1962] = null;
                }
                var2.method2327();
            }
        }
    }

    @ObfuscatedName("ej.ax(II)V")
    public void method2440(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2440(var2);
            }
            return;
        }
        this.field1930[arg0] = 12800;
        this.field1937[arg0] = 8192;
        this.field1949[arg0] = 16383;
        this.field1936[arg0] = 8192;
        this.field1927[arg0] = 0;
        this.field1942[arg0] = 8192;
        this.method2443(arg0);
        this.method2528(arg0);
        this.field1940[arg0] = 0;
        this.field1946[arg0] = 32767;
        this.field1943[arg0] = 256;
        this.field1944[arg0] = 0;
        this.method2429(arg0, 8192);
    }

    @ObfuscatedName("ej.an(II)V")
    public void method2441(int arg0) {
        for (class141 var2 = (class141) this.field1935.field2004.method2352(); var2 != null; var2 = (class141) this.field1935.field2004.method2341()) {
            if ((arg0 < 0 || var2.field1969 == arg0) && var2.field1971 < 0) {
                this.field1947[var2.field1969][var2.field1962] = null;
                var2.field1971 = 0;
            }
        }
    }

    @ObfuscatedName("ej.aj(I)V")
    public void method2442() {
        this.method2439(-1);
        this.method2440(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1934[var1] = this.field1933[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1955[var2] = this.field1933[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ej.ar(II)V")
    public void method2443(int arg0) {
        if ((this.field1940[arg0] & 0x2) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1935.field2004.method2352(); var2 != null; var2 = (class141) this.field1935.field2004.method2341()) {
            if (var2.field1969 == arg0 && this.field1947[arg0][var2.field1962] == null && var2.field1971 < 0) {
                var2.field1971 = 0;
            }
        }
    }

    @ObfuscatedName("ej.az(II)V")
    public void method2528(int arg0) {
        if ((this.field1940[arg0] & 0x4) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1935.field2004.method2352(); var2 != null; var2 = (class141) this.field1935.field2004.method2341()) {
            if (var2.field1969 == arg0) {
                var2.field1977 = 0;
            }
        }
    }

    @ObfuscatedName("ej.ap(IB)V")
    public void method2511(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2436(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2434(var6, var7, var8);
            } else {
                this.method2436(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2437(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field1955[var12] = (var14 << 14) + (this.field1955[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field1955[var12] = (var14 << 7) + (this.field1955[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field1927[var12] = (var14 << 7) + (this.field1927[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1927[var12] = (this.field1927[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1942[var12] = (var14 << 7) + (this.field1942[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1942[var12] = (this.field1942[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1930[var12] = (var14 << 7) + (this.field1930[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1930[var12] = (this.field1930[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1937[var12] = (var14 << 7) + (this.field1937[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1937[var12] = (this.field1937[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1949[var12] = (var14 << 7) + (this.field1949[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1949[var12] = (this.field1949[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field1940[var12] |= 0x1;
                } else {
                    this.field1940[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field1940[var12] |= 0x2;
                } else {
                    this.method2443(var12);
                    this.field1940[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field1946[var12] = (var14 << 7) + (this.field1946[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field1946[var12] = (this.field1946[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field1946[var12] = (var14 << 7) + (this.field1946[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field1946[var12] = (this.field1946[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2439(var12);
            }
            if (var13 == 121) {
                this.method2440(var12);
            }
            if (var13 == 123) {
                this.method2441(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1946[var12];
                if (var15 == 16384) {
                    this.field1943[var12] = (var14 << 7) + (this.field1943[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1946[var12];
                if (var16 == 16384) {
                    this.field1943[var12] = (this.field1943[var12] & 0xFFFFFF80) + var14;
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
                    this.field1940[var12] |= 0x4;
                } else {
                    this.method2528(var12);
                    this.field1940[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2429(var12, (var14 << 7) + (this.field1945[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2429(var12, (this.field1945[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2433(var17, this.field1955[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2527(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2438(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2442();
            }
        }
    }

    @ObfuscatedName("ej.aw(III)V")
    public void method2429(int arg0, int arg1) {
        this.field1945[arg0] = arg1;
        this.field1951[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ej.ay(Ley;B)I")
    public int method2447(class141 arg0) {
        int var2 = (arg0.field1967 * arg0.field1966 >> 12) + arg0.field1965;
        int var3 = ((this.field1936[arg0.field1969] - 8192) * this.field1943[arg0.field1969] >> 12) + var2;
        class138 var4 = arg0.field1960;
        if (var4.field1912 > 0 && (var4.field1911 > 0 || this.field1927[arg0.field1969] > 0)) {
            int var5 = var4.field1911 << 2;
            int var6 = var4.field1913 << 1;
            if (arg0.field1976 < var6) {
                var5 = arg0.field1976 * var5 / var6;
            }
            int var7 = (this.field1927[arg0.field1969] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1968 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1959.field1036 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1054 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ej.ai(Ley;B)I")
    public int method2424(class141 arg0) {
        class138 var2 = arg0.field1960;
        int var3 = this.field1930[arg0.field1969] * this.field1949[arg0.field1969] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1963 * var4 + 16384 >> 15;
        int var6 = this.field1928 * var5 + 128 >> 8;
        if (var2.field1915 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1957 * 1.953125E-5D * (double) var2.field1915) + 0.5D);
        }
        if (var2.field1909 != null) {
            int var7 = arg0.field1973;
            int var8 = var2.field1909[arg0.field1974 + 1];
            if (arg0.field1974 < var2.field1909.length - 2) {
                int var9 = (var2.field1909[arg0.field1974] & 0xFF) << 8;
                int var10 = (var2.field1909[arg0.field1974 + 2] & 0xFF) << 8;
                var8 += (var2.field1909[arg0.field1974 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1971 > 0 && var2.field1905 != null) {
            int var11 = arg0.field1971;
            int var12 = var2.field1905[arg0.field1970 + 1];
            if (arg0.field1970 < var2.field1905.length - 2) {
                int var13 = (var2.field1905[arg0.field1970] & 0xFF) << 8;
                int var14 = (var2.field1905[arg0.field1970 + 2] & 0xFF) << 8;
                var12 += (var2.field1905[arg0.field1970 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ej.at(Ley;I)I")
    public int method2449(class141 arg0) {
        int var2 = this.field1937[arg0.field1969];
        return var2 < 8192 ? arg0.field1964 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1964) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ej.p()Lbs;")
    public synchronized class69 method982() {
        return this.field1935;
    }

    @ObfuscatedName("ej.j()Lbs;")
    public synchronized class69 method983() {
        return null;
    }

    @ObfuscatedName("ej.s()I")
    public synchronized int method984() {
        return 0;
    }

    @ObfuscatedName("ej.k([III)V")
    public synchronized void method985(int[] arg0, int arg1, int arg2) {
        if (this.field1938.method2543()) {
            int var4 = this.field1929 * this.field1938.field1988 / Statics.field1054;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1953;
                if (this.field1954 - var5 >= 0L) {
                    this.field1953 = var5;
                    break;
                }
                int var7 = (int) ((this.field1954 - this.field1953 + (long) var4 - 1L) / (long) var4);
                this.field1953 += (long) var4 * (long) var7;
                this.field1935.method985(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2451();
            } while (this.field1938.method2543());
        }
        this.field1935.method985(arg0, arg1, arg2);
    }

    @ObfuscatedName("ej.o(I)V")
    public synchronized void method987(int arg0) {
        if (this.field1938.method2543()) {
            int var2 = this.field1929 * this.field1938.field1988 / Statics.field1054;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1953;
                if (this.field1954 - var3 >= 0L) {
                    this.field1953 = var3;
                    break;
                }
                int var5 = (int) ((this.field1954 - this.field1953 + (long) var2 - 1L) / (long) var2);
                this.field1953 += (long) var2 * (long) var5;
                this.field1935.method987(var5);
                arg0 -= var5;
                this.method2451();
            } while (this.field1938.method2543());
        }
        this.field1935.method987(arg0);
    }

    @ObfuscatedName("ej.ah(I)V")
    public void method2451() {
        int var1 = this.field1932;
        int var2 = this.field1952;
        long var3 = this.field1954;
        while (this.field1952 == var2) {
            while (this.field1938.field1987[var1] == var2) {
                this.field1938.method2569(var1);
                int var5 = this.field1938.method2577(var1);
                if (var5 == 1) {
                    this.field1938.method2545();
                    this.field1938.method2544(var1);
                    if (this.field1938.method2552()) {
                        if (!this.field1950 || var2 == 0) {
                            this.method2442();
                            this.field1938.method2540();
                            return;
                        }
                        this.field1938.method2566(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2511(var5);
                }
                this.field1938.method2546(var1);
                this.field1938.method2544(var1);
            }
            var1 = this.field1938.method2551();
            var2 = this.field1938.field1987[var1];
            var3 = this.field1938.method2561(var2);
        }
        this.field1932 = var1;
        this.field1952 = var2;
        this.field1954 = var3;
    }

    @ObfuscatedName("ej.am(Ley;I)Z")
    public boolean method2452(class141 arg0) {
        if (arg0.field1975 != null) {
            return false;
        }
        if (arg0.field1971 >= 0) {
            arg0.method2327();
            if (arg0.field1961 > 0 && this.field1948[arg0.field1969][arg0.field1961] == arg0) {
                this.field1948[arg0.field1969][arg0.field1961] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ej.ak(Ley;[IIII)Z")
    public boolean method2520(class141 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1972 = Statics.field1054 / 100;
        if (arg0.field1971 >= 0 && arg0.field1975 == null || arg0.field1975.method1231()) {
            arg0.method2532();
            arg0.method2327();
            if (arg0.field1961 > 0 && this.field1948[arg0.field1969][arg0.field1961] == arg0) {
                this.field1948[arg0.field1969][arg0.field1961] = null;
            }
            return true;
        }
        int var5 = arg0.field1967;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1942[arg0.field1969] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1967 = var6;
        }
        arg0.field1975.method1229(this.method2447(arg0));
        class138 var7 = arg0.field1960;
        boolean var8 = false;
        arg0.field1976++;
        arg0.field1968 += var7.field1912;
        double var9 = (double) ((arg0.field1962 - 60 << 8) + (arg0.field1967 * arg0.field1966 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1915 > 0) {
            if (var7.field1906 > 0) {
                arg0.field1957 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1906 * var9) + 0.5D);
            } else {
                arg0.field1957 += 128;
            }
        }
        if (var7.field1909 != null) {
            if (var7.field1908 > 0) {
                arg0.field1973 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1908 * var9) + 0.5D);
            } else {
                arg0.field1973 += 128;
            }
            while (arg0.field1974 < var7.field1909.length - 2 && arg0.field1973 > (var7.field1909[arg0.field1974 + 2] & 0xFF) << 8) {
                arg0.field1974 += 2;
            }
            if (arg0.field1974 == var7.field1909.length - 2 && var7.field1909[arg0.field1974 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1971 >= 0 && var7.field1905 != null && (this.field1940[arg0.field1969] & 0x1) == 0 && (arg0.field1961 < 0 || this.field1948[arg0.field1969][arg0.field1961] != arg0)) {
            if (var7.field1907 > 0) {
                arg0.field1971 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1907 * var9) + 0.5D);
            } else {
                arg0.field1971 += 128;
            }
            while (arg0.field1970 < var7.field1905.length - 2 && arg0.field1971 > (var7.field1905[arg0.field1970 + 2] & 0xFF) << 8) {
                arg0.field1970 += 2;
            }
            if (arg0.field1970 == var7.field1905.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1975.method1227(arg0.field1972, this.method2424(arg0), this.method2449(arg0));
            return false;
        }
        arg0.field1975.method1228(arg0.field1972);
        if (arg1 == null) {
            arg0.field1975.method987(arg3);
        } else {
            arg0.field1975.method985(arg1, arg2, arg3);
        }
        if (arg0.field1975.method1232()) {
            this.field1935.field2005.method1002(arg0.field1975);
        }
        arg0.method2532();
        if (arg0.field1971 >= 0) {
            arg0.method2327();
            if (arg0.field1961 > 0 && this.field1948[arg0.field1969][arg0.field1961] == arg0) {
                this.field1948[arg0.field1969][arg0.field1961] = null;
            }
        }
        return true;
    }
}
