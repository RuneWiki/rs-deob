package deob;

@ObfuscatedName("aj")
public class class40 extends class195 {

    @ObfuscatedName("aj.e")
    public static class184 field922 = new class184(64);

    @ObfuscatedName("aj.i")
    public static class184 field917 = new class184(100);

    @ObfuscatedName("aj.o")
    public int[] field918;

    @ObfuscatedName("aj.f")
    public int[] field919;

    @ObfuscatedName("aj.d")
    public int[] field920;

    @ObfuscatedName("aj.j")
    public int[] field921;

    @ObfuscatedName("aj.x")
    public int field916 = -1;

    @ObfuscatedName("aj.v")
    public int[] field923;

    @ObfuscatedName("aj.a")
    public boolean field924 = false;

    @ObfuscatedName("aj.l")
    public int field932 = 5;

    @ObfuscatedName("aj.h")
    public int field926 = -1;

    @ObfuscatedName("aj.c")
    public int field927 = -1;

    @ObfuscatedName("aj.u")
    public int field928 = 99;

    @ObfuscatedName("aj.r")
    public int field929 = -1;

    @ObfuscatedName("aj.k")
    public int field930 = -1;

    @ObfuscatedName("aj.w")
    public int field933 = 2;

    @ObfuscatedName("at.t(Lfj;Lfj;Lfj;B)V")
    public static void method660(class158 arg0, class158 arg1, class158 arg2) {
        Statics.field913 = arg0;
        Statics.field931 = arg1;
        Statics.field915 = arg2;
    }

    @ObfuscatedName("u.b(IB)Laj;")
    public static class40 method168(int arg0) {
        class40 var1 = (class40) field922.method3339((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field913.method2881(12, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method784(new class111(var2));
        }
        var3.method790();
        field922.method3341(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.p(Ldc;B)V")
    public void method784(class111 arg0) {
        while (true) {
            int var2 = arg0.method2172();
            if (var2 == 0) {
                return;
            }
            this.method785(arg0, var2);
        }
    }

    @ObfuscatedName("aj.e(Ldc;II)V")
    public void method785(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2255();
            this.field920 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field920[var4] = arg0.method2255();
            }
            this.field918 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field918[var5] = arg0.method2255();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field918[var6] += arg0.method2255() << 16;
            }
        } else if (arg1 == 2) {
            this.field916 = arg0.method2255();
        } else if (arg1 == 3) {
            int var7 = arg0.method2172();
            this.field923 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field923[var8] = arg0.method2172();
            }
            this.field923[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field924 = true;
        } else if (arg1 == 5) {
            this.field932 = arg0.method2172();
        } else if (arg1 == 6) {
            this.field926 = arg0.method2255();
        } else if (arg1 == 7) {
            this.field927 = arg0.method2255();
        } else if (arg1 == 8) {
            this.field928 = arg0.method2172();
        } else if (arg1 == 9) {
            this.field929 = arg0.method2172();
        } else if (arg1 == 10) {
            this.field930 = arg0.method2172();
        } else if (arg1 == 11) {
            this.field933 = arg0.method2172();
        } else if (arg1 == 12) {
            int var9 = arg0.method2172();
            this.field919 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field919[var10] = arg0.method2255();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field919[var11] += arg0.method2255() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2172();
            this.field921 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field921[var13] = arg0.method2307();
            }
        }
    }

    @ObfuscatedName("aj.i(I)V")
    public void method790() {
        if (this.field929 == -1) {
            if (this.field923 == null) {
                this.field929 = 0;
            } else {
                this.field929 = 2;
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

    @ObfuscatedName("aj.o(Lcs;II)Lcs;")
    public class100 method787(class100 arg0, int arg1) {
        int var3 = this.field918[arg1];
        class98 var4 = method2851(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2053(true);
        } else {
            class100 var6 = arg0.method2053(!var4.method2008(var5));
            var6.method2043(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aj.f(Lcs;III)Lcs;")
    public class100 method810(class100 arg0, int arg1, int arg2) {
        int var4 = this.field918[arg1];
        class98 var5 = method2851(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2053(true);
        }
        class100 var7 = arg0.method2053(!var5.method2008(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2039();
        } else if (var8 == 2) {
            var7.method2027();
        } else if (var8 == 3) {
            var7.method2038();
        }
        var7.method2043(var5, var6);
        if (var8 == 1) {
            var7.method2038();
        } else if (var8 == 2) {
            var7.method2027();
        } else if (var8 == 3) {
            var7.method2039();
        }
        return var7;
    }

    @ObfuscatedName("aj.d(Lcs;IB)Lcs;")
    public class100 method786(class100 arg0, int arg1) {
        int var3 = this.field918[arg1];
        class98 var4 = method2851(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2018(true);
        } else {
            class100 var6 = arg0.method2018(!var4.method2008(var5));
            var6.method2043(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aj.j(Lcs;ILaj;IS)Lcs;")
    public class100 method794(class100 arg0, int arg1, class40 arg2, int arg3) {
        int var5 = this.field918[arg1];
        class98 var6 = method2851(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method787(arg0, arg3);
        }
        int var8 = arg2.field918[arg3];
        class98 var9 = method2851(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class100 var11 = arg0.method2053(!var6.method2008(var7));
            var11.method2043(var6, var7);
            return var11;
        } else {
            class100 var12 = arg0.method2053(!var6.method2008(var7) & !var9.method2008(var10));
            var12.method2032(var6, var7, var9, var10, this.field923);
            return var12;
        }
    }

    @ObfuscatedName("aj.x(Lcs;II)Lcs;")
    public class100 method791(class100 arg0, int arg1) {
        int var3 = this.field918[arg1];
        class98 var4 = method2851(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2053(true);
        }
        class98 var6 = null;
        int var7 = 0;
        if (this.field919 != null && arg1 < this.field919.length) {
            int var8 = this.field919[arg1];
            var6 = method2851(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class100 var10 = arg0.method2053(!var4.method2008(var5));
            var10.method2043(var4, var5);
            return var10;
        } else {
            class100 var9 = arg0.method2053(!var4.method2008(var5) & !var6.method2008(var7));
            var9.method2043(var4, var5);
            var9.method2043(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ei.v(IB)Lcw;")
    public static class98 method2851(int arg0) {
        class98 var1 = (class98) field917.method3339((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class158 var2 = Statics.field931;
        class158 var3 = Statics.field915;
        boolean var4 = true;
        int[] var5 = var2.method2899(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2912(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2912(var8, 0);
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
            field917.method3341(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("am.a(I)V")
    public static void method1113() {
        field922.method3342();
        field917.method3342();
    }
}
