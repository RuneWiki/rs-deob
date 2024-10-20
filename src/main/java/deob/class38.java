package deob;

@ObfuscatedName("ax")
public class class38 extends class183 {

    @ObfuscatedName("ax.e")
    public static class172 field920 = new class172(64);

    @ObfuscatedName("ax.w")
    public static class172 field911 = new class172(100);

    @ObfuscatedName("ax.m")
    public int[] field921;

    @ObfuscatedName("ax.u")
    public int[] field913;

    @ObfuscatedName("ax.j")
    public int[] field910;

    @ObfuscatedName("ax.o")
    public int[] field915;

    @ObfuscatedName("ax.h")
    public int field927 = -1;

    @ObfuscatedName("ax.b")
    public int[] field908;

    @ObfuscatedName("ax.r")
    public boolean field918 = false;

    @ObfuscatedName("ax.l")
    public int field919 = 5;

    @ObfuscatedName("ax.x")
    public int field922 = -1;

    @ObfuscatedName("ax.q")
    public int field912 = -1;

    @ObfuscatedName("ax.t")
    public int field917 = 99;

    @ObfuscatedName("ax.y")
    public int field923 = -1;

    @ObfuscatedName("ax.d")
    public int field924 = -1;

    @ObfuscatedName("ax.z")
    public int field925 = 2;

    @ObfuscatedName("aj.g(IB)Lax;")
    public static class38 method552(int arg0) {
        class38 var1 = (class38) field920.method3135((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field914.method2734(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method688(new class107(var2));
        }
        var3.method708();
        field920.method3140(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.i(Ldk;I)V")
    public void method688(class107 arg0) {
        while (true) {
            int var2 = arg0.method2092();
            if (var2 == 0) {
                return;
            }
            this.method689(arg0, var2);
        }
    }

    @ObfuscatedName("ax.k(Ldk;II)V")
    public void method689(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2094();
            this.field910 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field910[var4] = arg0.method2094();
            }
            this.field921 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field921[var5] = arg0.method2094();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field921[var6] += arg0.method2094() << 16;
            }
        } else if (arg1 == 2) {
            this.field927 = arg0.method2094();
        } else if (arg1 == 3) {
            int var7 = arg0.method2092();
            this.field908 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field908[var8] = arg0.method2092();
            }
            this.field908[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field918 = true;
        } else if (arg1 == 5) {
            this.field919 = arg0.method2092();
        } else if (arg1 == 6) {
            this.field922 = arg0.method2094();
        } else if (arg1 == 7) {
            this.field912 = arg0.method2094();
        } else if (arg1 == 8) {
            this.field917 = arg0.method2092();
        } else if (arg1 == 9) {
            this.field923 = arg0.method2092();
        } else if (arg1 == 10) {
            this.field924 = arg0.method2092();
        } else if (arg1 == 11) {
            this.field925 = arg0.method2092();
        } else if (arg1 == 12) {
            int var9 = arg0.method2092();
            this.field913 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field913[var10] = arg0.method2094();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field913[var11] += arg0.method2094() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2092();
            this.field915 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field915[var13] = arg0.method2096();
            }
        }
    }

    @ObfuscatedName("ax.e(I)V")
    public void method708() {
        if (this.field923 == -1) {
            if (this.field908 == null) {
                this.field923 = 0;
            } else {
                this.field923 = 2;
            }
        }
        if (this.field924 != -1) {
            return;
        }
        if (this.field908 == null) {
            this.field924 = 0;
        } else {
            this.field924 = 2;
        }
    }

    @ObfuscatedName("ax.w(Lce;II)Lce;")
    public class98 method691(class98 arg0, int arg1) {
        int var3 = this.field921[arg1];
        class96 var4 = method2415(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1983(true);
        } else {
            class98 var6 = arg0.method1983(!var4.method1944(var5));
            var6.method1957(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ax.m(Lce;III)Lce;")
    public class98 method692(class98 arg0, int arg1, int arg2) {
        int var4 = this.field921[arg1];
        class96 var5 = method2415(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1983(true);
        }
        class98 var7 = arg0.method1983(!var5.method1944(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1962();
        } else if (var8 == 2) {
            var7.method1961();
        } else if (var8 == 3) {
            var7.method1978();
        }
        var7.method1957(var5, var6);
        if (var8 == 1) {
            var7.method1978();
        } else if (var8 == 2) {
            var7.method1961();
        } else if (var8 == 3) {
            var7.method1962();
        }
        return var7;
    }

    @ObfuscatedName("ax.u(Lce;IB)Lce;")
    public class98 method693(class98 arg0, int arg1) {
        int var3 = this.field921[arg1];
        class96 var4 = method2415(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1953(true);
        } else {
            class98 var6 = arg0.method1953(!var4.method1944(var5));
            var6.method1957(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ax.j(Lce;ILax;II)Lce;")
    public class98 method694(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field921[arg1];
        class96 var6 = method2415(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method691(arg0, arg3);
        }
        int var8 = arg2.field921[arg3];
        class96 var9 = method2415(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1983(!var6.method1944(var7));
            var11.method1957(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1983(!var6.method1944(var7) & !var9.method1944(var10));
            var12.method2013(var6, var7, var9, var10, this.field908);
            return var12;
        }
    }

    @ObfuscatedName("ax.o(Lce;IB)Lce;")
    public class98 method695(class98 arg0, int arg1) {
        int var3 = this.field921[arg1];
        class96 var4 = method2415(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1983(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field913 != null && arg1 < this.field913.length) {
            int var8 = this.field913[arg1];
            var6 = method2415(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1983(!var4.method1944(var5));
            var10.method1957(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1983(!var4.method1944(var5) & !var6.method1944(var7));
            var9.method1957(var4, var5);
            var9.method1957(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("dy.h(II)Lcj;")
    public static class96 method2415(int arg0) {
        class96 var1 = (class96) field911.method3135((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class96 var2 = class96.method1310(Statics.field2830, Statics.field909, arg0, false);
        if (var2 != null) {
            field911.method3140(var2, (long) arg0);
        }
        return var2;
    }
}
