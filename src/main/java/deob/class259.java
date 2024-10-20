package deob;

@ObfuscatedName("it")
public class class259 extends class195 {

    @ObfuscatedName("it.m")
    public static class190 field3529 = new class190(64);

    @ObfuscatedName("it.g")
    public static class190 field3530 = new class190(50);

    @ObfuscatedName("it.d")
    public int field3531;

    @ObfuscatedName("it.b")
    public String field3532 = "null";

    @ObfuscatedName("it.k")
    public int field3544 = 1;

    @ObfuscatedName("it.f")
    public int[] field3534;

    @ObfuscatedName("it.j")
    public int[] field3547;

    @ObfuscatedName("it.q")
    public int field3536 = -1;

    @ObfuscatedName("it.h")
    public int field3537 = -1;

    @ObfuscatedName("it.i")
    public int field3538 = -1;

    @ObfuscatedName("it.s")
    public int field3539 = -1;

    @ObfuscatedName("it.n")
    public int field3561 = -1;

    @ObfuscatedName("it.c")
    public int field3541 = -1;

    @ObfuscatedName("it.v")
    public int field3533 = -1;

    @ObfuscatedName("it.u")
    public short[] field3543;

    @ObfuscatedName("it.w")
    public short[] field3565;

    @ObfuscatedName("it.z")
    public short[] field3545;

    @ObfuscatedName("it.y")
    public short[] field3542;

    @ObfuscatedName("it.p")
    public String[] field3550 = new String[5];

    @ObfuscatedName("it.l")
    public boolean field3540 = true;

    @ObfuscatedName("it.x")
    public int field3549 = -1;

    @ObfuscatedName("it.r")
    public int field3556 = 128;

    @ObfuscatedName("it.t")
    public int field3551 = 128;

    @ObfuscatedName("it.a")
    public boolean field3558 = false;

    @ObfuscatedName("it.ad")
    public int field3553 = 0;

    @ObfuscatedName("it.ay")
    public int field3548 = 0;

    @ObfuscatedName("it.am")
    public int field3555 = -1;

    @ObfuscatedName("it.ae")
    public int field3546 = 32;

    @ObfuscatedName("it.az")
    public int[] field3557;

    @ObfuscatedName("it.ar")
    public int field3535 = -1;

    @ObfuscatedName("it.ai")
    public int field3559 = -1;

    @ObfuscatedName("it.ap")
    public boolean field3560 = true;

    @ObfuscatedName("it.al")
    public boolean field3563 = true;

    @ObfuscatedName("it.aw")
    public boolean field3562 = false;

    @ObfuscatedName("it.ak")
    public class187 field3552;

    @ObfuscatedName("bm.e(Lin;Lin;I)V")
    public static void method1046(class236 arg0, class236 arg1) {
        Statics.field3554 = arg0;
        Statics.field3528 = arg1;
    }

    @ObfuscatedName("fh.o(II)Lit;")
    public static class259 method3097(int arg0) {
        class259 var1 = (class259) field3529.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3554.method3760(9, arg0);
        class259 var3 = new class259();
        var3.field3531 = arg0;
        if (var2 != null) {
            var3.method4266(new class174(var2));
        }
        var3.method4265();
        field3529.method3250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.m(I)V")
    public void method4265() {
    }

    @ObfuscatedName("it.g(Lfw;I)V")
    public void method4266(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method4267(arg0, var2);
        }
    }

