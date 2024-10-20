package deob;

@ObfuscatedName("jr")
public class class286 extends class219 {

    @ObfuscatedName("jr.t")
    public static class213 field3706 = new class213(64);

    @ObfuscatedName("jr.d")
    public static class213 field3732 = new class213(50);

    @ObfuscatedName("jr.h")
    public int field3708;

    @ObfuscatedName("jr.m")
    public String field3709 = class252.field3032;

    @ObfuscatedName("jr.z")
    public int field3721 = 1;

    @ObfuscatedName("jr.i")
    public int[] field3711;

    @ObfuscatedName("jr.u")
    public int[] field3712;

    @ObfuscatedName("jr.x")
    public int field3713 = -1;

    @ObfuscatedName("jr.y")
    public int field3717 = -1;

    @ObfuscatedName("jr.a")
    public int field3715 = -1;

    @ObfuscatedName("jr.w")
    public int field3733 = -1;

    @ObfuscatedName("jr.n")
    public int field3737 = -1;

    @ObfuscatedName("jr.l")
    public int field3718 = -1;

    @ObfuscatedName("jr.s")
    public int field3707 = -1;

    @ObfuscatedName("jr.v")
    public short[] field3720;

    @ObfuscatedName("jr.q")
    public short[] field3719;

    @ObfuscatedName("jr.r")
    public short[] field3722;

    @ObfuscatedName("jr.j")
    public short[] field3741;

    @ObfuscatedName("jr.b")
    public String[] field3724 = new String[5];

    @ObfuscatedName("jr.g")
    public boolean field3710 = true;

    @ObfuscatedName("jr.f")
    public int field3726 = -1;

    @ObfuscatedName("jr.p")
    public int field3727 = 128;

    @ObfuscatedName("jr.e")
    public int field3728 = 128;

    @ObfuscatedName("jr.c")
    public boolean field3729 = false;

    @ObfuscatedName("jr.ab")
    public int field3730 = 0;

    @ObfuscatedName("jr.ap")
    public int field3731 = 0;

    @ObfuscatedName("jr.ag")
    public int field3716 = -1;

    @ObfuscatedName("jr.at")
    public int field3734 = 32;

    @ObfuscatedName("jr.ac")
    public int[] field3723;

    @ObfuscatedName("jr.al")
    public int field3714 = -1;

    @ObfuscatedName("jr.ah")
    public int field3740 = -1;

    @ObfuscatedName("jr.af")
    public boolean field3725 = true;

    @ObfuscatedName("jr.aq")
    public boolean field3738 = true;

    @ObfuscatedName("jr.ai")
    public boolean field3739 = false;

    @ObfuscatedName("jr.az")
    public class210 field3736;

