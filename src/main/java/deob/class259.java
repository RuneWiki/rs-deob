package deob;

@ObfuscatedName("iv")
public class class259 extends class183 {

    @ObfuscatedName("iv.w")
    public static class155 field3481 = new class155(64);

    @ObfuscatedName("iv.p")
    public static class155 field3482 = new class155(100);

    @ObfuscatedName("iv.b")
    public int[] field3483;

    @ObfuscatedName("iv.e")
    public int[] field3484;

    @ObfuscatedName("iv.x")
    public int[] field3485;

    @ObfuscatedName("iv.a")
    public int[] field3486;

    @ObfuscatedName("iv.d")
    public int field3490 = -1;

    @ObfuscatedName("iv.c")
    public int[] field3488;

    @ObfuscatedName("iv.o")
    public boolean field3489 = false;

    @ObfuscatedName("iv.v")
    public int field3493 = 5;

    @ObfuscatedName("iv.k")
    public int field3491 = -1;

    @ObfuscatedName("iv.s")
    public int field3492 = -1;

    @ObfuscatedName("iv.l")
    public int field3497 = 99;

    @ObfuscatedName("iv.t")
    public int field3479 = -1;

    @ObfuscatedName("iv.j")
    public int field3494 = -1;

    @ObfuscatedName("iv.n")
    public int field3496 = 2;

    @ObfuscatedName("u.f(IB)Liv;")
    public static class259 method209(int arg0) {
        class259 var1 = (class259) field3481.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3498.method3752(12, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4397(new class300(var2));
        }
        var3.method4409();
        field3481.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.i(Lkq;I)V")
    public void method4397(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method4399(arg0, var2);
        }
    }

    @ObfuscatedName("iv.y(Lkq;II)V")
    public void method4399(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5112();
            this.field3485 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3485[var4] = arg0.method5112();
            }
            this.field3483 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3483[var5] = arg0.method5112();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3483[var6] += arg0.method5112() << 16;
            }
        } else if (arg1 == 2) {
            this.field3490 = arg0.method5112();
        } else if (arg1 == 3) {
            int var7 = arg0.method5110();
            this.field3488 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3488[var8] = arg0.method5110();
            }
            this.field3488[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3489 = true;
        } else if (arg1 == 5) {
            this.field3493 = arg0.method5110();
        } else if (arg1 == 6) {
            this.field3491 = arg0.method5112();
        } else if (arg1 == 7) {
            this.field3492 = arg0.method5112();
        } else if (arg1 == 8) {
            this.field3497 = arg0.method5110();
        } else if (arg1 == 9) {
            this.field3479 = arg0.method5110();
        } else if (arg1 == 10) {
            this.field3494 = arg0.method5110();
        } else if (arg1 == 11) {
            this.field3496 = arg0.method5110();
        } else if (arg1 == 12) {
            int var9 = arg0.method5110();
            this.field3484 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3484[var10] = arg0.method5112();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3484[var11] += arg0.method5112() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5110();
            this.field3486 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3486[var13] = arg0.method5226();
            }
        }
    }

    @ObfuscatedName("iv.w(I)V")
    public void method4409() {
        if (this.field3479 == -1) {
            if (this.field3488 == null) {
                this.field3479 = 0;
            } else {
                this.field3479 = 2;
            }
        }
        if (this.field3494 != -1) {
            return;
        }
        if (this.field3488 == null) {
            this.field3494 = 0;
        } else {
            this.field3494 = 2;
        }
    }

    @ObfuscatedName("iv.p(Ldw;II)Ldw;")
    public class128 method4417(class128 arg0, int arg1) {
        int var3 = this.field3483[arg1];
        class139 var4 = Statics.method38(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2631(true);
        } else {
            class128 var6 = arg0.method2631(!var4.method3015(var5));
            var6.method2692(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("iv.b(Ldw;III)Ldw;")
    public class128 method4402(class128 arg0, int arg1, int arg2) {
        int var4 = this.field3483[arg1];
        class139 var5 = Statics.method38(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2631(true);
        }
        class128 var7 = arg0.method2631(!var5.method3015(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2644();
        } else if (var8 == 2) {
            var7.method2689();
        } else if (var8 == 3) {
            var7.method2663();
        }
        var7.method2692(var5, var6);
        if (var8 == 1) {
            var7.method2663();
        } else if (var8 == 2) {
            var7.method2689();
        } else if (var8 == 3) {
            var7.method2644();
        }
        return var7;
    }

    @ObfuscatedName("iv.e(Ldw;II)Ldw;")
    public class128 method4401(class128 arg0, int arg1) {
        int var3 = this.field3483[arg1];
        class139 var4 = Statics.method38(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2632(true);
        } else {
            class128 var6 = arg0.method2632(!var4.method3015(var5));
            var6.method2692(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("iv.x(Ldw;ILiv;IB)Ldw;")
    public class128 method4404(class128 arg0, int arg1, class259 arg2, int arg3) {
        int var5 = this.field3483[arg1];
        class139 var6 = Statics.method38(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4417(arg0, arg3);
        }
        int var8 = arg2.field3483[arg3];
        class139 var9 = Statics.method38(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class128 var11 = arg0.method2631(!var6.method3015(var7));
            var11.method2692(var6, var7);
            return var11;
        } else {
            class128 var12 = arg0.method2631(!var6.method3015(var7) & !var9.method3015(var10));
            var12.method2633(var6, var7, var9, var10, this.field3488);
            return var12;
        }
    }

    @ObfuscatedName("iv.a(Ldw;IB)Ldw;")
    public class128 method4420(class128 arg0, int arg1) {
        int var3 = this.field3483[arg1];
        class139 var4 = Statics.method38(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2631(true);
        }
        class139 var6 = null;
        int var7 = 0;
        if (this.field3484 != null && arg1 < this.field3484.length) {
            int var8 = this.field3484[arg1];
            var6 = Statics.method38(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class128 var10 = arg0.method2631(!var4.method3015(var5));
            var10.method2692(var4, var5);
            return var10;
        } else {
            class128 var9 = arg0.method2631(!var4.method3015(var5) & !var6.method3015(var7));
            var9.method2692(var4, var5);
            var9.method2692(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("kt.c(I)V")
    public static void method4882() {
        field3481.method3102();
        field3482.method3102();
    }
}
