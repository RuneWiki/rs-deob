package deob;

@ObfuscatedName("id")
public class class259 extends class195 {

    @ObfuscatedName("id.e")
    public static class190 field3548 = new class190(64);

    @ObfuscatedName("id.v")
    public static class190 field3549 = new class190(50);

    @ObfuscatedName("id.b")
    public int field3550;

    @ObfuscatedName("id.y")
    public String field3559 = "null";

    @ObfuscatedName("id.h")
    public int field3578 = 1;

    @ObfuscatedName("id.x")
    public int[] field3553;

    @ObfuscatedName("id.f")
    public int[] field3554;

    @ObfuscatedName("id.n")
    public int field3551 = -1;

    @ObfuscatedName("id.a")
    public int field3556 = -1;

    @ObfuscatedName("id.o")
    public int field3557 = -1;

    @ObfuscatedName("id.z")
    public int field3558 = -1;

    @ObfuscatedName("id.q")
    public int field3579 = -1;

    @ObfuscatedName("id.j")
    public int field3561 = -1;

    @ObfuscatedName("id.k")
    public int field3546 = -1;

    @ObfuscatedName("id.r")
    public short[] field3562;

    @ObfuscatedName("id.m")
    public short[] field3563;

    @ObfuscatedName("id.d")
    public short[] field3564;

    @ObfuscatedName("id.s")
    public short[] field3565;

    @ObfuscatedName("id.g")
    public String[] field3566 = new String[5];

    @ObfuscatedName("id.w")
    public boolean field3567 = true;

    @ObfuscatedName("id.p")
    public int field3568 = -1;

    @ObfuscatedName("id.l")
    public int field3569 = 128;

    @ObfuscatedName("id.u")
    public int field3570 = 128;

    @ObfuscatedName("id.t")
    public boolean field3571 = false;

    @ObfuscatedName("id.ad")
    public int field3572 = 0;

    @ObfuscatedName("id.ar")
    public int field3573 = 0;

    @ObfuscatedName("id.an")
    public int field3574 = -1;

    @ObfuscatedName("id.af")
    public int field3575 = 32;

    @ObfuscatedName("id.at")
    public int[] field3552;

    @ObfuscatedName("id.ah")
    public int field3577 = -1;

    @ObfuscatedName("id.ai")
    public int field3555 = -1;

    @ObfuscatedName("id.aw")
    public boolean field3560 = true;

    @ObfuscatedName("id.al")
    public boolean field3580 = true;

    @ObfuscatedName("id.ab")
    public boolean field3581 = false;

    @ObfuscatedName("id.aa")
    public class187 field3582;

