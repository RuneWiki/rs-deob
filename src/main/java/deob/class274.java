package deob;

@ObfuscatedName("je")
public class class274 extends class214 {

    @ObfuscatedName("je.x")
    public static class208 field3432 = new class208(64);

    @ObfuscatedName("je.h")
    public static class208 field3433 = new class208(64);

    @ObfuscatedName("je.f")
    public static class208 field3434 = new class208(20);

    @ObfuscatedName("je.e")
    public int field3436 = -1;

    @ObfuscatedName("je.r")
    public int field3441 = 16777215;

    @ObfuscatedName("je.t")
    public int field3438 = 70;

    @ObfuscatedName("je.l")
    public int field3451 = -1;

    @ObfuscatedName("je.o")
    public int field3440 = -1;

    @ObfuscatedName("je.u")
    public int field3437 = -1;

    @ObfuscatedName("je.y")
    public int field3448 = -1;

    @ObfuscatedName("je.k")
    public int field3443 = 0;

    @ObfuscatedName("je.v")
    public int field3444 = 0;

    @ObfuscatedName("je.d")
    public int field3447 = -1;

    @ObfuscatedName("je.w")
    public String field3446 = "";

    @ObfuscatedName("je.i")
    public int field3430 = -1;

    @ObfuscatedName("je.c")
    public int field3445 = 0;

    @ObfuscatedName("je.j")
    public int[] field3449;

    @ObfuscatedName("je.z")
    public int field3450 = -1;

    @ObfuscatedName("je.ag")
    public int field3442 = -1;

    @ObfuscatedName("fl.a(II)Lje;")
    public static class274 method3278(int arg0) {
        class274 var1 = (class274) field3432.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3431.method4422(32, arg0);
        class274 var3 = new class274();
        if (var2 != null) {
            var3.method4799(new class190(var2));
        }
        field3432.method3878(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.s(Lgx;B)V")
    public void method4799(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4800(arg0, var2);
        }
    }

    @ObfuscatedName("je.g(Lgx;IB)V")
    public void method4800(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3436 = arg0.method3656();
        } else if (arg1 == 2) {
            this.field3441 = arg0.method3459();
        } else if (arg1 == 3) {
            this.field3451 = arg0.method3656();
        } else if (arg1 == 4) {
            this.field3437 = arg0.method3656();
        } else if (arg1 == 5) {
            this.field3440 = arg0.method3656();
        } else if (arg1 == 6) {
            this.field3448 = arg0.method3656();
        } else if (arg1 == 7) {
            this.field3443 = arg0.method3458();
        } else if (arg1 == 8) {
            this.field3446 = arg0.method3465();
        } else if (arg1 == 9) {
            this.field3438 = arg0.method3610();
        } else if (arg1 == 10) {
            this.field3444 = arg0.method3458();
        } else if (arg1 == 11) {
            this.field3447 = 0;
        } else if (arg1 == 12) {
            this.field3430 = arg0.method3443();
        } else if (arg1 == 13) {
            this.field3445 = arg0.method3458();
        } else if (arg1 == 14) {
            this.field3447 = arg0.method3610();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3450 = arg0.method3610();
            if (this.field3450 == 65535) {
                this.field3450 = -1;
            }
            this.field3442 = arg0.method3610();
            if (this.field3442 == 65535) {
                this.field3442 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3610();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3443();
            this.field3449 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3449[var5] = arg0.method3610();
                if (this.field3449[var5] == 65535) {
                    this.field3449[var5] = -1;
                }
            }
            this.field3449[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("je.x(I)Lje;")
    public final class274 method4801() {
        int var1 = -1;
        if (this.field3450 != -1) {
            var1 = class234.method1611(this.field3450);
        } else if (this.field3442 != -1) {
            var1 = class234.field2648[this.field3442];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3449.length - 1) {
            var2 = this.field3449[var1];
        } else {
            var2 = this.field3449[this.field3449.length - 1];
        }
        return var2 == -1 ? null : method3278(var2);
    }

    @ObfuscatedName("je.h(IB)Ljava/lang/String;")
    public String method4834(int arg0) {
        String var2 = this.field3446;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class312.method3485(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("je.f(B)Lld;")
    public class328 method4802() {
        if (this.field3451 < 0) {
            return null;
        }
        class328 var1 = (class328) field3433.method3885((long) this.field3451);
        if (var1 != null) {
            return var1;
        }
        class328 var2 = class329.method4673(Statics.field1992, this.field3451, 0);
        if (var2 != null) {
            field3433.method3878(var2, (long) this.field3451);
        }
        return var2;
    }

    @ObfuscatedName("je.p(I)Lld;")
    public class328 method4803() {
        if (this.field3440 < 0) {
            return null;
        }
        class328 var1 = (class328) field3433.method3885((long) this.field3440);
        if (var1 != null) {
            return var1;
        }
        class328 var2 = class329.method4673(Statics.field1992, this.field3440, 0);
        if (var2 != null) {
            field3433.method3878(var2, (long) this.field3440);
        }
        return var2;
    }

    @ObfuscatedName("je.m(I)Lld;")
    public class328 method4831() {
        if (this.field3437 < 0) {
            return null;
        }
        class328 var1 = (class328) field3433.method3885((long) this.field3437);
        if (var1 != null) {
            return var1;
        }
        class328 var2 = class329.method4673(Statics.field1992, this.field3437, 0);
        if (var2 != null) {
            field3433.method3878(var2, (long) this.field3437);
        }
        return var2;
    }

    @ObfuscatedName("je.q(I)Lld;")
    public class328 method4826() {
        if (this.field3448 < 0) {
            return null;
        }
        class328 var1 = (class328) field3433.method3885((long) this.field3448);
        if (var1 != null) {
            return var1;
        }
        class328 var2 = class329.method4673(Statics.field1992, this.field3448, 0);
        if (var2 != null) {
            field3433.method3878(var2, (long) this.field3448);
        }
        return var2;
    }

    @ObfuscatedName("je.b(I)Lkt;")
    public class305 method4804() {
        if (this.field3436 == -1) {
            return null;
        }
        class305 var1 = (class305) field3434.method3885((long) this.field3436);
        if (var1 != null) {
            return var1;
        }
        class305 var2 = class329.method2537(Statics.field1992, Statics.field3439, this.field3436, 0);
        if (var2 != null) {
            field3434.method3878(var2, (long) this.field3436);
        }
        return var2;
    }
}
