package deob;

@ObfuscatedName("ar")
public class class34 extends class174 {

    @ObfuscatedName("ar.t")
    public static class170 field881 = new class170(64);

    @ObfuscatedName("ar.f")
    public static class170 field870 = new class170(100);

    @ObfuscatedName("ar.c")
    public int[] field871;

    @ObfuscatedName("ar.p")
    public int[] field872;

    @ObfuscatedName("ar.s")
    public int[] field877;

    @ObfuscatedName("ar.k")
    public int[] field874;

    @ObfuscatedName("ar.m")
    public int field873 = -1;

    @ObfuscatedName("ar.y")
    public int[] field876;

    @ObfuscatedName("ar.b")
    public boolean field878 = false;

    @ObfuscatedName("ar.l")
    public int field875 = 5;

    @ObfuscatedName("ar.x")
    public int field879 = -1;

    @ObfuscatedName("ar.z")
    public int field880 = -1;

    @ObfuscatedName("ar.r")
    public int field868 = 99;

    @ObfuscatedName("ar.h")
    public int field882 = -1;

    @ObfuscatedName("ar.v")
    public int field883 = -1;

    @ObfuscatedName("ar.u")
    public int field884 = 2;

    @ObfuscatedName("dj.d(Lej;Lej;Lej;I)V")
    public static void method2184(class152 arg0, class152 arg1, class152 arg2) {
        Statics.field889 = arg0;
        Statics.field867 = arg1;
        Statics.field888 = arg2;
    }

    @ObfuscatedName("l.g(II)Lar;")
    public static class34 method136(int arg0) {
        class34 var1 = (class34) field881.method3210((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field889.method2958(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method673(new class127(var2));
        }
        var3.method675();
        field881.method3221(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.a(Ldo;I)V")
    public void method673(class127 arg0) {
        while (true) {
            int var2 = arg0.method2509();
            if (var2 == 0) {
                return;
            }
            this.method672(arg0, var2);
        }
    }

    @ObfuscatedName("ar.t(Ldo;II)V")
    public void method672(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2512();
            this.field877 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field877[var4] = arg0.method2512();
            }
            this.field871 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field871[var5] = arg0.method2512();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field871[var6] += arg0.method2512() << 16;
            }
        } else if (arg1 == 2) {
            this.field873 = arg0.method2512();
        } else if (arg1 == 3) {
            int var7 = arg0.method2509();
            this.field876 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field876[var8] = arg0.method2509();
            }
            this.field876[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field878 = true;
        } else if (arg1 == 5) {
            this.field875 = arg0.method2509();
        } else if (arg1 == 6) {
            this.field879 = arg0.method2512();
        } else if (arg1 == 7) {
            this.field880 = arg0.method2512();
        } else if (arg1 == 8) {
            this.field868 = arg0.method2509();
        } else if (arg1 == 9) {
            this.field882 = arg0.method2509();
        } else if (arg1 == 10) {
            this.field883 = arg0.method2509();
        } else if (arg1 == 11) {
            this.field884 = arg0.method2509();
        } else if (arg1 == 12) {
            int var9 = arg0.method2509();
            this.field872 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field872[var10] = arg0.method2512();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field872[var11] += arg0.method2512() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2509();
            this.field874 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field874[var13] = arg0.method2404();
            }
        }
    }

    @ObfuscatedName("ar.f(I)V")
    public void method675() {
        if (this.field882 == -1) {
            if (this.field876 == null) {
                this.field882 = 0;
            } else {
                this.field882 = 2;
            }
        }
        if (this.field883 != -1) {
            return;
        }
        if (this.field876 == null) {
            this.field883 = 0;
        } else {
            this.field883 = 2;
        }
    }

    @ObfuscatedName("ar.c(Ldd;IS)Ldd;")
    public class112 method687(class112 arg0, int arg1) {
        int var3 = this.field871[arg1];
        class109 var4 = method143(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2187(true);
        } else {
            class112 var6 = arg0.method2187(!var4.method2166(var5));
            var6.method2193(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.p(Ldd;III)Ldd;")
    public class112 method677(class112 arg0, int arg1, int arg2) {
        int var4 = this.field871[arg1];
        class109 var5 = method143(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2187(true);
        }
        class112 var7 = arg0.method2187(!var5.method2166(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2198();
        } else if (var8 == 2) {
            var7.method2197();
        } else if (var8 == 3) {
            var7.method2207();
        }
        var7.method2193(var5, var6);
        if (var8 == 1) {
            var7.method2207();
        } else if (var8 == 2) {
            var7.method2197();
        } else if (var8 == 3) {
            var7.method2198();
        }
        return var7;
    }

    @ObfuscatedName("ar.s(Ldd;IB)Ldd;")
    public class112 method678(class112 arg0, int arg1) {
        int var3 = this.field871[arg1];
        class109 var4 = method143(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2188(true);
        } else {
            class112 var6 = arg0.method2188(!var4.method2166(var5));
            var6.method2193(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.k(Ldd;ILar;II)Ldd;")
    public class112 method674(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field871[arg1];
        class109 var6 = method143(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method687(arg0, arg3);
        }
        int var8 = arg2.field871[arg3];
        class109 var9 = method143(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2187(!var6.method2166(var7));
            var11.method2193(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2187(!var6.method2166(var7) & !var9.method2166(var10));
            var12.method2194(var6, var7, var9, var10, this.field876);
            return var12;
        }
    }

    @ObfuscatedName("ar.m(Ldd;II)Ldd;")
    public class112 method680(class112 arg0, int arg1) {
        int var3 = this.field871[arg1];
        class109 var4 = method143(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2187(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field872 != null && arg1 < this.field872.length) {
            int var8 = this.field872[arg1];
            var6 = method143(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2187(!var4.method2166(var5));
            var10.method2193(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2187(!var4.method2166(var5) & !var6.method2166(var7));
            var9.method2193(var4, var5);
            var9.method2193(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("r.y(IB)Ldg;")
    public static class109 method143(int arg0) {
        class109 var1 = (class109) field870.method3210((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class109 var2 = Statics.method176(Statics.field867, Statics.field888, arg0, false);
        if (var2 != null) {
            field870.method3221(var2, (long) arg0);
        }
        return var2;
    }
}
