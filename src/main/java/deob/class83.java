package deob;

@ObfuscatedName("cp")
public class class83 {

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.u(Leb;III)[Lcv;")
    public static class86[] method166(class151 arg0, int arg1, int arg2) {
        if (!method1852(arg0, arg1, arg2)) {
            return null;
        }
        class86[] var3 = new class86[Statics.field1424];
        for (int var4 = 0; var4 < Statics.field1424; var4++) {
            class86 var5 = var3[var4] = new class86();
            var5.field1460 = Statics.field1425;
            var5.field1458 = Statics.field1426;
            var5.field1461 = Statics.field1427[var4];
            var5.field1459 = Statics.field1432[var4];
            var5.field1456 = Statics.field1428[var4];
            var5.field1457 = Statics.field1429[var4];
            var5.field1454 = Statics.field863;
            var5.field1455 = Statics.field120[var4];
        }
        Statics.method205();
        return var3;
    }

    @ObfuscatedName("e.x(Leb;IIB)Lco;")
    public static class85 method140(class151 arg0, int arg1, int arg2) {
        if (!method1852(arg0, arg1, arg2)) {
            return null;
        }
        class85 var3 = new class85();
        var3.field1449 = Statics.field1425;
        var3.field1448 = Statics.field1426;
        var3.field1445 = Statics.field1427[0];
        var3.field1447 = Statics.field1432[0];
        var3.field1443 = Statics.field1428[0];
        var3.field1451 = Statics.field1429[0];
        int var4 = var3.field1451 * var3.field1443;
        byte[] var5 = Statics.field120[0];
        var3.field1446 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1446[var6] = Statics.field863[var5[var6] & 0xFF];
        }
        Statics.method205();
        return var3;
    }

    @ObfuscatedName("ak.m(Leb;Leb;III)Lfk;")
    public static class182 method744(class151 arg0, class151 arg1, int arg2, int arg3) {
        if (!method1852(arg0, arg2, arg3)) {
            return null;
        }
        byte[] var4 = arg1.method2965(arg2, arg3);
        class182 var5;
        if (var4 == null) {
            var5 = null;
        } else {
            class182 var6 = new class182(var4, Statics.field1427, Statics.field1432, Statics.field1428, Statics.field1429, Statics.field863, Statics.field120);
            Statics.field1427 = null;
            Statics.field1432 = null;
            Statics.field1428 = null;
            Statics.field1429 = null;
            Statics.field863 = null;
            Statics.field120 = (byte[][]) null;
            var5 = var6;
        }
        return var5;
    }

    @ObfuscatedName("bd.n(Leb;Ljava/lang/String;Ljava/lang/String;B)[Lcv;")
    public static class86[] method1570(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2980(arg1);
        int var4 = arg0.method3014(var3, arg2);
        return method166(arg0, var3, var4);
    }

    @ObfuscatedName("cw.q(Leb;Ljava/lang/String;Ljava/lang/String;I)Lcv;")
    public static class86 method1627(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2980(arg1);
        int var4 = arg0.method3014(var3, arg2);
        return Statics.method12(arg0, var3, var4);
    }

    @ObfuscatedName("l.a(Leb;Ljava/lang/String;Ljava/lang/String;I)[Lco;")
    public static class85[] method114(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2980(arg1);
        int var4 = arg0.method3014(var3, arg2);
        class85[] var5;
        if (method1852(arg0, var3, var4)) {
            var5 = method1855();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("br.g(Leb;Leb;Ljava/lang/String;Ljava/lang/String;B)Lfk;")
    public static class182 method1360(class151 arg0, class151 arg1, String arg2, String arg3) {
        int var4 = arg0.method2980(arg2);
        int var5 = arg0.method3014(var4, arg3);
        return method744(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("bk.j(B)Lcv;")
    public static class86 method1405() {
        class86 var0 = new class86();
        var0.field1460 = Statics.field1425;
        var0.field1458 = Statics.field1426;
        var0.field1461 = Statics.field1427[0];
        var0.field1459 = Statics.field1432[0];
        var0.field1456 = Statics.field1428[0];
        var0.field1457 = Statics.field1429[0];
        var0.field1454 = Statics.field863;
        var0.field1455 = Statics.field120[0];
        Statics.field1427 = null;
        Statics.field1432 = null;
        Statics.field1428 = null;
        Statics.field1429 = null;
        Statics.field863 = null;
        Statics.field120 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("ch.l(I)[Lco;")
    public static class85[] method1855() {
        class85[] var0 = new class85[Statics.field1424];
        for (int var1 = 0; var1 < Statics.field1424; var1++) {
            class85 var2 = var0[var1] = new class85();
            var2.field1449 = Statics.field1425;
            var2.field1448 = Statics.field1426;
            var2.field1445 = Statics.field1427[var1];
            var2.field1447 = Statics.field1432[var1];
            var2.field1443 = Statics.field1428[var1];
            var2.field1451 = Statics.field1429[var1];
            int var3 = var2.field1451 * var2.field1443;
            byte[] var4 = Statics.field120[var1];
            var2.field1446 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1446[var5] = Statics.field863[var4[var5] & 0xFF];
            }
        }
        Statics.method205();
        return var0;
    }

    @ObfuscatedName("cf.w(Leb;III)Z")
    public static boolean method1852(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2965(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method204(var3);
            return true;
        }
    }

    @ObfuscatedName("s.z([BI)V")
    public static void method204(byte[] arg0) {
        class126 var1 = new class126(arg0);
        var1.field2024 = arg0.length - 2;
        Statics.field1424 = var1.method2450();
        Statics.field1427 = new int[Statics.field1424];
        Statics.field1432 = new int[Statics.field1424];
        Statics.field1428 = new int[Statics.field1424];
        Statics.field1429 = new int[Statics.field1424];
        Statics.field120 = new byte[Statics.field1424][];
        var1.field2024 = arg0.length - 7 - Statics.field1424 * 8;
        Statics.field1425 = var1.method2450();
        Statics.field1426 = var1.method2450();
        int var2 = (var1.method2559() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1424; var3++) {
            Statics.field1427[var3] = var1.method2450();
        }
        for (int var4 = 0; var4 < Statics.field1424; var4++) {
            Statics.field1432[var4] = var1.method2450();
        }
        for (int var5 = 0; var5 < Statics.field1424; var5++) {
            Statics.field1428[var5] = var1.method2450();
        }
        for (int var6 = 0; var6 < Statics.field1424; var6++) {
            Statics.field1429[var6] = var1.method2450();
        }
        var1.field2024 = arg0.length - 7 - Statics.field1424 * 8 - (var2 - 1) * 3;
        Statics.field863 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field863[var7] = var1.method2452();
            if (Statics.field863[var7] == 0) {
                Statics.field863[var7] = 1;
            }
        }
        var1.field2024 = 0;
        for (int var8 = 0; var8 < Statics.field1424; var8++) {
            int var9 = Statics.field1428[var8];
            int var10 = Statics.field1429[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field120[var8] = var12;
            int var13 = var1.method2559();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2449();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2449();
                    }
                }
            }
        }
    }
}
