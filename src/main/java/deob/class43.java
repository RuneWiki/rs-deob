package deob;

@ObfuscatedName("az")
public class class43 extends class204 {

    @ObfuscatedName("az.q")
    public static class193 field991 = new class193(64);

    @ObfuscatedName("az.p")
    public static class193 field992 = new class193(100);

    @ObfuscatedName("az.c")
    public int[] field988;

    @ObfuscatedName("az.f")
    public int[] field994;

    @ObfuscatedName("az.y")
    public int[] field995;

    @ObfuscatedName("az.w")
    public int[] field996;

    @ObfuscatedName("az.l")
    public int field990 = -1;

    @ObfuscatedName("az.v")
    public int[] field998;

    @ObfuscatedName("az.k")
    public boolean field1010 = false;

    @ObfuscatedName("az.o")
    public int field997 = 5;

    @ObfuscatedName("az.u")
    public int field1001 = -1;

    @ObfuscatedName("az.s")
    public int field1002 = -1;

    @ObfuscatedName("az.g")
    public int field1003 = 99;

    @ObfuscatedName("az.x")
    public int field1009 = -1;

    @ObfuscatedName("az.a")
    public int field1005 = -1;

    @ObfuscatedName("az.t")
    public int field1006 = 2;

    @ObfuscatedName("ds.h(IB)Laz;")
    public static class43 method2257(int arg0) {
        class43 var1 = (class43) field991.method3472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1008.method3051(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method837(new class119(var2));
        }
        var3.method833();
        field991.method3474(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.m(Ldp;I)V")
    public void method837(class119 arg0) {
        while (true) {
            int var2 = arg0.method2320();
            if (var2 == 0) {
                return;
            }
            this.method824(arg0, var2);
        }
    }

    @ObfuscatedName("az.i(Ldp;IB)V")
    public void method824(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2322();
            this.field995 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field995[var4] = arg0.method2322();
            }
            this.field988 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field988[var5] = arg0.method2322();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field988[var6] += arg0.method2322() << 16;
            }
        } else if (arg1 == 2) {
            this.field990 = arg0.method2322();
        } else if (arg1 == 3) {
            int var7 = arg0.method2320();
            this.field998 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field998[var8] = arg0.method2320();
            }
            this.field998[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1010 = true;
        } else if (arg1 == 5) {
            this.field997 = arg0.method2320();
        } else if (arg1 == 6) {
            this.field1001 = arg0.method2322();
        } else if (arg1 == 7) {
            this.field1002 = arg0.method2322();
        } else if (arg1 == 8) {
            this.field1003 = arg0.method2320();
        } else if (arg1 == 9) {
            this.field1009 = arg0.method2320();
        } else if (arg1 == 10) {
            this.field1005 = arg0.method2320();
        } else if (arg1 == 11) {
            this.field1006 = arg0.method2320();
        } else if (arg1 == 12) {
            int var9 = arg0.method2320();
            this.field994 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field994[var10] = arg0.method2322();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field994[var11] += arg0.method2322() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2320();
            this.field996 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field996[var13] = arg0.method2487();
            }
        }
    }

    @ObfuscatedName("az.q(I)V")
    public void method833() {
        if (this.field1009 == -1) {
            if (this.field998 == null) {
                this.field1009 = 0;
            } else {
                this.field1009 = 2;
            }
        }
        if (this.field1005 != -1) {
            return;
        }
        if (this.field998 == null) {
            this.field1005 = 0;
        } else {
            this.field1005 = 2;
        }
    }

    @ObfuscatedName("az.p(Ldb;II)Ldb;")
    public class105 method826(class105 arg0, int arg1) {
        int var3 = this.field988[arg1];
        class103 var4 = method483(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2118(true);
        } else {
            class105 var6 = arg0.method2118(!var4.method2112(var5));
            var6.method2143(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.c(Ldb;III)Ldb;")
    public class105 method827(class105 arg0, int arg1, int arg2) {
        int var4 = this.field988[arg1];
        class103 var5 = method483(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2118(true);
        }
        class105 var7 = arg0.method2118(!var5.method2112(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2178();
        } else if (var8 == 2) {
            var7.method2128();
        } else if (var8 == 3) {
            var7.method2127();
        }
        var7.method2143(var5, var6);
        if (var8 == 1) {
            var7.method2127();
        } else if (var8 == 2) {
            var7.method2128();
        } else if (var8 == 3) {
            var7.method2178();
        }
        return var7;
    }

    @ObfuscatedName("az.f(Ldb;II)Ldb;")
    public class105 method828(class105 arg0, int arg1) {
        int var3 = this.field988[arg1];
        class103 var4 = method483(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2119(true);
        } else {
            class105 var6 = arg0.method2119(!var4.method2112(var5));
            var6.method2143(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.y(Ldb;ILaz;II)Ldb;")
    public class105 method829(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field988[arg1];
        class103 var6 = method483(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method826(arg0, arg3);
        }
        int var8 = arg2.field988[arg3];
        class103 var9 = method483(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2118(!var6.method2112(var7));
            var11.method2143(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2118(!var6.method2112(var7) & !var9.method2112(var10));
            var12.method2177(var6, var7, var9, var10, this.field998);
            return var12;
        }
    }

    @ObfuscatedName("az.w(Ldb;IB)Ldb;")
    public class105 method830(class105 arg0, int arg1) {
        int var3 = this.field988[arg1];
        class103 var4 = method483(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2118(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field994 != null && arg1 < this.field994.length) {
            int var8 = this.field994[arg1];
            var6 = method483(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2118(!var4.method2112(var5));
            var10.method2143(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2118(!var4.method2112(var5) & !var6.method2112(var7));
            var9.method2143(var4, var5);
            var9.method2143(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("client.l(IB)Lcp;")
    public static class103 method483(int arg0) {
        class103 var1 = (class103) field992.method3472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class167 var2 = Statics.field989;
        class167 var3 = Statics.field993;
        boolean var4 = true;
        int[] var5 = var2.method3016(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3013(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3013(var8, 0);
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
            field992.method3474(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("ei.v(I)V")
    public static void method2751() {
        field991.method3483();
        field992.method3483();
    }
}
