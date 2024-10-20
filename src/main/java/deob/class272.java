package deob;

@ObfuscatedName("je")
public class class272 extends class206 {

    @ObfuscatedName("je.h")
    public static class201 field3680 = new class201(64);

    @ObfuscatedName("je.i")
    public static class201 field3681 = new class201(100);

    @ObfuscatedName("je.w")
    public int[] field3689;

    @ObfuscatedName("je.t")
    public int[] field3683;

    @ObfuscatedName("je.d")
    public int[] field3684;

    @ObfuscatedName("je.z")
    public int[] field3685;

    @ObfuscatedName("je.k")
    public int field3690 = -1;

    @ObfuscatedName("je.c")
    public int[] field3677;

    @ObfuscatedName("je.o")
    public boolean field3688 = false;

    @ObfuscatedName("je.l")
    public int field3686 = 5;

    @ObfuscatedName("je.f")
    public int field3682 = -1;

    @ObfuscatedName("je.q")
    public int field3687 = -1;

    @ObfuscatedName("je.r")
    public int field3692 = 99;

    @ObfuscatedName("je.x")
    public int field3693 = -1;

    @ObfuscatedName("je.u")
    public int field3694 = -1;

    @ObfuscatedName("je.b")
    public int field3695 = 2;

    @ObfuscatedName("ih.s(II)Lje;")
    public static class272 method4180(int arg0) {
        class272 var1 = (class272) field3680.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3691.method4231(12, arg0);
        class272 var3 = new class272();
        if (var2 != null) {
            var3.method4745(new class185(var2));
        }
        var3.method4764();
        field3680.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.g(Lgy;I)V")
    public void method4745(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4746(arg0, var2);
        }
    }

    @ObfuscatedName("je.m(Lgy;II)V")
    public void method4746(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3241();
            this.field3684 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3684[var4] = arg0.method3241();
            }
            this.field3689 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3689[var5] = arg0.method3241();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3689[var6] += arg0.method3241() << 16;
            }
        } else if (arg1 == 2) {
            this.field3690 = arg0.method3241();
        } else if (arg1 == 3) {
            int var7 = arg0.method3239();
            this.field3677 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3677[var8] = arg0.method3239();
            }
            this.field3677[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3688 = true;
        } else if (arg1 == 5) {
            this.field3686 = arg0.method3239();
        } else if (arg1 == 6) {
            this.field3682 = arg0.method3241();
        } else if (arg1 == 7) {
            this.field3687 = arg0.method3241();
        } else if (arg1 == 8) {
            this.field3692 = arg0.method3239();
        } else if (arg1 == 9) {
            this.field3693 = arg0.method3239();
        } else if (arg1 == 10) {
            this.field3694 = arg0.method3239();
        } else if (arg1 == 11) {
            this.field3695 = arg0.method3239();
        } else if (arg1 == 12) {
            int var9 = arg0.method3239();
            this.field3683 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3683[var10] = arg0.method3241();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3683[var11] += arg0.method3241() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3239();
            this.field3685 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3685[var13] = arg0.method3243();
            }
        }
    }

    @ObfuscatedName("je.h(I)V")
    public void method4764() {
        if (this.field3693 == -1) {
            if (this.field3677 == null) {
                this.field3693 = 0;
            } else {
                this.field3693 = 2;
            }
        }
        if (this.field3694 != -1) {
            return;
        }
        if (this.field3677 == null) {
            this.field3694 = 0;
        } else {
            this.field3694 = 2;
        }
    }

    @ObfuscatedName("je.i(Les;II)Les;")
    public class131 method4748(class131 arg0, int arg1) {
        int var3 = this.field3689[arg1];
        class142 var4 = method19(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2545(true);
        } else {
            class131 var6 = arg0.method2545(!var4.method2920(var5));
            var6.method2531(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("je.w(Les;IIS)Les;")
    public class131 method4749(class131 arg0, int arg1, int arg2) {
        int var4 = this.field3689[arg1];
        class142 var5 = method19(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2545(true);
        }
        class131 var7 = arg0.method2545(!var5.method2920(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2536();
        } else if (var8 == 2) {
            var7.method2535();
        } else if (var8 == 3) {
            var7.method2534();
        }
        var7.method2531(var5, var6);
        if (var8 == 1) {
            var7.method2534();
        } else if (var8 == 2) {
            var7.method2535();
        } else if (var8 == 3) {
            var7.method2536();
        }
        return var7;
    }

    @ObfuscatedName("je.t(Les;IB)Les;")
    public class131 method4750(class131 arg0, int arg1) {
        int var3 = this.field3689[arg1];
        class142 var4 = method19(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2544(true);
        } else {
            class131 var6 = arg0.method2544(!var4.method2920(var5));
            var6.method2531(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("je.d(Les;ILje;IB)Les;")
    public class131 method4751(class131 arg0, int arg1, class272 arg2, int arg3) {
        int var5 = this.field3689[arg1];
        class142 var6 = method19(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4748(arg0, arg3);
        }
        int var8 = arg2.field3689[arg3];
        class142 var9 = method19(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class131 var11 = arg0.method2545(!var6.method2920(var7));
            var11.method2531(var6, var7);
            return var11;
        } else {
            class131 var12 = arg0.method2545(!var6.method2920(var7) & !var9.method2920(var10));
            var12.method2539(var6, var7, var9, var10, this.field3677);
            return var12;
        }
    }

    @ObfuscatedName("je.z(Les;II)Les;")
    public class131 method4752(class131 arg0, int arg1) {
        int var3 = this.field3689[arg1];
        class142 var4 = method19(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2545(true);
        }
        class142 var6 = null;
        int var7 = 0;
        if (this.field3683 != null && arg1 < this.field3683.length) {
            int var8 = this.field3683[arg1];
            var6 = method19(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class131 var10 = arg0.method2545(!var4.method2920(var5));
            var10.method2531(var4, var5);
            return var10;
        } else {
            class131 var9 = arg0.method2545(!var4.method2920(var5) & !var6.method2920(var7));
            var9.method2531(var4, var5);
            var9.method2531(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("t.k(IB)Lex;")
    public static class142 method19(int arg0) {
        class142 var1 = (class142) field3681.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class142 var2 = class142.method889(Statics.field3678, Statics.field3679, arg0, false);
        if (var2 != null) {
            field3681.method3675(var2, (long) arg0);
        }
        return var2;
    }
}
