package deob;

@ObfuscatedName("jg")
public class class278 extends class214 {

    @ObfuscatedName("jg.g")
    public static class208 field3589 = new class208(64);

    @ObfuscatedName("jg.x")
    public static class208 field3568 = new class208(50);

    @ObfuscatedName("jg.h")
    public int field3569;

    @ObfuscatedName("jg.f")
    public String field3573 = class246.field2885;

    @ObfuscatedName("jg.p")
    public int field3571 = 1;

    @ObfuscatedName("jg.m")
    public int[] field3595;

    @ObfuscatedName("jg.q")
    public int[] field3567;

    @ObfuscatedName("jg.b")
    public int field3602 = -1;

    @ObfuscatedName("jg.n")
    public int field3579 = -1;

    @ObfuscatedName("jg.e")
    public int field3576 = -1;

    @ObfuscatedName("jg.r")
    public int field3577 = -1;

    @ObfuscatedName("jg.t")
    public int field3578 = -1;

    @ObfuscatedName("jg.l")
    public int field3575 = -1;

    @ObfuscatedName("jg.o")
    public int field3580 = -1;

    @ObfuscatedName("jg.u")
    public short[] field3581;

    @ObfuscatedName("jg.y")
    public short[] field3582;

    @ObfuscatedName("jg.k")
    public short[] field3583;

    @ObfuscatedName("jg.v")
    public short[] field3598;

    @ObfuscatedName("jg.d")
    public String[] field3585 = new String[5];

    @ObfuscatedName("jg.w")
    public boolean field3572 = true;

    @ObfuscatedName("jg.i")
    public int field3587 = -1;

    @ObfuscatedName("jg.c")
    public int field3588 = 128;

    @ObfuscatedName("jg.j")
    public int field3591 = 128;

    @ObfuscatedName("jg.z")
    public boolean field3590 = false;

    @ObfuscatedName("jg.ag")
    public int field3570 = 0;

    @ObfuscatedName("jg.af")
    public int field3592 = 0;

    @ObfuscatedName("jg.ay")
    public int field3593 = -1;

    @ObfuscatedName("jg.aa")
    public int field3594 = 32;

    @ObfuscatedName("jg.ab")
    public int[] field3574;

    @ObfuscatedName("jg.ah")
    public int field3596 = -1;

    @ObfuscatedName("jg.aw")
    public int field3597 = -1;

    @ObfuscatedName("jg.an")
    public boolean field3584 = true;

    @ObfuscatedName("jg.at")
    public boolean field3566 = true;

    @ObfuscatedName("jg.ae")
    public boolean field3600 = false;

    @ObfuscatedName("jg.av")
    public class205 field3601;

    @ObfuscatedName("bh.a(Liz;Liz;B)V")
    public static void method1173(class255 arg0, class255 arg1) {
        Statics.field2472 = arg0;
        Statics.field3599 = arg1;
    }

