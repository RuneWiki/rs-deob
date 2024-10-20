package deob;

@ObfuscatedName("ac")
public class class40 extends class195 {

    @ObfuscatedName("ac.e")
    public static class184 field931 = new class184(64);

    @ObfuscatedName("ac.h")
    public static class184 field935 = new class184(100);

    @ObfuscatedName("ac.q")
    public int[] field936;

    @ObfuscatedName("ac.l")
    public int[] field937;

    @ObfuscatedName("ac.c")
    public int[] field938;

    @ObfuscatedName("ac.f")
    public int[] field939;

    @ObfuscatedName("ac.s")
    public int field940 = -1;

    @ObfuscatedName("ac.m")
    public int[] field941;

    @ObfuscatedName("ac.y")
    public boolean field944 = false;

    @ObfuscatedName("ac.b")
    public int field945 = 5;

    @ObfuscatedName("ac.v")
    public int field934 = -1;

    @ObfuscatedName("ac.z")
    public int field948 = -1;

    @ObfuscatedName("ac.u")
    public int field951 = 99;

    @ObfuscatedName("ac.g")
    public int field947 = -1;

    @ObfuscatedName("ac.k")
    public int field942 = -1;

    @ObfuscatedName("ac.o")
    public int field949 = 2;

    @ObfuscatedName("x.n(Lfd;Lfd;Lfd;I)V")
    public static void method519(class158 arg0, class158 arg1, class158 arg2) {
        Statics.field950 = arg0;
        Statics.field932 = arg1;
        Statics.field943 = arg2;
    }

    @ObfuscatedName("y.w(IS)Lac;")
    public static class40 method122(int arg0) {
        class40 var1 = (class40) field931.method3315((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field950.method2859(12, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method738(new class111(var2));
        }
        var3.method759();
        field931.method3317(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.i(Ldo;B)V")
    public void method738(class111 arg0) {
        while (true) {
            int var2 = arg0.method2155();
            if (var2 == 0) {
                return;
            }
            this.method739(arg0, var2);
        }
    }

    @ObfuscatedName("ac.e(Ldo;II)V")
    public void method739(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2157();
            this.field938 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field938[var4] = arg0.method2157();
            }
            this.field936 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field936[var5] = arg0.method2157();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field936[var6] += arg0.method2157() << 16;
            }
        } else if (arg1 == 2) {
            this.field940 = arg0.method2157();
        } else if (arg1 == 3) {
            int var7 = arg0.method2155();
            this.field941 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field941[var8] = arg0.method2155();
            }
            this.field941[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field944 = true;
        } else if (arg1 == 5) {
            this.field945 = arg0.method2155();
        } else if (arg1 == 6) {
            this.field934 = arg0.method2157();
        } else if (arg1 == 7) {
            this.field948 = arg0.method2157();
        } else if (arg1 == 8) {
            this.field951 = arg0.method2155();
        } else if (arg1 == 9) {
            this.field947 = arg0.method2155();
        } else if (arg1 == 10) {
            this.field942 = arg0.method2155();
        } else if (arg1 == 11) {
            this.field949 = arg0.method2155();
        } else if (arg1 == 12) {
            int var9 = arg0.method2155();
            this.field937 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field937[var10] = arg0.method2157();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field937[var11] += arg0.method2157() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2155();
            this.field939 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field939[var13] = arg0.method2315();
            }
        }
    }

    @ObfuscatedName("ac.h(I)V")
    public void method759() {
        if (this.field947 == -1) {
            if (this.field941 == null) {
                this.field947 = 0;
            } else {
                this.field947 = 2;
            }
        }
        if (this.field942 != -1) {
            return;
        }
        if (this.field941 == null) {
            this.field942 = 0;
        } else {
            this.field942 = 2;
        }
    }

    @ObfuscatedName("ac.q(Lcw;II)Lcw;")
    public class100 method741(class100 arg0, int arg1) {
        int var3 = this.field936[arg1];
        class98 var4 = method598(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1998(true);
        } else {
            class100 var6 = arg0.method1998(!var4.method1995(var5));
            var6.method2052(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.l(Lcw;III)Lcw;")
    public class100 method742(class100 arg0, int arg1, int arg2) {
        int var4 = this.field936[arg1];
        class98 var5 = method598(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1998(true);
        }
        class100 var7 = arg0.method1998(!var5.method1995(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2036();
        } else if (var8 == 2) {
            var7.method2008();
        } else if (var8 == 3) {
            var7.method2007();
        }
        var7.method2052(var5, var6);
        if (var8 == 1) {
            var7.method2007();
        } else if (var8 == 2) {
            var7.method2008();
        } else if (var8 == 3) {
            var7.method2036();
        }
        return var7;
    }

    @ObfuscatedName("ac.c(Lcw;II)Lcw;")
    public class100 method777(class100 arg0, int arg1) {
        int var3 = this.field936[arg1];
        class98 var4 = method598(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2013(true);
        } else {
            class100 var6 = arg0.method2013(!var4.method1995(var5));
            var6.method2052(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.f(Lcw;ILac;II)Lcw;")
    public class100 method743(class100 arg0, int arg1, class40 arg2, int arg3) {
        int var5 = this.field936[arg1];
        class98 var6 = method598(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method741(arg0, arg3);
        }
        int var8 = arg2.field936[arg3];
        class98 var9 = method598(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class100 var11 = arg0.method1998(!var6.method1995(var7));
            var11.method2052(var6, var7);
            return var11;
        } else {
            class100 var12 = arg0.method1998(!var6.method1995(var7) & !var9.method1995(var10));
            var12.method2029(var6, var7, var9, var10, this.field941);
            return var12;
        }
    }

    @ObfuscatedName("ac.s(Lcw;II)Lcw;")
    public class100 method775(class100 arg0, int arg1) {
        int var3 = this.field936[arg1];
        class98 var4 = method598(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1998(true);
        }
        class98 var6 = null;
        int var7 = 0;
        if (this.field937 != null && arg1 < this.field937.length) {
            int var8 = this.field937[arg1];
            var6 = method598(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class100 var10 = arg0.method1998(!var4.method1995(var5));
            var10.method2052(var4, var5);
            return var10;
        } else {
            class100 var9 = arg0.method1998(!var4.method1995(var5) & !var6.method1995(var7));
            var9.method2052(var4, var5);
            var9.method2052(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("as.m(II)Lcc;")
    public static class98 method598(int arg0) {
        class98 var1 = (class98) field935.method3315((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class158 var2 = Statics.field932;
        class158 var3 = Statics.field943;
        boolean var4 = true;
        int[] var5 = var2.method2868(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2876(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2876(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class98 var10;
        if (var4) {
            try {
                var10 = new class98(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field935.method3317(var10, (long) arg0);
        }
        return var10;
    }
}
