package deob;

@ObfuscatedName("kc")
public class class288 extends class219 {

    @ObfuscatedName("kc.z")
    public static class213 field3760 = new class213(64);

    @ObfuscatedName("kc.n")
    public static class213 field3772 = new class213(100);

    @ObfuscatedName("kc.l")
    public int[] field3762;

    @ObfuscatedName("kc.s")
    public int[] field3769;

    @ObfuscatedName("kc.y")
    public int[] field3757;

    @ObfuscatedName("kc.c")
    public int[] field3765;

    @ObfuscatedName("kc.h")
    public int field3766 = -1;

    @ObfuscatedName("kc.i")
    public int[] field3767;

    @ObfuscatedName("kc.o")
    public boolean field3768 = false;

    @ObfuscatedName("kc.d")
    public int field3761 = 5;

    @ObfuscatedName("kc.r")
    public int field3763 = -1;

    @ObfuscatedName("kc.p")
    public int field3771 = -1;

    @ObfuscatedName("kc.q")
    public int field3770 = 99;

    @ObfuscatedName("kc.f")
    public int field3773 = -1;

    @ObfuscatedName("kc.j")
    public int field3774 = -1;

    @ObfuscatedName("kc.v")
    public int field3764 = 2;

    @ObfuscatedName("ia.g(Ljr;Ljr;Ljr;B)V")
    public static void method4256(class262 arg0, class262 arg1, class262 arg2) {
        Statics.field3775 = arg0;
        Statics.field3758 = arg1;
        Statics.field3759 = arg2;
    }

    @ObfuscatedName("cy.e(IB)Lkc;")
    public static class288 method1825(int arg0) {
        class288 var1 = (class288) field3760.method3706((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3775.method4294(12, arg0);
        class288 var3 = new class288();
        if (var2 != null) {
            var3.method4841(new class195(var2));
        }
        var3.method4853();
        field3760.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kc.b(Lgg;I)V")
    public void method4841(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4842(arg0, var2);
        }
    }

    @ObfuscatedName("kc.z(Lgg;II)V")
    public void method4842(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3310();
            this.field3757 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3757[var4] = arg0.method3310();
            }
            this.field3762 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3762[var5] = arg0.method3310();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3762[var6] += arg0.method3310() << 16;
            }
        } else if (arg1 == 2) {
            this.field3766 = arg0.method3310();
        } else if (arg1 == 3) {
            int var7 = arg0.method3332();
            this.field3767 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3767[var8] = arg0.method3332();
            }
            this.field3767[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3768 = true;
        } else if (arg1 == 5) {
            this.field3761 = arg0.method3332();
        } else if (arg1 == 6) {
            this.field3763 = arg0.method3310();
        } else if (arg1 == 7) {
            this.field3771 = arg0.method3310();
        } else if (arg1 == 8) {
            this.field3770 = arg0.method3332();
        } else if (arg1 == 9) {
            this.field3773 = arg0.method3332();
        } else if (arg1 == 10) {
            this.field3774 = arg0.method3332();
        } else if (arg1 == 11) {
            this.field3764 = arg0.method3332();
        } else if (arg1 == 12) {
            int var9 = arg0.method3332();
            this.field3769 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3769[var10] = arg0.method3310();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3769[var11] += arg0.method3310() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3332();
            this.field3765 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3765[var13] = arg0.method3312();
            }
        }
    }

    @ObfuscatedName("kc.n(I)V")
    public void method4853() {
        if (this.field3773 == -1) {
            if (this.field3767 == null) {
                this.field3773 = 0;
            } else {
                this.field3773 = 2;
            }
        }
        if (this.field3774 != -1) {
            return;
        }
        if (this.field3767 == null) {
            this.field3774 = 0;
        } else {
            this.field3774 = 2;
        }
    }

    @ObfuscatedName("kc.l(Lee;II)Lee;")
    public class132 method4844(class132 arg0, int arg1) {
        int var3 = this.field3762[arg1];
        class143 var4 = method4109(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2577(true);
        } else {
            class132 var6 = arg0.method2577(!var4.method2933(var5));
            var6.method2585(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("kc.s(Lee;III)Lee;")
    public class132 method4845(class132 arg0, int arg1, int arg2) {
        int var4 = this.field3762[arg1];
        class143 var5 = method4109(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2577(true);
        }
        class132 var7 = arg0.method2577(!var5.method2933(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2597();
        } else if (var8 == 2) {
            var7.method2589();
        } else if (var8 == 3) {
            var7.method2588();
        }
        var7.method2585(var5, var6);
        if (var8 == 1) {
            var7.method2588();
        } else if (var8 == 2) {
            var7.method2589();
        } else if (var8 == 3) {
            var7.method2597();
        }
        return var7;
    }

    @ObfuscatedName("kc.y(Lee;II)Lee;")
    public class132 method4846(class132 arg0, int arg1) {
        int var3 = this.field3762[arg1];
        class143 var4 = method4109(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2578(true);
        } else {
            class132 var6 = arg0.method2578(!var4.method2933(var5));
            var6.method2585(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("kc.c(Lee;ILkc;II)Lee;")
    public class132 method4847(class132 arg0, int arg1, class288 arg2, int arg3) {
        int var5 = this.field3762[arg1];
        class143 var6 = method4109(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4844(arg0, arg3);
        }
        int var8 = arg2.field3762[arg3];
        class143 var9 = method4109(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class132 var11 = arg0.method2577(!var6.method2933(var7));
            var11.method2585(var6, var7);
            return var11;
        } else {
            class132 var12 = arg0.method2577(!var6.method2933(var7) & !var9.method2933(var10));
            var12.method2629(var6, var7, var9, var10, this.field3767);
            return var12;
        }
    }

    @ObfuscatedName("kc.o(Lee;II)Lee;")
    public class132 method4870(class132 arg0, int arg1) {
        int var3 = this.field3762[arg1];
        class143 var4 = method4109(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2577(true);
        }
        class143 var6 = null;
        int var7 = 0;
        if (this.field3769 != null && arg1 < this.field3769.length) {
            int var8 = this.field3769[arg1];
            var6 = method4109(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class132 var10 = arg0.method2577(!var4.method2933(var5));
            var10.method2585(var4, var5);
            return var10;
        } else {
            class132 var9 = arg0.method2577(!var4.method2933(var5) & !var6.method2933(var7));
            var9.method2585(var4, var5);
            var9.method2585(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("in.d(II)Leu;")
    public static class143 method4109(int arg0) {
        class143 var1 = (class143) field3772.method3706((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class143 var2 = class143.method4652(Statics.field3758, Statics.field3759, arg0, false);
        if (var2 != null) {
            field3772.method3712(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("gk.r(I)V")
    public static void method3215() {
        field3760.method3709();
        field3772.method3709();
    }
}
