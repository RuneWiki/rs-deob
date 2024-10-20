package deob;

@ObfuscatedName("jo")
public class class261 extends class195 {

    @ObfuscatedName("jo.t")
    public static class190 field3604 = new class190(64);

    @ObfuscatedName("jo.w")
    public static class190 field3607 = new class190(100);

    @ObfuscatedName("jo.z")
    public int[] field3608;

    @ObfuscatedName("jo.j")
    public int[] field3609;

    @ObfuscatedName("jo.i")
    public int[] field3606;

    @ObfuscatedName("jo.f")
    public int[] field3611;

    @ObfuscatedName("jo.c")
    public int field3613 = -1;

    @ObfuscatedName("jo.o")
    public int[] field3605;

    @ObfuscatedName("jo.q")
    public boolean field3614 = false;

    @ObfuscatedName("jo.n")
    public int field3612 = 5;

    @ObfuscatedName("jo.a")
    public int field3616 = -1;

    @ObfuscatedName("jo.g")
    public int field3617 = -1;

    @ObfuscatedName("jo.v")
    public int field3618 = 99;

    @ObfuscatedName("jo.s")
    public int field3619 = -1;

    @ObfuscatedName("jo.k")
    public int field3620 = -1;

    @ObfuscatedName("jo.r")
    public int field3621 = 2;

    @ObfuscatedName("cz.p(Lil;Lil;Lil;I)V")
    public static void method1469(class236 arg0, class236 arg1, class236 arg2) {
        Statics.field1485 = arg0;
        Statics.field3615 = arg1;
        Statics.field3610 = arg2;
    }

    @ObfuscatedName("bp.m(IB)Ljo;")
    public static class261 method790(int arg0) {
        class261 var1 = (class261) field3604.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1485.method3720(12, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4268(new class174(var2));
        }
        var3.method4270();
        field3604.method3179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jo.e(Lfr;B)V")
    public void method4268(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method4269(arg0, var2);
        }
    }

    @ObfuscatedName("jo.t(Lfr;IB)V")
    public void method4269(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2824();
            this.field3606 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3606[var4] = arg0.method2824();
            }
            this.field3608 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3608[var5] = arg0.method2824();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3608[var6] += arg0.method2824() << 16;
            }
        } else if (arg1 == 2) {
            this.field3613 = arg0.method2824();
        } else if (arg1 == 3) {
            int var7 = arg0.method2810();
            this.field3605 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3605[var8] = arg0.method2810();
            }
            this.field3605[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3614 = true;
        } else if (arg1 == 5) {
            this.field3612 = arg0.method2810();
        } else if (arg1 == 6) {
            this.field3616 = arg0.method2824();
        } else if (arg1 == 7) {
            this.field3617 = arg0.method2824();
        } else if (arg1 == 8) {
            this.field3618 = arg0.method2810();
        } else if (arg1 == 9) {
            this.field3619 = arg0.method2810();
        } else if (arg1 == 10) {
            this.field3620 = arg0.method2810();
        } else if (arg1 == 11) {
            this.field3621 = arg0.method2810();
        } else if (arg1 == 12) {
            int var9 = arg0.method2810();
            this.field3609 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3609[var10] = arg0.method2824();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3609[var11] += arg0.method2824() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2810();
            this.field3611 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3611[var13] = arg0.method2832();
            }
        }
    }

    @ObfuscatedName("jo.w(I)V")
    public void method4270() {
        if (this.field3619 == -1) {
            if (this.field3605 == null) {
                this.field3619 = 0;
            } else {
                this.field3619 = 2;
            }
        }
        if (this.field3620 != -1) {
            return;
        }
        if (this.field3605 == null) {
            this.field3620 = 0;
        } else {
            this.field3620 = 2;
        }
    }

    @ObfuscatedName("jo.z(Les;IB)Les;")
    public class134 method4271(class134 arg0, int arg1) {
        int var3 = this.field3608[arg1];
        class145 var4 = method663(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2220(true);
        } else {
            class134 var6 = arg0.method2220(!var4.method2587(var5));
            var6.method2228(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jo.j(Les;III)Les;")
    public class134 method4279(class134 arg0, int arg1, int arg2) {
        int var4 = this.field3608[arg1];
        class145 var5 = method663(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2220(true);
        }
        class134 var7 = arg0.method2220(!var5.method2587(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2265();
        } else if (var8 == 2) {
            var7.method2232();
        } else if (var8 == 3) {
            var7.method2254();
        }
        var7.method2228(var5, var6);
        if (var8 == 1) {
            var7.method2254();
        } else if (var8 == 2) {
            var7.method2232();
        } else if (var8 == 3) {
            var7.method2265();
        }
        return var7;
    }

    @ObfuscatedName("jo.c(Les;IB)Les;")
    public class134 method4273(class134 arg0, int arg1) {
        int var3 = this.field3608[arg1];
        class145 var4 = method663(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2221(true);
        } else {
            class134 var6 = arg0.method2221(!var4.method2587(var5));
            var6.method2228(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jo.o(Les;ILjo;IB)Les;")
    public class134 method4278(class134 arg0, int arg1, class261 arg2, int arg3) {
        int var5 = this.field3608[arg1];
        class145 var6 = method663(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4271(arg0, arg3);
        }
        int var8 = arg2.field3608[arg3];
        class145 var9 = method663(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class134 var11 = arg0.method2220(!var6.method2587(var7));
            var11.method2228(var6, var7);
            return var11;
        } else {
            class134 var12 = arg0.method2220(!var6.method2587(var7) & !var9.method2587(var10));
            var12.method2233(var6, var7, var9, var10, this.field3605);
            return var12;
        }
    }

    @ObfuscatedName("jo.q(Les;II)Les;")
    public class134 method4275(class134 arg0, int arg1) {
        int var3 = this.field3608[arg1];
        class145 var4 = method663(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2220(true);
        }
        class145 var6 = null;
        int var7 = 0;
        if (this.field3609 != null && arg1 < this.field3609.length) {
            int var8 = this.field3609[arg1];
            var6 = method663(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class134 var10 = arg0.method2220(!var4.method2587(var5));
            var10.method2228(var4, var5);
            return var10;
        } else {
            class134 var9 = arg0.method2220(!var4.method2587(var5) & !var6.method2587(var7));
            var9.method2228(var4, var5);
            var9.method2228(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("at.n(II)Lea;")
    public static class145 method663(int arg0) {
        class145 var1 = (class145) field3607.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class145 var2 = class145.method188(Statics.field3615, Statics.field3610, arg0, false);
        if (var2 != null) {
            field3607.method3179(var2, (long) arg0);
        }
        return var2;
    }
}
