package deob;

@ObfuscatedName("jb")
public class class282 extends class219 {

    @ObfuscatedName("jb.r")
    public static class213 field3566 = new class213(64);

    @ObfuscatedName("jb.e")
    public static class213 field3567 = new class213(64);

    @ObfuscatedName("jb.y")
    public static class213 field3568 = new class213(20);

    @ObfuscatedName("jb.h")
    public int field3571 = -1;

    @ObfuscatedName("jb.t")
    public int field3570 = 16777215;

    @ObfuscatedName("jb.i")
    public int field3573 = 70;

    @ObfuscatedName("jb.u")
    public int field3575 = -1;

    @ObfuscatedName("jb.q")
    public int field3572 = -1;

    @ObfuscatedName("jb.v")
    public int field3564 = -1;

    @ObfuscatedName("jb.f")
    public int field3577 = -1;

    @ObfuscatedName("jb.b")
    public int field3585 = 0;

    @ObfuscatedName("jb.c")
    public int field3579 = 0;

    @ObfuscatedName("jb.j")
    public int field3587 = -1;

    @ObfuscatedName("jb.l")
    public String field3574 = "";

    @ObfuscatedName("jb.g")
    public int field3582 = -1;

    @ObfuscatedName("jb.w")
    public int field3583 = 0;

    @ObfuscatedName("jb.o")
    public int[] field3584;

    @ObfuscatedName("jb.a")
    public int field3581 = -1;

    @ObfuscatedName("jb.ak")
    public int field3580 = -1;

    @ObfuscatedName("ea.d(Ljk;Ljk;Ljk;B)V")
    public static void method2903(class262 arg0, class262 arg1, class262 arg2) {
        Statics.field3578 = arg0;
        Statics.field305 = arg1;
        Statics.field3565 = arg2;
    }

    @ObfuscatedName("ig.z(II)Ljb;")
    public static class282 method4257(int arg0) {
        class282 var1 = (class282) field3566.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3578.method4273(32, arg0);
        class282 var3 = new class282();
        if (var2 != null) {
            var3.method4672(new class195(var2));
        }
        field3566.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jb.n(Lgy;I)V")
    public void method4672(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4673(arg0, var2);
        }
    }

    @ObfuscatedName("jb.r(Lgy;IB)V")
    public void method4673(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3571 = arg0.method3295();
        } else if (arg1 == 2) {
            this.field3570 = arg0.method3263();
        } else if (arg1 == 3) {
            this.field3575 = arg0.method3295();
        } else if (arg1 == 4) {
            this.field3564 = arg0.method3295();
        } else if (arg1 == 5) {
            this.field3572 = arg0.method3295();
        } else if (arg1 == 6) {
            this.field3577 = arg0.method3295();
        } else if (arg1 == 7) {
            this.field3585 = arg0.method3262();
        } else if (arg1 == 8) {
            this.field3574 = arg0.method3381();
        } else if (arg1 == 9) {
            this.field3573 = arg0.method3269();
        } else if (arg1 == 10) {
            this.field3579 = arg0.method3262();
        } else if (arg1 == 11) {
            this.field3587 = 0;
        } else if (arg1 == 12) {
            this.field3582 = arg0.method3330();
        } else if (arg1 == 13) {
            this.field3583 = arg0.method3262();
        } else if (arg1 == 14) {
            this.field3587 = arg0.method3269();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3581 = arg0.method3269();
            if (this.field3581 == 65535) {
                this.field3581 = -1;
            }
            this.field3580 = arg0.method3269();
            if (this.field3580 == 65535) {
                this.field3580 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3269();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3330();
            this.field3584 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3584[var5] = arg0.method3269();
                if (this.field3584[var5] == 65535) {
                    this.field3584[var5] = -1;
                }
            }
            this.field3584[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jb.e(I)Ljb;")
    public final class282 method4674() {
        int var1 = -1;
        if (this.field3581 != -1) {
            var1 = class238.method728(this.field3581);
        } else if (this.field3580 != -1) {
            var1 = class238.field2783[this.field3580];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3584.length - 1) {
            var2 = this.field3584[var1];
        } else {
            var2 = this.field3584[this.field3584.length - 1];
        }
        return var2 == -1 ? null : method4257(var2);
    }

    @ObfuscatedName("jb.y(II)Ljava/lang/String;")
    public String method4675(int arg0) {
        String var2 = this.field3574;
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

    @ObfuscatedName("jb.k(B)Lly;")
    public class332 method4676() {
        if (this.field3575 < 0) {
            return null;
        }
        class332 var1 = (class332) field3567.method3707((long) this.field3575);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method560(Statics.field305, this.field3575, 0);
        if (var2 != null) {
            field3567.method3697(var2, (long) this.field3575);
        }
        return var2;
    }

    @ObfuscatedName("jb.s(S)Lly;")
    public class332 method4677() {
        if (this.field3572 < 0) {
            return null;
        }
        class332 var1 = (class332) field3567.method3707((long) this.field3572);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method560(Statics.field305, this.field3572, 0);
        if (var2 != null) {
            field3567.method3697(var2, (long) this.field3572);
        }
        return var2;
    }

    @ObfuscatedName("jb.x(I)Lly;")
    public class332 method4678() {
        if (this.field3564 < 0) {
            return null;
        }
        class332 var1 = (class332) field3567.method3707((long) this.field3564);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method560(Statics.field305, this.field3564, 0);
        if (var2 != null) {
            field3567.method3697(var2, (long) this.field3564);
        }
        return var2;
    }

    @ObfuscatedName("jb.h(I)Lly;")
    public class332 method4689() {
        if (this.field3577 < 0) {
            return null;
        }
        class332 var1 = (class332) field3567.method3707((long) this.field3577);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method560(Statics.field305, this.field3577, 0);
        if (var2 != null) {
            field3567.method3697(var2, (long) this.field3577);
        }
        return var2;
    }

    @ObfuscatedName("jb.t(I)Lkw;")
    public class312 method4680() {
        if (this.field3571 == -1) {
            return null;
        }
        class312 var1 = (class312) field3568.method3707((long) this.field3571);
        if (var1 != null) {
            return var1;
        }
        class312 var2 = class333.method2893(Statics.field305, Statics.field3565, this.field3571, 0);
        if (var2 != null) {
            field3568.method3697(var2, (long) this.field3571);
        }
        return var2;
    }
}
