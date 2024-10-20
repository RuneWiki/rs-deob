package deob;

@ObfuscatedName("jd")
public class class286 extends class219 {

    @ObfuscatedName("jd.i")
    public static class213 field3708 = new class213(64);

    @ObfuscatedName("jd.a")
    public static class213 field3709 = new class213(50);

    @ObfuscatedName("jd.l")
    public int field3710;

    @ObfuscatedName("jd.b")
    public String field3706 = class252.field3052;

    @ObfuscatedName("jd.e")
    public int field3711 = 1;

    @ObfuscatedName("jd.x")
    public int[] field3713;

    @ObfuscatedName("jd.p")
    public int[] field3740;

    @ObfuscatedName("jd.g")
    public int field3715 = -1;

    @ObfuscatedName("jd.n")
    public int field3716 = -1;

    @ObfuscatedName("jd.o")
    public int field3717 = -1;

    @ObfuscatedName("jd.c")
    public int field3718 = -1;

    @ObfuscatedName("jd.v")
    public int field3719 = -1;

    @ObfuscatedName("jd.u")
    public int field3720 = -1;

    @ObfuscatedName("jd.j")
    public int field3741 = -1;

    @ObfuscatedName("jd.k")
    public short[] field3722;

    @ObfuscatedName("jd.z")
    public short[] field3735;

    @ObfuscatedName("jd.w")
    public short[] field3724;

    @ObfuscatedName("jd.s")
    public short[] field3725;

    @ObfuscatedName("jd.d")
    public String[] field3726 = new String[5];

    @ObfuscatedName("jd.f")
    public boolean field3727 = true;

    @ObfuscatedName("jd.r")
    public int field3738 = -1;

    @ObfuscatedName("jd.y")
    public int field3728 = 128;

    @ObfuscatedName("jd.h")
    public int field3723 = 128;

    @ObfuscatedName("jd.m")
    public boolean field3731 = false;

    @ObfuscatedName("jd.ay")
    public int field3732 = 0;

    @ObfuscatedName("jd.ao")
    public int field3707 = 0;

    @ObfuscatedName("jd.av")
    public int field3734 = -1;

    @ObfuscatedName("jd.aj")
    public int field3721 = 32;

    @ObfuscatedName("jd.ae")
    public int[] field3736;

    @ObfuscatedName("jd.am")
    public int field3737 = -1;

    @ObfuscatedName("jd.az")
    public int field3729 = -1;

    @ObfuscatedName("jd.ap")
    public boolean field3739 = true;

    @ObfuscatedName("jd.ah")
    public boolean field3714 = true;

    @ObfuscatedName("jd.au")
    public boolean field3733 = false;

    @ObfuscatedName("jd.ax")
    public class210 field3742;

    @ObfuscatedName("jh.t(Ljc;Ljc;I)V")
    public static void method4567(class262 arg0, class262 arg1) {
        Statics.field3712 = arg0;
        Statics.field3730 = arg1;
    }

    @ObfuscatedName("ho.q(IB)Ljd;")
    public static class286 method4012(int arg0) {
        class286 var1 = (class286) field3708.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3712.method4265(9, arg0);
        class286 var3 = new class286();
        var3.field3710 = arg0;
        if (var2 != null) {
            var3.method4725(new class195(var2));
        }
        var3.method4720();
        field3708.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.i(B)V")
    public void method4720() {
    }

    @ObfuscatedName("jd.a(Lgb;I)V")
    public void method4725(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4729(arg0, var2);
        }
    }

