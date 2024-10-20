package deob;

@ObfuscatedName("iy")
public class class259 extends class176 {

    @ObfuscatedName("iy.g")
    public static class146 field3519 = new class146(64);

    @ObfuscatedName("iy.z")
    public static class146 field3520 = new class146(100);

    @ObfuscatedName("iy.p")
    public int[] field3521;

    @ObfuscatedName("iy.h")
    public int[] field3522;

    @ObfuscatedName("iy.y")
    public int[] field3523;

    @ObfuscatedName("iy.w")
    public int[] field3518;

    @ObfuscatedName("iy.i")
    public int field3525 = -1;

    @ObfuscatedName("iy.k")
    public int[] field3526;

    @ObfuscatedName("iy.x")
    public boolean field3524 = false;

    @ObfuscatedName("iy.o")
    public int field3528 = 5;

    @ObfuscatedName("iy.e")
    public int field3529 = -1;

    @ObfuscatedName("iy.n")
    public int field3527 = -1;

    @ObfuscatedName("iy.r")
    public int field3517 = 99;

    @ObfuscatedName("iy.c")
    public int field3532 = -1;

    @ObfuscatedName("iy.a")
    public int field3516 = -1;

    @ObfuscatedName("iy.d")
    public int field3534 = 2;

    @ObfuscatedName("ch.u(Lhf;Lhf;Lhf;I)V")
    public static void method1900(class234 arg0, class234 arg1, class234 arg2) {
        Statics.field3533 = arg0;
        Statics.field3531 = arg1;
        Statics.field3530 = arg2;
    }

    @ObfuscatedName("o.f(II)Liy;")
    public static class259 method154(int arg0) {
        class259 var1 = (class259) field3519.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3533.method3928(12, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4471(new class300(var2));
        }
        var3.method4468();
        field3519.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.b(Lkg;B)V")
    public void method4471(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4446(arg0, var2);
        }
    }

    @ObfuscatedName("iy.g(Lkg;II)V")
    public void method4446(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5337();
            this.field3523 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3523[var4] = arg0.method5337();
            }
            this.field3521 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3521[var5] = arg0.method5337();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3521[var6] += arg0.method5337() << 16;
            }
        } else if (arg1 == 2) {
            this.field3525 = arg0.method5337();
        } else if (arg1 == 3) {
            int var7 = arg0.method5138();
            this.field3526 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3526[var8] = arg0.method5138();
            }
            this.field3526[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3524 = true;
        } else if (arg1 == 5) {
            this.field3528 = arg0.method5138();
        } else if (arg1 == 6) {
            this.field3529 = arg0.method5337();
        } else if (arg1 == 7) {
            this.field3527 = arg0.method5337();
        } else if (arg1 == 8) {
            this.field3517 = arg0.method5138();
        } else if (arg1 == 9) {
            this.field3532 = arg0.method5138();
        } else if (arg1 == 10) {
            this.field3516 = arg0.method5138();
        } else if (arg1 == 11) {
            this.field3534 = arg0.method5138();
        } else if (arg1 == 12) {
            int var9 = arg0.method5138();
            this.field3522 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3522[var10] = arg0.method5337();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3522[var11] += arg0.method5337() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5138();
            this.field3518 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3518[var13] = arg0.method5287();
            }
        }
    }

    @ObfuscatedName("iy.z(B)V")
    public void method4468() {
        if (this.field3532 == -1) {
            if (this.field3526 == null) {
                this.field3532 = 0;
            } else {
                this.field3532 = 2;
            }
        }
        if (this.field3516 != -1) {
            return;
        }
        if (this.field3526 == null) {
            this.field3516 = 0;
        } else {
            this.field3516 = 2;
        }
    }

    @ObfuscatedName("iy.p(Ldf;IB)Ldf;")
    public class128 method4448(class128 arg0, int arg1) {
        int var3 = this.field3521[arg1];
        class139 var4 = method723(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2636(true);
        } else {
            class128 var6 = arg0.method2636(!var4.method3042(var5));
            var6.method2644(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("iy.h(Ldf;III)Ldf;")
    public class128 method4456(class128 arg0, int arg1, int arg2) {
        int var4 = this.field3521[arg1];
        class139 var5 = method723(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2636(true);
        }
        class128 var7 = arg0.method2636(!var5.method3042(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2649();
        } else if (var8 == 2) {
            var7.method2648();
        } else if (var8 == 3) {
            var7.method2643();
        }
        var7.method2644(var5, var6);
        if (var8 == 1) {
            var7.method2643();
        } else if (var8 == 2) {
            var7.method2648();
        } else if (var8 == 3) {
            var7.method2649();
        }
        return var7;
    }

    @ObfuscatedName("iy.y(Ldf;II)Ldf;")
    public class128 method4450(class128 arg0, int arg1) {
        int var3 = this.field3521[arg1];
        class139 var4 = method723(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2637(true);
        } else {
            class128 var6 = arg0.method2637(!var4.method3042(var5));
            var6.method2644(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("iy.w(Ldf;ILiy;IS)Ldf;")
    public class128 method4449(class128 arg0, int arg1, class259 arg2, int arg3) {
        int var5 = this.field3521[arg1];
        class139 var6 = method723(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4448(arg0, arg3);
        }
        int var8 = arg2.field3521[arg3];
        class139 var9 = method723(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class128 var11 = arg0.method2636(!var6.method3042(var7));
            var11.method2644(var6, var7);
            return var11;
        } else {
            class128 var12 = arg0.method2636(!var6.method3042(var7) & !var9.method3042(var10));
            var12.method2673(var6, var7, var9, var10, this.field3526);
            return var12;
        }
    }

    @ObfuscatedName("iy.i(Ldf;II)Ldf;")
    public class128 method4447(class128 arg0, int arg1) {
        int var3 = this.field3521[arg1];
        class139 var4 = method723(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2636(true);
        }
        class139 var6 = null;
        int var7 = 0;
        if (this.field3522 != null && arg1 < this.field3522.length) {
            int var8 = this.field3522[arg1];
            var6 = method723(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class128 var10 = arg0.method2636(!var4.method3042(var5));
            var10.method2644(var4, var5);
            return var10;
        } else {
            class128 var9 = arg0.method2636(!var4.method3042(var5) & !var6.method3042(var7));
            var9.method2644(var4, var5);
            var9.method2644(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ax.k(II)Ler;")
    public static class139 method723(int arg0) {
        class139 var1 = (class139) field3520.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class234 var2 = Statics.field3531;
        class234 var3 = Statics.field3530;
        boolean var4 = true;
        int[] var5 = var2.method3854(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3851(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3851(var8, 0);
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
            field3520.method3078(var10, (long) arg0);
        }
        return var10;
    }
}
