package deob;

@ObfuscatedName("jl")
public class class282 extends class219 {

    @ObfuscatedName("jl.z")
    public static class213 field3569 = new class213(64);

    @ObfuscatedName("jl.n")
    public static class213 field3585 = new class213(64);

    @ObfuscatedName("jl.l")
    public static class213 field3571 = new class213(20);

    @ObfuscatedName("jl.o")
    public int field3575 = -1;

    @ObfuscatedName("jl.d")
    public int field3576 = 16777215;

    @ObfuscatedName("jl.r")
    public int field3581 = 70;

    @ObfuscatedName("jl.p")
    public int field3578 = -1;

    @ObfuscatedName("jl.q")
    public int field3579 = -1;

    @ObfuscatedName("jl.f")
    public int field3580 = -1;

    @ObfuscatedName("jl.j")
    public int field3566 = -1;

    @ObfuscatedName("jl.v")
    public int field3582 = 0;

    @ObfuscatedName("jl.u")
    public int field3583 = 0;

    @ObfuscatedName("jl.k")
    public int field3567 = -1;

    @ObfuscatedName("jl.w")
    public String field3584 = "";

    @ObfuscatedName("jl.m")
    public int field3586 = -1;

    @ObfuscatedName("jl.a")
    public int field3587 = 0;

    @ObfuscatedName("jl.x")
    public int[] field3588;

    @ObfuscatedName("jl.t")
    public int field3570 = -1;

    @ObfuscatedName("jl.ax")
    public int field3590 = -1;

    @ObfuscatedName("bl.g(Ljr;Ljr;Ljr;I)V")
    public static void method995(class262 arg0, class262 arg1, class262 arg2) {
        Statics.field3577 = arg0;
        Statics.field3574 = arg1;
        Statics.field3568 = arg2;
    }

    @ObfuscatedName("jb.e(II)Ljl;")
    public static class282 method4262(int arg0) {
        class282 var1 = (class282) field3569.method3706((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3577.method4294(32, arg0);
        class282 var3 = new class282();
        if (var2 != null) {
            var3.method4654(new class195(var2));
        }
        field3569.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jl.b(Lgg;I)V")
    public void method4654(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4655(arg0, var2);
        }
    }

    @ObfuscatedName("jl.z(Lgg;II)V")
    public void method4655(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3575 = arg0.method3324();
        } else if (arg1 == 2) {
            this.field3576 = arg0.method3312();
        } else if (arg1 == 3) {
            this.field3578 = arg0.method3324();
        } else if (arg1 == 4) {
            this.field3580 = arg0.method3324();
        } else if (arg1 == 5) {
            this.field3579 = arg0.method3324();
        } else if (arg1 == 6) {
            this.field3566 = arg0.method3324();
        } else if (arg1 == 7) {
            this.field3582 = arg0.method3414();
        } else if (arg1 == 8) {
            this.field3584 = arg0.method3318();
        } else if (arg1 == 9) {
            this.field3581 = arg0.method3310();
        } else if (arg1 == 10) {
            this.field3583 = arg0.method3414();
        } else if (arg1 == 11) {
            this.field3567 = 0;
        } else if (arg1 == 12) {
            this.field3586 = arg0.method3332();
        } else if (arg1 == 13) {
            this.field3587 = arg0.method3414();
        } else if (arg1 == 14) {
            this.field3567 = arg0.method3310();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3570 = arg0.method3310();
            if (this.field3570 == 65535) {
                this.field3570 = -1;
            }
            this.field3590 = arg0.method3310();
            if (this.field3590 == 65535) {
                this.field3590 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3310();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3332();
            this.field3588 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3588[var5] = arg0.method3310();
                if (this.field3588[var5] == 65535) {
                    this.field3588[var5] = -1;
                }
            }
            this.field3588[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jl.n(I)Ljl;")
    public final class282 method4657() {
        int var1 = -1;
        if (this.field3570 != -1) {
            var1 = class238.method4502(this.field3570);
        } else if (this.field3590 != -1) {
            var1 = class238.field2788[this.field3590];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3588.length - 1) {
            var2 = this.field3588[var1];
        } else {
            var2 = this.field3588[this.field3588.length - 1];
        }
        return var2 == -1 ? null : method4262(var2);
    }

    @ObfuscatedName("jl.l(II)Ljava/lang/String;")
    public String method4653(int arg0) {
        String var2 = this.field3584;
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

    @ObfuscatedName("jl.s(I)Llv;")
    public class332 method4658() {
        if (this.field3578 < 0) {
            return null;
        }
        class332 var1 = (class332) field3585.method3706((long) this.field3578);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method3538(Statics.field3574, this.field3578, 0);
        if (var2 != null) {
            field3585.method3712(var2, (long) this.field3578);
        }
        return var2;
    }

    @ObfuscatedName("jl.y(I)Llv;")
    public class332 method4684() {
        if (this.field3579 < 0) {
            return null;
        }
        class332 var1 = (class332) field3585.method3706((long) this.field3579);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method3538(Statics.field3574, this.field3579, 0);
        if (var2 != null) {
            field3585.method3712(var2, (long) this.field3579);
        }
        return var2;
    }

    @ObfuscatedName("jl.c(I)Llv;")
    public class332 method4660() {
        if (this.field3580 < 0) {
            return null;
        }
        class332 var1 = (class332) field3585.method3706((long) this.field3580);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method3538(Statics.field3574, this.field3580, 0);
        if (var2 != null) {
            field3585.method3712(var2, (long) this.field3580);
        }
        return var2;
    }

    @ObfuscatedName("jl.o(B)Llv;")
    public class332 method4661() {
        if (this.field3566 < 0) {
            return null;
        }
        class332 var1 = (class332) field3585.method3706((long) this.field3566);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method3538(Statics.field3574, this.field3566, 0);
        if (var2 != null) {
            field3585.method3712(var2, (long) this.field3566);
        }
        return var2;
    }

    @ObfuscatedName("jl.d(I)Lkh;")
    public class312 method4662() {
        if (this.field3575 == -1) {
            return null;
        }
        class312 var1 = (class312) field3571.method3706((long) this.field3575);
        if (var1 != null) {
            return var1;
        }
        class262 var2 = Statics.field3574;
        class262 var3 = Statics.field3568;
        int var4 = this.field3575;
        class312 var5;
        if (class333.method5350(var2, var4, 0)) {
            var5 = class333.method3539(var3.method4294(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3571.method3712(var5, (long) this.field3575);
        }
        return var5;
    }

    @ObfuscatedName("fa.r(I)V")
    public static void method3160() {
        field3569.method3709();
        field3585.method3709();
        field3571.method3709();
    }
}
