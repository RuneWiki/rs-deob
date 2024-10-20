package deob;

@ObfuscatedName("jc")
public class class282 extends class219 {

    @ObfuscatedName("jc.d")
    public static class213 field3569 = new class213(64);

    @ObfuscatedName("jc.h")
    public static class213 field3570 = new class213(64);

    @ObfuscatedName("jc.m")
    public static class213 field3571 = new class213(20);

    @ObfuscatedName("jc.a")
    public int field3574 = -1;

    @ObfuscatedName("jc.w")
    public int field3575 = 16777215;

    @ObfuscatedName("jc.n")
    public int field3576 = 70;

    @ObfuscatedName("jc.l")
    public int field3577 = -1;

    @ObfuscatedName("jc.s")
    public int field3579 = -1;

    @ObfuscatedName("jc.v")
    public int field3581 = -1;

    @ObfuscatedName("jc.q")
    public int field3580 = -1;

    @ObfuscatedName("jc.r")
    public int field3572 = 0;

    @ObfuscatedName("jc.j")
    public int field3582 = 0;

    @ObfuscatedName("jc.b")
    public int field3583 = -1;

    @ObfuscatedName("jc.g")
    public String field3584 = "";

    @ObfuscatedName("jc.f")
    public int field3589 = -1;

    @ObfuscatedName("jc.p")
    public int field3585 = 0;

    @ObfuscatedName("jc.e")
    public int[] field3587;

    @ObfuscatedName("jc.c")
    public int field3588 = -1;

    @ObfuscatedName("jc.ab")
    public int field3568 = -1;

    @ObfuscatedName("io.o(Ljf;Ljf;Ljf;I)V")
    public static void method4151(class262 arg0, class262 arg1, class262 arg2) {
        Statics.field3586 = arg0;
        Statics.field36 = arg1;
        Statics.field2168 = arg2;
    }

    @ObfuscatedName("gk.k(II)Ljc;")
    public static class282 method3145(int arg0) {
        class282 var1 = (class282) field3569.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3586.method4241(32, arg0);
        class282 var3 = new class282();
        if (var2 != null) {
            var3.method4579(new class195(var2));
        }
        field3569.method3603(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jc.t(Lgc;I)V")
    public void method4579(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4575(arg0, var2);
        }
    }

    @ObfuscatedName("jc.d(Lgc;II)V")
    public void method4575(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3574 = arg0.method3264();
        } else if (arg1 == 2) {
            this.field3575 = arg0.method3233();
        } else if (arg1 == 3) {
            this.field3577 = arg0.method3264();
        } else if (arg1 == 4) {
            this.field3581 = arg0.method3264();
        } else if (arg1 == 5) {
            this.field3579 = arg0.method3264();
        } else if (arg1 == 6) {
            this.field3580 = arg0.method3264();
        } else if (arg1 == 7) {
            this.field3572 = arg0.method3346();
        } else if (arg1 == 8) {
            this.field3584 = arg0.method3215();
        } else if (arg1 == 9) {
            this.field3576 = arg0.method3207();
        } else if (arg1 == 10) {
            this.field3582 = arg0.method3346();
        } else if (arg1 == 11) {
            this.field3583 = 0;
        } else if (arg1 == 12) {
            this.field3589 = arg0.method3205();
        } else if (arg1 == 13) {
            this.field3585 = arg0.method3346();
        } else if (arg1 == 14) {
            this.field3583 = arg0.method3207();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3588 = arg0.method3207();
            if (this.field3588 == 65535) {
                this.field3588 = -1;
            }
            this.field3568 = arg0.method3207();
            if (this.field3568 == 65535) {
                this.field3568 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3207();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3205();
            this.field3587 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3587[var5] = arg0.method3207();
                if (this.field3587[var5] == 65535) {
                    this.field3587[var5] = -1;
                }
            }
            this.field3587[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jc.h(I)Ljc;")
    public final class282 method4576() {
        int var1 = -1;
        if (this.field3588 != -1) {
            var1 = class238.method1854(this.field3588);
        } else if (this.field3568 != -1) {
            var1 = class238.field2779[this.field3568];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3587.length - 1) {
            var2 = this.field3587[var1];
        } else {
            var2 = this.field3587[this.field3587.length - 1];
        }
        return var2 == -1 ? null : method3145(var2);
    }

    @ObfuscatedName("jc.m(IB)Ljava/lang/String;")
    public String method4577(int arg0) {
        String var2 = this.field3584;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class319.method18(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jc.z(I)Lld;")
    public class332 method4582() {
        if (this.field3577 < 0) {
            return null;
        }
        class332 var1 = (class332) field3570.method3601((long) this.field3577);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method704(Statics.field36, this.field3577, 0);
        if (var2 != null) {
            field3570.method3603(var2, (long) this.field3577);
        }
        return var2;
    }

    @ObfuscatedName("jc.i(S)Lld;")
    public class332 method4605() {
        if (this.field3579 < 0) {
            return null;
        }
        class332 var1 = (class332) field3570.method3601((long) this.field3579);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method704(Statics.field36, this.field3579, 0);
        if (var2 != null) {
            field3570.method3603(var2, (long) this.field3579);
        }
        return var2;
    }

    @ObfuscatedName("jc.u(I)Lld;")
    public class332 method4580() {
        if (this.field3581 < 0) {
            return null;
        }
        class332 var1 = (class332) field3570.method3601((long) this.field3581);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method704(Statics.field36, this.field3581, 0);
        if (var2 != null) {
            field3570.method3603(var2, (long) this.field3581);
        }
        return var2;
    }

    @ObfuscatedName("jc.x(B)Lld;")
    public class332 method4595() {
        if (this.field3580 < 0) {
            return null;
        }
        class332 var1 = (class332) field3570.method3601((long) this.field3580);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method704(Statics.field36, this.field3580, 0);
        if (var2 != null) {
            field3570.method3603(var2, (long) this.field3580);
        }
        return var2;
    }

    @ObfuscatedName("jc.y(B)Lki;")
    public class312 method4584() {
        if (this.field3574 == -1) {
            return null;
        }
        class312 var1 = (class312) field3571.method3601((long) this.field3574);
        if (var1 != null) {
            return var1;
        }
        class312 var2 = class333.method5066(Statics.field36, Statics.field2168, this.field3574, 0);
        if (var2 != null) {
            field3571.method3603(var2, (long) this.field3574);
        }
        return var2;
    }
}
