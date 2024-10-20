package deob;

@ObfuscatedName("ir")
public class class255 extends class195 {

    @ObfuscatedName("ir.r")
    public static class190 field3428 = new class190(64);

    @ObfuscatedName("ir.v")
    public static class190 field3431 = new class190(64);

    @ObfuscatedName("ir.e")
    public static class190 field3413 = new class190(20);

    @ObfuscatedName("ir.u")
    public int field3417 = -1;

    @ObfuscatedName("ir.g")
    public int field3420 = 16777215;

    @ObfuscatedName("ir.k")
    public int field3419 = 70;

    @ObfuscatedName("ir.t")
    public int field3416 = -1;

    @ObfuscatedName("ir.c")
    public int field3421 = -1;

    @ObfuscatedName("ir.o")
    public int field3422 = -1;

    @ObfuscatedName("ir.x")
    public int field3423 = -1;

    @ObfuscatedName("ir.f")
    public int field3418 = 0;

    @ObfuscatedName("ir.h")
    public int field3425 = 0;

    @ObfuscatedName("ir.z")
    public int field3426 = -1;

    @ObfuscatedName("ir.i")
    public String field3412 = "";

    @ObfuscatedName("ir.d")
    public int field3414 = -1;

    @ObfuscatedName("ir.b")
    public int field3433 = 0;

    @ObfuscatedName("ir.q")
    public int[] field3430;

    @ObfuscatedName("ir.y")
    public int field3424 = -1;

    @ObfuscatedName("ir.ai")
    public int field3432 = -1;

    @ObfuscatedName("i.a(II)Lir;")
    public static class255 method147(int arg0) {
        class255 var1 = (class255) field3428.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3410.method3787(32, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4121(new class174(var2));
        }
        field3428.method3247(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.j(Lfe;I)V")
    public void method4121(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method4108(arg0, var2);
        }
    }

    @ObfuscatedName("ir.n(Lfe;II)V")
    public void method4108(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3417 = arg0.method2954();
        } else if (arg1 == 2) {
            this.field3420 = arg0.method2875();
        } else if (arg1 == 3) {
            this.field3416 = arg0.method2954();
        } else if (arg1 == 4) {
            this.field3422 = arg0.method2954();
        } else if (arg1 == 5) {
            this.field3421 = arg0.method2954();
        } else if (arg1 == 6) {
            this.field3423 = arg0.method2954();
        } else if (arg1 == 7) {
            this.field3418 = arg0.method2906();
        } else if (arg1 == 8) {
            this.field3412 = arg0.method2937();
        } else if (arg1 == 9) {
            this.field3419 = arg0.method2873();
        } else if (arg1 == 10) {
            this.field3425 = arg0.method2906();
        } else if (arg1 == 11) {
            this.field3426 = 0;
        } else if (arg1 == 12) {
            this.field3414 = arg0.method2871();
        } else if (arg1 == 13) {
            this.field3433 = arg0.method2906();
        } else if (arg1 == 14) {
            this.field3426 = arg0.method2873();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3424 = arg0.method2873();
            if (this.field3424 == 65535) {
                this.field3424 = -1;
            }
            this.field3432 = arg0.method2873();
            if (this.field3432 == 65535) {
                this.field3432 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2873();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2871();
            this.field3430 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3430[var5] = arg0.method2873();
                if (this.field3430[var5] == 65535) {
                    this.field3430[var5] = -1;
                }
            }
            this.field3430[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ir.r(I)Lir;")
    public final class255 method4102() {
        int var1 = -1;
        if (this.field3424 != -1) {
            var1 = class212.method4(this.field3424);
        } else if (this.field3432 != -1) {
            var1 = class212.field2613[this.field3432];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3430.length - 1) {
            var2 = this.field3430[var1];
        } else {
            var2 = this.field3430[this.field3430.length - 1];
        }
        return var2 == -1 ? null : method147(var2);
    }

    @ObfuscatedName("ir.v(II)Ljava/lang/String;")
    public String method4131(int arg0) {
        String var2 = this.field3412;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class271.method888(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("ir.e(I)Ljt;")
    public class286 method4128() {
        if (this.field3416 < 0) {
            return null;
        }
        class286 var1 = (class286) field3431.method3245((long) this.field3416);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method208(Statics.field3409, this.field3416, 0);
        if (var2 != null) {
            field3431.method3247(var2, (long) this.field3416);
        }
        return var2;
    }

    @ObfuscatedName("ir.l(I)Ljt;")
    public class286 method4103() {
        if (this.field3421 < 0) {
            return null;
        }
        class286 var1 = (class286) field3431.method3245((long) this.field3421);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method208(Statics.field3409, this.field3421, 0);
        if (var2 != null) {
            field3431.method3247(var2, (long) this.field3421);
        }
        return var2;
    }

    @ObfuscatedName("ir.s(I)Ljt;")
    public class286 method4132() {
        if (this.field3422 < 0) {
            return null;
        }
        class286 var1 = (class286) field3431.method3245((long) this.field3422);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method208(Statics.field3409, this.field3422, 0);
        if (var2 != null) {
            field3431.method3247(var2, (long) this.field3422);
        }
        return var2;
    }

    @ObfuscatedName("ir.w(I)Ljt;")
    public class286 method4107() {
        if (this.field3423 < 0) {
            return null;
        }
        class286 var1 = (class286) field3431.method3245((long) this.field3423);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method208(Statics.field3409, this.field3423, 0);
        if (var2 != null) {
            field3431.method3247(var2, (long) this.field3423);
        }
        return var2;
    }

    @ObfuscatedName("ir.p(I)Ljc;")
    public class264 method4105() {
        if (this.field3417 == -1) {
            return null;
        }
        class264 var1 = (class264) field3413.method3245((long) this.field3417);
        if (var1 != null) {
            return var1;
        }
        class236 var2 = Statics.field3409;
        class236 var3 = Statics.field3411;
        int var4 = this.field3417;
        class264 var5;
        if (class287.method3873(var2, var4, 0)) {
            byte[] var6 = var3.method3787(var4, 0);
            class264 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class264 var8 = new class264(var6, Statics.field3796, Statics.field440, Statics.field3798, Statics.field1406, Statics.field3797, Statics.field2415);
                class287.method131();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3413.method3247(var5, (long) this.field3417);
        }
        return var5;
    }
}
