package deob;

@ObfuscatedName("jg")
public class class270 extends class185 {

    @ObfuscatedName("jg.m")
    public static class155 field3537 = new class155(64);

    @ObfuscatedName("jg.z")
    public static class155 field3538 = new class155(100);

    @ObfuscatedName("jg.q")
    public int[] field3539;

    @ObfuscatedName("jg.k")
    public int[] field3540;

    @ObfuscatedName("jg.c")
    public int[] field3541;

    @ObfuscatedName("jg.u")
    public int[] field3542;

    @ObfuscatedName("jg.t")
    public int field3543 = -1;

    @ObfuscatedName("jg.e")
    public int[] field3544;

    @ObfuscatedName("jg.o")
    public boolean field3545 = false;

    @ObfuscatedName("jg.n")
    public int field3546 = 5;

    @ObfuscatedName("jg.x")
    public int field3547 = -1;

    @ObfuscatedName("jg.p")
    public int field3535 = -1;

    @ObfuscatedName("jg.r")
    public int field3548 = 99;

    @ObfuscatedName("jg.y")
    public int field3550 = -1;

    @ObfuscatedName("jg.s")
    public int field3551 = -1;

    @ObfuscatedName("jg.j")
    public int field3552 = 2;

    @ObfuscatedName("db.f(II)Ljg;")
    public static class270 method2219(int arg0) {
        class270 var1 = (class270) field3537.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3536.method3905(12, arg0);
        class270 var3 = new class270();
        if (var2 != null) {
            var3.method4526(new class311(var2));
        }
        var3.method4522();
        field3537.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.b(Lkb;I)V")
    public void method4526(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4521(arg0, var2);
        }
    }

    @ObfuscatedName("jg.l(Lkb;II)V")
    public void method4521(class311 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5163();
            this.field3541 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3541[var4] = arg0.method5163();
            }
            this.field3539 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3539[var5] = arg0.method5163();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3539[var6] += arg0.method5163() << 16;
            }
        } else if (arg1 == 2) {
            this.field3543 = arg0.method5163();
        } else if (arg1 == 3) {
            int var7 = arg0.method5276();
            this.field3544 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3544[var8] = arg0.method5276();
            }
            this.field3544[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3545 = true;
        } else if (arg1 == 5) {
            this.field3546 = arg0.method5276();
        } else if (arg1 == 6) {
            this.field3547 = arg0.method5163();
        } else if (arg1 == 7) {
            this.field3535 = arg0.method5163();
        } else if (arg1 == 8) {
            this.field3548 = arg0.method5276();
        } else if (arg1 == 9) {
            this.field3550 = arg0.method5276();
        } else if (arg1 == 10) {
            this.field3551 = arg0.method5276();
        } else if (arg1 == 11) {
            this.field3552 = arg0.method5276();
        } else if (arg1 == 12) {
            int var9 = arg0.method5276();
            this.field3540 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3540[var10] = arg0.method5163();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3540[var11] += arg0.method5163() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5276();
            this.field3542 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3542[var13] = arg0.method5184();
            }
        }
    }

    @ObfuscatedName("jg.m(I)V")
    public void method4522() {
        if (this.field3550 == -1) {
            if (this.field3544 == null) {
                this.field3550 = 0;
            } else {
                this.field3550 = 2;
            }
        }
        if (this.field3551 != -1) {
            return;
        }
        if (this.field3544 == null) {
            this.field3551 = 0;
        } else {
            this.field3551 = 2;
        }
    }

    @ObfuscatedName("jg.z(Leh;II)Leh;")
    public class137 method4523(class137 arg0, int arg1) {
        int var3 = this.field3539[arg1];
        class148 var4 = method3426(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2766(true);
        } else {
            class137 var6 = arg0.method2766(!var4.method3123(var5));
            var6.method2740(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jg.q(Leh;III)Leh;")
    public class137 method4524(class137 arg0, int arg1, int arg2) {
        int var4 = this.field3539[arg1];
        class148 var5 = method3426(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2766(true);
        }
        class137 var7 = arg0.method2766(!var5.method3123(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2796();
        } else if (var8 == 2) {
            var7.method2754();
        } else if (var8 == 3) {
            var7.method2753();
        }
        var7.method2740(var5, var6);
        if (var8 == 1) {
            var7.method2753();
        } else if (var8 == 2) {
            var7.method2754();
        } else if (var8 == 3) {
            var7.method2796();
        }
        return var7;
    }

    @ObfuscatedName("jg.k(Leh;II)Leh;")
    public class137 method4548(class137 arg0, int arg1) {
        int var3 = this.field3539[arg1];
        class148 var4 = method3426(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2780(true);
        } else {
            class137 var6 = arg0.method2780(!var4.method3123(var5));
            var6.method2740(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jg.c(Leh;ILjg;II)Leh;")
    public class137 method4532(class137 arg0, int arg1, class270 arg2, int arg3) {
        int var5 = this.field3539[arg1];
        class148 var6 = method3426(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4523(arg0, arg3);
        }
        int var8 = arg2.field3539[arg3];
        class148 var9 = method3426(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class137 var11 = arg0.method2766(!var6.method3123(var7));
            var11.method2740(var6, var7);
            return var11;
        } else {
            class137 var12 = arg0.method2766(!var6.method3123(var7) & !var9.method3123(var10));
            var12.method2767(var6, var7, var9, var10, this.field3544);
            return var12;
        }
    }

    @ObfuscatedName("jg.u(Leh;II)Leh;")
    public class137 method4527(class137 arg0, int arg1) {
        int var3 = this.field3539[arg1];
        class148 var4 = method3426(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2766(true);
        }
        class148 var6 = null;
        int var7 = 0;
        if (this.field3540 != null && arg1 < this.field3540.length) {
            int var8 = this.field3540[arg1];
            var6 = method3426(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class137 var10 = arg0.method2766(!var4.method3123(var5));
            var10.method2740(var4, var5);
            return var10;
        } else {
            class137 var9 = arg0.method2766(!var4.method3123(var5) & !var6.method3123(var7));
            var9.method2740(var4, var5);
            var9.method2740(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("gd.t(II)Lex;")
    public static class148 method3426(int arg0) {
        class148 var1 = (class148) field3538.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class148 var2 = class148.method825(Statics.field3549, Statics.field3833, arg0, false);
        if (var2 != null) {
            field3538.method3157(var2, (long) arg0);
        }
        return var2;
    }
}
