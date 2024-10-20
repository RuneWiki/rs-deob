package deob;

@ObfuscatedName("io")
public class class255 extends class195 {

    @ObfuscatedName("io.j")
    public static class190 field3420 = new class190(64);

    @ObfuscatedName("io.f")
    public static class190 field3421 = new class190(64);

    @ObfuscatedName("io.m")
    public static class190 field3422 = new class190(20);

    @ObfuscatedName("io.o")
    public int field3425 = -1;

    @ObfuscatedName("io.x")
    public int field3426 = 16777215;

    @ObfuscatedName("io.a")
    public int field3427 = 70;

    @ObfuscatedName("io.y")
    public int field3424 = -1;

    @ObfuscatedName("io.r")
    public int field3435 = -1;

    @ObfuscatedName("io.b")
    public int field3441 = -1;

    @ObfuscatedName("io.s")
    public int field3437 = -1;

    @ObfuscatedName("io.v")
    public int field3432 = 0;

    @ObfuscatedName("io.t")
    public int field3433 = 0;

    @ObfuscatedName("io.w")
    public int field3430 = -1;

    @ObfuscatedName("io.l")
    public String field3429 = "";

    @ObfuscatedName("io.q")
    public int field3436 = -1;

    @ObfuscatedName("io.k")
    public int field3419 = 0;

    @ObfuscatedName("io.d")
    public int[] field3418;

    @ObfuscatedName("io.u")
    public int field3439 = -1;

    @ObfuscatedName("io.ae")
    public int field3440 = -1;

    @ObfuscatedName("js.n(II)Lio;")
    public static class255 method4618(int arg0) {
        class255 var1 = (class255) field3420.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3431.method3880(32, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4193(new class174(var2));
        }
        field3420.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.p(Lfl;B)V")
    public void method4193(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4227(arg0, var2);
        }
    }

    @ObfuscatedName("io.i(Lfl;IB)V")
    public void method4227(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3425 = arg0.method3100();
        } else if (arg1 == 2) {
            this.field3426 = arg0.method2910();
        } else if (arg1 == 3) {
            this.field3424 = arg0.method3100();
        } else if (arg1 == 4) {
            this.field3441 = arg0.method3100();
        } else if (arg1 == 5) {
            this.field3435 = arg0.method3100();
        } else if (arg1 == 6) {
            this.field3437 = arg0.method3100();
        } else if (arg1 == 7) {
            this.field3432 = arg0.method2924();
        } else if (arg1 == 8) {
            this.field3429 = arg0.method3025();
        } else if (arg1 == 9) {
            this.field3427 = arg0.method3065();
        } else if (arg1 == 10) {
            this.field3433 = arg0.method2924();
        } else if (arg1 == 11) {
            this.field3430 = 0;
        } else if (arg1 == 12) {
            this.field3436 = arg0.method2925();
        } else if (arg1 == 13) {
            this.field3419 = arg0.method2924();
        } else if (arg1 == 14) {
            this.field3430 = arg0.method3065();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3439 = arg0.method3065();
            if (this.field3439 == 65535) {
                this.field3439 = -1;
            }
            this.field3440 = arg0.method3065();
            if (this.field3440 == 65535) {
                this.field3440 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3065();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2925();
            this.field3418 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3418[var5] = arg0.method3065();
                if (this.field3418[var5] == 65535) {
                    this.field3418[var5] = -1;
                }
            }
            this.field3418[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("io.j(I)Lio;")
    public final class255 method4197() {
        int var1 = -1;
        if (this.field3439 != -1) {
            var1 = class212.method3578(this.field3439);
        } else if (this.field3440 != -1) {
            var1 = class212.field2615[this.field3440];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3418.length - 1) {
            var2 = this.field3418[var1];
        } else {
            var2 = this.field3418[this.field3418.length - 1];
        }
        return var2 == -1 ? null : method4618(var2);
    }

    @ObfuscatedName("io.f(II)Ljava/lang/String;")
    public String method4201(int arg0) {
        String var2 = this.field3429;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class271.method50(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("io.m(I)Ljp;")
    public class286 method4195() {
        if (this.field3424 < 0) {
            return null;
        }
        class286 var1 = (class286) field3421.method3280((long) this.field3424);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method2679(Statics.field3438, this.field3424, 0);
        if (var2 != null) {
            field3421.method3282(var2, (long) this.field3424);
        }
        return var2;
    }

    @ObfuscatedName("io.c(I)Ljp;")
    public class286 method4196() {
        if (this.field3435 < 0) {
            return null;
        }
        class286 var1 = (class286) field3421.method3280((long) this.field3435);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method2679(Statics.field3438, this.field3435, 0);
        if (var2 != null) {
            field3421.method3282(var2, (long) this.field3435);
        }
        return var2;
    }

    @ObfuscatedName("io.z(B)Ljp;")
    public class286 method4192() {
        if (this.field3441 < 0) {
            return null;
        }
        class286 var1 = (class286) field3421.method3280((long) this.field3441);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method2679(Statics.field3438, this.field3441, 0);
        if (var2 != null) {
            field3421.method3282(var2, (long) this.field3441);
        }
        return var2;
    }

    @ObfuscatedName("io.h(B)Ljp;")
    public class286 method4198() {
        if (this.field3437 < 0) {
            return null;
        }
        class286 var1 = (class286) field3421.method3280((long) this.field3437);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method2679(Statics.field3438, this.field3437, 0);
        if (var2 != null) {
            field3421.method3282(var2, (long) this.field3437);
        }
        return var2;
    }

    @ObfuscatedName("io.g(I)Ljz;")
    public class264 method4199() {
        if (this.field3425 == -1) {
            return null;
        }
        class264 var1 = (class264) field3422.method3280((long) this.field3425);
        if (var1 != null) {
            return var1;
        }
        class236 var2 = Statics.field3438;
        class236 var3 = Statics.field21;
        int var4 = this.field3425;
        class264 var5;
        if (class287.method1934(var2, var4, 0)) {
            byte[] var6 = var3.method3880(var4, 0);
            class264 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class264 var8 = new class264(var6, Statics.field1494, Statics.field3791, Statics.field3794, Statics.field3294, Statics.field2411, Statics.field450);
                class287.method2401();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3422.method3282(var5, (long) this.field3425);
        }
        return var5;
    }
}
