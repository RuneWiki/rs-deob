package deob;

@ObfuscatedName("jo")
public class class281 extends class215 {

    @ObfuscatedName("jo.p")
    public static class210 field3682 = new class210(64);

    @ObfuscatedName("jo.a")
    public static class210 field3683 = new class210(100);

    @ObfuscatedName("jo.h")
    public int[] field3684;

    @ObfuscatedName("jo.l")
    public int[] field3679;

    @ObfuscatedName("jo.y")
    public int[] field3693;

    @ObfuscatedName("jo.g")
    public int[] field3687;

    @ObfuscatedName("jo.c")
    public int field3688 = -1;

    @ObfuscatedName("jo.u")
    public int[] field3689;

    @ObfuscatedName("jo.r")
    public boolean field3690 = false;

    @ObfuscatedName("jo.d")
    public int field3691 = 5;

    @ObfuscatedName("jo.v")
    public int field3681 = -1;

    @ObfuscatedName("jo.s")
    public int field3692 = -1;

    @ObfuscatedName("jo.t")
    public int field3694 = 99;

    @ObfuscatedName("jo.f")
    public int field3695 = -1;

    @ObfuscatedName("jo.m")
    public int field3696 = -1;

    @ObfuscatedName("jo.x")
    public int field3697 = 2;

    @ObfuscatedName("et.b(IB)Ljo;")
    public static class281 method2838(int arg0) {
        class281 var1 = (class281) field3682.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3685.method4158(12, arg0);
        class281 var3 = new class281();
        if (var2 != null) {
            var3.method4725(new class194(var2));
        }
        var3.method4727();
        field3682.method3659(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jo.q(Lgn;I)V")
    public void method4725(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4726(arg0, var2);
        }
    }

    @ObfuscatedName("jo.o(Lgn;II)V")
    public void method4726(class194 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3249();
            this.field3693 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3693[var4] = arg0.method3249();
            }
            this.field3684 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3684[var5] = arg0.method3249();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3684[var6] += arg0.method3249() << 16;
            }
        } else if (arg1 == 2) {
            this.field3688 = arg0.method3249();
        } else if (arg1 == 3) {
            int var7 = arg0.method3247();
            this.field3689 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3689[var8] = arg0.method3247();
            }
            this.field3689[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3690 = true;
        } else if (arg1 == 5) {
            this.field3691 = arg0.method3247();
        } else if (arg1 == 6) {
            this.field3681 = arg0.method3249();
        } else if (arg1 == 7) {
            this.field3692 = arg0.method3249();
        } else if (arg1 == 8) {
            this.field3694 = arg0.method3247();
        } else if (arg1 == 9) {
            this.field3695 = arg0.method3247();
        } else if (arg1 == 10) {
            this.field3696 = arg0.method3247();
        } else if (arg1 == 11) {
            this.field3697 = arg0.method3247();
        } else if (arg1 == 12) {
            int var9 = arg0.method3247();
            this.field3679 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3679[var10] = arg0.method3249();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3679[var11] += arg0.method3249() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3247();
            this.field3687 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3687[var13] = arg0.method3251();
            }
        }
    }

    @ObfuscatedName("jo.p(B)V")
    public void method4727() {
        if (this.field3695 == -1) {
            if (this.field3689 == null) {
                this.field3695 = 0;
            } else {
                this.field3695 = 2;
            }
        }
        if (this.field3696 != -1) {
            return;
        }
        if (this.field3689 == null) {
            this.field3696 = 0;
        } else {
            this.field3696 = 2;
        }
    }

    @ObfuscatedName("jo.a(Lee;II)Lee;")
    public class131 method4733(class131 arg0, int arg1) {
        int var3 = this.field3684[arg1];
        class142 var4 = method2933(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2491(true);
        } else {
            class131 var6 = arg0.method2491(!var4.method2834(var5));
            var6.method2506(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jo.h(Lee;IIB)Lee;")
    public class131 method4728(class131 arg0, int arg1, int arg2) {
        int var4 = this.field3684[arg1];
        class142 var5 = method2933(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2491(true);
        }
        class131 var7 = arg0.method2491(!var5.method2834(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2504();
        } else if (var8 == 2) {
            var7.method2545();
        } else if (var8 == 3) {
            var7.method2502();
        }
        var7.method2506(var5, var6);
        if (var8 == 1) {
            var7.method2502();
        } else if (var8 == 2) {
            var7.method2545();
        } else if (var8 == 3) {
            var7.method2504();
        }
        return var7;
    }

    @ObfuscatedName("jo.l(Lee;IB)Lee;")
    public class131 method4730(class131 arg0, int arg1) {
        int var3 = this.field3684[arg1];
        class142 var4 = method2933(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2492(true);
        } else {
            class131 var6 = arg0.method2492(!var4.method2834(var5));
            var6.method2506(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jo.y(Lee;ILjo;IB)Lee;")
    public class131 method4731(class131 arg0, int arg1, class281 arg2, int arg3) {
        int var5 = this.field3684[arg1];
        class142 var6 = method2933(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4733(arg0, arg3);
        }
        int var8 = arg2.field3684[arg3];
        class142 var9 = method2933(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class131 var11 = arg0.method2491(!var6.method2834(var7));
            var11.method2506(var6, var7);
            return var11;
        } else {
            class131 var12 = arg0.method2491(!var6.method2834(var7) & !var9.method2834(var10));
            var12.method2500(var6, var7, var9, var10, this.field3689);
            return var12;
        }
    }

    @ObfuscatedName("jo.g(Lee;II)Lee;")
    public class131 method4750(class131 arg0, int arg1) {
        int var3 = this.field3684[arg1];
        class142 var4 = method2933(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2491(true);
        }
        class142 var6 = null;
        int var7 = 0;
        if (this.field3679 != null && arg1 < this.field3679.length) {
            int var8 = this.field3679[arg1];
            var6 = method2933(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class131 var10 = arg0.method2491(!var4.method2834(var5));
            var10.method2506(var4, var5);
            return var10;
        } else {
            class131 var9 = arg0.method2491(!var4.method2834(var5) & !var6.method2834(var7));
            var9.method2506(var4, var5);
            var9.method2506(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fs.c(II)Lej;")
    public static class142 method2933(int arg0) {
        class142 var1 = (class142) field3683.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class256 var2 = Statics.field3680;
        class256 var3 = Statics.field3686;
        boolean var4 = true;
        int[] var5 = var2.method4222(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4168(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4168(var8, 0);
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
            field3683.method3659(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("im.u(I)V")
    public static void method4120() {
        field3682.method3661();
        field3683.method3661();
    }
}
