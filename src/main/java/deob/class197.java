package deob;

@ObfuscatedName("gi")
public class class197 extends class130 {

    @ObfuscatedName("gi.g")
    public static class125 field2870 = new class125(64);

    @ObfuscatedName("gi.h")
    public static class125 field2871 = new class125(64);

    @ObfuscatedName("gi.v")
    public static class125 field2872 = new class125(20);

    @ObfuscatedName("gi.y")
    public int field2874 = -1;

    @ObfuscatedName("gi.j")
    public int field2875 = 16777215;

    @ObfuscatedName("gi.f")
    public int field2876 = 70;

    @ObfuscatedName("gi.p")
    public int field2877 = -1;

    @ObfuscatedName("gi.i")
    public int field2869 = -1;

    @ObfuscatedName("gi.s")
    public int field2879 = -1;

    @ObfuscatedName("gi.x")
    public int field2880 = -1;

    @ObfuscatedName("gi.d")
    public int field2881 = 0;

    @ObfuscatedName("gi.w")
    public int field2883 = 0;

    @ObfuscatedName("gi.n")
    public int field2886 = -1;

    @ObfuscatedName("gi.q")
    public String field2884 = "";

    @ObfuscatedName("gi.t")
    public int field2885 = -1;

    @ObfuscatedName("gi.r")
    public int field2868 = 0;

    @ObfuscatedName("gi.a")
    public int[] field2878;

    @ObfuscatedName("gi.e")
    public int field2888 = -1;

    @ObfuscatedName("gi.am")
    public int field2887 = -1;

    @ObfuscatedName("gl.o(Lgl;Lgl;Lgl;I)V")
    public static void method3062(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field2867 = arg0;
        Statics.field2882 = arg1;
        Statics.field2890 = arg2;
    }

    @ObfuscatedName("fe.m(II)Lgi;")
    public static class197 method2869(int arg0) {
        class197 var1 = (class197) field2870.method2130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2867.method3012(32, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3278(new class154(var2));
        }
        field2870.method2132(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gi.b(Lez;I)V")
    public void method3278(class154 arg0) {
        while (true) {
            int var2 = arg0.method2552();
            if (var2 == 0) {
                return;
            }
            this.method3284(arg0, var2);
        }
    }

    @ObfuscatedName("gi.g(Lez;IB)V")
    public void method3284(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2874 = arg0.method2567();
        } else if (arg1 == 2) {
            this.field2875 = arg0.method2556();
        } else if (arg1 == 3) {
            this.field2877 = arg0.method2567();
        } else if (arg1 == 4) {
            this.field2879 = arg0.method2567();
        } else if (arg1 == 5) {
            this.field2869 = arg0.method2567();
        } else if (arg1 == 6) {
            this.field2880 = arg0.method2567();
        } else if (arg1 == 7) {
            this.field2881 = arg0.method2555();
        } else if (arg1 == 8) {
            this.field2884 = arg0.method2561();
        } else if (arg1 == 9) {
            this.field2876 = arg0.method2554();
        } else if (arg1 == 10) {
            this.field2883 = arg0.method2555();
        } else if (arg1 == 11) {
            this.field2886 = 0;
        } else if (arg1 == 12) {
            this.field2885 = arg0.method2552();
        } else if (arg1 == 13) {
            this.field2868 = arg0.method2555();
        } else if (arg1 == 14) {
            this.field2886 = arg0.method2554();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2888 = arg0.method2554();
            if (this.field2888 == 65535) {
                this.field2888 = -1;
            }
            this.field2887 = arg0.method2554();
            if (this.field2887 == 65535) {
                this.field2887 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2554();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2552();
            this.field2878 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2878[var5] = arg0.method2554();
                if (this.field2878[var5] == 65535) {
                    this.field2878[var5] = -1;
                }
            }
            this.field2878[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gi.l(I)Lgi;")
    public final class197 method3292() {
        int var1 = -1;
        if (this.field2888 != -1) {
            var1 = class166.method162(this.field2888);
        } else if (this.field2887 != -1) {
            var1 = class166.field2174[this.field2887];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2878.length - 1) {
            var2 = this.field2878[var1];
        } else {
            var2 = this.field2878[this.field2878.length - 1];
        }
        return var2 == -1 ? null : method2869(var2);
    }

    @ObfuscatedName("gi.c(IB)Ljava/lang/String;")
    public String method3279(int arg0) {
        String var2 = this.field2884;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class208.method3212(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gi.u(B)Lhm;")
    public class225 method3280() {
        if (this.field2877 < 0) {
            return null;
        }
        class225 var1 = (class225) field2871.method2130((long) this.field2877);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2535(Statics.field2882, this.field2877, 0);
        if (var2 != null) {
            field2871.method2132(var2, (long) this.field2877);
        }
        return var2;
    }

    @ObfuscatedName("gi.k(I)Lhm;")
    public class225 method3302() {
        if (this.field2869 < 0) {
            return null;
        }
        class225 var1 = (class225) field2871.method2130((long) this.field2869);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2535(Statics.field2882, this.field2869, 0);
        if (var2 != null) {
            field2871.method2132(var2, (long) this.field2869);
        }
        return var2;
    }

    @ObfuscatedName("gi.z(I)Lhm;")
    public class225 method3282() {
        if (this.field2879 < 0) {
            return null;
        }
        class225 var1 = (class225) field2871.method2130((long) this.field2879);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2535(Statics.field2882, this.field2879, 0);
        if (var2 != null) {
            field2871.method2132(var2, (long) this.field2879);
        }
        return var2;
    }

    @ObfuscatedName("gi.y(I)Lhm;")
    public class225 method3283() {
        if (this.field2880 < 0) {
            return null;
        }
        class225 var1 = (class225) field2871.method2130((long) this.field2880);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2535(Statics.field2882, this.field2880, 0);
        if (var2 != null) {
            field2871.method2132(var2, (long) this.field2880);
        }
        return var2;
    }

    @ObfuscatedName("gi.j(I)Lhq;")
    public class209 method3307() {
        if (this.field2874 == -1) {
            return null;
        }
        class209 var1 = (class209) field2872.method2130((long) this.field2874);
        if (var1 != null) {
            return var1;
        }
        class183 var2 = Statics.field2882;
        class183 var3 = Statics.field2890;
        int var4 = this.field2874;
        class209 var5;
        if (class226.method171(var2, var4, 0)) {
            byte[] var6 = var3.method3012(var4, 0);
            class209 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class209 var8 = new class209(var6, Statics.field3126, Statics.field3218, Statics.field1558, Statics.field1200, Statics.field3216, Statics.field37);
                class226.method2997();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field2872.method2132(var5, (long) this.field2874);
        }
        return var5;
    }

    @ObfuscatedName("am.f(I)V")
    public static void method571() {
        field2870.method2139();
        field2871.method2139();
        field2872.method2139();
    }
}
