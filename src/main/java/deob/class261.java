package deob;

@ObfuscatedName("je")
public class class261 extends class195 {

    @ObfuscatedName("je.q")
    public static class190 field3597 = new class190(64);

    @ObfuscatedName("je.g")
    public static class190 field3600 = new class190(100);

    @ObfuscatedName("je.v")
    public int[] field3607;

    @ObfuscatedName("je.t")
    public int[] field3599;

    @ObfuscatedName("je.p")
    public int[] field3596;

    @ObfuscatedName("je.l")
    public int[] field3604;

    @ObfuscatedName("je.a")
    public int field3603 = -1;

    @ObfuscatedName("je.k")
    public int[] field3613;

    @ObfuscatedName("je.r")
    public boolean field3605 = false;

    @ObfuscatedName("je.b")
    public int field3598 = 5;

    @ObfuscatedName("je.x")
    public int field3601 = -1;

    @ObfuscatedName("je.o")
    public int field3608 = -1;

    @ObfuscatedName("je.j")
    public int field3609 = 99;

    @ObfuscatedName("je.m")
    public int field3610 = -1;

    @ObfuscatedName("je.d")
    public int field3611 = -1;

    @ObfuscatedName("je.e")
    public int field3612 = 2;

    @ObfuscatedName("cy.i(Liy;Liy;Liy;I)V")
    public static void method1739(class236 arg0, class236 arg1, class236 arg2) {
        Statics.field3602 = arg0;
        Statics.field2625 = arg1;
        Statics.field657 = arg2;
    }

    @ObfuscatedName("fo.h(II)Lje;")
    public static class261 method2856(int arg0) {
        class261 var1 = (class261) field3597.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3602.method3836(12, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4392(new class174(var2));
        }
        var3.method4412();
        field3597.method3316(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.u(Lfv;I)V")
    public void method4392(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4399(arg0, var2);
        }
    }

    @ObfuscatedName("je.q(Lfv;II)V")
    public void method4399(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2932();
            this.field3596 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3596[var4] = arg0.method2932();
            }
            this.field3607 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3607[var5] = arg0.method2932();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3607[var6] += arg0.method2932() << 16;
            }
        } else if (arg1 == 2) {
            this.field3603 = arg0.method2932();
        } else if (arg1 == 3) {
            int var7 = arg0.method2930();
            this.field3613 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3613[var8] = arg0.method2930();
            }
            this.field3613[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3605 = true;
        } else if (arg1 == 5) {
            this.field3598 = arg0.method2930();
        } else if (arg1 == 6) {
            this.field3601 = arg0.method2932();
        } else if (arg1 == 7) {
            this.field3608 = arg0.method2932();
        } else if (arg1 == 8) {
            this.field3609 = arg0.method2930();
        } else if (arg1 == 9) {
            this.field3610 = arg0.method2930();
        } else if (arg1 == 10) {
            this.field3611 = arg0.method2930();
        } else if (arg1 == 11) {
            this.field3612 = arg0.method2930();
        } else if (arg1 == 12) {
            int var9 = arg0.method2930();
            this.field3599 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3599[var10] = arg0.method2932();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3599[var11] += arg0.method2932() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2930();
            this.field3604 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3604[var13] = arg0.method3033();
            }
        }
    }

    @ObfuscatedName("je.g(I)V")
    public void method4412() {
        if (this.field3610 == -1) {
            if (this.field3613 == null) {
                this.field3610 = 0;
            } else {
                this.field3610 = 2;
            }
        }
        if (this.field3611 != -1) {
            return;
        }
        if (this.field3613 == null) {
            this.field3611 = 0;
        } else {
            this.field3611 = 2;
        }
    }

    @ObfuscatedName("je.v(Lew;IB)Lew;")
    public class134 method4395(class134 arg0, int arg1) {
        int var3 = this.field3607[arg1];
        class145 var4 = method664(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2319(true);
        } else {
            class134 var6 = arg0.method2319(!var4.method2689(var5));
            var6.method2327(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("je.t(Lew;IIB)Lew;")
    public class134 method4396(class134 arg0, int arg1, int arg2) {
        int var4 = this.field3607[arg1];
        class145 var5 = method664(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2319(true);
        }
        class134 var7 = arg0.method2319(!var5.method2689(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2369();
        } else if (var8 == 2) {
            var7.method2331();
        } else if (var8 == 3) {
            var7.method2330();
        }
        var7.method2327(var5, var6);
        if (var8 == 1) {
            var7.method2330();
        } else if (var8 == 2) {
            var7.method2331();
        } else if (var8 == 3) {
            var7.method2369();
        }
        return var7;
    }

    @ObfuscatedName("je.p(Lew;IB)Lew;")
    public class134 method4397(class134 arg0, int arg1) {
        int var3 = this.field3607[arg1];
        class145 var4 = method664(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2342(true);
        } else {
            class134 var6 = arg0.method2342(!var4.method2689(var5));
            var6.method2327(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("je.l(Lew;ILje;II)Lew;")
    public class134 method4398(class134 arg0, int arg1, class261 arg2, int arg3) {
        int var5 = this.field3607[arg1];
        class145 var6 = method664(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4395(arg0, arg3);
        }
        int var8 = arg2.field3607[arg3];
        class145 var9 = method664(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class134 var11 = arg0.method2319(!var6.method2689(var7));
            var11.method2327(var6, var7);
            return var11;
        } else {
            class134 var12 = arg0.method2319(!var6.method2689(var7) & !var9.method2689(var10));
            var12.method2328(var6, var7, var9, var10, this.field3613);
            return var12;
        }
    }

    @ObfuscatedName("je.a(Lew;II)Lew;")
    public class134 method4415(class134 arg0, int arg1) {
        int var3 = this.field3607[arg1];
        class145 var4 = method664(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2319(true);
        }
        class145 var6 = null;
        int var7 = 0;
        if (this.field3599 != null && arg1 < this.field3599.length) {
            int var8 = this.field3599[arg1];
            var6 = method664(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class134 var10 = arg0.method2319(!var4.method2689(var5));
            var10.method2327(var4, var5);
            return var10;
        } else {
            class134 var9 = arg0.method2319(!var4.method2689(var5) & !var6.method2689(var7));
            var9.method2327(var4, var5);
            var9.method2327(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("au.k(IB)Ler;")
    public static class145 method664(int arg0) {
        class145 var1 = (class145) field3600.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class236 var2 = Statics.field2625;
        class236 var3 = Statics.field657;
        boolean var4 = true;
        int[] var5 = var2.method3845(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3927(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3927(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class145 var10;
        if (var4) {
            try {
                var10 = new class145(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3600.method3316(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("ai.b(I)V")
    public static void method503() {
        field3597.method3311();
        field3600.method3311();
    }
}
