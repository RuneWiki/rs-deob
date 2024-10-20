package deob;

@ObfuscatedName("jh")
public class class270 extends class181 {

    @ObfuscatedName("jh.w")
    public static class146 field3592 = new class146(64);

    @ObfuscatedName("jh.o")
    public static class146 field3586 = new class146(100);

    @ObfuscatedName("jh.u")
    public int[] field3587;

    @ObfuscatedName("jh.g")
    public int[] field3588;

    @ObfuscatedName("jh.l")
    public int[] field3589;

    @ObfuscatedName("jh.e")
    public int[] field3590;

    @ObfuscatedName("jh.x")
    public int field3591 = -1;

    @ObfuscatedName("jh.d")
    public int[] field3596;

    @ObfuscatedName("jh.k")
    public boolean field3594 = false;

    @ObfuscatedName("jh.n")
    public int field3585 = 5;

    @ObfuscatedName("jh.i")
    public int field3595 = -1;

    @ObfuscatedName("jh.a")
    public int field3584 = -1;

    @ObfuscatedName("jh.z")
    public int field3597 = 99;

    @ObfuscatedName("jh.j")
    public int field3598 = -1;

    @ObfuscatedName("jh.s")
    public int field3593 = -1;

    @ObfuscatedName("jh.t")
    public int field3600 = 2;

    @ObfuscatedName("ae.m(II)Ljh;")
    public static class270 method596(int arg0) {
        class270 var1 = (class270) field3592.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3582.method4156(12, arg0);
        class270 var3 = new class270();
        if (var2 != null) {
            var3.method4765(new class202(var2));
        }
        var3.method4767();
        field3592.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.f(Lgr;S)V")
    public void method4765(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4766(arg0, var2);
        }
    }

    @ObfuscatedName("jh.q(Lgr;II)V")
    public void method4766(class202 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3530();
            this.field3589 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3589[var4] = arg0.method3530();
            }
            this.field3587 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3587[var5] = arg0.method3530();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3587[var6] += arg0.method3530() << 16;
            }
        } else if (arg1 == 2) {
            this.field3591 = arg0.method3530();
        } else if (arg1 == 3) {
            int var7 = arg0.method3551();
            this.field3596 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3596[var8] = arg0.method3551();
            }
            this.field3596[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3594 = true;
        } else if (arg1 == 5) {
            this.field3585 = arg0.method3551();
        } else if (arg1 == 6) {
            this.field3595 = arg0.method3530();
        } else if (arg1 == 7) {
            this.field3584 = arg0.method3530();
        } else if (arg1 == 8) {
            this.field3597 = arg0.method3551();
        } else if (arg1 == 9) {
            this.field3598 = arg0.method3551();
        } else if (arg1 == 10) {
            this.field3593 = arg0.method3551();
        } else if (arg1 == 11) {
            this.field3600 = arg0.method3551();
        } else if (arg1 == 12) {
            int var9 = arg0.method3551();
            this.field3588 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3588[var10] = arg0.method3530();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3588[var11] += arg0.method3530() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3551();
            this.field3590 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3590[var13] = arg0.method3421();
            }
        }
    }

    @ObfuscatedName("jh.w(B)V")
    public void method4767() {
        if (this.field3598 == -1) {
            if (this.field3596 == null) {
                this.field3598 = 0;
            } else {
                this.field3598 = 2;
            }
        }
        if (this.field3593 != -1) {
            return;
        }
        if (this.field3596 == null) {
            this.field3593 = 0;
        } else {
            this.field3593 = 2;
        }
    }

    @ObfuscatedName("jh.o(Ldu;II)Ldu;")
    public class128 method4768(class128 arg0, int arg1) {
        int var3 = this.field3587[arg1];
        class139 var4 = method1033(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2647(true);
        } else {
            class128 var6 = arg0.method2647(!var4.method2981(var5));
            var6.method2627(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jh.u(Ldu;IIB)Ldu;")
    public class128 method4769(class128 arg0, int arg1, int arg2) {
        int var4 = this.field3587[arg1];
        class139 var5 = method1033(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2647(true);
        }
        class128 var7 = arg0.method2647(!var5.method2981(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2632();
        } else if (var8 == 2) {
            var7.method2631();
        } else if (var8 == 3) {
            var7.method2660();
        }
        var7.method2627(var5, var6);
        if (var8 == 1) {
            var7.method2660();
        } else if (var8 == 2) {
            var7.method2631();
        } else if (var8 == 3) {
            var7.method2632();
        }
        return var7;
    }

    @ObfuscatedName("jh.g(Ldu;II)Ldu;")
    public class128 method4770(class128 arg0, int arg1) {
        int var3 = this.field3587[arg1];
        class139 var4 = method1033(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2620(true);
        } else {
            class128 var6 = arg0.method2620(!var4.method2981(var5));
            var6.method2627(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jh.l(Ldu;ILjh;II)Ldu;")
    public class128 method4787(class128 arg0, int arg1, class270 arg2, int arg3) {
        int var5 = this.field3587[arg1];
        class139 var6 = method1033(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4768(arg0, arg3);
        }
        int var8 = arg2.field3587[arg3];
        class139 var9 = method1033(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class128 var11 = arg0.method2647(!var6.method2981(var7));
            var11.method2627(var6, var7);
            return var11;
        } else {
            class128 var12 = arg0.method2647(!var6.method2981(var7) & !var9.method2981(var10));
            var12.method2628(var6, var7, var9, var10, this.field3596);
            return var12;
        }
    }

    @ObfuscatedName("jh.e(Ldu;II)Ldu;")
    public class128 method4771(class128 arg0, int arg1) {
        int var3 = this.field3587[arg1];
        class139 var4 = method1033(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2647(true);
        }
        class139 var6 = null;
        int var7 = 0;
        if (this.field3588 != null && arg1 < this.field3588.length) {
            int var8 = this.field3588[arg1];
            var6 = method1033(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class128 var10 = arg0.method2647(!var4.method2981(var5));
            var10.method2627(var4, var5);
            return var10;
        } else {
            class128 var9 = arg0.method2647(!var4.method2981(var5) & !var6.method2981(var7));
            var9.method2627(var4, var5);
            var9.method2627(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bc.x(II)Len;")
    public static class139 method1033(int arg0) {
        class139 var1 = (class139) field3586.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class245 var2 = Statics.field3583;
        class245 var3 = Statics.field3599;
        boolean var4 = true;
        int[] var5 = var2.method4167(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4164(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4164(var8, 0);
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
            field3586.method3009(var10, (long) arg0);
        }
        return var10;
    }
}
