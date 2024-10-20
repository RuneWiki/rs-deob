package deob;

@ObfuscatedName("ip")
public class class259 extends class195 {

    @ObfuscatedName("ip.n")
    public static class190 field3554 = new class190(64);

    @ObfuscatedName("ip.r")
    public static class190 field3575 = new class190(50);

    @ObfuscatedName("ip.v")
    public int field3556;

    @ObfuscatedName("ip.e")
    public String field3557 = "null";

    @ObfuscatedName("ip.l")
    public int field3558 = 1;

    @ObfuscatedName("ip.s")
    public int[] field3559;

    @ObfuscatedName("ip.w")
    public int[] field3560;

    @ObfuscatedName("ip.p")
    public int field3563 = -1;

    @ObfuscatedName("ip.m")
    public int field3562 = -1;

    @ObfuscatedName("ip.u")
    public int field3573 = -1;

    @ObfuscatedName("ip.g")
    public int field3564 = -1;

    @ObfuscatedName("ip.k")
    public int field3577 = -1;

    @ObfuscatedName("ip.t")
    public int field3566 = -1;

    @ObfuscatedName("ip.c")
    public int field3584 = -1;

    @ObfuscatedName("ip.o")
    public short[] field3568;

    @ObfuscatedName("ip.x")
    public short[] field3569;

    @ObfuscatedName("ip.f")
    public short[] field3565;

    @ObfuscatedName("ip.h")
    public short[] field3571;

    @ObfuscatedName("ip.z")
    public String[] field3572 = new String[5];

    @ObfuscatedName("ip.i")
    public boolean field3555 = true;

    @ObfuscatedName("ip.d")
    public int field3574 = -1;

    @ObfuscatedName("ip.b")
    public int field3570 = 128;

    @ObfuscatedName("ip.q")
    public int field3576 = 128;

    @ObfuscatedName("ip.y")
    public boolean field3582 = false;

    @ObfuscatedName("ip.ai")
    public int field3553 = 0;

    @ObfuscatedName("ip.ae")
    public int field3579 = 0;

    @ObfuscatedName("ip.au")
    public int field3580 = -1;

    @ObfuscatedName("ip.ak")
    public int field3581 = 32;

    @ObfuscatedName("ip.ap")
    public int[] field3567;

    @ObfuscatedName("ip.ar")
    public int field3583 = -1;

    @ObfuscatedName("ip.am")
    public int field3578 = -1;

    @ObfuscatedName("ip.aw")
    public boolean field3585 = true;

    @ObfuscatedName("ip.aq")
    public boolean field3586 = true;

    @ObfuscatedName("ip.aa")
    public boolean field3587 = false;

    @ObfuscatedName("ip.ag")
    public class187 field3588;

