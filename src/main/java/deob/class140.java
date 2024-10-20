package deob;

@ObfuscatedName("ed")
public class class140 extends class69 {

    @ObfuscatedName("ed.u")
    public class126 field1921 = new class126(128);

    @ObfuscatedName("ed.x")
    public int field1909 = 256;

    @ObfuscatedName("ed.i")
    public int field1908 = 1000000;

    @ObfuscatedName("ed.a")
    public int[] field1931 = new int[16];

    @ObfuscatedName("ed.f")
    public int[] field1912 = new int[16];

    @ObfuscatedName("ed.c")
    public int[] field1913 = new int[16];

    @ObfuscatedName("ed.d")
    public int[] field1926 = new int[16];

    @ObfuscatedName("ed.l")
    public int[] field1917 = new int[16];

    @ObfuscatedName("ed.g")
    public int[] field1916 = new int[16];

    @ObfuscatedName("ed.z")
    public int[] field1911 = new int[16];

    @ObfuscatedName("ed.t")
    public int[] field1928 = new int[16];

    @ObfuscatedName("ed.m")
    public int[] field1919 = new int[16];

    @ObfuscatedName("ed.y")
    public int[] field1920 = new int[16];

    @ObfuscatedName("ed.h")
    public int[] field1914 = new int[16];

    @ObfuscatedName("ed.s")
    public int[] field1922 = new int[16];

    @ObfuscatedName("ed.w")
    public int[] field1923 = new int[16];

    @ObfuscatedName("ed.n")
    public int[] field1924 = new int[16];

    @ObfuscatedName("ed.o")
    public int[] field1925 = new int[16];

    @ObfuscatedName("ed.b")
    public class141[][] field1910 = new class141[16][128];

    @ObfuscatedName("ed.aj")
    public class141[][] field1927 = new class141[16][128];

    @ObfuscatedName("ed.ag")
    public class142 field1915 = new class142();

    @ObfuscatedName("ed.al")
    public boolean field1929;

    @ObfuscatedName("ed.an")
    public int field1930;

    @ObfuscatedName("ed.af")
    public int field1935;

    @ObfuscatedName("ed.aa")
    public long field1932;

    @ObfuscatedName("ed.ax")
    public long field1918;

    @ObfuscatedName("ed.ai")
    public class144 field1934 = new class144(this);

    public class140() {
        this.method2348();
    }

    @ObfuscatedName("ed.u(II)V")
    public synchronized void method2380(int arg0) {
        this.field1909 = arg0;
    }

    @ObfuscatedName("ed.x(I)I")
    public int method2411() {
        return this.field1909;
    }

