package deob;

@ObfuscatedName("cs")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.x(Lej;III)[Lci;")
    public static class87[] method1561(class152 arg0, int arg1, int arg2) {
        if (!method218(arg0, arg1, arg2)) {
            return null;
        }
        class87[] var3 = new class87[Statics.field1423];
        for (int var4 = 0; var4 < Statics.field1423; var4++) {
            class87 var5 = var3[var4] = new class87();
            var5.field1457 = Statics.field1420;
            var5.field1459 = Statics.field1421;
            var5.field1456 = Statics.field1422[var4];
            var5.field1458 = Statics.field1424[var4];
            var5.field1454 = Statics.field1426[var4];
            var5.field1452 = Statics.field253[var4];
            var5.field1455 = Statics.field1425;
            var5.field1453 = Statics.field1419[var4];
        }
        method95();
        return var3;
    }

    @ObfuscatedName("ac.p(Lej;III)[Lcm;")
    public static class86[] method730(class152 arg0, int arg1, int arg2) {
        if (!method218(arg0, arg1, arg2)) {
            return null;
        }
        class86[] var3 = new class86[Statics.field1423];
        for (int var4 = 0; var4 < Statics.field1423; var4++) {
            class86 var5 = var3[var4] = new class86();
            var5.field1445 = Statics.field1420;
            var5.field1447 = Statics.field1421;
            var5.field1443 = Statics.field1422[var4];
            var5.field1442 = Statics.field1424[var4];
            var5.field1441 = Statics.field1426[var4];
            var5.field1446 = Statics.field253[var4];
            int var6 = var5.field1446 * var5.field1441;
            byte[] var7 = Statics.field1419[var4];
            var5.field1444 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field1444[var8] = Statics.field1425[var7[var8] & 0xFF];
            }
        }
        method95();
        return var3;
    }

    @ObfuscatedName("df.k(Lej;III)Lcm;")
    public static class86 method2308(class152 arg0, int arg1, int arg2) {
        if (!method218(arg0, arg1, arg2)) {
            return null;
        }
        class86 var3 = new class86();
        var3.field1445 = Statics.field1420;
        var3.field1447 = Statics.field1421;
        var3.field1443 = Statics.field1422[0];
        var3.field1442 = Statics.field1424[0];
        var3.field1441 = Statics.field1426[0];
        var3.field1446 = Statics.field253[0];
        int var4 = var3.field1446 * var3.field1441;
        byte[] var5 = Statics.field1419[0];
        var3.field1444 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1444[var6] = Statics.field1425[var5[var6] & 0xFF];
        }
        method95();
        return var3;
    }

    @ObfuscatedName("ab.a(Lej;Ljava/lang/String;Ljava/lang/String;I)[Lci;")
    public static class87[] method676(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2934(arg1);
        int var4 = arg0.method2972(var3, arg2);
        return method1561(arg0, var3, var4);
    }

    @ObfuscatedName("r.q(Lej;Ljava/lang/String;Ljava/lang/String;I)Lci;")
    public static class87 method145(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2934(arg1);
        int var4 = arg0.method2972(var3, arg2);
        class87 var5;
        if (method218(arg0, var3, var4)) {
            class87 var6 = new class87();
            var6.field1457 = Statics.field1420;
            var6.field1459 = Statics.field1421;
            var6.field1456 = Statics.field1422[0];
            var6.field1458 = Statics.field1424[0];
            var6.field1454 = Statics.field1426[0];
            var6.field1452 = Statics.field253[0];
            var6.field1455 = Statics.field1425;
            var6.field1453 = Statics.field1419[0];
            method95();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("aj.j(Lej;Ljava/lang/String;Ljava/lang/String;I)[Lcm;")
    public static class86[] method612(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method2934(arg1);
        int var4 = arg0.method2972(var3, arg2);
        return method730(arg0, var3, var4);
    }

    @ObfuscatedName("ae.v(Lej;Lej;Ljava/lang/String;Ljava/lang/String;I)Lgh;")
    public static class183 method801(class152 arg0, class152 arg1, String arg2, String arg3) {
        int var4 = arg0.method2934(arg2);
        int var5 = arg0.method2972(var4, arg3);
        class183 var6;
        if (method218(arg0, var4, var5)) {
            byte[] var7 = arg1.method2920(var4, var5);
            class183 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class183 var9 = new class183(var7, Statics.field1422, Statics.field1424, Statics.field1426, Statics.field253, Statics.field1425, Statics.field1419);
                method95();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("d.w(Lej;IIB)Z")
    public static boolean method218(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2920(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method16(var3);
            return true;
        }
    }

    @ObfuscatedName("k.l([BI)V")
    public static void method16(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2008 = arg0.length - 2;
        Statics.field1423 = var1.method2539();
        Statics.field1422 = new int[Statics.field1423];
        Statics.field1424 = new int[Statics.field1423];
        Statics.field1426 = new int[Statics.field1423];
        Statics.field253 = new int[Statics.field1423];
        Statics.field1419 = new byte[Statics.field1423][];
        var1.field2008 = arg0.length - 7 - Statics.field1423 * 8;
        Statics.field1420 = var1.method2539();
        Statics.field1421 = var1.method2539();
        int var2 = (var1.method2484() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1423; var3++) {
            Statics.field1422[var3] = var1.method2539();
        }
        for (int var4 = 0; var4 < Statics.field1423; var4++) {
            Statics.field1424[var4] = var1.method2539();
        }
        for (int var5 = 0; var5 < Statics.field1423; var5++) {
            Statics.field1426[var5] = var1.method2539();
        }
        for (int var6 = 0; var6 < Statics.field1423; var6++) {
            Statics.field253[var6] = var1.method2539();
        }
        var1.field2008 = arg0.length - 7 - Statics.field1423 * 8 - (var2 - 1) * 3;
        Statics.field1425 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1425[var7] = var1.method2403();
            if (Statics.field1425[var7] == 0) {
                Statics.field1425[var7] = 1;
            }
        }
        var1.field2008 = 0;
        for (int var8 = 0; var8 < Statics.field1423; var8++) {
            int var9 = Statics.field1426[var8];
            int var10 = Statics.field253[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1419[var8] = var12;
            int var13 = var1.method2484();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2411();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2411();
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.s(I)V")
    public static void method95() {
        Statics.field1422 = null;
        Statics.field1424 = null;
        Statics.field1426 = null;
        Statics.field253 = null;
        Statics.field1425 = null;
        Statics.field1419 = (byte[][]) null;
    }
}