    @ObfuscatedName("hq.i(II)Lid;")
    public static class259 method3724(int arg0) {
        class259 var1 = (class259) field3548.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3576.method3769(9, arg0);
        class259 var3 = new class259();
        var3.field3550 = arg0;
        if (var2 != null) {
            var3.method4294(new class174(var2));
        }
        var3.method4290();
        field3548.method3222(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.c(I)V")
    public void method4290() {
    }

    @ObfuscatedName("id.e(Lfx;I)V")
    public void method4294(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method4292(arg0, var2);
        }
    }

    @ObfuscatedName("id.v(Lfx;IB)V")
    public void method4292(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2870();
            this.field3553 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3553[var4] = arg0.method2872();
            }
        } else if (arg1 == 2) {
            this.field3559 = arg0.method2878();
        } else if (arg1 == 12) {
            this.field3578 = arg0.method2870();
        } else if (arg1 == 13) {
            this.field3551 = arg0.method2872();
        } else if (arg1 == 14) {
            this.field3558 = arg0.method2872();
        } else if (arg1 == 15) {
            this.field3556 = arg0.method2872();
        } else if (arg1 == 16) {
            this.field3557 = arg0.method2872();
        } else if (arg1 == 17) {
            this.field3558 = arg0.method2872();
            this.field3579 = arg0.method2872();
            this.field3561 = arg0.method2872();
            this.field3546 = arg0.method2872();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3566[arg1 - 30] = arg0.method2878();
            if (this.field3566[arg1 - 30].equalsIgnoreCase(class226.field3014)) {
                this.field3566[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2870();
            this.field3562 = new short[var5];
            this.field3563 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3562[var6] = (short) arg0.method2872();
                this.field3563[var6] = (short) arg0.method2872();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2870();
            this.field3564 = new short[var7];
            this.field3565 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3564[var8] = (short) arg0.method2872();
                this.field3565[var8] = (short) arg0.method2872();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2870();
            this.field3554 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3554[var10] = arg0.method2872();
            }
        } else if (arg1 == 93) {
            this.field3567 = false;
        } else if (arg1 == 95) {
            this.field3568 = arg0.method2872();
        } else if (arg1 == 97) {
            this.field3569 = arg0.method2872();
        } else if (arg1 == 98) {
            this.field3570 = arg0.method2872();
        } else if (arg1 == 99) {
            this.field3571 = true;
        } else if (arg1 == 100) {
            this.field3572 = arg0.method2938();
        } else if (arg1 == 101) {
            this.field3573 = arg0.method2938() * 5;
        } else if (arg1 == 102) {
            this.field3574 = arg0.method2872();
        } else if (arg1 == 103) {
            this.field3575 = arg0.method2872();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3577 = arg0.method2872();
            if (this.field3577 == 65535) {
                this.field3577 = -1;
            }
            this.field3555 = arg0.method2872();
            if (this.field3555 == 65535) {
                this.field3555 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2872();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2870();
            this.field3552 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3552[var13] = arg0.method2872();
                if (this.field3552[var13] == 65535) {
                    this.field3552[var13] = -1;
                }
            }
            this.field3552[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3560 = false;
        } else if (arg1 == 109) {
            this.field3580 = false;
        } else if (arg1 == 111) {
            this.field3581 = true;
        } else if (arg1 == 249) {
            this.field3582 = class250.method1933(arg0, this.field3582);
        }
    }

    @ObfuscatedName("id.b(Lje;ILje;II)Led;")
    public final class134 method4293(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field3552 != null) {
            class259 var5 = this.method4299();
            return var5 == null ? null : var5.method4293(arg0, arg1, arg2, arg3);
        }
        class134 var6 = (class134) field3549.method3220((long) this.field3550);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3553.length; var8++) {
                if (!Statics.field3547.method3771(this.field3553[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class128[] var9 = new class128[this.field3553.length];
            for (int var10 = 0; var10 < this.field3553.length; var10++) {
                var9[var10] = class128.method2208(Statics.field3547, this.field3553[var10], 0);
            }
            class128 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class128(var9, var9.length);
            }
            if (this.field3562 != null) {
                for (int var12 = 0; var12 < this.field3562.length; var12++) {
                    var11.method2190(this.field3562[var12], this.field3563[var12]);
                }
            }
            if (this.field3564 != null) {
                for (int var13 = 0; var13 < this.field3564.length; var13++) {
                    var11.method2231(this.field3564[var13], this.field3565[var13]);
                }
            }
            var6 = var11.method2198(this.field3572 + 64, this.field3573 + 850, -30, -50, -30);
            field3549.method3222(var6, (long) this.field3550);
        }
        class134 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4339(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4336(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2322(true);
        } else {
            var14 = arg2.method4336(var6, arg3);
        }
        if (this.field3569 != 128 || this.field3570 != 128) {
            var14.method2288(this.field3569, this.field3570, this.field3569);
        }
        return var14;
    }

    @ObfuscatedName("id.y(B)Ldw;")
    public final class128 method4295() {
        if (this.field3552 != null) {
            class259 var1 = this.method4299();
            return var1 == null ? null : var1.method4295();
        } else if (this.field3554 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3554.length; var3++) {
                if (!Statics.field3547.method3771(this.field3554[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class128[] var4 = new class128[this.field3554.length];
            for (int var5 = 0; var5 < this.field3554.length; var5++) {
                var4[var5] = class128.method2208(Statics.field3547, this.field3554[var5], 0);
            }
            class128 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class128(var4, var4.length);
            }
            if (this.field3562 != null) {
                for (int var7 = 0; var7 < this.field3562.length; var7++) {
                    var6.method2190(this.field3562[var7], this.field3563[var7]);
                }
            }
            if (this.field3564 != null) {
                for (int var8 = 0; var8 < this.field3564.length; var8++) {
                    var6.method2231(this.field3564[var8], this.field3565[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("id.h(I)Lid;")
    public final class259 method4299() {
        int var1 = -1;
        if (this.field3577 != -1) {
            var1 = class212.method2144(this.field3577);
        } else if (this.field3555 != -1) {
            var1 = class212.field2609[this.field3555];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3552.length - 1) {
            var2 = this.field3552[var1];
        } else {
            var2 = this.field3552[this.field3552.length - 1];
        }
        return var2 == -1 ? null : method3724(var2);
    }

    @ObfuscatedName("id.x(B)Z")
    public boolean method4296() {
        if (this.field3552 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3577 != -1) {
            var1 = class212.method2144(this.field3577);
        } else if (this.field3555 != -1) {
            var1 = class212.field2609[this.field3555];
        }
        if (var1 >= 0 && var1 < this.field3552.length) {
            return this.field3552[var1] != -1;
        } else {
            return this.field3552[this.field3552.length - 1] != -1;
        }
    }

    @ObfuscatedName("id.f(III)I")
    public int method4297(int arg0, int arg1) {
        return class250.method1453(this.field3582, arg0, arg1);
    }

    @ObfuscatedName("id.n(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4298(int arg0, String arg1) {
        return class250.method446(this.field3582, arg0, arg1);
    }

    @ObfuscatedName("d.a(I)V")
    public static void method112() {
        field3548.method3221();
        field3549.method3221();
    }
}
