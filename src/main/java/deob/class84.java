package deob;

@ObfuscatedName("cr")
public class class84 {

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fe.j(Lew;III)[Lca;")
    public static class87[] method3248(class153 arg0, int arg1, int arg2) {
        if (!Statics.method5(arg0, arg1, arg2)) {
            return null;
        }
        class87[] var3 = new class87[Statics.field1458];
        for (int var4 = 0; var4 < Statics.field1458; var4++) {
            class87 var5 = var3[var4] = new class87();
            var5.field1493 = Statics.field1456;
            var5.field1494 = Statics.field1457;
            var5.field1492 = Statics.field1455[var4];
            var5.field1491 = Statics.field1459[var4];
            var5.field1489 = Statics.field2065[var4];
            var5.field1490 = Statics.field1460[var4];
            var5.field1488 = Statics.field1461;
            var5.field1487 = Statics.field1462[var4];
        }
        method1378();
        return var3;
    }

    @ObfuscatedName("o.f(Lew;III)Lca;")
    public static class87 method32(class153 arg0, int arg1, int arg2) {
        if (!Statics.method5(arg0, arg1, arg2)) {
            return null;
        }
        class87 var3 = new class87();
        var3.field1493 = Statics.field1456;
        var3.field1494 = Statics.field1457;
        var3.field1492 = Statics.field1455[0];
        var3.field1491 = Statics.field1459[0];
        var3.field1489 = Statics.field2065[0];
        var3.field1490 = Statics.field1460[0];
        var3.field1488 = Statics.field1461;
        var3.field1487 = Statics.field1462[0];
        method1378();
        return var3;
    }

    @ObfuscatedName("i.o(Lew;III)[Lcu;")
    public static class86[] method111(class153 arg0, int arg1, int arg2) {
        return Statics.method5(arg0, arg1, arg2) ? method2323() : null;
    }

    @ObfuscatedName("bu.h(Lew;IIB)Lcu;")
    public static class86 method1329(class153 arg0, int arg1, int arg2) {
        if (!Statics.method5(arg0, arg1, arg2)) {
            return null;
        }
        class86 var3 = new class86();
        var3.field1480 = Statics.field1456;
        var3.field1481 = Statics.field1457;
        var3.field1482 = Statics.field1455[0];
        var3.field1476 = Statics.field1459[0];
        var3.field1484 = Statics.field2065[0];
        var3.field1477 = Statics.field1460[0];
        int var4 = var3.field1484 * var3.field1477;
        byte[] var5 = Statics.field1462[0];
        var3.field1479 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1479[var6] = Statics.field1461[var5[var6] & 0xFF];
        }
        method1378();
        return var3;
    }

    @ObfuscatedName("cb.u(Lew;Ljava/lang/String;Ljava/lang/String;B)[Lca;")
    public static class87[] method2060(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3074(arg1);
        int var4 = arg0.method3038(var3, arg2);
        return method3248(arg0, var3, var4);
    }

    @ObfuscatedName("d.a(Lew;Ljava/lang/String;Ljava/lang/String;B)Lca;")
    public static class87 method212(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3074(arg1);
        int var4 = arg0.method3038(var3, arg2);
        return method32(arg0, var3, var4);
    }

    @ObfuscatedName("n.q(Lew;Ljava/lang/String;Ljava/lang/String;I)[Lcu;")
    public static class86[] method103(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3074(arg1);
        int var4 = arg0.method3038(var3, arg2);
        return method111(arg0, var3, var4);
    }

    @ObfuscatedName("cd.t(Lew;Ljava/lang/String;Ljava/lang/String;B)Lcu;")
    public static class86 method1587(class153 arg0, String arg1, String arg2) {
        int var3 = arg0.method3074(arg1);
        int var4 = arg0.method3038(var3, arg2);
        return method1329(arg0, var3, var4);
    }

    @ObfuscatedName("dn.n(I)[Lcu;")
    public static class86[] method2323() {
        class86[] var0 = new class86[Statics.field1458];
        for (int var1 = 0; var1 < Statics.field1458; var1++) {
            class86 var2 = var0[var1] = new class86();
            var2.field1480 = Statics.field1456;
            var2.field1481 = Statics.field1457;
            var2.field1482 = Statics.field1455[var1];
            var2.field1476 = Statics.field1459[var1];
            var2.field1484 = Statics.field2065[var1];
            var2.field1477 = Statics.field1460[var1];
            int var3 = var2.field1484 * var2.field1477;
            byte[] var4 = Statics.field1462[var1];
            var2.field1479 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1479[var5] = Statics.field1461[var4[var5] & 0xFF];
            }
        }
        method1378();
        return var0;
    }

    @ObfuscatedName("ex.i([BI)Lgp;")
    public static class183 method2716(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class183 var1 = new class183(arg0, Statics.field1455, Statics.field1459, Statics.field2065, Statics.field1460, Statics.field1461, Statics.field1462);
            method1378();
            return var1;
        }
    }

    @ObfuscatedName("bd.m(B)V")
    public static void method1378() {
        Statics.field1455 = null;
        Statics.field1459 = null;
        Statics.field2065 = null;
        Statics.field1460 = null;
        Statics.field1461 = null;
        Statics.field1462 = (byte[][]) null;
    }
}