    @ObfuscatedName("fh.s(II)Ljg;")
    public static class278 method3363(int arg0) {
        class278 var1 = (class278) field3589.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2472.method4422(9, arg0);
        class278 var3 = new class278();
        var3.field3569 = arg0;
        if (var2 != null) {
            var3.method4955(new class190(var2));
        }
        var3.method4953();
        field3589.method3878(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.g(I)V")
    public void method4953() {
    }

    @ObfuscatedName("jg.x(Lgx;B)V")
    public void method4955(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4965(arg0, var2);
        }
    }

    @ObfuscatedName("jg.h(Lgx;IB)V")
    public void method4965(class190 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3443();
            this.field3595 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3595[var4] = arg0.method3610();
            }
        } else if (arg1 == 2) {
            this.field3573 = arg0.method3647();
        } else if (arg1 == 12) {
            this.field3571 = arg0.method3443();
        } else if (arg1 == 13) {
            this.field3602 = arg0.method3610();
        } else if (arg1 == 14) {
            this.field3577 = arg0.method3610();
        } else if (arg1 == 15) {
            this.field3579 = arg0.method3610();
        } else if (arg1 == 16) {
            this.field3576 = arg0.method3610();
        } else if (arg1 == 17) {
            this.field3577 = arg0.method3610();
            this.field3578 = arg0.method3610();
            this.field3575 = arg0.method3610();
            this.field3580 = arg0.method3610();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3585[arg1 - 30] = arg0.method3647();
            if (this.field3585[arg1 - 30].equalsIgnoreCase(class246.field2880)) {
                this.field3585[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3443();
            this.field3581 = new short[var5];
            this.field3582 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3581[var6] = (short) arg0.method3610();
                this.field3582[var6] = (short) arg0.method3610();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3443();
            this.field3583 = new short[var7];
            this.field3598 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3583[var8] = (short) arg0.method3610();
                this.field3598[var8] = (short) arg0.method3610();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3443();
            this.field3567 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3567[var10] = arg0.method3610();
            }
        } else if (arg1 == 93) {
            this.field3572 = false;
        } else if (arg1 == 95) {
            this.field3587 = arg0.method3610();
        } else if (arg1 == 97) {
            this.field3588 = arg0.method3610();
        } else if (arg1 == 98) {
            this.field3591 = arg0.method3610();
        } else if (arg1 == 99) {
            this.field3590 = true;
        } else if (arg1 == 100) {
            this.field3570 = arg0.method3599();
        } else if (arg1 == 101) {
            this.field3592 = arg0.method3599() * 5;
        } else if (arg1 == 102) {
            this.field3593 = arg0.method3610();
        } else if (arg1 == 103) {
            this.field3594 = arg0.method3610();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3596 = arg0.method3610();
            if (this.field3596 == 65535) {
                this.field3596 = -1;
            }
            this.field3597 = arg0.method3610();
            if (this.field3597 == 65535) {
                this.field3597 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3610();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3443();
            this.field3574 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3574[var13] = arg0.method3610();
                if (this.field3574[var13] == 65535) {
                    this.field3574[var13] = -1;
                }
            }
            this.field3574[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3584 = false;
        } else if (arg1 == 109) {
            this.field3566 = false;
        } else if (arg1 == 111) {
            this.field3600 = true;
        } else if (arg1 == 249) {
            this.field3601 = class269.method5420(arg0, this.field3601);
        }
    }

    @ObfuscatedName("jg.f(Lju;ILju;II)Ldv;")
    public final class127 method4988(class280 arg0, int arg1, class280 arg2, int arg3) {
        if (this.field3574 != null) {
            class278 var5 = this.method4959();
            return var5 == null ? null : var5.method4988(arg0, arg1, arg2, arg3);
        }
        class127 var6 = (class127) field3568.method3885((long) this.field3569);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3595.length; var8++) {
                if (!Statics.field3599.method4424(this.field3595[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class121[] var9 = new class121[this.field3595.length];
            for (int var10 = 0; var10 < this.field3595.length; var10++) {
                var9[var10] = class121.method2585(Statics.field3599, this.field3595[var10], 0);
            }
            class121 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class121(var9, var9.length);
            }
            if (this.field3581 != null) {
                for (int var12 = 0; var12 < this.field3581.length; var12++) {
                    var11.method2607(this.field3581[var12], this.field3582[var12]);
                }
            }
            if (this.field3583 != null) {
                for (int var13 = 0; var13 < this.field3583.length; var13++) {
                    var11.method2656(this.field3583[var13], this.field3598[var13]);
                }
            }
            var6 = var11.method2658(this.field3570 + 64, this.field3592 + 850, -30, -50, -30);
            field3568.method3878(var6, (long) this.field3569);
        }
        class127 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method5029(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method5013(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2678(true);
        } else {
            var14 = arg2.method5013(var6, arg3);
        }
        if (this.field3588 != 128 || this.field3591 != 128) {
            var14.method2693(this.field3588, this.field3591, this.field3588);
        }
        return var14;
    }

    @ObfuscatedName("jg.p(I)Ldk;")
    public final class121 method4968() {
        if (this.field3574 != null) {
            class278 var1 = this.method4959();
            return var1 == null ? null : var1.method4968();
        } else if (this.field3567 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3567.length; var3++) {
                if (!Statics.field3599.method4424(this.field3567[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class121[] var4 = new class121[this.field3567.length];
            for (int var5 = 0; var5 < this.field3567.length; var5++) {
                var4[var5] = class121.method2585(Statics.field3599, this.field3567[var5], 0);
            }
            class121 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class121(var4, var4.length);
            }
            if (this.field3581 != null) {
                for (int var7 = 0; var7 < this.field3581.length; var7++) {
                    var6.method2607(this.field3581[var7], this.field3582[var7]);
                }
            }
            if (this.field3583 != null) {
                for (int var8 = 0; var8 < this.field3583.length; var8++) {
                    var6.method2656(this.field3583[var8], this.field3598[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jg.m(B)Ljg;")
    public final class278 method4959() {
        int var1 = -1;
        if (this.field3596 != -1) {
            var1 = class234.method1611(this.field3596);
        } else if (this.field3597 != -1) {
            var1 = class234.field2648[this.field3597];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3574.length - 1) {
            var2 = this.field3574[var1];
        } else {
            var2 = this.field3574[this.field3574.length - 1];
        }
        return var2 == -1 ? null : method3363(var2);
    }

    @ObfuscatedName("jg.q(B)Z")
    public boolean method4960() {
        if (this.field3574 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3596 != -1) {
            var1 = class234.method1611(this.field3596);
        } else if (this.field3597 != -1) {
            var1 = class234.field2648[this.field3597];
        }
        if (var1 >= 0 && var1 < this.field3574.length) {
            return this.field3574[var1] != -1;
        } else {
            return this.field3574[this.field3574.length - 1] != -1;
        }
    }

    @ObfuscatedName("jg.b(III)I")
    public int method4961(int arg0, int arg1) {
        class205 var3 = this.field3601;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class219 var5 = (class219) var3.method3851((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2527;
            }
        }
        return var4;
    }

    @ObfuscatedName("jg.n(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4962(int arg0, String arg1) {
        class205 var3 = this.field3601;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class203 var5 = (class203) var3.method3851((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2483;
            }
        }
        return var4;
    }

    @ObfuscatedName("ai.e(I)V")
    public static void method660() {
        field3589.method3879();
        field3568.method3879();
    }
}
