package deob;

@ObfuscatedName("fn")
public class class179 extends class382 {

    @ObfuscatedName("fn.m")
    public static class249 field1934 = new class249(64);

    @ObfuscatedName("fn.t")
    public static class249 field1942 = new class249(64);

    @ObfuscatedName("fn.s")
    public static class249 field1932 = new class249(20);

    @ObfuscatedName("fn.v")
    public int field1933 = -1;

    @ObfuscatedName("fn.d")
    public int field1949 = 16777215;

    @ObfuscatedName("fn.h")
    public int field1935 = 70;

    @ObfuscatedName("fn.g")
    public int field1936 = -1;

    @ObfuscatedName("fn.e")
    public int field1937 = -1;

    @ObfuscatedName("fn.a")
    public int field1938 = -1;

    @ObfuscatedName("fn.u")
    public int field1939 = -1;

    @ObfuscatedName("fn.k")
    public int field1930 = 0;

    @ObfuscatedName("fn.f")
    public int field1941 = 0;

    @ObfuscatedName("fn.l")
    public int field1944 = -1;

    @ObfuscatedName("fn.q")
    public String field1943 = "";

    @ObfuscatedName("fn.x")
    public int field1947 = -1;

    @ObfuscatedName("fn.z")
    public int field1945 = 0;

    @ObfuscatedName("fn.i")
    public int[] field1929;

    @ObfuscatedName("fn.y")
    public int field1928 = -1;

    @ObfuscatedName("fn.ah")
    public int field1948 = -1;

    @ObfuscatedName("lu.c(Lku;Lku;Lku;B)V")
    public static void method5604(class302 arg0, class302 arg1, class302 arg2) {
        Statics.field1931 = arg0;
        Statics.field1940 = arg1;
        Statics.field1927 = arg2;
    }

    @ObfuscatedName("dt.b(IB)Lfn;")
    public static class179 method2431(int arg0) {
        class179 var1 = (class179) field1934.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1931.method5053(32, arg0);
        class179 var3 = new class179();
        if (var2 != null) {
            var3.method3138(new class419(var2));
        }
        field1934.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fn.p(Lpi;B)V")
    public void method3138(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method3156(arg0, var2);
        }
    }

    @ObfuscatedName("fn.m(Lpi;II)V")
    public void method3156(class419 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1933 = arg0.method6708();
        } else if (arg1 == 2) {
            this.field1949 = arg0.method6674();
        } else if (arg1 == 3) {
            this.field1936 = arg0.method6708();
        } else if (arg1 == 4) {
            this.field1938 = arg0.method6708();
        } else if (arg1 == 5) {
            this.field1937 = arg0.method6708();
        } else if (arg1 == 6) {
            this.field1939 = arg0.method6708();
        } else if (arg1 == 7) {
            this.field1930 = arg0.method6673();
        } else if (arg1 == 8) {
            this.field1943 = arg0.method6681();
        } else if (arg1 == 9) {
            this.field1935 = arg0.method6672();
        } else if (arg1 == 10) {
            this.field1941 = arg0.method6673();
        } else if (arg1 == 11) {
            this.field1944 = 0;
        } else if (arg1 == 12) {
            this.field1947 = arg0.method6781();
        } else if (arg1 == 13) {
            this.field1945 = arg0.method6673();
        } else if (arg1 == 14) {
            this.field1944 = arg0.method6672();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field1928 = arg0.method6672();
            if (this.field1928 == 65535) {
                this.field1928 = -1;
            }
            this.field1948 = arg0.method6672();
            if (this.field1948 == 65535) {
                this.field1948 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method6672();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method6781();
            this.field1929 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field1929[var5] = arg0.method6672();
                if (this.field1929[var5] == 65535) {
                    this.field1929[var5] = -1;
                }
            }
            this.field1929[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("fn.t(I)Lfn;")
    public final class179 method3140() {
        int var1 = -1;
        if (this.field1928 != -1) {
            var1 = class276.method4820(this.field1928);
        } else if (this.field1948 != -1) {
            var1 = class276.field3185[this.field1948];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1929.length - 1) {
            var2 = this.field1929[var1];
        } else {
            var2 = this.field1929[this.field1929.length - 1];
        }
        return var2 == -1 ? null : method2431(var2);
    }

    @ObfuscatedName("fn.s(II)Ljava/lang/String;")
    public String method3141(int arg0) {
        String var2 = this.field1943;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class331.method5657(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("fn.j(B)Lpl;")
    public class432 method3142() {
        if (this.field1936 < 0) {
            return null;
        }
        class432 var1 = (class432) field1942.method4514((long) this.field1936);
        if (var1 != null) {
            return var1;
        }
        class432 var2 = class433.method55(Statics.field1940, this.field1936, 0);
        if (var2 != null) {
            field1942.method4515(var2, (long) this.field1936);
        }
        return var2;
    }

    @ObfuscatedName("fn.w(B)Lpl;")
    public class432 method3143() {
        if (this.field1937 < 0) {
            return null;
        }
        class432 var1 = (class432) field1942.method4514((long) this.field1937);
        if (var1 != null) {
            return var1;
        }
        class432 var2 = class433.method55(Statics.field1940, this.field1937, 0);
        if (var2 != null) {
            field1942.method4515(var2, (long) this.field1937);
        }
        return var2;
    }

    @ObfuscatedName("fn.n(I)Lpl;")
    public class432 method3144() {
        if (this.field1938 < 0) {
            return null;
        }
        class432 var1 = (class432) field1942.method4514((long) this.field1938);
        if (var1 != null) {
            return var1;
        }
        class432 var2 = class433.method55(Statics.field1940, this.field1938, 0);
        if (var2 != null) {
            field1942.method4515(var2, (long) this.field1938);
        }
        return var2;
    }

    @ObfuscatedName("fn.r(I)Lpl;")
    public class432 method3145() {
        if (this.field1939 < 0) {
            return null;
        }
        class432 var1 = (class432) field1942.method4514((long) this.field1939);
        if (var1 != null) {
            return var1;
        }
        class432 var2 = class433.method55(Statics.field1940, this.field1939, 0);
        if (var2 != null) {
            field1942.method4515(var2, (long) this.field1939);
        }
        return var2;
    }

    @ObfuscatedName("fn.o(I)Llx;")
    public class327 method3170() {
        if (this.field1933 == -1) {
            return null;
        }
        class327 var1 = (class327) field1932.method4514((long) this.field1933);
        if (var1 != null) {
            return var1;
        }
        class302 var2 = Statics.field1940;
        class302 var3 = Statics.field1927;
        int var4 = this.field1933;
        class327 var5;
        if (Statics.method2755(var2, var4, 0)) {
            byte[] var6 = var3.method5053(var4, 0);
            class327 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class327 var8 = new class327(var6, Statics.field1607, Statics.field2119, Statics.field4579, Statics.field4008, Statics.field4580, Statics.field4218);
                class433.method2406();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field1932.method4515(var5, (long) this.field1933);
        }
        return var5;
    }
}
