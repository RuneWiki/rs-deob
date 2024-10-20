package deob;

@ObfuscatedName("jf")
public class class282 extends class219 {

    @ObfuscatedName("jf.j")
    public static class213 field3567 = new class213(64);

    @ObfuscatedName("jf.k")
    public static class213 field3568 = new class213(64);

    @ObfuscatedName("jf.x")
    public static class213 field3569 = new class213(20);

    @ObfuscatedName("jf.a")
    public int field3571 = -1;

    @ObfuscatedName("jf.e")
    public int field3572 = 16777215;

    @ObfuscatedName("jf.f")
    public int field3573 = 70;

    @ObfuscatedName("jf.l")
    public int field3574 = -1;

    @ObfuscatedName("jf.m")
    public int field3584 = -1;

    @ObfuscatedName("jf.b")
    public int field3581 = -1;

    @ObfuscatedName("jf.h")
    public int field3576 = -1;

    @ObfuscatedName("jf.t")
    public int field3578 = 0;

    @ObfuscatedName("jf.v")
    public int field3579 = 0;

    @ObfuscatedName("jf.n")
    public int field3580 = -1;

    @ObfuscatedName("jf.u")
    public String field3564 = "";

    @ObfuscatedName("jf.q")
    public int field3582 = -1;

    @ObfuscatedName("jf.g")
    public int field3583 = 0;

    @ObfuscatedName("jf.y")
    public int[] field3570;

    @ObfuscatedName("jf.s")
    public int field3586 = -1;

    @ObfuscatedName("jf.ac")
    public int field3575 = -1;

    @ObfuscatedName("w.c(IB)Ljf;")
    public static class282 method47(int arg0) {
        class282 var1 = (class282) field3567.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3577.method4190(32, arg0);
        class282 var3 = new class282();
        if (var2 != null) {
            var3.method4604(new class195(var2));
        }
        field3567.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jf.i(Lgp;I)V")
    public void method4604(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4590(arg0, var2);
        }
    }

    @ObfuscatedName("jf.o(Lgp;II)V")
    public void method4590(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3571 = arg0.method3309();
        } else if (arg1 == 2) {
            this.field3572 = arg0.method3293();
        } else if (arg1 == 3) {
            this.field3574 = arg0.method3309();
        } else if (arg1 == 4) {
            this.field3581 = arg0.method3309();
        } else if (arg1 == 5) {
            this.field3584 = arg0.method3309();
        } else if (arg1 == 6) {
            this.field3576 = arg0.method3309();
        } else if (arg1 == 7) {
            this.field3578 = arg0.method3303();
        } else if (arg1 == 8) {
            this.field3564 = arg0.method3235();
        } else if (arg1 == 9) {
            this.field3573 = arg0.method3218();
        } else if (arg1 == 10) {
            this.field3579 = arg0.method3303();
        } else if (arg1 == 11) {
            this.field3580 = 0;
        } else if (arg1 == 12) {
            this.field3582 = arg0.method3429();
        } else if (arg1 == 13) {
            this.field3583 = arg0.method3303();
        } else if (arg1 == 14) {
            this.field3580 = arg0.method3218();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3586 = arg0.method3218();
            if (this.field3586 == 65535) {
                this.field3586 = -1;
            }
            this.field3575 = arg0.method3218();
            if (this.field3575 == 65535) {
                this.field3575 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3218();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3429();
            this.field3570 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3570[var5] = arg0.method3218();
                if (this.field3570[var5] == 65535) {
                    this.field3570[var5] = -1;
                }
            }
            this.field3570[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jf.j(I)Ljf;")
    public final class282 method4620() {
        int var1 = -1;
        if (this.field3586 != -1) {
            var1 = class238.method1710(this.field3586);
        } else if (this.field3575 != -1) {
            var1 = class238.field2771[this.field3575];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3570.length - 1) {
            var2 = this.field3570[var1];
        } else {
            var2 = this.field3570[this.field3570.length - 1];
        }
        return var2 == -1 ? null : method47(var2);
    }

    @ObfuscatedName("jf.k(II)Ljava/lang/String;")
    public String method4592(int arg0) {
        String var2 = this.field3564;
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

    @ObfuscatedName("jf.x(I)Lla;")
    public class332 method4615() {
        if (this.field3574 < 0) {
            return null;
        }
        class332 var1 = (class332) field3568.method3625((long) this.field3574);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method5407(Statics.field3565, this.field3574, 0);
        if (var2 != null) {
            field3568.method3628(var2, (long) this.field3574);
        }
        return var2;
    }

    @ObfuscatedName("jf.z(I)Lla;")
    public class332 method4610() {
        if (this.field3584 < 0) {
            return null;
        }
        class332 var1 = (class332) field3568.method3625((long) this.field3584);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method5407(Statics.field3565, this.field3584, 0);
        if (var2 != null) {
            field3568.method3628(var2, (long) this.field3584);
        }
        return var2;
    }

    @ObfuscatedName("jf.p(I)Lla;")
    public class332 method4595() {
        if (this.field3581 < 0) {
            return null;
        }
        class332 var1 = (class332) field3568.method3625((long) this.field3581);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method5407(Statics.field3565, this.field3581, 0);
        if (var2 != null) {
            field3568.method3628(var2, (long) this.field3581);
        }
        return var2;
    }

    @ObfuscatedName("jf.w(B)Lla;")
    public class332 method4596() {
        if (this.field3576 < 0) {
            return null;
        }
        class332 var1 = (class332) field3568.method3625((long) this.field3576);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method5407(Statics.field3565, this.field3576, 0);
        if (var2 != null) {
            field3568.method3628(var2, (long) this.field3576);
        }
        return var2;
    }

    @ObfuscatedName("jf.r(I)Lkw;")
    public class312 method4611() {
        if (this.field3571 == -1) {
            return null;
        }
        class312 var1 = (class312) field3569.method3625((long) this.field3571);
        if (var1 != null) {
            return var1;
        }
        class262 var2 = Statics.field3565;
        class262 var3 = Statics.field3566;
        int var4 = this.field3571;
        class312 var5;
        if (Statics.method4828(var2, var4, 0)) {
            var5 = Statics.method4399(var3.method4190(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3569.method3628(var5, (long) this.field3571);
        }
        return var5;
    }

    @ObfuscatedName("db.d(I)V")
    public static void method2455() {
        field3567.method3629();
        field3568.method3629();
        field3569.method3629();
    }
}
