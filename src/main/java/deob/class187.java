package deob;

@ObfuscatedName("gk")
public class class187 extends class406 {

    @ObfuscatedName("gk.k")
    public static class257 field2057 = new class257(64);

    @ObfuscatedName("gk.a")
    public static class257 field2067 = new class257(64);

    @ObfuscatedName("gk.m")
    public static class257 field2066 = new class257(20);

    @ObfuscatedName("gk.c")
    public int field2060 = -1;

    @ObfuscatedName("gk.w")
    public int field2061 = 16777215;

    @ObfuscatedName("gk.b")
    public int field2072 = 70;

    @ObfuscatedName("gk.t")
    public int field2063 = -1;

    @ObfuscatedName("gk.g")
    public int field2068 = -1;

    @ObfuscatedName("gk.x")
    public int field2065 = -1;

    @ObfuscatedName("gk.n")
    public int field2055 = -1;

    @ObfuscatedName("gk.e")
    public int field2056 = 0;

    @ObfuscatedName("gk.h")
    public int field2075 = 0;

    @ObfuscatedName("gk.f")
    public int field2073 = -1;

    @ObfuscatedName("gk.d")
    public String field2070 = "";

    @ObfuscatedName("gk.j")
    public int field2071 = -1;

    @ObfuscatedName("gk.z")
    public int field2069 = 0;

    @ObfuscatedName("gk.i")
    public int[] field2064;

    @ObfuscatedName("gk.u")
    public int field2074 = -1;

    @ObfuscatedName("gk.ag")
    public int field2058 = -1;

    @ObfuscatedName("aj.o(Llp;Llp;Llp;I)V")
    public static void method498(class316 arg0, class316 arg1, class316 arg2) {
        Statics.field2062 = arg0;
        Statics.field2655 = arg1;
        Statics.field1 = arg2;
    }

    @ObfuscatedName("cp.q(II)Lgk;")
    public static class187 method2428(int arg0) {
        class187 var1 = (class187) field2057.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2062.method5249(32, arg0);
        class187 var3 = new class187();
        if (var2 != null) {
            var3.method3263(new class440(var2));
        }
        field2057.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gk.l(Lpx;I)V")
    public void method3263(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method3233(arg0, var2);
        }
    }

    @ObfuscatedName("gk.k(Lpx;II)V")
    public void method3233(class440 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2060 = arg0.method6910();
        } else if (arg1 == 2) {
            this.field2061 = arg0.method6897();
        } else if (arg1 == 3) {
            this.field2063 = arg0.method6910();
        } else if (arg1 == 4) {
            this.field2065 = arg0.method6910();
        } else if (arg1 == 5) {
            this.field2068 = arg0.method6910();
        } else if (arg1 == 6) {
            this.field2055 = arg0.method6910();
        } else if (arg1 == 7) {
            this.field2056 = arg0.method6896();
        } else if (arg1 == 8) {
            this.field2070 = arg0.method6904();
        } else if (arg1 == 9) {
            this.field2072 = arg0.method7082();
        } else if (arg1 == 10) {
            this.field2075 = arg0.method6896();
        } else if (arg1 == 11) {
            this.field2073 = 0;
        } else if (arg1 == 12) {
            this.field2071 = arg0.method7071();
        } else if (arg1 == 13) {
            this.field2069 = arg0.method6896();
        } else if (arg1 == 14) {
            this.field2073 = arg0.method7082();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2074 = arg0.method7082();
            if (this.field2074 == 65535) {
                this.field2074 = -1;
            }
            this.field2058 = arg0.method7082();
            if (this.field2058 == 65535) {
                this.field2058 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method7082();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method7071();
            this.field2064 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2064[var5] = arg0.method7082();
                if (this.field2064[var5] == 65535) {
                    this.field2064[var5] = -1;
                }
            }
            this.field2064[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gk.a(I)Lgk;")
    public final class187 method3234() {
        int var1 = -1;
        if (this.field2074 != -1) {
            var1 = class289.method241(this.field2074);
        } else if (this.field2058 != -1) {
            var1 = class289.field3348[this.field2058];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2064.length - 1) {
            var2 = this.field2064[var1];
        } else {
            var2 = this.field2064[this.field2064.length - 1];
        }
        return var2 == -1 ? null : method2428(var2);
    }

    @ObfuscatedName("gk.m(II)Ljava/lang/String;")
    public String method3251(int arg0) {
        String var2 = this.field2070;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class344.method1032(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gk.p(B)Lqr;")
    public class453 method3236() {
        if (this.field2063 < 0) {
            return null;
        }
        class453 var1 = (class453) field2067.method4566((long) this.field2063);
        if (var1 != null) {
            return var1;
        }
        class453 var2 = class454.method3230(Statics.field2655, this.field2063, 0);
        if (var2 != null) {
            field2067.method4571(var2, (long) this.field2063);
        }
        return var2;
    }

    @ObfuscatedName("gk.s(I)Lqr;")
    public class453 method3239() {
        if (this.field2068 < 0) {
            return null;
        }
        class453 var1 = (class453) field2067.method4566((long) this.field2068);
        if (var1 != null) {
            return var1;
        }
        class453 var2 = class454.method3230(Statics.field2655, this.field2068, 0);
        if (var2 != null) {
            field2067.method4571(var2, (long) this.field2068);
        }
        return var2;
    }

    @ObfuscatedName("gk.r(B)Lqr;")
    public class453 method3238() {
        if (this.field2065 < 0) {
            return null;
        }
        class453 var1 = (class453) field2067.method4566((long) this.field2065);
        if (var1 != null) {
            return var1;
        }
        class453 var2 = class454.method3230(Statics.field2655, this.field2065, 0);
        if (var2 != null) {
            field2067.method4571(var2, (long) this.field2065);
        }
        return var2;
    }

    @ObfuscatedName("gk.v(I)Lqr;")
    public class453 method3264() {
        if (this.field2055 < 0) {
            return null;
        }
        class453 var1 = (class453) field2067.method4566((long) this.field2055);
        if (var1 != null) {
            return var1;
        }
        class453 var2 = class454.method3230(Statics.field2655, this.field2055, 0);
        if (var2 != null) {
            field2067.method4571(var2, (long) this.field2055);
        }
        return var2;
    }

    @ObfuscatedName("gk.y(I)Lmx;")
    public class350 method3240() {
        if (this.field2060 == -1) {
            return null;
        }
        class350 var1 = (class350) field2066.method4566((long) this.field2060);
        if (var1 != null) {
            return var1;
        }
        class350 var2 = class454.method6208(Statics.field2655, Statics.field1, this.field2060, 0);
        if (var2 != null) {
            field2066.method4571(var2, (long) this.field2060);
        }
        return var2;
    }

    @ObfuscatedName("ad.c(I)V")
    public static void method752() {
        field2057.method4569();
        field2067.method4569();
        field2066.method4569();
    }
}
