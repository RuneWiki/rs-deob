package deob;

@ObfuscatedName("ap")
public class class38 extends class182 {

    @ObfuscatedName("ap.w")
    public static class171 field922 = new class171(64);

    @ObfuscatedName("ap.m")
    public static class171 field904 = new class171(100);

    @ObfuscatedName("ap.j")
    public int[] field900;

    @ObfuscatedName("ap.g")
    public int[] field906;

    @ObfuscatedName("ap.p")
    public int[] field905;

    @ObfuscatedName("ap.o")
    public int[] field908;

    @ObfuscatedName("ap.b")
    public int field909 = -1;

    @ObfuscatedName("ap.x")
    public int[] field910;

    @ObfuscatedName("ap.n")
    public boolean field907 = false;

    @ObfuscatedName("ap.d")
    public int field914 = 5;

    @ObfuscatedName("ap.s")
    public int field913 = -1;

    @ObfuscatedName("ap.v")
    public int field912 = -1;

    @ObfuscatedName("ap.t")
    public int field915 = 99;

    @ObfuscatedName("ap.u")
    public int field921 = -1;

    @ObfuscatedName("ap.l")
    public int field917 = -1;

    @ObfuscatedName("ap.i")
    public int field918 = 2;

    @ObfuscatedName("fb.k(Lee;Lee;Lee;I)V")
    public static void method2993(class146 arg0, class146 arg1, class146 arg2) {
        Statics.field901 = arg0;
        Statics.field916 = arg1;
        Statics.field902 = arg2;
    }

    @ObfuscatedName("o.r(II)Lap;")
    public static class38 method102(int arg0) {
        class38 var1 = (class38) field922.method3141((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field901.method2749(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method698(new class107(var2));
        }
        var3.method701();
        field922.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.y(Lde;I)V")
    public void method698(class107 arg0) {
        while (true) {
            int var2 = arg0.method2111();
            if (var2 == 0) {
                return;
            }
            this.method718(arg0, var2);
        }
    }

    @ObfuscatedName("ap.w(Lde;II)V")
    public void method718(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2232();
            this.field905 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field905[var4] = arg0.method2232();
            }
            this.field900 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field900[var5] = arg0.method2232();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field900[var6] += arg0.method2232() << 16;
            }
        } else if (arg1 == 2) {
            this.field909 = arg0.method2232();
        } else if (arg1 == 3) {
            int var7 = arg0.method2111();
            this.field910 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field910[var8] = arg0.method2111();
            }
            this.field910[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field907 = true;
        } else if (arg1 == 5) {
            this.field914 = arg0.method2111();
        } else if (arg1 == 6) {
            this.field913 = arg0.method2232();
        } else if (arg1 == 7) {
            this.field912 = arg0.method2232();
        } else if (arg1 == 8) {
            this.field915 = arg0.method2111();
        } else if (arg1 == 9) {
            this.field921 = arg0.method2111();
        } else if (arg1 == 10) {
            this.field917 = arg0.method2111();
        } else if (arg1 == 11) {
            this.field918 = arg0.method2111();
        } else if (arg1 == 12) {
            int var9 = arg0.method2111();
            this.field906 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field906[var10] = arg0.method2232();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field906[var11] += arg0.method2232() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2111();
            this.field908 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field908[var13] = arg0.method2262();
            }
        }
    }

    @ObfuscatedName("ap.m(B)V")
    public void method701() {
        if (this.field921 == -1) {
            if (this.field910 == null) {
                this.field921 = 0;
            } else {
                this.field921 = 2;
            }
        }
        if (this.field917 != -1) {
            return;
        }
        if (this.field910 == null) {
            this.field917 = 0;
        } else {
            this.field917 = 2;
        }
    }

    @ObfuscatedName("ap.j(Lcp;II)Lcp;")
    public class98 method700(class98 arg0, int arg1) {
        int var3 = this.field900[arg1];
        class96 var4 = method489(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1977(true);
        } else {
            class98 var6 = arg0.method1977(!var4.method1966(var5));
            var6.method1983(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ap.g(Lcp;IIB)Lcp;")
    public class98 method699(class98 arg0, int arg1, int arg2) {
        int var4 = this.field900[arg1];
        class96 var5 = method489(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1977(true);
        }
        class98 var7 = arg0.method1977(!var5.method1966(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1988();
        } else if (var8 == 2) {
            var7.method2001();
        } else if (var8 == 3) {
            var7.method2004();
        }
        var7.method1983(var5, var6);
        if (var8 == 1) {
            var7.method2004();
        } else if (var8 == 2) {
            var7.method2001();
        } else if (var8 == 3) {
            var7.method1988();
        }
        return var7;
    }

    @ObfuscatedName("ap.p(Lcp;II)Lcp;")
    public class98 method702(class98 arg0, int arg1) {
        int var3 = this.field900[arg1];
        class96 var4 = method489(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2010(true);
        } else {
            class98 var6 = arg0.method2010(!var4.method1966(var5));
            var6.method1983(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ap.o(Lcp;ILap;II)Lcp;")
    public class98 method728(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field900[arg1];
        class96 var6 = method489(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method700(arg0, arg3);
        }
        int var8 = arg2.field900[arg3];
        class96 var9 = method489(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1977(!var6.method1966(var7));
            var11.method1983(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1977(!var6.method1966(var7) & !var9.method1966(var10));
            var12.method2030(var6, var7, var9, var10, this.field910);
            return var12;
        }
    }

    @ObfuscatedName("ap.b(Lcp;IB)Lcp;")
    public class98 method704(class98 arg0, int arg1) {
        int var3 = this.field900[arg1];
        class96 var4 = method489(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1977(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field906 != null && arg1 < this.field906.length) {
            int var8 = this.field906[arg1];
            var6 = method489(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1977(!var4.method1966(var5));
            var10.method1983(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1977(!var4.method1966(var5) & !var6.method1966(var7));
            var9.method1983(var4, var5);
            var9.method1983(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("c.x(II)Lcv;")
    public static class96 method489(int arg0) {
        class96 var1 = (class96) field904.method3141((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class146 var2 = Statics.field916;
        class146 var3 = Statics.field902;
        boolean var4 = true;
        int[] var5 = var2.method2687(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2696(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2696(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class96 var10;
        if (var4) {
            try {
                var10 = new class96(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field904.method3137(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("gd.n(I)V")
    public static void method3306() {
        field922.method3138();
        field904.method3138();
    }
}
