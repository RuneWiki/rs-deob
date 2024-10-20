package deob;

@ObfuscatedName("ar")
public class class43 extends class205 {

    @ObfuscatedName("ar.x")
    public static class194 field985 = new class194(64);

    @ObfuscatedName("ar.d")
    public static class194 field983 = new class194(100);

    @ObfuscatedName("ar.u")
    public int[] field987;

    @ObfuscatedName("ar.o")
    public int[] field988;

    @ObfuscatedName("ar.b")
    public int[] field1000;

    @ObfuscatedName("ar.k")
    public int[] field990;

    @ObfuscatedName("ar.c")
    public int field992 = -1;

    @ObfuscatedName("ar.l")
    public int[] field999;

    @ObfuscatedName("ar.t")
    public boolean field993 = false;

    @ObfuscatedName("ar.i")
    public int field994 = 5;

    @ObfuscatedName("ar.r")
    public int field995 = -1;

    @ObfuscatedName("ar.m")
    public int field996 = -1;

    @ObfuscatedName("ar.e")
    public int field997 = 99;

    @ObfuscatedName("ar.h")
    public int field998 = -1;

    @ObfuscatedName("ar.z")
    public int field1002 = -1;

    @ObfuscatedName("ar.a")
    public int field989 = 2;

    @ObfuscatedName("g.s(Lfa;Lfa;Lfa;I)V")
    public static void method544(class168 arg0, class168 arg1, class168 arg2) {
        Statics.field986 = arg0;
        Statics.field1569 = arg1;
        Statics.field984 = arg2;
    }

    @ObfuscatedName("d.j(II)Lar;")
    public static class43 method43(int arg0) {
        class43 var1 = (class43) field985.method3484((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field986.method3014(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method818(new class120(var2));
        }
        var3.method848();
        field985.method3486(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.p(Lds;I)V")
    public void method818(class120 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method819(arg0, var2);
        }
    }

    @ObfuscatedName("ar.x(Lds;II)V")
    public void method819(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2430();
            this.field1000 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1000[var4] = arg0.method2430();
            }
            this.field987 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field987[var5] = arg0.method2430();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field987[var6] += arg0.method2430() << 16;
            }
        } else if (arg1 == 2) {
            this.field992 = arg0.method2430();
        } else if (arg1 == 3) {
            int var7 = arg0.method2338();
            this.field999 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field999[var8] = arg0.method2338();
            }
            this.field999[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field993 = true;
        } else if (arg1 == 5) {
            this.field994 = arg0.method2338();
        } else if (arg1 == 6) {
            this.field995 = arg0.method2430();
        } else if (arg1 == 7) {
            this.field996 = arg0.method2430();
        } else if (arg1 == 8) {
            this.field997 = arg0.method2338();
        } else if (arg1 == 9) {
            this.field998 = arg0.method2338();
        } else if (arg1 == 10) {
            this.field1002 = arg0.method2338();
        } else if (arg1 == 11) {
            this.field989 = arg0.method2338();
        } else if (arg1 == 12) {
            int var9 = arg0.method2338();
            this.field988 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field988[var10] = arg0.method2430();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field988[var11] += arg0.method2430() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2338();
            this.field990 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field990[var13] = arg0.method2359();
            }
        }
    }

    @ObfuscatedName("ar.d(I)V")
    public void method848() {
        if (this.field998 == -1) {
            if (this.field999 == null) {
                this.field998 = 0;
            } else {
                this.field998 = 2;
            }
        }
        if (this.field1002 != -1) {
            return;
        }
        if (this.field999 == null) {
            this.field1002 = 0;
        } else {
            this.field1002 = 2;
        }
    }

    @ObfuscatedName("ar.u(Ldh;IS)Ldh;")
    public class106 method821(class106 arg0, int arg1) {
        int var3 = this.field987[arg1];
        class104 var4 = method2623(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2142(true);
        } else {
            class106 var6 = arg0.method2142(!var4.method2137(var5));
            var6.method2148(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.o(Ldh;III)Ldh;")
    public class106 method825(class106 arg0, int arg1, int arg2) {
        int var4 = this.field987[arg1];
        class104 var5 = method2623(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2142(true);
        }
        class106 var7 = arg0.method2142(!var5.method2137(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2153();
        } else if (var8 == 2) {
            var7.method2195();
        } else if (var8 == 3) {
            var7.method2151();
        }
        var7.method2148(var5, var6);
        if (var8 == 1) {
            var7.method2151();
        } else if (var8 == 2) {
            var7.method2195();
        } else if (var8 == 3) {
            var7.method2153();
        }
        return var7;
    }

    @ObfuscatedName("ar.b(Ldh;II)Ldh;")
    public class106 method823(class106 arg0, int arg1) {
        int var3 = this.field987[arg1];
        class104 var4 = method2623(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2143(true);
        } else {
            class106 var6 = arg0.method2143(!var4.method2137(var5));
            var6.method2148(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.k(Ldh;ILar;II)Ldh;")
    public class106 method824(class106 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field987[arg1];
        class104 var6 = method2623(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method821(arg0, arg3);
        }
        int var8 = arg2.field987[arg3];
        class104 var9 = method2623(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class106 var11 = arg0.method2142(!var6.method2137(var7));
            var11.method2148(var6, var7);
            return var11;
        } else {
            class106 var12 = arg0.method2142(!var6.method2137(var7) & !var9.method2137(var10));
            var12.method2163(var6, var7, var9, var10, this.field999);
            return var12;
        }
    }

    @ObfuscatedName("ar.c(Ldh;II)Ldh;")
    public class106 method822(class106 arg0, int arg1) {
        int var3 = this.field987[arg1];
        class104 var4 = method2623(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2142(true);
        }
        class104 var6 = null;
        int var7 = 0;
        if (this.field988 != null && arg1 < this.field988.length) {
            int var8 = this.field988[arg1];
            var6 = method2623(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class106 var10 = arg0.method2142(!var4.method2137(var5));
            var10.method2148(var4, var5);
            return var10;
        } else {
            class106 var9 = arg0.method2142(!var4.method2137(var5) & !var6.method2137(var7));
            var9.method2148(var4, var5);
            var9.method2148(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("df.l(II)Lcx;")
    public static class104 method2623(int arg0) {
        class104 var1 = (class104) field983.method3484((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class168 var2 = Statics.field1569;
        class168 var3 = Statics.field984;
        boolean var4 = true;
        int[] var5 = var2.method3056(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3058(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3058(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class104 var10;
        if (var4) {
            try {
                var10 = new class104(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field983.method3486(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("dx.t(I)V")
    public static void method2281() {
        field985.method3491();
        field983.method3491();
    }
}
