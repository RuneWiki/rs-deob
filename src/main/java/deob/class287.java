package deob;

@ObfuscatedName("kc")
public class class287 extends class346 {

    @ObfuscatedName("kc.u")
    public static class199 field3476 = new class199(64);

    @ObfuscatedName("kc.p")
    public static class199 field3477 = new class199(50);

    @ObfuscatedName("kc.b")
    public int field3478;

    @ObfuscatedName("kc.e")
    public String field3479 = class246.field2920;

    @ObfuscatedName("kc.k")
    public int field3480 = 1;

    @ObfuscatedName("kc.g")
    public int[] field3481;

    @ObfuscatedName("kc.h")
    public int[] field3483;

    @ObfuscatedName("kc.n")
    public int field3493 = -1;

    @ObfuscatedName("kc.l")
    public int field3495 = -1;

    @ObfuscatedName("kc.m")
    public int field3485 = -1;

    @ObfuscatedName("kc.d")
    public int field3486 = -1;

    @ObfuscatedName("kc.c")
    public int field3482 = -1;

    @ObfuscatedName("kc.j")
    public int field3488 = -1;

    @ObfuscatedName("kc.r")
    public int field3497 = -1;

    @ObfuscatedName("kc.q")
    public short[] field3490;

    @ObfuscatedName("kc.t")
    public short[] field3491;

    @ObfuscatedName("kc.v")
    public short[] field3492;

    @ObfuscatedName("kc.x")
    public short[] field3506;

    @ObfuscatedName("kc.z")
    public String[] field3489 = new String[5];

    @ObfuscatedName("kc.i")
    public boolean field3503 = true;

    @ObfuscatedName("kc.a")
    public int field3494 = -1;

    @ObfuscatedName("kc.w")
    public int field3508 = 128;

    @ObfuscatedName("kc.s")
    public int field3498 = 128;

    @ObfuscatedName("kc.y")
    public boolean field3499 = false;

    @ObfuscatedName("kc.ac")
    public int field3500 = 0;

    @ObfuscatedName("kc.ay")
    public int field3501 = 0;

    @ObfuscatedName("kc.am")
    public int field3502 = -1;

    @ObfuscatedName("kc.ag")
    public int field3504 = 32;

    @ObfuscatedName("kc.aq")
    public int[] field3487;

    @ObfuscatedName("kc.at")
    public int field3505 = -1;

    @ObfuscatedName("kc.aj")
    public int field3474 = -1;

    @ObfuscatedName("kc.aw")
    public boolean field3507 = true;

    @ObfuscatedName("kc.ap")
    public boolean field3496 = true;

    @ObfuscatedName("kc.ax")
    public boolean field3509 = false;

    @ObfuscatedName("kc.as")
    public class360 field3510;

    @ObfuscatedName("by.f(Lir;Lir;I)V")
    public static void method877(class253 arg0, class253 arg1) {
        Statics.field3484 = arg0;
        Statics.field3475 = arg1;
    }

