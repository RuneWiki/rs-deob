package deob;

@ObfuscatedName("gp")
public class class197 extends class130 {

    @ObfuscatedName("gp.r")
    public static class125 field2858 = new class125(64);

    @ObfuscatedName("gp.w")
    public static class125 field2854 = new class125(64);

    @ObfuscatedName("gp.j")
    public static class125 field2855 = new class125(20);

    @ObfuscatedName("gp.g")
    public int field2857 = -1;

    @ObfuscatedName("gp.i")
    public int field2873 = 16777215;

    @ObfuscatedName("gp.v")
    public int field2859 = 70;

    @ObfuscatedName("gp.a")
    public int field2860 = -1;

    @ObfuscatedName("gp.h")
    public int field2861 = -1;

    @ObfuscatedName("gp.p")
    public int field2870 = -1;

    @ObfuscatedName("gp.t")
    public int field2863 = -1;

    @ObfuscatedName("gp.f")
    public int field2864 = 0;

    @ObfuscatedName("gp.z")
    public int field2862 = 0;

    @ObfuscatedName("gp.u")
    public int field2866 = -1;

    @ObfuscatedName("gp.b")
    public String field2865 = "";

    @ObfuscatedName("gp.m")
    public int field2868 = -1;

    @ObfuscatedName("gp.e")
    public int field2869 = 0;

    @ObfuscatedName("gp.l")
    public int[] field2871;

    @ObfuscatedName("gp.x")
    public int field2852 = -1;

    @ObfuscatedName("gp.ap")
    public int field2867 = -1;

    @ObfuscatedName("fh.k(Lgh;Lgh;Lgh;S)V")
    public static void method3005(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field2872 = arg0;
        Statics.field2851 = arg1;
        Statics.field2853 = arg2;
    }

    @ObfuscatedName("eb.y(II)Lgp;")
    public static class197 method2653(int arg0) {
        class197 var1 = (class197) field2858.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2872.method3065(32, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3364(new class161(var2));
        }
        field2858.method2164(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gp.o(Lfm;B)V")
    public void method3364(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3347(arg0, var2);
        }
    }

    @ObfuscatedName("gp.r(Lfm;IB)V")
    public void method3347(class161 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2857 = arg0.method2902();
        } else if (arg1 == 2) {
            this.field2873 = arg0.method2876();
        } else if (arg1 == 3) {
            this.field2860 = arg0.method2902();
        } else if (arg1 == 4) {
            this.field2870 = arg0.method2902();
        } else if (arg1 == 5) {
            this.field2861 = arg0.method2902();
        } else if (arg1 == 6) {
            this.field2863 = arg0.method2902();
        } else if (arg1 == 7) {
            this.field2864 = arg0.method2736();
        } else if (arg1 == 8) {
            this.field2865 = arg0.method2724();
        } else if (arg1 == 9) {
            this.field2859 = arg0.method2735();
        } else if (arg1 == 10) {
            this.field2862 = arg0.method2736();
        } else if (arg1 == 11) {
            this.field2866 = 0;
        } else if (arg1 == 12) {
            this.field2868 = arg0.method2733();
        } else if (arg1 == 13) {
            this.field2869 = arg0.method2736();
        } else if (arg1 == 14) {
            this.field2866 = arg0.method2735();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2852 = arg0.method2735();
            if (this.field2852 == 65535) {
                this.field2852 = -1;
            }
            this.field2867 = arg0.method2735();
            if (this.field2867 == 65535) {
                this.field2867 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2735();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2733();
            this.field2871 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2871[var5] = arg0.method2735();
                if (this.field2871[var5] == 65535) {
                    this.field2871[var5] = -1;
                }
            }
            this.field2871[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gp.w(I)Lgp;")
    public final class197 method3348() {
        int var1 = -1;
        if (this.field2852 != -1) {
            var1 = class147.method128(this.field2852);
        } else if (this.field2867 != -1) {
            var1 = class147.field2012[this.field2867];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2871.length - 1) {
            var2 = this.field2871[var1];
        } else {
            var2 = this.field2871[this.field2871.length - 1];
        }
        return var2 == -1 ? null : method2653(var2);
    }

    @ObfuscatedName("gp.j(II)Ljava/lang/String;")
    public String method3349(int arg0) {
        String var2 = this.field2865;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class208.method207(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gp.c(I)Lhv;")
    public class225 method3369() {
        if (this.field2860 < 0) {
            return null;
        }
        class225 var1 = (class225) field2854.method2159((long) this.field2860);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1109(Statics.field2851, this.field2860, 0);
        if (var2 != null) {
            field2854.method2164(var2, (long) this.field2860);
        }
        return var2;
    }

    @ObfuscatedName("gp.g(B)Lhv;")
    public class225 method3351() {
        if (this.field2861 < 0) {
            return null;
        }
        class225 var1 = (class225) field2854.method2159((long) this.field2861);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1109(Statics.field2851, this.field2861, 0);
        if (var2 != null) {
            field2854.method2164(var2, (long) this.field2861);
        }
        return var2;
    }

    @ObfuscatedName("gp.i(B)Lhv;")
    public class225 method3352() {
        if (this.field2870 < 0) {
            return null;
        }
        class225 var1 = (class225) field2854.method2159((long) this.field2870);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1109(Statics.field2851, this.field2870, 0);
        if (var2 != null) {
            field2854.method2164(var2, (long) this.field2870);
        }
        return var2;
    }

    @ObfuscatedName("gp.v(I)Lhv;")
    public class225 method3353() {
        if (this.field2863 < 0) {
            return null;
        }
        class225 var1 = (class225) field2854.method2159((long) this.field2863);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1109(Statics.field2851, this.field2863, 0);
        if (var2 != null) {
            field2854.method2164(var2, (long) this.field2863);
        }
        return var2;
    }

    @ObfuscatedName("gp.a(I)Lhm;")
    public class209 method3370() {
        if (this.field2857 == -1) {
            return null;
        }
        class209 var1 = (class209) field2855.method2159((long) this.field2857);
        if (var1 != null) {
            return var1;
        }
        class209 var2 = class226.method802(Statics.field2851, Statics.field2853, this.field2857, 0);
        if (var2 != null) {
            field2855.method2164(var2, (long) this.field2857);
        }
        return var2;
    }
}
