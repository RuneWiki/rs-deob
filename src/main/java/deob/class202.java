package deob;

@ObfuscatedName("gg")
public class class202 extends class130 {

    @ObfuscatedName("gg.a")
    public static class125 field3045 = new class125(64);

    @ObfuscatedName("gg.f")
    public static class125 field3041 = new class125(100);

    @ObfuscatedName("gg.c")
    public int[] field3042;

    @ObfuscatedName("gg.d")
    public int[] field3038;

    @ObfuscatedName("gg.l")
    public int[] field3049;

    @ObfuscatedName("gg.g")
    public int[] field3050;

    @ObfuscatedName("gg.z")
    public int field3046 = -1;

    @ObfuscatedName("gg.t")
    public int[] field3047;

    @ObfuscatedName("gg.m")
    public boolean field3048 = false;

    @ObfuscatedName("gg.q")
    public int field3037 = 5;

    @ObfuscatedName("gg.e")
    public int field3039 = -1;

    @ObfuscatedName("gg.v")
    public int field3051 = -1;

    @ObfuscatedName("gg.j")
    public int field3052 = 99;

    @ObfuscatedName("gg.p")
    public int field3053 = -1;

    @ObfuscatedName("gg.k")
    public int field3040 = -1;

    @ObfuscatedName("gg.r")
    public int field3054 = 2;

    @ObfuscatedName("eb.u(Lgt;Lgt;Lgt;I)V")
    public static void method2496(class183 arg0, class183 arg1, class183 arg2) {
        Statics.field3043 = arg0;
        Statics.field3044 = arg1;
        Statics.field3055 = arg2;
    }

    @ObfuscatedName("gd.x(II)Lgg;")
    public static class202 method3327(int arg0) {
        class202 var1 = (class202) field3045.method2186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3043.method3071(12, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3569(new class154(var2));
        }
        var3.method3544();
        field3045.method2179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gg.i(Len;I)V")
    public void method3569(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3543(arg0, var2);
        }
    }

    @ObfuscatedName("gg.a(Len;II)V")
    public void method3543(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2581();
            this.field3049 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3049[var4] = arg0.method2581();
            }
            this.field3042 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3042[var5] = arg0.method2581();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3042[var6] += arg0.method2581() << 16;
            }
        } else if (arg1 == 2) {
            this.field3046 = arg0.method2581();
        } else if (arg1 == 3) {
            int var7 = arg0.method2708();
            this.field3047 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3047[var8] = arg0.method2708();
            }
            this.field3047[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3048 = true;
        } else if (arg1 == 5) {
            this.field3037 = arg0.method2708();
        } else if (arg1 == 6) {
            this.field3039 = arg0.method2581();
        } else if (arg1 == 7) {
            this.field3051 = arg0.method2581();
        } else if (arg1 == 8) {
            this.field3052 = arg0.method2708();
        } else if (arg1 == 9) {
            this.field3053 = arg0.method2708();
        } else if (arg1 == 10) {
            this.field3040 = arg0.method2708();
        } else if (arg1 == 11) {
            this.field3054 = arg0.method2708();
        } else if (arg1 == 12) {
            int var9 = arg0.method2708();
            this.field3038 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3038[var10] = arg0.method2581();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3038[var11] += arg0.method2581() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2708();
            this.field3050 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3050[var13] = arg0.method2599();
            }
        }
    }

    @ObfuscatedName("gg.c(I)V")
    public void method3544() {
        if (this.field3053 == -1) {
            if (this.field3047 == null) {
                this.field3053 = 0;
            } else {
                this.field3053 = 2;
            }
        }
        if (this.field3040 != -1) {
            return;
        }
        if (this.field3047 == null) {
            this.field3040 = 0;
        } else {
            this.field3040 = 2;
        }
    }

    @ObfuscatedName("gg.g(Lcs;IB)Lcs;")
    public class83 method3557(class83 arg0, int arg1) {
        int var3 = this.field3042[arg1];
        class93 var4 = method170(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1487(true);
        } else {
            class83 var6 = arg0.method1487(!var4.method1773(var5));
            var6.method1452(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gg.z(Lcs;III)Lcs;")
    public class83 method3546(class83 arg0, int arg1, int arg2) {
        int var4 = this.field3042[arg1];
        class93 var5 = method170(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1487(true);
        }
        class83 var7 = arg0.method1487(!var5.method1773(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1457();
        } else if (var8 == 2) {
            var7.method1446();
        } else if (var8 == 3) {
            var7.method1455();
        }
        var7.method1452(var5, var6);
        if (var8 == 1) {
            var7.method1455();
        } else if (var8 == 2) {
            var7.method1446();
        } else if (var8 == 3) {
            var7.method1457();
        }
        return var7;
    }

    @ObfuscatedName("gg.t(Lcs;II)Lcs;")
    public class83 method3547(class83 arg0, int arg1) {
        int var3 = this.field3042[arg1];
        class93 var4 = method170(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1447(true);
        } else {
            class83 var6 = arg0.method1447(!var4.method1773(var5));
            var6.method1452(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("gg.m(Lcs;ILgg;II)Lcs;")
    public class83 method3548(class83 arg0, int arg1, class202 arg2, int arg3) {
        int var5 = this.field3042[arg1];
        class93 var6 = method170(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3557(arg0, arg3);
        }
        int var8 = arg2.field3042[arg3];
        class93 var9 = method170(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class83 var11 = arg0.method1487(!var6.method1773(var7));
            var11.method1452(var6, var7);
            return var11;
        } else {
            class83 var12 = arg0.method1487(!var6.method1773(var7) & !var9.method1773(var10));
            var12.method1453(var6, var7, var9, var10, this.field3047);
            return var12;
        }
    }

    @ObfuscatedName("gg.q(Lcs;II)Lcs;")
    public class83 method3549(class83 arg0, int arg1) {
        int var3 = this.field3042[arg1];
        class93 var4 = method170(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1487(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field3038 != null && arg1 < this.field3038.length) {
            int var8 = this.field3038[arg1];
            var6 = method170(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class83 var10 = arg0.method1487(!var4.method1773(var5));
            var10.method1452(var4, var5);
            return var10;
        } else {
            class83 var9 = arg0.method1487(!var4.method1773(var5) & !var6.method1773(var7));
            var9.method1452(var4, var5);
            var9.method1452(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("q.e(II)Lce;")
    public static class93 method170(int arg0) {
        class93 var1 = (class93) field3041.method2186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class183 var2 = Statics.field3044;
        class183 var3 = Statics.field3055;
        boolean var4 = true;
        int[] var5 = var2.method3113(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3067(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3067(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class93 var10;
        if (var4) {
            try {
                var10 = new class93(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3041.method2179(var10, (long) arg0);
        }
        return var10;
    }
}
