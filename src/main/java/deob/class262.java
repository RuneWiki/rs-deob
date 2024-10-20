package deob;

@ObfuscatedName("ji")
public class class262 extends class198 {

    @ObfuscatedName("ji.f")
    public static class193 field3567 = new class193(64);

    @ObfuscatedName("ji.m")
    public static class193 field3593 = new class193(50);

    @ObfuscatedName("ji.h")
    public int field3568;

    @ObfuscatedName("ji.t")
    public String field3569 = "null";

    @ObfuscatedName("ji.p")
    public int field3581 = 1;

    @ObfuscatedName("ji.d")
    public int[] field3571;

    @ObfuscatedName("ji.n")
    public int[] field3564;

    @ObfuscatedName("ji.z")
    public int field3573 = -1;

    @ObfuscatedName("ji.o")
    public int field3587 = -1;

    @ObfuscatedName("ji.q")
    public int field3585 = -1;

    @ObfuscatedName("ji.u")
    public int field3576 = -1;

    @ObfuscatedName("ji.k")
    public int field3577 = -1;

    @ObfuscatedName("ji.e")
    public int field3578 = -1;

    @ObfuscatedName("ji.r")
    public int field3579 = -1;

    @ObfuscatedName("ji.l")
    public short[] field3572;

    @ObfuscatedName("ji.y")
    public short[] field3574;

    @ObfuscatedName("ji.w")
    public short[] field3582;

    @ObfuscatedName("ji.i")
    public short[] field3583;

    @ObfuscatedName("ji.g")
    public String[] field3584 = new String[5];

    @ObfuscatedName("ji.a")
    public boolean field3592 = true;

    @ObfuscatedName("ji.x")
    public int field3586 = -1;

    @ObfuscatedName("ji.b")
    public int field3575 = 128;

    @ObfuscatedName("ji.j")
    public int field3590 = 128;

    @ObfuscatedName("ji.v")
    public boolean field3589 = false;

    @ObfuscatedName("ji.ap")
    public int field3591 = 0;

    @ObfuscatedName("ji.ar")
    public int field3570 = 0;

    @ObfuscatedName("ji.am")
    public int field3566 = -1;

    @ObfuscatedName("ji.ab")
    public int field3598 = 32;

    @ObfuscatedName("ji.af")
    public int[] field3588;

    @ObfuscatedName("ji.aa")
    public int field3595 = -1;

    @ObfuscatedName("ji.aq")
    public int field3596 = -1;

    @ObfuscatedName("ji.aj")
    public boolean field3597 = true;

    @ObfuscatedName("ji.as")
    public boolean field3594 = true;

    @ObfuscatedName("ji.av")
    public boolean field3599 = false;

    @ObfuscatedName("ji.ao")
    public class190 field3600;

    @ObfuscatedName("il.c(II)Lji;")
    public static class262 method4152(int arg0) {
        class262 var1 = (class262) field3567.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3580.method3840(9, arg0);
        class262 var3 = new class262();
        var3.field3568 = arg0;
        if (var2 != null) {
            var3.method4364(new class177(var2));
        }
        var3.method4374();
        field3567.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ji.f(I)V")
    public void method4374() {
    }

    @ObfuscatedName("ji.m(Lfs;I)V")
    public void method4364(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4366(arg0, var2);
        }
    }

