package deob;

@ObfuscatedName("eh")
public class class133 extends class141 {

    @ObfuscatedName("eh.d")
    public static class133 field1842 = new class133();

    @ObfuscatedName("eh.x")
    public static byte[] field1872 = new byte[1];

    @ObfuscatedName("eh.k")
    public static class133 field1877 = new class133();

    @ObfuscatedName("eh.z")
    public static byte[] field1833 = new byte[1];

    @ObfuscatedName("eh.v")
    public int field1836 = 0;

    @ObfuscatedName("eh.m")
    public int[] field1835;

    @ObfuscatedName("eh.b")
    public int[] field1887;

    @ObfuscatedName("eh.t")
    public int[] field1837;

    @ObfuscatedName("eh.p")
    public int field1838 = 0;

    @ObfuscatedName("eh.r")
    public int[] field1864;

    @ObfuscatedName("eh.l")
    public int[] field1881;

    @ObfuscatedName("eh.u")
    public int[] field1841;

    @ObfuscatedName("eh.n")
    public int[] field1863;

    @ObfuscatedName("eh.c")
    public int[] field1843;

    @ObfuscatedName("eh.y")
    public int[] field1844;

    @ObfuscatedName("eh.j")
    public byte[] field1845;

    @ObfuscatedName("eh.f")
    public byte[] field1846;

    @ObfuscatedName("eh.s")
    public byte[] field1847;

    @ObfuscatedName("eh.e")
    public short[] field1848;

    @ObfuscatedName("eh.q")
    public byte field1849 = 0;

    @ObfuscatedName("eh.h")
    public int field1840 = 0;

    @ObfuscatedName("eh.i")
    public int[] field1851;

    @ObfuscatedName("eh.o")
    public int[] field1852;

    @ObfuscatedName("eh.w")
    public int[] field1853;

    @ObfuscatedName("eh.g")
    public int[][] field1854;

    @ObfuscatedName("eh.a")
    public int[][] field1855;

    @ObfuscatedName("eh.ah")
    public boolean field1856 = false;

    @ObfuscatedName("eh.ak")
    public int field1889;

    @ObfuscatedName("eh.aa")
    public int field1858;

    @ObfuscatedName("eh.ax")
    public int field1830;

    @ObfuscatedName("eh.aq")
    public int field1860;

    @ObfuscatedName("eh.au")
    public int field1861;

    @ObfuscatedName("eh.al")
    public int field1832;

    @ObfuscatedName("eh.ae")
    public int field1839;

    @ObfuscatedName("eh.aj")
    public int field1894;

    @ObfuscatedName("eh.as")
    public int field1865 = -1;

    @ObfuscatedName("eh.am")
    public int field1866 = -1;

    @ObfuscatedName("eh.ag")
    public int field1867 = -1;

    @ObfuscatedName("eh.ap")
    public static boolean[] field1869 = new boolean[4700];

    @ObfuscatedName("eh.ad")
    public static boolean[] field1870 = new boolean[4700];

    @ObfuscatedName("eh.an")
    public static int[] field1871 = new int[4700];

    @ObfuscatedName("eh.ai")
    public static int[] field1859 = new int[4700];

    @ObfuscatedName("eh.ay")
    public static int[] field1873 = new int[4700];

    @ObfuscatedName("eh.ar")
    public static int[] field1834 = new int[4700];

    @ObfuscatedName("eh.ac")
    public static int[] field1875 = new int[4700];

    @ObfuscatedName("eh.af")
    public static int[] field1876 = new int[4700];

    @ObfuscatedName("eh.av")
    public static int[] field1862 = new int[1600];

    @ObfuscatedName("eh.ab")
    public static int[][] field1850 = new int[1600][512];

    @ObfuscatedName("eh.az")
    public static int[] field1880 = new int[12];

    @ObfuscatedName("eh.at")
    public static int[][] field1882 = new int[12][2000];

    @ObfuscatedName("eh.bj")
    public static int[] field1879 = new int[2000];

    @ObfuscatedName("eh.bq")
    public static int[] field1883 = new int[2000];

    @ObfuscatedName("eh.bo")
    public static int[] field1884 = new int[12];

    @ObfuscatedName("eh.bk")
    public static int[] field1885 = new int[10];

    @ObfuscatedName("eh.bv")
    public static int[] field1886 = new int[10];

    @ObfuscatedName("eh.ba")
    public static int[] field1878 = new int[10];

    @ObfuscatedName("eh.bz")
    public static boolean field1891 = true;

    @ObfuscatedName("eh.bb")
    public static int[] field1874 = class136.field1943;

    @ObfuscatedName("eh.bc")
    public static int[] field1895 = class136.field1940;

    @ObfuscatedName("eh.bf")
    public static int[] field1896 = class136.field1941;

    @ObfuscatedName("eh.br")
    public static int[] field1897 = class136.field1942;

    public class133() {
    }