    @ObfuscatedName("hf.a(II)Lip;")
    public static class259 method3748(int arg0) {
        class259 var1 = (class259) field3554.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3561.method3787(9, arg0);
        class259 var3 = new class259();
        var3.field3556 = arg0;
        if (var2 != null) {
            var3.method4237(new class174(var2));
        }
        var3.method4236();
        field3554.method3247(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.j(I)V")
    public void method4236() {
    }

    @ObfuscatedName("ip.n(Lfe;B)V")
    public void method4237(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method4238(arg0, var2);
        }
    }

    @ObfuscatedName("ip.r(Lfe;II)V")
    public void method4238(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2871();
            this.field3559 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3559[var4] = arg0.method2873();
            }
        } else if (arg1 == 2) {
            this.field3557 = arg0.method2879();
        } else if (arg1 == 12) {
            this.field3558 = arg0.method2871();
        } else if (arg1 == 13) {
            this.field3563 = arg0.method2873();
        } else if (arg1 == 14) {
            this.field3564 = arg0.method2873();
        } else if (arg1 == 15) {
            this.field3562 = arg0.method2873();
        } else if (arg1 == 16) {
            this.field3573 = arg0.method2873();
        } else if (arg1 == 17) {
            this.field3564 = arg0.method2873();
            this.field3577 = arg0.method2873();
            this.field3566 = arg0.method2873();
            this.field3584 = arg0.method2873();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3572[arg1 - 30] = arg0.method2879();
            if (this.field3572[arg1 - 30].equalsIgnoreCase(class226.field3139)) {
                this.field3572[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2871();
            this.field3568 = new short[var5];
            this.field3569 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3568[var6] = (short) arg0.method2873();
                this.field3569[var6] = (short) arg0.method2873();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2871();
            this.field3565 = new short[var7];
            this.field3571 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3565[var8] = (short) arg0.method2873();
                this.field3571[var8] = (short) arg0.method2873();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2871();
            this.field3560 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3560[var10] = arg0.method2873();
            }
        } else if (arg1 == 93) {
            this.field3555 = false;
        } else if (arg1 == 95) {
            this.field3574 = arg0.method2873();
        } else if (arg1 == 97) {
            this.field3570 = arg0.method2873();
        } else if (arg1 == 98) {
            this.field3576 = arg0.method2873();
        } else if (arg1 == 99) {
            this.field3582 = true;
        } else if (arg1 == 100) {
            this.field3553 = arg0.method2872();
        } else if (arg1 == 101) {
            this.field3579 = arg0.method2872() * 5;
        } else if (arg1 == 102) {
            this.field3580 = arg0.method2873();
        } else if (arg1 == 103) {
            this.field3581 = arg0.method2873();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3583 = arg0.method2873();
            if (this.field3583 == 65535) {
                this.field3583 = -1;
            }
            this.field3578 = arg0.method2873();
            if (this.field3578 == 65535) {
                this.field3578 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2873();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2871();
            this.field3567 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3567[var13] = arg0.method2873();
                if (this.field3567[var13] == 65535) {
                    this.field3567[var13] = -1;
                }
            }
            this.field3567[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3585 = false;
        } else if (arg1 == 109) {
            this.field3586 = false;
        } else if (arg1 == 111) {
            this.field3587 = true;
        } else if (arg1 == 249) {
            this.field3588 = class250.method1405(arg0, this.field3588);
        }
    }

    @ObfuscatedName("ip.v(Ljg;ILjg;II)Lej;")
    public final class134 method4239(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field3567 != null) {
            class259 var5 = this.method4241();
            return var5 == null ? null : var5.method4239(arg0, arg1, arg2, arg3);
        }
        class134 var6 = (class134) field3575.method3245((long) this.field3556);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3559.length; var8++) {
                if (!Statics.field2513.method3765(this.field3559[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class128[] var9 = new class128[this.field3559.length];
            for (int var10 = 0; var10 < this.field3559.length; var10++) {
                var9[var10] = class128.method2173(Statics.field2513, this.field3559[var10], 0);
            }
            class128 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class128(var9, var9.length);
            }
            if (this.field3568 != null) {
                for (int var12 = 0; var12 < this.field3568.length; var12++) {
                    var11.method2186(this.field3568[var12], this.field3569[var12]);
                }
            }
            if (this.field3565 != null) {
                for (int var13 = 0; var13 < this.field3565.length; var13++) {
                    var11.method2187(this.field3565[var13], this.field3571[var13]);
                }
            }
            var6 = var11.method2194(this.field3553 + 64, this.field3579 + 850, -30, -50, -30);
            field3575.method3247(var6, (long) this.field3556);
        }
        class134 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4289(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4286(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2272(true);
        } else {
            var14 = arg2.method4286(var6, arg3);
        }
        if (this.field3570 != 128 || this.field3576 != 128) {
            var14.method2301(this.field3570, this.field3576, this.field3570);
        }
        return var14;
    }

    @ObfuscatedName("ip.e(I)Ldv;")
    public final class128 method4240() {
        if (this.field3567 != null) {
            class259 var1 = this.method4241();
            return var1 == null ? null : var1.method4240();
        } else if (this.field3560 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3560.length; var3++) {
                if (!Statics.field2513.method3765(this.field3560[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class128[] var4 = new class128[this.field3560.length];
            for (int var5 = 0; var5 < this.field3560.length; var5++) {
                var4[var5] = class128.method2173(Statics.field2513, this.field3560[var5], 0);
            }
            class128 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class128(var4, var4.length);
            }
            if (this.field3568 != null) {
                for (int var7 = 0; var7 < this.field3568.length; var7++) {
                    var6.method2186(this.field3568[var7], this.field3569[var7]);
                }
            }
            if (this.field3565 != null) {
                for (int var8 = 0; var8 < this.field3565.length; var8++) {
                    var6.method2187(this.field3565[var8], this.field3571[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ip.l(I)Lip;")
    public final class259 method4241() {
        int var1 = -1;
        if (this.field3583 != -1) {
            var1 = class212.method4(this.field3583);
        } else if (this.field3578 != -1) {
            var1 = class212.field2613[this.field3578];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3567.length - 1) {
            var2 = this.field3567[var1];
        } else {
            var2 = this.field3567[this.field3567.length - 1];
        }
        return var2 == -1 ? null : method3748(var2);
    }

    @ObfuscatedName("ip.s(I)Z")
    public boolean method4247() {
        if (this.field3567 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3583 != -1) {
            var1 = class212.method4(this.field3583);
        } else if (this.field3578 != -1) {
            var1 = class212.field2613[this.field3578];
        }
        if (var1 >= 0 && var1 < this.field3567.length) {
            return this.field3567[var1] != -1;
        } else {
            return this.field3567[this.field3567.length - 1] != -1;
        }
    }

    @ObfuscatedName("ip.w(IIB)I")
    public int method4243(int arg0, int arg1) {
        return class250.method2715(this.field3588, arg0, arg1);
    }

    @ObfuscatedName("ip.p(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4244(int arg0, String arg1) {
        return class250.method2741(this.field3588, arg0, arg1);
    }
}