    @ObfuscatedName("ji.h(Lfs;IB)V")
    public void method4366(class177 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2965();
            this.field3571 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3571[var4] = arg0.method2967();
            }
        } else if (arg1 == 2) {
            this.field3569 = arg0.method2973();
        } else if (arg1 == 12) {
            this.field3581 = arg0.method2965();
        } else if (arg1 == 13) {
            this.field3573 = arg0.method2967();
        } else if (arg1 == 14) {
            this.field3576 = arg0.method2967();
        } else if (arg1 == 15) {
            this.field3587 = arg0.method2967();
        } else if (arg1 == 16) {
            this.field3585 = arg0.method2967();
        } else if (arg1 == 17) {
            this.field3576 = arg0.method2967();
            this.field3577 = arg0.method2967();
            this.field3578 = arg0.method2967();
            this.field3579 = arg0.method2967();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3584[arg1 - 30] = arg0.method2973();
            if (this.field3584[arg1 - 30].equalsIgnoreCase(class229.field2874)) {
                this.field3584[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2965();
            this.field3572 = new short[var5];
            this.field3574 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3572[var6] = (short) arg0.method2967();
                this.field3574[var6] = (short) arg0.method2967();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2965();
            this.field3582 = new short[var7];
            this.field3583 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3582[var8] = (short) arg0.method2967();
                this.field3583[var8] = (short) arg0.method2967();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2965();
            this.field3564 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3564[var10] = arg0.method2967();
            }
        } else if (arg1 == 93) {
            this.field3592 = false;
        } else if (arg1 == 95) {
            this.field3586 = arg0.method2967();
        } else if (arg1 == 97) {
            this.field3575 = arg0.method2967();
        } else if (arg1 == 98) {
            this.field3590 = arg0.method2967();
        } else if (arg1 == 99) {
            this.field3589 = true;
        } else if (arg1 == 100) {
            this.field3591 = arg0.method2966();
        } else if (arg1 == 101) {
            this.field3570 = arg0.method2966() * 5;
        } else if (arg1 == 102) {
            this.field3566 = arg0.method2967();
        } else if (arg1 == 103) {
            this.field3598 = arg0.method2967();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3595 = arg0.method2967();
            if (this.field3595 == 65535) {
                this.field3595 = -1;
            }
            this.field3596 = arg0.method2967();
            if (this.field3596 == 65535) {
                this.field3596 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2967();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2965();
            this.field3588 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3588[var13] = arg0.method2967();
                if (this.field3588[var13] == 65535) {
                    this.field3588[var13] = -1;
                }
            }
            this.field3588[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3597 = false;
        } else if (arg1 == 109) {
            this.field3594 = false;
        } else if (arg1 == 111) {
            this.field3599 = true;
        } else if (arg1 == 249) {
            this.field3600 = class253.method3798(arg0, this.field3600);
        }
    }

    @ObfuscatedName("ji.t(Ljw;ILjw;IB)Leb;")
    public final class134 method4373(class264 arg0, int arg1, class264 arg2, int arg3) {
        if (this.field3588 != null) {
            class262 var5 = this.method4388();
            return var5 == null ? null : var5.method4373(arg0, arg1, arg2, arg3);
        }
        class134 var6 = (class134) field3593.method3319((long) this.field3568);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3571.length; var8++) {
                if (!Statics.field3565.method3842(this.field3571[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class128[] var9 = new class128[this.field3571.length];
            for (int var10 = 0; var10 < this.field3571.length; var10++) {
                var9[var10] = class128.method2239(Statics.field3565, this.field3571[var10], 0);
            }
            class128 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class128(var9, var9.length);
            }
            if (this.field3572 != null) {
                for (int var12 = 0; var12 < this.field3572.length; var12++) {
                    var11.method2249(this.field3572[var12], this.field3574[var12]);
                }
            }
            if (this.field3582 != null) {
                for (int var13 = 0; var13 < this.field3582.length; var13++) {
                    var11.method2250(this.field3582[var13], this.field3583[var13]);
                }
            }
            var6 = var11.method2257(this.field3591 + 64, this.field3570 + 850, -30, -50, -30);
            field3593.method3315(var6, (long) this.field3568);
        }
        class134 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4438(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4435(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2343(true);
        } else {
            var14 = arg2.method4435(var6, arg3);
        }
        if (this.field3575 != 128 || this.field3590 != 128) {
            var14.method2358(this.field3575, this.field3590, this.field3575);
        }
        return var14;
    }

    @ObfuscatedName("ji.p(I)Ldn;")
    public final class128 method4367() {
        if (this.field3588 != null) {
            class262 var1 = this.method4388();
            return var1 == null ? null : var1.method4367();
        } else if (this.field3564 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3564.length; var3++) {
                if (!Statics.field3565.method3842(this.field3564[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class128[] var4 = new class128[this.field3564.length];
            for (int var5 = 0; var5 < this.field3564.length; var5++) {
                var4[var5] = class128.method2239(Statics.field3565, this.field3564[var5], 0);
            }
            class128 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class128(var4, var4.length);
            }
            if (this.field3572 != null) {
                for (int var7 = 0; var7 < this.field3572.length; var7++) {
                    var6.method2249(this.field3572[var7], this.field3574[var7]);
                }
            }
            if (this.field3582 != null) {
                for (int var8 = 0; var8 < this.field3582.length; var8++) {
                    var6.method2250(this.field3582[var8], this.field3583[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ji.d(B)Lji;")
    public final class262 method4388() {
        int var1 = -1;
        if (this.field3595 != -1) {
            var1 = class215.method2427(this.field3595);
        } else if (this.field3596 != -1) {
            var1 = class215.field2623[this.field3596];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3588.length - 1) {
            var2 = this.field3588[var1];
        } else {
            var2 = this.field3588[this.field3588.length - 1];
        }
        return var2 == -1 ? null : method4152(var2);
    }

    @ObfuscatedName("ji.n(I)Z")
    public boolean method4368() {
        if (this.field3588 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3595 != -1) {
            var1 = class215.method2427(this.field3595);
        } else if (this.field3596 != -1) {
            var1 = class215.field2623[this.field3596];
        }
        if (var1 >= 0 && var1 < this.field3588.length) {
            return this.field3588[var1] != -1;
        } else {
            return this.field3588[this.field3588.length - 1] != -1;
        }
    }

    @ObfuscatedName("ji.z(III)I")
    public int method4385(int arg0, int arg1) {
        return class253.method163(this.field3600, arg0, arg1);
    }

    @ObfuscatedName("ji.o(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4393(int arg0, String arg1) {
        return class253.method471(this.field3600, arg0, arg1);
    }

    @ObfuscatedName("ab.u(B)V")
    public static void method243() {
        field3567.method3316();
        field3593.method3316();
    }
}
