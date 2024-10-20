package deob;

@ObfuscatedName("gx")
public class class187 extends class407 {

    @ObfuscatedName("gx.n")
    public static class257 field2045 = new class257(64);

    @ObfuscatedName("gx.k")
    public static class257 field2047 = new class257(64);

    @ObfuscatedName("gx.w")
    public static class257 field2048 = new class257(20);

    @ObfuscatedName("gx.v")
    public int field2046 = -1;

    @ObfuscatedName("gx.h")
    public int field2051 = 16777215;

    @ObfuscatedName("gx.t")
    public int field2052 = 70;

    @ObfuscatedName("gx.u")
    public int field2053 = -1;

    @ObfuscatedName("gx.d")
    public int field2049 = -1;

    @ObfuscatedName("gx.b")
    public int field2055 = -1;

    @ObfuscatedName("gx.a")
    public int field2056 = -1;

    @ObfuscatedName("gx.l")
    public int field2057 = 0;

    @ObfuscatedName("gx.e")
    public int field2058 = 0;

    @ObfuscatedName("gx.g")
    public int field2065 = -1;

    @ObfuscatedName("gx.y")
    public String field2060 = "";

    @ObfuscatedName("gx.i")
    public int field2061 = -1;

    @ObfuscatedName("gx.r")
    public int field2054 = 0;

    @ObfuscatedName("gx.z")
    public int[] field2059;

    @ObfuscatedName("gx.o")
    public int field2064 = -1;

    @ObfuscatedName("gx.as")
    public int field2063 = -1;

    @ObfuscatedName("dm.c(IB)Lgx;")
    public static class187 method2834(int arg0) {
        class187 var1 = (class187) field2045.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2062.method5499(32, arg0);
        class187 var3 = new class187();
        if (var2 != null) {
            var3.method3383(new class445(var2));
        }
        field2045.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gx.p(Lqq;I)V")
    public void method3383(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3402(arg0, var2);
        }
    }

    @ObfuscatedName("gx.f(Lqq;II)V")
    public void method3402(class445 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2046 = arg0.method7301();
        } else if (arg1 == 2) {
            this.field2051 = arg0.method7340();
        } else if (arg1 == 3) {
            this.field2053 = arg0.method7301();
        } else if (arg1 == 4) {
            this.field2055 = arg0.method7301();
        } else if (arg1 == 5) {
            this.field2049 = arg0.method7301();
        } else if (arg1 == 6) {
            this.field2056 = arg0.method7301();
        } else if (arg1 == 7) {
            this.field2057 = arg0.method7199();
        } else if (arg1 == 8) {
            this.field2060 = arg0.method7207();
        } else if (arg1 == 9) {
            this.field2052 = arg0.method7198();
        } else if (arg1 == 10) {
            this.field2058 = arg0.method7199();
        } else if (arg1 == 11) {
            this.field2065 = 0;
        } else if (arg1 == 12) {
            this.field2061 = arg0.method7196();
        } else if (arg1 == 13) {
            this.field2054 = arg0.method7199();
        } else if (arg1 == 14) {
            this.field2065 = arg0.method7198();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2064 = arg0.method7198();
            if (this.field2064 == 65535) {
                this.field2064 = -1;
            }
            this.field2063 = arg0.method7198();
            if (this.field2063 == 65535) {
                this.field2063 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method7198();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method7196();
            this.field2059 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2059[var5] = arg0.method7198();
                if (this.field2059[var5] == 65535) {
                    this.field2059[var5] = -1;
                }
            }
            this.field2059[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gx.n(I)Lgx;")
    public final class187 method3385() {
        int var1 = -1;
        if (this.field2064 != -1) {
            var1 = class290.method2609(this.field2064);
        } else if (this.field2063 != -1) {
            var1 = class290.field3346[this.field2063];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2059.length - 1) {
            var2 = this.field2059[var1];
        } else {
            var2 = this.field2059[this.field2059.length - 1];
        }
        return var2 == -1 ? null : method2834(var2);
    }

    @ObfuscatedName("gx.k(II)Ljava/lang/String;")
    public String method3396(int arg0) {
        String var2 = this.field2060;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class345.method5896(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gx.w(I)Lqi;")
    public class458 method3387() {
        if (this.field2053 < 0) {
            return null;
        }
        class458 var1 = (class458) field2047.method4789((long) this.field2053);
        if (var1 != null) {
            return var1;
        }
        class458 var2 = class459.method2680(Statics.field2050, this.field2053, 0);
        if (var2 != null) {
            field2047.method4781(var2, (long) this.field2053);
        }
        return var2;
    }

    @ObfuscatedName("gx.s(I)Lqi;")
    public class458 method3388() {
        if (this.field2049 < 0) {
            return null;
        }
        class458 var1 = (class458) field2047.method4789((long) this.field2049);
        if (var1 != null) {
            return var1;
        }
        class458 var2 = class459.method2680(Statics.field2050, this.field2049, 0);
        if (var2 != null) {
            field2047.method4781(var2, (long) this.field2049);
        }
        return var2;
    }

    @ObfuscatedName("gx.q(I)Lqi;")
    public class458 method3389() {
        if (this.field2055 < 0) {
            return null;
        }
        class458 var1 = (class458) field2047.method4789((long) this.field2055);
        if (var1 != null) {
            return var1;
        }
        class458 var2 = class459.method2680(Statics.field2050, this.field2055, 0);
        if (var2 != null) {
            field2047.method4781(var2, (long) this.field2055);
        }
        return var2;
    }

    @ObfuscatedName("gx.m(B)Lqi;")
    public class458 method3390() {
        if (this.field2056 < 0) {
            return null;
        }
        class458 var1 = (class458) field2047.method4789((long) this.field2056);
        if (var1 != null) {
            return var1;
        }
        class458 var2 = class459.method2680(Statics.field2050, this.field2056, 0);
        if (var2 != null) {
            field2047.method4781(var2, (long) this.field2056);
        }
        return var2;
    }

    @ObfuscatedName("gx.x(B)Lmv;")
    public class351 method3391() {
        if (this.field2046 == -1) {
            return null;
        }
        class351 var1 = (class351) field2048.method4789((long) this.field2046);
        if (var1 != null) {
            return var1;
        }
        class351 var2 = class459.method7455(Statics.field2050, Statics.field4863, this.field2046, 0);
        if (var2 != null) {
            field2048.method4781(var2, (long) this.field2046);
        }
        return var2;
    }

    @ObfuscatedName("ci.j(B)V")
    public static void method2466() {
        field2045.method4782();
        field2047.method4782();
        field2048.method4782();
    }
}
