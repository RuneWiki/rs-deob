package deob;

@ObfuscatedName("ki")
public class class288 extends class219 {

    @ObfuscatedName("ki.r")
    public static class213 field3759 = new class213(64);

    @ObfuscatedName("ki.e")
    public static class213 field3755 = new class213(100);

    @ObfuscatedName("ki.y")
    public int[] field3764;

    @ObfuscatedName("ki.k")
    public int[] field3757;

    @ObfuscatedName("ki.s")
    public int[] field3758;

    @ObfuscatedName("ki.p")
    public int[] field3766;

    @ObfuscatedName("ki.x")
    public int field3760 = -1;

    @ObfuscatedName("ki.m")
    public int[] field3761;

    @ObfuscatedName("ki.h")
    public boolean field3762 = false;

    @ObfuscatedName("ki.t")
    public int field3763 = 5;

    @ObfuscatedName("ki.i")
    public int field3770 = -1;

    @ObfuscatedName("ki.u")
    public int field3765 = -1;

    @ObfuscatedName("ki.q")
    public int field3754 = 99;

    @ObfuscatedName("ki.v")
    public int field3767 = -1;

    @ObfuscatedName("ki.f")
    public int field3768 = -1;

    @ObfuscatedName("ki.b")
    public int field3756 = 2;

    @ObfuscatedName("if.d(Ljk;Ljk;Ljk;B)V")
    public static void method4247(class262 arg0, class262 arg1, class262 arg2) {
        Statics.field3769 = arg0;
        Statics.field323 = arg1;
        Statics.field3905 = arg2;
    }

    @ObfuscatedName("jr.z(IB)Lki;")
    public static class288 method4510(int arg0) {
        class288 var1 = (class288) field3759.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3769.method4273(12, arg0);
        class288 var3 = new class288();
        if (var2 != null) {
            var3.method4897(new class195(var2));
        }
        var3.method4889();
        field3759.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ki.n(Lgy;B)V")
    public void method4897(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4873(arg0, var2);
        }
    }

    @ObfuscatedName("ki.r(Lgy;IB)V")
    public void method4873(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3269();
            this.field3758 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3758[var4] = arg0.method3269();
            }
            this.field3764 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3764[var5] = arg0.method3269();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3764[var6] += arg0.method3269() << 16;
            }
        } else if (arg1 == 2) {
            this.field3760 = arg0.method3269();
        } else if (arg1 == 3) {
            int var7 = arg0.method3330();
            this.field3761 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3761[var8] = arg0.method3330();
            }
            this.field3761[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3762 = true;
        } else if (arg1 == 5) {
            this.field3763 = arg0.method3330();
        } else if (arg1 == 6) {
            this.field3770 = arg0.method3269();
        } else if (arg1 == 7) {
            this.field3765 = arg0.method3269();
        } else if (arg1 == 8) {
            this.field3754 = arg0.method3330();
        } else if (arg1 == 9) {
            this.field3767 = arg0.method3330();
        } else if (arg1 == 10) {
            this.field3768 = arg0.method3330();
        } else if (arg1 == 11) {
            this.field3756 = arg0.method3330();
        } else if (arg1 == 12) {
            int var9 = arg0.method3330();
            this.field3757 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3757[var10] = arg0.method3269();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3757[var11] += arg0.method3269() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3330();
            this.field3766 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3766[var13] = arg0.method3263();
            }
        }
    }

    @ObfuscatedName("ki.e(I)V")
    public void method4889() {
        if (this.field3767 == -1) {
            if (this.field3761 == null) {
                this.field3767 = 0;
            } else {
                this.field3767 = 2;
            }
        }
        if (this.field3768 != -1) {
            return;
        }
        if (this.field3761 == null) {
            this.field3768 = 0;
        } else {
            this.field3768 = 2;
        }
    }

    @ObfuscatedName("ki.y(Lel;IS)Lel;")
    public class132 method4875(class132 arg0, int arg1) {
        int var3 = this.field3764[arg1];
        class143 var4 = method2404(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2524(true);
        } else {
            class132 var6 = arg0.method2524(!var4.method2901(var5));
            var6.method2532(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ki.k(Lel;III)Lel;")
    public class132 method4876(class132 arg0, int arg1, int arg2) {
        int var4 = this.field3764[arg1];
        class143 var5 = method2404(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2524(true);
        }
        class132 var7 = arg0.method2524(!var5.method2901(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2537();
        } else if (var8 == 2) {
            var7.method2536();
        } else if (var8 == 3) {
            var7.method2559();
        }
        var7.method2532(var5, var6);
        if (var8 == 1) {
            var7.method2559();
        } else if (var8 == 2) {
            var7.method2536();
        } else if (var8 == 3) {
            var7.method2537();
        }
        return var7;
    }

    @ObfuscatedName("ki.s(Lel;II)Lel;")
    public class132 method4895(class132 arg0, int arg1) {
        int var3 = this.field3764[arg1];
        class143 var4 = method2404(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2549(true);
        } else {
            class132 var6 = arg0.method2549(!var4.method2901(var5));
            var6.method2532(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ki.x(Lel;ILki;IB)Lel;")
    public class132 method4878(class132 arg0, int arg1, class288 arg2, int arg3) {
        int var5 = this.field3764[arg1];
        class143 var6 = method2404(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4875(arg0, arg3);
        }
        int var8 = arg2.field3764[arg3];
        class143 var9 = method2404(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class132 var11 = arg0.method2524(!var6.method2901(var7));
            var11.method2532(var6, var7);
            return var11;
        } else {
            class132 var12 = arg0.method2524(!var6.method2901(var7) & !var9.method2901(var10));
            var12.method2533(var6, var7, var9, var10, this.field3761);
            return var12;
        }
    }

    @ObfuscatedName("ki.h(Lel;II)Lel;")
    public class132 method4879(class132 arg0, int arg1) {
        int var3 = this.field3764[arg1];
        class143 var4 = method2404(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2524(true);
        }
        class143 var6 = null;
        int var7 = 0;
        if (this.field3757 != null && arg1 < this.field3757.length) {
            int var8 = this.field3757[arg1];
            var6 = method2404(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class132 var10 = arg0.method2524(!var4.method2901(var5));
            var10.method2532(var4, var5);
            return var10;
        } else {
            class132 var9 = arg0.method2524(!var4.method2901(var5) & !var6.method2901(var7));
            var9.method2532(var4, var5);
            var9.method2532(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("db.t(II)Lei;")
    public static class143 method2404(int arg0) {
        class143 var1 = (class143) field3755.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class262 var2 = Statics.field323;
        class262 var3 = Statics.field3905;
        boolean var4 = true;
        int[] var5 = var2.method4364(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4321(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4321(var8, 0);
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
            field3755.method3697(var10, (long) arg0);
        }
        return var10;
    }
}
