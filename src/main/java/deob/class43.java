package deob;

@ObfuscatedName("af")
public class class43 extends class204 {

    @ObfuscatedName("af.u")
    public static class193 field964 = new class193(64);

    @ObfuscatedName("af.k")
    public static class193 field953 = new class193(100);

    @ObfuscatedName("af.j")
    public int[] field955;

    @ObfuscatedName("af.i")
    public int[] field963;

    @ObfuscatedName("af.x")
    public int[] field957;

    @ObfuscatedName("af.g")
    public int[] field958;

    @ObfuscatedName("af.e")
    public int field956 = -1;

    @ObfuscatedName("af.p")
    public int[] field960;

    @ObfuscatedName("af.a")
    public boolean field961 = false;

    @ObfuscatedName("af.v")
    public int field970 = 5;

    @ObfuscatedName("af.c")
    public int field954 = -1;

    @ObfuscatedName("af.s")
    public int field959 = -1;

    @ObfuscatedName("af.r")
    public int field965 = 99;

    @ObfuscatedName("af.h")
    public int field966 = -1;

    @ObfuscatedName("af.n")
    public int field967 = -1;

    @ObfuscatedName("af.b")
    public int field968 = 2;

    @ObfuscatedName("du.m(II)Laf;")
    public static class43 method2262(int arg0) {
        class43 var1 = (class43) field964.method3537((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field950.method3080(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method904(new class119(var2));
        }
        var3.method881();
        field964.method3539(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.l(Ldx;I)V")
    public void method904(class119 arg0) {
        while (true) {
            int var2 = arg0.method2562();
            if (var2 == 0) {
                return;
            }
            this.method880(arg0, var2);
        }
    }

    @ObfuscatedName("af.y(Ldx;II)V")
    public void method880(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2541();
            this.field957 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field957[var4] = arg0.method2541();
            }
            this.field955 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field955[var5] = arg0.method2541();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field955[var6] += arg0.method2541() << 16;
            }
        } else if (arg1 == 2) {
            this.field956 = arg0.method2541();
        } else if (arg1 == 3) {
            int var7 = arg0.method2562();
            this.field960 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field960[var8] = arg0.method2562();
            }
            this.field960[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field961 = true;
        } else if (arg1 == 5) {
            this.field970 = arg0.method2562();
        } else if (arg1 == 6) {
            this.field954 = arg0.method2541();
        } else if (arg1 == 7) {
            this.field959 = arg0.method2541();
        } else if (arg1 == 8) {
            this.field965 = arg0.method2562();
        } else if (arg1 == 9) {
            this.field966 = arg0.method2562();
        } else if (arg1 == 10) {
            this.field967 = arg0.method2562();
        } else if (arg1 == 11) {
            this.field968 = arg0.method2562();
        } else if (arg1 == 12) {
            int var9 = arg0.method2562();
            this.field963 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field963[var10] = arg0.method2541();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field963[var11] += arg0.method2541() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2562();
            this.field958 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field958[var13] = arg0.method2385();
            }
        }
    }

    @ObfuscatedName("af.u(B)V")
    public void method881() {
        if (this.field966 == -1) {
            if (this.field960 == null) {
                this.field966 = 0;
            } else {
                this.field966 = 2;
            }
        }
        if (this.field967 != -1) {
            return;
        }
        if (this.field960 == null) {
            this.field967 = 0;
        } else {
            this.field967 = 2;
        }
    }

    @ObfuscatedName("af.k(Ldb;IS)Ldb;")
    public class105 method906(class105 arg0, int arg1) {
        int var3 = this.field955[arg1];
        class103 var4 = method183(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2203(true);
        } else {
            class105 var6 = arg0.method2203(!var4.method2174(var5));
            var6.method2186(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("af.j(Ldb;III)Ldb;")
    public class105 method883(class105 arg0, int arg1, int arg2) {
        int var4 = this.field955[arg1];
        class103 var5 = method183(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2203(true);
        }
        class105 var7 = arg0.method2203(!var5.method2174(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2196();
        } else if (var8 == 2) {
            var7.method2236();
        } else if (var8 == 3) {
            var7.method2184();
        }
        var7.method2186(var5, var6);
        if (var8 == 1) {
            var7.method2184();
        } else if (var8 == 2) {
            var7.method2236();
        } else if (var8 == 3) {
            var7.method2196();
        }
        return var7;
    }

    @ObfuscatedName("af.i(Ldb;IB)Ldb;")
    public class105 method884(class105 arg0, int arg1) {
        int var3 = this.field955[arg1];
        class103 var4 = method183(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2187(true);
        } else {
            class105 var6 = arg0.method2187(!var4.method2174(var5));
            var6.method2186(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("af.x(Ldb;ILaf;II)Ldb;")
    public class105 method885(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field955[arg1];
        class103 var6 = method183(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method906(arg0, arg3);
        }
        int var8 = arg2.field955[arg3];
        class103 var9 = method183(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2203(!var6.method2174(var7));
            var11.method2186(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2203(!var6.method2174(var7) & !var9.method2174(var10));
            var12.method2212(var6, var7, var9, var10, this.field960);
            return var12;
        }
    }

    @ObfuscatedName("af.g(Ldb;II)Ldb;")
    public class105 method886(class105 arg0, int arg1) {
        int var3 = this.field955[arg1];
        class103 var4 = method183(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2203(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field963 != null && arg1 < this.field963.length) {
            int var8 = this.field963[arg1];
            var6 = method183(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2203(!var4.method2174(var5));
            var10.method2186(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2203(!var4.method2174(var5) & !var6.method2174(var7));
            var9.method2186(var4, var5);
            var9.method2186(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("h.e(II)Lct;")
    public static class103 method183(int arg0) {
        class103 var1 = (class103) field953.method3537((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class167 var2 = Statics.field951;
        class167 var3 = Statics.field962;
        boolean var4 = true;
        int[] var5 = var2.method3121(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3086(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3086(var8, 0);
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
            field953.method3539(var10, (long) arg0);
        }
        return var10;
    }
}
