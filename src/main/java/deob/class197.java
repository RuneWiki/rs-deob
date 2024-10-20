package deob;

@ObfuscatedName("gw")
public class class197 extends class130 {

    @ObfuscatedName("gw.p")
    public static class125 field2871 = new class125(64);

    @ObfuscatedName("gw.j")
    public static class125 field2876 = new class125(64);

    @ObfuscatedName("gw.n")
    public static class125 field2873 = new class125(20);

    @ObfuscatedName("gw.s")
    public int field2887 = -1;

    @ObfuscatedName("gw.u")
    public int field2878 = 16777215;

    @ObfuscatedName("gw.b")
    public int field2877 = 70;

    @ObfuscatedName("gw.v")
    public int field2868 = -1;

    @ObfuscatedName("gw.f")
    public int field2879 = -1;

    @ObfuscatedName("gw.z")
    public int field2880 = -1;

    @ObfuscatedName("gw.t")
    public int field2881 = -1;

    @ObfuscatedName("gw.y")
    public int field2882 = 0;

    @ObfuscatedName("gw.w")
    public int field2883 = 0;

    @ObfuscatedName("gw.a")
    public int field2884 = -1;

    @ObfuscatedName("gw.k")
    public String field2872 = "";

    @ObfuscatedName("gw.l")
    public int field2886 = -1;

    @ObfuscatedName("gw.x")
    public int field2889 = 0;

    @ObfuscatedName("gw.g")
    public int[] field2888;

    @ObfuscatedName("gw.e")
    public int field2885 = -1;

    @ObfuscatedName("gw.ae")
    public int field2890 = -1;

    @ObfuscatedName("fp.q(Lgj;Lgj;Lgj;B)V")
    public static void method2983(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field2891 = arg0;
        Statics.field2869 = arg1;
        Statics.field2870 = arg2;
    }

    @ObfuscatedName("ay.d(II)Lgw;")
    public static class197 method955(int arg0) {
        class197 var1 = (class197) field2871.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2891.method3133(32, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3381(new class154(var2));
        }
        field2871.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gw.h(Lel;I)V")
    public void method3381(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3382(arg0, var2);
        }
    }

    @ObfuscatedName("gw.p(Lel;II)V")
    public void method3382(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2887 = arg0.method2862();
        } else if (arg1 == 2) {
            this.field2878 = arg0.method2718();
        } else if (arg1 == 3) {
            this.field2868 = arg0.method2862();
        } else if (arg1 == 4) {
            this.field2880 = arg0.method2862();
        } else if (arg1 == 5) {
            this.field2879 = arg0.method2862();
        } else if (arg1 == 6) {
            this.field2881 = arg0.method2862();
        } else if (arg1 == 7) {
            this.field2882 = arg0.method2669();
        } else if (arg1 == 8) {
            this.field2872 = arg0.method2675();
        } else if (arg1 == 9) {
            this.field2877 = arg0.method2668();
        } else if (arg1 == 10) {
            this.field2883 = arg0.method2669();
        } else if (arg1 == 11) {
            this.field2884 = 0;
        } else if (arg1 == 12) {
            this.field2886 = arg0.method2666();
        } else if (arg1 == 13) {
            this.field2889 = arg0.method2669();
        } else if (arg1 == 14) {
            this.field2884 = arg0.method2668();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2885 = arg0.method2668();
            if (this.field2885 == 65535) {
                this.field2885 = -1;
            }
            this.field2890 = arg0.method2668();
            if (this.field2890 == 65535) {
                this.field2890 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2668();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2666();
            this.field2888 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2888[var5] = arg0.method2668();
                if (this.field2888[var5] == 65535) {
                    this.field2888[var5] = -1;
                }
            }
            this.field2888[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gw.j(I)Lgw;")
    public final class197 method3419() {
        int var1 = -1;
        if (this.field2885 != -1) {
            var1 = class166.method2011(this.field2885);
        } else if (this.field2890 != -1) {
            var1 = class166.field2163[this.field2890];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2888.length - 1) {
            var2 = this.field2888[var1];
        } else {
            var2 = this.field2888[this.field2888.length - 1];
        }
        return var2 == -1 ? null : method955(var2);
    }

    @ObfuscatedName("gw.n(II)Ljava/lang/String;")
    public String method3384(int arg0) {
        String var2 = this.field2872;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class208.method3106(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gw.c(I)Lhy;")
    public class225 method3385() {
        if (this.field2868 < 0) {
            return null;
        }
        class225 var1 = (class225) field2876.method2258((long) this.field2868);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3118(Statics.field2869, this.field2868, 0);
        if (var2 != null) {
            field2876.method2248(var2, (long) this.field2868);
        }
        return var2;
    }

    @ObfuscatedName("gw.o(I)Lhy;")
    public class225 method3386() {
        if (this.field2879 < 0) {
            return null;
        }
        class225 var1 = (class225) field2876.method2258((long) this.field2879);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3118(Statics.field2869, this.field2879, 0);
        if (var2 != null) {
            field2876.method2248(var2, (long) this.field2879);
        }
        return var2;
    }

    @ObfuscatedName("gw.s(I)Lhy;")
    public class225 method3393() {
        if (this.field2880 < 0) {
            return null;
        }
        class225 var1 = (class225) field2876.method2258((long) this.field2880);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3118(Statics.field2869, this.field2880, 0);
        if (var2 != null) {
            field2876.method2248(var2, (long) this.field2880);
        }
        return var2;
    }

    @ObfuscatedName("gw.u(I)Lhy;")
    public class225 method3388() {
        if (this.field2881 < 0) {
            return null;
        }
        class225 var1 = (class225) field2876.method2258((long) this.field2881);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3118(Statics.field2869, this.field2881, 0);
        if (var2 != null) {
            field2876.method2248(var2, (long) this.field2881);
        }
        return var2;
    }

    @ObfuscatedName("gw.b(B)Lhk;")
    public class209 method3416() {
        if (this.field2887 == -1) {
            return null;
        }
        class209 var1 = (class209) field2873.method2258((long) this.field2887);
        if (var1 != null) {
            return var1;
        }
        class209 var2 = class226.method3193(Statics.field2869, Statics.field2870, this.field2887, 0);
        if (var2 != null) {
            field2873.method2248(var2, (long) this.field2887);
        }
        return var2;
    }
}
