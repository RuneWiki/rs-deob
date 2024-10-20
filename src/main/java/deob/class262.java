package deob;

@ObfuscatedName("jb")
public class class262 extends class202 {

    @ObfuscatedName("jb.j")
    public static class197 field3483 = new class197(64);

    @ObfuscatedName("jb.v")
    public static class197 field3466 = new class197(64);

    @ObfuscatedName("jb.x")
    public static class197 field3486 = new class197(20);

    @ObfuscatedName("jb.a")
    public int field3474 = -1;

    @ObfuscatedName("jb.y")
    public int field3472 = 16777215;

    @ObfuscatedName("jb.w")
    public int field3473 = 70;

    @ObfuscatedName("jb.k")
    public int field3485 = -1;

    @ObfuscatedName("jb.t")
    public int field3475 = -1;

    @ObfuscatedName("jb.h")
    public int field3476 = -1;

    @ObfuscatedName("jb.u")
    public int field3462 = -1;

    @ObfuscatedName("jb.r")
    public int field3478 = 0;

    @ObfuscatedName("jb.g")
    public int field3479 = 0;

    @ObfuscatedName("jb.z")
    public int field3465 = -1;

    @ObfuscatedName("jb.o")
    public String field3481 = "";

    @ObfuscatedName("jb.d")
    public int field3482 = -1;

    @ObfuscatedName("jb.s")
    public int field3471 = 0;

    @ObfuscatedName("jb.f")
    public int[] field3484;

    @ObfuscatedName("jb.q")
    public int field3477 = -1;

    @ObfuscatedName("jb.al")
    public int field3469 = -1;

    @ObfuscatedName("br.m(Lik;Lik;Lik;S)V")
    public static void method1031(class243 arg0, class243 arg1, class243 arg2) {
        Statics.field3480 = arg0;
        Statics.field3463 = arg1;
        Statics.field3464 = arg2;
    }

    @ObfuscatedName("c.p(II)Ljb;")
    public static class262 method47(int arg0) {
        class262 var1 = (class262) field3483.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3480.method3930(32, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4288(new class181(var2));
        }
        field3483.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jb.i(Lfv;I)V")
    public void method4288(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4300(arg0, var2);
        }
    }

    @ObfuscatedName("jb.j(Lfv;II)V")
    public void method4300(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3474 = arg0.method3028();
        } else if (arg1 == 2) {
            this.field3472 = arg0.method3075();
        } else if (arg1 == 3) {
            this.field3485 = arg0.method3028();
        } else if (arg1 == 4) {
            this.field3476 = arg0.method3028();
        } else if (arg1 == 5) {
            this.field3475 = arg0.method3028();
        } else if (arg1 == 6) {
            this.field3462 = arg0.method3028();
        } else if (arg1 == 7) {
            this.field3478 = arg0.method3015();
        } else if (arg1 == 8) {
            this.field3481 = arg0.method3035();
        } else if (arg1 == 9) {
            this.field3473 = arg0.method3009();
        } else if (arg1 == 10) {
            this.field3479 = arg0.method3015();
        } else if (arg1 == 11) {
            this.field3465 = 0;
        } else if (arg1 == 12) {
            this.field3482 = arg0.method3012();
        } else if (arg1 == 13) {
            this.field3471 = arg0.method3015();
        } else if (arg1 == 14) {
            this.field3465 = arg0.method3009();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3477 = arg0.method3009();
            if (this.field3477 == 65535) {
                this.field3477 = -1;
            }
            this.field3469 = arg0.method3009();
            if (this.field3469 == 65535) {
                this.field3469 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3009();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3012();
            this.field3484 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3484[var5] = arg0.method3009();
                if (this.field3484[var5] == 65535) {
                    this.field3484[var5] = -1;
                }
            }
            this.field3484[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jb.v(B)Ljb;")
    public final class262 method4290() {
        int var1 = -1;
        if (this.field3477 != -1) {
            var1 = class219.method1684(this.field3477);
        } else if (this.field3469 != -1) {
            var1 = class219.field2689[this.field3469];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3484.length - 1) {
            var2 = this.field3484[var1];
        } else {
            var2 = this.field3484[this.field3484.length - 1];
        }
        return var2 == -1 ? null : method47(var2);
    }

    @ObfuscatedName("jb.x(II)Ljava/lang/String;")
    public String method4318(int arg0) {
        String var2 = this.field3481;
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

    @ObfuscatedName("jb.e(I)Lkd;")
    public class295 method4292() {
        if (this.field3485 < 0) {
            return null;
        }
        class295 var1 = (class295) field3466.method3419((long) this.field3485);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method166(Statics.field3463, this.field3485, 0);
        if (var2 != null) {
            field3466.method3418(var2, (long) this.field3485);
        }
        return var2;
    }

    @ObfuscatedName("jb.l(I)Lkd;")
    public class295 method4293() {
        if (this.field3475 < 0) {
            return null;
        }
        class295 var1 = (class295) field3466.method3419((long) this.field3475);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method166(Statics.field3463, this.field3475, 0);
        if (var2 != null) {
            field3466.method3418(var2, (long) this.field3475);
        }
        return var2;
    }

    @ObfuscatedName("jb.b(B)Lkd;")
    public class295 method4324() {
        if (this.field3476 < 0) {
            return null;
        }
        class295 var1 = (class295) field3466.method3419((long) this.field3476);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method166(Statics.field3463, this.field3476, 0);
        if (var2 != null) {
            field3466.method3418(var2, (long) this.field3476);
        }
        return var2;
    }

    @ObfuscatedName("jb.n(I)Lkd;")
    public class295 method4295() {
        if (this.field3462 < 0) {
            return null;
        }
        class295 var1 = (class295) field3466.method3419((long) this.field3462);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method166(Statics.field3463, this.field3462, 0);
        if (var2 != null) {
            field3466.method3418(var2, (long) this.field3462);
        }
        return var2;
    }

    @ObfuscatedName("jb.c(I)Ljt;")
    public class271 method4296() {
        if (this.field3474 == -1) {
            return null;
        }
        class271 var1 = (class271) field3486.method3419((long) this.field3474);
        if (var1 != null) {
            return var1;
        }
        class271 var2 = class296.method3908(Statics.field3463, Statics.field3464, this.field3474, 0);
        if (var2 != null) {
            field3486.method3418(var2, (long) this.field3474);
        }
        return var2;
    }
}
