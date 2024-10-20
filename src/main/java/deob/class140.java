package deob;

@ObfuscatedName("eb")
public class class140 extends class69 {

    @ObfuscatedName("eb.q")
    public class126 field1925 = new class126(128);

    @ObfuscatedName("eb.d")
    public int field1938 = 256;

    @ObfuscatedName("eb.h")
    public int field1926 = 1000000;

    @ObfuscatedName("eb.p")
    public int[] field1927 = new int[16];

    @ObfuscatedName("eb.j")
    public int[] field1928 = new int[16];

    @ObfuscatedName("eb.n")
    public int[] field1929 = new int[16];

    @ObfuscatedName("eb.r")
    public int[] field1930 = new int[16];

    @ObfuscatedName("eb.c")
    public int[] field1931 = new int[16];

    @ObfuscatedName("eb.i")
    public int[] field1934 = new int[16];

    @ObfuscatedName("eb.o")
    public int[] field1933 = new int[16];

    @ObfuscatedName("eb.m")
    public int[] field1924 = new int[16];

    @ObfuscatedName("eb.s")
    public int[] field1941 = new int[16];

    @ObfuscatedName("eb.w")
    public int[] field1942 = new int[16];

    @ObfuscatedName("eb.a")
    public int[] field1937 = new int[16];

    @ObfuscatedName("eb.k")
    public int[] field1935 = new int[16];

    @ObfuscatedName("eb.l")
    public int[] field1939 = new int[16];

    @ObfuscatedName("eb.x")
    public int[] field1940 = new int[16];

    @ObfuscatedName("eb.g")
    public int[] field1936 = new int[16];

    @ObfuscatedName("eb.e")
    public class141[][] field1932 = new class141[16][128];

    @ObfuscatedName("eb.ae")
    public class141[][] field1943 = new class141[16][128];

    @ObfuscatedName("eb.aq")
    public class142 field1944 = new class142();

    @ObfuscatedName("eb.at")
    public boolean field1945;

    @ObfuscatedName("eb.au")
    public int field1946;

    @ObfuscatedName("eb.am")
    public int field1947;

    @ObfuscatedName("eb.ad")
    public long field1948;

    @ObfuscatedName("eb.ai")
    public long field1949;

    @ObfuscatedName("eb.ac")
    public class144 field1950 = new class144(this);

    public class140() {
        this.method2488();
    }

    @ObfuscatedName("eb.q(II)V")
    public synchronized void method2408(int arg0) {
        this.field1938 = arg0;
    }

    @ObfuscatedName("eb.d(I)I")
    public int method2409() {
        return this.field1938;
    }

