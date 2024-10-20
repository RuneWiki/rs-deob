package deob;

@ObfuscatedName("jg")
public class class286 extends class219 {

    @ObfuscatedName("jg.n")
    public static class213 field3706 = new class213(64);

    @ObfuscatedName("jg.r")
    public static class213 field3707 = new class213(50);

    @ObfuscatedName("jg.e")
    public int field3708;

    @ObfuscatedName("jg.y")
    public String field3720 = class252.field3160;

    @ObfuscatedName("jg.k")
    public int field3710 = 1;

    @ObfuscatedName("jg.s")
    public int[] field3737;

    @ObfuscatedName("jg.p")
    public int[] field3712;

    @ObfuscatedName("jg.x")
    public int field3713 = -1;

    @ObfuscatedName("jg.m")
    public int field3714 = -1;

    @ObfuscatedName("jg.h")
    public int field3715 = -1;

    @ObfuscatedName("jg.t")
    public int field3732 = -1;

    @ObfuscatedName("jg.i")
    public int field3729 = -1;

    @ObfuscatedName("jg.u")
    public int field3718 = -1;

    @ObfuscatedName("jg.q")
    public int field3735 = -1;

    @ObfuscatedName("jg.v")
    public short[] field3716;

    @ObfuscatedName("jg.f")
    public short[] field3717;

    @ObfuscatedName("jg.b")
    public short[] field3705;

    @ObfuscatedName("jg.c")
    public short[] field3721;

    @ObfuscatedName("jg.j")
    public String[] field3724 = new String[5];

    @ObfuscatedName("jg.l")
    public boolean field3725 = true;

    @ObfuscatedName("jg.g")
    public int field3726 = -1;

    @ObfuscatedName("jg.w")
    public int field3727 = 128;

    @ObfuscatedName("jg.o")
    public int field3728 = 128;

    @ObfuscatedName("jg.a")
    public boolean field3740 = false;

    @ObfuscatedName("jg.ak")
    public int field3730 = 0;

    @ObfuscatedName("jg.ap")
    public int field3731 = 0;

    @ObfuscatedName("jg.ac")
    public int field3722 = -1;

    @ObfuscatedName("jg.aw")
    public int field3723 = 32;

    @ObfuscatedName("jg.as")
    public int[] field3734;

    @ObfuscatedName("jg.au")
    public int field3738 = -1;

    @ObfuscatedName("jg.al")
    public int field3736 = -1;

    @ObfuscatedName("jg.af")
    public boolean field3719 = true;

    @ObfuscatedName("jg.ai")
    public boolean field3709 = true;

    @ObfuscatedName("jg.az")
    public boolean field3739 = false;

    @ObfuscatedName("jg.aq")
    public class210 field3733;

    @ObfuscatedName("iy.d(II)Ljg;")
    public static class286 method4254(int arg0) {
        class286 var1 = (class286) field3706.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3941.method4273(9, arg0);
        class286 var3 = new class286();
        var3.field3708 = arg0;
        if (var2 != null) {
            var3.method4817(new class195(var2));
        }
        var3.method4836();
        field3706.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.z(I)V")
    public void method4836() {
    }

    @ObfuscatedName("jg.n(Lgy;I)V")
    public void method4817(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4820(arg0, var2);
        }
    }

