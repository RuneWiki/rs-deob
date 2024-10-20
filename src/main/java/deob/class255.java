package deob;

@ObfuscatedName("is")
public class class255 extends class195 {

    @ObfuscatedName("is.q")
    public static class190 field3417 = new class190(64);

    @ObfuscatedName("is.g")
    public static class190 field3406 = new class190(64);

    @ObfuscatedName("is.v")
    public static class190 field3415 = new class190(20);

    @ObfuscatedName("is.r")
    public int field3412 = -1;

    @ObfuscatedName("is.b")
    public int field3413 = 16777215;

    @ObfuscatedName("is.x")
    public int field3427 = 70;

    @ObfuscatedName("is.o")
    public int field3414 = -1;

    @ObfuscatedName("is.j")
    public int field3416 = -1;

    @ObfuscatedName("is.m")
    public int field3421 = -1;

    @ObfuscatedName("is.d")
    public int field3418 = -1;

    @ObfuscatedName("is.e")
    public int field3408 = 0;

    @ObfuscatedName("is.s")
    public int field3407 = 0;

    @ObfuscatedName("is.n")
    public int field3404 = -1;

    @ObfuscatedName("is.y")
    public String field3422 = "";

    @ObfuscatedName("is.w")
    public int field3423 = -1;

    @ObfuscatedName("is.f")
    public int field3424 = 0;

    @ObfuscatedName("is.c")
    public int[] field3425;

    @ObfuscatedName("is.z")
    public int field3426 = -1;

    @ObfuscatedName("is.ay")
    public int field3420 = -1;

    @ObfuscatedName("bt.i(Liy;Liy;Liy;S)V")
    public static void method1002(class236 arg0, class236 arg1, class236 arg2) {
        Statics.field3410 = arg0;
        Statics.field3405 = arg1;
        Statics.field2127 = arg2;
    }

    @ObfuscatedName("ex.h(IB)Lis;")
    public static class255 method2697(int arg0) {
        class255 var1 = (class255) field3417.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3410.method3836(32, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4188(new class174(var2));
        }
        field3417.method3316(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.u(Lfv;I)V")
    public void method4188(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4198(arg0, var2);
        }
    }

    @ObfuscatedName("is.q(Lfv;II)V")
    public void method4198(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3412 = arg0.method2945();
        } else if (arg1 == 2) {
            this.field3413 = arg0.method3033();
        } else if (arg1 == 3) {
            this.field3414 = arg0.method2945();
        } else if (arg1 == 4) {
            this.field3421 = arg0.method2945();
        } else if (arg1 == 5) {
            this.field3416 = arg0.method2945();
        } else if (arg1 == 6) {
            this.field3418 = arg0.method2945();
        } else if (arg1 == 7) {
            this.field3408 = arg0.method2933();
        } else if (arg1 == 8) {
            this.field3422 = arg0.method2939();
        } else if (arg1 == 9) {
            this.field3427 = arg0.method2932();
        } else if (arg1 == 10) {
            this.field3407 = arg0.method2933();
        } else if (arg1 == 11) {
            this.field3404 = 0;
        } else if (arg1 == 12) {
            this.field3423 = arg0.method2930();
        } else if (arg1 == 13) {
            this.field3424 = arg0.method2933();
        } else if (arg1 == 14) {
            this.field3404 = arg0.method2932();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3426 = arg0.method2932();
            if (this.field3426 == 65535) {
                this.field3426 = -1;
            }
            this.field3420 = arg0.method2932();
            if (this.field3420 == 65535) {
                this.field3420 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2932();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2930();
            this.field3425 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3425[var5] = arg0.method2932();
                if (this.field3425[var5] == 65535) {
                    this.field3425[var5] = -1;
                }
            }
            this.field3425[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("is.g(I)Lis;")
    public final class255 method4190() {
        int var1 = -1;
        if (this.field3426 != -1) {
            var1 = class212.method1417(this.field3426);
        } else if (this.field3420 != -1) {
            var1 = class212.field2597[this.field3420];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3425.length - 1) {
            var2 = this.field3425[var1];
        } else {
            var2 = this.field3425[this.field3425.length - 1];
        }
        return var2 == -1 ? null : method2697(var2);
    }

    @ObfuscatedName("is.v(IB)Ljava/lang/String;")
    public String method4191(int arg0) {
        String var2 = this.field3422;
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

    @ObfuscatedName("is.t(I)Ljk;")
    public class286 method4189() {
        if (this.field3414 < 0) {
            return null;
        }
        class286 var1 = (class286) field3406.method3308((long) this.field3414);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method2165(Statics.field3405, this.field3414, 0);
        if (var2 != null) {
            field3406.method3316(var2, (long) this.field3414);
        }
        return var2;
    }

    @ObfuscatedName("is.p(I)Ljk;")
    public class286 method4205() {
        if (this.field3416 < 0) {
            return null;
        }
        class286 var1 = (class286) field3406.method3308((long) this.field3416);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method2165(Statics.field3405, this.field3416, 0);
        if (var2 != null) {
            field3406.method3316(var2, (long) this.field3416);
        }
        return var2;
    }

    @ObfuscatedName("is.l(B)Ljk;")
    public class286 method4194() {
        if (this.field3421 < 0) {
            return null;
        }
        class286 var1 = (class286) field3406.method3308((long) this.field3421);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method2165(Statics.field3405, this.field3421, 0);
        if (var2 != null) {
            field3406.method3316(var2, (long) this.field3421);
        }
        return var2;
    }

    @ObfuscatedName("is.a(I)Ljk;")
    public class286 method4195() {
        if (this.field3418 < 0) {
            return null;
        }
        class286 var1 = (class286) field3406.method3308((long) this.field3418);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method2165(Statics.field3405, this.field3418, 0);
        if (var2 != null) {
            field3406.method3316(var2, (long) this.field3418);
        }
        return var2;
    }

    @ObfuscatedName("is.k(I)Ljj;")
    public class264 method4211() {
        if (this.field3412 == -1) {
            return null;
        }
        class264 var1 = (class264) field3415.method3308((long) this.field3412);
        if (var1 != null) {
            return var1;
        }
        class264 var2 = class287.method234(Statics.field3405, Statics.field2127, this.field3412, 0);
        if (var2 != null) {
            field3415.method3316(var2, (long) this.field3412);
        }
        return var2;
    }

    @ObfuscatedName("p.b(I)V")
    public static void method23() {
        field3417.method3311();
        field3406.method3311();
        field3415.method3311();
    }
}
