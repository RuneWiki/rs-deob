package deob;

@ObfuscatedName("iw")
public class class259 extends class176 {

    @ObfuscatedName("iw.g")
    public static class146 field3488 = new class146(64);

    @ObfuscatedName("iw.l")
    public static class146 field3500 = new class146(100);

    @ObfuscatedName("iw.u")
    public int[] field3490;

    @ObfuscatedName("iw.j")
    public int[] field3491;

    @ObfuscatedName("iw.v")
    public int[] field3485;

    @ObfuscatedName("iw.d")
    public int[] field3501;

    @ObfuscatedName("iw.z")
    public int field3494 = -1;

    @ObfuscatedName("iw.n")
    public int[] field3495;

    @ObfuscatedName("iw.h")
    public boolean field3496 = false;

    @ObfuscatedName("iw.f")
    public int field3505 = 5;

    @ObfuscatedName("iw.s")
    public int field3498 = -1;

    @ObfuscatedName("iw.p")
    public int field3499 = -1;

    @ObfuscatedName("iw.e")
    public int field3493 = 99;

    @ObfuscatedName("iw.i")
    public int field3497 = -1;

    @ObfuscatedName("iw.q")
    public int field3502 = -1;

    @ObfuscatedName("iw.y")
    public int field3503 = 2;

    @ObfuscatedName("cr.c(II)Liw;")
    public static class259 method1897(int arg0) {
        class259 var1 = (class259) field3488.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3489.method3825(12, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4443(new class300(var2));
        }
        var3.method4457();
        field3488.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.x(Lkz;I)V")
    public void method4443(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4439(arg0, var2);
        }
    }

    @ObfuscatedName("iw.t(Lkz;II)V")
    public void method4439(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5304();
            this.field3485 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3485[var4] = arg0.method5304();
            }
            this.field3490 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3490[var5] = arg0.method5304();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3490[var6] += arg0.method5304() << 16;
            }
        } else if (arg1 == 2) {
            this.field3494 = arg0.method5304();
        } else if (arg1 == 3) {
            int var7 = arg0.method5103();
            this.field3495 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3495[var8] = arg0.method5103();
            }
            this.field3495[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3496 = true;
        } else if (arg1 == 5) {
            this.field3505 = arg0.method5103();
        } else if (arg1 == 6) {
            this.field3498 = arg0.method5304();
        } else if (arg1 == 7) {
            this.field3499 = arg0.method5304();
        } else if (arg1 == 8) {
            this.field3493 = arg0.method5103();
        } else if (arg1 == 9) {
            this.field3497 = arg0.method5103();
        } else if (arg1 == 10) {
            this.field3502 = arg0.method5103();
        } else if (arg1 == 11) {
            this.field3503 = arg0.method5103();
        } else if (arg1 == 12) {
            int var9 = arg0.method5103();
            this.field3491 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3491[var10] = arg0.method5304();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3491[var11] += arg0.method5304() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5103();
            this.field3501 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3501[var13] = arg0.method5107();
            }
        }
    }

    @ObfuscatedName("iw.g(I)V")
    public void method4457() {
        if (this.field3497 == -1) {
            if (this.field3495 == null) {
                this.field3497 = 0;
            } else {
                this.field3497 = 2;
            }
        }
        if (this.field3502 != -1) {
            return;
        }
        if (this.field3495 == null) {
            this.field3502 = 0;
        } else {
            this.field3502 = 2;
        }
    }

    @ObfuscatedName("iw.l(Ldr;II)Ldr;")
    public class128 method4441(class128 arg0, int arg1) {
        int var3 = this.field3490[arg1];
        class139 var4 = method3317(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2631(true);
        } else {
            class128 var6 = arg0.method2631(!var4.method3023(var5));
            var6.method2639(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("iw.u(Ldr;III)Ldr;")
    public class128 method4442(class128 arg0, int arg1, int arg2) {
        int var4 = this.field3490[arg1];
        class139 var5 = method3317(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2631(true);
        }
        class128 var7 = arg0.method2631(!var5.method3023(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2678();
        } else if (var8 == 2) {
            var7.method2679();
        } else if (var8 == 3) {
            var7.method2642();
        }
        var7.method2639(var5, var6);
        if (var8 == 1) {
            var7.method2642();
        } else if (var8 == 2) {
            var7.method2679();
        } else if (var8 == 3) {
            var7.method2678();
        }
        return var7;
    }

    @ObfuscatedName("iw.j(Ldr;II)Ldr;")
    public class128 method4452(class128 arg0, int arg1) {
        int var3 = this.field3490[arg1];
        class139 var4 = method3317(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2667(true);
        } else {
            class128 var6 = arg0.method2667(!var4.method3023(var5));
            var6.method2639(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("iw.v(Ldr;ILiw;II)Ldr;")
    public class128 method4444(class128 arg0, int arg1, class259 arg2, int arg3) {
        int var5 = this.field3490[arg1];
        class139 var6 = method3317(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4441(arg0, arg3);
        }
        int var8 = arg2.field3490[arg3];
        class139 var9 = method3317(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class128 var11 = arg0.method2631(!var6.method3023(var7));
            var11.method2639(var6, var7);
            return var11;
        } else {
            class128 var12 = arg0.method2631(!var6.method3023(var7) & !var9.method3023(var10));
            var12.method2630(var6, var7, var9, var10, this.field3495);
            return var12;
        }
    }

    @ObfuscatedName("iw.d(Ldr;II)Ldr;")
    public class128 method4445(class128 arg0, int arg1) {
        int var3 = this.field3490[arg1];
        class139 var4 = method3317(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2631(true);
        }
        class139 var6 = null;
        int var7 = 0;
        if (this.field3491 != null && arg1 < this.field3491.length) {
            int var8 = this.field3491[arg1];
            var6 = method3317(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class128 var10 = arg0.method2631(!var4.method3023(var5));
            var10.method2639(var4, var5);
            return var10;
        } else {
            class128 var9 = arg0.method2631(!var4.method3023(var5) & !var6.method3023(var7));
            var9.method2639(var4, var5);
            var9.method2639(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fu.z(II)Lev;")
    public static class139 method3317(int arg0) {
        class139 var1 = (class139) field3500.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class139 var2 = class139.method726(Statics.field3486, Statics.field3487, arg0, false);
        if (var2 != null) {
            field3500.method3062(var2, (long) arg0);
        }
        return var2;
    }
}
