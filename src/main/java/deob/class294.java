package deob;

@ObfuscatedName("kt")
public class class294 extends class346 {

    @ObfuscatedName("kt.p")
    public static class199 field3575 = new class199(64);

    @ObfuscatedName("kt.b")
    public static class199 field3566 = new class199(64);

    @ObfuscatedName("kt.e")
    public static class199 field3567 = new class199(20);

    @ObfuscatedName("kt.m")
    public int field3565 = -1;

    @ObfuscatedName("kt.d")
    public int field3572 = 16777215;

    @ObfuscatedName("kt.c")
    public int field3582 = 70;

    @ObfuscatedName("kt.j")
    public int field3574 = -1;

    @ObfuscatedName("kt.r")
    public int field3578 = -1;

    @ObfuscatedName("kt.q")
    public int field3576 = -1;

    @ObfuscatedName("kt.t")
    public int field3577 = -1;

    @ObfuscatedName("kt.v")
    public int field3573 = 0;

    @ObfuscatedName("kt.x")
    public int field3585 = 0;

    @ObfuscatedName("kt.z")
    public int field3580 = -1;

    @ObfuscatedName("kt.i")
    public String field3581 = "";

    @ObfuscatedName("kt.a")
    public int field3587 = -1;

    @ObfuscatedName("kt.w")
    public int field3583 = 0;

    @ObfuscatedName("kt.s")
    public int[] field3584;

    @ObfuscatedName("kt.y")
    public int field3568 = -1;

    @ObfuscatedName("kt.ac")
    public int field3586 = -1;

    @ObfuscatedName("ex.f(Lir;Lir;Lir;I)V")
    public static void method2681(class253 arg0, class253 arg1, class253 arg2) {
        Statics.field3562 = arg0;
        Statics.field3563 = arg1;
        Statics.field3564 = arg2;
    }

    @ObfuscatedName("ij.o(II)Lkt;")
    public static class294 method3861(int arg0) {
        class294 var1 = (class294) field3575.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3562.method3933(32, arg0);
        class294 var3 = new class294();
        if (var2 != null) {
            var3.method4560(new class382(var2));
        }
        field3575.method3400(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kt.u(Lnu;I)V")
    public void method4560(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4561(arg0, var2);
        }
    }

    @ObfuscatedName("kt.p(Lnu;IB)V")
    public void method4561(class382 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3565 = arg0.method5873();
        } else if (arg1 == 2) {
            this.field3572 = arg0.method5875();
        } else if (arg1 == 3) {
            this.field3574 = arg0.method5873();
        } else if (arg1 == 4) {
            this.field3576 = arg0.method5873();
        } else if (arg1 == 5) {
            this.field3578 = arg0.method5873();
        } else if (arg1 == 6) {
            this.field3577 = arg0.method5873();
        } else if (arg1 == 7) {
            this.field3573 = arg0.method5859();
        } else if (arg1 == 8) {
            this.field3581 = arg0.method5896();
        } else if (arg1 == 9) {
            this.field3582 = arg0.method5858();
        } else if (arg1 == 10) {
            this.field3585 = arg0.method5859();
        } else if (arg1 == 11) {
            this.field3580 = 0;
        } else if (arg1 == 12) {
            this.field3587 = arg0.method5856();
        } else if (arg1 == 13) {
            this.field3583 = arg0.method5859();
        } else if (arg1 == 14) {
            this.field3580 = arg0.method5858();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3568 = arg0.method5858();
            if (this.field3568 == 65535) {
                this.field3568 = -1;
            }
            this.field3586 = arg0.method5858();
            if (this.field3586 == 65535) {
                this.field3586 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5858();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5856();
            this.field3584 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3584[var5] = arg0.method5858();
                if (this.field3584[var5] == 65535) {
                    this.field3584[var5] = -1;
                }
            }
            this.field3584[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("kt.b(I)Lkt;")
    public final class294 method4562() {
        int var1 = -1;
        if (this.field3568 != -1) {
            var1 = class220.method29(this.field3568);
        } else if (this.field3586 != -1) {
            var1 = class220.field2578[this.field3586];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3584.length - 1) {
            var2 = this.field3584[var1];
        } else {
            var2 = this.field3584[this.field3584.length - 1];
        }
        return var2 == -1 ? null : method3861(var2);
    }

    @ObfuscatedName("kt.e(II)Ljava/lang/String;")
    public String method4594(int arg0) {
        String var2 = this.field3581;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class303.method3346(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("kt.k(I)Loh;")
    public class395 method4593() {
        if (this.field3574 < 0) {
            return null;
        }
        class395 var1 = (class395) field3566.method3398((long) this.field3574);
        if (var1 != null) {
            return var1;
        }
        class395 var2 = class396.method3341(Statics.field3563, this.field3574, 0);
        if (var2 != null) {
            field3566.method3400(var2, (long) this.field3574);
        }
        return var2;
    }

    @ObfuscatedName("kt.g(I)Loh;")
    public class395 method4564() {
        if (this.field3578 < 0) {
            return null;
        }
        class395 var1 = (class395) field3566.method3398((long) this.field3578);
        if (var1 != null) {
            return var1;
        }
        class395 var2 = class396.method3341(Statics.field3563, this.field3578, 0);
        if (var2 != null) {
            field3566.method3400(var2, (long) this.field3578);
        }
        return var2;
    }

    @ObfuscatedName("kt.h(I)Loh;")
    public class395 method4565() {
        if (this.field3576 < 0) {
            return null;
        }
        class395 var1 = (class395) field3566.method3398((long) this.field3576);
        if (var1 != null) {
            return var1;
        }
        class395 var2 = class396.method3341(Statics.field3563, this.field3576, 0);
        if (var2 != null) {
            field3566.method3400(var2, (long) this.field3576);
        }
        return var2;
    }

    @ObfuscatedName("kt.n(I)Loh;")
    public class395 method4584() {
        if (this.field3577 < 0) {
            return null;
        }
        class395 var1 = (class395) field3566.method3398((long) this.field3577);
        if (var1 != null) {
            return var1;
        }
        class395 var2 = class396.method3341(Statics.field3563, this.field3577, 0);
        if (var2 != null) {
            field3566.method3400(var2, (long) this.field3577);
        }
        return var2;
    }

    @ObfuscatedName("kt.l(I)Lkq;")
    public class299 method4567() {
        if (this.field3565 == -1) {
            return null;
        }
        class299 var1 = (class299) field3567.method3398((long) this.field3565);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class396.method3848(Statics.field3563, Statics.field3564, this.field3565, 0);
        if (var2 != null) {
            field3567.method3400(var2, (long) this.field3565);
        }
        return var2;
    }

    @ObfuscatedName("et.m(I)V")
    public static void method2295() {
        field3575.method3392();
        field3566.method3392();
        field3567.method3392();
    }
}
