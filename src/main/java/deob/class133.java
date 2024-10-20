package deob;

@ObfuscatedName("en")
public class class133 extends class141 {

    @ObfuscatedName("en.m")
    public static class133 field1910 = new class133();

    @ObfuscatedName("en.p")
    public static byte[] field1894 = new byte[1];

    @ObfuscatedName("en.i")
    public static class133 field1886 = new class133();

    @ObfuscatedName("en.j")
    public static byte[] field1846 = new byte[1];

    @ObfuscatedName("en.v")
    public int field1869 = 0;

    @ObfuscatedName("en.x")
    public int[] field1848;

    @ObfuscatedName("en.e")
    public int[] field1849;

    @ObfuscatedName("en.l")
    public int[] field1884;

    @ObfuscatedName("en.b")
    public int field1851 = 0;

    @ObfuscatedName("en.n")
    public int[] field1870;

    @ObfuscatedName("en.c")
    public int[] field1853;

    @ObfuscatedName("en.a")
    public int[] field1854;

    @ObfuscatedName("en.y")
    public int[] field1855;

    @ObfuscatedName("en.w")
    public int[] field1856;

    @ObfuscatedName("en.k")
    public int[] field1857;

    @ObfuscatedName("en.t")
    public byte[] field1858;

    @ObfuscatedName("en.h")
    public byte[] field1859;

    @ObfuscatedName("en.u")
    public byte[] field1888;

    @ObfuscatedName("en.r")
    public short[] field1891;

    @ObfuscatedName("en.g")
    public byte field1862 = 0;

    @ObfuscatedName("en.z")
    public int field1843 = 0;

    @ObfuscatedName("en.o")
    public int[] field1844;

    @ObfuscatedName("en.d")
    public int[] field1865;

    @ObfuscatedName("en.s")
    public int[] field1866;

    @ObfuscatedName("en.f")
    public int[][] field1872;

    @ObfuscatedName("en.q")
    public int[][] field1868;

    @ObfuscatedName("en.al")
    public boolean field1861 = false;

    @ObfuscatedName("en.ao")
    public int field1895;

    @ObfuscatedName("en.aq")
    public int field1900;

    @ObfuscatedName("en.ab")
    public int field1899;

    @ObfuscatedName("en.as")
    public int field1875;

    @ObfuscatedName("en.ag")
    public int field1874;

    @ObfuscatedName("en.ap")
    public int field1893;

    @ObfuscatedName("en.av")
    public int field1876;

    @ObfuscatedName("en.ak")
    public int field1877;

    @ObfuscatedName("en.at")
    public int field1878 = -1;

    @ObfuscatedName("en.an")
    public int field1879 = -1;

    @ObfuscatedName("en.ah")
    public int field1880 = -1;

    @ObfuscatedName("en.ay")
    public static boolean[] field1882 = new boolean[4700];

    @ObfuscatedName("en.az")
    public static boolean[] field1883 = new boolean[4700];

    @ObfuscatedName("en.aw")
    public static int[] field1901 = new int[4700];

    @ObfuscatedName("en.au")
    public static int[] field1885 = new int[4700];

    @ObfuscatedName("en.ac")
    public static int[] field1867 = new int[4700];

    @ObfuscatedName("en.ai")
    public static int[] field1887 = new int[4700];

    @ObfuscatedName("en.ax")
    public static int[] field1909 = new int[4700];

    @ObfuscatedName("en.af")
    public static int[] field1889 = new int[4700];

    @ObfuscatedName("en.ad")
    public static int[] field1871 = new int[1600];

    @ObfuscatedName("en.aj")
    public static int[][] field1892 = new int[1600][512];

    @ObfuscatedName("en.ae")
    public static int[] field1860 = new int[12];

    @ObfuscatedName("en.ar")
    public static int[][] field1845 = new int[12][2000];

    @ObfuscatedName("en.bu")
    public static int[] field1850 = new int[2000];

    @ObfuscatedName("en.bk")
    public static int[] field1896 = new int[2000];

    @ObfuscatedName("en.bo")
    public static int[] field1897 = new int[12];

    @ObfuscatedName("en.bl")
    public static int[] field1898 = new int[10];

    @ObfuscatedName("en.bw")
    public static int[] field1864 = new int[10];

    @ObfuscatedName("en.bj")
    public static int[] field1863 = new int[10];

    @ObfuscatedName("en.be")
    public static boolean field1912 = true;

    @ObfuscatedName("en.ba")
    public static int[] field1907 = class136.field1947;

    @ObfuscatedName("en.br")
    public static int[] field1908 = class136.field1953;

    @ObfuscatedName("en.bc")
    public static int[] field1847 = class136.field1951;

    @ObfuscatedName("en.bp")
    public static int[] field1904 = class136.field1954;

    public class133() {
    }

