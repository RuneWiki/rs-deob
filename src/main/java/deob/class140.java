package deob;

@ObfuscatedName("ey")
public class class140 extends class69 {

    @ObfuscatedName("ey.b")
    public class126 field1947 = new class126(128);

    @ObfuscatedName("ey.l")
    public int field1941 = 256;

    @ObfuscatedName("ey.i")
    public int field1924 = 1000000;

    @ObfuscatedName("ey.t")
    public int[] field1925 = new int[16];

    @ObfuscatedName("ey.k")
    public int[] field1930 = new int[16];

    @ObfuscatedName("ey.h")
    public int[] field1927 = new int[16];

    @ObfuscatedName("ey.n")
    public int[] field1928 = new int[16];

    @ObfuscatedName("ey.f")
    public int[] field1929 = new int[16];

    @ObfuscatedName("ey.a")
    public int[] field1948 = new int[16];

    @ObfuscatedName("ey.r")
    public int[] field1931 = new int[16];

    @ObfuscatedName("ey.x")
    public int[] field1932 = new int[16];

    @ObfuscatedName("ey.z")
    public int[] field1933 = new int[16];

    @ObfuscatedName("ey.q")
    public int[] field1934 = new int[16];

    @ObfuscatedName("ey.c")
    public int[] field1935 = new int[16];

    @ObfuscatedName("ey.v")
    public int[] field1936 = new int[16];

    @ObfuscatedName("ey.e")
    public int[] field1937 = new int[16];

    @ObfuscatedName("ey.j")
    public int[] field1938 = new int[16];

    @ObfuscatedName("ey.d")
    public int[] field1939 = new int[16];

    @ObfuscatedName("ey.g")
    public class141[][] field1946 = new class141[16][128];

    @ObfuscatedName("ey.ap")
    public class141[][] field1922 = new class141[16][128];

    @ObfuscatedName("ey.aj")
    public class142 field1942 = new class142();

    @ObfuscatedName("ey.ab")
    public boolean field1943;

    @ObfuscatedName("ey.af")
    public int field1940;

    @ObfuscatedName("ey.aw")
    public int field1945;

    @ObfuscatedName("ey.ac")
    public long field1926;

    @ObfuscatedName("ey.an")
    public long field1923;

    @ObfuscatedName("ey.ae")
    public class144 field1944 = new class144(this);

    public class140() {
        this.method2430();
    }

    @ObfuscatedName("ey.b(II)V")
    public synchronized void method2410(int arg0) {
        this.field1941 = arg0;
    }

    @ObfuscatedName("ey.l(B)I")
    public int method2413() {
        return this.field1941;
    }

