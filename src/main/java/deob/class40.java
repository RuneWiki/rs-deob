package deob;

@ObfuscatedName("ax")
public class class40 {

    public class40() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.a(Lcv;III)[Lfh;")
    public static class171[] method45(class87 arg0, int arg1, int arg2) {
        return method753(arg0, arg1, arg2) ? method1354() : null;
    }

    @ObfuscatedName("bi.o(Lcv;III)Lfh;")
    public static class171 method735(class87 arg0, int arg1, int arg2) {
        if (!method753(arg0, arg1, arg2)) {
            return null;
        }
        class171 var3 = new class171();
        var3.field2506 = Statics.field536;
        var3.field2501 = Statics.field538;
        var3.field2504 = Statics.field537[0];
        var3.field2507 = Statics.field534[0];
        var3.field2502 = Statics.field1517[0];
        var3.field2508 = Statics.field539[0];
        int var4 = var3.field2508 * var3.field2502;
        byte[] var5 = Statics.field541[0];
        var3.field2503 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field2503[var6] = Statics.field540[var5[var6] & 0xFF];
        }
        Statics.field537 = null;
        Statics.field534 = null;
        Statics.field1517 = null;
        Statics.field539 = null;
        Statics.field540 = null;
        Statics.field541 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("j.c(Lcv;Lcv;III)Lfs;")
    public static class182 method148(class87 arg0, class87 arg1, int arg2, int arg3) {
        return method753(arg0, arg2, arg3) ? method748(arg1.method1024(arg2, arg3)) : null;
    }

    @ObfuscatedName("g.h(Lcv;Ljava/lang/String;Ljava/lang/String;B)[Lfm;")
    public static class172[] method240(class87 arg0, String arg1, String arg2) {
        int var3 = arg0.method1034(arg1);
        int var4 = arg0.method1035(var3, arg2);
        return Statics.method1782(arg0, var3, var4);
    }

    @ObfuscatedName("co.r(Lcv;Ljava/lang/String;Ljava/lang/String;B)Lfm;")
    public static class172 method1231(class87 arg0, String arg1, String arg2) {
        int var3 = arg0.method1034(arg1);
        int var4 = arg0.method1035(var3, arg2);
        return Statics.method241(arg0, var3, var4);
    }

    @ObfuscatedName("aa.d(Lcv;Ljava/lang/String;Ljava/lang/String;I)[Lfh;")
    public static class171[] method346(class87 arg0, String arg1, String arg2) {
        int var3 = arg0.method1034(arg1);
        int var4 = arg0.method1035(var3, arg2);
        return method45(arg0, var3, var4);
    }

    @ObfuscatedName("n.k(Lcv;Ljava/lang/String;Ljava/lang/String;I)Lfh;")
    public static class171 method277(class87 arg0, String arg1, String arg2) {
        int var3 = arg0.method1034(arg1);
        int var4 = arg0.method1035(var3, arg2);
        return method735(arg0, var3, var4);
    }

    @ObfuscatedName("fa.u(Lcv;II)Lfm;")
    public static class172 method2581(class87 arg0, int arg1) {
        return method395(arg0, arg1) ? method394() : null;
    }

    @ObfuscatedName("ar.v(I)Lfm;")
    public static class172 method394() {
        class172 var0 = new class172();
        var0.field2519 = Statics.field536;
        var0.field2520 = Statics.field538;
        var0.field2517 = Statics.field537[0];
        var0.field2515 = Statics.field534[0];
        var0.field2513 = Statics.field1517[0];
        var0.field2516 = Statics.field539[0];
        var0.field2518 = Statics.field540;
        var0.field2514 = Statics.field541[0];
        Statics.field537 = null;
        Statics.field534 = null;
        Statics.field1517 = null;
        Statics.field539 = null;
        Statics.field540 = null;
        Statics.field541 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("db.f(B)[Lfh;")
    public static class171[] method1354() {
        class171[] var0 = new class171[Statics.field535];
        for (int var1 = 0; var1 < Statics.field535; var1++) {
            class171 var2 = var0[var1] = new class171();
            var2.field2506 = Statics.field536;
            var2.field2501 = Statics.field538;
            var2.field2504 = Statics.field537[var1];
            var2.field2507 = Statics.field534[var1];
            var2.field2502 = Statics.field1517[var1];
            var2.field2508 = Statics.field539[var1];
            int var3 = var2.field2508 * var2.field2502;
            byte[] var4 = Statics.field541[var1];
            var2.field2503 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field2503[var5] = Statics.field540[var4[var5] & 0xFF];
            }
        }
        Statics.field537 = null;
        Statics.field534 = null;
        Statics.field1517 = null;
        Statics.field539 = null;
        Statics.field540 = null;
        Statics.field541 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("bu.s([BI)Lfs;")
    public static class182 method748(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        class182 var1 = new class182(arg0, Statics.field537, Statics.field534, Statics.field1517, Statics.field539, Statics.field540, Statics.field541);
        Statics.field537 = null;
        Statics.field534 = null;
        Statics.field1517 = null;
        Statics.field539 = null;
        Statics.field540 = null;
        Statics.field541 = (byte[][]) null;
        return var1;
    }

    @ObfuscatedName("bf.j(Lcv;III)Z")
    public static boolean method753(class87 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1024(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method534(var3);
            return true;
        }
    }

    @ObfuscatedName("ar.e(Lcv;IB)Z")
    public static boolean method395(class87 arg0, int arg1) {
        byte[] var2 = arg0.method1078(arg1);
        if (var2 == null) {
            return false;
        } else {
            method534(var2);
            return true;
        }
    }

    @ObfuscatedName("as.t([BI)V")
    public static void method534(byte[] arg0) {
        class136 var1 = new class136(arg0);
        var1.field1722 = arg0.length - 2;
        Statics.field535 = var1.method1712();
        Statics.field537 = new int[Statics.field535];
        Statics.field534 = new int[Statics.field535];
        Statics.field1517 = new int[Statics.field535];
        Statics.field539 = new int[Statics.field535];
        Statics.field541 = new byte[Statics.field535][];
        var1.field1722 = arg0.length - 7 - Statics.field535 * 8;
        Statics.field536 = var1.method1712();
        Statics.field538 = var1.method1712();
        int var2 = (var1.method1602() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field535; var3++) {
            Statics.field537[var3] = var1.method1712();
        }
        for (int var4 = 0; var4 < Statics.field535; var4++) {
            Statics.field534[var4] = var1.method1712();
        }
        for (int var5 = 0; var5 < Statics.field535; var5++) {
            Statics.field1517[var5] = var1.method1712();
        }
        for (int var6 = 0; var6 < Statics.field535; var6++) {
            Statics.field539[var6] = var1.method1712();
        }
        var1.field1722 = arg0.length - 7 - Statics.field535 * 8 - (var2 - 1) * 3;
        Statics.field540 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field540[var7] = var1.method1606();
            if (Statics.field540[var7] == 0) {
                Statics.field540[var7] = 1;
            }
        }
        var1.field1722 = 0;
        for (int var8 = 0; var8 < Statics.field535; var8++) {
            int var9 = Statics.field1517[var8];
            int var10 = Statics.field539[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field541[var8] = var12;
            int var13 = var1.method1602();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method1603();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method1603();
                    }
                }
            }
        }
    }
}
