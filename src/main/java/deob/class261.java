package deob;

@ObfuscatedName("jn")
public class class261 extends class195 {

    @ObfuscatedName("jn.t")
    public static class190 field3609 = new class190(64);

    @ObfuscatedName("jn.s")
    public static class190 field3607 = new class190(100);

    @ObfuscatedName("jn.r")
    public int[] field3610;

    @ObfuscatedName("jn.v")
    public int[] field3612;

    @ObfuscatedName("jn.y")
    public int[] field3613;

    @ObfuscatedName("jn.j")
    public int[] field3614;

    @ObfuscatedName("jn.k")
    public int field3611 = -1;

    @ObfuscatedName("jn.e")
    public int[] field3616;

    @ObfuscatedName("jn.o")
    public boolean field3617 = false;

    @ObfuscatedName("jn.z")
    public int field3606 = 5;

    @ObfuscatedName("jn.l")
    public int field3619 = -1;

    @ObfuscatedName("jn.c")
    public int field3615 = -1;

    @ObfuscatedName("jn.m")
    public int field3621 = 99;

    @ObfuscatedName("jn.b")
    public int field3620 = -1;

    @ObfuscatedName("jn.f")
    public int field3624 = -1;

    @ObfuscatedName("jn.n")
    public int field3622 = 2;

    @ObfuscatedName("fq.i(Liq;Liq;Liq;I)V")
    public static void method2794(class236 arg0, class236 arg1, class236 arg2) {
        Statics.field3618 = arg0;
        Statics.field3623 = arg1;
        Statics.field3608 = arg2;
    }

    @ObfuscatedName("hr.w(II)Ljn;")
    public static class261 method3746(int arg0) {
        class261 var1 = (class261) field3609.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3618.method3768(12, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4325(new class174(var2));
        }
        var3.method4368();
        field3609.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.a(Lfp;I)V")
    public void method4325(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method4341(arg0, var2);
        }
    }

    @ObfuscatedName("jn.t(Lfp;II)V")
    public void method4341(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2882();
            this.field3613 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3613[var4] = arg0.method2882();
            }
            this.field3610 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3610[var5] = arg0.method2882();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3610[var6] += arg0.method2882() << 16;
            }
        } else if (arg1 == 2) {
            this.field3611 = arg0.method2882();
        } else if (arg1 == 3) {
            int var7 = arg0.method3061();
            this.field3616 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3616[var8] = arg0.method3061();
            }
            this.field3616[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3617 = true;
        } else if (arg1 == 5) {
            this.field3606 = arg0.method3061();
        } else if (arg1 == 6) {
            this.field3619 = arg0.method2882();
        } else if (arg1 == 7) {
            this.field3615 = arg0.method2882();
        } else if (arg1 == 8) {
            this.field3621 = arg0.method3061();
        } else if (arg1 == 9) {
            this.field3620 = arg0.method3061();
        } else if (arg1 == 10) {
            this.field3624 = arg0.method3061();
        } else if (arg1 == 11) {
            this.field3622 = arg0.method3061();
        } else if (arg1 == 12) {
            int var9 = arg0.method3061();
            this.field3612 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3612[var10] = arg0.method2882();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3612[var11] += arg0.method2882() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3061();
            this.field3614 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3614[var13] = arg0.method2917();
            }
        }
    }

    @ObfuscatedName("jn.s(I)V")
    public void method4368() {
        if (this.field3620 == -1) {
            if (this.field3616 == null) {
                this.field3620 = 0;
            } else {
                this.field3620 = 2;
            }
        }
        if (this.field3624 != -1) {
            return;
        }
        if (this.field3616 == null) {
            this.field3624 = 0;
        } else {
            this.field3624 = 2;
        }
    }

    @ObfuscatedName("jn.r(Let;II)Let;")
    public class134 method4340(class134 arg0, int arg1) {
        int var3 = this.field3610[arg1];
        class145 var4 = method932(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2306(true);
        } else {
            class134 var6 = arg0.method2306(!var4.method2642(var5));
            var6.method2273(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jn.v(Let;III)Let;")
    public class134 method4345(class134 arg0, int arg1, int arg2) {
        int var4 = this.field3610[arg1];
        class145 var5 = method932(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2306(true);
        }
        class134 var7 = arg0.method2306(!var5.method2642(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2278();
        } else if (var8 == 2) {
            var7.method2271();
        } else if (var8 == 3) {
            var7.method2263();
        }
        var7.method2273(var5, var6);
        if (var8 == 1) {
            var7.method2263();
        } else if (var8 == 2) {
            var7.method2271();
        } else if (var8 == 3) {
            var7.method2278();
        }
        return var7;
    }

    @ObfuscatedName("jn.y(Let;II)Let;")
    public class134 method4329(class134 arg0, int arg1) {
        int var3 = this.field3610[arg1];
        class145 var4 = method932(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2276(true);
        } else {
            class134 var6 = arg0.method2276(!var4.method2642(var5));
            var6.method2273(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jn.j(Let;ILjn;IS)Let;")
    public class134 method4330(class134 arg0, int arg1, class261 arg2, int arg3) {
        int var5 = this.field3610[arg1];
        class145 var6 = method932(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4340(arg0, arg3);
        }
        int var8 = arg2.field3610[arg3];
        class145 var9 = method932(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class134 var11 = arg0.method2306(!var6.method2642(var7));
            var11.method2273(var6, var7);
            return var11;
        } else {
            class134 var12 = arg0.method2306(!var6.method2642(var7) & !var9.method2642(var10));
            var12.method2274(var6, var7, var9, var10, this.field3616);
            return var12;
        }
    }

    @ObfuscatedName("jn.k(Let;IS)Let;")
    public class134 method4331(class134 arg0, int arg1) {
        int var3 = this.field3610[arg1];
        class145 var4 = method932(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2306(true);
        }
        class145 var6 = null;
        int var7 = 0;
        if (this.field3612 != null && arg1 < this.field3612.length) {
            int var8 = this.field3612[arg1];
            var6 = method932(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class134 var10 = arg0.method2306(!var4.method2642(var5));
            var10.method2273(var4, var5);
            return var10;
        } else {
            class134 var9 = arg0.method2306(!var4.method2642(var5) & !var6.method2642(var7));
            var9.method2273(var4, var5);
            var9.method2273(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("br.e(II)Leq;")
    public static class145 method932(int arg0) {
        class145 var1 = (class145) field3607.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class145 var2 = Statics.method125(Statics.field3623, Statics.field3608, arg0, false);
        if (var2 != null) {
            field3607.method3234(var2, (long) arg0);
        }
        return var2;
    }
}
