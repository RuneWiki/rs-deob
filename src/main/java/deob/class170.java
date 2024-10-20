package deob;

@ObfuscatedName("ff")
public class class170 extends class365 {

    @ObfuscatedName("ff.b")
    public static class236 field1896 = new class236(64);

    @ObfuscatedName("ff.x")
    public static class236 field1906 = new class236(50);

    @ObfuscatedName("ff.y")
    public static class236 field1884 = new class236(200);

    @ObfuscatedName("ff.t")
    public int field1885;

    @ObfuscatedName("ff.l")
    public int field1886;

    @ObfuscatedName("ff.u")
    public String field1887 = class283.field3566;

    @ObfuscatedName("ff.n")
    public short[] field1901;

    @ObfuscatedName("ff.z")
    public short[] field1907;

    @ObfuscatedName("ff.q")
    public short[] field1890;

    @ObfuscatedName("ff.d")
    public short[] field1891;

    @ObfuscatedName("ff.r")
    public int field1892 = 2000;

    @ObfuscatedName("ff.m")
    public int field1893 = 0;

    @ObfuscatedName("ff.c")
    public int field1894 = 0;

    @ObfuscatedName("ff.f")
    public int field1895 = 0;

    @ObfuscatedName("ff.h")
    public int field1877 = 0;

    @ObfuscatedName("ff.v")
    public int field1897 = 0;

    @ObfuscatedName("ff.ag")
    public int field1898 = 0;

    @ObfuscatedName("ff.ae")
    public int field1883 = 1;

    @ObfuscatedName("ff.aq")
    public boolean field1900 = false;

    @ObfuscatedName("ff.al")
    public String[] field1904 = new String[] { null, null, class283.field3318, null, null };

    @ObfuscatedName("ff.am")
    public String[] field1879 = new String[] { null, null, null, null, class283.field3319 };

    @ObfuscatedName("ff.ah")
    public int field1903 = -2;

    @ObfuscatedName("ff.as")
    public int field1923 = -1;

    @ObfuscatedName("ff.at")
    public int field1905 = -1;

    @ObfuscatedName("ff.az")
    public int field1922 = 0;

    @ObfuscatedName("ff.ac")
    public int field1927 = -1;

    @ObfuscatedName("ff.ak")
    public int field1908 = -1;

    @ObfuscatedName("ff.ab")
    public int field1909 = 0;

    @ObfuscatedName("ff.ar")
    public int field1910 = -1;

    @ObfuscatedName("ff.ad")
    public int field1911 = -1;

    @ObfuscatedName("ff.an")
    public int field1889 = -1;

    @ObfuscatedName("ff.ax")
    public int field1913 = -1;

    @ObfuscatedName("ff.av")
    public int field1914 = -1;

    @ObfuscatedName("ff.ap")
    public int field1926 = -1;

    @ObfuscatedName("ff.au")
    public int[] field1918;

    @ObfuscatedName("ff.aj")
    public int[] field1917;

    @ObfuscatedName("ff.af")
    public int field1915 = -1;

    @ObfuscatedName("ff.aw")
    public int field1919 = -1;

    @ObfuscatedName("ff.ao")
    public int field1912 = 128;

    @ObfuscatedName("ff.aa")
    public int field1921 = 128;

    @ObfuscatedName("ff.ay")
    public int field1878 = 128;

    @ObfuscatedName("ff.bg")
    public int field1902 = 0;

    @ObfuscatedName("ff.bl")
    public int field1924 = 0;

    @ObfuscatedName("ff.bx")
    public int field1920 = 0;

    @ObfuscatedName("ff.bd")
    public class379 field1899;

    @ObfuscatedName("ff.bt")
    public boolean field1882 = false;

    @ObfuscatedName("ff.bf")
    public int field1928 = -1;

    @ObfuscatedName("ff.bs")
    public int field1929 = -1;

    @ObfuscatedName("ff.bh")
    public int field1930 = -1;

    @ObfuscatedName("ff.bw")
    public int field1931 = -1;

