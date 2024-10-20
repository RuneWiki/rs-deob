package deob;

@ObfuscatedName("ic")
public class class253 extends class176 {

    @ObfuscatedName("ic.g")
    public static class146 field3302 = new class146(64);

    @ObfuscatedName("ic.l")
    public static class146 field3303 = new class146(64);

    @ObfuscatedName("ic.u")
    public static class146 field3304 = new class146(20);

    @ObfuscatedName("ic.h")
    public int field3305 = -1;

    @ObfuscatedName("ic.f")
    public int field3306 = 16777215;

    @ObfuscatedName("ic.s")
    public int field3307 = 70;

    @ObfuscatedName("ic.p")
    public int field3315 = -1;

    @ObfuscatedName("ic.e")
    public int field3309 = -1;

    @ObfuscatedName("ic.i")
    public int field3313 = -1;

    @ObfuscatedName("ic.q")
    public int field3314 = -1;

    @ObfuscatedName("ic.y")
    public int field3312 = 0;

    @ObfuscatedName("ic.r")
    public int field3311 = 0;

    @ObfuscatedName("ic.k")
    public int field3308 = -1;

    @ObfuscatedName("ic.w")
    public String field3310 = "";

    @ObfuscatedName("ic.m")
    public int field3316 = -1;

    @ObfuscatedName("ic.o")
    public int field3317 = 0;

    @ObfuscatedName("ic.a")
    public int[] field3318;

    @ObfuscatedName("ic.b")
    public int field3319 = -1;

    @ObfuscatedName("ic.ag")
    public int field3300 = -1;

    @ObfuscatedName("cs.c(Lhz;Lhz;Lhz;B)V")
    public static void method2069(class234 arg0, class234 arg1, class234 arg2) {
        Statics.field3320 = arg0;
        Statics.field3301 = arg1;
        Statics.field2318 = arg2;
    }

    @ObfuscatedName("bx.x(II)Lic;")
    public static class253 method1797(int arg0) {
        class253 var1 = (class253) field3302.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3320.method3825(32, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4225(new class300(var2));
        }
        field3302.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.t(Lkz;I)V")
    public void method4225(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4227(arg0, var2);
        }
    }

    @ObfuscatedName("ic.g(Lkz;II)V")
    public void method4227(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3305 = arg0.method5261();
        } else if (arg1 == 2) {
            this.field3306 = arg0.method5107();
        } else if (arg1 == 3) {
            this.field3315 = arg0.method5261();
        } else if (arg1 == 4) {
            this.field3313 = arg0.method5261();
        } else if (arg1 == 5) {
            this.field3309 = arg0.method5261();
        } else if (arg1 == 6) {
            this.field3314 = arg0.method5261();
        } else if (arg1 == 7) {
            this.field3312 = arg0.method5106();
        } else if (arg1 == 8) {
            this.field3310 = arg0.method5113();
        } else if (arg1 == 9) {
            this.field3307 = arg0.method5304();
        } else if (arg1 == 10) {
            this.field3311 = arg0.method5106();
        } else if (arg1 == 11) {
            this.field3308 = 0;
        } else if (arg1 == 12) {
            this.field3316 = arg0.method5103();
        } else if (arg1 == 13) {
            this.field3317 = arg0.method5106();
        } else if (arg1 == 14) {
            this.field3308 = arg0.method5304();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3319 = arg0.method5304();
            if (this.field3319 == 65535) {
                this.field3319 = -1;
            }
            this.field3300 = arg0.method5304();
            if (this.field3300 == 65535) {
                this.field3300 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5304();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5103();
            this.field3318 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3318[var5] = arg0.method5304();
                if (this.field3318[var5] == 65535) {
                    this.field3318[var5] = -1;
                }
            }
            this.field3318[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ic.l(I)Lic;")
    public final class253 method4228() {
        int var1 = -1;
        if (this.field3319 != -1) {
            var1 = class213.method504(this.field3319);
        } else if (this.field3300 != -1) {
            var1 = class213.field2494[this.field3300];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3318.length - 1) {
            var2 = this.field3318[var1];
        } else {
            var2 = this.field3318[this.field3318.length - 1];
        }
        return var2 == -1 ? null : method1797(var2);
    }

    @ObfuscatedName("ic.u(IB)Ljava/lang/String;")
    public String method4249(int arg0) {
        String var2 = this.field3310;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class291.method2832(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("ic.j(I)Lli;")
    public class325 method4239() {
        if (this.field3315 < 0) {
            return null;
        }
        class325 var1 = (class325) field3303.method3061((long) this.field3315);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method5636(Statics.field3301, this.field3315, 0);
        if (var2 != null) {
            field3303.method3062(var2, (long) this.field3315);
        }
        return var2;
    }

    @ObfuscatedName("ic.v(I)Lli;")
    public class325 method4252() {
        if (this.field3309 < 0) {
            return null;
        }
        class325 var1 = (class325) field3303.method3061((long) this.field3309);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method5636(Statics.field3301, this.field3309, 0);
        if (var2 != null) {
            field3303.method3062(var2, (long) this.field3309);
        }
        return var2;
    }

    @ObfuscatedName("ic.d(I)Lli;")
    public class325 method4241() {
        if (this.field3313 < 0) {
            return null;
        }
        class325 var1 = (class325) field3303.method3061((long) this.field3313);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method5636(Statics.field3301, this.field3313, 0);
        if (var2 != null) {
            field3303.method3062(var2, (long) this.field3313);
        }
        return var2;
    }

    @ObfuscatedName("ic.z(S)Lli;")
    public class325 method4232() {
        if (this.field3314 < 0) {
            return null;
        }
        class325 var1 = (class325) field3303.method3061((long) this.field3314);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method5636(Statics.field3301, this.field3314, 0);
        if (var2 != null) {
            field3303.method3062(var2, (long) this.field3314);
        }
        return var2;
    }

    @ObfuscatedName("ic.s(B)Lkf;")
    public class295 method4233() {
        if (this.field3305 == -1) {
            return null;
        }
        class295 var1 = (class295) field3304.method3061((long) this.field3305);
        if (var1 != null) {
            return var1;
        }
        class234 var2 = Statics.field3301;
        class234 var3 = Statics.field2318;
        int var4 = this.field3305;
        byte[] var5 = var2.method3825(var4, 0);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            class326.method47(var5);
            var6 = true;
        }
        class295 var7;
        if (var6) {
            byte[] var8 = var3.method3825(var4, 0);
            class295 var9;
            if (var8 == null) {
                var9 = null;
            } else {
                class295 var10 = new class295(var8, Statics.field3883, Statics.field501, Statics.field3882, Statics.field1403, Statics.field3878, Statics.field3181);
                class326.method3386();
                var9 = var10;
            }
            var7 = var9;
        } else {
            var7 = null;
        }
        if (var7 != null) {
            field3304.method3062(var7, (long) this.field3305);
        }
        return var7;
    }

    @ObfuscatedName("kv.p(B)V")
    public static void method5048() {
        field3302.method3063();
        field3303.method3063();
        field3304.method3063();
    }
}
