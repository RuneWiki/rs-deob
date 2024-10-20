package deob;

@ObfuscatedName("jc")
public class class261 extends class195 {

    @ObfuscatedName("jc.u")
    public static class190 field3582 = new class190(64);

    @ObfuscatedName("jc.g")
    public static class190 field3583 = new class190(100);

    @ObfuscatedName("jc.m")
    public int[] field3584;

    @ObfuscatedName("jc.s")
    public int[] field3585;

    @ObfuscatedName("jc.x")
    public int[] field3586;

    @ObfuscatedName("jc.p")
    public int[] field3587;

    @ObfuscatedName("jc.k")
    public int field3588 = -1;

    @ObfuscatedName("jc.r")
    public int[] field3599;

    @ObfuscatedName("jc.w")
    public boolean field3579 = false;

    @ObfuscatedName("jc.v")
    public int field3591 = 5;

    @ObfuscatedName("jc.h")
    public int field3592 = -1;

    @ObfuscatedName("jc.t")
    public int field3593 = -1;

    @ObfuscatedName("jc.a")
    public int field3594 = 99;

    @ObfuscatedName("jc.e")
    public int field3595 = -1;

    @ObfuscatedName("jc.y")
    public int field3596 = -1;

    @ObfuscatedName("jc.l")
    public int field3597 = 2;

    @ObfuscatedName("bx.c(Lip;Lip;Lip;B)V")
    public static void method1359(class236 arg0, class236 arg1, class236 arg2) {
        Statics.field3590 = arg0;
        Statics.field3580 = arg1;
        Statics.field3598 = arg2;
    }

    @ObfuscatedName("jc.i(Lfp;B)V")
    public void method4267(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method4272(arg0, var2);
        }
    }

    @ObfuscatedName("jc.u(Lfp;II)V")
    public void method4272(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2861();
            this.field3586 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3586[var4] = arg0.method2861();
            }
            this.field3584 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3584[var5] = arg0.method2861();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3584[var6] += arg0.method2861() << 16;
            }
        } else if (arg1 == 2) {
            this.field3588 = arg0.method2861();
        } else if (arg1 == 3) {
            int var7 = arg0.method2843();
            this.field3599 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3599[var8] = arg0.method2843();
            }
            this.field3599[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3579 = true;
        } else if (arg1 == 5) {
            this.field3591 = arg0.method2843();
        } else if (arg1 == 6) {
            this.field3592 = arg0.method2861();
        } else if (arg1 == 7) {
            this.field3593 = arg0.method2861();
        } else if (arg1 == 8) {
            this.field3594 = arg0.method2843();
        } else if (arg1 == 9) {
            this.field3595 = arg0.method2843();
        } else if (arg1 == 10) {
            this.field3596 = arg0.method2843();
        } else if (arg1 == 11) {
            this.field3597 = arg0.method2843();
        } else if (arg1 == 12) {
            int var9 = arg0.method2843();
            this.field3585 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3585[var10] = arg0.method2861();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3585[var11] += arg0.method2861() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2843();
            this.field3587 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3587[var13] = arg0.method2994();
            }
        }
    }

    @ObfuscatedName("jc.g(B)V")
    public void method4269() {
        if (this.field3595 == -1) {
            if (this.field3599 == null) {
                this.field3595 = 0;
            } else {
                this.field3595 = 2;
            }
        }
        if (this.field3596 != -1) {
            return;
        }
        if (this.field3599 == null) {
            this.field3596 = 0;
        } else {
            this.field3596 = 2;
        }
    }

    @ObfuscatedName("jc.m(Leo;II)Leo;")
    public class134 method4274(class134 arg0, int arg1) {
        int var3 = this.field3584[arg1];
        class145 var4 = method3897(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2236(true);
        } else {
            class134 var6 = arg0.method2236(!var4.method2611(var5));
            var6.method2244(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jc.s(Leo;III)Leo;")
    public class134 method4271(class134 arg0, int arg1, int arg2) {
        int var4 = this.field3584[arg1];
        class145 var5 = method3897(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2236(true);
        }
        class134 var7 = arg0.method2236(!var5.method2611(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2279();
        } else if (var8 == 2) {
            var7.method2247();
        } else if (var8 == 3) {
            var7.method2246();
        }
        var7.method2244(var5, var6);
        if (var8 == 1) {
            var7.method2246();
        } else if (var8 == 2) {
            var7.method2247();
        } else if (var8 == 3) {
            var7.method2279();
        }
        return var7;
    }

    @ObfuscatedName("jc.x(Leo;II)Leo;")
    public class134 method4286(class134 arg0, int arg1) {
        int var3 = this.field3584[arg1];
        class145 var4 = method3897(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2237(true);
        } else {
            class134 var6 = arg0.method2237(!var4.method2611(var5));
            var6.method2244(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jc.p(Leo;ILjc;II)Leo;")
    public class134 method4273(class134 arg0, int arg1, class261 arg2, int arg3) {
        int var5 = this.field3584[arg1];
        class145 var6 = method3897(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4274(arg0, arg3);
        }
        int var8 = arg2.field3584[arg3];
        class145 var9 = method3897(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class134 var11 = arg0.method2236(!var6.method2611(var7));
            var11.method2244(var6, var7);
            return var11;
        } else {
            class134 var12 = arg0.method2236(!var6.method2611(var7) & !var9.method2611(var10));
            var12.method2292(var6, var7, var9, var10, this.field3599);
            return var12;
        }
    }

    @ObfuscatedName("jc.k(Leo;II)Leo;")
    public class134 method4276(class134 arg0, int arg1) {
        int var3 = this.field3584[arg1];
        class145 var4 = method3897(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2236(true);
        }
        class145 var6 = null;
        int var7 = 0;
        if (this.field3585 != null && arg1 < this.field3585.length) {
            int var8 = this.field3585[arg1];
            var6 = method3897(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class134 var10 = arg0.method2236(!var4.method2611(var5));
            var10.method2244(var4, var5);
            return var10;
        } else {
            class134 var9 = arg0.method2236(!var4.method2611(var5) & !var6.method2611(var7));
            var9.method2244(var4, var5);
            var9.method2244(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("is.r(IS)Lea;")
    public static class145 method3897(int arg0) {
        class145 var1 = (class145) field3583.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class145 var2 = class145.method1632(Statics.field3580, Statics.field3598, arg0, false);
        if (var2 != null) {
            field3583.method3233(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("ba.w(B)V")
    public static void method942() {
        field3582.method3223();
        field3583.method3223();
    }
}
