package deob;

@ObfuscatedName("jh")
public class class270 extends class209 {

    @ObfuscatedName("jh.j")
    public static class203 field3408 = new class203(64);

    @ObfuscatedName("jh.g")
    public static class203 field3393 = new class203(64);

    @ObfuscatedName("jh.i")
    public static class203 field3394 = new class203(20);

    @ObfuscatedName("jh.k")
    public int field3399 = -1;

    @ObfuscatedName("jh.v")
    public int field3400 = 16777215;

    @ObfuscatedName("jh.p")
    public int field3390 = 70;

    @ObfuscatedName("jh.n")
    public int field3402 = -1;

    @ObfuscatedName("jh.t")
    public int field3403 = -1;

    @ObfuscatedName("jh.r")
    public int field3404 = -1;

    @ObfuscatedName("jh.x")
    public int field3401 = -1;

    @ObfuscatedName("jh.b")
    public int field3406 = 0;

    @ObfuscatedName("jh.w")
    public int field3407 = 0;

    @ObfuscatedName("jh.e")
    public int field3392 = -1;

    @ObfuscatedName("jh.a")
    public String field3397 = "";

    @ObfuscatedName("jh.z")
    public int field3410 = -1;

    @ObfuscatedName("jh.y")
    public int field3405 = 0;

    @ObfuscatedName("jh.u")
    public int[] field3409;

    @ObfuscatedName("jh.f")
    public int field3413 = -1;

    @ObfuscatedName("jh.at")
    public int field3389 = -1;

    @ObfuscatedName("cv.c(IS)Ljh;")
    public static class270 method1728(int arg0) {
        class270 var1 = (class270) field3408.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3414.method4210(32, arg0);
        class270 var3 = new class270();
        if (var2 != null) {
            var3.method4630(new class185(var2));
        }
        field3408.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.q(Lgg;I)V")
    public void method4630(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4631(arg0, var2);
        }
    }

    @ObfuscatedName("jh.m(Lgg;II)V")
    public void method4631(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3399 = arg0.method3338();
        } else if (arg1 == 2) {
            this.field3400 = arg0.method3247();
        } else if (arg1 == 3) {
            this.field3402 = arg0.method3338();
        } else if (arg1 == 4) {
            this.field3404 = arg0.method3338();
        } else if (arg1 == 5) {
            this.field3403 = arg0.method3338();
        } else if (arg1 == 6) {
            this.field3401 = arg0.method3338();
        } else if (arg1 == 7) {
            this.field3406 = arg0.method3369();
        } else if (arg1 == 8) {
            this.field3397 = arg0.method3252();
        } else if (arg1 == 9) {
            this.field3390 = arg0.method3245();
        } else if (arg1 == 10) {
            this.field3407 = arg0.method3369();
        } else if (arg1 == 11) {
            this.field3392 = 0;
        } else if (arg1 == 12) {
            this.field3410 = arg0.method3243();
        } else if (arg1 == 13) {
            this.field3405 = arg0.method3369();
        } else if (arg1 == 14) {
            this.field3392 = arg0.method3245();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3413 = arg0.method3245();
            if (this.field3413 == 65535) {
                this.field3413 = -1;
            }
            this.field3389 = arg0.method3245();
            if (this.field3389 == 65535) {
                this.field3389 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3245();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3243();
            this.field3409 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3409[var5] = arg0.method3245();
                if (this.field3409[var5] == 65535) {
                    this.field3409[var5] = -1;
                }
            }
            this.field3409[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jh.j(B)Ljh;")
    public final class270 method4632() {
        int var1 = -1;
        if (this.field3413 != -1) {
            var1 = class228.method1611(this.field3413);
        } else if (this.field3389 != -1) {
            var1 = class228.field2596[this.field3389];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3409.length - 1) {
            var2 = this.field3409[var1];
        } else {
            var2 = this.field3409[this.field3409.length - 1];
        }
        return var2 == -1 ? null : method1728(var2);
    }

    @ObfuscatedName("jh.g(II)Ljava/lang/String;")
    public String method4633(int arg0) {
        String var2 = this.field3397;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class308.method5128(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jh.i(I)Llt;")
    public class324 method4634() {
        if (this.field3402 < 0) {
            return null;
        }
        class324 var1 = (class324) field3393.method3654((long) this.field3402);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method4170(Statics.field3391, this.field3402, 0);
        if (var2 != null) {
            field3393.method3646(var2, (long) this.field3402);
        }
        return var2;
    }

    @ObfuscatedName("jh.h(I)Llt;")
    public class324 method4652() {
        if (this.field3403 < 0) {
            return null;
        }
        class324 var1 = (class324) field3393.method3654((long) this.field3403);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method4170(Statics.field3391, this.field3403, 0);
        if (var2 != null) {
            field3393.method3646(var2, (long) this.field3403);
        }
        return var2;
    }

    @ObfuscatedName("jh.l(I)Llt;")
    public class324 method4636() {
        if (this.field3404 < 0) {
            return null;
        }
        class324 var1 = (class324) field3393.method3654((long) this.field3404);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method4170(Statics.field3391, this.field3404, 0);
        if (var2 != null) {
            field3393.method3646(var2, (long) this.field3404);
        }
        return var2;
    }

    @ObfuscatedName("jh.o(I)Llt;")
    public class324 method4638() {
        if (this.field3401 < 0) {
            return null;
        }
        class324 var1 = (class324) field3393.method3654((long) this.field3401);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method4170(Statics.field3391, this.field3401, 0);
        if (var2 != null) {
            field3393.method3646(var2, (long) this.field3401);
        }
        return var2;
    }

    @ObfuscatedName("jh.k(I)Lkh;")
    public class301 method4637() {
        if (this.field3399 == -1) {
            return null;
        }
        class301 var1 = (class301) field3394.method3654((long) this.field3399);
        if (var1 != null) {
            return var1;
        }
        class301 var2 = class325.method4796(Statics.field3391, Statics.field3411, this.field3399, 0);
        if (var2 != null) {
            field3394.method3646(var2, (long) this.field3399);
        }
        return var2;
    }

    @ObfuscatedName("bu.v(B)V")
    public static void method972() {
        field3408.method3647();
        field3393.method3647();
        field3394.method3647();
    }
}
