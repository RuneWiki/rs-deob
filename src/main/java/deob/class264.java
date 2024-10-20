package deob;

@ObfuscatedName("jm")
public class class264 extends class181 {

    @ObfuscatedName("jm.w")
    public static class146 field3399 = new class146(64);

    @ObfuscatedName("jm.o")
    public static class146 field3400 = new class146(64);

    @ObfuscatedName("jm.u")
    public static class146 field3411 = new class146(20);

    @ObfuscatedName("jm.k")
    public int field3405 = -1;

    @ObfuscatedName("jm.n")
    public int field3406 = 16777215;

    @ObfuscatedName("jm.i")
    public int field3407 = 70;

    @ObfuscatedName("jm.a")
    public int field3408 = -1;

    @ObfuscatedName("jm.z")
    public int field3420 = -1;

    @ObfuscatedName("jm.j")
    public int field3410 = -1;

    @ObfuscatedName("jm.s")
    public int field3419 = -1;

    @ObfuscatedName("jm.t")
    public int field3401 = 0;

    @ObfuscatedName("jm.y")
    public int field3413 = 0;

    @ObfuscatedName("jm.h")
    public int field3414 = -1;

    @ObfuscatedName("jm.b")
    public String field3398 = "";

    @ObfuscatedName("jm.c")
    public int field3416 = -1;

    @ObfuscatedName("jm.r")
    public int field3417 = 0;

    @ObfuscatedName("jm.p")
    public int[] field3418;

    @ObfuscatedName("jm.v")
    public int field3409 = -1;

    @ObfuscatedName("jm.ag")
    public int field3412 = -1;

    @ObfuscatedName("bo.m(Lir;Lir;Lir;I)V")
    public static void method1034(class245 arg0, class245 arg1, class245 arg2) {
        Statics.field3402 = arg0;
        Statics.field3397 = arg1;
        Statics.field3403 = arg2;
    }

    @ObfuscatedName("bp.f(II)Ljm;")
    public static class264 method1627(int arg0) {
        class264 var1 = (class264) field3399.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3402.method4156(32, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4549(new class202(var2));
        }
        field3399.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jm.q(Lgr;I)V")
    public void method4549(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4550(arg0, var2);
        }
    }

    @ObfuscatedName("jm.w(Lgr;II)V")
    public void method4550(class202 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3405 = arg0.method3434();
        } else if (arg1 == 2) {
            this.field3406 = arg0.method3421();
        } else if (arg1 == 3) {
            this.field3408 = arg0.method3434();
        } else if (arg1 == 4) {
            this.field3410 = arg0.method3434();
        } else if (arg1 == 5) {
            this.field3420 = arg0.method3434();
        } else if (arg1 == 6) {
            this.field3419 = arg0.method3434();
        } else if (arg1 == 7) {
            this.field3401 = arg0.method3420();
        } else if (arg1 == 8) {
            this.field3398 = arg0.method3462();
        } else if (arg1 == 9) {
            this.field3407 = arg0.method3530();
        } else if (arg1 == 10) {
            this.field3413 = arg0.method3420();
        } else if (arg1 == 11) {
            this.field3414 = 0;
        } else if (arg1 == 12) {
            this.field3416 = arg0.method3551();
        } else if (arg1 == 13) {
            this.field3417 = arg0.method3420();
        } else if (arg1 == 14) {
            this.field3414 = arg0.method3530();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3409 = arg0.method3530();
            if (this.field3409 == 65535) {
                this.field3409 = -1;
            }
            this.field3412 = arg0.method3530();
            if (this.field3412 == 65535) {
                this.field3412 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3530();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3551();
            this.field3418 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3418[var5] = arg0.method3530();
                if (this.field3418[var5] == 65535) {
                    this.field3418[var5] = -1;
                }
            }
            this.field3418[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jm.o(B)Ljm;")
    public final class264 method4559() {
        int var1 = -1;
        if (this.field3409 != -1) {
            var1 = class224.method529(this.field3409);
        } else if (this.field3412 != -1) {
            var1 = class224.field2601[this.field3412];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3418.length - 1) {
            var2 = this.field3418[var1];
        } else {
            var2 = this.field3418[this.field3418.length - 1];
        }
        return var2 == -1 ? null : method1627(var2);
    }

    @ObfuscatedName("jm.u(IS)Ljava/lang/String;")
    public String method4552(int arg0) {
        String var2 = this.field3398;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class309.method3650(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jm.g(I)Lln;")
    public class328 method4553() {
        if (this.field3408 < 0) {
            return null;
        }
        class328 var1 = (class328) field3400.method3011((long) this.field3408);
        if (var1 != null) {
            return var1;
        }
        class328 var2 = class329.method5456(Statics.field3397, this.field3408, 0);
        if (var2 != null) {
            field3400.method3009(var2, (long) this.field3408);
        }
        return var2;
    }

    @ObfuscatedName("jm.l(B)Lln;")
    public class328 method4554() {
        if (this.field3420 < 0) {
            return null;
        }
        class328 var1 = (class328) field3400.method3011((long) this.field3420);
        if (var1 != null) {
            return var1;
        }
        class328 var2 = class329.method5456(Statics.field3397, this.field3420, 0);
        if (var2 != null) {
            field3400.method3009(var2, (long) this.field3420);
        }
        return var2;
    }

    @ObfuscatedName("jm.e(B)Lln;")
    public class328 method4555() {
        if (this.field3410 < 0) {
            return null;
        }
        class328 var1 = (class328) field3400.method3011((long) this.field3410);
        if (var1 != null) {
            return var1;
        }
        class328 var2 = class329.method5456(Statics.field3397, this.field3410, 0);
        if (var2 != null) {
            field3400.method3009(var2, (long) this.field3410);
        }
        return var2;
    }

    @ObfuscatedName("jm.x(I)Lln;")
    public class328 method4548() {
        if (this.field3419 < 0) {
            return null;
        }
        class328 var1 = (class328) field3400.method3011((long) this.field3419);
        if (var1 != null) {
            return var1;
        }
        class328 var2 = class329.method5456(Statics.field3397, this.field3419, 0);
        if (var2 != null) {
            field3400.method3009(var2, (long) this.field3419);
        }
        return var2;
    }

    @ObfuscatedName("jm.d(I)Lkk;")
    public class302 method4557() {
        if (this.field3405 == -1) {
            return null;
        }
        class302 var1 = (class302) field3411.method3011((long) this.field3405);
        if (var1 != null) {
            return var1;
        }
        class302 var2 = class329.method5358(Statics.field3397, Statics.field3403, this.field3405, 0);
        if (var2 != null) {
            field3411.method3009(var2, (long) this.field3405);
        }
        return var2;
    }

    @ObfuscatedName("g.a(B)V")
    public static void method52() {
        field3399.method3010();
        field3400.method3010();
        field3411.method3010();
    }
}
