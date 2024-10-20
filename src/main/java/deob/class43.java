package deob;

@ObfuscatedName("ah")
public class class43 extends class204 {

    @ObfuscatedName("ah.z")
    public static class193 field969 = new class193(64);

    @ObfuscatedName("ah.c")
    public static class193 field978 = new class193(100);

    @ObfuscatedName("ah.d")
    public int[] field974;

    @ObfuscatedName("ah.l")
    public int[] field972;

    @ObfuscatedName("ah.b")
    public int[] field980;

    @ObfuscatedName("ah.j")
    public int[] field967;

    @ObfuscatedName("ah.f")
    public int field975 = -1;

    @ObfuscatedName("ah.i")
    public int[] field976;

    @ObfuscatedName("ah.g")
    public boolean field977 = false;

    @ObfuscatedName("ah.t")
    public int field970 = 5;

    @ObfuscatedName("ah.e")
    public int field979 = -1;

    @ObfuscatedName("ah.q")
    public int field983 = -1;

    @ObfuscatedName("ah.u")
    public int field971 = 99;

    @ObfuscatedName("ah.r")
    public int field982 = -1;

    @ObfuscatedName("ah.a")
    public int field973 = -1;

    @ObfuscatedName("ah.m")
    public int field984 = 2;

    @ObfuscatedName("aq.k(Lfo;Lfo;Lfo;B)V")
    public static void method740(class167 arg0, class167 arg1, class167 arg2) {
        Statics.field968 = arg0;
        Statics.field981 = arg1;
        Statics.field3150 = arg2;
    }

    @ObfuscatedName("gd.h(IB)Lah;")
    public static class43 method3491(int arg0) {
        class43 var1 = (class43) field969.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field968.method3118(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method802(new class119(var2));
        }
        var3.method804();
        field969.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.o(Ldk;I)V")
    public void method802(class119 arg0) {
        while (true) {
            int var2 = arg0.method2330();
            if (var2 == 0) {
                return;
            }
            this.method803(arg0, var2);
        }
    }

    @ObfuscatedName("ah.z(Ldk;II)V")
    public void method803(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2332();
            this.field980 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field980[var4] = arg0.method2332();
            }
            this.field974 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field974[var5] = arg0.method2332();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field974[var6] += arg0.method2332() << 16;
            }
        } else if (arg1 == 2) {
            this.field975 = arg0.method2332();
        } else if (arg1 == 3) {
            int var7 = arg0.method2330();
            this.field976 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field976[var8] = arg0.method2330();
            }
            this.field976[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field977 = true;
        } else if (arg1 == 5) {
            this.field970 = arg0.method2330();
        } else if (arg1 == 6) {
            this.field979 = arg0.method2332();
        } else if (arg1 == 7) {
            this.field983 = arg0.method2332();
        } else if (arg1 == 8) {
            this.field971 = arg0.method2330();
        } else if (arg1 == 9) {
            this.field982 = arg0.method2330();
        } else if (arg1 == 10) {
            this.field973 = arg0.method2330();
        } else if (arg1 == 11) {
            this.field984 = arg0.method2330();
        } else if (arg1 == 12) {
            int var9 = arg0.method2330();
            this.field972 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field972[var10] = arg0.method2332();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field972[var11] += arg0.method2332() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2330();
            this.field967 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field967[var13] = arg0.method2420();
            }
        }
    }

    @ObfuscatedName("ah.c(I)V")
    public void method804() {
        if (this.field982 == -1) {
            if (this.field976 == null) {
                this.field982 = 0;
            } else {
                this.field982 = 2;
            }
        }
        if (this.field973 != -1) {
            return;
        }
        if (this.field976 == null) {
            this.field973 = 0;
        } else {
            this.field973 = 2;
        }
    }

    @ObfuscatedName("ah.d(Ldl;II)Ldl;")
    public class105 method805(class105 arg0, int arg1) {
        int var3 = this.field974[arg1];
        class103 var4 = method1564(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2138(true);
        } else {
            class105 var6 = arg0.method2138(!var4.method2125(var5));
            var6.method2144(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.l(Ldl;III)Ldl;")
    public class105 method834(class105 arg0, int arg1, int arg2) {
        int var4 = this.field974[arg1];
        class103 var5 = method1564(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2138(true);
        }
        class105 var7 = arg0.method2138(!var5.method2125(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2158();
        } else if (var8 == 2) {
            var7.method2148();
        } else if (var8 == 3) {
            var7.method2147();
        }
        var7.method2144(var5, var6);
        if (var8 == 1) {
            var7.method2147();
        } else if (var8 == 2) {
            var7.method2148();
        } else if (var8 == 3) {
            var7.method2158();
        }
        return var7;
    }

    @ObfuscatedName("ah.b(Ldl;IB)Ldl;")
    public class105 method807(class105 arg0, int arg1) {
        int var3 = this.field974[arg1];
        class103 var4 = method1564(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2182(true);
        } else {
            class105 var6 = arg0.method2182(!var4.method2125(var5));
            var6.method2144(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.j(Ldl;ILah;IB)Ldl;")
    public class105 method806(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field974[arg1];
        class103 var6 = method1564(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method805(arg0, arg3);
        }
        int var8 = arg2.field974[arg3];
        class103 var9 = method1564(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2138(!var6.method2125(var7));
            var11.method2144(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2138(!var6.method2125(var7) & !var9.method2125(var10));
            var12.method2163(var6, var7, var9, var10, this.field976);
            return var12;
        }
    }

    @ObfuscatedName("ah.f(Ldl;II)Ldl;")
    public class105 method801(class105 arg0, int arg1) {
        int var3 = this.field974[arg1];
        class103 var4 = method1564(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2138(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field972 != null && arg1 < this.field972.length) {
            int var8 = this.field972[arg1];
            var6 = method1564(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2138(!var4.method2125(var5));
            var10.method2144(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2138(!var4.method2125(var5) & !var6.method2125(var7));
            var9.method2144(var4, var5);
            var9.method2144(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bd.i(IB)Lcq;")
    public static class103 method1564(int arg0) {
        class103 var1 = (class103) field978.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class103 var2 = class103.method970(Statics.field981, Statics.field3150, arg0, false);
        if (var2 != null) {
            field978.method3512(var2, (long) arg0);
        }
        return var2;
    }
}
