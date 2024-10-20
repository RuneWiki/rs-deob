package deob;

@ObfuscatedName("in")
public class class255 extends class195 {

    @ObfuscatedName("in.p")
    public static class190 field3411 = new class190(64);

    @ObfuscatedName("in.q")
    public static class190 field3414 = new class190(64);

    @ObfuscatedName("in.s")
    public static class190 field3432 = new class190(20);

    @ObfuscatedName("in.o")
    public int field3428 = -1;

    @ObfuscatedName("in.i")
    public int field3431 = 16777215;

    @ObfuscatedName("in.u")
    public int field3423 = 70;

    @ObfuscatedName("in.b")
    public int field3424 = -1;

    @ObfuscatedName("in.f")
    public int field3425 = -1;

    @ObfuscatedName("in.j")
    public int field3426 = -1;

    @ObfuscatedName("in.x")
    public int field3427 = -1;

    @ObfuscatedName("in.c")
    public int field3437 = 0;

    @ObfuscatedName("in.h")
    public int field3429 = 0;

    @ObfuscatedName("in.a")
    public int field3430 = -1;

    @ObfuscatedName("in.z")
    public String field3416 = "";

    @ObfuscatedName("in.l")
    public int field3436 = -1;

    @ObfuscatedName("in.w")
    public int field3433 = 0;

    @ObfuscatedName("in.n")
    public int[] field3434;

    @ObfuscatedName("in.m")
    public int field3435 = -1;

    @ObfuscatedName("in.ae")
    public int field3419 = -1;

    @ObfuscatedName("ca.d(II)Lin;")
    public static class255 method1689(int arg0) {
        class255 var1 = (class255) field3411.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3421.method3875(32, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4240(new class174(var2));
        }
        field3411.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.k(Lfg;I)V")
    public void method4240(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4219(arg0, var2);
        }
    }

    @ObfuscatedName("in.e(Lfg;IB)V")
    public void method4219(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3428 = arg0.method2971();
        } else if (arg1 == 2) {
            this.field3431 = arg0.method3059();
        } else if (arg1 == 3) {
            this.field3424 = arg0.method2971();
        } else if (arg1 == 4) {
            this.field3426 = arg0.method2971();
        } else if (arg1 == 5) {
            this.field3425 = arg0.method2971();
        } else if (arg1 == 6) {
            this.field3427 = arg0.method2971();
        } else if (arg1 == 7) {
            this.field3437 = arg0.method2958();
        } else if (arg1 == 8) {
            this.field3416 = arg0.method3125();
        } else if (arg1 == 9) {
            this.field3423 = arg0.method3035();
        } else if (arg1 == 10) {
            this.field3429 = arg0.method2958();
        } else if (arg1 == 11) {
            this.field3430 = 0;
        } else if (arg1 == 12) {
            this.field3436 = arg0.method2955();
        } else if (arg1 == 13) {
            this.field3433 = arg0.method2958();
        } else if (arg1 == 14) {
            this.field3430 = arg0.method3035();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3435 = arg0.method3035();
            if (this.field3435 == 65535) {
                this.field3435 = -1;
            }
            this.field3419 = arg0.method3035();
            if (this.field3419 == 65535) {
                this.field3419 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3035();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2955();
            this.field3434 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3434[var5] = arg0.method3035();
                if (this.field3434[var5] == 65535) {
                    this.field3434[var5] = -1;
                }
            }
            this.field3434[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("in.p(I)Lin;")
    public final class255 method4243() {
        int var1 = -1;
        if (this.field3435 != -1) {
            var1 = class212.method1633(this.field3435);
        } else if (this.field3419 != -1) {
            var1 = class212.field2621[this.field3419];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3434.length - 1) {
            var2 = this.field3434[var1];
        } else {
            var2 = this.field3434[this.field3434.length - 1];
        }
        return var2 == -1 ? null : method1689(var2);
    }

    @ObfuscatedName("in.q(II)Ljava/lang/String;")
    public String method4247(int arg0) {
        String var2 = this.field3416;
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

    @ObfuscatedName("in.s(I)Lkr;")
    public class287 method4222() {
        if (this.field3424 < 0) {
            return null;
        }
        class287 var1 = (class287) field3414.method3341((long) this.field3424);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method1953(Statics.field3412, this.field3424, 0);
        if (var2 != null) {
            field3414.method3343(var2, (long) this.field3424);
        }
        return var2;
    }

    @ObfuscatedName("in.r(B)Lkr;")
    public class287 method4223() {
        if (this.field3425 < 0) {
            return null;
        }
        class287 var1 = (class287) field3414.method3341((long) this.field3425);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method1953(Statics.field3412, this.field3425, 0);
        if (var2 != null) {
            field3414.method3343(var2, (long) this.field3425);
        }
        return var2;
    }

    @ObfuscatedName("in.g(I)Lkr;")
    public class287 method4246() {
        if (this.field3426 < 0) {
            return null;
        }
        class287 var1 = (class287) field3414.method3341((long) this.field3426);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method1953(Statics.field3412, this.field3426, 0);
        if (var2 != null) {
            field3414.method3343(var2, (long) this.field3426);
        }
        return var2;
    }

    @ObfuscatedName("in.v(B)Lkr;")
    public class287 method4225() {
        if (this.field3427 < 0) {
            return null;
        }
        class287 var1 = (class287) field3414.method3341((long) this.field3427);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method1953(Statics.field3412, this.field3427, 0);
        if (var2 != null) {
            field3414.method3343(var2, (long) this.field3427);
        }
        return var2;
    }

    @ObfuscatedName("in.t(B)Lju;")
    public class264 method4226() {
        if (this.field3428 == -1) {
            return null;
        }
        class264 var1 = (class264) field3432.method3341((long) this.field3428);
        if (var1 != null) {
            return var1;
        }
        class236 var2 = Statics.field3412;
        class236 var3 = Statics.field3413;
        int var4 = this.field3428;
        class264 var5;
        if (class288.method4159(var2, var4, 0)) {
            byte[] var6 = var3.method3875(var4, 0);
            class264 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class264 var8 = new class264(var6, Statics.field3808, Statics.field1301, Statics.field3239, Statics.field3208, Statics.field2457, Statics.field2608);
                class288.method1471();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3432.method3343(var5, (long) this.field3428);
        }
        return var5;
    }

    @ObfuscatedName("ih.y(I)V")
    public static void method4062() {
        field3411.method3345();
        field3414.method3345();
        field3432.method3345();
    }
}
