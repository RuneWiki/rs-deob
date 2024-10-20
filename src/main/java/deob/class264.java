package deob;

@ObfuscatedName("je")
public class class264 extends class185 {

    @ObfuscatedName("je.w")
    public static class155 field3357 = new class155(64);

    @ObfuscatedName("je.t")
    public static class155 field3358 = new class155(64);

    @ObfuscatedName("je.j")
    public static class155 field3370 = new class155(20);

    @ObfuscatedName("je.e")
    public int field3363 = -1;

    @ObfuscatedName("je.m")
    public int field3364 = 16777215;

    @ObfuscatedName("je.c")
    public int field3365 = 70;

    @ObfuscatedName("je.i")
    public int field3366 = -1;

    @ObfuscatedName("je.f")
    public int field3367 = -1;

    @ObfuscatedName("je.a")
    public int field3356 = -1;

    @ObfuscatedName("je.b")
    public int field3359 = -1;

    @ObfuscatedName("je.y")
    public int field3378 = 0;

    @ObfuscatedName("je.r")
    public int field3354 = 0;

    @ObfuscatedName("je.q")
    public int field3379 = -1;

    @ObfuscatedName("je.g")
    public String field3371 = "";

    @ObfuscatedName("je.s")
    public int field3374 = -1;

    @ObfuscatedName("je.o")
    public int field3375 = 0;

    @ObfuscatedName("je.k")
    public int[] field3376;

    @ObfuscatedName("je.d")
    public int field3377 = -1;

    @ObfuscatedName("je.an")
    public int field3369 = -1;

    @ObfuscatedName("bx.h(Lib;Lib;Lib;I)V")
    public static void method791(class245 arg0, class245 arg1, class245 arg2) {
        Statics.field3373 = arg0;
        Statics.field3355 = arg1;
        Statics.field3372 = arg2;
    }

    @ObfuscatedName("ga.v(II)Lje;")
    public static class264 method3399(int arg0) {
        class264 var1 = (class264) field3357.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3373.method3834(32, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4210(new class311(var2));
        }
        field3357.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.x(Lkj;B)V")
    public void method4210(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4211(arg0, var2);
        }
    }

    @ObfuscatedName("je.w(Lkj;IB)V")
    public void method4211(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3363 = arg0.method5132();
        } else if (arg1 == 2) {
            this.field3364 = arg0.method5119();
        } else if (arg1 == 3) {
            this.field3366 = arg0.method5132();
        } else if (arg1 == 4) {
            this.field3356 = arg0.method5132();
        } else if (arg1 == 5) {
            this.field3367 = arg0.method5132();
        } else if (arg1 == 6) {
            this.field3359 = arg0.method5132();
        } else if (arg1 == 7) {
            this.field3378 = arg0.method5118();
        } else if (arg1 == 8) {
            this.field3371 = arg0.method5347();
        } else if (arg1 == 9) {
            this.field3365 = arg0.method5342();
        } else if (arg1 == 10) {
            this.field3354 = arg0.method5118();
        } else if (arg1 == 11) {
            this.field3379 = 0;
        } else if (arg1 == 12) {
            this.field3374 = arg0.method5274();
        } else if (arg1 == 13) {
            this.field3375 = arg0.method5118();
        } else if (arg1 == 14) {
            this.field3379 = arg0.method5342();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3377 = arg0.method5342();
            if (this.field3377 == 65535) {
                this.field3377 = -1;
            }
            this.field3369 = arg0.method5342();
            if (this.field3369 == 65535) {
                this.field3369 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5342();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5274();
            this.field3376 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3376[var5] = arg0.method5342();
                if (this.field3376[var5] == 65535) {
                    this.field3376[var5] = -1;
                }
            }
            this.field3376[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("je.t(B)Lje;")
    public final class264 method4212() {
        int var1 = -1;
        if (this.field3377 != -1) {
            var1 = class222.method3680(this.field3377);
        } else if (this.field3369 != -1) {
            var1 = class222.field2542[this.field3369];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3376.length - 1) {
            var2 = this.field3376[var1];
        } else {
            var2 = this.field3376[this.field3376.length - 1];
        }
        return var2 == -1 ? null : method3399(var2);
    }

    @ObfuscatedName("je.j(II)Ljava/lang/String;")
    public String method4213(int arg0) {
        String var2 = this.field3371;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class302.method4134(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("je.n(I)Llm;")
    public class336 method4214() {
        if (this.field3366 < 0) {
            return null;
        }
        class336 var1 = (class336) field3358.method3147((long) this.field3366);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method3795(Statics.field3355, this.field3366, 0);
        if (var2 != null) {
            field3358.method3145(var2, (long) this.field3366);
        }
        return var2;
    }

    @ObfuscatedName("je.p(I)Llm;")
    public class336 method4209() {
        if (this.field3367 < 0) {
            return null;
        }
        class336 var1 = (class336) field3358.method3147((long) this.field3367);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method3795(Statics.field3355, this.field3367, 0);
        if (var2 != null) {
            field3358.method3145(var2, (long) this.field3367);
        }
        return var2;
    }

    @ObfuscatedName("je.l(I)Llm;")
    public class336 method4218() {
        if (this.field3356 < 0) {
            return null;
        }
        class336 var1 = (class336) field3358.method3147((long) this.field3356);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method3795(Statics.field3355, this.field3356, 0);
        if (var2 != null) {
            field3358.method3145(var2, (long) this.field3356);
        }
        return var2;
    }

    @ObfuscatedName("je.z(S)Llm;")
    public class336 method4216() {
        if (this.field3359 < 0) {
            return null;
        }
        class336 var1 = (class336) field3358.method3147((long) this.field3359);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method3795(Statics.field3355, this.field3359, 0);
        if (var2 != null) {
            field3358.method3145(var2, (long) this.field3359);
        }
        return var2;
    }

    @ObfuscatedName("je.u(B)Lku;")
    public class306 method4217() {
        if (this.field3363 == -1) {
            return null;
        }
        class306 var1 = (class306) field3370.method3147((long) this.field3363);
        if (var1 != null) {
            return var1;
        }
        class306 var2 = class337.method5469(Statics.field3355, Statics.field3372, this.field3363, 0);
        if (var2 != null) {
            field3370.method3145(var2, (long) this.field3363);
        }
        return var2;
    }

    @ObfuscatedName("ie.e(B)V")
    public static void method4140() {
        field3357.method3146();
        field3358.method3146();
        field3370.method3146();
    }
}