    public class133(class133[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1869 = 0;
        this.field1851 = 0;
        this.field1843 = 0;
        this.field1862 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class133 var8 = arg0[var7];
            if (var8 != null) {
                this.field1869 += var8.field1869;
                this.field1851 += var8.field1851;
                this.field1843 += var8.field1843;
                if (var8.field1858 == null) {
                    if (this.field1862 == -1) {
                        this.field1862 = var8.field1862;
                    }
                    if (this.field1862 != var8.field1862) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1859 != null;
                var5 |= var8.field1891 != null;
                var6 |= var8.field1888 != null;
            }
        }
        this.field1848 = new int[this.field1869];
        this.field1849 = new int[this.field1869];
        this.field1884 = new int[this.field1869];
        this.field1870 = new int[this.field1851];
        this.field1853 = new int[this.field1851];
        this.field1854 = new int[this.field1851];
        this.field1855 = new int[this.field1851];
        this.field1856 = new int[this.field1851];
        this.field1857 = new int[this.field1851];
        if (var3) {
            this.field1858 = new byte[this.field1851];
        }
        if (var4) {
            this.field1859 = new byte[this.field1851];
        }
        if (var5) {
            this.field1891 = new short[this.field1851];
        }
        if (var6) {
            this.field1888 = new byte[this.field1851];
        }
        if (this.field1843 > 0) {
            this.field1844 = new int[this.field1843];
            this.field1865 = new int[this.field1843];
            this.field1866 = new int[this.field1843];
        }
        this.field1869 = 0;
        this.field1851 = 0;
        this.field1843 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class133 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1851; var11++) {
                    this.field1870[this.field1851] = var10.field1870[var11] + this.field1869;
                    this.field1853[this.field1851] = var10.field1853[var11] + this.field1869;
                    this.field1854[this.field1851] = var10.field1854[var11] + this.field1869;
                    this.field1855[this.field1851] = var10.field1855[var11];
                    this.field1856[this.field1851] = var10.field1856[var11];
                    this.field1857[this.field1851] = var10.field1857[var11];
                    if (var3) {
                        if (var10.field1858 == null) {
                            this.field1858[this.field1851] = var10.field1862;
                        } else {
                            this.field1858[this.field1851] = var10.field1858[var11];
                        }
                    }
                    if (var4 && var10.field1859 != null) {
                        this.field1859[this.field1851] = var10.field1859[var11];
                    }
                    if (var5) {
                        if (var10.field1891 == null) {
                            this.field1891[this.field1851] = -1;
                        } else {
                            this.field1891[this.field1851] = var10.field1891[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1888 == null || var10.field1888[var11] == -1) {
                            this.field1888[this.field1851] = -1;
                        } else {
                            this.field1888[this.field1851] = (byte) (var10.field1888[var11] + this.field1843);
                        }
                    }
                    this.field1851++;
                }
                for (int var12 = 0; var12 < var10.field1843; var12++) {
                    this.field1844[this.field1843] = var10.field1844[var12] + this.field1869;
                    this.field1865[this.field1843] = var10.field1865[var12] + this.field1869;
                    this.field1866[this.field1843] = var10.field1866[var12] + this.field1869;
                    this.field1843++;
                }
                for (int var13 = 0; var13 < var10.field1869; var13++) {
                    this.field1848[this.field1869] = var10.field1848[var13];
                    this.field1849[this.field1869] = var10.field1849[var13];
                    this.field1884[this.field1869] = var10.field1884[var13];
                    this.field1869++;
                }
            }
        }
    }

    @ObfuscatedName("en.m([[IIIIZI)Len;")
    public class133 method2380(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2385();
        int var7 = arg1 - this.field1899;
        int var8 = this.field1899 + arg1;
        int var9 = arg3 - this.field1899;
        int var10 = this.field1899 + arg3;
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
            var15.field1869 = this.field1869;
            var15.field1851 = this.field1851;
            var15.field1843 = this.field1843;
            var15.field1848 = this.field1848;
            var15.field1884 = this.field1884;
            var15.field1870 = this.field1870;
            var15.field1853 = this.field1853;
            var15.field1854 = this.field1854;
            var15.field1855 = this.field1855;
            var15.field1856 = this.field1856;
            var15.field1857 = this.field1857;
            var15.field1858 = this.field1858;
            var15.field1859 = this.field1859;
            var15.field1888 = this.field1888;
            var15.field1891 = this.field1891;
            var15.field1862 = this.field1862;
            var15.field1844 = this.field1844;
            var15.field1865 = this.field1865;
            var15.field1866 = this.field1866;
            var15.field1872 = this.field1872;
            var15.field1868 = this.field1868;
            var15.field1861 = this.field1861;
            var15.field1849 = new int[var15.field1869];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1869; var16++) {
                int var17 = this.field1848[var16] + arg1;
                int var18 = this.field1884[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1849[var16] = this.field1849[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1869; var26++) {
                int var27 = (-this.field1849[var26] << 16) / this.field2037;
                if (var27 < arg5) {
                    int var28 = this.field1848[var26] + arg1;
                    int var29 = this.field1884[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1849[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1849[var26];
                }
            }
        }
        var15.method2388();
        return var15;
    }

    @ObfuscatedName("en.p(Z)Len;")
    public class133 method2409(boolean arg0) {
        if (!arg0 && field1894.length < this.field1851) {
            field1894 = new byte[this.field1851 + 100];
        }
        return this.method2383(arg0, field1910, field1894);
    }

    @ObfuscatedName("en.j(Z)Len;")
    public class133 method2382(boolean arg0) {
        if (!arg0 && field1846.length < this.field1851) {
            field1846 = new byte[this.field1851 + 100];
        }
        return this.method2383(arg0, field1886, field1846);
    }

    @ObfuscatedName("en.v(ZLen;[B)Len;")
    public class133 method2383(boolean arg0, class133 arg1, byte[] arg2) {
        arg1.field1869 = this.field1869;
        arg1.field1851 = this.field1851;
        arg1.field1843 = this.field1843;
        if (arg1.field1848 == null || arg1.field1848.length < this.field1869) {
            arg1.field1848 = new int[this.field1869 + 100];
            arg1.field1849 = new int[this.field1869 + 100];
            arg1.field1884 = new int[this.field1869 + 100];
        }
        for (int var4 = 0; var4 < this.field1869; var4++) {
            arg1.field1848[var4] = this.field1848[var4];
            arg1.field1849[var4] = this.field1849[var4];
            arg1.field1884[var4] = this.field1884[var4];
        }
        if (arg0) {
            arg1.field1859 = this.field1859;
        } else {
            arg1.field1859 = arg2;
            if (this.field1859 == null) {
                for (int var5 = 0; var5 < this.field1851; var5++) {
                    arg1.field1859[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1851; var6++) {
                    arg1.field1859[var6] = this.field1859[var6];
                }
            }
        }
        arg1.field1870 = this.field1870;
        arg1.field1853 = this.field1853;
        arg1.field1854 = this.field1854;
        arg1.field1855 = this.field1855;
        arg1.field1856 = this.field1856;
        arg1.field1857 = this.field1857;
        arg1.field1858 = this.field1858;
        arg1.field1888 = this.field1888;
        arg1.field1891 = this.field1891;
        arg1.field1862 = this.field1862;
        arg1.field1844 = this.field1844;
        arg1.field1865 = this.field1865;
        arg1.field1866 = this.field1866;
        arg1.field1872 = this.field1872;
        arg1.field1868 = this.field1868;
        arg1.field1861 = this.field1861;
        arg1.method2388();
        return arg1;
    }

    @ObfuscatedName("en.x(I)V")
    public void method2456(int arg0) {
        if (this.field1878 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1908[arg0];
        int var9 = field1907[arg0];
        for (int var10 = 0; var10 < this.field1869; var10++) {
            int var11 = class136.method2491(this.field1848[var10], this.field1884[var10], var8, var9);
            int var12 = this.field1849[var10];
            int var13 = class136.method2492(this.field1848[var10], this.field1884[var10], var8, var9);
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
        this.field1893 = (var2 + var5) / 2;
        this.field1876 = (var3 + var6) / 2;
        this.field1877 = (var4 + var7) / 2;
        this.field1878 = (var5 - var2 + 1) / 2;
        this.field1879 = (var6 - var3 + 1) / 2;
        this.field1880 = (var7 - var4 + 1) / 2;
        if (this.field1878 < 32) {
            this.field1878 = 32;
        }
        if (this.field1880 < 32) {
            this.field1880 = 32;
        }
        if (this.field1861) {
            this.field1878 += 8;
            this.field1880 += 8;
        }
    }

    @ObfuscatedName("en.e()V")
    public void method2385() {
        if (this.field1895 == 1) {
            return;
        }
        this.field1895 = 1;
        this.field2037 = 0;
        this.field1900 = 0;
        this.field1899 = 0;
        for (int var1 = 0; var1 < this.field1869; var1++) {
            int var2 = this.field1848[var1];
            int var3 = this.field1849[var1];
            int var4 = this.field1884[var1];
            if (-var3 > this.field2037) {
                this.field2037 = -var3;
            }
            if (var3 > this.field1900) {
                this.field1900 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1899) {
                this.field1899 = var5;
            }
        }
        this.field1899 = (int) (Math.sqrt((double) this.field1899) + 0.99D);
        this.field1874 = (int) (Math.sqrt((double) (this.field2037 * this.field2037 + this.field1899 * this.field1899)) + 0.99D);
        this.field1875 = this.field1874 + (int) (Math.sqrt((double) (this.field1900 * this.field1900 + this.field1899 * this.field1899)) + 0.99D);
    }

    @ObfuscatedName("en.l()V")
    public void method2386() {
        if (this.field1895 == 2) {
            return;
        }
        this.field1895 = 2;
        this.field1899 = 0;
        for (int var1 = 0; var1 < this.field1869; var1++) {
            int var2 = this.field1848[var1];
            int var3 = this.field1849[var1];
            int var4 = this.field1884[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1899) {
                this.field1899 = var5;
            }
        }
        this.field1899 = (int) (Math.sqrt((double) this.field1899) + 0.99D);
        this.field1874 = this.field1899;
        this.field1875 = this.field1899 + this.field1899;
    }

    @ObfuscatedName("en.b()I")
    public int method2452() {
        this.method2385();
        return this.field1899;
    }

    @ObfuscatedName("en.n()V")
    public void method2388() {
        this.field1895 = 0;
        this.field1878 = -1;
    }

    @ObfuscatedName("en.c(Lez;I)V")
    public void method2389(class144 arg0, int arg1) {
        if (this.field1872 == null || arg1 == -1) {
            return;
        }
        class131 var3 = arg0.field2056[arg1];
        class138 var4 = var3.field1807;
        Statics.field1852 = 0;
        Statics.field1902 = 0;
        Statics.field1903 = 0;
        for (int var5 = 0; var5 < var3.field1808; var5++) {
            int var6 = var3.field1809[var5];
            this.method2393(var4.field1965[var6], var4.field1966[var6], var3.field1812[var5], var3.field1810[var5], var3.field1813[var5]);
        }
        this.method2388();
    }

    @ObfuscatedName("en.a(Lez;ILez;I[I)V")
    public void method2390(class144 arg0, int arg1, class144 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2389(arg0, arg1);
            return;
        }
        class131 var6 = arg0.field2056[arg1];
        class131 var7 = arg2.field2056[arg3];
        class138 var8 = var6.field1807;
        Statics.field1852 = 0;
        Statics.field1902 = 0;
        Statics.field1903 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1808; var11++) {
            int var12 = var6.field1809[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1965[var12] == 0) {
                this.method2393(var8.field1965[var12], var8.field1966[var12], var6.field1812[var11], var6.field1810[var11], var6.field1813[var11]);
            }
        }
        Statics.field1852 = 0;
        Statics.field1902 = 0;
        Statics.field1903 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1808; var15++) {
            int var16 = var7.field1809[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1965[var16] == 0) {
                this.method2393(var8.field1965[var16], var8.field1966[var16], var7.field1812[var15], var7.field1810[var15], var7.field1813[var15]);
            }
        }
        this.method2388();
    }

    @ObfuscatedName("en.k(I[IIII)V")
    public void method2393(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1852 = 0;
            Statics.field1902 = 0;
            Statics.field1903 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1872.length) {
                    int[] var10 = this.field1872[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1852 += this.field1848[var12];
                        Statics.field1902 += this.field1849[var12];
                        Statics.field1903 += this.field1884[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1852 = Statics.field1852 / var7 + arg2;
                Statics.field1902 = Statics.field1902 / var7 + arg3;
                Statics.field1903 = Statics.field1903 / var7 + arg4;
            } else {
                Statics.field1852 = arg2;
                Statics.field1902 = arg3;
                Statics.field1903 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1872.length) {
                    int[] var15 = this.field1872[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1848[var17] += arg2;
                        this.field1849[var17] += arg3;
                        this.field1884[var17] += arg4;
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
                        this.field1848[var22] -= Statics.field1852;
                        this.field1849[var22] -= Statics.field1902;
                        this.field1884[var22] -= Statics.field1903;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1907[var25];
                            int var27 = field1908[var25];
                            int var28 = this.field1849[var22] * var26 + this.field1848[var22] * var27 >> 16;
                            this.field1849[var22] = this.field1849[var22] * var27 - this.field1848[var22] * var26 >> 16;
                            this.field1848[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1907[var23];
                            int var30 = field1908[var23];
                            int var31 = this.field1849[var22] * var30 - this.field1884[var22] * var29 >> 16;
                            this.field1884[var22] = this.field1884[var22] * var30 + this.field1849[var22] * var29 >> 16;
                            this.field1849[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1907[var24];
                            int var33 = field1908[var24];
                            int var34 = this.field1884[var22] * var32 + this.field1848[var22] * var33 >> 16;
                            this.field1884[var22] = this.field1884[var22] * var33 - this.field1848[var22] * var32 >> 16;
                            this.field1848[var22] = var34;
                        }
                        this.field1848[var22] += Statics.field1852;
                        this.field1849[var22] += Statics.field1902;
                        this.field1884[var22] += Statics.field1903;
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
                        this.field1848[var39] -= Statics.field1852;
                        this.field1849[var39] -= Statics.field1902;
                        this.field1884[var39] -= Statics.field1903;
                        this.field1848[var39] = this.field1848[var39] * arg2 / 128;
                        this.field1849[var39] = this.field1849[var39] * arg3 / 128;
                        this.field1884[var39] = this.field1884[var39] * arg4 / 128;
                        this.field1848[var39] += Statics.field1852;
                        this.field1849[var39] += Statics.field1902;
                        this.field1884[var39] += Statics.field1903;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1868 != null && this.field1859 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1868.length) {
                    int[] var42 = this.field1868[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1859[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1859[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("en.t()V")
    public void method2446() {
        for (int var1 = 0; var1 < this.field1869; var1++) {
            int var2 = this.field1848[var1];
            this.field1848[var1] = this.field1884[var1];
            this.field1884[var1] = -var2;
        }
        this.method2388();
    }

    @ObfuscatedName("en.h()V")
    public void method2406() {
        for (int var1 = 0; var1 < this.field1869; var1++) {
            this.field1848[var1] = -this.field1848[var1];
            this.field1884[var1] = -this.field1884[var1];
        }
        this.method2388();
    }

    @ObfuscatedName("en.u()V")
    public void method2423() {
        for (int var1 = 0; var1 < this.field1869; var1++) {
            int var2 = this.field1884[var1];
            this.field1884[var1] = this.field1848[var1];
            this.field1848[var1] = -var2;
        }
        this.method2388();
    }

    @ObfuscatedName("en.r(I)V")
    public void method2395(int arg0) {
        int var2 = field1907[arg0];
        int var3 = field1908[arg0];
        for (int var4 = 0; var4 < this.field1869; var4++) {
            int var5 = this.field1849[var4] * var3 - this.field1884[var4] * var2 >> 16;
            this.field1884[var4] = this.field1884[var4] * var3 + this.field1849[var4] * var2 >> 16;
            this.field1849[var4] = var5;
        }
        this.method2388();
    }

    @ObfuscatedName("en.o(III)V")
    public void method2412(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1869; var4++) {
            this.field1848[var4] += arg0;
            this.field1849[var4] += arg1;
            this.field1884[var4] += arg2;
        }
        this.method2388();
    }

    @ObfuscatedName("en.q(III)V")
    public void method2397(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1869; var4++) {
            this.field1848[var4] = this.field1848[var4] * arg0 / 128;
            this.field1849[var4] = this.field1849[var4] * arg1 / 128;
            this.field1884[var4] = this.field1884[var4] * arg2 / 128;
        }
        this.method2388();
    }

    @ObfuscatedName("en.al(IIIIIII)V")
    public final void method2398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1871[0] = -1;
        if (this.field1895 != 2 && this.field1895 != 1) {
            this.method2386();
        }
        int var8 = Statics.field1942;
        int var9 = Statics.field1935;
        int var10 = field1907[arg0];
        int var11 = field1908[arg0];
        int var12 = field1907[arg1];
        int var13 = field1908[arg1];
        int var14 = field1907[arg2];
        int var15 = field1908[arg2];
        int var16 = field1907[arg3];
        int var17 = field1908[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1869; var19++) {
            int var20 = this.field1848[var19];
            int var21 = this.field1849[var19];
            int var22 = this.field1884[var19];
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
            field1867[var19] = var30 - var18;
            field1901[var19] = class136.field1941 * var26 / var30 + var8;
            field1885[var19] = class136.field1941 * var29 / var30 + var9;
            if (this.field1843 > 0) {
                field1887[var19] = var26;
                field1909[var19] = var29;
                field1889[var19] = var30;
            }
        }
        try {
            this.method2401(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("en.ao(IIIIIIII)V")
    public final void method2410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1871[0] = -1;
        if (this.field1895 != 2 && this.field1895 != 1) {
            this.method2386();
        }
        int var9 = Statics.field1942;
        int var10 = Statics.field1935;
        int var11 = field1907[arg0];
        int var12 = field1908[arg0];
        int var13 = field1907[arg1];
        int var14 = field1908[arg1];
        int var15 = field1907[arg2];
        int var16 = field1908[arg2];
        int var17 = field1907[arg3];
        int var18 = field1908[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1869; var20++) {
            int var21 = this.field1848[var20];
            int var22 = this.field1849[var20];
            int var23 = this.field1884[var20];
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
            field1867[var20] = var31 - var19;
            field1901[var20] = class136.field1941 * var27 / arg7 + var9;
            field1885[var20] = class136.field1941 * var30 / arg7 + var10;
            if (this.field1843 > 0) {
                field1887[var20] = var27;
                field1909[var20] = var30;
                field1889[var20] = var31;
            }
        }
        try {
            this.method2401(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("en.cp(IIIIIIIII)V")
    public void method2400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1871[0] = -1;
        if (this.field1895 != 1) {
            this.method2385();
        }
        this.method2456(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1899 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1899) * class136.field1941;
        if (var15 / var13 >= Statics.field1955) {
            return;
        }
        int var16 = (this.field1899 + var14) * class136.field1941;
        if (var16 / var13 <= Statics.field1946) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1899 * arg1 >> 16;
        int var19 = (var17 + var18) * class136.field1941;
        if (var19 / var13 <= Statics.field1948) {
            return;
        }
        int var20 = (this.field2037 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class136.field1941;
        if (var21 / var13 >= Statics.field1949) {
            return;
        }
        int var22 = (this.field2037 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1843 > 0;
        int var26 = class134.field1915;
        int var28 = Statics.method260();
        boolean var29 = class134.method744();
        if (class8.field234 && arg8 > 0) {
            class8.method575(this, arg5, arg6, arg7);
        }
        if (class8.field231 && arg8 > 0) {
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
            int var40 = var26 - Statics.field1942;
            int var41 = var28 - Statics.field1935;
            if (var40 > var35 && var40 < var36 && var41 > var37 && var41 < var38) {
                var39 = -256;
            }
            class8.method2368(Statics.field1942 + var35, Statics.field1935 + var37, Statics.field1942 + var36, Statics.field1935 + var38, var39);
        }
        boolean var42 = false;
        if (arg8 > 0 && var29) {
            boolean var43 = false;
            if (field1912) {
                var43 = class134.method679(this, arg5, arg6, arg7);
            } else {
                int var44 = var11 - var12;
                if (var44 <= 50) {
                    var44 = 50;
                }
                int var45;
                int var46;
                if (var14 > 0) {
                    var45 = var15 / var13;
                    var46 = var16 / var44;
                } else {
                    var46 = var16 / var13;
                    var45 = var15 / var44;
                }
                int var47;
                int var48;
                if (var17 > 0) {
                    var47 = var21 / var13;
                    var48 = var19 / var44;
                } else {
                    var48 = var19 / var13;
                    var47 = var21 / var44;
                }
                int var49 = var26 - Statics.field1942;
                int var50 = var28 - Statics.field1935;
                if (var49 > var45 && var49 < var46 && var50 > var47 && var50 < var48) {
                    var43 = true;
                }
            }
            if (var43) {
                if (this.field1861) {
                    class134.field1923[++class134.field1922 - 1] = arg8;
                } else {
                    var42 = true;
                }
            }
        }
        int var52 = Statics.field1942;
        int var53 = Statics.field1935;
        int var54 = 0;
        int var55 = 0;
        if (arg0 != 0) {
            var54 = field1907[arg0];
            var55 = field1908[arg0];
        }
        for (int var56 = 0; var56 < this.field1869; var56++) {
            int var57 = this.field1848[var56];
            int var58 = this.field1849[var56];
            int var59 = this.field1884[var56];
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
            field1867[var56] = var68 - var11;
            if (var68 >= 50) {
                field1901[var56] = class136.field1941 * var64 / var68 + var52;
                field1885[var56] = class136.field1941 * var67 / var68 + var53;
            } else {
                field1901[var56] = -5000;
                var23 = true;
            }
            if (var25) {
                field1887[var56] = var64;
                field1909[var56] = var67;
                field1889[var56] = var68;
            }
        }
        try {
            this.method2401(var23, var42, this.field1861, arg8);
        } catch (Exception var71) {
        }
    }

    @ObfuscatedName("en.aq(ZZZI)V")
    public final void method2401(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1875 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1875; var5++) {
            field1871[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field233 && arg1) {
            class8.method2776(this, var6);
        }
        for (int var7 = 0; var7 < this.field1851; var7++) {
            if (this.field1857[var7] != -2) {
                int var8 = this.field1870[var7];
                int var9 = this.field1853[var7];
                int var10 = this.field1854[var7];
                int var11 = field1901[var8];
                int var12 = field1901[var9];
                int var13 = field1901[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1887[var8];
                    int var15 = field1887[var9];
                    int var16 = field1887[var10];
                    int var17 = field1909[var8];
                    int var18 = field1909[var9];
                    int var19 = field1909[var10];
                    int var20 = field1889[var8];
                    int var21 = field1889[var9];
                    int var22 = field1889[var10];
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
                        field1883[var7] = true;
                        int var32 = (field1867[var8] + field1867[var9] + field1867[var10]) / 3 + this.field1874;
                        field1892[var32][field1871[var32]++] = var7;
                    }
                } else {
                    if (arg1 && class134.method595(field1885[var8], field1885[var9], field1885[var10], var11, var12, var13, var6)) {
                        class134.field1923[++class134.field1922 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field1885[var10] - field1885[var9]) * (var11 - var12) - (field1885[var8] - field1885[var9]) * (var13 - var12) > 0) {
                        field1883[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field1944 && var12 <= Statics.field1944 && var13 <= Statics.field1944) {
                            field1882[var7] = false;
                        } else {
                            field1882[var7] = true;
                        }
                        int var34 = (field1867[var8] + field1867[var9] + field1867[var10]) / 3 + this.field1874;
                        field1892[var34][field1871[var34]++] = var7;
                    }
                }
            }
        }
        if (this.field1858 == null) {
            for (int var35 = this.field1875 - 1; var35 >= 0; var35--) {
                int var36 = field1871[var35];
                if (var36 > 0) {
                    int[] var37 = field1892[var35];
                    for (int var38 = 0; var38 < var36; var38++) {
                        this.method2402(var37[var38]);
                    }
                }
            }
            return;
        }
        for (int var39 = 0; var39 < 12; var39++) {
            field1860[var39] = 0;
            field1897[var39] = 0;
        }
        for (int var40 = this.field1875 - 1; var40 >= 0; var40--) {
            int var41 = field1871[var40];
            if (var41 > 0) {
                int[] var42 = field1892[var40];
                for (int var43 = 0; var43 < var41; var43++) {
                    int var44 = var42[var43];
                    byte var45 = this.field1858[var44];
                    int var46 = field1860[var45]++;
                    field1845[var45][var46] = var44;
                    if (var45 < 10) {
                        field1897[var45] += var40;
                    } else if (var45 == 10) {
                        field1850[var46] = var40;
                    } else {
                        field1896[var46] = var40;
                    }
                }
            }
        }
        int var47 = 0;
        if (field1860[1] > 0 || field1860[2] > 0) {
            var47 = (field1897[1] + field1897[2]) / (field1860[1] + field1860[2]);
        }
        int var48 = 0;
        if (field1860[3] > 0 || field1860[4] > 0) {
            var48 = (field1897[3] + field1897[4]) / (field1860[3] + field1860[4]);
        }
        int var49 = 0;
        if (field1860[6] > 0 || field1860[8] > 0) {
            var49 = (field1897[6] + field1897[8]) / (field1860[6] + field1860[8]);
        }
        int var50 = 0;
        int var51 = field1860[10];
        int[] var52 = field1845[10];
        int[] var53 = field1850;
        if (var50 == var51) {
            var50 = 0;
            var51 = field1860[11];
            var52 = field1845[11];
            var53 = field1896;
        }
        int var54;
        if (var50 < var51) {
            var54 = var53[var50];
        } else {
            var54 = -1000;
        }
        for (int var55 = 0; var55 < 10; var55++) {
            while (var55 == 0 && var54 > var47) {
                this.method2402(var52[var50++]);
                if (var50 == var51 && field1845[11] != var52) {
                    var50 = 0;
                    var51 = field1860[11];
                    var52 = field1845[11];
                    var53 = field1896;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 3 && var54 > var48) {
                this.method2402(var52[var50++]);
                if (var50 == var51 && field1845[11] != var52) {
                    var50 = 0;
                    var51 = field1860[11];
                    var52 = field1845[11];
                    var53 = field1896;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 5 && var54 > var49) {
                this.method2402(var52[var50++]);
                if (var50 == var51 && field1845[11] != var52) {
                    var50 = 0;
                    var51 = field1860[11];
                    var52 = field1845[11];
                    var53 = field1896;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            int var56 = field1860[var55];
            int[] var57 = field1845[var55];
            for (int var58 = 0; var58 < var56; var58++) {
                this.method2402(var57[var58]);
            }
        }
        while (var54 != -1000) {
            this.method2402(var52[var50++]);
            if (var50 == var51 && field1845[11] != var52) {
                var50 = 0;
                var52 = field1845[11];
                var51 = field1860[11];
                var53 = field1896;
            }
            if (var50 < var51) {
                var54 = var53[var50];
            } else {
                var54 = -1000;
            }
        }
    }

    @ObfuscatedName("en.ab(I)V")
    public final void method2402(int arg0) {
        if (field1883[arg0]) {
            this.method2403(arg0);
            return;
        }
        int var2 = this.field1870[arg0];
        int var3 = this.field1853[arg0];
        int var4 = this.field1854[arg0];
        class136.field1940 = field1882[arg0];
        if (this.field1859 == null) {
            class136.field1934 = 0;
        } else {
            class136.field1934 = this.field1859[arg0] & 0xFF;
        }
        if (this.field1891 != null && this.field1891[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1888 == null || this.field1888[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1888[arg0] & 0xFF;
                var6 = this.field1844[var5];
                var7 = this.field1865[var5];
                var8 = this.field1866[var5];
            }
            if (this.field1857[arg0] == -1) {
                class136.method2486(field1885[var2], field1885[var3], field1885[var4], field1901[var2], field1901[var3], field1901[var4], this.field1855[arg0], this.field1855[arg0], this.field1855[arg0], field1887[var6], field1887[var7], field1887[var8], field1909[var6], field1909[var7], field1909[var8], field1889[var6], field1889[var7], field1889[var8], this.field1891[arg0]);
            } else {
                class136.method2486(field1885[var2], field1885[var3], field1885[var4], field1901[var2], field1901[var3], field1901[var4], this.field1855[arg0], this.field1856[arg0], this.field1857[arg0], field1887[var6], field1887[var7], field1887[var8], field1909[var6], field1909[var7], field1909[var8], field1889[var6], field1889[var7], field1889[var8], this.field1891[arg0]);
            }
        } else if (this.field1857[arg0] == -1) {
            class136.method2484(field1885[var2], field1885[var3], field1885[var4], field1901[var2], field1901[var3], field1901[var4], field1847[this.field1855[arg0]]);
        } else {
            class136.method2482(field1885[var2], field1885[var3], field1885[var4], field1901[var2], field1901[var3], field1901[var4], this.field1855[arg0], this.field1856[arg0], this.field1857[arg0]);
        }
    }

    @ObfuscatedName("en.as(I)V")
    public final void method2403(int arg0) {
        int var2 = Statics.field1942;
        int var3 = Statics.field1935;
        int var4 = 0;
        int var5 = this.field1870[arg0];
        int var6 = this.field1853[arg0];
        int var7 = this.field1854[arg0];
        int var8 = field1889[var5];
        int var9 = field1889[var6];
        int var10 = field1889[var7];
        if (this.field1859 == null) {
            class136.field1934 = 0;
        } else {
            class136.field1934 = this.field1859[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1898[var4] = field1901[var5];
            field1864[var4] = field1885[var5];
            field1863[var4++] = this.field1855[arg0];
        } else {
            int var11 = field1887[var5];
            int var12 = field1909[var5];
            int var13 = this.field1855[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1904[var10 - var8];
                field1898[var4] = (((field1887[var7] - var11) * var14 >> 16) + var11) * class136.field1941 / 50 + var2;
                field1864[var4] = (((field1909[var7] - var12) * var14 >> 16) + var12) * class136.field1941 / 50 + var3;
                field1863[var4++] = ((this.field1857[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1904[var9 - var8];
                field1898[var4] = (((field1887[var6] - var11) * var15 >> 16) + var11) * class136.field1941 / 50 + var2;
                field1864[var4] = (((field1909[var6] - var12) * var15 >> 16) + var12) * class136.field1941 / 50 + var3;
                field1863[var4++] = ((this.field1856[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1898[var4] = field1901[var6];
            field1864[var4] = field1885[var6];
            field1863[var4++] = this.field1856[arg0];
        } else {
            int var16 = field1887[var6];
            int var17 = field1909[var6];
            int var18 = this.field1856[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1904[var8 - var9];
                field1898[var4] = (((field1887[var5] - var16) * var19 >> 16) + var16) * class136.field1941 / 50 + var2;
                field1864[var4] = (((field1909[var5] - var17) * var19 >> 16) + var17) * class136.field1941 / 50 + var3;
                field1863[var4++] = ((this.field1855[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1904[var10 - var9];
                field1898[var4] = (((field1887[var7] - var16) * var20 >> 16) + var16) * class136.field1941 / 50 + var2;
                field1864[var4] = (((field1909[var7] - var17) * var20 >> 16) + var17) * class136.field1941 / 50 + var3;
                field1863[var4++] = ((this.field1857[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1898[var4] = field1901[var7];
            field1864[var4] = field1885[var7];
            field1863[var4++] = this.field1857[arg0];
        } else {
            int var21 = field1887[var7];
            int var22 = field1909[var7];
            int var23 = this.field1857[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1904[var9 - var10];
                field1898[var4] = (((field1887[var6] - var21) * var24 >> 16) + var21) * class136.field1941 / 50 + var2;
                field1864[var4] = (((field1909[var6] - var22) * var24 >> 16) + var22) * class136.field1941 / 50 + var3;
                field1863[var4++] = ((this.field1856[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1904[var8 - var10];
                field1898[var4] = (((field1887[var5] - var21) * var25 >> 16) + var21) * class136.field1941 / 50 + var2;
                field1864[var4] = (((field1909[var5] - var22) * var25 >> 16) + var22) * class136.field1941 / 50 + var3;
                field1863[var4++] = ((this.field1855[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1898[0];
        int var27 = field1898[1];
        int var28 = field1898[2];
        int var29 = field1864[0];
        int var30 = field1864[1];
        int var31 = field1864[2];
        class136.field1940 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1944 || var27 > Statics.field1944 || var28 > Statics.field1944) {
                class136.field1940 = true;
            }
            if (this.field1891 != null && this.field1891[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1888 == null || this.field1888[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1888[arg0] & 0xFF;
                    var33 = this.field1844[var32];
                    var34 = this.field1865[var32];
                    var35 = this.field1866[var32];
                }
                if (this.field1857[arg0] == -1) {
                    class136.method2486(var29, var30, var31, var26, var27, var28, this.field1855[arg0], this.field1855[arg0], this.field1855[arg0], field1887[var33], field1887[var34], field1887[var35], field1909[var33], field1909[var34], field1909[var35], field1889[var33], field1889[var34], field1889[var35], this.field1891[arg0]);
                } else {
                    class136.method2486(var29, var30, var31, var26, var27, var28, field1863[0], field1863[1], field1863[2], field1887[var33], field1887[var34], field1887[var35], field1909[var33], field1909[var34], field1909[var35], field1889[var33], field1889[var34], field1889[var35], this.field1891[arg0]);
                }
            } else if (this.field1857[arg0] == -1) {
                class136.method2484(var29, var30, var31, var26, var27, var28, field1847[this.field1855[arg0]]);
            } else {
                class136.method2482(var29, var30, var31, var26, var27, var28, field1863[0], field1863[1], field1863[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1944 || var27 > Statics.field1944 || var28 > Statics.field1944 || field1898[3] < 0 || field1898[3] > Statics.field1944) {
            class136.field1940 = true;
        }
        if (this.field1891 != null && this.field1891[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1888 == null || this.field1888[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1888[arg0] & 0xFF;
                var37 = this.field1844[var36];
                var38 = this.field1865[var36];
                var39 = this.field1866[var36];
            }
            short var40 = this.field1891[arg0];
            if (this.field1857[arg0] == -1) {
                class136.method2486(var29, var30, var31, var26, var27, var28, this.field1855[arg0], this.field1855[arg0], this.field1855[arg0], field1887[var37], field1887[var38], field1887[var39], field1909[var37], field1909[var38], field1909[var39], field1889[var37], field1889[var38], field1889[var39], var40);
                class136.method2486(var29, var31, field1864[3], var26, var28, field1898[3], this.field1855[arg0], this.field1855[arg0], this.field1855[arg0], field1887[var37], field1887[var38], field1887[var39], field1909[var37], field1909[var38], field1909[var39], field1889[var37], field1889[var38], field1889[var39], var40);
            } else {
                class136.method2486(var29, var30, var31, var26, var27, var28, field1863[0], field1863[1], field1863[2], field1887[var37], field1887[var38], field1887[var39], field1909[var37], field1909[var38], field1909[var39], field1889[var37], field1889[var38], field1889[var39], var40);
                class136.method2486(var29, var31, field1864[3], var26, var28, field1898[3], field1863[0], field1863[2], field1863[3], field1887[var37], field1887[var38], field1887[var39], field1909[var37], field1909[var38], field1909[var39], field1889[var37], field1889[var38], field1889[var39], var40);
            }
        } else if (this.field1857[arg0] == -1) {
            int var41 = field1847[this.field1855[arg0]];
            class136.method2484(var29, var30, var31, var26, var27, var28, var41);
            class136.method2484(var29, var31, field1864[3], var26, var28, field1898[3], var41);
        } else {
            class136.method2482(var29, var30, var31, var26, var27, var28, field1863[0], field1863[1], field1863[2]);
            class136.method2482(var29, var31, field1864[3], var26, var28, field1898[3], field1863[0], field1863[2], field1863[3]);
        }
    }
}
