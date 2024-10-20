package deob;

@ObfuscatedName("gu")
public class class197 extends class130 {

    @ObfuscatedName("gu.l")
    public static class125 field2880 = new class125(64);

    @ObfuscatedName("gu.y")
    public static class125 field2881 = new class125(64);

    @ObfuscatedName("gu.j")
    public static class125 field2882 = new class125(20);

    @ObfuscatedName("gu.f")
    public int field2884 = -1;

    @ObfuscatedName("gu.a")
    public int field2899 = 16777215;

    @ObfuscatedName("gu.v")
    public int field2886 = 70;

    @ObfuscatedName("gu.d")
    public int field2897 = -1;

    @ObfuscatedName("gu.o")
    public int field2894 = -1;

    @ObfuscatedName("gu.q")
    public int field2889 = -1;

    @ObfuscatedName("gu.i")
    public int field2890 = -1;

    @ObfuscatedName("gu.x")
    public int field2891 = 0;

    @ObfuscatedName("gu.z")
    public int field2892 = 0;

    @ObfuscatedName("gu.n")
    public int field2893 = -1;

    @ObfuscatedName("gu.w")
    public String field2900 = "";

    @ObfuscatedName("gu.h")
    public int field2895 = -1;

    @ObfuscatedName("gu.u")
    public int field2888 = 0;

    @ObfuscatedName("gu.m")
    public int[] field2877;

    @ObfuscatedName("gu.p")
    public int field2898 = -1;

    @ObfuscatedName("gu.aq")
    public int field2885 = -1;

    @ObfuscatedName("eb.b(II)Lgu;")
    public static class197 method2512(int arg0) {
        class197 var1 = (class197) field2880.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2887.method3126(32, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3398(new class154(var2));
        }
        field2880.method2250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gu.e(Lec;I)V")
    public void method3398(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3399(arg0, var2);
        }
    }

    @ObfuscatedName("gu.c(Lec;IB)V")
    public void method3399(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2884 = arg0.method2684();
        } else if (arg1 == 2) {
            this.field2899 = arg0.method2689();
        } else if (arg1 == 3) {
            this.field2897 = arg0.method2684();
        } else if (arg1 == 4) {
            this.field2889 = arg0.method2684();
        } else if (arg1 == 5) {
            this.field2894 = arg0.method2684();
        } else if (arg1 == 6) {
            this.field2890 = arg0.method2684();
        } else if (arg1 == 7) {
            this.field2891 = arg0.method2699();
        } else if (arg1 == 8) {
            this.field2900 = arg0.method2678();
        } else if (arg1 == 9) {
            this.field2886 = arg0.method2671();
        } else if (arg1 == 10) {
            this.field2892 = arg0.method2699();
        } else if (arg1 == 11) {
            this.field2893 = 0;
        } else if (arg1 == 12) {
            this.field2895 = arg0.method2669();
        } else if (arg1 == 13) {
            this.field2888 = arg0.method2699();
        } else if (arg1 == 14) {
            this.field2893 = arg0.method2671();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2898 = arg0.method2671();
            if (this.field2898 == 65535) {
                this.field2898 = -1;
            }
            this.field2885 = arg0.method2671();
            if (this.field2885 == 65535) {
                this.field2885 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2671();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2669();
            this.field2877 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2877[var5] = arg0.method2671();
                if (this.field2877[var5] == 65535) {
                    this.field2877[var5] = -1;
                }
            }
            this.field2877[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gu.l(B)Lgu;")
    public final class197 method3400() {
        int var1 = -1;
        if (this.field2898 != -1) {
            var1 = class166.method916(this.field2898);
        } else if (this.field2885 != -1) {
            var1 = class166.field2158[this.field2885];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2877.length - 1) {
            var2 = this.field2877[var1];
        } else {
            var2 = this.field2877[this.field2877.length - 1];
        }
        return var2 == -1 ? null : method2512(var2);
    }

    @ObfuscatedName("gu.y(II)Ljava/lang/String;")
    public String method3429(int arg0) {
        String var2 = this.field2900;
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

    @ObfuscatedName("gu.j(B)Lhg;")
    public class225 method3417() {
        if (this.field2897 < 0) {
            return null;
        }
        class225 var1 = (class225) field2881.method2246((long) this.field2897);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2507(Statics.field2878, this.field2897, 0);
        if (var2 != null) {
            field2881.method2250(var2, (long) this.field2897);
        }
        return var2;
    }

    @ObfuscatedName("gu.t(I)Lhg;")
    public class225 method3403() {
        if (this.field2894 < 0) {
            return null;
        }
        class225 var1 = (class225) field2881.method2246((long) this.field2894);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2507(Statics.field2878, this.field2894, 0);
        if (var2 != null) {
            field2881.method2250(var2, (long) this.field2894);
        }
        return var2;
    }

    @ObfuscatedName("gu.k(I)Lhg;")
    public class225 method3401() {
        if (this.field2889 < 0) {
            return null;
        }
        class225 var1 = (class225) field2881.method2246((long) this.field2889);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2507(Statics.field2878, this.field2889, 0);
        if (var2 != null) {
            field2881.method2250(var2, (long) this.field2889);
        }
        return var2;
    }

    @ObfuscatedName("gu.f(I)Lhg;")
    public class225 method3405() {
        if (this.field2890 < 0) {
            return null;
        }
        class225 var1 = (class225) field2881.method2246((long) this.field2890);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2507(Statics.field2878, this.field2890, 0);
        if (var2 != null) {
            field2881.method2250(var2, (long) this.field2890);
        }
        return var2;
    }

    @ObfuscatedName("gu.a(I)Lhj;")
    public class209 method3406() {
        if (this.field2884 == -1) {
            return null;
        }
        class209 var1 = (class209) field2882.method2246((long) this.field2884);
        if (var1 != null) {
            return var1;
        }
        class183 var2 = Statics.field2878;
        class183 var3 = Statics.field2879;
        int var4 = this.field2884;
        class209 var5;
        if (class226.method196(var2, var4, 0)) {
            var5 = class226.method2570(var3.method3126(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field2882.method2250(var5, (long) this.field2884);
        }
        return var5;
    }

    @ObfuscatedName("cg.v(B)V")
    public static void method1898() {
        field2880.method2249();
        field2881.method2249();
        field2882.method2249();
    }
}
