package deob;

@ObfuscatedName("ke")
public class class288 extends class219 {

    @ObfuscatedName("ke.d")
    public static class213 field3756 = new class213(64);

    @ObfuscatedName("ke.h")
    public static class213 field3757 = new class213(100);

    @ObfuscatedName("ke.m")
    public int[] field3758;

    @ObfuscatedName("ke.z")
    public int[] field3759;

    @ObfuscatedName("ke.i")
    public int[] field3764;

    @ObfuscatedName("ke.u")
    public int[] field3760;

    @ObfuscatedName("ke.x")
    public int field3762 = -1;

    @ObfuscatedName("ke.y")
    public int[] field3771;

    @ObfuscatedName("ke.a")
    public boolean field3754 = false;

    @ObfuscatedName("ke.w")
    public int field3768 = 5;

    @ObfuscatedName("ke.n")
    public int field3763 = -1;

    @ObfuscatedName("ke.l")
    public int field3767 = -1;

    @ObfuscatedName("ke.s")
    public int field3753 = 99;

    @ObfuscatedName("ke.v")
    public int field3769 = -1;

    @ObfuscatedName("ke.q")
    public int field3770 = -1;

    @ObfuscatedName("ke.r")
    public int field3761 = 2;

    @ObfuscatedName("cc.o(Ljf;Ljf;Ljf;I)V")
    public static void method1785(class262 arg0, class262 arg1, class262 arg2) {
        Statics.field3766 = arg0;
        Statics.field3765 = arg1;
        Statics.field3755 = arg2;
    }

    @ObfuscatedName("bd.k(II)Lke;")
    public static class288 method1535(int arg0) {
        class288 var1 = (class288) field3756.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3766.method4241(12, arg0);
        class288 var3 = new class288();
        if (var2 != null) {
            var3.method4783(new class195(var2));
        }
        var3.method4805();
        field3756.method3603(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ke.t(Lgc;I)V")
    public void method4783(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4813(arg0, var2);
        }
    }

    @ObfuscatedName("ke.d(Lgc;II)V")
    public void method4813(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3207();
            this.field3764 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3764[var4] = arg0.method3207();
            }
            this.field3758 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3758[var5] = arg0.method3207();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3758[var6] += arg0.method3207() << 16;
            }
        } else if (arg1 == 2) {
            this.field3762 = arg0.method3207();
        } else if (arg1 == 3) {
            int var7 = arg0.method3205();
            this.field3771 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3771[var8] = arg0.method3205();
            }
            this.field3771[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3754 = true;
        } else if (arg1 == 5) {
            this.field3768 = arg0.method3205();
        } else if (arg1 == 6) {
            this.field3763 = arg0.method3207();
        } else if (arg1 == 7) {
            this.field3767 = arg0.method3207();
        } else if (arg1 == 8) {
            this.field3753 = arg0.method3205();
        } else if (arg1 == 9) {
            this.field3769 = arg0.method3205();
        } else if (arg1 == 10) {
            this.field3770 = arg0.method3205();
        } else if (arg1 == 11) {
            this.field3761 = arg0.method3205();
        } else if (arg1 == 12) {
            int var9 = arg0.method3205();
            this.field3759 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3759[var10] = arg0.method3207();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3759[var11] += arg0.method3207() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3205();
            this.field3760 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3760[var13] = arg0.method3233();
            }
        }
    }

    @ObfuscatedName("ke.h(I)V")
    public void method4805() {
        if (this.field3769 == -1) {
            if (this.field3771 == null) {
                this.field3769 = 0;
            } else {
                this.field3769 = 2;
            }
        }
        if (this.field3770 != -1) {
            return;
        }
        if (this.field3771 == null) {
            this.field3770 = 0;
        } else {
            this.field3770 = 2;
        }
    }

    @ObfuscatedName("ke.m(Lei;II)Lei;")
    public class132 method4786(class132 arg0, int arg1) {
        int var3 = this.field3758[arg1];
        class143 var4 = method1784(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2505(true);
        } else {
            class132 var6 = arg0.method2505(!var4.method2828(var5));
            var6.method2468(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ke.z(Lei;III)Lei;")
    public class132 method4806(class132 arg0, int arg1, int arg2) {
        int var4 = this.field3758[arg1];
        class143 var5 = method1784(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2505(true);
        }
        class132 var7 = arg0.method2505(!var5.method2828(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2473();
        } else if (var8 == 2) {
            var7.method2472();
        } else if (var8 == 3) {
            var7.method2471();
        }
        var7.method2468(var5, var6);
        if (var8 == 1) {
            var7.method2471();
        } else if (var8 == 2) {
            var7.method2472();
        } else if (var8 == 3) {
            var7.method2473();
        }
        return var7;
    }

    @ObfuscatedName("ke.i(Lei;II)Lei;")
    public class132 method4790(class132 arg0, int arg1) {
        int var3 = this.field3758[arg1];
        class143 var4 = method1784(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2478(true);
        } else {
            class132 var6 = arg0.method2478(!var4.method2828(var5));
            var6.method2468(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ke.u(Lei;ILke;II)Lei;")
    public class132 method4809(class132 arg0, int arg1, class288 arg2, int arg3) {
        int var5 = this.field3758[arg1];
        class143 var6 = method1784(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4786(arg0, arg3);
        }
        int var8 = arg2.field3758[arg3];
        class143 var9 = method1784(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class132 var11 = arg0.method2505(!var6.method2828(var7));
            var11.method2468(var6, var7);
            return var11;
        } else {
            class132 var12 = arg0.method2505(!var6.method2828(var7) & !var9.method2828(var10));
            var12.method2518(var6, var7, var9, var10, this.field3771);
            return var12;
        }
    }

    @ObfuscatedName("ke.x(Lei;IB)Lei;")
    public class132 method4792(class132 arg0, int arg1) {
        int var3 = this.field3758[arg1];
        class143 var4 = method1784(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2505(true);
        }
        class143 var6 = null;
        int var7 = 0;
        if (this.field3759 != null && arg1 < this.field3759.length) {
            int var8 = this.field3759[arg1];
            var6 = method1784(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class132 var10 = arg0.method2505(!var4.method2828(var5));
            var10.method2468(var4, var5);
            return var10;
        } else {
            class132 var9 = arg0.method2505(!var4.method2828(var5) & !var6.method2828(var7));
            var9.method2468(var4, var5);
            var9.method2468(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("cc.y(IB)Lef;")
    public static class143 method1784(int arg0) {
        class143 var1 = (class143) field3757.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class262 var2 = Statics.field3765;
        class262 var3 = Statics.field3755;
        boolean var4 = true;
        int[] var5 = var2.method4168(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4165(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4165(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class143 var10;
        if (var4) {
            try {
                var10 = new class143(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3757.method3603(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("la.a(I)V")
    public static void method5190() {
        field3756.method3604();
        field3757.method3604();
    }
}
