package deob;

@ObfuscatedName("jg")
public class class266 extends class206 {

    @ObfuscatedName("jg.s")
    public static class201 field3472 = new class201(64);

    @ObfuscatedName("jg.j")
    public static class201 field3481 = new class201(64);

    @ObfuscatedName("jg.a")
    public static class201 field3474 = new class201(20);

    @ObfuscatedName("jg.x")
    public int field3479 = -1;

    @ObfuscatedName("jg.q")
    public int field3484 = 16777215;

    @ObfuscatedName("jg.v")
    public int field3488 = 70;

    @ObfuscatedName("jg.n")
    public int field3491 = -1;

    @ObfuscatedName("jg.y")
    public int field3483 = -1;

    @ObfuscatedName("jg.d")
    public int field3469 = -1;

    @ObfuscatedName("jg.l")
    public int field3485 = -1;

    @ObfuscatedName("jg.f")
    public int field3486 = 0;

    @ObfuscatedName("jg.k")
    public int field3471 = 0;

    @ObfuscatedName("jg.e")
    public int field3482 = -1;

    @ObfuscatedName("jg.u")
    public String field3489 = "";

    @ObfuscatedName("jg.g")
    public int field3490 = -1;

    @ObfuscatedName("jg.z")
    public int field3473 = 0;

    @ObfuscatedName("jg.b")
    public int[] field3492;

    @ObfuscatedName("jg.c")
    public int field3480 = -1;

    @ObfuscatedName("jg.aa")
    public int field3494 = -1;

    @ObfuscatedName("ej.p(Lik;Lik;Lik;I)V")
    public static void method2825(class247 arg0, class247 arg1, class247 arg2) {
        Statics.field3493 = arg0;
        Statics.field3470 = arg1;
        Statics.field3477 = arg2;
    }

    @ObfuscatedName("fl.i(II)Ljg;")
    public static class266 method2942(int arg0) {
        class266 var1 = (class266) field3472.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3493.method4032(32, arg0);
        class266 var3 = new class266();
        if (var2 != null) {
            var3.method4390(new class185(var2));
        }
        field3472.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.w(Lgj;I)V")
    public void method4390(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4389(arg0, var2);
        }
    }

    @ObfuscatedName("jg.s(Lgj;IB)V")
    public void method4389(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3479 = arg0.method3132();
        } else if (arg1 == 2) {
            this.field3484 = arg0.method3138();
        } else if (arg1 == 3) {
            this.field3491 = arg0.method3132();
        } else if (arg1 == 4) {
            this.field3469 = arg0.method3132();
        } else if (arg1 == 5) {
            this.field3483 = arg0.method3132();
        } else if (arg1 == 6) {
            this.field3485 = arg0.method3132();
        } else if (arg1 == 7) {
            this.field3486 = arg0.method3125();
        } else if (arg1 == 8) {
            this.field3489 = arg0.method3179();
        } else if (arg1 == 9) {
            this.field3488 = arg0.method3124();
        } else if (arg1 == 10) {
            this.field3471 = arg0.method3125();
        } else if (arg1 == 11) {
            this.field3482 = 0;
        } else if (arg1 == 12) {
            this.field3490 = arg0.method3197();
        } else if (arg1 == 13) {
            this.field3473 = arg0.method3125();
        } else if (arg1 == 14) {
            this.field3482 = arg0.method3124();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3480 = arg0.method3124();
            if (this.field3480 == 65535) {
                this.field3480 = -1;
            }
            this.field3494 = arg0.method3124();
            if (this.field3494 == 65535) {
                this.field3494 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3124();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3197();
            this.field3492 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3492[var5] = arg0.method3124();
                if (this.field3492[var5] == 65535) {
                    this.field3492[var5] = -1;
                }
            }
            this.field3492[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jg.j(I)Ljg;")
    public final class266 method4423() {
        int var1 = -1;
        if (this.field3480 != -1) {
            var1 = class223.method3012(this.field3480);
        } else if (this.field3494 != -1) {
            var1 = class223.field2691[this.field3494];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3492.length - 1) {
            var2 = this.field3492[var1];
        } else {
            var2 = this.field3492[this.field3492.length - 1];
        }
        return var2 == -1 ? null : method2942(var2);
    }

    @ObfuscatedName("jg.a(IS)Ljava/lang/String;")
    public String method4409(int arg0) {
        String var2 = this.field3489;
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

    @ObfuscatedName("jg.t(I)Lko;")
    public class310 method4414() {
        if (this.field3491 < 0) {
            return null;
        }
        class310 var1 = (class310) field3481.method3504((long) this.field3491);
        if (var1 != null) {
            return var1;
        }
        class310 var2 = class311.method18(Statics.field3470, this.field3491, 0);
        if (var2 != null) {
            field3481.method3506(var2, (long) this.field3491);
        }
        return var2;
    }

    @ObfuscatedName("jg.r(B)Lko;")
    public class310 method4393() {
        if (this.field3483 < 0) {
            return null;
        }
        class310 var1 = (class310) field3481.method3504((long) this.field3483);
        if (var1 != null) {
            return var1;
        }
        class310 var2 = class311.method18(Statics.field3470, this.field3483, 0);
        if (var2 != null) {
            field3481.method3506(var2, (long) this.field3483);
        }
        return var2;
    }

    @ObfuscatedName("jg.m(I)Lko;")
    public class310 method4388() {
        if (this.field3469 < 0) {
            return null;
        }
        class310 var1 = (class310) field3481.method3504((long) this.field3469);
        if (var1 != null) {
            return var1;
        }
        class310 var2 = class311.method18(Statics.field3470, this.field3469, 0);
        if (var2 != null) {
            field3481.method3506(var2, (long) this.field3469);
        }
        return var2;
    }

    @ObfuscatedName("jg.h(I)Lko;")
    public class310 method4395() {
        if (this.field3485 < 0) {
            return null;
        }
        class310 var1 = (class310) field3481.method3504((long) this.field3485);
        if (var1 != null) {
            return var1;
        }
        class310 var2 = class311.method18(Statics.field3470, this.field3485, 0);
        if (var2 != null) {
            field3481.method3506(var2, (long) this.field3485);
        }
        return var2;
    }

    @ObfuscatedName("jg.o(I)Lkz;")
    public class287 method4396() {
        if (this.field3479 == -1) {
            return null;
        }
        class287 var1 = (class287) field3474.method3504((long) this.field3479);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class311.method34(Statics.field3470, Statics.field3477, this.field3479, 0);
        if (var2 != null) {
            field3474.method3506(var2, (long) this.field3479);
        }
        return var2;
    }

    @ObfuscatedName("dd.x(B)V")
    public static void method2459() {
        field3472.method3513();
        field3481.method3513();
        field3474.method3513();
    }
}
