package deob;

@ObfuscatedName("es")
public class class133 extends class141 {

    @ObfuscatedName("es.n")
    public static class133 field1888 = new class133();

    @ObfuscatedName("es.v")
    public static byte[] field1830 = new byte[1];

    @ObfuscatedName("es.y")
    public static class133 field1831 = new class133();

    @ObfuscatedName("es.r")
    public static byte[] field1832 = new byte[1];

    @ObfuscatedName("es.h")
    public int field1833 = 0;

    @ObfuscatedName("es.d")
    public int[] field1834;

    @ObfuscatedName("es.s")
    public int[] field1835;

    @ObfuscatedName("es.b")
    public int[] field1836;

    @ObfuscatedName("es.e")
    public int field1873 = 0;

    @ObfuscatedName("es.f")
    public int[] field1838;

    @ObfuscatedName("es.z")
    public int[] field1892;

    @ObfuscatedName("es.u")
    public int[] field1841;

    @ObfuscatedName("es.p")
    public int[] field1859;

    @ObfuscatedName("es.w")
    public int[] field1844;

    @ObfuscatedName("es.t")
    public int[] field1843;

    @ObfuscatedName("es.o")
    public byte[] field1850;

    @ObfuscatedName("es.a")
    public byte[] field1842;

    @ObfuscatedName("es.i")
    public byte[] field1858;

    @ObfuscatedName("es.m")
    public short[] field1847;

    @ObfuscatedName("es.x")
    public byte field1848 = 0;

    @ObfuscatedName("es.l")
    public int field1887 = 0;

    @ObfuscatedName("es.j")
    public int[] field1840;

    @ObfuscatedName("es.g")
    public int[] field1851;

    @ObfuscatedName("es.c")
    public int[] field1852;

    @ObfuscatedName("es.k")
    public int[][] field1853;

    @ObfuscatedName("es.q")
    public int[][] field1854;

    @ObfuscatedName("es.ac")
    public boolean field1855 = false;

    @ObfuscatedName("es.aw")
    public int field1856;

    @ObfuscatedName("es.at")
    public int field1857;

    @ObfuscatedName("es.ag")
    public int field1881;

    @ObfuscatedName("es.ad")
    public int field1896;

    @ObfuscatedName("es.af")
    public int field1860;

    @ObfuscatedName("es.az")
    public int field1897;

    @ObfuscatedName("es.ae")
    public int field1862;

    @ObfuscatedName("es.av")
    public int field1863;

    @ObfuscatedName("es.am")
    public int field1864 = -1;

    @ObfuscatedName("es.ax")
    public int field1865 = -1;

    @ObfuscatedName("es.ah")
    public int field1886 = -1;

    @ObfuscatedName("es.aj")
    public static boolean[] field1861 = new boolean[4700];

    @ObfuscatedName("es.aa")
    public static boolean[] field1849 = new boolean[4700];

    @ObfuscatedName("es.ao")
    public static int[] field1870 = new int[4700];

    @ObfuscatedName("es.al")
    public static int[] field1871 = new int[4700];

    @ObfuscatedName("es.ay")
    public static int[] field1872 = new int[4700];

    @ObfuscatedName("es.aq")
    public static int[] field1889 = new int[4700];

    @ObfuscatedName("es.ak")
    public static int[] field1876 = new int[4700];

    @ObfuscatedName("es.as")
    public static int[] field1875 = new int[4700];

    @ObfuscatedName("es.an")
    public static int[] field1877 = new int[1600];

    @ObfuscatedName("es.ai")
    public static int[][] field1845 = new int[1600][512];

    @ObfuscatedName("es.ap")
    public static int[] field1879 = new int[12];

    @ObfuscatedName("es.ar")
    public static int[][] field1880 = new int[12][2000];

    @ObfuscatedName("es.bg")
    public static int[] field1866 = new int[2000];

    @ObfuscatedName("es.bq")
    public static int[] field1882 = new int[2000];

    @ObfuscatedName("es.bk")
    public static int[] field1883 = new int[12];

    @ObfuscatedName("es.by")
    public static int[] field1884 = new int[10];

    @ObfuscatedName("es.bz")
    public static int[] field1885 = new int[10];

    @ObfuscatedName("es.bj")
    public static int[] field1869 = new int[10];

    @ObfuscatedName("es.bx")
    public static boolean field1890 = true;

    @ObfuscatedName("es.be")
    public static int[] field1893 = class136.field1942;

    @ObfuscatedName("es.ba")
    public static int[] field1868 = class136.field1922;

    @ObfuscatedName("es.bw")
    public static int[] field1895 = class136.field1918;

    @ObfuscatedName("es.bp")
    public static int[] field1874 = class136.field1940;

    public class133() {
    }

