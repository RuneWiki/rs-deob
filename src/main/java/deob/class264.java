package deob;

@ObfuscatedName("jw")
public class class264 extends class198 {

    @ObfuscatedName("jw.m")
    public static class193 field3632 = new class193(64);

    @ObfuscatedName("jw.h")
    public static class193 field3619 = new class193(100);

    @ObfuscatedName("jw.t")
    public int[] field3620;

    @ObfuscatedName("jw.p")
    public int[] field3622;

    @ObfuscatedName("jw.d")
    public int[] field3631;

    @ObfuscatedName("jw.n")
    public int[] field3623;

    @ObfuscatedName("jw.z")
    public int field3624 = -1;

    @ObfuscatedName("jw.o")
    public int[] field3621;

    @ObfuscatedName("jw.q")
    public boolean field3626 = false;

    @ObfuscatedName("jw.u")
    public int field3617 = 5;

    @ObfuscatedName("jw.k")
    public int field3628 = -1;

    @ObfuscatedName("jw.e")
    public int field3627 = -1;

    @ObfuscatedName("jw.r")
    public int field3630 = 99;

    @ObfuscatedName("jw.l")
    public int field3615 = -1;

    @ObfuscatedName("jw.y")
    public int field3629 = -1;

    @ObfuscatedName("jw.w")
    public int field3633 = 2;

    @ObfuscatedName("as.s(II)Ljw;")
    public static class264 method341(int arg0) {
        class264 var1 = (class264) field3632.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3634.method3840(12, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4457(new class177(var2));
        }
        var3.method4434();
        field3632.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jw.c(Lfs;I)V")
    public void method4457(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4437(arg0, var2);
        }
    }

    @ObfuscatedName("jw.f(Lfs;IB)V")
    public void method4437(class177 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2967();
            this.field3631 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3631[var4] = arg0.method2967();
            }
            this.field3620 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3620[var5] = arg0.method2967();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3620[var6] += arg0.method2967() << 16;
            }
        } else if (arg1 == 2) {
            this.field3624 = arg0.method2967();
        } else if (arg1 == 3) {
            int var7 = arg0.method2965();
            this.field3621 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3621[var8] = arg0.method2965();
            }
            this.field3621[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3626 = true;
        } else if (arg1 == 5) {
            this.field3617 = arg0.method2965();
        } else if (arg1 == 6) {
            this.field3628 = arg0.method2967();
        } else if (arg1 == 7) {
            this.field3627 = arg0.method2967();
        } else if (arg1 == 8) {
            this.field3630 = arg0.method2965();
        } else if (arg1 == 9) {
            this.field3615 = arg0.method2965();
        } else if (arg1 == 10) {
            this.field3629 = arg0.method2965();
        } else if (arg1 == 11) {
            this.field3633 = arg0.method2965();
        } else if (arg1 == 12) {
            int var9 = arg0.method2965();
            this.field3622 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3622[var10] = arg0.method2967();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3622[var11] += arg0.method2967() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2965();
            this.field3623 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3623[var13] = arg0.method2969();
            }
        }
    }

    @ObfuscatedName("jw.m(I)V")
    public void method4434() {
        if (this.field3615 == -1) {
            if (this.field3621 == null) {
                this.field3615 = 0;
            } else {
                this.field3615 = 2;
            }
        }
        if (this.field3629 != -1) {
            return;
        }
        if (this.field3621 == null) {
            this.field3629 = 0;
        } else {
            this.field3629 = 2;
        }
    }

    @ObfuscatedName("jw.h(Leb;IB)Leb;")
    public class134 method4435(class134 arg0, int arg1) {
        int var3 = this.field3620[arg1];
        class145 var4 = method3836(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2343(true);
        } else {
            class134 var6 = arg0.method2343(!var4.method2701(var5));
            var6.method2350(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jw.t(Leb;IIB)Leb;")
    public class134 method4436(class134 arg0, int arg1, int arg2) {
        int var4 = this.field3620[arg1];
        class145 var5 = method3836(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2343(true);
        }
        class134 var7 = arg0.method2343(!var5.method2701(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2398();
        } else if (var8 == 2) {
            var7.method2376();
        } else if (var8 == 3) {
            var7.method2353();
        }
        var7.method2350(var5, var6);
        if (var8 == 1) {
            var7.method2353();
        } else if (var8 == 2) {
            var7.method2376();
        } else if (var8 == 3) {
            var7.method2398();
        }
        return var7;
    }

    @ObfuscatedName("jw.p(Leb;II)Leb;")
    public class134 method4440(class134 arg0, int arg1) {
        int var3 = this.field3620[arg1];
        class145 var4 = method3836(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2344(true);
        } else {
            class134 var6 = arg0.method2344(!var4.method2701(var5));
            var6.method2350(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jw.d(Leb;ILjw;IB)Leb;")
    public class134 method4438(class134 arg0, int arg1, class264 arg2, int arg3) {
        int var5 = this.field3620[arg1];
        class145 var6 = method3836(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4435(arg0, arg3);
        }
        int var8 = arg2.field3620[arg3];
        class145 var9 = method3836(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class134 var11 = arg0.method2343(!var6.method2701(var7));
            var11.method2350(var6, var7);
            return var11;
        } else {
            class134 var12 = arg0.method2343(!var6.method2701(var7) & !var9.method2701(var10));
            var12.method2351(var6, var7, var9, var10, this.field3621);
            return var12;
        }
    }

    @ObfuscatedName("jw.n(Leb;II)Leb;")
    public class134 method4439(class134 arg0, int arg1) {
        int var3 = this.field3620[arg1];
        class145 var4 = method3836(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2343(true);
        }
        class145 var6 = null;
        int var7 = 0;
        if (this.field3622 != null && arg1 < this.field3622.length) {
            int var8 = this.field3622[arg1];
            var6 = method3836(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class134 var10 = arg0.method2343(!var4.method2701(var5));
            var10.method2350(var4, var5);
            return var10;
        } else {
            class134 var9 = arg0.method2343(!var4.method2701(var5) & !var6.method2701(var7));
            var9.method2350(var4, var5);
            var9.method2350(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("iu.z(IB)Lez;")
    public static class145 method3836(int arg0) {
        class145 var1 = (class145) field3619.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class239 var2 = Statics.field3618;
        class239 var3 = Statics.field3625;
        boolean var4 = true;
        int[] var5 = var2.method3872(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3885(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3885(var8, 0);
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
            field3619.method3315(var10, (long) arg0);
        }
        return var10;
    }
}
