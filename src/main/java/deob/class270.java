package deob;

@ObfuscatedName("jz")
public class class270 extends class209 {

    @ObfuscatedName("jz.s")
    public static class203 field3421 = new class203(64);

    @ObfuscatedName("jz.e")
    public static class203 field3422 = new class203(64);

    @ObfuscatedName("jz.a")
    public static class203 field3423 = new class203(20);

    @ObfuscatedName("jz.z")
    public int field3428 = -1;

    @ObfuscatedName("jz.x")
    public int field3435 = 16777215;

    @ObfuscatedName("jz.v")
    public int field3430 = 70;

    @ObfuscatedName("jz.g")
    public int field3418 = -1;

    @ObfuscatedName("jz.j")
    public int field3432 = -1;

    @ObfuscatedName("jz.b")
    public int field3433 = -1;

    @ObfuscatedName("jz.u")
    public int field3429 = -1;

    @ObfuscatedName("jz.t")
    public int field3419 = 0;

    @ObfuscatedName("jz.n")
    public int field3436 = 0;

    @ObfuscatedName("jz.h")
    public int field3437 = -1;

    @ObfuscatedName("jz.o")
    public String field3431 = "";

    @ObfuscatedName("jz.i")
    public int field3439 = -1;

    @ObfuscatedName("jz.k")
    public int field3440 = 0;

    @ObfuscatedName("jz.q")
    public int[] field3434;

    @ObfuscatedName("jz.y")
    public int field3438 = -1;

    @ObfuscatedName("jz.av")
    public int field3443 = -1;

    @ObfuscatedName("am.f(II)Ljz;")
    public static class270 method521(int arg0) {
        class270 var1 = (class270) field3421.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3425.method4289(32, arg0);
        class270 var3 = new class270();
        if (var2 != null) {
            var3.method4680(new class185(var2));
        }
        field3421.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jz.l(Lgm;I)V")
    public void method4680(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4681(arg0, var2);
        }
    }

    @ObfuscatedName("jz.w(Lgm;II)V")
    public void method4681(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3428 = arg0.method3381();
        } else if (arg1 == 2) {
            this.field3435 = arg0.method3348();
        } else if (arg1 == 3) {
            this.field3418 = arg0.method3381();
        } else if (arg1 == 4) {
            this.field3433 = arg0.method3381();
        } else if (arg1 == 5) {
            this.field3432 = arg0.method3381();
        } else if (arg1 == 6) {
            this.field3429 = arg0.method3381();
        } else if (arg1 == 7) {
            this.field3419 = arg0.method3544();
        } else if (arg1 == 8) {
            this.field3431 = arg0.method3354();
        } else if (arg1 == 9) {
            this.field3430 = arg0.method3346();
        } else if (arg1 == 10) {
            this.field3436 = arg0.method3544();
        } else if (arg1 == 11) {
            this.field3437 = 0;
        } else if (arg1 == 12) {
            this.field3439 = arg0.method3344();
        } else if (arg1 == 13) {
            this.field3440 = arg0.method3544();
        } else if (arg1 == 14) {
            this.field3437 = arg0.method3346();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3438 = arg0.method3346();
            if (this.field3438 == 65535) {
                this.field3438 = -1;
            }
            this.field3443 = arg0.method3346();
            if (this.field3443 == 65535) {
                this.field3443 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3346();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3344();
            this.field3434 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3434[var5] = arg0.method3346();
                if (this.field3434[var5] == 65535) {
                    this.field3434[var5] = -1;
                }
            }
            this.field3434[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jz.s(I)Ljz;")
    public final class270 method4709() {
        int var1 = -1;
        if (this.field3438 != -1) {
            var1 = class228.method2155(this.field3438);
        } else if (this.field3443 != -1) {
            var1 = class228.field2628[this.field3443];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3434.length - 1) {
            var2 = this.field3434[var1];
        } else {
            var2 = this.field3434[this.field3434.length - 1];
        }
        return var2 == -1 ? null : method521(var2);
    }

    @ObfuscatedName("jz.e(II)Ljava/lang/String;")
    public String method4683(int arg0) {
        String var2 = this.field3431;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class308.method5154(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jz.c(I)Llp;")
    public class324 method4690() {
        if (this.field3418 < 0) {
            return null;
        }
        class324 var1 = (class324) field3422.method3737((long) this.field3418);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method2923(Statics.field3442, this.field3418, 0);
        if (var2 != null) {
            field3422.method3744(var2, (long) this.field3418);
        }
        return var2;
    }

    @ObfuscatedName("jz.p(I)Llp;")
    public class324 method4685() {
        if (this.field3432 < 0) {
            return null;
        }
        class324 var1 = (class324) field3422.method3737((long) this.field3432);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method2923(Statics.field3442, this.field3432, 0);
        if (var2 != null) {
            field3422.method3744(var2, (long) this.field3432);
        }
        return var2;
    }

    @ObfuscatedName("jz.r(B)Llp;")
    public class324 method4686() {
        if (this.field3433 < 0) {
            return null;
        }
        class324 var1 = (class324) field3422.method3737((long) this.field3433);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method2923(Statics.field3442, this.field3433, 0);
        if (var2 != null) {
            field3422.method3744(var2, (long) this.field3433);
        }
        return var2;
    }

    @ObfuscatedName("jz.m(B)Llp;")
    public class324 method4684() {
        if (this.field3429 < 0) {
            return null;
        }
        class324 var1 = (class324) field3422.method3737((long) this.field3429);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method2923(Statics.field3442, this.field3429, 0);
        if (var2 != null) {
            field3422.method3744(var2, (long) this.field3429);
        }
        return var2;
    }

    @ObfuscatedName("jz.d(I)Lkn;")
    public class301 method4696() {
        if (this.field3428 == -1) {
            return null;
        }
        class301 var1 = (class301) field3423.method3737((long) this.field3428);
        if (var1 != null) {
            return var1;
        }
        class301 var2 = class325.method708(Statics.field3442, Statics.field3420, this.field3428, 0);
        if (var2 != null) {
            field3423.method3744(var2, (long) this.field3428);
        }
        return var2;
    }

    @ObfuscatedName("ex.z(B)V")
    public static void method2968() {
        field3421.method3740();
        field3422.method3740();
        field3423.method3740();
    }
}
