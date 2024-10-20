package deob;

@ObfuscatedName("io")
public class class253 extends class176 {

    @ObfuscatedName("io.p")
    public static class146 field3326 = new class146(64);

    @ObfuscatedName("io.k")
    public static class146 field3330 = new class146(64);

    @ObfuscatedName("io.l")
    public static class146 field3331 = new class146(20);

    @ObfuscatedName("io.u")
    public int field3333 = -1;

    @ObfuscatedName("io.x")
    public int field3334 = 16777215;

    @ObfuscatedName("io.r")
    public int field3345 = 70;

    @ObfuscatedName("io.v")
    public int field3335 = -1;

    @ObfuscatedName("io.y")
    public int field3337 = -1;

    @ObfuscatedName("io.g")
    public int field3338 = -1;

    @ObfuscatedName("io.a")
    public int field3339 = -1;

    @ObfuscatedName("io.j")
    public int field3336 = 0;

    @ObfuscatedName("io.t")
    public int field3341 = 0;

    @ObfuscatedName("io.h")
    public int field3342 = -1;

    @ObfuscatedName("io.o")
    public String field3343 = "";

    @ObfuscatedName("io.n")
    public int field3349 = -1;

    @ObfuscatedName("io.d")
    public int field3329 = 0;

    @ObfuscatedName("io.s")
    public int[] field3346;

    @ObfuscatedName("io.z")
    public int field3347 = -1;

    @ObfuscatedName("io.al")
    public int field3348 = -1;

    @ObfuscatedName("cp.q(IB)Lio;")
    public static class253 method1860(int arg0) {
        class253 var1 = (class253) field3326.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3328.method3775(32, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4169(new class301(var2));
        }
        field3326.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.w(Lkf;B)V")
    public void method4169(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method4170(arg0, var2);
        }
    }

    @ObfuscatedName("io.e(Lkf;II)V")
    public void method4170(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3333 = arg0.method5084();
        } else if (arg1 == 2) {
            this.field3334 = arg0.method5140();
        } else if (arg1 == 3) {
            this.field3335 = arg0.method5084();
        } else if (arg1 == 4) {
            this.field3338 = arg0.method5084();
        } else if (arg1 == 5) {
            this.field3337 = arg0.method5084();
        } else if (arg1 == 6) {
            this.field3339 = arg0.method5084();
        } else if (arg1 == 7) {
            this.field3336 = arg0.method5179();
        } else if (arg1 == 8) {
            this.field3343 = arg0.method5085();
        } else if (arg1 == 9) {
            this.field3345 = arg0.method5069();
        } else if (arg1 == 10) {
            this.field3341 = arg0.method5179();
        } else if (arg1 == 11) {
            this.field3342 = 0;
        } else if (arg1 == 12) {
            this.field3349 = arg0.method5077();
        } else if (arg1 == 13) {
            this.field3329 = arg0.method5179();
        } else if (arg1 == 14) {
            this.field3342 = arg0.method5069();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3347 = arg0.method5069();
            if (this.field3347 == 65535) {
                this.field3347 = -1;
            }
            this.field3348 = arg0.method5069();
            if (this.field3348 == 65535) {
                this.field3348 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5069();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5077();
            this.field3346 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3346[var5] = arg0.method5069();
                if (this.field3346[var5] == 65535) {
                    this.field3346[var5] = -1;
                }
            }
            this.field3346[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("io.p(B)Lio;")
    public final class253 method4171() {
        int var1 = -1;
        if (this.field3347 != -1) {
            var1 = class213.method1099(this.field3347);
        } else if (this.field3348 != -1) {
            var1 = class213.field2526[this.field3348];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3346.length - 1) {
            var2 = this.field3346[var1];
        } else {
            var2 = this.field3346[this.field3346.length - 1];
        }
        return var2 == -1 ? null : method1860(var2);
    }

    @ObfuscatedName("io.k(II)Ljava/lang/String;")
    public String method4172(int arg0) {
        String var2 = this.field3343;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class292.method3356(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("io.l(I)Lly;")
    public class326 method4168() {
        if (this.field3335 < 0) {
            return null;
        }
        class326 var1 = (class326) field3330.method3039((long) this.field3335);
        if (var1 != null) {
            return var1;
        }
        class326 var2 = class327.method1040(Statics.field3344, this.field3335, 0);
        if (var2 != null) {
            field3330.method3041(var2, (long) this.field3335);
        }
        return var2;
    }

    @ObfuscatedName("io.b(I)Lly;")
    public class326 method4174() {
        if (this.field3337 < 0) {
            return null;
        }
        class326 var1 = (class326) field3330.method3039((long) this.field3337);
        if (var1 != null) {
            return var1;
        }
        class326 var2 = class327.method1040(Statics.field3344, this.field3337, 0);
        if (var2 != null) {
            field3330.method3041(var2, (long) this.field3337);
        }
        return var2;
    }

    @ObfuscatedName("io.i(B)Lly;")
    public class326 method4175() {
        if (this.field3338 < 0) {
            return null;
        }
        class326 var1 = (class326) field3330.method3039((long) this.field3338);
        if (var1 != null) {
            return var1;
        }
        class326 var2 = class327.method1040(Statics.field3344, this.field3338, 0);
        if (var2 != null) {
            field3330.method3041(var2, (long) this.field3338);
        }
        return var2;
    }

    @ObfuscatedName("io.c(I)Lly;")
    public class326 method4200() {
        if (this.field3339 < 0) {
            return null;
        }
        class326 var1 = (class326) field3330.method3039((long) this.field3339);
        if (var1 != null) {
            return var1;
        }
        class326 var2 = class327.method1040(Statics.field3344, this.field3339, 0);
        if (var2 != null) {
            field3330.method3041(var2, (long) this.field3339);
        }
        return var2;
    }

    @ObfuscatedName("io.u(I)Lke;")
    public class296 method4182() {
        if (this.field3333 == -1) {
            return null;
        }
        class296 var1 = (class296) field3331.method3039((long) this.field3333);
        if (var1 != null) {
            return var1;
        }
        class234 var2 = Statics.field3344;
        class234 var3 = Statics.field3327;
        int var4 = this.field3333;
        class296 var5;
        if (class327.method4812(var2, var4, 0)) {
            var5 = Statics.method3012(var3.method3775(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3331.method3041(var5, (long) this.field3333);
        }
        return var5;
    }
}
