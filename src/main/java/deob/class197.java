package deob;

@ObfuscatedName("gc")
public class class197 extends class130 {

    @ObfuscatedName("gc.h")
    public static class125 field2876 = new class125(64);

    @ObfuscatedName("gc.r")
    public static class125 field2877 = new class125(64);

    @ObfuscatedName("gc.o")
    public static class125 field2878 = new class125(20);

    @ObfuscatedName("gc.s")
    public int field2880 = -1;

    @ObfuscatedName("gc.q")
    public int field2883 = 16777215;

    @ObfuscatedName("gc.d")
    public int field2882 = 70;

    @ObfuscatedName("gc.p")
    public int field2888 = -1;

    @ObfuscatedName("gc.y")
    public int field2889 = -1;

    @ObfuscatedName("gc.a")
    public int field2875 = -1;

    @ObfuscatedName("gc.v")
    public int field2885 = -1;

    @ObfuscatedName("gc.z")
    public int field2887 = 0;

    @ObfuscatedName("gc.x")
    public int field2874 = 0;

    @ObfuscatedName("gc.g")
    public int field2881 = -1;

    @ObfuscatedName("gc.b")
    public String field2890 = "";

    @ObfuscatedName("gc.k")
    public int field2891 = -1;

    @ObfuscatedName("gc.t")
    public int field2892 = 0;

    @ObfuscatedName("gc.c")
    public int[] field2893;

    @ObfuscatedName("gc.e")
    public int field2894 = -1;

    @ObfuscatedName("gc.am")
    public int field2895 = -1;

    @ObfuscatedName("dp.f(II)Lgc;")
    public static class197 method2099(int arg0) {
        class197 var1 = (class197) field2876.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2886.method3163(32, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3394(new class154(var2));
        }
        field2876.method2246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gc.i(Leo;I)V")
    public void method3394(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3410(arg0, var2);
        }
    }

    @ObfuscatedName("gc.u(Leo;II)V")
    public void method3410(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2880 = arg0.method2681();
        } else if (arg1 == 2) {
            this.field2883 = arg0.method2670();
        } else if (arg1 == 3) {
            this.field2888 = arg0.method2681();
        } else if (arg1 == 4) {
            this.field2875 = arg0.method2681();
        } else if (arg1 == 5) {
            this.field2889 = arg0.method2681();
        } else if (arg1 == 6) {
            this.field2885 = arg0.method2681();
        } else if (arg1 == 7) {
            this.field2887 = arg0.method2669();
        } else if (arg1 == 8) {
            this.field2890 = arg0.method2675();
        } else if (arg1 == 9) {
            this.field2882 = arg0.method2668();
        } else if (arg1 == 10) {
            this.field2874 = arg0.method2669();
        } else if (arg1 == 11) {
            this.field2881 = 0;
        } else if (arg1 == 12) {
            this.field2891 = arg0.method2666();
        } else if (arg1 == 13) {
            this.field2892 = arg0.method2669();
        } else if (arg1 == 14) {
            this.field2881 = arg0.method2668();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2894 = arg0.method2668();
            if (this.field2894 == 65535) {
                this.field2894 = -1;
            }
            this.field2895 = arg0.method2668();
            if (this.field2895 == 65535) {
                this.field2895 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2668();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2666();
            this.field2893 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2893[var5] = arg0.method2668();
                if (this.field2893[var5] == 65535) {
                    this.field2893[var5] = -1;
                }
            }
            this.field2893[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gc.r(I)Lgc;")
    public final class197 method3381() {
        int var1 = -1;
        if (this.field2894 != -1) {
            var1 = class166.method561(this.field2894);
        } else if (this.field2895 != -1) {
            var1 = class166.field2181[this.field2895];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2893.length - 1) {
            var2 = this.field2893[var1];
        } else {
            var2 = this.field2893[this.field2893.length - 1];
        }
        return var2 == -1 ? null : method2099(var2);
    }

    @ObfuscatedName("gc.o(IB)Ljava/lang/String;")
    public String method3384(int arg0) {
        String var2 = this.field2890;
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

    @ObfuscatedName("gc.l(B)Lhe;")
    public class225 method3385() {
        if (this.field2888 < 0) {
            return null;
        }
        class225 var1 = (class225) field2877.method2240((long) this.field2888);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = Statics.method565(Statics.field2884, this.field2888, 0);
        if (var2 != null) {
            field2877.method2246(var2, (long) this.field2888);
        }
        return var2;
    }

    @ObfuscatedName("gc.n(B)Lhe;")
    public class225 method3386() {
        if (this.field2889 < 0) {
            return null;
        }
        class225 var1 = (class225) field2877.method2240((long) this.field2889);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = Statics.method565(Statics.field2884, this.field2889, 0);
        if (var2 != null) {
            field2877.method2246(var2, (long) this.field2889);
        }
        return var2;
    }

    @ObfuscatedName("gc.m(I)Lhe;")
    public class225 method3387() {
        if (this.field2875 < 0) {
            return null;
        }
        class225 var1 = (class225) field2877.method2240((long) this.field2875);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = Statics.method565(Statics.field2884, this.field2875, 0);
        if (var2 != null) {
            field2877.method2246(var2, (long) this.field2875);
        }
        return var2;
    }

    @ObfuscatedName("gc.w(I)Lhe;")
    public class225 method3388() {
        if (this.field2885 < 0) {
            return null;
        }
        class225 var1 = (class225) field2877.method2240((long) this.field2885);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = Statics.method565(Statics.field2884, this.field2885, 0);
        if (var2 != null) {
            field2877.method2246(var2, (long) this.field2885);
        }
        return var2;
    }

    @ObfuscatedName("gc.j(I)Lhg;")
    public class209 method3389() {
        if (this.field2880 == -1) {
            return null;
        }
        class209 var1 = (class209) field2878.method2240((long) this.field2880);
        if (var1 != null) {
            return var1;
        }
        class209 var2 = class226.method158(Statics.field2884, Statics.field6, this.field2880, 0);
        if (var2 != null) {
            field2878.method2246(var2, (long) this.field2880);
        }
        return var2;
    }

    @ObfuscatedName("al.s(I)V")
    public static void method900() {
        field2876.method2244();
        field2877.method2244();
        field2878.method2244();
    }
}
