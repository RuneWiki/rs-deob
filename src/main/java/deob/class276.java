package deob;

@ObfuscatedName("jw")
public class class276 extends class209 {

    @ObfuscatedName("jw.s")
    public static class203 field3613 = new class203(64);

    @ObfuscatedName("jw.e")
    public static class203 field3614 = new class203(100);

    @ObfuscatedName("jw.a")
    public int[] field3625;

    @ObfuscatedName("jw.c")
    public int[] field3616;

    @ObfuscatedName("jw.p")
    public int[] field3617;

    @ObfuscatedName("jw.r")
    public int[] field3618;

    @ObfuscatedName("jw.m")
    public int field3619 = -1;

    @ObfuscatedName("jw.d")
    public int[] field3627;

    @ObfuscatedName("jw.z")
    public boolean field3623 = false;

    @ObfuscatedName("jw.x")
    public int field3622 = 5;

    @ObfuscatedName("jw.v")
    public int field3628 = -1;

    @ObfuscatedName("jw.g")
    public int field3624 = -1;

    @ObfuscatedName("jw.j")
    public int field3621 = 99;

    @ObfuscatedName("jw.b")
    public int field3626 = -1;

    @ObfuscatedName("jw.u")
    public int field3610 = -1;

    @ObfuscatedName("jw.t")
    public int field3611 = 2;

    @ObfuscatedName("fr.f(II)Ljw;")
    public static class276 method3224(int arg0) {
        class276 var1 = (class276) field3613.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3615.method4289(12, arg0);
        class276 var3 = new class276();
        if (var2 != null) {
            var3.method4902(new class185(var2));
        }
        var3.method4910();
        field3613.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jw.l(Lgm;I)V")
    public void method4902(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4903(arg0, var2);
        }
    }

    @ObfuscatedName("jw.w(Lgm;II)V")
    public void method4903(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3346();
            this.field3617 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3617[var4] = arg0.method3346();
            }
            this.field3625 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3625[var5] = arg0.method3346();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3625[var6] += arg0.method3346() << 16;
            }
        } else if (arg1 == 2) {
            this.field3619 = arg0.method3346();
        } else if (arg1 == 3) {
            int var7 = arg0.method3344();
            this.field3627 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3627[var8] = arg0.method3344();
            }
            this.field3627[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3623 = true;
        } else if (arg1 == 5) {
            this.field3622 = arg0.method3344();
        } else if (arg1 == 6) {
            this.field3628 = arg0.method3346();
        } else if (arg1 == 7) {
            this.field3624 = arg0.method3346();
        } else if (arg1 == 8) {
            this.field3621 = arg0.method3344();
        } else if (arg1 == 9) {
            this.field3626 = arg0.method3344();
        } else if (arg1 == 10) {
            this.field3610 = arg0.method3344();
        } else if (arg1 == 11) {
            this.field3611 = arg0.method3344();
        } else if (arg1 == 12) {
            int var9 = arg0.method3344();
            this.field3616 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3616[var10] = arg0.method3346();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3616[var11] += arg0.method3346() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3344();
            this.field3618 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3618[var13] = arg0.method3348();
            }
        }
    }

    @ObfuscatedName("jw.s(I)V")
    public void method4910() {
        if (this.field3626 == -1) {
            if (this.field3627 == null) {
                this.field3626 = 0;
            } else {
                this.field3626 = 2;
            }
        }
        if (this.field3610 != -1) {
            return;
        }
        if (this.field3627 == null) {
            this.field3610 = 0;
        } else {
            this.field3610 = 2;
        }
    }

    @ObfuscatedName("jw.e(Lds;II)Lds;")
    public class122 method4904(class122 arg0, int arg1) {
        int var3 = this.field3625[arg1];
        class133 var4 = method1778(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2536(true);
        } else {
            class122 var6 = arg0.method2536(!var4.method2915(var5));
            var6.method2539(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jw.c(Lds;III)Lds;")
    public class122 method4926(class122 arg0, int arg1, int arg2) {
        int var4 = this.field3625[arg1];
        class133 var5 = method1778(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2536(true);
        }
        class122 var7 = arg0.method2536(!var5.method2915(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2544();
        } else if (var8 == 2) {
            var7.method2543();
        } else if (var8 == 3) {
            var7.method2588();
        }
        var7.method2539(var5, var6);
        if (var8 == 1) {
            var7.method2588();
        } else if (var8 == 2) {
            var7.method2543();
        } else if (var8 == 3) {
            var7.method2544();
        }
        return var7;
    }

    @ObfuscatedName("jw.p(Lds;IB)Lds;")
    public class122 method4911(class122 arg0, int arg1) {
        int var3 = this.field3625[arg1];
        class133 var4 = method1778(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2532(true);
        } else {
            class122 var6 = arg0.method2532(!var4.method2915(var5));
            var6.method2539(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jw.r(Lds;ILjw;IS)Lds;")
    public class122 method4927(class122 arg0, int arg1, class276 arg2, int arg3) {
        int var5 = this.field3625[arg1];
        class133 var6 = method1778(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4904(arg0, arg3);
        }
        int var8 = arg2.field3625[arg3];
        class133 var9 = method1778(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class122 var11 = arg0.method2536(!var6.method2915(var7));
            var11.method2539(var6, var7);
            return var11;
        } else {
            class122 var12 = arg0.method2536(!var6.method2915(var7) & !var9.method2915(var10));
            var12.method2540(var6, var7, var9, var10, this.field3627);
            return var12;
        }
    }

    @ObfuscatedName("jw.m(Lds;II)Lds;")
    public class122 method4908(class122 arg0, int arg1) {
        int var3 = this.field3625[arg1];
        class133 var4 = method1778(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2536(true);
        }
        class133 var6 = null;
        int var7 = 0;
        if (this.field3616 != null && arg1 < this.field3616.length) {
            int var8 = this.field3616[arg1];
            var6 = method1778(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class122 var10 = arg0.method2536(!var4.method2915(var5));
            var10.method2539(var4, var5);
            return var10;
        } else {
            class122 var9 = arg0.method2536(!var4.method2915(var5) & !var6.method2915(var7));
            var9.method2539(var4, var5);
            var9.method2539(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bp.d(IB)Let;")
    public static class133 method1778(int arg0) {
        class133 var1 = (class133) field3614.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class133 var2 = class133.method1767(Statics.field3620, Statics.field3612, arg0, false);
        if (var2 != null) {
            field3614.method3744(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("m.z(I)V")
    public static void method93() {
        field3613.method3740();
        field3614.method3740();
    }
}
