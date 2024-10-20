package deob;

@ObfuscatedName("kf")
public class class288 extends class219 {

    @ObfuscatedName("kf.a")
    public static class213 field3756 = new class213(64);

    @ObfuscatedName("kf.l")
    public static class213 field3766 = new class213(100);

    @ObfuscatedName("kf.b")
    public int[] field3760;

    @ObfuscatedName("kf.e")
    public int[] field3761;

    @ObfuscatedName("kf.x")
    public int[] field3762;

    @ObfuscatedName("kf.p")
    public int[] field3763;

    @ObfuscatedName("kf.g")
    public int field3764 = -1;

    @ObfuscatedName("kf.n")
    public int[] field3757;

    @ObfuscatedName("kf.o")
    public boolean field3758 = false;

    @ObfuscatedName("kf.c")
    public int field3767 = 5;

    @ObfuscatedName("kf.v")
    public int field3768 = -1;

    @ObfuscatedName("kf.u")
    public int field3769 = -1;

    @ObfuscatedName("kf.j")
    public int field3770 = 99;

    @ObfuscatedName("kf.k")
    public int field3771 = -1;

    @ObfuscatedName("kf.z")
    public int field3772 = -1;

    @ObfuscatedName("kf.w")
    public int field3773 = 2;

    @ObfuscatedName("ff.t(IB)Lkf;")
    public static class288 method2932(int arg0) {
        class288 var1 = (class288) field3756.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field12.method4265(12, arg0);
        class288 var3 = new class288();
        if (var2 != null) {
            var3.method4775(new class195(var2));
        }
        var3.method4777();
        field3756.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kf.q(Lgb;I)V")
    public void method4775(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4776(arg0, var2);
        }
    }

    @ObfuscatedName("kf.i(Lgb;II)V")
    public void method4776(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3238();
            this.field3762 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3762[var4] = arg0.method3238();
            }
            this.field3760 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3760[var5] = arg0.method3238();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3760[var6] += arg0.method3238() << 16;
            }
        } else if (arg1 == 2) {
            this.field3764 = arg0.method3238();
        } else if (arg1 == 3) {
            int var7 = arg0.method3236();
            this.field3757 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3757[var8] = arg0.method3236();
            }
            this.field3757[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3758 = true;
        } else if (arg1 == 5) {
            this.field3767 = arg0.method3236();
        } else if (arg1 == 6) {
            this.field3768 = arg0.method3238();
        } else if (arg1 == 7) {
            this.field3769 = arg0.method3238();
        } else if (arg1 == 8) {
            this.field3770 = arg0.method3236();
        } else if (arg1 == 9) {
            this.field3771 = arg0.method3236();
        } else if (arg1 == 10) {
            this.field3772 = arg0.method3236();
        } else if (arg1 == 11) {
            this.field3773 = arg0.method3236();
        } else if (arg1 == 12) {
            int var9 = arg0.method3236();
            this.field3761 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3761[var10] = arg0.method3238();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3761[var11] += arg0.method3238() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3236();
            this.field3763 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3763[var13] = arg0.method3399();
            }
        }
    }

    @ObfuscatedName("kf.a(B)V")
    public void method4777() {
        if (this.field3771 == -1) {
            if (this.field3757 == null) {
                this.field3771 = 0;
            } else {
                this.field3771 = 2;
            }
        }
        if (this.field3772 != -1) {
            return;
        }
        if (this.field3757 == null) {
            this.field3772 = 0;
        } else {
            this.field3772 = 2;
        }
    }

    @ObfuscatedName("kf.l(Lek;IB)Lek;")
    public class132 method4778(class132 arg0, int arg1) {
        int var3 = this.field3760[arg1];
        class143 var4 = method3539(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2466(true);
        } else {
            class132 var6 = arg0.method2466(!var4.method2827(var5));
            var6.method2526(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("kf.b(Lek;IIB)Lek;")
    public class132 method4795(class132 arg0, int arg1, int arg2) {
        int var4 = this.field3760[arg1];
        class143 var5 = method3539(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2466(true);
        }
        class132 var7 = arg0.method2466(!var5.method2827(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2498();
        } else if (var8 == 2) {
            var7.method2530();
        } else if (var8 == 3) {
            var7.method2476();
        }
        var7.method2526(var5, var6);
        if (var8 == 1) {
            var7.method2476();
        } else if (var8 == 2) {
            var7.method2530();
        } else if (var8 == 3) {
            var7.method2498();
        }
        return var7;
    }

    @ObfuscatedName("kf.e(Lek;IB)Lek;")
    public class132 method4790(class132 arg0, int arg1) {
        int var3 = this.field3760[arg1];
        class143 var4 = method3539(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2477(true);
        } else {
            class132 var6 = arg0.method2477(!var4.method2827(var5));
            var6.method2526(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("kf.x(Lek;ILkf;IB)Lek;")
    public class132 method4781(class132 arg0, int arg1, class288 arg2, int arg3) {
        int var5 = this.field3760[arg1];
        class143 var6 = method3539(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4778(arg0, arg3);
        }
        int var8 = arg2.field3760[arg3];
        class143 var9 = method3539(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class132 var11 = arg0.method2466(!var6.method2827(var7));
            var11.method2526(var6, var7);
            return var11;
        } else {
            class132 var12 = arg0.method2466(!var6.method2827(var7) & !var9.method2827(var10));
            var12.method2492(var6, var7, var9, var10, this.field3757);
            return var12;
        }
    }

    @ObfuscatedName("kf.p(Lek;IB)Lek;")
    public class132 method4782(class132 arg0, int arg1) {
        int var3 = this.field3760[arg1];
        class143 var4 = method3539(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2466(true);
        }
        class143 var6 = null;
        int var7 = 0;
        if (this.field3761 != null && arg1 < this.field3761.length) {
            int var8 = this.field3761[arg1];
            var6 = method3539(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class132 var10 = arg0.method2466(!var4.method2827(var5));
            var10.method2526(var4, var5);
            return var10;
        } else {
            class132 var9 = arg0.method2466(!var4.method2827(var5) & !var6.method2827(var7));
            var9.method2526(var4, var5);
            var9.method2526(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("gv.o(II)Let;")
    public static class143 method3539(int arg0) {
        class143 var1 = (class143) field3766.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class143 var2 = class143.method344(Statics.field3759, Statics.field3765, arg0, false);
        if (var2 != null) {
            field3766.method3627(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("fr.c(B)V")
    public static void method3053() {
        field3756.method3632();
        field3766.method3632();
    }
}
