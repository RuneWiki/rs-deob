package deob;

@ObfuscatedName("jm")
public class class269 extends class185 {

    @ObfuscatedName("jm.j")
    public static class155 field3547 = new class155(64);

    @ObfuscatedName("jm.p")
    public static class155 field3548 = new class155(100);

    @ObfuscatedName("jm.g")
    public int[] field3552;

    @ObfuscatedName("jm.n")
    public int[] field3550;

    @ObfuscatedName("jm.u")
    public int[] field3551;

    @ObfuscatedName("jm.a")
    public int[] field3555;

    @ObfuscatedName("jm.z")
    public int field3553 = -1;

    @ObfuscatedName("jm.w")
    public int[] field3554;

    @ObfuscatedName("jm.y")
    public boolean field3559 = false;

    @ObfuscatedName("jm.c")
    public int field3544 = 5;

    @ObfuscatedName("jm.h")
    public int field3557 = -1;

    @ObfuscatedName("jm.k")
    public int field3558 = -1;

    @ObfuscatedName("jm.r")
    public int field3563 = 99;

    @ObfuscatedName("jm.s")
    public int field3560 = -1;

    @ObfuscatedName("jm.v")
    public int field3561 = -1;

    @ObfuscatedName("jm.d")
    public int field3562 = 2;

    @ObfuscatedName("fh.m(IB)Ljm;")
    public static class269 method3330(int arg0) {
        class269 var1 = (class269) field3547.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3549.method3891(12, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4538(new class310(var2));
        }
        var3.method4520();
        field3547.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jm.o(Lkn;I)V")
    public void method4538(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4519(arg0, var2);
        }
    }

    @ObfuscatedName("jm.q(Lkn;II)V")
    public void method4519(class310 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5283();
            this.field3551 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3551[var4] = arg0.method5283();
            }
            this.field3552 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3552[var5] = arg0.method5283();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3552[var6] += arg0.method5283() << 16;
            }
        } else if (arg1 == 2) {
            this.field3553 = arg0.method5283();
        } else if (arg1 == 3) {
            int var7 = arg0.method5227();
            this.field3554 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3554[var8] = arg0.method5227();
            }
            this.field3554[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3559 = true;
        } else if (arg1 == 5) {
            this.field3544 = arg0.method5227();
        } else if (arg1 == 6) {
            this.field3557 = arg0.method5283();
        } else if (arg1 == 7) {
            this.field3558 = arg0.method5283();
        } else if (arg1 == 8) {
            this.field3563 = arg0.method5227();
        } else if (arg1 == 9) {
            this.field3560 = arg0.method5227();
        } else if (arg1 == 10) {
            this.field3561 = arg0.method5227();
        } else if (arg1 == 11) {
            this.field3562 = arg0.method5227();
        } else if (arg1 == 12) {
            int var9 = arg0.method5227();
            this.field3550 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3550[var10] = arg0.method5283();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3550[var11] += arg0.method5283() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5227();
            this.field3555 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3555[var13] = arg0.method5231();
            }
        }
    }

    @ObfuscatedName("jm.j(I)V")
    public void method4520() {
        if (this.field3560 == -1) {
            if (this.field3554 == null) {
                this.field3560 = 0;
            } else {
                this.field3560 = 2;
            }
        }
        if (this.field3561 != -1) {
            return;
        }
        if (this.field3554 == null) {
            this.field3561 = 0;
        } else {
            this.field3561 = 2;
        }
    }

    @ObfuscatedName("jm.p(Lef;II)Lef;")
    public class137 method4521(class137 arg0, int arg1) {
        int var3 = this.field3552[arg1];
        class148 var4 = method3331(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2770(true);
        } else {
            class137 var6 = arg0.method2770(!var4.method3097(var5));
            var6.method2708(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jm.g(Lef;III)Lef;")
    public class137 method4540(class137 arg0, int arg1, int arg2) {
        int var4 = this.field3552[arg1];
        class148 var5 = method3331(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2770(true);
        }
        class137 var7 = arg0.method2770(!var5.method3097(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2709();
        } else if (var8 == 2) {
            var7.method2719();
        } else if (var8 == 3) {
            var7.method2718();
        }
        var7.method2708(var5, var6);
        if (var8 == 1) {
            var7.method2718();
        } else if (var8 == 2) {
            var7.method2719();
        } else if (var8 == 3) {
            var7.method2709();
        }
        return var7;
    }

    @ObfuscatedName("jm.n(Lef;II)Lef;")
    public class137 method4522(class137 arg0, int arg1) {
        int var3 = this.field3552[arg1];
        class148 var4 = method3331(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2762(true);
        } else {
            class137 var6 = arg0.method2762(!var4.method3097(var5));
            var6.method2708(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jm.u(Lef;ILjm;II)Lef;")
    public class137 method4536(class137 arg0, int arg1, class269 arg2, int arg3) {
        int var5 = this.field3552[arg1];
        class148 var6 = method3331(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4521(arg0, arg3);
        }
        int var8 = arg2.field3552[arg3];
        class148 var9 = method3331(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class137 var11 = arg0.method2770(!var6.method3097(var7));
            var11.method2708(var6, var7);
            return var11;
        } else {
            class137 var12 = arg0.method2770(!var6.method3097(var7) & !var9.method3097(var10));
            var12.method2763(var6, var7, var9, var10, this.field3554);
            return var12;
        }
    }

    @ObfuscatedName("jm.a(Lef;IB)Lef;")
    public class137 method4524(class137 arg0, int arg1) {
        int var3 = this.field3552[arg1];
        class148 var4 = method3331(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2770(true);
        }
        class148 var6 = null;
        int var7 = 0;
        if (this.field3550 != null && arg1 < this.field3550.length) {
            int var8 = this.field3550[arg1];
            var6 = method3331(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class137 var10 = arg0.method2770(!var4.method3097(var5));
            var10.method2708(var4, var5);
            return var10;
        } else {
            class137 var9 = arg0.method2770(!var4.method3097(var5) & !var6.method3097(var7));
            var9.method2708(var4, var5);
            var9.method2708(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fh.z(II)Leg;")
    public static class148 method3331(int arg0) {
        class148 var1 = (class148) field3548.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class244 var2 = Statics.field3545;
        class244 var3 = Statics.field3546;
        boolean var4 = true;
        int[] var5 = var2.method3902(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3899(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3899(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class148 var10;
        if (var4) {
            try {
                var10 = new class148(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3548.method3137(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("co.w(B)V")
    public static void method1969() {
        field3547.method3130();
        field3548.method3130();
    }
}
