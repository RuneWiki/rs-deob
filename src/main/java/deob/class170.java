package deob;

@ObfuscatedName("fy")
public class class170 extends class364 {

    @ObfuscatedName("fy.e")
    public static class236 field1878 = new class236(64);

    @ObfuscatedName("fy.l")
    public static class236 field1879 = new class236(50);

    @ObfuscatedName("fy.y")
    public static class236 field1880 = new class236(200);

    @ObfuscatedName("fy.f")
    public int field1881;

    @ObfuscatedName("fy.s")
    public int field1884;

    @ObfuscatedName("fy.h")
    public String field1883 = class283.field3339;

    @ObfuscatedName("fy.d")
    public short[] field1894;

    @ObfuscatedName("fy.q")
    public short[] field1885;

    @ObfuscatedName("fy.j")
    public short[] field1882;

    @ObfuscatedName("fy.x")
    public short[] field1887;

    @ObfuscatedName("fy.b")
    public int field1916 = 2000;

    @ObfuscatedName("fy.t")
    public int field1889 = 0;

    @ObfuscatedName("fy.r")
    public int field1873 = 0;

    @ObfuscatedName("fy.p")
    public int field1891 = 0;

    @ObfuscatedName("fy.w")
    public int field1908 = 0;

    @ObfuscatedName("fy.i")
    public int field1893 = 0;

    @ObfuscatedName("fy.aq")
    public int field1926 = 0;

    @ObfuscatedName("fy.ad")
    public int field1895 = 1;

    @ObfuscatedName("fy.al")
    public boolean field1896 = false;

    @ObfuscatedName("fy.aa")
    public String[] field1927 = new String[] { null, null, class283.field3344, null, null };

    @ObfuscatedName("fy.aw")
    public String[] field1890 = new String[] { null, null, null, null, class283.field3333 };

    @ObfuscatedName("fy.as")
    public int field1877 = -2;

    @ObfuscatedName("fy.ae")
    public int field1900 = -1;

    @ObfuscatedName("fy.av")
    public int field1901 = -1;

    @ObfuscatedName("fy.ak")
    public int field1902 = 0;

    @ObfuscatedName("fy.an")
    public int field1903 = -1;

    @ObfuscatedName("fy.ab")
    public int field1904 = -1;

    @ObfuscatedName("fy.au")
    public int field1905 = 0;

    @ObfuscatedName("fy.am")
    public int field1906 = -1;

    @ObfuscatedName("fy.ao")
    public int field1907 = -1;

    @ObfuscatedName("fy.ay")
    public int field1876 = -1;

    @ObfuscatedName("fy.aj")
    public int field1923 = -1;

    @ObfuscatedName("fy.ap")
    public int field1910 = -1;

    @ObfuscatedName("fy.ai")
    public int field1911 = -1;

    @ObfuscatedName("fy.ac")
    public int[] field1912;

    @ObfuscatedName("fy.ag")
    public int[] field1913;

    @ObfuscatedName("fy.ar")
    public int field1914 = -1;

    @ObfuscatedName("fy.az")
    public int field1915 = -1;

    @ObfuscatedName("fy.ah")
    public int field1898 = 128;

    @ObfuscatedName("fy.af")
    public int field1888 = 128;

    @ObfuscatedName("fy.ax")
    public int field1918 = 128;

    @ObfuscatedName("fy.bd")
    public int field1897 = 0;

    @ObfuscatedName("fy.bt")
    public int field1920 = 0;

    @ObfuscatedName("fy.bf")
    public int field1921 = 0;

    @ObfuscatedName("fy.bp")
    public class378 field1922;

    @ObfuscatedName("fy.bl")
    public boolean field1909 = false;

    @ObfuscatedName("fy.bc")
    public int field1917 = -1;

    @ObfuscatedName("fy.br")
    public int field1925 = -1;

    @ObfuscatedName("fy.bw")
    public int field1886 = -1;

    @ObfuscatedName("fy.bh")
    public int field1892 = -1;

