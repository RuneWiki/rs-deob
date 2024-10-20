package deob;

@ObfuscatedName("ev")
public class class133 extends class141 {

    @ObfuscatedName("ev.b")
    public static class133 field1858 = new class133();

    @ObfuscatedName("ev.s")
    public static byte[] field1831 = new byte[1];

    @ObfuscatedName("ev.r")
    public static class133 field1833 = new class133();

    @ObfuscatedName("ev.g")
    public static byte[] field1855 = new byte[1];

    @ObfuscatedName("ev.x")
    public int field1835 = 0;

    @ObfuscatedName("ev.f")
    public int[] field1836;

    @ObfuscatedName("ev.u")
    public int[] field1851;

    @ObfuscatedName("ev.t")
    public int[] field1875;

    @ObfuscatedName("ev.k")
    public int field1839 = 0;

    @ObfuscatedName("ev.n")
    public int[] field1838;

    @ObfuscatedName("ev.d")
    public int[] field1841;

    @ObfuscatedName("ev.o")
    public int[] field1842;

    @ObfuscatedName("ev.a")
    public int[] field1843;

    @ObfuscatedName("ev.q")
    public int[] field1844;

    @ObfuscatedName("ev.j")
    public int[] field1845;

    @ObfuscatedName("ev.m")
    public byte[] field1860;

    @ObfuscatedName("ev.h")
    public byte[] field1847;

    @ObfuscatedName("ev.c")
    public byte[] field1848;

    @ObfuscatedName("ev.y")
    public short[] field1837;

    @ObfuscatedName("ev.p")
    public byte field1850 = 0;

    @ObfuscatedName("ev.i")
    public int field1854 = 0;

    @ObfuscatedName("ev.l")
    public int[] field1852;

    @ObfuscatedName("ev.z")
    public int[] field1857;

    @ObfuscatedName("ev.e")
    public int[] field1834;

    @ObfuscatedName("ev.v")
    public int[][] field1872;

    @ObfuscatedName("ev.w")
    public int[][] field1856;

    @ObfuscatedName("ev.av")
    public boolean field1832 = false;

    @ObfuscatedName("ev.au")
    public int field1884;

    @ObfuscatedName("ev.ae")
    public int field1849;

    @ObfuscatedName("ev.ak")
    public int field1869;

    @ObfuscatedName("ev.aq")
    public int field1861;

    @ObfuscatedName("ev.an")
    public int field1879;

    @ObfuscatedName("ev.am")
    public int field1876;

    @ObfuscatedName("ev.ar")
    public int field1864;

    @ObfuscatedName("ev.ao")
    public int field1865;

    @ObfuscatedName("ev.at")
    public int field1866 = -1;

    @ObfuscatedName("ev.ac")
    public int field1840 = -1;

    @ObfuscatedName("ev.as")
    public int field1868 = -1;

    @ObfuscatedName("ev.aw")
    public static boolean[] field1870 = new boolean[4700];

    @ObfuscatedName("ev.al")
    public static boolean[] field1871 = new boolean[4700];

    @ObfuscatedName("ev.aj")
    public static int[] field1878 = new int[4700];

    @ObfuscatedName("ev.ap")
    public static int[] field1873 = new int[4700];

    @ObfuscatedName("ev.ag")
    public static int[] field1888 = new int[4700];

    @ObfuscatedName("ev.af")
    public static int[] field1890 = new int[4700];

    @ObfuscatedName("ev.ay")
    public static int[] field1846 = new int[4700];

    @ObfuscatedName("ev.ab")
    public static int[] field1877 = new int[4700];

    @ObfuscatedName("ev.ai")
    public static int[] field1867 = new int[1600];

    @ObfuscatedName("ev.az")
    public static int[][] field1880 = new int[1600][512];

    @ObfuscatedName("ev.aa")
    public static int[] field1881 = new int[12];

    @ObfuscatedName("ev.ad")
    public static int[][] field1882 = new int[12][2000];

    @ObfuscatedName("ev.ba")
    public static int[] field1883 = new int[2000];

    @ObfuscatedName("ev.bi")
    public static int[] field1853 = new int[2000];

    @ObfuscatedName("ev.bq")
    public static int[] field1885 = new int[12];

    @ObfuscatedName("ev.bc")
    public static int[] field1886 = new int[10];

    @ObfuscatedName("ev.bb")
    public static int[] field1887 = new int[10];

    @ObfuscatedName("ev.bl")
    public static int[] field1859 = new int[10];

    @ObfuscatedName("ev.bk")
    public static boolean field1892 = true;

    @ObfuscatedName("ev.bz")
    public static int[] field1895 = class136.field1939;

    @ObfuscatedName("ev.bh")
    public static int[] field1896 = class136.field1942;

    @ObfuscatedName("ev.bp")
    public static int[] field1897 = class136.field1937;

    @ObfuscatedName("ev.bf")
    public static int[] field1898 = class136.field1940;

    public class133() {
    }

