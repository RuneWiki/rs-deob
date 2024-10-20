package deob;

@ObfuscatedName("ag")
public class class34 extends class174 {

    @ObfuscatedName("ag.h")
    public static class170 field874 = new class170(64);

    @ObfuscatedName("ag.y")
    public static class170 field875 = new class170(100);

    @ObfuscatedName("ag.j")
    public int[] field888;

    @ObfuscatedName("ag.l")
    public int[] field877;

    @ObfuscatedName("ag.f")
    public int[] field878;

    @ObfuscatedName("ag.n")
    public int[] field879;

    @ObfuscatedName("ag.k")
    public int field876 = -1;

    @ObfuscatedName("ag.q")
    public int[] field881;

    @ObfuscatedName("ag.w")
    public boolean field882 = false;

    @ObfuscatedName("ag.v")
    public int field880 = 5;

    @ObfuscatedName("ag.z")
    public int field884 = -1;

    @ObfuscatedName("ag.m")
    public int field883 = -1;

    @ObfuscatedName("ag.r")
    public int field886 = 99;

    @ObfuscatedName("ag.u")
    public int field872 = -1;

    @ObfuscatedName("ag.i")
    public int field887 = -1;

    @ObfuscatedName("ag.x")
    public int field889 = 2;

    @ObfuscatedName("am.p(Leu;Leu;Leu;I)V")
    public static void method581(class153 arg0, class153 arg1, class153 arg2) {
        Statics.field885 = arg0;
        Statics.field873 = arg1;
        Statics.field1932 = arg2;
    }

    @ObfuscatedName("ag.a(Ldj;B)V")
    public void method718(class127 arg0) {
        while (true) {
            int var2 = arg0.method2494();
            if (var2 == 0) {
                return;
            }
            this.method719(arg0, var2);
        }
    }

    @ObfuscatedName("ag.h(Ldj;II)V")
    public void method719(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2496();
            this.field878 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field878[var4] = arg0.method2496();
            }
            this.field888 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field888[var5] = arg0.method2496();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field888[var6] += arg0.method2496() << 16;
            }
        } else if (arg1 == 2) {
            this.field876 = arg0.method2496();
        } else if (arg1 == 3) {
            int var7 = arg0.method2494();
            this.field881 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field881[var8] = arg0.method2494();
            }
            this.field881[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field882 = true;
        } else if (arg1 == 5) {
            this.field880 = arg0.method2494();
        } else if (arg1 == 6) {
            this.field884 = arg0.method2496();
        } else if (arg1 == 7) {
            this.field883 = arg0.method2496();
        } else if (arg1 == 8) {
            this.field886 = arg0.method2494();
        } else if (arg1 == 9) {
            this.field872 = arg0.method2494();
        } else if (arg1 == 10) {
            this.field887 = arg0.method2494();
        } else if (arg1 == 11) {
            this.field889 = arg0.method2494();
        } else if (arg1 == 12) {
            int var9 = arg0.method2494();
            this.field877 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field877[var10] = arg0.method2496();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field877[var11] += arg0.method2496() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2494();
            this.field879 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field879[var13] = arg0.method2498();
            }
        }
    }

    @ObfuscatedName("ag.y(I)V")
    public void method721() {
        if (this.field872 == -1) {
            if (this.field881 == null) {
                this.field872 = 0;
            } else {
                this.field872 = 2;
            }
        }
        if (this.field887 != -1) {
            return;
        }
        if (this.field881 == null) {
            this.field887 = 0;
        } else {
            this.field887 = 2;
        }
    }

    @ObfuscatedName("ag.j(Lds;II)Lds;")
    public class112 method717(class112 arg0, int arg1) {
        int var3 = this.field888[arg1];
        class109 var4 = method1448(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2257(true);
        } else {
            class112 var6 = arg0.method2257(!var4.method2237(var5));
            var6.method2270(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ag.l(Lds;IIB)Lds;")
    public class112 method722(class112 arg0, int arg1, int arg2) {
        int var4 = this.field888[arg1];
        class109 var5 = method1448(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2257(true);
        }
        class112 var7 = arg0.method2257(!var5.method2237(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2268();
        } else if (var8 == 2) {
            var7.method2267();
        } else if (var8 == 3) {
            var7.method2266();
        }
        var7.method2270(var5, var6);
        if (var8 == 1) {
            var7.method2266();
        } else if (var8 == 2) {
            var7.method2267();
        } else if (var8 == 3) {
            var7.method2268();
        }
        return var7;
    }

    @ObfuscatedName("ag.f(Lds;IB)Lds;")
    public class112 method741(class112 arg0, int arg1) {
        int var3 = this.field888[arg1];
        class109 var4 = method1448(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2258(true);
        } else {
            class112 var6 = arg0.method2258(!var4.method2237(var5));
            var6.method2270(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ag.n(Lds;ILag;II)Lds;")
    public class112 method723(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field888[arg1];
        class109 var6 = method1448(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method717(arg0, arg3);
        }
        int var8 = arg2.field888[arg3];
        class109 var9 = method1448(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2257(!var6.method2237(var7));
            var11.method2270(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2257(!var6.method2237(var7) & !var9.method2237(var10));
            var12.method2264(var6, var7, var9, var10, this.field881);
            return var12;
        }
    }

    @ObfuscatedName("ag.k(Lds;IB)Lds;")
    public class112 method738(class112 arg0, int arg1) {
        int var3 = this.field888[arg1];
        class109 var4 = method1448(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2257(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field877 != null && arg1 < this.field877.length) {
            int var8 = this.field877[arg1];
            var6 = method1448(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2257(!var4.method2237(var5));
            var10.method2270(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2257(!var4.method2237(var5) & !var6.method2237(var7));
            var9.method2270(var4, var5);
            var9.method2270(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bm.q(IB)Ldk;")
    public static class109 method1448(int arg0) {
        class109 var1 = (class109) field875.method3266((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class109 var2 = Statics.method1397(Statics.field873, Statics.field1932, arg0, false);
        if (var2 != null) {
            field875.method3268(var2, (long) arg0);
        }
        return var2;
    }
}
