package deob;

@ObfuscatedName("az")
public class class40 extends class195 {

    @ObfuscatedName("az.k")
    public static class184 field916 = new class184(64);

    @ObfuscatedName("az.p")
    public static class184 field917 = new class184(100);

    @ObfuscatedName("az.l")
    public int[] field928;

    @ObfuscatedName("az.u")
    public int[] field919;

    @ObfuscatedName("az.o")
    public int[] field925;

    @ObfuscatedName("az.m")
    public int[] field921;

    @ObfuscatedName("az.q")
    public int field922 = -1;

    @ObfuscatedName("az.v")
    public int[] field923;

    @ObfuscatedName("az.n")
    public boolean field924 = false;

    @ObfuscatedName("az.z")
    public int field920 = 5;

    @ObfuscatedName("az.r")
    public int field926 = -1;

    @ObfuscatedName("az.i")
    public int field929 = -1;

    @ObfuscatedName("az.s")
    public int field918 = 99;

    @ObfuscatedName("az.c")
    public int field913 = -1;

    @ObfuscatedName("az.t")
    public int field930 = -1;

    @ObfuscatedName("az.h")
    public int field931 = 2;

    @ObfuscatedName("g.b(II)Laz;")
    public static class40 method512(int arg0) {
        class40 var1 = (class40) field916.method3254((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field927.method2819(12, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method730(new class111(var2));
        }
        var3.method751();
        field916.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.e(Ldj;I)V")
    public void method730(class111 arg0) {
        while (true) {
            int var2 = arg0.method2127();
            if (var2 == 0) {
                return;
            }
            this.method737(arg0, var2);
        }
    }

    @ObfuscatedName("az.a(Ldj;IB)V")
    public void method737(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2129();
            this.field925 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field925[var4] = arg0.method2129();
            }
            this.field928 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field928[var5] = arg0.method2129();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field928[var6] += arg0.method2129() << 16;
            }
        } else if (arg1 == 2) {
            this.field922 = arg0.method2129();
        } else if (arg1 == 3) {
            int var7 = arg0.method2127();
            this.field923 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field923[var8] = arg0.method2127();
            }
            this.field923[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field924 = true;
        } else if (arg1 == 5) {
            this.field920 = arg0.method2127();
        } else if (arg1 == 6) {
            this.field926 = arg0.method2129();
        } else if (arg1 == 7) {
            this.field929 = arg0.method2129();
        } else if (arg1 == 8) {
            this.field918 = arg0.method2127();
        } else if (arg1 == 9) {
            this.field913 = arg0.method2127();
        } else if (arg1 == 10) {
            this.field930 = arg0.method2127();
        } else if (arg1 == 11) {
            this.field931 = arg0.method2127();
        } else if (arg1 == 12) {
            int var9 = arg0.method2127();
            this.field919 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field919[var10] = arg0.method2129();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field919[var11] += arg0.method2129() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2127();
            this.field921 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field921[var13] = arg0.method2131();
            }
        }
    }

    @ObfuscatedName("az.k(I)V")
    public void method751() {
        if (this.field913 == -1) {
            if (this.field923 == null) {
                this.field913 = 0;
            } else {
                this.field913 = 2;
            }
        }
        if (this.field930 != -1) {
            return;
        }
        if (this.field923 == null) {
            this.field930 = 0;
        } else {
            this.field930 = 2;
        }
    }

    @ObfuscatedName("az.p(Lcx;IB)Lcx;")
    public class100 method733(class100 arg0, int arg1) {
        int var3 = this.field928[arg1];
        class98 var4 = method1773(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1988(true);
        } else {
            class100 var6 = arg0.method1988(!var4.method1963(var5));
            var6.method1977(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.l(Lcx;III)Lcx;")
    public class100 method738(class100 arg0, int arg1, int arg2) {
        int var4 = this.field928[arg1];
        class98 var5 = method1773(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1988(true);
        }
        class100 var7 = arg0.method1988(!var5.method1963(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2037();
        } else if (var8 == 2) {
            var7.method2015();
        } else if (var8 == 3) {
            var7.method2029();
        }
        var7.method1977(var5, var6);
        if (var8 == 1) {
            var7.method2029();
        } else if (var8 == 2) {
            var7.method2015();
        } else if (var8 == 3) {
            var7.method2037();
        }
        return var7;
    }

    @ObfuscatedName("az.u(Lcx;II)Lcx;")
    public class100 method758(class100 arg0, int arg1) {
        int var3 = this.field928[arg1];
        class98 var4 = method1773(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1972(true);
        } else {
            class100 var6 = arg0.method1972(!var4.method1963(var5));
            var6.method1977(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.o(Lcx;ILaz;IB)Lcx;")
    public class100 method736(class100 arg0, int arg1, class40 arg2, int arg3) {
        int var5 = this.field928[arg1];
        class98 var6 = method1773(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method733(arg0, arg3);
        }
        int var8 = arg2.field928[arg3];
        class98 var9 = method1773(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class100 var11 = arg0.method1988(!var6.method1963(var7));
            var11.method1977(var6, var7);
            return var11;
        } else {
            class100 var12 = arg0.method1988(!var6.method1963(var7) & !var9.method1963(var10));
            var12.method2005(var6, var7, var9, var10, this.field923);
            return var12;
        }
    }

    @ObfuscatedName("az.m(Lcx;II)Lcx;")
    public class100 method734(class100 arg0, int arg1) {
        int var3 = this.field928[arg1];
        class98 var4 = method1773(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1988(true);
        }
        class98 var6 = null;
        int var7 = 0;
        if (this.field919 != null && arg1 < this.field919.length) {
            int var8 = this.field919[arg1];
            var6 = method1773(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class100 var10 = arg0.method1988(!var4.method1963(var5));
            var10.method1977(var4, var5);
            return var10;
        } else {
            class100 var9 = arg0.method1988(!var4.method1963(var5) & !var6.method1963(var7));
            var9.method1977(var4, var5);
            var9.method1977(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("cq.q(IB)Lcv;")
    public static class98 method1773(int arg0) {
        class98 var1 = (class98) field917.method3254((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class98 var2 = class98.method2049(Statics.field914, Statics.field915, arg0, false);
        if (var2 != null) {
            field917.method3256(var2, (long) arg0);
        }
        return var2;
    }
}