    public class133(class133[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1836 = 0;
        this.field1838 = 0;
        this.field1840 = 0;
        this.field1849 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class133 var8 = arg0[var7];
            if (var8 != null) {
                this.field1836 += var8.field1836;
                this.field1838 += var8.field1838;
                this.field1840 += var8.field1840;
                if (var8.field1845 == null) {
                    if (this.field1849 == -1) {
                        this.field1849 = var8.field1849;
                    }
                    if (this.field1849 != var8.field1849) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1846 != null;
                var5 |= var8.field1848 != null;
                var6 |= var8.field1847 != null;
            }
        }
        this.field1835 = new int[this.field1836];
        this.field1887 = new int[this.field1836];
        this.field1837 = new int[this.field1836];
        this.field1864 = new int[this.field1838];
        this.field1881 = new int[this.field1838];
        this.field1841 = new int[this.field1838];
        this.field1863 = new int[this.field1838];
        this.field1843 = new int[this.field1838];
        this.field1844 = new int[this.field1838];
        if (var3) {
            this.field1845 = new byte[this.field1838];
        }
        if (var4) {
            this.field1846 = new byte[this.field1838];
        }
        if (var5) {
            this.field1848 = new short[this.field1838];
        }
        if (var6) {
            this.field1847 = new byte[this.field1838];
        }
        if (this.field1840 > 0) {
            this.field1851 = new int[this.field1840];
            this.field1852 = new int[this.field1840];
            this.field1853 = new int[this.field1840];
        }
        this.field1836 = 0;
        this.field1838 = 0;
        this.field1840 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class133 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1838; var11++) {
                    this.field1864[this.field1838] = var10.field1864[var11] + this.field1836;
                    this.field1881[this.field1838] = var10.field1881[var11] + this.field1836;
                    this.field1841[this.field1838] = var10.field1841[var11] + this.field1836;
                    this.field1863[this.field1838] = var10.field1863[var11];
                    this.field1843[this.field1838] = var10.field1843[var11];
                    this.field1844[this.field1838] = var10.field1844[var11];
                    if (var3) {
                        if (var10.field1845 == null) {
                            this.field1845[this.field1838] = var10.field1849;
                        } else {
                            this.field1845[this.field1838] = var10.field1845[var11];
                        }
                    }
                    if (var4 && var10.field1846 != null) {
                        this.field1846[this.field1838] = var10.field1846[var11];
                    }
                    if (var5) {
                        if (var10.field1848 == null) {
                            this.field1848[this.field1838] = -1;
                        } else {
                            this.field1848[this.field1838] = var10.field1848[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1847 == null || var10.field1847[var11] == -1) {
                            this.field1847[this.field1838] = -1;
                        } else {
                            this.field1847[this.field1838] = (byte) (var10.field1847[var11] + this.field1840);
                        }
                    }
                    this.field1838++;
                }
                for (int var12 = 0; var12 < var10.field1840; var12++) {
                    this.field1851[this.field1840] = var10.field1851[var12] + this.field1836;
                    this.field1852[this.field1840] = var10.field1852[var12] + this.field1836;
                    this.field1853[this.field1840] = var10.field1853[var12] + this.field1836;
                    this.field1840++;
                }
                for (int var13 = 0; var13 < var10.field1836; var13++) {
                    this.field1835[this.field1836] = var10.field1835[var13];
                    this.field1887[this.field1836] = var10.field1887[var13];
                    this.field1837[this.field1836] = var10.field1837[var13];
                    this.field1836++;
                }
            }
        }
    }

    @ObfuscatedName("eh.d([[IIIIZI)Leh;")
    public class133 method2402(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2407();
        int var7 = arg1 - this.field1830;
        int var8 = this.field1830 + arg1;
        int var9 = arg3 - this.field1830;
        int var10 = this.field1830 + arg3;
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
            var15.field1836 = this.field1836;
            var15.field1838 = this.field1838;
            var15.field1840 = this.field1840;
            var15.field1835 = this.field1835;
            var15.field1837 = this.field1837;
            var15.field1864 = this.field1864;
            var15.field1881 = this.field1881;
            var15.field1841 = this.field1841;
            var15.field1863 = this.field1863;
            var15.field1843 = this.field1843;
            var15.field1844 = this.field1844;
            var15.field1845 = this.field1845;
            var15.field1846 = this.field1846;
            var15.field1847 = this.field1847;
            var15.field1848 = this.field1848;
            var15.field1849 = this.field1849;
            var15.field1851 = this.field1851;
            var15.field1852 = this.field1852;
            var15.field1853 = this.field1853;
            var15.field1854 = this.field1854;
            var15.field1855 = this.field1855;
            var15.field1856 = this.field1856;
            var15.field1887 = new int[var15.field1836];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1836; var16++) {
                int var17 = this.field1835[var16] + arg1;
                int var18 = this.field1837[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1887[var16] = this.field1887[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1836; var26++) {
                int var27 = (-this.field1887[var26] << 16) / this.field2024;
                if (var27 < arg5) {
                    int var28 = this.field1835[var26] + arg1;
                    int var29 = this.field1837[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1887[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1887[var26];
                }
            }
        }
        var15.method2452();
        return var15;
    }

    @ObfuscatedName("eh.x(Z)Leh;")
    public class133 method2403(boolean arg0) {
        if (!arg0 && field1872.length < this.field1838) {
            field1872 = new byte[this.field1838 + 100];
        }
        return this.method2405(arg0, field1842, field1872);
    }

    @ObfuscatedName("eh.z(Z)Leh;")
    public class133 method2404(boolean arg0) {
        if (!arg0 && field1833.length < this.field1838) {
            field1833 = new byte[this.field1838 + 100];
        }
        return this.method2405(arg0, field1877, field1833);
    }

    @ObfuscatedName("eh.v(ZLeh;[B)Leh;")
    public class133 method2405(boolean arg0, class133 arg1, byte[] arg2) {
        arg1.field1836 = this.field1836;
        arg1.field1838 = this.field1838;
        arg1.field1840 = this.field1840;
        if (arg1.field1835 == null || arg1.field1835.length < this.field1836) {
            arg1.field1835 = new int[this.field1836 + 100];
            arg1.field1887 = new int[this.field1836 + 100];
            arg1.field1837 = new int[this.field1836 + 100];
        }
        for (int var4 = 0; var4 < this.field1836; var4++) {
            arg1.field1835[var4] = this.field1835[var4];
            arg1.field1887[var4] = this.field1887[var4];
            arg1.field1837[var4] = this.field1837[var4];
        }
        if (arg0) {
            arg1.field1846 = this.field1846;
        } else {
            arg1.field1846 = arg2;
            if (this.field1846 == null) {
                for (int var5 = 0; var5 < this.field1838; var5++) {
                    arg1.field1846[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1838; var6++) {
                    arg1.field1846[var6] = this.field1846[var6];
                }
            }
        }
        arg1.field1864 = this.field1864;
        arg1.field1881 = this.field1881;
        arg1.field1841 = this.field1841;
        arg1.field1863 = this.field1863;
        arg1.field1843 = this.field1843;
        arg1.field1844 = this.field1844;
        arg1.field1845 = this.field1845;
        arg1.field1847 = this.field1847;
        arg1.field1848 = this.field1848;
        arg1.field1849 = this.field1849;
        arg1.field1851 = this.field1851;
        arg1.field1852 = this.field1852;
        arg1.field1853 = this.field1853;
        arg1.field1854 = this.field1854;
        arg1.field1855 = this.field1855;
        arg1.field1856 = this.field1856;
        arg1.method2452();
        return arg1;
    }

    @ObfuscatedName("eh.m(I)V")
    public void method2406(int arg0) {
        if (this.field1865 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1895[arg0];
        int var9 = field1874[arg0];
        for (int var10 = 0; var10 < this.field1836; var10++) {
            int var11 = class136.method2516(this.field1835[var10], this.field1837[var10], var8, var9);
            int var12 = this.field1887[var10];
            int var13 = class136.method2522(this.field1835[var10], this.field1837[var10], var8, var9);
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
        this.field1832 = (var2 + var5) / 2;
        this.field1839 = (var3 + var6) / 2;
        this.field1894 = (var4 + var7) / 2;
        this.field1865 = (var5 - var2 + 1) / 2;
        this.field1866 = (var6 - var3 + 1) / 2;
        this.field1867 = (var7 - var4 + 1) / 2;
        if (this.field1865 < 32) {
            this.field1865 = 32;
        }
        if (this.field1867 < 32) {
            this.field1867 = 32;
        }
        if (this.field1856) {
            this.field1865 += 8;
            this.field1867 += 8;
        }
    }

    @ObfuscatedName("eh.b()V")
    public void method2407() {
        if (this.field1889 == 1) {
            return;
        }
        this.field1889 = 1;
        this.field2024 = 0;
        this.field1858 = 0;
        this.field1830 = 0;
        for (int var1 = 0; var1 < this.field1836; var1++) {
            int var2 = this.field1835[var1];
            int var3 = this.field1887[var1];
            int var4 = this.field1837[var1];
            if (-var3 > this.field2024) {
                this.field2024 = -var3;
            }
            if (var3 > this.field1858) {
                this.field1858 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1830) {
                this.field1830 = var5;
            }
        }
        this.field1830 = (int) (Math.sqrt((double) this.field1830) + 0.99D);
        this.field1861 = (int) (Math.sqrt((double) (this.field2024 * this.field2024 + this.field1830 * this.field1830)) + 0.99D);
        this.field1860 = this.field1861 + (int) (Math.sqrt((double) (this.field1858 * this.field1858 + this.field1830 * this.field1830)) + 0.99D);
    }

    @ObfuscatedName("eh.t()V")
    public void method2408() {
        if (this.field1889 == 2) {
            return;
        }
        this.field1889 = 2;
        this.field1830 = 0;
        for (int var1 = 0; var1 < this.field1836; var1++) {
            int var2 = this.field1835[var1];
            int var3 = this.field1887[var1];
            int var4 = this.field1837[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1830) {
                this.field1830 = var5;
            }
        }
        this.field1830 = (int) (Math.sqrt((double) this.field1830) + 0.99D);
        this.field1861 = this.field1830;
        this.field1860 = this.field1830 + this.field1830;
    }

    @ObfuscatedName("eh.p()I")
    public int method2470() {
        this.method2407();
        return this.field1830;
    }

    @ObfuscatedName("eh.r()V")
    public void method2452() {
        this.field1889 = 0;
        this.field1865 = -1;
    }

    @ObfuscatedName("eh.l(Lej;I)V")
    public void method2411(class144 arg0, int arg1) {
        if (this.field1854 == null || arg1 == -1) {
            return;
        }
        class131 var3 = arg0.field2044[arg1];
        class138 var4 = var3.field1799;
        Statics.field1888 = 0;
        Statics.field1831 = 0;
        Statics.field1890 = 0;
        for (int var5 = 0; var5 < var3.field1798; var5++) {
            int var6 = var3.field1801[var5];
            this.method2462(var4.field1957[var6], var4.field1955[var6], var3.field1795[var5], var3.field1802[var5], var3.field1804[var5]);
        }
        this.method2452();
    }

    @ObfuscatedName("eh.u(Lej;ILej;I[I)V")
    public void method2412(class144 arg0, int arg1, class144 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2411(arg0, arg1);
            return;
        }
        class131 var6 = arg0.field2044[arg1];
        class131 var7 = arg2.field2044[arg3];
        class138 var8 = var6.field1799;
        Statics.field1888 = 0;
        Statics.field1831 = 0;
        Statics.field1890 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1798; var11++) {
            int var12 = var6.field1801[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1957[var12] == 0) {
                this.method2462(var8.field1957[var12], var8.field1955[var12], var6.field1795[var11], var6.field1802[var11], var6.field1804[var11]);
            }
        }
        Statics.field1888 = 0;
        Statics.field1831 = 0;
        Statics.field1890 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1798; var15++) {
            int var16 = var7.field1801[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1957[var16] == 0) {
                this.method2462(var8.field1957[var16], var8.field1955[var16], var7.field1795[var15], var7.field1802[var15], var7.field1804[var15]);
            }
        }
        this.method2452();
    }

    @ObfuscatedName("eh.f(I[IIII)V")
    public void method2462(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1888 = 0;
            Statics.field1831 = 0;
            Statics.field1890 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1854.length) {
                    int[] var10 = this.field1854[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1888 += this.field1835[var12];
                        Statics.field1831 += this.field1887[var12];
                        Statics.field1890 += this.field1837[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1888 = Statics.field1888 / var7 + arg2;
                Statics.field1831 = Statics.field1831 / var7 + arg3;
                Statics.field1890 = Statics.field1890 / var7 + arg4;
            } else {
                Statics.field1888 = arg2;
                Statics.field1831 = arg3;
                Statics.field1890 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1854.length) {
                    int[] var15 = this.field1854[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1835[var17] += arg2;
                        this.field1887[var17] += arg3;
                        this.field1837[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1854.length) {
                    int[] var20 = this.field1854[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1835[var22] -= Statics.field1888;
                        this.field1887[var22] -= Statics.field1831;
                        this.field1837[var22] -= Statics.field1890;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1874[var25];
                            int var27 = field1895[var25];
                            int var28 = this.field1887[var22] * var26 + this.field1835[var22] * var27 >> 16;
                            this.field1887[var22] = this.field1887[var22] * var27 - this.field1835[var22] * var26 >> 16;
                            this.field1835[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1874[var23];
                            int var30 = field1895[var23];
                            int var31 = this.field1887[var22] * var30 - this.field1837[var22] * var29 >> 16;
                            this.field1837[var22] = this.field1887[var22] * var29 + this.field1837[var22] * var30 >> 16;
                            this.field1887[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1874[var24];
                            int var33 = field1895[var24];
                            int var34 = this.field1837[var22] * var32 + this.field1835[var22] * var33 >> 16;
                            this.field1837[var22] = this.field1837[var22] * var33 - this.field1835[var22] * var32 >> 16;
                            this.field1835[var22] = var34;
                        }
                        this.field1835[var22] += Statics.field1888;
                        this.field1887[var22] += Statics.field1831;
                        this.field1837[var22] += Statics.field1890;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1854.length) {
                    int[] var37 = this.field1854[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1835[var39] -= Statics.field1888;
                        this.field1887[var39] -= Statics.field1831;
                        this.field1837[var39] -= Statics.field1890;
                        this.field1835[var39] = this.field1835[var39] * arg2 / 128;
                        this.field1887[var39] = this.field1887[var39] * arg3 / 128;
                        this.field1837[var39] = this.field1837[var39] * arg4 / 128;
                        this.field1835[var39] += Statics.field1888;
                        this.field1887[var39] += Statics.field1831;
                        this.field1837[var39] += Statics.field1890;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1855 != null && this.field1846 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1855.length) {
                    int[] var42 = this.field1855[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1846[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1846[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.s()V")
    public void method2414() {
        for (int var1 = 0; var1 < this.field1836; var1++) {
            int var2 = this.field1835[var1];
            this.field1835[var1] = this.field1837[var1];
            this.field1837[var1] = -var2;
        }
        this.method2452();
    }

    @ObfuscatedName("eh.e()V")
    public void method2463() {
        for (int var1 = 0; var1 < this.field1836; var1++) {
            this.field1835[var1] = -this.field1835[var1];
            this.field1837[var1] = -this.field1837[var1];
        }
        this.method2452();
    }

    @ObfuscatedName("eh.q()V")
    public void method2431() {
        for (int var1 = 0; var1 < this.field1836; var1++) {
            int var2 = this.field1837[var1];
            this.field1837[var1] = this.field1835[var1];
            this.field1835[var1] = -var2;
        }
        this.method2452();
    }

    @ObfuscatedName("eh.h(I)V")
    public void method2417(int arg0) {
        int var2 = field1874[arg0];
        int var3 = field1895[arg0];
        for (int var4 = 0; var4 < this.field1836; var4++) {
            int var5 = this.field1887[var4] * var3 - this.field1837[var4] * var2 >> 16;
            this.field1837[var4] = this.field1887[var4] * var2 + this.field1837[var4] * var3 >> 16;
            this.field1887[var4] = var5;
        }
        this.method2452();
    }

    @ObfuscatedName("eh.i(III)V")
    public void method2419(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1836; var4++) {
            this.field1835[var4] += arg0;
            this.field1887[var4] += arg1;
            this.field1837[var4] += arg2;
        }
        this.method2452();
    }

    @ObfuscatedName("eh.o(III)V")
    public void method2410(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1836; var4++) {
            this.field1835[var4] = this.field1835[var4] * arg0 / 128;
            this.field1887[var4] = this.field1887[var4] * arg1 / 128;
            this.field1837[var4] = this.field1837[var4] * arg2 / 128;
        }
        this.method2452();
    }

    @ObfuscatedName("eh.w(IIIIIII)V")
    public final void method2436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1862[0] = -1;
        if (this.field1889 != 2 && this.field1889 != 1) {
            this.method2408();
        }
        int var8 = Statics.field1931;
        int var9 = Statics.field1918;
        int var10 = field1874[arg0];
        int var11 = field1895[arg0];
        int var12 = field1874[arg1];
        int var13 = field1895[arg1];
        int var14 = field1874[arg2];
        int var15 = field1895[arg2];
        int var16 = field1874[arg3];
        int var17 = field1895[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1836; var19++) {
            int var20 = this.field1835[var19];
            int var21 = this.field1887[var19];
            int var22 = this.field1837[var19];
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
            field1873[var19] = var30 - var18;
            field1871[var19] = class136.field1929 * var26 / var30 + var8;
            field1859[var19] = class136.field1929 * var29 / var30 + var9;
            if (this.field1840 > 0) {
                field1834[var19] = var26;
                field1875[var19] = var29;
                field1876[var19] = var30;
            }
        }
        try {
            this.method2450(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("eh.ah(IIIIIIII)V")
    public final void method2413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1862[0] = -1;
        if (this.field1889 != 2 && this.field1889 != 1) {
            this.method2408();
        }
        int var9 = Statics.field1931;
        int var10 = Statics.field1918;
        int var11 = field1874[arg0];
        int var12 = field1895[arg0];
        int var13 = field1874[arg1];
        int var14 = field1895[arg1];
        int var15 = field1874[arg2];
        int var16 = field1895[arg2];
        int var17 = field1874[arg3];
        int var18 = field1895[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1836; var20++) {
            int var21 = this.field1835[var20];
            int var22 = this.field1887[var20];
            int var23 = this.field1837[var20];
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
            field1873[var20] = var31 - var19;
            field1871[var20] = class136.field1929 * var27 / arg7 + var9;
            field1859[var20] = class136.field1929 * var30 / arg7 + var10;
            if (this.field1840 > 0) {
                field1834[var20] = var27;
                field1875[var20] = var30;
                field1876[var20] = var31;
            }
        }
        try {
            this.method2450(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("eh.cl(IIIIIIIII)V")
    public void method2421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1862[0] = -1;
        if (this.field1889 != 1) {
            this.method2407();
        }
        this.method2406(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1830 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1830) * class136.field1929;
        if (var15 / var13 >= Statics.field1935) {
            return;
        }
        int var16 = (this.field1830 + var14) * class136.field1929;
        if (var16 / var13 <= Statics.field1934) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1830 * arg1 >> 16;
        int var19 = (var17 + var18) * class136.field1929;
        if (var19 / var13 <= Statics.field1936) {
            return;
        }
        int var20 = (this.field2024 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class136.field1929;
        if (var21 / var13 >= Statics.field1937) {
            return;
        }
        int var22 = (this.field2024 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1840 > 0;
        int var26 = class134.method12();
        int var27 = class134.field1902;
        boolean var29 = class134.method1628();
        if (class8.field228 && arg8 > 0) {
            class8.method2496(this, arg5, arg6, arg7);
        }
        if (class8.field223 && arg8 > 0) {
            int var30 = var11 - var12;
            if (var30 <= 50) {
                var30 = 50;
            }
            int var35;
            int var36;
            if (var14 > 0) {
                var35 = var15 / var13;
                var36 = var16 / var30;
            } else {
                var36 = var16 / var13;
                var35 = var15 / var30;
            }
            int var37;
            int var38;
            if (var17 > 0) {
                var37 = var21 / var13;
                var38 = var19 / var30;
            } else {
                var38 = var19 / var13;
                var37 = var21 / var30;
            }
            int var39 = -8355840;
            int var40 = var26 - Statics.field1931;
            int var41 = var27 - Statics.field1918;
            if (var40 > var35 && var40 < var36 && var41 > var37 && var41 < var38) {
                var39 = -256;
            }
            int var42 = Statics.field1931 + var35;
            int var43 = Statics.field1918 + var37;
            int var44 = Statics.field1931 + var36;
            int var45 = Statics.field1918 + var38;
            class8.field227.method3455(new class9(var42, var43, var44, var45, var39));
        }
        boolean var46 = false;
        if (arg8 > 0 && var29) {
            boolean var47 = false;
            if (field1891) {
                var47 = class134.method3762(this, arg5, arg6, arg7);
            } else {
                int var48 = var11 - var12;
                if (var48 <= 50) {
                    var48 = 50;
                }
                int var49;
                int var50;
                if (var14 > 0) {
                    var49 = var15 / var13;
                    var50 = var16 / var48;
                } else {
                    var50 = var16 / var13;
                    var49 = var15 / var48;
                }
                int var51;
                int var52;
                if (var17 > 0) {
                    var51 = var21 / var13;
                    var52 = var19 / var48;
                } else {
                    var52 = var19 / var13;
                    var51 = var21 / var48;
                }
                int var53 = var26 - Statics.field1931;
                int var54 = var27 - Statics.field1918;
                if (var53 > var49 && var53 < var50 && var54 > var51 && var54 < var52) {
                    var47 = true;
                }
            }
            if (var47) {
                if (this.field1856) {
                    class134.field1904[++class134.field1910 - 1] = arg8;
                } else {
                    var46 = true;
                }
            }
        }
        int var56 = Statics.field1931;
        int var57 = Statics.field1918;
        int var58 = 0;
        int var59 = 0;
        if (arg0 != 0) {
            var58 = field1874[arg0];
            var59 = field1895[arg0];
        }
        for (int var60 = 0; var60 < this.field1836; var60++) {
            int var61 = this.field1835[var60];
            int var62 = this.field1887[var60];
            int var63 = this.field1837[var60];
            if (arg0 != 0) {
                int var64 = var58 * var63 + var59 * var61 >> 16;
                var63 = var59 * var63 - var58 * var61 >> 16;
                var61 = var64;
            }
            int var65 = arg5 + var61;
            int var66 = arg6 + var62;
            int var67 = arg7 + var63;
            int var68 = arg3 * var67 + arg4 * var65 >> 16;
            int var69 = arg4 * var67 - arg3 * var65 >> 16;
            int var71 = arg2 * var66 - arg1 * var69 >> 16;
            int var72 = arg1 * var66 + arg2 * var69 >> 16;
            field1873[var60] = var72 - var11;
            if (var72 >= 50) {
                field1871[var60] = class136.field1929 * var68 / var72 + var56;
                field1859[var60] = class136.field1929 * var71 / var72 + var57;
            } else {
                field1871[var60] = -5000;
                var23 = true;
            }
            if (var25) {
                field1834[var60] = var68;
                field1875[var60] = var71;
                field1876[var60] = var72;
            }
        }
        try {
            this.method2450(var23, var46, this.field1856, arg8);
        } catch (Exception var75) {
        }
    }

    @ObfuscatedName("eh.ak(ZZZI)V")
    public final void method2450(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1860 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1860; var5++) {
            field1862[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field225 && arg1) {
            class133 var7 = this;
            for (int var8 = 0; var8 < var7.field1838; var8++) {
                if (var7.field1844[var8] != -2) {
                    int var9 = var7.field1864[var8];
                    int var10 = var7.field1881[var8];
                    int var11 = var7.field1841[var8];
                    int var12 = field1871[var9];
                    int var13 = field1871[var10];
                    int var14 = field1871[var11];
                    int var15 = field1859[var9];
                    int var16 = field1859[var10];
                    int var17 = field1859[var11];
                    int var18 = Math.min(var12, Math.min(var13, var14)) - var6;
                    int var19 = Math.max(var12, Math.max(var13, var14)) + var6;
                    int var20 = Math.min(var15, Math.min(var16, var17)) - var6;
                    int var21 = Math.max(var15, Math.max(var16, var17)) + var6;
                    class8.field227.method3455(new class9(var18, var20, var19, var21, -49088));
                }
            }
        }
        for (int var22 = 0; var22 < this.field1838; var22++) {
            if (this.field1844[var22] != -2) {
                int var23 = this.field1864[var22];
                int var24 = this.field1881[var22];
                int var25 = this.field1841[var22];
                int var26 = field1871[var23];
                int var27 = field1871[var24];
                int var28 = field1871[var25];
                if (arg0 && var26 == -5000 || var27 == -5000 || var28 == -5000) {
                    int var29 = field1834[var23];
                    int var30 = field1834[var24];
                    int var31 = field1834[var25];
                    int var32 = field1875[var23];
                    int var33 = field1875[var24];
                    int var34 = field1875[var25];
                    int var35 = field1876[var23];
                    int var36 = field1876[var24];
                    int var37 = field1876[var25];
                    int var38 = var29 - var30;
                    int var39 = var31 - var30;
                    int var40 = var32 - var33;
                    int var41 = var34 - var33;
                    int var42 = var35 - var36;
                    int var43 = var37 - var36;
                    int var44 = var40 * var43 - var41 * var42;
                    int var45 = var39 * var42 - var38 * var43;
                    int var46 = var38 * var41 - var39 * var40;
                    if (var36 * var46 + var30 * var44 + var33 * var45 > 0) {
                        field1870[var22] = true;
                        int var47 = (field1873[var23] + field1873[var24] + field1873[var25]) / 3 + this.field1861;
                        field1850[var47][field1862[var47]++] = var22;
                    }
                } else {
                    if (arg1 && class134.method11(field1859[var23], field1859[var24], field1859[var25], var26, var27, var28, var6)) {
                        class134.field1904[++class134.field1910 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field1859[var25] - field1859[var24]) * (var26 - var27) - (field1859[var23] - field1859[var24]) * (var28 - var27) > 0) {
                        field1870[var22] = false;
                        if (var26 >= 0 && var27 >= 0 && var28 >= 0 && var26 <= Statics.field1927 && var27 <= Statics.field1927 && var28 <= Statics.field1927) {
                            field1869[var22] = false;
                        } else {
                            field1869[var22] = true;
                        }
                        int var49 = (field1873[var23] + field1873[var24] + field1873[var25]) / 3 + this.field1861;
                        field1850[var49][field1862[var49]++] = var22;
                    }
                }
            }
        }
        if (this.field1845 == null) {
            for (int var50 = this.field1860 - 1; var50 >= 0; var50--) {
                int var51 = field1862[var50];
                if (var51 > 0) {
                    int[] var52 = field1850[var50];
                    for (int var53 = 0; var53 < var51; var53++) {
                        this.method2423(var52[var53]);
                    }
                }
            }
            return;
        }
        for (int var54 = 0; var54 < 12; var54++) {
            field1880[var54] = 0;
            field1884[var54] = 0;
        }
        for (int var55 = this.field1860 - 1; var55 >= 0; var55--) {
            int var56 = field1862[var55];
            if (var56 > 0) {
                int[] var57 = field1850[var55];
                for (int var58 = 0; var58 < var56; var58++) {
                    int var59 = var57[var58];
                    byte var60 = this.field1845[var59];
                    int var61 = field1880[var60]++;
                    field1882[var60][var61] = var59;
                    if (var60 < 10) {
                        field1884[var60] += var55;
                    } else if (var60 == 10) {
                        field1879[var61] = var55;
                    } else {
                        field1883[var61] = var55;
                    }
                }
            }
        }
        int var62 = 0;
        if (field1880[1] > 0 || field1880[2] > 0) {
            var62 = (field1884[1] + field1884[2]) / (field1880[1] + field1880[2]);
        }
        int var63 = 0;
        if (field1880[3] > 0 || field1880[4] > 0) {
            var63 = (field1884[3] + field1884[4]) / (field1880[3] + field1880[4]);
        }
        int var64 = 0;
        if (field1880[6] > 0 || field1880[8] > 0) {
            var64 = (field1884[6] + field1884[8]) / (field1880[6] + field1880[8]);
        }
        int var65 = 0;
        int var66 = field1880[10];
        int[] var67 = field1882[10];
        int[] var68 = field1879;
        if (var65 == var66) {
            var65 = 0;
            var66 = field1880[11];
            var67 = field1882[11];
            var68 = field1883;
        }
        int var69;
        if (var65 < var66) {
            var69 = var68[var65];
        } else {
            var69 = -1000;
        }
        for (int var70 = 0; var70 < 10; var70++) {
            while (var70 == 0 && var69 > var62) {
                this.method2423(var67[var65++]);
                if (var65 == var66 && field1882[11] != var67) {
                    var65 = 0;
                    var66 = field1880[11];
                    var67 = field1882[11];
                    var68 = field1883;
                }
                if (var65 < var66) {
                    var69 = var68[var65];
                } else {
                    var69 = -1000;
                }
            }
            while (var70 == 3 && var69 > var63) {
                this.method2423(var67[var65++]);
                if (var65 == var66 && field1882[11] != var67) {
                    var65 = 0;
                    var66 = field1880[11];
                    var67 = field1882[11];
                    var68 = field1883;
                }
                if (var65 < var66) {
                    var69 = var68[var65];
                } else {
                    var69 = -1000;
                }
            }
            while (var70 == 5 && var69 > var64) {
                this.method2423(var67[var65++]);
                if (var65 == var66 && field1882[11] != var67) {
                    var65 = 0;
                    var66 = field1880[11];
                    var67 = field1882[11];
                    var68 = field1883;
                }
                if (var65 < var66) {
                    var69 = var68[var65];
                } else {
                    var69 = -1000;
                }
            }
            int var71 = field1880[var70];
            int[] var72 = field1882[var70];
            for (int var73 = 0; var73 < var71; var73++) {
                this.method2423(var72[var73]);
            }
        }
        while (var69 != -1000) {
            this.method2423(var67[var65++]);
            if (var65 == var66 && field1882[11] != var67) {
                var65 = 0;
                var67 = field1882[11];
                var66 = field1880[11];
                var68 = field1883;
            }
            if (var65 < var66) {
                var69 = var68[var65];
            } else {
                var69 = -1000;
            }
        }
    }

    @ObfuscatedName("eh.aa(I)V")
    public final void method2423(int arg0) {
        if (field1870[arg0]) {
            this.method2424(arg0);
            return;
        }
        int var2 = this.field1864[arg0];
        int var3 = this.field1881[arg0];
        int var4 = this.field1841[arg0];
        class136.field1944 = field1869[arg0];
        if (this.field1846 == null) {
            class136.field1922 = 0;
        } else {
            class136.field1922 = this.field1846[arg0] & 0xFF;
        }
        if (this.field1848 != null && this.field1848[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1847 == null || this.field1847[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1847[arg0] & 0xFF;
                var6 = this.field1851[var5];
                var7 = this.field1852[var5];
                var8 = this.field1853[var5];
            }
            if (this.field1844[arg0] == -1) {
                class136.method2511(field1859[var2], field1859[var3], field1859[var4], field1871[var2], field1871[var3], field1871[var4], this.field1863[arg0], this.field1863[arg0], this.field1863[arg0], field1834[var6], field1834[var7], field1834[var8], field1875[var6], field1875[var7], field1875[var8], field1876[var6], field1876[var7], field1876[var8], this.field1848[arg0]);
            } else {
                class136.method2511(field1859[var2], field1859[var3], field1859[var4], field1871[var2], field1871[var3], field1871[var4], this.field1863[arg0], this.field1843[arg0], this.field1844[arg0], field1834[var6], field1834[var7], field1834[var8], field1875[var6], field1875[var7], field1875[var8], field1876[var6], field1876[var7], field1876[var8], this.field1848[arg0]);
            }
        } else if (this.field1844[arg0] == -1) {
            class136.method2531(field1859[var2], field1859[var3], field1859[var4], field1871[var2], field1871[var3], field1871[var4], field1896[this.field1863[arg0]]);
        } else {
            class136.method2507(field1859[var2], field1859[var3], field1859[var4], field1871[var2], field1871[var3], field1871[var4], this.field1863[arg0], this.field1843[arg0], this.field1844[arg0]);
        }
    }

    @ObfuscatedName("eh.ax(I)V")
    public final void method2424(int arg0) {
        int var2 = Statics.field1931;
        int var3 = Statics.field1918;
        int var4 = 0;
        int var5 = this.field1864[arg0];
        int var6 = this.field1881[arg0];
        int var7 = this.field1841[arg0];
        int var8 = field1876[var5];
        int var9 = field1876[var6];
        int var10 = field1876[var7];
        if (this.field1846 == null) {
            class136.field1922 = 0;
        } else {
            class136.field1922 = this.field1846[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1885[var4] = field1871[var5];
            field1886[var4] = field1859[var5];
            field1878[var4++] = this.field1863[arg0];
        } else {
            int var11 = field1834[var5];
            int var12 = field1875[var5];
            int var13 = this.field1863[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1897[var10 - var8];
                field1885[var4] = (((field1834[var7] - var11) * var14 >> 16) + var11) * class136.field1929 / 50 + var2;
                field1886[var4] = (((field1875[var7] - var12) * var14 >> 16) + var12) * class136.field1929 / 50 + var3;
                field1878[var4++] = ((this.field1844[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1897[var9 - var8];
                field1885[var4] = (((field1834[var6] - var11) * var15 >> 16) + var11) * class136.field1929 / 50 + var2;
                field1886[var4] = (((field1875[var6] - var12) * var15 >> 16) + var12) * class136.field1929 / 50 + var3;
                field1878[var4++] = ((this.field1843[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1885[var4] = field1871[var6];
            field1886[var4] = field1859[var6];
            field1878[var4++] = this.field1843[arg0];
        } else {
            int var16 = field1834[var6];
            int var17 = field1875[var6];
            int var18 = this.field1843[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1897[var8 - var9];
                field1885[var4] = (((field1834[var5] - var16) * var19 >> 16) + var16) * class136.field1929 / 50 + var2;
                field1886[var4] = (((field1875[var5] - var17) * var19 >> 16) + var17) * class136.field1929 / 50 + var3;
                field1878[var4++] = ((this.field1863[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1897[var10 - var9];
                field1885[var4] = (((field1834[var7] - var16) * var20 >> 16) + var16) * class136.field1929 / 50 + var2;
                field1886[var4] = (((field1875[var7] - var17) * var20 >> 16) + var17) * class136.field1929 / 50 + var3;
                field1878[var4++] = ((this.field1844[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1885[var4] = field1871[var7];
            field1886[var4] = field1859[var7];
            field1878[var4++] = this.field1844[arg0];
        } else {
            int var21 = field1834[var7];
            int var22 = field1875[var7];
            int var23 = this.field1844[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1897[var9 - var10];
                field1885[var4] = (((field1834[var6] - var21) * var24 >> 16) + var21) * class136.field1929 / 50 + var2;
                field1886[var4] = (((field1875[var6] - var22) * var24 >> 16) + var22) * class136.field1929 / 50 + var3;
                field1878[var4++] = ((this.field1843[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1897[var8 - var10];
                field1885[var4] = (((field1834[var5] - var21) * var25 >> 16) + var21) * class136.field1929 / 50 + var2;
                field1886[var4] = (((field1875[var5] - var22) * var25 >> 16) + var22) * class136.field1929 / 50 + var3;
                field1878[var4++] = ((this.field1863[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1885[0];
        int var27 = field1885[1];
        int var28 = field1885[2];
        int var29 = field1886[0];
        int var30 = field1886[1];
        int var31 = field1886[2];
        class136.field1944 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1927 || var27 > Statics.field1927 || var28 > Statics.field1927) {
                class136.field1944 = true;
            }
            if (this.field1848 != null && this.field1848[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1847 == null || this.field1847[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1847[arg0] & 0xFF;
                    var33 = this.field1851[var32];
                    var34 = this.field1852[var32];
                    var35 = this.field1853[var32];
                }
                if (this.field1844[arg0] == -1) {
                    class136.method2511(var29, var30, var31, var26, var27, var28, this.field1863[arg0], this.field1863[arg0], this.field1863[arg0], field1834[var33], field1834[var34], field1834[var35], field1875[var33], field1875[var34], field1875[var35], field1876[var33], field1876[var34], field1876[var35], this.field1848[arg0]);
                } else {
                    class136.method2511(var29, var30, var31, var26, var27, var28, field1878[0], field1878[1], field1878[2], field1834[var33], field1834[var34], field1834[var35], field1875[var33], field1875[var34], field1875[var35], field1876[var33], field1876[var34], field1876[var35], this.field1848[arg0]);
                }
            } else if (this.field1844[arg0] == -1) {
                class136.method2531(var29, var30, var31, var26, var27, var28, field1896[this.field1863[arg0]]);
            } else {
                class136.method2507(var29, var30, var31, var26, var27, var28, field1878[0], field1878[1], field1878[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1927 || var27 > Statics.field1927 || var28 > Statics.field1927 || field1885[3] < 0 || field1885[3] > Statics.field1927) {
            class136.field1944 = true;
        }
        if (this.field1848 != null && this.field1848[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1847 == null || this.field1847[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1847[arg0] & 0xFF;
                var37 = this.field1851[var36];
                var38 = this.field1852[var36];
                var39 = this.field1853[var36];
            }
            short var40 = this.field1848[arg0];
            if (this.field1844[arg0] == -1) {
                class136.method2511(var29, var30, var31, var26, var27, var28, this.field1863[arg0], this.field1863[arg0], this.field1863[arg0], field1834[var37], field1834[var38], field1834[var39], field1875[var37], field1875[var38], field1875[var39], field1876[var37], field1876[var38], field1876[var39], var40);
                class136.method2511(var29, var31, field1886[3], var26, var28, field1885[3], this.field1863[arg0], this.field1863[arg0], this.field1863[arg0], field1834[var37], field1834[var38], field1834[var39], field1875[var37], field1875[var38], field1875[var39], field1876[var37], field1876[var38], field1876[var39], var40);
            } else {
                class136.method2511(var29, var30, var31, var26, var27, var28, field1878[0], field1878[1], field1878[2], field1834[var37], field1834[var38], field1834[var39], field1875[var37], field1875[var38], field1875[var39], field1876[var37], field1876[var38], field1876[var39], var40);
                class136.method2511(var29, var31, field1886[3], var26, var28, field1885[3], field1878[0], field1878[2], field1878[3], field1834[var37], field1834[var38], field1834[var39], field1875[var37], field1875[var38], field1875[var39], field1876[var37], field1876[var38], field1876[var39], var40);
            }
        } else if (this.field1844[arg0] == -1) {
            int var41 = field1896[this.field1863[arg0]];
            class136.method2531(var29, var30, var31, var26, var27, var28, var41);
            class136.method2531(var29, var31, field1886[3], var26, var28, field1885[3], var41);
        } else {
            class136.method2507(var29, var30, var31, var26, var27, var28, field1878[0], field1878[1], field1878[2]);
            class136.method2507(var29, var31, field1886[3], var26, var28, field1885[3], field1878[0], field1878[2], field1878[3]);
        }
    }
}
