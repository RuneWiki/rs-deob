package deob;

@ObfuscatedName("iv")
public class class259 extends class176 {

    @ObfuscatedName("iv.q")
    public static class146 field3507 = new class146(64);

    @ObfuscatedName("iv.v")
    public static class146 field3508 = new class146(100);

    @ObfuscatedName("iv.l")
    public int[] field3521;

    @ObfuscatedName("iv.c")
    public int[] field3510;

    @ObfuscatedName("iv.o")
    public int[] field3511;

    @ObfuscatedName("iv.i")
    public int[] field3512;

    @ObfuscatedName("iv.d")
    public int field3513 = -1;

    @ObfuscatedName("iv.m")
    public int[] field3506;

    @ObfuscatedName("iv.p")
    public boolean field3515 = false;

    @ObfuscatedName("iv.h")
    public int field3520 = 5;

    @ObfuscatedName("iv.k")
    public int field3517 = -1;

    @ObfuscatedName("iv.x")
    public int field3518 = -1;

    @ObfuscatedName("iv.j")
    public int field3519 = 99;

    @ObfuscatedName("iv.r")
    public int field3505 = -1;

    @ObfuscatedName("iv.e")
    public int field3514 = -1;

    @ObfuscatedName("iv.s")
    public int field3522 = 2;

    @ObfuscatedName("gh.a(Lhq;Lhq;Lhq;I)V")
    public static void method3472(class234 arg0, class234 arg1, class234 arg2) {
        Statics.field3523 = arg0;
        Statics.field397 = arg1;
        Statics.field3516 = arg2;
    }

    @ObfuscatedName("hy.t(II)Liv;")
    public static class259 method3856(int arg0) {
        class259 var1 = (class259) field3507.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3523.method3873(12, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4451(new class300(var2));
        }
        var3.method4453();
        field3507.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.n(Lkc;I)V")
    public void method4451(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4462(arg0, var2);
        }
    }

    @ObfuscatedName("iv.q(Lkc;IB)V")
    public void method4462(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5166();
            this.field3511 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3511[var4] = arg0.method5166();
            }
            this.field3521 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3521[var5] = arg0.method5166();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3521[var6] += arg0.method5166() << 16;
            }
        } else if (arg1 == 2) {
            this.field3513 = arg0.method5166();
        } else if (arg1 == 3) {
            int var7 = arg0.method5123();
            this.field3506 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3506[var8] = arg0.method5123();
            }
            this.field3506[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3515 = true;
        } else if (arg1 == 5) {
            this.field3520 = arg0.method5123();
        } else if (arg1 == 6) {
            this.field3517 = arg0.method5166();
        } else if (arg1 == 7) {
            this.field3518 = arg0.method5166();
        } else if (arg1 == 8) {
            this.field3519 = arg0.method5123();
        } else if (arg1 == 9) {
            this.field3505 = arg0.method5123();
        } else if (arg1 == 10) {
            this.field3514 = arg0.method5123();
        } else if (arg1 == 11) {
            this.field3522 = arg0.method5123();
        } else if (arg1 == 12) {
            int var9 = arg0.method5123();
            this.field3510 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3510[var10] = arg0.method5166();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3510[var11] += arg0.method5166() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5123();
            this.field3512 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3512[var13] = arg0.method5127();
            }
        }
    }

    @ObfuscatedName("iv.v(S)V")
    public void method4453() {
        if (this.field3505 == -1) {
            if (this.field3506 == null) {
                this.field3505 = 0;
            } else {
                this.field3505 = 2;
            }
        }
        if (this.field3514 != -1) {
            return;
        }
        if (this.field3506 == null) {
            this.field3514 = 0;
        } else {
            this.field3514 = 2;
        }
    }

    @ObfuscatedName("iv.l(Ldv;IB)Ldv;")
    public class128 method4454(class128 arg0, int arg1) {
        int var3 = this.field3521[arg1];
        class139 var4 = method80(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2757(true);
        } else {
            class128 var6 = arg0.method2757(!var4.method3094(var5));
            var6.method2738(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("iv.c(Ldv;IIS)Ldv;")
    public class128 method4458(class128 arg0, int arg1, int arg2) {
        int var4 = this.field3521[arg1];
        class139 var5 = method80(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2757(true);
        }
        class128 var7 = arg0.method2757(!var5.method3094(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2743();
        } else if (var8 == 2) {
            var7.method2739();
        } else if (var8 == 3) {
            var7.method2741();
        }
        var7.method2738(var5, var6);
        if (var8 == 1) {
            var7.method2741();
        } else if (var8 == 2) {
            var7.method2739();
        } else if (var8 == 3) {
            var7.method2743();
        }
        return var7;
    }

    @ObfuscatedName("iv.o(Ldv;II)Ldv;")
    public class128 method4456(class128 arg0, int arg1) {
        int var3 = this.field3521[arg1];
        class139 var4 = method80(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2732(true);
        } else {
            class128 var6 = arg0.method2732(!var4.method3094(var5));
            var6.method2738(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("iv.i(Ldv;ILiv;II)Ldv;")
    public class128 method4468(class128 arg0, int arg1, class259 arg2, int arg3) {
        int var5 = this.field3521[arg1];
        class139 var6 = method80(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4454(arg0, arg3);
        }
        int var8 = arg2.field3521[arg3];
        class139 var9 = method80(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class128 var11 = arg0.method2757(!var6.method3094(var7));
            var11.method2738(var6, var7);
            return var11;
        } else {
            class128 var12 = arg0.method2757(!var6.method3094(var7) & !var9.method3094(var10));
            var12.method2796(var6, var7, var9, var10, this.field3506);
            return var12;
        }
    }

    @ObfuscatedName("iv.d(Ldv;II)Ldv;")
    public class128 method4476(class128 arg0, int arg1) {
        int var3 = this.field3521[arg1];
        class139 var4 = method80(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2757(true);
        }
        class139 var6 = null;
        int var7 = 0;
        if (this.field3510 != null && arg1 < this.field3510.length) {
            int var8 = this.field3510[arg1];
            var6 = method80(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class128 var10 = arg0.method2757(!var4.method3094(var5));
            var10.method2738(var4, var5);
            return var10;
        } else {
            class128 var9 = arg0.method2757(!var4.method3094(var5) & !var6.method3094(var7));
            var9.method2738(var4, var5);
            var9.method2738(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("c.m(IS)Lem;")
    public static class139 method80(int arg0) {
        class139 var1 = (class139) field3508.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class234 var2 = Statics.field397;
        class234 var3 = Statics.field3516;
        boolean var4 = true;
        int[] var5 = var2.method3887(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3881(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3881(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class139 var10;
        if (var4) {
            try {
                var10 = new class139(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3508.method3122(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("fs.p(I)V")
    public static void method3232() {
        field3507.method3123();
        field3508.method3123();
    }
}
