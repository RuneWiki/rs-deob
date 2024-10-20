package deob;

@ObfuscatedName("jm")
public class class272 extends class206 {

    @ObfuscatedName("jm.s")
    public static class201 field3657 = new class201(64);

    @ObfuscatedName("jm.j")
    public static class201 field3659 = new class201(100);

    @ObfuscatedName("jm.a")
    public int[] field3660;

    @ObfuscatedName("jm.t")
    public int[] field3661;

    @ObfuscatedName("jm.r")
    public int[] field3670;

    @ObfuscatedName("jm.m")
    public int[] field3663;

    @ObfuscatedName("jm.h")
    public int field3664 = -1;

    @ObfuscatedName("jm.o")
    public int[] field3665;

    @ObfuscatedName("jm.x")
    public boolean field3666 = false;

    @ObfuscatedName("jm.q")
    public int field3667 = 5;

    @ObfuscatedName("jm.v")
    public int field3655 = -1;

    @ObfuscatedName("jm.n")
    public int field3656 = -1;

    @ObfuscatedName("jm.y")
    public int field3669 = 99;

    @ObfuscatedName("jm.d")
    public int field3671 = -1;

    @ObfuscatedName("jm.l")
    public int field3672 = -1;

    @ObfuscatedName("jm.f")
    public int field3673 = 2;

    @ObfuscatedName("db.p(II)Ljm;")
    public static class272 method2308(int arg0) {
        class272 var1 = (class272) field3657.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3658.method4032(12, arg0);
        class272 var3 = new class272();
        if (var2 != null) {
            var3.method4595(new class185(var2));
        }
        var3.method4597();
        field3657.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jm.i(Lgj;B)V")
    public void method4595(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4618(arg0, var2);
        }
    }

    @ObfuscatedName("jm.w(Lgj;II)V")
    public void method4618(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3124();
            this.field3670 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3670[var4] = arg0.method3124();
            }
            this.field3660 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3660[var5] = arg0.method3124();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3660[var6] += arg0.method3124() << 16;
            }
        } else if (arg1 == 2) {
            this.field3664 = arg0.method3124();
        } else if (arg1 == 3) {
            int var7 = arg0.method3197();
            this.field3665 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3665[var8] = arg0.method3197();
            }
            this.field3665[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3666 = true;
        } else if (arg1 == 5) {
            this.field3667 = arg0.method3197();
        } else if (arg1 == 6) {
            this.field3655 = arg0.method3124();
        } else if (arg1 == 7) {
            this.field3656 = arg0.method3124();
        } else if (arg1 == 8) {
            this.field3669 = arg0.method3197();
        } else if (arg1 == 9) {
            this.field3671 = arg0.method3197();
        } else if (arg1 == 10) {
            this.field3672 = arg0.method3197();
        } else if (arg1 == 11) {
            this.field3673 = arg0.method3197();
        } else if (arg1 == 12) {
            int var9 = arg0.method3197();
            this.field3661 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3661[var10] = arg0.method3124();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3661[var11] += arg0.method3124() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3197();
            this.field3663 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3663[var13] = arg0.method3138();
            }
        }
    }

    @ObfuscatedName("jm.s(I)V")
    public void method4597() {
        if (this.field3671 == -1) {
            if (this.field3665 == null) {
                this.field3671 = 0;
            } else {
                this.field3671 = 2;
            }
        }
        if (this.field3672 != -1) {
            return;
        }
        if (this.field3665 == null) {
            this.field3672 = 0;
        } else {
            this.field3672 = 2;
        }
    }

    @ObfuscatedName("jm.j(Len;II)Len;")
    public class131 method4605(class131 arg0, int arg1) {
        int var3 = this.field3660[arg1];
        class142 var4 = method4023(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2462(true);
        } else {
            class131 var6 = arg0.method2462(!var4.method2805(var5));
            var6.method2469(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jm.a(Len;III)Len;")
    public class131 method4599(class131 arg0, int arg1, int arg2) {
        int var4 = this.field3660[arg1];
        class142 var5 = method4023(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2462(true);
        }
        class131 var7 = arg0.method2462(!var5.method2805(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2474();
        } else if (var8 == 2) {
            var7.method2494();
        } else if (var8 == 3) {
            var7.method2472();
        }
        var7.method2469(var5, var6);
        if (var8 == 1) {
            var7.method2472();
        } else if (var8 == 2) {
            var7.method2494();
        } else if (var8 == 3) {
            var7.method2474();
        }
        return var7;
    }

    @ObfuscatedName("jm.t(Len;IB)Len;")
    public class131 method4600(class131 arg0, int arg1) {
        int var3 = this.field3660[arg1];
        class142 var4 = method4023(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2486(true);
        } else {
            class131 var6 = arg0.method2486(!var4.method2805(var5));
            var6.method2469(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jm.r(Len;ILjm;II)Len;")
    public class131 method4601(class131 arg0, int arg1, class272 arg2, int arg3) {
        int var5 = this.field3660[arg1];
        class142 var6 = method4023(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4605(arg0, arg3);
        }
        int var8 = arg2.field3660[arg3];
        class142 var9 = method4023(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class131 var11 = arg0.method2462(!var6.method2805(var7));
            var11.method2469(var6, var7);
            return var11;
        } else {
            class131 var12 = arg0.method2462(!var6.method2805(var7) & !var9.method2805(var10));
            var12.method2522(var6, var7, var9, var10, this.field3665);
            return var12;
        }
    }

    @ObfuscatedName("jm.m(Len;IB)Len;")
    public class131 method4598(class131 arg0, int arg1) {
        int var3 = this.field3660[arg1];
        class142 var4 = method4023(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2462(true);
        }
        class142 var6 = null;
        int var7 = 0;
        if (this.field3661 != null && arg1 < this.field3661.length) {
            int var8 = this.field3661[arg1];
            var6 = method4023(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class131 var10 = arg0.method2462(!var4.method2805(var5));
            var10.method2469(var4, var5);
            return var10;
        } else {
            class131 var9 = arg0.method2462(!var4.method2805(var5) & !var6.method2805(var7));
            var9.method2469(var4, var5);
            var9.method2469(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("iu.h(IB)Leq;")
    public static class142 method4023(int arg0) {
        class142 var1 = (class142) field3659.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class247 var2 = Statics.field3662;
        class247 var3 = Statics.field3668;
        boolean var4 = true;
        int[] var5 = var2.method4043(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4057(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4057(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class142 var10;
        if (var4) {
            try {
                var10 = new class142(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3659.method3506(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("ht.o(I)V")
    public static void method4004() {
        field3657.method3513();
        field3659.method3513();
    }
}