    @ObfuscatedName("df.n(Lkk;Lkk;ZLlu;B)V")
    public static void method2319(class290 arg0, class290 arg1, boolean arg2, class315 arg3) {
        Statics.field3194 = arg0;
        Statics.field4252 = arg1;
        Statics.field3200 = arg2;
        Statics.field1919 = Statics.field3194.method4720(10);
        Statics.field3781 = arg3;
    }

    @ObfuscatedName("bn.c(IB)Lfy;")
    public static class170 method1776(int arg0) {
        class170 var1 = (class170) field1878.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3194.method4710(10, arg0);
        class170 var3 = new class170();
        var3.field1881 = arg0;
        if (var2 != null) {
            var3.method2935(new class400(var2));
        }
        var3.method2936();
        if (var3.field1915 != -1) {
            var3.method2950(method1776(var3.field1915), method1776(var3.field1914));
        }
        if (var3.field1925 != -1) {
            var3.method2938(method1776(var3.field1925), method1776(var3.field1917));
        }
        if (var3.field1892 != -1) {
            var3.method2939(method1776(var3.field1892), method1776(var3.field1886));
        }
        if (!Statics.field3200 && var3.field1896) {
            var3.field1883 = class283.field3624;
            var3.field1909 = false;
            for (int var4 = 0; var4 < var3.field1927.length; var4++) {
                var3.field1927[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field1890.length; var5++) {
                if (var5 != 4) {
                    var3.field1890[var5] = null;
                }
            }
            var3.field1877 = -2;
            var3.field1921 = 0;
            if (var3.field1922 != null) {
                boolean var6 = false;
                for (class369 var7 = var3.field1922.method6001(); var7 != null; var7 = var3.field1922.method5999()) {
                    class166 var8 = class166.method3159((int) var7.field4056);
                    if (var8.field1790) {
                        var7.method5732();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field1922 = null;
                }
            }
        }
        field1878.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fy.m(B)V")
    public void method2936() {
    }

    @ObfuscatedName("fy.k(Lot;B)V")
    public void method2935(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2998(arg0, var2);
        }
    }

    @ObfuscatedName("fy.o(Lot;II)V")
    public void method2998(class400 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1884 = arg0.method6219();
        } else if (arg1 == 2) {
            this.field1883 = arg0.method6226();
        } else if (arg1 == 4) {
            this.field1916 = arg0.method6219();
        } else if (arg1 == 5) {
            this.field1889 = arg0.method6219();
        } else if (arg1 == 6) {
            this.field1873 = arg0.method6219();
        } else if (arg1 == 7) {
            this.field1908 = arg0.method6219();
            if (this.field1908 > 32767) {
                this.field1908 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1893 = arg0.method6219();
            if (this.field1893 > 32767) {
                this.field1893 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method6226();
        } else if (arg1 == 11) {
            this.field1926 = 1;
        } else if (arg1 == 12) {
            this.field1895 = arg0.method6222();
        } else if (arg1 == 16) {
            this.field1896 = true;
        } else if (arg1 == 23) {
            this.field1900 = arg0.method6219();
            this.field1902 = arg0.method6217();
        } else if (arg1 == 24) {
            this.field1901 = arg0.method6219();
        } else if (arg1 == 25) {
            this.field1903 = arg0.method6219();
            this.field1905 = arg0.method6217();
        } else if (arg1 == 26) {
            this.field1904 = arg0.method6219();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1927[arg1 - 30] = arg0.method6226();
            if (this.field1927[arg1 - 30].equalsIgnoreCase(class283.field3403)) {
                this.field1927[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1890[arg1 - 35] = arg0.method6226();
        } else if (arg1 == 40) {
            int var3 = arg0.method6217();
            this.field1894 = new short[var3];
            this.field1885 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1894[var4] = (short) arg0.method6219();
                this.field1885[var4] = (short) arg0.method6219();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6217();
            this.field1882 = new short[var5];
            this.field1887 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1882[var6] = (short) arg0.method6219();
                this.field1887[var6] = (short) arg0.method6219();
            }
        } else if (arg1 == 42) {
            this.field1877 = arg0.method6218();
        } else if (arg1 == 65) {
            this.field1909 = true;
        } else if (arg1 == 78) {
            this.field1906 = arg0.method6219();
        } else if (arg1 == 79) {
            this.field1907 = arg0.method6219();
        } else if (arg1 == 90) {
            this.field1876 = arg0.method6219();
        } else if (arg1 == 91) {
            this.field1910 = arg0.method6219();
        } else if (arg1 == 92) {
            this.field1923 = arg0.method6219();
        } else if (arg1 == 93) {
            this.field1911 = arg0.method6219();
        } else if (arg1 == 94) {
            arg0.method6219();
        } else if (arg1 == 95) {
            this.field1891 = arg0.method6219();
        } else if (arg1 == 97) {
            this.field1914 = arg0.method6219();
        } else if (arg1 == 98) {
            this.field1915 = arg0.method6219();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1912 == null) {
                this.field1912 = new int[10];
                this.field1913 = new int[10];
            }
            this.field1912[arg1 - 100] = arg0.method6219();
            this.field1913[arg1 - 100] = arg0.method6219();
        } else if (arg1 == 110) {
            this.field1898 = arg0.method6219();
        } else if (arg1 == 111) {
            this.field1888 = arg0.method6219();
        } else if (arg1 == 112) {
            this.field1918 = arg0.method6219();
        } else if (arg1 == 113) {
            this.field1897 = arg0.method6218();
        } else if (arg1 == 114) {
            this.field1920 = arg0.method6218() * 5;
        } else if (arg1 == 115) {
            this.field1921 = arg0.method6217();
        } else if (arg1 == 139) {
            this.field1917 = arg0.method6219();
        } else if (arg1 == 140) {
            this.field1925 = arg0.method6219();
        } else if (arg1 == 148) {
            this.field1886 = arg0.method6219();
        } else if (arg1 == 149) {
            this.field1892 = arg0.method6219();
        } else if (arg1 == 249) {
            this.field1922 = class158.method2378(arg0, this.field1922);
        }
    }

    @ObfuscatedName("fy.g(Lfy;Lfy;B)V")
    public void method2950(class170 arg0, class170 arg1) {
        this.field1884 = arg0.field1884;
        this.field1916 = arg0.field1916;
        this.field1889 = arg0.field1889;
        this.field1873 = arg0.field1873;
        this.field1891 = arg0.field1891;
        this.field1908 = arg0.field1908;
        this.field1893 = arg0.field1893;
        this.field1894 = arg0.field1894;
        this.field1885 = arg0.field1885;
        this.field1882 = arg0.field1882;
        this.field1887 = arg0.field1887;
        this.field1883 = arg1.field1883;
        this.field1896 = arg1.field1896;
        this.field1895 = arg1.field1895;
        this.field1926 = 1;
    }

    @ObfuscatedName("fy.z(Lfy;Lfy;B)V")
    public void method2938(class170 arg0, class170 arg1) {
        this.field1884 = arg0.field1884;
        this.field1916 = arg0.field1916;
        this.field1889 = arg0.field1889;
        this.field1873 = arg0.field1873;
        this.field1891 = arg0.field1891;
        this.field1908 = arg0.field1908;
        this.field1893 = arg0.field1893;
        this.field1894 = arg1.field1894;
        this.field1885 = arg1.field1885;
        this.field1882 = arg1.field1882;
        this.field1887 = arg1.field1887;
        this.field1883 = arg1.field1883;
        this.field1896 = arg1.field1896;
        this.field1926 = arg1.field1926;
        this.field1900 = arg1.field1900;
        this.field1901 = arg1.field1901;
        this.field1906 = arg1.field1906;
        this.field1903 = arg1.field1903;
        this.field1904 = arg1.field1904;
        this.field1907 = arg1.field1907;
        this.field1876 = arg1.field1876;
        this.field1923 = arg1.field1923;
        this.field1910 = arg1.field1910;
        this.field1911 = arg1.field1911;
        this.field1921 = arg1.field1921;
        this.field1927 = arg1.field1927;
        this.field1890 = new String[5];
        if (arg1.field1890 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1890[var3] = arg1.field1890[var3];
            }
        }
        this.field1890[4] = class283.field3338;
        this.field1895 = 0;
    }

    @ObfuscatedName("fy.a(Lfy;Lfy;B)V")
    public void method2939(class170 arg0, class170 arg1) {
        this.field1884 = arg0.field1884;
        this.field1916 = arg0.field1916;
        this.field1889 = arg0.field1889;
        this.field1873 = arg0.field1873;
        this.field1891 = arg0.field1891;
        this.field1908 = arg0.field1908;
        this.field1893 = arg0.field1893;
        this.field1894 = arg0.field1894;
        this.field1885 = arg0.field1885;
        this.field1882 = arg0.field1882;
        this.field1887 = arg0.field1887;
        this.field1926 = arg0.field1926;
        this.field1883 = arg1.field1883;
        this.field1895 = 0;
        this.field1896 = false;
        this.field1909 = false;
    }

    @ObfuscatedName("fy.u(II)Lgl;")
    public final class206 method2940(int arg0) {
        if (this.field1912 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1913[var3] && this.field1913[var3] != 0) {
                    var2 = this.field1912[var3];
                }
            }
            if (var2 != -1) {
                return method1776(var2).method2940(1);
            }
        }
        class206 var4 = class206.method3631(Statics.field4252, this.field1884, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1898 != 128 || this.field1888 != 128 || this.field1918 != 128) {
            var4.method3622(this.field1898, this.field1888, this.field1918);
        }
        if (this.field1894 != null) {
            for (int var5 = 0; var5 < this.field1894.length; var5++) {
                var4.method3673(this.field1894[var5], this.field1885[var5]);
            }
        }
        if (this.field1882 != null) {
            for (int var6 = 0; var6 < this.field1882.length; var6++) {
                var4.method3620(this.field1882[var6], this.field1887[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fy.e(II)Lhg;")
    public final class220 method2941(int arg0) {
        if (this.field1912 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1913[var3] && this.field1913[var3] != 0) {
                    var2 = this.field1912[var3];
                }
            }
            if (var2 != -1) {
                return method1776(var2).method2941(1);
            }
        }
        class220 var4 = (class220) field1879.method4167((long) this.field1881);
        if (var4 != null) {
            return var4;
        }
        class206 var5 = class206.method3631(Statics.field4252, this.field1884, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1898 != 128 || this.field1888 != 128 || this.field1918 != 128) {
            var5.method3622(this.field1898, this.field1888, this.field1918);
        }
        if (this.field1894 != null) {
            for (int var6 = 0; var6 < this.field1894.length; var6++) {
                var5.method3673(this.field1894[var6], this.field1885[var6]);
            }
        }
        if (this.field1882 != null) {
            for (int var7 = 0; var7 < this.field1882.length; var7++) {
                var5.method3620(this.field1882[var7], this.field1887[var7]);
            }
        }
        class220 var8 = var5.method3627(this.field1897 + 64, this.field1920 + 768, -50, -10, -50);
        var8.field2520 = true;
        field1879.method4169(var8, (long) this.field1881);
        return var8;
    }

    @ObfuscatedName("fy.l(II)Lfy;")
    public class170 method2942(int arg0) {
        if (this.field1912 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1913[var3] && this.field1913[var3] != 0) {
                    var2 = this.field1912[var3];
                }
            }
            if (var2 != -1) {
                return method1776(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cp.v(II)Ljava/lang/String;")
    public static final String method2135(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class283.field3508 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class283.field3506 + "</col>";
        }
    }

    @ObfuscatedName("fy.f(ZI)Z")
    public final boolean method2943(boolean arg0) {
        int var2 = this.field1900;
        int var3 = this.field1901;
        int var4 = this.field1906;
        if (arg0) {
            var2 = this.field1903;
            var3 = this.field1904;
            var4 = this.field1907;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field4252.method4735(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field4252.method4735(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field4252.method4735(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("fy.s(ZI)Lgl;")
    public final class206 method2995(boolean arg0) {
        int var2 = this.field1900;
        int var3 = this.field1901;
        int var4 = this.field1906;
        if (arg0) {
            var2 = this.field1903;
            var3 = this.field1904;
            var4 = this.field1907;
        }
        if (var2 == -1) {
            return null;
        }
        class206 var5 = class206.method3631(Statics.field4252, var2, 0);
        if (var3 != -1) {
            class206 var6 = class206.method3631(Statics.field4252, var3, 0);
            if (var4 == -1) {
                class206[] var9 = new class206[] { var5, var6 };
                var5 = new class206(var9, 2);
            } else {
                class206 var7 = class206.method3631(Statics.field4252, var4, 0);
                class206[] var8 = new class206[] { var5, var6, var7 };
                var5 = new class206(var8, 3);
            }
        }
        if (!arg0 && this.field1902 != 0) {
            var5.method3610(0, this.field1902, 0);
        }
        if (arg0 && this.field1905 != 0) {
            var5.method3610(0, this.field1905, 0);
        }
        if (this.field1894 != null) {
            for (int var10 = 0; var10 < this.field1894.length; var10++) {
                var5.method3673(this.field1894[var10], this.field1885[var10]);
            }
        }
        if (this.field1882 != null) {
            for (int var11 = 0; var11 < this.field1882.length; var11++) {
                var5.method3620(this.field1882[var11], this.field1887[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("fy.h(ZI)Z")
    public final boolean method2945(boolean arg0) {
        int var2 = this.field1876;
        int var3 = this.field1923;
        if (arg0) {
            var2 = this.field1910;
            var3 = this.field1911;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field4252.method4735(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field4252.method4735(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("fy.d(ZB)Lgl;")
    public final class206 method3013(boolean arg0) {
        int var2 = this.field1876;
        int var3 = this.field1923;
        if (arg0) {
            var2 = this.field1910;
            var3 = this.field1911;
        }
        if (var2 == -1) {
            return null;
        }
        class206 var4 = class206.method3631(Statics.field4252, var2, 0);
        if (var3 != -1) {
            class206 var5 = class206.method3631(Statics.field4252, var3, 0);
            class206[] var6 = new class206[] { var4, var5 };
            var4 = new class206(var6, 2);
        }
        if (this.field1894 != null) {
            for (int var7 = 0; var7 < this.field1894.length; var7++) {
                var4.method3673(this.field1894[var7], this.field1885[var7]);
            }
        }
        if (this.field1882 != null) {
            for (int var8 = 0; var8 < this.field1882.length; var8++) {
                var4.method3620(this.field1882[var8], this.field1887[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fy.q(III)I")
    public int method2947(int arg0, int arg1) {
        class378 var3 = this.field1922;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class368 var5 = (class368) var3.method5996((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4054;
            }
        }
        return var4;
    }

    @ObfuscatedName("fy.j(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3001(int arg0, String arg1) {
        return class158.method2382(this.field1922, arg0, arg1);
    }

    @ObfuscatedName("fy.x(I)I")
    public int method2948() {
        if (this.field1877 == -1 || this.field1890 == null) {
            return -1;
        } else if (this.field1877 >= 0) {
            return this.field1890[this.field1877] == null ? -1 : this.field1877;
        } else if (class283.field3333.equalsIgnoreCase(this.field1890[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("client.b(B)V")
    public static void method1237() {
        field1878.method4168();
        field1879.method4168();
        field1880.method4168();
    }

    @ObfuscatedName("fy.t(I)Z")
    public boolean method2974() {
        return this.field1885 != null;
    }

    @ObfuscatedName("fy.r(B)Z")
    public boolean method2937() {
        return this.field1887 != null;
    }
}
