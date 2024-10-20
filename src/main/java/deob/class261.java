package deob;

@ObfuscatedName("jg")
public class class261 extends class195 {

    @ObfuscatedName("jg.r")
    public static class190 field3605 = new class190(64);

    @ObfuscatedName("jg.v")
    public static class190 field3606 = new class190(100);

    @ObfuscatedName("jg.e")
    public int[] field3608;

    @ObfuscatedName("jg.l")
    public int[] field3617;

    @ObfuscatedName("jg.s")
    public int[] field3619;

    @ObfuscatedName("jg.w")
    public int[] field3610;

    @ObfuscatedName("jg.p")
    public int field3611 = -1;

    @ObfuscatedName("jg.m")
    public int[] field3612;

    @ObfuscatedName("jg.u")
    public boolean field3613 = false;

    @ObfuscatedName("jg.g")
    public int field3614 = 5;

    @ObfuscatedName("jg.k")
    public int field3609 = -1;

    @ObfuscatedName("jg.t")
    public int field3615 = -1;

    @ObfuscatedName("jg.c")
    public int field3616 = 99;

    @ObfuscatedName("jg.o")
    public int field3618 = -1;

    @ObfuscatedName("jg.x")
    public int field3621 = -1;

    @ObfuscatedName("jg.f")
    public int field3620 = 2;

    @ObfuscatedName("client.a(Lif;Lif;Lif;I)V")
    public static void method1042(class236 arg0, class236 arg1, class236 arg2) {
        Statics.field3607 = arg0;
        Statics.field3604 = arg1;
        Statics.field587 = arg2;
    }

    @ObfuscatedName("du.j(IB)Ljg;")
    public static class261 method1884(int arg0) {
        class261 var1 = (class261) field3605.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3607.method3787(12, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4282(new class174(var2));
        }
        var3.method4284();
        field3605.method3247(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.n(Lfe;I)V")
    public void method4282(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method4288(arg0, var2);
        }
    }

    @ObfuscatedName("jg.r(Lfe;II)V")
    public void method4288(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2873();
            this.field3619 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3619[var4] = arg0.method2873();
            }
            this.field3608 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3608[var5] = arg0.method2873();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3608[var6] += arg0.method2873() << 16;
            }
        } else if (arg1 == 2) {
            this.field3611 = arg0.method2873();
        } else if (arg1 == 3) {
            int var7 = arg0.method2871();
            this.field3612 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3612[var8] = arg0.method2871();
            }
            this.field3612[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3613 = true;
        } else if (arg1 == 5) {
            this.field3614 = arg0.method2871();
        } else if (arg1 == 6) {
            this.field3609 = arg0.method2873();
        } else if (arg1 == 7) {
            this.field3615 = arg0.method2873();
        } else if (arg1 == 8) {
            this.field3616 = arg0.method2871();
        } else if (arg1 == 9) {
            this.field3618 = arg0.method2871();
        } else if (arg1 == 10) {
            this.field3621 = arg0.method2871();
        } else if (arg1 == 11) {
            this.field3620 = arg0.method2871();
        } else if (arg1 == 12) {
            int var9 = arg0.method2871();
            this.field3617 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3617[var10] = arg0.method2873();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3617[var11] += arg0.method2873() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2871();
            this.field3610 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3610[var13] = arg0.method2875();
            }
        }
    }

    @ObfuscatedName("jg.v(I)V")
    public void method4284() {
        if (this.field3618 == -1) {
            if (this.field3612 == null) {
                this.field3618 = 0;
            } else {
                this.field3618 = 2;
            }
        }
        if (this.field3621 != -1) {
            return;
        }
        if (this.field3612 == null) {
            this.field3621 = 0;
        } else {
            this.field3621 = 2;
        }
    }

    @ObfuscatedName("jg.e(Lej;IS)Lej;")
    public class134 method4286(class134 arg0, int arg1) {
        int var3 = this.field3608[arg1];
        class145 var4 = method1543(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2272(true);
        } else {
            class134 var6 = arg0.method2272(!var4.method2636(var5));
            var6.method2296(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jg.l(Lej;IIB)Lej;")
    public class134 method4287(class134 arg0, int arg1, int arg2) {
        int var4 = this.field3608[arg1];
        class145 var5 = method1543(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2272(true);
        }
        class134 var7 = arg0.method2272(!var5.method2636(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2298();
        } else if (var8 == 2) {
            var7.method2292();
        } else if (var8 == 3) {
            var7.method2283();
        }
        var7.method2296(var5, var6);
        if (var8 == 1) {
            var7.method2283();
        } else if (var8 == 2) {
            var7.method2292();
        } else if (var8 == 3) {
            var7.method2298();
        }
        return var7;
    }

    @ObfuscatedName("jg.s(Lej;II)Lej;")
    public class134 method4304(class134 arg0, int arg1) {
        int var3 = this.field3608[arg1];
        class145 var4 = method1543(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2273(true);
        } else {
            class134 var6 = arg0.method2273(!var4.method2636(var5));
            var6.method2296(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jg.w(Lej;ILjg;IB)Lej;")
    public class134 method4289(class134 arg0, int arg1, class261 arg2, int arg3) {
        int var5 = this.field3608[arg1];
        class145 var6 = method1543(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4286(arg0, arg3);
        }
        int var8 = arg2.field3608[arg3];
        class145 var9 = method1543(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class134 var11 = arg0.method2272(!var6.method2636(var7));
            var11.method2296(var6, var7);
            return var11;
        } else {
            class134 var12 = arg0.method2272(!var6.method2636(var7) & !var9.method2636(var10));
            var12.method2281(var6, var7, var9, var10, this.field3612);
            return var12;
        }
    }

    @ObfuscatedName("jg.p(Lej;II)Lej;")
    public class134 method4298(class134 arg0, int arg1) {
        int var3 = this.field3608[arg1];
        class145 var4 = method1543(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2272(true);
        }
        class145 var6 = null;
        int var7 = 0;
        if (this.field3617 != null && arg1 < this.field3617.length) {
            int var8 = this.field3617[arg1];
            var6 = method1543(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class134 var10 = arg0.method2272(!var4.method2636(var5));
            var10.method2296(var4, var5);
            return var10;
        } else {
            class134 var9 = arg0.method2272(!var4.method2636(var5) & !var6.method2636(var7));
            var9.method2296(var4, var5);
            var9.method2296(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("cd.m(IB)Let;")
    public static class145 method1543(int arg0) {
        class145 var1 = (class145) field3606.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class236 var2 = Statics.field3604;
        class236 var3 = Statics.field587;
        boolean var4 = true;
        int[] var5 = var2.method3772(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3769(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3769(var8, 0);
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
            field3606.method3247(var10, (long) arg0);
        }
        return var10;
    }
}