    @ObfuscatedName("cf.o(II)Lkc;")
    public static class287 method1652(int arg0) {
        class287 var1 = (class287) field3476.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3484.method3933(9, arg0);
        class287 var3 = new class287();
        var3.field3478 = arg0;
        if (var2 != null) {
            var3.method4455(new class382(var2));
        }
        var3.method4433();
        field3476.method3400(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kc.u(I)V")
    public void method4433() {
    }

    @ObfuscatedName("kc.p(Lnu;I)V")
    public void method4455(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4434(arg0, var2);
        }
    }

    @ObfuscatedName("kc.b(Lnu;II)V")
    public void method4434(class382 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5856();
            this.field3481 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3481[var4] = arg0.method5858();
            }
        } else if (arg1 == 2) {
            this.field3479 = arg0.method5865();
        } else if (arg1 == 12) {
            this.field3480 = arg0.method5856();
        } else if (arg1 == 13) {
            this.field3493 = arg0.method5858();
        } else if (arg1 == 14) {
            this.field3486 = arg0.method5858();
        } else if (arg1 == 15) {
            this.field3495 = arg0.method5858();
        } else if (arg1 == 16) {
            this.field3485 = arg0.method5858();
        } else if (arg1 == 17) {
            this.field3486 = arg0.method5858();
            this.field3482 = arg0.method5858();
            this.field3488 = arg0.method5858();
            this.field3497 = arg0.method5858();
        } else if (arg1 == 18) {
            arg0.method5858();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3489[arg1 - 30] = arg0.method5865();
            if (this.field3489[arg1 - 30].equalsIgnoreCase(class246.field2915)) {
                this.field3489[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5856();
            this.field3490 = new short[var5];
            this.field3491 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3490[var6] = (short) arg0.method5858();
                this.field3491[var6] = (short) arg0.method5858();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5856();
            this.field3492 = new short[var7];
            this.field3506 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3492[var8] = (short) arg0.method5858();
                this.field3506[var8] = (short) arg0.method5858();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5856();
            this.field3483 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3483[var10] = arg0.method5858();
            }
        } else if (arg1 == 93) {
            this.field3503 = false;
        } else if (arg1 == 95) {
            this.field3494 = arg0.method5858();
        } else if (arg1 == 97) {
            this.field3508 = arg0.method5858();
        } else if (arg1 == 98) {
            this.field3498 = arg0.method5858();
        } else if (arg1 == 99) {
            this.field3499 = true;
        } else if (arg1 == 100) {
            this.field3500 = arg0.method6045();
        } else if (arg1 == 101) {
            this.field3501 = arg0.method6045() * 5;
        } else if (arg1 == 102) {
            this.field3502 = arg0.method5858();
        } else if (arg1 == 103) {
            this.field3504 = arg0.method5858();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3505 = arg0.method5858();
            if (this.field3505 == 65535) {
                this.field3505 = -1;
            }
            this.field3474 = arg0.method5858();
            if (this.field3474 == 65535) {
                this.field3474 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5858();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5856();
            this.field3487 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3487[var13] = arg0.method5858();
                if (this.field3487[var13] == 65535) {
                    this.field3487[var13] = -1;
                }
            }
            this.field3487[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3507 = false;
        } else if (arg1 == 109) {
            this.field3496 = false;
        } else if (arg1 == 111) {
            this.field3509 = true;
        } else if (arg1 == 249) {
            this.field3510 = class284.method1975(arg0, this.field3510);
        }
    }

    @ObfuscatedName("kc.e(Lkw;ILkw;II)Lgv;")
    public final class183 method4462(class298 arg0, int arg1, class298 arg2, int arg3) {
        if (this.field3487 != null) {
            class287 var5 = this.method4437();
            return var5 == null ? null : var5.method4462(arg0, arg1, arg2, arg3);
        }
        class183 var6 = (class183) field3477.method3398((long) this.field3478);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3481.length; var8++) {
                if (!Statics.field3475.method3935(this.field3481[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class169[] var9 = new class169[this.field3481.length];
            for (int var10 = 0; var10 < this.field3481.length; var10++) {
                var9[var10] = class169.method2839(Statics.field3475, this.field3481[var10], 0);
            }
            class169 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class169(var9, var9.length);
            }
            if (this.field3490 != null) {
                for (int var12 = 0; var12 < this.field3490.length; var12++) {
                    var11.method2852(this.field3490[var12], this.field3491[var12]);
                }
            }
            if (this.field3492 != null) {
                for (int var13 = 0; var13 < this.field3492.length; var13++) {
                    var11.method2842(this.field3492[var13], this.field3506[var13]);
                }
            }
            var6 = var11.method2860(this.field3500 + 64, this.field3501 + 850, -30, -50, -30);
            field3477.method3400(var6, (long) this.field3478);
        }
        class183 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4745(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4754(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method3272(true);
        } else {
            var14 = arg2.method4754(var6, arg3);
        }
        if (this.field3508 != 128 || this.field3498 != 128) {
            var14.method3252(this.field3508, this.field3498, this.field3508);
        }
        return var14;
    }

    @ObfuscatedName("kc.k(I)Lfs;")
    public final class169 method4436() {
        if (this.field3487 != null) {
            class287 var1 = this.method4437();
            return var1 == null ? null : var1.method4436();
        } else if (this.field3483 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3483.length; var3++) {
                if (!Statics.field3475.method3935(this.field3483[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class169[] var4 = new class169[this.field3483.length];
            for (int var5 = 0; var5 < this.field3483.length; var5++) {
                var4[var5] = class169.method2839(Statics.field3475, this.field3483[var5], 0);
            }
            class169 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class169(var4, var4.length);
            }
            if (this.field3490 != null) {
                for (int var7 = 0; var7 < this.field3490.length; var7++) {
                    var6.method2852(this.field3490[var7], this.field3491[var7]);
                }
            }
            if (this.field3492 != null) {
                for (int var8 = 0; var8 < this.field3492.length; var8++) {
                    var6.method2842(this.field3492[var8], this.field3506[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("kc.g(I)Lkc;")
    public final class287 method4437() {
        int var1 = -1;
        if (this.field3505 != -1) {
            var1 = class220.method29(this.field3505);
        } else if (this.field3474 != -1) {
            var1 = class220.field2578[this.field3474];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3487.length - 1) {
            var2 = this.field3487[var1];
        } else {
            var2 = this.field3487[this.field3487.length - 1];
        }
        return var2 == -1 ? null : method1652(var2);
    }

    @ObfuscatedName("kc.h(I)Z")
    public boolean method4432() {
        if (this.field3487 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3505 != -1) {
            var1 = class220.method29(this.field3505);
        } else if (this.field3474 != -1) {
            var1 = class220.field2578[this.field3474];
        }
        if (var1 >= 0 && var1 < this.field3487.length) {
            return this.field3487[var1] != -1;
        } else {
            return this.field3487[this.field3487.length - 1] != -1;
        }
    }

    @ObfuscatedName("kc.n(III)I")
    public int method4439(int arg0, int arg1) {
        class360 var3 = this.field3510;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class350 var5 = (class350) var3.method5621((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field3940;
            }
        }
        return var4;
    }

    @ObfuscatedName("kc.l(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4440(int arg0, String arg1) {
        return class284.method549(this.field3510, arg0, arg1);
    }

    @ObfuscatedName("hv.m(I)V")
    public static void method3624() {
        field3476.method3392();
        field3477.method3392();
    }
}
