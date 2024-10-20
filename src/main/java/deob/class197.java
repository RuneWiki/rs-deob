package deob;

@ObfuscatedName("gj")
public class class197 extends class130 {

    @ObfuscatedName("gj.d")
    public static class125 field2868 = new class125(64);

    @ObfuscatedName("gj.w")
    public static class125 field2878 = new class125(64);

    @ObfuscatedName("gj.h")
    public static class125 field2870 = new class125(20);

    @ObfuscatedName("gj.q")
    public int field2869 = -1;

    @ObfuscatedName("gj.v")
    public int field2876 = 16777215;

    @ObfuscatedName("gj.l")
    public int field2877 = 70;

    @ObfuscatedName("gj.s")
    public int field2867 = -1;

    @ObfuscatedName("gj.r")
    public int field2879 = -1;

    @ObfuscatedName("gj.m")
    public int field2880 = -1;

    @ObfuscatedName("gj.i")
    public int field2881 = -1;

    @ObfuscatedName("gj.f")
    public int field2882 = 0;

    @ObfuscatedName("gj.b")
    public int field2883 = 0;

    @ObfuscatedName("gj.t")
    public int field2873 = -1;

    @ObfuscatedName("gj.z")
    public String field2885 = "";

    @ObfuscatedName("gj.p")
    public int field2886 = -1;

    @ObfuscatedName("gj.n")
    public int field2887 = 0;

    @ObfuscatedName("gj.a")
    public int[] field2865;

    @ObfuscatedName("gj.o")
    public int field2889 = -1;

    @ObfuscatedName("gj.an")
    public int field2890 = -1;

    @ObfuscatedName("fj.x(II)Lgj;")
    public static class197 method3064(int arg0) {
        class197 var1 = (class197) field2868.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2884.method3121(32, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3370(new class154(var2));
        }
        field2868.method2223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gj.j(Lek;B)V")
    public void method3370(class154 arg0) {
        while (true) {
            int var2 = arg0.method2701();
            if (var2 == 0) {
                return;
            }
            this.method3392(arg0, var2);
        }
    }

    @ObfuscatedName("gj.c(Lek;II)V")
    public void method3392(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2869 = arg0.method2654();
        } else if (arg1 == 2) {
            this.field2876 = arg0.method2643();
        } else if (arg1 == 3) {
            this.field2867 = arg0.method2654();
        } else if (arg1 == 4) {
            this.field2880 = arg0.method2654();
        } else if (arg1 == 5) {
            this.field2879 = arg0.method2654();
        } else if (arg1 == 6) {
            this.field2881 = arg0.method2654();
        } else if (arg1 == 7) {
            this.field2882 = arg0.method2695();
        } else if (arg1 == 8) {
            this.field2885 = arg0.method2781();
        } else if (arg1 == 9) {
            this.field2877 = arg0.method2745();
        } else if (arg1 == 10) {
            this.field2883 = arg0.method2695();
        } else if (arg1 == 11) {
            this.field2873 = 0;
        } else if (arg1 == 12) {
            this.field2886 = arg0.method2701();
        } else if (arg1 == 13) {
            this.field2887 = arg0.method2695();
        } else if (arg1 == 14) {
            this.field2873 = arg0.method2745();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2889 = arg0.method2745();
            if (this.field2889 == 65535) {
                this.field2889 = -1;
            }
            this.field2890 = arg0.method2745();
            if (this.field2890 == 65535) {
                this.field2890 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2745();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2701();
            this.field2865 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2865[var5] = arg0.method2745();
                if (this.field2865[var5] == 65535) {
                    this.field2865[var5] = -1;
                }
            }
            this.field2865[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gj.d(I)Lgj;")
    public final class197 method3372() {
        int var1 = -1;
        if (this.field2889 != -1) {
            var1 = class166.method1852(this.field2889);
        } else if (this.field2890 != -1) {
            var1 = class166.field2154[this.field2890];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2865.length - 1) {
            var2 = this.field2865[var1];
        } else {
            var2 = this.field2865[this.field2865.length - 1];
        }
        return var2 == -1 ? null : method3064(var2);
    }

    @ObfuscatedName("gj.w(IB)Ljava/lang/String;")
    public String method3373(int arg0) {
        String var2 = this.field2885;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class208.method2174(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gj.u(I)Lhs;")
    public class225 method3389() {
        if (this.field2867 < 0) {
            return null;
        }
        class225 var1 = (class225) field2878.method2221((long) this.field2867);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1887(Statics.field2866, this.field2867, 0);
        if (var2 != null) {
            field2878.method2223(var2, (long) this.field2867);
        }
        return var2;
    }

    @ObfuscatedName("gj.y(I)Lhs;")
    public class225 method3375() {
        if (this.field2879 < 0) {
            return null;
        }
        class225 var1 = (class225) field2878.method2221((long) this.field2879);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1887(Statics.field2866, this.field2879, 0);
        if (var2 != null) {
            field2878.method2223(var2, (long) this.field2879);
        }
        return var2;
    }

    @ObfuscatedName("gj.e(I)Lhs;")
    public class225 method3376() {
        if (this.field2880 < 0) {
            return null;
        }
        class225 var1 = (class225) field2878.method2221((long) this.field2880);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1887(Statics.field2866, this.field2880, 0);
        if (var2 != null) {
            field2878.method2223(var2, (long) this.field2880);
        }
        return var2;
    }

    @ObfuscatedName("gj.q(I)Lhs;")
    public class225 method3377() {
        if (this.field2881 < 0) {
            return null;
        }
        class225 var1 = (class225) field2878.method2221((long) this.field2881);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1887(Statics.field2866, this.field2881, 0);
        if (var2 != null) {
            field2878.method2223(var2, (long) this.field2881);
        }
        return var2;
    }

    @ObfuscatedName("gj.v(I)Lhf;")
    public class209 method3378() {
        if (this.field2869 == -1) {
            return null;
        }
        class209 var1 = (class209) field2870.method2221((long) this.field2869);
        if (var1 != null) {
            return var1;
        }
        class209 var2 = class226.method1431(Statics.field2866, Statics.field2888, this.field2869, 0);
        if (var2 != null) {
            field2870.method2223(var2, (long) this.field2869);
        }
        return var2;
    }
}
