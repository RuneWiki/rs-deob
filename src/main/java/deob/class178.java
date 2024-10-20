package deob;

@ObfuscatedName("fd")
public class class178 extends class425 {

    @ObfuscatedName("fd.x")
    public static class266 field1875 = new class266(256);

    @ObfuscatedName("fd.h")
    public final int field1890;

    @ObfuscatedName("fd.j")
    public int field1877 = -1;

    @ObfuscatedName("fd.y")
    public int field1887 = -1;

    @ObfuscatedName("fd.d")
    public String field1879;

    @ObfuscatedName("fd.n")
    public int field1884;

    @ObfuscatedName("fd.r")
    public int field1881 = 0;

    @ObfuscatedName("fd.s")
    public boolean field1880 = true;

    @ObfuscatedName("fd.p")
    public boolean field1872 = false;

    @ObfuscatedName("fd.b")
    public String[] field1885 = new String[5];

    @ObfuscatedName("fd.o")
    public String field1886;

    @ObfuscatedName("fd.u")
    public int[] field1883;

    @ObfuscatedName("fd.z")
    public int field1888 = Integer.MAX_VALUE;

    @ObfuscatedName("fd.t")
    public int field1889 = Integer.MAX_VALUE;

    @ObfuscatedName("fd.w")
    public int field1874 = Integer.MIN_VALUE;

    @ObfuscatedName("fd.m")
    public int field1891 = Integer.MIN_VALUE;

    @ObfuscatedName("fd.q")
    public class184 field1892 = class184.field1953;

    @ObfuscatedName("fd.i")
    public class186 field1893 = class186.field2002;

    @ObfuscatedName("fd.e")
    public int[] field1894;

    @ObfuscatedName("fd.g")
    public byte[] field1895;

    @ObfuscatedName("fd.k")
    public int field1896 = -1;

    public class178(int arg0) {
        this.field1890 = arg0;
    }

    @ObfuscatedName("cl.a(II)Lfd;")
    public static class178 method2234(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1873.length || Statics.field1873[arg0] == null ? new class178(arg0) : Statics.field1873[arg0];
    }

    @ObfuscatedName("fd.f(Lqr;I)V")
    public void method3132(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3146(arg0, var2);
        }
    }

    @ObfuscatedName("fd.c(Lqr;II)V")
    public void method3146(class464 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1877 = arg0.method7734();
        } else if (arg1 == 2) {
            this.field1887 = arg0.method7734();
        } else if (arg1 == 3) {
            this.field1879 = arg0.method7725();
        } else if (arg1 == 4) {
            this.field1884 = arg0.method7906();
        } else if (arg1 == 5) {
            arg0.method7906();
        } else if (arg1 == 6) {
            this.field1881 = arg0.method7735();
        } else if (arg1 == 7) {
            int var3 = arg0.method7735();
            if ((var3 & 0x1) == 0) {
                this.field1880 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1872 = true;
            }
        } else if (arg1 == 8) {
            arg0.method7735();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1885[arg1 - 10] = arg0.method7725();
        } else if (arg1 == 15) {
            int var4 = arg0.method7735();
            this.field1883 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1883[var5] = arg0.method7798();
            }
            arg0.method7720();
            int var6 = arg0.method7735();
            this.field1894 = new int[var6];
            for (int var7 = 0; var7 < this.field1894.length; var7++) {
                this.field1894[var7] = arg0.method7720();
            }
            this.field1895 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1895[var8] = arg0.method7881();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1886 = arg0.method7725();
            } else if (arg1 == 18) {
                arg0.method7734();
            } else if (arg1 == 19) {
                this.field1896 = arg0.method7716();
            } else if (arg1 == 21) {
                arg0.method7720();
            } else if (arg1 == 22) {
                arg0.method7720();
            } else if (arg1 == 23) {
                arg0.method7735();
                arg0.method7735();
                arg0.method7735();
            } else if (arg1 == 24) {
                arg0.method7798();
                arg0.method7798();
            } else if (arg1 == 25) {
                arg0.method7734();
            } else if (arg1 == 28) {
                arg0.method7735();
            } else if (arg1 == 29) {
                this.field1892 = (class184) class344.method4292(class184.method2452(), arg0.method7735());
            } else if (arg1 == 30) {
                this.field1893 = (class186) class344.method4292(class186.method2694(), arg0.method7735());
            }
        }
    }

    @ObfuscatedName("fd.x(I)V")
    public void method3130() {
        if (this.field1883 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1883.length; var1 += 2) {
            if (this.field1883[var1] < this.field1888) {
                this.field1888 = this.field1883[var1];
            } else if (this.field1883[var1] > this.field1874) {
                this.field1874 = this.field1883[var1];
            }
            if (this.field1883[var1 + 1] < this.field1889) {
                this.field1889 = this.field1883[var1 + 1];
            } else if (this.field1883[var1 + 1] > this.field1891) {
                this.field1891 = this.field1883[var1 + 1];
            }
        }
    }

    @ObfuscatedName("fd.h(ZI)Lri;")
    public class477 method3127(boolean arg0) {
        int var2 = arg0 ? this.field1887 : this.field1877;
        return this.method3128(var2);
    }

    @ObfuscatedName("fd.j(II)Lri;")
    public class477 method3128(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class477 var2 = (class477) field1875.method4839((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class477 var3 = class478.method6659(Statics.field1876, arg0, 0);
        if (var3 != null) {
            field1875.method4834(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("fd.y(I)I")
    public int method3129() {
        return this.field1890;
    }

    @ObfuscatedName("br.d(I)V")
    public static void method1771() {
        field1875.method4837();
    }
}
