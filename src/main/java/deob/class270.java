package deob;

@ObfuscatedName("jp")
public class class270 extends class206 {

    @ObfuscatedName("jp.w")
    public static class201 field3608 = new class201(64);

    @ObfuscatedName("jp.s")
    public static class201 field3639 = new class201(50);

    @ObfuscatedName("jp.j")
    public int field3610;

    @ObfuscatedName("jp.a")
    public String field3611 = "null";

    @ObfuscatedName("jp.t")
    public int field3612 = 1;

    @ObfuscatedName("jp.r")
    public int[] field3619;

    @ObfuscatedName("jp.m")
    public int[] field3614;

    @ObfuscatedName("jp.h")
    public int field3615 = -1;

    @ObfuscatedName("jp.o")
    public int field3616 = -1;

    @ObfuscatedName("jp.x")
    public int field3617 = -1;

    @ObfuscatedName("jp.q")
    public int field3633 = -1;

    @ObfuscatedName("jp.v")
    public int field3630 = -1;

    @ObfuscatedName("jp.n")
    public int field3607 = -1;

    @ObfuscatedName("jp.y")
    public int field3637 = -1;

    @ObfuscatedName("jp.d")
    public short[] field3618;

    @ObfuscatedName("jp.l")
    public short[] field3623;

    @ObfuscatedName("jp.f")
    public short[] field3624;

    @ObfuscatedName("jp.k")
    public short[] field3625;

    @ObfuscatedName("jp.e")
    public String[] field3626 = new String[5];

    @ObfuscatedName("jp.u")
    public boolean field3627 = true;

    @ObfuscatedName("jp.g")
    public int field3628 = -1;

    @ObfuscatedName("jp.z")
    public int field3629 = 128;

    @ObfuscatedName("jp.b")
    public int field3613 = 128;

    @ObfuscatedName("jp.c")
    public boolean field3640 = false;

    @ObfuscatedName("jp.aa")
    public int field3632 = 0;

    @ObfuscatedName("jp.ap")
    public int field3621 = 0;

    @ObfuscatedName("jp.ao")
    public int field3634 = -1;

    @ObfuscatedName("jp.ar")
    public int field3635 = 32;

    @ObfuscatedName("jp.ay")
    public int[] field3636;

    @ObfuscatedName("jp.ax")
    public int field3609 = -1;

    @ObfuscatedName("jp.ae")
    public int field3638 = -1;

    @ObfuscatedName("jp.ah")
    public boolean field3631 = true;

    @ObfuscatedName("jp.ai")
    public boolean field3620 = true;

    @ObfuscatedName("jp.au")
    public boolean field3641 = false;

    @ObfuscatedName("jp.am")
    public class198 field3642;

    @ObfuscatedName("ef.p(Lik;Lik;I)V")
    public static void method2866(class247 arg0, class247 arg1) {
        Statics.field3622 = arg0;
        Statics.field19 = arg1;
    }

    @ObfuscatedName("he.i(II)Ljp;")
    public static class270 method4001(int arg0) {
        class270 var1 = (class270) field3608.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3622.method4032(9, arg0);
        class270 var3 = new class270();
        var3.field3610 = arg0;
        if (var2 != null) {
            var3.method4547(new class185(var2));
        }
        var3.method4546();
        field3608.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jp.w(I)V")
    public void method4546() {
    }

    @ObfuscatedName("jp.s(Lgj;B)V")
    public void method4547(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4548(arg0, var2);
        }
    }

