package deob;

@ObfuscatedName("cg")
public class class80 {

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.s(Lfu;IIB)[Lcb;")
    public static class84[] method2(class171 arg0, int arg1, int arg2) {
        if (!method722(arg0, arg1, arg2)) {
            return null;
        }
        class84[] var3 = new class84[Statics.field1113];
        for (int var4 = 0; var4 < Statics.field1113; var4++) {
            class84 var5 = var3[var4] = new class84();
            var5.field1465 = Statics.field1423;
            var5.field1466 = Statics.field1419;
            var5.field1461 = Statics.field1420[var4];
            var5.field1464 = Statics.field613[var4];
            var5.field1462 = Statics.field1421[var4];
            var5.field1459 = Statics.field130[var4];
            var5.field1460 = Statics.field2003;
            var5.field1463 = Statics.field3212[var4];
        }
        method568();
        return var3;
    }

    @ObfuscatedName("client.z(Lfu;IIB)[Lca;")
    public static class82[] method525(class171 arg0, int arg1, int arg2) {
        return method722(arg0, arg1, arg2) ? method974() : null;
    }

    @ObfuscatedName("fj.t(Lfu;IIB)Lca;")
    public static class82 method2977(class171 arg0, int arg1, int arg2) {
        if (!method722(arg0, arg1, arg2)) {
            return null;
        }
        class82 var3 = new class82();
        var3.field1440 = Statics.field1423;
        var3.field1446 = Statics.field1419;
        var3.field1443 = Statics.field1420[0];
        var3.field1448 = Statics.field613[0];
        var3.field1441 = Statics.field1421[0];
        var3.field1444 = Statics.field130[0];
        int var4 = var3.field1444 * var3.field1441;
        byte[] var5 = Statics.field3212[0];
        var3.field1449 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field1449[var6] = Statics.field2003[var5[var6] & 0xFF];
        }
        method568();
        return var3;
    }

    @ObfuscatedName("hv.p(Lfu;Ljava/lang/String;Ljava/lang/String;B)Lcb;")
    public static class84 method3801(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3084(arg1);
        int var4 = arg0.method3085(var3, arg2);
        class84 var5;
        if (method722(arg0, var3, var4)) {
            var5 = method2162();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("dy.m(Lfu;Ljava/lang/String;Ljava/lang/String;B)Lca;")
    public static class82 method2577(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3084(arg1);
        int var4 = arg0.method3085(var3, arg2);
        return method2977(arg0, var3, var4);
    }

    @ObfuscatedName("w.f(Lfu;Lfu;Ljava/lang/String;Ljava/lang/String;I)Lhq;")
    public static class228 method145(class171 arg0, class171 arg1, String arg2, String arg3) {
        int var4 = arg0.method3084(arg2);
        int var5 = arg0.method3085(var4, arg3);
        class228 var6;
        if (method722(arg0, var4, var5)) {
            var6 = method3512(arg1.method3091(var4, var5));
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("do.k(I)Lcb;")
    public static class84 method2162() {
        class84 var0 = new class84();
        var0.field1465 = Statics.field1423;
        var0.field1466 = Statics.field1419;
        var0.field1461 = Statics.field1420[0];
        var0.field1464 = Statics.field613[0];
        var0.field1462 = Statics.field1421[0];
        var0.field1459 = Statics.field130[0];
        var0.field1460 = Statics.field2003;
        var0.field1463 = Statics.field3212[0];
        method568();
        return var0;
    }

    @ObfuscatedName("as.h(I)[Lca;")
    public static class82[] method974() {
        class82[] var0 = new class82[Statics.field1113];
        for (int var1 = 0; var1 < Statics.field1113; var1++) {
            class82 var2 = var0[var1] = new class82();
            var2.field1440 = Statics.field1423;
            var2.field1446 = Statics.field1419;
            var2.field1443 = Statics.field1420[var1];
            var2.field1448 = Statics.field613[var1];
            var2.field1441 = Statics.field1421[var1];
            var2.field1444 = Statics.field130[var1];
            int var3 = var2.field1444 * var2.field1441;
            byte[] var4 = Statics.field3212[var1];
            var2.field1449 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1449[var5] = Statics.field2003[var4[var5] & 0xFF];
            }
        }
        method568();
        return var0;
    }

    @ObfuscatedName("gd.r([BI)Lhq;")
    public static class228 method3512(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class228 var1 = new class228(arg0, Statics.field1420, Statics.field613, Statics.field1421, Statics.field130, Statics.field2003, Statics.field3212);
            method568();
            return var1;
        }
    }

    @ObfuscatedName("ab.w(Lfu;III)Z")
    public static boolean method722(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3091(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            Statics.method1(var3);
            return true;
        }
    }

    @ObfuscatedName("l.n(I)V")
    public static void method568() {
        Statics.field1420 = null;
        Statics.field613 = null;
        Statics.field1421 = null;
        Statics.field130 = null;
        Statics.field2003 = null;
        Statics.field3212 = (byte[][]) null;
    }
}
