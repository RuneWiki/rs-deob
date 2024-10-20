package deob;

@ObfuscatedName("cu")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.t(Lev;III)[Lci;")
    public static class87[] method1281(class152 arg0, int arg1, int arg2) {
        return method224(arg0, arg1, arg2) ? method792() : null;
    }

    @ObfuscatedName("a.l(Lev;III)[Lce;")
    public static class86[] method232(class152 arg0, int arg1, int arg2) {
        return method224(arg0, arg1, arg2) ? method124() : null;
    }

    @ObfuscatedName("al.c(Lev;Lev;IIB)Lgc;")
    public static class183 method764(class152 arg0, class152 arg1, int arg2, int arg3) {
        return method224(arg0, arg2, arg3) ? method833(arg1.method2987(arg2, arg3)) : null;
    }

    @ObfuscatedName("aa.d(Lev;Ljava/lang/String;Ljava/lang/String;I)[Lci;")
    public static class87[] method628(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3023(arg1);
        int var4 = arg0.method3003(var3, arg2);
        return method1281(arg0, var3, var4);
    }

    @ObfuscatedName("do.b(Lev;Ljava/lang/String;Ljava/lang/String;I)Lci;")
    public static class87 method2640(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3023(arg1);
        int var4 = arg0.method3003(var3, arg2);
        class87 var5;
        if (method224(arg0, var3, var4)) {
            class87 var6 = new class87();
            var6.field1520 = Statics.field1786;
            var6.field1522 = Statics.field1491;
            var6.field1519 = Statics.field412[0];
            var6.field1515 = Statics.field2576[0];
            var6.field1517 = Statics.field1494[0];
            var6.field1518 = Statics.field411[0];
            var6.field1516 = Statics.field1556;
            var6.field1521 = Statics.field1492[0];
            method2687();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("d.i(Lev;Ljava/lang/String;Ljava/lang/String;I)[Lce;")
    public static class86[] method40(class152 arg0, String arg1, String arg2) {
        int var3 = arg0.method3023(arg1);
        int var4 = arg0.method3003(var3, arg2);
        return method232(arg0, var3, var4);
    }

    @ObfuscatedName("z.p(Lev;Lev;Ljava/lang/String;Ljava/lang/String;I)Lgc;")
    public static class183 method111(class152 arg0, class152 arg1, String arg2, String arg3) {
        int var4 = arg0.method3023(arg2);
        int var5 = arg0.method3003(var4, arg3);
        return method764(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ac.y(Lev;IS)Lci;")
    public static class87 method859(class152 arg0, int arg1) {
        byte[] var2 = arg0.method3017(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method134(var2);
            var3 = true;
        }
        if (!var3) {
            return null;
        }
        class87 var4 = new class87();
        var4.field1520 = Statics.field1786;
        var4.field1522 = Statics.field1491;
        var4.field1519 = Statics.field412[0];
        var4.field1515 = Statics.field2576[0];
        var4.field1517 = Statics.field1494[0];
        var4.field1518 = Statics.field411[0];
        var4.field1516 = Statics.field1556;
        var4.field1521 = Statics.field1492[0];
        method2687();
        return var4;
    }

    @ObfuscatedName("as.u(I)[Lci;")
    public static class87[] method792() {
        class87[] var0 = new class87[Statics.field1493];
        for (int var1 = 0; var1 < Statics.field1493; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1520 = Statics.field1786;
            var2.field1522 = Statics.field1491;
            var2.field1519 = Statics.field412[var1];
            var2.field1515 = Statics.field2576[var1];
            var2.field1517 = Statics.field1494[var1];
            var2.field1518 = Statics.field411[var1];
            var2.field1516 = Statics.field1556;
            var2.field1521 = Statics.field1492[var1];
        }
        method2687();
        return var0;
    }

    @ObfuscatedName("j.z(I)[Lce;")
    public static class86[] method124() {
        class86[] var0 = new class86[Statics.field1493];
        for (int var1 = 0; var1 < Statics.field1493; var1++) {
            class86 var2 = var0[var1] = new class86();
            var2.field1508 = Statics.field1786;
            var2.field1509 = Statics.field1491;
            var2.field1512 = Statics.field412[var1];
            var2.field1507 = Statics.field2576[var1];
            var2.field1511 = Statics.field1494[var1];
            var2.field1505 = Statics.field411[var1];
            int var3 = var2.field1511 * var2.field1505;
            byte[] var4 = Statics.field1492[var1];
            var2.field1504 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1504[var5] = Statics.field1556[var4[var5] & 0xFF];
            }
        }
        method2687();
        return var0;
    }

    @ObfuscatedName("bv.j(S)Lce;")
    public static class86 method1428() {
        class86 var0 = new class86();
        var0.field1508 = Statics.field1786;
        var0.field1509 = Statics.field1491;
        var0.field1512 = Statics.field412[0];
        var0.field1507 = Statics.field2576[0];
        var0.field1511 = Statics.field1494[0];
        var0.field1505 = Statics.field411[0];
        int var1 = var0.field1511 * var0.field1505;
        byte[] var2 = Statics.field1492[0];
        var0.field1504 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1504[var3] = Statics.field1556[var2[var3] & 0xFF];
        }
        method2687();
        return var0;
    }

    @ObfuscatedName("ae.h([BI)Lgc;")
    public static class183 method833(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class183 var1 = new class183(arg0, Statics.field412, Statics.field2576, Statics.field1494, Statics.field411, Statics.field1556, Statics.field1492);
            method2687();
            return var1;
        }
    }

    @ObfuscatedName("g.x(Lev;III)Z")
    public static boolean method224(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2987(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            method134(var3);
            return true;
        }
    }

    @ObfuscatedName("h.q([BB)V")
    public static void method134(byte[] arg0) {
        class127 var1 = new class127(arg0);
        var1.field2059 = arg0.length - 2;
        Statics.field1493 = var1.method2440();
        Statics.field412 = new int[Statics.field1493];
        Statics.field2576 = new int[Statics.field1493];
        Statics.field1494 = new int[Statics.field1493];
        Statics.field411 = new int[Statics.field1493];
        Statics.field1492 = new byte[Statics.field1493][];
        var1.field2059 = arg0.length - 7 - Statics.field1493 * 8;
        Statics.field1786 = var1.method2440();
        Statics.field1491 = var1.method2440();
        int var2 = (var1.method2438() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1493; var3++) {
            Statics.field412[var3] = var1.method2440();
        }
        for (int var4 = 0; var4 < Statics.field1493; var4++) {
            Statics.field2576[var4] = var1.method2440();
        }
        for (int var5 = 0; var5 < Statics.field1493; var5++) {
            Statics.field1494[var5] = var1.method2440();
        }
        for (int var6 = 0; var6 < Statics.field1493; var6++) {
            Statics.field411[var6] = var1.method2440();
        }
        var1.field2059 = arg0.length - 7 - Statics.field1493 * 8 - (var2 - 1) * 3;
        Statics.field1556 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1556[var7] = var1.method2442();
            if (Statics.field1556[var7] == 0) {
                Statics.field1556[var7] = 1;
            }
        }
        var1.field2059 = 0;
        for (int var8 = 0; var8 < Statics.field1493; var8++) {
            int var9 = Statics.field1494[var8];
            int var10 = Statics.field411[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field1492[var8] = var12;
            int var13 = var1.method2438();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2629();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2629();
                    }
                }
            }
        }
    }

    @ObfuscatedName("el.w(I)V")
    public static void method2687() {
        Statics.field412 = null;
        Statics.field2576 = null;
        Statics.field1494 = null;
        Statics.field411 = null;
        Statics.field1556 = null;
        Statics.field1492 = (byte[][]) null;
    }
}
