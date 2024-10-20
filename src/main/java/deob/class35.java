package deob;

@ObfuscatedName("ah")
public class class35 extends class174 {

    @ObfuscatedName("ah.t")
    public static class167 field882 = new class167(64);

    @ObfuscatedName("ah.e")
    public static class167 field880 = new class167(100);

    @ObfuscatedName("ah.a")
    public int[] field876;

    @ObfuscatedName("ah.l")
    public int[] field895;

    @ObfuscatedName("ah.v")
    public int[] field877;

    @ObfuscatedName("ah.j")
    public int[] field881;

    @ObfuscatedName("ah.k")
    public int field885 = -1;

    @ObfuscatedName("ah.g")
    public int[] field886;

    @ObfuscatedName("ah.d")
    public boolean field887 = false;

    @ObfuscatedName("ah.b")
    public int field888 = 5;

    @ObfuscatedName("ah.i")
    public int field891 = -1;

    @ObfuscatedName("ah.o")
    public int field890 = -1;

    @ObfuscatedName("ah.x")
    public int field879 = 99;

    @ObfuscatedName("ah.m")
    public int field892 = -1;

    @ObfuscatedName("ah.f")
    public int field893 = -1;

    @ObfuscatedName("ah.q")
    public int field894 = 2;

    @ObfuscatedName("cy.z(II)Lah;")
    public static class35 method2065(int arg0) {
        class35 var1 = (class35) field882.method3183((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field884.method2768(12, arg0);
        class35 var3 = new class35();
        if (var2 != null) {
            var3.method709(new class104(var2));
        }
        var3.method711();
        field882.method3185(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.n(Lcj;B)V")
    public void method709(class104 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method739(arg0, var2);
        }
    }

    @ObfuscatedName("ah.u(Lcj;IB)V")
    public void method739(class104 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2206();
            this.field877 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field877[var4] = arg0.method2206();
            }
            this.field876 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field876[var5] = arg0.method2206();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field876[var6] += arg0.method2206() << 16;
            }
        } else if (arg1 == 2) {
            this.field885 = arg0.method2206();
        } else if (arg1 == 3) {
            int var7 = arg0.method2257();
            this.field886 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field886[var8] = arg0.method2257();
            }
            this.field886[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field887 = true;
        } else if (arg1 == 5) {
            this.field888 = arg0.method2257();
        } else if (arg1 == 6) {
            this.field891 = arg0.method2206();
        } else if (arg1 == 7) {
            this.field890 = arg0.method2206();
        } else if (arg1 == 8) {
            this.field879 = arg0.method2257();
        } else if (arg1 == 9) {
            this.field892 = arg0.method2257();
        } else if (arg1 == 10) {
            this.field893 = arg0.method2257();
        } else if (arg1 == 11) {
            this.field894 = arg0.method2257();
        } else if (arg1 == 12) {
            int var9 = arg0.method2257();
            this.field895 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field895[var10] = arg0.method2206();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field895[var11] += arg0.method2206() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2257();
            this.field881 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field881[var13] = arg0.method2167();
            }
        }
    }

    @ObfuscatedName("ah.t(B)V")
    public void method711() {
        if (this.field892 == -1) {
            if (this.field886 == null) {
                this.field892 = 0;
            } else {
                this.field892 = 2;
            }
        }
        if (this.field893 != -1) {
            return;
        }
        if (this.field886 == null) {
            this.field893 = 0;
        } else {
            this.field893 = 2;
        }
    }

    @ObfuscatedName("ah.e(Lcp;IB)Lcp;")
    public class95 method731(class95 arg0, int arg1) {
        int var3 = this.field876[arg1];
        class93 var4 = method3169(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2000(true);
        } else {
            class95 var6 = arg0.method2000(!var4.method1983(var5));
            var6.method1995(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.a(Lcp;III)Lcp;")
    public class95 method713(class95 arg0, int arg1, int arg2) {
        int var4 = this.field876[arg1];
        class93 var5 = method3169(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2000(true);
        }
        class95 var7 = arg0.method2000(!var5.method1983(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2015();
        } else if (var8 == 2) {
            var7.method1999();
        } else if (var8 == 3) {
            var7.method1998();
        }
        var7.method1995(var5, var6);
        if (var8 == 1) {
            var7.method1998();
        } else if (var8 == 2) {
            var7.method1999();
        } else if (var8 == 3) {
            var7.method2015();
        }
        return var7;
    }

    @ObfuscatedName("ah.l(Lcp;II)Lcp;")
    public class95 method714(class95 arg0, int arg1) {
        int var3 = this.field876[arg1];
        class93 var4 = method3169(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1990(true);
        } else {
            class95 var6 = arg0.method1990(!var4.method1983(var5));
            var6.method1995(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.v(Lcp;ILah;IB)Lcp;")
    public class95 method726(class95 arg0, int arg1, class35 arg2, int arg3) {
        int var5 = this.field876[arg1];
        class93 var6 = method3169(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method731(arg0, arg3);
        }
        int var8 = arg2.field876[arg3];
        class93 var9 = method3169(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class95 var11 = arg0.method2000(!var6.method1983(var7));
            var11.method1995(var6, var7);
            return var11;
        } else {
            class95 var12 = arg0.method2000(!var6.method1983(var7) & !var9.method1983(var10));
            var12.method2049(var6, var7, var9, var10, this.field886);
            return var12;
        }
    }

    @ObfuscatedName("ah.j(Lcp;II)Lcp;")
    public class95 method743(class95 arg0, int arg1) {
        int var3 = this.field876[arg1];
        class93 var4 = method3169(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2000(true);
        }
        class93 var6 = null;
        int var7 = 0;
        if (this.field895 != null && arg1 < this.field895.length) {
            int var8 = this.field895[arg1];
            var6 = method3169(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class95 var10 = arg0.method2000(!var4.method1983(var5));
            var10.method1995(var4, var5);
            return var10;
        } else {
            class95 var9 = arg0.method2000(!var4.method1983(var5) & !var6.method1983(var7));
            var9.method1995(var4, var5);
            var9.method1995(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fz.k(IB)Lcr;")
    public static class93 method3169(int arg0) {
        class93 var1 = (class93) field880.method3183((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class142 var2 = Statics.field889;
        class142 var3 = Statics.field878;
        boolean var4 = true;
        int[] var5 = var2.method2749(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2767(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2767(var8, 0);
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
            field880.method3185(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("ad.g(I)V")
    public static void method579() {
        field882.method3193();
        field880.method3193();
    }
}
