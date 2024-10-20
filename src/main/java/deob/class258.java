package deob;

@ObfuscatedName("if")
public class class258 extends class198 {

    @ObfuscatedName("if.m")
    public static class193 field3424 = new class193(64);

    @ObfuscatedName("if.h")
    public static class193 field3437 = new class193(64);

    @ObfuscatedName("if.t")
    public static class193 field3426 = new class193(20);

    @ObfuscatedName("if.q")
    public int field3428 = -1;

    @ObfuscatedName("if.u")
    public int field3429 = 16777215;

    @ObfuscatedName("if.k")
    public int field3430 = 70;

    @ObfuscatedName("if.e")
    public int field3431 = -1;

    @ObfuscatedName("if.r")
    public int field3432 = -1;

    @ObfuscatedName("if.l")
    public int field3433 = -1;

    @ObfuscatedName("if.y")
    public int field3434 = -1;

    @ObfuscatedName("if.w")
    public int field3425 = 0;

    @ObfuscatedName("if.i")
    public int field3445 = 0;

    @ObfuscatedName("if.g")
    public int field3427 = -1;

    @ObfuscatedName("if.a")
    public String field3438 = "";

    @ObfuscatedName("if.x")
    public int field3442 = -1;

    @ObfuscatedName("if.b")
    public int field3440 = 0;

    @ObfuscatedName("if.j")
    public int[] field3441;

    @ObfuscatedName("if.v")
    public int field3436 = -1;

    @ObfuscatedName("if.ap")
    public int field3443 = -1;

    @ObfuscatedName("ck.s(Liw;Liw;Liw;I)V")
    public static void method1634(class239 arg0, class239 arg1, class239 arg2) {
        Statics.field340 = arg0;
        Statics.field3439 = arg1;
        Statics.field3423 = arg2;
    }

    @ObfuscatedName("cy.c(II)Lif;")
    public static class258 method1406(int arg0) {
        class258 var1 = (class258) field3424.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field340.method3840(32, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4206(new class177(var2));
        }
        field3424.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.f(Lfs;I)V")
    public void method4206(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4210(arg0, var2);
        }
    }

    @ObfuscatedName("if.m(Lfs;II)V")
    public void method4210(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3428 = arg0.method2980();
        } else if (arg1 == 2) {
            this.field3429 = arg0.method2969();
        } else if (arg1 == 3) {
            this.field3431 = arg0.method2980();
        } else if (arg1 == 4) {
            this.field3433 = arg0.method2980();
        } else if (arg1 == 5) {
            this.field3432 = arg0.method2980();
        } else if (arg1 == 6) {
            this.field3434 = arg0.method2980();
        } else if (arg1 == 7) {
            this.field3425 = arg0.method3157();
        } else if (arg1 == 8) {
            this.field3438 = arg0.method3021();
        } else if (arg1 == 9) {
            this.field3430 = arg0.method2967();
        } else if (arg1 == 10) {
            this.field3445 = arg0.method3157();
        } else if (arg1 == 11) {
            this.field3427 = 0;
        } else if (arg1 == 12) {
            this.field3442 = arg0.method2965();
        } else if (arg1 == 13) {
            this.field3440 = arg0.method3157();
        } else if (arg1 == 14) {
            this.field3427 = arg0.method2967();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3436 = arg0.method2967();
            if (this.field3436 == 65535) {
                this.field3436 = -1;
            }
            this.field3443 = arg0.method2967();
            if (this.field3443 == 65535) {
                this.field3443 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2967();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2965();
            this.field3441 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3441[var5] = arg0.method2967();
                if (this.field3441[var5] == 65535) {
                    this.field3441[var5] = -1;
                }
            }
            this.field3441[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("if.h(I)Lif;")
    public final class258 method4208() {
        int var1 = -1;
        if (this.field3436 != -1) {
            var1 = class215.method2427(this.field3436);
        } else if (this.field3443 != -1) {
            var1 = class215.field2623[this.field3443];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3441.length - 1) {
            var2 = this.field3441[var1];
        } else {
            var2 = this.field3441[this.field3441.length - 1];
        }
        return var2 == -1 ? null : method1406(var2);
    }

    @ObfuscatedName("if.t(II)Ljava/lang/String;")
    public String method4209(int arg0) {
        String var2 = this.field3438;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class274.method4402(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("if.p(I)Lkb;")
    public class289 method4222() {
        if (this.field3431 < 0) {
            return null;
        }
        class289 var1 = (class289) field3437.method3319((long) this.field3431);
        if (var1 != null) {
            return var1;
        }
        class289 var2 = class290.method4624(Statics.field3439, this.field3431, 0);
        if (var2 != null) {
            field3437.method3315(var2, (long) this.field3431);
        }
        return var2;
    }

    @ObfuscatedName("if.d(B)Lkb;")
    public class289 method4235() {
        if (this.field3432 < 0) {
            return null;
        }
        class289 var1 = (class289) field3437.method3319((long) this.field3432);
        if (var1 != null) {
            return var1;
        }
        class289 var2 = class290.method4624(Statics.field3439, this.field3432, 0);
        if (var2 != null) {
            field3437.method3315(var2, (long) this.field3432);
        }
        return var2;
    }

    @ObfuscatedName("if.n(I)Lkb;")
    public class289 method4223() {
        if (this.field3433 < 0) {
            return null;
        }
        class289 var1 = (class289) field3437.method3319((long) this.field3433);
        if (var1 != null) {
            return var1;
        }
        class289 var2 = class290.method4624(Statics.field3439, this.field3433, 0);
        if (var2 != null) {
            field3437.method3315(var2, (long) this.field3433);
        }
        return var2;
    }

    @ObfuscatedName("if.z(B)Lkb;")
    public class289 method4230() {
        if (this.field3434 < 0) {
            return null;
        }
        class289 var1 = (class289) field3437.method3319((long) this.field3434);
        if (var1 != null) {
            return var1;
        }
        class289 var2 = class290.method4624(Statics.field3439, this.field3434, 0);
        if (var2 != null) {
            field3437.method3315(var2, (long) this.field3434);
        }
        return var2;
    }

    @ObfuscatedName("if.o(I)Ljb;")
    public class267 method4213() {
        if (this.field3428 == -1) {
            return null;
        }
        class267 var1 = (class267) field3426.method3319((long) this.field3428);
        if (var1 != null) {
            return var1;
        }
        class239 var2 = Statics.field3439;
        class239 var3 = Statics.field3423;
        int var4 = this.field3428;
        class267 var5;
        if (class290.method1591(var2, var4, 0)) {
            byte[] var6 = var3.method3840(var4, 0);
            class267 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class267 var8 = new class267(var6, Statics.field3805, Statics.field3764, Statics.field292, Statics.field3750, Statics.field3806, Statics.field3802);
                Statics.field3805 = null;
                Statics.field3764 = null;
                Statics.field292 = null;
                Statics.field3750 = null;
                Statics.field3806 = null;
                Statics.field3802 = (byte[][]) null;
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3426.method3315(var5, (long) this.field3428);
        }
        return var5;
    }

    @ObfuscatedName("bl.u(I)V")
    public static void method707() {
        field3424.method3316();
        field3437.method3316();
        field3426.method3316();
    }
}
