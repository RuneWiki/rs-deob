package deob;

@ObfuscatedName("iy")
public class class258 extends class198 {

    @ObfuscatedName("iy.k")
    public static class193 field3431 = new class193(64);

    @ObfuscatedName("iy.f")
    public static class193 field3447 = new class193(64);

    @ObfuscatedName("iy.i")
    public static class193 field3430 = new class193(20);

    @ObfuscatedName("iy.h")
    public int field3432 = -1;

    @ObfuscatedName("iy.a")
    public int field3433 = 16777215;

    @ObfuscatedName("iy.p")
    public int field3434 = 70;

    @ObfuscatedName("iy.q")
    public int field3435 = -1;

    @ObfuscatedName("iy.l")
    public int field3436 = -1;

    @ObfuscatedName("iy.c")
    public int field3437 = -1;

    @ObfuscatedName("iy.n")
    public int field3438 = -1;

    @ObfuscatedName("iy.z")
    public int field3439 = 0;

    @ObfuscatedName("iy.e")
    public int field3440 = 0;

    @ObfuscatedName("iy.g")
    public int field3448 = -1;

    @ObfuscatedName("iy.d")
    public String field3442 = "";

    @ObfuscatedName("iy.y")
    public int field3443 = -1;

    @ObfuscatedName("iy.t")
    public int field3444 = 0;

    @ObfuscatedName("iy.b")
    public int[] field3441;

    @ObfuscatedName("iy.s")
    public int field3445 = -1;

    @ObfuscatedName("iy.ap")
    public int field3429 = -1;

    @ObfuscatedName("c.w(Liq;Liq;Liq;I)V")
    public static void method105(class239 arg0, class239 arg1, class239 arg2) {
        Statics.field3428 = arg0;
        Statics.field3426 = arg1;
        Statics.field3427 = arg2;
    }

    @ObfuscatedName("i.o(II)Liy;")
    public static class258 method16(int arg0) {
        class258 var1 = (class258) field3431.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3428.method3754(32, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4099(new class177(var2));
        }
        field3431.method3241(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.x(Lfi;B)V")
    public void method4099(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method4107(arg0, var2);
        }
    }

    @ObfuscatedName("iy.k(Lfi;II)V")
    public void method4107(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3432 = arg0.method2899();
        } else if (arg1 == 2) {
            this.field3433 = arg0.method2888();
        } else if (arg1 == 3) {
            this.field3435 = arg0.method2899();
        } else if (arg1 == 4) {
            this.field3437 = arg0.method2899();
        } else if (arg1 == 5) {
            this.field3436 = arg0.method2899();
        } else if (arg1 == 6) {
            this.field3438 = arg0.method2899();
        } else if (arg1 == 7) {
            this.field3439 = arg0.method2887();
        } else if (arg1 == 8) {
            this.field3442 = arg0.method2893();
        } else if (arg1 == 9) {
            this.field3434 = arg0.method2886();
        } else if (arg1 == 10) {
            this.field3440 = arg0.method2887();
        } else if (arg1 == 11) {
            this.field3448 = 0;
        } else if (arg1 == 12) {
            this.field3443 = arg0.method2931();
        } else if (arg1 == 13) {
            this.field3444 = arg0.method2887();
        } else if (arg1 == 14) {
            this.field3448 = arg0.method2886();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3445 = arg0.method2886();
            if (this.field3445 == 65535) {
                this.field3445 = -1;
            }
            this.field3429 = arg0.method2886();
            if (this.field3429 == 65535) {
                this.field3429 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2886();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2931();
            this.field3441 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3441[var5] = arg0.method2886();
                if (this.field3441[var5] == 65535) {
                    this.field3441[var5] = -1;
                }
            }
            this.field3441[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("iy.f(I)Liy;")
    public final class258 method4101() {
        int var1 = -1;
        if (this.field3445 != -1) {
            var1 = class215.method2867(this.field3445);
        } else if (this.field3429 != -1) {
            var1 = class215.field2616[this.field3429];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3441.length - 1) {
            var2 = this.field3441[var1];
        } else {
            var2 = this.field3441[this.field3441.length - 1];
        }
        return var2 == -1 ? null : method16(var2);
    }

    @ObfuscatedName("iy.i(II)Ljava/lang/String;")
    public String method4102(int arg0) {
        String var2 = this.field3442;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class274.method1381(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("iy.j(B)Lkh;")
    public class289 method4098() {
        if (this.field3435 < 0) {
            return null;
        }
        class289 var1 = (class289) field3447.method3239((long) this.field3435);
        if (var1 != null) {
            return var1;
        }
        class289 var2 = class290.method3390(Statics.field3426, this.field3435, 0);
        if (var2 != null) {
            field3447.method3241(var2, (long) this.field3435);
        }
        return var2;
    }

    @ObfuscatedName("iy.m(I)Lkh;")
    public class289 method4104() {
        if (this.field3436 < 0) {
            return null;
        }
        class289 var1 = (class289) field3447.method3239((long) this.field3436);
        if (var1 != null) {
            return var1;
        }
        class289 var2 = class290.method3390(Statics.field3426, this.field3436, 0);
        if (var2 != null) {
            field3447.method3241(var2, (long) this.field3436);
        }
        return var2;
    }

    @ObfuscatedName("iy.u(I)Lkh;")
    public class289 method4136() {
        if (this.field3437 < 0) {
            return null;
        }
        class289 var1 = (class289) field3447.method3239((long) this.field3437);
        if (var1 != null) {
            return var1;
        }
        class289 var2 = class290.method3390(Statics.field3426, this.field3437, 0);
        if (var2 != null) {
            field3447.method3241(var2, (long) this.field3437);
        }
        return var2;
    }

    @ObfuscatedName("iy.h(B)Lkh;")
    public class289 method4105() {
        if (this.field3438 < 0) {
            return null;
        }
        class289 var1 = (class289) field3447.method3239((long) this.field3438);
        if (var1 != null) {
            return var1;
        }
        class289 var2 = class290.method3390(Statics.field3426, this.field3438, 0);
        if (var2 != null) {
            field3447.method3241(var2, (long) this.field3438);
        }
        return var2;
    }

    @ObfuscatedName("iy.a(B)Ljt;")
    public class267 method4124() {
        if (this.field3432 == -1) {
            return null;
        }
        class267 var1 = (class267) field3430.method3239((long) this.field3432);
        if (var1 != null) {
            return var1;
        }
        class239 var2 = Statics.field3426;
        class239 var3 = Statics.field3427;
        int var4 = this.field3432;
        class267 var5;
        if (class290.method3719(var2, var4, 0)) {
            var5 = class290.method130(var3.method3754(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3430.method3241(var5, (long) this.field3432);
        }
        return var5;
    }

    @ObfuscatedName("bu.p(S)V")
    public static void method968() {
        field3431.method3242();
        field3447.method3242();
        field3430.method3242();
    }
}