    @ObfuscatedName("it.d(Lfw;IB)V")
    public void method4267(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2891();
            this.field3534 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3534[var4] = arg0.method2930();
            }
        } else if (arg1 == 2) {
            this.field3532 = arg0.method2899();
        } else if (arg1 == 12) {
            this.field3544 = arg0.method2891();
        } else if (arg1 == 13) {
            this.field3536 = arg0.method2930();
        } else if (arg1 == 14) {
            this.field3539 = arg0.method2930();
        } else if (arg1 == 15) {
            this.field3537 = arg0.method2930();
        } else if (arg1 == 16) {
            this.field3538 = arg0.method2930();
        } else if (arg1 == 17) {
            this.field3539 = arg0.method2930();
            this.field3561 = arg0.method2930();
            this.field3541 = arg0.method2930();
            this.field3533 = arg0.method2930();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3550[arg1 - 30] = arg0.method2899();
            if (this.field3550[arg1 - 30].equalsIgnoreCase(class226.field2837)) {
                this.field3550[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2891();
            this.field3543 = new short[var5];
            this.field3565 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3543[var6] = (short) arg0.method2930();
                this.field3565[var6] = (short) arg0.method2930();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2891();
            this.field3545 = new short[var7];
            this.field3542 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3545[var8] = (short) arg0.method2930();
                this.field3542[var8] = (short) arg0.method2930();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2891();
            this.field3547 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3547[var10] = arg0.method2930();
            }
        } else if (arg1 == 93) {
            this.field3540 = false;
        } else if (arg1 == 95) {
            this.field3549 = arg0.method2930();
        } else if (arg1 == 97) {
            this.field3556 = arg0.method2930();
        } else if (arg1 == 98) {
            this.field3551 = arg0.method2930();
        } else if (arg1 == 99) {
            this.field3558 = true;
        } else if (arg1 == 100) {
            this.field3553 = arg0.method2944();
        } else if (arg1 == 101) {
            this.field3548 = arg0.method2944() * 5;
        } else if (arg1 == 102) {
            this.field3555 = arg0.method2930();
        } else if (arg1 == 103) {
            this.field3546 = arg0.method2930();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3535 = arg0.method2930();
            if (this.field3535 == 65535) {
                this.field3535 = -1;
            }
            this.field3559 = arg0.method2930();
            if (this.field3559 == 65535) {
                this.field3559 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2930();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2891();
            this.field3557 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3557[var13] = arg0.method2930();
                if (this.field3557[var13] == 65535) {
                    this.field3557[var13] = -1;
                }
            }
            this.field3557[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3560 = false;
        } else if (arg1 == 109) {
            this.field3563 = false;
        } else if (arg1 == 111) {
            this.field3562 = true;
        } else if (arg1 == 249) {
            this.field3552 = class250.method925(arg0, this.field3552);
        }
    }

    @ObfuscatedName("it.b(Lju;ILju;II)Leo;")
    public final class134 method4301(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field3557 != null) {
            class259 var5 = this.method4270();
            return var5 == null ? null : var5.method4301(arg0, arg1, arg2, arg3);
        }
        class134 var6 = (class134) field3530.method3248((long) this.field3531);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3534.length; var8++) {
                if (!Statics.field3528.method3798(this.field3534[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class128[] var9 = new class128[this.field3534.length];
            for (int var10 = 0; var10 < this.field3534.length; var10++) {
                var9[var10] = class128.method2202(Statics.field3528, this.field3534[var10], 0);
            }
            class128 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class128(var9, var9.length);
            }
            if (this.field3543 != null) {
                for (int var12 = 0; var12 < this.field3543.length; var12++) {
                    var11.method2189(this.field3543[var12], this.field3565[var12]);
                }
            }
            if (this.field3545 != null) {
                for (int var13 = 0; var13 < this.field3545.length; var13++) {
                    var11.method2190(this.field3545[var13], this.field3542[var13]);
                }
            }
            var6 = var11.method2226(this.field3553 + 64, this.field3548 + 850, -30, -50, -30);
            field3530.method3250(var6, (long) this.field3531);
        }
        class134 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4337(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4333(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2277(true);
        } else {
            var14 = arg2.method4333(var6, arg3);
        }
        if (this.field3556 != 128 || this.field3551 != 128) {
            var14.method2292(this.field3556, this.field3551, this.field3556);
        }
        return var14;
    }

    @ObfuscatedName("it.k(B)Ldz;")
    public final class128 method4269() {
        if (this.field3557 != null) {
            class259 var1 = this.method4270();
            return var1 == null ? null : var1.method4269();
        } else if (this.field3547 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3547.length; var3++) {
                if (!Statics.field3528.method3798(this.field3547[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class128[] var4 = new class128[this.field3547.length];
            for (int var5 = 0; var5 < this.field3547.length; var5++) {
                var4[var5] = class128.method2202(Statics.field3528, this.field3547[var5], 0);
            }
            class128 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class128(var4, var4.length);
            }
            if (this.field3543 != null) {
                for (int var7 = 0; var7 < this.field3543.length; var7++) {
                    var6.method2189(this.field3543[var7], this.field3565[var7]);
                }
            }
            if (this.field3545 != null) {
                for (int var8 = 0; var8 < this.field3545.length; var8++) {
                    var6.method2190(this.field3545[var8], this.field3542[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("it.q(B)Lit;")
    public final class259 method4270() {
        int var1 = -1;
        if (this.field3535 != -1) {
            var1 = class212.method56(this.field3535);
        } else if (this.field3559 != -1) {
            var1 = class212.field2589[this.field3559];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3557.length - 1) {
            var2 = this.field3557[var1];
        } else {
            var2 = this.field3557[this.field3557.length - 1];
        }
        return var2 == -1 ? null : method3097(var2);
    }

    @ObfuscatedName("it.h(B)Z")
    public boolean method4271() {
        if (this.field3557 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3535 != -1) {
            var1 = class212.method56(this.field3535);
        } else if (this.field3559 != -1) {
            var1 = class212.field2589[this.field3559];
        }
        if (var1 >= 0 && var1 < this.field3557.length) {
            return this.field3557[var1] != -1;
        } else {
            return this.field3557[this.field3557.length - 1] != -1;
        }
    }

    @ObfuscatedName("it.i(III)I")
    public int method4272(int arg0, int arg1) {
        return class250.method2858(this.field3552, arg0, arg1);
    }

    @ObfuscatedName("it.s(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4277(int arg0, String arg1) {
        return class250.method1539(this.field3552, arg0, arg1);
    }
}
