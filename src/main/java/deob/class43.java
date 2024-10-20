package deob;

@ObfuscatedName("ah")
public class class43 extends class204 {

    @ObfuscatedName("ah.f")
    public static class193 field985 = new class193(64);

    @ObfuscatedName("ah.d")
    public static class193 field987 = new class193(100);

    @ObfuscatedName("ah.l")
    public int[] field974;

    @ObfuscatedName("ah.r")
    public int[] field980;

    @ObfuscatedName("ah.g")
    public int[] field981;

    @ObfuscatedName("ah.h")
    public int[] field982;

    @ObfuscatedName("ah.n")
    public int field977 = -1;

    @ObfuscatedName("ah.j")
    public int[] field984;

    @ObfuscatedName("ah.a")
    public boolean field983 = false;

    @ObfuscatedName("ah.b")
    public int field986 = 5;

    @ObfuscatedName("ah.c")
    public int field990 = -1;

    @ObfuscatedName("ah.v")
    public int field989 = -1;

    @ObfuscatedName("ah.p")
    public int field976 = 99;

    @ObfuscatedName("ah.i")
    public int field988 = -1;

    @ObfuscatedName("ah.t")
    public int field991 = -1;

    @ObfuscatedName("ah.u")
    public int field992 = 2;

    @ObfuscatedName("l.z(IB)Lah;")
    public static class43 method72(int arg0) {
        class43 var1 = (class43) field985.method3439((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field978.method2986(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method822(new class119(var2));
        }
        var3.method824();
        field985.method3429(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.q(Lda;I)V")
    public void method822(class119 arg0) {
        while (true) {
            int var2 = arg0.method2457();
            if (var2 == 0) {
                return;
            }
            this.method823(arg0, var2);
        }
    }

    @ObfuscatedName("ah.k(Lda;II)V")
    public void method823(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2415();
            this.field981 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field981[var4] = arg0.method2415();
            }
            this.field974 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field974[var5] = arg0.method2415();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field974[var6] += arg0.method2415() << 16;
            }
        } else if (arg1 == 2) {
            this.field977 = arg0.method2415();
        } else if (arg1 == 3) {
            int var7 = arg0.method2457();
            this.field984 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field984[var8] = arg0.method2457();
            }
            this.field984[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field983 = true;
        } else if (arg1 == 5) {
            this.field986 = arg0.method2457();
        } else if (arg1 == 6) {
            this.field990 = arg0.method2415();
        } else if (arg1 == 7) {
            this.field989 = arg0.method2415();
        } else if (arg1 == 8) {
            this.field976 = arg0.method2457();
        } else if (arg1 == 9) {
            this.field988 = arg0.method2457();
        } else if (arg1 == 10) {
            this.field991 = arg0.method2457();
        } else if (arg1 == 11) {
            this.field992 = arg0.method2457();
        } else if (arg1 == 12) {
            int var9 = arg0.method2457();
            this.field980 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field980[var10] = arg0.method2415();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field980[var11] += arg0.method2415() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2457();
            this.field982 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field982[var13] = arg0.method2305();
            }
        }
    }

    @ObfuscatedName("ah.f(I)V")
    public void method824() {
        if (this.field988 == -1) {
            if (this.field984 == null) {
                this.field988 = 0;
            } else {
                this.field988 = 2;
            }
        }
        if (this.field991 != -1) {
            return;
        }
        if (this.field984 == null) {
            this.field991 = 0;
        } else {
            this.field991 = 2;
        }
    }

    @ObfuscatedName("ah.d(Ldb;IB)Ldb;")
    public class105 method825(class105 arg0, int arg1) {
        int var3 = this.field974[arg1];
        class103 var4 = method2887(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2123(true);
        } else {
            class105 var6 = arg0.method2123(!var4.method2082(var5));
            var6.method2172(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.l(Ldb;III)Ldb;")
    public class105 method826(class105 arg0, int arg1, int arg2) {
        int var4 = this.field974[arg1];
        class103 var5 = method2887(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2123(true);
        }
        class105 var7 = arg0.method2123(!var5.method2082(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2114();
        } else if (var8 == 2) {
            var7.method2161();
        } else if (var8 == 3) {
            var7.method2112();
        }
        var7.method2172(var5, var6);
        if (var8 == 1) {
            var7.method2112();
        } else if (var8 == 2) {
            var7.method2161();
        } else if (var8 == 3) {
            var7.method2114();
        }
        return var7;
    }

    @ObfuscatedName("ah.r(Ldb;IB)Ldb;")
    public class105 method831(class105 arg0, int arg1) {
        int var3 = this.field974[arg1];
        class103 var4 = method2887(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2171(true);
        } else {
            class105 var6 = arg0.method2171(!var4.method2082(var5));
            var6.method2172(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.g(Ldb;ILah;II)Ldb;")
    public class105 method843(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field974[arg1];
        class103 var6 = method2887(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method825(arg0, arg3);
        }
        int var8 = arg2.field974[arg3];
        class103 var9 = method2887(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2123(!var6.method2082(var7));
            var11.method2172(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2123(!var6.method2082(var7) & !var9.method2082(var10));
            var12.method2110(var6, var7, var9, var10, this.field984);
            return var12;
        }
    }

    @ObfuscatedName("ah.h(Ldb;II)Ldb;")
    public class105 method829(class105 arg0, int arg1) {
        int var3 = this.field974[arg1];
        class103 var4 = method2887(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2123(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field980 != null && arg1 < this.field980.length) {
            int var8 = this.field980[arg1];
            var6 = method2887(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2123(!var4.method2082(var5));
            var10.method2172(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2123(!var4.method2082(var5) & !var6.method2082(var7));
            var9.method2172(var4, var5);
            var9.method2172(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ee.n(II)Lcw;")
    public static class103 method2887(int arg0) {
        class103 var1 = (class103) field987.method3439((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class103 var2 = class103.method1883(Statics.field975, Statics.field979, arg0, false);
        if (var2 != null) {
            field987.method3429(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("cw.j(I)V")
    public static void method2091() {
        field985.method3430();
        field987.method3430();
    }
}
