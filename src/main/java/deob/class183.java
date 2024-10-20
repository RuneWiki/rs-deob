package deob;

@ObfuscatedName("gk")
public class class183 extends class435 {

    @ObfuscatedName("gk.s")
    public static class273 field1936 = new class273(256);

    @ObfuscatedName("gk.z")
    public final int field1937;

    @ObfuscatedName("gk.j")
    public int field1938 = -1;

    @ObfuscatedName("gk.i")
    public int field1939 = -1;

    @ObfuscatedName("gk.n")
    public String field1935;

    @ObfuscatedName("gk.l")
    public int field1941;

    @ObfuscatedName("gk.k")
    public int field1942 = 0;

    @ObfuscatedName("gk.r")
    public boolean field1943 = true;

    @ObfuscatedName("gk.b")
    public boolean field1954 = false;

    @ObfuscatedName("gk.m")
    public String[] field1945 = new String[5];

    @ObfuscatedName("gk.t")
    public String field1946;

    @ObfuscatedName("gk.h")
    public int[] field1947;

    @ObfuscatedName("gk.p")
    public int field1948 = Integer.MAX_VALUE;

    @ObfuscatedName("gk.o")
    public int field1949 = Integer.MAX_VALUE;

    @ObfuscatedName("gk.u")
    public int field1940 = Integer.MIN_VALUE;

    @ObfuscatedName("gk.x")
    public int field1951 = Integer.MIN_VALUE;

    @ObfuscatedName("gk.a")
    public class189 field1952 = class189.field2012;

    @ObfuscatedName("gk.q")
    public class192 field1953 = class192.field2073;

    @ObfuscatedName("gk.d")
    public int[] field1955;

    @ObfuscatedName("gk.e")
    public byte[] field1957;

    @ObfuscatedName("gk.g")
    public int field1956 = -1;

    public class183(int arg0) {
        this.field1937 = arg0;
    }

    @ObfuscatedName("ch.f(Lln;Lln;I)Z")
    public static boolean method2233(class337 arg0, class337 arg1) {
        Statics.field1950 = arg1;
        if (!arg0.method6034()) {
            return false;
        }
        Statics.field4358 = arg0.method5982(35);
        Statics.field4273 = new class183[Statics.field4358];
        for (int var2 = 0; var2 < Statics.field4358; var2++) {
            byte[] var3 = arg0.method5990(35, var2);
            Statics.field4273[var2] = new class183(var2);
            if (var3 != null) {
                Statics.field4273[var2].method3303(new class474(var3));
                Statics.field4273[var2].method3305();
            }
        }
        return true;
    }

    @ObfuscatedName("z.w(II)Lgk;")
    public static class183 method18(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field4273.length || Statics.field4273[arg0] == null ? new class183(arg0) : Statics.field4273[arg0];
    }

    @ObfuscatedName("gk.v(Lrd;I)V")
    public void method3303(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3326(arg0, var2);
        }
    }

    @ObfuscatedName("gk.s(Lrd;II)V")
    public void method3326(class474 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1938 = arg0.method8029();
        } else if (arg1 == 2) {
            this.field1939 = arg0.method8029();
        } else if (arg1 == 3) {
            this.field1935 = arg0.method7983();
        } else if (arg1 == 4) {
            this.field1941 = arg0.method8132();
        } else if (arg1 == 5) {
            arg0.method8132();
        } else if (arg1 == 6) {
            this.field1942 = arg0.method7964();
        } else if (arg1 == 7) {
            int var3 = arg0.method7964();
            if ((var3 & 0x1) == 0) {
                this.field1943 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1954 = true;
            }
        } else if (arg1 == 8) {
            arg0.method7964();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1945[arg1 - 10] = arg0.method7983();
        } else if (arg1 == 15) {
            int var4 = arg0.method7964();
            this.field1947 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1947[var5] = arg0.method7967();
            }
            arg0.method7979();
            int var6 = arg0.method7964();
            this.field1955 = new int[var6];
            for (int var7 = 0; var7 < this.field1955.length; var7++) {
                this.field1955[var7] = arg0.method7979();
            }
            this.field1957 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1957[var8] = arg0.method7965();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1946 = arg0.method7983();
            } else if (arg1 == 18) {
                arg0.method8029();
            } else if (arg1 == 19) {
                this.field1956 = arg0.method8032();
            } else if (arg1 == 21) {
                arg0.method7979();
            } else if (arg1 == 22) {
                arg0.method7979();
            } else if (arg1 == 23) {
                arg0.method7964();
                arg0.method7964();
                arg0.method7964();
            } else if (arg1 == 24) {
                arg0.method7967();
                arg0.method7967();
            } else if (arg1 == 25) {
                arg0.method8029();
            } else if (arg1 == 28) {
                arg0.method7964();
            } else if (arg1 == 29) {
                class189[] var9 = new class189[] { class189.field2016, class189.field2013, class189.field2012 };
                this.field1952 = (class189) class351.method19(var9, arg0.method7964());
            } else if (arg1 == 30) {
                class192[] var10 = new class192[] { class192.field2079, class192.field2075, class192.field2073 };
                this.field1953 = (class192) class351.method19(var10, arg0.method7964());
            }
        }
    }

    @ObfuscatedName("gk.z(I)V")
    public void method3305() {
        if (this.field1947 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1947.length; var1 += 2) {
            if (this.field1947[var1] < this.field1948) {
                this.field1948 = this.field1947[var1];
            } else if (this.field1947[var1] > this.field1940) {
                this.field1940 = this.field1947[var1];
            }
            if (this.field1947[var1 + 1] < this.field1949) {
                this.field1949 = this.field1947[var1 + 1];
            } else if (this.field1947[var1 + 1] > this.field1951) {
                this.field1951 = this.field1947[var1 + 1];
            }
        }
    }

    @ObfuscatedName("gk.j(ZI)Lrs;")
    public class488 method3318(boolean arg0) {
        int var2 = arg0 ? this.field1939 : this.field1938;
        return this.method3307(var2);
    }

    @ObfuscatedName("gk.i(IB)Lrs;")
    public class488 method3307(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class488 var2 = (class488) field1936.method5028((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class488 var3 = class489.method8225(Statics.field1950, arg0, 0);
        if (var3 != null) {
            field1936.method5027(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("gk.n(I)I")
    public int method3308() {
        return this.field1937;
    }

    @ObfuscatedName("ch.l(I)V")
    public static void method2235() {
        field1936.method5033();
    }
}
