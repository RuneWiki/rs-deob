package deob;

@ObfuscatedName("ib")
public class class256 extends class196 {

    @ObfuscatedName("ib.p")
    public static class191 field3403 = new class191(64);

    @ObfuscatedName("ib.x")
    public static class191 field3404 = new class191(64);

    @ObfuscatedName("ib.g")
    public static class191 field3405 = new class191(20);

    @ObfuscatedName("ib.m")
    public int field3423 = -1;

    @ObfuscatedName("ib.i")
    public int field3410 = 16777215;

    @ObfuscatedName("ib.s")
    public int field3411 = 70;

    @ObfuscatedName("ib.r")
    public int field3409 = -1;

    @ObfuscatedName("ib.e")
    public int field3413 = -1;

    @ObfuscatedName("ib.a")
    public int field3414 = -1;

    @ObfuscatedName("ib.v")
    public int field3415 = -1;

    @ObfuscatedName("ib.t")
    public int field3421 = 0;

    @ObfuscatedName("ib.y")
    public int field3417 = 0;

    @ObfuscatedName("ib.z")
    public int field3418 = -1;

    @ObfuscatedName("ib.u")
    public String field3420 = "";

    @ObfuscatedName("ib.k")
    public int field3400 = -1;

    @ObfuscatedName("ib.q")
    public int field3424 = 0;

    @ObfuscatedName("ib.n")
    public int[] field3422;

    @ObfuscatedName("ib.d")
    public int field3416 = -1;

    @ObfuscatedName("ib.ax")
    public int field3408 = -1;

    @ObfuscatedName("fa.j(Lia;Lia;Lia;B)V")
    public static void method3123(class237 arg0, class237 arg1, class237 arg2) {
        Statics.field3406 = arg0;
        Statics.field3401 = arg1;
        Statics.field3402 = arg2;
    }

    @ObfuscatedName("ib.f(Lfb;B)V")
    public void method4156(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method4157(arg0, var2);
        }
    }

    @ObfuscatedName("ib.p(Lfb;II)V")
    public void method4157(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3423 = arg0.method2918();
        } else if (arg1 == 2) {
            this.field3410 = arg0.method3070();
        } else if (arg1 == 3) {
            this.field3409 = arg0.method2918();
        } else if (arg1 == 4) {
            this.field3414 = arg0.method2918();
        } else if (arg1 == 5) {
            this.field3413 = arg0.method2918();
        } else if (arg1 == 6) {
            this.field3415 = arg0.method2918();
        } else if (arg1 == 7) {
            this.field3421 = arg0.method3077();
        } else if (arg1 == 8) {
            this.field3420 = arg0.method2976();
        } else if (arg1 == 9) {
            this.field3411 = arg0.method3023();
        } else if (arg1 == 10) {
            this.field3417 = arg0.method3077();
        } else if (arg1 == 11) {
            this.field3418 = 0;
        } else if (arg1 == 12) {
            this.field3400 = arg0.method2903();
        } else if (arg1 == 13) {
            this.field3424 = arg0.method3077();
        } else if (arg1 == 14) {
            this.field3418 = arg0.method3023();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3416 = arg0.method3023();
            if (this.field3416 == 65535) {
                this.field3416 = -1;
            }
            this.field3408 = arg0.method3023();
            if (this.field3408 == 65535) {
                this.field3408 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3023();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2903();
            this.field3422 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3422[var5] = arg0.method3023();
                if (this.field3422[var5] == 65535) {
                    this.field3422[var5] = -1;
                }
            }
            this.field3422[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ib.x(I)Lib;")
    public final class256 method4158() {
        int var1 = -1;
        if (this.field3416 != -1) {
            var1 = class213.method13(this.field3416);
        } else if (this.field3408 != -1) {
            var1 = class213.field2604[this.field3408];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3422.length - 1) {
            var2 = this.field3422[var1];
        } else {
            var2 = this.field3422[this.field3422.length - 1];
        }
        return var2 == -1 ? null : Statics.method3763(var2);
    }

    @ObfuscatedName("ib.g(II)Ljava/lang/String;")
    public String method4159(int arg0) {
        String var2 = this.field3420;
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

    @ObfuscatedName("ib.c(I)Lkp;")
    public class287 method4160() {
        if (this.field3409 < 0) {
            return null;
        }
        class287 var1 = (class287) field3404.method3271((long) this.field3409);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method4115(Statics.field3401, this.field3409, 0);
        if (var2 != null) {
            field3404.method3270(var2, (long) this.field3409);
        }
        return var2;
    }

    @ObfuscatedName("ib.l(I)Lkp;")
    public class287 method4155() {
        if (this.field3413 < 0) {
            return null;
        }
        class287 var1 = (class287) field3404.method3271((long) this.field3413);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method4115(Statics.field3401, this.field3413, 0);
        if (var2 != null) {
            field3404.method3270(var2, (long) this.field3413);
        }
        return var2;
    }

    @ObfuscatedName("ib.w(B)Lkp;")
    public class287 method4162() {
        if (this.field3414 < 0) {
            return null;
        }
        class287 var1 = (class287) field3404.method3271((long) this.field3414);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method4115(Statics.field3401, this.field3414, 0);
        if (var2 != null) {
            field3404.method3270(var2, (long) this.field3414);
        }
        return var2;
    }

    @ObfuscatedName("ib.b(I)Lkp;")
    public class287 method4163() {
        if (this.field3415 < 0) {
            return null;
        }
        class287 var1 = (class287) field3404.method3271((long) this.field3415);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method4115(Statics.field3401, this.field3415, 0);
        if (var2 != null) {
            field3404.method3270(var2, (long) this.field3415);
        }
        return var2;
    }

    @ObfuscatedName("ib.o(I)Ljh;")
    public class265 method4166() {
        if (this.field3423 == -1) {
            return null;
        }
        class265 var1 = (class265) field3405.method3271((long) this.field3423);
        if (var1 != null) {
            return var1;
        }
        class265 var2 = class288.method3768(Statics.field3401, Statics.field3402, this.field3423, 0);
        if (var2 != null) {
            field3405.method3270(var2, (long) this.field3423);
        }
        return var2;
    }

    @ObfuscatedName("br.m(I)V")
    public static void method1097() {
        field3403.method3259();
        field3404.method3259();
        field3405.method3259();
    }
}