    @ObfuscatedName("jg.r(Lgy;IB)V")
    public void method4820(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3330();
            this.field3737 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3737[var4] = arg0.method3269();
            }
        } else if (arg1 == 2) {
            this.field3720 = arg0.method3268();
        } else if (arg1 == 12) {
            this.field3710 = arg0.method3330();
        } else if (arg1 == 13) {
            this.field3713 = arg0.method3269();
        } else if (arg1 == 14) {
            this.field3732 = arg0.method3269();
        } else if (arg1 == 15) {
            this.field3714 = arg0.method3269();
        } else if (arg1 == 16) {
            this.field3715 = arg0.method3269();
        } else if (arg1 == 17) {
            this.field3732 = arg0.method3269();
            this.field3729 = arg0.method3269();
            this.field3718 = arg0.method3269();
            this.field3735 = arg0.method3269();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3724[arg1 - 30] = arg0.method3268();
            if (this.field3724[arg1 - 30].equalsIgnoreCase(class252.field3022)) {
                this.field3724[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3330();
            this.field3716 = new short[var5];
            this.field3717 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3716[var6] = (short) arg0.method3269();
                this.field3717[var6] = (short) arg0.method3269();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3330();
            this.field3705 = new short[var7];
            this.field3721 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3705[var8] = (short) arg0.method3269();
                this.field3721[var8] = (short) arg0.method3269();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3330();
            this.field3712 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3712[var10] = arg0.method3269();
            }
        } else if (arg1 == 93) {
            this.field3725 = false;
        } else if (arg1 == 95) {
            this.field3726 = arg0.method3269();
        } else if (arg1 == 97) {
            this.field3727 = arg0.method3269();
        } else if (arg1 == 98) {
            this.field3728 = arg0.method3269();
        } else if (arg1 == 99) {
            this.field3740 = true;
        } else if (arg1 == 100) {
            this.field3730 = arg0.method3421();
        } else if (arg1 == 101) {
            this.field3731 = arg0.method3421() * 5;
        } else if (arg1 == 102) {
            this.field3722 = arg0.method3269();
        } else if (arg1 == 103) {
            this.field3723 = arg0.method3269();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3738 = arg0.method3269();
            if (this.field3738 == 65535) {
                this.field3738 = -1;
            }
            this.field3736 = arg0.method3269();
            if (this.field3736 == 65535) {
                this.field3736 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3269();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3330();
            this.field3734 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3734[var13] = arg0.method3269();
                if (this.field3734[var13] == 65535) {
                    this.field3734[var13] = -1;
                }
            }
            this.field3734[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3719 = false;
        } else if (arg1 == 109) {
            this.field3709 = false;
        } else if (arg1 == 111) {
            this.field3739 = true;
        } else if (arg1 == 249) {
            this.field3733 = class277.method3037(arg0, this.field3733);
        }
    }

    @ObfuscatedName("jg.e(Lki;ILki;II)Lel;")
    public final class132 method4819(class288 arg0, int arg1, class288 arg2, int arg3) {
        if (this.field3734 != null) {
            class286 var5 = this.method4853();
            return var5 == null ? null : var5.method4819(arg0, arg1, arg2, arg3);
        }
        class132 var6 = (class132) field3707.method3707((long) this.field3708);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3737.length; var8++) {
                if (!Statics.field3711.method4275(this.field3737[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class126[] var9 = new class126[this.field3737.length];
            for (int var10 = 0; var10 < this.field3737.length; var10++) {
                var9[var10] = class126.method2428(Statics.field3711, this.field3737[var10], 0);
            }
            class126 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class126(var9, var9.length);
            }
            if (this.field3716 != null) {
                for (int var12 = 0; var12 < this.field3716.length; var12++) {
                    var11.method2441(this.field3716[var12], this.field3717[var12]);
                }
            }
            if (this.field3705 != null) {
                for (int var13 = 0; var13 < this.field3705.length; var13++) {
                    var11.method2442(this.field3705[var13], this.field3721[var13]);
                }
            }
            var6 = var11.method2449(this.field3730 + 64, this.field3731 + 850, -30, -50, -30);
            field3707.method3697(var6, (long) this.field3708);
        }
        class132 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4878(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4875(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2524(true);
        } else {
            var14 = arg2.method4875(var6, arg3);
        }
        if (this.field3727 != 128 || this.field3728 != 128) {
            var14.method2540(this.field3727, this.field3728, this.field3727);
        }
        return var14;
    }

    @ObfuscatedName("jg.y(I)Ldf;")
    public final class126 method4852() {
        if (this.field3734 != null) {
            class286 var1 = this.method4853();
            return var1 == null ? null : var1.method4852();
        } else if (this.field3712 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3712.length; var3++) {
                if (!Statics.field3711.method4275(this.field3712[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class126[] var4 = new class126[this.field3712.length];
            for (int var5 = 0; var5 < this.field3712.length; var5++) {
                var4[var5] = class126.method2428(Statics.field3711, this.field3712[var5], 0);
            }
            class126 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class126(var4, var4.length);
            }
            if (this.field3716 != null) {
                for (int var7 = 0; var7 < this.field3716.length; var7++) {
                    var6.method2441(this.field3716[var7], this.field3717[var7]);
                }
            }
            if (this.field3705 != null) {
                for (int var8 = 0; var8 < this.field3705.length; var8++) {
                    var6.method2442(this.field3705[var8], this.field3721[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jg.k(I)Ljg;")
    public final class286 method4853() {
        int var1 = -1;
        if (this.field3738 != -1) {
            var1 = class238.method728(this.field3738);
        } else if (this.field3736 != -1) {
            var1 = class238.field2783[this.field3736];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3734.length - 1) {
            var2 = this.field3734[var1];
        } else {
            var2 = this.field3734[this.field3734.length - 1];
        }
        return var2 == -1 ? null : method4254(var2);
    }

    @ObfuscatedName("jg.s(I)Z")
    public boolean method4822() {
        if (this.field3734 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3738 != -1) {
            var1 = class238.method728(this.field3738);
        } else if (this.field3736 != -1) {
            var1 = class238.field2783[this.field3736];
        }
        if (var1 >= 0 && var1 < this.field3734.length) {
            return this.field3734[var1] != -1;
        } else {
            return this.field3734[this.field3734.length - 1] != -1;
        }
    }

    @ObfuscatedName("jg.x(III)I")
    public int method4823(int arg0, int arg1) {
        return class277.method619(this.field3733, arg0, arg1);
    }

    @ObfuscatedName("jg.h(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4824(int arg0, String arg1) {
        return class277.method3190(this.field3733, arg0, arg1);
    }

    @ObfuscatedName("jk.t(B)V")
    public static void method4365() {
        field3706.method3700();
        field3707.method3700();
    }
}
