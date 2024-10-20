package deob;

@ObfuscatedName("jj")
public class class272 extends class207 {

    @ObfuscatedName("jj.q")
    public static class201 field3502 = new class201(64);

    @ObfuscatedName("jj.b")
    public static class201 field3503 = new class201(50);

    @ObfuscatedName("jj.f")
    public int field3504;

    @ObfuscatedName("jj.n")
    public String field3505 = class238.field2821;

    @ObfuscatedName("jj.h")
    public int field3520 = 1;

    @ObfuscatedName("jj.x")
    public int[] field3501;

    @ObfuscatedName("jj.j")
    public int[] field3508;

    @ObfuscatedName("jj.a")
    public int field3518 = -1;

    @ObfuscatedName("jj.l")
    public int field3510 = -1;

    @ObfuscatedName("jj.d")
    public int field3500 = -1;

    @ObfuscatedName("jj.s")
    public int field3512 = -1;

    @ObfuscatedName("jj.p")
    public int field3513 = -1;

    @ObfuscatedName("jj.g")
    public int field3519 = -1;

    @ObfuscatedName("jj.y")
    public int field3515 = -1;

    @ObfuscatedName("jj.c")
    public short[] field3516;

    @ObfuscatedName("jj.e")
    public short[] field3517;

    @ObfuscatedName("jj.t")
    public short[] field3509;

    @ObfuscatedName("jj.u")
    public short[] field3511;

    @ObfuscatedName("jj.i")
    public String[] field3507 = new String[5];

    @ObfuscatedName("jj.z")
    public boolean field3521 = true;

    @ObfuscatedName("jj.k")
    public int field3522 = -1;

    @ObfuscatedName("jj.r")
    public int field3506 = 128;

    @ObfuscatedName("jj.v")
    public int field3524 = 128;

    @ObfuscatedName("jj.o")
    public boolean field3525 = false;

    @ObfuscatedName("jj.ai")
    public int field3526 = 0;

    @ObfuscatedName("jj.at")
    public int field3527 = 0;

    @ObfuscatedName("jj.ad")
    public int field3528 = -1;

    @ObfuscatedName("jj.ac")
    public int field3529 = 32;

    @ObfuscatedName("jj.ay")
    public int[] field3530;

    @ObfuscatedName("jj.an")
    public int field3531 = -1;

    @ObfuscatedName("jj.as")
    public int field3532 = -1;

    @ObfuscatedName("jj.aw")
    public boolean field3536 = true;

    @ObfuscatedName("jj.ag")
    public boolean field3534 = true;

    @ObfuscatedName("jj.ah")
    public boolean field3535 = false;

    @ObfuscatedName("jj.az")
    public class198 field3514;

    @ObfuscatedName("bp.w(II)Ljj;")
    public static class272 method1034(int arg0) {
        class272 var1 = (class272) field3502.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3533.method4250(9, arg0);
        class272 var3 = new class272();
        var3.field3504 = arg0;
        if (var2 != null) {
            var3.method4780(new class183(var2));
        }
        var3.method4801();
        field3502.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.m(S)V")
    public void method4801() {
    }

    @ObfuscatedName("jj.q(Lgy;I)V")
    public void method4780(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4781(arg0, var2);
        }
    }

