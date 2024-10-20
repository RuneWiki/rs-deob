package deob;

@ObfuscatedName("fa")
public class class170 extends class365 {

    @ObfuscatedName("fa.i")
    public static class236 field1904 = new class236(64);

    @ObfuscatedName("fa.y")
    public static class236 field1882 = new class236(50);

    @ObfuscatedName("fa.w")
    public static class236 field1885 = new class236(200);

    @ObfuscatedName("fa.v")
    public int field1908;

    @ObfuscatedName("fa.s")
    public int field1886;

    @ObfuscatedName("fa.c")
    public String field1876 = class283.field3360;

    @ObfuscatedName("fa.b")
    public short[] field1888;

    @ObfuscatedName("fa.x")
    public short[] field1889;

    @ObfuscatedName("fa.p")
    public short[] field1925;

    @ObfuscatedName("fa.z")
    public short[] field1891;

    @ObfuscatedName("fa.h")
    public int field1924 = 2000;

    @ObfuscatedName("fa.o")
    public int field1921 = 0;

    @ObfuscatedName("fa.r")
    public int field1894 = 0;

    @ObfuscatedName("fa.n")
    public int field1895 = 0;

    @ObfuscatedName("fa.u")
    public int field1896 = 0;

    @ObfuscatedName("fa.d")
    public int field1897 = 0;

    @ObfuscatedName("fa.ab")
    public int field1898 = 0;

    @ObfuscatedName("fa.ad")
    public int field1899 = 1;

    @ObfuscatedName("fa.as")
    public boolean field1900 = false;

    @ObfuscatedName("fa.ak")
    public String[] field1928 = new String[] { null, null, class283.field3327, null, null };

    @ObfuscatedName("fa.ah")
    public String[] field1902 = new String[] { null, null, null, null, class283.field3509 };

    @ObfuscatedName("fa.al")
    public int field1903 = -2;

    @ObfuscatedName("fa.ao")
    public int field1887 = -1;

    @ObfuscatedName("fa.au")
    public int field1912 = -1;

    @ObfuscatedName("fa.aa")
    public int field1923 = 0;

    @ObfuscatedName("fa.ag")
    public int field1907 = -1;

    @ObfuscatedName("fa.aq")
    public int field1918 = -1;

    @ObfuscatedName("fa.ar")
    public int field1909 = 0;

    @ObfuscatedName("fa.ac")
    public int field1910 = -1;

    @ObfuscatedName("fa.at")
    public int field1911 = -1;

    @ObfuscatedName("fa.ax")
    public int field1890 = -1;

    @ObfuscatedName("fa.an")
    public int field1913 = -1;

    @ObfuscatedName("fa.av")
    public int field1877 = -1;

    @ObfuscatedName("fa.ap")
    public int field1915 = -1;

    @ObfuscatedName("fa.aj")
    public int[] field1916;

    @ObfuscatedName("fa.am")
    public int[] field1917;

    @ObfuscatedName("fa.aw")
    public int field1879 = -1;

    @ObfuscatedName("fa.az")
    public int field1919 = -1;

    @ObfuscatedName("fa.ae")
    public int field1906 = 128;

    @ObfuscatedName("fa.ai")
    public int field1892 = 128;

    @ObfuscatedName("fa.af")
    public int field1922 = 128;

    @ObfuscatedName("fa.bz")
    public int field1893 = 0;

    @ObfuscatedName("fa.bt")
    public int field1883 = 0;

    @ObfuscatedName("fa.bg")
    public int field1901 = 0;

    @ObfuscatedName("fa.bf")
    public class379 field1926;

    @ObfuscatedName("fa.bj")
    public boolean field1927 = false;

    @ObfuscatedName("fa.bo")
    public int field1914 = -1;

    @ObfuscatedName("fa.bx")
    public int field1929 = -1;

    @ObfuscatedName("fa.bu")
    public int field1930 = -1;

    @ObfuscatedName("fa.bc")
    public int field1931 = -1;

