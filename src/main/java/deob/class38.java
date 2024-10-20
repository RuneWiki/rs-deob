package deob;

@ObfuscatedName("ar")
public class class38 extends class182 {

    @ObfuscatedName("ar.b")
    public static class171 field927 = new class171(64);

    @ObfuscatedName("ar.w")
    public static class171 field914 = new class171(100);

    @ObfuscatedName("ar.r")
    public int[] field923;

    @ObfuscatedName("ar.l")
    public int[] field926;

    @ObfuscatedName("ar.s")
    public int[] field917;

    @ObfuscatedName("ar.f")
    public int[] field918;

    @ObfuscatedName("ar.x")
    public int field919 = -1;

    @ObfuscatedName("ar.h")
    public int[] field920;

    @ObfuscatedName("ar.a")
    public boolean field929 = false;

    @ObfuscatedName("ar.u")
    public int field922 = 5;

    @ObfuscatedName("ar.v")
    public int field916 = -1;

    @ObfuscatedName("ar.i")
    public int field913 = -1;

    @ObfuscatedName("ar.n")
    public int field925 = 99;

    @ObfuscatedName("ar.d")
    public int field928 = -1;

    @ObfuscatedName("ar.k")
    public int field915 = -1;

    @ObfuscatedName("ar.p")
    public int field921 = 2;

    @ObfuscatedName("p.e(Lez;Lez;Lez;I)V")
    public static void method476(class146 arg0, class146 arg1, class146 arg2) {
        Statics.field924 = arg0;
        Statics.field911 = arg1;
        Statics.field910 = arg2;
    }

    @ObfuscatedName("u.o(II)Lar;")
    public static class38 method131(int arg0) {
        class38 var1 = (class38) field927.method3058((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field924.method2709(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method728(new class107(var2));
        }
        var3.method702();
        field927.method3057(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.y(Ldl;I)V")
    public void method728(class107 arg0) {
        while (true) {
            int var2 = arg0.method2123();
            if (var2 == 0) {
                return;
            }
            this.method727(arg0, var2);
        }
    }

    @ObfuscatedName("ar.b(Ldl;IB)V")
    public void method727(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2232();
            this.field917 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field917[var4] = arg0.method2232();
            }
            this.field923 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field923[var5] = arg0.method2232();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field923[var6] += arg0.method2232() << 16;
            }
        } else if (arg1 == 2) {
            this.field919 = arg0.method2232();
        } else if (arg1 == 3) {
            int var7 = arg0.method2123();
            this.field920 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field920[var8] = arg0.method2123();
            }
            this.field920[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field929 = true;
        } else if (arg1 == 5) {
            this.field922 = arg0.method2123();
        } else if (arg1 == 6) {
            this.field916 = arg0.method2232();
        } else if (arg1 == 7) {
            this.field913 = arg0.method2232();
        } else if (arg1 == 8) {
            this.field925 = arg0.method2123();
        } else if (arg1 == 9) {
            this.field928 = arg0.method2123();
        } else if (arg1 == 10) {
            this.field915 = arg0.method2123();
        } else if (arg1 == 11) {
            this.field921 = arg0.method2123();
        } else if (arg1 == 12) {
            int var9 = arg0.method2123();
            this.field926 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field926[var10] = arg0.method2232();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field926[var11] += arg0.method2232() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2123();
            this.field918 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field918[var13] = arg0.method2215();
            }
        }
    }

    @ObfuscatedName("ar.w(I)V")
    public void method702() {
        if (this.field928 == -1) {
            if (this.field920 == null) {
                this.field928 = 0;
            } else {
                this.field928 = 2;
            }
        }
        if (this.field915 != -1) {
            return;
        }
        if (this.field920 == null) {
            this.field915 = 0;
        } else {
            this.field915 = 2;
        }
    }

    @ObfuscatedName("ar.r(Lcd;IB)Lcd;")
    public class98 method729(class98 arg0, int arg1) {
        int var3 = this.field923[arg1];
        class96 var4 = method529(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1924(true);
        } else {
            class98 var6 = arg0.method1924(!var4.method1914(var5));
            var6.method1930(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.l(Lcd;III)Lcd;")
    public class98 method704(class98 arg0, int arg1, int arg2) {
        int var4 = this.field923[arg1];
        class96 var5 = method529(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1924(true);
        }
        class98 var7 = arg0.method1924(!var5.method1914(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1935();
        } else if (var8 == 2) {
            var7.method1946();
        } else if (var8 == 3) {
            var7.method1933();
        }
        var7.method1930(var5, var6);
        if (var8 == 1) {
            var7.method1933();
        } else if (var8 == 2) {
            var7.method1946();
        } else if (var8 == 3) {
            var7.method1935();
        }
        return var7;
    }

    @ObfuscatedName("ar.s(Lcd;II)Lcd;")
    public class98 method705(class98 arg0, int arg1) {
        int var3 = this.field923[arg1];
        class96 var4 = method529(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1925(true);
        } else {
            class98 var6 = arg0.method1925(!var4.method1914(var5));
            var6.method1930(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.f(Lcd;ILar;II)Lcd;")
    public class98 method706(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field923[arg1];
        class96 var6 = method529(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method729(arg0, arg3);
        }
        int var8 = arg2.field923[arg3];
        class96 var9 = method529(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1924(!var6.method1914(var7));
            var11.method1930(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1924(!var6.method1914(var7) & !var9.method1914(var10));
            var12.method1931(var6, var7, var9, var10, this.field920);
            return var12;
        }
    }

    @ObfuscatedName("ar.x(Lcd;II)Lcd;")
    public class98 method700(class98 arg0, int arg1) {
        int var3 = this.field923[arg1];
        class96 var4 = method529(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1924(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field926 != null && arg1 < this.field926.length) {
            int var8 = this.field926[arg1];
            var6 = method529(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1924(!var4.method1914(var5));
            var10.method1930(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1924(!var4.method1914(var5) & !var6.method1914(var7));
            var9.method1930(var4, var5);
            var9.method1930(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ay.h(II)Lcg;")
    public static class96 method529(int arg0) {
        class96 var1 = (class96) field914.method3058((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class146 var2 = Statics.field911;
        class146 var3 = Statics.field910;
        boolean var4 = true;
        int[] var5 = var2.method2657(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2640(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2640(var8, 0);
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
            field914.method3057(var10, (long) arg0);
        }
        return var10;
    }
}
