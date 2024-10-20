package deob;

@ObfuscatedName("jd")
public class class261 extends class195 {

    @ObfuscatedName("jd.j")
    public static class190 field3626 = new class190(64);

    @ObfuscatedName("jd.f")
    public static class190 field3612 = new class190(100);

    @ObfuscatedName("jd.m")
    public int[] field3617;

    @ObfuscatedName("jd.c")
    public int[] field3613;

    @ObfuscatedName("jd.z")
    public int[] field3615;

    @ObfuscatedName("jd.h")
    public int[] field3616;

    @ObfuscatedName("jd.g")
    public int field3608 = -1;

    @ObfuscatedName("jd.e")
    public int[] field3624;

    @ObfuscatedName("jd.o")
    public boolean field3619 = false;

    @ObfuscatedName("jd.x")
    public int field3620 = 5;

    @ObfuscatedName("jd.a")
    public int field3621 = -1;

    @ObfuscatedName("jd.y")
    public int field3622 = -1;

    @ObfuscatedName("jd.r")
    public int field3623 = 99;

    @ObfuscatedName("jd.b")
    public int field3614 = -1;

    @ObfuscatedName("jd.s")
    public int field3625 = -1;

    @ObfuscatedName("jd.v")
    public int field3618 = 2;

    @ObfuscatedName("fd.n(II)Ljd;")
    public static class261 method2887(int arg0) {
        class261 var1 = (class261) field3626.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3611.method3880(12, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4416(new class174(var2));
        }
        var3.method4442();
        field3626.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.p(Lfl;I)V")
    public void method4416(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4403(arg0, var2);
        }
    }

    @ObfuscatedName("jd.i(Lfl;II)V")
    public void method4403(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3065();
            this.field3615 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3615[var4] = arg0.method3065();
            }
            this.field3617 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3617[var5] = arg0.method3065();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3617[var6] += arg0.method3065() << 16;
            }
        } else if (arg1 == 2) {
            this.field3608 = arg0.method3065();
        } else if (arg1 == 3) {
            int var7 = arg0.method2925();
            this.field3624 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3624[var8] = arg0.method2925();
            }
            this.field3624[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3619 = true;
        } else if (arg1 == 5) {
            this.field3620 = arg0.method2925();
        } else if (arg1 == 6) {
            this.field3621 = arg0.method3065();
        } else if (arg1 == 7) {
            this.field3622 = arg0.method3065();
        } else if (arg1 == 8) {
            this.field3623 = arg0.method2925();
        } else if (arg1 == 9) {
            this.field3614 = arg0.method2925();
        } else if (arg1 == 10) {
            this.field3625 = arg0.method2925();
        } else if (arg1 == 11) {
            this.field3618 = arg0.method2925();
        } else if (arg1 == 12) {
            int var9 = arg0.method2925();
            this.field3613 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3613[var10] = arg0.method3065();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3613[var11] += arg0.method3065() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2925();
            this.field3616 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3616[var13] = arg0.method2910();
            }
        }
    }

    @ObfuscatedName("jd.j(I)V")
    public void method4442() {
        if (this.field3614 == -1) {
            if (this.field3624 == null) {
                this.field3614 = 0;
            } else {
                this.field3614 = 2;
            }
        }
        if (this.field3625 != -1) {
            return;
        }
        if (this.field3624 == null) {
            this.field3625 = 0;
        } else {
            this.field3625 = 2;
        }
    }

    @ObfuscatedName("jd.f(Lek;II)Lek;")
    public class134 method4405(class134 arg0, int arg1) {
        int var3 = this.field3617[arg1];
        class145 var4 = method3574(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2320(true);
        } else {
            class134 var6 = arg0.method2320(!var4.method2682(var5));
            var6.method2345(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jd.m(Lek;III)Lek;")
    public class134 method4406(class134 arg0, int arg1, int arg2) {
        int var4 = this.field3617[arg1];
        class145 var5 = method3574(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2320(true);
        }
        class134 var7 = arg0.method2320(!var5.method2682(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2333();
        } else if (var8 == 2) {
            var7.method2332();
        } else if (var8 == 3) {
            var7.method2331();
        }
        var7.method2345(var5, var6);
        if (var8 == 1) {
            var7.method2331();
        } else if (var8 == 2) {
            var7.method2332();
        } else if (var8 == 3) {
            var7.method2333();
        }
        return var7;
    }

    @ObfuscatedName("jd.c(Lek;II)Lek;")
    public class134 method4418(class134 arg0, int arg1) {
        int var3 = this.field3617[arg1];
        class145 var4 = method3574(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2321(true);
        } else {
            class134 var6 = arg0.method2321(!var4.method2682(var5));
            var6.method2345(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jd.z(Lek;ILjd;IS)Lek;")
    public class134 method4408(class134 arg0, int arg1, class261 arg2, int arg3) {
        int var5 = this.field3617[arg1];
        class145 var6 = method3574(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4405(arg0, arg3);
        }
        int var8 = arg2.field3617[arg3];
        class145 var9 = method3574(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class134 var11 = arg0.method2320(!var6.method2682(var7));
            var11.method2345(var6, var7);
            return var11;
        } else {
            class134 var12 = arg0.method2320(!var6.method2682(var7) & !var9.method2682(var10));
            var12.method2329(var6, var7, var9, var10, this.field3624);
            return var12;
        }
    }

    @ObfuscatedName("jd.h(Lek;IB)Lek;")
    public class134 method4409(class134 arg0, int arg1) {
        int var3 = this.field3617[arg1];
        class145 var4 = method3574(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2320(true);
        }
        class145 var6 = null;
        int var7 = 0;
        if (this.field3613 != null && arg1 < this.field3613.length) {
            int var8 = this.field3613[arg1];
            var6 = method3574(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class134 var10 = arg0.method2320(!var4.method2682(var5));
            var10.method2345(var4, var5);
            return var10;
        } else {
            class134 var9 = arg0.method2320(!var4.method2682(var5) & !var6.method2682(var7));
            var9.method2345(var4, var5);
            var9.method2345(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("gq.g(II)Ler;")
    public static class145 method3574(int arg0) {
        class145 var1 = (class145) field3612.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class145 var2 = class145.method2780(Statics.field3609, Statics.field3610, arg0, false);
        if (var2 != null) {
            field3612.method3282(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("an.e(B)V")
    public static void method249() {
        field3626.method3286();
        field3612.method3286();
    }
}
