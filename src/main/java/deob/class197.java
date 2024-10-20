package deob;

@ObfuscatedName("gz")
public class class197 extends class130 {

    @ObfuscatedName("gz.a")
    public static class125 field2855 = new class125(64);

    @ObfuscatedName("gz.f")
    public static class125 field2856 = new class125(64);

    @ObfuscatedName("gz.c")
    public static class125 field2857 = new class125(20);

    @ObfuscatedName("gz.m")
    public int field2854 = -1;

    @ObfuscatedName("gz.q")
    public int field2863 = 16777215;

    @ObfuscatedName("gz.e")
    public int field2874 = 70;

    @ObfuscatedName("gz.v")
    public int field2864 = -1;

    @ObfuscatedName("gz.j")
    public int field2866 = -1;

    @ObfuscatedName("gz.p")
    public int field2867 = -1;

    @ObfuscatedName("gz.k")
    public int field2853 = -1;

    @ObfuscatedName("gz.r")
    public int field2869 = 0;

    @ObfuscatedName("gz.y")
    public int field2870 = 0;

    @ObfuscatedName("gz.h")
    public int field2871 = -1;

    @ObfuscatedName("gz.s")
    public String field2872 = "";

    @ObfuscatedName("gz.w")
    public int field2868 = -1;

    @ObfuscatedName("gz.n")
    public int field2858 = 0;

    @ObfuscatedName("gz.o")
    public int[] field2875;

    @ObfuscatedName("gz.b")
    public int field2876 = -1;

    @ObfuscatedName("gz.aj")
    public int field2877 = -1;

    @ObfuscatedName("ah.u(Lgt;Lgt;Lgt;I)V")
    public static void method697(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field2862 = arg0;
        Statics.field2852 = arg1;
        Statics.field2861 = arg2;
    }

    @ObfuscatedName("br.x(II)Lgz;")
    public static class197 method1089(int arg0) {
        class197 var1 = (class197) field2855.method2186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2862.method3071(32, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3385(new class154(var2));
        }
        field2855.method2179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gz.i(Len;I)V")
    public void method3385(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3381(arg0, var2);
        }
    }

    @ObfuscatedName("gz.a(Len;II)V")
    public void method3381(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2854 = arg0.method2603();
        } else if (arg1 == 2) {
            this.field2863 = arg0.method2599();
        } else if (arg1 == 3) {
            this.field2864 = arg0.method2603();
        } else if (arg1 == 4) {
            this.field2867 = arg0.method2603();
        } else if (arg1 == 5) {
            this.field2866 = arg0.method2603();
        } else if (arg1 == 6) {
            this.field2853 = arg0.method2603();
        } else if (arg1 == 7) {
            this.field2869 = arg0.method2781();
        } else if (arg1 == 8) {
            this.field2872 = arg0.method2597();
        } else if (arg1 == 9) {
            this.field2874 = arg0.method2581();
        } else if (arg1 == 10) {
            this.field2870 = arg0.method2781();
        } else if (arg1 == 11) {
            this.field2871 = 0;
        } else if (arg1 == 12) {
            this.field2868 = arg0.method2708();
        } else if (arg1 == 13) {
            this.field2858 = arg0.method2781();
        } else if (arg1 == 14) {
            this.field2871 = arg0.method2581();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2876 = arg0.method2581();
            if (this.field2876 == 65535) {
                this.field2876 = -1;
            }
            this.field2877 = arg0.method2581();
            if (this.field2877 == 65535) {
                this.field2877 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2581();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2708();
            this.field2875 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2875[var5] = arg0.method2581();
                if (this.field2875[var5] == 65535) {
                    this.field2875[var5] = -1;
                }
            }
            this.field2875[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gz.c(I)Lgz;")
    public final class197 method3349() {
        int var1 = -1;
        if (this.field2876 != -1) {
            var1 = class166.method1810(this.field2876);
        } else if (this.field2877 != -1) {
            var1 = class166.field2147[this.field2877];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2875.length - 1) {
            var2 = this.field2875[var1];
        } else {
            var2 = this.field2875[this.field2875.length - 1];
        }
        return var2 == -1 ? null : method1089(var2);
    }

    @ObfuscatedName("gz.g(II)Ljava/lang/String;")
    public String method3348(int arg0) {
        String var2 = this.field2872;
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

    @ObfuscatedName("gz.z(B)Lhs;")
    public class225 method3351() {
        if (this.field2864 < 0) {
            return null;
        }
        class225 var1 = (class225) field2856.method2186((long) this.field2864);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1340(Statics.field2852, this.field2864, 0);
        if (var2 != null) {
            field2856.method2179(var2, (long) this.field2864);
        }
        return var2;
    }

    @ObfuscatedName("gz.t(B)Lhs;")
    public class225 method3352() {
        if (this.field2866 < 0) {
            return null;
        }
        class225 var1 = (class225) field2856.method2186((long) this.field2866);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1340(Statics.field2852, this.field2866, 0);
        if (var2 != null) {
            field2856.method2179(var2, (long) this.field2866);
        }
        return var2;
    }

    @ObfuscatedName("gz.m(I)Lhs;")
    public class225 method3353() {
        if (this.field2867 < 0) {
            return null;
        }
        class225 var1 = (class225) field2856.method2186((long) this.field2867);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1340(Statics.field2852, this.field2867, 0);
        if (var2 != null) {
            field2856.method2179(var2, (long) this.field2867);
        }
        return var2;
    }

    @ObfuscatedName("gz.q(I)Lhs;")
    public class225 method3354() {
        if (this.field2853 < 0) {
            return null;
        }
        class225 var1 = (class225) field2856.method2186((long) this.field2853);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1340(Statics.field2852, this.field2853, 0);
        if (var2 != null) {
            field2856.method2179(var2, (long) this.field2853);
        }
        return var2;
    }

    @ObfuscatedName("gz.e(B)Lhb;")
    public class209 method3383() {
        if (this.field2854 == -1) {
            return null;
        }
        class209 var1 = (class209) field2857.method2186((long) this.field2854);
        if (var1 != null) {
            return var1;
        }
        class209 var2 = class226.method1081(Statics.field2852, Statics.field2861, this.field2854, 0);
        if (var2 != null) {
            field2857.method2179(var2, (long) this.field2854);
        }
        return var2;
    }
}
