package deob;

@ObfuscatedName("cz")
public class class80 {

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.f(Lfj;III)Lcl;")
    public static class84 method2193(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3107(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            Statics.method149(var3);
            var4 = true;
        }
        return var4 ? method2190() : null;
    }

    @ObfuscatedName("e.e(Lfj;III)Lcw;")
    public static class82 method15(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3107(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            Statics.method149(var3);
            var4 = true;
        }
        return var4 ? method1612() : null;
    }

    @ObfuscatedName("bk.n(Lfj;Lfj;IIB)Lhq;")
    public static class228 method1063(class171 arg0, class171 arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method3107(arg2, arg3);
        boolean var5;
        if (var4 == null) {
            var5 = false;
        } else {
            Statics.method149(var4);
            var5 = true;
        }
        if (!var5) {
            return null;
        }
        byte[] var6 = arg1.method3107(arg2, arg3);
        class228 var7;
        if (var6 == null) {
            var7 = null;
        } else {
            class228 var8 = new class228(var6, Statics.field3051, Statics.field1432, Statics.field1433, Statics.field222, Statics.field2131, Statics.field1451);
            method156();
            var7 = var8;
        }
        return var7;
    }

    @ObfuscatedName("ab.t(Lfj;Ljava/lang/String;Ljava/lang/String;I)[Lcl;")
    public static class84[] method1042(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3102(arg1);
        int var4 = arg0.method3164(var3, arg2);
        byte[] var5 = arg0.method3107(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            Statics.method149(var5);
            var6 = true;
        }
        class84[] var7;
        if (var6) {
            class84[] var8 = new class84[Statics.field1430];
            for (int var9 = 0; var9 < Statics.field1430; var9++) {
                class84 var10 = var8[var9] = new class84();
                var10.field1477 = Statics.field1431;
                var10.field1473 = Statics.field1438;
                var10.field1475 = Statics.field3051[var9];
                var10.field1471 = Statics.field1432[var9];
                var10.field1476 = Statics.field1433[var9];
                var10.field1474 = Statics.field222[var9];
                var10.field1472 = Statics.field2131;
                var10.field1478 = Statics.field1451[var9];
            }
            method156();
            var7 = var8;
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("t.v(Lfj;Ljava/lang/String;Ljava/lang/String;I)Lcl;")
    public static class84 method48(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3102(arg1);
        int var4 = arg0.method3164(var3, arg2);
        return method2193(arg0, var3, var4);
    }

    @ObfuscatedName("fm.b(Lfj;Ljava/lang/String;Ljava/lang/String;I)[Lcw;")
    public static class82[] method2994(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3102(arg1);
        int var4 = arg0.method3164(var3, arg2);
        byte[] var5 = arg0.method3107(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            Statics.method149(var5);
            var6 = true;
        }
        class82[] var7;
        if (var6) {
            class82[] var8 = new class82[Statics.field1430];
            for (int var9 = 0; var9 < Statics.field1430; var9++) {
                class82 var10 = var8[var9] = new class82();
                var10.field1463 = Statics.field1431;
                var10.field1458 = Statics.field1438;
                var10.field1461 = Statics.field3051[var9];
                var10.field1456 = Statics.field1432[var9];
                var10.field1457 = Statics.field1433[var9];
                var10.field1462 = Statics.field222[var9];
                int var11 = var10.field1462 * var10.field1457;
                byte[] var12 = Statics.field1451[var9];
                var10.field1453 = new int[var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    var10.field1453[var13] = Statics.field2131[var12[var13] & 0xFF];
                }
            }
            method156();
            var7 = var8;
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("dl.m(Lfj;II)Lcl;")
    public static class84 method2656(class171 arg0, int arg1) {
        return method151(arg0, arg1) ? method2190() : null;
    }

    @ObfuscatedName("dv.k(I)Lcl;")
    public static class84 method2190() {
        class84 var0 = new class84();
        var0.field1477 = Statics.field1431;
        var0.field1473 = Statics.field1438;
        var0.field1475 = Statics.field3051[0];
        var0.field1471 = Statics.field1432[0];
        var0.field1476 = Statics.field1433[0];
        var0.field1474 = Statics.field222[0];
        var0.field1472 = Statics.field2131;
        var0.field1478 = Statics.field1451[0];
        method156();
        return var0;
    }

    @ObfuscatedName("cn.c(I)Lcw;")
    public static class82 method1612() {
        class82 var0 = new class82();
        var0.field1463 = Statics.field1431;
        var0.field1458 = Statics.field1438;
        var0.field1461 = Statics.field3051[0];
        var0.field1456 = Statics.field1432[0];
        var0.field1457 = Statics.field1433[0];
        var0.field1462 = Statics.field222[0];
        int var1 = var0.field1462 * var0.field1457;
        byte[] var2 = Statics.field1451[0];
        var0.field1453 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1453[var3] = Statics.field2131[var2[var3] & 0xFF];
        }
        method156();
        return var0;
    }

    @ObfuscatedName("u.w(Lfj;IB)Z")
    public static boolean method151(class171 arg0, int arg1) {
        byte[] var2 = arg0.method3092(arg1);
        if (var2 == null) {
            return false;
        } else {
            Statics.method149(var2);
            return true;
        }
    }

    @ObfuscatedName("x.h(B)V")
    public static void method156() {
        Statics.field3051 = null;
        Statics.field1432 = null;
        Statics.field1433 = null;
        Statics.field222 = null;
        Statics.field2131 = null;
        Statics.field1451 = (byte[][]) null;
    }
}
