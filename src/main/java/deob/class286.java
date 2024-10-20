package deob;

@ObfuscatedName("je")
public class class286 extends class219 {

    @ObfuscatedName("je.b")
    public static class213 field3709 = new class213(64);

    @ObfuscatedName("je.z")
    public static class213 field3711 = new class213(50);

    @ObfuscatedName("je.n")
    public int field3737;

    @ObfuscatedName("je.l")
    public String field3716 = class252.field3028;

    @ObfuscatedName("je.s")
    public int field3727 = 1;

    @ObfuscatedName("je.y")
    public int[] field3724;

    @ObfuscatedName("je.c")
    public int[] field3713;

    @ObfuscatedName("je.h")
    public int field3733 = -1;

    @ObfuscatedName("je.i")
    public int field3714 = -1;

    @ObfuscatedName("je.o")
    public int field3718 = -1;

    @ObfuscatedName("je.d")
    public int field3719 = -1;

    @ObfuscatedName("je.r")
    public int field3720 = -1;

    @ObfuscatedName("je.p")
    public int field3721 = -1;

    @ObfuscatedName("je.q")
    public int field3712 = -1;

    @ObfuscatedName("je.f")
    public short[] field3710;

    @ObfuscatedName("je.j")
    public short[] field3722;

    @ObfuscatedName("je.v")
    public short[] field3725;

    @ObfuscatedName("je.u")
    public short[] field3736;

    @ObfuscatedName("je.k")
    public String[] field3715 = new String[5];

    @ObfuscatedName("je.w")
    public boolean field3728 = true;

    @ObfuscatedName("je.m")
    public int field3729 = -1;

    @ObfuscatedName("je.a")
    public int field3730 = 128;

    @ObfuscatedName("je.x")
    public int field3731 = 128;

    @ObfuscatedName("je.t")
    public boolean field3732 = false;

    @ObfuscatedName("je.ax")
    public int field3708 = 0;

    @ObfuscatedName("je.ai")
    public int field3734 = 0;

    @ObfuscatedName("je.aj")
    public int field3735 = -1;

    @ObfuscatedName("je.ac")
    public int field3726 = 32;

    @ObfuscatedName("je.ag")
    public int[] field3723;

    @ObfuscatedName("je.ay")
    public int field3738 = -1;

    @ObfuscatedName("je.as")
    public int field3739 = -1;

    @ObfuscatedName("je.av")
    public boolean field3740 = true;

    @ObfuscatedName("je.ao")
    public boolean field3741 = true;

    @ObfuscatedName("je.ak")
    public boolean field3742 = false;

    @ObfuscatedName("je.ad")
    public class210 field3743;

    @ObfuscatedName("je.e(I)V")
    public void method4795() {
    }