    public class133(class133[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1835 = 0;
        this.field1839 = 0;
        this.field1854 = 0;
        this.field1850 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class133 var8 = arg0[var7];
            if (var8 != null) {
                this.field1835 += var8.field1835;
                this.field1839 += var8.field1839;
                this.field1854 += var8.field1854;
                if (var8.field1860 == null) {
                    if (this.field1850 == -1) {
                        this.field1850 = var8.field1850;
                    }
                    if (this.field1850 != var8.field1850) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1847 != null;
                var5 |= var8.field1837 != null;
                var6 |= var8.field1848 != null;
            }
        }
        this.field1836 = new int[this.field1835];
        this.field1851 = new int[this.field1835];
        this.field1875 = new int[this.field1835];
        this.field1838 = new int[this.field1839];
        this.field1841 = new int[this.field1839];
        this.field1842 = new int[this.field1839];
        this.field1843 = new int[this.field1839];
        this.field1844 = new int[this.field1839];
        this.field1845 = new int[this.field1839];
        if (var3) {
            this.field1860 = new byte[this.field1839];
        }
        if (var4) {
            this.field1847 = new byte[this.field1839];
        }
        if (var5) {
            this.field1837 = new short[this.field1839];
        }
        if (var6) {
            this.field1848 = new byte[this.field1839];
        }
        if (this.field1854 > 0) {
            this.field1852 = new int[this.field1854];
            this.field1857 = new int[this.field1854];
            this.field1834 = new int[this.field1854];
        }
        this.field1835 = 0;
        this.field1839 = 0;
        this.field1854 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class133 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1839; var11++) {
                    this.field1838[this.field1839] = var10.field1838[var11] + this.field1835;
                    this.field1841[this.field1839] = var10.field1841[var11] + this.field1835;
                    this.field1842[this.field1839] = var10.field1842[var11] + this.field1835;
                    this.field1843[this.field1839] = var10.field1843[var11];
                    this.field1844[this.field1839] = var10.field1844[var11];
                    this.field1845[this.field1839] = var10.field1845[var11];
                    if (var3) {
                        if (var10.field1860 == null) {
                            this.field1860[this.field1839] = var10.field1850;
                        } else {
                            this.field1860[this.field1839] = var10.field1860[var11];
                        }
                    }
                    if (var4 && var10.field1847 != null) {
                        this.field1847[this.field1839] = var10.field1847[var11];
                    }
                    if (var5) {
                        if (var10.field1837 == null) {
                            this.field1837[this.field1839] = -1;
                        } else {
                            this.field1837[this.field1839] = var10.field1837[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1848 == null || var10.field1848[var11] == -1) {
                            this.field1848[this.field1839] = -1;
                        } else {
                            this.field1848[this.field1839] = (byte) (var10.field1848[var11] + this.field1854);
                        }
                    }
                    this.field1839++;
                }
                for (int var12 = 0; var12 < var10.field1854; var12++) {
                    this.field1852[this.field1854] = var10.field1852[var12] + this.field1835;
                    this.field1857[this.field1854] = var10.field1857[var12] + this.field1835;
                    this.field1834[this.field1854] = var10.field1834[var12] + this.field1835;
                    this.field1854++;
                }
                for (int var13 = 0; var13 < var10.field1835; var13++) {
                    this.field1836[this.field1835] = var10.field1836[var13];
                    this.field1851[this.field1835] = var10.field1851[var13];
                    this.field1875[this.field1835] = var10.field1875[var13];
                    this.field1835++;
                }
            }
        }
    }

    @ObfuscatedName("ev.b([[IIIIZI)Lev;")
    public class133 method2307(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2312();
        int var7 = arg1 - this.field1869;
        int var8 = this.field1869 + arg1;
        int var9 = arg3 - this.field1869;
        int var10 = this.field1869 + arg3;
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
        class133 var15;
        if (arg4) {
            var15 = new class133();
            var15.field1835 = this.field1835;
            var15.field1839 = this.field1839;
            var15.field1854 = this.field1854;
            var15.field1836 = this.field1836;
            var15.field1875 = this.field1875;
            var15.field1838 = this.field1838;
            var15.field1841 = this.field1841;
            var15.field1842 = this.field1842;
            var15.field1843 = this.field1843;
            var15.field1844 = this.field1844;
            var15.field1845 = this.field1845;
            var15.field1860 = this.field1860;
            var15.field1847 = this.field1847;
            var15.field1848 = this.field1848;
            var15.field1837 = this.field1837;
            var15.field1850 = this.field1850;
            var15.field1852 = this.field1852;
            var15.field1857 = this.field1857;
            var15.field1834 = this.field1834;
            var15.field1872 = this.field1872;
            var15.field1856 = this.field1856;
            var15.field1832 = this.field1832;
            var15.field1851 = new int[var15.field1835];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1835; var16++) {
                int var17 = this.field1836[var16] + arg1;
                int var18 = this.field1875[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1851[var16] = this.field1851[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1835; var26++) {
                int var27 = (-this.field1851[var26] << 16) / this.field2023;
                if (var27 < arg5) {
                    int var28 = this.field1836[var26] + arg1;
                    int var29 = this.field1875[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1851[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1851[var26];
                }
            }
        }
        var15.method2315();
        return var15;
    }

    @ObfuscatedName("ev.s(Z)Lev;")
    public class133 method2368(boolean arg0) {
        if (!arg0 && field1831.length < this.field1839) {
            field1831 = new byte[this.field1839 + 100];
        }
        return this.method2310(arg0, field1858, field1831);
    }

    @ObfuscatedName("ev.g(Z)Lev;")
    public class133 method2313(boolean arg0) {
        if (!arg0 && field1855.length < this.field1839) {
            field1855 = new byte[this.field1839 + 100];
        }
        return this.method2310(arg0, field1833, field1855);
    }

    @ObfuscatedName("ev.x(ZLev;[B)Lev;")
    public class133 method2310(boolean arg0, class133 arg1, byte[] arg2) {
        arg1.field1835 = this.field1835;
        arg1.field1839 = this.field1839;
        arg1.field1854 = this.field1854;
        if (arg1.field1836 == null || arg1.field1836.length < this.field1835) {
            arg1.field1836 = new int[this.field1835 + 100];
            arg1.field1851 = new int[this.field1835 + 100];
            arg1.field1875 = new int[this.field1835 + 100];
        }
        for (int var4 = 0; var4 < this.field1835; var4++) {
            arg1.field1836[var4] = this.field1836[var4];
            arg1.field1851[var4] = this.field1851[var4];
            arg1.field1875[var4] = this.field1875[var4];
        }
        if (arg0) {
            arg1.field1847 = this.field1847;
        } else {
            arg1.field1847 = arg2;
            if (this.field1847 == null) {
                for (int var5 = 0; var5 < this.field1839; var5++) {
                    arg1.field1847[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1839; var6++) {
                    arg1.field1847[var6] = this.field1847[var6];
                }
            }
        }
        arg1.field1838 = this.field1838;
        arg1.field1841 = this.field1841;
        arg1.field1842 = this.field1842;
        arg1.field1843 = this.field1843;
        arg1.field1844 = this.field1844;
        arg1.field1845 = this.field1845;
        arg1.field1860 = this.field1860;
        arg1.field1848 = this.field1848;
        arg1.field1837 = this.field1837;
        arg1.field1850 = this.field1850;
        arg1.field1852 = this.field1852;
        arg1.field1857 = this.field1857;
        arg1.field1834 = this.field1834;
        arg1.field1872 = this.field1872;
        arg1.field1856 = this.field1856;
        arg1.field1832 = this.field1832;
        arg1.method2315();
        return arg1;
    }

    @ObfuscatedName("ev.f(I)V")
    public void method2333(int arg0) {
        if (this.field1866 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1896[arg0];
        int var9 = field1895[arg0];
        for (int var10 = 0; var10 < this.field1835; var10++) {
            int var11 = class136.method2420(this.field1836[var10], this.field1875[var10], var8, var9);
            int var12 = this.field1851[var10];
            int var13 = class136.method2421(this.field1836[var10], this.field1875[var10], var8, var9);
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
        this.field1876 = (var2 + var5) / 2;
        this.field1864 = (var3 + var6) / 2;
        this.field1865 = (var4 + var7) / 2;
        this.field1866 = (var5 - var2 + 1) / 2;
        this.field1840 = (var6 - var3 + 1) / 2;
        this.field1868 = (var7 - var4 + 1) / 2;
        if (this.field1866 < 32) {
            this.field1866 = 32;
        }
        if (this.field1868 < 32) {
            this.field1868 = 32;
        }
        if (this.field1832) {
            this.field1866 += 8;
            this.field1868 += 8;
        }
    }

    @ObfuscatedName("ev.u()V")
    public void method2312() {
        if (this.field1884 == 1) {
            return;
        }
        this.field1884 = 1;
        this.field2023 = 0;
        this.field1849 = 0;
        this.field1869 = 0;
        for (int var1 = 0; var1 < this.field1835; var1++) {
            int var2 = this.field1836[var1];
            int var3 = this.field1851[var1];
            int var4 = this.field1875[var1];
            if (-var3 > this.field2023) {
                this.field2023 = -var3;
            }
            if (var3 > this.field1849) {
                this.field1849 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1869) {
                this.field1869 = var5;
            }
        }
        this.field1869 = (int) (Math.sqrt((double) this.field1869) + 0.99D);
        this.field1879 = (int) (Math.sqrt((double) (this.field2023 * this.field2023 + this.field1869 * this.field1869)) + 0.99D);
        this.field1861 = this.field1879 + (int) (Math.sqrt((double) (this.field1869 * this.field1869 + this.field1849 * this.field1849)) + 0.99D);
    }

    @ObfuscatedName("ev.t()V")
    public void method2356() {
        if (this.field1884 == 2) {
            return;
        }
        this.field1884 = 2;
        this.field1869 = 0;
        for (int var1 = 0; var1 < this.field1835; var1++) {
            int var2 = this.field1836[var1];
            int var3 = this.field1851[var1];
            int var4 = this.field1875[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1869) {
                this.field1869 = var5;
            }
        }
        this.field1869 = (int) (Math.sqrt((double) this.field1869) + 0.99D);
        this.field1879 = this.field1869;
        this.field1861 = this.field1869 + this.field1869;
    }

    @ObfuscatedName("ev.k()I")
    public int method2314() {
        this.method2312();
        return this.field1869;
    }

    @ObfuscatedName("ev.n()V")
    public void method2315() {
        this.field1884 = 0;
        this.field1866 = -1;
    }

    @ObfuscatedName("ev.d(Let;I)V")
    public void method2338(class144 arg0, int arg1) {
        if (this.field1872 == null || arg1 == -1) {
            return;
        }
        class131 var3 = arg0.field2042[arg1];
        class138 var4 = var3.field1795;
        Statics.field1889 = 0;
        Statics.field1874 = 0;
        Statics.field1891 = 0;
        for (int var5 = 0; var5 < var3.field1800; var5++) {
            int var6 = var3.field1801[var5];
            this.method2318(var4.field1954[var6], var4.field1950[var6], var3.field1802[var5], var3.field1799[var5], var3.field1803[var5]);
        }
        this.method2315();
    }

    @ObfuscatedName("ev.o(Let;ILet;I[I)V")
    public void method2317(class144 arg0, int arg1, class144 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2338(arg0, arg1);
            return;
        }
        class131 var6 = arg0.field2042[arg1];
        class131 var7 = arg2.field2042[arg3];
        class138 var8 = var6.field1795;
        Statics.field1889 = 0;
        Statics.field1874 = 0;
        Statics.field1891 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1800; var11++) {
            int var12 = var6.field1801[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1954[var12] == 0) {
                this.method2318(var8.field1954[var12], var8.field1950[var12], var6.field1802[var11], var6.field1799[var11], var6.field1803[var11]);
            }
        }
        Statics.field1889 = 0;
        Statics.field1874 = 0;
        Statics.field1891 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1800; var15++) {
            int var16 = var7.field1801[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1954[var16] == 0) {
                this.method2318(var8.field1954[var16], var8.field1950[var16], var7.field1802[var15], var7.field1799[var15], var7.field1803[var15]);
            }
        }
        this.method2315();
    }

    @ObfuscatedName("ev.a(I[IIII)V")
    public void method2318(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1889 = 0;
            Statics.field1874 = 0;
            Statics.field1891 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1872.length) {
                    int[] var10 = this.field1872[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1889 += this.field1836[var12];
                        Statics.field1874 += this.field1851[var12];
                        Statics.field1891 += this.field1875[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1889 = Statics.field1889 / var7 + arg2;
                Statics.field1874 = Statics.field1874 / var7 + arg3;
                Statics.field1891 = Statics.field1891 / var7 + arg4;
            } else {
                Statics.field1889 = arg2;
                Statics.field1874 = arg3;
                Statics.field1891 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1872.length) {
                    int[] var15 = this.field1872[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1836[var17] += arg2;
                        this.field1851[var17] += arg3;
                        this.field1875[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1872.length) {
                    int[] var20 = this.field1872[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1836[var22] -= Statics.field1889;
                        this.field1851[var22] -= Statics.field1874;
                        this.field1875[var22] -= Statics.field1891;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1895[var25];
                            int var27 = field1896[var25];
                            int var28 = this.field1851[var22] * var26 + this.field1836[var22] * var27 >> 16;
                            this.field1851[var22] = this.field1851[var22] * var27 - this.field1836[var22] * var26 >> 16;
                            this.field1836[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1895[var23];
                            int var30 = field1896[var23];
                            int var31 = this.field1851[var22] * var30 - this.field1875[var22] * var29 >> 16;
                            this.field1875[var22] = this.field1875[var22] * var30 + this.field1851[var22] * var29 >> 16;
                            this.field1851[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1895[var24];
                            int var33 = field1896[var24];
                            int var34 = this.field1875[var22] * var32 + this.field1836[var22] * var33 >> 16;
                            this.field1875[var22] = this.field1875[var22] * var33 - this.field1836[var22] * var32 >> 16;
                            this.field1836[var22] = var34;
                        }
                        this.field1836[var22] += Statics.field1889;
                        this.field1851[var22] += Statics.field1874;
                        this.field1875[var22] += Statics.field1891;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1872.length) {
                    int[] var37 = this.field1872[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1836[var39] -= Statics.field1889;
                        this.field1851[var39] -= Statics.field1874;
                        this.field1875[var39] -= Statics.field1891;
                        this.field1836[var39] = this.field1836[var39] * arg2 / 128;
                        this.field1851[var39] = this.field1851[var39] * arg3 / 128;
                        this.field1875[var39] = this.field1875[var39] * arg4 / 128;
                        this.field1836[var39] += Statics.field1889;
                        this.field1851[var39] += Statics.field1874;
                        this.field1875[var39] += Statics.field1891;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1856 != null && this.field1847 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1856.length) {
                    int[] var42 = this.field1856[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1847[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1847[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ev.i()V")
    public void method2319() {
        for (int var1 = 0; var1 < this.field1835; var1++) {
            int var2 = this.field1836[var1];
            this.field1836[var1] = this.field1875[var1];
            this.field1875[var1] = -var2;
        }
        this.method2315();
    }

    @ObfuscatedName("ev.l()V")
    public void method2320() {
        for (int var1 = 0; var1 < this.field1835; var1++) {
            this.field1836[var1] = -this.field1836[var1];
            this.field1875[var1] = -this.field1875[var1];
        }
        this.method2315();
    }

    @ObfuscatedName("ev.z()V")
    public void method2378() {
        for (int var1 = 0; var1 < this.field1835; var1++) {
            int var2 = this.field1875[var1];
            this.field1875[var1] = this.field1836[var1];
            this.field1836[var1] = -var2;
        }
        this.method2315();
    }

    @ObfuscatedName("ev.e(I)V")
    public void method2322(int arg0) {
        int var2 = field1895[arg0];
        int var3 = field1896[arg0];
        for (int var4 = 0; var4 < this.field1835; var4++) {
            int var5 = this.field1851[var4] * var3 - this.field1875[var4] * var2 >> 16;
            this.field1875[var4] = this.field1875[var4] * var3 + this.field1851[var4] * var2 >> 16;
            this.field1851[var4] = var5;
        }
        this.method2315();
    }

    @ObfuscatedName("ev.v(III)V")
    public void method2324(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1835; var4++) {
            this.field1836[var4] += arg0;
            this.field1851[var4] += arg1;
            this.field1875[var4] += arg2;
        }
        this.method2315();
    }

    @ObfuscatedName("ev.w(III)V")
    public void method2306(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1835; var4++) {
            this.field1836[var4] = this.field1836[var4] * arg0 / 128;
            this.field1851[var4] = this.field1851[var4] * arg1 / 128;
            this.field1875[var4] = this.field1875[var4] * arg2 / 128;
        }
        this.method2315();
    }

    @ObfuscatedName("ev.av(IIIIIII)V")
    public final void method2325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1867[0] = -1;
        if (this.field1884 != 2 && this.field1884 != 1) {
            this.method2356();
        }
        int var8 = Statics.field1917;
        int var9 = Statics.field1941;
        int var10 = field1895[arg0];
        int var11 = field1896[arg0];
        int var12 = field1895[arg1];
        int var13 = field1896[arg1];
        int var14 = field1895[arg2];
        int var15 = field1896[arg2];
        int var16 = field1895[arg3];
        int var17 = field1896[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1835; var19++) {
            int var20 = this.field1836[var19];
            int var21 = this.field1851[var19];
            int var22 = this.field1875[var19];
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
            field1888[var19] = var30 - var18;
            field1878[var19] = class136.field1927 * var26 / var30 + var8;
            field1873[var19] = class136.field1927 * var29 / var30 + var9;
            if (this.field1854 > 0) {
                field1890[var19] = var26;
                field1846[var19] = var29;
                field1877[var19] = var30;
            }
        }
        try {
            this.method2328(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ev.au(IIIIIIII)V")
    public final void method2326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1867[0] = -1;
        if (this.field1884 != 2 && this.field1884 != 1) {
            this.method2356();
        }
        int var9 = Statics.field1917;
        int var10 = Statics.field1941;
        int var11 = field1895[arg0];
        int var12 = field1896[arg0];
        int var13 = field1895[arg1];
        int var14 = field1896[arg1];
        int var15 = field1895[arg2];
        int var16 = field1896[arg2];
        int var17 = field1895[arg3];
        int var18 = field1896[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1835; var20++) {
            int var21 = this.field1836[var20];
            int var22 = this.field1851[var20];
            int var23 = this.field1875[var20];
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
            field1888[var20] = var31 - var19;
            field1878[var20] = class136.field1927 * var27 / arg7 + var9;
            field1873[var20] = class136.field1927 * var30 / arg7 + var10;
            if (this.field1854 > 0) {
                field1890[var20] = var27;
                field1846[var20] = var30;
                field1877[var20] = var31;
            }
        }
        try {
            this.method2328(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ev.cy(IIIIIIIII)V")
    public void method2327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1867[0] = -1;
        if (this.field1884 != 1) {
            this.method2312();
        }
        this.method2333(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1869 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1869) * class136.field1927;
        if (var15 / var13 >= Statics.field1933) {
            return;
        }
        int var16 = (this.field1869 + var14) * class136.field1927;
        if (var16 / var13 <= Statics.field1931) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1869 * arg1 >> 16;
        int var19 = (var17 + var18) * class136.field1927;
        if (var19 / var13 <= Statics.field1934) {
            return;
        }
        int var20 = (this.field2023 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class136.field1927;
        if (var21 / var13 >= Statics.field1935) {
            return;
        }
        int var22 = (this.field2023 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1854 > 0;
        int var26 = class134.field1901;
        int var28 = class134.method52();
        boolean var29 = class134.method2485();
        if (class8.field220 && arg8 > 0) {
            if (Statics.method18(this, arg5, arg6, arg7)) {
                class8.method49(this, arg5, arg6, arg7, -65281);
            } else if (class8.field219 == class12.field251) {
                class8.method49(this, arg5, arg6, arg7, -16776961);
            }
        }
        if (class8.field218 && arg8 > 0) {
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
            int var41 = var26 - Statics.field1917;
            int var42 = var28 - Statics.field1941;
            if (var41 > var36 && var41 < var37 && var42 > var38 && var42 < var39) {
                var40 = -256;
            }
            class8.method70(Statics.field1917 + var36, Statics.field1941 + var38, Statics.field1917 + var37, Statics.field1941 + var39, var40);
        }
        boolean var43 = false;
        if (arg8 > 0 && var29) {
            boolean var44 = false;
            if (field1892) {
                var44 = Statics.method18(this, arg5, arg6, arg7);
            } else {
                int var45 = var11 - var12;
                if (var45 <= 50) {
                    var45 = 50;
                }
                int var46;
                int var47;
                if (var14 > 0) {
                    var46 = var15 / var13;
                    var47 = var16 / var45;
                } else {
                    var47 = var16 / var13;
                    var46 = var15 / var45;
                }
                int var48;
                int var49;
                if (var17 > 0) {
                    var48 = var21 / var13;
                    var49 = var19 / var45;
                } else {
                    var49 = var19 / var13;
                    var48 = var21 / var45;
                }
                int var50 = var26 - Statics.field1917;
                int var51 = var28 - Statics.field1941;
                if (var50 > var46 && var50 < var47 && var51 > var48 && var51 < var49) {
                    var44 = true;
                }
            }
            if (var44) {
                if (this.field1832) {
                    class134.method952(arg8);
                } else {
                    var43 = true;
                }
            }
        }
        int var52 = Statics.field1917;
        int var53 = Statics.field1941;
        int var54 = 0;
        int var55 = 0;
        if (arg0 != 0) {
            var54 = field1895[arg0];
            var55 = field1896[arg0];
        }
        for (int var56 = 0; var56 < this.field1835; var56++) {
            int var57 = this.field1836[var56];
            int var58 = this.field1851[var56];
            int var59 = this.field1875[var56];
            if (arg0 != 0) {
                int var60 = var54 * var59 + var55 * var57 >> 16;
                var59 = var55 * var59 - var54 * var57 >> 16;
                var57 = var60;
            }
            int var61 = arg5 + var57;
            int var62 = arg6 + var58;
            int var63 = arg7 + var59;
            int var64 = arg3 * var63 + arg4 * var61 >> 16;
            int var65 = arg4 * var63 - arg3 * var61 >> 16;
            int var67 = arg2 * var62 - arg1 * var65 >> 16;
            int var68 = arg1 * var62 + arg2 * var65 >> 16;
            field1888[var56] = var68 - var11;
            if (var68 >= 50) {
                field1878[var56] = class136.field1927 * var64 / var68 + var52;
                field1873[var56] = class136.field1927 * var67 / var68 + var53;
            } else {
                field1878[var56] = -5000;
                var23 = true;
            }
            if (var25) {
                field1890[var56] = var64;
                field1846[var56] = var67;
                field1877[var56] = var68;
            }
        }
        try {
            this.method2328(var23, var43, this.field1832, arg8);
        } catch (Exception var71) {
        }
    }

    @ObfuscatedName("ev.ae(ZZZI)V")
    public final void method2328(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1861 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1861; var5++) {
            field1867[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field225 && arg1) {
            class8.method3590(this, var6);
        }
        for (int var7 = 0; var7 < this.field1839; var7++) {
            if (this.field1845[var7] != -2) {
                int var8 = this.field1838[var7];
                int var9 = this.field1841[var7];
                int var10 = this.field1842[var7];
                int var11 = field1878[var8];
                int var12 = field1878[var9];
                int var13 = field1878[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1890[var8];
                    int var15 = field1890[var9];
                    int var16 = field1890[var10];
                    int var17 = field1846[var8];
                    int var18 = field1846[var9];
                    int var19 = field1846[var10];
                    int var20 = field1877[var8];
                    int var21 = field1877[var9];
                    int var22 = field1877[var10];
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
                        field1871[var7] = true;
                        int var32 = (field1888[var8] + field1888[var9] + field1888[var10]) / 3 + this.field1879;
                        field1880[var32][field1867[var32]++] = var7;
                    }
                } else {
                    if (arg1 && class134.method2741(field1873[var8], field1873[var9], field1873[var10], var11, var12, var13, var6)) {
                        class134.method952(arg3);
                        arg1 = false;
                    }
                    if ((field1873[var10] - field1873[var9]) * (var11 - var12) - (field1873[var8] - field1873[var9]) * (var13 - var12) > 0) {
                        field1871[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field1930 && var12 <= Statics.field1930 && var13 <= Statics.field1930) {
                            field1870[var7] = false;
                        } else {
                            field1870[var7] = true;
                        }
                        int var33 = (field1888[var8] + field1888[var9] + field1888[var10]) / 3 + this.field1879;
                        field1880[var33][field1867[var33]++] = var7;
                    }
                }
            }
        }
        if (this.field1860 == null) {
            for (int var34 = this.field1861 - 1; var34 >= 0; var34--) {
                int var35 = field1867[var34];
                if (var35 > 0) {
                    int[] var36 = field1880[var34];
                    for (int var37 = 0; var37 < var35; var37++) {
                        this.method2329(var36[var37]);
                    }
                }
            }
            return;
        }
        for (int var38 = 0; var38 < 12; var38++) {
            field1881[var38] = 0;
            field1885[var38] = 0;
        }
        for (int var39 = this.field1861 - 1; var39 >= 0; var39--) {
            int var40 = field1867[var39];
            if (var40 > 0) {
                int[] var41 = field1880[var39];
                for (int var42 = 0; var42 < var40; var42++) {
                    int var43 = var41[var42];
                    byte var44 = this.field1860[var43];
                    int var45 = field1881[var44]++;
                    field1882[var44][var45] = var43;
                    if (var44 < 10) {
                        field1885[var44] += var39;
                    } else if (var44 == 10) {
                        field1883[var45] = var39;
                    } else {
                        field1853[var45] = var39;
                    }
                }
            }
        }
        int var46 = 0;
        if (field1881[1] > 0 || field1881[2] > 0) {
            var46 = (field1885[1] + field1885[2]) / (field1881[1] + field1881[2]);
        }
        int var47 = 0;
        if (field1881[3] > 0 || field1881[4] > 0) {
            var47 = (field1885[3] + field1885[4]) / (field1881[3] + field1881[4]);
        }
        int var48 = 0;
        if (field1881[6] > 0 || field1881[8] > 0) {
            var48 = (field1885[6] + field1885[8]) / (field1881[6] + field1881[8]);
        }
        int var49 = 0;
        int var50 = field1881[10];
        int[] var51 = field1882[10];
        int[] var52 = field1883;
        if (var49 == var50) {
            var49 = 0;
            var50 = field1881[11];
            var51 = field1882[11];
            var52 = field1853;
        }
        int var53;
        if (var49 < var50) {
            var53 = var52[var49];
        } else {
            var53 = -1000;
        }
        for (int var54 = 0; var54 < 10; var54++) {
            while (var54 == 0 && var53 > var46) {
                this.method2329(var51[var49++]);
                if (var49 == var50 && field1882[11] != var51) {
                    var49 = 0;
                    var50 = field1881[11];
                    var51 = field1882[11];
                    var52 = field1853;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            while (var54 == 3 && var53 > var47) {
                this.method2329(var51[var49++]);
                if (var49 == var50 && field1882[11] != var51) {
                    var49 = 0;
                    var50 = field1881[11];
                    var51 = field1882[11];
                    var52 = field1853;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            while (var54 == 5 && var53 > var48) {
                this.method2329(var51[var49++]);
                if (var49 == var50 && field1882[11] != var51) {
                    var49 = 0;
                    var50 = field1881[11];
                    var51 = field1882[11];
                    var52 = field1853;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            int var55 = field1881[var54];
            int[] var56 = field1882[var54];
            for (int var57 = 0; var57 < var55; var57++) {
                this.method2329(var56[var57]);
            }
        }
        while (var53 != -1000) {
            this.method2329(var51[var49++]);
            if (var49 == var50 && field1882[11] != var51) {
                var49 = 0;
                var51 = field1882[11];
                var50 = field1881[11];
                var52 = field1853;
            }
            if (var49 < var50) {
                var53 = var52[var49];
            } else {
                var53 = -1000;
            }
        }
    }

    @ObfuscatedName("ev.ak(I)V")
    public final void method2329(int arg0) {
        if (field1871[arg0]) {
            this.method2330(arg0);
            return;
        }
        int var2 = this.field1838[arg0];
        int var3 = this.field1841[arg0];
        int var4 = this.field1842[arg0];
        class136.field1928 = field1870[arg0];
        if (this.field1847 == null) {
            class136.field1920 = 0;
        } else {
            class136.field1920 = this.field1847[arg0] & 0xFF;
        }
        if (this.field1837 != null && this.field1837[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1848 == null || this.field1848[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1848[arg0] & 0xFF;
                var6 = this.field1852[var5];
                var7 = this.field1857[var5];
                var8 = this.field1834[var5];
            }
            if (this.field1845[arg0] == -1) {
                class136.method2415(field1873[var2], field1873[var3], field1873[var4], field1878[var2], field1878[var3], field1878[var4], this.field1843[arg0], this.field1843[arg0], this.field1843[arg0], field1890[var6], field1890[var7], field1890[var8], field1846[var6], field1846[var7], field1846[var8], field1877[var6], field1877[var7], field1877[var8], this.field1837[arg0]);
            } else {
                class136.method2415(field1873[var2], field1873[var3], field1873[var4], field1878[var2], field1878[var3], field1878[var4], this.field1843[arg0], this.field1844[arg0], this.field1845[arg0], field1890[var6], field1890[var7], field1890[var8], field1846[var6], field1846[var7], field1846[var8], field1877[var6], field1877[var7], field1877[var8], this.field1837[arg0]);
            }
        } else if (this.field1845[arg0] == -1) {
            class136.method2413(field1873[var2], field1873[var3], field1873[var4], field1878[var2], field1878[var3], field1878[var4], field1897[this.field1843[arg0]]);
        } else {
            class136.method2411(field1873[var2], field1873[var3], field1873[var4], field1878[var2], field1878[var3], field1878[var4], this.field1843[arg0], this.field1844[arg0], this.field1845[arg0]);
        }
    }

    @ObfuscatedName("ev.aq(I)V")
    public final void method2330(int arg0) {
        int var2 = Statics.field1917;
        int var3 = Statics.field1941;
        int var4 = 0;
        int var5 = this.field1838[arg0];
        int var6 = this.field1841[arg0];
        int var7 = this.field1842[arg0];
        int var8 = field1877[var5];
        int var9 = field1877[var6];
        int var10 = field1877[var7];
        if (this.field1847 == null) {
            class136.field1920 = 0;
        } else {
            class136.field1920 = this.field1847[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1886[var4] = field1878[var5];
            field1887[var4] = field1873[var5];
            field1859[var4++] = this.field1843[arg0];
        } else {
            int var11 = field1890[var5];
            int var12 = field1846[var5];
            int var13 = this.field1843[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1898[var10 - var8];
                field1886[var4] = (((field1890[var7] - var11) * var14 >> 16) + var11) * class136.field1927 / 50 + var2;
                field1887[var4] = (((field1846[var7] - var12) * var14 >> 16) + var12) * class136.field1927 / 50 + var3;
                field1859[var4++] = ((this.field1845[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1898[var9 - var8];
                field1886[var4] = (((field1890[var6] - var11) * var15 >> 16) + var11) * class136.field1927 / 50 + var2;
                field1887[var4] = (((field1846[var6] - var12) * var15 >> 16) + var12) * class136.field1927 / 50 + var3;
                field1859[var4++] = ((this.field1844[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1886[var4] = field1878[var6];
            field1887[var4] = field1873[var6];
            field1859[var4++] = this.field1844[arg0];
        } else {
            int var16 = field1890[var6];
            int var17 = field1846[var6];
            int var18 = this.field1844[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1898[var8 - var9];
                field1886[var4] = (((field1890[var5] - var16) * var19 >> 16) + var16) * class136.field1927 / 50 + var2;
                field1887[var4] = (((field1846[var5] - var17) * var19 >> 16) + var17) * class136.field1927 / 50 + var3;
                field1859[var4++] = ((this.field1843[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1898[var10 - var9];
                field1886[var4] = (((field1890[var7] - var16) * var20 >> 16) + var16) * class136.field1927 / 50 + var2;
                field1887[var4] = (((field1846[var7] - var17) * var20 >> 16) + var17) * class136.field1927 / 50 + var3;
                field1859[var4++] = ((this.field1845[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1886[var4] = field1878[var7];
            field1887[var4] = field1873[var7];
            field1859[var4++] = this.field1845[arg0];
        } else {
            int var21 = field1890[var7];
            int var22 = field1846[var7];
            int var23 = this.field1845[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1898[var9 - var10];
                field1886[var4] = (((field1890[var6] - var21) * var24 >> 16) + var21) * class136.field1927 / 50 + var2;
                field1887[var4] = (((field1846[var6] - var22) * var24 >> 16) + var22) * class136.field1927 / 50 + var3;
                field1859[var4++] = ((this.field1844[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1898[var8 - var10];
                field1886[var4] = (((field1890[var5] - var21) * var25 >> 16) + var21) * class136.field1927 / 50 + var2;
                field1887[var4] = (((field1846[var5] - var22) * var25 >> 16) + var22) * class136.field1927 / 50 + var3;
                field1859[var4++] = ((this.field1843[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1886[0];
        int var27 = field1886[1];
        int var28 = field1886[2];
        int var29 = field1887[0];
        int var30 = field1887[1];
        int var31 = field1887[2];
        class136.field1928 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1930 || var27 > Statics.field1930 || var28 > Statics.field1930) {
                class136.field1928 = true;
            }
            if (this.field1837 != null && this.field1837[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1848 == null || this.field1848[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1848[arg0] & 0xFF;
                    var33 = this.field1852[var32];
                    var34 = this.field1857[var32];
                    var35 = this.field1834[var32];
                }
                if (this.field1845[arg0] == -1) {
                    class136.method2415(var29, var30, var31, var26, var27, var28, this.field1843[arg0], this.field1843[arg0], this.field1843[arg0], field1890[var33], field1890[var34], field1890[var35], field1846[var33], field1846[var34], field1846[var35], field1877[var33], field1877[var34], field1877[var35], this.field1837[arg0]);
                } else {
                    class136.method2415(var29, var30, var31, var26, var27, var28, field1859[0], field1859[1], field1859[2], field1890[var33], field1890[var34], field1890[var35], field1846[var33], field1846[var34], field1846[var35], field1877[var33], field1877[var34], field1877[var35], this.field1837[arg0]);
                }
            } else if (this.field1845[arg0] == -1) {
                class136.method2413(var29, var30, var31, var26, var27, var28, field1897[this.field1843[arg0]]);
            } else {
                class136.method2411(var29, var30, var31, var26, var27, var28, field1859[0], field1859[1], field1859[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1930 || var27 > Statics.field1930 || var28 > Statics.field1930 || field1886[3] < 0 || field1886[3] > Statics.field1930) {
            class136.field1928 = true;
        }
        if (this.field1837 != null && this.field1837[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1848 == null || this.field1848[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1848[arg0] & 0xFF;
                var37 = this.field1852[var36];
                var38 = this.field1857[var36];
                var39 = this.field1834[var36];
            }
            short var40 = this.field1837[arg0];
            if (this.field1845[arg0] == -1) {
                class136.method2415(var29, var30, var31, var26, var27, var28, this.field1843[arg0], this.field1843[arg0], this.field1843[arg0], field1890[var37], field1890[var38], field1890[var39], field1846[var37], field1846[var38], field1846[var39], field1877[var37], field1877[var38], field1877[var39], var40);
                class136.method2415(var29, var31, field1887[3], var26, var28, field1886[3], this.field1843[arg0], this.field1843[arg0], this.field1843[arg0], field1890[var37], field1890[var38], field1890[var39], field1846[var37], field1846[var38], field1846[var39], field1877[var37], field1877[var38], field1877[var39], var40);
            } else {
                class136.method2415(var29, var30, var31, var26, var27, var28, field1859[0], field1859[1], field1859[2], field1890[var37], field1890[var38], field1890[var39], field1846[var37], field1846[var38], field1846[var39], field1877[var37], field1877[var38], field1877[var39], var40);
                class136.method2415(var29, var31, field1887[3], var26, var28, field1886[3], field1859[0], field1859[2], field1859[3], field1890[var37], field1890[var38], field1890[var39], field1846[var37], field1846[var38], field1846[var39], field1877[var37], field1877[var38], field1877[var39], var40);
            }
        } else if (this.field1845[arg0] == -1) {
            int var41 = field1897[this.field1843[arg0]];
            class136.method2413(var29, var30, var31, var26, var27, var28, var41);
            class136.method2413(var29, var31, field1887[3], var26, var28, field1886[3], var41);
        } else {
            class136.method2411(var29, var30, var31, var26, var27, var28, field1859[0], field1859[1], field1859[2]);
            class136.method2411(var29, var31, field1887[3], var26, var28, field1886[3], field1859[0], field1859[2], field1859[3]);
        }
    }
}
