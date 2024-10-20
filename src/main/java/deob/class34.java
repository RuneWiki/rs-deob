package deob;

@ObfuscatedName("ap")
public class class34 extends class174 {

    @ObfuscatedName("ap.j")
    public static class170 field891 = new class170(64);

    @ObfuscatedName("ap.o")
    public static class170 field892 = new class170(100);

    @ObfuscatedName("ap.l")
    public int[] field893;

    @ObfuscatedName("ap.g")
    public int[] field901;

    @ObfuscatedName("ap.w")
    public int[] field895;

    @ObfuscatedName("ap.c")
    public int[] field896;

    @ObfuscatedName("ap.z")
    public int field906 = -1;

    @ObfuscatedName("ap.f")
    public int[] field898;

    @ObfuscatedName("ap.a")
    public boolean field899 = false;

    @ObfuscatedName("ap.d")
    public int field894 = 5;

    @ObfuscatedName("ap.e")
    public int field900 = -1;

    @ObfuscatedName("ap.y")
    public int field888 = -1;

    @ObfuscatedName("ap.k")
    public int field903 = 99;

    @ObfuscatedName("ap.h")
    public int field904 = -1;

    @ObfuscatedName("ap.x")
    public int field905 = -1;

    @ObfuscatedName("ap.b")
    public int field911 = 2;

    @ObfuscatedName("ff.i(Ler;Ler;Ler;I)V")
    public static void method3301(class152 arg0, class152 arg1, class152 arg2) {
        Statics.field909 = arg0;
        Statics.field889 = arg1;
        Statics.field890 = arg2;
    }

    @ObfuscatedName("bp.v(II)Lap;")
    public static class34 method1443(int arg0) {
        class34 var1 = (class34) field891.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field909.method3032(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method717(new class127(var2));
        }
        var3.method719();
        field891.method3307(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.m(Lda;B)V")
    public void method717(class127 arg0) {
        while (true) {
            int var2 = arg0.method2491();
            if (var2 == 0) {
                return;
            }
            this.method718(arg0, var2);
        }
    }

    @ObfuscatedName("ap.j(Lda;II)V")
    public void method718(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2493();
            this.field895 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field895[var4] = arg0.method2493();
            }
            this.field893 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field893[var5] = arg0.method2493();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field893[var6] += arg0.method2493() << 16;
            }
        } else if (arg1 == 2) {
            this.field906 = arg0.method2493();
        } else if (arg1 == 3) {
            int var7 = arg0.method2491();
            this.field898 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field898[var8] = arg0.method2491();
            }
            this.field898[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field899 = true;
        } else if (arg1 == 5) {
            this.field894 = arg0.method2491();
        } else if (arg1 == 6) {
            this.field900 = arg0.method2493();
        } else if (arg1 == 7) {
            this.field888 = arg0.method2493();
        } else if (arg1 == 8) {
            this.field903 = arg0.method2491();
        } else if (arg1 == 9) {
            this.field904 = arg0.method2491();
        } else if (arg1 == 10) {
            this.field905 = arg0.method2491();
        } else if (arg1 == 11) {
            this.field911 = arg0.method2491();
        } else if (arg1 == 12) {
            int var9 = arg0.method2491();
            this.field901 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field901[var10] = arg0.method2493();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field901[var11] += arg0.method2493() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2491();
            this.field896 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field896[var13] = arg0.method2494();
            }
        }
    }

    @ObfuscatedName("ap.o(B)V")
    public void method719() {
        if (this.field904 == -1) {
            if (this.field898 == null) {
                this.field904 = 0;
            } else {
                this.field904 = 2;
            }
        }
        if (this.field905 != -1) {
            return;
        }
        if (this.field898 == null) {
            this.field905 = 0;
        } else {
            this.field905 = 2;
        }
    }

    @ObfuscatedName("ap.l(Ldl;IB)Ldl;")
    public class112 method728(class112 arg0, int arg1) {
        int var3 = this.field893[arg1];
        class109 var4 = method1704(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2270(true);
        } else {
            class112 var6 = arg0.method2270(!var4.method2253(var5));
            var6.method2276(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ap.g(Ldl;III)Ldl;")
    public class112 method721(class112 arg0, int arg1, int arg2) {
        int var4 = this.field893[arg1];
        class109 var5 = method1704(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2270(true);
        }
        class112 var7 = arg0.method2270(!var5.method2253(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2281();
        } else if (var8 == 2) {
            var7.method2280();
        } else if (var8 == 3) {
            var7.method2320();
        }
        var7.method2276(var5, var6);
        if (var8 == 1) {
            var7.method2320();
        } else if (var8 == 2) {
            var7.method2280();
        } else if (var8 == 3) {
            var7.method2281();
        }
        return var7;
    }

    @ObfuscatedName("ap.w(Ldl;II)Ldl;")
    public class112 method722(class112 arg0, int arg1) {
        int var3 = this.field893[arg1];
        class109 var4 = method1704(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2271(true);
        } else {
            class112 var6 = arg0.method2271(!var4.method2253(var5));
            var6.method2276(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ap.c(Ldl;ILap;II)Ldl;")
    public class112 method723(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field893[arg1];
        class109 var6 = method1704(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method728(arg0, arg3);
        }
        int var8 = arg2.field893[arg3];
        class109 var9 = method1704(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2270(!var6.method2253(var7));
            var11.method2276(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2270(!var6.method2253(var7) & !var9.method2253(var10));
            var12.method2277(var6, var7, var9, var10, this.field898);
            return var12;
        }
    }

    @ObfuscatedName("ap.z(Ldl;IB)Ldl;")
    public class112 method724(class112 arg0, int arg1) {
        int var3 = this.field893[arg1];
        class109 var4 = method1704(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2270(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field901 != null && arg1 < this.field901.length) {
            int var8 = this.field901[arg1];
            var6 = method1704(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2270(!var4.method2253(var5));
            var10.method2276(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2270(!var4.method2253(var5) & !var6.method2253(var7));
            var9.method2276(var4, var5);
            var9.method2276(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("cx.f(II)Ldk;")
    public static class109 method1704(int arg0) {
        class109 var1 = (class109) field892.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class109 var2 = class109.method694(Statics.field889, Statics.field890, arg0, false);
        if (var2 != null) {
            field892.method3307(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("h.a(I)V")
    public static void method145() {
        field891.method3311();
        field892.method3311();
    }
}
