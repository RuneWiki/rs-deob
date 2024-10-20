package deob;

@ObfuscatedName("iz")
public class class255 extends class195 {

    @ObfuscatedName("iz.v")
    public static class190 field3410 = new class190(64);

    @ObfuscatedName("iz.b")
    public static class190 field3411 = new class190(64);

    @ObfuscatedName("iz.y")
    public static class190 field3421 = new class190(20);

    @ObfuscatedName("iz.o")
    public int field3415 = -1;

    @ObfuscatedName("iz.z")
    public int field3412 = 16777215;

    @ObfuscatedName("iz.q")
    public int field3417 = 70;

    @ObfuscatedName("iz.j")
    public int field3418 = -1;

    @ObfuscatedName("iz.k")
    public int field3419 = -1;

    @ObfuscatedName("iz.r")
    public int field3420 = -1;

    @ObfuscatedName("iz.m")
    public int field3431 = -1;

    @ObfuscatedName("iz.d")
    public int field3422 = 0;

    @ObfuscatedName("iz.s")
    public int field3424 = 0;

    @ObfuscatedName("iz.g")
    public int field3429 = -1;

    @ObfuscatedName("iz.w")
    public String field3425 = "";

    @ObfuscatedName("iz.p")
    public int field3426 = -1;

    @ObfuscatedName("iz.l")
    public int field3427 = 0;

    @ObfuscatedName("iz.u")
    public int[] field3428;

    @ObfuscatedName("iz.t")
    public int field3416 = -1;

    @ObfuscatedName("iz.ad")
    public int field3430 = -1;

    @ObfuscatedName("cm.i(Liw;Liw;Liw;I)V")
    public static void method1614(class236 arg0, class236 arg1, class236 arg2) {
        Statics.field2356 = arg0;
        Statics.field3408 = arg1;
        Statics.field3409 = arg2;
    }

    @ObfuscatedName("ar.c(IB)Liz;")
    public static class255 method194(int arg0) {
        class255 var1 = (class255) field3410.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2356.method3769(32, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4134(new class174(var2));
        }
        field3410.method3222(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.e(Lfx;I)V")
    public void method4134(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method4135(arg0, var2);
        }
    }

    @ObfuscatedName("iz.v(Lfx;IB)V")
    public void method4135(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3415 = arg0.method2885();
        } else if (arg1 == 2) {
            this.field3412 = arg0.method2874();
        } else if (arg1 == 3) {
            this.field3418 = arg0.method2885();
        } else if (arg1 == 4) {
            this.field3420 = arg0.method2885();
        } else if (arg1 == 5) {
            this.field3419 = arg0.method2885();
        } else if (arg1 == 6) {
            this.field3431 = arg0.method2885();
        } else if (arg1 == 7) {
            this.field3422 = arg0.method2873();
        } else if (arg1 == 8) {
            this.field3425 = arg0.method2896();
        } else if (arg1 == 9) {
            this.field3417 = arg0.method2872();
        } else if (arg1 == 10) {
            this.field3424 = arg0.method2873();
        } else if (arg1 == 11) {
            this.field3429 = 0;
        } else if (arg1 == 12) {
            this.field3426 = arg0.method2870();
        } else if (arg1 == 13) {
            this.field3427 = arg0.method2873();
        } else if (arg1 == 14) {
            this.field3429 = arg0.method2872();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3416 = arg0.method2872();
            if (this.field3416 == 65535) {
                this.field3416 = -1;
            }
            this.field3430 = arg0.method2872();
            if (this.field3430 == 65535) {
                this.field3430 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2872();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2870();
            this.field3428 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3428[var5] = arg0.method2872();
                if (this.field3428[var5] == 65535) {
                    this.field3428[var5] = -1;
                }
            }
            this.field3428[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("iz.b(I)Liz;")
    public final class255 method4136() {
        int var1 = -1;
        if (this.field3416 != -1) {
            var1 = class212.method2144(this.field3416);
        } else if (this.field3430 != -1) {
            var1 = class212.field2609[this.field3430];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3428.length - 1) {
            var2 = this.field3428[var1];
        } else {
            var2 = this.field3428[this.field3428.length - 1];
        }
        return var2 == -1 ? null : method194(var2);
    }

    @ObfuscatedName("iz.y(II)Ljava/lang/String;")
    public String method4137(int arg0) {
        String var2 = this.field3425;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class271.method665(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("iz.h(I)Ljs;")
    public class286 method4158() {
        if (this.field3418 < 0) {
            return null;
        }
        class286 var1 = (class286) field3411.method3220((long) this.field3418);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method718(Statics.field3408, this.field3418, 0);
        if (var2 != null) {
            field3411.method3222(var2, (long) this.field3418);
        }
        return var2;
    }

    @ObfuscatedName("iz.x(I)Ljs;")
    public class286 method4140() {
        if (this.field3419 < 0) {
            return null;
        }
        class286 var1 = (class286) field3411.method3220((long) this.field3419);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method718(Statics.field3408, this.field3419, 0);
        if (var2 != null) {
            field3411.method3222(var2, (long) this.field3419);
        }
        return var2;
    }

    @ObfuscatedName("iz.f(I)Ljs;")
    public class286 method4159() {
        if (this.field3420 < 0) {
            return null;
        }
        class286 var1 = (class286) field3411.method3220((long) this.field3420);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method718(Statics.field3408, this.field3420, 0);
        if (var2 != null) {
            field3411.method3222(var2, (long) this.field3420);
        }
        return var2;
    }

    @ObfuscatedName("iz.n(I)Ljs;")
    public class286 method4141() {
        if (this.field3431 < 0) {
            return null;
        }
        class286 var1 = (class286) field3411.method3220((long) this.field3431);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method718(Statics.field3408, this.field3431, 0);
        if (var2 != null) {
            field3411.method3222(var2, (long) this.field3431);
        }
        return var2;
    }

    @ObfuscatedName("iz.a(I)Lji;")
    public class264 method4142() {
        if (this.field3415 == -1) {
            return null;
        }
        class264 var1 = (class264) field3421.method3220((long) this.field3415);
        if (var1 != null) {
            return var1;
        }
        class236 var2 = Statics.field3408;
        class236 var3 = Statics.field3409;
        int var4 = this.field3415;
        class264 var5;
        if (class287.method27(var2, var4, 0)) {
            var5 = class287.method4173(var3.method3769(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3421.method3222(var5, (long) this.field3415);
        }
        return var5;
    }

    @ObfuscatedName("cv.o(I)V")
    public static void method1622() {
        field3410.method3221();
        field3411.method3221();
        field3421.method3221();
    }
}
