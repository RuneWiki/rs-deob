package deob;

@ObfuscatedName("ar")
public class class34 extends class174 {

    @ObfuscatedName("ar.p")
    public static class170 field874 = new class170(64);

    @ObfuscatedName("ar.e")
    public static class170 field875 = new class170(100);

    @ObfuscatedName("ar.d")
    public int[] field876;

    @ObfuscatedName("ar.y")
    public int[] field873;

    @ObfuscatedName("ar.x")
    public int[] field878;

    @ObfuscatedName("ar.t")
    public int[] field879;

    @ObfuscatedName("ar.i")
    public int field880 = -1;

    @ObfuscatedName("ar.z")
    public int[] field887;

    @ObfuscatedName("ar.o")
    public boolean field890 = false;

    @ObfuscatedName("ar.u")
    public int field883 = 5;

    @ObfuscatedName("ar.f")
    public int field884 = -1;

    @ObfuscatedName("ar.k")
    public int field885 = -1;

    @ObfuscatedName("ar.q")
    public int field886 = 99;

    @ObfuscatedName("ar.a")
    public int field871 = -1;

    @ObfuscatedName("ar.w")
    public int field888 = -1;

    @ObfuscatedName("ar.g")
    public int field889 = 2;

    @ObfuscatedName("ef.j(Lez;Lez;Lez;B)V")
    public static void method2897(class152 arg0, class152 arg1, class152 arg2) {
        Statics.field892 = arg0;
        Statics.field872 = arg1;
        Statics.field882 = arg2;
    }

    @ObfuscatedName("de.r(IS)Lar;")
    public static class34 method2349(int arg0) {
        class34 var1 = (class34) field874.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field892.method3016(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method697(new class127(var2));
        }
        var3.method706();
        field874.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.v(Ldn;S)V")
    public void method697(class127 arg0) {
        while (true) {
            int var2 = arg0.method2441();
            if (var2 == 0) {
                return;
            }
            this.method730(arg0, var2);
        }
    }

    @ObfuscatedName("ar.p(Ldn;II)V")
    public void method730(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2609();
            this.field878 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field878[var4] = arg0.method2609();
            }
            this.field876 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field876[var5] = arg0.method2609();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field876[var6] += arg0.method2609() << 16;
            }
        } else if (arg1 == 2) {
            this.field880 = arg0.method2609();
        } else if (arg1 == 3) {
            int var7 = arg0.method2441();
            this.field887 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field887[var8] = arg0.method2441();
            }
            this.field887[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field890 = true;
        } else if (arg1 == 5) {
            this.field883 = arg0.method2441();
        } else if (arg1 == 6) {
            this.field884 = arg0.method2609();
        } else if (arg1 == 7) {
            this.field885 = arg0.method2609();
        } else if (arg1 == 8) {
            this.field886 = arg0.method2441();
        } else if (arg1 == 9) {
            this.field871 = arg0.method2441();
        } else if (arg1 == 10) {
            this.field888 = arg0.method2441();
        } else if (arg1 == 11) {
            this.field889 = arg0.method2441();
        } else if (arg1 == 12) {
            int var9 = arg0.method2441();
            this.field873 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field873[var10] = arg0.method2609();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field873[var11] += arg0.method2609() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2441();
            this.field879 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field879[var13] = arg0.method2461();
            }
        }
    }

    @ObfuscatedName("ar.e(B)V")
    public void method706() {
        if (this.field871 == -1) {
            if (this.field887 == null) {
                this.field871 = 0;
            } else {
                this.field871 = 2;
            }
        }
        if (this.field888 != -1) {
            return;
        }
        if (this.field887 == null) {
            this.field888 = 0;
        } else {
            this.field888 = 2;
        }
    }

    @ObfuscatedName("ar.d(Ldt;II)Ldt;")
    public class112 method698(class112 arg0, int arg1) {
        int var3 = this.field876[arg1];
        class109 var4 = method21(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2232(true);
        } else {
            class112 var6 = arg0.method2232(!var4.method2213(var5));
            var6.method2237(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.y(Ldt;IIB)Ldt;")
    public class112 method701(class112 arg0, int arg1, int arg2) {
        int var4 = this.field876[arg1];
        class109 var5 = method21(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2232(true);
        }
        class112 var7 = arg0.method2232(!var5.method2213(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2266();
        } else if (var8 == 2) {
            var7.method2238();
        } else if (var8 == 3) {
            var7.method2239();
        }
        var7.method2237(var5, var6);
        if (var8 == 1) {
            var7.method2239();
        } else if (var8 == 2) {
            var7.method2238();
        } else if (var8 == 3) {
            var7.method2266();
        }
        return var7;
    }

    @ObfuscatedName("ar.x(Ldt;II)Ldt;")
    public class112 method702(class112 arg0, int arg1) {
        int var3 = this.field876[arg1];
        class109 var4 = method21(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2233(true);
        } else {
            class112 var6 = arg0.method2233(!var4.method2213(var5));
            var6.method2237(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.t(Ldt;ILar;IB)Ldt;")
    public class112 method703(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field876[arg1];
        class109 var6 = method21(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method698(arg0, arg3);
        }
        int var8 = arg2.field876[arg3];
        class109 var9 = method21(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2232(!var6.method2213(var7));
            var11.method2237(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2232(!var6.method2213(var7) & !var9.method2213(var10));
            var12.method2284(var6, var7, var9, var10, this.field887);
            return var12;
        }
    }

    @ObfuscatedName("ar.i(Ldt;II)Ldt;")
    public class112 method704(class112 arg0, int arg1) {
        int var3 = this.field876[arg1];
        class109 var4 = method21(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2232(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field873 != null && arg1 < this.field873.length) {
            int var8 = this.field873[arg1];
            var6 = method21(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2232(!var4.method2213(var5));
            var10.method2237(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2232(!var4.method2213(var5) & !var6.method2213(var7));
            var9.method2237(var4, var5);
            var9.method2237(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("v.z(II)Ldm;")
    public static class109 method21(int arg0) {
        class109 var1 = (class109) field875.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class152 var2 = Statics.field872;
        class152 var3 = Statics.field882;
        boolean var4 = true;
        int[] var5 = var2.method2968(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2965(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2965(var8, 0);
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
            field875.method3257(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("df.o(I)V")
    public static void method2196() {
        field874.method3258();
        field875.method3258();
    }
}
