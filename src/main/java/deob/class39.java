package deob;

@ObfuscatedName("ah")
public class class39 extends class185 {

    @ObfuscatedName("ah.b")
    public static class174 field934 = new class174(64);

    @ObfuscatedName("ah.k")
    public static class174 field919 = new class174(100);

    @ObfuscatedName("ah.c")
    public int[] field920;

    @ObfuscatedName("ah.w")
    public int[] field921;

    @ObfuscatedName("ah.l")
    public int[] field918;

    @ObfuscatedName("ah.n")
    public int[] field923;

    @ObfuscatedName("ah.d")
    public int field924 = -1;

    @ObfuscatedName("ah.h")
    public int[] field917;

    @ObfuscatedName("ah.y")
    public boolean field932 = false;

    @ObfuscatedName("ah.p")
    public int field927 = 5;

    @ObfuscatedName("ah.i")
    public int field922 = -1;

    @ObfuscatedName("ah.s")
    public int field926 = -1;

    @ObfuscatedName("ah.f")
    public int field930 = 99;

    @ObfuscatedName("ah.u")
    public int field931 = -1;

    @ObfuscatedName("ah.v")
    public int field929 = -1;

    @ObfuscatedName("ah.r")
    public int field933 = 2;

    @ObfuscatedName("ed.g(II)Lah;")
    public static class39 method2627(int arg0) {
        class39 var1 = (class39) field934.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field916.method2660(12, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method673(new class108(var2));
        }
        var3.method681();
        field934.method3099(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.j(Ldf;I)V")
    public void method673(class108 arg0) {
        while (true) {
            int var2 = arg0.method2083();
            if (var2 == 0) {
                return;
            }
            this.method685(arg0, var2);
        }
    }

    @ObfuscatedName("ah.z(Ldf;II)V")
    public void method685(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2263();
            this.field918 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field918[var4] = arg0.method2263();
            }
            this.field920 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field920[var5] = arg0.method2263();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field920[var6] += arg0.method2263() << 16;
            }
        } else if (arg1 == 2) {
            this.field924 = arg0.method2263();
        } else if (arg1 == 3) {
            int var7 = arg0.method2083();
            this.field917 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field917[var8] = arg0.method2083();
            }
            this.field917[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field932 = true;
        } else if (arg1 == 5) {
            this.field927 = arg0.method2083();
        } else if (arg1 == 6) {
            this.field922 = arg0.method2263();
        } else if (arg1 == 7) {
            this.field926 = arg0.method2263();
        } else if (arg1 == 8) {
            this.field930 = arg0.method2083();
        } else if (arg1 == 9) {
            this.field931 = arg0.method2083();
        } else if (arg1 == 10) {
            this.field929 = arg0.method2083();
        } else if (arg1 == 11) {
            this.field933 = arg0.method2083();
        } else if (arg1 == 12) {
            int var9 = arg0.method2083();
            this.field921 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field921[var10] = arg0.method2263();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field921[var11] += arg0.method2263() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2083();
            this.field923 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field923[var13] = arg0.method2260();
            }
        }
    }

    @ObfuscatedName("ah.b(I)V")
    public void method681() {
        if (this.field931 == -1) {
            if (this.field917 == null) {
                this.field931 = 0;
            } else {
                this.field931 = 2;
            }
        }
        if (this.field929 != -1) {
            return;
        }
        if (this.field917 == null) {
            this.field929 = 0;
        } else {
            this.field929 = 2;
        }
    }

    @ObfuscatedName("ah.k(Lcx;II)Lcx;")
    public class99 method701(class99 arg0, int arg1) {
        int var3 = this.field920[arg1];
        class97 var4 = method540(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1937(true);
        } else {
            class99 var6 = arg0.method1937(!var4.method1927(var5));
            var6.method1960(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.c(Lcx;III)Lcx;")
    public class99 method672(class99 arg0, int arg1, int arg2) {
        int var4 = this.field920[arg1];
        class97 var5 = method540(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1937(true);
        }
        class99 var7 = arg0.method1937(!var5.method1927(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1938();
        } else if (var8 == 2) {
            var7.method1946();
        } else if (var8 == 3) {
            var7.method1936();
        }
        var7.method1960(var5, var6);
        if (var8 == 1) {
            var7.method1936();
        } else if (var8 == 2) {
            var7.method1946();
        } else if (var8 == 3) {
            var7.method1938();
        }
        return var7;
    }

    @ObfuscatedName("ah.w(Lcx;II)Lcx;")
    public class99 method697(class99 arg0, int arg1) {
        int var3 = this.field920[arg1];
        class97 var4 = method540(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1944(true);
        } else {
            class99 var6 = arg0.method1944(!var4.method1927(var5));
            var6.method1960(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.l(Lcx;ILah;II)Lcx;")
    public class99 method679(class99 arg0, int arg1, class39 arg2, int arg3) {
        int var5 = this.field920[arg1];
        class97 var6 = method540(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method701(arg0, arg3);
        }
        int var8 = arg2.field920[arg3];
        class97 var9 = method540(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class99 var11 = arg0.method1937(!var6.method1927(var7));
            var11.method1960(var6, var7);
            return var11;
        } else {
            class99 var12 = arg0.method1937(!var6.method1927(var7) & !var9.method1927(var10));
            var12.method1943(var6, var7, var9, var10, this.field917);
            return var12;
        }
    }

    @ObfuscatedName("ah.n(Lcx;II)Lcx;")
    public class99 method680(class99 arg0, int arg1) {
        int var3 = this.field920[arg1];
        class97 var4 = method540(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1937(true);
        }
        class97 var6 = null;
        int var7 = 0;
        if (this.field921 != null && arg1 < this.field921.length) {
            int var8 = this.field921[arg1];
            var6 = method540(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class99 var10 = arg0.method1937(!var4.method1927(var5));
            var10.method1960(var4, var5);
            return var10;
        } else {
            class99 var9 = arg0.method1937(!var4.method1927(var5) & !var6.method1927(var7));
            var9.method1960(var4, var5);
            var9.method1960(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ap.d(II)Lcf;")
    public static class97 method540(int arg0) {
        class97 var1 = (class97) field919.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class97 var2 = class97.method724(Statics.field936, Statics.field2676, arg0, false);
        if (var2 != null) {
            field919.method3099(var2, (long) arg0);
        }
        return var2;
    }
}
