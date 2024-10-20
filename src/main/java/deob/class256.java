package deob;

@ObfuscatedName("ip")
public class class256 extends class196 {

    @ObfuscatedName("ip.r")
    public static class191 field3414 = new class191(64);

    @ObfuscatedName("ip.o")
    public static class191 field3431 = new class191(64);

    @ObfuscatedName("ip.n")
    public static class191 field3422 = new class191(20);

    @ObfuscatedName("ip.l")
    public int field3419 = -1;

    @ObfuscatedName("ip.t")
    public int field3416 = 16777215;

    @ObfuscatedName("ip.y")
    public int field3421 = 70;

    @ObfuscatedName("ip.v")
    public int field3434 = -1;

    @ObfuscatedName("ip.c")
    public int field3423 = -1;

    @ObfuscatedName("ip.z")
    public int field3424 = -1;

    @ObfuscatedName("ip.u")
    public int field3425 = -1;

    @ObfuscatedName("ip.e")
    public int field3415 = 0;

    @ObfuscatedName("ip.p")
    public int field3427 = 0;

    @ObfuscatedName("ip.m")
    public int field3412 = -1;

    @ObfuscatedName("ip.x")
    public String field3429 = "";

    @ObfuscatedName("ip.h")
    public int field3417 = -1;

    @ObfuscatedName("ip.f")
    public int field3413 = 0;

    @ObfuscatedName("ip.g")
    public int[] field3432;

    @ObfuscatedName("ip.w")
    public int field3433 = -1;

    @ObfuscatedName("ip.ar")
    public int field3428 = -1;

    @ObfuscatedName("dz.i(Lii;Lii;Lii;B)V")
    public static void method1885(class237 arg0, class237 arg1, class237 arg2) {
        Statics.field3420 = arg0;
        Statics.field3426 = arg1;
        Statics.field3430 = arg2;
    }

    @ObfuscatedName("bz.j(II)Lip;")
    public static class256 method977(int arg0) {
        class256 var1 = (class256) field3414.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3420.method3824(32, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4162(new class175(var2));
        }
        field3414.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.a(Lfp;I)V")
    public void method4162(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method4177(arg0, var2);
        }
    }

    @ObfuscatedName("ip.r(Lfp;IB)V")
    public void method4177(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3419 = arg0.method3009();
        } else if (arg1 == 2) {
            this.field3416 = arg0.method2997();
        } else if (arg1 == 3) {
            this.field3434 = arg0.method3009();
        } else if (arg1 == 4) {
            this.field3424 = arg0.method3009();
        } else if (arg1 == 5) {
            this.field3423 = arg0.method3009();
        } else if (arg1 == 6) {
            this.field3425 = arg0.method3009();
        } else if (arg1 == 7) {
            this.field3415 = arg0.method2996();
        } else if (arg1 == 8) {
            this.field3429 = arg0.method3003();
        } else if (arg1 == 9) {
            this.field3421 = arg0.method2995();
        } else if (arg1 == 10) {
            this.field3427 = arg0.method2996();
        } else if (arg1 == 11) {
            this.field3412 = 0;
        } else if (arg1 == 12) {
            this.field3417 = arg0.method2999();
        } else if (arg1 == 13) {
            this.field3413 = arg0.method2996();
        } else if (arg1 == 14) {
            this.field3412 = arg0.method2995();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3433 = arg0.method2995();
            if (this.field3433 == 65535) {
                this.field3433 = -1;
            }
            this.field3428 = arg0.method2995();
            if (this.field3428 == 65535) {
                this.field3428 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2995();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2999();
            this.field3432 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3432[var5] = arg0.method2995();
                if (this.field3432[var5] == 65535) {
                    this.field3432[var5] = -1;
                }
            }
            this.field3432[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ip.o(B)Lip;")
    public final class256 method4164() {
        int var1 = -1;
        if (this.field3433 != -1) {
            var1 = class213.method1008(this.field3433);
        } else if (this.field3428 != -1) {
            var1 = class213.field2609[this.field3428];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3432.length - 1) {
            var2 = this.field3432[var1];
        } else {
            var2 = this.field3432[this.field3432.length - 1];
        }
        return var2 == -1 ? null : method977(var2);
    }

    @ObfuscatedName("ip.n(IB)Ljava/lang/String;")
    public String method4165(int arg0) {
        String var2 = this.field3429;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class272.method4(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("ip.q(I)Lkd;")
    public class287 method4166() {
        if (this.field3434 < 0) {
            return null;
        }
        class287 var1 = (class287) field3431.method3347((long) this.field3434);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method4185(Statics.field3426, this.field3434, 0);
        if (var2 != null) {
            field3431.method3346(var2, (long) this.field3434);
        }
        return var2;
    }

    @ObfuscatedName("ip.b(B)Lkd;")
    public class287 method4174() {
        if (this.field3423 < 0) {
            return null;
        }
        class287 var1 = (class287) field3431.method3347((long) this.field3423);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method4185(Statics.field3426, this.field3423, 0);
        if (var2 != null) {
            field3431.method3346(var2, (long) this.field3423);
        }
        return var2;
    }

    @ObfuscatedName("ip.k(I)Lkd;")
    public class287 method4168() {
        if (this.field3424 < 0) {
            return null;
        }
        class287 var1 = (class287) field3431.method3347((long) this.field3424);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method4185(Statics.field3426, this.field3424, 0);
        if (var2 != null) {
            field3431.method3346(var2, (long) this.field3424);
        }
        return var2;
    }

    @ObfuscatedName("ip.s(S)Lkd;")
    public class287 method4169() {
        if (this.field3425 < 0) {
            return null;
        }
        class287 var1 = (class287) field3431.method3347((long) this.field3425);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method4185(Statics.field3426, this.field3425, 0);
        if (var2 != null) {
            field3431.method3346(var2, (long) this.field3425);
        }
        return var2;
    }

    @ObfuscatedName("ip.d(I)Ljm;")
    public class265 method4170() {
        if (this.field3419 == -1) {
            return null;
        }
        class265 var1 = (class265) field3422.method3347((long) this.field3419);
        if (var1 != null) {
            return var1;
        }
        class265 var2 = Statics.method3728(Statics.field3426, Statics.field3430, this.field3419, 0);
        if (var2 != null) {
            field3422.method3346(var2, (long) this.field3419);
        }
        return var2;
    }

    @ObfuscatedName("bj.l(B)V")
    public static void method1056() {
        field3414.method3355();
        field3431.method3355();
        field3422.method3355();
    }
}
