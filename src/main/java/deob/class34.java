package deob;

@ObfuscatedName("av")
public class class34 extends class174 {

    @ObfuscatedName("av.r")
    public static class170 field896 = new class170(64);

    @ObfuscatedName("av.p")
    public static class170 field907 = new class170(100);

    @ObfuscatedName("av.n")
    public int[] field898;

    @ObfuscatedName("av.o")
    public int[] field893;

    @ObfuscatedName("av.l")
    public int[] field900;

    @ObfuscatedName("av.t")
    public int[] field901;

    @ObfuscatedName("av.q")
    public int field897 = -1;

    @ObfuscatedName("av.c")
    public int[] field902;

    @ObfuscatedName("av.z")
    public boolean field904 = false;

    @ObfuscatedName("av.s")
    public int field905 = 5;

    @ObfuscatedName("av.h")
    public int field906 = -1;

    @ObfuscatedName("av.f")
    public int field908 = -1;

    @ObfuscatedName("av.w")
    public int field911 = 99;

    @ObfuscatedName("av.d")
    public int field909 = -1;

    @ObfuscatedName("av.y")
    public int field910 = -1;

    @ObfuscatedName("av.g")
    public int field895 = 2;

    @ObfuscatedName("u.a(Leb;Leb;Leb;I)V")
    public static void method246(class152 arg0, class152 arg1, class152 arg2) {
        Statics.field903 = arg0;
        Statics.field894 = arg1;
        Statics.field899 = arg2;
    }

    @ObfuscatedName("o.x(IB)Lav;")
    public static class34 method57(int arg0) {
        class34 var1 = (class34) field896.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field903.method2961(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method710(new class127(var2));
        }
        var3.method726();
        field896.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.e(Ldy;I)V")
    public void method710(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method712(arg0, var2);
        }
    }

    @ObfuscatedName("av.r(Ldy;IS)V")
    public void method712(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2413();
            this.field900 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field900[var4] = arg0.method2413();
            }
            this.field898 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field898[var5] = arg0.method2413();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field898[var6] += arg0.method2413() << 16;
            }
        } else if (arg1 == 2) {
            this.field897 = arg0.method2413();
        } else if (arg1 == 3) {
            int var7 = arg0.method2411();
            this.field902 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field902[var8] = arg0.method2411();
            }
            this.field902[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field904 = true;
        } else if (arg1 == 5) {
            this.field905 = arg0.method2411();
        } else if (arg1 == 6) {
            this.field906 = arg0.method2413();
        } else if (arg1 == 7) {
            this.field908 = arg0.method2413();
        } else if (arg1 == 8) {
            this.field911 = arg0.method2411();
        } else if (arg1 == 9) {
            this.field909 = arg0.method2411();
        } else if (arg1 == 10) {
            this.field910 = arg0.method2411();
        } else if (arg1 == 11) {
            this.field895 = arg0.method2411();
        } else if (arg1 == 12) {
            int var9 = arg0.method2411();
            this.field893 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field893[var10] = arg0.method2413();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field893[var11] += arg0.method2413() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2411();
            this.field901 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field901[var13] = arg0.method2415();
            }
        }
    }

    @ObfuscatedName("av.p(I)V")
    public void method726() {
        if (this.field909 == -1) {
            if (this.field902 == null) {
                this.field909 = 0;
            } else {
                this.field909 = 2;
            }
        }
        if (this.field910 != -1) {
            return;
        }
        if (this.field902 == null) {
            this.field910 = 0;
        } else {
            this.field910 = 2;
        }
    }

    @ObfuscatedName("av.n(Ldd;II)Ldd;")
    public class112 method713(class112 arg0, int arg1) {
        int var3 = this.field898[arg1];
        class109 var4 = method904(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2181(true);
        } else {
            class112 var6 = arg0.method2181(!var4.method2151(var5));
            var6.method2179(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("av.o(Ldd;III)Ldd;")
    public class112 method714(class112 arg0, int arg1, int arg2) {
        int var4 = this.field898[arg1];
        class109 var5 = method904(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2181(true);
        }
        class112 var7 = arg0.method2181(!var5.method2151(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2191();
        } else if (var8 == 2) {
            var7.method2190();
        } else if (var8 == 3) {
            var7.method2189();
        }
        var7.method2179(var5, var6);
        if (var8 == 1) {
            var7.method2189();
        } else if (var8 == 2) {
            var7.method2190();
        } else if (var8 == 3) {
            var7.method2191();
        }
        return var7;
    }

    @ObfuscatedName("av.l(Ldd;IB)Ldd;")
    public class112 method715(class112 arg0, int arg1) {
        int var3 = this.field898[arg1];
        class109 var4 = method904(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2182(true);
        } else {
            class112 var6 = arg0.method2182(!var4.method2151(var5));
            var6.method2179(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("av.t(Ldd;ILav;II)Ldd;")
    public class112 method716(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field898[arg1];
        class109 var6 = method904(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method713(arg0, arg3);
        }
        int var8 = arg2.field898[arg3];
        class109 var9 = method904(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2181(!var6.method2151(var7));
            var11.method2179(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2181(!var6.method2151(var7) & !var9.method2151(var10));
            var12.method2256(var6, var7, var9, var10, this.field902);
            return var12;
        }
    }

    @ObfuscatedName("av.q(Ldd;II)Ldd;")
    public class112 method741(class112 arg0, int arg1) {
        int var3 = this.field898[arg1];
        class109 var4 = method904(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2181(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field893 != null && arg1 < this.field893.length) {
            int var8 = this.field893[arg1];
            var6 = method904(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2181(!var4.method2151(var5));
            var10.method2179(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2181(!var4.method2151(var5) & !var6.method2151(var7));
            var9.method2179(var4, var5);
            var9.method2179(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ak.c(IB)Ldv;")
    public static class109 method904(int arg0) {
        class109 var1 = (class109) field907.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class109 var2 = class109.method1812(Statics.field894, Statics.field899, arg0, false);
        if (var2 != null) {
            field907.method3193(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("r.z(B)V")
    public static void method30() {
        field896.method3192();
        field907.method3192();
    }
}
