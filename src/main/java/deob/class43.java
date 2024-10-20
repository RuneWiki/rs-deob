package deob;

@ObfuscatedName("ar")
public class class43 extends class204 {

    @ObfuscatedName("ar.t")
    public static class193 field984 = new class193(64);

    @ObfuscatedName("ar.g")
    public static class193 field988 = new class193(100);

    @ObfuscatedName("ar.o")
    public int[] field987;

    @ObfuscatedName("ar.i")
    public int[] field990;

    @ObfuscatedName("ar.w")
    public int[] field991;

    @ObfuscatedName("ar.m")
    public int[] field997;

    @ObfuscatedName("ar.r")
    public int field993 = -1;

    @ObfuscatedName("ar.y")
    public int[] field994;

    @ObfuscatedName("ar.q")
    public boolean field995 = false;

    @ObfuscatedName("ar.f")
    public int field996 = 5;

    @ObfuscatedName("ar.x")
    public int field999 = -1;

    @ObfuscatedName("ar.d")
    public int field998 = -1;

    @ObfuscatedName("ar.e")
    public int field989 = 99;

    @ObfuscatedName("ar.l")
    public int field1000 = -1;

    @ObfuscatedName("ar.u")
    public int field1001 = -1;

    @ObfuscatedName("ar.a")
    public int field1002 = 2;

    @ObfuscatedName("s.c(Lfj;Lfj;Lfj;I)V")
    public static void method554(class167 arg0, class167 arg1, class167 arg2) {
        Statics.field992 = arg0;
        Statics.field985 = arg1;
        Statics.field986 = arg2;
    }

    @ObfuscatedName("el.h(II)Lar;")
    public static class43 method2648(int arg0) {
        class43 var1 = (class43) field984.method3485((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field992.method2994(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method823(new class119(var2));
        }
        var3.method825();
        field984.method3487(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.k(Ldf;I)V")
    public void method823(class119 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method852(arg0, var2);
        }
    }

    @ObfuscatedName("ar.t(Ldf;IB)V")
    public void method852(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2293();
            this.field991 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field991[var4] = arg0.method2293();
            }
            this.field987 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field987[var5] = arg0.method2293();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field987[var6] += arg0.method2293() << 16;
            }
        } else if (arg1 == 2) {
            this.field993 = arg0.method2293();
        } else if (arg1 == 3) {
            int var7 = arg0.method2291();
            this.field994 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field994[var8] = arg0.method2291();
            }
            this.field994[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field995 = true;
        } else if (arg1 == 5) {
            this.field996 = arg0.method2291();
        } else if (arg1 == 6) {
            this.field999 = arg0.method2293();
        } else if (arg1 == 7) {
            this.field998 = arg0.method2293();
        } else if (arg1 == 8) {
            this.field989 = arg0.method2291();
        } else if (arg1 == 9) {
            this.field1000 = arg0.method2291();
        } else if (arg1 == 10) {
            this.field1001 = arg0.method2291();
        } else if (arg1 == 11) {
            this.field1002 = arg0.method2291();
        } else if (arg1 == 12) {
            int var9 = arg0.method2291();
            this.field990 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field990[var10] = arg0.method2293();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field990[var11] += arg0.method2293() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2291();
            this.field997 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field997[var13] = arg0.method2402();
            }
        }
    }

    @ObfuscatedName("ar.g(I)V")
    public void method825() {
        if (this.field1000 == -1) {
            if (this.field994 == null) {
                this.field1000 = 0;
            } else {
                this.field1000 = 2;
            }
        }
        if (this.field1001 != -1) {
            return;
        }
        if (this.field994 == null) {
            this.field1001 = 0;
        } else {
            this.field1001 = 2;
        }
    }

    @ObfuscatedName("ar.o(Ldt;IB)Ldt;")
    public class105 method845(class105 arg0, int arg1) {
        int var3 = this.field987[arg1];
        class103 var4 = method2611(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2113(true);
        } else {
            class105 var6 = arg0.method2113(!var4.method2083(var5));
            var6.method2106(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.i(Ldt;III)Ldt;")
    public class105 method827(class105 arg0, int arg1, int arg2) {
        int var4 = this.field987[arg1];
        class103 var5 = method2611(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2113(true);
        }
        class105 var7 = arg0.method2113(!var5.method2083(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2103();
        } else if (var8 == 2) {
            var7.method2102();
        } else if (var8 == 3) {
            var7.method2101();
        }
        var7.method2106(var5, var6);
        if (var8 == 1) {
            var7.method2101();
        } else if (var8 == 2) {
            var7.method2102();
        } else if (var8 == 3) {
            var7.method2103();
        }
        return var7;
    }

    @ObfuscatedName("ar.w(Ldt;II)Ldt;")
    public class105 method828(class105 arg0, int arg1) {
        int var3 = this.field987[arg1];
        class103 var4 = method2611(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2093(true);
        } else {
            class105 var6 = arg0.method2093(!var4.method2083(var5));
            var6.method2106(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.m(Ldt;ILar;IB)Ldt;")
    public class105 method822(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field987[arg1];
        class103 var6 = method2611(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method845(arg0, arg3);
        }
        int var8 = arg2.field987[arg3];
        class103 var9 = method2611(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2113(!var6.method2083(var7));
            var11.method2106(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2113(!var6.method2083(var7) & !var9.method2083(var10));
            var12.method2125(var6, var7, var9, var10, this.field994);
            return var12;
        }
    }

    @ObfuscatedName("ar.r(Ldt;II)Ldt;")
    public class105 method829(class105 arg0, int arg1) {
        int var3 = this.field987[arg1];
        class103 var4 = method2611(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2113(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field990 != null && arg1 < this.field990.length) {
            int var8 = this.field990[arg1];
            var6 = method2611(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2113(!var4.method2083(var5));
            var10.method2106(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2113(!var4.method2083(var5) & !var6.method2083(var7));
            var9.method2106(var4, var5);
            var9.method2106(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("dl.y(IB)Lca;")
    public static class103 method2611(int arg0) {
        class103 var1 = (class103) field988.method3485((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class167 var2 = Statics.field985;
        class167 var3 = Statics.field986;
        boolean var4 = true;
        int[] var5 = var2.method3003(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3000(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3000(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class103 var10;
        if (var4) {
            try {
                var10 = new class103(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field988.method3487(var10, (long) arg0);
        }
        return var10;
    }
}