    @ObfuscatedName("ey.i(Len;Lgj;Lbk;II)Z")
    public synchronized boolean method2412(class145 arg0, class183 arg1, class61 arg2, int arg3) {
        arg0.method2587();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class135 var7 = (class135) arg0.field2006.method2275(); var7 != null; var7 = (class135) arg0.field2006.method2276()) {
            int var8 = (int) var7.field1879;
            class143 var9 = (class143) this.field1947.method2280((long) var8);
            if (var9 == null) {
                var9 = class143.method795(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field1947.method2277(var9, (long) var8);
            }
            if (!var9.method2570(arg2, var7.field1893, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2588();
        }
        return var5;
    }

    @ObfuscatedName("ey.t(B)V")
    public synchronized void method2425() {
        for (class143 var1 = (class143) this.field1947.method2275(); var1 != null; var1 = (class143) this.field1947.method2276()) {
            var1.method2571();
        }
    }

    @ObfuscatedName("ey.k(B)V")
    public synchronized void method2492() {
        for (class143 var1 = (class143) this.field1947.method2275(); var1 != null; var1 = (class143) this.field1947.method2276()) {
            var1.method2313();
        }
    }

    @ObfuscatedName("ey.o(Len;ZI)V")
    public synchronized void method2459(class145 arg0, boolean arg1) {
        this.method2506();
        this.field1942.method2552(arg0.field2007);
        this.field1943 = arg1;
        this.field1926 = 0L;
        int var3 = this.field1942.method2526();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1942.method2527(var4);
            this.field1942.method2530(var4);
            this.field1942.method2542(var4);
        }
        this.field1940 = this.field1942.method2537();
        this.field1945 = this.field1942.field1971[this.field1940];
        this.field1923 = this.field1942.method2534(this.field1945);
    }

    @ObfuscatedName("ey.w(I)V")
    public synchronized void method2506() {
        this.field1942.method2524();
        this.method2430();
    }

    @ObfuscatedName("ey.m(I)Z")
    public synchronized boolean method2417() {
        return this.field1942.method2525();
    }

    @ObfuscatedName("ey.u(IIB)V")
    public synchronized void method2418(int arg0, int arg1) {
        this.method2442(arg0, arg1);
    }

    @ObfuscatedName("ey.q(III)V")
    public void method2442(int arg0, int arg1) {
        this.field1928[arg0] = arg1;
        this.field1948[arg0] = arg1 & 0xFFFFFF80;
        this.method2504(arg0, arg1);
    }

    @ObfuscatedName("ey.c(III)V")
    public void method2504(int arg0, int arg1) {
        if (this.field1929[arg0] != arg1) {
            this.field1929[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1922[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ey.v(IIIB)V")
    public void method2421(int arg0, int arg1, int arg2) {
        this.method2423(arg0, arg1, 64);
        if ((this.field1934[arg0] & 0x2) != 0) {
            for (class141 var4 = (class141) this.field1944.field1999.method2328(); var4 != null; var4 = (class141) this.field1944.field1999.method2327()) {
                if (var4.field1967 == arg0 && var4.field1964 < 0) {
                    this.field1946[arg0][var4.field1952] = null;
                    this.field1946[arg0][arg1] = var4;
                    int var5 = (var4.field1960 * var4.field1959 >> 12) + var4.field1954;
                    var4.field1954 += arg1 - var4.field1952 << 8;
                    var4.field1959 = var5 - var4.field1954;
                    var4.field1960 = 4096;
                    var4.field1952 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field1947.method2280((long) this.field1929[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field1986[arg1];
        if (var7 == null) {
            return;
        }
        class141 var8 = new class141();
        var8.field1967 = arg0;
        var8.field1958 = var6;
        var8.field1955 = var7;
        var8.field1953 = var6.field1990[arg1];
        var8.field1950 = var6.field1991[arg1];
        var8.field1952 = arg1;
        var8.field1951 = var6.field1993 * arg2 * arg2 * var6.field1988[arg1] + 1024 >> 11;
        var8.field1957 = var6.field1989[arg1] & 0xFF;
        var8.field1954 = (arg1 << 8) - (var6.field1992[arg1] & 0x7FFF);
        var8.field1961 = 0;
        var8.field1962 = 0;
        var8.field1963 = 0;
        var8.field1964 = -1;
        var8.field1965 = 0;
        if (this.field1937[arg0] == 0) {
            var8.field1956 = class67.method1193(var7, this.method2434(var8), this.method2464(var8), this.method2435(var8));
        } else {
            var8.field1956 = class67.method1193(var7, this.method2434(var8), 0, this.method2435(var8));
            this.method2422(var8, var6.field1992[arg1] < 0);
        }
        if (var6.field1992[arg1] < 0) {
            var8.field1956.method1195(-1);
        }
        if (var8.field1950 >= 0) {
            class141 var9 = this.field1922[arg0][var8.field1950];
            if (var9 != null && var9.field1964 < 0) {
                this.field1946[arg0][var9.field1952] = null;
                var9.field1964 = 0;
            }
            this.field1922[arg0][var8.field1950] = var8;
        }
        this.field1944.field1999.method2320(var8);
        this.field1946[arg0][arg1] = var8;
    }

    @ObfuscatedName("ey.e(Lea;ZI)V")
    public void method2422(class141 arg0, boolean arg1) {
        int var3 = arg0.field1955.field1010.length;
        int var5;
        if (arg1 && arg0.field1955.field1013) {
            int var4 = var3 + var3 - arg0.field1955.field1011;
            var5 = (int) ((long) this.field1937[arg0.field1967] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1956.method1202(true);
            }
        } else {
            var5 = (int) ((long) this.field1937[arg0.field1967] * (long) var3 >> 6);
        }
        arg0.field1956.method1203(var5);
    }

    @ObfuscatedName("ey.j(IIII)V")
    public void method2423(int arg0, int arg1, int arg2) {
        class141 var4 = this.field1946[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1946[arg0][arg1] = null;
        if ((this.field1934[arg0] & 0x2) == 0) {
            var4.field1964 = 0;
            return;
        }
        for (class141 var5 = (class141) this.field1944.field1999.method2324(); var5 != null; var5 = (class141) this.field1944.field1999.method2331()) {
            if (var4.field1967 == var5.field1967 && var5.field1964 < 0 && var4 != var5) {
                var4.field1964 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ey.d(IIIB)V")
    public void method2424(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ey.g(III)V")
    public void method2427(int arg0, int arg1) {
    }

    @ObfuscatedName("ey.ap(III)V")
    public void method2426(int arg0, int arg1) {
        this.field1931[arg0] = arg1;
    }

    @ObfuscatedName("ey.aj(II)V")
    public void method2503(int arg0) {
        for (class141 var2 = (class141) this.field1944.field1999.method2324(); var2 != null; var2 = (class141) this.field1944.field1999.method2331()) {
            if (arg0 < 0 || var2.field1967 == arg0) {
                if (var2.field1956 != null) {
                    var2.field1956.method1246(Statics.field3080 / 100);
                    if (var2.field1956.method1210()) {
                        this.field1944.field2000.method964(var2.field1956);
                    }
                    var2.method2517();
                }
                if (var2.field1964 < 0) {
                    this.field1946[var2.field1967][var2.field1952] = null;
                }
                var2.method2313();
            }
        }
    }

    @ObfuscatedName("ey.ab(II)V")
    public void method2457(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2457(var2);
            }
            return;
        }
        this.field1925[arg0] = 12800;
        this.field1930[arg0] = 8192;
        this.field1927[arg0] = 16383;
        this.field1931[arg0] = 8192;
        this.field1932[arg0] = 0;
        this.field1933[arg0] = 8192;
        this.method2467(arg0);
        this.method2431(arg0);
        this.field1934[arg0] = 0;
        this.field1935[arg0] = 32767;
        this.field1936[arg0] = 256;
        this.field1937[arg0] = 0;
        this.method2433(arg0, 8192);
    }

    @ObfuscatedName("ey.ay(IB)V")
    public void method2429(int arg0) {
        for (class141 var2 = (class141) this.field1944.field1999.method2324(); var2 != null; var2 = (class141) this.field1944.field1999.method2331()) {
            if ((arg0 < 0 || var2.field1967 == arg0) && var2.field1964 < 0) {
                this.field1946[var2.field1967][var2.field1952] = null;
                var2.field1964 = 0;
            }
        }
    }

    @ObfuscatedName("ey.aa(I)V")
    public void method2430() {
        this.method2503(-1);
        this.method2457(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1929[var1] = this.field1928[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1948[var2] = this.field1928[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ey.ar(II)V")
    public void method2467(int arg0) {
        if ((this.field1934[arg0] & 0x2) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1944.field1999.method2324(); var2 != null; var2 = (class141) this.field1944.field1999.method2331()) {
            if (var2.field1967 == arg0 && this.field1946[arg0][var2.field1952] == null && var2.field1964 < 0) {
                var2.field1964 = 0;
            }
        }
    }

    @ObfuscatedName("ey.ag(II)V")
    public void method2431(int arg0) {
        if ((this.field1934[arg0] & 0x4) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1944.field1999.method2324(); var2 != null; var2 = (class141) this.field1944.field1999.method2331()) {
            if (var2.field1967 == arg0) {
                var2.field1970 = 0;
            }
        }
    }

    @ObfuscatedName("ey.al(II)V")
    public void method2432(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2423(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2421(var6, var7, var8);
            } else {
                this.method2423(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2424(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field1948[var12] = (var14 << 14) + (this.field1948[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field1948[var12] = (var14 << 7) + (this.field1948[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field1932[var12] = (var14 << 7) + (this.field1932[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1932[var12] = (this.field1932[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1933[var12] = (var14 << 7) + (this.field1933[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1933[var12] = (this.field1933[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1925[var12] = (var14 << 7) + (this.field1925[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1925[var12] = (this.field1925[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1930[var12] = (var14 << 7) + (this.field1930[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1930[var12] = (this.field1930[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1927[var12] = (var14 << 7) + (this.field1927[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1927[var12] = (this.field1927[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field1934[var12] |= 0x1;
                } else {
                    this.field1934[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field1934[var12] |= 0x2;
                } else {
                    this.method2467(var12);
                    this.field1934[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field1935[var12] = (var14 << 7) + (this.field1935[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field1935[var12] = (this.field1935[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field1935[var12] = (var14 << 7) + (this.field1935[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field1935[var12] = (this.field1935[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2503(var12);
            }
            if (var13 == 121) {
                this.method2457(var12);
            }
            if (var13 == 123) {
                this.method2429(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1935[var12];
                if (var15 == 16384) {
                    this.field1936[var12] = (var14 << 7) + (this.field1936[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1935[var12];
                if (var16 == 16384) {
                    this.field1936[var12] = (this.field1936[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field1937[var12] = (var14 << 7) + (this.field1937[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field1937[var12] = (this.field1937[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field1934[var12] |= 0x4;
                } else {
                    this.method2431(var12);
                    this.field1934[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2433(var12, (var14 << 7) + (this.field1938[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2433(var12, (this.field1938[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2504(var17, this.field1948[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2427(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2426(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2430();
            }
        }
    }

    @ObfuscatedName("ey.ah(III)V")
    public void method2433(int arg0, int arg1) {
        this.field1938[arg0] = arg1;
        this.field1939[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ey.ak(Lea;I)I")
    public int method2434(class141 arg0) {
        int var2 = (arg0.field1960 * arg0.field1959 >> 12) + arg0.field1954;
        int var3 = ((this.field1931[arg0.field1967] - 8192) * this.field1936[arg0.field1967] >> 12) + var2;
        class138 var4 = arg0.field1953;
        if (var4.field1905 > 0 && (var4.field1908 > 0 || this.field1932[arg0.field1967] > 0)) {
            int var5 = var4.field1908 << 2;
            int var6 = var4.field1906 << 1;
            if (arg0.field1966 < var6) {
                var5 = arg0.field1966 * var5 / var6;
            }
            int var7 = (this.field1932[arg0.field1967] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1968 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1955.field1012 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3080 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ey.ax(Lea;I)I")
    public int method2464(class141 arg0) {
        class138 var2 = arg0.field1953;
        int var3 = this.field1927[arg0.field1967] * this.field1925[arg0.field1967] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1951 * var4 + 16384 >> 15;
        int var6 = this.field1941 * var5 + 128 >> 8;
        if (var2.field1900 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1961 * 1.953125E-5D * (double) var2.field1900) + 0.5D);
        }
        if (var2.field1903 != null) {
            int var7 = arg0.field1962;
            int var8 = var2.field1903[arg0.field1963 + 1];
            if (arg0.field1963 < var2.field1903.length - 2) {
                int var9 = (var2.field1903[arg0.field1963] & 0xFF) << 8;
                int var10 = (var2.field1903[arg0.field1963 + 2] & 0xFF) << 8;
                var8 += (var2.field1903[arg0.field1963 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1964 > 0 && var2.field1899 != null) {
            int var11 = arg0.field1964;
            int var12 = var2.field1899[arg0.field1965 + 1];
            if (arg0.field1965 < var2.field1899.length - 2) {
                int var13 = (var2.field1899[arg0.field1965] & 0xFF) << 8;
                int var14 = (var2.field1899[arg0.field1965 + 2] & 0xFF) << 8;
                var12 += (var2.field1899[arg0.field1965 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ey.av(Lea;I)I")
    public int method2435(class141 arg0) {
        int var2 = this.field1930[arg0.field1967];
        return var2 < 8192 ? arg0.field1957 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1957) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ey.x()Lbq;")
    public synchronized class69 method996() {
        return this.field1944;
    }

    @ObfuscatedName("ey.z()Lbq;")
    public synchronized class69 method970() {
        return null;
    }

    @ObfuscatedName("ey.p()I")
    public synchronized int method971() {
        return 0;
    }

    @ObfuscatedName("ey.s([III)V")
    public synchronized void method985(int[] arg0, int arg1, int arg2) {
        if (this.field1942.method2525()) {
            int var4 = this.field1924 * this.field1942.field1975 / Statics.field3080;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1926;
                if (this.field1923 - var5 >= 0L) {
                    this.field1926 = var5;
                    break;
                }
                int var7 = (int) ((this.field1923 - this.field1926 + (long) var4 - 1L) / (long) var4);
                this.field1926 += (long) var4 * (long) var7;
                this.field1944.method985(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2499();
            } while (this.field1942.method2525());
        }
        this.field1944.method985(arg0, arg1, arg2);
    }

    @ObfuscatedName("ey.y(I)V")
    public synchronized void method974(int arg0) {
        if (this.field1942.method2525()) {
            int var2 = this.field1924 * this.field1942.field1975 / Statics.field3080;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1926;
                if (this.field1923 - var3 >= 0L) {
                    this.field1926 = var3;
                    break;
                }
                int var5 = (int) ((this.field1923 - this.field1926 + (long) var2 - 1L) / (long) var2);
                this.field1926 += (long) var2 * (long) var5;
                this.field1944.method974(var5);
                arg0 -= var5;
                this.method2499();
            } while (this.field1942.method2525());
        }
        this.field1944.method974(arg0);
    }

    @ObfuscatedName("ey.az(I)V")
    public void method2499() {
        int var1 = this.field1940;
        int var2 = this.field1945;
        long var3 = this.field1923;
        while (this.field1945 == var2) {
            while (this.field1942.field1971[var1] == var2) {
                this.field1942.method2527(var1);
                int var5 = this.field1942.method2531(var1);
                if (var5 == 1) {
                    this.field1942.method2529();
                    this.field1942.method2542(var1);
                    if (this.field1942.method2536()) {
                        if (!this.field1943 || var2 == 0) {
                            this.method2430();
                            this.field1942.method2524();
                            return;
                        }
                        this.field1942.method2546(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2432(var5);
                }
                this.field1942.method2530(var1);
                this.field1942.method2542(var1);
            }
            var1 = this.field1942.method2537();
            var2 = this.field1942.field1971[var1];
            var3 = this.field1942.method2534(var2);
        }
        this.field1940 = var1;
        this.field1945 = var2;
        this.field1923 = var3;
    }

    @ObfuscatedName("ey.ao(Lea;I)Z")
    public boolean method2450(class141 arg0) {
        if (arg0.field1956 != null) {
            return false;
        }
        if (arg0.field1964 >= 0) {
            arg0.method2313();
            if (arg0.field1950 > 0 && this.field1922[arg0.field1967][arg0.field1950] == arg0) {
                this.field1922[arg0.field1967][arg0.field1950] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ey.aq(Lea;[IIII)Z")
    public boolean method2439(class141 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1969 = Statics.field3080 / 100;
        if (arg0.field1964 >= 0 && arg0.field1956 == null || arg0.field1956.method1209()) {
            arg0.method2517();
            arg0.method2313();
            if (arg0.field1950 > 0 && this.field1922[arg0.field1967][arg0.field1950] == arg0) {
                this.field1922[arg0.field1967][arg0.field1950] = null;
            }
            return true;
        }
        int var5 = arg0.field1960;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1933[arg0.field1967] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1960 = var6;
        }
        arg0.field1956.method1207(this.method2434(arg0));
        class138 var7 = arg0.field1953;
        boolean var8 = false;
        arg0.field1966++;
        arg0.field1968 += var7.field1905;
        double var9 = (double) ((arg0.field1952 - 60 << 8) + (arg0.field1960 * arg0.field1959 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1900 > 0) {
            if (var7.field1912 > 0) {
                arg0.field1961 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1912 * var9) + 0.5D);
            } else {
                arg0.field1961 += 128;
            }
        }
        if (var7.field1903 != null) {
            if (var7.field1901 > 0) {
                arg0.field1962 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1901 * var9) + 0.5D);
            } else {
                arg0.field1962 += 128;
            }
            while (arg0.field1963 < var7.field1903.length - 2 && arg0.field1962 > (var7.field1903[arg0.field1963 + 2] & 0xFF) << 8) {
                arg0.field1963 += 2;
            }
            if (arg0.field1963 == var7.field1903.length - 2 && var7.field1903[arg0.field1963 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1964 >= 0 && var7.field1899 != null && (this.field1934[arg0.field1967] & 0x1) == 0 && (arg0.field1950 < 0 || this.field1922[arg0.field1967][arg0.field1950] != arg0)) {
            if (var7.field1902 > 0) {
                arg0.field1964 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1902 * var9) + 0.5D);
            } else {
                arg0.field1964 += 128;
            }
            while (arg0.field1965 < var7.field1899.length - 2 && arg0.field1964 > (var7.field1899[arg0.field1965 + 2] & 0xFF) << 8) {
                arg0.field1965 += 2;
            }
            if (arg0.field1965 == var7.field1899.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1956.method1312(arg0.field1969, this.method2464(arg0), this.method2435(arg0));
            return false;
        }
        arg0.field1956.method1246(arg0.field1969);
        if (arg1 == null) {
            arg0.field1956.method974(arg3);
        } else {
            arg0.field1956.method985(arg1, arg2, arg3);
        }
        if (arg0.field1956.method1210()) {
            this.field1944.field2000.method964(arg0.field1956);
        }
        arg0.method2517();
        if (arg0.field1964 >= 0) {
            arg0.method2313();
            if (arg0.field1950 > 0 && this.field1922[arg0.field1967][arg0.field1950] == arg0) {
                this.field1922[arg0.field1967][arg0.field1950] = null;
            }
        }
        return true;
    }
}