    @ObfuscatedName("je.b(Lgg;B)V")
    public void method4796(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4799(arg0, var2);
        }
    }

    @ObfuscatedName("je.z(Lgg;II)V")
    public void method4799(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3332();
            this.field3724 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3724[var4] = arg0.method3310();
            }
        } else if (arg1 == 2) {
            this.field3716 = arg0.method3429();
        } else if (arg1 == 12) {
            this.field3727 = arg0.method3332();
        } else if (arg1 == 13) {
            this.field3733 = arg0.method3310();
        } else if (arg1 == 14) {
            this.field3719 = arg0.method3310();
        } else if (arg1 == 15) {
            this.field3714 = arg0.method3310();
        } else if (arg1 == 16) {
            this.field3718 = arg0.method3310();
        } else if (arg1 == 17) {
            this.field3719 = arg0.method3310();
            this.field3720 = arg0.method3310();
            this.field3721 = arg0.method3310();
            this.field3712 = arg0.method3310();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3715[arg1 - 30] = arg0.method3429();
            if (this.field3715[arg1 - 30].equalsIgnoreCase(class252.field3280)) {
                this.field3715[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3332();
            this.field3710 = new short[var5];
            this.field3722 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3710[var6] = (short) arg0.method3310();
                this.field3722[var6] = (short) arg0.method3310();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3332();
            this.field3725 = new short[var7];
            this.field3736 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3725[var8] = (short) arg0.method3310();
                this.field3736[var8] = (short) arg0.method3310();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3332();
            this.field3713 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3713[var10] = arg0.method3310();
            }
        } else if (arg1 == 93) {
            this.field3728 = false;
        } else if (arg1 == 95) {
            this.field3729 = arg0.method3310();
        } else if (arg1 == 97) {
            this.field3730 = arg0.method3310();
        } else if (arg1 == 98) {
            this.field3731 = arg0.method3310();
        } else if (arg1 == 99) {
            this.field3732 = true;
        } else if (arg1 == 100) {
            this.field3708 = arg0.method3309();
        } else if (arg1 == 101) {
            this.field3734 = arg0.method3309();
        } else if (arg1 == 102) {
            this.field3735 = arg0.method3310();
        } else if (arg1 == 103) {
            this.field3726 = arg0.method3310();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3738 = arg0.method3310();
            if (this.field3738 == 65535) {
                this.field3738 = -1;
            }
            this.field3739 = arg0.method3310();
            if (this.field3739 == 65535) {
                this.field3739 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3310();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3332();
            this.field3723 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3723[var13] = arg0.method3310();
                if (this.field3723[var13] == 65535) {
                    this.field3723[var13] = -1;
                }
            }
            this.field3723[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3740 = false;
        } else if (arg1 == 109) {
            this.field3741 = false;
        } else if (arg1 == 111) {
            this.field3742 = true;
        } else if (arg1 == 249) {
            this.field3743 = class277.method3031(arg0, this.field3743);
        }
    }

    @ObfuscatedName("je.n(Lkc;ILkc;II)Lee;")
    public final class132 method4797(class288 arg0, int arg1, class288 arg2, int arg3) {
        if (this.field3723 != null) {
            class286 var5 = this.method4806();
            return var5 == null ? null : var5.method4797(arg0, arg1, arg2, arg3);
        }
        class132 var6 = (class132) field3711.method3706((long) this.field3737);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3724.length; var8++) {
                if (!Statics.field3717.method4269(this.field3724[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class126[] var9 = new class126[this.field3724.length];
            for (int var10 = 0; var10 < this.field3724.length; var10++) {
                var9[var10] = class126.method2485(Statics.field3717, this.field3724[var10], 0);
            }
            class126 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class126(var9, var9.length);
            }
            if (this.field3710 != null) {
                for (int var12 = 0; var12 < this.field3710.length; var12++) {
                    var11.method2534(this.field3710[var12], this.field3722[var12]);
                }
            }
            if (this.field3725 != null) {
                for (int var13 = 0; var13 < this.field3725.length; var13++) {
                    var11.method2498(this.field3725[var13], this.field3736[var13]);
                }
            }
            var6 = var11.method2505(this.field3708 + 64, this.field3734 * 5 + 850, -30, -50, -30);
            field3711.method3712(var6, (long) this.field3737);
        }
        class132 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4847(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4844(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2577(true);
        } else {
            var14 = arg2.method4844(var6, arg3);
        }
        if (this.field3730 != 128 || this.field3731 != 128) {
            var14.method2592(this.field3730, this.field3731, this.field3730);
        }
        return var14;
    }

    @ObfuscatedName("je.l(I)Ldi;")
    public final class126 method4804() {
        if (this.field3723 != null) {
            class286 var1 = this.method4806();
            return var1 == null ? null : var1.method4804();
        } else if (this.field3713 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3713.length; var3++) {
                if (!Statics.field3717.method4269(this.field3713[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class126[] var4 = new class126[this.field3713.length];
            for (int var5 = 0; var5 < this.field3713.length; var5++) {
                var4[var5] = class126.method2485(Statics.field3717, this.field3713[var5], 0);
            }
            class126 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class126(var4, var4.length);
            }
            if (this.field3710 != null) {
                for (int var7 = 0; var7 < this.field3710.length; var7++) {
                    var6.method2534(this.field3710[var7], this.field3722[var7]);
                }
            }
            if (this.field3725 != null) {
                for (int var8 = 0; var8 < this.field3725.length; var8++) {
                    var6.method2498(this.field3725[var8], this.field3736[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("je.s(I)Lje;")
    public final class286 method4806() {
        int var1 = -1;
        if (this.field3738 != -1) {
            var1 = class238.method4502(this.field3738);
        } else if (this.field3739 != -1) {
            var1 = class238.field2788[this.field3739];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3723.length - 1) {
            var2 = this.field3723[var1];
        } else {
            var2 = this.field3723[this.field3723.length - 1];
        }
        return var2 == -1 ? null : Statics.method2738(var2);
    }

    @ObfuscatedName("je.y(B)Z")
    public boolean method4800() {
        if (this.field3723 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3738 != -1) {
            var1 = class238.method4502(this.field3738);
        } else if (this.field3739 != -1) {
            var1 = class238.field2788[this.field3739];
        }
        if (var1 >= 0 && var1 < this.field3723.length) {
            return this.field3723[var1] != -1;
        } else {
            return this.field3723[this.field3723.length - 1] != -1;
        }
    }

    @ObfuscatedName("je.c(III)I")
    public int method4801(int arg0, int arg1) {
        return class277.method2026(this.field3743, arg0, arg1);
    }

    @ObfuscatedName("je.o(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4802(int arg0, String arg1) {
        return class277.method3127(this.field3743, arg0, arg1);
    }

    @ObfuscatedName("a.d(I)V")
    public static void method171() {
        field3709.method3709();
        field3711.method3709();
    }
}
