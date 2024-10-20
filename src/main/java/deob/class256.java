package deob;

@ObfuscatedName("ix")
public class class256 extends class196 {

    @ObfuscatedName("ix.y")
    public static class191 field3420 = new class191(64);

    @ObfuscatedName("ix.w")
    public static class191 field3406 = new class191(64);

    @ObfuscatedName("ix.k")
    public static class191 field3407 = new class191(20);

    @ObfuscatedName("ix.o")
    public int field3421 = -1;

    @ObfuscatedName("ix.l")
    public int field3418 = 16777215;

    @ObfuscatedName("ix.h")
    public int field3405 = 70;

    @ObfuscatedName("ix.s")
    public int field3425 = -1;

    @ObfuscatedName("ix.c")
    public int field3413 = -1;

    @ObfuscatedName("ix.m")
    public int field3409 = -1;

    @ObfuscatedName("ix.a")
    public int field3415 = -1;

    @ObfuscatedName("ix.t")
    public int field3416 = 0;

    @ObfuscatedName("ix.p")
    public int field3411 = 0;

    @ObfuscatedName("ix.f")
    public int field3402 = -1;

    @ObfuscatedName("ix.b")
    public String field3419 = "";

    @ObfuscatedName("ix.x")
    public int field3403 = -1;

    @ObfuscatedName("ix.i")
    public int field3410 = 0;

    @ObfuscatedName("ix.j")
    public int[] field3422;

    @ObfuscatedName("ix.q")
    public int field3423 = -1;

    @ObfuscatedName("ix.ag")
    public int field3424 = -1;

    @ObfuscatedName("aq.e(Lit;Lit;Lit;I)V")
    public static void method536(class237 arg0, class237 arg1, class237 arg2) {
        Statics.field3412 = arg0;
        Statics.field3414 = arg1;
        Statics.field3404 = arg2;
    }

    @ObfuscatedName("cs.n(II)Lix;")
    public static class256 method1427(int arg0) {
        class256 var1 = (class256) field3420.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3412.method3817(32, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4188(new class175(var2));
        }
        field3420.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.g(Lfh;B)V")
    public void method4188(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method4195(arg0, var2);
        }
    }

    @ObfuscatedName("ix.y(Lfh;II)V")
    public void method4195(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3421 = arg0.method2943();
        } else if (arg1 == 2) {
            this.field3418 = arg0.method2932();
        } else if (arg1 == 3) {
            this.field3425 = arg0.method2943();
        } else if (arg1 == 4) {
            this.field3409 = arg0.method2943();
        } else if (arg1 == 5) {
            this.field3413 = arg0.method2943();
        } else if (arg1 == 6) {
            this.field3415 = arg0.method2943();
        } else if (arg1 == 7) {
            this.field3416 = arg0.method2931();
        } else if (arg1 == 8) {
            this.field3419 = arg0.method3010();
        } else if (arg1 == 9) {
            this.field3405 = arg0.method3091();
        } else if (arg1 == 10) {
            this.field3411 = arg0.method2931();
        } else if (arg1 == 11) {
            this.field3402 = 0;
        } else if (arg1 == 12) {
            this.field3403 = arg0.method2928();
        } else if (arg1 == 13) {
            this.field3410 = arg0.method2931();
        } else if (arg1 == 14) {
            this.field3402 = arg0.method3091();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3423 = arg0.method3091();
            if (this.field3423 == 65535) {
                this.field3423 = -1;
            }
            this.field3424 = arg0.method3091();
            if (this.field3424 == 65535) {
                this.field3424 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3091();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2928();
            this.field3422 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3422[var5] = arg0.method3091();
                if (this.field3422[var5] == 65535) {
                    this.field3422[var5] = -1;
                }
            }
            this.field3422[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ix.w(I)Lix;")
    public final class256 method4184() {
        int var1 = -1;
        if (this.field3423 != -1) {
            var1 = class213.method3619(this.field3423);
        } else if (this.field3424 != -1) {
            var1 = class213.field2585[this.field3424];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3422.length - 1) {
            var2 = this.field3422[var1];
        } else {
            var2 = this.field3422[this.field3422.length - 1];
        }
        return var2 == -1 ? null : method1427(var2);
    }

    @ObfuscatedName("ix.k(II)Ljava/lang/String;")
    public String method4185(int arg0) {
        String var2 = this.field3419;
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

    @ObfuscatedName("ix.v(B)Lkn;")
    public class287 method4196() {
        if (this.field3425 < 0) {
            return null;
        }
        class287 var1 = (class287) field3406.method3288((long) this.field3425);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method994(Statics.field3414, this.field3425, 0);
        if (var2 != null) {
            field3406.method3278(var2, (long) this.field3425);
        }
        return var2;
    }

    @ObfuscatedName("ix.z(B)Lkn;")
    public class287 method4187() {
        if (this.field3413 < 0) {
            return null;
        }
        class287 var1 = (class287) field3406.method3288((long) this.field3413);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method994(Statics.field3414, this.field3413, 0);
        if (var2 != null) {
            field3406.method3278(var2, (long) this.field3413);
        }
        return var2;
    }

    @ObfuscatedName("ix.r(I)Lkn;")
    public class287 method4202() {
        if (this.field3409 < 0) {
            return null;
        }
        class287 var1 = (class287) field3406.method3288((long) this.field3409);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method994(Statics.field3414, this.field3409, 0);
        if (var2 != null) {
            field3406.method3278(var2, (long) this.field3409);
        }
        return var2;
    }

    @ObfuscatedName("ix.u(I)Lkn;")
    public class287 method4189() {
        if (this.field3415 < 0) {
            return null;
        }
        class287 var1 = (class287) field3406.method3288((long) this.field3415);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method994(Statics.field3414, this.field3415, 0);
        if (var2 != null) {
            field3406.method3278(var2, (long) this.field3415);
        }
        return var2;
    }

    @ObfuscatedName("ix.d(I)Ljk;")
    public class265 method4190() {
        if (this.field3421 == -1) {
            return null;
        }
        class265 var1 = (class265) field3407.method3288((long) this.field3421);
        if (var1 != null) {
            return var1;
        }
        class265 var2 = class288.method3771(Statics.field3414, Statics.field3404, this.field3421, 0);
        if (var2 != null) {
            field3407.method3278(var2, (long) this.field3421);
        }
        return var2;
    }
}
