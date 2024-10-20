package deob;

@ObfuscatedName("je")
public class class261 extends class195 {

    @ObfuscatedName("je.v")
    public static class190 field3617 = new class190(64);

    @ObfuscatedName("je.b")
    public static class190 field3602 = new class190(100);

    @ObfuscatedName("je.y")
    public int[] field3600;

    @ObfuscatedName("je.h")
    public int[] field3604;

    @ObfuscatedName("je.x")
    public int[] field3605;

    @ObfuscatedName("je.f")
    public int[] field3606;

    @ObfuscatedName("je.n")
    public int field3607 = -1;

    @ObfuscatedName("je.a")
    public int[] field3608;

    @ObfuscatedName("je.o")
    public boolean field3609 = false;

    @ObfuscatedName("je.z")
    public int field3610 = 5;

    @ObfuscatedName("je.q")
    public int field3612 = -1;

    @ObfuscatedName("je.j")
    public int field3598 = -1;

    @ObfuscatedName("je.k")
    public int field3613 = 99;

    @ObfuscatedName("je.r")
    public int field3614 = -1;

    @ObfuscatedName("je.m")
    public int field3599 = -1;

    @ObfuscatedName("je.d")
    public int field3616 = 2;

    @ObfuscatedName("hw.i(Liw;Liw;Liw;I)V")
    public static void method3575(class236 arg0, class236 arg1, class236 arg2) {
        Statics.field3603 = arg0;
        Statics.field3601 = arg1;
        Statics.field3611 = arg2;
    }

    @ObfuscatedName("hl.c(IB)Lje;")
    public static class261 method3748(int arg0) {
        class261 var1 = (class261) field3617.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3603.method3769(12, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4333(new class174(var2));
        }
        var3.method4345();
        field3617.method3222(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.e(Lfx;I)V")
    public void method4333(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method4334(arg0, var2);
        }
    }

    @ObfuscatedName("je.v(Lfx;II)V")
    public void method4334(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2872();
            this.field3605 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3605[var4] = arg0.method2872();
            }
            this.field3600 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3600[var5] = arg0.method2872();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3600[var6] += arg0.method2872() << 16;
            }
        } else if (arg1 == 2) {
            this.field3607 = arg0.method2872();
        } else if (arg1 == 3) {
            int var7 = arg0.method2870();
            this.field3608 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3608[var8] = arg0.method2870();
            }
            this.field3608[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3609 = true;
        } else if (arg1 == 5) {
            this.field3610 = arg0.method2870();
        } else if (arg1 == 6) {
            this.field3612 = arg0.method2872();
        } else if (arg1 == 7) {
            this.field3598 = arg0.method2872();
        } else if (arg1 == 8) {
            this.field3613 = arg0.method2870();
        } else if (arg1 == 9) {
            this.field3614 = arg0.method2870();
        } else if (arg1 == 10) {
            this.field3599 = arg0.method2870();
        } else if (arg1 == 11) {
            this.field3616 = arg0.method2870();
        } else if (arg1 == 12) {
            int var9 = arg0.method2870();
            this.field3604 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3604[var10] = arg0.method2872();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3604[var11] += arg0.method2872() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2870();
            this.field3606 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3606[var13] = arg0.method2874();
            }
        }
    }

    @ObfuscatedName("je.b(B)V")
    public void method4345() {
        if (this.field3614 == -1) {
            if (this.field3608 == null) {
                this.field3614 = 0;
            } else {
                this.field3614 = 2;
            }
        }
        if (this.field3599 != -1) {
            return;
        }
        if (this.field3608 == null) {
            this.field3599 = 0;
        } else {
            this.field3599 = 2;
        }
    }

    @ObfuscatedName("je.y(Led;II)Led;")
    public class134 method4336(class134 arg0, int arg1) {
        int var3 = this.field3600[arg1];
        class145 var4 = Statics.method3739(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2322(true);
        } else {
            class134 var6 = arg0.method2322(!var4.method2643(var5));
            var6.method2280(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("je.h(Led;III)Led;")
    public class134 method4337(class134 arg0, int arg1, int arg2) {
        int var4 = this.field3600[arg1];
        class145 var5 = Statics.method3739(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2322(true);
        }
        class134 var7 = arg0.method2322(!var5.method2643(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2271();
        } else if (var8 == 2) {
            var7.method2286();
        } else if (var8 == 3) {
            var7.method2283();
        }
        var7.method2280(var5, var6);
        if (var8 == 1) {
            var7.method2283();
        } else if (var8 == 2) {
            var7.method2286();
        } else if (var8 == 3) {
            var7.method2271();
        }
        return var7;
    }

    @ObfuscatedName("je.x(Led;II)Led;")
    public class134 method4343(class134 arg0, int arg1) {
        int var3 = this.field3600[arg1];
        class145 var4 = Statics.method3739(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2296(true);
        } else {
            class134 var6 = arg0.method2296(!var4.method2643(var5));
            var6.method2280(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("je.f(Led;ILje;II)Led;")
    public class134 method4339(class134 arg0, int arg1, class261 arg2, int arg3) {
        int var5 = this.field3600[arg1];
        class145 var6 = Statics.method3739(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4336(arg0, arg3);
        }
        int var8 = arg2.field3600[arg3];
        class145 var9 = Statics.method3739(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class134 var11 = arg0.method2322(!var6.method2643(var7));
            var11.method2280(var6, var7);
            return var11;
        } else {
            class134 var12 = arg0.method2322(!var6.method2643(var7) & !var9.method2643(var10));
            var12.method2274(var6, var7, var9, var10, this.field3608);
            return var12;
        }
    }

    @ObfuscatedName("je.n(Led;II)Led;")
    public class134 method4340(class134 arg0, int arg1) {
        int var3 = this.field3600[arg1];
        class145 var4 = Statics.method3739(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2322(true);
        }
        class145 var6 = null;
        int var7 = 0;
        if (this.field3604 != null && arg1 < this.field3604.length) {
            int var8 = this.field3604[arg1];
            var6 = Statics.method3739(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class134 var10 = arg0.method2322(!var4.method2643(var5));
            var10.method2280(var4, var5);
            return var10;
        } else {
            class134 var9 = arg0.method2322(!var4.method2643(var5) & !var6.method2643(var7));
            var9.method2280(var4, var5);
            var9.method2280(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("an.o(I)V")
    public static void method216() {
        field3617.method3221();
        field3602.method3221();
    }
}
