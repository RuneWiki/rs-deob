package deob;

@ObfuscatedName("jk")
public class class262 extends class198 {

    @ObfuscatedName("jk.x")
    public static class193 field3575 = new class193(64);

    @ObfuscatedName("jk.k")
    public static class193 field3567 = new class193(50);

    @ObfuscatedName("jk.f")
    public int field3568;

    @ObfuscatedName("jk.i")
    public String field3594 = "null";

    @ObfuscatedName("jk.j")
    public int field3570 = 1;

    @ObfuscatedName("jk.m")
    public int[] field3602;

    @ObfuscatedName("jk.u")
    public int[] field3572;

    @ObfuscatedName("jk.r")
    public int field3573 = -1;

    @ObfuscatedName("jk.v")
    public int field3574 = -1;

    @ObfuscatedName("jk.h")
    public int field3600 = -1;

    @ObfuscatedName("jk.a")
    public int field3576 = -1;

    @ObfuscatedName("jk.p")
    public int field3577 = -1;

    @ObfuscatedName("jk.q")
    public int field3578 = -1;

    @ObfuscatedName("jk.l")
    public int field3579 = -1;

    @ObfuscatedName("jk.c")
    public short[] field3580;

    @ObfuscatedName("jk.n")
    public short[] field3587;

    @ObfuscatedName("jk.z")
    public short[] field3582;

    @ObfuscatedName("jk.e")
    public short[] field3583;

    @ObfuscatedName("jk.g")
    public String[] field3584 = new String[5];

    @ObfuscatedName("jk.d")
    public boolean field3585 = true;

    @ObfuscatedName("jk.y")
    public int field3569 = -1;

    @ObfuscatedName("jk.t")
    public int field3590 = 128;

    @ObfuscatedName("jk.b")
    public int field3586 = 128;

    @ObfuscatedName("jk.s")
    public boolean field3565 = false;

    @ObfuscatedName("jk.ap")
    public int field3599 = 0;

    @ObfuscatedName("jk.ac")
    public int field3591 = 0;

    @ObfuscatedName("jk.af")
    public int field3592 = -1;

    @ObfuscatedName("jk.ai")
    public int field3571 = 32;

    @ObfuscatedName("jk.ad")
    public int[] field3588;

    @ObfuscatedName("jk.ar")
    public int field3595 = -1;

    @ObfuscatedName("jk.aq")
    public int field3596 = -1;

    @ObfuscatedName("jk.ag")
    public boolean field3597 = true;

    @ObfuscatedName("jk.ak")
    public boolean field3598 = true;

    @ObfuscatedName("jk.ae")
    public boolean field3589 = false;

    @ObfuscatedName("jk.am")
    public class190 field3564;

