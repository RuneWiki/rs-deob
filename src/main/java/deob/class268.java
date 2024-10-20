package deob;

@ObfuscatedName("jf")
public class class268 extends class202 {

    @ObfuscatedName("jf.j")
    public static class197 field3658 = new class197(64);

    @ObfuscatedName("jf.v")
    public static class197 field3669 = new class197(100);

    @ObfuscatedName("jf.x")
    public int[] field3660;

    @ObfuscatedName("jf.e")
    public int[] field3670;

    @ObfuscatedName("jf.l")
    public int[] field3662;

    @ObfuscatedName("jf.b")
    public int[] field3663;

    @ObfuscatedName("jf.n")
    public int field3664 = -1;

    @ObfuscatedName("jf.c")
    public int[] field3665;

    @ObfuscatedName("jf.a")
    public boolean field3657 = false;

    @ObfuscatedName("jf.y")
    public int field3667 = 5;

    @ObfuscatedName("jf.w")
    public int field3659 = -1;

    @ObfuscatedName("jf.k")
    public int field3661 = -1;

    @ObfuscatedName("jf.t")
    public int field3673 = 99;

    @ObfuscatedName("jf.h")
    public int field3671 = -1;

    @ObfuscatedName("jf.u")
    public int field3672 = -1;

    @ObfuscatedName("jf.r")
    public int field3656 = 2;

    @ObfuscatedName("dw.m(II)Ljf;")
    public static class268 method2289(int arg0) {
        class268 var1 = (class268) field3658.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field18.method3930(12, arg0);
        class268 var3 = new class268();
        if (var2 != null) {
            var3.method4511(new class181(var2));
        }
        var3.method4505();
        field3658.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jf.p(Lfv;S)V")
    public void method4511(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4520(arg0, var2);
        }
    }

    @ObfuscatedName("jf.i(Lfv;IB)V")
    public void method4520(class181 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3009();
            this.field3662 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3662[var4] = arg0.method3009();
            }
            this.field3660 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3660[var5] = arg0.method3009();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3660[var6] += arg0.method3009() << 16;
            }
        } else if (arg1 == 2) {
            this.field3664 = arg0.method3009();
        } else if (arg1 == 3) {
            int var7 = arg0.method3012();
            this.field3665 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3665[var8] = arg0.method3012();
            }
            this.field3665[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3657 = true;
        } else if (arg1 == 5) {
            this.field3667 = arg0.method3012();
        } else if (arg1 == 6) {
            this.field3659 = arg0.method3009();
        } else if (arg1 == 7) {
            this.field3661 = arg0.method3009();
        } else if (arg1 == 8) {
            this.field3673 = arg0.method3012();
        } else if (arg1 == 9) {
            this.field3671 = arg0.method3012();
        } else if (arg1 == 10) {
            this.field3672 = arg0.method3012();
        } else if (arg1 == 11) {
            this.field3656 = arg0.method3012();
        } else if (arg1 == 12) {
            int var9 = arg0.method3012();
            this.field3670 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3670[var10] = arg0.method3009();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3670[var11] += arg0.method3009() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3012();
            this.field3663 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3663[var13] = arg0.method3075();
            }
        }
    }

    @ObfuscatedName("jf.j(B)V")
    public void method4505() {
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

    @ObfuscatedName("jf.v(Len;II)Len;")
    public class133 method4506(class133 arg0, int arg1) {
        int var3 = this.field3660[arg1];
        class144 var4 = method22(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2409(true);
        } else {
            class133 var6 = arg0.method2409(!var4.method2744(var5));
            var6.method2389(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jf.x(Len;IIB)Len;")
    public class133 method4507(class133 arg0, int arg1, int arg2) {
        int var4 = this.field3660[arg1];
        class144 var5 = method22(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2409(true);
        }
        class133 var7 = arg0.method2409(!var5.method2744(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2423();
        } else if (var8 == 2) {
            var7.method2406();
        } else if (var8 == 3) {
            var7.method2446();
        }
        var7.method2389(var5, var6);
        if (var8 == 1) {
            var7.method2446();
        } else if (var8 == 2) {
            var7.method2406();
        } else if (var8 == 3) {
            var7.method2423();
        }
        return var7;
    }

    @ObfuscatedName("jf.e(Len;II)Len;")
    public class133 method4508(class133 arg0, int arg1) {
        int var3 = this.field3660[arg1];
        class144 var4 = method22(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2382(true);
        } else {
            class133 var6 = arg0.method2382(!var4.method2744(var5));
            var6.method2389(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jf.l(Len;ILjf;IB)Len;")
    public class133 method4509(class133 arg0, int arg1, class268 arg2, int arg3) {
        int var5 = this.field3660[arg1];
        class144 var6 = method22(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4506(arg0, arg3);
        }
        int var8 = arg2.field3660[arg3];
        class144 var9 = method22(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class133 var11 = arg0.method2409(!var6.method2744(var7));
            var11.method2389(var6, var7);
            return var11;
        } else {
            class133 var12 = arg0.method2409(!var6.method2744(var7) & !var9.method2744(var10));
            var12.method2390(var6, var7, var9, var10, this.field3665);
            return var12;
        }
    }

    @ObfuscatedName("jf.b(Len;IB)Len;")
    public class133 method4510(class133 arg0, int arg1) {
        int var3 = this.field3660[arg1];
        class144 var4 = method22(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2409(true);
        }
        class144 var6 = null;
        int var7 = 0;
        if (this.field3670 != null && arg1 < this.field3670.length) {
            int var8 = this.field3670[arg1];
            var6 = method22(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class133 var10 = arg0.method2409(!var4.method2744(var5));
            var10.method2389(var4, var5);
            return var10;
        } else {
            class133 var9 = arg0.method2409(!var4.method2744(var5) & !var6.method2744(var7));
            var9.method2389(var4, var5);
            var9.method2389(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("e.n(II)Lez;")
    public static class144 method22(int arg0) {
        class144 var1 = (class144) field3669.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class243 var2 = Statics.field3668;
        class243 var3 = Statics.field3666;
        boolean var4 = true;
        int[] var5 = var2.method3936(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3937(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3937(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class144 var10;
        if (var4) {
            try {
                var10 = new class144(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3669.method3418(var10, (long) arg0);
        }
        return var10;
    }
}
