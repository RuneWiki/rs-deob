package deob;

@ObfuscatedName("an")
public class class34 extends class174 {

    @ObfuscatedName("an.v")
    public static class170 field902 = new class170(64);

    @ObfuscatedName("an.g")
    public static class170 field903 = new class170(100);

    @ObfuscatedName("an.x")
    public int[] field899;

    @ObfuscatedName("an.u")
    public int[] field905;

    @ObfuscatedName("an.l")
    public int[] field906;

    @ObfuscatedName("an.a")
    public int[] field919;

    @ObfuscatedName("an.h")
    public int field908 = -1;

    @ObfuscatedName("an.t")
    public int[] field909;

    @ObfuscatedName("an.m")
    public boolean field910 = false;

    @ObfuscatedName("an.s")
    public int field911 = 5;

    @ObfuscatedName("an.j")
    public int field912 = -1;

    @ObfuscatedName("an.b")
    public int field913 = -1;

    @ObfuscatedName("an.n")
    public int field917 = 99;

    @ObfuscatedName("an.z")
    public int field904 = -1;

    @ObfuscatedName("an.d")
    public int field907 = -1;

    @ObfuscatedName("an.f")
    public int field916 = 2;

    @ObfuscatedName("be.c(Ley;Ley;Ley;I)V")
    public static void method1180(class153 arg0, class153 arg1, class153 arg2) {
        Statics.field914 = arg0;
        Statics.field900 = arg1;
        Statics.field901 = arg2;
    }

    @ObfuscatedName("an.y(Ldg;S)V")
    public void method709(class127 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method701(arg0, var2);
        }
    }

    @ObfuscatedName("an.v(Ldg;IB)V")
    public void method701(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2327();
            this.field906 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field906[var4] = arg0.method2327();
            }
            this.field899 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field899[var5] = arg0.method2327();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field899[var6] += arg0.method2327() << 16;
            }
        } else if (arg1 == 2) {
            this.field908 = arg0.method2327();
        } else if (arg1 == 3) {
            int var7 = arg0.method2383();
            this.field909 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field909[var8] = arg0.method2383();
            }
            this.field909[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field910 = true;
        } else if (arg1 == 5) {
            this.field911 = arg0.method2383();
        } else if (arg1 == 6) {
            this.field912 = arg0.method2327();
        } else if (arg1 == 7) {
            this.field913 = arg0.method2327();
        } else if (arg1 == 8) {
            this.field917 = arg0.method2383();
        } else if (arg1 == 9) {
            this.field904 = arg0.method2383();
        } else if (arg1 == 10) {
            this.field907 = arg0.method2383();
        } else if (arg1 == 11) {
            this.field916 = arg0.method2383();
        } else if (arg1 == 12) {
            int var9 = arg0.method2383();
            this.field905 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field905[var10] = arg0.method2327();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field905[var11] += arg0.method2327() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2383();
            this.field919 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field919[var13] = arg0.method2322();
            }
        }
    }

    @ObfuscatedName("an.g(B)V")
    public void method683() {
        if (this.field904 == -1) {
            if (this.field909 == null) {
                this.field904 = 0;
            } else {
                this.field904 = 2;
            }
        }
        if (this.field907 != -1) {
            return;
        }
        if (this.field909 == null) {
            this.field907 = 0;
        } else {
            this.field907 = 2;
        }
    }

    @ObfuscatedName("an.x(Ldl;II)Ldl;")
    public class112 method678(class112 arg0, int arg1) {
        int var3 = this.field899[arg1];
        class109 var4 = method523(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2138(true);
        } else {
            class112 var6 = arg0.method2138(!var4.method2118(var5));
            var6.method2141(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("an.u(Ldl;III)Ldl;")
    public class112 method679(class112 arg0, int arg1, int arg2) {
        int var4 = this.field899[arg1];
        class109 var5 = method523(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2138(true);
        }
        class112 var7 = arg0.method2138(!var5.method2118(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2146();
        } else if (var8 == 2) {
            var7.method2145();
        } else if (var8 == 3) {
            var7.method2144();
        }
        var7.method2141(var5, var6);
        if (var8 == 1) {
            var7.method2144();
        } else if (var8 == 2) {
            var7.method2145();
        } else if (var8 == 3) {
            var7.method2146();
        }
        return var7;
    }

    @ObfuscatedName("an.l(Ldl;II)Ldl;")
    public class112 method680(class112 arg0, int arg1) {
        int var3 = this.field899[arg1];
        class109 var4 = method523(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2136(true);
        } else {
            class112 var6 = arg0.method2136(!var4.method2118(var5));
            var6.method2141(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("an.a(Ldl;ILan;II)Ldl;")
    public class112 method703(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field899[arg1];
        class109 var6 = method523(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method678(arg0, arg3);
        }
        int var8 = arg2.field899[arg3];
        class109 var9 = method523(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2138(!var6.method2118(var7));
            var11.method2141(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2138(!var6.method2118(var7) & !var9.method2118(var10));
            var12.method2163(var6, var7, var9, var10, this.field909);
            return var12;
        }
    }

    @ObfuscatedName("an.h(Ldl;II)Ldl;")
    public class112 method682(class112 arg0, int arg1) {
        int var3 = this.field899[arg1];
        class109 var4 = method523(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2138(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field905 != null && arg1 < this.field905.length) {
            int var8 = this.field905[arg1];
            var6 = method523(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2138(!var4.method2118(var5));
            var10.method2141(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2138(!var4.method2118(var5) & !var6.method2118(var7));
            var9.method2141(var4, var5);
            var9.method2141(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("as.t(IB)Lda;")
    public static class109 method523(int arg0) {
        class109 var1 = (class109) field903.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class153 var2 = Statics.field900;
        class153 var3 = Statics.field901;
        boolean var4 = true;
        int[] var5 = var2.method2951(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2892(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2892(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class109 var10;
        if (var4) {
            try {
                var10 = new class109(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field903.method3092(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("fz.m(I)V")
    public static void method3050() {
        field902.method3093();
        field903.method3093();
    }
}
