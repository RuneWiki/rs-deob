package deob;

@ObfuscatedName("gu")
public class class197 extends class130 {

    @ObfuscatedName("gu.k")
    public static class125 field2869 = new class125(64);

    @ObfuscatedName("gu.g")
    public static class125 field2883 = new class125(64);

    @ObfuscatedName("gu.n")
    public static class125 field2871 = new class125(20);

    @ObfuscatedName("gu.p")
    public int field2874 = -1;

    @ObfuscatedName("gu.l")
    public int field2885 = 16777215;

    @ObfuscatedName("gu.c")
    public int field2876 = 70;

    @ObfuscatedName("gu.m")
    public int field2877 = -1;

    @ObfuscatedName("gu.r")
    public int field2878 = -1;

    @ObfuscatedName("gu.u")
    public int field2879 = -1;

    @ObfuscatedName("gu.j")
    public int field2880 = -1;

    @ObfuscatedName("gu.x")
    public int field2881 = 0;

    @ObfuscatedName("gu.d")
    public int field2882 = 0;

    @ObfuscatedName("gu.y")
    public int field2872 = -1;

    @ObfuscatedName("gu.s")
    public String field2884 = "";

    @ObfuscatedName("gu.t")
    public int field2890 = -1;

    @ObfuscatedName("gu.z")
    public int field2886 = 0;

    @ObfuscatedName("gu.b")
    public int[] field2887;

    @ObfuscatedName("gu.o")
    public int field2888 = -1;

    @ObfuscatedName("gu.ak")
    public int field2891 = -1;

    @ObfuscatedName("fr.i(Lgq;Lgq;Lgq;I)V")
    public static void method2896(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field2867 = arg0;
        Statics.field2870 = arg1;
        Statics.field2889 = arg2;
    }

    @ObfuscatedName("dy.e(II)Lgu;")
    public static class197 method2106(int arg0) {
        class197 var1 = (class197) field2869.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2867.method3014(32, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3304(new class154(var2));
        }
        field2869.method2152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gu.f(Let;S)V")
    public void method3304(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3326(arg0, var2);
        }
    }

    @ObfuscatedName("gu.k(Let;II)V")
    public void method3326(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2874 = arg0.method2588();
        } else if (arg1 == 2) {
            this.field2885 = arg0.method2706();
        } else if (arg1 == 3) {
            this.field2877 = arg0.method2588();
        } else if (arg1 == 4) {
            this.field2879 = arg0.method2588();
        } else if (arg1 == 5) {
            this.field2878 = arg0.method2588();
        } else if (arg1 == 6) {
            this.field2880 = arg0.method2588();
        } else if (arg1 == 7) {
            this.field2881 = arg0.method2576();
        } else if (arg1 == 8) {
            this.field2884 = arg0.method2622();
        } else if (arg1 == 9) {
            this.field2876 = arg0.method2575();
        } else if (arg1 == 10) {
            this.field2882 = arg0.method2576();
        } else if (arg1 == 11) {
            this.field2872 = 0;
        } else if (arg1 == 12) {
            this.field2890 = arg0.method2573();
        } else if (arg1 == 13) {
            this.field2886 = arg0.method2576();
        } else if (arg1 == 14) {
            this.field2872 = arg0.method2575();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2888 = arg0.method2575();
            if (this.field2888 == 65535) {
                this.field2888 = -1;
            }
            this.field2891 = arg0.method2575();
            if (this.field2891 == 65535) {
                this.field2891 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2575();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2573();
            this.field2887 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2887[var5] = arg0.method2575();
                if (this.field2887[var5] == 65535) {
                    this.field2887[var5] = -1;
                }
            }
            this.field2887[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gu.a(I)Lgu;")
    public final class197 method3307() {
        int var1 = -1;
        if (this.field2888 != -1) {
            var1 = class166.method1794(this.field2888);
        } else if (this.field2891 != -1) {
            var1 = class166.field2169[this.field2891];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2887.length - 1) {
            var2 = this.field2887[var1];
        } else {
            var2 = this.field2887[this.field2887.length - 1];
        }
        return var2 == -1 ? null : method2106(var2);
    }

    @ObfuscatedName("gu.q(II)Ljava/lang/String;")
    public String method3306(int arg0) {
        String var2 = this.field2884;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class208.method2761(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gu.w(B)Lhj;")
    public class225 method3328() {
        if (this.field2877 < 0) {
            return null;
        }
        class225 var1 = (class225) field2883.method2150((long) this.field2877);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method219(Statics.field2870, this.field2877, 0);
        if (var2 != null) {
            field2883.method2152(var2, (long) this.field2877);
        }
        return var2;
    }

    @ObfuscatedName("gu.v(I)Lhj;")
    public class225 method3308() {
        if (this.field2878 < 0) {
            return null;
        }
        class225 var1 = (class225) field2883.method2150((long) this.field2878);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method219(Statics.field2870, this.field2878, 0);
        if (var2 != null) {
            field2883.method2152(var2, (long) this.field2878);
        }
        return var2;
    }

    @ObfuscatedName("gu.h(B)Lhj;")
    public class225 method3309() {
        if (this.field2879 < 0) {
            return null;
        }
        class225 var1 = (class225) field2883.method2150((long) this.field2879);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method219(Statics.field2870, this.field2879, 0);
        if (var2 != null) {
            field2883.method2152(var2, (long) this.field2879);
        }
        return var2;
    }

    @ObfuscatedName("gu.p(B)Lhj;")
    public class225 method3327() {
        if (this.field2880 < 0) {
            return null;
        }
        class225 var1 = (class225) field2883.method2150((long) this.field2880);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method219(Statics.field2870, this.field2880, 0);
        if (var2 != null) {
            field2883.method2152(var2, (long) this.field2880);
        }
        return var2;
    }

    @ObfuscatedName("gu.l(I)Lhw;")
    public class209 method3311() {
        if (this.field2874 == -1) {
            return null;
        }
        class209 var1 = (class209) field2871.method2150((long) this.field2874);
        if (var1 != null) {
            return var1;
        }
        class183 var2 = Statics.field2870;
        class183 var3 = Statics.field2889;
        int var4 = this.field2874;
        class209 var5;
        if (class226.method3001(var2, var4, 0)) {
            byte[] var6 = var3.method3014(var4, 0);
            class209 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class209 var8 = new class209(var6, Statics.field3218, Statics.field1749, Statics.field3219, Statics.field898, Statics.field2192, Statics.field2107);
                class226.method3155();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field2871.method2152(var5, (long) this.field2874);
        }
        return var5;
    }

    @ObfuscatedName("fm.c(B)V")
    public static void method2863() {
        field2869.method2155();
        field2883.method2155();
        field2871.method2155();
    }
}
