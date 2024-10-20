package deob;

@ObfuscatedName("is")
public class class259 extends class176 {

    @ObfuscatedName("is.p")
    public static class146 field3525 = new class146(64);

    @ObfuscatedName("is.k")
    public static class146 field3520 = new class146(100);

    @ObfuscatedName("is.l")
    public int[] field3521;

    @ObfuscatedName("is.b")
    public int[] field3531;

    @ObfuscatedName("is.i")
    public int[] field3523;

    @ObfuscatedName("is.c")
    public int[] field3524;

    @ObfuscatedName("is.f")
    public int field3516 = -1;

    @ObfuscatedName("is.m")
    public int[] field3519;

    @ObfuscatedName("is.u")
    public boolean field3527 = false;

    @ObfuscatedName("is.x")
    public int field3534 = 5;

    @ObfuscatedName("is.r")
    public int field3529 = -1;

    @ObfuscatedName("is.v")
    public int field3522 = -1;

    @ObfuscatedName("is.y")
    public int field3536 = 99;

    @ObfuscatedName("is.g")
    public int field3526 = -1;

    @ObfuscatedName("is.a")
    public int field3533 = -1;

    @ObfuscatedName("is.j")
    public int field3530 = 2;

    @ObfuscatedName("i.q(IB)Lis;")
    public static class259 method67(int arg0) {
        class259 var1 = (class259) field3525.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3528.method3775(12, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4374(new class301(var2));
        }
        var3.method4376();
        field3525.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.w(Lkf;B)V")
    public void method4374(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method4395(arg0, var2);
        }
    }

    @ObfuscatedName("is.e(Lkf;II)V")
    public void method4395(class301 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5069();
            this.field3523 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3523[var4] = arg0.method5069();
            }
            this.field3521 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3521[var5] = arg0.method5069();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3521[var6] += arg0.method5069() << 16;
            }
        } else if (arg1 == 2) {
            this.field3516 = arg0.method5069();
        } else if (arg1 == 3) {
            int var7 = arg0.method5077();
            this.field3519 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3519[var8] = arg0.method5077();
            }
            this.field3519[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3527 = true;
        } else if (arg1 == 5) {
            this.field3534 = arg0.method5077();
        } else if (arg1 == 6) {
            this.field3529 = arg0.method5069();
        } else if (arg1 == 7) {
            this.field3522 = arg0.method5069();
        } else if (arg1 == 8) {
            this.field3536 = arg0.method5077();
        } else if (arg1 == 9) {
            this.field3526 = arg0.method5077();
        } else if (arg1 == 10) {
            this.field3533 = arg0.method5077();
        } else if (arg1 == 11) {
            this.field3530 = arg0.method5077();
        } else if (arg1 == 12) {
            int var9 = arg0.method5077();
            this.field3531 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3531[var10] = arg0.method5069();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3531[var11] += arg0.method5069() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5077();
            this.field3524 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3524[var13] = arg0.method5140();
            }
        }
    }

    @ObfuscatedName("is.p(I)V")
    public void method4376() {
        if (this.field3526 == -1) {
            if (this.field3519 == null) {
                this.field3526 = 0;
            } else {
                this.field3526 = 2;
            }
        }
        if (this.field3533 != -1) {
            return;
        }
        if (this.field3519 == null) {
            this.field3533 = 0;
        } else {
            this.field3533 = 2;
        }
    }

    @ObfuscatedName("is.k(Ldm;II)Ldm;")
    public class128 method4399(class128 arg0, int arg1) {
        int var3 = this.field3521[arg1];
        class139 var4 = method481(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2602(true);
        } else {
            class128 var6 = arg0.method2602(!var4.method3002(var5));
            var6.method2631(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("is.l(Ldm;IIB)Ldm;")
    public class128 method4378(class128 arg0, int arg1, int arg2) {
        int var4 = this.field3521[arg1];
        class139 var5 = method481(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2602(true);
        }
        class128 var7 = arg0.method2602(!var5.method3002(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2614();
        } else if (var8 == 2) {
            var7.method2613();
        } else if (var8 == 3) {
            var7.method2612();
        }
        var7.method2631(var5, var6);
        if (var8 == 1) {
            var7.method2612();
        } else if (var8 == 2) {
            var7.method2613();
        } else if (var8 == 3) {
            var7.method2614();
        }
        return var7;
    }

    @ObfuscatedName("is.b(Ldm;II)Ldm;")
    public class128 method4402(class128 arg0, int arg1) {
        int var3 = this.field3521[arg1];
        class139 var4 = method481(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2603(true);
        } else {
            class128 var6 = arg0.method2603(!var4.method3002(var5));
            var6.method2631(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("is.i(Ldm;ILis;II)Ldm;")
    public class128 method4380(class128 arg0, int arg1, class259 arg2, int arg3) {
        int var5 = this.field3521[arg1];
        class139 var6 = method481(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4399(arg0, arg3);
        }
        int var8 = arg2.field3521[arg3];
        class139 var9 = method481(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class128 var11 = arg0.method2602(!var6.method3002(var7));
            var11.method2631(var6, var7);
            return var11;
        } else {
            class128 var12 = arg0.method2602(!var6.method3002(var7) & !var9.method3002(var10));
            var12.method2610(var6, var7, var9, var10, this.field3519);
            return var12;
        }
    }

    @ObfuscatedName("is.c(Ldm;II)Ldm;")
    public class128 method4382(class128 arg0, int arg1) {
        int var3 = this.field3521[arg1];
        class139 var4 = method481(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2602(true);
        }
        class139 var6 = null;
        int var7 = 0;
        if (this.field3531 != null && arg1 < this.field3531.length) {
            int var8 = this.field3531[arg1];
            var6 = method481(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class128 var10 = arg0.method2602(!var4.method3002(var5));
            var10.method2631(var4, var5);
            return var10;
        } else {
            class128 var9 = arg0.method2602(!var4.method3002(var5) & !var6.method3002(var7));
            var9.method2631(var4, var5);
            var9.method2631(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ad.u(IS)Lek;")
    public static class139 method481(int arg0) {
        class139 var1 = (class139) field3520.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class139 var2 = class139.method2996(Statics.field3517, Statics.field3518, arg0, false);
        if (var2 != null) {
            field3520.method3041(var2, (long) arg0);
        }
        return var2;
    }
}