    @ObfuscatedName("jj.x(Lgy;II)V")
    public void method4781(class183 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3436();
            this.field3501 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3501[var4] = arg0.method3268();
            }
        } else if (arg1 == 2) {
            this.field3505 = arg0.method3271();
        } else if (arg1 == 12) {
            this.field3520 = arg0.method3436();
        } else if (arg1 == 13) {
            this.field3518 = arg0.method3268();
        } else if (arg1 == 14) {
            this.field3512 = arg0.method3268();
        } else if (arg1 == 15) {
            this.field3510 = arg0.method3268();
        } else if (arg1 == 16) {
            this.field3500 = arg0.method3268();
        } else if (arg1 == 17) {
            this.field3512 = arg0.method3268();
            this.field3513 = arg0.method3268();
            this.field3519 = arg0.method3268();
            this.field3515 = arg0.method3268();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3507[arg1 - 30] = arg0.method3271();
            if (this.field3507[arg1 - 30].equalsIgnoreCase(class238.field2816)) {
                this.field3507[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3436();
            this.field3516 = new short[var5];
            this.field3517 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3516[var6] = (short) arg0.method3268();
                this.field3517[var6] = (short) arg0.method3268();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3436();
            this.field3509 = new short[var7];
            this.field3511 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3509[var8] = (short) arg0.method3268();
                this.field3511[var8] = (short) arg0.method3268();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3436();
            this.field3508 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3508[var10] = arg0.method3268();
            }
        } else if (arg1 == 93) {
            this.field3521 = false;
        } else if (arg1 == 95) {
            this.field3522 = arg0.method3268();
        } else if (arg1 == 97) {
            this.field3506 = arg0.method3268();
        } else if (arg1 == 98) {
            this.field3524 = arg0.method3268();
        } else if (arg1 == 99) {
            this.field3525 = true;
        } else if (arg1 == 100) {
            this.field3526 = arg0.method3263();
        } else if (arg1 == 101) {
            this.field3527 = arg0.method3263();
        } else if (arg1 == 102) {
            this.field3528 = arg0.method3268();
        } else if (arg1 == 103) {
            this.field3529 = arg0.method3268();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3531 = arg0.method3268();
            if (this.field3531 == 65535) {
                this.field3531 = -1;
            }
            this.field3532 = arg0.method3268();
            if (this.field3532 == 65535) {
                this.field3532 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3268();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3436();
            this.field3530 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3530[var13] = arg0.method3268();
                if (this.field3530[var13] == 65535) {
                    this.field3530[var13] = -1;
                }
            }
            this.field3530[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3536 = false;
        } else if (arg1 == 109) {
            this.field3534 = false;
        } else if (arg1 == 111) {
            this.field3535 = true;
        } else if (arg1 == 249) {
            this.field3514 = Statics.method2312(arg0, this.field3514);
        }
    }

    @ObfuscatedName("jj.j(Ljh;ILjh;IB)Ldk;")
    public final class120 method4782(class274 arg0, int arg1, class274 arg2, int arg3) {
        if (this.field3530 != null) {
            class272 var5 = this.method4797();
            return var5 == null ? null : var5.method4782(arg0, arg1, arg2, arg3);
        }
        class120 var6 = (class120) field3503.method3707((long) this.field3504);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3501.length; var8++) {
                if (!Statics.field3523.method4332(this.field3501[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class114[] var9 = new class114[this.field3501.length];
            for (int var10 = 0; var10 < this.field3501.length; var10++) {
                var9[var10] = class114.method2406(Statics.field3523, this.field3501[var10], 0);
            }
            class114 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class114(var9, var9.length);
            }
            if (this.field3516 != null) {
                for (int var12 = 0; var12 < this.field3516.length; var12++) {
                    var11.method2476(this.field3516[var12], this.field3517[var12]);
                }
            }
            if (this.field3509 != null) {
                for (int var13 = 0; var13 < this.field3509.length; var13++) {
                    var11.method2419(this.field3509[var13], this.field3511[var13]);
                }
            }
            var6 = var11.method2418(this.field3526 + 64, this.field3527 * 5 + 850, -30, -50, -30);
            field3503.method3712(var6, (long) this.field3504);
        }
        class120 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4833(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4830(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2516(true);
        } else {
            var14 = arg2.method4830(var6, arg3);
        }
        if (this.field3506 != 128 || this.field3524 != 128) {
            var14.method2546(this.field3506, this.field3524, this.field3506);
        }
        return var14;
    }

    @ObfuscatedName("jj.a(B)Ldo;")
    public final class114 method4785() {
        if (this.field3530 != null) {
            class272 var1 = this.method4797();
            return var1 == null ? null : var1.method4785();
        } else if (this.field3508 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3508.length; var3++) {
                if (!Statics.field3523.method4332(this.field3508[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class114[] var4 = new class114[this.field3508.length];
            for (int var5 = 0; var5 < this.field3508.length; var5++) {
                var4[var5] = class114.method2406(Statics.field3523, this.field3508[var5], 0);
            }
            class114 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class114(var4, var4.length);
            }
            if (this.field3516 != null) {
                for (int var7 = 0; var7 < this.field3516.length; var7++) {
                    var6.method2476(this.field3516[var7], this.field3517[var7]);
                }
            }
            if (this.field3509 != null) {
                for (int var8 = 0; var8 < this.field3509.length; var8++) {
                    var6.method2419(this.field3509[var8], this.field3511[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jj.l(I)Ljj;")
    public final class272 method4797() {
        int var1 = -1;
        if (this.field3531 != -1) {
            var1 = class226.method2926(this.field3531);
        } else if (this.field3532 != -1) {
            var1 = class226.field2579[this.field3532];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3530.length - 1) {
            var2 = this.field3530[var1];
        } else {
            var2 = this.field3530[this.field3530.length - 1];
        }
        return var2 == -1 ? null : method1034(var2);
    }

    @ObfuscatedName("jj.d(B)Z")
    public boolean method4805() {
        if (this.field3530 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3531 != -1) {
            var1 = class226.method2926(this.field3531);
        } else if (this.field3532 != -1) {
            var1 = class226.field2579[this.field3532];
        }
        if (var1 >= 0 && var1 < this.field3530.length) {
            return this.field3530[var1] != -1;
        } else {
            return this.field3530[this.field3530.length - 1] != -1;
        }
    }

    @ObfuscatedName("jj.s(III)I")
    public int method4807(int arg0, int arg1) {
        class198 var3 = this.field3514;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class212 var5 = (class212) var3.method3675((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2465;
            }
        }
        return var4;
    }

    @ObfuscatedName("jj.p(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4786(int arg0, String arg1) {
        return class263.method1701(this.field3514, arg0, arg1);
    }
}
