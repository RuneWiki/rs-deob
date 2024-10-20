package deob;

@ObfuscatedName("fm")
public class class179 extends class428 {

    @ObfuscatedName("fm.x")
    public static class269 field1929 = new class269(256);

    @ObfuscatedName("fm.m")
    public final int field1930;

    @ObfuscatedName("fm.q")
    public int field1926 = -1;

    @ObfuscatedName("fm.f")
    public int field1935 = -1;

    @ObfuscatedName("fm.r")
    public String field1933;

    @ObfuscatedName("fm.u")
    public int field1948;

    @ObfuscatedName("fm.b")
    public int field1936 = 0;

    @ObfuscatedName("fm.g")
    public boolean field1937 = true;

    @ObfuscatedName("fm.i")
    public boolean field1941 = false;

    @ObfuscatedName("fm.o")
    public String[] field1939 = new String[5];

    @ObfuscatedName("fm.n")
    public String field1940;

    @ObfuscatedName("fm.k")
    public int[] field1934;

    @ObfuscatedName("fm.a")
    public int field1942 = Integer.MAX_VALUE;

    @ObfuscatedName("fm.s")
    public int field1943 = Integer.MAX_VALUE;

    @ObfuscatedName("fm.l")
    public int field1944 = Integer.MIN_VALUE;

    @ObfuscatedName("fm.t")
    public int field1938 = Integer.MIN_VALUE;

    @ObfuscatedName("fm.c")
    public class185 field1932 = class185.field2008;

    @ObfuscatedName("fm.p")
    public class188 field1947 = class188.field2071;

    @ObfuscatedName("fm.d")
    public int[] field1931;

    @ObfuscatedName("fm.y")
    public byte[] field1949;

    @ObfuscatedName("fm.z")
    public int field1950 = -1;

    public class179(int arg0) {
        this.field1930 = arg0;
    }

    @ObfuscatedName("fg.h(II)Lfm;")
    public static class179 method3153(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1927.length || Statics.field1927[arg0] == null ? new class179(arg0) : Statics.field1927[arg0];
    }

    @ObfuscatedName("fm.e(Lqy;B)V")
    public void method3211(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3212(arg0, var2);
        }
    }

    @ObfuscatedName("fm.v(Lqy;IB)V")
    public void method3212(class467 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1926 = arg0.method7810();
        } else if (arg1 == 2) {
            this.field1935 = arg0.method7810();
        } else if (arg1 == 3) {
            this.field1933 = arg0.method7801();
        } else if (arg1 == 4) {
            this.field1948 = arg0.method7796();
        } else if (arg1 == 5) {
            arg0.method7796();
        } else if (arg1 == 6) {
            this.field1936 = arg0.method7792();
        } else if (arg1 == 7) {
            int var3 = arg0.method7792();
            if ((var3 & 0x1) == 0) {
                this.field1937 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1941 = true;
            }
        } else if (arg1 == 8) {
            arg0.method7792();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1939[arg1 - 10] = arg0.method7801();
        } else if (arg1 == 15) {
            int var4 = arg0.method7792();
            this.field1934 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1934[var5] = arg0.method7795();
            }
            arg0.method7946();
            int var6 = arg0.method7792();
            this.field1931 = new int[var6];
            for (int var7 = 0; var7 < this.field1931.length; var7++) {
                this.field1931[var7] = arg0.method7946();
            }
            this.field1949 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1949[var8] = arg0.method7793();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1940 = arg0.method7801();
            } else if (arg1 == 18) {
                arg0.method7810();
            } else if (arg1 == 19) {
                this.field1950 = arg0.method7794();
            } else if (arg1 == 21) {
                arg0.method7946();
            } else if (arg1 == 22) {
                arg0.method7946();
            } else if (arg1 == 23) {
                arg0.method7792();
                arg0.method7792();
                arg0.method7792();
            } else if (arg1 == 24) {
                arg0.method7795();
                arg0.method7795();
            } else if (arg1 == 25) {
                arg0.method7810();
            } else if (arg1 == 28) {
                arg0.method7792();
            } else if (arg1 == 29) {
                class185[] var9 = new class185[] { class185.field2011, class185.field2008, class185.field2009 };
                this.field1932 = (class185) class347.method1688(var9, arg0.method7792());
            } else if (arg1 == 30) {
                class188[] var10 = new class188[] { class188.field2074, class188.field2073, class188.field2071 };
                this.field1947 = (class188) class347.method1688(var10, arg0.method7792());
            }
        }
    }

    @ObfuscatedName("fm.x(I)V")
    public void method3213() {
        if (this.field1934 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1934.length; var1 += 2) {
            if (this.field1934[var1] < this.field1942) {
                this.field1942 = this.field1934[var1];
            } else if (this.field1934[var1] > this.field1944) {
                this.field1944 = this.field1934[var1];
            }
            if (this.field1934[var1 + 1] < this.field1943) {
                this.field1943 = this.field1934[var1 + 1];
            } else if (this.field1934[var1 + 1] > this.field1938) {
                this.field1938 = this.field1934[var1 + 1];
            }
        }
    }

    @ObfuscatedName("fm.m(ZI)Lrx;")
    public class481 method3214(boolean arg0) {
        int var2 = arg0 ? this.field1935 : this.field1926;
        return this.method3215(var2);
    }

    @ObfuscatedName("fm.q(II)Lrx;")
    public class481 method3215(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class481 var2 = (class481) field1929.method4917((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class481 var3 = Statics.method2794(Statics.field1946, arg0, 0);
        if (var3 != null) {
            field1929.method4925(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("fm.f(B)I")
    public int method3216() {
        return this.field1930;
    }
}
