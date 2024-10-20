package deob;

@ObfuscatedName("iu")
public class class255 extends class195 {

    @ObfuscatedName("iu.t")
    public static class190 field3422 = new class190(64);

    @ObfuscatedName("iu.s")
    public static class190 field3423 = new class190(64);

    @ObfuscatedName("iu.r")
    public static class190 field3424 = new class190(20);

    @ObfuscatedName("iu.o")
    public int field3432 = -1;

    @ObfuscatedName("iu.z")
    public int field3439 = 16777215;

    @ObfuscatedName("iu.l")
    public int field3429 = 70;

    @ObfuscatedName("iu.c")
    public int field3430 = -1;

    @ObfuscatedName("iu.m")
    public int field3431 = -1;

    @ObfuscatedName("iu.b")
    public int field3445 = -1;

    @ObfuscatedName("iu.f")
    public int field3433 = -1;

    @ObfuscatedName("iu.n")
    public int field3434 = 0;

    @ObfuscatedName("iu.u")
    public int field3435 = 0;

    @ObfuscatedName("iu.p")
    public int field3436 = -1;

    @ObfuscatedName("iu.q")
    public String field3437 = "";

    @ObfuscatedName("iu.d")
    public int field3438 = -1;

    @ObfuscatedName("iu.h")
    public int field3441 = 0;

    @ObfuscatedName("iu.g")
    public int[] field3440;

    @ObfuscatedName("iu.x")
    public int field3425 = -1;

    @ObfuscatedName("iu.ah")
    public int field3443 = -1;

    @ObfuscatedName("fh.i(II)Liu;")
    public static class255 method2793(int arg0) {
        class255 var1 = (class255) field3422.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3442.method3768(32, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4122(new class174(var2));
        }
        field3422.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.w(Lfp;I)V")
    public void method4122(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method4127(arg0, var2);
        }
    }

    @ObfuscatedName("iu.a(Lfp;IB)V")
    public void method4127(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3432 = arg0.method2864();
        } else if (arg1 == 2) {
            this.field3439 = arg0.method2917();
        } else if (arg1 == 3) {
            this.field3430 = arg0.method2864();
        } else if (arg1 == 4) {
            this.field3445 = arg0.method2864();
        } else if (arg1 == 5) {
            this.field3431 = arg0.method2864();
        } else if (arg1 == 6) {
            this.field3433 = arg0.method2864();
        } else if (arg1 == 7) {
            this.field3434 = arg0.method3013();
        } else if (arg1 == 8) {
            this.field3437 = arg0.method2889();
        } else if (arg1 == 9) {
            this.field3429 = arg0.method2882();
        } else if (arg1 == 10) {
            this.field3435 = arg0.method3013();
        } else if (arg1 == 11) {
            this.field3436 = 0;
        } else if (arg1 == 12) {
            this.field3438 = arg0.method3061();
        } else if (arg1 == 13) {
            this.field3441 = arg0.method3013();
        } else if (arg1 == 14) {
            this.field3436 = arg0.method2882();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3425 = arg0.method2882();
            if (this.field3425 == 65535) {
                this.field3425 = -1;
            }
            this.field3443 = arg0.method2882();
            if (this.field3443 == 65535) {
                this.field3443 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2882();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3061();
            this.field3440 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3440[var5] = arg0.method2882();
                if (this.field3440[var5] == 65535) {
                    this.field3440[var5] = -1;
                }
            }
            this.field3440[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("iu.t(B)Liu;")
    public final class255 method4124() {
        int var1 = -1;
        if (this.field3425 != -1) {
            var1 = class212.method227(this.field3425);
        } else if (this.field3443 != -1) {
            var1 = class212.field2613[this.field3443];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3440.length - 1) {
            var2 = this.field3440[var1];
        } else {
            var2 = this.field3440[this.field3440.length - 1];
        }
        return var2 == -1 ? null : method2793(var2);
    }

    @ObfuscatedName("iu.s(IS)Ljava/lang/String;")
    public String method4123(int arg0) {
        String var2 = this.field3437;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class271.method4031(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("iu.r(I)Ljk;")
    public class286 method4126() {
        if (this.field3430 < 0) {
            return null;
        }
        class286 var1 = (class286) field3423.method3235((long) this.field3430);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4215(Statics.field3420, this.field3430, 0);
        if (var2 != null) {
            field3423.method3234(var2, (long) this.field3430);
        }
        return var2;
    }

    @ObfuscatedName("iu.v(I)Ljk;")
    public class286 method4143() {
        if (this.field3431 < 0) {
            return null;
        }
        class286 var1 = (class286) field3423.method3235((long) this.field3431);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4215(Statics.field3420, this.field3431, 0);
        if (var2 != null) {
            field3423.method3234(var2, (long) this.field3431);
        }
        return var2;
    }

    @ObfuscatedName("iu.y(S)Ljk;")
    public class286 method4148() {
        if (this.field3445 < 0) {
            return null;
        }
        class286 var1 = (class286) field3423.method3235((long) this.field3445);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4215(Statics.field3420, this.field3445, 0);
        if (var2 != null) {
            field3423.method3234(var2, (long) this.field3445);
        }
        return var2;
    }

    @ObfuscatedName("iu.j(B)Ljk;")
    public class286 method4150() {
        if (this.field3433 < 0) {
            return null;
        }
        class286 var1 = (class286) field3423.method3235((long) this.field3433);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4215(Statics.field3420, this.field3433, 0);
        if (var2 != null) {
            field3423.method3234(var2, (long) this.field3433);
        }
        return var2;
    }

    @ObfuscatedName("iu.k(S)Ljf;")
    public class264 method4147() {
        if (this.field3432 == -1) {
            return null;
        }
        class264 var1 = (class264) field3424.method3235((long) this.field3432);
        if (var1 != null) {
            return var1;
        }
        class236 var2 = Statics.field3420;
        class236 var3 = Statics.field2640;
        int var4 = this.field3432;
        class264 var5;
        if (class287.method3742(var2, var4, 0)) {
            byte[] var6 = var3.method3768(var4, 0);
            class264 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class264 var8 = new class264(var6, Statics.field3800, Statics.field3801, Statics.field240, Statics.field3147, Statics.field3746, Statics.field2610);
                class287.method105();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3424.method3234(var5, (long) this.field3432);
        }
        return var5;
    }

    @ObfuscatedName("dv.e(I)V")
    public static void method2183() {
        field3422.method3232();
        field3423.method3232();
        field3424.method3232();
    }
}