    @ObfuscatedName("jd.l(Lgb;II)V")
    public void method4729(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3236();
            this.field3713 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3713[var4] = arg0.method3238();
            }
        } else if (arg1 == 2) {
            this.field3706 = arg0.method3257();
        } else if (arg1 == 12) {
            this.field3711 = arg0.method3236();
        } else if (arg1 == 13) {
            this.field3715 = arg0.method3238();
        } else if (arg1 == 14) {
            this.field3718 = arg0.method3238();
        } else if (arg1 == 15) {
            this.field3716 = arg0.method3238();
        } else if (arg1 == 16) {
            this.field3717 = arg0.method3238();
        } else if (arg1 == 17) {
            this.field3718 = arg0.method3238();
            this.field3719 = arg0.method3238();
            this.field3720 = arg0.method3238();
            this.field3741 = arg0.method3238();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3726[arg1 - 30] = arg0.method3257();
            if (this.field3726[arg1 - 30].equalsIgnoreCase(class252.field3024)) {
                this.field3726[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3236();
            this.field3722 = new short[var5];
            this.field3735 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3722[var6] = (short) arg0.method3238();
                this.field3735[var6] = (short) arg0.method3238();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3236();
            this.field3724 = new short[var7];
            this.field3725 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3724[var8] = (short) arg0.method3238();
                this.field3725[var8] = (short) arg0.method3238();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3236();
            this.field3740 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3740[var10] = arg0.method3238();
            }
        } else if (arg1 == 93) {
            this.field3727 = false;
        } else if (arg1 == 95) {
            this.field3738 = arg0.method3238();
        } else if (arg1 == 97) {
            this.field3728 = arg0.method3238();
        } else if (arg1 == 98) {
            this.field3723 = arg0.method3238();
        } else if (arg1 == 99) {
            this.field3731 = true;
        } else if (arg1 == 100) {
            this.field3732 = arg0.method3237();
        } else if (arg1 == 101) {
            this.field3707 = arg0.method3237() * 5;
        } else if (arg1 == 102) {
            this.field3734 = arg0.method3238();
        } else if (arg1 == 103) {
            this.field3721 = arg0.method3238();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3737 = arg0.method3238();
            if (this.field3737 == 65535) {
                this.field3737 = -1;
            }
            this.field3729 = arg0.method3238();
            if (this.field3729 == 65535) {
                this.field3729 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3238();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3236();
            this.field3736 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3736[var13] = arg0.method3238();
                if (this.field3736[var13] == 65535) {
                    this.field3736[var13] = -1;
                }
            }
            this.field3736[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3739 = false;
        } else if (arg1 == 109) {
            this.field3714 = false;
        } else if (arg1 == 111) {
            this.field3733 = true;
        } else if (arg1 == 249) {
            this.field3742 = class277.method6(arg0, this.field3742);
        }
    }

    @ObfuscatedName("jd.b(Lkf;ILkf;IB)Lek;")
    public final class132 method4749(class288 arg0, int arg1, class288 arg2, int arg3) {
        if (this.field3736 != null) {
            class286 var5 = this.method4724();
            return var5 == null ? null : var5.method4749(arg0, arg1, arg2, arg3);
        }
        class132 var6 = (class132) field3709.method3625((long) this.field3710);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3713.length; var8++) {
                if (!Statics.field3730.method4194(this.field3713[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class126[] var9 = new class126[this.field3713.length];
            for (int var10 = 0; var10 < this.field3713.length; var10++) {
                var9[var10] = class126.method2374(Statics.field3730, this.field3713[var10], 0);
            }
            class126 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class126(var9, var9.length);
            }
            if (this.field3722 != null) {
                for (int var12 = 0; var12 < this.field3722.length; var12++) {
                    var11.method2435(this.field3722[var12], this.field3735[var12]);
                }
            }
            if (this.field3724 != null) {
                for (int var13 = 0; var13 < this.field3724.length; var13++) {
                    var11.method2389(this.field3724[var13], this.field3725[var13]);
                }
            }
            var6 = var11.method2395(this.field3732 + 64, this.field3707 + 850, -30, -50, -30);
            field3709.method3627(var6, (long) this.field3710);
        }
        class132 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4781(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4778(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2466(true);
        } else {
            var14 = arg2.method4778(var6, arg3);
        }
        if (this.field3728 != 128 || this.field3723 != 128) {
            var14.method2513(this.field3728, this.field3723, this.field3728);
        }
        return var14;
    }

    @ObfuscatedName("jd.e(I)Ldi;")
    public final class126 method4723() {
        if (this.field3736 != null) {
            class286 var1 = this.method4724();
            return var1 == null ? null : var1.method4723();
        } else if (this.field3740 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3740.length; var3++) {
                if (!Statics.field3730.method4194(this.field3740[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class126[] var4 = new class126[this.field3740.length];
            for (int var5 = 0; var5 < this.field3740.length; var5++) {
                var4[var5] = class126.method2374(Statics.field3730, this.field3740[var5], 0);
            }
            class126 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class126(var4, var4.length);
            }
            if (this.field3722 != null) {
                for (int var7 = 0; var7 < this.field3722.length; var7++) {
                    var6.method2435(this.field3722[var7], this.field3735[var7]);
                }
            }
            if (this.field3724 != null) {
                for (int var8 = 0; var8 < this.field3724.length; var8++) {
                    var6.method2389(this.field3724[var8], this.field3725[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jd.x(I)Ljd;")
    public final class286 method4724() {
        int var1 = -1;
        if (this.field3737 != -1) {
            var1 = class238.method1567(this.field3737);
        } else if (this.field3729 != -1) {
            var1 = class238.field2771[this.field3729];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3736.length - 1) {
            var2 = this.field3736[var1];
        } else {
            var2 = this.field3736[this.field3736.length - 1];
        }
        return var2 == -1 ? null : method4012(var2);
    }

    @ObfuscatedName("jd.p(B)Z")
    public boolean method4751() {
        if (this.field3736 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3737 != -1) {
            var1 = class238.method1567(this.field3737);
        } else if (this.field3729 != -1) {
            var1 = class238.field2771[this.field3729];
        }
        if (var1 >= 0 && var1 < this.field3736.length) {
            return this.field3736[var1] != -1;
        } else {
            return this.field3736[this.field3736.length - 1] != -1;
        }
    }

    @ObfuscatedName("jd.o(III)I")
    public int method4726(int arg0, int arg1) {
        return class277.method4894(this.field3742, arg0, arg1);
    }

    @ObfuscatedName("jd.c(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4727(int arg0, String arg1) {
        class210 var3 = this.field3742;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class208 var5 = (class208) var3.method3594((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2609;
            }
        }
        return var4;
    }
}
