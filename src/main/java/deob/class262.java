package deob;

@ObfuscatedName("jh")
public class class262 extends class202 {

    @ObfuscatedName("jh.z")
    public static class197 field3477 = new class197(64);

    @ObfuscatedName("jh.v")
    public static class197 field3480 = new class197(64);

    @ObfuscatedName("jh.m")
    public static class197 field3481 = new class197(20);

    @ObfuscatedName("jh.u")
    public int field3485 = -1;

    @ObfuscatedName("jh.n")
    public int field3486 = 16777215;

    @ObfuscatedName("jh.c")
    public int field3492 = 70;

    @ObfuscatedName("jh.y")
    public int field3488 = -1;

    @ObfuscatedName("jh.j")
    public int field3496 = -1;

    @ObfuscatedName("jh.f")
    public int field3490 = -1;

    @ObfuscatedName("jh.s")
    public int field3491 = -1;

    @ObfuscatedName("jh.e")
    public int field3479 = 0;

    @ObfuscatedName("jh.q")
    public int field3494 = 0;

    @ObfuscatedName("jh.h")
    public int field3498 = -1;

    @ObfuscatedName("jh.i")
    public String field3495 = "";

    @ObfuscatedName("jh.o")
    public int field3493 = -1;

    @ObfuscatedName("jh.w")
    public int field3487 = 0;

    @ObfuscatedName("jh.g")
    public int[] field3497;

    @ObfuscatedName("jh.a")
    public int field3489 = -1;

    @ObfuscatedName("jh.ah")
    public int field3500 = -1;

    @ObfuscatedName("gb.d(Lid;Lid;Lid;I)V")
    public static void method3285(class243 arg0, class243 arg1, class243 arg2) {
        Statics.field3499 = arg0;
        Statics.field16 = arg1;
        Statics.field3478 = arg2;
    }

    @ObfuscatedName("bb.x(II)Ljh;")
    public static class262 method1012(int arg0) {
        class262 var1 = (class262) field3477.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3499.method3935(32, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4343(new class181(var2));
        }
        field3477.method3417(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.k(Lfr;I)V")
    public void method4343(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4331(arg0, var2);
        }
    }

    @ObfuscatedName("jh.z(Lfr;IB)V")
    public void method4331(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3485 = arg0.method3184();
        } else if (arg1 == 2) {
            this.field3486 = arg0.method3235();
        } else if (arg1 == 3) {
            this.field3488 = arg0.method3184();
        } else if (arg1 == 4) {
            this.field3490 = arg0.method3184();
        } else if (arg1 == 5) {
            this.field3496 = arg0.method3184();
        } else if (arg1 == 6) {
            this.field3491 = arg0.method3184();
        } else if (arg1 == 7) {
            this.field3479 = arg0.method3147();
        } else if (arg1 == 8) {
            this.field3495 = arg0.method3046();
        } else if (arg1 == 9) {
            this.field3492 = arg0.method3179();
        } else if (arg1 == 10) {
            this.field3494 = arg0.method3147();
        } else if (arg1 == 11) {
            this.field3498 = 0;
        } else if (arg1 == 12) {
            this.field3493 = arg0.method3204();
        } else if (arg1 == 13) {
            this.field3487 = arg0.method3147();
        } else if (arg1 == 14) {
            this.field3498 = arg0.method3179();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3489 = arg0.method3179();
            if (this.field3489 == 65535) {
                this.field3489 = -1;
            }
            this.field3500 = arg0.method3179();
            if (this.field3500 == 65535) {
                this.field3500 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3179();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3204();
            this.field3497 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3497[var5] = arg0.method3179();
                if (this.field3497[var5] == 65535) {
                    this.field3497[var5] = -1;
                }
            }
            this.field3497[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jh.v(I)Ljh;")
    public final class262 method4318() {
        int var1 = -1;
        if (this.field3489 != -1) {
            var1 = class219.method1016(this.field3489);
        } else if (this.field3500 != -1) {
            var1 = class219.field2688[this.field3500];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3497.length - 1) {
            var2 = this.field3497[var1];
        } else {
            var2 = this.field3497[this.field3497.length - 1];
        }
        return var2 == -1 ? null : method1012(var2);
    }

    @ObfuscatedName("jh.m(II)Ljava/lang/String;")
    public String method4308(int arg0) {
        String var2 = this.field3495;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class278.method2821(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jh.b(B)Lky;")
    public class295 method4309() {
        if (this.field3488 < 0) {
            return null;
        }
        class295 var1 = (class295) field3480.method3418((long) this.field3488);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method4769(Statics.field16, this.field3488, 0);
        if (var2 != null) {
            field3480.method3417(var2, (long) this.field3488);
        }
        return var2;
    }

    @ObfuscatedName("jh.t(I)Lky;")
    public class295 method4310() {
        if (this.field3496 < 0) {
            return null;
        }
        class295 var1 = (class295) field3480.method3418((long) this.field3496);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method4769(Statics.field16, this.field3496, 0);
        if (var2 != null) {
            field3480.method3417(var2, (long) this.field3496);
        }
        return var2;
    }

    @ObfuscatedName("jh.p(I)Lky;")
    public class295 method4311() {
        if (this.field3490 < 0) {
            return null;
        }
        class295 var1 = (class295) field3480.method3418((long) this.field3490);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method4769(Statics.field16, this.field3490, 0);
        if (var2 != null) {
            field3480.method3417(var2, (long) this.field3490);
        }
        return var2;
    }

    @ObfuscatedName("jh.r(I)Lky;")
    public class295 method4312() {
        if (this.field3491 < 0) {
            return null;
        }
        class295 var1 = (class295) field3480.method3418((long) this.field3491);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method4769(Statics.field16, this.field3491, 0);
        if (var2 != null) {
            field3480.method3417(var2, (long) this.field3491);
        }
        return var2;
    }

    @ObfuscatedName("jh.l(I)Ljp;")
    public class271 method4313() {
        if (this.field3485 == -1) {
            return null;
        }
        class271 var1 = (class271) field3481.method3418((long) this.field3485);
        if (var1 != null) {
            return var1;
        }
        class243 var2 = Statics.field16;
        class243 var3 = Statics.field3478;
        int var4 = this.field3485;
        class271 var5;
        if (class296.method2387(var2, var4, 0)) {
            byte[] var6 = var3.method3935(var4, 0);
            class271 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class271 var8 = new class271(var6, Statics.field3849, Statics.field3851, Statics.field3846, Statics.field3789, Statics.field1600, Statics.field290);
                Statics.field3849 = null;
                Statics.field3851 = null;
                Statics.field3846 = null;
                Statics.field3789 = null;
                Statics.field1600 = null;
                Statics.field290 = (byte[][]) null;
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3481.method3417(var5, (long) this.field3485);
        }
        return var5;
    }

    @ObfuscatedName("fo.u(I)V")
    public static void method2941() {
        field3477.method3422();
        field3480.method3422();
        field3481.method3422();
    }
}