    @ObfuscatedName("cr.l(II)Lfa;")
    public static class170 method2099(int arg0) {
        class170 var1 = (class170) field1904.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1317.method4756(10, arg0);
        class170 var3 = new class170();
        var3.field1908 = arg0;
        if (var2 != null) {
            var3.method3056(new class401(var2));
        }
        var3.method3000();
        if (var3.field1919 != -1) {
            var3.method3003(method2099(var3.field1919), method2099(var3.field1879));
        }
        if (var3.field1929 != -1) {
            var3.method3004(method2099(var3.field1929), method2099(var3.field1914));
        }
        if (var3.field1931 != -1) {
            var3.method3005(method2099(var3.field1931), method2099(var3.field1930));
        }
        if (!Statics.field1880 && var3.field1900) {
            var3.field1876 = class283.field3470;
            var3.field1927 = false;
            for (int var4 = 0; var4 < var3.field1928.length; var4++) {
                var3.field1928[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field1902.length; var5++) {
                if (var5 != 4) {
                    var3.field1902[var5] = null;
                }
            }
            var3.field1903 = -2;
            var3.field1901 = 0;
            if (var3.field1926 != null) {
                boolean var6 = false;
                for (class370 var7 = var3.field1926.method6045(); var7 != null; var7 = var3.field1926.method6046()) {
                    class166 var8 = class166.method2408((int) var7.field4075);
                    if (var8.field1791) {
                        var7.method5775();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field1926 = null;
                }
            }
        }
        field1904.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fa.q(B)V")
    public void method3000() {
    }

    @ObfuscatedName("fa.f(Lot;B)V")
    public void method3056(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method3002(arg0, var2);
        }
    }

    @ObfuscatedName("fa.j(Lot;IS)V")
    public void method3002(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1886 = arg0.method6284();
        } else if (arg1 == 2) {
            this.field1876 = arg0.method6474();
        } else if (arg1 == 4) {
            this.field1924 = arg0.method6284();
        } else if (arg1 == 5) {
            this.field1921 = arg0.method6284();
        } else if (arg1 == 6) {
            this.field1894 = arg0.method6284();
        } else if (arg1 == 7) {
            this.field1896 = arg0.method6284();
            if (this.field1896 > 32767) {
                this.field1896 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1897 = arg0.method6284();
            if (this.field1897 > 32767) {
                this.field1897 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method6474();
        } else if (arg1 == 11) {
            this.field1898 = 1;
        } else if (arg1 == 12) {
            this.field1899 = arg0.method6277();
        } else if (arg1 == 16) {
            this.field1900 = true;
        } else if (arg1 == 23) {
            this.field1887 = arg0.method6284();
            this.field1923 = arg0.method6272();
        } else if (arg1 == 24) {
            this.field1912 = arg0.method6284();
        } else if (arg1 == 25) {
            this.field1907 = arg0.method6284();
            this.field1909 = arg0.method6272();
        } else if (arg1 == 26) {
            this.field1918 = arg0.method6284();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1928[arg1 - 30] = arg0.method6474();
            if (this.field1928[arg1 - 30].equalsIgnoreCase(class283.field3329)) {
                this.field1928[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1902[arg1 - 35] = arg0.method6474();
        } else if (arg1 == 40) {
            int var3 = arg0.method6272();
            this.field1888 = new short[var3];
            this.field1889 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1888[var4] = (short) arg0.method6284();
                this.field1889[var4] = (short) arg0.method6284();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6272();
            this.field1925 = new short[var5];
            this.field1891 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1925[var6] = (short) arg0.method6284();
                this.field1891[var6] = (short) arg0.method6284();
            }
        } else if (arg1 == 42) {
            this.field1903 = arg0.method6273();
        } else if (arg1 == 65) {
            this.field1927 = true;
        } else if (arg1 == 78) {
            this.field1910 = arg0.method6284();
        } else if (arg1 == 79) {
            this.field1911 = arg0.method6284();
        } else if (arg1 == 90) {
            this.field1890 = arg0.method6284();
        } else if (arg1 == 91) {
            this.field1877 = arg0.method6284();
        } else if (arg1 == 92) {
            this.field1913 = arg0.method6284();
        } else if (arg1 == 93) {
            this.field1915 = arg0.method6284();
        } else if (arg1 == 94) {
            arg0.method6284();
        } else if (arg1 == 95) {
            this.field1895 = arg0.method6284();
        } else if (arg1 == 97) {
            this.field1879 = arg0.method6284();
        } else if (arg1 == 98) {
            this.field1919 = arg0.method6284();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1916 == null) {
                this.field1916 = new int[10];
                this.field1917 = new int[10];
            }
            this.field1916[arg1 - 100] = arg0.method6284();
            this.field1917[arg1 - 100] = arg0.method6284();
        } else if (arg1 == 110) {
            this.field1906 = arg0.method6284();
        } else if (arg1 == 111) {
            this.field1892 = arg0.method6284();
        } else if (arg1 == 112) {
            this.field1922 = arg0.method6284();
        } else if (arg1 == 113) {
            this.field1893 = arg0.method6273();
        } else if (arg1 == 114) {
            this.field1883 = arg0.method6273() * 5;
        } else if (arg1 == 115) {
            this.field1901 = arg0.method6272();
        } else if (arg1 == 139) {
            this.field1914 = arg0.method6284();
        } else if (arg1 == 140) {
            this.field1929 = arg0.method6284();
        } else if (arg1 == 148) {
            this.field1930 = arg0.method6284();
        } else if (arg1 == 149) {
            this.field1931 = arg0.method6284();
        } else if (arg1 == 249) {
            this.field1926 = class158.method360(arg0, this.field1926);
        }
    }

    @ObfuscatedName("fa.m(Lfa;Lfa;I)V")
    public void method3003(class170 arg0, class170 arg1) {
        this.field1886 = arg0.field1886;
        this.field1924 = arg0.field1924;
        this.field1921 = arg0.field1921;
        this.field1894 = arg0.field1894;
        this.field1895 = arg0.field1895;
        this.field1896 = arg0.field1896;
        this.field1897 = arg0.field1897;
        this.field1888 = arg0.field1888;
        this.field1889 = arg0.field1889;
        this.field1925 = arg0.field1925;
        this.field1891 = arg0.field1891;
        this.field1876 = arg1.field1876;
        this.field1900 = arg1.field1900;
        this.field1899 = arg1.field1899;
        this.field1898 = 1;
    }

    @ObfuscatedName("fa.k(Lfa;Lfa;I)V")
    public void method3004(class170 arg0, class170 arg1) {
        this.field1886 = arg0.field1886;
        this.field1924 = arg0.field1924;
        this.field1921 = arg0.field1921;
        this.field1894 = arg0.field1894;
        this.field1895 = arg0.field1895;
        this.field1896 = arg0.field1896;
        this.field1897 = arg0.field1897;
        this.field1888 = arg1.field1888;
        this.field1889 = arg1.field1889;
        this.field1925 = arg1.field1925;
        this.field1891 = arg1.field1891;
        this.field1876 = arg1.field1876;
        this.field1900 = arg1.field1900;
        this.field1898 = arg1.field1898;
        this.field1887 = arg1.field1887;
        this.field1912 = arg1.field1912;
        this.field1910 = arg1.field1910;
        this.field1907 = arg1.field1907;
        this.field1918 = arg1.field1918;
        this.field1911 = arg1.field1911;
        this.field1890 = arg1.field1890;
        this.field1913 = arg1.field1913;
        this.field1877 = arg1.field1877;
        this.field1915 = arg1.field1915;
        this.field1901 = arg1.field1901;
        this.field1928 = arg1.field1928;
        this.field1902 = new String[5];
        if (arg1.field1902 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1902[var3] = arg1.field1902[var3];
            }
        }
        this.field1902[4] = class283.field3604;
        this.field1899 = 0;
    }

    @ObfuscatedName("fa.t(Lfa;Lfa;I)V")
    public void method3005(class170 arg0, class170 arg1) {
        this.field1886 = arg0.field1886;
        this.field1924 = arg0.field1924;
        this.field1921 = arg0.field1921;
        this.field1894 = arg0.field1894;
        this.field1895 = arg0.field1895;
        this.field1896 = arg0.field1896;
        this.field1897 = arg0.field1897;
        this.field1888 = arg0.field1888;
        this.field1889 = arg0.field1889;
        this.field1925 = arg0.field1925;
        this.field1891 = arg0.field1891;
        this.field1898 = arg0.field1898;
        this.field1876 = arg1.field1876;
        this.field1899 = 0;
        this.field1900 = false;
        this.field1927 = false;
    }

    @ObfuscatedName("fa.a(II)Lgi;")
    public final class206 method3046(int arg0) {
        if (this.field1916 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1917[var3] && this.field1917[var3] != 0) {
                    var2 = this.field1916[var3];
                }
            }
            if (var2 != -1) {
                return method2099(var2).method3046(1);
            }
        }
        class206 var4 = class206.method3692(Statics.field1905, this.field1886, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1906 != 128 || this.field1892 != 128 || this.field1922 != 128) {
            var4.method3666(this.field1906, this.field1892, this.field1922);
        }
        if (this.field1888 != null) {
            for (int var5 = 0; var5 < this.field1888.length; var5++) {
                var4.method3663(this.field1888[var5], this.field1889[var5]);
            }
        }
        if (this.field1925 != null) {
            for (int var6 = 0; var6 < this.field1925.length; var6++) {
                var4.method3664(this.field1925[var6], this.field1891[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fa.e(IB)Lhl;")
    public final class220 method3065(int arg0) {
        if (this.field1916 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1917[var3] && this.field1917[var3] != 0) {
                    var2 = this.field1916[var3];
                }
            }
            if (var2 != -1) {
                return method2099(var2).method3065(1);
            }
        }
        class220 var4 = (class220) field1882.method4223((long) this.field1908);
        if (var4 != null) {
            return var4;
        }
        class206 var5 = class206.method3692(Statics.field1905, this.field1886, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1906 != 128 || this.field1892 != 128 || this.field1922 != 128) {
            var5.method3666(this.field1906, this.field1892, this.field1922);
        }
        if (this.field1888 != null) {
            for (int var6 = 0; var6 < this.field1888.length; var6++) {
                var5.method3663(this.field1888[var6], this.field1889[var6]);
            }
        }
        if (this.field1925 != null) {
            for (int var7 = 0; var7 < this.field1925.length; var7++) {
                var5.method3664(this.field1925[var7], this.field1891[var7]);
            }
        }
        class220 var8 = var5.method3671(this.field1893 + 64, this.field1883 + 768, -50, -10, -50);
        var8.field2531 = true;
        field1882.method4225(var8, (long) this.field1908);
        return var8;
    }

    @ObfuscatedName("fa.i(II)Lfa;")
    public class170 method3008(int arg0) {
        if (this.field1916 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1917[var3] && this.field1917[var3] != 0) {
                    var2 = this.field1916[var3];
                }
            }
            if (var2 != -1) {
                return method2099(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cd.y(IIIIIZB)Lon;")
    public static final class414 method2052(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class414 var8 = (class414) field1885.method4223(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class170 var9 = method2099(arg0);
        if (arg1 > 1 && var9.field1916 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1917[var11] && var9.field1917[var11] != 0) {
                    var10 = var9.field1916[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2099(var10);
            }
        }
        class220 var12 = var9.method3065(1);
        if (var12 == null) {
            return null;
        }
        class414 var13 = null;
        if (var9.field1919 != -1) {
            var13 = method2052(var9.field1879, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1929 != -1) {
            var13 = method2052(var9.field1914, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1931 != -1) {
            var13 = method2052(var9.field1930, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4357;
        int var15 = Statics.field4358;
        int var16 = Statics.field4359;
        int[] var17 = new int[4];
        class410.method6556(var17);
        class414 var18 = new class414(36, 32);
        class410.method6551(var18.field4385, 36, 32);
        class410.method6558();
        class211.method3746();
        class211.method3749(16, 16);
        class211.field2349 = false;
        if (var9.field1931 != -1) {
            var13.method6659(0, 0);
        }
        int var19 = var9.field1924;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class211.field2371[var9.field1921] * var19 >> 16;
        int var21 = class211.field2359[var9.field1921] * var19 >> 16;
        var12.method4076();
        var12.method4078(0, var9.field1894, var9.field1895, var9.field1921, var9.field1896, var9.field1897 + var12.field2449 / 2 + var20, var9.field1897 + var21);
        if (var9.field1929 != -1) {
            var13.method6659(0, 0);
        }
        if (arg2 >= 1) {
            var18.method6655(1);
        }
        if (arg2 >= 2) {
            var18.method6655(16777215);
        }
        if (arg3 != 0) {
            var18.method6656(arg3);
        }
        class410.method6551(var18.field4385, 36, 32);
        if (var9.field1919 != -1) {
            var13.method6659(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1898 == 1) {
            Statics.field1884.method5207(method205(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1885.method4225(var18, var6);
        }
        class410.method6551(var14, var15, var16);
        class410.method6557(var17);
        class211.method3746();
        class211.field2349 = true;
        return var18;
    }

    @ObfuscatedName("b.w(II)Ljava/lang/String;")
    public static final String method205(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class283.field3503 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class283.field3505 + "</col>";
        }
    }

    @ObfuscatedName("fa.g(ZI)Z")
    public final boolean method3009(boolean arg0) {
        int var2 = this.field1887;
        int var3 = this.field1912;
        int var4 = this.field1910;
        if (arg0) {
            var2 = this.field1907;
            var3 = this.field1918;
            var4 = this.field1911;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1905.method4758(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1905.method4758(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1905.method4758(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("fa.v(ZB)Lgi;")
    public final class206 method3035(boolean arg0) {
        int var2 = this.field1887;
        int var3 = this.field1912;
        int var4 = this.field1910;
        if (arg0) {
            var2 = this.field1907;
            var3 = this.field1918;
            var4 = this.field1911;
        }
        if (var2 == -1) {
            return null;
        }
        class206 var5 = class206.method3692(Statics.field1905, var2, 0);
        if (var3 != -1) {
            class206 var6 = class206.method3692(Statics.field1905, var3, 0);
            if (var4 == -1) {
                class206[] var9 = new class206[] { var5, var6 };
                var5 = new class206(var9, 2);
            } else {
                class206 var7 = class206.method3692(Statics.field1905, var4, 0);
                class206[] var8 = new class206[] { var5, var6, var7 };
                var5 = new class206(var8, 3);
            }
        }
        if (!arg0 && this.field1923 != 0) {
            var5.method3662(0, this.field1923, 0);
        }
        if (arg0 && this.field1909 != 0) {
            var5.method3662(0, this.field1909, 0);
        }
        if (this.field1888 != null) {
            for (int var10 = 0; var10 < this.field1888.length; var10++) {
                var5.method3663(this.field1888[var10], this.field1889[var10]);
            }
        }
        if (this.field1925 != null) {
            for (int var11 = 0; var11 < this.field1925.length; var11++) {
                var5.method3664(this.field1925[var11], this.field1891[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("fa.s(ZS)Z")
    public final boolean method3011(boolean arg0) {
        int var2 = this.field1890;
        int var3 = this.field1913;
        if (arg0) {
            var2 = this.field1877;
            var3 = this.field1915;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1905.method4758(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1905.method4758(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("fa.c(ZS)Lgi;")
    public final class206 method3012(boolean arg0) {
        int var2 = this.field1890;
        int var3 = this.field1913;
        if (arg0) {
            var2 = this.field1877;
            var3 = this.field1915;
        }
        if (var2 == -1) {
            return null;
        }
        class206 var4 = class206.method3692(Statics.field1905, var2, 0);
        if (var3 != -1) {
            class206 var5 = class206.method3692(Statics.field1905, var3, 0);
            class206[] var6 = new class206[] { var4, var5 };
            var4 = new class206(var6, 2);
        }
        if (this.field1888 != null) {
            for (int var7 = 0; var7 < this.field1888.length; var7++) {
                var4.method3663(this.field1888[var7], this.field1889[var7]);
            }
        }
        if (this.field1925 != null) {
            for (int var8 = 0; var8 < this.field1925.length; var8++) {
                var4.method3664(this.field1925[var8], this.field1891[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fa.b(III)I")
    public int method3013(int arg0, int arg1) {
        class379 var3 = this.field1926;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class369 var5 = (class369) var3.method6049((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4074;
            }
        }
        return var4;
    }

    @ObfuscatedName("fa.x(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3014(int arg0, String arg1) {
        class379 var3 = this.field1926;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class366 var5 = (class366) var3.method6049((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4071;
            }
        }
        return var4;
    }

    @ObfuscatedName("fa.p(I)I")
    public int method3015() {
        if (this.field1903 == -1 || this.field1902 == null) {
            return -1;
        } else if (this.field1903 >= 0) {
            return this.field1902[this.field1903] == null ? -1 : this.field1903;
        } else if (class283.field3509.equalsIgnoreCase(this.field1902[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fc.z(B)V")
    public static void method3189() {
        field1904.method4226();
        field1882.method4226();
        field1885.method4226();
    }

    @ObfuscatedName("fa.h(I)Z")
    public boolean method3042() {
        return this.field1889 != null;
    }

    @ObfuscatedName("fa.o(I)Z")
    public boolean method3017() {
        return this.field1891 != null;
    }
}
