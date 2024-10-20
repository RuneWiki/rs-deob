package deob;

@ObfuscatedName("jh")
public class class282 extends class219 {

    @ObfuscatedName("jh.a")
    public static class213 field3574 = new class213(64);

    @ObfuscatedName("jh.l")
    public static class213 field3585 = new class213(64);

    @ObfuscatedName("jh.b")
    public static class213 field3591 = new class213(20);

    @ObfuscatedName("jh.o")
    public int field3571 = -1;

    @ObfuscatedName("jh.c")
    public int field3580 = 16777215;

    @ObfuscatedName("jh.v")
    public int field3581 = 70;

    @ObfuscatedName("jh.u")
    public int field3587 = -1;

    @ObfuscatedName("jh.j")
    public int field3584 = -1;

    @ObfuscatedName("jh.k")
    public int field3582 = -1;

    @ObfuscatedName("jh.z")
    public int field3575 = -1;

    @ObfuscatedName("jh.w")
    public int field3579 = 0;

    @ObfuscatedName("jh.s")
    public int field3590 = 0;

    @ObfuscatedName("jh.d")
    public int field3588 = -1;

    @ObfuscatedName("jh.f")
    public String field3589 = "";

    @ObfuscatedName("jh.r")
    public int field3576 = -1;

    @ObfuscatedName("jh.y")
    public int field3583 = 0;

    @ObfuscatedName("jh.h")
    public int[] field3592;

    @ObfuscatedName("jh.m")
    public int field3593 = -1;

    @ObfuscatedName("jh.ay")
    public int field3594 = -1;

    @ObfuscatedName("bl.t(II)Ljh;")
    public static class282 method1511(int arg0) {
        class282 var1 = (class282) field3574.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3586.method4265(32, arg0);
        class282 var3 = new class282();
        if (var2 != null) {
            var3.method4565(new class195(var2));
        }
        field3574.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.q(Lgb;B)V")
    public void method4565(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4566(arg0, var2);
        }
    }

    @ObfuscatedName("jh.i(Lgb;II)V")
    public void method4566(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3571 = arg0.method3252();
        } else if (arg1 == 2) {
            this.field3580 = arg0.method3399();
        } else if (arg1 == 3) {
            this.field3587 = arg0.method3252();
        } else if (arg1 == 4) {
            this.field3582 = arg0.method3252();
        } else if (arg1 == 5) {
            this.field3584 = arg0.method3252();
        } else if (arg1 == 6) {
            this.field3575 = arg0.method3252();
        } else if (arg1 == 7) {
            this.field3579 = arg0.method3239();
        } else if (arg1 == 8) {
            this.field3589 = arg0.method3246();
        } else if (arg1 == 9) {
            this.field3581 = arg0.method3238();
        } else if (arg1 == 10) {
            this.field3590 = arg0.method3239();
        } else if (arg1 == 11) {
            this.field3588 = 0;
        } else if (arg1 == 12) {
            this.field3576 = arg0.method3236();
        } else if (arg1 == 13) {
            this.field3583 = arg0.method3239();
        } else if (arg1 == 14) {
            this.field3588 = arg0.method3238();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3593 = arg0.method3238();
            if (this.field3593 == 65535) {
                this.field3593 = -1;
            }
            this.field3594 = arg0.method3238();
            if (this.field3594 == 65535) {
                this.field3594 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3238();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3236();
            this.field3592 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3592[var5] = arg0.method3238();
                if (this.field3592[var5] == 65535) {
                    this.field3592[var5] = -1;
                }
            }
            this.field3592[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jh.a(I)Ljh;")
    public final class282 method4586() {
        int var1 = -1;
        if (this.field3593 != -1) {
            var1 = class238.method1567(this.field3593);
        } else if (this.field3594 != -1) {
            var1 = class238.field2771[this.field3594];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3592.length - 1) {
            var2 = this.field3592[var1];
        } else {
            var2 = this.field3592[this.field3592.length - 1];
        }
        return var2 == -1 ? null : method1511(var2);
    }

    @ObfuscatedName("jh.l(II)Ljava/lang/String;")
    public String method4591(int arg0) {
        String var2 = this.field3589;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class319.method3122(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jh.b(I)Lla;")
    public class332 method4569() {
        if (this.field3587 < 0) {
            return null;
        }
        class332 var1 = (class332) field3585.method3625((long) this.field3587);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method2(Statics.field3572, this.field3587, 0);
        if (var2 != null) {
            field3585.method3627(var2, (long) this.field3587);
        }
        return var2;
    }

    @ObfuscatedName("jh.e(I)Lla;")
    public class332 method4570() {
        if (this.field3584 < 0) {
            return null;
        }
        class332 var1 = (class332) field3585.method3625((long) this.field3584);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method2(Statics.field3572, this.field3584, 0);
        if (var2 != null) {
            field3585.method3627(var2, (long) this.field3584);
        }
        return var2;
    }

    @ObfuscatedName("jh.x(I)Lla;")
    public class332 method4571() {
        if (this.field3582 < 0) {
            return null;
        }
        class332 var1 = (class332) field3585.method3625((long) this.field3582);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method2(Statics.field3572, this.field3582, 0);
        if (var2 != null) {
            field3585.method3627(var2, (long) this.field3582);
        }
        return var2;
    }

    @ObfuscatedName("jh.p(I)Lla;")
    public class332 method4572() {
        if (this.field3575 < 0) {
            return null;
        }
        class332 var1 = (class332) field3585.method3625((long) this.field3575);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method2(Statics.field3572, this.field3575, 0);
        if (var2 != null) {
            field3585.method3627(var2, (long) this.field3575);
        }
        return var2;
    }

    @ObfuscatedName("jh.o(I)Lkm;")
    public class312 method4573() {
        if (this.field3571 == -1) {
            return null;
        }
        class312 var1 = (class312) field3591.method3625((long) this.field3571);
        if (var1 != null) {
            return var1;
        }
        class312 var2 = class333.method2058(Statics.field3572, Statics.field3573, this.field3571, 0);
        if (var2 != null) {
            field3591.method3627(var2, (long) this.field3571);
        }
        return var2;
    }

    @ObfuscatedName("kv.c(I)V")
    public static void method4881() {
        field3574.method3632();
        field3585.method3632();
        field3591.method3632();
    }
}
