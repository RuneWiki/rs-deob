package deob;

@ObfuscatedName("ii")
public class class253 extends class176 {

    @ObfuscatedName("ii.q")
    public static class146 field3320 = new class146(64);

    @ObfuscatedName("ii.v")
    public static class146 field3327 = new class146(64);

    @ObfuscatedName("ii.l")
    public static class146 field3318 = new class146(20);

    @ObfuscatedName("ii.p")
    public int field3319 = -1;

    @ObfuscatedName("ii.h")
    public int field3325 = 16777215;

    @ObfuscatedName("ii.k")
    public int field3315 = 70;

    @ObfuscatedName("ii.x")
    public int field3322 = -1;

    @ObfuscatedName("ii.j")
    public int field3321 = -1;

    @ObfuscatedName("ii.r")
    public int field3324 = -1;

    @ObfuscatedName("ii.e")
    public int field3326 = -1;

    @ObfuscatedName("ii.s")
    public int field3330 = 0;

    @ObfuscatedName("ii.b")
    public int field3316 = 0;

    @ObfuscatedName("ii.z")
    public int field3328 = -1;

    @ObfuscatedName("ii.f")
    public String field3329 = "";

    @ObfuscatedName("ii.g")
    public int field3314 = -1;

    @ObfuscatedName("ii.w")
    public int field3331 = 0;

    @ObfuscatedName("ii.u")
    public int[] field3332;

    @ObfuscatedName("ii.y")
    public int field3333 = -1;

    @ObfuscatedName("ii.aa")
    public int field3334 = -1;

    @ObfuscatedName("ff.a(Lhq;Lhq;Lhq;B)V")
    public static void method3275(class234 arg0, class234 arg1, class234 arg2) {
        Statics.field3323 = arg0;
        Statics.field3317 = arg1;
        Statics.field10 = arg2;
    }

    @ObfuscatedName("ho.t(II)Lii;")
    public static class253 method3869(int arg0) {
        class253 var1 = (class253) field3320.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3323.method3873(32, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4285(new class300(var2));
        }
        field3320.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.n(Lkc;I)V")
    public void method4285(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4277(arg0, var2);
        }
    }

    @ObfuscatedName("ii.q(Lkc;II)V")
    public void method4277(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3319 = arg0.method5152();
        } else if (arg1 == 2) {
            this.field3325 = arg0.method5127();
        } else if (arg1 == 3) {
            this.field3322 = arg0.method5152();
        } else if (arg1 == 4) {
            this.field3324 = arg0.method5152();
        } else if (arg1 == 5) {
            this.field3321 = arg0.method5152();
        } else if (arg1 == 6) {
            this.field3326 = arg0.method5152();
        } else if (arg1 == 7) {
            this.field3330 = arg0.method5126();
        } else if (arg1 == 8) {
            this.field3329 = arg0.method5340();
        } else if (arg1 == 9) {
            this.field3315 = arg0.method5166();
        } else if (arg1 == 10) {
            this.field3316 = arg0.method5126();
        } else if (arg1 == 11) {
            this.field3328 = 0;
        } else if (arg1 == 12) {
            this.field3314 = arg0.method5123();
        } else if (arg1 == 13) {
            this.field3331 = arg0.method5126();
        } else if (arg1 == 14) {
            this.field3328 = arg0.method5166();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3333 = arg0.method5166();
            if (this.field3333 == 65535) {
                this.field3333 = -1;
            }
            this.field3334 = arg0.method5166();
            if (this.field3334 == 65535) {
                this.field3334 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5166();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5123();
            this.field3332 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3332[var5] = arg0.method5166();
                if (this.field3332[var5] == 65535) {
                    this.field3332[var5] = -1;
                }
            }
            this.field3332[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ii.v(B)Lii;")
    public final class253 method4262() {
        int var1 = -1;
        if (this.field3333 != -1) {
            var1 = class213.method3185(this.field3333);
        } else if (this.field3334 != -1) {
            var1 = class213.field2507[this.field3334];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3332.length - 1) {
            var2 = this.field3332[var1];
        } else {
            var2 = this.field3332[this.field3332.length - 1];
        }
        return var2 == -1 ? null : method3869(var2);
    }

    @ObfuscatedName("ii.l(II)Ljava/lang/String;")
    public String method4276(int arg0) {
        String var2 = this.field3329;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class291.method185(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("ii.c(I)Llx;")
    public class325 method4274() {
        if (this.field3322 < 0) {
            return null;
        }
        class325 var1 = (class325) field3327.method3120((long) this.field3322);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method1991(Statics.field3317, this.field3322, 0);
        if (var2 != null) {
            field3327.method3122(var2, (long) this.field3322);
        }
        return var2;
    }

    @ObfuscatedName("ii.o(B)Llx;")
    public class325 method4264() {
        if (this.field3321 < 0) {
            return null;
        }
        class325 var1 = (class325) field3327.method3120((long) this.field3321);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method1991(Statics.field3317, this.field3321, 0);
        if (var2 != null) {
            field3327.method3122(var2, (long) this.field3321);
        }
        return var2;
    }

    @ObfuscatedName("ii.i(I)Llx;")
    public class325 method4265() {
        if (this.field3324 < 0) {
            return null;
        }
        class325 var1 = (class325) field3327.method3120((long) this.field3324);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method1991(Statics.field3317, this.field3324, 0);
        if (var2 != null) {
            field3327.method3122(var2, (long) this.field3324);
        }
        return var2;
    }

    @ObfuscatedName("ii.d(I)Llx;")
    public class325 method4286() {
        if (this.field3326 < 0) {
            return null;
        }
        class325 var1 = (class325) field3327.method3120((long) this.field3326);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method1991(Statics.field3317, this.field3326, 0);
        if (var2 != null) {
            field3327.method3122(var2, (long) this.field3326);
        }
        return var2;
    }

    @ObfuscatedName("ii.m(B)Lks;")
    public class295 method4267() {
        if (this.field3319 == -1) {
            return null;
        }
        class295 var1 = (class295) field3318.method3120((long) this.field3319);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class326.method4665(Statics.field3317, Statics.field10, this.field3319, 0);
        if (var2 != null) {
            field3318.method3122(var2, (long) this.field3319);
        }
        return var2;
    }
}