    @ObfuscatedName("iw.o(II)Ljr;")
    public static class286 method3973(int arg0) {
        class286 var1 = (class286) field3706.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3735.method4241(9, arg0);
        class286 var3 = new class286();
        var3.field3708 = arg0;
        if (var2 != null) {
            var3.method4731(new class195(var2));
        }
        var3.method4730();
        field3706.method3603(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jr.k(I)V")
    public void method4730() {
    }

    @ObfuscatedName("jr.t(Lgc;I)V")
    public void method4731(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4757(arg0, var2);
        }
    }

    @ObfuscatedName("jr.d(Lgc;II)V")
    public void method4757(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3205();
            this.field3711 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3711[var4] = arg0.method3207();
            }
        } else if (arg1 == 2) {
            this.field3709 = arg0.method3284();
        } else if (arg1 == 12) {
            this.field3721 = arg0.method3205();
        } else if (arg1 == 13) {
            this.field3713 = arg0.method3207();
        } else if (arg1 == 14) {
            this.field3733 = arg0.method3207();
        } else if (arg1 == 15) {
            this.field3717 = arg0.method3207();
        } else if (arg1 == 16) {
            this.field3715 = arg0.method3207();
        } else if (arg1 == 17) {
            this.field3733 = arg0.method3207();
            this.field3737 = arg0.method3207();
            this.field3718 = arg0.method3207();
            this.field3707 = arg0.method3207();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3724[arg1 - 30] = arg0.method3284();
            if (this.field3724[arg1 - 30].equalsIgnoreCase(class252.field3027)) {
                this.field3724[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3205();
            this.field3720 = new short[var5];
            this.field3719 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3720[var6] = (short) arg0.method3207();
                this.field3719[var6] = (short) arg0.method3207();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3205();
            this.field3722 = new short[var7];
            this.field3741 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3722[var8] = (short) arg0.method3207();
                this.field3741[var8] = (short) arg0.method3207();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3205();
            this.field3712 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3712[var10] = arg0.method3207();
            }
        } else if (arg1 == 93) {
            this.field3710 = false;
        } else if (arg1 == 95) {
            this.field3726 = arg0.method3207();
        } else if (arg1 == 97) {
            this.field3727 = arg0.method3207();
        } else if (arg1 == 98) {
            this.field3728 = arg0.method3207();
        } else if (arg1 == 99) {
            this.field3729 = true;
        } else if (arg1 == 100) {
            this.field3730 = arg0.method3210();
        } else if (arg1 == 101) {
            this.field3731 = arg0.method3210() * 5;
        } else if (arg1 == 102) {
            this.field3716 = arg0.method3207();
        } else if (arg1 == 103) {
            this.field3734 = arg0.method3207();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3714 = arg0.method3207();
            if (this.field3714 == 65535) {
                this.field3714 = -1;
            }
            this.field3740 = arg0.method3207();
            if (this.field3740 == 65535) {
                this.field3740 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3207();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3205();
            this.field3723 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3723[var13] = arg0.method3207();
                if (this.field3723[var13] == 65535) {
                    this.field3723[var13] = -1;
                }
            }
            this.field3723[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3725 = false;
        } else if (arg1 == 109) {
            this.field3738 = false;
        } else if (arg1 == 111) {
            this.field3739 = true;
        } else if (arg1 == 249) {
            this.field3736 = class277.method241(arg0, this.field3736);
        }
    }

    @ObfuscatedName("jr.h(Lke;ILke;IB)Lei;")
    public final class132 method4732(class288 arg0, int arg1, class288 arg2, int arg3) {
        if (this.field3723 != null) {
            class286 var5 = this.method4755();
            return var5 == null ? null : var5.method4732(arg0, arg1, arg2, arg3);
        }
        class132 var6 = (class132) field3732.method3601((long) this.field3708);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3711.length; var8++) {
                if (!Statics.field3705.method4159(this.field3711[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class126[] var9 = new class126[this.field3711.length];
            for (int var10 = 0; var10 < this.field3711.length; var10++) {
                var9[var10] = class126.method2418(Statics.field3705, this.field3711[var10], 0);
            }
            class126 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class126(var9, var9.length);
            }
            if (this.field3720 != null) {
                for (int var12 = 0; var12 < this.field3720.length; var12++) {
                    var11.method2385(this.field3720[var12], this.field3719[var12]);
                }
            }
            if (this.field3722 != null) {
                for (int var13 = 0; var13 < this.field3722.length; var13++) {
                    var11.method2386(this.field3722[var13], this.field3741[var13]);
                }
            }
            var6 = var11.method2393(this.field3730 + 64, this.field3731 + 850, -30, -50, -30);
            field3732.method3603(var6, (long) this.field3708);
        }
        class132 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4809(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4786(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2505(true);
        } else {
            var14 = arg2.method4786(var6, arg3);
        }
        if (this.field3727 != 128 || this.field3728 != 128) {
            var14.method2476(this.field3727, this.field3728, this.field3727);
        }
        return var14;
    }

    @ObfuscatedName("jr.m(B)Ldg;")
    public final class126 method4760() {
        if (this.field3723 != null) {
            class286 var1 = this.method4755();
            return var1 == null ? null : var1.method4760();
        } else if (this.field3712 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3712.length; var3++) {
                if (!Statics.field3705.method4159(this.field3712[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class126[] var4 = new class126[this.field3712.length];
            for (int var5 = 0; var5 < this.field3712.length; var5++) {
                var4[var5] = class126.method2418(Statics.field3705, this.field3712[var5], 0);
            }
            class126 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class126(var4, var4.length);
            }
            if (this.field3720 != null) {
                for (int var7 = 0; var7 < this.field3720.length; var7++) {
                    var6.method2385(this.field3720[var7], this.field3719[var7]);
                }
            }
            if (this.field3722 != null) {
                for (int var8 = 0; var8 < this.field3722.length; var8++) {
                    var6.method2386(this.field3722[var8], this.field3741[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jr.z(B)Ljr;")
    public final class286 method4755() {
        int var1 = -1;
        if (this.field3714 != -1) {
            var1 = class238.method1854(this.field3714);
        } else if (this.field3740 != -1) {
            var1 = class238.field2779[this.field3740];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3723.length - 1) {
            var2 = this.field3723[var1];
        } else {
            var2 = this.field3723[this.field3723.length - 1];
        }
        return var2 == -1 ? null : method3973(var2);
    }

    @ObfuscatedName("jr.i(I)Z")
    public boolean method4735() {
        if (this.field3723 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3714 != -1) {
            var1 = class238.method1854(this.field3714);
        } else if (this.field3740 != -1) {
            var1 = class238.field2779[this.field3740];
        }
        if (var1 >= 0 && var1 < this.field3723.length) {
            return this.field3723[var1] != -1;
        } else {
            return this.field3723[this.field3723.length - 1] != -1;
        }
    }

    @ObfuscatedName("jr.u(IIB)I")
    public int method4736(int arg0, int arg1) {
        class210 var3 = this.field3736;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class224 var5 = (class224) var3.method3575((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2669;
            }
        }
        return var4;
    }

    @ObfuscatedName("jr.x(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4737(int arg0, String arg1) {
        return class277.method271(this.field3736, arg0, arg1);
    }

    @ObfuscatedName("il.y(B)V")
    public static void method4134() {
        field3706.method3604();
        field3732.method3604();
    }
}
