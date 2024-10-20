package deob;

@ObfuscatedName("ac")
public class class43 extends class204 {

    @ObfuscatedName("ac.b")
    public static class193 field982 = new class193(64);

    @ObfuscatedName("ac.p")
    public static class193 field980 = new class193(100);

    @ObfuscatedName("ac.s")
    public int[] field984;

    @ObfuscatedName("ac.y")
    public int[] field981;

    @ObfuscatedName("ac.t")
    public int[] field986;

    @ObfuscatedName("ac.w")
    public int[] field995;

    @ObfuscatedName("ac.h")
    public int field992 = -1;

    @ObfuscatedName("ac.d")
    public int[] field989;

    @ObfuscatedName("ac.l")
    public boolean field990 = false;

    @ObfuscatedName("ac.n")
    public int field991 = 5;

    @ObfuscatedName("ac.q")
    public int field998 = -1;

    @ObfuscatedName("ac.f")
    public int field993 = -1;

    @ObfuscatedName("ac.v")
    public int field994 = 99;

    @ObfuscatedName("ac.a")
    public int field983 = -1;

    @ObfuscatedName("ac.k")
    public int field996 = -1;

    @ObfuscatedName("ac.r")
    public int field997 = 2;

    @ObfuscatedName("ao.o(Lfq;Lfq;Lfq;I)V")
    public static void method716(class167 arg0, class167 arg1, class167 arg2) {
        Statics.field985 = arg0;
        Statics.field987 = arg1;
        Statics.field3045 = arg2;
    }

    @ObfuscatedName("ab.e(II)Lac;")
    public static class43 method774(int arg0) {
        class43 var1 = (class43) field982.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field985.method3057(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method865(new class119(var2));
        }
        var3.method845();
        field982.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.u(Ldi;B)V")
    public void method865(class119 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method844(arg0, var2);
        }
    }

    @ObfuscatedName("ac.b(Ldi;II)V")
    public void method844(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2339();
            this.field986 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field986[var4] = arg0.method2339();
            }
            this.field984 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field984[var5] = arg0.method2339();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field984[var6] += arg0.method2339() << 16;
            }
        } else if (arg1 == 2) {
            this.field992 = arg0.method2339();
        } else if (arg1 == 3) {
            int var7 = arg0.method2427();
            this.field989 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field989[var8] = arg0.method2427();
            }
            this.field989[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field990 = true;
        } else if (arg1 == 5) {
            this.field991 = arg0.method2427();
        } else if (arg1 == 6) {
            this.field998 = arg0.method2339();
        } else if (arg1 == 7) {
            this.field993 = arg0.method2339();
        } else if (arg1 == 8) {
            this.field994 = arg0.method2427();
        } else if (arg1 == 9) {
            this.field983 = arg0.method2427();
        } else if (arg1 == 10) {
            this.field996 = arg0.method2427();
        } else if (arg1 == 11) {
            this.field997 = arg0.method2427();
        } else if (arg1 == 12) {
            int var9 = arg0.method2427();
            this.field981 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field981[var10] = arg0.method2339();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field981[var11] += arg0.method2339() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2427();
            this.field995 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field995[var13] = arg0.method2341();
            }
        }
    }

    @ObfuscatedName("ac.p(I)V")
    public void method845() {
        if (this.field983 == -1) {
            if (this.field989 == null) {
                this.field983 = 0;
            } else {
                this.field983 = 2;
            }
        }
        if (this.field996 != -1) {
            return;
        }
        if (this.field989 == null) {
            this.field996 = 0;
        } else {
            this.field996 = 2;
        }
    }

    @ObfuscatedName("ac.s(Ldk;II)Ldk;")
    public class105 method846(class105 arg0, int arg1) {
        int var3 = this.field984[arg1];
        class103 var4 = method2283(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2189(true);
        } else {
            class105 var6 = arg0.method2189(!var4.method2117(var5));
            var6.method2129(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.y(Ldk;III)Ldk;")
    public class105 method848(class105 arg0, int arg1, int arg2) {
        int var4 = this.field984[arg1];
        class103 var5 = method2283(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2189(true);
        }
        class105 var7 = arg0.method2189(!var5.method2117(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2133();
        } else if (var8 == 2) {
            var7.method2132();
        } else if (var8 == 3) {
            var7.method2175();
        }
        var7.method2129(var5, var6);
        if (var8 == 1) {
            var7.method2175();
        } else if (var8 == 2) {
            var7.method2132();
        } else if (var8 == 3) {
            var7.method2133();
        }
        return var7;
    }

    @ObfuscatedName("ac.t(Ldk;II)Ldk;")
    public class105 method847(class105 arg0, int arg1) {
        int var3 = this.field984[arg1];
        class103 var4 = method2283(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2123(true);
        } else {
            class105 var6 = arg0.method2123(!var4.method2117(var5));
            var6.method2129(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.w(Ldk;ILac;IB)Ldk;")
    public class105 method872(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field984[arg1];
        class103 var6 = method2283(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method846(arg0, arg3);
        }
        int var8 = arg2.field984[arg3];
        class103 var9 = method2283(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2189(!var6.method2117(var7));
            var11.method2129(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2189(!var6.method2117(var7) & !var9.method2117(var10));
            var12.method2131(var6, var7, var9, var10, this.field989);
            return var12;
        }
    }

    @ObfuscatedName("ac.h(Ldk;II)Ldk;")
    public class105 method849(class105 arg0, int arg1) {
        int var3 = this.field984[arg1];
        class103 var4 = method2283(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2189(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field981 != null && arg1 < this.field981.length) {
            int var8 = this.field981[arg1];
            var6 = method2283(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2189(!var4.method2117(var5));
            var10.method2129(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2189(!var4.method2117(var5) & !var6.method2117(var7));
            var9.method2129(var4, var5);
            var9.method2129(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("dv.d(IB)Lcg;")
    public static class103 method2283(int arg0) {
        class103 var1 = (class103) field980.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class167 var2 = Statics.field987;
        class167 var3 = Statics.field3045;
        boolean var4 = true;
        int[] var5 = var2.method3066(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3063(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3063(var8, 0);
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
            field980.method3512(var10, (long) arg0);
        }
        return var10;
    }
}