    public class133(class133[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1833 = 0;
        this.field1873 = 0;
        this.field1887 = 0;
        this.field1848 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class133 var8 = arg0[var7];
            if (var8 != null) {
                this.field1833 += var8.field1833;
                this.field1873 += var8.field1873;
                this.field1887 += var8.field1887;
                if (var8.field1850 == null) {
                    if (this.field1848 == -1) {
                        this.field1848 = var8.field1848;
                    }
                    if (this.field1848 != var8.field1848) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1842 != null;
                var5 |= var8.field1847 != null;
                var6 |= var8.field1858 != null;
            }
        }
        this.field1834 = new int[this.field1833];
        this.field1835 = new int[this.field1833];
        this.field1836 = new int[this.field1833];
        this.field1838 = new int[this.field1873];
        this.field1892 = new int[this.field1873];
        this.field1841 = new int[this.field1873];
        this.field1859 = new int[this.field1873];
        this.field1844 = new int[this.field1873];
        this.field1843 = new int[this.field1873];
        if (var3) {
            this.field1850 = new byte[this.field1873];
        }
        if (var4) {
            this.field1842 = new byte[this.field1873];
        }
        if (var5) {
            this.field1847 = new short[this.field1873];
        }
        if (var6) {
            this.field1858 = new byte[this.field1873];
        }
        if (this.field1887 > 0) {
            this.field1840 = new int[this.field1887];
            this.field1851 = new int[this.field1887];
            this.field1852 = new int[this.field1887];
        }
        this.field1833 = 0;
        this.field1873 = 0;
        this.field1887 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class133 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1873; var11++) {
                    this.field1838[this.field1873] = var10.field1838[var11] + this.field1833;
                    this.field1892[this.field1873] = var10.field1892[var11] + this.field1833;
                    this.field1841[this.field1873] = var10.field1841[var11] + this.field1833;
                    this.field1859[this.field1873] = var10.field1859[var11];
                    this.field1844[this.field1873] = var10.field1844[var11];
                    this.field1843[this.field1873] = var10.field1843[var11];
                    if (var3) {
                        if (var10.field1850 == null) {
                            this.field1850[this.field1873] = var10.field1848;
                        } else {
                            this.field1850[this.field1873] = var10.field1850[var11];
                        }
                    }
                    if (var4 && var10.field1842 != null) {
                        this.field1842[this.field1873] = var10.field1842[var11];
                    }
                    if (var5) {
                        if (var10.field1847 == null) {
                            this.field1847[this.field1873] = -1;
                        } else {
                            this.field1847[this.field1873] = var10.field1847[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1858 == null || var10.field1858[var11] == -1) {
                            this.field1858[this.field1873] = -1;
                        } else {
                            this.field1858[this.field1873] = (byte) (var10.field1858[var11] + this.field1887);
                        }
                    }
                    this.field1873++;
                }
                for (int var12 = 0; var12 < var10.field1887; var12++) {
                    this.field1840[this.field1887] = var10.field1840[var12] + this.field1833;
                    this.field1851[this.field1887] = var10.field1851[var12] + this.field1833;
                    this.field1852[this.field1887] = var10.field1852[var12] + this.field1833;
                    this.field1887++;
                }
                for (int var13 = 0; var13 < var10.field1833; var13++) {
                    this.field1834[this.field1833] = var10.field1834[var13];
                    this.field1835[this.field1833] = var10.field1835[var13];
                    this.field1836[this.field1833] = var10.field1836[var13];
                    this.field1833++;
                }
            }
        }
    }

    @ObfuscatedName("es.n([[IIIIZI)Les;")
    public class133 method2347(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2359();
        int var7 = arg1 - this.field1881;
        int var8 = this.field1881 + arg1;
        int var9 = arg3 - this.field1881;
        int var10 = this.field1881 + arg3;
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
            var15.field1833 = this.field1833;
            var15.field1873 = this.field1873;
            var15.field1887 = this.field1887;
            var15.field1834 = this.field1834;
            var15.field1836 = this.field1836;
            var15.field1838 = this.field1838;
            var15.field1892 = this.field1892;
            var15.field1841 = this.field1841;
            var15.field1859 = this.field1859;
            var15.field1844 = this.field1844;
            var15.field1843 = this.field1843;
            var15.field1850 = this.field1850;
            var15.field1842 = this.field1842;
            var15.field1858 = this.field1858;
            var15.field1847 = this.field1847;
            var15.field1848 = this.field1848;
            var15.field1840 = this.field1840;
            var15.field1851 = this.field1851;
            var15.field1852 = this.field1852;
            var15.field1853 = this.field1853;
            var15.field1854 = this.field1854;
            var15.field1855 = this.field1855;
            var15.field1835 = new int[var15.field1833];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1833; var16++) {
                int var17 = this.field1834[var16] + arg1;
                int var18 = this.field1836[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1835[var16] = this.field1835[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1833; var26++) {
                int var27 = (-this.field1835[var26] << 16) / this.field2026;
                if (var27 < arg5) {
                    int var28 = this.field1834[var26] + arg1;
                    int var29 = this.field1836[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1835[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1835[var26];
                }
            }
        }
        var15.method2355();
        return var15;
    }

    @ObfuscatedName("es.v(Z)Les;")
    public class133 method2358(boolean arg0) {
        if (!arg0 && field1830.length < this.field1873) {
            field1830 = new byte[this.field1873 + 100];
        }
        return this.method2350(arg0, field1888, field1830);
    }

    @ObfuscatedName("es.r(Z)Les;")
    public class133 method2348(boolean arg0) {
        if (!arg0 && field1832.length < this.field1873) {
            field1832 = new byte[this.field1873 + 100];
        }
        return this.method2350(arg0, field1831, field1832);
    }

    @ObfuscatedName("es.h(ZLes;[B)Les;")
    public class133 method2350(boolean arg0, class133 arg1, byte[] arg2) {
        arg1.field1833 = this.field1833;
        arg1.field1873 = this.field1873;
        arg1.field1887 = this.field1887;
        if (arg1.field1834 == null || arg1.field1834.length < this.field1833) {
            arg1.field1834 = new int[this.field1833 + 100];
            arg1.field1835 = new int[this.field1833 + 100];
            arg1.field1836 = new int[this.field1833 + 100];
        }
        for (int var4 = 0; var4 < this.field1833; var4++) {
            arg1.field1834[var4] = this.field1834[var4];
            arg1.field1835[var4] = this.field1835[var4];
            arg1.field1836[var4] = this.field1836[var4];
        }
        if (arg0) {
            arg1.field1842 = this.field1842;
        } else {
            arg1.field1842 = arg2;
            if (this.field1842 == null) {
                for (int var5 = 0; var5 < this.field1873; var5++) {
                    arg1.field1842[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1873; var6++) {
                    arg1.field1842[var6] = this.field1842[var6];
                }
            }
        }
        arg1.field1838 = this.field1838;
        arg1.field1892 = this.field1892;
        arg1.field1841 = this.field1841;
        arg1.field1859 = this.field1859;
        arg1.field1844 = this.field1844;
        arg1.field1843 = this.field1843;
        arg1.field1850 = this.field1850;
        arg1.field1858 = this.field1858;
        arg1.field1847 = this.field1847;
        arg1.field1848 = this.field1848;
        arg1.field1840 = this.field1840;
        arg1.field1851 = this.field1851;
        arg1.field1852 = this.field1852;
        arg1.field1853 = this.field1853;
        arg1.field1854 = this.field1854;
        arg1.field1855 = this.field1855;
        arg1.method2355();
        return arg1;
    }

    @ObfuscatedName("es.d(I)V")
    public void method2351(int arg0) {
        if (this.field1864 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1868[arg0];
        int var9 = field1893[arg0];
        for (int var10 = 0; var10 < this.field1833; var10++) {
            int var11 = class136.method2468(this.field1834[var10], this.field1836[var10], var8, var9);
            int var12 = this.field1835[var10];
            int var13 = class136.method2471(this.field1834[var10], this.field1836[var10], var8, var9);
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
        this.field1862 = (var3 + var6) / 2;
        this.field1863 = (var4 + var7) / 2;
        this.field1864 = (var5 - var2 + 1) / 2;
        this.field1865 = (var6 - var3 + 1) / 2;
        this.field1886 = (var7 - var4 + 1) / 2;
        if (this.field1864 < 32) {
            this.field1864 = 32;
        }
        if (this.field1886 < 32) {
            this.field1886 = 32;
        }
        if (this.field1855) {
            this.field1864 += 8;
            this.field1886 += 8;
        }
    }

    @ObfuscatedName("es.s()V")
    public void method2359() {
        if (this.field1856 == 1) {
            return;
        }
        this.field1856 = 1;
        this.field2026 = 0;
        this.field1857 = 0;
        this.field1881 = 0;
        for (int var1 = 0; var1 < this.field1833; var1++) {
            int var2 = this.field1834[var1];
            int var3 = this.field1835[var1];
            int var4 = this.field1836[var1];
            if (-var3 > this.field2026) {
                this.field2026 = -var3;
            }
            if (var3 > this.field1857) {
                this.field1857 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1881) {
                this.field1881 = var5;
            }
        }
        this.field1881 = (int) (Math.sqrt((double) this.field1881) + 0.99D);
        this.field1860 = (int) (Math.sqrt((double) (this.field2026 * this.field2026 + this.field1881 * this.field1881)) + 0.99D);
        this.field1896 = this.field1860 + (int) (Math.sqrt((double) (this.field1881 * this.field1881 + this.field1857 * this.field1857)) + 0.99D);
    }

    @ObfuscatedName("es.b()V")
    public void method2366() {
        if (this.field1856 == 2) {
            return;
        }
        this.field1856 = 2;
        this.field1881 = 0;
        for (int var1 = 0; var1 < this.field1833; var1++) {
            int var2 = this.field1834[var1];
            int var3 = this.field1835[var1];
            int var4 = this.field1836[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1881) {
                this.field1881 = var5;
            }
        }
        this.field1881 = (int) (Math.sqrt((double) this.field1881) + 0.99D);
        this.field1860 = this.field1881;
        this.field1896 = this.field1881 + this.field1881;
    }

    @ObfuscatedName("es.e()I")
    public int method2354() {
        this.method2359();
        return this.field1881;
    }

    @ObfuscatedName("es.f()V")
    public void method2355() {
        this.field1856 = 0;
        this.field1864 = -1;
    }

    @ObfuscatedName("es.u(Lek;I)V")
    public void method2353(class144 arg0, int arg1) {
        if (this.field1853 == null || arg1 == -1) {
            return;
        }
        class131 var3 = arg0.field2047[arg1];
        class138 var4 = var3.field1797;
        Statics.field1829 = 0;
        Statics.field1894 = 0;
        Statics.field1839 = 0;
        for (int var5 = 0; var5 < var3.field1798; var5++) {
            int var6 = var3.field1800[var5];
            this.method2357(var4.field1954[var6], var4.field1957[var6], var3.field1794[var5], var3.field1801[var5], var3.field1802[var5]);
        }
        this.method2355();
    }

    @ObfuscatedName("es.t(Lek;ILek;I[I)V")
    public void method2414(class144 arg0, int arg1, class144 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2353(arg0, arg1);
            return;
        }
        class131 var6 = arg0.field2047[arg1];
        class131 var7 = arg2.field2047[arg3];
        class138 var8 = var6.field1797;
        Statics.field1829 = 0;
        Statics.field1894 = 0;
        Statics.field1839 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1798; var11++) {
            int var12 = var6.field1800[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1954[var12] == 0) {
                this.method2357(var8.field1954[var12], var8.field1957[var12], var6.field1794[var11], var6.field1801[var11], var6.field1802[var11]);
            }
        }
        Statics.field1829 = 0;
        Statics.field1894 = 0;
        Statics.field1839 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1798; var15++) {
            int var16 = var7.field1800[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1954[var16] == 0) {
                this.method2357(var8.field1954[var16], var8.field1957[var16], var7.field1794[var15], var7.field1801[var15], var7.field1802[var15]);
            }
        }
        this.method2355();
    }

    @ObfuscatedName("es.o(I[IIII)V")
    public void method2357(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1829 = 0;
            Statics.field1894 = 0;
            Statics.field1839 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1853.length) {
                    int[] var10 = this.field1853[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1829 += this.field1834[var12];
                        Statics.field1894 += this.field1835[var12];
                        Statics.field1839 += this.field1836[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1829 = Statics.field1829 / var7 + arg2;
                Statics.field1894 = Statics.field1894 / var7 + arg3;
                Statics.field1839 = Statics.field1839 / var7 + arg4;
            } else {
                Statics.field1829 = arg2;
                Statics.field1894 = arg3;
                Statics.field1839 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1853.length) {
                    int[] var15 = this.field1853[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1834[var17] += arg2;
                        this.field1835[var17] += arg3;
                        this.field1836[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1853.length) {
                    int[] var20 = this.field1853[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1834[var22] -= Statics.field1829;
                        this.field1835[var22] -= Statics.field1894;
                        this.field1836[var22] -= Statics.field1839;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1893[var25];
                            int var27 = field1868[var25];
                            int var28 = this.field1835[var22] * var26 + this.field1834[var22] * var27 >> 16;
                            this.field1835[var22] = this.field1835[var22] * var27 - this.field1834[var22] * var26 >> 16;
                            this.field1834[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1893[var23];
                            int var30 = field1868[var23];
                            int var31 = this.field1835[var22] * var30 - this.field1836[var22] * var29 >> 16;
                            this.field1836[var22] = this.field1836[var22] * var30 + this.field1835[var22] * var29 >> 16;
                            this.field1835[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1893[var24];
                            int var33 = field1868[var24];
                            int var34 = this.field1836[var22] * var32 + this.field1834[var22] * var33 >> 16;
                            this.field1836[var22] = this.field1836[var22] * var33 - this.field1834[var22] * var32 >> 16;
                            this.field1834[var22] = var34;
                        }
                        this.field1834[var22] += Statics.field1829;
                        this.field1835[var22] += Statics.field1894;
                        this.field1836[var22] += Statics.field1839;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1853.length) {
                    int[] var37 = this.field1853[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1834[var39] -= Statics.field1829;
                        this.field1835[var39] -= Statics.field1894;
                        this.field1836[var39] -= Statics.field1839;
                        this.field1834[var39] = this.field1834[var39] * arg2 / 128;
                        this.field1835[var39] = this.field1835[var39] * arg3 / 128;
                        this.field1836[var39] = this.field1836[var39] * arg4 / 128;
                        this.field1834[var39] += Statics.field1829;
                        this.field1835[var39] += Statics.field1894;
                        this.field1836[var39] += Statics.field1839;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1854 != null && this.field1842 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1854.length) {
                    int[] var42 = this.field1854[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1842[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1842[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("es.m()V")
    public void method2345() {
        for (int var1 = 0; var1 < this.field1833; var1++) {
            int var2 = this.field1834[var1];
            this.field1834[var1] = this.field1836[var1];
            this.field1836[var1] = -var2;
        }
        this.method2355();
    }

    @ObfuscatedName("es.x()V")
    public void method2367() {
        for (int var1 = 0; var1 < this.field1833; var1++) {
            this.field1834[var1] = -this.field1834[var1];
            this.field1836[var1] = -this.field1836[var1];
        }
        this.method2355();
    }

    @ObfuscatedName("es.j()V")
    public void method2397() {
        for (int var1 = 0; var1 < this.field1833; var1++) {
            int var2 = this.field1836[var1];
            this.field1836[var1] = this.field1834[var1];
            this.field1834[var1] = -var2;
        }
        this.method2355();
    }

    @ObfuscatedName("es.g(I)V")
    public void method2361(int arg0) {
        int var2 = field1893[arg0];
        int var3 = field1868[arg0];
        for (int var4 = 0; var4 < this.field1833; var4++) {
            int var5 = this.field1835[var4] * var3 - this.field1836[var4] * var2 >> 16;
            this.field1836[var4] = this.field1836[var4] * var3 + this.field1835[var4] * var2 >> 16;
            this.field1835[var4] = var5;
        }
        this.method2355();
    }

    @ObfuscatedName("es.c(III)V")
    public void method2362(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1833; var4++) {
            this.field1834[var4] += arg0;
            this.field1835[var4] += arg1;
            this.field1836[var4] += arg2;
        }
        this.method2355();
    }

    @ObfuscatedName("es.k(III)V")
    public void method2363(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1833; var4++) {
            this.field1834[var4] = this.field1834[var4] * arg0 / 128;
            this.field1835[var4] = this.field1835[var4] * arg1 / 128;
            this.field1836[var4] = this.field1836[var4] * arg2 / 128;
        }
        this.method2355();
    }

    @ObfuscatedName("es.q(IIIIIII)V")
    public final void method2364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1877[0] = -1;
        if (this.field1856 != 2 && this.field1856 != 1) {
            this.method2366();
        }
        int var8 = Statics.field1928;
        int var9 = Statics.field1929;
        int var10 = field1893[arg0];
        int var11 = field1868[arg0];
        int var12 = field1893[arg1];
        int var13 = field1868[arg1];
        int var14 = field1893[arg2];
        int var15 = field1868[arg2];
        int var16 = field1893[arg3];
        int var17 = field1868[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1833; var19++) {
            int var20 = this.field1834[var19];
            int var21 = this.field1835[var19];
            int var22 = this.field1836[var19];
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
            field1872[var19] = var30 - var18;
            field1870[var19] = class136.field1927 * var26 / var30 + var8;
            field1871[var19] = class136.field1927 * var29 / var30 + var9;
            if (this.field1887 > 0) {
                field1889[var19] = var26;
                field1876[var19] = var29;
                field1875[var19] = var30;
            }
        }
        try {
            this.method2419(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("es.ac(IIIIIIII)V")
    public final void method2365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1877[0] = -1;
        if (this.field1856 != 2 && this.field1856 != 1) {
            this.method2366();
        }
        int var9 = Statics.field1928;
        int var10 = Statics.field1929;
        int var11 = field1893[arg0];
        int var12 = field1868[arg0];
        int var13 = field1893[arg1];
        int var14 = field1868[arg1];
        int var15 = field1893[arg2];
        int var16 = field1868[arg2];
        int var17 = field1893[arg3];
        int var18 = field1868[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1833; var20++) {
            int var21 = this.field1834[var20];
            int var22 = this.field1835[var20];
            int var23 = this.field1836[var20];
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
            field1872[var20] = var31 - var19;
            field1870[var20] = class136.field1927 * var27 / arg7 + var9;
            field1871[var20] = class136.field1927 * var30 / arg7 + var10;
            if (this.field1887 > 0) {
                field1889[var20] = var27;
                field1876[var20] = var30;
                field1875[var20] = var31;
            }
        }
        try {
            this.method2419(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("es.cp(IIIIIIIII)V")
    public void method2396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1877[0] = -1;
        if (this.field1856 != 1) {
            this.method2359();
        }
        this.method2351(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1881 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1881) * class136.field1927;
        if (var15 / var13 >= Statics.field1937) {
            return;
        }
        int var16 = (this.field1881 + var14) * class136.field1927;
        if (var16 / var13 <= Statics.field1932) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1881 * arg1 >> 16;
        int var19 = (var17 + var18) * class136.field1927;
        if (var19 / var13 <= Statics.field1934) {
            return;
        }
        int var20 = (this.field2026 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class136.field1927;
        if (var21 / var13 >= Statics.field1935) {
            return;
        }
        int var22 = (this.field2026 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1887 > 0;
        int var26 = class134.field1900;
        int var28 = class134.method3557();
        boolean var29 = class134.field1909;
        if (class8.field225 && arg8 > 0) {
            if (class134.method85(this, arg5, arg6, arg7)) {
                class8.method226(this, arg5, arg6, arg7, -65281);
            } else if (class8.field223 == class12.field257) {
                class8.method226(this, arg5, arg6, arg7, -16776961);
            }
        }
        if (class8.field220 && arg8 > 0) {
            int var32 = var11 - var12;
            if (var32 <= 50) {
                var32 = 50;
            }
            int var37;
            int var38;
            if (var14 > 0) {
                var37 = var15 / var13;
                var38 = var16 / var32;
            } else {
                var38 = var16 / var13;
                var37 = var15 / var32;
            }
            int var39;
            int var40;
            if (var17 > 0) {
                var39 = var21 / var13;
                var40 = var19 / var32;
            } else {
                var40 = var19 / var13;
                var39 = var21 / var32;
            }
            int var41 = -8355840;
            int var42 = var26 - Statics.field1928;
            int var43 = var28 - Statics.field1929;
            if (var42 > var37 && var42 < var38 && var43 > var39 && var43 < var40) {
                var41 = -256;
            }
            class8.method4061(Statics.field1928 + var37, Statics.field1929 + var39, Statics.field1928 + var38, Statics.field1929 + var40, var41);
        }
        boolean var44 = false;
        if (arg8 > 0 && var29) {
            boolean var45 = false;
            if (field1890) {
                var45 = class134.method85(this, arg5, arg6, arg7);
            } else {
                int var46 = var11 - var12;
                if (var46 <= 50) {
                    var46 = 50;
                }
                int var47;
                int var48;
                if (var14 > 0) {
                    var47 = var15 / var13;
                    var48 = var16 / var46;
                } else {
                    var48 = var16 / var13;
                    var47 = var15 / var46;
                }
                int var49;
                int var50;
                if (var17 > 0) {
                    var49 = var21 / var13;
                    var50 = var19 / var46;
                } else {
                    var50 = var19 / var13;
                    var49 = var21 / var46;
                }
                int var51 = var26 - Statics.field1928;
                int var52 = var28 - Statics.field1929;
                if (var51 > var47 && var51 < var48 && var52 > var49 && var52 < var50) {
                    var45 = true;
                }
            }
            if (var45) {
                if (this.field1855) {
                    class134.method929(arg8);
                } else {
                    var44 = true;
                }
            }
        }
        int var53 = Statics.field1928;
        int var54 = Statics.field1929;
        int var55 = 0;
        int var56 = 0;
        if (arg0 != 0) {
            var55 = field1893[arg0];
            var56 = field1868[arg0];
        }
        for (int var57 = 0; var57 < this.field1833; var57++) {
            int var58 = this.field1834[var57];
            int var59 = this.field1835[var57];
            int var60 = this.field1836[var57];
            if (arg0 != 0) {
                int var61 = var55 * var60 + var56 * var58 >> 16;
                var60 = var56 * var60 - var55 * var58 >> 16;
                var58 = var61;
            }
            int var62 = arg5 + var58;
            int var63 = arg6 + var59;
            int var64 = arg7 + var60;
            int var65 = arg3 * var64 + arg4 * var62 >> 16;
            int var66 = arg4 * var64 - arg3 * var62 >> 16;
            int var68 = arg2 * var63 - arg1 * var66 >> 16;
            int var69 = arg1 * var63 + arg2 * var66 >> 16;
            field1872[var57] = var69 - var11;
            if (var69 >= 50) {
                field1870[var57] = class136.field1927 * var65 / var69 + var53;
                field1871[var57] = class136.field1927 * var68 / var69 + var54;
            } else {
                field1870[var57] = -5000;
                var23 = true;
            }
            if (var25) {
                field1889[var57] = var65;
                field1876[var57] = var68;
                field1875[var57] = var69;
            }
        }
        try {
            this.method2419(var23, var44, this.field1855, arg8);
        } catch (Exception var72) {
        }
    }

    @ObfuscatedName("es.aw(ZZZI)V")
    public final void method2419(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1896 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1896; var5++) {
            field1877[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field222 && arg1) {
            class133 var7 = this;
            for (int var8 = 0; var8 < var7.field1873; var8++) {
                if (var7.field1843[var8] != -2) {
                    int var9 = var7.field1838[var8];
                    int var10 = var7.field1892[var8];
                    int var11 = var7.field1841[var8];
                    int var12 = field1870[var9];
                    int var13 = field1870[var10];
                    int var14 = field1870[var11];
                    int var15 = field1871[var9];
                    int var16 = field1871[var10];
                    int var17 = field1871[var11];
                    int var18 = Math.min(var12, Math.min(var13, var14)) - var6;
                    int var19 = Math.max(var12, Math.max(var13, var14)) + var6;
                    int var20 = Math.min(var15, Math.min(var16, var17)) - var6;
                    int var21 = Math.max(var15, Math.max(var16, var17)) + var6;
                    class8.method4061(var18, var20, var19, var21, -49088);
                }
            }
        }
        for (int var22 = 0; var22 < this.field1873; var22++) {
            if (this.field1843[var22] != -2) {
                int var23 = this.field1838[var22];
                int var24 = this.field1892[var22];
                int var25 = this.field1841[var22];
                int var26 = field1870[var23];
                int var27 = field1870[var24];
                int var28 = field1870[var25];
                if (arg0 && var26 == -5000 || var27 == -5000 || var28 == -5000) {
                    int var29 = field1889[var23];
                    int var30 = field1889[var24];
                    int var31 = field1889[var25];
                    int var32 = field1876[var23];
                    int var33 = field1876[var24];
                    int var34 = field1876[var25];
                    int var35 = field1875[var23];
                    int var36 = field1875[var24];
                    int var37 = field1875[var25];
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
                        field1849[var22] = true;
                        int var47 = (field1872[var23] + field1872[var24] + field1872[var25]) / 3 + this.field1860;
                        field1845[var47][field1877[var47]++] = var22;
                    }
                } else {
                    if (arg1 && class134.method2189(field1871[var23], field1871[var24], field1871[var25], var26, var27, var28, var6)) {
                        class134.method929(arg3);
                        arg1 = false;
                    }
                    if ((field1871[var25] - field1871[var24]) * (var26 - var27) - (field1871[var23] - field1871[var24]) * (var28 - var27) > 0) {
                        field1849[var22] = false;
                        if (var26 >= 0 && var27 >= 0 && var28 >= 0 && var26 <= Statics.field1941 && var27 <= Statics.field1941 && var28 <= Statics.field1941) {
                            field1861[var22] = false;
                        } else {
                            field1861[var22] = true;
                        }
                        int var48 = (field1872[var23] + field1872[var24] + field1872[var25]) / 3 + this.field1860;
                        field1845[var48][field1877[var48]++] = var22;
                    }
                }
            }
        }
        if (this.field1850 == null) {
            for (int var49 = this.field1896 - 1; var49 >= 0; var49--) {
                int var50 = field1877[var49];
                if (var50 > 0) {
                    int[] var51 = field1845[var49];
                    for (int var52 = 0; var52 < var50; var52++) {
                        this.method2368(var51[var52]);
                    }
                }
            }
            return;
        }
        for (int var53 = 0; var53 < 12; var53++) {
            field1879[var53] = 0;
            field1883[var53] = 0;
        }
        for (int var54 = this.field1896 - 1; var54 >= 0; var54--) {
            int var55 = field1877[var54];
            if (var55 > 0) {
                int[] var56 = field1845[var54];
                for (int var57 = 0; var57 < var55; var57++) {
                    int var58 = var56[var57];
                    byte var59 = this.field1850[var58];
                    int var60 = field1879[var59]++;
                    field1880[var59][var60] = var58;
                    if (var59 < 10) {
                        field1883[var59] += var54;
                    } else if (var59 == 10) {
                        field1866[var60] = var54;
                    } else {
                        field1882[var60] = var54;
                    }
                }
            }
        }
        int var61 = 0;
        if (field1879[1] > 0 || field1879[2] > 0) {
            var61 = (field1883[1] + field1883[2]) / (field1879[1] + field1879[2]);
        }
        int var62 = 0;
        if (field1879[3] > 0 || field1879[4] > 0) {
            var62 = (field1883[3] + field1883[4]) / (field1879[3] + field1879[4]);
        }
        int var63 = 0;
        if (field1879[6] > 0 || field1879[8] > 0) {
            var63 = (field1883[6] + field1883[8]) / (field1879[6] + field1879[8]);
        }
        int var64 = 0;
        int var65 = field1879[10];
        int[] var66 = field1880[10];
        int[] var67 = field1866;
        if (var64 == var65) {
            var64 = 0;
            var65 = field1879[11];
            var66 = field1880[11];
            var67 = field1882;
        }
        int var68;
        if (var64 < var65) {
            var68 = var67[var64];
        } else {
            var68 = -1000;
        }
        for (int var69 = 0; var69 < 10; var69++) {
            while (var69 == 0 && var68 > var61) {
                this.method2368(var66[var64++]);
                if (var64 == var65 && field1880[11] != var66) {
                    var64 = 0;
                    var65 = field1879[11];
                    var66 = field1880[11];
                    var67 = field1882;
                }
                if (var64 < var65) {
                    var68 = var67[var64];
                } else {
                    var68 = -1000;
                }
            }
            while (var69 == 3 && var68 > var62) {
                this.method2368(var66[var64++]);
                if (var64 == var65 && field1880[11] != var66) {
                    var64 = 0;
                    var65 = field1879[11];
                    var66 = field1880[11];
                    var67 = field1882;
                }
                if (var64 < var65) {
                    var68 = var67[var64];
                } else {
                    var68 = -1000;
                }
            }
            while (var69 == 5 && var68 > var63) {
                this.method2368(var66[var64++]);
                if (var64 == var65 && field1880[11] != var66) {
                    var64 = 0;
                    var65 = field1879[11];
                    var66 = field1880[11];
                    var67 = field1882;
                }
                if (var64 < var65) {
                    var68 = var67[var64];
                } else {
                    var68 = -1000;
                }
            }
            int var70 = field1879[var69];
            int[] var71 = field1880[var69];
            for (int var72 = 0; var72 < var70; var72++) {
                this.method2368(var71[var72]);
            }
        }
        while (var68 != -1000) {
            this.method2368(var66[var64++]);
            if (var64 == var65 && field1880[11] != var66) {
                var64 = 0;
                var66 = field1880[11];
                var65 = field1879[11];
                var67 = field1882;
            }
            if (var64 < var65) {
                var68 = var67[var64];
            } else {
                var68 = -1000;
            }
        }
    }

    @ObfuscatedName("es.at(I)V")
    public final void method2368(int arg0) {
        if (field1849[arg0]) {
            this.method2392(arg0);
            return;
        }
        int var2 = this.field1838[arg0];
        int var3 = this.field1892[arg0];
        int var4 = this.field1841[arg0];
        class136.field1924 = field1861[arg0];
        if (this.field1842 == null) {
            class136.field1916 = 0;
        } else {
            class136.field1916 = this.field1842[arg0] & 0xFF;
        }
        if (this.field1847 != null && this.field1847[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1858 == null || this.field1858[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1858[arg0] & 0xFF;
                var6 = this.field1840[var5];
                var7 = this.field1851[var5];
                var8 = this.field1852[var5];
            }
            if (this.field1843[arg0] == -1) {
                class136.method2455(field1871[var2], field1871[var3], field1871[var4], field1870[var2], field1870[var3], field1870[var4], this.field1859[arg0], this.field1859[arg0], this.field1859[arg0], field1889[var6], field1889[var7], field1889[var8], field1876[var6], field1876[var7], field1876[var8], field1875[var6], field1875[var7], field1875[var8], this.field1847[arg0]);
            } else {
                class136.method2455(field1871[var2], field1871[var3], field1871[var4], field1870[var2], field1870[var3], field1870[var4], this.field1859[arg0], this.field1844[arg0], this.field1843[arg0], field1889[var6], field1889[var7], field1889[var8], field1876[var6], field1876[var7], field1876[var8], field1875[var6], field1875[var7], field1875[var8], this.field1847[arg0]);
            }
        } else if (this.field1843[arg0] == -1) {
            class136.method2453(field1871[var2], field1871[var3], field1871[var4], field1870[var2], field1870[var3], field1870[var4], field1895[this.field1859[arg0]]);
        } else {
            class136.method2451(field1871[var2], field1871[var3], field1871[var4], field1870[var2], field1870[var3], field1870[var4], this.field1859[arg0], this.field1844[arg0], this.field1843[arg0]);
        }
    }

    @ObfuscatedName("es.ag(I)V")
    public final void method2392(int arg0) {
        int var2 = Statics.field1928;
        int var3 = Statics.field1929;
        int var4 = 0;
        int var5 = this.field1838[arg0];
        int var6 = this.field1892[arg0];
        int var7 = this.field1841[arg0];
        int var8 = field1875[var5];
        int var9 = field1875[var6];
        int var10 = field1875[var7];
        if (this.field1842 == null) {
            class136.field1916 = 0;
        } else {
            class136.field1916 = this.field1842[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1884[var4] = field1870[var5];
            field1885[var4] = field1871[var5];
            field1869[var4++] = this.field1859[arg0];
        } else {
            int var11 = field1889[var5];
            int var12 = field1876[var5];
            int var13 = this.field1859[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1874[var10 - var8];
                field1884[var4] = (((field1889[var7] - var11) * var14 >> 16) + var11) * class136.field1927 / 50 + var2;
                field1885[var4] = (((field1876[var7] - var12) * var14 >> 16) + var12) * class136.field1927 / 50 + var3;
                field1869[var4++] = ((this.field1843[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1874[var9 - var8];
                field1884[var4] = (((field1889[var6] - var11) * var15 >> 16) + var11) * class136.field1927 / 50 + var2;
                field1885[var4] = (((field1876[var6] - var12) * var15 >> 16) + var12) * class136.field1927 / 50 + var3;
                field1869[var4++] = ((this.field1844[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1884[var4] = field1870[var6];
            field1885[var4] = field1871[var6];
            field1869[var4++] = this.field1844[arg0];
        } else {
            int var16 = field1889[var6];
            int var17 = field1876[var6];
            int var18 = this.field1844[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1874[var8 - var9];
                field1884[var4] = (((field1889[var5] - var16) * var19 >> 16) + var16) * class136.field1927 / 50 + var2;
                field1885[var4] = (((field1876[var5] - var17) * var19 >> 16) + var17) * class136.field1927 / 50 + var3;
                field1869[var4++] = ((this.field1859[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1874[var10 - var9];
                field1884[var4] = (((field1889[var7] - var16) * var20 >> 16) + var16) * class136.field1927 / 50 + var2;
                field1885[var4] = (((field1876[var7] - var17) * var20 >> 16) + var17) * class136.field1927 / 50 + var3;
                field1869[var4++] = ((this.field1843[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1884[var4] = field1870[var7];
            field1885[var4] = field1871[var7];
            field1869[var4++] = this.field1843[arg0];
        } else {
            int var21 = field1889[var7];
            int var22 = field1876[var7];
            int var23 = this.field1843[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1874[var9 - var10];
                field1884[var4] = (((field1889[var6] - var21) * var24 >> 16) + var21) * class136.field1927 / 50 + var2;
                field1885[var4] = (((field1876[var6] - var22) * var24 >> 16) + var22) * class136.field1927 / 50 + var3;
                field1869[var4++] = ((this.field1844[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1874[var8 - var10];
                field1884[var4] = (((field1889[var5] - var21) * var25 >> 16) + var21) * class136.field1927 / 50 + var2;
                field1885[var4] = (((field1876[var5] - var22) * var25 >> 16) + var22) * class136.field1927 / 50 + var3;
                field1869[var4++] = ((this.field1859[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1884[0];
        int var27 = field1884[1];
        int var28 = field1884[2];
        int var29 = field1885[0];
        int var30 = field1885[1];
        int var31 = field1885[2];
        class136.field1924 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1941 || var27 > Statics.field1941 || var28 > Statics.field1941) {
                class136.field1924 = true;
            }
            if (this.field1847 != null && this.field1847[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1858 == null || this.field1858[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1858[arg0] & 0xFF;
                    var33 = this.field1840[var32];
                    var34 = this.field1851[var32];
                    var35 = this.field1852[var32];
                }
                if (this.field1843[arg0] == -1) {
                    class136.method2455(var29, var30, var31, var26, var27, var28, this.field1859[arg0], this.field1859[arg0], this.field1859[arg0], field1889[var33], field1889[var34], field1889[var35], field1876[var33], field1876[var34], field1876[var35], field1875[var33], field1875[var34], field1875[var35], this.field1847[arg0]);
                } else {
                    class136.method2455(var29, var30, var31, var26, var27, var28, field1869[0], field1869[1], field1869[2], field1889[var33], field1889[var34], field1889[var35], field1876[var33], field1876[var34], field1876[var35], field1875[var33], field1875[var34], field1875[var35], this.field1847[arg0]);
                }
            } else if (this.field1843[arg0] == -1) {
                class136.method2453(var29, var30, var31, var26, var27, var28, field1895[this.field1859[arg0]]);
            } else {
                class136.method2451(var29, var30, var31, var26, var27, var28, field1869[0], field1869[1], field1869[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1941 || var27 > Statics.field1941 || var28 > Statics.field1941 || field1884[3] < 0 || field1884[3] > Statics.field1941) {
            class136.field1924 = true;
        }
        if (this.field1847 != null && this.field1847[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1858 == null || this.field1858[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1858[arg0] & 0xFF;
                var37 = this.field1840[var36];
                var38 = this.field1851[var36];
                var39 = this.field1852[var36];
            }
            short var40 = this.field1847[arg0];
            if (this.field1843[arg0] == -1) {
                class136.method2455(var29, var30, var31, var26, var27, var28, this.field1859[arg0], this.field1859[arg0], this.field1859[arg0], field1889[var37], field1889[var38], field1889[var39], field1876[var37], field1876[var38], field1876[var39], field1875[var37], field1875[var38], field1875[var39], var40);
                class136.method2455(var29, var31, field1885[3], var26, var28, field1884[3], this.field1859[arg0], this.field1859[arg0], this.field1859[arg0], field1889[var37], field1889[var38], field1889[var39], field1876[var37], field1876[var38], field1876[var39], field1875[var37], field1875[var38], field1875[var39], var40);
            } else {
                class136.method2455(var29, var30, var31, var26, var27, var28, field1869[0], field1869[1], field1869[2], field1889[var37], field1889[var38], field1889[var39], field1876[var37], field1876[var38], field1876[var39], field1875[var37], field1875[var38], field1875[var39], var40);
                class136.method2455(var29, var31, field1885[3], var26, var28, field1884[3], field1869[0], field1869[2], field1869[3], field1889[var37], field1889[var38], field1889[var39], field1876[var37], field1876[var38], field1876[var39], field1875[var37], field1875[var38], field1875[var39], var40);
            }
        } else if (this.field1843[arg0] == -1) {
            int var41 = field1895[this.field1859[arg0]];
            class136.method2453(var29, var30, var31, var26, var27, var28, var41);
            class136.method2453(var29, var31, field1885[3], var26, var28, field1884[3], var41);
        } else {
            class136.method2451(var29, var30, var31, var26, var27, var28, field1869[0], field1869[1], field1869[2]);
            class136.method2451(var29, var31, field1885[3], var26, var28, field1884[3], field1869[0], field1869[2], field1869[3]);
        }
    }
}
