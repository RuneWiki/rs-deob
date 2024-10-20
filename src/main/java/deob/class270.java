package deob;

@ObfuscatedName("jb")
public class class270 extends class209 {

    @ObfuscatedName("jb.q")
    public static class203 field3430 = new class203(64);

    @ObfuscatedName("jb.c")
    public static class203 field3431 = new class203(64);

    @ObfuscatedName("jb.l")
    public static class203 field3435 = new class203(20);

    @ObfuscatedName("jb.m")
    public int field3441 = -1;

    @ObfuscatedName("jb.d")
    public int field3436 = 16777215;

    @ObfuscatedName("jb.j")
    public int field3429 = 70;

    @ObfuscatedName("jb.x")
    public int field3438 = -1;

    @ObfuscatedName("jb.v")
    public int field3439 = -1;

    @ObfuscatedName("jb.h")
    public int field3428 = -1;

    @ObfuscatedName("jb.f")
    public int field3437 = -1;

    @ObfuscatedName("jb.a")
    public int field3442 = 0;

    @ObfuscatedName("jb.t")
    public int field3432 = 0;

    @ObfuscatedName("jb.k")
    public int field3443 = -1;

    @ObfuscatedName("jb.z")
    public String field3445 = "";

    @ObfuscatedName("jb.s")
    public int field3446 = -1;

    @ObfuscatedName("jb.y")
    public int field3447 = 0;

    @ObfuscatedName("jb.u")
    public int[] field3444;

    @ObfuscatedName("jb.o")
    public int field3449 = -1;

    @ObfuscatedName("jb.af")
    public int field3450 = -1;

    @ObfuscatedName("ho.g(II)Ljb;")
    public static class270 method4179(int arg0) {
        class270 var1 = (class270) field3430.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2356.method4438(32, arg0);
        class270 var3 = new class270();
        if (var2 != null) {
            var3.method4826(new class185(var2));
        }
        field3430.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jb.r(Lgl;B)V")
    public void method4826(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4827(arg0, var2);
        }
    }

    @ObfuscatedName("jb.e(Lgl;II)V")
    public void method4827(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3441 = arg0.method3594();
        } else if (arg1 == 2) {
            this.field3436 = arg0.method3469();
        } else if (arg1 == 3) {
            this.field3438 = arg0.method3594();
        } else if (arg1 == 4) {
            this.field3428 = arg0.method3594();
        } else if (arg1 == 5) {
            this.field3439 = arg0.method3594();
        } else if (arg1 == 6) {
            this.field3437 = arg0.method3594();
        } else if (arg1 == 7) {
            this.field3442 = arg0.method3510();
        } else if (arg1 == 8) {
            this.field3445 = arg0.method3475();
        } else if (arg1 == 9) {
            this.field3429 = arg0.method3467();
        } else if (arg1 == 10) {
            this.field3432 = arg0.method3510();
        } else if (arg1 == 11) {
            this.field3443 = 0;
        } else if (arg1 == 12) {
            this.field3446 = arg0.method3679();
        } else if (arg1 == 13) {
            this.field3447 = arg0.method3510();
        } else if (arg1 == 14) {
            this.field3443 = arg0.method3467();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3449 = arg0.method3467();
            if (this.field3449 == 65535) {
                this.field3449 = -1;
            }
            this.field3450 = arg0.method3467();
            if (this.field3450 == 65535) {
                this.field3450 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3467();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3679();
            this.field3444 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3444[var5] = arg0.method3467();
                if (this.field3444[var5] == 65535) {
                    this.field3444[var5] = -1;
                }
            }
            this.field3444[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jb.q(B)Ljb;")
    public final class270 method4860() {
        int var1 = -1;
        if (this.field3449 != -1) {
            var1 = class228.method2246(this.field3449);
        } else if (this.field3450 != -1) {
            var1 = class228.field2630[this.field3450];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3444.length - 1) {
            var2 = this.field3444[var1];
        } else {
            var2 = this.field3444[this.field3444.length - 1];
        }
        return var2 == -1 ? null : method4179(var2);
    }

    @ObfuscatedName("jb.c(II)Ljava/lang/String;")
    public String method4844(int arg0) {
        String var2 = this.field3445;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + Statics.method557(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jb.i(I)Lls;")
    public class324 method4858() {
        if (this.field3438 < 0) {
            return null;
        }
        class324 var1 = (class324) field3431.method3879((long) this.field3438);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method3125(Statics.field3448, this.field3438, 0);
        if (var2 != null) {
            field3431.method3885(var2, (long) this.field3438);
        }
        return var2;
    }

    @ObfuscatedName("jb.p(I)Lls;")
    public class324 method4828() {
        if (this.field3439 < 0) {
            return null;
        }
        class324 var1 = (class324) field3431.method3879((long) this.field3439);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method3125(Statics.field3448, this.field3439, 0);
        if (var2 != null) {
            field3431.method3885(var2, (long) this.field3439);
        }
        return var2;
    }

    @ObfuscatedName("jb.m(I)Lls;")
    public class324 method4835() {
        if (this.field3428 < 0) {
            return null;
        }
        class324 var1 = (class324) field3431.method3879((long) this.field3428);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method3125(Statics.field3448, this.field3428, 0);
        if (var2 != null) {
            field3431.method3885(var2, (long) this.field3428);
        }
        return var2;
    }

    @ObfuscatedName("jb.d(I)Lls;")
    public class324 method4833() {
        if (this.field3437 < 0) {
            return null;
        }
        class324 var1 = (class324) field3431.method3879((long) this.field3437);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method3125(Statics.field3448, this.field3437, 0);
        if (var2 != null) {
            field3431.method3885(var2, (long) this.field3437);
        }
        return var2;
    }

    @ObfuscatedName("jb.j(I)Lkz;")
    public class301 method4849() {
        if (this.field3441 == -1) {
            return null;
        }
        class301 var1 = (class301) field3435.method3879((long) this.field3441);
        if (var1 != null) {
            return var1;
        }
        class250 var2 = Statics.field3448;
        class250 var3 = Statics.field3440;
        int var4 = this.field3441;
        class301 var5;
        if (class325.method213(var2, var4, 0)) {
            byte[] var6 = var3.method4438(var4, 0);
            class301 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class301 var8 = new class301(var6, Statics.field3891, Statics.field3893, Statics.field3896, Statics.field3335, Statics.field3895, Statics.field3898);
                Statics.field3891 = null;
                Statics.field3893 = null;
                Statics.field3896 = null;
                Statics.field3335 = null;
                Statics.field3895 = null;
                Statics.field3898 = (byte[][]) null;
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3435.method3885(var5, (long) this.field3441);
        }
        return var5;
    }
}
