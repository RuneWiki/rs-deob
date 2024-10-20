package deob;

@ObfuscatedName("js")
public class class263 extends class185 {

    @ObfuscatedName("js.j")
    public static class155 field3359 = new class155(64);

    @ObfuscatedName("js.p")
    public static class155 field3360 = new class155(64);

    @ObfuscatedName("js.g")
    public static class155 field3361 = new class155(20);

    @ObfuscatedName("js.y")
    public int field3363 = -1;

    @ObfuscatedName("js.c")
    public int field3358 = 16777215;

    @ObfuscatedName("js.h")
    public int field3365 = 70;

    @ObfuscatedName("js.k")
    public int field3366 = -1;

    @ObfuscatedName("js.r")
    public int field3367 = -1;

    @ObfuscatedName("js.s")
    public int field3379 = -1;

    @ObfuscatedName("js.v")
    public int field3369 = -1;

    @ObfuscatedName("js.d")
    public int field3370 = 0;

    @ObfuscatedName("js.e")
    public int field3371 = 0;

    @ObfuscatedName("js.l")
    public int field3364 = -1;

    @ObfuscatedName("js.t")
    public String field3373 = "";

    @ObfuscatedName("js.x")
    public int field3374 = -1;

    @ObfuscatedName("js.b")
    public int field3375 = 0;

    @ObfuscatedName("js.i")
    public int[] field3362;

    @ObfuscatedName("js.f")
    public int field3378 = -1;

    @ObfuscatedName("js.ah")
    public int field3368 = -1;

    @ObfuscatedName("js.m(Lkn;B)V")
    public void method4345(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4334(arg0, var2);
        }
    }

    @ObfuscatedName("js.o(Lkn;II)V")
    public void method4334(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3363 = arg0.method5353();
        } else if (arg1 == 2) {
            this.field3358 = arg0.method5231();
        } else if (arg1 == 3) {
            this.field3366 = arg0.method5353();
        } else if (arg1 == 4) {
            this.field3379 = arg0.method5353();
        } else if (arg1 == 5) {
            this.field3367 = arg0.method5353();
        } else if (arg1 == 6) {
            this.field3369 = arg0.method5353();
        } else if (arg1 == 7) {
            this.field3370 = arg0.method5241();
        } else if (arg1 == 8) {
            this.field3373 = arg0.method5403();
        } else if (arg1 == 9) {
            this.field3365 = arg0.method5283();
        } else if (arg1 == 10) {
            this.field3371 = arg0.method5241();
        } else if (arg1 == 11) {
            this.field3364 = 0;
        } else if (arg1 == 12) {
            this.field3374 = arg0.method5227();
        } else if (arg1 == 13) {
            this.field3375 = arg0.method5241();
        } else if (arg1 == 14) {
            this.field3364 = arg0.method5283();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3378 = arg0.method5283();
            if (this.field3378 == 65535) {
                this.field3378 = -1;
            }
            this.field3368 = arg0.method5283();
            if (this.field3368 == 65535) {
                this.field3368 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5283();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5227();
            this.field3362 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3362[var5] = arg0.method5283();
                if (this.field3362[var5] == 65535) {
                    this.field3362[var5] = -1;
                }
            }
            this.field3362[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("js.q(S)Ljs;")
    public final class263 method4323() {
        int var1 = -1;
        if (this.field3378 != -1) {
            var1 = class222.method3842(this.field3378);
        } else if (this.field3368 != -1) {
            var1 = class222.field2562[this.field3368];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3362.length - 1) {
            var2 = this.field3362[var1];
        } else {
            var2 = this.field3362[this.field3362.length - 1];
        }
        if (var2 == -1) {
            return null;
        }
        class263 var3 = (class263) field3359.method3127((long) var2);
        class263 var4;
        if (var3 == null) {
            byte[] var5 = Statics.field3377.method3891(32, var2);
            class263 var6 = new class263();
            if (var5 != null) {
                var6.method4345(new class310(var5));
            }
            field3359.method3137(var6, (long) var2);
            var4 = var6;
        } else {
            var4 = var3;
        }
        return var4;
    }

    @ObfuscatedName("js.j(II)Ljava/lang/String;")
    public String method4326(int arg0) {
        String var2 = this.field3373;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class301.method5005(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("js.p(B)Llz;")
    public class335 method4324() {
        if (this.field3366 < 0) {
            return null;
        }
        class335 var1 = (class335) field3360.method3127((long) this.field3366);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method837(Statics.field3357, this.field3366, 0);
        if (var2 != null) {
            field3360.method3137(var2, (long) this.field3366);
        }
        return var2;
    }

    @ObfuscatedName("js.g(I)Llz;")
    public class335 method4325() {
        if (this.field3367 < 0) {
            return null;
        }
        class335 var1 = (class335) field3360.method3127((long) this.field3367);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method837(Statics.field3357, this.field3367, 0);
        if (var2 != null) {
            field3360.method3137(var2, (long) this.field3367);
        }
        return var2;
    }

    @ObfuscatedName("js.n(B)Llz;")
    public class335 method4321() {
        if (this.field3379 < 0) {
            return null;
        }
        class335 var1 = (class335) field3360.method3127((long) this.field3379);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method837(Statics.field3357, this.field3379, 0);
        if (var2 != null) {
            field3360.method3137(var2, (long) this.field3379);
        }
        return var2;
    }

    @ObfuscatedName("js.u(I)Llz;")
    public class335 method4332() {
        if (this.field3369 < 0) {
            return null;
        }
        class335 var1 = (class335) field3360.method3127((long) this.field3369);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method837(Statics.field3357, this.field3369, 0);
        if (var2 != null) {
            field3360.method3137(var2, (long) this.field3369);
        }
        return var2;
    }

    @ObfuscatedName("js.a(B)Lko;")
    public class305 method4340() {
        if (this.field3363 == -1) {
            return null;
        }
        class305 var1 = (class305) field3361.method3127((long) this.field3363);
        if (var1 != null) {
            return var1;
        }
        class305 var2 = class336.method3098(Statics.field3357, Statics.field3372, this.field3363, 0);
        if (var2 != null) {
            field3361.method3137(var2, (long) this.field3363);
        }
        return var2;
    }
}
