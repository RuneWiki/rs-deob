package deob;

@ObfuscatedName("gz")
public class class197 extends class130 {

    @ObfuscatedName("gz.h")
    public static class125 field2876 = new class125(64);

    @ObfuscatedName("gz.a")
    public static class125 field2877 = new class125(64);

    @ObfuscatedName("gz.g")
    public static class125 field2878 = new class125(20);

    @ObfuscatedName("gz.n")
    public int field2893 = -1;

    @ObfuscatedName("gz.m")
    public int field2882 = 16777215;

    @ObfuscatedName("gz.j")
    public int field2883 = 70;

    @ObfuscatedName("gz.w")
    public int field2884 = -1;

    @ObfuscatedName("gz.p")
    public int field2885 = -1;

    @ObfuscatedName("gz.o")
    public int field2886 = -1;

    @ObfuscatedName("gz.i")
    public int field2887 = -1;

    @ObfuscatedName("gz.z")
    public int field2896 = 0;

    @ObfuscatedName("gz.e")
    public int field2889 = 0;

    @ObfuscatedName("gz.d")
    public int field2890 = -1;

    @ObfuscatedName("gz.t")
    public String field2891 = "";

    @ObfuscatedName("gz.q")
    public int field2892 = -1;

    @ObfuscatedName("gz.y")
    public int field2888 = 0;

    @ObfuscatedName("gz.l")
    public int[] field2894;

    @ObfuscatedName("gz.v")
    public int field2895 = -1;

    @ObfuscatedName("gz.az")
    public int field2875 = -1;

    @ObfuscatedName("fa.s(Lgp;Lgp;Lgp;I)V")
    public static void method2981(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field2881 = arg0;
        Statics.field2874 = arg1;
        Statics.field2873 = arg2;
    }

    @ObfuscatedName("cu.c(IB)Lgz;")
    public static class197 method1772(int arg0) {
        class197 var1 = (class197) field2876.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2881.method2986(32, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3250(new class154(var2));
        }
        field2876.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gz.f(Lea;I)V")
    public void method3250(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3251(arg0, var2);
        }
    }

    @ObfuscatedName("gz.g(Lea;II)V")
    public void method3251(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2893 = arg0.method2560();
        } else if (arg1 == 2) {
            this.field2882 = arg0.method2549();
        } else if (arg1 == 3) {
            this.field2884 = arg0.method2560();
        } else if (arg1 == 4) {
            this.field2886 = arg0.method2560();
        } else if (arg1 == 5) {
            this.field2885 = arg0.method2560();
        } else if (arg1 == 6) {
            this.field2887 = arg0.method2560();
        } else if (arg1 == 7) {
            this.field2896 = arg0.method2672();
        } else if (arg1 == 8) {
            this.field2891 = arg0.method2675();
        } else if (arg1 == 9) {
            this.field2883 = arg0.method2541();
        } else if (arg1 == 10) {
            this.field2889 = arg0.method2672();
        } else if (arg1 == 11) {
            this.field2890 = 0;
        } else if (arg1 == 12) {
            this.field2892 = arg0.method2545();
        } else if (arg1 == 13) {
            this.field2888 = arg0.method2672();
        } else if (arg1 == 14) {
            this.field2890 = arg0.method2541();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2895 = arg0.method2541();
            if (this.field2895 == 65535) {
                this.field2895 = -1;
            }
            this.field2875 = arg0.method2541();
            if (this.field2875 == 65535) {
                this.field2875 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2541();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2545();
            this.field2894 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2894[var5] = arg0.method2541();
                if (this.field2894[var5] == 65535) {
                    this.field2894[var5] = -1;
                }
            }
            this.field2894[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gz.k(B)Lgz;")
    public final class197 method3252() {
        int var1 = -1;
        if (this.field2895 != -1) {
            var1 = class166.method175(this.field2895);
        } else if (this.field2875 != -1) {
            var1 = class166.field2176[this.field2875];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2894.length - 1) {
            var2 = this.field2894[var1];
        } else {
            var2 = this.field2894[this.field2894.length - 1];
        }
        return var2 == -1 ? null : method1772(var2);
    }

    @ObfuscatedName("gz.u(IS)Ljava/lang/String;")
    public String method3258(int arg0) {
        String var2 = this.field2891;
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

    @ObfuscatedName("gz.b(I)Lhk;")
    public class225 method3253() {
        if (this.field2884 < 0) {
            return null;
        }
        class225 var1 = (class225) field2877.method2121((long) this.field2884);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method706(Statics.field2874, this.field2884, 0);
        if (var2 != null) {
            field2877.method2123(var2, (long) this.field2884);
        }
        return var2;
    }

    @ObfuscatedName("gz.x(S)Lhk;")
    public class225 method3254() {
        if (this.field2885 < 0) {
            return null;
        }
        class225 var1 = (class225) field2877.method2121((long) this.field2885);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method706(Statics.field2874, this.field2885, 0);
        if (var2 != null) {
            field2877.method2123(var2, (long) this.field2885);
        }
        return var2;
    }

    @ObfuscatedName("gz.r(B)Lhk;")
    public class225 method3255() {
        if (this.field2886 < 0) {
            return null;
        }
        class225 var1 = (class225) field2877.method2121((long) this.field2886);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method706(Statics.field2874, this.field2886, 0);
        if (var2 != null) {
            field2877.method2123(var2, (long) this.field2886);
        }
        return var2;
    }

    @ObfuscatedName("gz.n(I)Lhk;")
    public class225 method3256() {
        if (this.field2887 < 0) {
            return null;
        }
        class225 var1 = (class225) field2877.method2121((long) this.field2887);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method706(Statics.field2874, this.field2887, 0);
        if (var2 != null) {
            field2877.method2123(var2, (long) this.field2887);
        }
        return var2;
    }

    @ObfuscatedName("gz.m(I)Lhi;")
    public class209 method3270() {
        if (this.field2893 == -1) {
            return null;
        }
        class209 var1 = (class209) field2878.method2121((long) this.field2893);
        if (var1 != null) {
            return var1;
        }
        class209 var2 = class226.method2978(Statics.field2874, Statics.field2873, this.field2893, 0);
        if (var2 != null) {
            field2878.method2123(var2, (long) this.field2893);
        }
        return var2;
    }
}
