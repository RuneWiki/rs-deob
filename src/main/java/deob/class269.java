package deob;

@ObfuscatedName("jm")
public class class269 extends class185 {

    @ObfuscatedName("jm.t")
    public static class155 field3537 = new class155(64);

    @ObfuscatedName("jm.i")
    public static class155 field3552 = new class155(100);

    @ObfuscatedName("jm.o")
    public int[] field3535;

    @ObfuscatedName("jm.x")
    public int[] field3540;

    @ObfuscatedName("jm.w")
    public int[] field3541;

    @ObfuscatedName("jm.g")
    public int[] field3539;

    @ObfuscatedName("jm.m")
    public int field3543 = -1;

    @ObfuscatedName("jm.n")
    public int[] field3551;

    @ObfuscatedName("jm.d")
    public boolean field3545 = false;

    @ObfuscatedName("jm.h")
    public int field3538 = 5;

    @ObfuscatedName("jm.a")
    public int field3547 = -1;

    @ObfuscatedName("jm.q")
    public int field3548 = -1;

    @ObfuscatedName("jm.c")
    public int field3549 = 99;

    @ObfuscatedName("jm.f")
    public int field3550 = -1;

    @ObfuscatedName("jm.y")
    public int field3542 = -1;

    @ObfuscatedName("jm.v")
    public int field3536 = 2;

    @ObfuscatedName("al.z(IB)Ljm;")
    public static class269 method536(int arg0) {
        class269 var1 = (class269) field3537.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3546.method3873(12, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4499(new class310(var2));
        }
        var3.method4501();
        field3537.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jm.k(Lkf;I)V")
    public void method4499(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4500(arg0, var2);
        }
    }

    @ObfuscatedName("jm.s(Lkf;II)V")
    public void method4500(class310 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5195();
            this.field3541 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3541[var4] = arg0.method5195();
            }
            this.field3535 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3535[var5] = arg0.method5195();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3535[var6] += arg0.method5195() << 16;
            }
        } else if (arg1 == 2) {
            this.field3543 = arg0.method5195();
        } else if (arg1 == 3) {
            int var7 = arg0.method5193();
            this.field3551 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3551[var8] = arg0.method5193();
            }
            this.field3551[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3545 = true;
        } else if (arg1 == 5) {
            this.field3538 = arg0.method5193();
        } else if (arg1 == 6) {
            this.field3547 = arg0.method5195();
        } else if (arg1 == 7) {
            this.field3548 = arg0.method5195();
        } else if (arg1 == 8) {
            this.field3549 = arg0.method5193();
        } else if (arg1 == 9) {
            this.field3550 = arg0.method5193();
        } else if (arg1 == 10) {
            this.field3542 = arg0.method5193();
        } else if (arg1 == 11) {
            this.field3536 = arg0.method5193();
        } else if (arg1 == 12) {
            int var9 = arg0.method5193();
            this.field3540 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3540[var10] = arg0.method5195();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3540[var11] += arg0.method5195() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5193();
            this.field3539 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3539[var13] = arg0.method5197();
            }
        }
    }

    @ObfuscatedName("jm.t(B)V")
    public void method4501() {
        if (this.field3550 == -1) {
            if (this.field3551 == null) {
                this.field3550 = 0;
            } else {
                this.field3550 = 2;
            }
        }
        if (this.field3542 != -1) {
            return;
        }
        if (this.field3551 == null) {
            this.field3542 = 0;
        } else {
            this.field3542 = 2;
        }
    }

    @ObfuscatedName("jm.i(Ler;II)Ler;")
    public class137 method4502(class137 arg0, int arg1) {
        int var3 = this.field3535[arg1];
        class148 var4 = method3156(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2745(true);
        } else {
            class137 var6 = arg0.method2745(!var4.method3143(var5));
            var6.method2753(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jm.o(Ler;III)Ler;")
    public class137 method4520(class137 arg0, int arg1, int arg2) {
        int var4 = this.field3535[arg1];
        class148 var5 = method3156(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2745(true);
        }
        class137 var7 = arg0.method2745(!var5.method3143(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2744();
        } else if (var8 == 2) {
            var7.method2757();
        } else if (var8 == 3) {
            var7.method2756();
        }
        var7.method2753(var5, var6);
        if (var8 == 1) {
            var7.method2756();
        } else if (var8 == 2) {
            var7.method2757();
        } else if (var8 == 3) {
            var7.method2744();
        }
        return var7;
    }

    @ObfuscatedName("jm.x(Ler;II)Ler;")
    public class137 method4504(class137 arg0, int arg1) {
        int var3 = this.field3535[arg1];
        class148 var4 = method3156(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2793(true);
        } else {
            class137 var6 = arg0.method2793(!var4.method3143(var5));
            var6.method2753(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jm.w(Ler;ILjm;IB)Ler;")
    public class137 method4505(class137 arg0, int arg1, class269 arg2, int arg3) {
        int var5 = this.field3535[arg1];
        class148 var6 = method3156(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4502(arg0, arg3);
        }
        int var8 = arg2.field3535[arg3];
        class148 var9 = method3156(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class137 var11 = arg0.method2745(!var6.method3143(var7));
            var11.method2753(var6, var7);
            return var11;
        } else {
            class137 var12 = arg0.method2745(!var6.method3143(var7) & !var9.method3143(var10));
            var12.method2754(var6, var7, var9, var10, this.field3551);
            return var12;
        }
    }

    @ObfuscatedName("jm.g(Ler;II)Ler;")
    public class137 method4498(class137 arg0, int arg1) {
        int var3 = this.field3535[arg1];
        class148 var4 = method3156(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2745(true);
        }
        class148 var6 = null;
        int var7 = 0;
        if (this.field3540 != null && arg1 < this.field3540.length) {
            int var8 = this.field3540[arg1];
            var6 = method3156(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class137 var10 = arg0.method2745(!var4.method3143(var5));
            var10.method2753(var4, var5);
            return var10;
        } else {
            class137 var9 = arg0.method2745(!var4.method3143(var5) & !var6.method3143(var7));
            var9.method2753(var4, var5);
            var9.method2753(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ev.m(II)Lef;")
    public static class148 method3156(int arg0) {
        class148 var1 = (class148) field3552.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class148 var2 = class148.method3973(Statics.field3544, Statics.field118, arg0, false);
        if (var2 != null) {
            field3552.method3169(var2, (long) arg0);
        }
        return var2;
    }
}
