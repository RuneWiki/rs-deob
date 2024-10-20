package deob;

@ObfuscatedName("js")
public class class272 extends class206 {

    @ObfuscatedName("js.r")
    public static class201 field3686 = new class201(64);

    @ObfuscatedName("js.h")
    public static class201 field3687 = new class201(100);

    @ObfuscatedName("js.d")
    public int[] field3688;

    @ObfuscatedName("js.s")
    public int[] field3689;

    @ObfuscatedName("js.b")
    public int[] field3690;

    @ObfuscatedName("js.e")
    public int[] field3691;

    @ObfuscatedName("js.f")
    public int field3685 = -1;

    @ObfuscatedName("js.z")
    public int[] field3683;

    @ObfuscatedName("js.u")
    public boolean field3694 = false;

    @ObfuscatedName("js.p")
    public int field3695 = 5;

    @ObfuscatedName("js.w")
    public int field3696 = -1;

    @ObfuscatedName("js.t")
    public int field3697 = -1;

    @ObfuscatedName("js.o")
    public int field3698 = 99;

    @ObfuscatedName("js.a")
    public int field3699 = -1;

    @ObfuscatedName("js.i")
    public int field3701 = -1;

    @ObfuscatedName("js.m")
    public int field3693 = 2;

    @ObfuscatedName("ak.n(II)Ljs;")
    public static class272 method579(int arg0) {
        class272 var1 = (class272) field3686.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3692.method3931(12, arg0);
        class272 var3 = new class272();
        if (var2 != null) {
            var3.method4491(new class185(var2));
        }
        var3.method4493();
        field3686.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("js.v(Lgv;I)V")
    public void method4491(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4492(arg0, var2);
        }
    }

    @ObfuscatedName("js.y(Lgv;IB)V")
    public void method4492(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3015();
            this.field3690 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3690[var4] = arg0.method3015();
            }
            this.field3688 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3688[var5] = arg0.method3015();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3688[var6] += arg0.method3015() << 16;
            }
        } else if (arg1 == 2) {
            this.field3685 = arg0.method3015();
        } else if (arg1 == 3) {
            int var7 = arg0.method3021();
            this.field3683 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3683[var8] = arg0.method3021();
            }
            this.field3683[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3694 = true;
        } else if (arg1 == 5) {
            this.field3695 = arg0.method3021();
        } else if (arg1 == 6) {
            this.field3696 = arg0.method3015();
        } else if (arg1 == 7) {
            this.field3697 = arg0.method3015();
        } else if (arg1 == 8) {
            this.field3698 = arg0.method3021();
        } else if (arg1 == 9) {
            this.field3699 = arg0.method3021();
        } else if (arg1 == 10) {
            this.field3701 = arg0.method3021();
        } else if (arg1 == 11) {
            this.field3693 = arg0.method3021();
        } else if (arg1 == 12) {
            int var9 = arg0.method3021();
            this.field3689 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3689[var10] = arg0.method3015();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3689[var11] += arg0.method3015() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3021();
            this.field3691 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3691[var13] = arg0.method3025();
            }
        }
    }

    @ObfuscatedName("js.r(I)V")
    public void method4493() {
        if (this.field3699 == -1) {
            if (this.field3683 == null) {
                this.field3699 = 0;
            } else {
                this.field3699 = 2;
            }
        }
        if (this.field3701 != -1) {
            return;
        }
        if (this.field3683 == null) {
            this.field3701 = 0;
        } else {
            this.field3701 = 2;
        }
    }

    @ObfuscatedName("js.h(Les;II)Les;")
    public class133 method4512(class133 arg0, int arg1) {
        int var3 = this.field3688[arg1];
        class144 var4 = method538(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2358(true);
        } else {
            class133 var6 = arg0.method2358(!var4.method2700(var5));
            var6.method2353(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("js.d(Les;III)Les;")
    public class133 method4495(class133 arg0, int arg1, int arg2) {
        int var4 = this.field3688[arg1];
        class144 var5 = method538(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2358(true);
        }
        class133 var7 = arg0.method2358(!var5.method2700(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2397();
        } else if (var8 == 2) {
            var7.method2367();
        } else if (var8 == 3) {
            var7.method2345();
        }
        var7.method2353(var5, var6);
        if (var8 == 1) {
            var7.method2345();
        } else if (var8 == 2) {
            var7.method2367();
        } else if (var8 == 3) {
            var7.method2397();
        }
        return var7;
    }

    @ObfuscatedName("js.s(Les;IB)Les;")
    public class133 method4507(class133 arg0, int arg1) {
        int var3 = this.field3688[arg1];
        class144 var4 = method538(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2348(true);
        } else {
            class133 var6 = arg0.method2348(!var4.method2700(var5));
            var6.method2353(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("js.b(Les;ILjs;II)Les;")
    public class133 method4490(class133 arg0, int arg1, class272 arg2, int arg3) {
        int var5 = this.field3688[arg1];
        class144 var6 = method538(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4512(arg0, arg3);
        }
        int var8 = arg2.field3688[arg3];
        class144 var9 = method538(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class133 var11 = arg0.method2358(!var6.method2700(var7));
            var11.method2353(var6, var7);
            return var11;
        } else {
            class133 var12 = arg0.method2358(!var6.method2700(var7) & !var9.method2700(var10));
            var12.method2414(var6, var7, var9, var10, this.field3683);
            return var12;
        }
    }

    @ObfuscatedName("js.e(Les;II)Les;")
    public class133 method4502(class133 arg0, int arg1) {
        int var3 = this.field3688[arg1];
        class144 var4 = method538(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2358(true);
        }
        class144 var6 = null;
        int var7 = 0;
        if (this.field3689 != null && arg1 < this.field3689.length) {
            int var8 = this.field3689[arg1];
            var6 = method538(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class133 var10 = arg0.method2358(!var4.method2700(var5));
            var10.method2353(var4, var5);
            return var10;
        } else {
            class133 var9 = arg0.method2358(!var4.method2700(var5) & !var6.method2700(var7));
            var9.method2353(var4, var5);
            var9.method2353(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ay.f(II)Lek;")
    public static class144 method538(int arg0) {
        class144 var1 = (class144) field3687.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class144 var2 = class144.method3671(Statics.field3684, Statics.field3700, arg0, false);
        if (var2 != null) {
            field3687.method3408(var2, (long) arg0);
        }
        return var2;
    }
}
