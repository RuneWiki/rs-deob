package deob;

@ObfuscatedName("jt")
public class class261 extends class195 {

    @ObfuscatedName("jt.o")
    public static class190 field3605 = new class190(64);

    @ObfuscatedName("jt.g")
    public static class190 field3606 = new class190(100);

    @ObfuscatedName("jt.v")
    public int[] field3607;

    @ObfuscatedName("jt.p")
    public int[] field3602;

    @ObfuscatedName("jt.e")
    public int[] field3609;

    @ObfuscatedName("jt.d")
    public int[] field3610;

    @ObfuscatedName("jt.x")
    public int field3611 = -1;

    @ObfuscatedName("jt.z")
    public int[] field3614;

    @ObfuscatedName("jt.n")
    public boolean field3613 = false;

    @ObfuscatedName("jt.u")
    public int field3618 = 5;

    @ObfuscatedName("jt.t")
    public int field3612 = -1;

    @ObfuscatedName("jt.a")
    public int field3616 = -1;

    @ObfuscatedName("jt.i")
    public int field3617 = 99;

    @ObfuscatedName("jt.h")
    public int field3615 = -1;

    @ObfuscatedName("jt.b")
    public int field3608 = -1;

    @ObfuscatedName("jt.j")
    public int field3620 = 2;

    @ObfuscatedName("fs.w(Lip;Lip;Lip;I)V")
    public static void method3233(class236 arg0, class236 arg1, class236 arg2) {
        Statics.field3603 = arg0;
        Statics.field3619 = arg1;
        Statics.field3604 = arg2;
    }

    @ObfuscatedName("ia.s(IB)Ljt;")
    public static class261 method4424(int arg0) {
        class261 var1 = (class261) field3605.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3603.method3876(12, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4455(new class174(var2));
        }
        var3.method4444();
        field3605.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jt.q(Lfz;B)V")
    public void method4455(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4469(arg0, var2);
        }
    }

    @ObfuscatedName("jt.o(Lfz;IB)V")
    public void method4469(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3178();
            this.field3609 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3609[var4] = arg0.method3178();
            }
            this.field3607 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3607[var5] = arg0.method3178();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3607[var6] += arg0.method3178() << 16;
            }
        } else if (arg1 == 2) {
            this.field3611 = arg0.method3178();
        } else if (arg1 == 3) {
            int var7 = arg0.method2971();
            this.field3614 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3614[var8] = arg0.method2971();
            }
            this.field3614[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3613 = true;
        } else if (arg1 == 5) {
            this.field3618 = arg0.method2971();
        } else if (arg1 == 6) {
            this.field3612 = arg0.method3178();
        } else if (arg1 == 7) {
            this.field3616 = arg0.method3178();
        } else if (arg1 == 8) {
            this.field3617 = arg0.method2971();
        } else if (arg1 == 9) {
            this.field3615 = arg0.method2971();
        } else if (arg1 == 10) {
            this.field3608 = arg0.method2971();
        } else if (arg1 == 11) {
            this.field3620 = arg0.method2971();
        } else if (arg1 == 12) {
            int var9 = arg0.method2971();
            this.field3602 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3602[var10] = arg0.method3178();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3602[var11] += arg0.method3178() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2971();
            this.field3610 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3610[var13] = arg0.method2975();
            }
        }
    }

    @ObfuscatedName("jt.g(I)V")
    public void method4444() {
        if (this.field3615 == -1) {
            if (this.field3614 == null) {
                this.field3615 = 0;
            } else {
                this.field3615 = 2;
            }
        }
        if (this.field3608 != -1) {
            return;
        }
        if (this.field3614 == null) {
            this.field3608 = 0;
        } else {
            this.field3608 = 2;
        }
    }

    @ObfuscatedName("jt.v(Leh;IB)Leh;")
    public class132 method4445(class132 arg0, int arg1) {
        int var3 = this.field3607[arg1];
        class143 var4 = method27(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2428(true);
        } else {
            class132 var6 = arg0.method2428(!var4.method2697(var5));
            var6.method2425(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jt.p(Leh;IIB)Leh;")
    public class132 method4448(class132 arg0, int arg1, int arg2) {
        int var4 = this.field3607[arg1];
        class143 var5 = method27(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2428(true);
        }
        class132 var7 = arg0.method2428(!var5.method2697(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2367();
        } else if (var8 == 2) {
            var7.method2366();
        } else if (var8 == 3) {
            var7.method2365();
        }
        var7.method2425(var5, var6);
        if (var8 == 1) {
            var7.method2365();
        } else if (var8 == 2) {
            var7.method2366();
        } else if (var8 == 3) {
            var7.method2367();
        }
        return var7;
    }

    @ObfuscatedName("jt.e(Leh;II)Leh;")
    public class132 method4449(class132 arg0, int arg1) {
        int var3 = this.field3607[arg1];
        class143 var4 = method27(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2429(true);
        } else {
            class132 var6 = arg0.method2429(!var4.method2697(var5));
            var6.method2425(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jt.d(Leh;ILjt;II)Leh;")
    public class132 method4450(class132 arg0, int arg1, class261 arg2, int arg3) {
        int var5 = this.field3607[arg1];
        class143 var6 = method27(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4445(arg0, arg3);
        }
        int var8 = arg2.field3607[arg3];
        class143 var9 = method27(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class132 var11 = arg0.method2428(!var6.method2697(var7));
            var11.method2425(var6, var7);
            return var11;
        } else {
            class132 var12 = arg0.method2428(!var6.method2697(var7) & !var9.method2697(var10));
            var12.method2363(var6, var7, var9, var10, this.field3614);
            return var12;
        }
    }

    @ObfuscatedName("jt.x(Leh;II)Leh;")
    public class132 method4451(class132 arg0, int arg1) {
        int var3 = this.field3607[arg1];
        class143 var4 = method27(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2428(true);
        }
        class143 var6 = null;
        int var7 = 0;
        if (this.field3602 != null && arg1 < this.field3602.length) {
            int var8 = this.field3602[arg1];
            var6 = method27(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class132 var10 = arg0.method2428(!var4.method2697(var5));
            var10.method2425(var4, var5);
            return var10;
        } else {
            class132 var9 = arg0.method2428(!var4.method2697(var5) & !var6.method2697(var7));
            var9.method2425(var4, var5);
            var9.method2425(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("e.u(II)Leo;")
    public static class143 method27(int arg0) {
        class143 var1 = (class143) field3606.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class236 var2 = Statics.field3619;
        class236 var3 = Statics.field3604;
        boolean var4 = true;
        int[] var5 = var2.method3886(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3883(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3883(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class143 var10;
        if (var4) {
            try {
                var10 = new class143(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3606.method3371(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("hd.i(I)V")
    public static void method3848() {
        field3605.method3361();
        field3606.method3361();
    }
}
