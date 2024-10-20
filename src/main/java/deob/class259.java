package deob;

@ObfuscatedName("id")
public class class259 extends class195 {

    @ObfuscatedName("id.e")
    public static class190 field3564 = new class190(64);

    @ObfuscatedName("id.p")
    public static class190 field3557 = new class190(50);

    @ObfuscatedName("id.q")
    public int field3574;

    @ObfuscatedName("id.s")
    public String field3559 = "null";

    @ObfuscatedName("id.r")
    public int field3560 = 1;

    @ObfuscatedName("id.g")
    public int[] field3561;

    @ObfuscatedName("id.v")
    public int[] field3562;

    @ObfuscatedName("id.t")
    public int field3558 = -1;

    @ObfuscatedName("id.y")
    public int field3567 = -1;

    @ObfuscatedName("id.o")
    public int field3565 = -1;

    @ObfuscatedName("id.i")
    public int field3566 = -1;

    @ObfuscatedName("id.u")
    public int field3582 = -1;

    @ObfuscatedName("id.b")
    public int field3568 = -1;

    @ObfuscatedName("id.f")
    public int field3569 = -1;

    @ObfuscatedName("id.j")
    public short[] field3570;

    @ObfuscatedName("id.x")
    public short[] field3571;

    @ObfuscatedName("id.c")
    public short[] field3572;

    @ObfuscatedName("id.h")
    public short[] field3576;

    @ObfuscatedName("id.a")
    public String[] field3563 = new String[5];

    @ObfuscatedName("id.z")
    public boolean field3575 = true;

    @ObfuscatedName("id.l")
    public int field3577 = -1;

    @ObfuscatedName("id.w")
    public int field3554 = 128;

    @ObfuscatedName("id.n")
    public int field3578 = 128;

    @ObfuscatedName("id.m")
    public boolean field3579 = false;

    @ObfuscatedName("id.ae")
    public int field3580 = 0;

    @ObfuscatedName("id.ai")
    public int field3581 = 0;

    @ObfuscatedName("id.ah")
    public int field3585 = -1;

    @ObfuscatedName("id.ab")
    public int field3583 = 32;

    @ObfuscatedName("id.ad")
    public int[] field3584;

    @ObfuscatedName("id.ag")
    public int field3588 = -1;

    @ObfuscatedName("id.as")
    public int field3586 = -1;

    @ObfuscatedName("id.af")
    public boolean field3587 = true;

    @ObfuscatedName("id.aq")
    public boolean field3590 = true;

    @ObfuscatedName("id.am")
    public boolean field3589 = false;

    @ObfuscatedName("id.az")
    public class187 field3573;

    @ObfuscatedName("cp.d(Lit;Lit;I)V")
    public static void method1677(class236 arg0, class236 arg1) {
        Statics.field3556 = arg0;
        Statics.field3555 = arg1;
    }

    @ObfuscatedName("bh.k(II)Lid;")
    public static class259 method1066(int arg0) {
        class259 var1 = (class259) field3564.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3556.method3875(9, arg0);
        class259 var3 = new class259();
        var3.field3574 = arg0;
        if (var2 != null) {
            var3.method4392(new class174(var2));
        }
        var3.method4364();
        field3564.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.e(I)V")
    public void method4364() {
    }

    @ObfuscatedName("id.p(Lfg;I)V")
    public void method4392(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4372(arg0, var2);
        }
    }

