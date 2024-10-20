package deob;

@ObfuscatedName("iv")
public class class253 extends class176 {

    @ObfuscatedName("iv.u")
    public static class146 field3321 = new class146(64);

    @ObfuscatedName("iv.r")
    public static class146 field3313 = new class146(64);

    @ObfuscatedName("iv.p")
    public static class146 field3314 = new class146(20);

    @ObfuscatedName("iv.b")
    public int field3318 = -1;

    @ObfuscatedName("iv.o")
    public int field3310 = 16777215;

    @ObfuscatedName("iv.a")
    public int field3319 = 70;

    @ObfuscatedName("iv.e")
    public int field3320 = -1;

    @ObfuscatedName("iv.w")
    public int field3333 = -1;

    @ObfuscatedName("iv.t")
    public int field3322 = -1;

    @ObfuscatedName("iv.g")
    public int field3323 = -1;

    @ObfuscatedName("iv.x")
    public int field3324 = 0;

    @ObfuscatedName("iv.h")
    public int field3312 = 0;

    @ObfuscatedName("iv.s")
    public int field3326 = -1;

    @ObfuscatedName("iv.f")
    public String field3317 = "";

    @ObfuscatedName("iv.j")
    public int field3328 = -1;

    @ObfuscatedName("iv.d")
    public int field3335 = 0;

    @ObfuscatedName("iv.l")
    public int[] field3330;

    @ObfuscatedName("iv.k")
    public int field3331 = -1;

    @ObfuscatedName("iv.ac")
    public int field3332 = -1;

    @ObfuscatedName("ac.z(Lhp;Lhp;Lhp;I)V")
    public static void method366(class234 arg0, class234 arg1, class234 arg2) {
        Statics.field3316 = arg0;
        Statics.field67 = arg1;
        Statics.field3311 = arg2;
    }

    @ObfuscatedName("iv.n(Lkl;B)V")
    public void method4109(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method4110(arg0, var2);
        }
    }

    @ObfuscatedName("iv.v(Lkl;II)V")
    public void method4110(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3318 = arg0.method5001();
        } else if (arg1 == 2) {
            this.field3310 = arg0.method4994();
        } else if (arg1 == 3) {
            this.field3320 = arg0.method5001();
        } else if (arg1 == 4) {
            this.field3322 = arg0.method5001();
        } else if (arg1 == 5) {
            this.field3333 = arg0.method5001();
        } else if (arg1 == 6) {
            this.field3323 = arg0.method5001();
        } else if (arg1 == 7) {
            this.field3324 = arg0.method4993();
        } else if (arg1 == 8) {
            this.field3317 = arg0.method5050();
        } else if (arg1 == 9) {
            this.field3319 = arg0.method4992();
        } else if (arg1 == 10) {
            this.field3312 = arg0.method4993();
        } else if (arg1 == 11) {
            this.field3326 = 0;
        } else if (arg1 == 12) {
            this.field3328 = arg0.method4990();
        } else if (arg1 == 13) {
            this.field3335 = arg0.method4993();
        } else if (arg1 == 14) {
            this.field3326 = arg0.method4992();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3331 = arg0.method4992();
            if (this.field3331 == 65535) {
                this.field3331 = -1;
            }
            this.field3332 = arg0.method4992();
            if (this.field3332 == 65535) {
                this.field3332 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method4992();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method4990();
            this.field3330 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3330[var5] = arg0.method4992();
                if (this.field3330[var5] == 65535) {
                    this.field3330[var5] = -1;
                }
            }
            this.field3330[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("iv.u(I)Liv;")
    public final class253 method4135() {
        int var1 = -1;
        if (this.field3331 != -1) {
            var1 = class213.method367(this.field3331);
        } else if (this.field3332 != -1) {
            var1 = class213.field2511[this.field3332];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3330.length - 1) {
            var2 = this.field3330[var1];
        } else {
            var2 = this.field3330[this.field3330.length - 1];
        }
        if (var2 == -1) {
            return null;
        }
        class253 var3 = (class253) field3321.method2992((long) var2);
        class253 var4;
        if (var3 == null) {
            byte[] var5 = Statics.field3316.method3726(32, var2);
            class253 var6 = new class253();
            if (var5 != null) {
                var6.method4109(new class300(var5));
            }
            field3321.method2994(var6, (long) var2);
            var4 = var6;
        } else {
            var4 = var3;
        }
        return var4;
    }

    @ObfuscatedName("iv.r(IB)Ljava/lang/String;")
    public String method4111(int arg0) {
        String var2 = this.field3317;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class291.method1853(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("iv.p(I)Llf;")
    public class325 method4116() {
        if (this.field3320 < 0) {
            return null;
        }
        class325 var1 = (class325) field3313.method2992((long) this.field3320);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method4283(Statics.field67, this.field3320, 0);
        if (var2 != null) {
            field3313.method2994(var2, (long) this.field3320);
        }
        return var2;
    }

    @ObfuscatedName("iv.q(I)Llf;")
    public class325 method4113() {
        if (this.field3333 < 0) {
            return null;
        }
        class325 var1 = (class325) field3313.method2992((long) this.field3333);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method4283(Statics.field67, this.field3333, 0);
        if (var2 != null) {
            field3313.method2994(var2, (long) this.field3333);
        }
        return var2;
    }

    @ObfuscatedName("iv.m(B)Llf;")
    public class325 method4114() {
        if (this.field3322 < 0) {
            return null;
        }
        class325 var1 = (class325) field3313.method2992((long) this.field3322);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method4283(Statics.field67, this.field3322, 0);
        if (var2 != null) {
            field3313.method2994(var2, (long) this.field3322);
        }
        return var2;
    }

    @ObfuscatedName("iv.y(I)Llf;")
    public class325 method4138() {
        if (this.field3323 < 0) {
            return null;
        }
        class325 var1 = (class325) field3313.method2992((long) this.field3323);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method4283(Statics.field67, this.field3323, 0);
        if (var2 != null) {
            field3313.method2994(var2, (long) this.field3323);
        }
        return var2;
    }

    @ObfuscatedName("iv.i(I)Lkn;")
    public class295 method4112() {
        if (this.field3318 == -1) {
            return null;
        }
        class295 var1 = (class295) field3314.method2992((long) this.field3318);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class326.method4568(Statics.field67, Statics.field3311, this.field3318, 0);
        if (var2 != null) {
            field3314.method2994(var2, (long) this.field3318);
        }
        return var2;
    }

    @ObfuscatedName("m.c(B)V")
    public static void method69() {
        field3321.method2995();
        field3313.method2995();
        field3314.method2995();
    }
}