    @ObfuscatedName("ew.i(II)Lff;")
    public static class170 method2586(int arg0) {
        class170 var1 = (class170) field1896.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3214.method4743(10, arg0);
        class170 var3 = new class170();
        var3.field1885 = arg0;
        if (var2 != null) {
            var3.method3019(new class401(var2));
        }
        var3.method3018();
        if (var3.field1919 != -1) {
            var3.method3021(method2586(var3.field1919), method2586(var3.field1915));
        }
        if (var3.field1929 != -1) {
            var3.method3022(method2586(var3.field1929), method2586(var3.field1928));
        }
        if (var3.field1931 != -1) {
            var3.method3023(method2586(var3.field1931), method2586(var3.field1930));
        }
        if (!Statics.field1332 && var3.field1900) {
            var3.field1887 = class283.field3435;
            var3.field1882 = false;
            for (int var4 = 0; var4 < var3.field1904.length; var4++) {
                var3.field1904[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field1879.length; var5++) {
                if (var5 != 4) {
                    var3.field1879[var5] = null;
                }
            }
            var3.field1903 = -2;
            var3.field1920 = 0;
            if (var3.field1899 != null) {
                boolean var6 = false;
                for (class370 var7 = var3.field1899.method6014(); var7 != null; var7 = var3.field1899.method6008()) {
                    class166 var8 = class166.method6451((int) var7.field4075);
                    if (var8.field1788) {
                        var7.method5752();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field1899 = null;
                }
            }
        }
        field1896.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ff.w(I)V")
    public void method3018() {
    }

    @ObfuscatedName("ff.s(Lop;I)V")
    public void method3019(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method3020(arg0, var2);
        }
    }

    @ObfuscatedName("ff.a(Lop;II)V")
    public void method3020(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1886 = arg0.method6242();
        } else if (arg1 == 2) {
            this.field1887 = arg0.method6335();
        } else if (arg1 == 4) {
            this.field1892 = arg0.method6242();
        } else if (arg1 == 5) {
            this.field1893 = arg0.method6242();
        } else if (arg1 == 6) {
            this.field1894 = arg0.method6242();
        } else if (arg1 == 7) {
            this.field1877 = arg0.method6242();
            if (this.field1877 > 32767) {
                this.field1877 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1897 = arg0.method6242();
            if (this.field1897 > 32767) {
                this.field1897 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method6335();
        } else if (arg1 == 11) {
            this.field1898 = 1;
        } else if (arg1 == 12) {
            this.field1883 = arg0.method6245();
        } else if (arg1 == 16) {
            this.field1900 = true;
        } else if (arg1 == 23) {
            this.field1923 = arg0.method6242();
            this.field1922 = arg0.method6240();
        } else if (arg1 == 24) {
            this.field1905 = arg0.method6242();
        } else if (arg1 == 25) {
            this.field1927 = arg0.method6242();
            this.field1909 = arg0.method6240();
        } else if (arg1 == 26) {
            this.field1908 = arg0.method6242();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1904[arg1 - 30] = arg0.method6335();
            if (this.field1904[arg1 - 30].equalsIgnoreCase(class283.field3634)) {
                this.field1904[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1879[arg1 - 35] = arg0.method6335();
        } else if (arg1 == 40) {
            int var3 = arg0.method6240();
            this.field1901 = new short[var3];
            this.field1907 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1901[var4] = (short) arg0.method6242();
                this.field1907[var4] = (short) arg0.method6242();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6240();
            this.field1890 = new short[var5];
            this.field1891 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1890[var6] = (short) arg0.method6242();
                this.field1891[var6] = (short) arg0.method6242();
            }
        } else if (arg1 == 42) {
            this.field1903 = arg0.method6241();
        } else if (arg1 == 65) {
            this.field1882 = true;
        } else if (arg1 == 78) {
            this.field1910 = arg0.method6242();
        } else if (arg1 == 79) {
            this.field1911 = arg0.method6242();
        } else if (arg1 == 90) {
            this.field1889 = arg0.method6242();
        } else if (arg1 == 91) {
            this.field1914 = arg0.method6242();
        } else if (arg1 == 92) {
            this.field1913 = arg0.method6242();
        } else if (arg1 == 93) {
            this.field1926 = arg0.method6242();
        } else if (arg1 == 94) {
            arg0.method6242();
        } else if (arg1 == 95) {
            this.field1895 = arg0.method6242();
        } else if (arg1 == 97) {
            this.field1915 = arg0.method6242();
        } else if (arg1 == 98) {
            this.field1919 = arg0.method6242();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1918 == null) {
                this.field1918 = new int[10];
                this.field1917 = new int[10];
            }
            this.field1918[arg1 - 100] = arg0.method6242();
            this.field1917[arg1 - 100] = arg0.method6242();
        } else if (arg1 == 110) {
            this.field1912 = arg0.method6242();
        } else if (arg1 == 111) {
            this.field1921 = arg0.method6242();
        } else if (arg1 == 112) {
            this.field1878 = arg0.method6242();
        } else if (arg1 == 113) {
            this.field1902 = arg0.method6241();
        } else if (arg1 == 114) {
            this.field1924 = arg0.method6241() * 5;
        } else if (arg1 == 115) {
            this.field1920 = arg0.method6240();
        } else if (arg1 == 139) {
            this.field1928 = arg0.method6242();
        } else if (arg1 == 140) {
            this.field1929 = arg0.method6242();
        } else if (arg1 == 148) {
            this.field1930 = arg0.method6242();
        } else if (arg1 == 149) {
            this.field1931 = arg0.method6242();
        } else if (arg1 == 249) {
            this.field1899 = class158.method164(arg0, this.field1899);
        }
    }

    @ObfuscatedName("ff.o(Lff;Lff;B)V")
    public void method3021(class170 arg0, class170 arg1) {
        this.field1886 = arg0.field1886;
        this.field1892 = arg0.field1892;
        this.field1893 = arg0.field1893;
        this.field1894 = arg0.field1894;
        this.field1895 = arg0.field1895;
        this.field1877 = arg0.field1877;
        this.field1897 = arg0.field1897;
        this.field1901 = arg0.field1901;
        this.field1907 = arg0.field1907;
        this.field1890 = arg0.field1890;
        this.field1891 = arg0.field1891;
        this.field1887 = arg1.field1887;
        this.field1900 = arg1.field1900;
        this.field1883 = arg1.field1883;
        this.field1898 = 1;
    }

    @ObfuscatedName("ff.g(Lff;Lff;I)V")
    public void method3022(class170 arg0, class170 arg1) {
        this.field1886 = arg0.field1886;
        this.field1892 = arg0.field1892;
        this.field1893 = arg0.field1893;
        this.field1894 = arg0.field1894;
        this.field1895 = arg0.field1895;
        this.field1877 = arg0.field1877;
        this.field1897 = arg0.field1897;
        this.field1901 = arg1.field1901;
        this.field1907 = arg1.field1907;
        this.field1890 = arg1.field1890;
        this.field1891 = arg1.field1891;
        this.field1887 = arg1.field1887;
        this.field1900 = arg1.field1900;
        this.field1898 = arg1.field1898;
        this.field1923 = arg1.field1923;
        this.field1905 = arg1.field1905;
        this.field1910 = arg1.field1910;
        this.field1927 = arg1.field1927;
        this.field1908 = arg1.field1908;
        this.field1911 = arg1.field1911;
        this.field1889 = arg1.field1889;
        this.field1913 = arg1.field1913;
        this.field1914 = arg1.field1914;
        this.field1926 = arg1.field1926;
        this.field1920 = arg1.field1920;
        this.field1904 = arg1.field1904;
        this.field1879 = new String[5];
        if (arg1.field1879 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1879[var3] = arg1.field1879[var3];
            }
        }
        this.field1879[4] = class283.field3324;
        this.field1883 = 0;
    }

    @ObfuscatedName("ff.e(Lff;Lff;I)V")
    public void method3023(class170 arg0, class170 arg1) {
        this.field1886 = arg0.field1886;
        this.field1892 = arg0.field1892;
        this.field1893 = arg0.field1893;
        this.field1894 = arg0.field1894;
        this.field1895 = arg0.field1895;
        this.field1877 = arg0.field1877;
        this.field1897 = arg0.field1897;
        this.field1901 = arg0.field1901;
        this.field1907 = arg0.field1907;
        this.field1890 = arg0.field1890;
        this.field1891 = arg0.field1891;
        this.field1898 = arg0.field1898;
        this.field1887 = arg1.field1887;
        this.field1883 = 0;
        this.field1900 = false;
        this.field1882 = false;
    }

    @ObfuscatedName("ff.p(II)Lgk;")
    public final class206 method3076(int arg0) {
        if (this.field1918 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1917[var3] && this.field1917[var3] != 0) {
                    var2 = this.field1918[var3];
                }
            }
            if (var2 != -1) {
                return method2586(var2).method3076(1);
            }
        }
        class206 var4 = class206.method3658(Statics.field1660, this.field1886, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1912 != 128 || this.field1921 != 128 || this.field1878 != 128) {
            var4.method3705(this.field1912, this.field1921, this.field1878);
        }
        if (this.field1901 != null) {
            for (int var5 = 0; var5 < this.field1901.length; var5++) {
                var4.method3687(this.field1901[var5], this.field1907[var5]);
            }
        }
        if (this.field1890 != null) {
            for (int var6 = 0; var6 < this.field1890.length; var6++) {
                var4.method3672(this.field1890[var6], this.field1891[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ff.j(IS)Lhl;")
    public final class220 method3025(int arg0) {
        if (this.field1918 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1917[var3] && this.field1917[var3] != 0) {
                    var2 = this.field1918[var3];
                }
            }
            if (var2 != -1) {
                return method2586(var2).method3025(1);
            }
        }
        class220 var4 = (class220) field1906.method4205((long) this.field1885);
        if (var4 != null) {
            return var4;
        }
        class206 var5 = class206.method3658(Statics.field1660, this.field1886, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1912 != 128 || this.field1921 != 128 || this.field1878 != 128) {
            var5.method3705(this.field1912, this.field1921, this.field1878);
        }
        if (this.field1901 != null) {
            for (int var6 = 0; var6 < this.field1901.length; var6++) {
                var5.method3687(this.field1901[var6], this.field1907[var6]);
            }
        }
        if (this.field1890 != null) {
            for (int var7 = 0; var7 < this.field1890.length; var7++) {
                var5.method3672(this.field1890[var7], this.field1891[var7]);
            }
        }
        class220 var8 = var5.method3679(this.field1902 + 64, this.field1924 + 768, -50, -10, -50);
        var8.field2570 = true;
        field1906.method4206(var8, (long) this.field1885);
        return var8;
    }

    @ObfuscatedName("ff.b(II)Lff;")
    public class170 method3026(int arg0) {
        if (this.field1918 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1917[var3] && this.field1917[var3] != 0) {
                    var2 = this.field1918[var3];
                }
            }
            if (var2 != -1) {
                return method2586(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ds.x(IIIIIZI)Low;")
    public static final class414 method2402(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class414 var8 = (class414) field1884.method4205(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class170 var9 = method2586(arg0);
        if (arg1 > 1 && var9.field1918 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1917[var11] && var9.field1917[var11] != 0) {
                    var10 = var9.field1918[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2586(var10);
            }
        }
        class220 var12 = var9.method3025(1);
        if (var12 == null) {
            return null;
        }
        class414 var13 = null;
        if (var9.field1919 != -1) {
            var13 = method2402(var9.field1915, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1929 != -1) {
            var13 = method2402(var9.field1928, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1931 != -1) {
            var13 = method2402(var9.field1930, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4366;
        int var15 = Statics.field4367;
        int var16 = Statics.field4369;
        int[] var17 = new int[4];
        class410.method6557(var17);
        class414 var18 = new class414(36, 32);
        class410.method6517(var18.field4396, 36, 32);
        class410.method6523();
        class211.method3808();
        class211.method3753(16, 16);
        class211.field2368 = false;
        if (var9.field1931 != -1) {
            var13.method6645(0, 0);
        }
        int var19 = var9.field1892;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class211.field2362[var9.field1893] * var19 >> 16;
        int var21 = class211.field2370[var9.field1893] * var19 >> 16;
        var12.method4095();
        var12.method4082(0, var9.field1894, var9.field1895, var9.field1893, var9.field1877, var9.field1897 + var12.field2444 / 2 + var20, var9.field1897 + var21);
        if (var9.field1929 != -1) {
            var13.method6645(0, 0);
        }
        if (arg2 >= 1) {
            var18.method6641(1);
        }
        if (arg2 >= 2) {
            var18.method6641(16777215);
        }
        if (arg3 != 0) {
            var18.method6642(arg3);
        }
        class410.method6517(var18.field4396, 36, 32);
        if (var9.field1919 != -1) {
            var13.method6645(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1898 == 1) {
            class315 var22 = Statics.field290;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class283.field3494 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class283.field3492 + "</col>";
            }
            var22.method5165(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1884.method4206(var18, var6);
        }
        class410.method6517(var14, var15, var16);
        class410.method6522(var17);
        class211.method3808();
        class211.field2368 = true;
        return var18;
    }

    @ObfuscatedName("ff.y(ZI)Z")
    public final boolean method3063(boolean arg0) {
        int var2 = this.field1923;
        int var3 = this.field1905;
        int var4 = this.field1910;
        if (arg0) {
            var2 = this.field1927;
            var3 = this.field1908;
            var4 = this.field1911;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1660.method4745(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1660.method4745(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1660.method4745(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ff.k(ZB)Lgk;")
    public final class206 method3079(boolean arg0) {
        int var2 = this.field1923;
        int var3 = this.field1905;
        int var4 = this.field1910;
        if (arg0) {
            var2 = this.field1927;
            var3 = this.field1908;
            var4 = this.field1911;
        }
        if (var2 == -1) {
            return null;
        }
        class206 var5 = class206.method3658(Statics.field1660, var2, 0);
        if (var3 != -1) {
            class206 var6 = class206.method3658(Statics.field1660, var3, 0);
            if (var4 == -1) {
                class206[] var9 = new class206[] { var5, var6 };
                var5 = new class206(var9, 2);
            } else {
                class206 var7 = class206.method3658(Statics.field1660, var4, 0);
                class206[] var8 = new class206[] { var5, var6, var7 };
                var5 = new class206(var8, 3);
            }
        }
        if (!arg0 && this.field1922 != 0) {
            var5.method3670(0, this.field1922, 0);
        }
        if (arg0 && this.field1909 != 0) {
            var5.method3670(0, this.field1909, 0);
        }
        if (this.field1901 != null) {
            for (int var10 = 0; var10 < this.field1901.length; var10++) {
                var5.method3687(this.field1901[var10], this.field1907[var10]);
            }
        }
        if (this.field1890 != null) {
            for (int var11 = 0; var11 < this.field1890.length; var11++) {
                var5.method3672(this.field1890[var11], this.field1891[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ff.t(ZI)Z")
    public final boolean method3024(boolean arg0) {
        int var2 = this.field1889;
        int var3 = this.field1913;
        if (arg0) {
            var2 = this.field1914;
            var3 = this.field1926;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1660.method4745(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1660.method4745(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ff.l(ZB)Lgk;")
    public final class206 method3091(boolean arg0) {
        int var2 = this.field1889;
        int var3 = this.field1913;
        if (arg0) {
            var2 = this.field1914;
            var3 = this.field1926;
        }
        if (var2 == -1) {
            return null;
        }
        class206 var4 = class206.method3658(Statics.field1660, var2, 0);
        if (var3 != -1) {
            class206 var5 = class206.method3658(Statics.field1660, var3, 0);
            class206[] var6 = new class206[] { var4, var5 };
            var4 = new class206(var6, 2);
        }
        if (this.field1901 != null) {
            for (int var7 = 0; var7 < this.field1901.length; var7++) {
                var4.method3687(this.field1901[var7], this.field1907[var7]);
            }
        }
        if (this.field1890 != null) {
            for (int var8 = 0; var8 < this.field1890.length; var8++) {
                var4.method3672(this.field1890[var8], this.field1891[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ff.u(III)I")
    public int method3030(int arg0, int arg1) {
        return class158.method2133(this.field1899, arg0, arg1);
    }

    @ObfuscatedName("ff.n(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3031(int arg0, String arg1) {
        return class158.method2887(this.field1899, arg0, arg1);
    }

    @ObfuscatedName("ff.z(I)I")
    public int method3032() {
        if (this.field1903 == -1 || this.field1879 == null) {
            return -1;
        } else if (this.field1903 >= 0) {
            return this.field1879[this.field1903] == null ? -1 : this.field1903;
        } else if (class283.field3319.equalsIgnoreCase(this.field1879[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fq.q(B)V")
    public static void method3174() {
        field1896.method4207();
        field1906.method4207();
        field1884.method4207();
    }

    @ObfuscatedName("ff.r(B)Z")
    public boolean method3050() {
        return this.field1907 != null;
    }

    @ObfuscatedName("ff.m(I)Z")
    public boolean method3029() {
        return this.field1891 != null;
    }
}