    @ObfuscatedName("eb.h(Les;Lgj;Lbc;II)Z")
    public synchronized boolean method2492(class145 arg0, class183 arg1, class61 arg2, int arg3) {
        arg0.method2574();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class135 var7 = (class135) arg0.field2009.method2264(); var7 != null; var7 = (class135) arg0.field2009.method2272()) {
            int var8 = (int) var7.field1882;
            class143 var9 = (class143) this.field1925.method2260((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3121(var8);
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
                this.field1925.method2261(var11, (long) var8);
            }
            if (!var9.method2558(arg2, var7.field1897, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2575();
        }
        return var5;
    }

    @ObfuscatedName("eb.p(I)V")
    public synchronized void method2411() {
        for (class143 var1 = (class143) this.field1925.method2264(); var1 != null; var1 = (class143) this.field1925.method2272()) {
            var1.method2559();
        }
    }

    @ObfuscatedName("eb.j(I)V")
    public synchronized void method2491() {
        for (class143 var1 = (class143) this.field1925.method2264(); var1 != null; var1 = (class143) this.field1925.method2272()) {
            var1.method2310();
        }
    }

    @ObfuscatedName("eb.u(Les;ZI)V")
    public synchronized void method2436(class145 arg0, boolean arg1) {
        this.method2469();
        this.field1944.method2517(arg0.field2008);
        this.field1945 = arg1;
        this.field1948 = 0L;
        int var3 = this.field1944.method2520();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1944.method2521(var4);
            this.field1944.method2524(var4);
            this.field1944.method2522(var4);
        }
        this.field1946 = this.field1944.method2529();
        this.field1947 = this.field1944.field1981[this.field1946];
        this.field1949 = this.field1944.method2543(this.field1947);
    }

    @ObfuscatedName("eb.v(B)V")
    public synchronized void method2469() {
        this.field1944.method2518();
        this.method2488();
    }

    @ObfuscatedName("eb.f(I)Z")
    public synchronized boolean method2456() {
        return this.field1944.method2536();
    }

    @ObfuscatedName("eb.z(III)V")
    public synchronized void method2414(int arg0, int arg1) {
        this.method2481(arg0, arg1);
    }

    @ObfuscatedName("eb.t(IIB)V")
    public void method2481(int arg0, int arg1) {
        this.field1930[arg0] = arg1;
        this.field1934[arg0] = arg1 & 0xFFFFFF80;
        this.method2416(arg0, arg1);
    }

    @ObfuscatedName("eb.y(IIB)V")
    public void method2416(int arg0, int arg1) {
        if (this.field1931[arg0] != arg1) {
            this.field1931[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1943[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("eb.w(IIIB)V")
    public void method2489(int arg0, int arg1, int arg2) {
        this.method2419(arg0, arg1, 64);
        if ((this.field1942[arg0] & 0x2) != 0) {
            for (class141 var4 = (class141) this.field1950.field2005.method2332(); var4 != null; var4 = (class141) this.field1950.field2005.method2322()) {
                if (var4.field1968 == arg0 && var4.field1966 < 0) {
                    this.field1932[arg0][var4.field1956] = null;
                    this.field1932[arg0][arg1] = var4;
                    int var5 = (var4.field1962 * var4.field1961 >> 12) + var4.field1960;
                    var4.field1960 += arg1 - var4.field1956 << 8;
                    var4.field1961 = var5 - var4.field1960;
                    var4.field1962 = 4096;
                    var4.field1956 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field1925.method2260((long) this.field1931[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field1992[arg1];
        if (var7 == null) {
            return;
        }
        class141 var8 = new class141();
        var8.field1968 = arg0;
        var8.field1974 = var6;
        var8.field1954 = var7;
        var8.field1955 = var6.field1996[arg1];
        var8.field1970 = var6.field1997[arg1];
        var8.field1956 = arg1;
        var8.field1958 = var6.field2001 * arg2 * arg2 * var6.field1994[arg1] + 1024 >> 11;
        var8.field1959 = var6.field1995[arg1] & 0xFF;
        var8.field1960 = (arg1 << 8) - (var6.field1993[arg1] & 0x7FFF);
        var8.field1963 = 0;
        var8.field1964 = 0;
        var8.field1971 = 0;
        var8.field1966 = -1;
        var8.field1967 = 0;
        if (this.field1939[arg0] == 0) {
            var8.field1976 = class67.method1201(var7, this.method2455(var8), this.method2430(var8), this.method2447(var8));
        } else {
            var8.field1976 = class67.method1201(var7, this.method2455(var8), 0, this.method2447(var8));
            this.method2418(var8, var6.field1993[arg1] < 0);
        }
        if (var6.field1993[arg1] < 0) {
            var8.field1976.method1208(-1);
        }
        if (var8.field1970 >= 0) {
            class141 var9 = this.field1943[arg0][var8.field1970];
            if (var9 != null && var9.field1966 < 0) {
                this.field1932[arg0][var9.field1956] = null;
                var9.field1966 = 0;
            }
            this.field1943[arg0][var8.field1970] = var8;
        }
        this.field1950.field2005.method2314(var8);
        this.field1932[arg0][arg1] = var8;
    }

    @ObfuscatedName("eb.a(Len;ZI)V")
    public void method2418(class141 arg0, boolean arg1) {
        int var3 = arg0.field1954.field1045.length;
        int var5;
        if (arg1 && arg0.field1954.field1048) {
            int var4 = var3 + var3 - arg0.field1954.field1047;
            var5 = (int) ((long) this.field1939[arg0.field1968] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1976.method1210(true);
            }
        } else {
            var5 = (int) ((long) this.field1939[arg0.field1968] * (long) var3 >> 6);
        }
        arg0.field1976.method1209(var5);
    }

    @ObfuscatedName("eb.k(IIIS)V")
    public void method2419(int arg0, int arg1, int arg2) {
        class141 var4 = this.field1932[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1932[arg0][arg1] = null;
        if ((this.field1942[arg0] & 0x2) == 0) {
            var4.field1966 = 0;
            return;
        }
        for (class141 var5 = (class141) this.field1950.field2005.method2319(); var5 != null; var5 = (class141) this.field1950.field2005.method2333()) {
            if (var4.field1968 == var5.field1968 && var5.field1966 < 0 && var4 != var5) {
                var4.field1966 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("eb.l(IIII)V")
    public void method2420(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eb.x(III)V")
    public void method2410(int arg0, int arg1) {
    }

    @ObfuscatedName("eb.g(IIB)V")
    public void method2422(int arg0, int arg1) {
        this.field1933[arg0] = arg1;
    }

    @ObfuscatedName("eb.e(II)V")
    public void method2423(int arg0) {
        for (class141 var2 = (class141) this.field1950.field2005.method2319(); var2 != null; var2 = (class141) this.field1950.field2005.method2333()) {
            if (arg0 < 0 || var2.field1968 == arg0) {
                if (var2.field1976 != null) {
                    var2.field1976.method1268(Statics.field1062 / 100);
                    if (var2.field1976.method1217()) {
                        this.field1950.field2006.method968(var2.field1976);
                    }
                    var2.method2510();
                }
                if (var2.field1966 < 0) {
                    this.field1932[var2.field1968][var2.field1956] = null;
                }
                var2.method2310();
            }
        }
    }

    @ObfuscatedName("eb.ae(IB)V")
    public void method2424(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2424(var2);
            }
            return;
        }
        this.field1927[arg0] = 12800;
        this.field1928[arg0] = 8192;
        this.field1929[arg0] = 16383;
        this.field1933[arg0] = 8192;
        this.field1924[arg0] = 0;
        this.field1941[arg0] = 8192;
        this.method2479(arg0);
        this.method2427(arg0);
        this.field1942[arg0] = 0;
        this.field1937[arg0] = 32767;
        this.field1935[arg0] = 256;
        this.field1939[arg0] = 0;
        this.method2432(arg0, 8192);
    }

    @ObfuscatedName("eb.aq(IB)V")
    public void method2425(int arg0) {
        for (class141 var2 = (class141) this.field1950.field2005.method2319(); var2 != null; var2 = (class141) this.field1950.field2005.method2333()) {
            if ((arg0 < 0 || var2.field1968 == arg0) && var2.field1966 < 0) {
                this.field1932[var2.field1968][var2.field1956] = null;
                var2.field1966 = 0;
            }
        }
    }

    @ObfuscatedName("eb.as(I)V")
    public void method2488() {
        this.method2423(-1);
        this.method2424(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1931[var1] = this.field1930[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1934[var2] = this.field1930[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("eb.aa(II)V")
    public void method2479(int arg0) {
        if ((this.field1942[arg0] & 0x2) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1950.field2005.method2319(); var2 != null; var2 = (class141) this.field1950.field2005.method2333()) {
            if (var2.field1968 == arg0 && this.field1932[arg0][var2.field1956] == null && var2.field1966 < 0) {
                var2.field1966 = 0;
            }
        }
    }

    @ObfuscatedName("eb.ah(II)V")
    public void method2427(int arg0) {
        if ((this.field1942[arg0] & 0x4) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1950.field2005.method2319(); var2 != null; var2 = (class141) this.field1950.field2005.method2333()) {
            if (var2.field1968 == arg0) {
                var2.field1972 = 0;
            }
        }
    }

    @ObfuscatedName("eb.aj(IB)V")
    public void method2428(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2419(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2489(var6, var7, var8);
            } else {
                this.method2419(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2420(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field1934[var12] = (var14 << 14) + (this.field1934[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field1934[var12] = (var14 << 7) + (this.field1934[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field1924[var12] = (var14 << 7) + (this.field1924[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1924[var12] = (this.field1924[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1941[var12] = (var14 << 7) + (this.field1941[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1941[var12] = (this.field1941[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1927[var12] = (var14 << 7) + (this.field1927[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1927[var12] = (this.field1927[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1928[var12] = (var14 << 7) + (this.field1928[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1928[var12] = (this.field1928[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1929[var12] = (var14 << 7) + (this.field1929[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1929[var12] = (this.field1929[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field1942[var12] |= 0x1;
                } else {
                    this.field1942[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field1942[var12] |= 0x2;
                } else {
                    this.method2479(var12);
                    this.field1942[var12] &= 0xFFFFFFFD;
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
                this.method2423(var12);
            }
            if (var13 == 121) {
                this.method2424(var12);
            }
            if (var13 == 123) {
                this.method2425(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1937[var12];
                if (var15 == 16384) {
                    this.field1935[var12] = (var14 << 7) + (this.field1935[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1937[var12];
                if (var16 == 16384) {
                    this.field1935[var12] = (this.field1935[var12] & 0xFFFFFF80) + var14;
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
                    this.field1942[var12] |= 0x4;
                } else {
                    this.method2427(var12);
                    this.field1942[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2432(var12, (var14 << 7) + (this.field1940[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2432(var12, (this.field1940[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2416(var17, this.field1934[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2410(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2422(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2488();
            }
        }
    }

    @ObfuscatedName("eb.ak(III)V")
    public void method2432(int arg0, int arg1) {
        this.field1940[arg0] = arg1;
        this.field1936[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("eb.ag(Len;I)I")
    public int method2455(class141 arg0) {
        int var2 = (arg0.field1962 * arg0.field1961 >> 12) + arg0.field1960;
        int var3 = ((this.field1933[arg0.field1968] - 8192) * this.field1935[arg0.field1968] >> 12) + var2;
        class138 var4 = arg0.field1955;
        if (var4.field1911 > 0 && (var4.field1908 > 0 || this.field1924[arg0.field1968] > 0)) {
            int var5 = var4.field1908 << 2;
            int var6 = var4.field1909 << 1;
            if (arg0.field1965 < var6) {
                var5 = arg0.field1965 * var5 / var6;
            }
            int var7 = (this.field1924[arg0.field1968] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1969 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1954.field1046 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1062 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("eb.al(Len;I)I")
    public int method2430(class141 arg0) {
        class138 var2 = arg0.field1955;
        int var3 = this.field1927[arg0.field1968] * this.field1929[arg0.field1968] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1958 * var4 + 16384 >> 15;
        int var6 = this.field1938 * var5 + 128 >> 8;
        if (var2.field1913 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1963 * 1.953125E-5D * (double) var2.field1913) + 0.5D);
        }
        if (var2.field1904 != null) {
            int var7 = arg0.field1964;
            int var8 = var2.field1904[arg0.field1971 + 1];
            if (arg0.field1971 < var2.field1904.length - 2) {
                int var9 = (var2.field1904[arg0.field1971] & 0xFF) << 8;
                int var10 = (var2.field1904[arg0.field1971 + 2] & 0xFF) << 8;
                var8 += (var2.field1904[arg0.field1971 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1966 > 0 && var2.field1903 != null) {
            int var11 = arg0.field1966;
            int var12 = var2.field1903[arg0.field1967 + 1];
            if (arg0.field1967 < var2.field1903.length - 2) {
                int var13 = (var2.field1903[arg0.field1967] & 0xFF) << 8;
                int var14 = (var2.field1903[arg0.field1967 + 2] & 0xFF) << 8;
                var12 += (var2.field1903[arg0.field1967 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("eb.ar(Len;B)I")
    public int method2447(class141 arg0) {
        int var2 = this.field1928[arg0.field1968];
        return var2 < 8192 ? arg0.field1959 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1959) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("eb.n()Lbs;")
    public synchronized class69 method984() {
        return this.field1950;
    }

    @ObfuscatedName("eb.c()Lbs;")
    public synchronized class69 method974() {
        return null;
    }

    @ObfuscatedName("eb.o()I")
    public synchronized int method990() {
        return 0;
    }

    @ObfuscatedName("eb.s([III)V")
    public synchronized void method976(int[] arg0, int arg1, int arg2) {
        if (this.field1944.method2536()) {
            int var4 = this.field1926 * this.field1944.field1978 / Statics.field1062;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1948;
                if (this.field1949 - var5 >= 0L) {
                    this.field1948 = var5;
                    break;
                }
                int var7 = (int) ((this.field1949 - this.field1948 + (long) var4 - 1L) / (long) var4);
                this.field1948 += (long) var4 * (long) var7;
                this.field1950.method976(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2444();
            } while (this.field1944.method2536());
        }
        this.field1950.method976(arg0, arg1, arg2);
    }

    @ObfuscatedName("eb.b(I)V")
    public synchronized void method978(int arg0) {
        if (this.field1944.method2536()) {
            int var2 = this.field1926 * this.field1944.field1978 / Statics.field1062;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1948;
                if (this.field1949 - var3 >= 0L) {
                    this.field1948 = var3;
                    break;
                }
                int var5 = (int) ((this.field1949 - this.field1948 + (long) var2 - 1L) / (long) var2);
                this.field1948 += (long) var2 * (long) var5;
                this.field1950.method978(var5);
                arg0 -= var5;
                this.method2444();
            } while (this.field1944.method2536());
        }
        this.field1950.method978(arg0);
    }

    @ObfuscatedName("eb.ab(I)V")
    public void method2444() {
        int var1 = this.field1946;
        int var2 = this.field1947;
        long var3 = this.field1949;
        while (this.field1947 == var2) {
            while (this.field1944.field1981[var1] == var2) {
                this.field1944.method2521(var1);
                int var5 = this.field1944.method2542(var1);
                if (var5 == 1) {
                    this.field1944.method2528();
                    this.field1944.method2522(var1);
                    if (this.field1944.method2516()) {
                        if (!this.field1945 || var2 == 0) {
                            this.method2488();
                            this.field1944.method2518();
                            return;
                        }
                        this.field1944.method2550(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2428(var5);
                }
                this.field1944.method2524(var1);
                this.field1944.method2522(var1);
            }
            var1 = this.field1944.method2529();
            var2 = this.field1944.field1981[var1];
            var3 = this.field1944.method2543(var2);
        }
        this.field1946 = var1;
        this.field1947 = var2;
        this.field1949 = var3;
    }

    @ObfuscatedName("eb.az(Len;I)Z")
    public boolean method2426(class141 arg0) {
        if (arg0.field1976 != null) {
            return false;
        }
        if (arg0.field1966 >= 0) {
            arg0.method2310();
            if (arg0.field1970 > 0 && this.field1943[arg0.field1968][arg0.field1970] == arg0) {
                this.field1943[arg0.field1968][arg0.field1970] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("eb.ay(Len;[IIII)Z")
    public boolean method2435(class141 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1953 = Statics.field1062 / 100;
        if (arg0.field1966 >= 0 && arg0.field1976 == null || arg0.field1976.method1281()) {
            arg0.method2510();
            arg0.method2310();
            if (arg0.field1970 > 0 && this.field1943[arg0.field1968][arg0.field1970] == arg0) {
                this.field1943[arg0.field1968][arg0.field1970] = null;
            }
            return true;
        }
        int var5 = arg0.field1962;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1941[arg0.field1968] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1962 = var6;
        }
        arg0.field1976.method1214(this.method2455(arg0));
        class138 var7 = arg0.field1955;
        boolean var8 = false;
        arg0.field1965++;
        arg0.field1969 += var7.field1911;
        double var9 = (double) ((arg0.field1956 - 60 << 8) + (arg0.field1962 * arg0.field1961 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1913 > 0) {
            if (var7.field1907 > 0) {
                arg0.field1963 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1907 * var9) + 0.5D);
            } else {
                arg0.field1963 += 128;
            }
        }
        if (var7.field1904 != null) {
            if (var7.field1902 > 0) {
                arg0.field1964 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1902 * var9) + 0.5D);
            } else {
                arg0.field1964 += 128;
            }
            while (arg0.field1971 < var7.field1904.length - 2 && arg0.field1964 > (var7.field1904[arg0.field1971 + 2] & 0xFF) << 8) {
                arg0.field1971 += 2;
            }
            if (arg0.field1971 == var7.field1904.length - 2 && var7.field1904[arg0.field1971 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1966 >= 0 && var7.field1903 != null && (this.field1942[arg0.field1968] & 0x1) == 0 && (arg0.field1970 < 0 || this.field1943[arg0.field1968][arg0.field1970] != arg0)) {
            if (var7.field1906 > 0) {
                arg0.field1966 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1906 * var9) + 0.5D);
            } else {
                arg0.field1966 += 128;
            }
            while (arg0.field1967 < var7.field1903.length - 2 && arg0.field1966 > (var7.field1903[arg0.field1967 + 2] & 0xFF) << 8) {
                arg0.field1967 += 2;
            }
            if (arg0.field1967 == var7.field1903.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1976.method1212(arg0.field1953, this.method2430(arg0), this.method2447(arg0));
            return false;
        }
        arg0.field1976.method1268(arg0.field1953);
        if (arg1 == null) {
            arg0.field1976.method978(arg3);
        } else {
            arg0.field1976.method976(arg1, arg2, arg3);
        }
        if (arg0.field1976.method1217()) {
            this.field1950.field2006.method968(arg0.field1976);
        }
        arg0.method2510();
        if (arg0.field1966 >= 0) {
            arg0.method2310();
            if (arg0.field1970 > 0 && this.field1943[arg0.field1968][arg0.field1970] == arg0) {
                this.field1943[arg0.field1968][arg0.field1970] = null;
            }
        }
        return true;
    }
}