    @ObfuscatedName("bw.w(II)Ljk;")
    public static class262 method1007(int arg0) {
        class262 var1 = (class262) field3575.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3566.method3754(9, arg0);
        class262 var3 = new class262();
        var3.field3568 = arg0;
        if (var2 != null) {
            var3.method4279(new class177(var2));
        }
        var3.method4303();
        field3575.method3241(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jk.o(I)V")
    public void method4303() {
    }

    @ObfuscatedName("jk.x(Lfi;I)V")
    public void method4279(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method4306(arg0, var2);
        }
    }

    @ObfuscatedName("jk.k(Lfi;IS)V")
    public void method4306(class177 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2931();
            this.field3602 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3602[var4] = arg0.method2886();
            }
        } else if (arg1 == 2) {
            this.field3594 = arg0.method2892();
        } else if (arg1 == 12) {
            this.field3570 = arg0.method2931();
        } else if (arg1 == 13) {
            this.field3573 = arg0.method2886();
        } else if (arg1 == 14) {
            this.field3576 = arg0.method2886();
        } else if (arg1 == 15) {
            this.field3574 = arg0.method2886();
        } else if (arg1 == 16) {
            this.field3600 = arg0.method2886();
        } else if (arg1 == 17) {
            this.field3576 = arg0.method2886();
            this.field3577 = arg0.method2886();
            this.field3578 = arg0.method2886();
            this.field3579 = arg0.method2886();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3584[arg1 - 30] = arg0.method2892();
            if (this.field3584[arg1 - 30].equalsIgnoreCase(class229.field2858)) {
                this.field3584[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2931();
            this.field3580 = new short[var5];
            this.field3587 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3580[var6] = (short) arg0.method2886();
                this.field3587[var6] = (short) arg0.method2886();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2931();
            this.field3582 = new short[var7];
            this.field3583 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3582[var8] = (short) arg0.method2886();
                this.field3583[var8] = (short) arg0.method2886();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2931();
            this.field3572 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3572[var10] = arg0.method2886();
            }
        } else if (arg1 == 93) {
            this.field3585 = false;
        } else if (arg1 == 95) {
            this.field3569 = arg0.method2886();
        } else if (arg1 == 97) {
            this.field3590 = arg0.method2886();
        } else if (arg1 == 98) {
            this.field3586 = arg0.method2886();
        } else if (arg1 == 99) {
            this.field3565 = true;
        } else if (arg1 == 100) {
            this.field3599 = arg0.method2885();
        } else if (arg1 == 101) {
            this.field3591 = arg0.method2885() * 5;
        } else if (arg1 == 102) {
            this.field3592 = arg0.method2886();
        } else if (arg1 == 103) {
            this.field3571 = arg0.method2886();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3595 = arg0.method2886();
            if (this.field3595 == 65535) {
                this.field3595 = -1;
            }
            this.field3596 = arg0.method2886();
            if (this.field3596 == 65535) {
                this.field3596 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2886();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2931();
            this.field3588 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3588[var13] = arg0.method2886();
                if (this.field3588[var13] == 65535) {
                    this.field3588[var13] = -1;
                }
            }
            this.field3588[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3597 = false;
        } else if (arg1 == 109) {
            this.field3598 = false;
        } else if (arg1 == 111) {
            this.field3589 = true;
        } else if (arg1 == 249) {
            this.field3564 = class253.method2807(arg0, this.field3564);
        }
    }

    @ObfuscatedName("jk.f(Ljz;ILjz;II)Lev;")
    public final class134 method4275(class264 arg0, int arg1, class264 arg2, int arg3) {
        if (this.field3588 != null) {
            class262 var5 = this.method4281();
            return var5 == null ? null : var5.method4275(arg0, arg1, arg2, arg3);
        }
        class134 var6 = (class134) field3567.method3239((long) this.field3568);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3602.length; var8++) {
                if (!Statics.field3593.method3801(this.field3602[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class128[] var9 = new class128[this.field3602.length];
            for (int var10 = 0; var10 < this.field3602.length; var10++) {
                var9[var10] = class128.method2163(Statics.field3593, this.field3602[var10], 0);
            }
            class128 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class128(var9, var9.length);
            }
            if (this.field3580 != null) {
                for (int var12 = 0; var12 < this.field3580.length; var12++) {
                    var11.method2177(this.field3580[var12], this.field3587[var12]);
                }
            }
            if (this.field3582 != null) {
                for (int var13 = 0; var13 < this.field3582.length; var13++) {
                    var11.method2178(this.field3582[var13], this.field3583[var13]);
                }
            }
            var6 = var11.method2185(this.field3599 + 64, this.field3591 + 850, -30, -50, -30);
            field3567.method3241(var6, (long) this.field3568);
        }
        class134 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4347(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4375(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2295(true);
        } else {
            var14 = arg2.method4375(var6, arg3);
        }
        if (this.field3590 != 128 || this.field3586 != 128) {
            var14.method2266(this.field3590, this.field3586, this.field3590);
        }
        return var14;
    }

    @ObfuscatedName("jk.i(I)Ldb;")
    public final class128 method4280() {
        if (this.field3588 != null) {
            class262 var1 = this.method4281();
            return var1 == null ? null : var1.method4280();
        } else if (this.field3572 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3572.length; var3++) {
                if (!Statics.field3593.method3801(this.field3572[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class128[] var4 = new class128[this.field3572.length];
            for (int var5 = 0; var5 < this.field3572.length; var5++) {
                var4[var5] = class128.method2163(Statics.field3593, this.field3572[var5], 0);
            }
            class128 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class128(var4, var4.length);
            }
            if (this.field3580 != null) {
                for (int var7 = 0; var7 < this.field3580.length; var7++) {
                    var6.method2177(this.field3580[var7], this.field3587[var7]);
                }
            }
            if (this.field3582 != null) {
                for (int var8 = 0; var8 < this.field3582.length; var8++) {
                    var6.method2178(this.field3582[var8], this.field3583[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jk.j(B)Ljk;")
    public final class262 method4281() {
        int var1 = -1;
        if (this.field3595 != -1) {
            var1 = class215.method2867(this.field3595);
        } else if (this.field3596 != -1) {
            var1 = class215.field2616[this.field3596];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3588.length - 1) {
            var2 = this.field3588[var1];
        } else {
            var2 = this.field3588[this.field3588.length - 1];
        }
        return var2 == -1 ? null : method1007(var2);
    }

    @ObfuscatedName("jk.m(I)Z")
    public boolean method4282() {
        if (this.field3588 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3595 != -1) {
            var1 = class215.method2867(this.field3595);
        } else if (this.field3596 != -1) {
            var1 = class215.field2616[this.field3596];
        }
        if (var1 >= 0 && var1 < this.field3588.length) {
            return this.field3588[var1] != -1;
        } else {
            return this.field3588[this.field3588.length - 1] != -1;
        }
    }

    @ObfuscatedName("jk.u(III)I")
    public int method4310(int arg0, int arg1) {
        return class253.method2161(this.field3564, arg0, arg1);
    }

    @ObfuscatedName("jk.h(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4284(int arg0, String arg1) {
        return class253.method4380(this.field3564, arg0, arg1);
    }
}
