package deob;

@ObfuscatedName("gy")
public class class197 extends class130 {

    @ObfuscatedName("gy.q")
    public static class125 field2863 = new class125(64);

    @ObfuscatedName("gy.d")
    public static class125 field2864 = new class125(64);

    @ObfuscatedName("gy.k")
    public static class125 field2861 = new class125(20);

    @ObfuscatedName("gy.m")
    public int field2868 = -1;

    @ObfuscatedName("gy.h")
    public int field2880 = 16777215;

    @ObfuscatedName("gy.r")
    public int field2870 = 70;

    @ObfuscatedName("gy.u")
    public int field2871 = -1;

    @ObfuscatedName("gy.i")
    public int field2872 = -1;

    @ObfuscatedName("gy.z")
    public int field2873 = -1;

    @ObfuscatedName("gy.n")
    public int field2874 = -1;

    @ObfuscatedName("gy.w")
    public int field2875 = 0;

    @ObfuscatedName("gy.y")
    public int field2862 = 0;

    @ObfuscatedName("gy.v")
    public int field2877 = -1;

    @ObfuscatedName("gy.f")
    public String field2878 = "";

    @ObfuscatedName("gy.l")
    public int field2886 = -1;

    @ObfuscatedName("gy.t")
    public int field2883 = 0;

    @ObfuscatedName("gy.b")
    public int[] field2881;

    @ObfuscatedName("gy.e")
    public int field2882 = -1;

    @ObfuscatedName("gy.ai")
    public int field2869 = -1;

    @ObfuscatedName("dr.p(Lgp;Lgp;Lgp;B)V")
    public static void method2067(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field2866 = arg0;
        Statics.field2879 = arg1;
        Statics.field2884 = arg2;
    }

    @ObfuscatedName("de.g(II)Lgy;")
    public static class197 method1908(int arg0) {
        class197 var1 = (class197) field2863.method2169((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2866.method3044(32, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3299(new class154(var2));
        }
        field2863.method2174(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gy.x(Lev;I)V")
    public void method3299(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3301(arg0, var2);
        }
    }

    @ObfuscatedName("gy.q(Lev;II)V")
    public void method3301(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2868 = arg0.method2622();
        } else if (arg1 == 2) {
            this.field2880 = arg0.method2748();
        } else if (arg1 == 3) {
            this.field2871 = arg0.method2622();
        } else if (arg1 == 4) {
            this.field2873 = arg0.method2622();
        } else if (arg1 == 5) {
            this.field2872 = arg0.method2622();
        } else if (arg1 == 6) {
            this.field2874 = arg0.method2622();
        } else if (arg1 == 7) {
            this.field2875 = arg0.method2739();
        } else if (arg1 == 8) {
            this.field2878 = arg0.method2604();
        } else if (arg1 == 9) {
            this.field2870 = arg0.method2595();
        } else if (arg1 == 10) {
            this.field2862 = arg0.method2739();
        } else if (arg1 == 11) {
            this.field2877 = 0;
        } else if (arg1 == 12) {
            this.field2886 = arg0.method2593();
        } else if (arg1 == 13) {
            this.field2883 = arg0.method2739();
        } else if (arg1 == 14) {
            this.field2877 = arg0.method2595();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2882 = arg0.method2595();
            if (this.field2882 == 65535) {
                this.field2882 = -1;
            }
            this.field2869 = arg0.method2595();
            if (this.field2869 == 65535) {
                this.field2869 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2595();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2593();
            this.field2881 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2881[var5] = arg0.method2595();
                if (this.field2881[var5] == 65535) {
                    this.field2881[var5] = -1;
                }
            }
            this.field2881[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gy.d(B)Lgy;")
    public final class197 method3343() {
        int var1 = -1;
        if (this.field2882 != -1) {
            var1 = Statics.method115(this.field2882);
        } else if (this.field2869 != -1) {
            var1 = class166.field2159[this.field2869];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2881.length - 1) {
            var2 = this.field2881[var1];
        } else {
            var2 = this.field2881[this.field2881.length - 1];
        }
        return var2 == -1 ? null : method1908(var2);
    }

    @ObfuscatedName("gy.k(II)Ljava/lang/String;")
    public String method3303(int arg0) {
        String var2 = this.field2878;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            String var4 = var2.substring(0, var3);
            String var5 = Integer.toString(arg0);
            var2 = var4 + var5 + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gy.j(I)Lhs;")
    public class225 method3304() {
        if (this.field2871 < 0) {
            return null;
        }
        class225 var1 = (class225) field2864.method2169((long) this.field2871);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3170(Statics.field2879, this.field2871, 0);
        if (var2 != null) {
            field2864.method2174(var2, (long) this.field2871);
        }
        return var2;
    }

    @ObfuscatedName("gy.s(B)Lhs;")
    public class225 method3305() {
        if (this.field2872 < 0) {
            return null;
        }
        class225 var1 = (class225) field2864.method2169((long) this.field2872);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3170(Statics.field2879, this.field2872, 0);
        if (var2 != null) {
            field2864.method2174(var2, (long) this.field2872);
        }
        return var2;
    }

    @ObfuscatedName("gy.o(I)Lhs;")
    public class225 method3306() {
        if (this.field2873 < 0) {
            return null;
        }
        class225 var1 = (class225) field2864.method2169((long) this.field2873);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3170(Statics.field2879, this.field2873, 0);
        if (var2 != null) {
            field2864.method2174(var2, (long) this.field2873);
        }
        return var2;
    }

    @ObfuscatedName("gy.a(B)Lhs;")
    public class225 method3307() {
        if (this.field2874 < 0) {
            return null;
        }
        class225 var1 = (class225) field2864.method2169((long) this.field2874);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3170(Statics.field2879, this.field2874, 0);
        if (var2 != null) {
            field2864.method2174(var2, (long) this.field2874);
        }
        return var2;
    }

    @ObfuscatedName("gy.c(B)Lha;")
    public class209 method3308() {
        if (this.field2868 == -1) {
            return null;
        }
        class209 var1 = (class209) field2861.method2169((long) this.field2868);
        if (var1 != null) {
            return var1;
        }
        class209 var2 = class226.method183(Statics.field2879, Statics.field2884, this.field2868, 0);
        if (var2 != null) {
            field2861.method2174(var2, (long) this.field2868);
        }
        return var2;
    }

    @ObfuscatedName("az.u(I)V")
    public static void method868() {
        field2863.method2170();
        field2864.method2170();
        field2861.method2170();
    }
}
