package deob;

@ObfuscatedName("gx")
public class class193 extends class425 {

    @ObfuscatedName("gx.x")
    public static class266 field2060 = new class266(64);

    @ObfuscatedName("gx.h")
    public static class266 field2061 = new class266(64);

    @ObfuscatedName("gx.j")
    public static class266 field2062 = new class266(20);

    @ObfuscatedName("gx.s")
    public int field2065 = -1;

    @ObfuscatedName("gx.p")
    public int field2066 = 16777215;

    @ObfuscatedName("gx.b")
    public int field2057 = 70;

    @ObfuscatedName("gx.o")
    public int field2073 = -1;

    @ObfuscatedName("gx.u")
    public int field2067 = -1;

    @ObfuscatedName("gx.z")
    public int field2077 = -1;

    @ObfuscatedName("gx.t")
    public int field2071 = -1;

    @ObfuscatedName("gx.w")
    public int field2075 = 0;

    @ObfuscatedName("gx.m")
    public int field2080 = 0;

    @ObfuscatedName("gx.q")
    public int field2074 = -1;

    @ObfuscatedName("gx.i")
    public String field2072 = "";

    @ObfuscatedName("gx.e")
    public int field2068 = -1;

    @ObfuscatedName("gx.g")
    public int field2069 = 0;

    @ObfuscatedName("gx.k")
    public int[] field2078;

    @ObfuscatedName("gx.v")
    public int field2079 = -1;

    @ObfuscatedName("gx.aj")
    public int field2070 = -1;

    @ObfuscatedName("et.a(Llg;Llg;Llg;I)V")
    public static void method2865(class330 arg0, class330 arg1, class330 arg2) {
        Statics.field2076 = arg0;
        Statics.field2058 = arg1;
        Statics.field2059 = arg2;
    }

    @ObfuscatedName("fm.f(IB)Lgx;")
    public static class193 method2979(int arg0) {
        class193 var1 = (class193) field2060.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2076.method5859(32, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3369(new class464(var2));
        }
        field2060.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gx.c(Lqr;I)V")
    public void method3369(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3373(arg0, var2);
        }
    }

    @ObfuscatedName("gx.x(Lqr;IB)V")
    public void method3373(class464 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2065 = arg0.method7734();
        } else if (arg1 == 2) {
            this.field2066 = arg0.method7906();
        } else if (arg1 == 3) {
            this.field2073 = arg0.method7734();
        } else if (arg1 == 4) {
            this.field2077 = arg0.method7734();
        } else if (arg1 == 5) {
            this.field2067 = arg0.method7734();
        } else if (arg1 == 6) {
            this.field2071 = arg0.method7734();
        } else if (arg1 == 7) {
            this.field2075 = arg0.method7798();
        } else if (arg1 == 8) {
            this.field2072 = arg0.method7726();
        } else if (arg1 == 9) {
            this.field2057 = arg0.method7716();
        } else if (arg1 == 10) {
            this.field2080 = arg0.method7798();
        } else if (arg1 == 11) {
            this.field2074 = 0;
        } else if (arg1 == 12) {
            this.field2068 = arg0.method7735();
        } else if (arg1 == 13) {
            this.field2069 = arg0.method7798();
        } else if (arg1 == 14) {
            this.field2074 = arg0.method7716();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2079 = arg0.method7716();
            if (this.field2079 == 65535) {
                this.field2079 = -1;
            }
            this.field2070 = arg0.method7716();
            if (this.field2070 == 65535) {
                this.field2070 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method7716();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method7735();
            this.field2078 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2078[var5] = arg0.method7716();
                if (this.field2078[var5] == 65535) {
                    this.field2078[var5] = -1;
                }
            }
            this.field2078[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gx.h(I)Lgx;")
    public final class193 method3368() {
        int var1 = -1;
        if (this.field2079 != -1) {
            var1 = class293.method1999(this.field2079);
        } else if (this.field2070 != -1) {
            var1 = class293.field3391[this.field2070];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2078.length - 1) {
            var2 = this.field2078[var1];
        } else {
            var2 = this.field2078[this.field2078.length - 1];
        }
        return var2 == -1 ? null : method2979(var2);
    }

    @ObfuscatedName("gx.j(IB)Ljava/lang/String;")
    public String method3376(int arg0) {
        String var2 = this.field2072;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class358.method324(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gx.y(I)Lri;")
    public class477 method3393() {
        if (this.field2073 < 0) {
            return null;
        }
        class477 var1 = (class477) field2061.method4839((long) this.field2073);
        if (var1 != null) {
            return var1;
        }
        class477 var2 = class478.method6659(Statics.field2058, this.field2073, 0);
        if (var2 != null) {
            field2061.method4834(var2, (long) this.field2073);
        }
        return var2;
    }

    @ObfuscatedName("gx.d(I)Lri;")
    public class477 method3383() {
        if (this.field2067 < 0) {
            return null;
        }
        class477 var1 = (class477) field2061.method4839((long) this.field2067);
        if (var1 != null) {
            return var1;
        }
        class477 var2 = class478.method6659(Statics.field2058, this.field2067, 0);
        if (var2 != null) {
            field2061.method4834(var2, (long) this.field2067);
        }
        return var2;
    }

    @ObfuscatedName("gx.n(B)Lri;")
    public class477 method3375() {
        if (this.field2077 < 0) {
            return null;
        }
        class477 var1 = (class477) field2061.method4839((long) this.field2077);
        if (var1 != null) {
            return var1;
        }
        class477 var2 = class478.method6659(Statics.field2058, this.field2077, 0);
        if (var2 != null) {
            field2061.method4834(var2, (long) this.field2077);
        }
        return var2;
    }

    @ObfuscatedName("gx.r(S)Lri;")
    public class477 method3402() {
        if (this.field2071 < 0) {
            return null;
        }
        class477 var1 = (class477) field2061.method4839((long) this.field2071);
        if (var1 != null) {
            return var1;
        }
        class477 var2 = class478.method6659(Statics.field2058, this.field2071, 0);
        if (var2 != null) {
            field2061.method4834(var2, (long) this.field2071);
        }
        return var2;
    }

    @ObfuscatedName("gx.l(I)Lnl;")
    public class365 method3377() {
        if (this.field2065 == -1) {
            return null;
        }
        class365 var1 = (class365) field2062.method4839((long) this.field2065);
        if (var1 != null) {
            return var1;
        }
        class365 var2 = class478.method6579(Statics.field2058, Statics.field2059, this.field2065, 0);
        if (var2 != null) {
            field2062.method4834(var2, (long) this.field2065);
        }
        return var2;
    }
}
