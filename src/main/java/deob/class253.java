package deob;

@ObfuscatedName("id")
public class class253 extends class183 {

    @ObfuscatedName("id.w")
    public static class155 field3293 = new class155(64);

    @ObfuscatedName("id.p")
    public static class155 field3294 = new class155(64);

    @ObfuscatedName("id.b")
    public static class155 field3295 = new class155(20);

    @ObfuscatedName("id.o")
    public int field3302 = -1;

    @ObfuscatedName("id.v")
    public int field3298 = 16777215;

    @ObfuscatedName("id.k")
    public int field3299 = 70;

    @ObfuscatedName("id.s")
    public int field3297 = -1;

    @ObfuscatedName("id.l")
    public int field3301 = -1;

    @ObfuscatedName("id.t")
    public int field3292 = -1;

    @ObfuscatedName("id.j")
    public int field3303 = -1;

    @ObfuscatedName("id.n")
    public int field3304 = 0;

    @ObfuscatedName("id.u")
    public int field3305 = 0;

    @ObfuscatedName("id.z")
    public int field3306 = -1;

    @ObfuscatedName("id.h")
    public String field3307 = "";

    @ObfuscatedName("id.m")
    public int field3300 = -1;

    @ObfuscatedName("id.g")
    public int field3309 = 0;

    @ObfuscatedName("id.r")
    public int[] field3310;

    @ObfuscatedName("id.q")
    public int field3311 = -1;

    @ObfuscatedName("id.aa")
    public int field3312 = -1;

    @ObfuscatedName("gl.f(II)Lid;")
    public static class253 method3479(int arg0) {
        class253 var1 = (class253) field3293.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3296.method3752(32, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4186(new class300(var2));
        }
        field3293.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.i(Lkq;I)V")
    public void method4186(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method4187(arg0, var2);
        }
    }

    @ObfuscatedName("id.y(Lkq;II)V")
    public void method4187(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3302 = arg0.method5127();
        } else if (arg1 == 2) {
            this.field3298 = arg0.method5226();
        } else if (arg1 == 3) {
            this.field3297 = arg0.method5127();
        } else if (arg1 == 4) {
            this.field3292 = arg0.method5127();
        } else if (arg1 == 5) {
            this.field3301 = arg0.method5127();
        } else if (arg1 == 6) {
            this.field3303 = arg0.method5127();
        } else if (arg1 == 7) {
            this.field3304 = arg0.method5113();
        } else if (arg1 == 8) {
            this.field3307 = arg0.method5120();
        } else if (arg1 == 9) {
            this.field3299 = arg0.method5112();
        } else if (arg1 == 10) {
            this.field3305 = arg0.method5113();
        } else if (arg1 == 11) {
            this.field3306 = 0;
        } else if (arg1 == 12) {
            this.field3300 = arg0.method5110();
        } else if (arg1 == 13) {
            this.field3309 = arg0.method5113();
        } else if (arg1 == 14) {
            this.field3306 = arg0.method5112();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3311 = arg0.method5112();
            if (this.field3311 == 65535) {
                this.field3311 = -1;
            }
            this.field3312 = arg0.method5112();
            if (this.field3312 == 65535) {
                this.field3312 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5112();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5110();
            this.field3310 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3310[var5] = arg0.method5112();
                if (this.field3310[var5] == 65535) {
                    this.field3310[var5] = -1;
                }
            }
            this.field3310[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("id.w(S)Lid;")
    public final class253 method4188() {
        int var1 = -1;
        if (this.field3311 != -1) {
            var1 = Statics.method782(this.field3311);
        } else if (this.field3312 != -1) {
            var1 = class213.field2511[this.field3312];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3310.length - 1) {
            var2 = this.field3310[var1];
        } else {
            var2 = this.field3310[this.field3310.length - 1];
        }
        return var2 == -1 ? null : method3479(var2);
    }

    @ObfuscatedName("id.p(II)Ljava/lang/String;")
    public String method4197(int arg0) {
        String var2 = this.field3307;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class291.method1090(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("id.b(B)Lls;")
    public class325 method4213() {
        if (this.field3297 < 0) {
            return null;
        }
        class325 var1 = (class325) field3294.method3099((long) this.field3297);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = Statics.method4026(Statics.field3291, this.field3297, 0);
        if (var2 != null) {
            field3294.method3101(var2, (long) this.field3297);
        }
        return var2;
    }

    @ObfuscatedName("id.e(I)Lls;")
    public class325 method4189() {
        if (this.field3301 < 0) {
            return null;
        }
        class325 var1 = (class325) field3294.method3099((long) this.field3301);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = Statics.method4026(Statics.field3291, this.field3301, 0);
        if (var2 != null) {
            field3294.method3101(var2, (long) this.field3301);
        }
        return var2;
    }

    @ObfuscatedName("id.x(B)Lls;")
    public class325 method4200() {
        if (this.field3292 < 0) {
            return null;
        }
        class325 var1 = (class325) field3294.method3099((long) this.field3292);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = Statics.method4026(Statics.field3291, this.field3292, 0);
        if (var2 != null) {
            field3294.method3101(var2, (long) this.field3292);
        }
        return var2;
    }

    @ObfuscatedName("id.a(B)Lls;")
    public class325 method4209() {
        if (this.field3303 < 0) {
            return null;
        }
        class325 var1 = (class325) field3294.method3099((long) this.field3303);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = Statics.method4026(Statics.field3291, this.field3303, 0);
        if (var2 != null) {
            field3294.method3101(var2, (long) this.field3303);
        }
        return var2;
    }

    @ObfuscatedName("id.d(B)Lko;")
    public class294 method4194() {
        if (this.field3302 == -1) {
            return null;
        }
        class294 var1 = (class294) field3295.method3099((long) this.field3302);
        if (var1 != null) {
            return var1;
        }
        class294 var2 = class326.method140(Statics.field3291, Statics.field2486, this.field3302, 0);
        if (var2 != null) {
            field3295.method3101(var2, (long) this.field3302);
        }
        return var2;
    }
}
