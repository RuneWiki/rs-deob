package deob;

@ObfuscatedName("id")
public class class255 extends class195 {

    @ObfuscatedName("id.g")
    public static class190 field3390 = new class190(64);

    @ObfuscatedName("id.d")
    public static class190 field3412 = new class190(64);

    @ObfuscatedName("id.b")
    public static class190 field3392 = new class190(20);

    @ObfuscatedName("id.i")
    public int field3409 = -1;

    @ObfuscatedName("id.s")
    public int field3396 = 16777215;

    @ObfuscatedName("id.n")
    public int field3391 = 70;

    @ObfuscatedName("id.c")
    public int field3401 = -1;

    @ObfuscatedName("id.v")
    public int field3400 = -1;

    @ObfuscatedName("id.u")
    public int field3398 = -1;

    @ObfuscatedName("id.w")
    public int field3402 = -1;

    @ObfuscatedName("id.z")
    public int field3403 = 0;

    @ObfuscatedName("id.y")
    public int field3404 = 0;

    @ObfuscatedName("id.p")
    public int field3405 = -1;

    @ObfuscatedName("id.l")
    public String field3406 = "";

    @ObfuscatedName("id.x")
    public int field3407 = -1;

    @ObfuscatedName("id.r")
    public int field3408 = 0;

    @ObfuscatedName("id.t")
    public int[] field3389;

    @ObfuscatedName("id.a")
    public int field3410 = -1;

    @ObfuscatedName("id.ad")
    public int field3411 = -1;

    @ObfuscatedName("fb.e(Lin;Lin;Lin;I)V")
    public static void method2811(class236 arg0, class236 arg1, class236 arg2) {
        Statics.field3393 = arg0;
        Statics.field287 = arg1;
        Statics.field2141 = arg2;
    }

    @ObfuscatedName("az.o(II)Lid;")
    public static class255 method224(int arg0) {
        class255 var1 = (class255) field3390.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3393.method3760(32, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4106(new class174(var2));
        }
        field3390.method3250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.m(Lfw;I)V")
    public void method4106(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method4107(arg0, var2);
        }
    }

    @ObfuscatedName("id.g(Lfw;IB)V")
    public void method4107(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3409 = arg0.method3012();
        } else if (arg1 == 2) {
            this.field3396 = arg0.method2890();
        } else if (arg1 == 3) {
            this.field3401 = arg0.method3012();
        } else if (arg1 == 4) {
            this.field3398 = arg0.method3012();
        } else if (arg1 == 5) {
            this.field3400 = arg0.method3012();
        } else if (arg1 == 6) {
            this.field3402 = arg0.method3012();
        } else if (arg1 == 7) {
            this.field3403 = arg0.method2894();
        } else if (arg1 == 8) {
            this.field3406 = arg0.method3033();
        } else if (arg1 == 9) {
            this.field3391 = arg0.method2930();
        } else if (arg1 == 10) {
            this.field3404 = arg0.method2894();
        } else if (arg1 == 11) {
            this.field3405 = 0;
        } else if (arg1 == 12) {
            this.field3407 = arg0.method2891();
        } else if (arg1 == 13) {
            this.field3408 = arg0.method2894();
        } else if (arg1 == 14) {
            this.field3405 = arg0.method2930();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3410 = arg0.method2930();
            if (this.field3410 == 65535) {
                this.field3410 = -1;
            }
            this.field3411 = arg0.method2930();
            if (this.field3411 == 65535) {
                this.field3411 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2930();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2891();
            this.field3389 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3389[var5] = arg0.method2930();
                if (this.field3389[var5] == 65535) {
                    this.field3389[var5] = -1;
                }
            }
            this.field3389[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("id.d(I)Lid;")
    public final class255 method4108() {
        int var1 = -1;
        if (this.field3410 != -1) {
            var1 = class212.method56(this.field3410);
        } else if (this.field3411 != -1) {
            var1 = class212.field2589[this.field3411];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3389.length - 1) {
            var2 = this.field3389[var1];
        } else {
            var2 = this.field3389[this.field3389.length - 1];
        }
        return var2 == -1 ? null : method224(var2);
    }

    @ObfuscatedName("id.b(IB)Ljava/lang/String;")
    public String method4109(int arg0) {
        String var2 = this.field3406;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class271.method3904(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("id.k(B)Lje;")
    public class286 method4110() {
        if (this.field3401 < 0) {
            return null;
        }
        class286 var1 = (class286) field3412.method3248((long) this.field3401);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4552(Statics.field287, this.field3401, 0);
        if (var2 != null) {
            field3412.method3250(var2, (long) this.field3401);
        }
        return var2;
    }

    @ObfuscatedName("id.q(I)Lje;")
    public class286 method4113() {
        if (this.field3400 < 0) {
            return null;
        }
        class286 var1 = (class286) field3412.method3248((long) this.field3400);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4552(Statics.field287, this.field3400, 0);
        if (var2 != null) {
            field3412.method3250(var2, (long) this.field3400);
        }
        return var2;
    }

    @ObfuscatedName("id.h(I)Lje;")
    public class286 method4112() {
        if (this.field3398 < 0) {
            return null;
        }
        class286 var1 = (class286) field3412.method3248((long) this.field3398);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4552(Statics.field287, this.field3398, 0);
        if (var2 != null) {
            field3412.method3250(var2, (long) this.field3398);
        }
        return var2;
    }

    @ObfuscatedName("id.i(I)Lje;")
    public class286 method4134() {
        if (this.field3402 < 0) {
            return null;
        }
        class286 var1 = (class286) field3412.method3248((long) this.field3402);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4552(Statics.field287, this.field3402, 0);
        if (var2 != null) {
            field3412.method3250(var2, (long) this.field3402);
        }
        return var2;
    }

    @ObfuscatedName("id.s(B)Ljf;")
    public class264 method4143() {
        if (this.field3409 == -1) {
            return null;
        }
        class264 var1 = (class264) field3392.method3248((long) this.field3409);
        if (var1 != null) {
            return var1;
        }
        class264 var2 = class287.method4542(Statics.field287, Statics.field2141, this.field3409, 0);
        if (var2 != null) {
            field3392.method3250(var2, (long) this.field3409);
        }
        return var2;
    }

    @ObfuscatedName("hc.n(B)V")
    public static void method3722() {
        field3390.method3247();
        field3412.method3247();
        field3392.method3247();
    }
}