    @ObfuscatedName("jp.j(Lgj;II)V")
    public void method4548(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3197();
            this.field3619 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3619[var4] = arg0.method3124();
            }
        } else if (arg1 == 2) {
            this.field3611 = arg0.method3131();
        } else if (arg1 == 12) {
            this.field3612 = arg0.method3197();
        } else if (arg1 == 13) {
            this.field3615 = arg0.method3124();
        } else if (arg1 == 14) {
            this.field3633 = arg0.method3124();
        } else if (arg1 == 15) {
            this.field3616 = arg0.method3124();
        } else if (arg1 == 16) {
            this.field3617 = arg0.method3124();
        } else if (arg1 == 17) {
            this.field3633 = arg0.method3124();
            this.field3630 = arg0.method3124();
            this.field3607 = arg0.method3124();
            this.field3637 = arg0.method3124();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3626[arg1 - 30] = arg0.method3131();
            if (this.field3626[arg1 - 30].equalsIgnoreCase(class237.field2937)) {
                this.field3626[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3197();
            this.field3618 = new short[var5];
            this.field3623 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3618[var6] = (short) arg0.method3124();
                this.field3623[var6] = (short) arg0.method3124();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3197();
            this.field3624 = new short[var7];
            this.field3625 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3624[var8] = (short) arg0.method3124();
                this.field3625[var8] = (short) arg0.method3124();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3197();
            this.field3614 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3614[var10] = arg0.method3124();
            }
        } else if (arg1 == 93) {
            this.field3627 = false;
        } else if (arg1 == 95) {
            this.field3628 = arg0.method3124();
        } else if (arg1 == 97) {
            this.field3629 = arg0.method3124();
        } else if (arg1 == 98) {
            this.field3613 = arg0.method3124();
        } else if (arg1 == 99) {
            this.field3640 = true;
        } else if (arg1 == 100) {
            this.field3632 = arg0.method3123();
        } else if (arg1 == 101) {
            this.field3621 = arg0.method3123() * 5;
        } else if (arg1 == 102) {
            this.field3634 = arg0.method3124();
        } else if (arg1 == 103) {
            this.field3635 = arg0.method3124();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3609 = arg0.method3124();
            if (this.field3609 == 65535) {
                this.field3609 = -1;
            }
            this.field3638 = arg0.method3124();
            if (this.field3638 == 65535) {
                this.field3638 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3124();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3197();
            this.field3636 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3636[var13] = arg0.method3124();
                if (this.field3636[var13] == 65535) {
                    this.field3636[var13] = -1;
                }
            }
            this.field3636[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3631 = false;
        } else if (arg1 == 109) {
            this.field3620 = false;
        } else if (arg1 == 111) {
            this.field3641 = true;
        } else if (arg1 == 249) {
            this.field3642 = class261.method3985(arg0, this.field3642);
        }
    }

    @ObfuscatedName("jp.a(Ljm;ILjm;II)Len;")
    public final class131 method4574(class272 arg0, int arg1, class272 arg2, int arg3) {
        if (this.field3636 != null) {
            class270 var5 = this.method4554();
            return var5 == null ? null : var5.method4574(arg0, arg1, arg2, arg3);
        }
        class131 var6 = (class131) field3639.method3504((long) this.field3610);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3619.length; var8++) {
                if (!Statics.field19.method4034(this.field3619[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class125[] var9 = new class125[this.field3619.length];
            for (int var10 = 0; var10 < this.field3619.length; var10++) {
                var9[var10] = class125.method2372(Statics.field19, this.field3619[var10], 0);
            }
            class125 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class125(var9, var9.length);
            }
            if (this.field3618 != null) {
                for (int var12 = 0; var12 < this.field3618.length; var12++) {
                    var11.method2383(this.field3618[var12], this.field3623[var12]);
                }
            }
            if (this.field3624 != null) {
                for (int var13 = 0; var13 < this.field3624.length; var13++) {
                    var11.method2384(this.field3624[var13], this.field3625[var13]);
                }
            }
            var6 = var11.method2391(this.field3632 + 64, this.field3621 + 850, -30, -50, -30);
            field3639.method3506(var6, (long) this.field3610);
        }
        class131 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4601(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4605(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2462(true);
        } else {
            var14 = arg2.method4605(var6, arg3);
        }
        if (this.field3629 != 128 || this.field3613 != 128) {
            var14.method2491(this.field3629, this.field3613, this.field3629);
        }
        return var14;
    }

    @ObfuscatedName("jp.t(I)Ldy;")
    public final class125 method4576() {
        if (this.field3636 != null) {
            class270 var1 = this.method4554();
            return var1 == null ? null : var1.method4576();
        } else if (this.field3614 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3614.length; var3++) {
                if (!Statics.field19.method4034(this.field3614[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class125[] var4 = new class125[this.field3614.length];
            for (int var5 = 0; var5 < this.field3614.length; var5++) {
                var4[var5] = class125.method2372(Statics.field19, this.field3614[var5], 0);
            }
            class125 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class125(var4, var4.length);
            }
            if (this.field3618 != null) {
                for (int var7 = 0; var7 < this.field3618.length; var7++) {
                    var6.method2383(this.field3618[var7], this.field3623[var7]);
                }
            }
            if (this.field3624 != null) {
                for (int var8 = 0; var8 < this.field3624.length; var8++) {
                    var6.method2384(this.field3624[var8], this.field3625[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jp.r(I)Ljp;")
    public final class270 method4554() {
        int var1 = -1;
        if (this.field3609 != -1) {
            var1 = class223.method3012(this.field3609);
        } else if (this.field3638 != -1) {
            var1 = class223.field2691[this.field3638];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3636.length - 1) {
            var2 = this.field3636[var1];
        } else {
            var2 = this.field3636[this.field3636.length - 1];
        }
        return var2 == -1 ? null : method4001(var2);
    }

    @ObfuscatedName("jp.m(I)Z")
    public boolean method4551() {
        if (this.field3636 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3609 != -1) {
            var1 = class223.method3012(this.field3609);
        } else if (this.field3638 != -1) {
            var1 = class223.field2691[this.field3638];
        }
        if (var1 >= 0 && var1 < this.field3636.length) {
            return this.field3636[var1] != -1;
        } else {
            return this.field3636[this.field3636.length - 1] != -1;
        }
    }

    @ObfuscatedName("jp.h(III)I")
    public int method4552(int arg0, int arg1) {
        return class261.method3004(this.field3642, arg0, arg1);
    }

    @ObfuscatedName("jp.o(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4562(int arg0, String arg1) {
        return class261.method997(this.field3642, arg0, arg1);
    }

    @ObfuscatedName("j.x(B)V")
    public static void method17() {
        field3608.method3513();
        field3639.method3513();
    }
}
