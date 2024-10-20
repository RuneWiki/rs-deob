package deob;

@ObfuscatedName("ip")
public class class255 extends class195 {

    @ObfuscatedName("ip.y")
    public static class190 field3393 = new class190(64);

    @ObfuscatedName("ip.e")
    public static class190 field3392 = new class190(64);

    @ObfuscatedName("ip.f")
    public static class190 field3394 = new class190(20);

    @ObfuscatedName("ip.s")
    public int field3396 = -1;

    @ObfuscatedName("ip.o")
    public int field3397 = 16777215;

    @ObfuscatedName("ip.p")
    public int field3414 = 70;

    @ObfuscatedName("ip.u")
    public int field3399 = -1;

    @ObfuscatedName("ip.b")
    public int field3400 = -1;

    @ObfuscatedName("ip.w")
    public int field3401 = -1;

    @ObfuscatedName("ip.k")
    public int field3407 = -1;

    @ObfuscatedName("ip.n")
    public int field3403 = 0;

    @ObfuscatedName("ip.c")
    public int field3402 = 0;

    @ObfuscatedName("ip.l")
    public int field3405 = -1;

    @ObfuscatedName("ip.m")
    public String field3406 = "";

    @ObfuscatedName("ip.a")
    public int field3412 = -1;

    @ObfuscatedName("ip.h")
    public int field3408 = 0;

    @ObfuscatedName("ip.z")
    public int[] field3409;

    @ObfuscatedName("ip.j")
    public int field3410 = -1;

    @ObfuscatedName("ip.am")
    public int field3398 = -1;

    @ObfuscatedName("cr.d(Lim;Lim;Lim;I)V")
    public static void method1687(class236 arg0, class236 arg1, class236 arg2) {
        Statics.field3411 = arg0;
        Statics.field3390 = arg1;
        Statics.field3391 = arg2;
    }

    @ObfuscatedName("hp.q(II)Lip;")
    public static class255 method3747(int arg0) {
        class255 var1 = (class255) field3393.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3411.method3750(32, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4098(new class174(var2));
        }
        field3393.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.x(Lfw;B)V")
    public void method4098(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method4115(arg0, var2);
        }
    }

    @ObfuscatedName("ip.y(Lfw;II)V")
    public void method4115(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3396 = arg0.method2929();
        } else if (arg1 == 2) {
            this.field3397 = arg0.method2918();
        } else if (arg1 == 3) {
            this.field3399 = arg0.method2929();
        } else if (arg1 == 4) {
            this.field3401 = arg0.method2929();
        } else if (arg1 == 5) {
            this.field3400 = arg0.method2929();
        } else if (arg1 == 6) {
            this.field3407 = arg0.method2929();
        } else if (arg1 == 7) {
            this.field3403 = arg0.method2911();
        } else if (arg1 == 8) {
            this.field3406 = arg0.method2923();
        } else if (arg1 == 9) {
            this.field3414 = arg0.method2916();
        } else if (arg1 == 10) {
            this.field3402 = arg0.method2911();
        } else if (arg1 == 11) {
            this.field3405 = 0;
        } else if (arg1 == 12) {
            this.field3412 = arg0.method2921();
        } else if (arg1 == 13) {
            this.field3408 = arg0.method2911();
        } else if (arg1 == 14) {
            this.field3405 = arg0.method2916();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3410 = arg0.method2916();
            if (this.field3410 == 65535) {
                this.field3410 = -1;
            }
            this.field3398 = arg0.method2916();
            if (this.field3398 == 65535) {
                this.field3398 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2916();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2921();
            this.field3409 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3409[var5] = arg0.method2916();
                if (this.field3409[var5] == 65535) {
                    this.field3409[var5] = -1;
                }
            }
            this.field3409[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ip.e(I)Lip;")
    public final class255 method4085() {
        int var1 = -1;
        if (this.field3410 != -1) {
            var1 = class212.method1567(this.field3410);
        } else if (this.field3398 != -1) {
            var1 = class212.field2585[this.field3398];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3409.length - 1) {
            var2 = this.field3409[var1];
        } else {
            var2 = this.field3409[this.field3409.length - 1];
        }
        return var2 == -1 ? null : method3747(var2);
    }

    @ObfuscatedName("ip.f(IB)Ljava/lang/String;")
    public String method4100(int arg0) {
        String var2 = this.field3406;
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

    @ObfuscatedName("ip.v(S)Lji;")
    public class286 method4087() {
        if (this.field3399 < 0) {
            return null;
        }
        class286 var1 = (class286) field3392.method3252((long) this.field3399);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method65(Statics.field3390, this.field3399, 0);
        if (var2 != null) {
            field3392.method3256(var2, (long) this.field3399);
        }
        return var2;
    }

    @ObfuscatedName("ip.t(I)Lji;")
    public class286 method4113() {
        if (this.field3400 < 0) {
            return null;
        }
        class286 var1 = (class286) field3392.method3252((long) this.field3400);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method65(Statics.field3390, this.field3400, 0);
        if (var2 != null) {
            field3392.method3256(var2, (long) this.field3400);
        }
        return var2;
    }

    @ObfuscatedName("ip.i(B)Lji;")
    public class286 method4095() {
        if (this.field3401 < 0) {
            return null;
        }
        class286 var1 = (class286) field3392.method3252((long) this.field3401);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method65(Statics.field3390, this.field3401, 0);
        if (var2 != null) {
            field3392.method3256(var2, (long) this.field3401);
        }
        return var2;
    }

    @ObfuscatedName("ip.r(B)Lji;")
    public class286 method4090() {
        if (this.field3407 < 0) {
            return null;
        }
        class286 var1 = (class286) field3392.method3252((long) this.field3407);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method65(Statics.field3390, this.field3407, 0);
        if (var2 != null) {
            field3392.method3256(var2, (long) this.field3407);
        }
        return var2;
    }

    @ObfuscatedName("ip.g(B)Ljt;")
    public class264 method4084() {
        if (this.field3396 == -1) {
            return null;
        }
        class264 var1 = (class264) field3394.method3252((long) this.field3396);
        if (var1 != null) {
            return var1;
        }
        class264 var2 = class287.method1560(Statics.field3390, Statics.field3391, this.field3396, 0);
        if (var2 != null) {
            field3394.method3256(var2, (long) this.field3396);
        }
        return var2;
    }
}
