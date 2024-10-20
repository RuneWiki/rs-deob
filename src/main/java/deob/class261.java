package deob;

@ObfuscatedName("jl")
public class class261 extends class195 {

    @ObfuscatedName("jl.p")
    public static class190 field3608 = new class190(64);

    @ObfuscatedName("jl.q")
    public static class190 field3606 = new class190(100);

    @ObfuscatedName("jl.s")
    public int[] field3622;

    @ObfuscatedName("jl.r")
    public int[] field3610;

    @ObfuscatedName("jl.g")
    public int[] field3611;

    @ObfuscatedName("jl.v")
    public int[] field3614;

    @ObfuscatedName("jl.t")
    public int field3609 = -1;

    @ObfuscatedName("jl.y")
    public int[] field3613;

    @ObfuscatedName("jl.o")
    public boolean field3615 = false;

    @ObfuscatedName("jl.i")
    public int field3607 = 5;

    @ObfuscatedName("jl.u")
    public int field3617 = -1;

    @ObfuscatedName("jl.b")
    public int field3618 = -1;

    @ObfuscatedName("jl.f")
    public int field3616 = 99;

    @ObfuscatedName("jl.j")
    public int field3620 = -1;

    @ObfuscatedName("jl.x")
    public int field3621 = -1;

    @ObfuscatedName("jl.c")
    public int field3604 = 2;

    @ObfuscatedName("gy.d(IB)Ljl;")
    public static class261 method3613(int arg0) {
        class261 var1 = (class261) field3608.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3612.method3875(12, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4420(new class174(var2));
        }
        var3.method4431();
        field3608.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jl.k(Lfg;I)V")
    public void method4420(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4421(arg0, var2);
        }
    }

    @ObfuscatedName("jl.e(Lfg;II)V")
    public void method4421(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3035();
            this.field3611 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3611[var4] = arg0.method3035();
            }
            this.field3622 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3622[var5] = arg0.method3035();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3622[var6] += arg0.method3035() << 16;
            }
        } else if (arg1 == 2) {
            this.field3609 = arg0.method3035();
        } else if (arg1 == 3) {
            int var7 = arg0.method2955();
            this.field3613 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3613[var8] = arg0.method2955();
            }
            this.field3613[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3615 = true;
        } else if (arg1 == 5) {
            this.field3607 = arg0.method2955();
        } else if (arg1 == 6) {
            this.field3617 = arg0.method3035();
        } else if (arg1 == 7) {
            this.field3618 = arg0.method3035();
        } else if (arg1 == 8) {
            this.field3616 = arg0.method2955();
        } else if (arg1 == 9) {
            this.field3620 = arg0.method2955();
        } else if (arg1 == 10) {
            this.field3621 = arg0.method2955();
        } else if (arg1 == 11) {
            this.field3604 = arg0.method2955();
        } else if (arg1 == 12) {
            int var9 = arg0.method2955();
            this.field3610 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3610[var10] = arg0.method3035();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3610[var11] += arg0.method3035() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2955();
            this.field3614 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3614[var13] = arg0.method3059();
            }
        }
    }

    @ObfuscatedName("jl.p(B)V")
    public void method4431() {
        if (this.field3620 == -1) {
            if (this.field3613 == null) {
                this.field3620 = 0;
            } else {
                this.field3620 = 2;
            }
        }
        if (this.field3621 != -1) {
            return;
        }
        if (this.field3613 == null) {
            this.field3621 = 0;
        } else {
            this.field3621 = 2;
        }
    }

    @ObfuscatedName("jl.q(Leb;II)Leb;")
    public class132 method4439(class132 arg0, int arg1) {
        int var3 = this.field3622[arg1];
        class143 var4 = method1596(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2411(true);
        } else {
            class132 var6 = arg0.method2411(!var4.method2702(var5));
            var6.method2409(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jl.s(Leb;III)Leb;")
    public class132 method4451(class132 arg0, int arg1, int arg2) {
        int var4 = this.field3622[arg1];
        class143 var5 = method1596(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2411(true);
        }
        class132 var7 = arg0.method2411(!var5.method2702(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2373();
        } else if (var8 == 2) {
            var7.method2372();
        } else if (var8 == 3) {
            var7.method2426();
        }
        var7.method2409(var5, var6);
        if (var8 == 1) {
            var7.method2426();
        } else if (var8 == 2) {
            var7.method2372();
        } else if (var8 == 3) {
            var7.method2373();
        }
        return var7;
    }

    @ObfuscatedName("jl.r(Leb;IB)Leb;")
    public class132 method4425(class132 arg0, int arg1) {
        int var3 = this.field3622[arg1];
        class143 var4 = method1596(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2361(true);
        } else {
            class132 var6 = arg0.method2361(!var4.method2702(var5));
            var6.method2409(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jl.g(Leb;ILjl;II)Leb;")
    public class132 method4419(class132 arg0, int arg1, class261 arg2, int arg3) {
        int var5 = this.field3622[arg1];
        class143 var6 = method1596(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4439(arg0, arg3);
        }
        int var8 = arg2.field3622[arg3];
        class143 var9 = method1596(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class132 var11 = arg0.method2411(!var6.method2702(var7));
            var11.method2409(var6, var7);
            return var11;
        } else {
            class132 var12 = arg0.method2411(!var6.method2702(var7) & !var9.method2702(var10));
            var12.method2417(var6, var7, var9, var10, this.field3613);
            return var12;
        }
    }

    @ObfuscatedName("jl.v(Leb;IS)Leb;")
    public class132 method4442(class132 arg0, int arg1) {
        int var3 = this.field3622[arg1];
        class143 var4 = method1596(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2411(true);
        }
        class143 var6 = null;
        int var7 = 0;
        if (this.field3610 != null && arg1 < this.field3610.length) {
            int var8 = this.field3610[arg1];
            var6 = method1596(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class132 var10 = arg0.method2411(!var4.method2702(var5));
            var10.method2409(var4, var5);
            return var10;
        } else {
            class132 var9 = arg0.method2411(!var4.method2702(var5) & !var6.method2702(var7));
            var9.method2409(var4, var5);
            var9.method2409(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("cd.t(II)Lei;")
    public static class143 method1596(int arg0) {
        class143 var1 = (class143) field3606.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class143 var2 = class143.method137(Statics.field3605, Statics.field3619, arg0, false);
        if (var2 != null) {
            field3606.method3343(var2, (long) arg0);
        }
        return var2;
    }
}
