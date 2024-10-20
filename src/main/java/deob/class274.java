package deob;

@ObfuscatedName("jn")
public class class274 extends class207 {

    @ObfuscatedName("jn.l")
    public static class201 field3553 = new class201(64);

    @ObfuscatedName("jn.u")
    public static class201 field3540 = new class201(100);

    @ObfuscatedName("jn.q")
    public int[] field3541;

    @ObfuscatedName("jn.k")
    public int[] field3543;

    @ObfuscatedName("jn.i")
    public int[] field3542;

    @ObfuscatedName("jn.x")
    public int[] field3544;

    @ObfuscatedName("jn.e")
    public int field3545 = -1;

    @ObfuscatedName("jn.p")
    public int[] field3546;

    @ObfuscatedName("jn.b")
    public boolean field3547 = false;

    @ObfuscatedName("jn.n")
    public int field3548 = 5;

    @ObfuscatedName("jn.f")
    public int field3549 = -1;

    @ObfuscatedName("jn.g")
    public int field3550 = -1;

    @ObfuscatedName("jn.m")
    public int field3551 = 99;

    @ObfuscatedName("jn.r")
    public int field3552 = -1;

    @ObfuscatedName("jn.t")
    public int field3536 = -1;

    @ObfuscatedName("jn.o")
    public int field3554 = 2;

    @ObfuscatedName("l.z(II)Ljn;")
    public static class274 method26(int arg0) {
        class274 var1 = (class274) field3553.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3539.method4247(12, arg0);
        class274 var3 = new class274();
        if (var2 != null) {
            var3.method4818(new class183(var2));
        }
        var3.method4826();
        field3553.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.w(Lgk;I)V")
    public void method4818(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4819(arg0, var2);
        }
    }

    @ObfuscatedName("jn.s(Lgk;IB)V")
    public void method4819(class183 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3253();
            this.field3542 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3542[var4] = arg0.method3253();
            }
            this.field3541 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3541[var5] = arg0.method3253();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3541[var6] += arg0.method3253() << 16;
            }
        } else if (arg1 == 2) {
            this.field3545 = arg0.method3253();
        } else if (arg1 == 3) {
            int var7 = arg0.method3247();
            this.field3546 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3546[var8] = arg0.method3247();
            }
            this.field3546[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3547 = true;
        } else if (arg1 == 5) {
            this.field3548 = arg0.method3247();
        } else if (arg1 == 6) {
            this.field3549 = arg0.method3253();
        } else if (arg1 == 7) {
            this.field3550 = arg0.method3253();
        } else if (arg1 == 8) {
            this.field3551 = arg0.method3247();
        } else if (arg1 == 9) {
            this.field3552 = arg0.method3247();
        } else if (arg1 == 10) {
            this.field3536 = arg0.method3247();
        } else if (arg1 == 11) {
            this.field3554 = arg0.method3247();
        } else if (arg1 == 12) {
            int var9 = arg0.method3247();
            this.field3543 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3543[var10] = arg0.method3253();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3543[var11] += arg0.method3253() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3247();
            this.field3544 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3544[var13] = arg0.method3255();
            }
        }
    }

    @ObfuscatedName("jn.l(I)V")
    public void method4826() {
        if (this.field3552 == -1) {
            if (this.field3546 == null) {
                this.field3552 = 0;
            } else {
                this.field3552 = 2;
            }
        }
        if (this.field3536 != -1) {
            return;
        }
        if (this.field3546 == null) {
            this.field3536 = 0;
        } else {
            this.field3536 = 2;
        }
    }

    @ObfuscatedName("jn.u(Ldc;II)Ldc;")
    public class120 method4821(class120 arg0, int arg1) {
        int var3 = this.field3541[arg1];
        class131 var4 = method179(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2462(true);
        } else {
            class120 var6 = arg0.method2462(!var4.method2862(var5));
            var6.method2520(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jn.q(Ldc;III)Ldc;")
    public class120 method4822(class120 arg0, int arg1, int arg2) {
        int var4 = this.field3541[arg1];
        class131 var5 = method179(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2462(true);
        }
        class120 var7 = arg0.method2462(!var5.method2862(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2475();
        } else if (var8 == 2) {
            var7.method2474();
        } else if (var8 == 3) {
            var7.method2473();
        }
        var7.method2520(var5, var6);
        if (var8 == 1) {
            var7.method2473();
        } else if (var8 == 2) {
            var7.method2474();
        } else if (var8 == 3) {
            var7.method2475();
        }
        return var7;
    }

    @ObfuscatedName("jn.i(Ldc;IB)Ldc;")
    public class120 method4823(class120 arg0, int arg1) {
        int var3 = this.field3541[arg1];
        class131 var4 = method179(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2463(true);
        } else {
            class120 var6 = arg0.method2463(!var4.method2862(var5));
            var6.method2520(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jn.x(Ldc;ILjn;II)Ldc;")
    public class120 method4827(class120 arg0, int arg1, class274 arg2, int arg3) {
        int var5 = this.field3541[arg1];
        class131 var6 = method179(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4821(arg0, arg3);
        }
        int var8 = arg2.field3541[arg3];
        class131 var9 = method179(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class120 var11 = arg0.method2462(!var6.method2862(var7));
            var11.method2520(var6, var7);
            return var11;
        } else {
            class120 var12 = arg0.method2462(!var6.method2862(var7) & !var9.method2862(var10));
            var12.method2541(var6, var7, var9, var10, this.field3546);
            return var12;
        }
    }

    @ObfuscatedName("jn.e(Ldc;II)Ldc;")
    public class120 method4825(class120 arg0, int arg1) {
        int var3 = this.field3541[arg1];
        class131 var4 = method179(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2462(true);
        }
        class131 var6 = null;
        int var7 = 0;
        if (this.field3543 != null && arg1 < this.field3543.length) {
            int var8 = this.field3543[arg1];
            var6 = method179(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class120 var10 = arg0.method2462(!var4.method2862(var5));
            var10.method2520(var4, var5);
            return var10;
        } else {
            class120 var9 = arg0.method2462(!var4.method2862(var5) & !var6.method2862(var7));
            var9.method2520(var4, var5);
            var9.method2520(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("y.p(II)Lew;")
    public static class131 method179(int arg0) {
        class131 var1 = (class131) field3540.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class248 var2 = Statics.field3537;
        class248 var3 = Statics.field3538;
        boolean var4 = true;
        int[] var5 = var2.method4290(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4298(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4298(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class131 var10;
        if (var4) {
            try {
                var10 = new class131(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3540.method3675(var10, (long) arg0);
        }
        return var10;
    }
}