    @ObfuscatedName("ed.i(Leu;Lgt;Lbn;II)Z")
    public synchronized boolean method2330(class145 arg0, class183 arg1, class61 arg2, int arg3) {
        arg0.method2513();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class135 var7 = (class135) arg0.field1995.method2195(); var7 != null; var7 = (class135) arg0.field1995.method2194()) {
            int var8 = (int) var7.field1867;
            class143 var9 = (class143) this.field1921.method2190((long) var8);
            if (var9 == null) {
                var9 = class143.method674(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field1921.method2191(var9, (long) var8);
            }
            if (!var9.method2500(arg2, var7.field1883, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2514();
        }
        return var5;
    }

    @ObfuscatedName("ed.a(I)V")
    public synchronized void method2343() {
        for (class143 var1 = (class143) this.field1921.method2195(); var1 != null; var1 = (class143) this.field1921.method2194()) {
            var1.method2494();
        }
    }

    @ObfuscatedName("ed.c(I)V")
    public synchronized void method2332() {
        for (class143 var1 = (class143) this.field1921.method2195(); var1 != null; var1 = (class143) this.field1921.method2194()) {
            var1.method2228();
        }
    }

    @ObfuscatedName("ed.q(Leu;ZI)V")
    public synchronized void method2333(class145 arg0, boolean arg1) {
        this.method2404();
        this.field1915.method2442(arg0.field1994);
        this.field1929 = arg1;
        this.field1932 = 0L;
        int var3 = this.field1915.method2445();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1915.method2446(var4);
            this.field1915.method2449(var4);
            this.field1915.method2447(var4);
        }
        this.field1930 = this.field1915.method2454();
        this.field1935 = this.field1915.field1967[this.field1930];
        this.field1918 = this.field1915.method2453(this.field1935);
    }

    @ObfuscatedName("ed.v(I)V")
    public synchronized void method2404() {
        this.field1915.method2443();
        this.method2348();
    }

    @ObfuscatedName("ed.j(I)Z")
    public synchronized boolean method2335() {
        return this.field1915.method2444();
    }

    @ObfuscatedName("ed.p(III)V")
    public synchronized void method2413(int arg0, int arg1) {
        this.method2365(arg0, arg1);
    }

    @ObfuscatedName("ed.k(IIB)V")
    public void method2365(int arg0, int arg1) {
        this.field1926[arg0] = arg1;
        this.field1916[arg0] = arg1 & 0xFFFFFF80;
        this.method2338(arg0, arg1);
    }

    @ObfuscatedName("ed.r(III)V")
    public void method2338(int arg0, int arg1) {
        if (this.field1917[arg0] != arg1) {
            this.field1917[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1927[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ed.y(IIIB)V")
    public void method2327(int arg0, int arg1, int arg2) {
        this.method2341(arg0, arg1, 64);
        if ((this.field1920[arg0] & 0x2) != 0) {
            for (class141 var4 = (class141) this.field1934.field1993.method2243(); var4 != null; var4 = (class141) this.field1934.field1993.method2241()) {
                if (var4.field1958 == arg0 && var4.field1950 < 0) {
                    this.field1910[arg0][var4.field1941] = null;
                    this.field1910[arg0][arg1] = var4;
                    int var5 = (var4.field1952 * var4.field1945 >> 12) + var4.field1936;
                    var4.field1936 += arg1 - var4.field1941 << 8;
                    var4.field1945 = var5 - var4.field1936;
                    var4.field1952 = 4096;
                    var4.field1941 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field1921.method2190((long) this.field1917[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field1978[arg1];
        if (var7 == null) {
            return;
        }
        class141 var8 = new class141();
        var8.field1958 = arg0;
        var8.field1944 = var6;
        var8.field1938 = var7;
        var8.field1939 = var6.field1982[arg1];
        var8.field1940 = var6.field1981[arg1];
        var8.field1941 = arg1;
        var8.field1942 = var6.field1987 * arg2 * arg2 * var6.field1980[arg1] + 1024 >> 11;
        var8.field1943 = var6.field1979[arg1] & 0xFF;
        var8.field1936 = (arg1 << 8) - (var6.field1983[arg1] & 0x7FFF);
        var8.field1947 = 0;
        var8.field1948 = 0;
        var8.field1953 = 0;
        var8.field1950 = -1;
        var8.field1951 = 0;
        if (this.field1923[arg0] == 0) {
            var8.field1954 = class67.method1101(var7, this.method2337(var8), this.method2354(var8), this.method2355(var8));
        } else {
            var8.field1954 = class67.method1101(var7, this.method2337(var8), 0, this.method2355(var8));
            this.method2425(var8, var6.field1983[arg1] < 0);
        }
        if (var6.field1983[arg1] < 0) {
            var8.field1954.method1103(-1);
        }
        if (var8.field1940 >= 0) {
            class141 var9 = this.field1927[arg0][var8.field1940];
            if (var9 != null && var9.field1950 < 0) {
                this.field1910[arg0][var9.field1941] = null;
                var9.field1950 = 0;
            }
            this.field1927[arg0][var8.field1940] = var8;
        }
        this.field1934.field1993.method2245(var8);
        this.field1910[arg0][arg1] = var8;
    }

    @ObfuscatedName("ed.h(Leg;ZI)V")
    public void method2425(class141 arg0, boolean arg1) {
        int var3 = arg0.field1938.field1016.length;
        int var5;
        if (arg1 && arg0.field1938.field1019) {
            int var4 = var3 + var3 - arg0.field1938.field1017;
            var5 = (int) ((long) this.field1923[arg0.field1958] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1954.method1110(true);
            }
        } else {
            var5 = (int) ((long) this.field1923[arg0.field1958] * (long) var3 >> 6);
        }
        arg0.field1954.method1109(var5);
    }

    @ObfuscatedName("ed.s(IIII)V")
    public void method2341(int arg0, int arg1, int arg2) {
        class141 var4 = this.field1910[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1910[arg0][arg1] = null;
        if ((this.field1920[arg0] & 0x2) == 0) {
            var4.field1950 = 0;
            return;
        }
        for (class141 var5 = (class141) this.field1934.field1993.method2242(); var5 != null; var5 = (class141) this.field1934.field1993.method2244()) {
            if (var4.field1958 == var5.field1958 && var5.field1950 < 0 && var4 != var5) {
                var4.field1950 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ed.w(IIIB)V")
    public void method2342(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ed.n(IIB)V")
    public void method2362(int arg0, int arg1) {
    }

    @ObfuscatedName("ed.o(III)V")
    public void method2344(int arg0, int arg1) {
        this.field1911[arg0] = arg1;
    }

    @ObfuscatedName("ed.b(II)V")
    public void method2345(int arg0) {
        for (class141 var2 = (class141) this.field1934.field1993.method2242(); var2 != null; var2 = (class141) this.field1934.field1993.method2244()) {
            if (arg0 < 0 || var2.field1958 == arg0) {
                if (var2.field1954 != null) {
                    var2.field1954.method1114(Statics.field66 / 100);
                    if (var2.field1954.method1118()) {
                        this.field1934.field1992.method874(var2.field1954);
                    }
                    var2.method2440();
                }
                if (var2.field1950 < 0) {
                    this.field1910[var2.field1958][var2.field1941] = null;
                }
                var2.method2228();
            }
        }
    }

    @ObfuscatedName("ed.az(II)V")
    public void method2423(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2423(var2);
            }
            return;
        }
        this.field1931[arg0] = 12800;
        this.field1912[arg0] = 8192;
        this.field1913[arg0] = 16383;
        this.field1911[arg0] = 8192;
        this.field1928[arg0] = 0;
        this.field1919[arg0] = 8192;
        this.method2349(arg0);
        this.method2350(arg0);
        this.field1920[arg0] = 0;
        this.field1914[arg0] = 32767;
        this.field1922[arg0] = 256;
        this.field1923[arg0] = 0;
        this.method2352(arg0, 8192);
    }

    @ObfuscatedName("ed.ad(II)V")
    public void method2347(int arg0) {
        for (class141 var2 = (class141) this.field1934.field1993.method2242(); var2 != null; var2 = (class141) this.field1934.field1993.method2244()) {
            if ((arg0 < 0 || var2.field1958 == arg0) && var2.field1950 < 0) {
                this.field1910[var2.field1958][var2.field1941] = null;
                var2.field1950 = 0;
            }
        }
    }

    @ObfuscatedName("ed.aw(I)V")
    public void method2348() {
        this.method2345(-1);
        this.method2423(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1917[var1] = this.field1926[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1916[var2] = this.field1926[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ed.am(II)V")
    public void method2349(int arg0) {
        if ((this.field1920[arg0] & 0x2) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1934.field1993.method2242(); var2 != null; var2 = (class141) this.field1934.field1993.method2244()) {
            if (var2.field1958 == arg0 && this.field1910[arg0][var2.field1941] == null && var2.field1950 < 0) {
                var2.field1950 = 0;
            }
        }
    }

    @ObfuscatedName("ed.ay(IB)V")
    public void method2350(int arg0) {
        if ((this.field1920[arg0] & 0x4) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1934.field1993.method2242(); var2 != null; var2 = (class141) this.field1934.field1993.method2244()) {
            if (var2.field1958 == arg0) {
                var2.field1956 = 0;
            }
        }
    }

    @ObfuscatedName("ed.ab(II)V")
    public void method2351(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2341(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2327(var6, var7, var8);
            } else {
                this.method2341(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2342(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field1916[var12] = (var14 << 14) + (this.field1916[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field1916[var12] = (var14 << 7) + (this.field1916[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field1928[var12] = (var14 << 7) + (this.field1928[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1928[var12] = (this.field1928[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1919[var12] = (var14 << 7) + (this.field1919[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1919[var12] = (this.field1919[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1931[var12] = (var14 << 7) + (this.field1931[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1931[var12] = (this.field1931[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1912[var12] = (var14 << 7) + (this.field1912[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1912[var12] = (this.field1912[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1913[var12] = (var14 << 7) + (this.field1913[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1913[var12] = (this.field1913[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field1920[var12] |= 0x1;
                } else {
                    this.field1920[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field1920[var12] |= 0x2;
                } else {
                    this.method2349(var12);
                    this.field1920[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field1914[var12] = (var14 << 7) + (this.field1914[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field1914[var12] = (this.field1914[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field1914[var12] = (var14 << 7) + (this.field1914[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field1914[var12] = (this.field1914[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2345(var12);
            }
            if (var13 == 121) {
                this.method2423(var12);
            }
            if (var13 == 123) {
                this.method2347(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1914[var12];
                if (var15 == 16384) {
                    this.field1922[var12] = (var14 << 7) + (this.field1922[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1914[var12];
                if (var16 == 16384) {
                    this.field1922[var12] = (this.field1922[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field1923[var12] = (var14 << 7) + (this.field1923[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field1923[var12] = (this.field1923[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field1920[var12] |= 0x4;
                } else {
                    this.method2350(var12);
                    this.field1920[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2352(var12, (var14 << 7) + (this.field1924[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2352(var12, (this.field1924[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2338(var17, this.field1916[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2362(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2344(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2348();
            }
        }
    }

    @ObfuscatedName("ed.as(III)V")
    public void method2352(int arg0, int arg1) {
        this.field1924[arg0] = arg1;
        this.field1925[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ed.ap(Leg;I)I")
    public int method2337(class141 arg0) {
        int var2 = (arg0.field1952 * arg0.field1945 >> 12) + arg0.field1936;
        int var3 = ((this.field1911[arg0.field1958] - 8192) * this.field1922[arg0.field1958] >> 12) + var2;
        class138 var4 = arg0.field1939;
        if (var4.field1894 > 0 && (var4.field1897 > 0 || this.field1928[arg0.field1958] > 0)) {
            int var5 = var4.field1897 << 2;
            int var6 = var4.field1896 << 1;
            if (arg0.field1946 < var6) {
                var5 = arg0.field1946 * var5 / var6;
            }
            int var7 = (this.field1928[arg0.field1958] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1955 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1938.field1018 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field66 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ed.ae(Leg;I)I")
    public int method2354(class141 arg0) {
        class138 var2 = arg0.field1939;
        int var3 = this.field1931[arg0.field1958] * this.field1913[arg0.field1958] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1942 * var4 + 16384 >> 15;
        int var6 = this.field1909 * var5 + 128 >> 8;
        if (var2.field1890 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1947 * 1.953125E-5D * (double) var2.field1890) + 0.5D);
        }
        if (var2.field1888 != null) {
            int var7 = arg0.field1948;
            int var8 = var2.field1888[arg0.field1953 + 1];
            if (arg0.field1953 < var2.field1888.length - 2) {
                int var9 = (var2.field1888[arg0.field1953] & 0xFF) << 8;
                int var10 = (var2.field1888[arg0.field1953 + 2] & 0xFF) << 8;
                var8 += (var2.field1888[arg0.field1953 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1950 > 0 && var2.field1895 != null) {
            int var11 = arg0.field1950;
            int var12 = var2.field1895[arg0.field1951 + 1];
            if (arg0.field1951 < var2.field1895.length - 2) {
                int var13 = (var2.field1895[arg0.field1951] & 0xFF) << 8;
                int var14 = (var2.field1895[arg0.field1951 + 2] & 0xFF) << 8;
                var12 += (var2.field1895[arg0.field1951 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ed.ao(Leg;B)I")
    public int method2355(class141 arg0) {
        int var2 = this.field1912[arg0.field1958];
        return var2 < 8192 ? arg0.field1943 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1943) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ed.g()Lbx;")
    public synchronized class69 method879() {
        return this.field1934;
    }

    @ObfuscatedName("ed.z()Lbx;")
    public synchronized class69 method896() {
        return null;
    }

    @ObfuscatedName("ed.t()I")
    public synchronized int method889() {
        return 0;
    }

    @ObfuscatedName("ed.m([III)V")
    public synchronized void method912(int[] arg0, int arg1, int arg2) {
        if (this.field1915.method2444()) {
            int var4 = this.field1908 * this.field1915.field1964 / Statics.field66;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1932;
                if (this.field1918 - var5 >= 0L) {
                    this.field1932 = var5;
                    break;
                }
                int var7 = (int) ((this.field1918 - this.field1932 + (long) var4 - 1L) / (long) var4);
                this.field1932 += (long) var4 * (long) var7;
                this.field1934.method912(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2357();
            } while (this.field1915.method2444());
        }
        this.field1934.method912(arg0, arg1, arg2);
    }

    @ObfuscatedName("ed.e(I)V")
    public synchronized void method887(int arg0) {
        if (this.field1915.method2444()) {
            int var2 = this.field1908 * this.field1915.field1964 / Statics.field66;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1932;
                if (this.field1918 - var3 >= 0L) {
                    this.field1932 = var3;
                    break;
                }
                int var5 = (int) ((this.field1918 - this.field1932 + (long) var2 - 1L) / (long) var2);
                this.field1932 += (long) var2 * (long) var5;
                this.field1934.method887(var5);
                arg0 -= var5;
                this.method2357();
            } while (this.field1915.method2444());
        }
        this.field1934.method887(arg0);
    }

    @ObfuscatedName("ed.au(I)V")
    public void method2357() {
        int var1 = this.field1930;
        int var2 = this.field1935;
        long var3 = this.field1918;
        while (this.field1935 == var2) {
            while (this.field1915.field1967[var1] == var2) {
                this.field1915.method2446(var1);
                int var5 = this.field1915.method2482(var1);
                if (var5 == 1) {
                    this.field1915.method2468();
                    this.field1915.method2447(var1);
                    if (this.field1915.method2473()) {
                        if (!this.field1929 || var2 == 0) {
                            this.method2348();
                            this.field1915.method2443();
                            return;
                        }
                        this.field1915.method2491(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2351(var5);
                }
                this.field1915.method2449(var1);
                this.field1915.method2447(var1);
            }
            var1 = this.field1915.method2454();
            var2 = this.field1915.field1967[var1];
            var3 = this.field1915.method2453(var2);
        }
        this.field1930 = var1;
        this.field1935 = var2;
        this.field1918 = var3;
    }

    @ObfuscatedName("ed.bw(Leg;B)Z")
    public boolean method2358(class141 arg0) {
        if (arg0.field1954 != null) {
            return false;
        }
        if (arg0.field1950 >= 0) {
            arg0.method2228();
            if (arg0.field1940 > 0 && this.field1927[arg0.field1958][arg0.field1940] == arg0) {
                this.field1927[arg0.field1958][arg0.field1940] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ed.bv(Leg;[IIII)Z")
    public boolean method2359(class141 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1960 = Statics.field66 / 100;
        if (arg0.field1950 >= 0 && arg0.field1954 == null || arg0.field1954.method1117()) {
            arg0.method2440();
            arg0.method2228();
            if (arg0.field1940 > 0 && this.field1927[arg0.field1958][arg0.field1940] == arg0) {
                this.field1927[arg0.field1958][arg0.field1940] = null;
            }
            return true;
        }
        int var5 = arg0.field1952;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1919[arg0.field1958] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1952 = var6;
        }
        arg0.field1954.method1115(this.method2337(arg0));
        class138 var7 = arg0.field1939;
        boolean var8 = false;
        arg0.field1946++;
        arg0.field1955 += var7.field1894;
        double var9 = (double) ((arg0.field1941 - 60 << 8) + (arg0.field1952 * arg0.field1945 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1890 > 0) {
            if (var7.field1893 > 0) {
                arg0.field1947 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1893 * var9) + 0.5D);
            } else {
                arg0.field1947 += 128;
            }
        }
        if (var7.field1888 != null) {
            if (var7.field1891 > 0) {
                arg0.field1948 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1891 * var9) + 0.5D);
            } else {
                arg0.field1948 += 128;
            }
            while (arg0.field1953 < var7.field1888.length - 2 && arg0.field1948 > (var7.field1888[arg0.field1953 + 2] & 0xFF) << 8) {
                arg0.field1953 += 2;
            }
            if (arg0.field1953 == var7.field1888.length - 2 && var7.field1888[arg0.field1953 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1950 >= 0 && var7.field1895 != null && (this.field1920[arg0.field1958] & 0x1) == 0 && (arg0.field1940 < 0 || this.field1927[arg0.field1958][arg0.field1940] != arg0)) {
            if (var7.field1892 > 0) {
                arg0.field1950 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1892 * var9) + 0.5D);
            } else {
                arg0.field1950 += 128;
            }
            while (arg0.field1951 < var7.field1895.length - 2 && arg0.field1950 > (var7.field1895[arg0.field1951 + 2] & 0xFF) << 8) {
                arg0.field1951 += 2;
            }
            if (arg0.field1951 == var7.field1895.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1954.method1175(arg0.field1960, this.method2354(arg0), this.method2355(arg0));
            return false;
        }
        arg0.field1954.method1114(arg0.field1960);
        if (arg1 == null) {
            arg0.field1954.method887(arg3);
        } else {
            arg0.field1954.method912(arg1, arg2, arg3);
        }
        if (arg0.field1954.method1118()) {
            this.field1934.field1992.method874(arg0.field1954);
        }
        arg0.method2440();
        if (arg0.field1950 >= 0) {
            arg0.method2228();
            if (arg0.field1940 > 0 && this.field1927[arg0.field1958][arg0.field1940] == arg0) {
                this.field1927[arg0.field1958][arg0.field1940] = null;
            }
        }
        return true;
    }
}
