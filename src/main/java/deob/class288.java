package deob;

@ObfuscatedName("kn")
public class class288 extends class219 {

    @ObfuscatedName("kn.j")
    public static class213 field3752 = new class213(64);

    @ObfuscatedName("kn.k")
    public static class213 field3753 = new class213(100);

    @ObfuscatedName("kn.x")
    public int[] field3751;

    @ObfuscatedName("kn.z")
    public int[] field3749;

    @ObfuscatedName("kn.p")
    public int[] field3764;

    @ObfuscatedName("kn.w")
    public int[] field3760;

    @ObfuscatedName("kn.r")
    public int field3755 = -1;

    @ObfuscatedName("kn.d")
    public int[] field3756;

    @ObfuscatedName("kn.a")
    public boolean field3747 = false;

    @ObfuscatedName("kn.e")
    public int field3758 = 5;

    @ObfuscatedName("kn.f")
    public int field3759 = -1;

    @ObfuscatedName("kn.l")
    public int field3757 = -1;

    @ObfuscatedName("kn.m")
    public int field3761 = 99;

    @ObfuscatedName("kn.b")
    public int field3762 = -1;

    @ObfuscatedName("kn.h")
    public int field3763 = -1;

    @ObfuscatedName("kn.t")
    public int field3750 = 2;

    @ObfuscatedName("gr.c(IB)Lkn;")
    public static class288 method3535(int arg0) {
        class288 var1 = (class288) field3752.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field300.method4190(12, arg0);
        class288 var3 = new class288();
        if (var2 != null) {
            var3.method4799(new class195(var2));
        }
        var3.method4804();
        field3752.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kn.i(Lgp;I)V")
    public void method4799(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4800(arg0, var2);
        }
    }

    @ObfuscatedName("kn.o(Lgp;II)V")
    public void method4800(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3218();
            this.field3764 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3764[var4] = arg0.method3218();
            }
            this.field3751 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3751[var5] = arg0.method3218();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3751[var6] += arg0.method3218() << 16;
            }
        } else if (arg1 == 2) {
            this.field3755 = arg0.method3218();
        } else if (arg1 == 3) {
            int var7 = arg0.method3429();
            this.field3756 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3756[var8] = arg0.method3429();
            }
            this.field3756[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3747 = true;
        } else if (arg1 == 5) {
            this.field3758 = arg0.method3429();
        } else if (arg1 == 6) {
            this.field3759 = arg0.method3218();
        } else if (arg1 == 7) {
            this.field3757 = arg0.method3218();
        } else if (arg1 == 8) {
            this.field3761 = arg0.method3429();
        } else if (arg1 == 9) {
            this.field3762 = arg0.method3429();
        } else if (arg1 == 10) {
            this.field3763 = arg0.method3429();
        } else if (arg1 == 11) {
            this.field3750 = arg0.method3429();
        } else if (arg1 == 12) {
            int var9 = arg0.method3429();
            this.field3749 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3749[var10] = arg0.method3218();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3749[var11] += arg0.method3218() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3429();
            this.field3760 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3760[var13] = arg0.method3293();
            }
        }
    }

    @ObfuscatedName("kn.j(I)V")
    public void method4804() {
        if (this.field3762 == -1) {
            if (this.field3756 == null) {
                this.field3762 = 0;
            } else {
                this.field3762 = 2;
            }
        }
        if (this.field3763 != -1) {
            return;
        }
        if (this.field3756 == null) {
            this.field3763 = 0;
        } else {
            this.field3763 = 2;
        }
    }

    @ObfuscatedName("kn.k(Led;II)Led;")
    public class132 method4802(class132 arg0, int arg1) {
        int var3 = this.field3751[arg1];
        class143 var4 = method3927(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2551(true);
        } else {
            class132 var6 = arg0.method2551(!var4.method2861(var5));
            var6.method2547(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("kn.x(Led;III)Led;")
    public class132 method4803(class132 arg0, int arg1, int arg2) {
        int var4 = this.field3751[arg1];
        class143 var5 = method3927(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2551(true);
        }
        class132 var7 = arg0.method2551(!var5.method2861(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2533();
        } else if (var8 == 2) {
            var7.method2483();
        } else if (var8 == 3) {
            var7.method2482();
        }
        var7.method2547(var5, var6);
        if (var8 == 1) {
            var7.method2482();
        } else if (var8 == 2) {
            var7.method2483();
        } else if (var8 == 3) {
            var7.method2533();
        }
        return var7;
    }

    @ObfuscatedName("kn.z(Led;II)Led;")
    public class132 method4808(class132 arg0, int arg1) {
        int var3 = this.field3751[arg1];
        class143 var4 = method3927(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2503(true);
        } else {
            class132 var6 = arg0.method2503(!var4.method2861(var5));
            var6.method2547(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("kn.p(Led;ILkn;II)Led;")
    public class132 method4807(class132 arg0, int arg1, class288 arg2, int arg3) {
        int var5 = this.field3751[arg1];
        class143 var6 = method3927(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4802(arg0, arg3);
        }
        int var8 = arg2.field3751[arg3];
        class143 var9 = method3927(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class132 var11 = arg0.method2551(!var6.method2861(var7));
            var11.method2547(var6, var7);
            return var11;
        } else {
            class132 var12 = arg0.method2551(!var6.method2861(var7) & !var9.method2861(var10));
            var12.method2480(var6, var7, var9, var10, this.field3756);
            return var12;
        }
    }

    @ObfuscatedName("kn.w(Led;IB)Led;")
    public class132 method4806(class132 arg0, int arg1) {
        int var3 = this.field3751[arg1];
        class143 var4 = method3927(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2551(true);
        }
        class143 var6 = null;
        int var7 = 0;
        if (this.field3749 != null && arg1 < this.field3749.length) {
            int var8 = this.field3749[arg1];
            var6 = method3927(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class132 var10 = arg0.method2551(!var4.method2861(var5));
            var10.method2547(var4, var5);
            return var10;
        } else {
            class132 var9 = arg0.method2551(!var4.method2861(var5) & !var6.method2861(var7));
            var9.method2547(var4, var5);
            var9.method2547(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ht.r(II)Lee;")
    public static class143 method3927(int arg0) {
        class143 var1 = (class143) field3753.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class262 var2 = Statics.field3748;
        class262 var3 = Statics.field3754;
        boolean var4 = true;
        int[] var5 = var2.method4201(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4198(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4198(var8, 0);
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
            field3753.method3628(var10, (long) arg0);
        }
        return var10;
    }
}
