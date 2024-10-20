package deob;

@ObfuscatedName("jt")
public class class279 extends class214 {

    @ObfuscatedName("jt.g")
    public static class208 field3601 = new class208(64);

    @ObfuscatedName("jt.b")
    public static class208 field3614 = new class208(100);

    @ObfuscatedName("jt.a")
    public int[] field3612;

    @ObfuscatedName("jt.c")
    public int[] field3615;

    @ObfuscatedName("jt.z")
    public int[] field3603;

    @ObfuscatedName("jt.j")
    public int[] field3605;

    @ObfuscatedName("jt.d")
    public int field3607 = -1;

    @ObfuscatedName("jt.t")
    public int[] field3608;

    @ObfuscatedName("jt.f")
    public boolean field3609 = false;

    @ObfuscatedName("jt.i")
    public int field3610 = 5;

    @ObfuscatedName("jt.m")
    public int field3611 = -1;

    @ObfuscatedName("jt.v")
    public int field3598 = -1;

    @ObfuscatedName("jt.r")
    public int field3613 = 99;

    @ObfuscatedName("jt.x")
    public int field3604 = -1;

    @ObfuscatedName("jt.y")
    public int field3606 = -1;

    @ObfuscatedName("jt.p")
    public int field3616 = 2;

    @ObfuscatedName("dd.n(IB)Ljt;")
    public static class279 method2783(int arg0) {
        class279 var1 = (class279) field3601.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3602.method4494(12, arg0);
        class279 var3 = new class279();
        if (var2 != null) {
            var3.method5031(new class190(var2));
        }
        var3.method5030();
        field3601.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jt.h(Lgc;I)V")
    public void method5031(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method5032(arg0, var2);
        }
    }

    @ObfuscatedName("jt.l(Lgc;II)V")
    public void method5032(class190 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3513();
            this.field3603 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3603[var4] = arg0.method3513();
            }
            this.field3612 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3612[var5] = arg0.method3513();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3612[var6] += arg0.method3513() << 16;
            }
        } else if (arg1 == 2) {
            this.field3607 = arg0.method3513();
        } else if (arg1 == 3) {
            int var7 = arg0.method3511();
            this.field3608 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3608[var8] = arg0.method3511();
            }
            this.field3608[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3609 = true;
        } else if (arg1 == 5) {
            this.field3610 = arg0.method3511();
        } else if (arg1 == 6) {
            this.field3611 = arg0.method3513();
        } else if (arg1 == 7) {
            this.field3598 = arg0.method3513();
        } else if (arg1 == 8) {
            this.field3613 = arg0.method3511();
        } else if (arg1 == 9) {
            this.field3604 = arg0.method3511();
        } else if (arg1 == 10) {
            this.field3606 = arg0.method3511();
        } else if (arg1 == 11) {
            this.field3616 = arg0.method3511();
        } else if (arg1 == 12) {
            int var9 = arg0.method3511();
            this.field3615 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3615[var10] = arg0.method3513();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3615[var11] += arg0.method3513() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3511();
            this.field3605 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3605[var13] = arg0.method3515();
            }
        }
    }

    @ObfuscatedName("jt.g(B)V")
    public void method5030() {
        if (this.field3604 == -1) {
            if (this.field3608 == null) {
                this.field3604 = 0;
            } else {
                this.field3604 = 2;
            }
        }
        if (this.field3606 != -1) {
            return;
        }
        if (this.field3608 == null) {
            this.field3606 = 0;
        } else {
            this.field3606 = 2;
        }
    }

    @ObfuscatedName("jt.b(Ldq;IB)Ldq;")
    public class127 method5043(class127 arg0, int arg1) {
        int var3 = this.field3612[arg1];
        class138 var4 = method1596(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2672(true);
        } else {
            class127 var6 = arg0.method2672(!var4.method3077(var5));
            var6.method2680(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jt.a(Ldq;III)Ldq;")
    public class127 method5070(class127 arg0, int arg1, int arg2) {
        int var4 = this.field3612[arg1];
        class138 var5 = method1596(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2672(true);
        }
        class127 var7 = arg0.method2672(!var5.method3077(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2685();
        } else if (var8 == 2) {
            var7.method2738();
        } else if (var8 == 3) {
            var7.method2683();
        }
        var7.method2680(var5, var6);
        if (var8 == 1) {
            var7.method2683();
        } else if (var8 == 2) {
            var7.method2738();
        } else if (var8 == 3) {
            var7.method2685();
        }
        return var7;
    }

    @ObfuscatedName("jt.c(Ldq;IB)Ldq;")
    public class127 method5052(class127 arg0, int arg1) {
        int var3 = this.field3612[arg1];
        class138 var4 = method1596(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2673(true);
        } else {
            class127 var6 = arg0.method2673(!var4.method3077(var5));
            var6.method2680(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jt.z(Ldq;ILjt;II)Ldq;")
    public class127 method5040(class127 arg0, int arg1, class279 arg2, int arg3) {
        int var5 = this.field3612[arg1];
        class138 var6 = method1596(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method5043(arg0, arg3);
        }
        int var8 = arg2.field3612[arg3];
        class138 var9 = method1596(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class127 var11 = arg0.method2672(!var6.method3077(var7));
            var11.method2680(var6, var7);
            return var11;
        } else {
            class127 var12 = arg0.method2672(!var6.method3077(var7) & !var9.method3077(var10));
            var12.method2681(var6, var7, var9, var10, this.field3608);
            return var12;
        }
    }

    @ObfuscatedName("jt.j(Ldq;II)Ldq;")
    public class127 method5037(class127 arg0, int arg1) {
        int var3 = this.field3612[arg1];
        class138 var4 = method1596(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2672(true);
        }
        class138 var6 = null;
        int var7 = 0;
        if (this.field3615 != null && arg1 < this.field3615.length) {
            int var8 = this.field3615[arg1];
            var6 = method1596(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class127 var10 = arg0.method2672(!var4.method3077(var5));
            var10.method2680(var4, var5);
            return var10;
        } else {
            class127 var9 = arg0.method2672(!var4.method3077(var5) & !var6.method3077(var7));
            var9.method2680(var4, var5);
            var9.method2680(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bb.d(II)Lea;")
    public static class138 method1596(int arg0) {
        class138 var1 = (class138) field3614.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class254 var2 = Statics.field3599;
        class254 var3 = Statics.field3600;
        boolean var4 = true;
        int[] var5 = var2.method4465(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4462(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4462(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class138 var10;
        if (var4) {
            try {
                var10 = new class138(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3614.method3908(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("ch.i(I)V")
    public static void method1852() {
        field3601.method3899();
        field3614.method3899();
    }
}
