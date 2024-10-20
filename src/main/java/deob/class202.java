package deob;

@ObfuscatedName("gb")
public class class202 extends class151 {

    @ObfuscatedName("gb.q")
    public static class146 field2923 = new class146(64);

    @ObfuscatedName("gb.t")
    public static class146 field2922 = new class146(64);

    @ObfuscatedName("gb.p")
    public static class146 field2909 = new class146(20);

    @ObfuscatedName("gb.w")
    public int field2905 = -1;

    @ObfuscatedName("gb.r")
    public int field2906 = 16777215;

    @ObfuscatedName("gb.s")
    public int field2907 = 70;

    @ObfuscatedName("gb.k")
    public int field2908 = -1;

    @ObfuscatedName("gb.e")
    public int field2920 = -1;

    @ObfuscatedName("gb.j")
    public int field2910 = -1;

    @ObfuscatedName("gb.i")
    public int field2911 = -1;

    @ObfuscatedName("gb.a")
    public int field2912 = 0;

    @ObfuscatedName("gb.x")
    public int field2913 = 0;

    @ObfuscatedName("gb.h")
    public int field2914 = -1;

    @ObfuscatedName("gb.b")
    public String field2897 = "";

    @ObfuscatedName("gb.f")
    public int field2916 = -1;

    @ObfuscatedName("gb.o")
    public int field2900 = 0;

    @ObfuscatedName("gb.m")
    public int[] field2918;

    @ObfuscatedName("gb.y")
    public int field2899 = -1;

    @ObfuscatedName("gb.am")
    public int field2901 = -1;

    @ObfuscatedName("gf.d(IB)Lgb;")
    public static class202 method3173(int arg0) {
        class202 var1 = (class202) field2923.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2921.method3129(32, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3430(new class130(var2));
        }
        field2923.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gb.c(Ldu;B)V")
    public void method3430(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3431(arg0, var2);
        }
    }

    @ObfuscatedName("gb.n(Ldu;II)V")
    public void method3431(class130 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2905 = arg0.method2244();
        } else if (arg1 == 2) {
            this.field2906 = arg0.method2233();
        } else if (arg1 == 3) {
            this.field2908 = arg0.method2244();
        } else if (arg1 == 4) {
            this.field2910 = arg0.method2244();
        } else if (arg1 == 5) {
            this.field2920 = arg0.method2244();
        } else if (arg1 == 6) {
            this.field2911 = arg0.method2244();
        } else if (arg1 == 7) {
            this.field2912 = arg0.method2254();
        } else if (arg1 == 8) {
            this.field2897 = arg0.method2277();
        } else if (arg1 == 9) {
            this.field2907 = arg0.method2232();
        } else if (arg1 == 10) {
            this.field2913 = arg0.method2254();
        } else if (arg1 == 11) {
            this.field2914 = 0;
        } else if (arg1 == 12) {
            this.field2916 = arg0.method2379();
        } else if (arg1 == 13) {
            this.field2900 = arg0.method2254();
        } else if (arg1 == 14) {
            this.field2914 = arg0.method2232();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2899 = arg0.method2232();
            if (this.field2899 == 65535) {
                this.field2899 = -1;
            }
            this.field2901 = arg0.method2232();
            if (this.field2901 == 65535) {
                this.field2901 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2232();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2379();
            this.field2918 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2918[var5] = arg0.method2232();
                if (this.field2918[var5] == 65535) {
                    this.field2918[var5] = -1;
                }
            }
            this.field2918[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gb.q(B)Lgb;")
    public final class202 method3460() {
        int var1 = -1;
        if (this.field2899 != -1) {
            var1 = class168.method1112(this.field2899);
        } else if (this.field2901 != -1) {
            var1 = class168.field2174[this.field2901];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2918.length - 1) {
            var2 = this.field2918[var1];
        } else {
            var2 = this.field2918[this.field2918.length - 1];
        }
        return var2 == -1 ? null : method3173(var2);
    }

    @ObfuscatedName("gb.t(II)Ljava/lang/String;")
    public String method3440(int arg0) {
        String var2 = this.field2897;
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

    @ObfuscatedName("gb.p(I)Lhu;")
    public class229 method3459() {
        if (this.field2908 < 0) {
            return null;
        }
        class229 var1 = (class229) field2922.method2598((long) this.field2908);
        if (var1 != null) {
            return var1;
        }
        class229 var2 = class230.method204(Statics.field2919, this.field2908, 0);
        if (var2 != null) {
            field2922.method2607(var2, (long) this.field2908);
        }
        return var2;
    }

    @ObfuscatedName("gb.u(B)Lhu;")
    public class229 method3434() {
        if (this.field2920 < 0) {
            return null;
        }
        class229 var1 = (class229) field2922.method2598((long) this.field2920);
        if (var1 != null) {
            return var1;
        }
        class229 var2 = class230.method204(Statics.field2919, this.field2920, 0);
        if (var2 != null) {
            field2922.method2607(var2, (long) this.field2920);
        }
        return var2;
    }

    @ObfuscatedName("gb.w(I)Lhu;")
    public class229 method3455() {
        if (this.field2910 < 0) {
            return null;
        }
        class229 var1 = (class229) field2922.method2598((long) this.field2910);
        if (var1 != null) {
            return var1;
        }
        class229 var2 = class230.method204(Statics.field2919, this.field2910, 0);
        if (var2 != null) {
            field2922.method2607(var2, (long) this.field2910);
        }
        return var2;
    }

    @ObfuscatedName("gb.r(B)Lhu;")
    public class229 method3444() {
        if (this.field2911 < 0) {
            return null;
        }
        class229 var1 = (class229) field2922.method2598((long) this.field2911);
        if (var1 != null) {
            return var1;
        }
        class229 var2 = class230.method204(Statics.field2919, this.field2911, 0);
        if (var2 != null) {
            field2922.method2607(var2, (long) this.field2911);
        }
        return var2;
    }

    @ObfuscatedName("gb.s(I)Lgo;")
    public class208 method3437() {
        if (this.field2905 == -1) {
            return null;
        }
        class208 var1 = (class208) field2909.method2598((long) this.field2905);
        if (var1 != null) {
            return var1;
        }
        class208 var2 = class230.method1483(Statics.field2919, Statics.field2898, this.field2905, 0);
        if (var2 != null) {
            field2909.method2607(var2, (long) this.field2905);
        }
        return var2;
    }
}
