package deob;

@ObfuscatedName("jh")
public class class274 extends class207 {

    @ObfuscatedName("jh.b")
    public static class201 field3552 = new class201(64);

    @ObfuscatedName("jh.f")
    public static class201 field3559 = new class201(100);

    @ObfuscatedName("jh.n")
    public int[] field3554;

    @ObfuscatedName("jh.h")
    public int[] field3555;

    @ObfuscatedName("jh.x")
    public int[] field3563;

    @ObfuscatedName("jh.j")
    public int[] field3557;

    @ObfuscatedName("jh.a")
    public int field3558 = -1;

    @ObfuscatedName("jh.l")
    public int[] field3566;

    @ObfuscatedName("jh.d")
    public boolean field3560 = false;

    @ObfuscatedName("jh.s")
    public int field3561 = 5;

    @ObfuscatedName("jh.p")
    public int field3562 = -1;

    @ObfuscatedName("jh.g")
    public int field3556 = -1;

    @ObfuscatedName("jh.y")
    public int field3553 = 99;

    @ObfuscatedName("jh.c")
    public int field3565 = -1;

    @ObfuscatedName("jh.e")
    public int field3564 = -1;

    @ObfuscatedName("jh.t")
    public int field3567 = 2;

    @ObfuscatedName("ej.w(II)Ljh;")
    public static class274 method2918(int arg0) {
        class274 var1 = (class274) field3552.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3549.method4250(12, arg0);
        class274 var3 = new class274();
        if (var2 != null) {
            var3.method4838(new class183(var2));
        }
        var3.method4829();
        field3552.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.m(Lgy;I)V")
    public void method4838(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4828(arg0, var2);
        }
    }

    @ObfuscatedName("jh.q(Lgy;II)V")
    public void method4828(class183 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3268();
            this.field3563 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3563[var4] = arg0.method3268();
            }
            this.field3554 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3554[var5] = arg0.method3268();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3554[var6] += arg0.method3268() << 16;
            }
        } else if (arg1 == 2) {
            this.field3558 = arg0.method3268();
        } else if (arg1 == 3) {
            int var7 = arg0.method3436();
            this.field3566 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3566[var8] = arg0.method3436();
            }
            this.field3566[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3560 = true;
        } else if (arg1 == 5) {
            this.field3561 = arg0.method3436();
        } else if (arg1 == 6) {
            this.field3562 = arg0.method3268();
        } else if (arg1 == 7) {
            this.field3556 = arg0.method3268();
        } else if (arg1 == 8) {
            this.field3553 = arg0.method3436();
        } else if (arg1 == 9) {
            this.field3565 = arg0.method3436();
        } else if (arg1 == 10) {
            this.field3564 = arg0.method3436();
        } else if (arg1 == 11) {
            this.field3567 = arg0.method3436();
        } else if (arg1 == 12) {
            int var9 = arg0.method3436();
            this.field3555 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3555[var10] = arg0.method3268();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3555[var11] += arg0.method3268() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3436();
            this.field3557 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3557[var13] = arg0.method3266();
            }
        }
    }

    @ObfuscatedName("jh.x(I)V")
    public void method4829() {
        if (this.field3565 == -1) {
            if (this.field3566 == null) {
                this.field3565 = 0;
            } else {
                this.field3565 = 2;
            }
        }
        if (this.field3564 != -1) {
            return;
        }
        if (this.field3566 == null) {
            this.field3564 = 0;
        } else {
            this.field3564 = 2;
        }
    }

    @ObfuscatedName("jh.j(Ldk;II)Ldk;")
    public class120 method4830(class120 arg0, int arg1) {
        int var3 = this.field3554[arg1];
        class131 var4 = method5287(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2516(true);
        } else {
            class120 var6 = arg0.method2516(!var4.method2865(var5));
            var6.method2570(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jh.a(Ldk;III)Ldk;")
    public class120 method4831(class120 arg0, int arg1, int arg2) {
        int var4 = this.field3554[arg1];
        class131 var5 = method5287(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2516(true);
        }
        class120 var7 = arg0.method2516(!var5.method2865(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2521();
        } else if (var8 == 2) {
            var7.method2557();
        } else if (var8 == 3) {
            var7.method2519();
        }
        var7.method2570(var5, var6);
        if (var8 == 1) {
            var7.method2519();
        } else if (var8 == 2) {
            var7.method2557();
        } else if (var8 == 3) {
            var7.method2521();
        }
        return var7;
    }

    @ObfuscatedName("jh.l(Ldk;II)Ldk;")
    public class120 method4834(class120 arg0, int arg1) {
        int var3 = this.field3554[arg1];
        class131 var4 = method5287(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2509(true);
        } else {
            class120 var6 = arg0.method2509(!var4.method2865(var5));
            var6.method2570(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jh.d(Ldk;ILjh;II)Ldk;")
    public class120 method4833(class120 arg0, int arg1, class274 arg2, int arg3) {
        int var5 = this.field3554[arg1];
        class131 var6 = method5287(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4830(arg0, arg3);
        }
        int var8 = arg2.field3554[arg3];
        class131 var9 = method5287(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class120 var11 = arg0.method2516(!var6.method2865(var7));
            var11.method2570(var6, var7);
            return var11;
        } else {
            class120 var12 = arg0.method2516(!var6.method2865(var7) & !var9.method2865(var10));
            var12.method2564(var6, var7, var9, var10, this.field3566);
            return var12;
        }
    }

    @ObfuscatedName("jh.s(Ldk;II)Ldk;")
    public class120 method4846(class120 arg0, int arg1) {
        int var3 = this.field3554[arg1];
        class131 var4 = method5287(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2516(true);
        }
        class131 var6 = null;
        int var7 = 0;
        if (this.field3555 != null && arg1 < this.field3555.length) {
            int var8 = this.field3555[arg1];
            var6 = method5287(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class120 var10 = arg0.method2516(!var4.method2865(var5));
            var10.method2570(var4, var5);
            return var10;
        } else {
            class120 var9 = arg0.method2516(!var4.method2865(var5) & !var6.method2865(var7));
            var9.method2570(var4, var5);
            var9.method2570(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ky.p(II)Lec;")
    public static class131 method5287(int arg0) {
        class131 var1 = (class131) field3559.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class131 var2 = class131.method2686(Statics.field3550, Statics.field3551, arg0, false);
        if (var2 != null) {
            field3559.method3712(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("v.g(I)V")
    public static void method440() {
        field3552.method3708();
        field3559.method3708();
    }
}
