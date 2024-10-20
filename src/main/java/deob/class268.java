package deob;

@ObfuscatedName("jq")
public class class268 extends class207 {

    @ObfuscatedName("jq.b")
    public static class201 field3368 = new class201(64);

    @ObfuscatedName("jq.f")
    public static class201 field3369 = new class201(64);

    @ObfuscatedName("jq.n")
    public static class201 field3370 = new class201(20);

    @ObfuscatedName("jq.d")
    public int field3374 = -1;

    @ObfuscatedName("jq.s")
    public int field3375 = 16777215;

    @ObfuscatedName("jq.p")
    public int field3376 = 70;

    @ObfuscatedName("jq.g")
    public int field3377 = -1;

    @ObfuscatedName("jq.y")
    public int field3378 = -1;

    @ObfuscatedName("jq.c")
    public int field3379 = -1;

    @ObfuscatedName("jq.e")
    public int field3380 = -1;

    @ObfuscatedName("jq.t")
    public int field3372 = 0;

    @ObfuscatedName("jq.u")
    public int field3382 = 0;

    @ObfuscatedName("jq.i")
    public int field3371 = -1;

    @ObfuscatedName("jq.z")
    public String field3366 = "";

    @ObfuscatedName("jq.k")
    public int field3385 = -1;

    @ObfuscatedName("jq.r")
    public int field3386 = 0;

    @ObfuscatedName("jq.v")
    public int[] field3384;

    @ObfuscatedName("jq.o")
    public int field3388 = -1;

    @ObfuscatedName("jq.ai")
    public int field3383 = -1;

    @ObfuscatedName("ct.w(Liv;Liv;Liv;B)V")
    public static void method1782(class248 arg0, class248 arg1, class248 arg2) {
        Statics.field3387 = arg0;
        Statics.field2315 = arg1;
        Statics.field3367 = arg2;
    }

    @ObfuscatedName("j.m(IB)Ljq;")
    public static class268 method93(int arg0) {
        class268 var1 = (class268) field3368.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3387.method4250(32, arg0);
        class268 var3 = new class268();
        if (var2 != null) {
            var3.method4623(new class183(var2));
        }
        field3368.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.q(Lgy;I)V")
    public void method4623(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4622(arg0, var2);
        }
    }

    @ObfuscatedName("jq.x(Lgy;II)V")
    public void method4622(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3374 = arg0.method3279();
        } else if (arg1 == 2) {
            this.field3375 = arg0.method3266();
        } else if (arg1 == 3) {
            this.field3377 = arg0.method3279();
        } else if (arg1 == 4) {
            this.field3379 = arg0.method3279();
        } else if (arg1 == 5) {
            this.field3378 = arg0.method3279();
        } else if (arg1 == 6) {
            this.field3380 = arg0.method3279();
        } else if (arg1 == 7) {
            this.field3372 = arg0.method3498();
        } else if (arg1 == 8) {
            this.field3366 = arg0.method3360();
        } else if (arg1 == 9) {
            this.field3376 = arg0.method3268();
        } else if (arg1 == 10) {
            this.field3382 = arg0.method3498();
        } else if (arg1 == 11) {
            this.field3371 = 0;
        } else if (arg1 == 12) {
            this.field3385 = arg0.method3436();
        } else if (arg1 == 13) {
            this.field3386 = arg0.method3498();
        } else if (arg1 == 14) {
            this.field3371 = arg0.method3268();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3388 = arg0.method3268();
            if (this.field3388 == 65535) {
                this.field3388 = -1;
            }
            this.field3383 = arg0.method3268();
            if (this.field3383 == 65535) {
                this.field3383 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3268();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3436();
            this.field3384 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3384[var5] = arg0.method3268();
                if (this.field3384[var5] == 65535) {
                    this.field3384[var5] = -1;
                }
            }
            this.field3384[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jq.j(I)Ljq;")
    public final class268 method4629() {
        int var1 = -1;
        if (this.field3388 != -1) {
            var1 = class226.method2926(this.field3388);
        } else if (this.field3383 != -1) {
            var1 = class226.field2579[this.field3383];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3384.length - 1) {
            var2 = this.field3384[var1];
        } else {
            var2 = this.field3384[this.field3384.length - 1];
        }
        return var2 == -1 ? null : method93(var2);
    }

    @ObfuscatedName("jq.a(II)Ljava/lang/String;")
    public String method4626(int arg0) {
        String var2 = this.field3366;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class306.method472(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jq.l(I)Llc;")
    public class319 method4632() {
        if (this.field3377 < 0) {
            return null;
        }
        class319 var1 = (class319) field3369.method3707((long) this.field3377);
        if (var1 != null) {
            return var1;
        }
        class319 var2 = class320.method1871(Statics.field2315, this.field3377, 0);
        if (var2 != null) {
            field3369.method3712(var2, (long) this.field3377);
        }
        return var2;
    }

    @ObfuscatedName("jq.d(I)Llc;")
    public class319 method4624() {
        if (this.field3378 < 0) {
            return null;
        }
        class319 var1 = (class319) field3369.method3707((long) this.field3378);
        if (var1 != null) {
            return var1;
        }
        class319 var2 = class320.method1871(Statics.field2315, this.field3378, 0);
        if (var2 != null) {
            field3369.method3712(var2, (long) this.field3378);
        }
        return var2;
    }

    @ObfuscatedName("jq.s(I)Llc;")
    public class319 method4628() {
        if (this.field3379 < 0) {
            return null;
        }
        class319 var1 = (class319) field3369.method3707((long) this.field3379);
        if (var1 != null) {
            return var1;
        }
        class319 var2 = class320.method1871(Statics.field2315, this.field3379, 0);
        if (var2 != null) {
            field3369.method3712(var2, (long) this.field3379);
        }
        return var2;
    }

    @ObfuscatedName("jq.p(I)Llc;")
    public class319 method4655() {
        if (this.field3380 < 0) {
            return null;
        }
        class319 var1 = (class319) field3369.method3707((long) this.field3380);
        if (var1 != null) {
            return var1;
        }
        class319 var2 = class320.method1871(Statics.field2315, this.field3380, 0);
        if (var2 != null) {
            field3369.method3712(var2, (long) this.field3380);
        }
        return var2;
    }

    @ObfuscatedName("jq.g(I)Lkr;")
    public class299 method4630() {
        if (this.field3374 == -1) {
            return null;
        }
        class299 var1 = (class299) field3370.method3707((long) this.field3374);
        if (var1 != null) {
            return var1;
        }
        class248 var2 = Statics.field2315;
        class248 var3 = Statics.field3367;
        int var4 = this.field3374;
        class299 var5;
        if (class320.method5267(var2, var4, 0)) {
            var5 = class320.method676(var3.method4250(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3370.method3712(var5, (long) this.field3374);
        }
        return var5;
    }

    @ObfuscatedName("jq.y(B)V")
    public static void method4657() {
        field3368.method3708();
        field3369.method3708();
        field3370.method3708();
    }
}