    @ObfuscatedName("id.q(Lfg;II)V")
    public void method4372(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2955();
            this.field3561 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3561[var4] = arg0.method3035();
            }
        } else if (arg1 == 2) {
            this.field3559 = arg0.method2964();
        } else if (arg1 == 12) {
            this.field3560 = arg0.method2955();
        } else if (arg1 == 13) {
            this.field3558 = arg0.method3035();
        } else if (arg1 == 14) {
            this.field3566 = arg0.method3035();
        } else if (arg1 == 15) {
            this.field3567 = arg0.method3035();
        } else if (arg1 == 16) {
            this.field3565 = arg0.method3035();
        } else if (arg1 == 17) {
            this.field3566 = arg0.method3035();
            this.field3582 = arg0.method3035();
            this.field3568 = arg0.method3035();
            this.field3569 = arg0.method3035();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3563[arg1 - 30] = arg0.method2964();
            if (this.field3563[arg1 - 30].equalsIgnoreCase(class226.field2860)) {
                this.field3563[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2955();
            this.field3570 = new short[var5];
            this.field3571 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3570[var6] = (short) arg0.method3035();
                this.field3571[var6] = (short) arg0.method3035();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2955();
            this.field3572 = new short[var7];
            this.field3576 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3572[var8] = (short) arg0.method3035();
                this.field3576[var8] = (short) arg0.method3035();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2955();
            this.field3562 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3562[var10] = arg0.method3035();
            }
        } else if (arg1 == 93) {
            this.field3575 = false;
        } else if (arg1 == 95) {
            this.field3577 = arg0.method3035();
        } else if (arg1 == 97) {
            this.field3554 = arg0.method3035();
        } else if (arg1 == 98) {
            this.field3578 = arg0.method3035();
        } else if (arg1 == 99) {
            this.field3579 = true;
        } else if (arg1 == 100) {
            this.field3580 = arg0.method2956();
        } else if (arg1 == 101) {
            this.field3581 = arg0.method2956();
        } else if (arg1 == 102) {
            this.field3585 = arg0.method3035();
        } else if (arg1 == 103) {
            this.field3583 = arg0.method3035();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3588 = arg0.method3035();
            if (this.field3588 == 65535) {
                this.field3588 = -1;
            }
            this.field3586 = arg0.method3035();
            if (this.field3586 == 65535) {
                this.field3586 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3035();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2955();
            this.field3584 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3584[var13] = arg0.method3035();
                if (this.field3584[var13] == 65535) {
                    this.field3584[var13] = -1;
                }
            }
            this.field3584[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3587 = false;
        } else if (arg1 == 109) {
            this.field3590 = false;
        } else if (arg1 == 111) {
            this.field3589 = true;
        } else if (arg1 == 249) {
            this.field3573 = class250.method535(arg0, this.field3573);
        }
    }

    @ObfuscatedName("id.s(Ljl;ILjl;IB)Leb;")
    public final class132 method4367(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field3584 != null) {
            class259 var5 = this.method4369();
            return var5 == null ? null : var5.method4367(arg0, arg1, arg2, arg3);
        }
        class132 var6 = (class132) field3557.method3341((long) this.field3574);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3561.length; var8++) {
                if (!Statics.field3555.method3894(this.field3561[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class126[] var9 = new class126[this.field3561.length];
            for (int var10 = 0; var10 < this.field3561.length; var10++) {
                var9[var10] = class126.method2268(Statics.field3555, this.field3561[var10], 0);
            }
            class126 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class126(var9, var9.length);
            }
            if (this.field3570 != null) {
                for (int var12 = 0; var12 < this.field3570.length; var12++) {
                    var11.method2284(this.field3570[var12], this.field3571[var12]);
                }
            }
            if (this.field3572 != null) {
                for (int var13 = 0; var13 < this.field3572.length; var13++) {
                    var11.method2283(this.field3572[var13], this.field3576[var13]);
                }
            }
            var6 = var11.method2290(this.field3580 + 64, this.field3581 * 5 + 850, -30, -50, -30);
            field3557.method3343(var6, (long) this.field3574);
        }
        class132 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4419(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4439(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2411(true);
        } else {
            var14 = arg2.method4439(var6, arg3);
        }
        if (this.field3554 != 128 || this.field3578 != 128) {
            var14.method2376(this.field3554, this.field3578, this.field3554);
        }
        return var14;
    }

    @ObfuscatedName("id.r(B)Ldl;")
    public final class126 method4384() {
        if (this.field3584 != null) {
            class259 var1 = this.method4369();
            return var1 == null ? null : var1.method4384();
        } else if (this.field3562 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3562.length; var3++) {
                if (!Statics.field3555.method3894(this.field3562[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class126[] var4 = new class126[this.field3562.length];
            for (int var5 = 0; var5 < this.field3562.length; var5++) {
                var4[var5] = class126.method2268(Statics.field3555, this.field3562[var5], 0);
            }
            class126 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class126(var4, var4.length);
            }
            if (this.field3570 != null) {
                for (int var7 = 0; var7 < this.field3570.length; var7++) {
                    var6.method2284(this.field3570[var7], this.field3571[var7]);
                }
            }
            if (this.field3572 != null) {
                for (int var8 = 0; var8 < this.field3572.length; var8++) {
                    var6.method2283(this.field3572[var8], this.field3576[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("id.g(I)Lid;")
    public final class259 method4369() {
        int var1 = -1;
        if (this.field3588 != -1) {
            var1 = class212.method1633(this.field3588);
        } else if (this.field3586 != -1) {
            var1 = class212.field2621[this.field3586];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3584.length - 1) {
            var2 = this.field3584[var1];
        } else {
            var2 = this.field3584[this.field3584.length - 1];
        }
        return var2 == -1 ? null : method1066(var2);
    }

    @ObfuscatedName("id.v(I)Z")
    public boolean method4370() {
        if (this.field3584 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3588 != -1) {
            var1 = class212.method1633(this.field3588);
        } else if (this.field3586 != -1) {
            var1 = class212.field2621[this.field3586];
        }
        if (var1 >= 0 && var1 < this.field3584.length) {
            return this.field3584[var1] != -1;
        } else {
            return this.field3584[this.field3584.length - 1] != -1;
        }
    }

    @ObfuscatedName("id.t(IIB)I")
    public int method4371(int arg0, int arg1) {
        return class250.method3871(this.field3573, arg0, arg1);
    }

    @ObfuscatedName("id.y(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4382(int arg0, String arg1) {
        return class250.method1625(this.field3573, arg0, arg1);
    }
}
