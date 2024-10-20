package deob;

@ObfuscatedName("ji")
public class class270 extends class209 {

    @ObfuscatedName("ji.b")
    public static class203 field3409 = new class203(64);

    @ObfuscatedName("ji.l")
    public static class203 field3410 = new class203(64);

    @ObfuscatedName("ji.w")
    public static class203 field3414 = new class203(20);

    @ObfuscatedName("ji.r")
    public int field3415 = -1;

    @ObfuscatedName("ji.k")
    public int field3416 = 16777215;

    @ObfuscatedName("ji.m")
    public int field3426 = 70;

    @ObfuscatedName("ji.q")
    public int field3418 = -1;

    @ObfuscatedName("ji.x")
    public int field3406 = -1;

    @ObfuscatedName("ji.u")
    public int field3420 = -1;

    @ObfuscatedName("ji.o")
    public int field3429 = -1;

    @ObfuscatedName("ji.t")
    public int field3422 = 0;

    @ObfuscatedName("ji.v")
    public int field3421 = 0;

    @ObfuscatedName("ji.p")
    public int field3424 = -1;

    @ObfuscatedName("ji.z")
    public String field3425 = "";

    @ObfuscatedName("ji.j")
    public int field3411 = -1;

    @ObfuscatedName("ji.i")
    public int field3427 = 0;

    @ObfuscatedName("ji.c")
    public int[] field3428;

    @ObfuscatedName("ji.y")
    public int field3408 = -1;

    @ObfuscatedName("ji.av")
    public int field3430 = -1;

    @ObfuscatedName("io.h(II)Lji;")
    public static class270 method4489(int arg0) {
        class270 var1 = (class270) field3409.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3423.method4267(32, arg0);
        class270 var3 = new class270();
        if (var2 != null) {
            var3.method4636(new class185(var2));
        }
        field3409.method3723(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ji.e(Lgx;B)V")
    public void method4636(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4635(arg0, var2);
        }
    }

    @ObfuscatedName("ji.b(Lgx;IS)V")
    public void method4635(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3415 = arg0.method3340();
        } else if (arg1 == 2) {
            this.field3416 = arg0.method3327();
        } else if (arg1 == 3) {
            this.field3418 = arg0.method3340();
        } else if (arg1 == 4) {
            this.field3420 = arg0.method3340();
        } else if (arg1 == 5) {
            this.field3406 = arg0.method3340();
        } else if (arg1 == 6) {
            this.field3429 = arg0.method3340();
        } else if (arg1 == 7) {
            this.field3422 = arg0.method3540();
        } else if (arg1 == 8) {
            this.field3425 = arg0.method3333();
        } else if (arg1 == 9) {
            this.field3426 = arg0.method3325();
        } else if (arg1 == 10) {
            this.field3421 = arg0.method3540();
        } else if (arg1 == 11) {
            this.field3424 = 0;
        } else if (arg1 == 12) {
            this.field3411 = arg0.method3323();
        } else if (arg1 == 13) {
            this.field3427 = arg0.method3540();
        } else if (arg1 == 14) {
            this.field3424 = arg0.method3325();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3408 = arg0.method3325();
            if (this.field3408 == 65535) {
                this.field3408 = -1;
            }
            this.field3430 = arg0.method3325();
            if (this.field3430 == 65535) {
                this.field3430 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3325();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3323();
            this.field3428 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3428[var5] = arg0.method3325();
                if (this.field3428[var5] == 65535) {
                    this.field3428[var5] = -1;
                }
            }
            this.field3428[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ji.l(B)Lji;")
    public final class270 method4638() {
        int var1 = -1;
        if (this.field3408 != -1) {
            var1 = class228.method148(this.field3408);
        } else if (this.field3430 != -1) {
            var1 = class228.field2617[this.field3430];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3428.length - 1) {
            var2 = this.field3428[var1];
        } else {
            var2 = this.field3428[this.field3428.length - 1];
        }
        return var2 == -1 ? null : method4489(var2);
    }

    @ObfuscatedName("ji.w(II)Ljava/lang/String;")
    public String method4639(int arg0) {
        String var2 = this.field3425;
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

    @ObfuscatedName("ji.d(I)Lly;")
    public class324 method4640() {
        if (this.field3418 < 0) {
            return null;
        }
        class324 var1 = (class324) field3410.method3724((long) this.field3418);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method149(Statics.field3407, this.field3418, 0);
        if (var2 != null) {
            field3410.method3723(var2, (long) this.field3418);
        }
        return var2;
    }

    @ObfuscatedName("ji.n(I)Lly;")
    public class324 method4641() {
        if (this.field3406 < 0) {
            return null;
        }
        class324 var1 = (class324) field3410.method3724((long) this.field3406);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method149(Statics.field3407, this.field3406, 0);
        if (var2 != null) {
            field3410.method3723(var2, (long) this.field3406);
        }
        return var2;
    }

    @ObfuscatedName("ji.s(I)Lly;")
    public class324 method4672() {
        if (this.field3420 < 0) {
            return null;
        }
        class324 var1 = (class324) field3410.method3724((long) this.field3420);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method149(Statics.field3407, this.field3420, 0);
        if (var2 != null) {
            field3410.method3723(var2, (long) this.field3420);
        }
        return var2;
    }

    @ObfuscatedName("ji.g(I)Lly;")
    public class324 method4637() {
        if (this.field3429 < 0) {
            return null;
        }
        class324 var1 = (class324) field3410.method3724((long) this.field3429);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method149(Statics.field3407, this.field3429, 0);
        if (var2 != null) {
            field3410.method3723(var2, (long) this.field3429);
        }
        return var2;
    }

    @ObfuscatedName("ji.k(I)Lka;")
    public class301 method4663() {
        if (this.field3415 == -1) {
            return null;
        }
        class301 var1 = (class301) field3414.method3724((long) this.field3415);
        if (var1 != null) {
            return var1;
        }
        class250 var2 = Statics.field3407;
        class250 var3 = Statics.field3419;
        int var4 = this.field3415;
        class301 var5;
        if (class325.method91(var2, var4, 0)) {
            var5 = class325.method518(var3.method4267(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3414.method3723(var5, (long) this.field3415);
        }
        return var5;
    }

    @ObfuscatedName("jm.m(I)V")
    public static void method4557() {
        field3409.method3725();
        field3410.method3725();
        field3414.method3725();
    }
}
