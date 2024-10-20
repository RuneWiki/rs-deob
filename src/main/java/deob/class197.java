package deob;

@ObfuscatedName("gs")
public class class197 extends class130 {

    @ObfuscatedName("gs.t")
    public static class125 field2874 = new class125(64);

    @ObfuscatedName("gs.k")
    public static class125 field2877 = new class125(64);

    @ObfuscatedName("gs.h")
    public static class125 field2879 = new class125(20);

    @ObfuscatedName("gs.z")
    public int field2892 = -1;

    @ObfuscatedName("gs.p")
    public int field2890 = 16777215;

    @ObfuscatedName("gs.s")
    public int field2883 = 70;

    @ObfuscatedName("gs.o")
    public int field2884 = -1;

    @ObfuscatedName("gs.y")
    public int field2885 = -1;

    @ObfuscatedName("gs.w")
    public int field2886 = -1;

    @ObfuscatedName("gs.m")
    public int field2889 = -1;

    @ObfuscatedName("gs.u")
    public int field2888 = 0;

    @ObfuscatedName("gs.q")
    public int field2897 = 0;

    @ObfuscatedName("gs.c")
    public int field2878 = -1;

    @ObfuscatedName("gs.v")
    public String field2891 = "";

    @ObfuscatedName("gs.e")
    public int field2887 = -1;

    @ObfuscatedName("gs.j")
    public int field2893 = 0;

    @ObfuscatedName("gs.d")
    public int[] field2894;

    @ObfuscatedName("gs.g")
    public int field2895 = -1;

    @ObfuscatedName("gs.ap")
    public int field2896 = -1;

    @ObfuscatedName("as.b(Lgj;Lgj;Lgj;I)V")
    public static void method783(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field2881 = arg0;
        Statics.field2882 = arg1;
        Statics.field2876 = arg2;
    }

    @ObfuscatedName("gi.l(II)Lgs;")
    public static class197 method3627(int arg0) {
        class197 var1 = (class197) field2874.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2881.method3226(32, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3461(new class154(var2));
        }
        field2874.method2258(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gs.i(Leg;I)V")
    public void method3461(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3437(arg0, var2);
        }
    }

    @ObfuscatedName("gs.t(Leg;II)V")
    public void method3437(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2892 = arg0.method2788();
        } else if (arg1 == 2) {
            this.field2890 = arg0.method2682();
        } else if (arg1 == 3) {
            this.field2884 = arg0.method2788();
        } else if (arg1 == 4) {
            this.field2886 = arg0.method2788();
        } else if (arg1 == 5) {
            this.field2885 = arg0.method2788();
        } else if (arg1 == 6) {
            this.field2889 = arg0.method2788();
        } else if (arg1 == 7) {
            this.field2888 = arg0.method2681();
        } else if (arg1 == 8) {
            this.field2891 = arg0.method2687();
        } else if (arg1 == 9) {
            this.field2883 = arg0.method2801();
        } else if (arg1 == 10) {
            this.field2897 = arg0.method2681();
        } else if (arg1 == 11) {
            this.field2878 = 0;
        } else if (arg1 == 12) {
            this.field2887 = arg0.method2678();
        } else if (arg1 == 13) {
            this.field2893 = arg0.method2681();
        } else if (arg1 == 14) {
            this.field2878 = arg0.method2801();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2895 = arg0.method2801();
            if (this.field2895 == 65535) {
                this.field2895 = -1;
            }
            this.field2896 = arg0.method2801();
            if (this.field2896 == 65535) {
                this.field2896 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2801();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2678();
            this.field2894 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2894[var5] = arg0.method2801();
                if (this.field2894[var5] == 65535) {
                    this.field2894[var5] = -1;
                }
            }
            this.field2894[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gs.k(B)Lgs;")
    public final class197 method3466() {
        int var1 = -1;
        if (this.field2895 != -1) {
            var1 = class166.method2904(this.field2895);
        } else if (this.field2896 != -1) {
            var1 = class166.field2156[this.field2896];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2894.length - 1) {
            var2 = this.field2894[var1];
        } else {
            var2 = this.field2894[this.field2894.length - 1];
        }
        return var2 == -1 ? null : method3627(var2);
    }

    @ObfuscatedName("gs.x(II)Ljava/lang/String;")
    public String method3474(int arg0) {
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

    @ObfuscatedName("gs.z(I)Lhq;")
    public class225 method3469() {
        if (this.field2884 < 0) {
            return null;
        }
        class225 var1 = (class225) field2877.method2256((long) this.field2884);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3607(Statics.field2882, this.field2884, 0);
        if (var2 != null) {
            field2877.method2258(var2, (long) this.field2884);
        }
        return var2;
    }

    @ObfuscatedName("gs.p(B)Lhq;")
    public class225 method3441() {
        if (this.field2885 < 0) {
            return null;
        }
        class225 var1 = (class225) field2877.method2256((long) this.field2885);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3607(Statics.field2882, this.field2885, 0);
        if (var2 != null) {
            field2877.method2258(var2, (long) this.field2885);
        }
        return var2;
    }

    @ObfuscatedName("gs.s(B)Lhq;")
    public class225 method3442() {
        if (this.field2886 < 0) {
            return null;
        }
        class225 var1 = (class225) field2877.method2256((long) this.field2886);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3607(Statics.field2882, this.field2886, 0);
        if (var2 != null) {
            field2877.method2258(var2, (long) this.field2886);
        }
        return var2;
    }

    @ObfuscatedName("gs.o(I)Lhq;")
    public class225 method3443() {
        if (this.field2889 < 0) {
            return null;
        }
        class225 var1 = (class225) field2877.method2256((long) this.field2889);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3607(Statics.field2882, this.field2889, 0);
        if (var2 != null) {
            field2877.method2258(var2, (long) this.field2889);
        }
        return var2;
    }

    @ObfuscatedName("gs.y(I)Lhm;")
    public class209 method3444() {
        if (this.field2892 == -1) {
            return null;
        }
        class209 var1 = (class209) field2879.method2256((long) this.field2892);
        if (var1 != null) {
            return var1;
        }
        class183 var2 = Statics.field2882;
        class183 var3 = Statics.field2876;
        int var4 = this.field2892;
        class209 var5;
        if (class226.method3262(var2, var4, 0)) {
            var5 = class226.method1411(var3.method3226(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field2879.method2258(var5, (long) this.field2892);
        }
        return var5;
    }
}
