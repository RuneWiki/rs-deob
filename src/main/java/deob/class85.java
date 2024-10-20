package deob;

@ObfuscatedName("ch")
public class class85 {

    public class85() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ep.e(Lea;III)[Lcr;")
    public static class88[] method2783(class155 arg0, int arg1, int arg2) {
        if (!Statics.method926(arg0, arg1, arg2)) {
            return null;
        }
        class88[] var3 = new class88[Statics.field1443];
        for (int var4 = 0; var4 < Statics.field1443; var4++) {
            class88 var5 = var3[var4] = new class88();
            var5.field1476 = Statics.field1444;
            var5.field1478 = Statics.field1449;
            var5.field1477 = Statics.field1445[var4];
            var5.field1475 = Statics.field1446[var4];
            var5.field1473 = Statics.field1447[var4];
            var5.field1471 = Statics.field2599[var4];
            var5.field1472 = Statics.field1448;
            var5.field1474 = Statics.field758[var4];
        }
        method1372();
        return var3;
    }

    @ObfuscatedName("n.i(Lea;III)[Lcw;")
    public static class87[] method244(class155 arg0, int arg1, int arg2) {
        return Statics.method926(arg0, arg1, arg2) ? method78() : null;
    }

    @ObfuscatedName("j.k(Lea;Lea;III)Lgs;")
    public static class185 method33(class155 arg0, class155 arg1, int arg2, int arg3) {
        return Statics.method926(arg0, arg2, arg3) ? method2436(arg1.method3069(arg2, arg3)) : null;
    }

    @ObfuscatedName("h.q(Lea;Ljava/lang/String;Ljava/lang/String;B)[Lcr;")
    public static class88[] method253(class155 arg0, String arg1, String arg2) {
        int var3 = arg0.method3035(arg1);
        int var4 = arg0.method3036(var3, arg2);
        return method2783(arg0, var3, var4);
    }

    @ObfuscatedName("w.j(Lea;Ljava/lang/String;Ljava/lang/String;I)Lcr;")
    public static class88 method52(class155 arg0, String arg1, String arg2) {
        int var3 = arg0.method3035(arg1);
        int var4 = arg0.method3036(var3, arg2);
        class88 var5;
        if (Statics.method926(arg0, var3, var4)) {
            var5 = Statics.method157();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bn.z(Lea;Ljava/lang/String;Ljava/lang/String;I)[Lcw;")
    public static class87[] method1422(class155 arg0, String arg1, String arg2) {
        int var3 = arg0.method3035(arg1);
        int var4 = arg0.method3036(var3, arg2);
        return method244(arg0, var3, var4);
    }

    @ObfuscatedName("ej.m(Lea;Ljava/lang/String;Ljava/lang/String;I)Lcw;")
    public static class87 method2719(class155 arg0, String arg1, String arg2) {
        int var3 = arg0.method3035(arg1);
        int var4 = arg0.method3036(var3, arg2);
        class87 var5;
        if (Statics.method926(arg0, var3, var4)) {
            class87 var6 = new class87();
            var6.field1464 = Statics.field1444;
            var6.field1461 = Statics.field1449;
            var6.field1465 = Statics.field1445[0];
            var6.field1463 = Statics.field1446[0];
            var6.field1460 = Statics.field1447[0];
            var6.field1459 = Statics.field2599[0];
            int var7 = var6.field1460 * var6.field1459;
            byte[] var8 = Statics.field758[0];
            var6.field1462 = new int[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var6.field1462[var9] = Statics.field1448[var8[var9] & 0xFF];
            }
            method1372();
            var5 = var6;
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("n.w(Lea;IS)Lcr;")
    public static class88 method240(class155 arg0, int arg1) {
        byte[] var2 = arg0.method3038(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method2386(var2);
            var3 = true;
        }
        return var3 ? Statics.method157() : null;
    }

    @ObfuscatedName("a.d(B)[Lcw;")
    public static class87[] method78() {
        class87[] var0 = new class87[Statics.field1443];
        for (int var1 = 0; var1 < Statics.field1443; var1++) {
            class87 var2 = var0[var1] = new class87();
            var2.field1464 = Statics.field1444;
            var2.field1461 = Statics.field1449;
            var2.field1465 = Statics.field1445[var1];
            var2.field1463 = Statics.field1446[var1];
            var2.field1460 = Statics.field1447[var1];
            var2.field1459 = Statics.field2599[var1];
            int var3 = var2.field1460 * var2.field1459;
            byte[] var4 = Statics.field758[var1];
            var2.field1462 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1462[var5] = Statics.field1448[var4[var5] & 0xFF];
            }
        }
        method1372();
        return var0;
    }

    @ObfuscatedName("db.u([BI)Lgs;")
    public static class185 method2436(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class185 var1 = new class185(arg0, Statics.field1445, Statics.field1446, Statics.field1447, Statics.field2599, Statics.field1448, Statics.field758);
            method1372();
            return var1;
        }
    }

    @ObfuscatedName("da.t([BB)V")
    public static void method2386(byte[] arg0) {
        class128 var1 = new class128(arg0);
        var1.field2045 = arg0.length - 2;
        Statics.field1443 = var1.method2456();
        Statics.field1445 = new int[Statics.field1443];
        Statics.field1446 = new int[Statics.field1443];
        Statics.field1447 = new int[Statics.field1443];
        Statics.field2599 = new int[Statics.field1443];
        Statics.field758 = new byte[Statics.field1443][];
        var1.field2045 = arg0.length - 7 - Statics.field1443 * 8;
        Statics.field1444 = var1.method2456();
        Statics.field1449 = var1.method2456();
        int var2 = (var1.method2548() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field1443; var3++) {
            Statics.field1445[var3] = var1.method2456();
        }
        for (int var4 = 0; var4 < Statics.field1443; var4++) {
            Statics.field1446[var4] = var1.method2456();
        }
        for (int var5 = 0; var5 < Statics.field1443; var5++) {
            Statics.field1447[var5] = var1.method2456();
        }
        for (int var6 = 0; var6 < Statics.field1443; var6++) {
            Statics.field2599[var6] = var1.method2456();
        }
        var1.field2045 = arg0.length - 7 - Statics.field1443 * 8 - (var2 - 1) * 3;
        Statics.field1448 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field1448[var7] = var1.method2558();
            if (Statics.field1448[var7] == 0) {
                Statics.field1448[var7] = 1;
            }
        }
        var1.field2045 = 0;
        for (int var8 = 0; var8 < Statics.field1443; var8++) {
            int var9 = Statics.field1447[var8];
            int var10 = Statics.field2599[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field758[var8] = var12;
            int var13 = var1.method2548();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2455();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2455();
                    }
                }
            }
        }
    }

    @ObfuscatedName("by.g(B)V")
    public static void method1372() {
        Statics.field1445 = null;
        Statics.field1446 = null;
        Statics.field1447 = null;
        Statics.field2599 = null;
        Statics.field1448 = null;
        Statics.field758 = (byte[][]) null;
    }
}
