package deob;

@ObfuscatedName("fl")
public class class157 extends class347 {

    @ObfuscatedName("fl.y")
    public static class221 field1888 = new class221(64);

    @ObfuscatedName("fl.p")
    public static class221 field1877 = new class221(100);

    @ObfuscatedName("fl.j")
    public int[] field1879;

    @ObfuscatedName("fl.r")
    public int[] field1880;

    @ObfuscatedName("fl.b")
    public int[] field1881;

    @ObfuscatedName("fl.d")
    public int[] field1882;

    @ObfuscatedName("fl.s")
    public int field1878 = -1;

    @ObfuscatedName("fl.u")
    public int[] field1885;

    @ObfuscatedName("fl.l")
    public boolean field1883 = false;

    @ObfuscatedName("fl.o")
    public int field1886 = 5;

    @ObfuscatedName("fl.c")
    public int field1887 = -1;

    @ObfuscatedName("fl.e")
    public int field1876 = -1;

    @ObfuscatedName("fl.g")
    public int field1889 = 99;

    @ObfuscatedName("fl.a")
    public int field1884 = -1;

    @ObfuscatedName("fl.k")
    public int field1891 = -1;

    @ObfuscatedName("fl.m")
    public int field1892 = 2;

    @ObfuscatedName("ca.v(II)Lfl;")
    public static class157 method2030(int arg0) {
        class157 var1 = (class157) field1888.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1874.method4468(12, arg0);
        class157 var3 = new class157();
        if (var2 != null) {
            var3.method2892(new class383(var2));
        }
        var3.method2868();
        field1888.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fl.n(Lnd;B)V")
    public void method2892(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2898(arg0, var2);
        }
    }

    @ObfuscatedName("fl.f(Lnd;II)V")
    public void method2898(class383 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5967();
            this.field1881 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1881[var4] = arg0.method5967();
            }
            this.field1879 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1879[var5] = arg0.method5967();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1879[var6] += arg0.method5967() << 16;
            }
        } else if (arg1 == 2) {
            this.field1878 = arg0.method5967();
        } else if (arg1 == 3) {
            int var7 = arg0.method5965();
            this.field1885 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1885[var8] = arg0.method5965();
            }
            this.field1885[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1883 = true;
        } else if (arg1 == 5) {
            this.field1886 = arg0.method5965();
        } else if (arg1 == 6) {
            this.field1887 = arg0.method5967();
        } else if (arg1 == 7) {
            this.field1876 = arg0.method5967();
        } else if (arg1 == 8) {
            this.field1889 = arg0.method5965();
        } else if (arg1 == 9) {
            this.field1884 = arg0.method5965();
        } else if (arg1 == 10) {
            this.field1891 = arg0.method5965();
        } else if (arg1 == 11) {
            this.field1892 = arg0.method5965();
        } else if (arg1 == 12) {
            int var9 = arg0.method5965();
            this.field1880 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1880[var10] = arg0.method5967();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1880[var11] += arg0.method5967() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5965();
            this.field1882 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1882[var13] = arg0.method5969();
            }
        }
    }

    @ObfuscatedName("fl.y(I)V")
    public void method2868() {
        if (this.field1884 == -1) {
            if (this.field1885 == null) {
                this.field1884 = 0;
            } else {
                this.field1884 = 2;
            }
        }
        if (this.field1891 != -1) {
            return;
        }
        if (this.field1885 == null) {
            this.field1891 = 0;
        } else {
            this.field1891 = 2;
        }
    }

    @ObfuscatedName("fl.p(Lgr;II)Lgr;")
    public class205 method2869(class205 arg0, int arg1) {
        int var3 = this.field1879[arg1];
        class201 var4 = method947(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3787(true);
        } else {
            class205 var6 = arg0.method3787(!var4.method3746(var5));
            var6.method3795(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("fl.j(Lgr;IIB)Lgr;")
    public class205 method2870(class205 arg0, int arg1, int arg2) {
        int var4 = this.field1879[arg1];
        class201 var5 = method947(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method3787(true);
        }
        class205 var7 = arg0.method3787(!var5.method3746(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method3800();
        } else if (var8 == 2) {
            var7.method3843();
        } else if (var8 == 3) {
            var7.method3798();
        }
        var7.method3795(var5, var6);
        if (var8 == 1) {
            var7.method3798();
        } else if (var8 == 2) {
            var7.method3843();
        } else if (var8 == 3) {
            var7.method3800();
        }
        return var7;
    }

    @ObfuscatedName("fl.r(Lgr;II)Lgr;")
    public class205 method2890(class205 arg0, int arg1) {
        int var3 = this.field1879[arg1];
        class201 var4 = method947(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3797(true);
        } else {
            class205 var6 = arg0.method3797(!var4.method3746(var5));
            var6.method3795(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("fl.b(Lgr;ILfl;II)Lgr;")
    public class205 method2902(class205 arg0, int arg1, class157 arg2, int arg3) {
        int var5 = this.field1879[arg1];
        class201 var6 = method947(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method2869(arg0, arg3);
        }
        int var8 = arg2.field1879[arg3];
        class201 var9 = method947(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class205 var11 = arg0.method3787(!var6.method3746(var7));
            var11.method3795(var6, var7);
            return var11;
        } else {
            class205 var12 = arg0.method3787(!var6.method3746(var7) & !var9.method3746(var10));
            var12.method3832(var6, var7, var9, var10, this.field1885);
            return var12;
        }
    }

    @ObfuscatedName("fl.d(Lgr;II)Lgr;")
    public class205 method2867(class205 arg0, int arg1) {
        int var3 = this.field1879[arg1];
        class201 var4 = method947(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3787(true);
        }
        class201 var6 = null;
        int var7 = 0;
        if (this.field1880 != null && arg1 < this.field1880.length) {
            int var8 = this.field1880[arg1];
            var6 = method947(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class205 var10 = arg0.method3787(!var4.method3746(var5));
            var10.method3795(var4, var5);
            return var10;
        } else {
            class205 var9 = arg0.method3787(!var4.method3746(var5) & !var6.method3746(var7));
            var9.method3795(var4, var5);
            var9.method3795(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bn.s(II)Lgd;")
    public static class201 method947(int arg0) {
        class201 var1 = (class201) field1877.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class275 var2 = Statics.field1890;
        class275 var3 = Statics.field1875;
        boolean var4 = true;
        int[] var5 = var2.method4477(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4499(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4499(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class201 var10;
        if (var4) {
            try {
                var10 = new class201(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field1877.method3947(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("co.u(B)V")
    public static void method1864() {
        field1888.method3957();
        field1877.method3957();
    }
}
