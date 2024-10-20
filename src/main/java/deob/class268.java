package deob;

@ObfuscatedName("jy")
public class class268 extends class185 {

    @ObfuscatedName("jy.d")
    public static class155 field3508 = new class155(64);

    @ObfuscatedName("jy.c")
    public static class155 field3501 = new class155(50);

    @ObfuscatedName("jy.y")
    public int field3502;

    @ObfuscatedName("jy.h")
    public String field3524 = class234.field2795;

    @ObfuscatedName("jy.z")
    public int field3504 = 1;

    @ObfuscatedName("jy.e")
    public int[] field3505;

    @ObfuscatedName("jy.q")
    public int[] field3506;

    @ObfuscatedName("jy.l")
    public int field3507 = -1;

    @ObfuscatedName("jy.s")
    public int field3520 = -1;

    @ObfuscatedName("jy.b")
    public int field3509 = -1;

    @ObfuscatedName("jy.a")
    public int field3510 = -1;

    @ObfuscatedName("jy.w")
    public int field3514 = -1;

    @ObfuscatedName("jy.k")
    public int field3529 = -1;

    @ObfuscatedName("jy.i")
    public int field3500 = -1;

    @ObfuscatedName("jy.x")
    public short[] field3503;

    @ObfuscatedName("jy.f")
    public short[] field3515;

    @ObfuscatedName("jy.g")
    public short[] field3516;

    @ObfuscatedName("jy.u")
    public short[] field3517;

    @ObfuscatedName("jy.t")
    public String[] field3498 = new String[5];

    @ObfuscatedName("jy.p")
    public boolean field3519 = true;

    @ObfuscatedName("jy.m")
    public int field3518 = -1;

    @ObfuscatedName("jy.r")
    public int field3513 = 128;

    @ObfuscatedName("jy.o")
    public int field3522 = 128;

    @ObfuscatedName("jy.j")
    public boolean field3523 = false;

    @ObfuscatedName("jy.ay")
    public int field3512 = 0;

    @ObfuscatedName("jy.am")
    public int field3525 = 0;

    @ObfuscatedName("jy.ag")
    public int field3526 = -1;

    @ObfuscatedName("jy.ae")
    public int field3511 = 32;

    @ObfuscatedName("jy.ac")
    public int[] field3528;

    @ObfuscatedName("jy.aq")
    public int field3530 = -1;

    @ObfuscatedName("jy.at")
    public int field3521 = -1;

    @ObfuscatedName("jy.ak")
    public boolean field3531 = true;

    @ObfuscatedName("jy.ax")
    public boolean field3532 = true;

    @ObfuscatedName("jy.ar")
    public boolean field3533 = false;

    @ObfuscatedName("jy.al")
    public class327 field3534;

    @ObfuscatedName("c.n(Lig;Lig;I)V")
    public static void method32(class245 arg0, class245 arg1) {
        Statics.field3527 = arg0;
        Statics.field3499 = arg1;
    }

