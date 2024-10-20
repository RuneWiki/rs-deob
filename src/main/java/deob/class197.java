package deob;

@ObfuscatedName("gd")
public class class197 extends class130 {

    @ObfuscatedName("gd.v")
    public static class125 field2875 = new class125(64);

    @ObfuscatedName("gd.y")
    public static class125 field2888 = new class125(64);

    @ObfuscatedName("gd.p")
    public static class125 field2877 = new class125(20);

    @ObfuscatedName("gd.k")
    public int field2895 = -1;

    @ObfuscatedName("gd.f")
    public int field2882 = 16777215;

    @ObfuscatedName("gd.o")
    public int field2883 = 70;

    @ObfuscatedName("gd.q")
    public int field2884 = -1;

    @ObfuscatedName("gd.c")
    public int field2885 = -1;

    @ObfuscatedName("gd.b")
    public int field2896 = -1;

    @ObfuscatedName("gd.w")
    public int field2887 = -1;

    @ObfuscatedName("gd.l")
    public int field2872 = 0;

    @ObfuscatedName("gd.r")
    public int field2881 = 0;

    @ObfuscatedName("gd.u")
    public int field2890 = -1;

    @ObfuscatedName("gd.e")
    public String field2889 = "";

    @ObfuscatedName("gd.h")
    public int field2892 = -1;

    @ObfuscatedName("gd.d")
    public int field2893 = 0;

    @ObfuscatedName("gd.z")
    public int[] field2894;

    @ObfuscatedName("gd.t")
    public int field2876 = -1;

    @ObfuscatedName("gd.ab")
    public int field2886 = -1;

    @ObfuscatedName("cw.x(Lgo;Lgo;Lgo;B)V")
    public static void method1548(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field2891 = arg0;
        Statics.field2873 = arg1;
        Statics.field2874 = arg2;
    }

    @ObfuscatedName("at.n(II)Lgd;")
    public static class197 method952(int arg0) {
        class197 var1 = (class197) field2875.method2275((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2891.method3153(32, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3414(new class154(var2));
        }
        field2875.method2282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gd.g(Leq;I)V")
    public void method3414(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3415(arg0, var2);
        }
    }

    @ObfuscatedName("gd.v(Leq;IB)V")
    public void method3415(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2895 = arg0.method2716();
        } else if (arg1 == 2) {
            this.field2882 = arg0.method2705();
        } else if (arg1 == 3) {
            this.field2884 = arg0.method2716();
        } else if (arg1 == 4) {
            this.field2896 = arg0.method2716();
        } else if (arg1 == 5) {
            this.field2885 = arg0.method2716();
        } else if (arg1 == 6) {
            this.field2887 = arg0.method2716();
        } else if (arg1 == 7) {
            this.field2872 = arg0.method2704();
        } else if (arg1 == 8) {
            this.field2889 = arg0.method2710();
        } else if (arg1 == 9) {
            this.field2883 = arg0.method2833();
        } else if (arg1 == 10) {
            this.field2881 = arg0.method2704();
        } else if (arg1 == 11) {
            this.field2890 = 0;
        } else if (arg1 == 12) {
            this.field2892 = arg0.method2878();
        } else if (arg1 == 13) {
            this.field2893 = arg0.method2704();
        } else if (arg1 == 14) {
            this.field2890 = arg0.method2833();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2876 = arg0.method2833();
            if (this.field2876 == 65535) {
                this.field2876 = -1;
            }
            this.field2886 = arg0.method2833();
            if (this.field2886 == 65535) {
                this.field2886 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2833();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2878();
            this.field2894 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2894[var5] = arg0.method2833();
                if (this.field2894[var5] == 65535) {
                    this.field2894[var5] = -1;
                }
            }
            this.field2894[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gd.y(I)Lgd;")
    public final class197 method3433() {
        int var1 = -1;
        if (this.field2876 != -1) {
            var1 = class166.method203(this.field2876);
        } else if (this.field2886 != -1) {
            var1 = class166.field2166[this.field2886];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2894.length - 1) {
            var2 = this.field2894[var1];
        } else {
            var2 = this.field2894[this.field2894.length - 1];
        }
        return var2 == -1 ? null : method952(var2);
    }

    @ObfuscatedName("gd.p(II)Ljava/lang/String;")
    public String method3439(int arg0) {
        String var2 = this.field2889;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class208.method2945(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gd.j(I)Lhe;")
    public class225 method3418() {
        if (this.field2884 < 0) {
            return null;
        }
        class225 var1 = (class225) field2888.method2275((long) this.field2884);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2149(Statics.field2873, this.field2884, 0);
        if (var2 != null) {
            field2888.method2282(var2, (long) this.field2884);
        }
        return var2;
    }

    @ObfuscatedName("gd.s(B)Lhe;")
    public class225 method3419() {
        if (this.field2885 < 0) {
            return null;
        }
        class225 var1 = (class225) field2888.method2275((long) this.field2885);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2149(Statics.field2873, this.field2885, 0);
        if (var2 != null) {
            field2888.method2282(var2, (long) this.field2885);
        }
        return var2;
    }

    @ObfuscatedName("gd.k(I)Lhe;")
    public class225 method3420() {
        if (this.field2896 < 0) {
            return null;
        }
        class225 var1 = (class225) field2888.method2275((long) this.field2896);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2149(Statics.field2873, this.field2896, 0);
        if (var2 != null) {
            field2888.method2282(var2, (long) this.field2896);
        }
        return var2;
    }

    @ObfuscatedName("gd.f(B)Lhe;")
    public class225 method3421() {
        if (this.field2887 < 0) {
            return null;
        }
        class225 var1 = (class225) field2888.method2275((long) this.field2887);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2149(Statics.field2873, this.field2887, 0);
        if (var2 != null) {
            field2888.method2282(var2, (long) this.field2887);
        }
        return var2;
    }

    @ObfuscatedName("gd.o(I)Lhi;")
    public class209 method3450() {
        if (this.field2895 == -1) {
            return null;
        }
        class209 var1 = (class209) field2877.method2275((long) this.field2895);
        if (var1 != null) {
            return var1;
        }
        class209 var2 = class226.method958(Statics.field2873, Statics.field2874, this.field2895, 0);
        if (var2 != null) {
            field2877.method2282(var2, (long) this.field2895);
        }
        return var2;
    }
}
