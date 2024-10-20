package deob;

@ObfuscatedName("jd")
public class class262 extends class196 {

    @ObfuscatedName("jd.y")
    public static class191 field3602 = new class191(64);

    @ObfuscatedName("jd.w")
    public static class191 field3593 = new class191(100);

    @ObfuscatedName("jd.k")
    public int[] field3596;

    @ObfuscatedName("jd.v")
    public int[] field3611;

    @ObfuscatedName("jd.z")
    public int[] field3599;

    @ObfuscatedName("jd.r")
    public int[] field3600;

    @ObfuscatedName("jd.u")
    public int field3601 = -1;

    @ObfuscatedName("jd.d")
    public int[] field3598;

    @ObfuscatedName("jd.o")
    public boolean field3603 = false;

    @ObfuscatedName("jd.l")
    public int field3612 = 5;

    @ObfuscatedName("jd.h")
    public int field3605 = -1;

    @ObfuscatedName("jd.s")
    public int field3606 = -1;

    @ObfuscatedName("jd.c")
    public int field3597 = 99;

    @ObfuscatedName("jd.m")
    public int field3608 = -1;

    @ObfuscatedName("jd.a")
    public int field3609 = -1;

    @ObfuscatedName("jd.t")
    public int field3610 = 2;

    @ObfuscatedName("bt.e(II)Ljd;")
    public static class262 method1025(int arg0) {
        class262 var1 = (class262) field3602.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3607.method3817(12, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4396(new class175(var2));
        }
        var3.method4398();
        field3602.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.n(Lfh;I)V")
    public void method4396(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method4397(arg0, var2);
        }
    }

    @ObfuscatedName("jd.g(Lfh;II)V")
    public void method4397(class175 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3091();
            this.field3599 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3599[var4] = arg0.method3091();
            }
            this.field3596 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3596[var5] = arg0.method3091();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3596[var6] += arg0.method3091() << 16;
            }
        } else if (arg1 == 2) {
            this.field3601 = arg0.method3091();
        } else if (arg1 == 3) {
            int var7 = arg0.method2928();
            this.field3598 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3598[var8] = arg0.method2928();
            }
            this.field3598[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3603 = true;
        } else if (arg1 == 5) {
            this.field3612 = arg0.method2928();
        } else if (arg1 == 6) {
            this.field3605 = arg0.method3091();
        } else if (arg1 == 7) {
            this.field3606 = arg0.method3091();
        } else if (arg1 == 8) {
            this.field3597 = arg0.method2928();
        } else if (arg1 == 9) {
            this.field3608 = arg0.method2928();
        } else if (arg1 == 10) {
            this.field3609 = arg0.method2928();
        } else if (arg1 == 11) {
            this.field3610 = arg0.method2928();
        } else if (arg1 == 12) {
            int var9 = arg0.method2928();
            this.field3611 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3611[var10] = arg0.method3091();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3611[var11] += arg0.method3091() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2928();
            this.field3600 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3600[var13] = arg0.method2932();
            }
        }
    }

    @ObfuscatedName("jd.y(B)V")
    public void method4398() {
        if (this.field3608 == -1) {
            if (this.field3598 == null) {
                this.field3608 = 0;
            } else {
                this.field3608 = 2;
            }
        }
        if (this.field3609 != -1) {
            return;
        }
        if (this.field3598 == null) {
            this.field3609 = 0;
        } else {
            this.field3609 = 2;
        }
    }

    @ObfuscatedName("jd.w(Lew;II)Lew;")
    public class135 method4399(class135 arg0, int arg1) {
        int var3 = this.field3596[arg1];
        class146 var4 = method4337(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2409(true);
        } else {
            class135 var6 = arg0.method2409(!var4.method2703(var5));
            var6.method2324(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jd.k(Lew;IIS)Lew;")
    public class135 method4424(class135 arg0, int arg1, int arg2) {
        int var4 = this.field3596[arg1];
        class146 var5 = method4337(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2409(true);
        }
        class135 var7 = arg0.method2409(!var5.method2703(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2329();
        } else if (var8 == 2) {
            var7.method2315();
        } else if (var8 == 3) {
            var7.method2357();
        }
        var7.method2324(var5, var6);
        if (var8 == 1) {
            var7.method2357();
        } else if (var8 == 2) {
            var7.method2315();
        } else if (var8 == 3) {
            var7.method2329();
        }
        return var7;
    }

    @ObfuscatedName("jd.v(Lew;II)Lew;")
    public class135 method4401(class135 arg0, int arg1) {
        int var3 = this.field3596[arg1];
        class146 var4 = method4337(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2355(true);
        } else {
            class135 var6 = arg0.method2355(!var4.method2703(var5));
            var6.method2324(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jd.z(Lew;ILjd;II)Lew;")
    public class135 method4402(class135 arg0, int arg1, class262 arg2, int arg3) {
        int var5 = this.field3596[arg1];
        class146 var6 = method4337(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4399(arg0, arg3);
        }
        int var8 = arg2.field3596[arg3];
        class146 var9 = method4337(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class135 var11 = arg0.method2409(!var6.method2703(var7));
            var11.method2324(var6, var7);
            return var11;
        } else {
            class135 var12 = arg0.method2409(!var6.method2703(var7) & !var9.method2703(var10));
            var12.method2325(var6, var7, var9, var10, this.field3598);
            return var12;
        }
    }

    @ObfuscatedName("jd.r(Lew;II)Lew;")
    public class135 method4403(class135 arg0, int arg1) {
        int var3 = this.field3596[arg1];
        class146 var4 = method4337(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2409(true);
        }
        class146 var6 = null;
        int var7 = 0;
        if (this.field3611 != null && arg1 < this.field3611.length) {
            int var8 = this.field3611[arg1];
            var6 = method4337(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class135 var10 = arg0.method2409(!var4.method2703(var5));
            var10.method2324(var4, var5);
            return var10;
        } else {
            class135 var9 = arg0.method2409(!var4.method2703(var5) & !var6.method2703(var7));
            var9.method2324(var4, var5);
            var9.method2324(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ii.u(II)Lea;")
    public static class146 method4337(int arg0) {
        class146 var1 = (class146) field3593.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class237 var2 = Statics.field3594;
        class237 var3 = Statics.field318;
        boolean var4 = true;
        int[] var5 = var2.method3827(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3814(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3814(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class146 var10;
        if (var4) {
            try {
                var10 = new class146(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3593.method3278(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("cl.d(B)V")
    public static void method1567() {
        field3602.method3282();
        field3593.method3282();
    }
}