    @ObfuscatedName("cs.v(IB)Ljy;")
    public static class268 method2020(int arg0) {
        class268 var1 = (class268) field3508.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3527.method4032(9, arg0);
        class268 var3 = new class268();
        var3.field3502 = arg0;
        if (var2 != null) {
            var3.method4530(new class311(var2));
        }
        var3.method4541();
        field3508.method3217(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.d(I)V")
    public void method4541() {
    }

    @ObfuscatedName("jy.c(Lkx;B)V")
    public void method4530(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4531(arg0, var2);
        }
    }

    @ObfuscatedName("jy.y(Lkx;IB)V")
    public void method4531(class311 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5310();
            this.field3505 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3505[var4] = arg0.method5247();
            }
        } else if (arg1 == 2) {
            this.field3524 = arg0.method5465();
        } else if (arg1 == 12) {
            this.field3504 = arg0.method5310();
        } else if (arg1 == 13) {
            this.field3507 = arg0.method5247();
        } else if (arg1 == 14) {
            this.field3510 = arg0.method5247();
        } else if (arg1 == 15) {
            this.field3520 = arg0.method5247();
        } else if (arg1 == 16) {
            this.field3509 = arg0.method5247();
        } else if (arg1 == 17) {
            this.field3510 = arg0.method5247();
            this.field3514 = arg0.method5247();
            this.field3529 = arg0.method5247();
            this.field3500 = arg0.method5247();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3498[arg1 - 30] = arg0.method5465();
            if (this.field3498[arg1 - 30].equalsIgnoreCase(class234.field2964)) {
                this.field3498[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5310();
            this.field3503 = new short[var5];
            this.field3515 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3503[var6] = (short) arg0.method5247();
                this.field3515[var6] = (short) arg0.method5247();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5310();
            this.field3516 = new short[var7];
            this.field3517 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3516[var8] = (short) arg0.method5247();
                this.field3517[var8] = (short) arg0.method5247();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5310();
            this.field3506 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3506[var10] = arg0.method5247();
            }
        } else if (arg1 == 93) {
            this.field3519 = false;
        } else if (arg1 == 95) {
            this.field3518 = arg0.method5247();
        } else if (arg1 == 97) {
            this.field3513 = arg0.method5247();
        } else if (arg1 == 98) {
            this.field3522 = arg0.method5247();
        } else if (arg1 == 99) {
            this.field3523 = true;
        } else if (arg1 == 100) {
            this.field3512 = arg0.method5293();
        } else if (arg1 == 101) {
            this.field3525 = arg0.method5293() * 5;
        } else if (arg1 == 102) {
            this.field3526 = arg0.method5247();
        } else if (arg1 == 103) {
            this.field3511 = arg0.method5247();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3530 = arg0.method5247();
            if (this.field3530 == 65535) {
                this.field3530 = -1;
            }
            this.field3521 = arg0.method5247();
            if (this.field3521 == 65535) {
                this.field3521 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5247();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5310();
            this.field3528 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3528[var13] = arg0.method5247();
                if (this.field3528[var13] == 65535) {
                    this.field3528[var13] = -1;
                }
            }
            this.field3528[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3531 = false;
        } else if (arg1 == 109) {
            this.field3532 = false;
        } else if (arg1 == 111) {
            this.field3533 = true;
        } else if (arg1 == 249) {
            this.field3534 = class259.method2675(arg0, this.field3534);
        }
    }

    @ObfuscatedName("jy.h(Ljs;ILjs;II)Lef;")
    public final class137 method4549(class270 arg0, int arg1, class270 arg2, int arg3) {
        if (this.field3528 != null) {
            class268 var5 = this.method4534();
            return var5 == null ? null : var5.method4549(arg0, arg1, arg2, arg3);
        }
        class137 var6 = (class137) field3501.method3220((long) this.field3502);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3505.length; var8++) {
                if (!Statics.field3499.method4024(this.field3505[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class131[] var9 = new class131[this.field3505.length];
            for (int var10 = 0; var10 < this.field3505.length; var10++) {
                var9[var10] = class131.method2777(Statics.field3499, this.field3505[var10], 0);
            }
            class131 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class131(var9, var9.length);
            }
            if (this.field3503 != null) {
                for (int var12 = 0; var12 < this.field3503.length; var12++) {
                    var11.method2715(this.field3503[var12], this.field3515[var12]);
                }
            }
            if (this.field3516 != null) {
                for (int var13 = 0; var13 < this.field3516.length; var13++) {
                    var11.method2714(this.field3516[var13], this.field3517[var13]);
                }
            }
            var6 = var11.method2721(this.field3512 + 64, this.field3525 + 850, -30, -50, -30);
            field3501.method3217(var6, (long) this.field3502);
        }
        class137 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4590(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4587(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2826(true);
        } else {
            var14 = arg2.method4587(var6, arg3);
        }
        if (this.field3513 != 128 || this.field3522 != 128) {
            var14.method2811(this.field3513, this.field3522, this.field3513);
        }
        return var14;
    }

    @ObfuscatedName("jy.z(B)Lek;")
    public final class131 method4533() {
        if (this.field3528 != null) {
            class268 var1 = this.method4534();
            return var1 == null ? null : var1.method4533();
        } else if (this.field3506 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3506.length; var3++) {
                if (!Statics.field3499.method4024(this.field3506[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class131[] var4 = new class131[this.field3506.length];
            for (int var5 = 0; var5 < this.field3506.length; var5++) {
                var4[var5] = class131.method2777(Statics.field3499, this.field3506[var5], 0);
            }
            class131 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class131(var4, var4.length);
            }
            if (this.field3503 != null) {
                for (int var7 = 0; var7 < this.field3503.length; var7++) {
                    var6.method2715(this.field3503[var7], this.field3515[var7]);
                }
            }
            if (this.field3516 != null) {
                for (int var8 = 0; var8 < this.field3516.length; var8++) {
                    var6.method2714(this.field3516[var8], this.field3517[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jy.e(I)Ljy;")
    public final class268 method4534() {
        int var1 = -1;
        if (this.field3530 != -1) {
            var1 = class222.method5065(this.field3530);
        } else if (this.field3521 != -1) {
            var1 = class222.field2556[this.field3521];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3528.length - 1) {
            var2 = this.field3528[var1];
        } else {
            var2 = this.field3528[this.field3528.length - 1];
        }
        return var2 == -1 ? null : method2020(var2);
    }

    @ObfuscatedName("jy.q(B)Z")
    public boolean method4535() {
        if (this.field3528 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3530 != -1) {
            var1 = class222.method5065(this.field3530);
        } else if (this.field3521 != -1) {
            var1 = class222.field2556[this.field3521];
        }
        if (var1 >= 0 && var1 < this.field3528.length) {
            return this.field3528[var1] != -1;
        } else {
            return this.field3528[this.field3528.length - 1] != -1;
        }
    }

    @ObfuscatedName("jy.l(IIB)I")
    public int method4528(int arg0, int arg1) {
        class327 var3 = this.field3534;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5648((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2138;
            }
        }
        return var4;
    }

    @ObfuscatedName("jy.s(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4537(int arg0, String arg1) {
        return class259.method1120(this.field3534, arg0, arg1);
    }
}
