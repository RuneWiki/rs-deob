package deob;

@ObfuscatedName("jl")
public class class270 extends class209 {

    @ObfuscatedName("jl.u")
    public static class203 field3413 = new class203(64);

    @ObfuscatedName("jl.i")
    public static class203 field3402 = new class203(64);

    @ObfuscatedName("jl.r")
    public static class203 field3401 = new class203(20);

    @ObfuscatedName("jl.k")
    public int field3405 = -1;

    @ObfuscatedName("jl.o")
    public int field3406 = 16777215;

    @ObfuscatedName("jl.q")
    public int field3414 = 70;

    @ObfuscatedName("jl.l")
    public int field3408 = -1;

    @ObfuscatedName("jl.f")
    public int field3415 = -1;

    @ObfuscatedName("jl.z")
    public int field3410 = -1;

    @ObfuscatedName("jl.a")
    public int field3411 = -1;

    @ObfuscatedName("jl.x")
    public int field3400 = 0;

    @ObfuscatedName("jl.b")
    public int field3409 = 0;

    @ObfuscatedName("jl.w")
    public int field3412 = -1;

    @ObfuscatedName("jl.g")
    public String field3419 = "";

    @ObfuscatedName("jl.d")
    public int field3416 = -1;

    @ObfuscatedName("jl.m")
    public int field3417 = 0;

    @ObfuscatedName("jl.t")
    public int[] field3418;

    @ObfuscatedName("jl.h")
    public int field3420 = -1;

    @ObfuscatedName("jl.an")
    public int field3407 = -1;

    @ObfuscatedName("ij.y(II)Ljl;")
    public static class270 method4250(int arg0) {
        class270 var1 = (class270) field3413.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3985.method4263(32, arg0);
        class270 var3 = new class270();
        if (var2 != null) {
            var3.method4644(new class185(var2));
        }
        field3413.method3687(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jl.c(Lge;I)V")
    public void method4644(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4643(arg0, var2);
        }
    }

    @ObfuscatedName("jl.n(Lge;II)V")
    public void method4643(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3405 = arg0.method3284();
        } else if (arg1 == 2) {
            this.field3406 = arg0.method3272();
        } else if (arg1 == 3) {
            this.field3408 = arg0.method3284();
        } else if (arg1 == 4) {
            this.field3410 = arg0.method3284();
        } else if (arg1 == 5) {
            this.field3415 = arg0.method3284();
        } else if (arg1 == 6) {
            this.field3411 = arg0.method3284();
        } else if (arg1 == 7) {
            this.field3400 = arg0.method3337();
        } else if (arg1 == 8) {
            this.field3419 = arg0.method3364();
        } else if (arg1 == 9) {
            this.field3414 = arg0.method3280();
        } else if (arg1 == 10) {
            this.field3409 = arg0.method3337();
        } else if (arg1 == 11) {
            this.field3412 = 0;
        } else if (arg1 == 12) {
            this.field3416 = arg0.method3299();
        } else if (arg1 == 13) {
            this.field3417 = arg0.method3337();
        } else if (arg1 == 14) {
            this.field3412 = arg0.method3280();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3420 = arg0.method3280();
            if (this.field3420 == 65535) {
                this.field3420 = -1;
            }
            this.field3407 = arg0.method3280();
            if (this.field3407 == 65535) {
                this.field3407 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3280();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3299();
            this.field3418 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3418[var5] = arg0.method3280();
                if (this.field3418[var5] == 65535) {
                    this.field3418[var5] = -1;
                }
            }
            this.field3418[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jl.u(B)Ljl;")
    public final class270 method4671() {
        int var1 = -1;
        if (this.field3420 != -1) {
            var1 = class228.method3085(this.field3420);
        } else if (this.field3407 != -1) {
            var1 = class228.field2601[this.field3407];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3418.length - 1) {
            var2 = this.field3418[var1];
        } else {
            var2 = this.field3418[this.field3418.length - 1];
        }
        return var2 == -1 ? null : method4250(var2);
    }

    @ObfuscatedName("jl.i(IB)Ljava/lang/String;")
    public String method4647(int arg0) {
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

    @ObfuscatedName("jl.p(I)Llu;")
    public class324 method4657() {
        if (this.field3408 < 0) {
            return null;
        }
        class324 var1 = (class324) field3402.method3685((long) this.field3408);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method4906(Statics.field2409, this.field3408, 0);
        if (var2 != null) {
            field3402.method3687(var2, (long) this.field3408);
        }
        return var2;
    }

    @ObfuscatedName("jl.e(I)Llu;")
    public class324 method4649() {
        if (this.field3415 < 0) {
            return null;
        }
        class324 var1 = (class324) field3402.method3685((long) this.field3415);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method4906(Statics.field2409, this.field3415, 0);
        if (var2 != null) {
            field3402.method3687(var2, (long) this.field3415);
        }
        return var2;
    }

    @ObfuscatedName("jl.s(I)Llu;")
    public class324 method4648() {
        if (this.field3410 < 0) {
            return null;
        }
        class324 var1 = (class324) field3402.method3685((long) this.field3410);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method4906(Statics.field2409, this.field3410, 0);
        if (var2 != null) {
            field3402.method3687(var2, (long) this.field3410);
        }
        return var2;
    }

    @ObfuscatedName("jl.v(I)Llu;")
    public class324 method4651() {
        if (this.field3411 < 0) {
            return null;
        }
        class324 var1 = (class324) field3402.method3685((long) this.field3411);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method4906(Statics.field2409, this.field3411, 0);
        if (var2 != null) {
            field3402.method3687(var2, (long) this.field3411);
        }
        return var2;
    }

    @ObfuscatedName("jl.k(I)Lkt;")
    public class301 method4666() {
        if (this.field3405 == -1) {
            return null;
        }
        class301 var1 = (class301) field3401.method3685((long) this.field3405);
        if (var1 != null) {
            return var1;
        }
        class301 var2 = class325.method3516(Statics.field2409, Statics.field3403, this.field3405, 0);
        if (var2 != null) {
            field3401.method3687(var2, (long) this.field3405);
        }
        return var2;
    }
}
