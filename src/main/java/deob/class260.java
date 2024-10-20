package deob;

@ObfuscatedName("ip")
public class class260 extends class176 {

    @ObfuscatedName("ip.e")
    public static class146 field3511 = new class146(64);

    @ObfuscatedName("ip.i")
    public static class146 field3522 = new class146(100);

    @ObfuscatedName("ip.g")
    public int[] field3526;

    @ObfuscatedName("ip.d")
    public int[] field3514;

    @ObfuscatedName("ip.l")
    public int[] field3515;

    @ObfuscatedName("ip.j")
    public int[] field3516;

    @ObfuscatedName("ip.m")
    public int field3520 = -1;

    @ObfuscatedName("ip.p")
    public int[] field3518;

    @ObfuscatedName("ip.h")
    public boolean field3519 = false;

    @ObfuscatedName("ip.v")
    public int field3509 = 5;

    @ObfuscatedName("ip.n")
    public int field3521 = -1;

    @ObfuscatedName("ip.x")
    public int field3513 = -1;

    @ObfuscatedName("ip.w")
    public int field3523 = 99;

    @ObfuscatedName("ip.k")
    public int field3524 = -1;

    @ObfuscatedName("ip.q")
    public int field3525 = -1;

    @ObfuscatedName("ip.z")
    public int field3517 = 2;

    @ObfuscatedName("lj.t(IB)Lip;")
    public static class260 method5476(int arg0) {
        class260 var1 = (class260) field3511.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3510.method3845(12, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4440(new class301(var2));
        }
        var3.method4437();
        field3511.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.o(Lkp;B)V")
    public void method4440(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4436(arg0, var2);
        }
    }

    @ObfuscatedName("ip.e(Lkp;II)V")
    public void method4436(class301 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5124();
            this.field3515 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3515[var4] = arg0.method5124();
            }
            this.field3526 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3526[var5] = arg0.method5124();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3526[var6] += arg0.method5124() << 16;
            }
        } else if (arg1 == 2) {
            this.field3520 = arg0.method5124();
        } else if (arg1 == 3) {
            int var7 = arg0.method5129();
            this.field3518 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3518[var8] = arg0.method5129();
            }
            this.field3518[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3519 = true;
        } else if (arg1 == 5) {
            this.field3509 = arg0.method5129();
        } else if (arg1 == 6) {
            this.field3521 = arg0.method5124();
        } else if (arg1 == 7) {
            this.field3513 = arg0.method5124();
        } else if (arg1 == 8) {
            this.field3523 = arg0.method5129();
        } else if (arg1 == 9) {
            this.field3524 = arg0.method5129();
        } else if (arg1 == 10) {
            this.field3525 = arg0.method5129();
        } else if (arg1 == 11) {
            this.field3517 = arg0.method5129();
        } else if (arg1 == 12) {
            int var9 = arg0.method5129();
            this.field3514 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3514[var10] = arg0.method5124();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3514[var11] += arg0.method5124() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5129();
            this.field3516 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3516[var13] = arg0.method5133();
            }
        }
    }

    @ObfuscatedName("ip.i(I)V")
    public void method4437() {
        if (this.field3524 == -1) {
            if (this.field3518 == null) {
                this.field3524 = 0;
            } else {
                this.field3524 = 2;
            }
        }
        if (this.field3525 != -1) {
            return;
        }
        if (this.field3518 == null) {
            this.field3525 = 0;
        } else {
            this.field3525 = 2;
        }
    }

    @ObfuscatedName("ip.g(Ldx;IB)Ldx;")
    public class128 method4443(class128 arg0, int arg1) {
        int var3 = this.field3526[arg1];
        class139 var4 = method4244(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2666(true);
        } else {
            class128 var6 = arg0.method2666(!var4.method3066(var5));
            var6.method2741(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ip.d(Ldx;III)Ldx;")
    public class128 method4439(class128 arg0, int arg1, int arg2) {
        int var4 = this.field3526[arg1];
        class139 var5 = method4244(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2666(true);
        }
        class128 var7 = arg0.method2666(!var5.method3066(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2678();
        } else if (var8 == 2) {
            var7.method2721();
        } else if (var8 == 3) {
            var7.method2689();
        }
        var7.method2741(var5, var6);
        if (var8 == 1) {
            var7.method2689();
        } else if (var8 == 2) {
            var7.method2721();
        } else if (var8 == 3) {
            var7.method2678();
        }
        return var7;
    }

    @ObfuscatedName("ip.l(Ldx;II)Ldx;")
    public class128 method4444(class128 arg0, int arg1) {
        int var3 = this.field3526[arg1];
        class139 var4 = method4244(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2667(true);
        } else {
            class128 var6 = arg0.method2667(!var4.method3066(var5));
            var6.method2741(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ip.j(Ldx;ILip;IB)Ldx;")
    public class128 method4434(class128 arg0, int arg1, class260 arg2, int arg3) {
        int var5 = this.field3526[arg1];
        class139 var6 = method4244(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4443(arg0, arg3);
        }
        int var8 = arg2.field3526[arg3];
        class139 var9 = method4244(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class128 var11 = arg0.method2666(!var6.method3066(var7));
            var11.method2741(var6, var7);
            return var11;
        } else {
            class128 var12 = arg0.method2666(!var6.method3066(var7) & !var9.method3066(var10));
            var12.method2675(var6, var7, var9, var10, this.field3518);
            return var12;
        }
    }

    @ObfuscatedName("ip.m(Ldx;II)Ldx;")
    public class128 method4442(class128 arg0, int arg1) {
        int var3 = this.field3526[arg1];
        class139 var4 = method4244(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2666(true);
        }
        class139 var6 = null;
        int var7 = 0;
        if (this.field3514 != null && arg1 < this.field3514.length) {
            int var8 = this.field3514[arg1];
            var6 = method4244(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class128 var10 = arg0.method2666(!var4.method3066(var5));
            var10.method2741(var4, var5);
            return var10;
        } else {
            class128 var9 = arg0.method2666(!var4.method3066(var5) & !var6.method3066(var7));
            var9.method2741(var4, var5);
            var9.method2741(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("iw.p(II)Les;")
    public static class139 method4244(int arg0) {
        class139 var1 = (class139) field3522.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class235 var2 = Statics.field420;
        class235 var3 = Statics.field3512;
        boolean var4 = true;
        int[] var5 = var2.method3847(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3885(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3885(var8, 0);
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
            field3522.method3102(var10, (long) arg0);
        }
        return var10;
    }
}
