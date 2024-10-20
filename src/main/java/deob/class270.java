package deob;

@ObfuscatedName("jy")
public class class270 extends class185 {

    @ObfuscatedName("jy.w")
    public static class155 field3563 = new class155(64);

    @ObfuscatedName("jy.t")
    public static class155 field3550 = new class155(100);

    @ObfuscatedName("jy.j")
    public int[] field3551;

    @ObfuscatedName("jy.n")
    public int[] field3552;

    @ObfuscatedName("jy.p")
    public int[] field3553;

    @ObfuscatedName("jy.l")
    public int[] field3562;

    @ObfuscatedName("jy.z")
    public int field3559 = -1;

    @ObfuscatedName("jy.u")
    public int[] field3546;

    @ObfuscatedName("jy.e")
    public boolean field3557 = false;

    @ObfuscatedName("jy.m")
    public int field3558 = 5;

    @ObfuscatedName("jy.c")
    public int field3564 = -1;

    @ObfuscatedName("jy.i")
    public int field3560 = -1;

    @ObfuscatedName("jy.f")
    public int field3555 = 99;

    @ObfuscatedName("jy.a")
    public int field3561 = -1;

    @ObfuscatedName("jy.b")
    public int field3556 = -1;

    @ObfuscatedName("jy.y")
    public int field3549 = 2;

    @ObfuscatedName("dp.h(Lib;Lib;Lib;B)V")
    public static void method2347(class245 arg0, class245 arg1, class245 arg2) {
        Statics.field3554 = arg0;
        Statics.field3547 = arg1;
        Statics.field3548 = arg2;
    }

    @ObfuscatedName("jl.v(II)Ljy;")
    public static class270 method4174(int arg0) {
        class270 var1 = (class270) field3563.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3554.method3834(12, arg0);
        class270 var3 = new class270();
        if (var2 != null) {
            var3.method4433(new class311(var2));
        }
        var3.method4418();
        field3563.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.x(Lkj;B)V")
    public void method4433(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4431(arg0, var2);
        }
    }

    @ObfuscatedName("jy.w(Lkj;II)V")
    public void method4431(class311 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5342();
            this.field3553 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3553[var4] = arg0.method5342();
            }
            this.field3551 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3551[var5] = arg0.method5342();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3551[var6] += arg0.method5342() << 16;
            }
        } else if (arg1 == 2) {
            this.field3559 = arg0.method5342();
        } else if (arg1 == 3) {
            int var7 = arg0.method5274();
            this.field3546 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3546[var8] = arg0.method5274();
            }
            this.field3546[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3557 = true;
        } else if (arg1 == 5) {
            this.field3558 = arg0.method5274();
        } else if (arg1 == 6) {
            this.field3564 = arg0.method5342();
        } else if (arg1 == 7) {
            this.field3560 = arg0.method5342();
        } else if (arg1 == 8) {
            this.field3555 = arg0.method5274();
        } else if (arg1 == 9) {
            this.field3561 = arg0.method5274();
        } else if (arg1 == 10) {
            this.field3556 = arg0.method5274();
        } else if (arg1 == 11) {
            this.field3549 = arg0.method5274();
        } else if (arg1 == 12) {
            int var9 = arg0.method5274();
            this.field3552 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3552[var10] = arg0.method5342();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3552[var11] += arg0.method5342() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5274();
            this.field3562 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3562[var13] = arg0.method5119();
            }
        }
    }

    @ObfuscatedName("jy.t(I)V")
    public void method4418() {
        if (this.field3561 == -1) {
            if (this.field3546 == null) {
                this.field3561 = 0;
            } else {
                this.field3561 = 2;
            }
        }
        if (this.field3556 != -1) {
            return;
        }
        if (this.field3546 == null) {
            this.field3556 = 0;
        } else {
            this.field3556 = 2;
        }
    }

    @ObfuscatedName("jy.j(Leh;IB)Leh;")
    public class137 method4422(class137 arg0, int arg1) {
        int var3 = this.field3551[arg1];
        class148 var4 = method3828(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2719(true);
        } else {
            class137 var6 = arg0.method2719(!var4.method3110(var5));
            var6.method2727(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jy.n(Leh;III)Leh;")
    public class137 method4420(class137 arg0, int arg1, int arg2) {
        int var4 = this.field3551[arg1];
        class148 var5 = method3828(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2719(true);
        }
        class137 var7 = arg0.method2719(!var5.method3110(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2804();
        } else if (var8 == 2) {
            var7.method2731();
        } else if (var8 == 3) {
            var7.method2743();
        }
        var7.method2727(var5, var6);
        if (var8 == 1) {
            var7.method2743();
        } else if (var8 == 2) {
            var7.method2731();
        } else if (var8 == 3) {
            var7.method2804();
        }
        return var7;
    }

    @ObfuscatedName("jy.p(Leh;II)Leh;")
    public class137 method4446(class137 arg0, int arg1) {
        int var3 = this.field3551[arg1];
        class148 var4 = method3828(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2720(true);
        } else {
            class137 var6 = arg0.method2720(!var4.method3110(var5));
            var6.method2727(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jy.l(Leh;ILjy;IB)Leh;")
    public class137 method4442(class137 arg0, int arg1, class270 arg2, int arg3) {
        int var5 = this.field3551[arg1];
        class148 var6 = method3828(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4422(arg0, arg3);
        }
        int var8 = arg2.field3551[arg3];
        class148 var9 = method3828(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class137 var11 = arg0.method2719(!var6.method3110(var7));
            var11.method2727(var6, var7);
            return var11;
        } else {
            class137 var12 = arg0.method2719(!var6.method3110(var7) & !var9.method3110(var10));
            var12.method2728(var6, var7, var9, var10, this.field3546);
            return var12;
        }
    }

    @ObfuscatedName("jy.z(Leh;IB)Leh;")
    public class137 method4426(class137 arg0, int arg1) {
        int var3 = this.field3551[arg1];
        class148 var4 = method3828(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2719(true);
        }
        class148 var6 = null;
        int var7 = 0;
        if (this.field3552 != null && arg1 < this.field3552.length) {
            int var8 = this.field3552[arg1];
            var6 = method3828(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class137 var10 = arg0.method2719(!var4.method3110(var5));
            var10.method2727(var4, var5);
            return var10;
        } else {
            class137 var9 = arg0.method2719(!var4.method3110(var5) & !var6.method3110(var7));
            var9.method2727(var4, var5);
            var9.method2727(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ih.u(IB)Lep;")
    public static class148 method3828(int arg0) {
        class148 var1 = (class148) field3550.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class148 var2 = class148.method3195(Statics.field3547, Statics.field3548, arg0, false);
        if (var2 != null) {
            field3550.method3145(var2, (long) arg0);
        }
        return var2;
    }
}
